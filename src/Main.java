import java.util.Scanner;

/**
 * Created by Murik on 01.05.2015.
 */
public class Main {
    public static void main(String[] args) {
        AddressBook book1 = new AddressBook();
        Scanner s = new Scanner(System.in);
        int id;
        while (true){
            System.out.println(
                    "1. Добавление записи (дополнительно запрашивается имя, телефон и e-mail)\n" +
                    "2. Поиск записей (дополнительно запрашиватеся имя для поиска)\n" +
                    "3. Вывод всех записей\n" +
                    "4. Удаление записи (дополнительно запрашивается индекс записи для удаления)\n" +
                    "5. Изменение записи (дополнительно запрашивается индекс изменяемой записи, новые имя, телефон и e-mail)\n" +
                    "6. Выход из программы");
            // поиск печать выход
            int command = s.nextInt();
            switch (command){
                case 1 :// добавление новой записи
                    System.out.println("Ввведите имя");
                    String name = s.next();// чтение с клавиатуры и запись в переемнную name
                    System.out.println("Ввведите телефон");
                    String phone = s.next();// чтение с клавиатуры и запись в переемнную phone
                    System.out.println("Ввведите почтовый адрес");
                    String mail = s.next();// чтение с клавиатуры и запись в переемнную mail
                    Address NextStudent = new Address(name,phone,mail);
                    book1.add(NextStudent);
                    break;
                case 2:// поиск записи по символам введенным с клавиатуры
                    System.out.println("Введите слово для поиска");
                    name = s.next();
                    AddressBook.find();




                    break;
                case 3:// вывод всех известных записей
                    book1.printAll();
                    break;
                case 4:// удаление записи
                    System.out.print("Введите индекс удаляемой записи: ");
                    id = s.nextInt();
                    AddressBook.delete(s);

                    break;
                case 5:

                    break;
                case 6:
                    return;// выход из цикла
                case 7:// тротестировать прогармму
                    System.out.println(Address.class);
                    break;
                default:// если ввели неверное число выводится это сообщение
                    System.out.println("Ошибка\n"+"Введите число от 1 до 6");
                    break;
            }


        }






    }
}
