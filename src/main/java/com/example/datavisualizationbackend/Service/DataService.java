package com.example.datavisualizationbackend.Service;

import com.example.datavisualizationbackend.DTO.DataModel;
import com.example.datavisualizationbackend.Entity.DataEntity;
import com.example.datavisualizationbackend.Repository.DataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataService {

    public static DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public static List<DataEntity> getDataWithFilters(Integer endYear, String topic, String sector, String region, String source, String swot, String country, String city) {
    return dataRepository.findDataByFilters(endYear, topic, sector, region, source, swot, country, city);
    }


    public List<DataModel> getAllData() {
        List<DataEntity> dataEntities = dataRepository.findAll();
        return dataEntities.stream().map(this::mapEntityToDto).collect(Collectors.toList());
    }

    private DataModel mapEntityToDto(DataEntity entity) {
        DataModel dto = new DataModel();
        dto.setId(entity.getId());
        dto.setEndYear(entity.getEndYear());
        dto.setCityLng(entity.getCityLng());
        dto.setCityLat(entity.getCityLat());
        dto.setIntensity(entity.getIntensity());
        dto.setSector(entity.getSector());
        dto.setTopic(entity.getTopic());
        dto.setInsight(entity.getInsight());
        dto.setSwot(entity.getSwot());
        dto.setUrl(entity.getUrl());
        dto.setRegion(entity.getRegion());
        dto.setStartYear(entity.getStartYear());
        Integer impact = entity.getImpact();
        int impactValue=(impact!=null)?impact.intValue():0;
        dto.setImpact(impactValue);
        dto.setAdded(entity.getAdded());
        dto.setPublished(entity.getPublished());
        dto.setCity(entity.getCity());
        dto.setCountry(entity.getCountry());
        dto.setRelevance(entity.getRelevance());
        dto.setPestle(entity.getPestle());
        dto.setSource(entity.getSource());
        dto.setTitle(entity.getTitle());
        dto.setLikelihood(entity.getLikelihood());
        return dto;
    }
}
