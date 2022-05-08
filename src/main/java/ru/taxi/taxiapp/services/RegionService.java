package ru.taxi.taxiapp.services;

import org.springframework.stereotype.Service;
import ru.taxi.taxiapp.models.Region;
import ru.taxi.taxiapp.interfaces.IRegion;
import ru.taxi.taxiapp.repositorys.IRegionRepository;

import java.util.Collection;
import java.util.List;

@Service
public class RegionService implements IRegion {
    private final IRegionRepository regionRepository;

    public RegionService(IRegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public Collection<Region> getRegion(String param) {
        Collection<Region> returnRegion = null;
        if(param.length()>3){
            returnRegion = regionRepository.getRegionById(param);
        }else if(param.length()>0 && param.length()<=3){
            returnRegion = regionRepository.getRegionByCodeRegion(param);
        }else{
            returnRegion = regionRepository.findAllBy();
        }
        return returnRegion;
    }

    @Override
    public Region save(Region object) {
        List<Region> region = null;
        regionRepository.save(object);
        region = (List<Region>) getRegion(object.getCodeRegion());
        return region.get(0);
    }

    @Override
    public Region delete(Region object) {
        List<Region> region = (List<Region>) getRegion(object.getCodeRegion());
        if(region.size() == 1){
            String regionId = region.get(0).getId();
            regionRepository.deleteById(regionId);
            return object;
        }
        return null;
    }

    public Region delete(String id) {
        List<Region> region = (List<Region>) getRegion(id);
        if(region.size() == 1){
            regionRepository.deleteById(id);
            return region.get(0);
        }
        return null;
    }

    public void print(List<Region> list){
        for(Region item : list){
            System.out.println(item.toString());
        }
    }
}
