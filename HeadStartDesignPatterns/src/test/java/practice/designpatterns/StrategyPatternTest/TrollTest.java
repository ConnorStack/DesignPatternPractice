package practice.designpatterns.StrategyPatternTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.designpatterns.StrategyPattern.Characters;
import practice.designpatterns.StrategyPattern.SwordBehavior;
import practice.designpatterns.StrategyPattern.Troll;

public class TrollTest {
    private Characters troll;
    private String expectedOutput;

    @BeforeEach
    public void setUp() {
        troll = new Troll();
    }

    @Test
    public void testTrollWithAxeBehavior() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        troll.utilizeWeaponBehavior();

        expectedOutput = "Chop chop";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testTrollResetToSwordBehavior(){
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        troll.setWeaponBehavior(new SwordBehavior());
        troll.utilizeWeaponBehavior();

        expectedOutput = "Slashy slashy";

        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}
