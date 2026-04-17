package java_practice;
class Animal12 {


    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) return false; // 🔴 important line
	else return true;
    }
}

class Dog12 extends Animal12 {

}

public class Getclassmethod {
    public static void main(String[] args) {

        Animal12 a1 = new Animal12();
        Animal12 a2 = new Animal12();
        Animal12 a3 = new Dog12();    //upcasting
        Dog12 d2=(Dog12) a3;           //Downcasting
        Dog12 d1 = new Dog12();
        System.out.println("*****************************************************");
        System.out.println("a1 belongs to:   "+a1.getClass());
        System.out.println();
        System.out.println("a2 belongs to:   "+a2.getClass());
        System.out.println();
        System.out.println("a3 belongs to:   "+a3.getClass());
        System.out.println();
        System.out.println("d1 belongs to:   "+d1.getClass());
        System.out.println();
        System.out.println("d2 belongs to:   "+d2.getClass());
        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("a1 and a2 belongs to same class?  "+a1.equals(a2)); // ✅ true
        System.out.println();
        System.out.println("a1 and d1 belongs to same class?  "+a1.equals(d1)); // ❌ false (different class)
        System.out.println();
        System.out.println("a2 and d1 belongs to same class?  "+a2.equals(d1)); // ❌ false (different class)
        System.out.println();
        System.out.println("a1 and a3 belongs to same class?  "+a1.equals(a3)); // ❌ false (different class)
        System.out.println();
        System.out.println("a2 and a3 belongs to same class?  "+a2.equals(a3)); // ❌ false (different class)
        System.out.println();
        System.out.println("a3 and d1 belongs to same class?  "+a3.equals(d1)); // ✅ true
        System.out.println();
        System.out.println("a3 and d2 belongs to same class?  "+a3.equals(d2)); // ✅ true
        System.out.println("*****************************************************");
        System.out.println("a1 instanceof Animal12 :"+(a1 instanceof Animal12));		//true
        System.out.println("a1 instanceof Dog12    :"+(a1 instanceof Dog12));		//false
        System.out.println();
        System.out.println("a2 instanceof Animal12 :"+(a2 instanceof Animal12));		//true
        System.out.println("a2 instanceof Dog12    :"+(a2 instanceof Dog12));		//false
        System.out.println();
        System.out.println("a3 instanceof Animal12 :"+(a3 instanceof Animal12));		//true
        System.out.println("a3 instanceof Dog12    :"+(a3 instanceof Dog12));		//true
        System.out.println();
        System.out.println("d1 instanceof Animal12 :"+(d1 instanceof Animal12));		//true
        System.out.println("d1 instanceof Dog12    :"+(d1 instanceof Dog12));		//true
        System.out.println();
        System.out.println("d2 instanceof Animal12 :"+(d2 instanceof Animal12));		//true
        System.out.println("d2 instanceof Dog12    :"+(d2 instanceof Dog12));		//true
        System.out.println("*****************************************************");
    }
}