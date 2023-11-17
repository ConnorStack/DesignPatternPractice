package practice.designpatterns.StrategyPatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StrategyPattern.Characters;
import practice.designpatterns.StrategyPattern.King;

public class KingTest {

    private Characters king;
    
    @BeforeEach
    public void setUp(){
        king = new King();
    }

    @Test
    public void testKingWithKnifeBehavior(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        king.utilizeWeaponBehavior();
        String output = "Stabby stabby";
        assertEquals(output, outputStreamCaptor.toString().trim());
        
    }
}
