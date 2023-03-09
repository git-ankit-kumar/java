class student {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("my id is " + id);
        System.out.println("and my id name " + name);
    }

    public int getSalary() {
        return salary;
//    return salary;
    }
}
public class first1_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        student wow = new student();
        student owl = new student();
        student rc = new student();
        wow.id = 12;
        wow.name = "wow";
        wow.salary = 400;
        //setting attributes;
        wow.id = 234;
        wow.name = "wow so cool bro:";
        owl.id = 23;
        owl.name = "wow";

        System.out.println(wow.id);
//        wow.printDetails();
//        owl.printDetails();
//        int salary  =wow.getSalary();
//        System.out.println(salary);
    }
}