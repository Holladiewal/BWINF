package com.BWINF2014.Buffet;

import java.util.Scanner;

public class Main {
    static int Silben = 16;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int PersonLetzteSilbe;
        int Personen;
        int Person = 1;
        int Runde = 0;
        System.out.println("Bitte Anzahl der Personen eingeben");
        int PersonenStart = s.nextInt();
        Personen = PersonenStart;
        boolean GeburtstagsKindRaus = false;

        while(!GeburtstagsKindRaus) {
            Person = Person + (Silben - 1);
            Runde++;
            if (Person > Personen) {
                Person = Person - Personen;

            }
            if (Person == 1) {GeburtstagsKindRaus = true;}

            Personen--;
            if (Personen <= 1) break;



        }
        System.out.println("Das Geburtstagskind konnte nach Durchlauf " + Runde + " den Kreis verlaassen und seinen Hunger stillen.\nEs hat immer nur eine Silbe gesprochen." );
        System.out.println("Als das Geburtstagskind Den Kreis verlassen hat, waren noch " + Personen + " Personen im Kreis.");

        GeburtstagsKindRaus = false;
        Personen = PersonenStart + 1;
        Runde = 0;

        while(!GeburtstagsKindRaus) {
            Person = Person + (Silben - 1);
            Runde++;
            if (Person > (Personen - 1)) {
                Person = Person - (Personen - 1);

            }
            if ((Person == 1) || (Person == 2)) {GeburtstagsKindRaus = true;}

            Personen--;
            if ((Personen - 1) <= 1) break;



        }
        System.out.println("\nHätte das Geburtstagskind immer zwei Silben gesprochen, hääte es  nach Durchlauf " + Runde + " den Kreis verlaassen und seinen Hunger stillen können." );
        System.out.println("Als das Geburtstagskind den Kreis verlassen hätte, wären noch " + Personen + " Personen im Kreis gewesen.");


        }
    }

