package com.example.booking.Service;

import com.example.booking.Entity.Musteri;
import com.example.booking.Repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusteriService {
    @Autowired
    MusteriRepository musteriRepository;
//bul
    public List<Musteri> getMusteriAll()
    {
        return musteriRepository.findAll();
    }

//kaydet
    public void setMusteri(Musteri musteri)
    {
        musteriRepository.save(musteri);
    }
//ıdBul
    public Musteri findMusteriId (Long musteriId)
    {
//        null check
       return  musteriRepository.findMusterisByMusteriId(musteriId);
    }
//sil
    public void deleteMusteriId(Long musteriId)
    {
        musteriRepository.delete(musteriId);
    }
//güncelleme
    public void updateMusteriId(Long musteriId,Musteri yeniMusteri)
    {
        Musteri musteri=findMusteriId(musteriId);

        musteri.setTc(yeniMusteri.getTc());
        musteri.setAdi(yeniMusteri.getAdi());
        musteri.setSoyadi(yeniMusteri.getSoyadi());
        musteri.setCinsiyet(yeniMusteri.getCinsiyet());
        musteri.setTelefonno(yeniMusteri.getTelefonno());

        setMusteri(musteri);

    }


}
