/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val INTEL_map_texture = "INTELMapTexture".nativeClassGL("INTEL_map_texture", postfix = INTEL) {
    IntConstant(
        "TEXTURE_MEMORY_LAYOUT_INTEL"..0x83FF
    )

    IntConstant(
        "LAYOUT_DEFAULT_INTEL".."0",
        "LAYOUT_LINEAR_INTEL".."1",
        "LAYOUT_LINEAR_CPU_CACHED_INTEL".."2"
    )

    void(
        "SyncTextureINTEL",

        GLuint("texture")
    )

    void(
        "UnmapTexture2DINTEL",

        GLuint("texture"),
        GLint("level")
    )

    customMethod("""
    private static int getStride(IntBuffer stride) {
        return stride.get(stride.position());
    }

    private static int getStride(int[] stride) {
        return stride[0];
    }""")

    MapPointer("getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT)", oldBufferOverloads = true)..void.p(
        "MapTexture2DINTEL",

        GLuint("texture"),
        GLint("level"),
        GLbitfield("access"),
        Check(1)..GLint.p("stride"),
        Check(1)..GLenum.p("layout")
    )
}