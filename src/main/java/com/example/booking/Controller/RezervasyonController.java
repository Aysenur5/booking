package com.example.booking.Controller;

import com.example.booking.Entity.Rezervasyon;
import com.example.booking.Service.RezervasyonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/rezervasyon")

public class  RezervasyonController {
    @Autowired
    RezervasyonService rezervasyonService;

    @RequestMapping(path = "/findRezervasyon",method = RequestMethod.GET)
    public @ResponseBody
    List<Rezervasyon> getRezervasyonAll()
    {
        return rezervasyonService.getRezervasyonAll();
    }

    @RequestMapping(path = "/saveRezervasyon", method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody
    HttpStatus saveRezervasyon(@RequestBody Rezervasyon rezervasyon)
    {
        try
        {
            rezervasyonService.setRezervasyon(rezervasyon);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }


    @RequestMapping(path = "/findRezervasyonId/{rezervasyonId}",method = RequestMethod.GET)
    public @ResponseBody
    Rezervasyon findRezervasyonId (@PathVariable Long rezervasyonId)
    {
        return rezervasyonService.findRezervasyonId(rezervasyonId);
    }

    @RequestMapping(path = "/deleteRezervasyonId/{rezervasyonId}",method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus  deleteRezervasyonId (@PathVariable Long rezervasyonId)
    {
        try
        {
            rezervasyonService.deleteRezervasyonId(rezervasyonId);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;

    }
    @RequestMapping(path = "/updateRezervasyonId/{rezervasyonId}",method = RequestMethod.PUT)
    public @ResponseBody
    HttpStatus  updateRezervasyonId (@PathVariable Long rezervasyonId,@RequestBody Rezervasyon yeniRezervasyon)
    {
        try
        {
            rezervasyonService.updateRezervasyonId(rezervasyonId,yeniRezervasyon);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }

}
