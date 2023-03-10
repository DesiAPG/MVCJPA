package com.example.mvcjpa.models.dao;

import com.example.mvcjpa.models.entity.Client;

import java.util.List;

public interface IClientDAO {
    public List<Client> findAll();
}
