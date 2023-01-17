public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("arifin");
        sayHello("nur", "arifin");
    }

    static void sayHello(){
        System.out.println("say Hello");
    }

    static void sayHello(String name){
        System.out.println("say Hello "+ name);
    }
    static void sayHello(String name,String name2){
        System.out.println("say Hello " + name + " " +name2);
    }
}
