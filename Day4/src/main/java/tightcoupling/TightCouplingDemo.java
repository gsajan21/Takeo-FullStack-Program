package tightcoupling;

public class TightCouplingDemo {
    void method(){
        ClassA a = new ClassA();
//        ClassB b = new ClassB(); 
        a.print();
//        b.print();
    }

    public static void main(String[] args) {
        TightCouplingDemo tc = new TightCouplingDemo();
        tc.method();
    }
}
