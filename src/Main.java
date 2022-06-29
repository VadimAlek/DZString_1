public class Main {
    public static void main(String[] args) {

        //task1
        //Напишите четыре строки:
        //
        //первая с именем firstName — для хранения имени;
        //
        //вторая с именем middleName — для хранения отчества;
        //
        //третья с именем lastName — для хранения фамилии;
        //
        //четвертая с именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        //
        //Выведите в консоль фразу: “ФИО сотрудника — ….”
        //
        //В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //task2
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с  “Ivanov Ivan Ivanovich” на полностью заглавные
        // буквы.
        //
        //В качестве строки с исходными данными используйте строку fullName.
        //
        //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        firstName = firstName.replace("Ivan", "IVAN");
        middleName = middleName.replace("Ivanovich", "IVANOVICH");
        lastName = lastName.replace("Ivanov", "IVANOV");
        System.out.println("Дфнные ФИО сотрудника для заполнения отчета - "+ lastName +" " +firstName+ " " +middleName);

        //task3
        //Система, в которой мы работаем, не принимает символ “ё”.
        //
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - "+ fullName1);
    }
}