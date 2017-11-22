import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    private  Account account;

    @Test
    public void testGetBalance() throws Exception {
        account = new Account(1000);
        Assert.assertEquals(1000,account.getBalance());

    }

}
