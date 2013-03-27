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

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(FirstPresenter.class, FirstPresenter.MyView.class,
				FirstView.class, FirstPresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.first);

		bindPresenter(SecondPresenter.class, SecondPresenter.MyView.class,
				SecondView.class, SecondPresenter.MyProxy.class);
	}
}
