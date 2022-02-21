package myproject.carrental.business.abstracts;

import java.util.List;

import myproject.carrental.core.utilities.results.DataResult;
import myproject.carrental.core.utilities.results.Result;
import myproject.carrental.entities.concretes.Color;

public interface ColorService {

	DataResult<List<Color>> getAll();
	Result add(Color color);
}
