package com.sandi.sandigwtp.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.sandi.sandigwtp.client.place.ClientPlaceManager;
import com.sandi.sandigwtp.client.FirstPresenter;
import com.sandi.sandigwtp.client.FirstView;
import com.sandi.sandigwtp.client.place.DefaultPlace;
import com.sandi.sandigwtp.client.place.NameTokens;
import com.sandi.sandigwtp.client.SecondPresenter;
import com.sandi.sandigwtp.client.SecondView;
import com.sandi.sandigwtp.client.HeaderPresenter;
import com.sandi.sandigwtp.client.HeaderView;
import com.sandi.sandigwtp.client.ThirdPresenter;
import com.sandi.sandigwtp.client.ThirdView;
import com.sandi.sandigwtp.client.RatePagePresenter;
import com.sandi.sandigwtp.client.RatePageView;
import com.sandi.sandigwtp.client.WhyNotPresenter;
import com.sandi.sandigwtp.client.WhyNotView;
import com.sandi.sandigwtp.client.ErrorPresenter;
import com.sandi.sandigwtp.client.ErrorView;
import com.sandi.sandigwtp.client.LoginPresenter;
import com.sandi.sandigwtp.client.LoginView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(FirstPresenter.class, FirstPresenter.MyView.class,
				FirstView.class, FirstPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.first);

		bindPresenter(SecondPresenter.class, SecondPresenter.MyView.class,
				SecondView.class, SecondPresenter.MyProxy.class);

		bindPresenter(HeaderPresenter.class, HeaderPresenter.MyView.class,
				HeaderView.class, HeaderPresenter.MyProxy.class);

		bindPresenter(ThirdPresenter.class, ThirdPresenter.MyView.class,
				ThirdView.class, ThirdPresenter.MyProxy.class);

		bindPresenterWidget(RatePagePresenter.class,
				RatePagePresenter.MyView.class, RatePageView.class);

		bindPresenterWidget(WhyNotPresenter.class,
				WhyNotPresenter.MyView.class, WhyNotView.class);

		bindPresenter(ErrorPresenter.class, ErrorPresenter.MyView.class,
				ErrorView.class, ErrorPresenter.MyProxy.class);

		bindPresenter(LoginPresenter.class, LoginPresenter.MyView.class,
				LoginView.class, LoginPresenter.MyProxy.class);
	}
}
