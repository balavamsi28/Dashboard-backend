package com.example.datavisualizationbackend.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Table(name = "DATA")
@Data
public class DataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private int id;

    @Column(name = "ENDYEAR")
    private int endYear;
    @Column(name = "CITYLNG")
    private double cityLng;
    @Column(name = "CITYLAT")
    private double cityLat;
    @Column(name = "INTENSITY")
    private int intensity;
    @Column(name = "SECTOR")
    private String sector;
    @Column(name = "TOPIC")
    private String topic;
    @Column(name = "INSIGHT")
    private String insight;
    @Column(name = "SWOT")
    private String swot;
    @Column(name = "URL")
    private String url;
    @Column(name = "REGION")
    private String region;
    @Column(name = "STARTYEAR")
    private String startYear;
    @Column(name = "IMPACT")
    private Integer impact;
    @Column(name = "ADDED")
    private String added;
    @Column(name = "PUBLISHED")
    private String published;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "RELEVANCE")
    private String relevance;
    @Column(name = "PESTLE")
    private String pestle;
    @Column(name = "SOURCE")
    private String source;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "LIKELIHOOD")
    private String likelihood;

}
