public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    Flower (String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        if (lifeSpan <= 0) {
            System.out.print("Срок годности товара не менее 3-х дней - ");
            return;

        }
        this.lifeSpan = lifeSpan;
    }

    Flower (double cost,int lifeSpan ) {
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    Flower(String country, double cost, int lifeSpan) {
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    Flower() {
    }


    String getFlowerColor() {
        return this.flowerColor;
    }

    String getCountry() {
        return this.country;
    }

    double getCost() {
        return this.cost;
    }

    void setFlowerColor() {
        if (flowerColor == null || flowerColor.isEmpty()){
            flowerColor = "Белый";
        }
        this.flowerColor = flowerColor;
    }

    void setCountry() {
        if (country == null || country.isEmpty()) {
            country = "Россия";
        }
        this.country = country;
}

    void setCost() {
        if (cost > 100.0) {
            System.out.print ("Цена не соответствует данному товару - " + cost + " руб. ");

        }else  if (cost <= 0) {
            System.out.print("Не установленны ценновые параметры - " + cost+ " руб. ");

        }


        this.cost = cost;
    }

    void flowers() {
        System.out.println("Роза обыкновенная, цвет " + flowerColor + " ,страна " + country + " цена " + cost + " руб. срок состояния " + lifeSpan + " дн.");
    }
    void chrysanthemum() {
        System.out.println("Хризантема, стоимость штуки - " + cost + " руб, срок сосотояния - " + lifeSpan + " дн.");
    }

    void peony() {
        System.out.println("Пион, стоимость штуки - " + cost + " руб, срок состояния - " + lifeSpan + " дн.");

    }

    void gypsophila() {
        System.out.println("Гипсофила, страна происхождения " + country + " стоимость штуки " + cost + ", срок состояния " + lifeSpan + " дн.");
    }

}
