package tests;

import static org.joor.Reflect.on;

public class PageFactory {

    public static <T extends Page> T open(final Class<LoginPage> pageClass) {
        return (T) at(pageClass).navigateTo();
    }

    public static <T extends Page> T at(final Class<DashBoardPage> pageClass) {
        return on(pageClass).create().get();
    }
}
