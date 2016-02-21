/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * This class loads the Vulkan library into the JVM process.
 */
public final class VK {

	private static FunctionProvider functionProvider;

	private static VKCapabilities icd;

	static {
		if ( !Configuration.EXPLICIT_INIT_VULKAN.<Boolean>get() )
			create();
	}

	private VK() {}

	/** Loads the Vulkan native library, using the default library name. */
	public static void create() {
		SharedLibrary VK;
		switch ( Platform.get() ) {
			case LINUX:
				VK = Library.loadNative(Configuration.LIBRARY_NAME_VULKAN, "libvulkan.so.1");
				break;
			case WINDOWS:
				VK = Library.loadNative(Configuration.LIBRARY_NAME_VULKAN, "vulkan-1");
				break;
			case MACOSX:
				VK = Library.loadNative(Configuration.LIBRARY_NAME_VULKAN);
				break;
			default:
				throw new IllegalStateException();
		}
		create(VK);
	}

	/**
	 * Loads the Vulkan native library, using the specified library name.
	 *
	 * @param libName the native library name
	 */
	public static void create(String libName) {
		create(Library.loadNative(libName));
	}

	private static void create(final SharedLibrary VULKAN) {
		try {
			FunctionProvider functionProvider = new FunctionProvider.Default() {
				private final long GetInstanceProcAddr = VULKAN.getFunctionAddress("vkGetInstanceProcAddr");

				{
					if ( GetInstanceProcAddr == NULL ) {
						VULKAN.release();
						throw new IllegalStateException("A core Vulkan function is missing. Make sure that Vulkan is available.");
					}
				}

				@Override
				public long getFunctionAddress(CharSequence functionName) {
					APIBuffer __buffer = apiBuffer();
					__buffer.stringParamASCII(functionName, true);

					long address = callPPP(GetInstanceProcAddr, NULL, __buffer.address());
					if ( address == NULL )
						address = VULKAN.getFunctionAddress(functionName);

					return address;
				}

				@Override
				protected void destroy() {
					VULKAN.release();
				}
			};
			create(functionProvider);
		} catch (RuntimeException e) {
			VULKAN.release();
			throw e;
		}
	}

	/**
	 * Initializes Vulkan with the specified {@link FunctionProvider}. This method can be used to implement custom Vulkan library loading.
	 *
	 * @param functionProvider the provider of Vulkan function addresses
	 */
	public static void create(FunctionProvider functionProvider) {
		if ( VK.functionProvider != null )
			throw new IllegalStateException("Vulkan has already been created.");

		VK.functionProvider = functionProvider;

		icd = new VKCapabilities(functionProvider);
		if ( icd.__VK10 == null )
			throw new IllegalStateException("Vulkan 1.0 is missing. Make sure that Vulkan is available");
	}

	/** Unloads the Vulkan native library. */
	public static void destroy() {
		if ( functionProvider == null )
			return;

		functionProvider.release();
		functionProvider = null;
		icd = null;
	}

	/** Returns the {@link FunctionProvider} for the Vulkan native library. */
	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	/** Returns the {@link VKCapabilities} of the ICD. */
	public static VKCapabilities getICD() { return icd; }

}