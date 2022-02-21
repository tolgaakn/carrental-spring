package myproject.carrental.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import myproject.carrental.entities.concretes.Brand;

public interface BrandDao extends JpaRepository<Brand, Integer> {

}
