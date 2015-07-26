/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.system.APIBuffer;
import org.lwjgl.system.DynamicLinkLibrary;
import org.lwjgl.system.FunctionProvider;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Math.*;
import static org.lwjgl.egl.EGL10.*;
import static org.lwjgl.egl.EGL11.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class EGL {

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

	private static FunctionProvider functionProvider;

	private static EGLCapabilities caps;

	static {
		if ( !Boolean.getBoolean("org.lwjgl.egl.explicitInit") )
			create();
	}

	private EGL() {}

	public static void create() {
		String libName = System.getProperty("org.lwjgl.egl.libname");
		if ( libName == null ) {
			switch ( LWJGLUtil.getPlatform() ) {
				case WINDOWS:
				case LINUX:
					libName = "libEGL";
					break;
				case MACOSX:
					throw new UnsupportedOperationException("MacOS X does not support EGL");
				default:
					throw new IllegalStateException();
			}
		}
		create(libName);
	}

	public static void create(String libName) {
		if ( functionProvider != null )
			throw new IllegalStateException("EGL has already been created.");

		final DynamicLinkLibrary EGL = LWJGLUtil.loadLibraryNative(libName);

		functionProvider = new FunctionProvider.Default() {
			private final long eglGetProcAddress = EGL.getFunctionAddress("eglGetProcAddress");

			@Override
			public long getFunctionAddress(CharSequence functionName) {
				APIBuffer __buffer = apiBuffer();
				__buffer.stringParamASCII(functionName, true);

				long address = neglGetProcAddress(__buffer.address(), eglGetProcAddress);
				if ( address == NULL ) {
					address = EGL.getFunctionAddress(functionName);
					if ( address == NULL )
						LWJGLUtil.log("Failed to locate address for EGL function " + functionName);
				}

				return address;
			}

			@Override
			protected void destroy() {
				EGL.release();
			}
		};

		caps = createClientCapabilities();
	}

	public static void destroy() {
		if ( functionProvider == null )
			return;

		caps = null;

		functionProvider.release();
		functionProvider = null;
	}

	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	/**
	 * Returns the {@link EGLCapabilities} instance for the EGL client library.
	 *
	 * The capability flags in this instance are only set for the core EGL versions and client extensions. This may only happen if EGL 1.5 or the
	 * {@link EGLCapabilities#EGL_EXT_client_extensions} extension are supported. If not, all flags will be false and the version fields zero.
	 */
	public static EGLCapabilities getCapabilities() {
		return caps;
	}

	private static EGLCapabilities createClientCapabilities() {
		long QueryString = functionProvider.getFunctionAddress("eglQueryString");
		long versionString = org.lwjgl.egl.EGL10.neglQueryString(EGL_NO_DISPLAY, EGL_VERSION, QueryString);

		Set<String> ext;
		APIVersion version;
		if ( versionString == NULL ) {
			long GetError = functionProvider.getFunctionAddress("eglGetError");
			neglGetError(GetError); // clear error

			version = new APIVersion(0, 0, null, null);
			ext = null;
		} else {
			version = apiParseVersion(memDecodeASCII(versionString), "EGL");
			ext = new HashSet<String>(32);

			addEGLVersions(version.major, version.minor, ext);
			addExtensions(memDecodeASCII(org.lwjgl.egl.EGL10.neglQueryString(EGL_NO_DISPLAY, EGL_EXTENSIONS, QueryString)), ext);
		}

		return new EGLCapabilities(version.major, version.minor, ext, functionProvider);
	}

	/**
	 * Creates an {@link EGLCapabilities} instance for the specified EGLDisplay handle.
	 * <p/>
	 * This method call is relatively expensive. The result should be cached and reused.
	 *
	 * @param dpy          the EGLDisplay to query
	 * @param majorVersion the major EGL version supported by the EGLDisplay, as returned by {@link EGL10#eglInitialize}
	 * @param minorVersion the minor EGL version supported by the EGLDisplay, as returned by {@link EGL10#eglInitialize}
	 *
	 * @return the {@link EGLCapabilities instance}
	 */
	public static EGLCapabilities createDisplayCapabilities(long dpy, int majorVersion, int minorVersion) {
		Set<String> supportedExtensions = new HashSet<String>(32);

		// Add EGL versions
		addEGLVersions(majorVersion, minorVersion, supportedExtensions);
		// Parse display EGL_EXTENSIONS string
		addExtensions(eglQueryString(dpy, EGL_EXTENSIONS), supportedExtensions);

		return new EGLCapabilities(majorVersion, minorVersion, supportedExtensions, EGL.getCapabilities());
	}

	private static void addEGLVersions(int MAJOR, int MINOR, Set<String> supportedExtensions) {
		int[][] versions = new int[][] {
			{ 0, 1, 2, 3, 4, 5 } // 10, 11, 12, 13, 14, 15
		};

		for ( int major = 1; major <= min(MAJOR, versions.length); major++ ) {
			for ( int minor : versions[major - 1] ) {
				if ( major == MAJOR && MINOR < minor )
					break;

				supportedExtensions.add(String.format("EGL%d%d%s", major, minor, ""));
			}
		}
	}

	private static void addExtensions(String extensionsString, Set<String> supportedExtensions) {
		StringTokenizer tokenizer = new StringTokenizer(extensionsString);
		while ( tokenizer.hasMoreTokens() )
			supportedExtensions.add(tokenizer.nextToken());
	}

	static boolean checkCapability(Set<String> ext, String extension) {
		if ( ext == null ) // This can happen in the client EGLCapabilities constructor, if EGL 1.5 and EGL_EXT_client_extensions are not available
			return false;

		return ext.contains(extension);
	}

	static <T> T checkCapability(Set<String> ext, String extension, T functions) {
		if ( ext.contains(extension) ) {
			if ( functions != null )
				return functions;

			LWJGLUtil.log("[EGL] " + extension + " was reported as available but an entry point is missing.");
		}
		return null;
	}

	public static String getEGLErrorDescription(int errorCode) {
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
				return String.format("Unknown (0x%X)", errorCode);
		}
	}

}