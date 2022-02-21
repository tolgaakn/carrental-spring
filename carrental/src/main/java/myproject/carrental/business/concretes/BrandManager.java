package myproject.carrental.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproject.carrental.business.abstracts.BrandService;
import myproject.carrental.core.utilities.results.DataResult;
import myproject.carrental.core.utilities.results.Result;
import myproject.carrental.core.utilities.results.SuccessDataResult;
import myproject.carrental.core.utilities.results.SuccessResult;
import myproject.carrental.dataAccess.abstracts.BrandDao;
import myproject.carrental.entities.concretes.Brand;

@Service
public class BrandManager implements BrandService {

	private BrandDao brandDao;

	@Autowired
	public BrandManager(BrandDao brandDao) {
		super();
		this.brandDao = brandDao;
	}

	@Override
	public DataResult<List<Brand>> getAll() {
		return new SuccessDataResult<List<Brand>>(this.brandDao.findAll());
	}

	@Override
	public Result add(Brand brand) {
		this.brandDao.save(brand);
		return new SuccessResult("Marka eklendi.");
	}
}
