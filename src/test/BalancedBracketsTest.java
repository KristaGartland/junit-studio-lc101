package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

   @Test
    public void singleLetterReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[a]"));
   }

   @Test
    public void oneBracketShouldFail() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
   }

   @Test
    public void InsideBalancedBracketTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Ins[ide]"));
   }

   @Test
    public void LotsOfBracketsTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]]]]]]]]]"));
   }

   @Test
    public void TestNumbersInString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[4444]"));
   }

   @Test
    public void ConcurrentBracketsTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][]"));
   }

   @Test
    public void TestSymbolsBeingAdded() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[%%%%%%&&&&&&]"));
   }
}
