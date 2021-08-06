package thth.example.demo.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class) class StringDemoTest {
    @Mock
    StringDemo stringDemo;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        stringDemo = new StringDemo();

    }

    @Test
    public void test_concat() {
        assertEquals("Lexicographicallylexicographically", stringDemo.concat("Lexicographically", "lexicographically"));
    }

    @Test
    public void substring1() {
        assertEquals("xicographically", stringDemo.substring("Lexicographically", 2));
    }

    @Test
    public void substring2() {
        assertEquals("xi", stringDemo.substring("Lexicographically", 2, 4));
    }

    @Test
    public void compareTo() {
        assertEquals(-32, stringDemo.compareTo("Lexicographically", "lexicographically"));
    }

    @Test
    public void compareToIgnoreCase() {
        assertEquals(0, stringDemo.compareToIgnoreCase("Lexicographically", "lexicographically"));
    }

    @Test
    public void removeHyponeInJuminBunho() {
        assertEquals("12345612334567", stringDemo.removeHyponeInJuminBunho("123456-12334567"));
    }
}