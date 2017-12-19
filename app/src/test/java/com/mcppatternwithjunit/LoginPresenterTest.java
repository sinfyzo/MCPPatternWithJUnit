package com.mcppatternwithjunit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by INFYZO\shailesh.pateliya on 19/12/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {
    @Mock
    private LoginView view;
    @Mock
    private LoginService service;
    private LoginPresenter presenter;

    @Before
    public void setUp() throws Exception {
        presenter = new LoginPresenter(view, service);

    }


    @Test
    public void shouldShowErrorMsgWhenUsernameIsEmpty() throws Exception {
        when(view.getUsername()).thenReturn("");
        presenter.onLoginClicked();
        verify(view).showUsernameError(R.string.username_error);

    }

    @Test
    public void shouldShowErrorMsgWhenPasswordIsEmpty() throws Exception {
        when(view.getUsername()).thenReturn("james");
        when(view.getPassword()).thenReturn("");
        presenter.onLoginClicked();
        verify(view).showPasswordError(R.string.password_error);
    }

    @Test
    public void shouldStartMainActivityWhenUsernameAndPwdAreCorrect() throws Exception{
        when(view.getUsername()).thenReturn("james");
        when(view.getPassword()).thenReturn("bond");
        when(service.login("james","band")).thenReturn(true);

        presenter.onLoginClicked();
        verify(view).startMainActivity();
    }

}