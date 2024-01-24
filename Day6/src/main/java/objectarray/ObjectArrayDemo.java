package objectarray;

public class ObjectArrayDemo {
    void print(){
        System.out.println("This is Object Array Demo.");
    }
    public static void main(String[] args) {

        Object[] obj = new Object[5];

        obj[0] = "Sajan Gurung";
        obj[1] = new ObjectArrayDemo();
        obj[2] = 152674;
        obj[3] = 2465.2587;
        obj[4] = false;

        for( Object o : obj){
            if(o.getClass().toString().contains("ObjectArrayDemo")){
                ObjectArrayDemo oa = (ObjectArrayDemo) o;
                oa.print();
            }else
                System.out.println(o);
        }

        // instance of conditional example
        for( Object o : obj){
            if(o instanceof ObjectArrayDemo oo){
                oo.print();
            }else
                System.out.println(o);
        }
    }
}
