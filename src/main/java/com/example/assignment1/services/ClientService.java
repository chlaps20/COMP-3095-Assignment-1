package com.example.assignment1.services;

import com.example.assignment1.model.Client;

public interface ClientService extends CrudService<Client,Long>{

    Client findbyLastName(String Lastname);

}
