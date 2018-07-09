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
        return  odaRepository.findOdaByOdaId(odaId);
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
        setOda(yeniOda);

    }


}
