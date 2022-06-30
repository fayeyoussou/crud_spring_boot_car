package sn.youdev.restcarproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.youdev.restcarproject.domain.Car;

public interface CarRepository extends JpaRepository<Car,Long> {

}
