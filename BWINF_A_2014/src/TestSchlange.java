import java.util.Scanner;
import java.lang.Math;

public class TestSchlange {

    public TestSchlange() {}

    public static void main(String args[]) {

        System.out.println("Warteschlange 1, 2 oder 3?");
        Schlange s1 = new Schlange();
        Schlange bahn1 = new Schlange();
        Schlange bahn2 = new Schlange();
        Schlange bahn3 = new Schlange();
        Schlange wartebahn = new Schlange();


        Scanner in = new Scanner(System.in);

        //region Warteschlangen + Auswahl
        int s = in.nextInt();


        switch (s) {
            case 1: {


                wartebahn.append(6.96);
                wartebahn.append(5.06);
                wartebahn.append(3.77);
                wartebahn.append(3.95);
                wartebahn.append(3.91);
                wartebahn.append(3.54);
                wartebahn.append(4.26);
                wartebahn.append(4.03);
                wartebahn.append(5.43);
                wartebahn.append(4.04);
                wartebahn.append(4.43);
                wartebahn.append(4.12);
                wartebahn.append(2.78);
            }

            //wartebahn.append(.3);
            case 2: {
                wartebahn.append(4.14);
                wartebahn.append(3.63);
                wartebahn.append(3.92);
                wartebahn.append(7.95);
                wartebahn.append(5.23);
                wartebahn.append(3.30);
                wartebahn.append(4.86);
                wartebahn.append(15.06);
            }

            //wartebahn.append(.3);
            //wartebahn.append(.3);
            case 3: {
                wartebahn.append(5.23);
                wartebahn.append(4.41);
                wartebahn.append(3.33);
                wartebahn.append(13.13);
                wartebahn.append(9.12);
                wartebahn.append(4.38);
                wartebahn.append(6.34);
                wartebahn.append(5.37);
                wartebahn.append(4.11);
                wartebahn.append(3.74);
                wartebahn.append(10.62);
            }
        }
        //endregion

        System.out.println("Hier ist die Schlange");
        System.out.println("Inhalt der Warte-Schlange:" + wartebahn.ausgeben());
        System.out.println("Anzahl der Elemente der Warte-Schlange :" + wartebahn.get_int_laenge());
        
            System.out.println("Länge der Warte-Schlange Gesamt:" + wartebahn.get_belegungs_laenge());
            /*System.out.println("Inhalt der Fähre 1 Schlange:" + bahn1.ausgeben());
            System.out.println("Anzahl der Elemente der Fähre 1 Schlange :" + bahn1.get_int_laenge());
            System.out.println("Länge der Fähre 1 Schlange Gesamt:" + bahn1.get_belegungs_laenge());
            System.out.println("Inhalt der Fähre 2 Schlange:" + bahn2.ausgeben());
            System.out.println("Anzahl der Elemente der Fähre 2 Schlange :" + bahn2.get_int_laenge());
            System.out.println("Länge der Fähre 2 Schlange Gesamt:" + bahn2.get_belegungs_laenge());
            System.out.println("Inhalt der Fähre 3 Schlange:" + bahn3.ausgeben());
            System.out.println("Anzahl der Elemente der Fähre 3 Schlange :" + bahn3.get_int_laenge());
            System.out.println("Länge der Fähre 3 Schlange Gesamt:" + bahn3.get_belegungs_laenge());*/


        boolean running = true;
        System.out.println("Strategie 1, 2, 3 oder 4?");
        s = in.nextInt();
        switch (s) {
            //region Strategie 1
            case 1: {
                try {
                    while (running) {


                        double wartebahnHead = wartebahn.erase_head();
                        if (bahn1.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                            bahn1.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                        } else {
                            if (bahn2.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                                bahn2.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            } else {
                                if (bahn3.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 10 && wartebahnHead > 0) {
                                    bahn3.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                                } else {
                                    if (bahn3.get_belegungs_laenge() + wartebahnHead < 20 && bahn3.get_belegungs_laenge() > 0 && wartebahnHead > 0) {
                                        bahn3.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                                    } else {
                                        System.out.println("Anzahl Autos auf der Fähre:" + (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()));
                                        running = false;
                                        //if (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()== 12) {running=false;}


                                        System.out.println();
                                        System.out.println("Inhalt der Fähre 1 Schlange: " + bahn1.ausgeben());
                                        System.out.println("Anzahl der Elemente der Fähre 1 Schlange: " + bahn1.get_int_laenge());
                                        System.out.println("Länge der Fähre 1 Schlange Gesamt: " + bahn1.get_belegungs_laenge());
                                        System.out.println();
                                        System.out.println("Inhalt der Fähre 2 Schlange: " + bahn2.ausgeben());
                                        System.out.println("Anzahl der Elemente der Fähre 2 Schlange: " + bahn2.get_int_laenge());
                                        System.out.println("Länge der Fähre 2 Schlange Gesamt: " + bahn2.get_belegungs_laenge());
                                        System.out.println();
                                        System.out.println("Inhalt der Fähre 3 Schlange: " + bahn3.ausgeben());
                                        System.out.println("Anzahl der Elemente der Fähre 3 Schlange: " + bahn3.get_int_laenge());
                                        System.out.println("Länge der Fähre 3 Schlange Gesamt: " + bahn3.get_belegungs_laenge());
                                        System.out.println();
                                        System.out.println("Vorderstes Auto der Warteschlange: " + wartebahnHead);
                                        System.out.println("Belegter Platz: " + Math.round((bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);
                                        System.out.println("Unblegeter Platz: " + Math.round((60 - bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);

                                    }
                                }
                            }
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                }
            }
//endregion
            //region Strategie 2
            case 2: {
                try {
                    boolean found;
                    double wartebahnHead = wartebahn.erase_head();
                    while (running) {
                        found = false;


                        if (bahn1.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                            bahn1.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            found = true;
                            wartebahnHead = wartebahn.erase_head();
                        }
                        if (bahn2.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                            bahn2.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            found = true;
                            wartebahnHead = wartebahn.erase_head();
                        }
                        if (bahn3.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 10 && wartebahnHead > 0) {
                            bahn3.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            found = true;
                            wartebahnHead = wartebahn.erase_head();
                        } else {
                            if (bahn3.get_belegungs_laenge() + wartebahnHead < 20 && bahn3.get_belegungs_laenge() > 0 && wartebahnHead > 0) {
                                bahn3.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                                found = true;
                                wartebahnHead = wartebahn.erase_head();
                            }
                        }
                        if (!found) {
                            System.out.println("Anzahl Autos auf der Fähre:" + (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()));
                            running = false;
                            //DBG //if (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()== 12) {running=false;}


                            System.out.println();
                            System.out.println("Inhalt der Fähre 1 Schlange:" + bahn1.ausgeben());
                            System.out.println("Anzahl der Elemente der Fähre 1 Schlange :" + bahn1.get_int_laenge());
                            System.out.println("Länge der Fähre 1 Schlange Gesamt:" + bahn1.get_belegungs_laenge());
                            System.out.println();
                            System.out.println("Inhalt der Fähre 2 Schlange:" + bahn2.ausgeben());
                            System.out.println("Anzahl der Elemente der Fähre 2 Schlange :" + bahn2.get_int_laenge());
                            System.out.println("Länge der Fähre 2 Schlange Gesamt:" + bahn2.get_belegungs_laenge());
                            System.out.println();
                            System.out.println("Inhalt der Fähre 3 Schlange:" + bahn3.ausgeben());
                            System.out.println("Anzahl der Elemente der Fähre 3 Schlange :" + bahn3.get_int_laenge());
                            System.out.println("Länge der Fähre 3 Schlange Gesamt:" + bahn3.get_belegungs_laenge());
                            System.out.println();
                            System.out.println("Vorderstes Auto der Warteschlange:" + wartebahnHead);
                            System.out.println("Belegter Platz: " + Math.round((bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);
                            System.out.println("Unblegeter Platz: " + Math.round((60 - bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                }
            }
//endregion
            //region Strategie 3
            case 3: {
                try {
                    boolean found = false;
                    double wartebahnHead = wartebahn.erase_head();
                    while (running) {
                        found = false;


                        if (bahn1.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                            bahn1.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            found = true;
                            wartebahnHead = wartebahn.erase_head();

                        }
                        if (bahn2.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                            bahn2.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            found = true;
                            wartebahnHead = wartebahn.erase_head();
                        }
                        if (bahn3.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                            bahn3.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            found = true;
                            wartebahnHead = wartebahn.erase_head();
                        } /*else {
                                        if (bahn3.get_belegungs_laenge() + wartebahnHead < 20 && bahn3.get_belegungs_laenge() > 0 && wartebahnHead > 0) {
                                            bahn3.append(wartebahnHead + 0.3);
                                            found = true;
                                            wartebahnHead = wartebahn.erase_head();
                                        }*/
                        if (!found) {
                            System.out.println("Anzahl Autos auf der Fähre:" + (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()));
                            running = false;
                            //DBG //if (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()== 12) {running=false;}


                            System.out.println();
                            System.out.println("Inhalt der Fähre 1 Schlange:" + bahn1.ausgeben());
                            System.out.println("Anzahl der Elemente der Fähre 1 Schlange :" + bahn1.get_int_laenge());
                            System.out.println("Länge der Fähre 1 Schlange Gesamt:" + bahn1.get_belegungs_laenge());
                            System.out.println();
                            System.out.println("Inhalt der Fähre 2 Schlange:" + bahn2.ausgeben());
                            System.out.println("Anzahl der Elemente der Fähre 2 Schlange :" + bahn2.get_int_laenge());
                            System.out.println("Länge der Fähre 2 Schlange Gesamt:" + bahn2.get_belegungs_laenge());
                            System.out.println();
                            System.out.println("Inhalt der Fähre 3 Schlange:" + bahn3.ausgeben());
                            System.out.println("Anzahl der Elemente der Fähre 3 Schlange :" + bahn3.get_int_laenge());
                            System.out.println("Länge der Fähre 3 Schlange Gesamt:" + bahn3.get_belegungs_laenge());
                            System.out.println();
                            System.out.println("Vorderstes Auto der Warteschlange:" + wartebahnHead);
                            System.out.println("Belegter Platz: " + Math.round((bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);
                            System.out.println("Unblegeter Platz: " + Math.round((60 - bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);

                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                }
            }
//endregion
            //region Strategie 4
            case 4: {
                try {
                    while (running) {


                        double wartebahnHead = wartebahn.erase_head();
                        if (bahn1.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                            bahn1.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                        } else {
                            if (bahn2.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                                bahn2.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                            } else {
                                if (bahn3.get_belegungs_laenge() + wartebahnHead < 20 && wartebahnHead > 0) {
                                    bahn3.append(Math.round(((wartebahnHead + 0.3)*100)/100));
                                } else {
                                    System.out.println("Anzahl Autos auf der Fähre:" + (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()));
                                    running = false;
                                    //if (bahn1.get_int_laenge() + bahn2.get_int_laenge() + bahn3.get_int_laenge()== 12) {running=false;}


                                    System.out.println();
                                    System.out.println("Inhalt der Fähre 1 Schlange:" + bahn1.ausgeben());
                                    System.out.println("Anzahl der Elemente der Fähre 1 Schlange :" + bahn1.get_int_laenge());
                                    System.out.println("Länge der Fähre 1 Schlange Gesamt:" + bahn1.get_belegungs_laenge());
                                    System.out.println();
                                    System.out.println("Inhalt der Fähre 2 Schlange:" + bahn2.ausgeben());
                                    System.out.println("Anzahl der Elemente der Fähre 2 Schlange :" + bahn2.get_int_laenge());
                                    System.out.println("Länge der Fähre 2 Schlange Gesamt:" + bahn2.get_belegungs_laenge());
                                    System.out.println();
                                    System.out.println("Inhalt der Fähre 3 Schlange:" + bahn3.ausgeben());
                                    System.out.println("Anzahl der Elemente der Fähre 3 Schlange :" + bahn3.get_int_laenge());
                                    System.out.println("Länge der Fähre 3 Schlange Gesamt:" + bahn3.get_belegungs_laenge());
                                    System.out.println("Vorderstes Auto der Warteschlange:" + wartebahnHead);
                                    System.out.println();
                                    System.out.println("Gesamtlänge aller autos:" + (bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge()) );
                                    System.out.println("Belegter Platz: " + Math.round((bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);
                                    System.out.println("Unblegeter Platz: " + Math.round((60 - bahn1.get_belegungs_laenge() + bahn2.get_belegungs_laenge() + bahn3.get_belegungs_laenge())*100)/100);

                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                }

            }
//endregion
        }
    }

}



