public class dz3 {
    public static void main(String[] args) {
    Person[] persArray = new Person[6];
    persArray[0] = new Person("Papich", "Lychii v mire", "Leorik@gmail.com", "88005553535", 1000500, 32);
    persArray[1] = new Person("Biba", "Brother of Boba", "Biba@gmail.com", "88005553636", 100, 41);
    persArray[2] = new Person("Boba", "Brother of Biba", "Boba@gmail.com", "88005553737", 200, 41);
    persArray[3] = new Person("Uncle Tom", "CEO", "TomTheUncle@gmail.com", "88005553838",1005000 , 40);
    persArray[4] = new Person("Zummer", "Jobless", "ChangeYourself@gmail.com", "88005553939", 5000, 18);
    persArray[5] = new Person("Steve Jobs", "CEO in Apple, chairman of the board in Apple", "SteveJobs@applemailbox.com", "77777777777", 100500100, 66);
    for (Person employee : persArray)
        if (employee.getAge() > 40)
            System.out.println(employee);
}
}
class Person {
    public String name;
    public String position;
    public String mail;
    public String phone;
    public int money;
    public int age;

    public Person(String name, String position, String mail, String phone, int money, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }
    @Override
    public String toString() {return (name + "\n-" + position + "\n-" +mail + "\n-" + phone + "\n-" + money + "\n-" + age);
    }


    public int getAge() {
        return age;
    }


}
