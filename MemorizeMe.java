import java.util.Scanner;

public class MemorizeMe {
	 static Scanner sc=new Scanner(System.in);
     int count(int arr[],int n,int Bi){
         int res=0;
         for(int i=0;i<n;i++){
             if(Bi==arr[i]){
                 res++;
             }
         }
         return res;
     }
     void memoryGame(int arr[],int n,int q) {
    	 MemorizeMe mm=new MemorizeMe();
    	 while(q!=0){
    		 int Bi=0;
             System.out.println("Enter test case");
             Bi=sc.nextInt();
             int res=0;  
             for(int i=0;i<n;i++) {  
             	res = mm.count(arr,n,Bi);
             }
             if(res>0) {
             	 System.out.println(res);
             }
             else{
                 System.out.println("Not Present");
                 break;
            }
          q--;
         }  
     }
    public static void main(String[] args) {
    	
        MemorizeMe mm=new MemorizeMe();
        int n,q;
        System.out.println("Enter total numbers");
        n=sc.nextInt();
        
        int[] arr=new int[n];
        System.out.println("Enter numbers");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter No of test cases");
        q=sc.nextInt();
        
        mm.memoryGame(arr, n, q);
    }
}
