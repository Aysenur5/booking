package com.example.booking.Controller;

import com.example.booking.Entity.Musteri;
import com.example.booking.Service.MusteriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/musteri")

public class  MusteriController {
    @Autowired
    MusteriService musteriService;

    @RequestMapping(path = "/findMusteri",method = RequestMethod.GET)
    public @ResponseBody
    List<Musteri> getMusteriAll()
    {
        return musteriService.getMusteriAll();
    }

    @RequestMapping(path = "/saveMusteri", method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody
    HttpStatus saveMusteri(@RequestBody Musteri musteri)
    {
        try
        {
            musteriService.setMusteri(musteri);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }


    @RequestMapping(path = "/findMusteriId/{musteriId}",method = RequestMethod.GET)
    public @ResponseBody
    Musteri findMusteriId (@PathVariable Long musteriId)
    {
        return musteriService.findMusteriId(musteriId);
    }

    @RequestMapping(path = "/deleteMusteriId/{musteriId}",method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus  deleteMusteriId (@PathVariable Long musteriId)
    {
        try
        {
            musteriService.deleteMusteriId(musteriId);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;

    }
    @RequestMapping(path = "/updateMusteriId/{musteriId}",method = RequestMethod.PUT)
    public @ResponseBody
    HttpStatus  updateMusteriId (@PathVariable Long musteriId,@RequestBody Musteri yeniMusteri)
    {
        try
        {
            musteriService.updateMusteriId(musteriId,yeniMusteri);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }

}
