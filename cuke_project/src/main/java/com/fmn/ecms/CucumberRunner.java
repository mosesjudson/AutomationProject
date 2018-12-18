/**
 * 
 */
package com.fmn.ecms;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author moses1
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/com/fmn/ecms/feature"}
		)
public class CucumberRunner {

}
