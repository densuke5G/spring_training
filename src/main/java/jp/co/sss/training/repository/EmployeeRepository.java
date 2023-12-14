package jp.co.sss.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.training.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//	List<Employee> findBy
}
