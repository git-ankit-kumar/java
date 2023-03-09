class  employees{
    private int id;
    private  String name;
    public employees(){ //attributes
//        id =23;/*
//    id=34;
//    id =234;n
//    id =345;
//    id=2345;*/
    id =800;
//    name="so cool ";
//        name ="wow so cool bro";
name="so said bro";


    }
    public String getName(){
        return name;

    }public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id = i;
//            this.id=2;
    }
    public  int getId(){
        return id;
    }
}

public class constructors_first {
    public static void main(String[] args) {
//        System.out.println("www");
        employees wowo=new employees ();
        System.out.println(wowo.getId());
        System.out.println(wowo.getName());
//overloading :
    }
}
