package com.example.booking.Entity;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Musteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long musteriId;

    Long tc;
    String adi;
    String soyadi;
    char cinsiyet;
    int telefonno;



    @ManyToMany
    List<Oda> odaListesi;

   // @JsonBackReference
    @ManyToMany
      List<Odeme> odemeListesi;

//  //  @JsonBackReference
//    @OneToMany(mappedBy = "musteriListesi")
//    List <Rezervasyon> rezervasyonListesi;



}
