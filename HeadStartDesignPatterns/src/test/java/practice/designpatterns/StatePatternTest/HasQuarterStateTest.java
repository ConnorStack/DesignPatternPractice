package practice.designpatterns.StatePatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StatePattern.HasQuarterState;

public class HasQuarterStateTest {
    private HasQuarterState hasQuarterState;
    private String expectedOutput;

    @BeforeEach
    public void setUp(){
        hasQuarterState = new HasQuarterState(null);
    }

    @Test
    public void testHasQuarterStateInsertQuarter(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        hasQuarterState.insertQuarter();

        expectedOutput = "You can't insert another quarter";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testHasQuarterStateEjectQuarter(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        expectedOutput = "Returning quarter";
    }

    @Test
    public void testHasQuarterStateTurnCrank(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        expectedOutput = "Quarter accepted";
    }

    @Test
    public void testHasQuarterStateDispense(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        expectedOutput = "No gumball dispensed";
    }
}

