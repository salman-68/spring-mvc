package com.sathya.springboot.project3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.springboot.project3.entity.RegistrationEntity;
import com.sathya.springboot.project3.model.RegistrationModel;
import com.sathya.springboot.project3.repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public void savedData(RegistrationModel registrationModel) {
        RegistrationEntity registrationEntity = new RegistrationEntity();
        registrationEntity.setName(registrationModel.getName());
        registrationEntity.setPassword(registrationModel.getPassword());
        registrationEntity.setAddress(registrationModel.getAddress());
        registrationEntity.setGender(registrationModel.getGender());
        registrationEntity.setHobbies(registrationModel.getHobbies());
        registrationEntity.setMobilenumber(registrationModel.getMobilenumber());
        registrationEntity.setQualification(registrationModel.getQualification());
        registrationEntity.setState(registrationModel.getState());
        registrationRepository.save(registrationEntity);
    }

    public List<RegistrationEntity> getAllRegisters() {
        return registrationRepository.findAll();
    }
    //SearchById.
    public RegistrationEntity searchById(Integer id) {
    	Optional<RegistrationEntity> optionalData=registrationRepository.findById(id);
    	if(optionalData.isPresent()) {
    		RegistrationEntity registers=optionalData.get();
    		return registers;
    	}
    	else
    	{
    		return null;
    	}
    	}
    //deleting record by id.
     public void deleteById(Integer id) {
    	 registrationRepository.deleteById(id);
     }
     //edit
     public RegistrationEntity editbyid(Integer id) {
    		
    	 RegistrationEntity prev = registrationRepository.findById( id)
    	            .orElseThrow(() -> new RuntimeException("Product not found"));
    RegistrationEntity  registrationEntity=new RegistrationEntity();
    		//prev.setId(registrationEntity.getId());
    		prev.setName(registrationEntity.getName());
    		prev.setPassword(registrationEntity.getPassword());
    		prev.setMobilenumber(registrationEntity.getMobilenumber());
    		prev.setHobbies(registrationEntity.getHobbies());
    		prev.setQualification(registrationEntity.getQualification());
    		prev.setState(registrationEntity.getState());
    		prev.setAddress(registrationEntity.getAddress());
    		registrationRepository.save(prev);	
    		return prev;

    	
    }

     public void updateRegistration(Integer id, RegistrationModel registrationModel) { 
    	 RegistrationEntity entity = registrationRepository.findById(id) .orElseThrow(() -> new RuntimeException("Registration not found")); // Manually set each property
    	 entity.setName(registrationModel.getName()); 
    	 entity.setPassword(registrationModel.getPassword()); 
    	 entity.setMobilenumber(registrationModel.getMobilenumber());
    	 entity.setGender(registrationModel.getGender());
    	 entity.setState(registrationModel.getState());
    	 entity.setQualification(registrationModel.getQualification());
    	 entity.setHobbies(registrationModel.getHobbies());
    	 entity.setAddress(registrationModel.getAddress()); 
    	 // Save the updated entity registrationRepository.save(entity);
    	 registrationRepository.save(entity);
     }
}
