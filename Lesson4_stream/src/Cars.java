public class Cars {
    private String number_car;
    //private List<String> model;
    private String  model;
    private String  color;
    private Integer  probeg;
    private Double  price;


    public Cars(String number_car, String model, String  color, Integer  probeg, Double price) {
        this.number_car = number_car;
        this.model = model;
        // this.model= new ArrayList<>();
        this.color = color;
        this.probeg = probeg;
        this.price = price;
    }



    public String getNumber_car() {
        return number_car;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getProbeg() {
        return probeg;
    }

    public Double getPrice() {
        return price;
    }

    public void setNumber_car(String number_car) {
        this.number_car = number_car;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProbeg(Integer probeg) {
        this.probeg = probeg;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "number_car='" + number_car + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", probeg=" + probeg +
                ", price=" + price +
                '}';
    }


}




