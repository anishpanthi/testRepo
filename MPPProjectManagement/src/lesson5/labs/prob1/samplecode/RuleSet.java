package lesson5.labs.prob1.samplecode;

import java.awt.Component;
import lesson5.labs.prob1.factorymethods.rulesets.RuleException;


public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
