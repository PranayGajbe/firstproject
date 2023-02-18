# firstproject


class inheritaance{

    int roll_no;
    String name;
    void getdata(int r,String n){
        roll_no=r;
        name=n;
    }
    void printdata(){
        System.out.println(roll_no);
        System.out.println(name);
    }

}

class children  extends inheritaance{
    int marks;                              /*  1. single inheritance
                                                2. multilevel inheritance
                                                3.heirarchical inheritance

                                              */
    void getedtata(int m){
        marks=m;
    }
    void print(){
        System.out.println(marks);
    }



}
class children_2 extends children{
    String result="passed";

    void printresult(){
        System.out.println(result);
    }

}

public class inheritance {
    public static void main(String[] args) {

        children_2 s1=new children_2();
        s1.getdata(1,"p");
        s1.printdata();
        s1.getedtata(50);
        s1.print();
        s1.printresult();

    }
}
