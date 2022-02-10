/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_EGL_image_storage_compression = "EXTEGLImageStorageCompression".nativeClassGLES("EXT_EGL_image_storage_compression", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications may wish to take advantage of framebuffer compression. Some platforms may support framebuffer compression at fixed bitrates. Such
        compression algorithms generally produce results that are visually lossless, but the results are typically not bit-exact when compared to a
        non-compressed result.

        This extension enables applications to specify a texture by taking all properties from a fixed-rate compressed {@code EGLImage}.

        Requires ${GLES30.core} and ${EXT_EGL_image_storage.link}.
        """

    IntConstant(
        "New attributes accepted by the {@code attrib_list} argument of #EGLImageTargetTexStorageEXT().",

        "SURFACE_COMPRESSION_EXT"..0x96C0
    )

    IntConstant(
        "Accepted as attribute values for #SURFACE_COMPRESSION_EXT by #EGLImageTargetTexStorageEXT().",

        "SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT"..0x96C1,
        "SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT"..0x96C2
    )
}