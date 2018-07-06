package com.example.booking.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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


    @JsonBackReference
    @ManyToMany(mappedBy = "odemeListesi")
    List<Musteri> musteriListesi;


}
