package lesson5.labs.prob1.factorymethods.rulesets;

import java.awt.Component;
import javax.swing.JOptionPane;
import lesson5.labs.prob1.samplecode.ProfileWindow;
import lesson5.labs.prob1.samplecode.RuleSet;

final public class ProfileWindowRuleSet implements RuleSet {

    //package level access
    ProfileWindowRuleSet() {
    }

    @Override
    public void applyRules(Component ob) throws RuleException {
        ProfileWindow profileWindow = (ProfileWindow) ob;
        //check data

        if (profileWindow.getIdValue().length() == 0
                || profileWindow.getFirstNameValue().length() == 0
                || profileWindow.getLastNameValue().length() == 0
                || profileWindow.getFavoriteMovieValue().length() == 0
                || profileWindow.getFavoriteRestaurantValue().length() == 0) {
            throw new RuleException("A Profile Rule has been Voileted.");
        }

        numericRule(profileWindow);
        checkRestaurantAndMovie(profileWindow);
        checkNameSpaces(profileWindow);
    }

    private void numericRule(ProfileWindow pw) throws RuleException {
        String id = pw.getIdValue();
        try {
            Integer.parseInt(id);
        } catch (NumberFormatException e) {
            throw new RuleException("ID must be numeric.");
        }
    }

    private void checkRestaurantAndMovie(ProfileWindow pw) throws RuleException {
        String restaurant = pw.getFavoriteRestaurantValue();
        String movie = pw.getFavoriteMovieValue();

        if (restaurant.equalsIgnoreCase(movie)) {
            throw new RuleException("Movie name and Restaurant name should be different.");
        }
    }

    private void checkNameSpaces(ProfileWindow pw) throws RuleException {
        String firstName = pw.getFirstNameValue();
        String lastName = pw.getLastNameValue();

        if (firstName.matches("^[^\\d\\s]+$") || lastName.matches("^[^\\d\\s]+$")) {
            throw new RuleException("Firstname or Lastname cannot contain whitespaces or numbers.");
        }
    }
}
