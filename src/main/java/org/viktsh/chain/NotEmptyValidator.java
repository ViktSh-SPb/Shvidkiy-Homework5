package org.viktsh.chain;

/**
 * @author Viktor Shvidkiy
 */
public class NotEmptyValidator extends Validator{
    @Override
    protected boolean check(User user) {
        if (
                user.email == null ||
                user.email.isEmpty() ||
                user.password==null ||
                user.password.isEmpty()){
            System.out.println("Поля не должны быть пустыми");
            return false;
        }
        return true;
    }
}
