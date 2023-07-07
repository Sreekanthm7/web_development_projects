package textbooksample;

//  interface Printable{
//     void print();
// }

// class A6 implements Printable {
//     public void print(){
//         System.out.println("hello world");

//     }
//     public static void main(String[] args) {
//         A6 obj = new A6();

//         obj.print();
//     }
// }

// interface Drawable {
//     void draw();
// }

// class Rectangle implements Drawable {
//     public void draw(){
//         System.out.println();
//     }
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