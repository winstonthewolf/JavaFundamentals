//Create a calculator with exception handling when given the wrong type of integer input.    Your program should display a message that informs the user of
//the wrong operand type before exiting.

package ExceptionHandlingAndTextIO;


import static java.lang.System.exit;

public class Calculator {

    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Usage: java Calculator integer1 operator integer2");
            exit(1);
        }

        int result = 0;


        try {
            switch (args[1].charAt(0)){

                case '+': result = Integer.parseInt(args[0]) +
                                    Integer.parseInt(args[2]);
                                    break;
                case '-': result = Integer.parseInt(args[0]) -
                                    Integer.parseInt(args[2]);
                                    break;
                case '.': result = Integer.parseInt(args[0]) *
                                    Integer.parseInt(args[2]);
                                    break;
                case '/': result = Integer.parseInt(args[0]) /
                                    Integer.parseInt(args[2]);
                                    break;
                default: System.out.println("Not a valid operator");
                        System.exit(1);
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong input. Usage: java Calculator integer1 operator integer2");
            boolean notADigit = false; //To mark if a character is not a digit. Default is false
            for (int i =0; i < args[0].length(); i++){
                if(!Character.isDigit(args[0].charAt(i)))
                    notADigit = true;
            }
            if(notADigit)
                System.out.println("Invalid input: " + args[0]);

            //Checker for second integer argument
            notADigit = false;
            for (int i =0; i < args[2].length(); i++){
                if(!Character.isDigit(args[2].charAt(i)))
                    notADigit = true;
            }
            if(notADigit)
                System.out.println("Invalid input: " + args[2]);
            exit(1);
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = "+ result);
    }
}
