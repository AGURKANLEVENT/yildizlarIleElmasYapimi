import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner elmas=new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz : ");
        int ustkisim=elmas.nextInt();
        int altkisim=(int)(ustkisim/2)+1;

        for(int i=1;i<=altkisim;i++)
        {
            for(int j=1;j<=altkisim-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }

        for(int i=altkisim-1;i>=1;i--) {
            for (int j = 1; j <= altkisim - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
