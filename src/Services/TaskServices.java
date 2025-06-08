package Services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Models.State;
import Models.Task;
import Models.TaskWriter;

public class TaskServices implements ITaskService {

    

    @Override
    public void AddTask(Task t) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Task Description");
        t.setDesc(sc.nextLine());
        t.setStatus(State.UNTOUCHED);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        t.setCreatedAt(LocalDateTime.now().format(f));
        t.setUpdatedDate(LocalDateTime.now().format(f));
        TaskWriter.WriteTask(t);
    }

    @Override
    public void UpdateTask() {
        
        
    }

}
