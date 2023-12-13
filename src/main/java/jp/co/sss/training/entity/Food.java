package jp.co.sss.training.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Food")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_food_gen")
	@SequenceGenerator(name = "seq_food_gen", sequenceName = "seq_food", allocationSize = 1)
	private Integer id;

	@Column
	private String name;
	@Column
	private Integer stock;
	@Column
	private Date arrivalDate;

	public Food() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

}
