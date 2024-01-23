public class DefaultVariables {

    int number = 0;
    boolean bool = true;
    String name = "Sajan";

    public void defaultVariables(){
        System.out.println(
                "number=" + number +
                        ", bool=" + bool +
                        ", name='" + name + '\'');
    }

    @Override
    public String toString() {
        return "DefaultVariables{" +
                "number=" + number +
                ", bool=" + bool +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        DefaultVariables df = new DefaultVariables();
//        System.out.println(df); // using  toString() method
        df.defaultVariables();
    }
}
