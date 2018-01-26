package cy.demo.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MagicNumber {

    @RequestMapping("/")
    public StringBuffer showPattern(){

        Integer input_num;
        Integer num;
        //String display = "";

        StringBuffer display = new StringBuffer("");

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a positive integer > 0:");


        input_num = keyboard.nextInt();
        num = input_num;

        display.append("Starting Number: ");
        display.append(String.valueOf(num));
        display.append("<br/>");

        display.append(String.valueOf(num));
        display.append("   ");

        //display = display + "Starting Number: " + String.valueOf(num) + "<br/>";

        //display = display + String.valueOf(num) + "   ";

        while (num != 1){

           if (num % 2 == 0)
           {
               num = num/2;
           }
           else //num is odd
           {
               num = 3 * num + 1;
           }

           //display = display + "   " +  + "   ";

           display.append(String.valueOf(num)) ;
           display.append("    ");
        }

        return display;
    }


}
