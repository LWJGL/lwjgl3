/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_EGL_image_storage_compression = "EXTEGLImageStorageCompression".nativeClassGLES("EXT_EGL_image_storage_compression", postfix = EXT) {
    IntConstant(
        "SURFACE_COMPRESSION_EXT"..0x96C0
    )

    IntConstant(
        "SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT"..0x96C1,
        "SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT"..0x96C2
    )
}