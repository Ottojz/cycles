public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("task 1");

        for (byte i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task 2
        System.out.println("task 2");

        for (byte i = 10; i > 0; --i) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task 3
        System.out.println("task 3");

        for (byte i = 0 + 2; i <= 17; i = (byte) (i + 2)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task 4
        System.out.println("task 4");

        for (byte i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task 5
        System.out.println("task 5");

        for (short year = 1904; year <= 2096; year = (short) (year + 4)){
            System.out.println(year + " год является високосным");
        }
        System.out.println();

        //task 6
        System.out.println("task 6");

        for (byte i = 7; i <= 98; i = (byte) (i + 7)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task 7
        System.out.println("task 7");

        for (short i = 1; i <= 512; i = (short) (i * 2)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //task 8
        System.out.println("task 8");

        int invest = 29000;

        for (byte month = 1; month <= 12; month++) {
            int savings = (month * invest);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();
//Можно было переменную savings вынести за пределы цикла, но мне было интересно, будет ли работать так? Работает.

        //task 9
        System.out.println("task 9");

//Переменная invest инициализирована в предыдщем задании, не вижу смысла ее дублировать
        int savings = 0;

        for (byte month = 1; month <= 12; month++) {
            savings = savings + savings/100;
            savings = savings + invest;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }
        System.out.println();

        //task 10
        System.out.println("task 10");

        for (byte i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}
