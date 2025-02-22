public class LargeNum {
    
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;
     for(int i =0; i<numbers.length; i++){
        if(numbers[i]>largest){
            largest=numbers[i];
        }
     }
   return largest;
    }
    public static void main(String args[]) {
       int numbers[]={2,4,6,8,15};
       
      int Maximumvalue=getLargest(numbers);

        System.out.println("the maximum value present in the given array is :"+Maximumvalue);
    }
}
