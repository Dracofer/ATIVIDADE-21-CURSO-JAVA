import java.util.Scanner;
import java.util.Locale;

public class Main {
  public static void main(String[] args) {  
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    for(int i=0 ; i!=n ; i=i+1){
    double v1 = sc.nextDouble();
    double v2 = sc.nextDouble();    
    double med=(v1 / v2);
    if(v2 == 0){
         System.out.println("divisão impossivel");
    }else{
        System.out.printf("%.1f%n", med);
    }
    }
    sc.close();
  }
}
