package com.example.booking.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Odeme")
public class Odeme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long odemeId;
    String odemeTuru;

    @ManyToOne
    @JoinColumn(name = "musteriListesi")
    Musteri musteriListesi;


}
