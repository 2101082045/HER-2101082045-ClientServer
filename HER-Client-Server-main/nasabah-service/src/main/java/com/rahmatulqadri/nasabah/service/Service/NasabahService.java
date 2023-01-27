/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rahmatulqadri.nasabah.service.Service;

import com.rahmatulqadri.nasabah.service.Entity.Nasabah;
import com.rahmatulqadri.nasabah.service.Repository.NasabahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service

public class NasabahService {
    @Autowired
    private NasabahRepository nasabahRepository;
    
    public Nasabah saveNasabah(Nasabah nasabah) {
        return nasabahRepository.save(nasabah);
    }
    
    public Nasabah findNasabahById(Long nasabahId){
        return nasabahRepository.findByNasabahId(nasabahId);
    }
}
