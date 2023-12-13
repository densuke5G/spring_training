package jp.co.sss.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.training.entity.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {
	List<Food> findByNameContaining(String name);
}
