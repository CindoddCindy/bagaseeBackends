package com.bagasee.bagaseebackend.securityhandle.secures.services;

import com.bagasee.bagaseebackend.securityhandle.models.User;
import com.bagasee.bagaseebackend.securityhandle.repos.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailServiceImpl  implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String name)
            throws UsernameNotFoundException {

        User user = userRepository.findByName(name)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User Not Found with -> username or email : " + name)
                );

        return UserPrinciple.build(user);
    }


}
