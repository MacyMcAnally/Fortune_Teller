package com.revature.hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Fortune {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @CreatedDate
  private LocalDate date;
  private String message;
  @ManyToOne
  @JoinColumn(name = "user_id")

  private User user;

}
