package org.zaverukha.bdd.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

/**
 * Created by alexander on 01.03.17.
 */
public class MyStepdefs implements En {
    public MyStepdefs() {
        When("^some$", () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Write code here that turns the phrase above into concrete actions
        });
    }
}
