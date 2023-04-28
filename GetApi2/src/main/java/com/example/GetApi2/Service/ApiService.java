package com.example.GetApi2.Service;

import com.example.GetApi2.Entity.ApiEntity;
import com.example.GetApi2.Repository.ApiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    ApiRepository apiRepository;



    public  List<ApiEntity> getEmployerData()
    {
        return apiRepository.findAll();
    }
}
