package org.viktsh.proxy;

/**
 * @author Viktor Shvidkiy
 */
public class ProxyService implements Service {
    private RealService realService;
    private String currentUser;
    private static final String ADMIN = "admin";

    public ProxyService(String currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public void request() {
        if (hasAccess()) {
            if (realService == null) {
                realService = new RealService();
            }
            realService.request();
        } else {
            System.out.println("Доступ запрещен для пользователя: "+ currentUser);
        }
    }

    private boolean hasAccess(){
        return ADMIN.equalsIgnoreCase(currentUser);
    }
}
