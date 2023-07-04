package com.realestate.api.repository;


import com.realestate.api.entity.ClientReg;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRegRepository  extends JpaRepository<ClientReg, Long> {

}
