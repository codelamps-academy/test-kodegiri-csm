package com.kodegiri.kodegiri_test_cms.service.impl;

import com.kodegiri.kodegiri_test_cms.entity.Transaksi;
import com.kodegiri.kodegiri_test_cms.repository.TransaksiRepository;
import com.kodegiri.kodegiri_test_cms.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 07.18
 * description: Kodegiri_Test_CMS
 */

@Service
public class TransaksiServiceImpl implements TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Override
    public List<Transaksi> getAllTransaksi() {
        return transaksiRepository.findAll();
    }

    @Override
    public Transaksi getTransaksiById(Long id) {
        return transaksiRepository.findById(id).orElse(null);
    }

    @Override
    public Transaksi addTransaksi(Transaksi transaksi) {
        return transaksiRepository.save(transaksi);
    }

    @Override
    public void deleteTransaksi(Long id) {
        transaksiRepository.deleteById(id);
    }
}
