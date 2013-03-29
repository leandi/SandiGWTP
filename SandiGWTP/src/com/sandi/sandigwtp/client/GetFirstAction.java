package com.sandi.sandigwtp.client;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.sandi.sandigwtp.client.GetFirstActionResult;
import java.lang.String;

public class GetFirstAction extends ActionImpl<GetFirstActionResult> {

	private String text;
	
	@Override
	public boolean isSecured() {
		return false;
//cross security gwt
	}

	@SuppressWarnings("unused")
	private GetFirstAction() {
		// For serialization only
	}

	public GetFirstAction(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
