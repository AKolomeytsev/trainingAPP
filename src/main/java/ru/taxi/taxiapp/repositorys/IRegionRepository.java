package ru.taxi.taxiapp.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.taxi.taxiapp.models.Region;

import java.util.Collection;

public interface IRegionRepository extends JpaRepository<Region, String> {
    public Collection<Region> findAllBy();
    public Collection<Region> getRegionById(String id);
    public Collection<Region> getRegionByCodeRegion(String code);
    @Query(nativeQuery = true, value = "DELETE FROM region where id = :id")
    public Boolean deleteRegion(@Param("id") String id);


}
