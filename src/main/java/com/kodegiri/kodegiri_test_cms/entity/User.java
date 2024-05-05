package com.kodegiri.kodegiri_test_cms.entity;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.AUTO;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 09.16
 * description: Kodegiri_Test_CMS
 */

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
}
