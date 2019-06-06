package calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicacionTest extends Multiplicacion {

    @Test
    public void operar1() throws Exception {
        Multiplicacion multiplicacion = new Multiplicacion();
        float result = multiplicacion.operar(new Float(0.1), new Float(0.1));
        if (result > 0.01 || result < 0.01 ) {
            Assert.fail();
        }
    }
    @Test
    public void operar2() throws Exception {
        Multiplicacion multiplicacion = new Multiplicacion();
        float result = multiplicacion.operar(new Float(0.2), new Float(0.2));
        if (result > 0.04 || result < 0.04 ) {
            Assert.fail();
        }
    }
    @Test
    public void operar3() throws Exception {
        Multiplicacion multiplicacion = new Multiplicacion();
        float result = multiplicacion.operar(new Float(0.3), new Float(0.3));
        if (result > 0.09 || result < 0.09 ) {
            Assert.fail();
        }
    }
    @Test
    public void operar4() throws Exception {
        Multiplicacion multiplicacion = new Multiplicacion();
        float result = multiplicacion.operar(new Float(0.4), new Float(0.4));
        if (result > 0.16 || result < 0.16 ) {
            Assert.fail();
        }
    }

}