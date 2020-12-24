package StringIsBlank;

public class Example {
    public static void main(String[] args) {
        String space = "                                ";
//        System.out.println(isBlank(space));
        System.out.println(space.isBlank());
    }

/*
    // before Java-11 the code below was how we could check if the string was blank
    private static boolean isBlank(String space) {
        return space == null || space.length() == 0 || space.chars().allMatch(c -> c == ' ');
    }
*/
}

