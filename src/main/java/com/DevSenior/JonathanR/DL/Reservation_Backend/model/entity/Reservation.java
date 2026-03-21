package com.DevSenior.JonathanR.DL.Reservation_Backend.model.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservations")
@Getter
@Setter
public class Reservation {
    /*
    * id: Long
    * nombre: String
    * email: String
    * phone: String
    * date: LocalDate
    * time: LocalTime
    * guests: int
    * notes: String
    */
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "customer_name", length = 100, nullable = false)
   private String customerName;
   
   @Column(name = "date", nullable = false)
   private LocalDate date;
   
   @Column(name = "time", nullable = false)
   private LocalTime time;
   
   @Column(name = "service", length = 100, nullable = false)
   private String service;
   
   @Column(name = "status", nullable = false)
   private ReservationStatus status;

}
