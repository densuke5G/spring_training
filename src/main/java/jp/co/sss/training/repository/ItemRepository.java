package jp.co.sss.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.training.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	List<Item> findAllByOrderByPriceAsc();

	List<Item> findByPriceAndGenreId(Integer price, Integer genreId);
	List<Item> findByPriceOrGenreId(Integer price, Integer genreId);
}
