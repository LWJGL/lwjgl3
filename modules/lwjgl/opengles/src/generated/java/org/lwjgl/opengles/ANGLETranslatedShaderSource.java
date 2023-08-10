/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ANGLE/ANGLE_translated_shader_source.txt">ANGLE_translated_shader_source</a> extension.
 * 
 * <p>WebGL uses the GLSL ES 2.0 spec on all platforms, and translates these shaders to the host platform's native language (HLSL, GLSL, and even GLSL ES).
 * For debugging purposes, it is useful to be able to examine the shader after translation.</p>
 * 
 * <p>This extension addes a new function to query the translated shader source, and adds a new enum for GetShaderiv's &lt;pname&gt; parameter to query the
 * translated shader source length.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class ANGLETranslatedShaderSource {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameter of GetShaderiv. */
    public static final int GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE = 0x93A0;

    protected ANGLETranslatedShaderSource() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetTranslatedShaderSourceANGLE ] ---

    public static native void nglGetTranslatedShaderSourceANGLE(int shader, int bufsize, long length, long source);

    public static void glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetTranslatedShaderSourceANGLE(shader, source.remaining(), memAddressSafe(length), memAddress(source));
    }

    @NativeType("void")
    public static String glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader, @NativeType("GLsizei") int bufsize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer source = memAlloc(bufsize);
        try {
            IntBuffer length = stack.ints(0);
            nglGetTranslatedShaderSourceANGLE(shader, bufsize, memAddress(length), memAddress(source));
            return memUTF8(source, length.get(0));
        } finally {
            memFree(source);
            stack.setPointer(stackPointer);
        }
    }

    @NativeType("void")
    public static String glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader) {
        return glGetTranslatedShaderSourceANGLE(shader, GLES20.glGetShaderi(shader, GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE));
    }

    /** Array version of: {@link #glGetTranslatedShaderSourceANGLE GetTranslatedShaderSourceANGLE} */
    public static void glGetTranslatedShaderSourceANGLE(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer source) {
        long __functionAddress = GLES.getICD().glGetTranslatedShaderSourceANGLE;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(shader, source.remaining(), length, memAddress(source), __functionAddress);
    }

}