package com.kodegiri.kodegiri_test_cms.controller;

import com.kodegiri.kodegiri_test_cms.entity.Transaksi;
import com.kodegiri.kodegiri_test_cms.service.TransaksiService;
import com.kodegiri.kodegiri_test_cms.util.CsvUtils;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 12.48
 * description: Kodegiri_Test_CMS
 */

@Controller
public class ExportCSVController {

    @Autowired
    private TransaksiService transaksiService;

    @GetMapping("export-csv")
    public String showExportCSV(Model model){
        return "download-csv";
    }

    @GetMapping("/download-transaction")
    public void exportTransaction(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=\"transaction.csv\"");

        List<Transaksi> transaksi = transaksiService.getAllTransaksi();

        CsvUtils.downloadCsv(response.getWriter(), transaksi);
    }


}
