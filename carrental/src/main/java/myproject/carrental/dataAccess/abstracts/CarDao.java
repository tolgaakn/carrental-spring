package myproject.carrental.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.carrental.entities.concretes.Car;

public interface CarDao extends JpaRepository<Car, Integer> {

}
