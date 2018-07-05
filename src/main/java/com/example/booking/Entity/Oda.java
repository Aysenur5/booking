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
@Table(name = "Oda")
public class Oda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long odaId;
    String odaIsmi;
    String odaDurumu;
    int odaNo;
    String odaTuru;
    Date girisTarihi;
    Date cikisTarihi;

    @ManyToMany(mappedBy = "odaListesi")
    List<Musteri> musteriListesi;

    @JoinTable(name = "Rezervasyon_Oda",
            joinColumns = {@JoinColumn(name = "odaId",referencedColumnName = "odaId")},
            inverseJoinColumns = {@JoinColumn(name="rezervasyonId",referencedColumnName = "rezervasyonId")})

   @ManyToMany(fetch = FetchType.EAGER)
   List <Rezervasyon>  rezervasyonListesi;




}
