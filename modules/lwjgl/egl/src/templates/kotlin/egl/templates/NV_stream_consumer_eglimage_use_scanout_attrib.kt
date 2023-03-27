/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_stream_consumer_eglimage_use_scanout_attrib = "NVStreamConsumerEGLImageUseScanoutAttrib".nativeClassEGL("NV_stream_consumer_eglimage_use_scanout_attrib", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows clients to specify to EGL implementations if the images frames in the {@code EGLStream} acquired as {@code EGLImages} are to be
        scanned out directly by display hardware.

        Requires ${NV_stream_consumer_eglimage.link}.
        """

    IntConstant(
        "Accepted as an attribute name in the {@code attrib_list} parameter of #StreamImageConsumerConnectNV().",

        "STREAM_CONSUMER_IMAGE_USE_SCANOUT_NV"..0x3378
    )
}