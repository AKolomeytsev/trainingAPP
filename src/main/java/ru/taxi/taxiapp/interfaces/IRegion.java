package ru.taxi.taxiapp.interfaces;

import ru.taxi.taxiapp.models.Region;

import java.util.Collection;

public interface IRegion {
    public Collection<Region> getRegion(String param);
    public Region save(Region object);
    public Region delete(Region object);
}
