package de.kosmalla.sandra.sonarqube.test.report.with.maven;

import static org.junit.Assert.assertTrue;
import org.junit.Test;



/**
 * Unit test for a cool class
 */
public class ACoolClassTest {
    
    @Test
    public void greetzUnitTest(){
        ACoolClass coolClass = new ACoolClass(ACoolClass.TestType.UNIT_TEST);
        String greetz = coolClass.greetz();
        
        assertTrue(greetz.contains("unit test"));
    }
  
}
