import java.util.*;
public class CheckPassword {

//    (Check password) Some websites impose certain rules for passwords. Write a
//    method that checks whether a string is a valid password. Suppose the password
//    rules are as follows:
//
//
//    A password must have at least ten characters.
//    A password consists of only letters and digits.
//    A password must contain at least three digits.
//    Write a program that prompts the user to enter a password and displays Valid
//    Password if the rules are followed or Invalid Password otherwise.
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password. \nA password must have at least ten characters.\nA password consists of only letters and digits.\nA password must contain at least three digits.   ");
        String password = input.next();
        checkPass(password);
    }

    public static void checkPass(String password){
        boolean flag = true;
        if(password.length()< 10) {
            System.out.println("Invalid password");
            return;
        }else if(!lettersAndDigitsOnly(password)){
            System.out.println("Invalid Password");
            return;
        }else if(!threeDigits(password)){
            System.out.println("Invalid Password");
            return;
        }else{
            System.out.println("Valid password");
            return;
        }
    }
    public static boolean lettersAndDigitsOnly(String password){
        //state the ascii ranges that are valid for letters and digits. If out of that range then there are not only letters and
        // digits in the password therefor making it an invalid password

        for(int i =0; i < password.length(); i++){
            if(!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i)))
                return false;

        }
        return true;
    }

    public static boolean threeDigits(String password){
        //Check the password string for inclusion of 3 digits
        int digits =0;
        for(int i = 0; i< password.length(); i++){
            if( (48 <= password.charAt(i)) && (password.charAt(i)<=57) )
                digits++;
        }
        if (digits >= 3)
            return true;
        else
            return false;
    }
}
