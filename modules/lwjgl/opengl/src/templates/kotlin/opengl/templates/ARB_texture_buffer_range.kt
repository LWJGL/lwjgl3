/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_texture_buffer_range = "ARBTextureBufferRange".nativeClassGL("ARB_texture_buffer_range") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        ${ARB_texture_buffer_object.link} (which was promoted to core in OpenGL 3.1) introduced the ability to attach the data store of a buffer object to a buffer
        texture and access it from shaders. The extension only allows the entire store of the buffer object to the texture. This extension expands on this and
        allows a sub-range of the buffer's data store to be attached to a texture. This can be used, for example, to allow multiple buffer textures to be backed
        by independent sub-ranges of the same buffer object, or for different sub-ranges of a single buffer object to be used for different purposes.

        Requires ${GL15.core}. ${GL43.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameter.",

        "TEXTURE_BUFFER_OFFSET"..0x919D,
        "TEXTURE_BUFFER_SIZE"..0x919E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "TEXTURE_BUFFER_OFFSET_ALIGNMENT"..0x919F
    )

    val src = GL43C reuse "TexBufferRange"

    DependsOn("GL_EXT_direct_state_access")..void(
        "TextureBufferRangeEXT",
        "DSA version of #TexBufferRange().",

        GLuint.IN("texture", "the texture object"),
        src["target"],
        src["internalformat"],
        src["buffer"],
        src["offset"],
        src["size"]
    )
}