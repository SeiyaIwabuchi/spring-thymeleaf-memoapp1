package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.mapper.UsersMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LoginUserDetailsService implements UserDetailsService {

    private final UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var optionalUser = Optional.ofNullable(usersMapper.findByUser(username));
        return optionalUser.orElseThrow(() -> new UsernameNotFoundException(String.format("not found %s", username)));
    }
}
