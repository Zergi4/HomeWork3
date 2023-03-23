public class Main {
    public static void main(String[] args) {

        byte a = 1;
        short b = 128;
        int c = 33333;
        long d = 111;
        float e = 3.14f;
        double f = 3.33333333;
        System.out.println(" Задача 1");
        System.out.println("Значение переменной a c типом byte равно " + a);
        System.out.println("Значение переменной b c типом short равно " + b);
        System.out.println("Значение переменной c c типом int равно " + c);
        System.out.println("Значение переменной d c типом long равно " + d);
        System.out.println("Значение переменной e c типом float равно " + e);
        System.out.println("Значение переменной f c типом double равно " + f); // задача1
        System.out.println(" Задача 2");
        float a2 = 27.12f;
        long b2 = 987678965549L;
        double c2 = 2.786;
        int d2 = 569;
        short e2 = -159;
        short f2 = 27897;
        byte g2 = 67; //задача 2
        System.out.println(" Задача 3");
        byte studentLp = 23;
        byte studentAs = 27;
        byte studentEa = 30;
        float summListov = 480;
        float listovNaodnogo = summListov / (studentLp+studentEa+studentAs);
        System.out.println("На каждого ученика рассчитано " + listovNaodnogo + " листов бумаги"); //задача3
        System.out.println(" Задача 4");
        byte efficiencyMachine = 8;
        int bottles1 = 20 * efficiencyMachine;
        int bottles2 = 24 * 60 * efficiencyMachine;
        int bottles3 = 3 * 24 * 60 * efficiencyMachine;
        int bottles4 = 30 * 24 * 60 * efficiencyMachine;
        System.out.println(" За 20 минут машина произвела " + bottles1 + " штук бутылок");
        System.out.println(" За сутки машина произвела " + bottles2 + " штук бутылок");
        System.out.println(" За 3 суток машина произвела " + bottles3 + " штук бутылок");
        System.out.println(" За 1 месяц машина произвела " + bottles4 + " штук бутылок");
        System.out.println(" Задача 5");
            byte totalCans = 120;
            byte oneClasswhite = 2;
            byte oneClassbrown = 4;
            float canOneclass = (byte) (oneClasswhite + oneClassbrown);
            float totalClasses = totalCans / canOneclass;
            float totalWhite = totalClasses * oneClasswhite;
            float totalBrown = totalClasses * oneClassbrown;
        System.out.println(" В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски." );
    }
}