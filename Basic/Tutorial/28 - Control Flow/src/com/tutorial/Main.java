package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int a = 0;

        while(true){
            a++;

            if (a == 10){
                break; // memaksa keluar dari loop
            } else if (a == 5) {
                continue; // memaksa mulai aksi dari awal
            } else if (a == 7) {
                return; // memaksa keluar dari method "main"
            }

            System.out.println("looping ke - " + a);
        }

        System.out.println("akhir dari looping");

    }
}
