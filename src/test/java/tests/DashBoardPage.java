package tests;

import org.openqa.selenium.By;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class DashBoardPage {

    private By label_welcome = By.cssSelector("");

    public String username(){
        return substring((label_welcome),", ", "!");
    }
}
