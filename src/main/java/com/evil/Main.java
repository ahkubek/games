package com.evil;
import java.io.IOException;
import  java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        int a;

            Scanner sc = new Scanner(System.in);

            System.out.println("игра угадай загаданное число ");
            int num = (int) (Math.random() * 100);
            System.out.println("загаданное число" + num);
while (true){
            a = sc.nextInt();

            if (num < a) System.out.println("Бери меньше");

            else if (num > a) {
                System.out.println("Бери оьльше ");

            } else if (a==num){
                System.out.println("*** ПОБЕДА *****");
                break;
            }
        }

    }
}
