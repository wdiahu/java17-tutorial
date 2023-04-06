package ahu.wudi.java14;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {
        System.out.println("请输入学生分数");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt()/10;
        System.out.println(getGrade(score));

    }
    private static String getGrade(int score){
        return switch (score){
            case 10,9 -> "优秀";
            case 8 -> "良好";
            default -> {
                System.out.println("other work...");
                yield  "一般";
            }
        };
    }
}
