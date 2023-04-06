package ahu.wudi.java10;

import java.util.List;

public class LocalValTest {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3); //before java10
        var list1 = List.of(1, 2, 3); //java 10
    }
}
