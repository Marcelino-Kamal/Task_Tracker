package Models;

import java.io.File;
import java.io.FileWriter;

public class FileCreation {

  
    private static FileCreation _instance;

    private FileCreation(){
        
        this.create();
        
    }

    public static FileCreation getInstance(){
        if(_instance==null){
            _instance = new FileCreation();
        }
        return _instance;
    }

     private void create(){
        try{
            File file = new File("src/data/tasks.json");
            //Check file exists
            if(!file.exists()){
                //Create new file
                if(file.createNewFile()){
                    System.out.println("file created");    
                }else System.out.println("failed to create the file!!");
            }
            if(file.length()==0){
                try (FileWriter fw = new FileWriter(file);) {
                    
                    fw.write("{}");
                    fw.close();
                }   
            }else System.out.println("File contain data");

        } catch (Exception e) {
            System.out.println("File failed due to : "+e);
        }
     }

}
