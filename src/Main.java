public class Main {
    public static void main(String[] args) {

//zadacha 1
         var dog = 8.0;
         var cat = 3.6;
         var paper = 763789;
         System.out.println(dog);
         System.out.println(cat);
         System.out.println(paper);

//zadacha 2

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

//zadacha 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

//zadacha 4
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

//zadacha 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

//zadacha 6
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        var overWeight = secondBoxer - firstBoxer;
        System.out.println("Общий вес двух боксеров " + totalWeight +" кг");
        System.out.println("Разница в весе "+ overWeight + " кг");

//zadacha 7
        var overWeight2 = secondBoxer - firstBoxer;
        System.out.println("Разница в весе "+ overWeight2 + " кг");
        var overWeight3 = secondBoxer % firstBoxer;
        System.out.println("Разница в весе "+ overWeight3 + " кг");

//zadacha 8
        var totalWorkTime = 640;
        var oneWorkerTime = 8;
        var totalWorkers = totalWorkTime / oneWorkerTime;
        System.out.println("Всего работников в компании - "+ totalWorkers + " человек.");
        totalWorkers = totalWorkers + 94;
        var moreTime = totalWorkers * oneWorkerTime;
        System.out.println("Если в компании работает " +totalWorkers+" человек,то всего " + moreTime +" часов работы можеть быть поделено между сотрудниками");



    }
}