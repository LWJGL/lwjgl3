/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRResources = "VRResources".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRResources_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation = "Shared Resource Methods."

    uint32_t(
        "LoadSharedResource",
        "Loads the specified resource into the provided buffer if large enough.",

        const..charASCII_p.IN("pchResourceName", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchBuffer", ""),
        AutoSize("pchBuffer")..uint32_t.IN("unBufferLen", ""),

        returnDoc = "the size in bytes of the buffer required to hold the specified resource"
    )

    uint32_t(
        "GetResourceFullPath",
        """
        Provides the full path to the specified resource. Resource names can include named directories for drivers and other things, and this resolves all of
        those and returns the actual physical path. {@code pchResourceTypeDirectory} is the subdirectory of resources to look in.
        """,

        const..charASCII_p.IN("pchResourceName", ""),
        const..charASCII_p.IN("pchResourceTypeDirectory", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchPathBuffer", ""),
        AutoSize("pchPathBuffer")..uint32_t.IN("unBufferLen", "")
    )
}