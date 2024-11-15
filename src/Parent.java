public abstract class Parent {
    //Приватное поле name
    private String name;

    // Статический блок "Parent:static 1"
    static {
        System.out.println("Parent:static 1");
    }

    // Нестатический блок "Parent:instance 1"
    {
        System.out.println("Parent:instance 1");
    }

    // Статический блок "Parent:static 2"
    static {
        System.out.println("Parent:static 2");
    }

    // Конструктор без параметров, с выводом "Parent:constructor"
    public Parent() {
        System.out.println("Parent:constructor");
    }

    // Нестатический блок "Parent:instance 2"
    {
        System.out.println("Parent:instance 2");
    }

    // Конструктор c параметром name, выводящий на экран "Parent:name-constructor"
    public Parent(String name) {
        this.name = name;
        System.out.println("Parent:name-constructor");
    }


}
