package practice.designpatterns.StrategyPatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StrategyPattern.Characters;
import practice.designpatterns.StrategyPattern.Knight;

public class KnightTest {
    private Characters knight;

    @BeforeEach
    public void setUp(){
        knight = new Knight();
    }

    @Test
    public void testKnightWithSwordBehavior(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        knight.utilizeWeaponBehavior();

        String expectedOutput = "Slashy slashy";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
    
}
