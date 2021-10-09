import java.util.*;
public class CreditCard {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Input Credit Card number: ");
        long creditCardNum = input.nextLong();
        if(isValid(creditCardNum)) {
            System.out.println("Valid Credit Card Number");
        }else{
            System.out.println("Invalid Credit Card Number");
        }

    }
    //Return true if the card number is valid
    public static boolean isValid(long number) {
        int size = getSize(number);  //Step 0A
        int sumEven, sumOdd;
        if (size >= 13 && size <= 16) {
            if (prefixedMatched(number, 4) || prefixedMatched(number, 5) || prefixedMatched(number, 37) || prefixedMatched(number, 6)) {         //Needs to match a number Step 0B
                sumEven = sumOfDoubleEvenPlace(number); //Step 1
                sumOdd = sumOfOddPlace(number);
                System.out.println("sumeEven: "+sumEven+ " SumOdd: "+ sumOdd);
                int total = sumEven + sumOdd;
                System.out.println("total: "+total);

                if (total % 10 == 0) {
                    return true;
                }else{
                    System.out.println("isValid firstFalse");
                    return false;

                }
            }else{
                System.out.println("isValid secondFalse");
                return false;
            }
        }else{
            System.out.println("isValid thirdFalse");
            return false;
        }

    }

    //Get the result from Step 2
    public static int sumOfDoubleEvenPlace(long number){
        int sum =0;
        String creditCardNum = Long.toString(number);
        for(int i = creditCardNum.length() - 2; i >= 0; i = i-2){
            sum += getDigit((Character.getNumericValue(creditCardNum.charAt(i))));
            System.out.println(getDigit((Character.getNumericValue(creditCardNum.charAt(i)))));
            System.out.println("----------");
        }
        return sum;

    }

    //Return this number if it is a single digit, otherwise,
    //return the sum of the two digits
    public static int getDigit(int number){
        number = number * 2;
        if(number >= 0 && number <= 9){
            return number;
        }else{
            return (number % 10) + (number / 10);
        }

    }

    //Return sum of odd-place digits in number
    public static int sumOfOddPlace(long number){
        int sum =0;
        String creditCardNum = Long.toString(number);
        for(int i = creditCardNum.length() - 1; i >=0 ; i = i-2){
            sum += Character.getNumericValue(creditCardNum.charAt(i));
            System.out.println(Character.getNumericValue(creditCardNum.charAt(i)));
        }
        return sum;

    }

    //return true if the number d is a prefix for number
    public static boolean prefixedMatched(long number, int d){
        String strNumber = Long.toString(number);
        String strD = Integer.toString(d);
        for(int i = 0; i < strD.length(); i++){
            if(strNumber.charAt(i) != strD.charAt(i))
                return false;
        }
        return true;
    }
    //Return the number of digits in d
    public static int getSize(long d){

        int size = Long.toString(d).length();
        return size;

    }
    //Return the first k number of digits from number. If the
    //number of digits in number is less than k, return number
    //Lets have k always equal two just incase the prefix is 37
    //Let's test
    public static long getPrefix(long number, int k){

       String strNumber = Long.toString(number);

       String prefix = "";
       for( int i = 0 ; i < k; i++ ){
           prefix += strNumber.charAt(i);
       }
       Long longPrefix = Long.parseLong(prefix);
       return longPrefix;


    }
}
