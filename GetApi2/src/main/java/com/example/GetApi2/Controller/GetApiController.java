package com.example.GetApi2.Controller;

import com.example.GetApi1.Entity.ApiEntity;
import com.example.GetApi1.Service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GetApiController {
    @Autowired
    ApiService apiService;
    @GetMapping("/getData")
    public List<ApiEntity> getData() {
        return apiService.getEmployerData();
    }

}