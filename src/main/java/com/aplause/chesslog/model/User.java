package com.aplause.chesslog.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Builder;

import java.io.Serializable;
import java.util.List;

/**
 * Created by aplause on 2015-07-26.
 */
@Getter
@Setter
@Builder
public class User implements Serializable {

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String registrationDate;
    private List<Role> roles;

}
