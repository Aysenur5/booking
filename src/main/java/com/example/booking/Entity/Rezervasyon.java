package com.example.booking.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Rezervasyon")
public class Rezervasyon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long rezervasyonId;
    String aciklama;
    String rezerBasTar;
    String rezerBitTar;


//    @ManyToOne
//    Musteri musteriListesi;


    @JsonBackReference
    @ManyToMany(mappedBy = "rezervasyonListesi")
    List<Oda> oda;






}
