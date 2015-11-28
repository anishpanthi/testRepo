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

public class ReleaseBacklog {

    private String title;
    private String description;
    private String storyBoard;
    private Date createdDate;
    private String version;
    private List<Feature> features;
    private List<Sprint> sprints;

    public ReleaseBacklog() {
        features = new ArrayList<>();
        sprints = new ArrayList<>();
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

    public String getStoryBoard() {
        return storyBoard;
    }

    public void setStoryBoard(String storyBoard) {
        this.storyBoard = storyBoard;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void addFeature(Feature feature) {
        features.add(feature);
    }

    public void addSprint(Sprint sprint) {
        sprints.add(sprint);
    }

    public Feature getFeature(int position) {
        return features.get(position);
    }

    public Sprint getSprint(int position) {
        return sprints.get(position);
    }

    public void deleteFeature(int position) {
        features.remove(position);
    }

    public void deleteSprint(int position) {
        sprints.remove(position);
    }

}
