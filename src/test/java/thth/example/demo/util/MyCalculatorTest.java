package thth.example.demo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class MyCalculatorTest {
    @Mock
    MyCalculator myCalculator;
    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        myCalculator = new MyCalculator();
    }

    @Test
    void plus() {
        //System.out.println(myCalculator.plus(2,4));
        assertEquals(6,myCalculator.plus(2,4));
    }

    @Test
    void minus() {
        assertEquals(-2,myCalculator.minus(2,4));
    }

    @Test
    void multip() {
        assertEquals(8,myCalculator.multip(2,4));
    }

    @Test
    void divide() {
        assertEquals(0,myCalculator.divide(2,4));
    }
}