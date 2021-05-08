package starter.Message;

import org.openqa.selenium.By;

public class MessageForm {
    public static By EMAIL_FIELD = By.id("email");
    public static By MESSAGE_TEXTAREA = By.id("message");
    public static By MESSAGE_SELECTOR = By.cssSelector("select#id_contact");
    public static By LOGIN_BUTTON = By.id("submitMessage");
}
