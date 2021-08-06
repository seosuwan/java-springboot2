package thth.example.demo.person;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class) class PersonTest {
    @Mock
    Person jung;
    @Mock
    Person hong;
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        jung = new Person("335577","112233");
        hong = new Person("775544");

    }
    @Test
    void showPersonInfo(){
        assertEquals(null,hong.getPassNum());
        assertEquals("775544",hong.getRegiNum());
        assertEquals("112233",jung.getPassNum());
        assertEquals("335577",jung.getRegiNum());
    }
}