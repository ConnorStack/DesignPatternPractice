package practice.designpatterns.StatePatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StatePattern.GumballMachine;
import practice.designpatterns.StatePattern.NoQuarterState;

public class NoQuarterStateTest {
    private NoQuarterState noQuartarState;
    private GumballMachine gumballMachine;
    String expectedOutput;
    @BeforeEach
    public void setUp(){
        // gumballMachine = new GumballMachine();
        noQuartarState = new NoQuarterState();
    }

    @Test
    public void testNoQuarterStateInsertQuarter(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        noQuartarState.insertQuarter();

        expectedOutput = "You inserted a quarter";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testNoQuarterStateEjectQuarter(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        noQuartarState.ejectQuarter();

        expectedOutput = "You haven't inserted a quarter";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testNoQuarterStateTurnCrank(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        noQuartarState.turnCrank();

        expectedOutput = "You turned, but there's no quarter";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testNoQuarterStateDispense(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        noQuartarState.dispense();
        
        expectedOutput = "You need to pay first";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}
