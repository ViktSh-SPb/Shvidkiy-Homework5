package org.viktsh.chain;

/**
 * @author Viktor Shvidkiy
 */
public class PasswordValidator extends Validator{
    @Override
    protected boolean check(User user) {
        if(user.password.length()<6){
            System.out.println("Пароль должен быть не короче 6 символов");
            return false;
        }
        return true;
    }
}
