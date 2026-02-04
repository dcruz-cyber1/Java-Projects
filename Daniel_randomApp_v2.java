import java.util.*; 
public class Daniel_randomApp_v2{ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Hello " + name + " " );
         int randomNum = (int)(Math.random() * 100);
        //ask name
        boolean run = true; 
        
        while (run) {

            System.out.println("------> enter number");
            int Num1 = input.nextInt();
            input.nextLine(); // consume leftover newline

            System.out.print( Num1 + "\n");
            //number 1

            if (Num1 == randomNum){
                System.out.print("correct");
            }else { 
                if (Num1 > randomNum){
                    System.out.print("lower" + "\n");
                }else { 
                    System.out.print("higher" +"\n");
                    System.out.print("(4 lives) enter a number ");

                    int Num2 = input.nextInt();
                    input.nextLine(); // consume leftover newline

                    System.out.print( Num2 + "\n");

                    if (Num2 == randomNum){
                    System.out.print("correct");
                    } else {
                    if (Num2 > randomNum){
                    System.out.print("lower" + "\n");
                        }else { 
                            System.out.print("higher" +"\n");
                            System.out.print("(3 lives) enter a number ");

                            int Num3 = input.nextInt();
                            input.nextLine(); // consume leftover newline

                            System.out.print( Num3 + "\n");
                            
                            if (Num3 == randomNum){
                            System.out.print("correct");
                            
                                } else {
                                    if (Num3 > randomNum){
                                        System.out.print("lower" + "\n");
                                    }else { 
                                        System.out.print("higher" +"\n");
                                        System.out.print("(2 lives) enter a number ");

                                        int Num4 = input.nextInt();
                                        input.nextLine(); // consume leftover newline

                                        System.out.print( Num4 + "\n");

                                        if (Num4 == randomNum){
                                            System.out.print("correct");
                                            
                                        } else if (Num4 > randomNum){
                                            System.out.print("lower" + "\n");
                                        }else{
                                            System.out.print("higher" +"\n");
                                            System.out.print("(1 life) enter a number ");

                                            int Num5 = input.nextInt();
                                            input.nextLine(); // consume leftover newline

                                            System.out.print( Num5 + "\n");

                                            if (Num5 == randomNum){
                                                System.out.print("correct");
                                                
                                            }else {
                                                System.out.print("0 lives" + "\n");
                                        }// END of 0 lives                            
                                    }
                                }// begin Num4
                            }// begin Num4
                        }// begin Num3
                    }// begin Num2
                }
            }// end of Num1

            System.out.print("print close to 0 print 1 to continue ");
            String go = input.nextLine();
            if (go.equals("0")){
                System.out.println("goodbye");
                break;
            }else {
                randomNum = (int)(Math.random() * 100); // <--- add this
                System.out.print("------> Restarting");
                continue; 
            }// END OF GUSSING GAME 
        }// END WHILE
    }// END MAIN 
}// END CLASS