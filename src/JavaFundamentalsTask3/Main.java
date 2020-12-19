package JavaFundamentalsTask3;

import java.lang.reflect.Array;
import java.util.Scanner;

//  Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class Main {

    public static void main(String[] args) {
        // сделаем с воодом через консоль
        // и сделаем с переменными с присвоением
        System.out.println("Введите 5-ть целых чисел");
        Scanner inputDigits=new Scanner(System.in);

        int[] arrayOfDigits=new int[5];

            for (int i=0; i<arrayOfDigits.length;i++){
                arrayOfDigits[i]=inputDigits.nextInt();
            }
            //вывод с переходом сделан через нечетность
            for (int j=0;j<arrayOfDigits.length;j++) {
                int x=arrayOfDigits[j];
                if(x % 2 == 0 || x==0){
                    System.out.println(arrayOfDigits[j]);}
                else {System.out.print(arrayOfDigits[j] +"  ");}
            }
            }
        }



