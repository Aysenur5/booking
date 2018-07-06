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
@Table(name = "Oda")
public class Oda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long odaId;

    String odaIsmi;
    String odaDurumu;
    String odaNo;
    String odaTuru;
    String girisTarihi;
    String cikisTarihi;

    @JsonBackReference
    @ManyToMany(mappedBy = "odaListesi")
    List<Musteri> musteriListesi;


    @ManyToMany
    List <Rezervasyon>  rezervasyonListesi;




}
