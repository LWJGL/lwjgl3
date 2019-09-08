/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.eclipse.fx.drift.internal;

public class Log {

	public static void debug(String msg) {
		if (Configuration.LOGLEVEL <= 0) {
			System.out.println("[J] [DEBUG] " + msg);
		}
	}

	public static void info(String msg) {
		if (Configuration.LOGLEVEL <= 1) {
			System.out.println("[J] [INFO ] " + msg);
		}
	}

	public static void error(String msg) {
		if (Configuration.LOGLEVEL <= 2) {
			System.out.println("[J] [ERROR] " + msg);
		}
	}

}
