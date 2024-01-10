import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = " йцукенгшщзхъфывапролджэячсмитьбю";
    public static void main(String[] args) {
        String test = " Мама мыла раму";
        //Метод .indexOf('') ищет первое вхождение в индекс
        System.out.println(test.indexOf(' '));
        //Метод .lastIndexOf('') ищет самое последнее вхождение
        System.out.println(test.lastIndexOf(' '));
        //Метод .substring(5) отсекает часть индексов, которые идут до введеного числа
        System.out.println(test.substring(5));
        //Методы .indexOf и .lastIndexOf применяются в основном с методом substring.
        //substring(test1.indexOf(' ')) такая конструкция отсекает индексы до первого пробела
        System.out.println(test.substring(test.indexOf(' ')));
        //Также можно вводить к примеру от 0 индекса до 5.
        System.out.println(test.substring(0, 4));
        //Этот способ схож с предыдущим, но он гораздо проще в исполнении
        //К тому же, можно избавиться от лишнего индекса, к примеру от пробела просто сделав +1
        System.out.println(test.substring(test.indexOf(' ')+1, test.lastIndexOf(' ')));
        //.trim() это полезный метод, который удаляют пробелы в начале и в конце.
        //А вот если пробелы по середине, то он ничего не сделает.
        System.out.println(test.trim());


        //Task1 ввод только русских маленьких букв
        //Task2 не больше 2-ух слов
        //Task3 возвращать второе слово

        String input = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                spaceCount++;
            }
            if(!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))) {
                isValid = false;
                break;
            }
        }
        if(isValid && spaceCount == 1) {
            System.out.println(input);
            System.out.println(input.substring(input.indexOf(' ')).trim());
        } else {
            System.out.println("Ввод некорректен!");
        }
    }
}