

 import java.util.*; 
 public class Daniel_passwordApp {  
//String randomPass1 = (letter1.low + randomNum + letter 4);
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);  

        //System.out.print("Enter name: ");
        //String name = input.nextLine();
        //System.out.print("Hello " + name +"\n");
        boolean run = true; 
        while (run) {

         System.out.print("\nDo you want a password (Yes)(No)");
         String pass = input.nextLine();

         if (pass.equals("no")) {
             System.out.print("\n");
             break;
         }

         int randomNum1 = (int)(Math.random() * 26) + 1;
         int randomNum2 = (int)(Math.random() * 26) + 1;
         int randomNum3 = (int)(Math.random() * 26) + 1;
         int randomNum4 = (int)(Math.random() * 26) + 1;
         int randomNum5 = (int)(Math.random() * 26)+ 1;
         int randomNum6 = (int)(Math.random() * 26)+ 1;



        
        String c1 = ("A");
        String c2 = ("B");
        String c3 = ("C");
        String c4 = ("D");
        String c5 = ("E");
        String c6 = ("F");
        String c7 = ("G");
        String c8 = ("H");
        String c9 = ("I");
        String c10 = ("J");
        String c11 = ("K");
        String c12 = ("L");
        String c13 = ("M");
        String c14 = ("N");
        String c15 = ("O");
        String c16 = ("P");
        String c17 = ("Q");
        String c18 = ("R");
        String c19 = ("S");
        String c20 = ("T");
        String c21 = ("U");
        String c22 = ("V");
        String c23 = ("W");
        String c24 = ("X");
        String c25 = ("Y");
        String c26 = ("Z");

         if (pass.equals("no")){
            System.out.print("\n");
           break;

           
            }else
               
       
        if (randomNum1 == 1) {
                System.out.print( c1 );

                if(randomNum2 == 1 ){
                        System.out.print( c1 );
                }
                if (randomNum3 == 1){
                        System.out.print( c1 );
                }
                if (randomNum4==1){
                        System.out.print( c3 );
                                        }
                 if (randomNum5==1){
                        System.out.print( c4 );
                 }else if (randomNum6 == 1){
                System.out.print( c5 );
                }
                
        }// end c1 
        
        
        
        
        



           if (randomNum1 == 2) {
                System.out.print( c2 );

                if(randomNum2 == 2){
                        System.out.print( c2 );
                         } if (randomNum3 == 2){
                        System.out.print( c7 );

                                 } if (randomNum4 == 2){
                                        System.out.print( c8 );
                                        } if (randomNum5 == 2){
                                        System.out.print( c9 );
                                                } if (randomNum6 == 2){
                                                System.out.print( c2 );
                }

         if (randomNum1 == 3) {
                System.out.print( c3 );

                if(randomNum2 == 3){
                        System.out.print( c10 );
                         } if (randomNum3 == 3){
                        System.out.print( c4 );

                                 } if (randomNum4 == 3){
                                        System.out.print( c3 );
                                        } if (randomNum5 == 3){
                                        System.out.print( c3 );
                                                } if (randomNum6 == 3){
                                                System.out.print( c12 );
                }
         if (randomNum1 == 4) {
                System.out.print( c4 );

                if(randomNum2 == 4){
                        System.out.print( c7 );
                         } if (randomNum3 == 4){
                        System.out.print( c4 );

                                 } if (randomNum4 == 4){
                                        System.out.print( c20 );
                                        } if (randomNum5 == 4){
                                        System.out.print( c16 );
                                                }else if (randomNum6 == 4){
                                                System.out.print( c18 );
                }
          if (randomNum1 == 5) {
                System.out.print( c5 );

                if(randomNum2 == 5){
                        System.out.print( c7 );
                         } if (randomNum3 == 5){
                        System.out.print( c9 );

                                 } if (randomNum4 == 5){
                                        System.out.print( c2 );
                                        } if (randomNum5 == 5){
                                        System.out.print( c3 );
                                                } if (randomNum6 == 5){
                                                System.out.print( c4 );
                }
          if (randomNum1 == 6) {
                System.out.print( c6 );

                if(randomNum2 == 6){
                        System.out.print( c5 );
                         } if (randomNum3 == 6){
                        System.out.print( c6 );

                                 } if (randomNum4 == 6){
                                        System.out.print( c7 );
                                        } if (randomNum5 == 6){
                                        System.out.print( c18 );
                                                } if (randomNum6 == 6){
                                                System.out.print( c8 );
                }
         if (randomNum1 == 7) {
                System.out.print( c7 );

                if(randomNum2 == 7){
                        System.out.print( c9 );
                         } if (randomNum3 == 7){
                        System.out.print( c10 );

                                 } if (randomNum4 == 7){
                                        System.out.print( c11 );
                                        } if (randomNum5 == 7){
                                        System.out.print( c12 );
                                                } if (randomNum6 == 7){
                                                System.out.print( c13 );
                }
         if (randomNum1 == 8) {
                System.out.print( c8 );

                if(randomNum2 == 8){
                        System.out.print( c14 );
                         } if (randomNum3 == 8){
                        System.out.print( c15 );

                                 } if (randomNum4 == 8){
                                        System.out.print( c16 );
                                        } if (randomNum5 == 8){
                                        System.out.print( c17 );
                                                } if (randomNum6 == 8){
                                                System.out.print( c18 );
                }
          if (randomNum1 == 9) {
                System.out.print( c9 );

                if(randomNum2 == 9){
                        System.out.print( c19 );
                         } if (randomNum3 == 9){
                        System.out.print( c20 );

                                 } if (randomNum4 == 9){
                                        System.out.print( c21 );
                                        } if (randomNum5 == 9){
                                        System.out.print( c22 );
                                                } if (randomNum6 == 9){
                                                System.out.print( c23 );
                }
          if (randomNum1 == 10) {
                System.out.print( c10 );

                if(randomNum2 == 10){
                        System.out.print( c24 );
                         } if (randomNum3 == 10){
                        System.out.print( c25 );

                                 } if (randomNum4 == 10){
                                        System.out.print( c26 );
                                        } if (randomNum5 == 10){
                                        System.out.print( c7 );
                                                } if (randomNum6 == 10){
                                                System.out.print( c9 );
                }
         if (randomNum1 == 11) {
                System.out.print( c11 );

                if(randomNum2 == 11){
                        System.out.print( c10 );
                         } if (randomNum3 == 11){
                        System.out.print( c11 );

                                 } if (randomNum4 == 11){
                                        System.out.print( c13 );
                                        } if (randomNum5 == 11){
                                        System.out.print( c9 );
                                                } if (randomNum6 == 11){
                                                System.out.print( c10 );
                }
          if (randomNum1 == 12) {
                System.out.print( c12 );

                if(randomNum2 == 12){
                        System.out.print( c15 );
                         } if (randomNum3 == 12){
                        System.out.print( c11 );

                                 } if (randomNum4 == 12){
                                        System.out.print( c6 );
                                        } if (randomNum5 == 12){
                                        System.out.print( c9 );
                                                } if (randomNum6 == 12){
                                                System.out.print( c10 );
                }
         if (randomNum1 == 13) {
                System.out.print( c13 );

                if(randomNum2 == 13){
                        System.out.print( c9 );
                         } if (randomNum3 == 13){
                        System.out.print( c3 );

                                 } if (randomNum4 == 13){
                                        System.out.print( c2 );
                                        } if (randomNum5 == 13){
                                        System.out.print( c1 );
                                                } if (randomNum6 == 13){
                                                System.out.print( c1 );
                }
         if (randomNum1 == 14) {
                System.out.print( c14 );

                if(randomNum2 == 14){
                        System.out.print( c2 );
                         } if (randomNum3 == 14){
                        System.out.print( c3 );

                                 } if (randomNum4 == 14){
                                        System.out.print( c4 );
                                        } if (randomNum5 == 14){
                                        System.out.print( c5 );
                                                } if (randomNum6 == 14){
                                                System.out.print( c6 );
                }
          if (randomNum1 == 15) {
                System.out.print( c15 );

                if(randomNum2 == 15){
                        System.out.print( c7 );
                         } if (randomNum3 == 15){
                        System.out.print( c8 );

                                 } if (randomNum4 == 15){
                                        System.out.print( c9 );
                                        } if (randomNum5 == 15){
                                        System.out.print( c10 );
                                                } if (randomNum6 == 15){
                                                System.out.print( c11 );
                }
         if (randomNum1 == 16) {
                System.out.print( c16 );

                if(randomNum2 == 16){
                        System.out.print( c12 );
                         } if (randomNum3 == 16){
                        System.out.print( c13 );

                                 } if (randomNum4 == 16){
                                        System.out.print( c14 );
                                        } if (randomNum5 == 16){
                                        System.out.print( c15 );
                                                } if (randomNum6 == 16){
                                                System.out.print( c16 );
                }
          if (randomNum1 == 17) {
                System.out.print( c17 );

                if(randomNum2 == 18){
                        System.out.print( c17 );
                         } if (randomNum3 == 18){
                        System.out.print( c18 );

                                 } if (randomNum4 == 18){
                                        System.out.print( c19 );
                                        } if (randomNum5 == 18){
                                        System.out.print( c20 );
                                                } if (randomNum6 == 18){
                                                System.out.print( c21 );
                }
         if (randomNum1 == 19) {
                System.out.print( c18 );

                if(randomNum2 == 19){
                        System.out.print( c22 );
                         } if (randomNum3 == 19){
                        System.out.print( c23 );

                                 } if (randomNum4 == 19){
                                        System.out.print( c24 );
                                        } if (randomNum5 == 19){
                                        System.out.print( c25 );
                                                } if (randomNum6 == 19){
                                                System.out.print( c26 );
                }
          if (randomNum1 == 20) {
                System.out.print( c19 );

                if(randomNum2 == 20){
                        System.out.print( c1 );
                         } if (randomNum3 == 20){
                        System.out.print( c1 );

                                 } if (randomNum4 == 20){
                                        System.out.print( c2 );
                                        } if (randomNum5 == 20){
                                        System.out.print( c3 );
                                                } if (randomNum6 == 20){
                                                System.out.print( c4 );
                }
          if (randomNum1 == 21) {
                System.out.print( c20 );

                if(randomNum2 == 21){
                        System.out.print( c5 );
                         } if (randomNum3 == 21){
                        System.out.print( c6);

                                 } if (randomNum4 == 21){
                                        System.out.print( c7 );
                                        } if (randomNum5 == 21){
                                        System.out.print( c8 );
                                                } if (randomNum6 == 21){
                                                System.out.print( c9 );
                }
         if (randomNum1 == 22) {
                System.out.print( c21 );

                if(randomNum2 == 22){
                        System.out.print( c10);
                         } if (randomNum3 == 22){
                        System.out.print( c11);

                                 } if (randomNum4 == 22){
                                        System.out.print( c12);
                                        } if (randomNum5 == 22){
                                        System.out.print( c13);
                                                } if (randomNum6 == 22){
                                                System.out.print( c14);
                }
          if (randomNum1 == 23) {
                System.out.print( c22 );

                if(randomNum2 == 23){
                        System.out.print( c15);
                         } if (randomNum3 == 23){
                        System.out.print( c16);

                                 } if (randomNum4 == 23){
                                        System.out.print( c17);
                                        } if (randomNum5 == 23){
                                        System.out.print( c18);
                                                } if (randomNum6 == 23){
                                                System.out.print( c19);
                }
        if (randomNum1 == 24) {
                System.out.print( c23 );

                if(randomNum2 == 24){
                        System.out.print( c20);
                         } if (randomNum3 == 24){
                        System.out.print( c21);

                                 } if (randomNum4 == 24){
                                        System.out.print( c22);
                                        } if (randomNum5 == 24){
                                        System.out.print( c1);
                                                } if (randomNum6 == 24){
                                                System.out.print( c23);
                }
        }
         if (randomNum1 == 25) {
                System.out.print( c24 );

                if(randomNum2 == 25){
                        System.out.print( c24);
                         } if (randomNum3 == 25){
                        System.out.print( c25);

                                 } if (randomNum4 == 25){
                                        System.out.print( c26);
                                        } if (randomNum5 == 25){
                                        System.out.print( c1 );
                                                } if (randomNum6 == 25){
                                                System.out.print( c1 );
                }
          if (randomNum1 == 26) {
                System.out.print( c25 );

                if(randomNum2 == 26){
                        System.out.print( c2 );
                         } if (randomNum3 == 26){
                        System.out.print( c7 );

                                 } if (randomNum4 == 26){
                                        System.out.print( c13);
                                        } if (randomNum5 == 26){
                                        System.out.print( c15);
                                                } if (randomNum6 == 26){
                                                System.out.print( c19);
                }

         if (randomNum1 == 17) {
                System.out.print( c26 );

                if(randomNum2 == 17){
                        System.out.print( c4 );
                         } if (randomNum3 == 17){
                        System.out.print( c3 );

                                 } if (randomNum4 == 17){
                                        System.out.print( c18);
                                        } if (randomNum5 == 17){
                                        System.out.print( c19);
                                                } if (randomNum6 == 17){
                                                System.out.print( c22);
                }
        }}}}}}}}}}}}}}}}}}}}}}}}  //all the ifs

}           
}}























        
        

        









               

  





