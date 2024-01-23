public class Test {

    int number;
    String name;



    Test (){
        System.out.println("This is the parent class constructor.");
    }
    Test (int a){
        this.number = a;
        System.out.println("Now the value of number is: " +  number);
    }
    Test(int number, String name){
        this.number = number;
        this.name = name;
    }

    void sum(int num){
        System.out.println(number + num);
    }
    void print(){
        System.out.println(number + " " + name);
    }
}
