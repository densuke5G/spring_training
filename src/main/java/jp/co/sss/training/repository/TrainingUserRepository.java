package jp.co.sss.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.training.entity.TrainingUser;

public interface TrainingUserRepository extends JpaRepository<TrainingUser, Integer> {
	
}
