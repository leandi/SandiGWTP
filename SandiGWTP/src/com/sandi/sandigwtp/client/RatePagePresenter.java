package com.sandi.sandigwtp.client;

import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.google.inject.Inject;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;

public class RatePagePresenter extends
		PresenterWidget<RatePagePresenter.MyView> {
	
	@Inject WhyNotPresenter whyNotPresenter;

	public interface MyView extends View {
		public Button getYesButton();
		public Button getNoButton();
}

	private EventBus eventBus;
	
	@Inject
	public RatePagePresenter(final EventBus eventBus, final MyView view) {
		super(eventBus, view);
		
		this.eventBus = eventBus;
	}

	@Override
	protected void onBind() {
		super.onBind();
		
		getView().getYesButton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("To je pa fajn!");
				
			}
		});

		getView().getNoButton().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				UserNotHappyEvent userNotHappyEvent = new UserNotHappyEvent();
				RatePagePresenter.this.eventBus.fireEvent(userNotHappyEvent);
				
				
				//Window.alert("Žal mi je da moram to slišat!");
				addToPopupSlot(whyNotPresenter);
			}
		});
	}
}
