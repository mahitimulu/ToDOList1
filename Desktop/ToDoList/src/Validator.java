import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Validator {

    Scanner  scan = new Scanner(System.in);



    public String readString() {



            String input = scan.nextLine();

            return input;


    }


        public int readInt(){

       int number;
       do {System.out.println("please enter a number");

           while (!scan.hasNextInt()) {
               System.out.println("That's not a number!");
               scan.next(); // this is important!
           }
           number = scan.nextInt();
       } while (number < 0);
       return number;


   }
    public LocalDate getDateValidator() {


        boolean isDueDate = false;
        LocalDate date = null;

        do{
            String userInput  = scan.nextLine();

            try {

                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(  "dd/MM/yyyy");

                date = LocalDate.parse(userInput, dateFormat);

                System.out.println(date);

                isDueDate= true;

                if ( date.isBefore(LocalDate.now())) throw new IllegalArgumentException("wrong date is entered") ;

            } 	catch(IllegalArgumentException e) {

                System.out.println ( "date cannot be before today");
                System.out.println("please enter the correct date");
                isDueDate= false;

            }catch (DateTimeParseException exc) {
                // TODO Auto-generated catch block
                System.out.println("correct date format is \"dd/MM/yyyy\"");
            }

        }while (!isDueDate);

        return date;
    }
}



