package main;

import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1;
        s1=Singleton.returnareInstanta();
        Singleton s2;
        s2=Singleton.returnareInstanta();

        System.out.println(s1);
        System.out.println(s2);

    }
}
