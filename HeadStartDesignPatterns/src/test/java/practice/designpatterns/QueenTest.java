package practice.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StrategyPattern.Characters;
import practice.designpatterns.StrategyPattern.Queen;



public class QueenTest {

    private Characters queen;

    @BeforeEach
    public void setUp(){
        queen = new Queen();
    }

    @Test
    public void testQueenWithBowAndArrow(){
        
        ByteArrayOutputStream outputStreamCaptor  = new ByteArrayOutputStream();
        //what does setout do? 
        System.setOut(new PrintStream(outputStreamCaptor));
        
        String output = "Shoot bow and arrow.";
        queen.utilizeWeaponBehavior();
        System.setOut(System.out);

        assertEquals(output, outputStreamCaptor.toString().trim());
    }
}
