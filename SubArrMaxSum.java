public class SubArrMaxSum{
    public static void Printsubarray(int numbers[]){
        int MaxSum =  Integer.MIN_VALUE;
        int currSum=0;
        for (int i = 0; i < numbers.length; i++) {   // start
            for(int j=i; j<numbers.length; j++){     // end
                 currSum=0;
                for(int k = i; k<=j; k++){   //print sub array
                    currSum=currSum+numbers[k];
                }
                System.out.println(currSum);
                if (MaxSum<currSum) {
                    MaxSum=currSum;   
                }  
            }
        }
        System.out.println();
        System.out.println("max Sum is : "+ MaxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        Printsubarray(numbers);
    }
}
