package com.example.Healthcare.management.system.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
@Table(name = "TestResults")
public class TestResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Integer patientID;
    Integer doctorId;
    String conductedType;
}
