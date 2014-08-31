package ca.alexsantos;

import org.junit.Test;

import ca.alexsantos.Greetings;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreetingsTest {

    @Test
    public void testHello() {
        Greetings greetings = new Greetings();
        assertThat("Hello", is(greetings.getHello()));
    }
}

