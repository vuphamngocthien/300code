import java.util.Scanner;



public class bai1{
    public static void main(String[] args) {
     
        int so;
        
        int[] mang;
        int kq;
        
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so gia tri manng ");
        so = input.nextInt();
        mang = new int[so];

        for(int i= 0;i< mang.length;i++){
            mang[i] = input.nextInt();
; 
        }
        System.out.println("nhap ket qua: " );
        kq = input.nextInt();

     
        input.close();
        
          int saochep = kq;
               for(int i= 0;i< mang.length;i++){
            saochep-= mang[i];
           for(int j= 1;j< mang.length;j++){
            saochep-= mang[j];
            if(saochep ==0 )
            {
                System.out.println("so thu tu 1:  "+i+"so thu tu 2: "+j);
            }
            if(saochep !=0)
            {
                saochep += mang[j];
            }if( saochep !=0 && mang.length - j == 1)
            {

                saochep += mang[i];
            }
           

            
        }


    }
}
}