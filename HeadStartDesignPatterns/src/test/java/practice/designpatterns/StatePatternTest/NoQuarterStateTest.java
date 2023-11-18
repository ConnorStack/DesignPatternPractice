package practice.designpatterns.StatePatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StatePattern.GumballMachine;
import practice.designpatterns.StatePattern.NoQuartarState;

public class NoQuarterStateTest {
    private NoQuartarState noQuartarState;
    private GumballMachine gumballMachine;
    String expectedOutput;
    @BeforeEach
    public void setUp(){
        // gumballMachine = new GumballMachine();
        noQuartarState = new NoQuartarState();
    }

    @Test
    public void testNoQuarterState(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        noQuartarState.insertQuarter();

        expectedOutput = "You inserted a quarter";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}
