/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val NV_stream_consumer_gltexture_yuv = "NVStreamConsumerGLTextureYUV".nativeClassEGL("NV_stream_consumer_gltexture_yuv", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The EGL_KHR_stream_consumer_gltexture extension allows EGLStream frames to be latched to a GL texture for use in rendering. These frames are assumed to
        be stored in RGB format and accessed as such by shader programs. If the producer uses a different color space, the stream implementation must perform
        an implicit conversion.

        In cases where the producer operates in a native YUV color space, it may be desirable for shaders to directly access the YUV components, without
        conversion. This extension adds a new variant of the function to bind GL textures as stream consumers which allows attributes to specify the color
        space.

        Requires ${KHR_stream_consumer_gltexture.core}.
        """

    IntConstant(
        "Accepted as attribute name in {@code attrib_list} by #StreamConsumerGLTextureExternalAttribsNV().",

        "YUV_PLANE0_TEXTURE_UNIT_NV"..0x332C,
        "YUV_PLANE1_TEXTURE_UNIT_NV"..0x332D,
        "YUV_PLANE2_TEXTURE_UNIT_NV"..0x332E
    )

    IntConstant(
        "Accepted as attribute name in {@code attrib_list} by #StreamConsumerGLTextureExternalAttribsNV().",

        "YUV_NUMBER_OF_PLANES_EXT"..0x3311
    )

    IntConstant(
        "Accepted as value for #COLOR_BUFFER_TYPE attribute in {@code attrib_list} by #StreamConsumerGLTextureExternalAttribsNV().",

        "YUV_BUFFER_EXT"..0x3300
    )

    EGLBoolean(
        "StreamConsumerGLTextureExternalAttribsNV",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLStreamKHR.IN("stream", ""),
        nullable..noneTerminated..EGLAttrib_p.IN("attrib_list", "")
    )
}