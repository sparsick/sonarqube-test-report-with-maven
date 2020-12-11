package com.github.sparsick.sonarqube.test.report.with.maven;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for a cool class
 */
public class ACoolClassTest {
    
    @Test
    void greetzUnitTest(){
        ACoolClass coolClass = new ACoolClass(ACoolClass.TestType.UNIT_TEST);
        String greetz = coolClass.greetz();
        
        assertTrue(greetz.contains("unit test"));
    }

}
