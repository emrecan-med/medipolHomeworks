package ikinciDerecedenDenkleminKokleri;
import java.util.Scanner;
import java.lang.Math;
public class Homeworks {
	/*
 	ax^2 + bx + c = 0

	a b ve c değişkenleri kullanıcıdan girilmesi istenecektir.
	
	Diskrement > ∆=b^2–4ac
	
	ifadesini hesaplamamız gerekir. Diskriminantın değerlerine göre, eğer ∆<0  ise denklemin gerçel sayılarla ifade edilebilecek bir kökü yoktur.
	
	∆=0 ise denklemin, değerleri birbirine eşit olan iki kökü vardır ve bunlar,
	
	x1=x2=–b/(2a)
	şeklinde hesaplanırlar. Bunlara iki kat kök ya da çakışık kök adı verilir.
	
	∆>0  ise de denklemin birbirinden farklı iki gerçel kökü vardır ve bunlar,
	x1=(­b+√∆)/(2a)
	ve
	x2=(–b–√∆)/(2a)
	şeklinde hesaplanırlar.
 */

	public static void main(String[] args) {
		
		double a,b,c,kok,kok2;
		
		Scanner abc = new Scanner(System.in);
		
		System.out.println("Denklemin a değerini giriniz : ");
		a = abc.nextInt();
		System.out.println("Denklemin b değerini giriniz : ");
		b = abc.nextInt();
		System.out.println("Denklemin c değerini giriniz : ");
		c = abc.nextInt();
		
		double diskriminant=(b*b) - (4*a*c);
		
		if(diskriminant<0)
		{
			System.out.println("Bu denklemin gerçel sayılarla ifade edilebilecek bir kökü yoktur.");
		}
		if(diskriminant==0)
		{
			System.out.println("Bu denklemde birbirine eşit iki kök vardır.");
			kok= (-1*b)/(2*a);
			System.out.printf("x1 ve x2 köklerinin değeri : "+kok);
		}
		if(diskriminant>0)
		{
			System.out.println("Bu denklemde birbirinden farklı iki gerçel kök vardır.");
			kok=( (-1*b) - Math.sqrt(diskriminant) )/(2*a);
			kok2=((-1*b) + Math.sqrt(diskriminant) )/(2*a);
			System.out.printf("x1 kökünün değeri : %f Ve x2 kökünün değeri : %f ",kok,kok2);
		}

	}

}
