public class Main {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i5", "8GB").build();

        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB")
            .setStorage("1TB SSD")
            .build();

        Computer officeComputer = new Computer.Builder("Intel i3", "4GB")
            .setStorage("256GB SSD")
            .build();

        basicComputer.showSpecs();
        gamingComputer.showSpecs();
        officeComputer.showSpecs();
    }
}
