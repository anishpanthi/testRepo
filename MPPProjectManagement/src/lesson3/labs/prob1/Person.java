package lesson3.labs.prob1;

public class Person {

    private String name;

    Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object aPerson) {
        if (aPerson == null) {
            return false;
        }
        
        if(aPerson instanceof PersonWithJob){
            PersonWithJob pwj = (PersonWithJob) aPerson;
            boolean isEqual = getName().equals(pwj.getPerson().getName());
            return isEqual;
        }
        
        if (!(aPerson instanceof Person)) {
            return false;
        }
        Person p = (Person) aPerson;
        boolean isEqual = this.name.equals(p.name);
        return isEqual;
    }
}
