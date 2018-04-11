/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_INTEL_swap_event = "GLXINTELSwapEvent".nativeClassGLX("GLX_INTEL_swap_event", INTEL) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds a new event type, #BUFFER_SWAP_COMPLETE_INTEL_MASK, which is sent to the client via the X11 event stream and
        selected/consumed by the normal GLX event mask mechanisms, to indicate when a previously queued swap has completed.

        Requires ${GLX13.glx}.
        """

    IntConstant(
        "Accepted by the {@code mask} parameter of #SelectEvent() and returned in the {@code mask} parameter of #GetSelectedEvent().",

        "BUFFER_SWAP_COMPLETE_INTEL_MASK"..0x04000000
    )

    IntConstant(
        "Returned in the {@code event_type} field of a \"swap complete\" event.",

        "EXCHANGE_COMPLETE_INTEL"..0x8180,
        "COPY_COMPLETE_INTEL"..0x8181,
        "FLIP_COMPLETE_INTEL"..0x8182
    )

}