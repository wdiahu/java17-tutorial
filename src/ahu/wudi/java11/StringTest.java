package ahu.wudi.java11;

public class StringTest {

    public static void main(String[] args) {
        String str = "   ";
        boolean blank = str.isBlank();//true

        String str1 = " A B C D ";
        System.out.println(str1.strip());//"A B C D"
        System.out.println(str1.stripLeading());//"A B C D "
        System.out.println(str1.stripTrailing());//" A B C D"

        String str2 = " A\nB\nC\nD";
        System.out.println(str2.lines().count());//4
    }
}
