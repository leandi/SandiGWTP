package com.sandi.sandigwtp.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class RatePageView extends ViewImpl implements RatePagePresenter.MyView {

	private final Widget widget;
	
	@UiField Button yesButton;
	@UiField Button noButton;
	
	public interface Binder extends UiBinder<Widget, RatePageView> {
	}

	@Inject
	public RatePageView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	public Button getYesButton() {
		return yesButton;
	}

	public Button getNoButton() {
		return noButton;
	}
	
	
}
