package org.viktsh.builder;

/**
 * @author Viktor Shvidkiy
 */
public class MainClass {
    public static void main(String[] args) {
        User user = new User.Builder("Иван")
                .email("ivan@gmail.com")
                .age(30)
                .country("Russia")
                .phone("+79112223344")
                .build();
        System.out.println(user);
    }
}
