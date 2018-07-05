package com.example.booking.Controller;

import com.example.booking.Entity.Oda;

import com.example.booking.Service.OdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/oda")

public class OdaController {
    @Autowired
    OdaService odaService;

    @RequestMapping(path = "/findOda",method = RequestMethod.GET)
    public @ResponseBody
    List<Oda> getOdaAll()
    {
        return odaService.getOdaAll();
    }

    @RequestMapping(path = "/saveOda", method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody
    HttpStatus saveOda(@RequestBody Oda oda)
    {
        try
        {
            odaService.setOda(oda);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }


    @RequestMapping(path = "/findOdaId/{odaId}",method = RequestMethod.GET)
    public @ResponseBody
    Oda findOdaId (@PathVariable Long odaId)
    {
        return odaService.findOdaId(odaId);
    }

    @RequestMapping(path = "/deleteOdaId/{odaId}",method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus  deleteOdaId (@PathVariable Long odaId)
    {
        try
        {
            odaService.deleteOdaId(odaId);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;

    }
    @RequestMapping(path = "/updateOdaId/{odaId}",method = RequestMethod.PUT)
    public @ResponseBody
    HttpStatus  updateOdaId (@PathVariable Long odaId,@RequestBody Oda yeniOda)
    {
        try
        {
            odaService.updateOdaId(odaId,yeniOda);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }

}
