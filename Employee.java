package Lesson4;

public class Employee {
    //1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    private String name;
    private String secondname;
    private String lastname;
    private String profession;
    private String phone;
    private float income;
    int age;


    //2 Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String name, String secondname, String lastname,
                    String profession, String phone, float income, int age) {
        this.name = name;
        this.secondname = secondname;
        this.lastname = lastname;
        this.profession = profession;
        this.phone = phone;
        this.income = income;
        this.age = age;

    }

    //3. 3 Внутри класса «Сотрудник» написать методы,
    // которые возвращают значение каждого поля;
    public int getAge() {
        return age;
           }
           public String getName() {
        return name;
           }
           public String getSecondname() {
        return secondname;
           }
           public String getLastname() {
        return lastname;
           }
           public String getProfession () {
        return profession;
           }
           public String getPhone () {
        return phone;
           }
           public float getIncome () {
        return income;
           }
}


