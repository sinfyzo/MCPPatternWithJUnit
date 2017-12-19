package com.mcppatternwithjunit;

/**
 * Created by INFYZO\shailesh.pateliya on 19/12/17.
 */

public class LoginPresenter {
    private LoginView view;
    private LoginService service;

    public LoginPresenter(LoginView view, LoginService service) {

        this.view = view;
        this.service = service;
    }

    public void onLoginClicked() {
        if(view.getUsername().isEmpty()){
            view.showUsernameError(R.string.username_error);
            return;
        }
        if(view.getPassword().isEmpty()){
            view.showPasswordError(R.string.password_error);
            return;
        }
        boolean isLogin = service.login(view.getUsername(),view.getPassword());
        if(isLogin){
            view.startMainActivity();
            return;
        }
    }
}
