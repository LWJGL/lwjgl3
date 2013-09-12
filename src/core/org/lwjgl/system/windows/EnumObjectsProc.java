/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import java.lang.reflect.Method;

import static org.lwjgl.system.APIUtil.*;

/** An application-defined callback function used with the {@link WinGDI#EnumObjects} function. It is used to process the object data. */
public abstract class EnumObjectsProc {

	public static final long CALLBACK = setCallback(apiCallbackMethod(EnumObjectsProc.class, long.class));

	private static native long setCallback(Method callback);

	/**
	 * The callback method.
	 *
	 * @param logObject a pointer to a {@link LOGPEN} or {@link LOGBRUSH} structure describing the attributes of the object.
	 */
	public abstract int invoke(long logObject);

}