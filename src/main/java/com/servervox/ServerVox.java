package com.servervox;

import net.fabricmc.api.DedicatedServerModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerVox implements DedicatedServerModInitializer {
	public static final String MOD_ID = "servervox";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeServer() {
		LOGGER.info("ServerVox has been initialized for Minecraft 1.21.1!");
		// Add your server-side initialization code here
	}
}
