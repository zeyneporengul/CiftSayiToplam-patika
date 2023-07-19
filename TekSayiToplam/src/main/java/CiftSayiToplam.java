import java.util.Scanner;
public class CiftSayiToplam {
    public static void main(String[] args) {
        int sum=0, var;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Sayı giriniz: ");
            var = input.nextInt();
            if(var%2==0 && var%4==0){
                sum += var;
            }
        } while(var%2==0);

        System.out.println("Girilen sayılardan çift ve 4'ün katı olanların toplamı: " + sum);
    }
}
