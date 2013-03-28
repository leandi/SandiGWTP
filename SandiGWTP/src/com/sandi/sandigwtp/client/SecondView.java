package com.sandi.sandigwtp.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class SecondView extends ViewImpl implements SecondPresenter.MyView {

	private final Widget widget;
	@UiField Label secondLabel;
	@UiField HTMLPanel listPanel;
		
	public interface Binder extends UiBinder<Widget, SecondView> {
	}

	@Inject
	public SecondView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public void setInSlot(Object slot, Widget content)
	{
		if (slot == SecondPresenter.SLOT_list)
		{
			listPanel.clear();
			
			if (content != null)
			{
				listPanel.add(content);
			}
		}	
		else
			{
			super.setInSlot(slot, content);
			}
	}
	
	@Override
	public void addToSlot(Object slot, Widget content) 
	{
		if (slot == SecondPresenter.SLOT_list)
		{
			if (content != null)
			{
				listPanel.add(content);
			}
		}	
		else
			{
			super.addToSlot(slot, content);
			}
	}
	
	@Override
	public Widget asWidget() {
		return widget;
	}
	
	public Label getSecondLabel() {
		return secondLabel;
	}
	
}
