package myproject.carrental.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "brand_id")
	private int brandId;
	
	@Column(name = "color_id")
	private int colorId;
	
	@Column(name = "model_year")
	private int modelYear;
	
	@Column(name = "daily_price")
	private Double dailyPrice;
	
	@Column(name = "description")
	private String description;
}
