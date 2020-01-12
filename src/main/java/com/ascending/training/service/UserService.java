/*
 *  Copyright 2019, Liwei Wang <daveywang@live.com>.
 *  All rights reserved.
 *  Author: Liwei Wang
 *  Date: 06/2019
 */

package com.ascending.training.service;

import com.ascending.training.model.User;

public interface UserService {
    boolean save(User user);
    User getUserById(int id);
    User getUserByEmail(String email);
    User getUserByCredentials(String email, String password);
}
