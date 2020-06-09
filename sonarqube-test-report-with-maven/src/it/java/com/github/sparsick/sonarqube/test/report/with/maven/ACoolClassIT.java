package com.github.sparsick.sonarqube.test.report.with.maven;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ACoolClassIT {
    
    @Test
    void greetzIntegrationTest(){
        ACoolClass coolClass = new ACoolClass(ACoolClass.TestType.INTEGRATION_TEST);
        String greetz = coolClass.greetz();
        
        assertTrue(greetz.contains("integration test"));
    }
}
