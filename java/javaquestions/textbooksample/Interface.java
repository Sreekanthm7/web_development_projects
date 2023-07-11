package textbooksample;

//  interface Printable{

//     void print();
// }

class Laptop {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Developer {
    public void devApp(Laptop lap) {
        lap.code();
    }
}

class Demo {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        Developer navin = new Developer();
        navin.devApp(lap);
    }
}