public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Задача 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task3 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Задача 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    }
    public static void task4 () {
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }
    public static void task5 () {
        var frog = 3.5;
        System.out.println("Задача 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;
        System.out.println("Задача 6");
        System.out.println("Обший вес боксеров: " + totalWeight + "кг");
        System.out.println("Разница в весе: " + weightDifference + "кг");
    }
    public static void task7 () {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightDifferenceW1 = boxer2 - boxer1;
        var weightDifferenceW2 = boxer2 % boxer1;
        System.out.println("Задача 7");
        System.out.println("Разница в весе первым способом: " + weightDifferenceW1 + "кг");
        System.out.println("Разница в весе вторым способом: " + weightDifferenceW2 + "кг");
    }
    public static void task8 () {
        var startHours  = 640;
        var employee = 8;
        var startGroup = startHours / employee;
        var newGroup = startGroup + 94;
        var newHours = newGroup * 8;
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании — " + startGroup + " человек");
        System.out.println("Если в компании работает " + newGroup + " человека, то всего " + newHours + " часов работы может быть поделено между сотрудниками");
    }
}