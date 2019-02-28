package com.devcomanda.easymeetup.factories;

import com.devcomanda.easymeetup.controller.model.security.NewUserRequest;
import com.devcomanda.easymeetup.model.entity.User;

/**
 * @author Danil Kuznetsov (kuznetsov.danil.v@gmail.com)
 */
public final class UsersFactory {
    private UsersFactory() {}

    public static final Long FIRST_USER_ID = 1L;
    public static final String FIRST_USER_EMAIL = "email@email.com";
    public static final String FIRST_USER_PLAIN_PASSWORD = "user";
    public static final Boolean FIRST_USER_ACTIVATED_STATUS = true;

    public static final Long SECOND_USER_ID = 2L;
    public static final String SECOND_USER_EMAIL = "kbb@email.com";
    public static final String SECOND_USER_PLAIN_PASSWORD = "123";
    public static final Boolean SECOND_USER_ACTIVATED_STATUS = true;

    public static User firstUser() {
        User user = new User(FIRST_USER_EMAIL, FIRST_USER_PLAIN_PASSWORD);
        user.addAuthorities(AuthoritiesFactory.userAuthority());
        return user;
    }

    public static User secondUser(){
        User secondUser = new User(SECOND_USER_EMAIL, SECOND_USER_PLAIN_PASSWORD);
        return secondUser;
    }



    public static NewUserRequest createUserRequest(){

        final NewUserRequest userRequest = new NewUserRequest();
        userRequest.setEmail(UsersFactory.FIRST_USER_EMAIL);
        userRequest.setPassword(UsersFactory.FIRST_USER_PLAIN_PASSWORD);

        return userRequest;
    }
}
