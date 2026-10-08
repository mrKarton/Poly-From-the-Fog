package com.karton.pftf;

import eu.pb4.polymer.resourcepack.api.PolymerResourcePackUtils;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PolyFromTheFog implements ModInitializer {
	public static final String MOD_ID = "poly-from-the-fog";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		PolymerResourcePackUtils.addModAssets("lunareclipse.watching");
		PolymerResourcePackUtils.markAsRequired();

		LOGGER.warn("SUSPICIOUS ENTITY IS DETECTED ON THIS SERVER!");
		LOGGER.warn("FURTHER LAUNCH IS NOT RECOMMENDED");
		LOGGER.warn("DO IT ON YOU RESPONSIBILITY");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
