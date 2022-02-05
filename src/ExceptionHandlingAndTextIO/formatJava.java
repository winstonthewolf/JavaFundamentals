package ExceptionHandlingAndTextIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class formatJava {

    public static void main(String[] args) throws java.io.IOException{

        if(args.length != 2){
            System.out.println("Usage: java formatJava srcFilePath newFilePath");
        }
        File sourceCodeFile = new File(args[0]);
        if(!sourceCodeFile.exists()){
            System.out.println("File does not exist");
            System.exit(1);
        }

        File newFile = new File(args[1]);
        if(newFile.exists()){
            System.out.println("Destination File exists already");
            System.exit(2);
        }
        try (
                Scanner input = new Scanner(sourceCodeFile);
                PrintWriter output = new PrintWriter(newFile);
        ) {

            String line1 = input.nextLine();
            String line2 = input.nextLine();
            while (input.hasNext() || (line1 != null || line2 !=null)) {
                boolean printedNewLineAlready = false;
                if(line1.length() == 0){
                    output.println();
                    printedNewLineAlready = true;
                }
                if((line2.length() == 0) && (line1.length() != 0)){
                    output.println(line1);
                    output.println();
                }else{

                    CharSequence sequence = "{";
                    if(line2.contains(sequence)){

                        line2 = line2.replaceAll("\\{", "");
                        line1 = line1 + "{";
                        output.println(line1);

                        line1 = input.nextLine();
                        line2 = input.nextLine();
                        continue;
                    }else{

                        if (!printedNewLineAlready) {
                            output.println(line1);
                        }
                        line1 = line2;
                        line2 = input.nextLine();
                        continue;
                    }
                }
                if(!input.hasNext())   //If theres no more input after capturing and printing the last 2 lines then end the program
                    break;
                line1 = input.nextLine();
                line2 = input.nextLine();




            }
        }
        System.exit(0);
    }
}
