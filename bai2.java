import java.util.Scanner;



public class bai2{
    /**
     * @param args
     */
    public static void main(String[] args) {
     
        String chuoi;
        
       
        
        Scanner input = new Scanner(System.in);
        System.out.println("nhap chuoi gia tri ");
        chuoi = input.nextLine();
        
        char[] arr = chuoi.toCharArray();
        
        for(int i = 0; i< arr.length;i++)
        {
            if(arr.length %2 != 0){
                System.out.println("false");
            }
           if(arr[i] == '{' && arr[i] == '}')
           {
                
           }
             if(arr[i] == '[' && arr[i] == ']')
           {
                
           }
             if(arr[i] == '(' && arr[i] == ')')
           {
                
           }
        }


    }
}
