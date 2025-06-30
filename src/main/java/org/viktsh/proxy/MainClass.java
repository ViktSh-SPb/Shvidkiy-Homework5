package org.viktsh.proxy;

/**
 * @author Viktor Shvidkiy
 */
public class MainClass {
    public static void main(String[] args) {
        Service service1 = new ProxyService("guest");
        service1.request();
        Service service2 = new ProxyService("admin");
        service2.request();
    }
}
