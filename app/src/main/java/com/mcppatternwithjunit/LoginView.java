package com.mcppatternwithjunit;

/**
 * Created by INFYZO\shailesh.pateliya on 19/12/17.
 */

interface LoginView {
    String getUsername();

    void showUsernameError(int resId);

    String getPassword();

    void showPasswordError(int resId);

    void startMainActivity();
}
