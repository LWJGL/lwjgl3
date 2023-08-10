/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_deep_texture3D.txt">NV_deep_texture3D</a> extension.
 * 
 * <p>Some applications require 3D textures that have a significant number of slices, but less resolution in width and height. In the current spec, the
 * maximum value for the size of all three dimensions is specified by a single value. This extension adds a second set of limits against which 3D textures
 * can be checked if an application needs deeper textures than would be allowed by the symmetric texture limits.</p>
 */
public final class NVDeepTexture3D {

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int
        GL_MAX_DEEP_3D_TEXTURE_WIDTH_HEIGHT_NV = 0x90D0,
        GL_MAX_DEEP_3D_TEXTURE_DEPTH_NV        = 0x90D1;

    private NVDeepTexture3D() {}

}