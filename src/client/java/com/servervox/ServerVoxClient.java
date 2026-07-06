package com.servervox;

import net.fabricmc.api.ClientModInitializer;

public class ServerVoxClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This mod is server-side only, so client initialization is minimal
		ServerVox.LOGGER.info("ServerVox client-side loaded (not used for server-side mod)");
	}
}
