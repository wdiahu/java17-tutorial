package ahu.wudi.java16;

//记录类型 类似于@lombok 但是个人认为不如lombok
public record Account(Integer userId, String accountName,String password) {

    public static void main(String[] args) {
        Account account = new Account(1, "wudi", "123456");
        System.out.println(account.userId);
        System.out.println(account.accountName);
        System.out.println(account.password);
        System.out.println(account);
    }
}

