package com.example.sobhy.mvpwithcontract.main;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * local unit test for the main presenter
 */
public class MainPresenterTest {


    @Mock
    MainContract.MVPview mvPview;

    MainPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        presenter = new MainPresenter(mvPview);
    }

    @Test
    public void handleSignInButtonClick() throws Exception {
        presenter.HandleSignInButtonClick();
        verify(mvPview).ShowSignInScreen();
    }

    @Test
    public void handleSignOutButtonClick() throws Exception {
        presenter.HandleSignOutButtonClick();
        verify(mvPview).ShowSignOutScreen();
    }

}