package duke.task;

/**
 * duke.task.ToDos class creates todos
 * @author Shaune Ang
 */
public class ToDo extends Task{
    /**
     * Creates duke.task.ToDos from user input
     * @param name name of task
     */
    public ToDo(String name) {
        super(name);
    }

    /**
     * Constructs ToDo for task loaded from saved file
     * @param name name of task
     * @param status completed status of task
     */
    public ToDo(String name, boolean status, PriorityLevel priority) {
        super(name, status, priority);
    }

    /**
     * Returns string format for displaying todos tasks
     * @return string format for displaying event task
     */
    @Override
    public String toString() {
        return String.format("[T] %s", super.toString());
    }
}
