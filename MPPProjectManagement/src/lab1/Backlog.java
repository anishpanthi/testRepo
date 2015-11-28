/*
 GROUP MEMBERS
 1. AJIT RAJTHALA    ID: 984947
 2. ANISH PRASHAD PANTHI     ID: 984926
 3. SANJEEV SHRESTHA     ID: 984970
 */
package lab1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Backlog {

    private String title;
    private String description;
    private Date createdDate;
    private List<Feature> features;

    public Backlog() {
        features = new ArrayList<>();
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void addFeature(Feature feature) {
        features.add(feature);
    }

    public Feature getFeature(int position) {
        return features.get(position);
    }
    
    public void removeFeature(int position){
        features.remove(position);
    }
}
