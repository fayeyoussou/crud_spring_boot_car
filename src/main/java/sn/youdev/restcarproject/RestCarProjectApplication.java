package sn.youdev.restcarproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.youdev.restcarproject.domain.Car;
import sn.youdev.restcarproject.domain.Owner;
import sn.youdev.restcarproject.repository.CarRepository;
import sn.youdev.restcarproject.repository.OwnerRepository;

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
        Owner owner = new Owner();
        owner.setFirstName("Youssoupha");
        owner.setLastName("Faye");
        ownerRepository.save(owner);
        Owner owner2 = new Owner();
        owner2.setFirstName("Tapha");
        owner2.setLastName("Sow");
        ownerRepository.save(owner2);
        Car car = new Car();
        car.setBrand("Toyota");
        car.setColor("red");
        car.setModele("Yaris");
        car.setPrice(4000);
        car.setOwner(owner);
        car.setYear(2019);
        car.setRegisterNumber("A3495Z");
        carRepository.save(car);
        Car car2 = new Car();
        car2.setBrand("Jeep");
        car2.setColor("black");
        car2.setModele("Renegade");
        car2.setPrice(23000);
        car2.setOwner(owner2);
        car2.setYear(2016);
        car2.setRegisterNumber("X4578S");
        carRepository.save(car2);

    }
}
