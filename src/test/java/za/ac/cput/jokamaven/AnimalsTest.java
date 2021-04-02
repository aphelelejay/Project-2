/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.jokamaven;

import java.time.Duration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aphel
 */
public class AnimalsTest {
      private Animals dog;
    private Animals cat;
    
    public static void AnimalTest() {
        
    }
    
    @Test
    public void objectIdentity() {
        assertNotSame(dog, cat);
    }
    
    
    @Test
    public void objectEquality() {
                assertEquals(dog, cat);
    }
    
    @Test
    public void failedTest() {
          fail("Fail test");
        System.out.println("Fail");
    }
    
    @Test
    public void timeoutTest() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Timeout");
    }
    
    @Test 
    public void DisablingTest(){
        
    }

    
}
