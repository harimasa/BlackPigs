package ru.matt;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.matt.Commands.hruk;

public class BlackPigs implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("blackpigs");

	@Override
	public void onInitialize() {
		hruk.register();
	}
}