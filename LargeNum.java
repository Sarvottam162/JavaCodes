public class LargeNum {
    
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
            for(int i =0; i<numbers.length; i++){

                if(numbers[i]>largest){
                    largest=numbers[i];
                }
                if (numbers[i]<smallest){
                    smallest=numbers[i];
                }
            }
    System.out.println("smallest number = "+smallest);
   return largest;
    }
    public static void main(String args[]) {
       int numbers[]={2,4,6,8,50};
       int Maximumvalue=getLargest(numbers);
        System.out.println("the maximum value present in the given array is :"+Maximumvalue);
    }
}
