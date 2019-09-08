package org.eclipse.fx.drift.internal;

import org.eclipse.fx.drift.DriftFXConfig;

/**
 * This is an internal class, it is not intended to change the configuration at runtime!
 */
public class Configuration {

	public static final String KEY_DEBUG = "driftfx.debug";
	public static final String KEY_LOGLEVEL = "driftfx.loglevel";
	public static final String KEY_USEWINFALLBACK = "driftfx.winfallback";
	public static final String KEY_FALLBACK = "driftfx.fallback";
	
	public static boolean DEBUG;
	public static boolean USEWINFALLBACK;
	public static int LOGLEVEL;
	
	private static boolean initialized;
	
	public static void initialize(DriftFXConfig config) {
		if (initialized) {
			throw new RuntimeException("configuration was already initialized");
		}
		if (config == null) {
			config = DriftFXConfig.initSystemProperties();
		}
		DEBUG = config.isDebug();
		USEWINFALLBACK = config.isUseWinFallback();
		LOGLEVEL = config.getLogLevel();
		initialized = true;	
	}

	public static boolean getBoolean(String name, boolean defaultValue) {
		if (null == System.getProperty(name)) {
			return defaultValue;
		}
		else {
			return Boolean.getBoolean(name); 
		}
	}
	
	public static int getInt(String name, int defaultValue) {
		String prop = System.getProperty(name);
		try {
			return Integer.parseInt(prop);
		}
		catch (Throwable t) {
			return defaultValue;
		}
	}

	
}
