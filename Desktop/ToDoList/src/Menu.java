import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    View list = new View();


    public void  setmenu() throws IOException {
        Scanner input = new Scanner(System.in);
        boolean done = true;

        int choice;
        do {
            System.out.println("******************");
            System.out.println("Plese choose one ");
            System.out.println("1\t Add New Task	");
            System.out.println("2\t List All	");
            System.out.println("3\t Show Task List by date or project");
            System.out.println("4\t Set the Status of Project or Ttitle as done  and undone	");
            System.out.println("5\t update");
            System.out.println("6\t remove");
            System.out.println("7\t Status");
            System.out.println("8\t Save");
            System.out.println("9\t Exit");
            System.out.println("******************");
            System.out.println("Enter your Choice" );

            choice = input.nextInt();
            try {


                if (choice <0 || choice >8 )  throw new NumberFormatException(); {



                }

            } catch (NumberFormatException e) {
                System.out.println("your choice is between 0 upto 8" );
                System.out.println("Enter the correct numbers" );
                choice = input.nextInt();
                done = true;
            }catch (InputMismatchException e) {


            }
            switch (choice){

                case 1: System.out.println("Add Tasks");
                    list. addingTasks();

                     list.listAll();
                    break;
                case 2: System.out.println("List All");
                    list.listAll();
                    break;

                case 3: System.out.println("show Task List  by Project and date");

                    break;

                case 4: System.out.println("Set the Status of Project or Ttitle as done  and undone  ");
                    list.listAll();
                    list.setMarkStatus();
                    break;
                case 5: System.out.println("update  ");
                    list.listAll();
                    list.update();

                    break;

                case 6: System.out.println("Remove ");
                    list.listAll();
                    list.remove();

                    break;
                case 7: System.out.println("List of Tasks done ");//  does not work
                    list.showStatus();

                    break;
                case 8: System.out.println("Save  ");
                    list.saveFile();

                    break;
                case 9: System.out.println("exit22  ");//
                      return;




            }



        }while (choice!=8);
        input.close();


    }
}
