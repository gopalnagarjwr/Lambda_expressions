interface Lambda{    // this is functional interface
    void print();
}
interface Parameter{
    int add(int a,int b);  // parameteries method
}

public class Main {
    public static void main(String[] args) {

        Lambda l=()-> System.out.println("this is lambda expressions");
          l.print();                                                        // call lambda function

        Parameter p=(a,b)-> {                                              // parameter lambda expressions
             int c = 0;
            c = a+b;
            return c;
        };
        System.out.println("value is : "+ p.add(10,20));

    }
}