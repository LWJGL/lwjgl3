/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_texgen_reflection.txt">NV_texgen_reflection</a> extension.
 * 
 * <p>This extension provides two new texture coordinate generation modes that are useful texture-based lighting and environment mapping.</p>
 */
public final class NVTexgenReflection {

    /** Accepted by the {@code param} parameter of TexGend, TexGenf, TexGeni when {@code pname} parameter is TEXTURE_GEN_MODE */
    public static final int
        GL_NORMAL_MAP_NV     = 0x8511,
        GL_REFLECTION_MAP_NV = 0x8512;

    private NVTexgenReflection() {}

}