package ahu.wudi.java9.Stream;

import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        //Stream.of(null);//java8 error NPE
        Stream.ofNullable(null);//java 9 ok

        Stream.iterate(0, i -> i + 1).limit(20).forEach(System.out::println);//java8 0...19

        Stream.iterate(0, i -> i < 20, i -> i + 1).forEach(System.out::println);//java9 0...19

        Stream.iterate(0, i -> i < 20, i -> i + 1)
                .takeWhile(i -> i < 10)
                .forEach(System.out::println);//java9 0...9

        Stream.iterate(0, i -> i < 20, i -> i + 1)
                .dropWhile(i -> i < 10)
                .forEach(System.out::println);//java9 10...19
    }
}
