package com.sandi.sandigwtp.server;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.sandi.sandigwtp.client.GetFirstAction;
import com.sandi.sandigwtp.client.GetFirstActionResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;

public class GetFirstActionActionHandler implements
		ActionHandler<GetFirstAction, GetFirstActionResult> {

	@Inject
	public GetFirstActionActionHandler() {
	}

	@Override
	public GetFirstActionResult execute(GetFirstAction action,
			ExecutionContext context) throws ActionException {
		String text = action.getText();
		text = text.toLowerCase();
		
		return new GetFirstActionResult(text);
	}

	@Override
	public void undo(GetFirstAction action, GetFirstActionResult result,
			ExecutionContext context) throws ActionException {
	}

	@Override
	public Class<GetFirstAction> getActionType() {
		return GetFirstAction.class;
	}
}
