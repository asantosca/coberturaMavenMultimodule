package ca.alexsantos;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SuperCalcTest {

    @Test
    public void testHello() {
        SuperCalc calc = new SuperCalc();
        assertThat(4, is(calc.add2ints(2, 2)));
    }
}

