package com.example.booking.Service;

import com.example.booking.Entity.Odeme;
import com.example.booking.Repository.OdemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdemeService {
    @Autowired
    OdemeRepository odemeRepository;
    //bul
    public List<Odeme> getOdemeAll()
    {
        return odemeRepository.findAll();
    }

    //kaydet
    public void setOdeme(Odeme odeme)
    {
        odemeRepository.save(odeme);
    }
    //ıdBul
    public Odeme findOdemeId (Long odemeId)
    {
//        null check
        return  odemeRepository.findOdemesByOdemeId(odemeId);
    }
    //sil
    public void deleteOdemeId(Long odemeId)
    {
        odemeRepository.delete(odemeId);
    }
    //güncelleme
    public void updateOdemeId(Long odemeId,Odeme yeniOdeme)
    {
        Odeme odeme=findOdemeId(odemeId);
        setOdeme(yeniOdeme);

    }


}
