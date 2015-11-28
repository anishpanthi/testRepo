package lesson5.labs.prob1.factorymethods.rulesets;

import java.awt.Component;
import java.util.HashMap;
import lesson5.labs.prob1.samplecode.AddrWindow;
import lesson5.labs.prob1.samplecode.ProfileWindow;
import lesson5.labs.prob1.samplecode.RuleSet;

final public class RuleSetFactory {

    private RuleSetFactory() {
    }
    static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();

    static {
        map.put(AddrWindow.class, new AddressWindowRuleSet());
        map.put(ProfileWindow.class, new ProfileWindowRuleSet());
    }

    public static RuleSet getRuleSet(Component c) {
        Class<? extends Component> cl = c.getClass();
        if (!map.containsKey(cl)) {
            throw new IllegalArgumentException("No RuleSet found for this Component");
        }
        return map.get(cl);
    }
}
