public class Method {
    public static void main(String[] args) {
        sayHelloWorld("Hello World", 7);
    }

    static void sayHelloWorld(String Text, int LengthLoop){
        for (int i =1; i<=LengthLoop; i++){
            System.out.println(Text + " "+ i);
        }
    }
}
