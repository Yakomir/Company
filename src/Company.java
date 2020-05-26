public class Company
{
    public static void main(String[] args)
    {
        // создаём массив персональных данных для каждого обьекта
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "engineer", "ivanov@mail.ru", "+7987654321",100000, 41);
        empArray[1] = new Employee("Petrov Petr", "manager", "petrov@mail.ru", "+7654987321",110000, 35);
        empArray[2] = new Employee("Vasiliev Vasiliy", "developer", "vasiliev@mail.ru", "+7321654987",55000, 27);
        empArray[3] = new Employee("Vladimirov Vladimir", "securuty", "ivanov@mail.ru", "+7741852963",90000, 63);
        empArray[4] = new Employee("Sergeev Sergey", "accountant", "sergeev@mail.ru", "+7369258147",80000, 48);

        // настраиваем фильтр для массива обьектов по переменной "возраст"
        for (int i = 0; i < empArray.length; i++)
        {
            if(empArray[i].getAge() > 40)
            {
                empArray[i].printInfo();
            }
        }
    }
}