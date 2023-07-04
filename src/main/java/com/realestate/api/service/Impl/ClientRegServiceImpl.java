package com.realestate.api.service.Impl;

import com.realestate.api.entity.ClientReg;
import com.realestate.api.repository.ClientRegRepository;
import com.realestate.api.service.ClientRegService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientRegServiceImpl implements ClientRegService {

    @Autowired
    private ClientRegRepository clientRegRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public ClientReg postClientId(ClientReg clientReg) {
        ClientReg reg = mapToEntity(clientReg);
        ClientReg savedReg = clientRegRepository.save(reg);
        return savedReg;
    }

    @Override
    public ClientReg postOneId(long id) {
        return clientRegRepository.findById(id).orElse(null);
    }

    @Override
    public List<ClientReg> showAllId() {
        return clientRegRepository.findAll();
    }

    @Override
    public ClientReg deleteById(long id) {
        return clientRegRepository.findById(id).orElse(null);
    }

    @Override
    public ClientReg updateById(ClientReg clientReg, long id) {
        ClientReg reg = clientRegRepository.findById(id).orElse(null);

            //reg.setClientId(clientReg.getClientId());
            reg.setClientName(clientReg.getClientName());
            reg.setClientAddress(clientReg.getClientAddress());
            reg.setGender(clientReg.getGender());
            reg.setEmail(clientReg.getEmail());
            reg.setPhoneNumber(clientReg.getPhoneNumber());
            reg.setUserName(clientReg.getUserName());
            reg.setPassword(clientReg.getPassword());
            ClientReg updatedReg = clientRegRepository.save(reg);
            return  mapToEntity(updatedReg);


}

    private ClientReg mapToEntity(ClientReg clientReg) {
        return mapper.map(clientReg, ClientReg.class);
    }
}
