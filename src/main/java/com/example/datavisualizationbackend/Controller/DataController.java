package com.example.datavisualizationbackend.Controller;
import com.example.datavisualizationbackend.DTO.DataModel;
import com.example.datavisualizationbackend.Entity.DataEntity;
import com.example.datavisualizationbackend.Service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api/data")
public class DataController {

    @Autowired
    DataService dataService;



    @GetMapping("/getall")//end point to get all the data
    public List<DataModel> getAllData() {
        return dataService.getAllData();
    }

    @GetMapping("/filter")
    public List<DataEntity> getDataWithFilters( Integer endYear,
                                                String topic,
                                                String sector,
                                                String region,
                                                String source,
                                                String swot,
                                                String country,
                                                String city)
    {
       return DataService.getDataWithFilters(endYear,topic,sector,region,source,swot,country,city);

    }

    @GetMapping("/swot")
    public Map<String, Integer> getSwotCounts() {
        return DataService.getSwotCounts();
    }

    @GetMapping("/endYears")
    public List<Integer> getEndYears() {
        return dataService.getEndYears();
    }

}
