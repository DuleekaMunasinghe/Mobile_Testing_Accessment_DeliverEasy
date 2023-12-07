package bdd.Listners;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestListner {
    private static final Logger LOGGER = LogManager.getLogger(TestListner.class);

    @Before
    public void beforeScenario(Scenario scenario) {
        LOGGER.info("Starting scenario: " + scenario.getName());
        // Any setup actions before the scenario starts
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            LOGGER.error("Scenario failed: " + scenario.getName());
            // Capture additional logs or actions for failed scenarios
        } else {
            LOGGER.info("Scenario passed: " + scenario.getName());
        }
    }
}
