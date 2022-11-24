import transport.Car;

public class Main {
    public static void main(String[] args) {

        Human maksim = new Human("Максим", "программист",1992, "Екатеринбург");
        maksim.setYearOfBirth();
        maksim.setTown();
        //maksim.name = "Максим";
        //maksim.yearOfBirth = 1992;
        //maksim.town = "Екатеринбург";
        //maksim.jobTitle = "программист";
        maksim.men();



        Human anya = new Human("Аня", "гейм-дизайнер", 1985, "Москва");
        anya.setYearOfBirth();
        anya.setTown();
        //anya.name = "Аня";
        //anya.yearOfBirth = 1985;
        //anya.town = "Москва";
        //anya.jobTitle = "гейм-дизайнер";
        anya.girls();

        Human katia = new Human("Катя", "судебный секретарь", 2000, "Сочи");
        katia.setYearOfBirth();
        katia.setTown();
        //katia.name = "Катя";
        //katia.yearOfBirth = 2000;
        //katia.town = "Сочи";
        //katia.jobTitle = "судебный секретарь";
        katia.girls();

        Human artyom = new Human("Артем", "оператор вышки", 1974, "Череповец");
        artyom.setYearOfBirth();
        artyom.setTown();
        //artyom.name = "Артем";
        //artyom.yearOfBirth = 1974;
        //artyom.town = "Череповец";
        //artyom.jobTitle = "оператор вышки";
        artyom.men();

        Human vladimir = new Human("Владимир", "сейчас нигде не работает", 2003, "Казань");
        System.out.println(vladimir.name + " которому " + vladimir.getDob() + " лет живет в городе " + vladimir.getTown() +", " + vladimir.jobTitle);

        ///////////// FLOWER//////////////////
        System.out.println();

        Flower roseFlower = new  Flower ("красный", "Голландия", 59.9, 1);
        roseFlower.setCost();
        roseFlower.flowers();

        Flower chrysanthemum  = new Flower(49.7, 2);
        chrysanthemum.chrysanthemum();

        Flower peony = new Flower(57.2, 5);
        peony.peony();

        Flower gypsophila = new Flower("Турция",89, 3);
        gypsophila.gypsophila();

        ///////////////CAR////////////////////////
        System.out.println();

        Car lG = new Car(null, "Granta", null, "Россия", 2015, 1.7, "зимние");
        //lG.brand = "Lada";
        //lG.model = "Granta";
        //lG.engineVolume = 1.7;
        //lG.color = "желтый";
        //lG.year = 2015;
        //lG.country = "Россия";
        lG.carModels();

        Car audi = new Car("Audi", "A8 50 L TDI quattro", null, "Германия", 2020, 3.0, "зима");
        //audi.brand = "Audi";
        //audi.model = "A8 50 L TDI quattro";
        //audi.engineVolume = 3.0;
        //audi.color = "черный";
        //audi.year = 2020;
        //audi.country = "Германия";
        audi.carModels();
        System.out.println(audi.getSummerOrWinterTires() + " " + audi.getColor());
        audi.setSummerOrWinterTires("лето");
        System.out.println(audi.getSummerOrWinterTires());

        //Car bmw = new Car("BMW", "Z8", "черный", "Германия", 2021, 3.0, "зимние");
        //bmw.brand = "BMW";
        //bmw.model = "Z8";
        //bmw.engineVolume = 3.0;
        //bmw.color = "черный";
        //bmw.year = 2021;
        //bmw.country = "Германия";
        //bmw.carModels();

        //Car kia = new Car("Kia", "Sportage 4 поколения", "красный", "Южная Корея", 2018, 2.4, "зимние");
        //kia.brand = "Kia";
        //kia.model = "Sportage 4 поколения";
        //kia.engineVolume = 2.4;
        //kia.color = "красный";
        //kia.year = 2018;
        //kia.country = "Южная Корея";
        //kia.carModels();

        //Car hA = new Car("Hyundai", "Avante", "оранжевый", "Южная Корея", 2016, 1.6, "зимние");
        //hA.brand = "Hyundai";
        //hA.model = "Avante";
        //hA.engineVolume = 1.6;
        //hA.color = "оранжевый";
        //hA.year = 2016;
        //hA.country = "Южная Корея";
        //hA.carModels();




    }
}