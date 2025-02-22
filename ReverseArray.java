public class ReverseArray {
    
    public static void Reverse(int Arr[]){
        int first =0;
        int last = Arr.length-1;
        while(first<last){
            //swap
            int temp=Arr[last];
            Arr[last] = Arr[first];
            Arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]) {
        int Arr[]={2,4,6,8,10};
        Reverse(Arr);
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i]+" ");
            
        }
        System.out.println();
    }
}
