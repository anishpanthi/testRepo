package lesson5.labs.prob1.factorymethods.rulesets;

import java.awt.Component;
import lesson5.labs.prob1.samplecode.AddrWindow;
import lesson5.labs.prob1.samplecode.RuleSet;

final public class AddressWindowRuleSet implements RuleSet {

    //package level access
    AddressWindowRuleSet() {
    }

    @Override
    public void applyRules(Component ob) throws RuleException {
        AddrWindow addr = (AddrWindow) ob;

        numericRule(addr);
        checkEmpty(addr);
        zipLengthCheck(addr);
        zipLettersCheck(addr);
    }

    private void numericRule(AddrWindow addr) throws RuleException {
        String zip = addr.getZipValue();
        String id = addr.getIdValue();
        try {
            Integer.parseInt(zip);
            Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new RuleException("ID or ZIP must be numeric.");
        }
    }

    private void checkEmpty(AddrWindow addr) throws RuleException {
        if (addr.getIdValue().length() == 0
                || addr.getStreetValue().length() == 0
                || addr.getCityValue().length() == 0
                || addr.getStateValue().length() == 0
                || addr.getZipValue().length() == 0) {
            throw new RuleException("A Profile Rule has been Voileted.");
        }
    }

    private void zipLengthCheck(AddrWindow addr) throws RuleException {
        if (addr.getZipValue().length() != 5) {
            throw new RuleException("ZIP value must be of 5 digits.");
        }
    }

    private void zipLettersCheck(AddrWindow addr) throws RuleException {
        if (addr.getZipValue().length() != 2 || !addr.getZipValue().matches("[A-Z]")) {
            throw new RuleException("ZIP value must be of 2 characters and is capital letter.");
        }
    }
    
    private void checkIdAndZip(AddrWindow addr) throws RuleException{
        if(addr.getIdValue().equals(addr.getZipValue())){
            throw new RuleException("Id and Zip cannot be equal.");
        }
    }
}
