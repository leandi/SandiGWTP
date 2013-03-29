package com.sandi.sandigwtp.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.sandi.sandigwtp.client.gin.ClientModule;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.inject.Provider;
import com.sandi.sandigwtp.client.FirstPresenter;
import com.sandi.sandigwtp.client.SecondPresenter;
import com.sandi.sandigwtp.client.HeaderPresenter;
import com.sandi.sandigwtp.client.ThirdPresenter;
import com.sandi.sandigwtp.client.ErrorPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

//	code split
//	AsyncProvider<FirstPresenter> getFirstPresenter();
	Provider<FirstPresenter> getFirstPresenter();

	AsyncProvider<SecondPresenter> getSecondPresenter();

	AsyncProvider<HeaderPresenter> getHeaderPresenter();

	AsyncProvider<ThirdPresenter> getThirdPresenter();

	AsyncProvider<ErrorPresenter> getErrorPresenter();
}
