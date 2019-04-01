package tests;

import org.openqa.selenium.By;

public class DashBoardPage extends AbstractPage {

    private By label_welcome = By.cssSelector("");
    String str;

    public String username(){
        return substringBetween(text(label_welcome),", ", "!");
    }
}
