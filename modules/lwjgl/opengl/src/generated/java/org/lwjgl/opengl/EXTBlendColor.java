/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_blend_color.txt">EXT_blend_color</a> extension.
 * 
 * <p>Blending capability is extended by defining a constant color that can be included in blending equations. A typical usage is blending two RGB images.
 * Without the constant blend factor, one image must have an alpha channel with each pixel set to the desired blend factor.</p>
 * 
 * <p>Promoted to core in {@link GL14 OpenGL 1.4}.</p>
 */
public class EXTBlendColor {

    static { GL.initialize(); }

    /** Accepted by the {@code sfactor} and {@code dfactor} parameters of BlendFunc. */
    public static final int
        GL_CONSTANT_COLOR_EXT           = 0x8001,
        GL_ONE_MINUS_CONSTANT_COLOR_EXT = 0x8002,
        GL_CONSTANT_ALPHA_EXT           = 0x8003,
        GL_ONE_MINUS_CONSTANT_ALPHA_EXT = 0x8004;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_BLEND_COLOR_EXT = 0x8005;

    protected EXTBlendColor() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendColorEXT ] ---

    public static native void glBlendColorEXT(@NativeType("GLfloat") float red, @NativeType("GLfloat") float green, @NativeType("GLfloat") float blue, @NativeType("GLfloat") float alpha);

}