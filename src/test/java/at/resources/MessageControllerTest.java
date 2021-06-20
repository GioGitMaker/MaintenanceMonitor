package at.resources;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MessageControllerTest {

    @Test
    public void Test_setMessage_ReturnCheck() {
        at.resources.MessageController messageController = new at.resources.MessageController();

        String curValue = messageController.setMessage("Test");

        Assertions.assertEquals("OK", curValue);
    }

    @Test
    public void Test_setMessage_StaticMessageCheck() {
        at.resources.MessageController messageController = new at.resources.MessageController();

        String curValue = messageController.setMessage("Test");

        Assertions.assertEquals("Test", at.resources.MessageController.message);
    }

    @Test
    public void Test_setMessage_StaticMessageCheckEmpty() {
        at.resources.MessageController messageController = new at.resources.MessageController();

        String curValue = messageController.setMessage("");

        Assertions.assertNotEquals("", at.resources.MessageController.message);
    }

    @Test
    public void Test_resetMessage_StaticMessageCheck() {
        at.resources.MessageController messageController = new at.resources.MessageController();

        String curValue = messageController.setMessage("Test");

        messageController.reset();

        Assertions.assertEquals("-", at.resources.MessageController.message);
    }
    @Test
    public void Test_getMessage_StaticMessageCheckWithoutChange() {
        at.resources.MessageController messageController = new at.resources.MessageController();

        String value = messageController.getMessage();

        Assertions.assertEquals(value, at.resources.MessageController.message);
    }
    @Test
    public void Test_getMessage_StaticMessageCheckWithChange() {
        at.resources.MessageController messageController = new at.resources.MessageController();

        String curValue = messageController.setMessage("Test");

        String value = messageController.getMessage();

        Assertions.assertEquals(value, at.resources.MessageController.message);
    }

}
