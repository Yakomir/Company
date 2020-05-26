public class Employee
{
    // прописываем поля обьекта
    String fio;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    // создаём конструктор обьектов "сотрудник"
    public Employee (String fio, String position, String email, String phone, int salary, int age)
    {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // создаём геттер для переменной "возраст"
    public int getAge()
    {
        return age;
    }

    // создаём форму вывода данных по сотрудникам
    public void printInfo()
    {
        System.out.println("fio: " + fio + " position: " + position + " email: " + email + " salary: " + salary + " age: " + age);
    }

}
