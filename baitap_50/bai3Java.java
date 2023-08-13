package baitap_50;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bai3Java {
    public static void main(String[] args) {
    
    Date date = new Date();
    
    String s;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    s = format.format(date);

    System.out.println(s);
     
   
    
    }
    
}
