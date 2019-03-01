import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Task {


    private String title;
    private String project;
    private LocalDate dueDate;
    private boolean done;


//    private List<Task> list = new ArrayList<>();


    public Task(String project, String title, LocalDate dueDate ) {

        this.title = title;
        this.project = project;
        this.dueDate = dueDate;

    }




    public void setStatus(boolean done) {
        this.done = done;
    }

    public boolean status() {
        return done;
    }



        public String getTitle()// this will return the task added

    {

        return title;
    }


    public String getProject(String project)// this will return the task added

    {

        return project;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    /*
     *
     */
    public String getProject()// this will return the project
    {

        return project;
    }



    public LocalDate getDueDate() // this will return the date

    {

        return dueDate;

    }

    public String toString() // this will print in the string format
    {
        return (project + "  " +  title + " " + dueDate);
    }




}

    /*
    /public String getStatus( boolean status)
    {  if(status = true)
        return "done";
    }
    */

    // this will get the status of the project if  it is done or undone

    /*public String getStatus()// this will get the status of the project if  it is done or undone
    {    (status = true)
        return done;

    }

    public void setStatus(String status)// this  set the status as done or undone
    {
        this.status = status;

    }
    //toString
    public String toString() // this will print in the string format
    {
        return (project + "  " +  title + " " + dueDate);
    }


}*/
