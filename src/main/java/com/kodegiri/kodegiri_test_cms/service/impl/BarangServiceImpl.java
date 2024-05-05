package com.kodegiri.kodegiri_test_cms.service.impl;

import com.kodegiri.kodegiri_test_cms.entity.Barang;
import com.kodegiri.kodegiri_test_cms.repository.BarangRepository;
import com.kodegiri.kodegiri_test_cms.service.BarangService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 07.15
 * description: Kodegiri_Test_CMS
 */

@Service
public class BarangServiceImpl implements BarangService {

    @Autowired
    private BarangRepository barangRepository;

    @Override
    public List<Barang> getAllBarang() {
        return barangRepository.findAll();
    }

    @Override
    public Barang getBarangById(Long id) {
        return barangRepository.findById(id).orElse(null);
    }

    @Override
    public Barang addBarang(Barang barang) {
        return barangRepository.save(barang);
    }

    @Override
    public Barang updateBarang(Long id, Barang barangUpdate) {
        Barang existingBarang = barangRepository.findById(id).orElse(null);
        if (existingBarang != null){
            existingBarang.setNama(barangUpdate.getNama());
            existingBarang.setHarga(barangUpdate.getHarga());
            existingBarang.setStock(barangUpdate.getStock());
            return barangRepository.save(existingBarang);
        }
        return null;
    }

    @Override
    public void deleteBarang(Long id) {
        barangRepository.deleteById(id);
    }
}
