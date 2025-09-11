
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Cars> cars = new ArrayList<>();
        //Загрузка из файла
        try {
            Files.lines(Paths.get("C:\\Users\\MAEsi\\IdeaProjects\\2part_lesson\\Lesson4_stream\\src\\output.txt"))
                    .map(line -> line.split("\\|"))
                    .forEach(parts -> {
                        if (parts.length >= 5) {
                            cars.add(new Cars(parts[0], parts[1], parts[2],
                                    Integer.parseInt(parts[3]), Double.parseDouble(parts[4]))
                            );
                        }
                        ;
                    });
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //Загрузка  входных параметров-вариант2
        //cars.add(new Cars("a123me", "Mercedes", "White", 0, 8300.000));
        //cars.add(new Cars("b873of", "Volga", "Black", 0, 673.000));
        // cars.add(new Cars(w487mn|Lexus|Grey|76000|900000));
        // cars.add(new Cars(p987hj|Volga|Red|610|704340));
        // cars.add(new Cars(c987ss|Toyota|White|254000|761000));

        //Финальные переменные
        final String colorToFind = "Black";
        final Integer mileageToFind = 0;
        final String modelFind = "Volga";
        final Double minPrice = 700.00;
        final Double maxPrice = 800.00;

        System.out.println("Вывод всех авто базе:"+"\n");
        cars.forEach(System.out::println);

        //Фильтрация номеров по цвету и по пробегу
        List<String> filternumberCar = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase(colorToFind) || (car.getProbeg() == mileageToFind))
                .map(Cars::getNumber_car) // допустим, есть метод getNumber() для получения номера
                .collect(Collectors.toList());
        System.out.println("Номера авто по цвету " + colorToFind + "или пробегу" + mileageToFind + filternumberCar);
        // кол уникальных моделей в ценовом диапозоне
        long uniqModel = cars.stream()
                .filter(car -> car.getPrice() >= minPrice && car.getPrice() <= maxPrice)
                .map(Cars::getModel)
                .distinct()
                .count();
        System.out.println("Уникальные модели машин в диапозоне от " + minPrice + "до " + maxPrice +" - "  +uniqModel+"шт.");

        //вывести цвет авто с уник стоимость
        //     long colorCar = cars.stream()
        //           .filter( car -> car.getPrice()>=minPrice && car.getPrice()<=maxPrice)
        //         .map(Cars::getModel)
        //          .distinct()
//.count();
        //  System.out.println("Уникальные модели машин в диапозоне от " + minPrice + "до "+maxPrice + uniqModel+"шт.");
//Средняя стоимость искомой модели
        double averegePriceCar = cars.stream()
                .filter(car -> car.getModel().equals(modelFind))
                .mapToDouble(Cars::getPrice)
                .average()
                .orElse(0.0);
        System.out.println("Средняя стоимость модели " + modelFind +  " - "+ averegePriceCar);


        // Запись в файл input.txt
         FileWriter writer = new FileWriter("C:\\Users\\MAEsi\\IdeaProjects\\2part_lesson\\Lesson4_stream\\src\\input.txt");
         writer.write("Авто в базе"+"\n");
         cars.forEach(cars1 -> {
                     try {
                         writer.write("\n" + cars1.toString() + "\n");
                     //    writer.write("Средняя стоимость"+"\n" + averegePriceCar + "\n");

                     } catch (IOException e) {
                         System.out.println(e.getMessage());
                     }

                     //Запись в файл
                     // try (FileWriter writer = new FileWriter("C:\\Users\\MAEsi\\IdeaProjects\\2part_lesson\\Lesson4_stream\\src\\input.txt")) {
                     //    writer.write("Авто в базе"+"\n");
//writer.write("\n"+cars.toString()+"\n");
                     //  } catch (IOException e) {
                     //      System.out.println("Ошибка записи в файл: " + e.getMessage());
                     //  }
                 });
    }
}



