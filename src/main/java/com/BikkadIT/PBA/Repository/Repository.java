package com.BikkadIT.PBA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.PBA.Model.Model;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Model, Integer> {

}
