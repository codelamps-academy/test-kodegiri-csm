package com.kodegiri.kodegiri_test_cms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
     *  Created by IntelliJ IDEA.
     *  Made with love ❤️❤️❤️
     *  User: Andre Rizaldi Brillianto
     *  Email: andrerizaldib@gmail.com
     *  Date: 05/05/24
     *  Time: 06.29
     *  description: Kodegiri_Test_CMS
     */

@Entity
@Table(name = "perusahaans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Perusahaan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull(message = "kode perusahaan tidak boleh null")
    private String kodePerusahaan;

    @NotNull(message = "nama perusahaan tidak boleh null")
    private String namaPerusahaan;

    public Perusahaan(String kodePerusahaan, String namaPerusahaan) {
        this.kodePerusahaan = kodePerusahaan;
        this.namaPerusahaan = namaPerusahaan;
    }
}
