package org.viktsh.chain;

/**
 * @author Viktor Shvidkiy
 */
public class EmailValidator extends Validator{
    @Override
    protected boolean check(User user) {
        if(!user.email.contains("@")){
            System.out.println("Некорректный email");
            return false;
        }
        return true;
    }
}
