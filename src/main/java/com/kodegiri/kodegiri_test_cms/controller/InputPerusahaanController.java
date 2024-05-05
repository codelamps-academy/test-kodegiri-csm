package com.kodegiri.kodegiri_test_cms.controller;

import com.kodegiri.kodegiri_test_cms.entity.Perusahaan;
import com.kodegiri.kodegiri_test_cms.repository.PerusahaanRepository;
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
 * Time: 10.42
 * description: Kodegiri_Test_CMS
 */

@Controller
public class InputPerusahaanController {

    @Autowired
    private PerusahaanRepository perusahaanRepository;

    @GetMapping("/input-perusahaan")
    public String showInputPerusahaan(){
        return "input-perusahaan";
    }

    @PostMapping("/save-company")
    public String saveCompany(String kodePerusahaan, String namaPerusahaan, Model model) {
        // Simpan data perusahaan ke database
        Perusahaan perusahaan = new Perusahaan(kodePerusahaan, namaPerusahaan);
        perusahaanRepository.save(perusahaan);

        model.addAttribute("message", "Data perusahaan berhasil disimpan.");
        return "input-perusahaan";
    }
}
