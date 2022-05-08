package ru.taxi.taxiapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.taxi.taxiapp.models.Region;
import ru.taxi.taxiapp.services.RegionService;

import java.util.List;

@Controller
@RequestMapping("regionWeb")
public class RegionWebController {

    private final RegionService regionService;

    public RegionWebController(RegionService regionService) {
        this.regionService = regionService;
    }

   @GetMapping(path = "/getAllRegions")
    public String getRegions(Model model){
        List<Region> regions = (List<Region>) regionService.getRegion("");
        model.addAttribute("regions",regions);
        regionService.print(regions);
        return "getAllRegions";
   }

    @GetMapping ("/putRegion/{param}")
    public String putRegion(@PathVariable String param,Model model){
        List<Region> regions = (List<Region>) regionService.getRegion(param);
        model.addAttribute("region",regions.get(0));
        return "updateRegion";
    }

    @PostMapping(path = "/updateRegion")
    public String updateRegion(Region param,Model model){
        Region region = regionService.save(param);
        List<Region> regions = (List<Region>) regionService.getRegion("");
        model.addAttribute("regions",regions);
        return "redirect:getAllRegions";
    }

    @GetMapping ("/deleteRegion/{param}")
    public String deleteRegion(@PathVariable String param,Model model){
        Region region = regionService.delete(param);
        List<Region> regions = (List<Region>) regionService.getRegion("");
        model.addAttribute("region",regions);
        return "redirect:../getAllRegions";
    }

}
