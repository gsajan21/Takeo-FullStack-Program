public class TestDemo extends Test {

    TestDemo(){
        super(100, "Sajan Gurung");
        System.out.println("This is child class constructor.");
    }

    void sum(int a){

        System.out.println(a+34687);
        super.sum(a); // super calls the sum method from the Test class which is parent class
    }
    public static void main(String[] args) {
        TestDemo t = new TestDemo();
        t.sum(100);
        t.print();
    }
}
