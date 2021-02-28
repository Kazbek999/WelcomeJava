package Lesson1;

public class HW1 {
    public static void main (String[] args) {
        int a = 2;
        int b = 3;
        float c = 8;
        int d = 4;
        int a1 = 9;
        int b1 = 10;

        System.out.println("result1 = " + Method1(a, b, c, d));
        System.out.println("result2 = " + Method2(a1, b1));
        Method3(-8);
        Method4("GeekBrains");
        Method5(100);

    }
    //1) Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    // где a, b, c, d – целочисленные входные параметры этого метода;
    public static float Method1(int a, int b, float c, int d) {
        return a * (b + (c / d));
    }

    //2) Написать метод, принимающий на вход два целых числа,
    // и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false
    public static boolean Method2(int a1, int b1) {

        int s = a1 + b1;
        if (s > 10 && s < 20) return true;
        else return false;
        }

    //3) Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное
    // ли число передали, или отрицательное. Замечание: ноль считаем положительным числом.
    // Результат работы метода вывести в консоль
    static void Method3(int a3) {
        if (a3 >= 0) System.out.println("result3:" + a3 + "положительное");
        else System.out.println("result3: " + a3 + " отрицательное");}

        //4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
        static void Method4(String a4) {
        System.out.println("result4: " + "Привет, " + a4 + "!");
        }

        //5)*Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным,
    // кроме каждого 100-го, при этом каждый 400-й – високосный.
    // Для проверки работы вывести результаты работы метода в консоль
        static void Method5(int year) {
            if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
                System.out.println("result 5: " + year + " год високосный");
            else System.out.println("result 5: " + year + " год не високосный");}
}

