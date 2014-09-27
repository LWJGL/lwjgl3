/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.opengl.*

val ARB_copy_image = "ARBCopyImage".nativeClassGL("ARB_copy_image") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension enables efficient image data transfer between image objects (i.e. textures and renderbuffers) without the need to bind the objects or
		otherwise configure the rendering pipeline.

		This is accomplised by adding a new entry-point #CopyImageSubData(), which takes a named source and destination.

		CopyImageSubData does not perform general-purpose conversions such as scaling, resizing, blending, color-space, or format conversions. It should be
		considered to operate in a manner similar to a CPU {@code memcpy}, but using the GPU for the copy.

		CopyImageSubData supports copies between images with different internal formats, if the formats are compatible for TextureViews.

		CopyImageSubData also supports copying between compressed and uncompressed images if the compressed block / uncompressed texel sizes are the same.

		${GL43.promoted}
		"""

	GL43 reuse "CopyImageSubData"
}