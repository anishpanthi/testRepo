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

public class Sprint {

    private String title;
    private Date startDate;
    private Date endDate;
    private char status;
    private List<Task> tasks;

    public Sprint() {
        tasks = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task getTask(int position) {
        return tasks.get(position);
    }

    public void removeTask(int position) {
        tasks.remove(position);
    }

}
