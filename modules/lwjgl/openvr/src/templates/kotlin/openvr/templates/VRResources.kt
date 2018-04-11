/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRResources = "VRResources".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRResources_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation = "Shared Resource Methods."

    uint32_t(
        "LoadSharedResource",
        "Loads the specified resource into the provided buffer if large enough.",

        charASCII.const.p.IN("pchResourceName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p.OUT("pchBuffer", ""),
        AutoSize("pchBuffer")..uint32_t.IN("unBufferLen", ""),

        returnDoc = "the size in bytes of the buffer required to hold the specified resource"
    )

    uint32_t(
        "GetResourceFullPath",
        """
        Provides the full path to the specified resource. Resource names can include named directories for drivers and other things, and this resolves all of
        those and returns the actual physical path. {@code pchResourceTypeDirectory} is the subdirectory of resources to look in.
        """,

        charASCII.const.p.IN("pchResourceName", ""),
        charASCII.const.p.IN("pchResourceTypeDirectory", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII.p.OUT("pchPathBuffer", ""),
        AutoSize("pchPathBuffer")..uint32_t.IN("unBufferLen", "")
    )
}