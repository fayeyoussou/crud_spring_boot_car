package sn.youdev.restcarproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.youdev.restcarproject.domain.Car;
import sn.youdev.restcarproject.domain.Owner;
import sn.youdev.restcarproject.repository.CarRepository;
import sn.youdev.restcarproject.repository.OwnerRepository;

import java.util.Arrays;

@SpringBootApplication
public class RestCarProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RestCarProjectApplication.class, args);
    }
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private OwnerRepository ownerRepository;
    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner("mohamed","thiam");
        Owner owner2 = new Owner("ibrahima","Niang");
        ownerRepository.saveAll(Arrays.asList(owner,owner2));
        Car car1 = new Car(
                "Mercedez",
                "benz",
                "grey",
                "A3489T",
                2004,
                1009,
                owner);
        Car car2 = new Car(
                "Nissan",
                "unknown",
                "night blue",
                "H4563P",
                2009,
                1890,
                owner);
        Car car3 = new Car(
                "Peugeot",
                "306",
                "Green",
                "L5673K",
                1999,
                2000,
                owner2);
        Car car4 = new Car(
                "Peugeo",
                "unknowm",
                "Pink",
                "D2789M",
                2008,
                3100,
                owner2);
        carRepository.saveAll(Arrays.asList(car1,car2,car3,car4));




    }
}
