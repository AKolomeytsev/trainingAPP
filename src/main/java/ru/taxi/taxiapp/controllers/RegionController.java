package ru.taxi.taxiapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.taxi.taxiapp.models.Region;
import ru.taxi.taxiapp.services.RegionService;

import java.util.Collection;

@RestController
@RequestMapping("region")
public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @GetMapping("")
    public String getAllRegion(Model model){
        Collection<Region> regions = regionService.getRegion("");
        model.addAttribute("regions",regions);
        return "getAllRegions";

    }

    @GetMapping("/getAll/{param}")
    public ResponseEntity<Collection<Region>> getRegion(@PathVariable String param){
        Collection<Region> regions = regionService.getRegion(param.trim());
        return ResponseEntity.ok(regions);

    }

    @PostMapping(path = "/add")
    public ResponseEntity<Region> postRegion(@RequestBody Region param){
        Region region = regionService.save(param);
        return ResponseEntity.ok(region);

    }

    @PutMapping(path = "/update")
    public ResponseEntity<Region> putRegion(@RequestBody Region param){
        Region region = regionService.save(param);
        return ResponseEntity.ok(region);

    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<Region> deleteRegion(@RequestBody Region param){
        Region region = regionService.delete(param);
        return ResponseEntity.ok(region);

    }


}
