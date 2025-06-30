package org.viktsh.chain;

/**
 * @author Viktor Shvidkiy
 */
public class MainClass {
    public static void main(String[] args) {
        Validator validatorChain = new NotEmptyValidator();
        validatorChain
                .linkWith(new EmailValidator())
                .linkWith(new PasswordValidator());

        User user1 = new User("user@gmail.com", "12345");   // Короткий пароль
        User user2 = new User("", "123456");                // Пустой email
        User user3 = new User("user@yandex.ru", "123456");  // Подходит

        System.out.println("User 1:");
        System.out.println(validatorChain.validate(user1));
        System.out.println("User 2:");
        System.out.println(validatorChain.validate(user2));
        System.out.println("User 3:");
        System.out.println(validatorChain.validate(user3));
    }
}
