package Threads;

public class ThreadExample {

    public static void main(String[] args) {

        PDFGenerator startPDFGenerator = new PDFGenerator();
        LoadingBar startLoadingBar = new LoadingBar(startPDFGenerator);

        startPDFGenerator.start();
        startLoadingBar.start();


//        /*Example of how the Thread works*/
//        Thread thread = new Thread(new LoadingBar2());
//        Thread thread2 = new Thread(new LoadingBar3());
//
//        thread.start();
//        thread2.start();
//        System.out.println("Thread name: " + thread.getName());
//        System.out.println("Thread name: " + thread2.getName());

    }
}

class PDFGenerator extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Start PDF Generator");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Created");
    }
}

class LoadingBar extends Thread {
    private Thread startPDFGenerator;

    public LoadingBar(Thread startPDFGenerator) {
        this.startPDFGenerator = startPDFGenerator;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (!startPDFGenerator.isAlive()){
                    break;
                }
                System.out.println("Loading... ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//        /*Example of how the Thread works*/
//class LoadingBar2 implements Runnable {
//
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(5000);
//            System.out.println("Run LoadingBar2 : ");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class LoadingBar3 implements Runnable {
//
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(3000);
//            System.out.println("Run LoadingBar3 : ");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
