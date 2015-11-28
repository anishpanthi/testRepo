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

public class StoryBoard {

    private String title;
    private String description;
    private Date createdDate;
    private List<Backlog> backlogs;
    private int counter = 0;

    public StoryBoard() {
        backlogs = new ArrayList<>();
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

    public void addBacklog(Backlog backlog) {
        backlogs.add(backlog);
    }

    public Backlog getBacklog(int position) {
        return backlogs.get(position);
    }

    public void removeBacklog(int position) {
        backlogs.remove(position);
    }
}
