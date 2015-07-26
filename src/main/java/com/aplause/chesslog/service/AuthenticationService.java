package com.aplause.chesslog.service;

import com.aplause.chesslog.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by aplause on 2015-07-26.
 */

public interface AuthenticationService {

    User getUserById(Long userId);
}
