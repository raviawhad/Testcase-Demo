package com.jbk.jbkproject;


    import static org.junit.jupiter.api.Assertions.*;

    import com.jbk.jbkproject.Controller.StringCalculator;
    import org.junit.jupiter.api.Test;

    public class StringCalculatorTest {



        @Test
        public void testSingleNumber() {
            assertEquals(5, StringCalculator.add(2,3));
        }


    }



