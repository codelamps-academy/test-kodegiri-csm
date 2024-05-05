package com.kodegiri.kodegiri_test_cms.service;

import com.kodegiri.kodegiri_test_cms.entity.Barang;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 07.13
 * description: Kodegiri_Test_CMS
 */


public interface BarangService {

    List<Barang> getAllBarang();

    Barang getBarangById(Long id);

    Barang addBarang(Barang barang);

    Barang updateBarang(Long id, Barang barangUpdate);

    void deleteBarang(Long id);
}
