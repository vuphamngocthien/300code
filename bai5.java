import java.util.Scanner;

public class bai5 {
  
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String s;
         String sl;
         int kt = 0;
         String regex= "/[^a-z0-9]/g";
         System.out.println("nhap chuoi gia tri");
            s = input.nextLine();
        sl = s.trim().toLowerCase().replace(regex, "");
        
        for(int i = 0; i< sl.length();i++)
        {
            if(sl.charAt(i) != sl.charAt(sl.length() - 1 -i) )
            {
               
                kt = 1;
                break;
            }
            
        }
        if(kt == 1 )
        {
             System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}
