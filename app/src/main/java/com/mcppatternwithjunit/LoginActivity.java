package com.mcppatternwithjunit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements LoginView{
    private LoginPresenter presenter;
    private EditText etUsername,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);
        presenter = new LoginPresenter(this, new LoginService());
    }

    public void onLogin(View view){
        presenter.onLoginClicked();
    }

    @Override
    public String getUsername() {
        return etUsername.getText().toString();
    }

    @Override
    public void showUsernameError(int resId) {
        etUsername.setError(getString(R.string.username_error));
    }

    @Override
    public String getPassword() {
        return etPassword.getText().toString();
    }

    @Override
    public void showPasswordError(int resId) {
        etPassword.setError(getString(R.string.password_error));
    }

    @Override
    public void startMainActivity() {
        new ActivityUtil(this).startMainActivity();
    }
}
