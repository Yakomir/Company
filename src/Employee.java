public class Employee
{
    // поля обьекта
    String fio;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    // конструктор объектов "сотрудник"
    public Employee (String fio, String position, String email, String phone, int salary, int age)
    {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // геттер для переменной "возраст"
    public int getAge()
    {
        return age;
    }

    // форма для вывода данных сотрудников
    public void printInfo()
    {
        System.out.println("fio: " + fio + " position: " + position + " email: " + email + " salary: " + salary + " age: " + age);
    }

}
