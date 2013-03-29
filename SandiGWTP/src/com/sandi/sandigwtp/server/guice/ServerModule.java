package com.sandi.sandigwtp.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import com.sandi.sandigwtp.client.GetFirstAction;
import com.sandi.sandigwtp.server.GetFirstActionActionHandler;

public class ServerModule extends HandlerModule {

	@Override
	protected void configureHandlers() {

		bindHandler(GetFirstAction.class, GetFirstActionActionHandler.class);
	}
}
