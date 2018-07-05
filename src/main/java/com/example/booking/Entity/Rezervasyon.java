package com.example.booking.Entity;

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
    Date rezerBasTar;
    Date rezerBitTar;

    @ManyToOne
       @JoinColumn(name = "musteriListesi")
    Musteri musteriListesi;

    @ManyToMany(mappedBy = "rezervasyonListesi")
    List<Oda> odaListesi;







}
