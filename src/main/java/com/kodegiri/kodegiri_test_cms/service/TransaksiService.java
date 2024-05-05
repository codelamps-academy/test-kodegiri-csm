package com.kodegiri.kodegiri_test_cms.service;

import com.kodegiri.kodegiri_test_cms.entity.Transaksi;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 07.16
 * description: Kodegiri_Test_CMS
 */

public interface TransaksiService {
    List<Transaksi> getAllTransaksi();

    Transaksi getTransaksiById(Long id);

    Transaksi addTransaksi(Transaksi transaksi);

    void deleteTransaksi(Long id);
}
