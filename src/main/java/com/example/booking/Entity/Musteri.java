package com.example.booking.Entity;
import javax.persistence.*;

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

    @JoinTable(name = "Musteri_Oda",
              joinColumns = {@JoinColumn(name = "musteriId",referencedColumnName = "musteriId")},
              inverseJoinColumns = {@JoinColumn(name="odaId",referencedColumnName = "odaId")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Oda> odaListesi;
////////
    @OneToMany(mappedBy = "musteriListesi")
    List<Odeme> odemeListesi;

    @OneToMany(mappedBy = "musteriListesi")
    List <Rezervasyon> rezervasyonListesi;



}
