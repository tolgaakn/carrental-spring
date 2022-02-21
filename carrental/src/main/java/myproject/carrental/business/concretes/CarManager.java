package myproject.carrental.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproject.carrental.business.abstracts.CarService;
import myproject.carrental.core.utilities.results.DataResult;
import myproject.carrental.core.utilities.results.Result;
import myproject.carrental.core.utilities.results.SuccessDataResult;
import myproject.carrental.core.utilities.results.SuccessResult;
import myproject.carrental.dataAccess.abstracts.CarDao;
import myproject.carrental.entities.concretes.Car;

@Service
public class CarManager implements CarService {

	private CarDao carDao;
	
	@Autowired
	public CarManager(CarDao carDao) {
		super();
		this.carDao = carDao;
	}

	@Override
	public DataResult<List<Car>> getAll() {
		return new SuccessDataResult<List<Car>>(this.carDao.findAll());
	}

	@Override
	public Result add(Car car) {
		this.carDao.save(car);
		return new SuccessResult("Araba eklendi.");
	}

}
