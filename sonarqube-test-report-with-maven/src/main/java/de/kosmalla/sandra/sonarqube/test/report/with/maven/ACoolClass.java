package de.kosmalla.sandra.sonarqube.test.report.with.maven;

/**
 * A cool class
 *
 */
public class ACoolClass {

    public enum TestType {

        UNIT_TEST,
        INTEGRATION_TEST
    }

    private TestType type;

    public ACoolClass(TestType type) {
        this.type = type;
    }

    public String greetz() {
        if (type.equals(TestType.UNIT_TEST)) {
            return "Hey ho, unit test";
        } else if (type.equals(TestType.INTEGRATION_TEST)) {
            return "Howdy, integration test";
        }
        return "Hello World";
    }

}
