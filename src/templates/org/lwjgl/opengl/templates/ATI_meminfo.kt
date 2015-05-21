/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ATI_meminfo = "ATIMeminfo".nativeClassGL("ATI_meminfo", postfix = ATI) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Traditionally, OpenGL has treated resource management as a task of hardware virtualization hidden from applications. While providing great portability,
		this shielding of information can prevent applications from making intelligent decisions on the management of resources they create. For instance, an
		application may be better served by choosing a different rendering method if there is not sufficient resources to efficiently utilize its preferred
		method.
    
		Requires ${GL11.core}
		"""

	IntConstant(
		"Accepted by the {@code param} parameter of GetIntegerv.",

		"VBO_FREE_MEMORY_ATI" _ 0x87FB,
		"TEXTURE_FREE_MEMORY_ATI" _ 0x87FC,
		"RENDERBUFFER_FREE_MEMORY_ATI" _ 0x87FD
	)
}
