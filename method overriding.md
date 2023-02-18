# firstproject

class time{
    public static void main(String[] args) {


        jery s1=new jery();
        s1.getdata();
        s1.getdata(4,"ritesh");

    }
}
class tem{
    int roll;
    String name;
    void getdata(int r,String n ){

        roll=r;
        name=n;

        System.out.println(roll);
        System.out.println(name);

    }


}
class jery extends tem{
    int student_fees=20000;
    String department="cse";
    void getdata(){
        System.out.println(student_fees);
        System.out.println(department);

    }
}
