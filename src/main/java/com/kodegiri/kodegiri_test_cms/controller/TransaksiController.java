package com.kodegiri.kodegiri_test_cms.controller;

import com.kodegiri.kodegiri_test_cms.entity.Barang;
import com.kodegiri.kodegiri_test_cms.entity.Perusahaan;
import com.kodegiri.kodegiri_test_cms.entity.Transaksi;
import com.kodegiri.kodegiri_test_cms.repository.PerusahaanRepository;
import com.kodegiri.kodegiri_test_cms.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 11.22
 * description: Kodegiri_Test_CMS
 */

@Controller
public class TransaksiController {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Autowired
    private PerusahaanRepository perusahaanRepository;

    @GetMapping("/input-transaksi")
    public String showInputTransaksi(Model model){
        model.addAttribute("perusahaanList", transaksiRepository.findAll());
        return "input-transaksi";
    }

    @PostMapping("/save-transaction")
    public String saveTransaction(String namaPerusahaan, String namaBarang, int totalBarang, Model model){
        // temukan perusahaan berdasarkan nama
        Perusahaan perusahaan = perusahaanRepository.findPerusahaanByNamaPerusahaan(namaPerusahaan);

        // TRANSAKSI BISA TERJADI KETIKA KITA SUDAH MEMBUAT PERUSAHAAN
        if (perusahaan != null){
            // simpan transaksi ke database
            Transaksi transaksi = new Transaksi(perusahaan, namaBarang, totalBarang);
            transaksiRepository.save(transaksi);

            model.addAttribute("message", "Data Transaksi berhasil disimpan");
        } else {
            model.addAttribute("message", "Perusahaan tidak ditemukan");
        }
        return "input-transaksi";
    }
}
