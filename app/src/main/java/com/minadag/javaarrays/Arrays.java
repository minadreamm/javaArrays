package com.minadag.javaarrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args){

        // Arrays --> dizi elamanlarini tanimlayip index numarasi ile bulabiliriz
        String[] myStringArray = new String[3];
        myStringArray[0] = "Mina";
        myStringArray[1] = "Alp";
        myStringArray[2] = "Pears";

        System.out.println(myStringArray[2]);

        // tek bir dizi de tanimlama
        int[] myNumberArray = {1,2,3,4,5,6};

        System.out.println(myNumberArray[3]);

        // List --> element sayisi belirtmeden dizi listesi olusturmak

        ArrayList<String> myGames = new ArrayList<>();

        myGames.add("gta");
        myGames.add("cs");
        myGames.add(1,"nfs"); // index belirterek istenilen indexte bulunur

        System.out.println(myGames.get(1));

        // Set --> boyut belirtir, ayni elemani tekrarlamaz

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("kenny");
        mySet.add("kenny");

        System.out.println(mySet.size());

        // Map --> anahtar- kilit uyumu, verilen degerin kasiligini gösterir

        HashMap<String , Integer> myMap = new HashMap<>();

        myMap.put("apple", 5);
        myMap.put("sugar", 10);

        System.out.println(myMap.get("apple"));

    }
}
