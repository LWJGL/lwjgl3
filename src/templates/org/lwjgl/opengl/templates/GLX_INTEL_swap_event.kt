/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_INTEL_swap_event = "GLXINTELSwapEvent".nativeClassGLX("GLX_INTEL_swap_event", INTEL) {
	documentation =
		"""
		Native bindings to the ${registryLink("INTEL", "swap_event")} extension.

		This extension adds a new event type, #BUFFER_SWAP_COMPLETE_INTEL_MASK, which is sent to the client via the X11 event stream and
		selected/consumed by the normal GLX event mask mechanisms, to indicate when a previously queued swap has completed.

		Requires ${GLX13.glx}.
		"""

	IntConstant(
		"Accepted by the {@code mask} parameter of GLX13#SelectEvent() and returned in the {@code mask} parameter of GLX13#GetSelectedEvent().",

		"BUFFER_SWAP_COMPLETE_INTEL_MASK" _ 0x04000000
	)

	IntConstant(
		"Returned in the {@code event_type} field of a \"swap complete\" event.",

		"EXCHANGE_COMPLETE_INTEL" _ 0x8180,
		"COPY_COMPLETE_INTEL" _ 0x8181,
		"FLIP_COMPLETE_INTEL" _ 0x8182
	)

}