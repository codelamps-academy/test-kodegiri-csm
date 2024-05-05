package com.kodegiri.kodegiri_test_cms.repository;

import com.kodegiri.kodegiri_test_cms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Made with love ❤️❤️❤️
 * User: Andre Rizaldi Brillianto
 * Email: andrerizaldib@gmail.com
 * Date: 05/05/24
 * Time: 09.18
 * description: Kodegiri_Test_CMS
 */
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User save(User user);
}
