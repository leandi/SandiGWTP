package com.sandi.sandigwtp.client;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.sandi.sandigwtp.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.inject.Inject;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class FirstPresenter extends
		Presenter<FirstPresenter.MyView, FirstPresenter.MyProxy> {

	public static final Object SLOT_rate = new Object();
	
	public interface MyView extends View {
		public Label getFirstLabel();
		
		public TextBox getFirstBox();
		
		public Button getFirstButton();
	}
	
	@Inject RatePagePresenter ratePagePresenter;
	
	
	//code split
	//@ProxyCodeSplit
	@ProxyStandard
	@NameToken(NameTokens.first)
	public interface MyProxy extends ProxyPlace<FirstPresenter> {
	}

	@Inject
	public FirstPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, HeaderPresenter.SLOT_content, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}
	
	@Inject
	PlaceManager placeManager;
	
	@Override
	protected void onReset() {
		super.onReset();
		
		setInSlot(SLOT_rate, ratePagePresenter);
		
		getView().getFirstBox().setText("Poljubni tekst");
		
		getView().getFirstButton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
//				PlaceRequest request = new PlaceRequest(NameTokens.second);
				PlaceRequest request = new PlaceRequest(NameTokens.second).with("name", getView().getFirstBox().getText());
				placeManager.revealPlace(request);
			}
		});
	}
}
