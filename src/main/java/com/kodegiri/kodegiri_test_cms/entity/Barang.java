package com.kodegiri.kodegiri_test_cms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 06.32
 * description: Kodegiri_Test_CMS
 */

@Entity
@Table(name = "barangs")
@Data
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "nama tidak boleh kosong")
    private String nama;

    @NotNull(message = "harga tidak boleh kosong")
    private double harga;

    @NotNull(message = "stock tidak boleh kosong")
    private int stock;

}
