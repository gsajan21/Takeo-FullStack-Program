class TestDemo{
    public static void main(String [] args){
        Test t = new Test(1, 99);
        Test.succeeded =99;
        System.out.println(new Test());
    }
}