public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte varByte = -128;
        short varShort = 32677;
        int varInt = - 2147148;
        long varLong = 2148483647L;
        float varFloat = 5.6478f;
        double varDouble = 8.123456789;
        System.out.println("Значение переменной varByte с типом byte равно "+varByte);
        System.out.println("Значение переменной varShort с типом short равно "+varShort);
        System.out.println("Значение переменной varInt с типом int равно "+varInt);
        System.out.println("Значение переменной varLong с типом long равно "+varLong);
        System.out.println("Значение переменной varFloat с типом float равно "+varFloat);
        System.out.println("Значение переменной varDouble с типом double равно "+varDouble);
        //Задача 2
        float f = 27.12f;
        long L = 987678965549L;
        float F = 2.786f;
        short s = 569;
        short S = -159;
        short srt = 27897;
        byte b = 67;
        //Задача 3
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int paperNumber = 480;
        int studentsNumber = LP + AS + EA;
        paperNumber = paperNumber/studentsNumber;
        System.out.println("На каждого ученика рассчитано "+paperNumber+" листов бумаги.");
        //Задача 4
        int performance1min = 16/2;
        int performance20 = performance1min*20;
        int performance24h = performance1min*24*60;
        int performance3day = performance1min*60*24*3;
        int performance1month = performance1min*60*24*30;
        System.out.println("За 20 минут машина произвела "+performance20+" штук бутылок.");
        System.out.println("За сутки машина произвела "+performance24h+" штук бутылок.");
        System.out.println("За 3 дня машина произвела "+performance3day+" штук бутылок.");
        System.out.println("За 1 месяц машина произвела "+performance1month+" штук бутылок.");
        //Задача 5
        int naOdinClass = 4+2;
        int classov = 120/naOdinClass;
        int beloi = classov*2;
        int korichnevoi = classov*4;
        System.out.println("В школе, где "+classov+" классов, нужно "+beloi+" банок белой краски и "+korichnevoi+" банок коричневой краски.");
        //Задача 6
        int bananas = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int vesVsego = bananas + milk + iceCream + eggs;
        System.out.println("Вес спорт-завтрака в граммах: "+vesVsego);
        float vesVKg = vesVsego * 0.001f;
        System.out.println("Вес спорт-завтрака в килограммах: "+vesVKg);
        //Задача 7
        int dneiNaPohudenie250 = 7*1000/250;
        int dneiNaPohudenie500 = 7*1000/500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на похудение потребуется "+dneiNaPohudenie250+" дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на похудение потребуется "+dneiNaPohudenie500+" дней");
        float dneiNaPohudenieVSrednem = (250+500)/2f;
        dneiNaPohudenieVSrednem = 7*1000/dneiNaPohudenieVSrednem;
        System.out.println("В среднем может потребоваться "+dneiNaPohudenieVSrednem+" дней.");
        //Задача 8
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        int Masha10 = Masha/10;
        int newMasha = Masha + Masha10;
        int Denis10 = Denis/10;
        int newDenis = Denis + Denis10;
        int Kristina10 = Kristina/10;
        int newKristina = Kristina + Kristina10;
        int yearMasha = newMasha*12 - Masha*12;
        int yearDenis = newDenis*12 - Denis*12;
        int yearKristina = newKristina*12 - Kristina*12;
        System.out.println("Маша теперь получает "+newMasha+" рублей в месяц; годовой доход вырос на "+yearMasha+" рублей.");
        System.out.println("Денис теперь получает "+newDenis+" рублей в месяц; годовой доход вырос на "+yearDenis+" рублей.");
        System.out.println("Кристина теперь получает "+newKristina+" рублей в месяц; годовой доход вырос на "+yearKristina+" рублей.");
    }
}