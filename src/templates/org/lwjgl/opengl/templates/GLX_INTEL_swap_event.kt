/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

fun GLX_INTEL_swap_event() = "GLXINTELSwapEvent".nativeClassGLX("GLX_INTEL_swap_event", INTEL) {
	javaImport("org.lwjgl.linux.system")

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/INTEL/swap_event.txt", templateName)} extension.

		This extension adds a new event type, {@link #GLX_BUFFER_SWAP_COMPLETE_INTEL}, which is sent to the client via the X11 event stream and
		selected/consumed by the normal GLX event mask mechanisms, to indicate when a previously queued swap has completed.
		"""
	)

	IntConstant.block(
		"Accepted by the {@code mask} parameter of {@link GLX13#glXSelectEvent} and returned in the {@code mask} parameter of {@link GLX13#glXGetSelectedEvent}:",

		"BUFFER_SWAP_COMPLETE_INTEL_MASK" _ 0x04000000
	)

	IntConstant.block(
		"Returned in the {@code event_type} field of a \"swap complete\" event:",

		"EXCHANGE_COMPLETE_INTEL" _ 0x8180,
		"COPY_COMPLETE_INTEL" _ 0x8181,
		"FLIP_COMPLETE_INTEL" _ 0x8182
	)

}