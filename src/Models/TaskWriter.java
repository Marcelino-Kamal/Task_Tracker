package Models;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TaskWriter {

    private static ObjectMapper mapper = new ObjectMapper();

    public static void WriteTask(Task t){
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/data/tasks.json"), t);
        } catch (Exception e) {
            System.out.println("Failed to write the task\nReason: "+e);
        }

    }



}
