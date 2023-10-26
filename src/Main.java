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
        System.out.println("На каждого ученика рассчитано "+paperNumber+" листов бумаги");
        //Задача 4
        int performance1min = 16/2;
        int performance20 = performance1min*20;
        int performance24h = performance1min*24*60;
        int performance3day = performance1min*60*24*3;
        int performance1month = performance1min*60*24*30;
        System.out.println("За 20 минут машина произвела "+performance20+" штук бутылок");
        System.out.println("За сутки машина произвела "+performance24h+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+performance3day+" штук бутылок");
        System.out.println("За 1 месяц машина произвела "+performance1month+" штук бутылок");
        //Задача 5
    }
}