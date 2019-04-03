package tests;

public abstract class AbstractPage {

    AbstractPage navigateTo() {

        return null;
    }

    abstract AbstractPage navigateTo(String url);

}
