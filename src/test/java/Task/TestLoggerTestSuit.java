package Task;

import static org.junit.Assert.*;

public class TestLoggerTestSuit {

    @org.junit.Test
    public void f() {
        TestLogger tl=new TestLogger();
        assertEquals("OK", tl.f());

    }
}