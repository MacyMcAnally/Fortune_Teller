package com.revature.hackathon.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Fortune {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int fortuneMessageId;
  @CreationTimestamp
  private LocalDateTime date;
  private String message;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

}
