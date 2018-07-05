package com.example.booking.Controller;

import com.example.booking.Entity.Odeme;
import com.example.booking.Service.OdemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/odeme")

public class  OdemeController {
    @Autowired
    OdemeService odemeService;

    @RequestMapping(path = "/findOdeme",method = RequestMethod.GET)
    public @ResponseBody
    List<Odeme> getOdemeAll()
    {
        return odemeService.getOdemeAll();
    }

    @RequestMapping(path = "/saveOdeme", method = RequestMethod.POST,consumes = "application/json")
    public @ResponseBody
    HttpStatus saveOdeme(@RequestBody Odeme odeme)
    {
        try
        {
            odemeService.setOdeme(odeme);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }


    @RequestMapping(path = "/findOdemeId/{odemeId}",method = RequestMethod.GET)
    public @ResponseBody
    Odeme findOdemeId (@PathVariable Long odemeId)
    {
        return odemeService.findOdemeId(odemeId);
    }

    @RequestMapping(path = "/deleteOdemeId/{odemeId}",method = RequestMethod.DELETE)
    public @ResponseBody
    HttpStatus  deleteOdemeId (@PathVariable Long odemeId)
    {
        try
        {
            odemeService.deleteOdemeId(odemeId);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;

    }
    @RequestMapping(path = "/updateOdemeId/{odemeId}",method = RequestMethod.PUT)
    public @ResponseBody
    HttpStatus  updateOdemeId (@PathVariable Long odemeId,@RequestBody Odeme yeniOdeme)
    {
        try
        {
            odemeService.updateOdemeId(odemeId,yeniOdeme);
        }
        catch (Exception e)
        {

        }
        return  HttpStatus.OK;
    }

}
