import java.util.Scanner;

public class GradeAssign {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        int students =0;
        double [] scores;

        System.out.println("Num of students: ");
        students = input.nextInt();
        scores = new double [students];
        System.out.println("Enter scores: ");
        for(int i = 0; i < scores.length; i++ ){
            scores[i] = input.nextDouble();
        }

        //below can be its own method with the parameter being the array
        double best = 0;
        for(int i = 0; i < scores.length; i++){

            if(scores[i] > best){
                best = scores[i];
            }
        }
        System.out.println(best);

        for(int i =0; i< scores.length; i++){

            if (scores[i] < best-20)
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is F");
            else if (scores[i] >= best-20  && scores[i]  < best-15)
                    System.out.println("Student: "+i+" scored "+scores[i]+" and grade is D");
            else if (scores[i] >= best-15 && scores[i]  < best-10)
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is C");
            else if (scores[i] >= best-10  && scores[i]  < best-5)
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is B");
            else if (scores[i] >= best-5 )
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is A");
        }


    }
}
