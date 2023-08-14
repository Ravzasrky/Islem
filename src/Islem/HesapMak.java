package Islem;
import java.util.Scanner;

public class HesapMak {

	public static void main(String[] args) {
		
		char islem;
		double sonuc;
		
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("1.sayıyı giriniz:");
		double sayi1= scan.nextDouble();
		
		System.out.println("2.sayıyı giriniz:");
		double sayi2= scan.nextDouble();
		
		System.out.println("+ (toplama)");
		System.out.println("- (çıkarma)");		
		System.out.println("* (çarpma)");
		System.out.println("/ (bölme)");
		
		System.out.println("Yapılacak işlemi giriniz:");
		islem= scan.next().charAt(0);
		
		switch(islem) {
		case '+' :
			sonuc= sayi1+ sayi2;
			System.out.println("Toplam:" + sonuc);
			break;
		case '-':
			sonuc = sayi1- sayi2;
			System.out.println("Çıkartma:"+ sonuc);
			break;
		case '*':
			sonuc= sayi1*sayi2;
			System.out.println("Çarpma:"+ sonuc);
			break;
		case '/':
		    sonuc= sayi1/sayi2;
		    System.out.println("Bölme:"+ sonuc);
		    break;
		default:
			System.out.println("+, -, * veya / işlemlerinden birini seçiniz.");
		}
		
	}

}
