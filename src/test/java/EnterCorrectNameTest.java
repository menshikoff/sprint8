
import org.junit.Assert;
import org.junit.Test;


public class EnterCorrectNameTest {

    @Test
    public void checkCorrectName() {
        Account name_test = new Account("Daniil Menshikov");
        Assert.assertTrue(name_test.checkNameToEmboss());
    }

    @Test
    public void checkNameLessThreeChars() {
        Account name_test = new Account(" gh ");
        Assert.assertFalse(name_test.checkNameToEmboss());
    }

    @Test
    public  void checkNameEqualThreeChars() {
        Account name_test = new Account("errtyerttyer ghjfjtutooeeel");
        Assert.assertFalse(name_test.checkNameToEmboss());
    }

    @Test
    public void checkNameWithMoreThanOneSpace() {
        Account name_test = new Account("dfdfghg rrt rh");
        Assert.assertFalse(name_test.checkNameToEmboss());
    }
}
