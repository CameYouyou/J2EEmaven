package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZooService {
    private List<Tigre> lesTigresduZoo = new ArrayList<Tigre>();

    public List<Tigre> recupeTigres() {
        return lesTigresduZoo;
    }

    public void addTigre(Tigre nouveauTigre) {
//            lesTigresduZoo.add(new Tigre("Tiger",2,'M'));
//            lesTigresduZoo.add(new Tigre("Tigrou",4,'M'));
//            lesTigresduZoo.add(new Tigre("Tigra",1,'F'));
//            lesTigresduZoo.add(new Tigre("Tigla",5,'F'));
        lesTigresduZoo.add((nouveauTigre));
    }

}
