public class Main {
    public static void main(String[] args) {
        //Задание №1
        //Написать программу, в которой можно работать с Ф.И.О. сотрудников.
        System.out.println("Задание 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName +middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        //Задание 2
        //Привести вывод к верхнему регистру
        System.out.println("Задание 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задание 3
        //Написать программу, которая заменяет символ “ё” на символ “е”.
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
}