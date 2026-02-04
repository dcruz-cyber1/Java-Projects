
import java.util.*; 
public class Daniel_temp_converter{ 
   

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  

        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Hello " + name +"\n");
        //ask name
        System.out.print("Celsius, Fahrenheit, Kelvin:(C) (F) (K):");
        String op = input.nextLine();
        //operation

        System.out.print("Conversion to: (C) (F) (K): ");
        String conversion = input.nextLine();

        //converstion
      
        

        System.out.print("Enter a temp: ");
        double temp = input.nextDouble();

        double results = 0;
        if (op.equals("C" )){
            if (conversion.equals("F")){
                results = (temp * 9/5) + 32; 
            }else{ 
                conversion.equals("K");
                results = temp + 273.15; 
                //operation Celcius
            }   
        }
        
        
        if (op.equals("F")){
            if (conversion.equals("C")){
                results = (double) (temp - 32) * 5/9; // (32°F − 32) × 5/9 = 0°C
 
            }else {
                conversion.equals("K");
                results = (double) ((temp - 32) * 5/9 + 273.15); // (32°F − 32) × 5/9 + 273.15 = 273.15K
                //operation farhinheight 
            }
        }                    
                                


        if (op.equals("K")){
            if (conversion.equals("F")){
                results = (double) ((temp - 273.15) * 9/5 + 32);
            } else {
                conversion.equals("C");
                results =  (temp - 273.15);
                //operation kelvin
            }
        }

        System.out.print(results);


        

    }// END MAIN
}// END CLASS 