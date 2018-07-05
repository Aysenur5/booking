package com.example.booking.Service;

import com.example.booking.Entity.Rezervasyon;
import com.example.booking.Repository.RezervasyonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervasyonService {
    @Autowired
    RezervasyonRepository rezervasyonRepository;
    //bul
    public List<Rezervasyon> getRezervasyonAll()
    {
        return rezervasyonRepository.findAll();
    }

    //kaydet
    public void setRezervasyon(Rezervasyon rezervasyon)
    {
        rezervasyonRepository.save(rezervasyon);
    }
    //ıdBul
    public Rezervasyon findRezervasyonId (Long rezervasyonId)
    {
//        null check
        return  rezervasyonRepository.findRezervasyonsByRezervasyonId(rezervasyonId);
    }
    //sil
    public void deleteRezervasyonId(Long rezervasyonId)
    {
        rezervasyonRepository.delete(rezervasyonId);
    }
    //güncelleme
    public void updateRezervasyonId(Long rezervasyonId,Rezervasyon yeniRezervasyon)
    {
        Rezervasyon rezervasyon=findRezervasyonId(rezervasyonId);

        rezervasyon.setAciklama(yeniRezervasyon.getAciklama());
        rezervasyon.setRezerBasTar(yeniRezervasyon.getRezerBasTar());
        rezervasyon.setRezerBitTar(yeniRezervasyon.getRezerBitTar());


        setRezervasyon(rezervasyon);

    }


}
