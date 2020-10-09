import java.util.Calendar;

/**
 * Template Task
 */
public class Task {

    //create Category and Status class
    private Category category;
    private Category subCategory;
    private String taskName;
    private Calendar dueDate;
    private Status status;
    private Priority priority;

    //Setters

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setSubCategory(Category subCategory) {
        this.subCategory = subCategory;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setPriority(int level) {
        this.priority.setLevel(level);
    }
    //Getters

    public Category getCategory() {
        return this.category;
    }

    public Category getSubCategory() {
        return this.subCategory;
    }

    public Calendar getDueDate(Calendar dueDate) {
        return this.dueDate;
    }

    public Status getStatus() {
        return status;
    }

    public String getTaskName(String taskName) {
        return taskName;
    }

    public Priority getPriority() {
        return priority;
    }
}
