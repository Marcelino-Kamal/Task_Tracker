package View;

import java.util.Scanner;

import Models.FileCreation;

public class Home {
    
    private static Home _Instance;
    
    private Home(){
       FileCreation.getInstance();
        DashBoard();
    }

    public static Home getInstance(){
        if(_Instance==null){
            _Instance =  new Home();
        }
        return _Instance;
    }

    private void DashBoard(){
      System.out.println("\n-------Task Tracker------\n");
      System.out.println("Welcome to Task Tracker!!!\nPlease choose your operation: ");
      System.out.println("1- Add Task\n2-Update Task\n3-Delete Task");
      System.out.println("4-List all Tasks\n5-List done tasks\n6-List not done tasks\n7-List in progress");
      Scanner sc = new Scanner(System.in);
      System.out.print("Your Choise is: ");
      int choice = sc.nextInt();
     
      sc.nextLine();
      switch (choice) {
        case 1:
            System.out.println("Please enter the task details: ");

            break;
        case 2:

        default:
            sc.close();
            break;
      }
    }


}
