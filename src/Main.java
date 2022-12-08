import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

/*### Вводные данные для базовых задач

        Представим, что вы работаете в небольшой компании, и к вам часто обращаются коллеги из других отделов, чтобы вы помогли им настроить их работу.

        И вот к вам приходят коллеги из бухгалтерии и просят помощи с  корпоративной бухгалтерской книгой.

                Каждый день месяца, включая выходные, компания тратит средства — некую сумму, причем в бухгалтерской книге хранится сумма затрат по дням (а не каждая сумма отдельно). То есть в книге 30 записей разных сумм. Эти суммы разнятся от 100 000 до 200 000.

        Ваш коллега по отделу написал код, который генерирует массив из 30 случайных чисел, и предложил прежде, чем писать программу для настоящей бухгалтерской книги, проверить всё на случайных числах от 100 000 до 200 000.

        Для получения массива случайных чисел достаточно объявить массив и вызвать указанный ранее метод. Метод инициализирует ваш массив и заполнит его случайными значениями от 100_000 до 200_000.

 */

        /*
        * ### Задание 1

    Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.

    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат

    в формате: «Сумма трат за месяц составила … рублей».

        * */

        /*
        int[] arrayT = new int[] {2,3,4,6,7,9,0,2,5,7,8,0};
        for (int number : arrayT) { // number - это не счетчик, это переменная с каждым элементом массива
            number *= 2; // каждый элемент массива удваиваем
            System.out.println(number);
        }
        */
        // System.out.println(Arrays.tpString(arrayT).replace(target: "[",replacement: "" ).replace (target: "]", replacement: ""));

        int[] array = arrayRandom(30);
        // Выведем получившийся массив

        System.out.println(Arrays.toString(array));


        /* Задание 1. Найдем сумму расходов */
        int sum = 0;
        for ( int number : array) {
            sum += number;
        }
        System.out.println( "Задание 1.Сумма трат за месяц составила " + sum + "… рублей");
        /*
        ### Задание 2

        Следующая задача — найти минимальную и максимальную трату за день.

        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат

        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        * */

        /* Найдем max и min расход 1 способ */

        Arrays.sort(array); /* сортируем по возрастанию */

        System.out.printf("Задание 2. Метод 1. Минимальный расход в течении месяца = %d, максимальный расход = %d \n ", array[0],array[array.length-1]);


        /* Найдем max и min расход 2 способ */

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
            if (array[i]>max) {
                max = array[i];
            }
        }
        System.out.printf("Задание 2. Метод 2. Минимальный расход в течении месяца = %d, максимальный расход = %d \n ", min,max);
        // Задание 3.
        System.out.printf("Средний расход за месяц составил: %.2f \n", (double) sum/array.length) ;

        /* Вывести Иван Иванович Иванов в обратном порядке */

        String string = "Иван Иванович Иванов";
        char[] stringToChar = string.toCharArray();
        System.out.println(Arrays.toString(stringToChar));
        for (int i = stringToChar.length - 1 ; i >= 0 ; i-- ) {
            System.out.print(stringToChar[i]);
        }

        /* двухмерные массивы */
        int[][] array2 = new int[10][15];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                array2[i][j] = random.nextInt(1000);
            }
            System.out.println(Arrays.toString(array2[i]));
        }


    }
    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i=0; i< length; i++ ) {
            array[i] = random.nextInt( 100_000) + 100_000;
        }
        return array;
    }

}
