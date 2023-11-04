
package com.company;
import java.util.Scanner;
public class Main {
    static int toplama(int a, int b){
        int result;
        result=a+b;
        System.out.println("Toplama İşleminin Sonucu:"+result);
        return  result;
    }
    static int cıkarma(int a, int b){
        int result;
        result=a-b;
        System.out.println("Çıkarma İşlemenin Sonucu:"+result);
        return result;
    }
    static  int  carpma(int a, int b)
    {
        int result;
        result=a*b;
        System.out.println("Çarpma İşleminin Sonucu:"+result);
        return result;
    }
    static  int bolme(int a, int b){
        int result;
        if(b==0){
            System.out.println("Lütfen İkinci Sayıyı sıfırdan büyük giriniz!!!");
            return 0;
        }
        result=a/b;
        System.out.println("Bölme İşleminin Sonucu"+result);
        return result;
    }
    static int Power(int a, int b){
        int result=1;
        int i=1;
        while (i<=b){
            i++;
            result*=a;
        }
        System.out.println("Üs hesaplama Sonucu: "+ result);
        return result;

    }
    static int factor(int a, int b){
        int result=1;
        int j=1;
        while (j<=a){
            result*=j;
            j++;
        }
        System.out.println("Faktöriyel:"+result);
        return result;
    }
    static int mod(int a, int b){
        int result;
        result=a % b;
        System.out.println("Sonuç:"+ result);
        return result;
    }
    static void calc(int a, int b){
        System.out.println("Çevresi:"+(2*(a+b)));
        System.out.println("Alanı:"+ a*b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;


        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        while (true) {

                System.out.println(menu);
                System.out.println("Lütfen Yapmak İstediğiniz Bir İşlemi Seçiniz:");
                select = scan.nextInt();
                if (select == 0) {
                    break;
                }
                int a = 0, b = 0;
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                a = scan.nextInt();
                System.out.println("Lütfen İkinci Sayıyı Giriniz:");
                b = scan.nextInt();

                switch (select) {
                    case 1:
                        toplama(a, b);
                        break;
                    case 2:
                        cıkarma(a, b);
                        break;
                    case 3:
                        carpma(a, b);
                        break;
                    case 4:
                        bolme(a, b);
                        break;
                    case 5:
                        Power(a, b);
                        break;
                    case 6:
                        factor(a, b);
                        break;
                    case 7:
                        mod(a, b);
                        break;
                    case 8:
                        calc(a, b);
                        break;
                    default:
                        System.out.println("Lütfen Geçerli Bir Değer Giriniz:");
                }

            }
            System.out.println("Güle Güle");


        }

    }
