import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class bai3{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int so_mang1;
        int so_mang2;
       int so;
       int so2;
        
        List<Integer> mang1 = new ArrayList();
         List<Integer> mang2 = new ArrayList();
           List<Integer> mang3 = new ArrayList();
        
        Scanner input = new Scanner(System.in);
        System.out.println("so phan tu mang 1");
        so_mang1 = input.nextInt();
        if(so_mang1 > 50 || so_mang1 < 0  )
        {
            System.out.println("so phan tu mang chi tu 0 den 50");
        so_mang1 = input.nextInt();
        }
         System.out.println("so phan tu mang 2");
        so_mang2 = input.nextInt();
         if(so_mang2 > 50 || so_mang2 < 0  )
        {
            System.out.println("so phan tu mang chi tu 0 den 50");
            so_mang2 = input.nextInt();
        }
        //nhap phan tu
        System.out.println("nhap phan tu mang 1");
        for(int i=0;i<so_mang1;i++)
        {
            so = input.nextInt();
            mang1.add(so);
        }
            System.out.println("nhap phan tu mang 2");
        for(int i=0;i<so_mang2;i++)
        {
            so = input.nextInt();
            mang2.add(so);
        }

      mang1.addAll(mang2);

      mang1.sort((o1, o2) -> o1 - o2);
               System.out.println(mang1);
    }}