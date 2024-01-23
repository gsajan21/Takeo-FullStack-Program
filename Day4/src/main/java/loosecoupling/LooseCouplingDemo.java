package loosecoupling;

public class LooseCouplingDemo {

    void method(){
       LooseCouplingTest l = new ClassB();
//        LooseCouplingTest l = new ClassA();
//        LooseCouplingTest l = new ClassC();
       l.method();
    }

    public static void main(String[] args) {
        LooseCouplingDemo lcd = new LooseCouplingDemo();
        lcd.method();
    }
}
