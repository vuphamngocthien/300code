import java.util.Scanner;

public class bai4 {
    static public void sosanh(int so,int[] mang1, int ketqua,int soi )
    {
        int sosanh;
        
        for(int i= soi;i<mang1.length;i++)
        {
           
          sosanh =  so - mang1[i];
               
          if(sosanh == ketqua)
          {
            int ngay1 = soi +1;
            int ngay2= i +1;

            System.out.println("ngay 1: "+ ngay1 +"  ngay 2: "+ ngay2);
            break;
          }else if(i == mang1.length)
          {
           
            sosanh(mang1[soi],mang1,ketqua,soi+=1);
          }
          
        }
    }

    public static void main(String[] args) {
        int[] mang1 = {7,1,5,2,6,4};
        int so = mang1[0];
        int ketqua;
        int kqn;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap ket qua");
        ketqua = input.nextInt();
         kqn = ketqua;
        sosanh(so, mang1, kqn, 1);



    }

}
