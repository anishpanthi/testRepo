package lesson3.labs.prob1;

public class PersonWithJob {

    private double salary;
    private Person person;

    public double getSalary() {
        return salary;
    }

    PersonWithJob(String n, double s) {
        person = new Person(n);
        salary = s;
    }
    
    PersonWithJob(Person p, double s){
        this.person = p;
        salary = s;
    }
    
    public Person getPerson(){
        return person;
    }

    @Override
    public boolean equals(Object aPerson) {
        if (aPerson == null) {
            return false;
        }
        
        if(aPerson instanceof Person){
            Person person = (Person) aPerson;
            boolean isEqual = person.getName().equals(this.person.getName());
            return isEqual;
        }
        
        if (!(aPerson instanceof PersonWithJob)) {
            return false;
        }
        
        PersonWithJob p = (PersonWithJob) aPerson;
        boolean isEqual = person.getName().equals(p.person.getName())
                && this.getSalary() == p.getSalary();
        return isEqual;
    }

    public static void main(String[] args) {       
        Person p1 = new Person("Joe");
        PersonWithJob p2 = new PersonWithJob(p1, 30000);
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }

}
