package com.klef.soa.exam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "organicfarms")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganicFarmEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Farmname;

    @Column(nullable = false)
    private String cropType;

    @Column(nullable = false)
    private Double areaAcres;

    @Column(nullable = false)
    private Boolean certified;
}
