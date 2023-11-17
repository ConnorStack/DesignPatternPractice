package practice.designpatterns.StrategyPatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StrategyPattern.Characters;
import practice.designpatterns.StrategyPattern.Troll;

public class TrollTest {
    private Characters troll;

    @BeforeEach
    public void setUp(){
        troll = new Troll();
    }

    @Test
    public void testTrollWithAxeBehavior(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        troll.utilizeWeaponBehavior();
        
        String expectedOutput = "Chop chop";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}
