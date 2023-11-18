package practice.designpatterns.StatePatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StatePattern.SoldState;

public class SoldStateTest {
    private SoldState soldState;
    private String expectedOutput;

    @BeforeEach
    public void setUp(){
        soldState = new SoldState();
    }

    @Test
    public void testSoldStateTestInsertQuarter(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        soldState.insertQuarter();

        expectedOutput = "Hold yer horses, still getting gumball";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSoldStateEjectQuarter(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        soldState.ejectQuarter();

        expectedOutput = "Sorry, you already turned the crank";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSoldStateTurnCrank(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        soldState.turnCrank();

        expectedOutput = "Turn away, but no more gumballs";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
    
}