package com.realestate.api.service;

import com.realestate.api.entity.ClientReg;

import java.util.List;

public interface ClientRegService {
    ClientReg postClientId(ClientReg clientReg);

    ClientReg postOneId(long id);

    List<ClientReg> showAllId();

    ClientReg deleteById( long id);

    ClientReg updateById(ClientReg clientReg, long id);
}
