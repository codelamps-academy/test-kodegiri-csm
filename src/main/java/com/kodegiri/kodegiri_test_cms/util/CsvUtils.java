package com.kodegiri.kodegiri_test_cms.util;

import com.kodegiri.kodegiri_test_cms.entity.Transaksi;

import java.io.PrintWriter;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 13.04
 * description: Kodegiri_Test_CMS
 */
public class CsvUtils {

    public static void downloadCsv(PrintWriter writer, List<Transaksi> transaksi){
        writer.write("Perusahaan, Barang, Total Barang\n");
        for (Transaksi transaksi1 : transaksi){
            writer.write(transaksi1.getPerusahaan() + "," + transaksi1.getBarang() + "," + transaksi1.getTotalBarang() + "\n");

        }
    }
}
