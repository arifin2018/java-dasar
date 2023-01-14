public class Variable {
    public static void main(String[] args) {
        String name, ageString, address, NumberAddress;
        name = "Nur Arifin";
        int age = 22;
        address = "Nur Arifin";

        NumberAddress = Integer.toString(age) + 's';

        int totalNumber = 0;
        if (NumberAddress.matches("[0-9]+")) {
            totalNumber = Integer.parseInt(NumberAddress) + age;
        }

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(NumberAddress);

        System.out.println(totalNumber);
    }
}
