package com.kodegiri.kodegiri_test_cms.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 06.33
 * description: Kodegiri_Test_CMS
 */

@Entity
@Table(name = "transaksis")
@Data
@NoArgsConstructor
public class Transaksi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "perusahaan_id")
    private Perusahaan perusahaan;

    private String barang;

    private int totalBarang;
    private Date tanggalInput;

    public Transaksi(Perusahaan perusahaan, String barang, int totalBarang) {
        this.perusahaan = perusahaan;
        this.barang = barang;
        this.totalBarang = totalBarang;
    }
}
