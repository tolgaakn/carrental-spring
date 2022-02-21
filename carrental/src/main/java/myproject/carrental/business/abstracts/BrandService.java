package myproject.carrental.business.abstracts;

import java.util.List;

import myproject.carrental.core.utilities.results.DataResult;
import myproject.carrental.core.utilities.results.Result;
import myproject.carrental.entities.concretes.Brand;

public interface BrandService {

	DataResult<List<Brand>> getAll();
	Result add(Brand brand);
}
