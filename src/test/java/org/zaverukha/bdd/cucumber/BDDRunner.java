package org.zaverukha.bdd.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.io.MultiLoader;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@CucumberOptions(features = "src/test/resources/features", format = { "pretty",
        "html:target/site/cucumber-pretty",
        "rerun:target/rerun.txt",
        "json:target/cucumber1.json" })
public class BDDRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void beforeClass(){
        MultiLoader multiLoader = new MultiLoader(this.getClass().getClassLoader());
        int i = 0;
    }

    @Test
    public void testSomeLibraryMethod() {
        int i =0;
    }

    @AfterClass
    public void afterClass(){

    }
}
