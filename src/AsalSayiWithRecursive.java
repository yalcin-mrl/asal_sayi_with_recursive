import java.util.Scanner;

public class AsalSayiWithRecursive {

    static int asalSayiBul(int num,int i,int count) {
        if(num < 2){
            return 1;
        }
        if(i<1){
            return 1;
        }
        if(num%i == 0){
            count++;

        }

        return count + asalSayiBul(num,i-1,count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int num = sc.nextInt();
        int res = asalSayiBul(num,num,0);
        if(res ==num+2){
            System.out.println(num+" sayısı asaldır.");
        }
        else{
            System.out.println(num+" sayısı asal değildir.");
        }
    }
}
