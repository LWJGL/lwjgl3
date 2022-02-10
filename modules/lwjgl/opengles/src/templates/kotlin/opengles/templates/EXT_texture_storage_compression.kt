/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_storage_compression = "EXTTextureStorageCompression".nativeClassGLES("EXT_texture_storage_compression", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Applications may wish to take advantage of framebuffer compression. Some platforms may support framebuffer compression at fixed bitrates. Such
        compression algorithms generally produce results that are visually lossless, but the results are typically not bit-exact when compared to a
        non-compressed result.

        This extension enables applications to opt-in to compression for immutable textures.

        Requires ${GLES30.core}.
        """

    IntConstant(
        """
        New attributes accepted by the {@code attrib_list} argument of #TexStorageAttribs2DEXT() and #TexStorageAttribs3DEXT(), and as the {@code pname}
        argument to {@code GetTexParameter*}.
        """,

        "SURFACE_COMPRESSION_EXT"..0x96C0
    )

    IntConstant(
        "New attributes accepted by the {@code pname} argument of #GetInternalformativ().",

        "NUM_SURFACE_COMPRESSION_FIXED_RATES_EXT"..0x8F6E
    )

    IntConstant(
        "Accepted as attribute values for #SURFACE_COMPRESSION_EXT by #TexStorageAttribs2DEXT() and #TexStorageAttribs3DEXT().",

        "SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT"..0x96C1,
        "SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT"..0x96C2,
        "SURFACE_COMPRESSION_FIXED_RATE_1BPC_EXT"..0x96C4,
        "SURFACE_COMPRESSION_FIXED_RATE_2BPC_EXT"..0x96C5,
        "SURFACE_COMPRESSION_FIXED_RATE_3BPC_EXT"..0x96C6,
        "SURFACE_COMPRESSION_FIXED_RATE_4BPC_EXT"..0x96C7,
        "SURFACE_COMPRESSION_FIXED_RATE_5BPC_EXT"..0x96C8,
        "SURFACE_COMPRESSION_FIXED_RATE_6BPC_EXT"..0x96C9,
        "SURFACE_COMPRESSION_FIXED_RATE_7BPC_EXT"..0x96CA,
        "SURFACE_COMPRESSION_FIXED_RATE_8BPC_EXT"..0x96CB,
        "SURFACE_COMPRESSION_FIXED_RATE_9BPC_EXT"..0x96CC,
        "SURFACE_COMPRESSION_FIXED_RATE_10BPC_EXT"..0x96CD,
        "SURFACE_COMPRESSION_FIXED_RATE_11BPC_EXT"..0x96CE,
        "SURFACE_COMPRESSION_FIXED_RATE_12BPC_EXT"..0x96CF
    )

    void(
        "TexStorageAttribs2DEXT",
        "Behaves identically to #TexStorage2D(), except that additional flags can specified in {@code attrib_list}.",

        GLenum("target", ""),
        GLsizei("levels", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        nullable..NullTerminated..GLint.const.p("attrib_list", "")
    )

    void(
        "TexStorageAttribs3DEXT",
        "Behaves identically to #TexStorage3D(), except that additional flags can specified in {@code attrib_list}.",

        GLenum("target", ""),
        GLsizei("levels", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", ""),
        GLsizei("depth", ""),
        nullable..NullTerminated..GLint.const.p("attrib_list", "")
    )
}