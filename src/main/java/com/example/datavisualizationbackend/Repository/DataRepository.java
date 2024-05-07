package com.example.datavisualizationbackend.Repository;

import com.example.datavisualizationbackend.Entity.DataEntity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DataRepository extends JpaRepository<DataEntity,Long> {

    @Query("SELECT d FROM DataEntity d WHERE " +
            "(:endYear IS NULL OR d.endYear = :endYear) AND " +
            "(:topic IS NULL OR d.topic = :topic) AND " +
            "(:sector IS NULL OR d.sector = :sector) AND " +
            "(:region IS NULL OR d.region = :region) AND " +
            "(:source IS NULL OR d.source = :source) AND " +
            "(:swot IS NULL OR d.swot = :swot) AND " +
            "(:country IS NULL OR d.country = :country) AND " +
            "(:city IS NULL OR d.city = :city)")
    List<DataEntity> findDataByFilters(
            Integer endYear,
            String topic,
            String sector,
            String region,
            String source,
            String swot,
            String country,
            String city
    );

    @Query("SELECT distinct d.endYear from DataEntity d")
    List<Integer> findDistinctEndYears();
}
