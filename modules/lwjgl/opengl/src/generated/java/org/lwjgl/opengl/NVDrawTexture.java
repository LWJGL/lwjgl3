/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_draw_texture.txt">NV_draw_texture</a> extension.
 * 
 * <p>This extension provides a new function, DrawTextureNV(), allowing
 * applications to draw an screen-aligned rectangle displaying some or all of
 * the contents of a two-dimensional or rectangle texture.  Callers specify a
 * texture object, an optional sampler object, window coordinates of the
 * rectangle to draw, and texture coordinates corresponding to the corners of
 * the rectangle.  For each fragment produced by the rectangle, DrawTextureNV
 * interpolates the texture coordinates, performs a texture lookup, and uses
 * the texture result as the fragment color.</p>
 */
public class NVDrawTexture {

    static { GL.initialize(); }

    protected NVDrawTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawTextureNV ] ---

    public static native void glDrawTextureNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler, @NativeType("GLfloat") float x0, @NativeType("GLfloat") float y0, @NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float z, @NativeType("GLfloat") float s0, @NativeType("GLfloat") float t0, @NativeType("GLfloat") float s1, @NativeType("GLfloat") float t1);

}