package ahu.wudi.java9.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 集合新的api 用于创建只读不可变集合
 * 不支持修改操作
 */
public class CollectionsTest {
    public static void main(String[] args) {
        testMap();
        testList();
        testSet();
    }
    private static void testMap() {
        Map<String, Integer> map = Map.of("AAA", 11, "BBB", 12);
        int val1 = map.get("AAA"); //11
        int val2 = map.getOrDefault("BBB", 0); //12
        int val3 = map.getOrDefault("CCC", 0); //0
        System.out.println(map);
    }

    private static void testList() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);
    }

    private static void testSet(){
        Set<Integer> set = Set.of(1,2);
        System.out.println(set);
    }
}
