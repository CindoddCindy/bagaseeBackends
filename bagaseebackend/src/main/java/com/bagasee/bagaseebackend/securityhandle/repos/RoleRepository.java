package com.bagasee.bagaseebackend.securityhandle.repos;


import java.util.Optional;

import com.bagasee.bagaseebackend.securityhandle.models.Role;
import com.bagasee.bagaseebackend.securityhandle.models.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository  extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
