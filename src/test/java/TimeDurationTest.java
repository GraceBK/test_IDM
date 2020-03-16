import org.junit.Test;

import static org.junit.Assert.*;

public class TimeDurationTest {

    private int nbSeconds = 7242;

    @Test
    public void getHours() throws Exception {
        TimeDuration testTime = new TimeDuration(nbSeconds);
        assertEquals(testTime.getHours(), 2);
    }

    @Test
    public void getMinutes() throws Exception {
        TimeDuration testTime = new TimeDuration(nbSeconds);
        assertEquals(testTime.getMinutes(), 0);
    }

    @Test
    public void getSeconds() throws Exception {
        TimeDuration testTime = new TimeDuration(nbSeconds);
        assertEquals(testTime.getSeconds(), 42);
    }
}