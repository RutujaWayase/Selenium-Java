package CodingQuestions;

public class MissingNumberInArray {
    public static void main(String[] args) {
        //Arrays should not have duplicates
        //Arrays no need to be sorted order
        //Values should be in range

        int a[] = {1, 2, 4, 5};
        //1+2+4+5=12 sum1
        //1+2+3+4+5=15 sum2
        //sum2-sum1=15-12=3 missing

        int sum1=0;
        for(int i=0; i<a.length; i++){
            sum1=sum1+a[i];
        }
        System.err.println("Sum of elements in array:"+sum1);
        int sum2=0;
        for (int i = 1; i <= 10; i++) {
            sum2=sum2+i;
        }
        System.out.println("Sum of range of elements in array: "+sum2);
        System.out.println("Missing number is: "+(sum2-sum1));

    }
    
}
