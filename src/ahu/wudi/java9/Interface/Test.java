package ahu.wudi.java9.Interface;

/**
 * @author wudi
 * 接口允许私有方法，一般用于在默认方法中提供一种固定实现
 */
public interface Test {
    //java8 default method
    default void defaultMethod(){
        privateMethod();
        System.out.println("the default method of Test");
    }
    //java8 normal method
    void normalMethod();

    //java9 private method
    private void privateMethod() {
        System.out.println("The private method");
    }

    public static void main(String[] args) {
        Test t = new T1();
        t.normalMethod();//the method of T1
        t.defaultMethod();//the default method of T1
    }
}

class T1 implements Test{

    @Override
    public void defaultMethod() {
        System.out.println("the default method of T1");
    }

    @Override
    public void normalMethod() {
        System.out.println("the method of T1");
    }
}
