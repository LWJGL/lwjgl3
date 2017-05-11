/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_pinned_memory = "AMDPinnedMemory".nativeClassGL("AMD_pinned_memory", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension defines an interface that allows improved control of the physical memory used by the graphics device.

        It allows an existing page of system memory allocated by the application to be used as memory directly accessible to the graphics processor. One
        example application of this functionality would be to be able to avoid an explicit synchronous copy with sub-system of the application; for instance it
        is possible to directly draw from a system memory copy of a video image.
        """

    IntConstant(
        "",

        "EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD"..0x9160
    )
}