/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl;

import org.lwjgl.LWJGLUtil;

import java.lang.reflect.Field;
import java.util.Map;

import static org.lwjgl.egl.EGL10.*;
import static org.lwjgl.egl.EGL11.*;
import static org.lwjgl.system.APIUtil.*;

public final class EGLUtil {

	private static final Map<Integer, String> EGL_ERROR_TOKENS = LWJGLUtil.getClassTokens(
		new LWJGLUtil.TokenFilter() {
			@Override
			public boolean accept(Field field, int value) {
				return field.getName().contains("_BAD_");
			}
		},
		null,
		EGL10.class,
		EGL11.class,
		EXTDeviceQuery.class,
		EXTOutputBase.class,
		KHRStream.class
	);

	private EGLUtil() {
	}

	/**
	 * Translates an EGL error code to a String describing the error.
	 *
	 * @param errorCode the EGL error code, as returned by {@link EGL10#eglGetError}
	 *
	 * @return a string with the error description
	 */
	public static String getErrorString(int errorCode) {
		switch ( errorCode ) {
			case EGL_SUCCESS:
				return "Function succeeded.";
			case EGL_NOT_INITIALIZED:
				return "EGL is not initialized, or could not be initialized, for the specified display.";
			case EGL_BAD_ACCESS:
				return "EGL cannot access a requested resource.";
			case EGL_BAD_ALLOC:
				return "EGL failed to allocate resources for the requested operation.";
			case EGL_BAD_ATTRIBUTE:
				return "An unrecognized attribute or attribute value was passed in an attribute list.";
			case EGL_BAD_CONTEXT:
				return "An EGLContext argument does not name a valid EGLContext.";
			case EGL_BAD_CONFIG:
				return "An EGLConfig argument does not name a valid EGLConfig.";
			case EGL_BAD_CURRENT_SURFACE:
				return "The current surface of the calling thread is a window, pbuffer, or pixmap that is no longer valid.";
			case EGL_BAD_DISPLAY:
				return "An EGLDisplay argument does not name a valid EGLDisplay.";
			case EGL_BAD_SURFACE:
				return "An EGLSurface argument does not name a valid surface (window, pbuffer, or pixmap) configured for rendering.";
			case EGL_BAD_MATCH:
				return "Arguments are inconsistent.";
			case EGL_BAD_PARAMETER:
				return "One or more argument values are invalid.";
			case EGL_BAD_NATIVE_PIXMAP:
				return "An EGLNativePixmapType argument does not refer to a valid native pixmap.";
			case EGL_BAD_NATIVE_WINDOW:
				return "An EGLNativeWindowType argument does not refer to a valid native window.";
			case EGL_CONTEXT_LOST:
				return "A power management event has occurred. The application must destroy all contexts and reinitialise client API state and objects to " +
				       "continue rendering.";
			case EXTDeviceQuery.EGL_BAD_DEVICE_EXT:
				return "An EGLDeviceEXT argument does not refer to a valid EGLDeviceEXT.";
			case EXTOutputBase.EGL_BAD_OUTPUT_LAYER_EXT:
				return "An EGLOutputLayerEXT argument does not name a valid EGLOutputLayerEXT.";
			case EXTOutputBase.EGL_BAD_OUTPUT_PORT_EXT:
				return "An EGLOutputPortEXT argument does not name a valid EGLOutputPortEXT.";
			case KHRStream.EGL_BAD_STATE_KHR:
				return "An EGLStreamKHR is in EGL_STREAM_STATE_DISCONNECTED_KHR state.";
			case KHRStream.EGL_BAD_STREAM_KHR:
				return "An EGLStreamKHR argument does not refer to a valid EGLStreamKHR.";
			default:
				return apiUnknownToken(errorCode);
		}
	}

}