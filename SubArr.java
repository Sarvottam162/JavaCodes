public class SubArr {
    public static void Printsubarray(int numbers[]){
        int totalsubarr=0;
        for (int i = 0; i < numbers.length; i++) {   // start
            for(int j=i; j<numbers.length; j++){     // end
                int sum = 0;
                for(int k = i; k<=j; k++){   //print sub array
                    System.out.print(numbers[k]+"  ");
                    sum=numbers[k]+sum;
                }
                totalsubarr++;
                System.out.println();
                System.out.println("sum of these sub Array is : "+ sum);
            }
            System.out.println();
        }
        System.out.println("Number of total sub array is : "+ totalsubarr);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Printsubarray(numbers);
    }
}
