package com.kodegiri.kodegiri_test_cms.service.impl;

import com.kodegiri.kodegiri_test_cms.entity.Perusahaan;
import com.kodegiri.kodegiri_test_cms.repository.PerusahaanRepository;
import com.kodegiri.kodegiri_test_cms.service.PerusahaanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 06.47
 * description: Kodegiri_Test_CMS
 */

@Service
public class PerusahaanServiceImpl implements PerusahaanService {

    @Autowired
    private PerusahaanRepository perusahaanRepository;

    @Override
    public List<Perusahaan> getAllPerusahaan() {
        return perusahaanRepository.findAll();
    }

    @Override
    public Perusahaan getPerusahaanById(Long id) {
        return perusahaanRepository.findById(id).orElse(null);
    }

    @Override
    public Perusahaan addPerusahaan(Perusahaan perusahaan) {
        return perusahaanRepository.save(perusahaan);
    }

    @Override
    public Perusahaan updatePerusahaan(Long id, Perusahaan perusahaanUpdate) {
        Perusahaan existingPerusahaan = perusahaanRepository.findById(id).orElse(null);
        if (existingPerusahaan != null){
            existingPerusahaan.setKodePerusahaan(perusahaanUpdate.getKodePerusahaan());
            existingPerusahaan.setNamaPerusahaan(perusahaanUpdate.getNamaPerusahaan());
            return perusahaanRepository.save(existingPerusahaan);
        }
        return null;
    }

    @Override
    public void deletePerusahaan(Long id) {
        perusahaanRepository.deleteById(id);
    }
}
