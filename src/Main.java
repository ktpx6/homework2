public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println (dog);
        cat = cat + 4;
        System.out.println (cat);
        paper = paper + 4;
        System.out.println(paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println (dog);
        System.out.println (cat);
        System.out.println(paper);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);

        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Задача 6");
        var FirstBoxer = 78.2;
        var SecondBoxer = 82.7;
        var massBoxer = FirstBoxer + SecondBoxer;
        System.out.println("Общая масса обоих бойцов ровна " + massBoxer + " кг");

        var WeightBoxer= SecondBoxer - FirstBoxer;
        System.out.println("Pазница между массами бойцов составляет " + WeightBoxer + " кг");

        System.out.println("Задача 7");
        var weight1 = 100;
        var weight2 = 35;
        var remainder = weight1 % weight2;
        System.out.println("Остаток от деления " + weight1 + " на " + weight2 + " составляет " + remainder);

        System.out.println("Задача 8");
        var totalHours = 640;
        var hoursPerWorker = 8;
        var totalWorkers = totalHours / hoursPerWorker;
        System.out.println("Всего работников в компании — " + totalWorkers + " человек");

        var additionalWorkers = 94;
        var totalWorkersWithAddition = totalWorkers + additionalWorkers;
        var totalHoursWithAddition = totalWorkersWithAddition * hoursPerWorker;
        System.out.println("Если в компании работает " + totalWorkersWithAddition + " человек, то всего " +
                totalHoursWithAddition + " часов работы может быть поделено между сотрудниками");
    }
}