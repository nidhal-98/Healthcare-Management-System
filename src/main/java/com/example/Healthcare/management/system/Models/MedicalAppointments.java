package com.example.Healthcare.management.system.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Data
@Table(name = "Appointments")
public class MedicalAppointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Integer patientID;
    Integer doctorId;
    Date appointmentDate;
    String status;
}
