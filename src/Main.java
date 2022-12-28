import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int min=0, max=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz ? : ");
        int k = input.nextInt();
        System.out.println("------------------------");
        if(k > 0) {
            for (int i = 1; i <= k; i++) {
                System.out.print(i + ". Sayıyı Giriniz: ");
                int sayi = input.nextInt();

                if(i == 1){
                    min = sayi;
                    max = sayi;
                }else {
                    if (min > sayi){
                        min = sayi;
                    }
                    if (max < sayi){
                        max = sayi;
                    }
                }
            }
        }
        System.out.println("------------------------");
        System.out.println("En büyük sayı :" + max);
        System.out.println("En büyük sayı : "+ min);

    }
}