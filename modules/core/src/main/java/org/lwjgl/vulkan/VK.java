/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.*;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VKUtil.*;

/**
 * This class loads the Vulkan library into the JVM process.
 *
 * @see Configuration#VULKAN_LIBRARY_NAME
 * @see Configuration#VULKAN_EXPLICIT_INIT
 */
public final class VK {

	private static FunctionProvider functionProvider;

	private static VKCapabilities globalCommands;

	static {
		if ( !Configuration.VULKAN_EXPLICIT_INIT.get(false) )
			create();
	}

	private VK() {}

	/**
	 * Loads the Vulkan shared library, using the default library name.
	 *
	 * @see #create(String)
	 */
	public static void create() {
		SharedLibrary VK;
		switch ( Platform.get() ) {
			case LINUX:
				VK = Library.loadNative(Configuration.VULKAN_LIBRARY_NAME, "libvulkan.so.1");
				break;
			case WINDOWS:
				VK = Library.loadNative(Configuration.VULKAN_LIBRARY_NAME, "vulkan-1");
				break;
			case MACOSX:
				VK = Library.loadNative(Configuration.VULKAN_LIBRARY_NAME); // there may be Vulkan-over-Metal emulation libraries on OS X
				break;
			default:
				throw new IllegalStateException();
		}
		create(VK);
	}

	/**
	 * Loads the Vulkan shared library, using the specified library name.
	 *
	 * <p>The {@link FunctionProvider} instance created by this method can only be used to retrieve global commands and commands exposed statically by the
	 * Vulkan shared library.</p>
	 *
	 * @param libName the shared library name
	 *
	 * @see #create(FunctionProvider)
	 */
	public static void create(String libName) {
		create(Library.loadNative(libName));
	}

	private static void create(SharedLibrary VULKAN) {
		try {
			create((FunctionProvider)new SharedLibrary.Delegate(VULKAN) {
				private final long GetInstanceProcAddr = library.getFunctionAddress("vkGetInstanceProcAddr");

				{
					if ( GetInstanceProcAddr == NULL )
						throw new IllegalStateException("A core Vulkan function is missing. Make sure that Vulkan is available.");
				}

				@Override
				public long getFunctionAddress(ByteBuffer functionName) {
					long address = callPPP(GetInstanceProcAddr, NULL, memAddress(functionName));
					if ( address == NULL ) {
						address = library.getFunctionAddress(functionName);
						if ( address == NULL && Checks.DEBUG_FUNCTIONS )
							apiLog("Failed to locate address for VK function " + memASCII(functionName));
					}

					return address;
				}
			});
		} catch (RuntimeException e) {
			VULKAN.free();
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

		globalCommands = new VKCapabilities(functionProvider, 0, Collections.emptySet());
		if ( globalCommands.vkCreateInstance == NULL ||
			globalCommands.vkEnumerateInstanceExtensionProperties == NULL ||
			globalCommands.vkEnumerateInstanceLayerProperties == NULL )
			throw new IllegalStateException("Vulkan 1.0 is missing. Make sure that Vulkan is available.");
	}

	/** Unloads the Vulkan shared library. */
	public static void destroy() {
		if ( functionProvider == null )
			return;

		if ( functionProvider instanceof NativeResource )
			((NativeResource)functionProvider).free();
		functionProvider = null;
		globalCommands = null;
	}

	/** Returns the {@link FunctionProvider} for the Vulkan shared library. */
	public static FunctionProvider getFunctionProvider() {
		return functionProvider;
	}

	/** Returns the {@link VKCapabilities} instance for global commands. */
	static VKCapabilities getGlobalCommands() { return globalCommands; }

	static Set<String> getEnabledExtensionSet(int apiVersion, PointerBuffer extensionNames) {
		Set<String> enabledExtensions = new HashSet<>(16);

		int majorVersion = VK_VERSION_MAJOR(apiVersion);
		int minorVersion = VK_VERSION_MINOR(apiVersion);

		int[] VK_VERSIONS = {
			0, // Vulkan 1.0
		};

		int maxMajor = min(majorVersion, VK_VERSIONS.length);
		for ( int M = 1; M <= maxMajor; M++ ) {
			int maxMinor = VK_VERSIONS[M - 1];
			if ( M == majorVersion )
				maxMinor = min(minorVersion, maxMinor);
			for ( int m = 0; m <= maxMinor; m++ )
				enabledExtensions.add(String.format("Vulkan%d%d", M, m));
		}

		if ( extensionNames != null ) {
			for ( int i = extensionNames.position(); i < extensionNames.limit(); i++ )
				enabledExtensions.add(extensionNames.getStringUTF8(i));
		}

		return enabledExtensions;
	}

	static <T> T checkExtension(String extension, T functions) {
		if ( functions != null )
			return functions;

		apiLog("[VK] " + extension + " was reported as available but an entry point is missing.");
		return null;
	}

}