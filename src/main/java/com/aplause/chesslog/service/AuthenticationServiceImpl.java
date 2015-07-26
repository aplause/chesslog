package com.aplause.chesslog.service;

import com.aplause.chesslog.model.Role;
import com.aplause.chesslog.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by aplause on 2015-07-26.
 */
@Service("authenticationService")
public class AuthenticationServiceImpl implements AuthenticationService{

    //FIXME: unmock
    @Override
    public User getUserById(Long userId) {

        User zeno = User.builder().username("p4r5onificator").firstName("Zenobiusz").lastName("Furman").roles(Arrays.asList(Role.VIEWER)).registrationDate("today").build();

        return zeno;
    }
}
