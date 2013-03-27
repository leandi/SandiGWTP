package com.sandi.sandigwtp.client;

import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;

public class RatePagePresenter extends
		PresenterWidget<RatePagePresenter.MyView> {

	public interface MyView extends View {
		public Button getYesButton();
		public Button getNoButton();
}

	@Inject
	public RatePagePresenter(final EventBus eventBus, final MyView view) {
		super(eventBus, view);
	}

	@Override
	protected void onBind() {
		super.onBind();
		
	}
}
