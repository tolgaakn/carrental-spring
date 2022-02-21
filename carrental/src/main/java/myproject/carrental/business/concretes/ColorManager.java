package myproject.carrental.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myproject.carrental.business.abstracts.ColorService;
import myproject.carrental.core.utilities.results.DataResult;
import myproject.carrental.core.utilities.results.Result;
import myproject.carrental.core.utilities.results.SuccessDataResult;
import myproject.carrental.core.utilities.results.SuccessResult;
import myproject.carrental.dataAccess.abstracts.ColorDao;
import myproject.carrental.entities.concretes.Color;

@Service
public class ColorManager implements ColorService {

	private ColorDao colorDao;

	@Autowired
	public ColorManager(ColorDao colorDao) {
		super();
		this.colorDao = colorDao;
	}

	@Override
	public DataResult<List<Color>> getAll() {
		return new SuccessDataResult<List<Color>>(this.colorDao.findAll());
	}

	@Override
	public Result add(Color color) {
		this.colorDao.save(color);
		return new SuccessResult("Renk eklendi.");
	}
}
