public class Test {
    static public int succeeded;
    static public int failed;

    public Test(){

    }
    public Test(int s, int f){
        succeeded =s; failed =f;
    }

    public String toString(){
        return succeeded + " " + failed;
    }

    class TestStatistics{
        public static void main(String [] args){
            Test t = new Test(1, 99);
            Test.succeeded =99;
            System.out.println(new Test());
        }
    }
}
