package com.example.booking.Service;

import com.example.booking.Entity.Oda;

import com.example.booking.Repository.OdaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdaService {
    @Autowired
    OdaRepository odaRepository;
    //bul
    public List<Oda> getOdaAll()
    {
        return odaRepository.findAll();
    }

    //kaydet
    public void setOda(Oda oda)
    {
        odaRepository.save(oda);
    }
    //ıdBul
    public Oda findOdaId (Long odaId)
    {
//        null check
        return  odaRepository.findOdasByOdaId(odaId);
    }
    //sil
    public void deleteOdaId(Long odaId)
    {
        odaRepository.delete(odaId);
    }
    //güncelleme
    public void updateOdaId(Long odaId,Oda yeniOda)
    {
        Oda oda=findOdaId(odaId);

        oda.setOdaIsmi(yeniOda.getOdaIsmi());
        oda.setOdaDurumu(yeniOda.getOdaDurumu());
        oda.setOdaNo(yeniOda.getOdaNo());
        oda.setOdaTuru(yeniOda.getOdaTuru());
        oda.setGirisTarihi(yeniOda.getGirisTarihi());
        oda.setCikisTarihi(yeniOda.getCikisTarihi());

        setOda(oda);

    }


}
