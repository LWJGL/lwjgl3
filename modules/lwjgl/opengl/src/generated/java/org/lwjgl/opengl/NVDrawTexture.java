/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

public class NVDrawTexture {

    static { GL.initialize(); }

    protected NVDrawTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawTextureNV ] ---

    /** {@code void glDrawTextureNV(GLuint texture, GLuint sampler, GLfloat x0, GLfloat y0, GLfloat x1, GLfloat y1, GLfloat z, GLfloat s0, GLfloat t0, GLfloat s1, GLfloat t1)} */
    public static native void glDrawTextureNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int sampler, @NativeType("GLfloat") float x0, @NativeType("GLfloat") float y0, @NativeType("GLfloat") float x1, @NativeType("GLfloat") float y1, @NativeType("GLfloat") float z, @NativeType("GLfloat") float s0, @NativeType("GLfloat") float t0, @NativeType("GLfloat") float s1, @NativeType("GLfloat") float t1);

}