package ahu.wudi.java15;

public class StringBlock {

    public static void main(String[] args) {

        String textBefore = "hello,\nthis is my book \"how do tomcat work\"";
        System.out.println(textBefore);

        String text = """
                hello,
                this is my book "how do tomcat work"
                """;
        System.out.println(text);
    }
}
