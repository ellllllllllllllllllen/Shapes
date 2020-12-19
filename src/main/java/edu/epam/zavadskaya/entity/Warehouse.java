package edu.epam.zavadskaya.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    public final static Warehouse INSTANCE = new Warehouse();
    private final Map<Long, BallParameter> map;

    private Warehouse(){
        map = new HashMap<>();
    }

    public static Warehouse getInstance() {
        return INSTANCE;
    }

    public Map<Long,BallParameter> getMap(){
        return new HashMap<>(map);
    }

    public BallParameter getById(Long id){
        return map.get(id);
    }

    public void put(Long id, BallParameter ballParameter){
        map.put(id, ballParameter);
    }

    public void remove(Long id){
        map.remove(id);
    }
}
