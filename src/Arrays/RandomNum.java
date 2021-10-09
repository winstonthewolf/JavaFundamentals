public class RandomNum {

    public static int getRand(int... numbers){

        return numbers[(int)(Math.random() * (numbers.length))];

    }

    public static void main(String []args){

        System.out.println(getRand(1,2,3,4,5,6,7,8,9));
    }

}
