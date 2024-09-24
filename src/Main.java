//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Task 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        // Task 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        // Task 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);

        // Task 4
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        // Task 5
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog  + 4;
        System.out.println (frog);

        // Task 6
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println (weightBoxer1 + weightBoxer2);
        System.out.println (weightBoxer1 - weightBoxer2);

        // Task 7
        System.out.println (weightBoxer2 % weightBoxer1);

        // Task 8.1
        var totalTime = 640;
        var timeEmployee = 8;
        var employee = totalTime / timeEmployee;
        System.out.println ("Всего работников в компании — " + employee + " человек");

        // Task 8.2
        employee = employee + 94;
        var totalTime2 = employee / 8;
        System.out.println ("Если в компании работает " + employee + " человек, то всего " + totalTime2 +" часов работы может быть поделено между сотрудниками");

    }
}