package org.viktsh.chain;

/**
 * @author Viktor Shvidkiy
 */
public abstract class Validator {
    private Validator next;

    public Validator linkWith (Validator next) {
        this.next = next;
        return next;
    }

    public boolean validate (User user){
        if(!check(user)){
            return false;
        }
        if(next==null){
            return true;
        }
        return next.validate(user);
    }
    protected abstract boolean check(User user);
}
