package calculator;

import org.junit.Assert;
import org.junit.Test;


public class SumaTest {

    @Test
    public void operar() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(0.98), new Float(0.01));
        if (result > 0.99f || result < 0.99f) {
            Assert.fail();
        }
    }

    @Test
    public void operar2() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(1.4), new Float(1.6));
        if (result > 3.0f || result < 3.0f) {
            Assert.fail();
        }
    }

    @Test
    public void operar3() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(0.000000000000000000000000000000000000002), new Float(0.000000000000000000000000000000000000002));
        if (result > 0.000000000000000000000000000000000000004f || result < 0.000000000000000000000000000000000000004f) {
            Assert.fail();
        }
    }

    @Test
    public void operar4() throws Exception {
        Suma suma = new Suma();
        float  result = suma.operar(new Float(0.1), new Float(0.1));
        if (result > 0.2f || result < 0.2f) {
            Assert.fail();
        }
    }
}
