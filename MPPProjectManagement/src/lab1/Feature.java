/*
GROUP MEMBERS
1. AJIT RAJTHALA    ID: 984947
2. ANISH PRASHAD PANTHI     ID: 984926
3. SANJEEV SHRESTHA     ID: 984970
*/

package lab1;

public class Feature {
    
    private int id;
    private String title;
    private String description;
    private double estimated;
    private double actual;
    private double remaining;
    private double weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getEstimated() {
        return estimated;
    }

    public void setEstimated(double estimated) {
        this.estimated = estimated;
    }

    public double getActual() {
        return actual;
    }

    public void setActual(double actual) {
        this.actual = actual;
    }

    public double getRemaining() {
        return remaining;
    }

    public void setRemaining(double remaining) {
        this.remaining = remaining;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}