package org.viktsh.proxy;

/**
 * @author Viktor Shvidkiy
 */
public class RealService implements Service{
    @Override
    public void request() {
        System.out.println("Выполняется запрос к настоящему сервису...");
    }
}
