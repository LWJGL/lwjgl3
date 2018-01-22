/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val EXT_texture_compression_bptc = "EXTTextureCompressionBPTC".nativeClassGLES("EXT_texture_compression_bptc", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension provides additional texture compression functionality specific to the BPTC and BPTC_FLOAT compressed texture formats (called BC7 and BC6H respectively in Microsoft's DirectX API).

        Traditional block compression methods as typified by s3tc and latc compress a block of pixels into indicies along a gradient. This works well for
        smooth images, but can have quality issues along sharp edges and strong chrominance transitions. To improve quality in these problematic cases, the
        BPTC formats can divide each block into multiple partitions, each of which are compressed using an independent gradient.

        In addition, it is desirable to directly support high dynamic range imagery in compressed formats, which is accomplished by the BPTC_FLOAT formats.

        Requirs ${GLES30.core}.
        """

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, TexStorage2D, TexStorage3D, CompressedTexImage2D, and CompressedTexImage3D
        and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.
        """,

        "COMPRESSED_RGBA_BPTC_UNORM_EXT"..0x8E8C,
        "COMPRESSED_SRGB_ALPHA_BPTC_UNORM_EXT"..0x8E8D,
        "COMPRESSED_RGB_BPTC_SIGNED_FLOAT_EXT"..0x8E8E,
        "COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT_EXT"..0x8E8F
    )
}