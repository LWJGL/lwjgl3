/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/**
 * An application-defined callback function used with the {@link WinGDI#EnumObjects(long, int, EnumObjectsProc) EnumObjects} function. It is used to process
 * the object data.
 */
public interface EnumObjectsProc {

	/**
	 * The callback method.
	 *
	 * @param logObject a pointer to a {@link LOGPEN} or {@link LOGBRUSH} structure describing the attributes of the object.
	 */
	int invoke(long logObject);

	final class Util {

		static final long CALLBACK = setCallback(apiCallbackMethod(EnumObjectsProc.class, long.class));

		private Util() {
		}

		private static native long setCallback(Method callback);

	}

}