import java.util.*;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.time.LocalDate;
import java.io.IOException;


public class View {



    private static List<Task> tasks = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);
    private Validator val = new Validator();


    public void addingTasks() {
        String project = getProject();
        String title = getTitle();
        LocalDate dueDate = getDueDate();


        Task ta = new Task(project, title, dueDate);

        tasks.add(ta);

        System.out.println("______________________________________");
        System.out.println(  "Project    " + "title    " + "dueDate    " );
        System.out.println(  project + "          " + title + "     " + dueDate);
        System.out.println("_______________________________________");
        // Get the user input for the title , project and date
        //public void addTitle() {


    }



//user  will provide input for the title

    public String getTitle() {

        System.out.println( "Enter your the title of the task");

        String title = val.readString();
        return title;

    }
    //user  will provide input for the object

    public String getProject() {
        System.out.println("Enter your the Project");

        String project = val.readString();
        return project;

    }

    //user  will provide input for the date

    public LocalDate getDueDate() {

        System.out.println("please enter the correct date format dd/MM/yyyy");
        LocalDate dueDate = val.getDateValidator();
        return dueDate;
    }

    // the method will check  if the number is less than the size of the array

    public  boolean control(int number) {
        if (tasks.size() <= number) {
            System.out.println("Input correct number");
            return false;
        }
        return true;

    }


    // here the status of the array will be updated by the user
    public void setMarkStatus() {
        System.out.println(" Title to change Status: ");
        int number = val.readInt();
        if (control(number))
            tasks.get(number).setStatus(true);
    }

    // here  the user will  make a change for the title

    public  void update() {
        System.out.print(" to  update the tile  ");
        int number = val.readInt();
        if (control(number)) {
            System.out.print("Enter task: ");
            String input = scan.nextLine();

             tasks.get(number).setTitle(input);

        }
    }


    //  the user will delete the title;
    public  void remove() {
        System.out.print("Title  to delete: ");
        int number = val.readInt();
        if (control((number))) {
            tasks.remove(number);
        }
    }


    // list of the done status will be displayed
public void showStatus() {

    for (Task task : tasks) {
        if (task.status()) {

            System.out.println(task.getTitle());

        }
    }

}

// the array list will be displayed
public void listAll() {
        System.out.println("    ");
        boolean control = false;
        for (int i = 0; i < tasks.size(); i++) {
            control = true;
            System.out.print("index"+  "     " + i +   "     " +
                    "Title " +  "   " + tasks.get(i).getTitle());
            if (tasks.get(i).status())

                System.out.println("       Status       done");
            else
                System.out.println("       Status     undone");
        }
        if (!control)
            System.out.println("There are no tasks");
        System.out.println("\n\n");
    }

//  this saves
    public void saveFile()


            throws IOException

    {
        System.out.println("To save enter  \"y\"    );

        Scanner input = new Scanner ( System.in);
        char select = input.next().charAt(0);


        FileOutputStream out = null ;
        DataOutputStream data = null;
        String filepath = "/Users/mahi/Desktop/ToDoList/ test.txt";


        try {



            out = new FileOutputStream( filepath, true);
            data = new DataOutputStream(out);

            for (Task taskList   : tasks) {
                String list = taskList.toString();
                data.writeUTF(list);

            }

        }catch (IOException e){
            e.printStackTrace();


        } finally {
            if (out!=null)
                out.close();
            if (data!= null)
                data.close();

        }
        System.out.println("your task has been saved");

    }

            }
