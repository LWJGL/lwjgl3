/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan;

/** Vulkan utilities. */
public final class VKUtil {

	private VKUtil() {
	}

	/** Returns the major version number from the specified Vulkan API version. */
	public static int VK_MAKE_VERSION(int major, int minor, int patch) {
		return (major << 22) | (minor << 12) | patch;
	}

	/** Returns the major version number from the specified Vulkan API version. */
	public static int VK_VERSION_MAJOR(int apiVersion) {
		return apiVersion >> 22;
	}

	/** Returns the minor version number from the specified Vulkan API version. */
	public static int VK_VERSION_MINOR(int apiVersion) {
		return (apiVersion >> 12) & 0x3FF;
	}

	/** Returns the patch version number from the specified Vulkan API version. */
	public static int VK_VERSION_PATCH(int apiVersion) {
		return apiVersion & 0xFFF;
	}

}