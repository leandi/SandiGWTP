package com.sandi.sandigwtp.client;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class GetFirstActionResult implements Result {

	private String text;

	@SuppressWarnings("unused")
	private GetFirstActionResult() {
		// For serialization only
	}

	public GetFirstActionResult(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
