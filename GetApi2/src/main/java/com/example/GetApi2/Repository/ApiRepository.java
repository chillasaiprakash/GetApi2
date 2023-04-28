package com.example.GetApi2.Repository;

import com.example.GetApi2.Entity.ApiEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<ApiEntity,Long> {
}

