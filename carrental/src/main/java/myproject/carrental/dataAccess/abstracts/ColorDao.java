package myproject.carrental.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.carrental.entities.concretes.Color;

public interface ColorDao extends JpaRepository<Color, Integer> {

}
