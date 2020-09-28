package ua.step.homework;

import javax.crypto.spec.PSource;

/**
 * В массиве хранится n явно заданных текстовых строк.
 * <p>
 * Создать методы:
 * • Возвращает содержимое массива в виде строки через пробел (join)
 * • Возвращает содержимое массива в виде строки через заданный разделитель (перегруженный join)
 * • Сортирующий массив обратном порядке (без учёта регистра) от z до a (sortDesc);
 * • Сортирующий массив по количеству слов в строке (слова разделены пробелами) (sortByWordCount).
 *
 * Примечание: Не использовать методы строк и стандартную сортировку
 */
public class Task02 {
    public static void main(String[] args) {
        /*String[] string = new String[] {"Hello", "Privet", "Good"};
        String str = join(string);
        System.out.println(str);*/

        /*String arr = "z";
        String str = "a";

        if(arr.charAt(0)>str.charAt(0))
        {
            System.out.println(arr);
        }
        else
        {
            System.out.println(str);
        }*/

    }

    /**
     * Соединяет массив строк в одну строку разделенную пробелом
     *
     * @param strings - массив строк
     * @return строка состоящая из элементов массив
     */
    public static String join(String[] strings) {
        String new_str = "";
        for(int i = 0; i<strings.length; i++)
        {
            new_str = new_str + strings[i];
            if(i!=strings.length-1)
            {
                new_str = new_str + " ";
            }
        }
        return new_str;
    }

    /**
     * Соединяет массив строк в одну строку разделенную соединителем glue
     *
     * @param strings - массив строк
     * @param glue    - соединитель
     * @return строка состоящая из элементов массива
     */
    public static String join(String[] strings, String glue) {
        String new_str = "";
        for(int i = 0; i<strings.length; i++)
        {
            new_str = new_str + strings[i];
            if(i!=strings.length-1)
            {
                new_str = new_str + glue;
            }
        }
        return new_str;
    }

    /**
     * Сортирует массив строк в порядке обратном алфавитному
     *
     * @param strings - массив строк для сортировки
     */
    public static void sortDesc(String[] strings) {

        for(int k =0; k< strings.length; k++)
        {
            for(int i = 0; i<strings.length-1; i++)
            {
                if(strings[i].charAt(0)<strings[i+1].charAt(0))
                {
                    String tmp = strings[i+1];
                    strings[i+1] = strings[i];
                    strings[i] = tmp;
                }
            }
        }

    }

    /**
     * Сортирует массив строк по количеству слов в строке
     *
     * @param strings - массив строк для сортировки
     */
    public static void sortByWordCount(String[] strings) {
        for(int k =0; k< strings.length; k++)
        {
            for (int i = 0; i < strings.length - 1; i++)
            {
                int counter = 0;
                for (int j = 0; j < strings[i].length(); j++)
                {
                    if (strings[i].charAt(j) == ' ')
                    {
                        counter++;
                    }
                }

                counter = num(strings, counter, i);

                if (counter == 1)
                {
                    String tmp = strings[i+1];
                    strings[i+1] = strings[i];
                    strings[i] = tmp;
                }
            }
        }
    }

    public static int num(String[] strings, int counter_1, int i)
    {
        int counter_2 = 0;
        for(int j = 0; j<strings[i+1].length(); j++)
        {
            if(strings[i+1].charAt(j) == ' ')
            {
                counter_2++;
            }
        }

        if(counter_1 > counter_2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

}


