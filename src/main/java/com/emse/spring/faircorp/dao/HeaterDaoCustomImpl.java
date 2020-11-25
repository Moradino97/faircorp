package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Heater;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class HeaterDaoCustomImpl implements HeaterDaoCustom {


    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Heater> deleteAllHeater() {
        String jpql = "delete from Heater h";
        return em.createQuery(jpql, Heater.class)
                .getResultList();
    }
}
