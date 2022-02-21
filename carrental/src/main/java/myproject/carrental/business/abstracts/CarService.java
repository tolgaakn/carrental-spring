package myproject.carrental.business.abstracts;

import java.util.List;

import myproject.carrental.core.utilities.results.DataResult;
import myproject.carrental.core.utilities.results.Result;
import myproject.carrental.entities.concretes.Car;

public interface CarService {
	
	DataResult<List<Car>> getAll();
	Result add(Car car);
}
