package com.sandi.sandigwtp.client;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Label;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import com.sandi.sandigwtp.client.UserNotHappyEvent.UserNotHappyHandler;

public class HeaderPresenter extends
		Presenter<HeaderPresenter.MyView, HeaderPresenter.MyProxy> {

	// https://code.google.com/p/gwt-platform/wiki/SimpleNestedSample#Step_2:_Setting_things_up
	//priporoèamo to vrstico, da uporabljate vedno ko uporabimo nested presenter.
	@ContentSlot public static final Type<RevealContentHandler<?>> SLOT_content = new Type<RevealContentHandler<?>>();
	
	private UserNotHappyHandler notHappyHandler = new UserNotHappyHandler() {
		
		@Override
		public void onUserNotHappy(UserNotHappyEvent event) {
			getView().getHappyLabel().setText("");
			
		}
	};
		
	
	
	
	public interface MyView extends View {
		public Label getHappyLabel();
	}

	@ProxyCodeSplit
	public interface MyProxy extends Proxy<HeaderPresenter> {
	}

	@Inject
	public HeaderPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		
		registerHandler(getEventBus().addHandler(UserNotHappyEvent.getType(), notHappyHandler));
	}
}
