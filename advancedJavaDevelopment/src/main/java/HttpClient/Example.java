package HttpClient;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Example {

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            System.out.println("New thread created: " + (thread.isDaemon() ? "daemon" : "") + "Thread Group: "
                    + thread.getThreadGroup());
            return thread;
        }
    });

    public static void main(String[] args) throws Exception {
//        connectAndPrintURLJavaOracle();
//        connectAkamaiHttp11Client();
        connectAkamaiHttp2Client();
    }

/*
    // http Client before JDK-11

    private static void connectAndPrintURLJavaOracle() {
        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();

            try (var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
                System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
*/

    private static void connectAkamaiHttp11Client() throws Exception {
        System.out.println("Running HTTP/1.1 example... ");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code: " + response.statusCode());
            System.out.println("Header's response: " + response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest,
                                        HttpResponse.BodyHandlers.ofString());
                                System.out.println("Image loaded: " + image + "Status Code: "
                                        + imageResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Error while requesting Image" + image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Future Image Submitted: " + image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Error while loading Future Image");
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Total Loading Time: " + (end - start) + " ms");

        } finally {
            executor.shutdown();
        }
    }

    private static void connectAkamaiHttp2Client() throws Exception {
        System.out.println("Running HTTP/2 example... ");
        try {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest,HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code: " + response.statusCode());
            System.out.println("Header's response: " + response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();

            responseBody
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executor.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest,
                                        HttpResponse.BodyHandlers.ofString());
                                System.out.println("Image loaded: " + image + "Status Code: "
                                        + imageResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Error while requesting Image" + image);
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Future Image Submitted: " + image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Error while loading Future Image");
                }
            });

            long end = System.currentTimeMillis();
            System.out.println("Total Loading Time: " + (end - start) + " ms");

        } finally {
            executor.shutdown();

        }
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code: " + response.statusCode());
        System.out.println("Header's response: " + response.headers());
        System.out.println(response.body());
    }

}
