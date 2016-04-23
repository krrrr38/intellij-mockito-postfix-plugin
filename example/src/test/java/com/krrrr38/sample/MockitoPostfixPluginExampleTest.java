package com.krrrr38.sample;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoPostfixPluginExampleTest {

    @Test
    public void testFoo() {
        Foo foo = new Foo();
        when(foo);
        spy(foo);
    }

    static class Foo {
        private String bar;

        public boolean hasBar() {
            return bar != null;
        }

        public String getBar() {
            return bar;
        }
    }
}
