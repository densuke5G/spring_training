package jp.co.sss.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jp.co.sss.training.entity.TrainingUser;

public interface TrainingUserRepository extends JpaRepository<TrainingUser, Integer> {
	TrainingUser findByUserIdAndPassword(String userId, String password);
	
	@Query("SELECT i FROM TrainingUser i WHERE i.userId LIKE :keyword")
	public List<TrainingUser> findByQuery(@Param("keyword")String keyword);
	
	@Query("SELECT COUNT(i) FROM TrainingUser i WHERE i.userId LIKE :keyword")
	public Integer findByCountQuery(@Param("keyword")String keyword);
}
