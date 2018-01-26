package cy.demo.springboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class MagicNumber {

    //This version gets the number from the URL

    @RequestMapping("/magic_num")
    public StringBuffer showPattern(@RequestParam("num") int num){


        StringBuffer display = new StringBuffer("");


        display.append("Starting Number: ");
        display.append(String.valueOf(num));
        display.append("<br/>");

        display.append(String.valueOf(num));
        display.append("   ");


        while (num != 1){

           if (num % 2 == 0)
           {
               num = num/2;
           }
           else //num is odd
           {
               num = 3 * num + 1;
           }


           display.append(String.valueOf(num)) ;
           display.append("    ");
        }

        return display;
    }


}
