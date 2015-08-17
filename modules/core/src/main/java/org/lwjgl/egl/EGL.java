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
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import static java.lang.Math.*;
import static org.lwjgl.egl.EGL10.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class must be used before any EGL function is called. It has the following responsibilities:
 * <ul>
 * <li>Loads the EGL native library into the JVM process.</li>
 * <li>Creates instances of {@link EGLCapabilities} classes. An {@code EGLCapabilities} instance contains flags for functionality that is available in an
 * EGLDisplay or the EGL client library. Internally, it also contains function pointers that are only valid in that specific EGLDisplay or client library.</li>
 *
 * <h3>Library lifecycle</h3>
 * <p>The EGL library is loaded automatically when this class is initialized. Set the {@code org.lwjgl.egl.explicitInit=true} system property to
 * override this behavior. Manual loading/unloading can be achieved with the {@link #create} and {@link #destroy} functions. The name of the library loaded can
 * be overridden with the {@code org.lwjgl.egl.libname} system property.</p>
 *
 * <h3>EGLCapabilities creation</h3>
 * <p>Instances of {@code EGLCapabilities} for an EGLDisplay can be created with the {@link #createDisplayCapabilities} method. Calling this method is
 * expensive, so the {@code EGLCapabilities} instance should be associated with the EGLDisplay and reused as necessary.</p>
 *
 * <p>The {@code EGLCapabilities} instance for the client library is created automatically when the EGL native library is loaded.</p>
 */
public final class EGL {

	private static FunctionProvider functionProvider;

	private static EGLCapabilities caps;

	static {
		if ( !Boolean.getBoolean("org.lwjgl.egl.explicitInit") )
			create();
	}

	private EGL() {}

	/** Loads the EGL native library, using the default library name. */
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

	/**
	 * Loads the EGL native library, using the specified library name.
	 *
	 * @param libName the native library name
	 */
	public static void create(String libName) {
		final DynamicLinkLibrary EGL = LWJGLUtil.loadLibraryNative(libName);

		try {
			FunctionProvider functionProvider = new FunctionProvider.Default() {
				private final long eglGetProcAddress = EGL.getFunctionAddress("eglGetProcAddress");

				@Override
				public long getFunctionAddress(CharSequence functionName) {
					APIBuffer __buffer = apiBuffer();
					__buffer.stringParamASCII(functionName, true);

					long address = invokePP(eglGetProcAddress, __buffer.address());
					if ( address == NULL )
						address = EGL.getFunctionAddress(functionName);

					return address;
				}

				@Override
				protected void destroy() {
					EGL.release();
				}
			};
			create(functionProvider);
		} catch (RuntimeException e) {
			EGL.release();
			throw e;
		}
	}

	/**
	 * Initializes EGL with the specified {@link FunctionProvider}. This method can be used to implement custom EGL library loading.
	 *
	 * @param functionProvider the provider of EGL function addresses
	 */
	public static void create(FunctionProvider functionProvider) {
		if ( EGL.functionProvider != null )
			throw new IllegalStateException("EGL has already been created.");

		EGL.functionProvider = functionProvider;

		caps = createClientCapabilities();
	}

	/** Unloads the EGL native library. */
	public static void destroy() {
		if ( functionProvider == null )
			return;

		caps = null;

		functionProvider.release();
		functionProvider = null;
	}

	/** Returns the {@link FunctionProvider} for the EGL native library. */
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
		long versionString = invokePIP(QueryString, EGL_NO_DISPLAY, EGL_VERSION);

		Set<String> ext = new HashSet<String>(32);

		APIVersion version;
		if ( versionString == NULL ) {
			version = new APIVersion(0, 0, null, null);

			long GetError = functionProvider.getFunctionAddress("eglGetError");
			invokeI(GetError); // clear error
		} else {
			version = apiParseVersion(memDecodeASCII(versionString), "EGL");

			addExtensions(memDecodeASCII(invokePIP(QueryString, EGL_NO_DISPLAY, EGL_EXTENSIONS)), ext);
		}

		return new EGLCapabilities(version.major, version.minor, ext, functionProvider);
	}

	/**
	 * Creates an {@link EGLCapabilities} instance for the specified EGLDisplay handle.
	 *
	 * <p>This method call is relatively expensive. The result should be cached and reused.</p>
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

		return new EGLCapabilities(majorVersion, minorVersion, supportedExtensions, functionProvider);
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

	static <T> T checkCapability(java.util.Set<String> ext, String capability, T functions) {
		if ( !ext.contains(capability) )
			return null;

		boolean missingFunction = false;
		try {
			for ( Field f : functions.getClass().getFields() ) {
				if ( !Modifier.isStatic(f.getModifiers()) && f.getLong(functions) == NULL ) {
					LWJGLUtil.log("Failed to locate address for EGL function egl" + f.getName());
					missingFunction = true;
					break;
				}
			}
		} catch (IllegalAccessException e) {
			LWJGLUtil.log("[EGL] Failed to retrieve " + capability + " function pointer fields.");
			return null;
		}

		if ( missingFunction ) {
			LWJGLUtil.log("[EGL] " + capability + " was reported as available but an entry point is missing.");
			return null;
		}

		return functions;
	}

}