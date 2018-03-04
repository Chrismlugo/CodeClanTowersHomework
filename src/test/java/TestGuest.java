import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuest {

    Guest guest;

    @Before
    public void setUp() throws Exception {

        guest = new Guest("Grant", 350.00);

    }

    @Test
    public void hasName() {
        assertEquals("Grant", guest.Name());
    }

    @Test
    public void hasMoneyInWallet() {
        assertEquals(350.00, guest.getWallet(), 0.1);
    }
}
