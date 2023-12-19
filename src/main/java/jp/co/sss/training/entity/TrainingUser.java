package jp.co.sss.training.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TrainingUser")
@NamedQuery(name = "findByNameLike", query = "SELECT i FROM TrainingUser i WHERE i.userId LIKE :keyword")
public class TrainingUser {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_training_user_gen")
	@SequenceGenerator(name = "seq_training_user_gen", sequenceName = "seq_training_user", allocationSize = 1)
	private Integer id;
	
	@Column
	private String userId;
	
	@Column
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
