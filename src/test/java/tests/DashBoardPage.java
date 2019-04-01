package tests;

import org.openqa.selenium.By;

import static jdk.nashorn.internal.objects.NativeString.substring;
import static org.apache.tika.mime.MediaType.text;

public class DashBoardPage extends AbstractPage {

    private By label_welcome = By.cssSelector("");
    String str;

    public String username(){
        return substring((label_welcome),", ", "!");
    }
}
