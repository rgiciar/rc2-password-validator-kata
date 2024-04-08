package org.ruralcamp;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ExampleTest {

    @Test
    public void example_test() {
        Example e = new Example();

        assertThat(e.sayHello(), equalTo("Hello!"));
    }

}
