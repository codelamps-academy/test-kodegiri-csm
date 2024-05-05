package com.kodegiri.kodegiri_test_cms.service;

import com.kodegiri.kodegiri_test_cms.entity.Perusahaan;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 06.42
 * description: Kodegiri_Test_CMS
 */


public interface PerusahaanService {

    List<Perusahaan> getAllPerusahaan();

    Perusahaan getPerusahaanById(Long id);

    Perusahaan addPerusahaan(Perusahaan perusahaan);

    Perusahaan updatePerusahaan(Long id, Perusahaan perusahaanUpdate);

    void deletePerusahaan(Long id);
}
