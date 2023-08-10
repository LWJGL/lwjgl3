/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_gather.txt">ARB_texture_gather</a> extension.
 * 
 * <p>This extension provides a new set of texture functions (textureGather) to the shading language that determine 2x2 footprint that are used for linear
 * filtering in a texture lookup, and return a vector consisting of the first component from each of the four texels in the footprint.</p>
 * 
 * <p>Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public final class ARBTextureGather {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET_ARB     = 0x8E5E,
        GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET_ARB     = 0x8E5F,
        GL_MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS_ARB = 0x8F9F;

    private ARBTextureGather() {}

}