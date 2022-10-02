// Kombinasyon hesabı yapan program.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, nfak = 1, r, rfak = 1, fark, farkfak = 1, sonuc;
        System.out.println("n'in r'li kombinasyonu için n ve r değerlerini giriniz");
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();

        fark = n - r;

        for(int i = 1; i<=n; i++){
            nfak = nfak*i;
        }

        for(int j = 1; j<=r; j++){
            rfak = rfak*j;
        }

        for(int k = 1; k<=fark; k++){
            farkfak = farkfak*k;
        }

        sonuc = nfak / (rfak*farkfak);
        
        System.out.println("n'in r'li kombinsayonu: "+ sonuc);
    }
}