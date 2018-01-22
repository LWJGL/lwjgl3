/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_required_internalformat = "OESRequiredInternalformat".nativeClassGLES("OES_required_internalformat", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The ES 1.1 API allows an implementation to store texture data internally with arbitrary precision, regardless of the format and type of the data
        supplied by the application. Similarly, ES allows an implementation to choose an arbitrary precision for the internal storage of image data allocated
        by glRenderbufferStorageOES.

        While this allows flexibility for implementations, it does mean that an application does not have a reliable means to request the implementation
        maintain a specific precision or to find out what precision the implementation will maintain for a given texture or renderbuffer image.

        For reference, "Desktop" OpenGL uses the {@code internalformat} argument to glTexImage*, glCopyTexImage* and glRenderbufferStorageEXT as a hint,
        defining the particular base format and precision that the application wants the implementation to maintain when storing the image data. Further, the
        application can choose an {@code internalformat} with a different base internal format than the source format specified by <format>. The implementation
        is not required to exactly match the precision specified by {@code internalformat} when choosing an internal storage precision, but it is required to
        match the base internal format of {@code internalformat}.

        In addition, ES 1.1 does not allow an implementation to fail a request to glTexImage2D for any of the legal {@code format} and {@code type}, even if
        the implementation does not natively support data stored in that external {@code format} and {@code type}. However, there are no additional requirements
        placed on the implementation. The ES implementation is free to store the texture data with lower precision than originally specified, for instance.
        Further, since ES removes the ability to query the texture object to find out what internal format it chose, there is no way for the application to
        find out that this has happened.

        This extension addresses the situation in two ways:
        ${ol(
            "This extension introduces the ability for an application to specify the desired \"sized\" internal formats for texture image allocation.",
            "This extension guarantees to maintain at least the specified precision of all available sized internal formats."
        )}
        An implementation that exports this extension is committing to support all of the legal values for {@code internalformat}, subject to the extension
        dependencies described herein. That is to say, the implementation is guaranteeing that choosing an {@code internalformat} argument with a value from
        these tables will not cause an image allocation request to fail. Furthermore, it is guaranteeing that for any sized internal format, the renderbuffer
        or texture data will be stored with at least the precision prescribed by the sized internal format.
        """

    IntConstant(
        "Accepted by the {@code internalformat} argument of TexImage2D, TexImage3DOES, and CopyTexImage2D.",

        "ALPHA8_OES"..0x803C,
        "LUMINANCE8_OES"..0x8040,
        "LUMINANCE8_ALPHA8_OES"..0x8045,
        "LUMINANCE4_ALPHA4_OES"..0x8043,
        "RGB565_OES"..0x8D62,
        "RGB8_OES"..0x8051,
        "RGBA4_OES"..0x8056,
        "RGB5_A1_OES"..0x8057,
        "RGBA8_OES"..0x8058,
        "DEPTH_COMPONENT16_OES"..0x81A5,
        "DEPTH_COMPONENT24_OES"..0x81A6,
        "DEPTH_COMPONENT32_OES"..0x81A7,
        "DEPTH24_STENCIL8_OES"..0x88F0,
        "RGB10_EXT"..0x8052,
        "RGB10_A2_EXT"..0x8059
    )
}