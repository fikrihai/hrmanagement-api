package co.hr.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.hr.management.model.ResourceData;

public interface ResourceDataRepository extends JpaRepository<ResourceData, String> {
	List<ResourceData> findAll();

	ResourceData findOneByNo(String no);
}
