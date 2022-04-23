/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Main;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aaron
 */
public class MainTest {
    
   

    @Test
    public void testCardAskGood() {
        System.out.println("cardAsk-Good");
        int num = 1;
        int[] hand = {1, 1};
        boolean expResult = true;
        boolean result = Main.cardAsk(num, hand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCardAskBad() {
        System.out.println("cardAsk-Bad");
        int num = 1;
        int[] hand = {2};
        boolean expResult = false;
        boolean result = Main.cardAsk(num, hand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCardAskBoundary() {
        System.out.println("cardAsk-Boundary");
        int num = 1;
        int[] hand = {1};
        boolean expResult = true;
        boolean result = Main.cardAsk(num, hand);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCPUAskGood() {
        System.out.println("CPUAsk-Good");
        int num = 1;
        int[] hand = {1, 1};
        boolean expResult = true;
        boolean result = Main.cardAsk(num, hand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCPUAskBad() {
        System.out.println("CPUAsk-Bad");
        int num = 1;
        int[] hand = {2};
        boolean expResult = false;
        boolean result = Main.cardAsk(num, hand);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCPUAskBoundary() {
        System.out.println("CPUAsk-Boundary");
        int num = 1;
        int[] hand = {1};
        boolean expResult = true;
        boolean result = Main.cardAsk(num, hand);
        assertEquals(expResult, result);
    }

    @Test
    public void testTallyGood() {
        System.out.println("tally-win");
        int userPoint = 1;
        int comPoint = 0;
        Main.tally(userPoint, comPoint);
    }
   
    @Test
    public void testTallyBad() {
        System.out.println("tally-lose");
        int userPoint = 0;
        int comPoint = 1;
        Main.tally(userPoint, comPoint);
    }

    @Test
    public void testTallyBoundary() {
        System.out.println("tally-tie");
        int userPoint = 1;
        int comPoint = 1;
        Main.tally(userPoint, comPoint);
    }
    
    
}
    

