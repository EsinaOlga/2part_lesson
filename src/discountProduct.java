import java.time.LocalTime;
public  class discountProduct extends Product {//наследование от класса Product
    /// private Product product;
    private static Double discount;
    public discountProduct(String name_product, Double cost,Double discount) {
        super(name_product,cost);
        this.discount=discount;
    }

    @Override
    public String toString() {
        return "discountProduct{" +
              //  "discount=" + discount +
                ", name_product='" + name_product + '\'' +
                ", cost=" + cost +
                '}';
    }

    public Double getDiscount() {
        return discount;
    }

    // Цена с учётом скидки
    public double getDiscountedPrice() {
        return super.cost - (super.cost * discount/ 100);
    }
    //задаем метод определения скидки по времени
    public static double getTimeBasedDiscount() {
        LocalTime now = LocalTime.now();//утилита Локал тайм

        if (now.isAfter(LocalTime.of(6, 0)) && now.isBefore(LocalTime.of(12, 0))) {
            return 10.0; // Утренний период: 10%
        } else if (now.isAfter(LocalTime.of(12, 0)) && now.isBefore(LocalTime.of(18, 0))) {
            return 5.0; // Дневной период: 5%
        } else if (now.isAfter(LocalTime.of(18, 0)) && now.isBefore(LocalTime.of(23, 0))) {
            return 15.0; // Вечерний период: 15%
        } else {
            return discount; // В остальное время — базовая скидка
        }

    }


    }

