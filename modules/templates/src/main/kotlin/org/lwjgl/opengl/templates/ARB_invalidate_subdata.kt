/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_invalidate_subdata = "ARBInvalidateSubdata".nativeClassGL("ARB_invalidate_subdata") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a mechanism for an application to tell the GL that the previous contents of a subregion of an image or a range of a buffer may be
		invalidated.

		GL implementations often include several memory spaces, each with distinct performance characteristics, and the implementations transparently move
		allocations between memory spaces. With this extension, an application can tell the GL that the contents of a texture or buffer are no longer needed,
		and the implementation can avoid transferring the data unnecessarily.

		Examples of when this may be useful include:
		${ol(
			"invalidating a multisample texture after resolving it into a non-multisample texture.",
		    "invalidating depth/stencil buffers after using them to generate a color buffer.",
		    "invalidating a subregion of a framebuffer rather than clearing it before rendering to it, when the whole subregion will be overwritten.",
		    """
		    invalidating dynamically generated data (e.g. textures written by FBO rendering or CopyTexSubImage, buffers written by transform feedback, etc.)
		    after it is no longer needed but before the end of the frame.
		    """
		)}
		It is expected that the situations in which the GL will take advantage of this knowledge and achieve increased performance as a result of its use will
		be implementation-dependent. The first three examples may show benefit on tiled renderers where some data won't need to be copied into or out of on-chip
		memory. The fourth example may show a benefit in multi-GPU systems where some data won't need to be copied between GPUs.

		This extension is a superset of the ${registryLinkTo("EXT", "discard_framebuffer")} extension with the following additions:
		${ul(
			"The parameters to InvalidateFramebufferEXT are extended for MRT support and Desktop-GL-only buffer enums.",
		    "New functions to invalidate a region of a texture image or buffer object data store."
		)}
		Requires ${GL20.core}. ${GL43.promoted}
		"""

	GL43 reuse "InvalidateTexSubImage"
    GL43 reuse "InvalidateTexImage"

    GL43 reuse "InvalidateBufferSubData"
    GL43 reuse "InvalidateBufferData"

    GL43 reuse "InvalidateFramebuffer"
    GL43 reuse "InvalidateSubFramebuffer"
}