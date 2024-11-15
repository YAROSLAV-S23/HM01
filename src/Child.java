public class Child extends Parent {
    // Статический блок "Child:static 1"
    static {
        System.out.println("Child:static 1");
    }

    // Нестатический блок "Child:instance 1"
    {
        System.out.println("Child:instance 1");
    }

    // Статический блок "Child:static 2"
    static {
        System.out.println("Child:static 2");
    }

    // конструктор без парамметров с выводом "Child:constructor"
    Child() {
        System.out.println("Child:constructor");
    }

    // конструктор c параметроv name с выводом "Child:name-constructor"
    Child(String name) {
        super(name);
        System.out.println("Child:name-constructor");
    }

    //Нестатический блок "Child:instance 2"
    {
        System.out.println("Child:instance 2");
    }
}
