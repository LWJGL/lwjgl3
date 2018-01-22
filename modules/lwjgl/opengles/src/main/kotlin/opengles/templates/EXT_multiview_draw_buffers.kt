/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_multiview_draw_buffers = "EXTMultiviewDrawBuffers".nativeClassGLES("EXT_multiview_draw_buffers", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows selecting among draw buffers as the rendering target. This may be among multiple primary buffers pertaining to platform-specific
        stereoscopic or multiview displays or among offscreen framebuffer object color attachments.

        To remove any artificial limitations imposed on the number of possible buffers, draw buffers are identified not as individual enums, but as pairs of
        values consisting of an enum representing buffer locations such as COLOR_ATTACHMENT_EXT or MULTIVIEW_EXT, and an integer representing an identifying
        index of buffers of this location. These (location, index) pairs are used to specify draw buffer targets using a new DrawBuffersIndexedEXT call.

        Rendering to buffers of location MULTIVIEW_EXT associated with the context allows rendering to multiview buffers created by EGL using
        EGL_EXT_multiview_window for stereoscopic displays.

        Rendering to COLOR_ATTACHMENT_EXT buffers allows implementations to increase the number of potential color attachments indefinitely to renderbuffers
        and textures.

        This extension allows the traditional quad buffer stereoscopic rendering method that has proven effective by indicating a left or right draw buffer and
        rendering to each accordingly, but is also dynamic enough to handle an arbitrary number of color buffer targets all using the same shader. This grants
        the user maximum flexibility as well as a familiar interface.
        """

    IntConstant(
        "Accepted by the {@code location} parameter of DrawBuffersIndexedEXT.",

        "COLOR_ATTACHMENT_EXT"..0x90F0,
        "MULTIVIEW_EXT"..0x90F1
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetIntegeri_EXT.",

        "DRAW_BUFFER_EXT"..0x0C01,
        "READ_BUFFER_EXT"..0x0C02
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetInteger.",

        "MAX_MULTIVIEW_BUFFERS_EXT"..0x90F2
    )

    void(
        "ReadBufferIndexedEXT",
        "",

        GLenum.IN("src", ""),
        GLint.IN("index", "")
    )

    void(
        "DrawBuffersIndexedEXT",
        "",

        AutoSize("location", "indices")..GLint.IN("n", ""),
        const..GLenum_p.IN("location", ""),
        const..GLint_p.IN("indices", "")
    )

    void(
        "GetIntegeri_vEXT",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("index", ""),
        ReturnParam..Check(1)..GLint_p.OUT("data", "")
    )
}