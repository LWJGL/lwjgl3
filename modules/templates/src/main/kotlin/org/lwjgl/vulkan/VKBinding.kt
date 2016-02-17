/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*

val VK_BINDING = simpleBinding(
	"vulkan",
	libraryExpression = """Configuration.LIBRARY_NAME_VULKAN.get(
			Platform.get() == Platform.WINDOWS ? "vulkan-1" : (Platform.get() == Platform.LINUX ? "libvulkan.so.1" : "unsupported")
		)""",
	callingConvention = CallingConvention.STDCALL
)
val VK_BINDING_DELEGATE = VK_BINDING.delegate("VK10.getLibrary()")

// DSL Extensions

fun String.nativeClassVK(
	templateName: String,
	nativeSubPath: String = "",
	prefix: String = "VK",
	prefixMethod: String = prefix.toLowerCase(),
	postfix: String = "",
	init: (NativeClass.() -> Unit)? = null
) = nativeClass(
	VULKAN_PACKAGE,
	templateName,
	nativeSubPath = nativeSubPath,
	prefix = prefix,
	prefixMethod = prefixMethod,
	postfix = postfix,
	binding = VK_BINDING_DELEGATE,
	init = init
)

val EXT = "EXT"
val KHR = "KHR"