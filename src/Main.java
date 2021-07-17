public class Main {

    public static void main(String[] args)
    {
        Cat[] cats = {
                new Cat(5, "Дуся"),
                new Cat(7, "Мурзик"),
                new Cat(10, "Мышкин")
        };

        Plate plate = new Plate(20);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }

        plate.increaseFood(50);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }
    }
}
