package spring.api.jpa.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import spring.api.jpa.entity.ChungNhan;
import spring.api.jpa.entity.ChungNhanPK;


@Repository
@Transactional
public interface ChungNhanRepository extends JpaRepository<ChungNhan, ChungNhanPK>{

//	11
	@Query(nativeQuery =  true, value="select c.mamb from chungnhan c join nhanvien nv ON c.manv = nv.manv where nv.ten like ?1%")
	List<String> findMaMBByFirstName(String name);
}
