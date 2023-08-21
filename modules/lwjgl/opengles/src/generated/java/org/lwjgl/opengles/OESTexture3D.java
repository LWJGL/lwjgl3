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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/OES/OES_texture_3D.txt">OES_texture_3D</a> extension.
 * 
 * <p>This extension adds support for 3D textures. The OpenGL ES 2.0 texture wrap modes and mip-mapping is supported for power of two 3D textures. Mip-
 * mapping and texture wrap modes other than CLAMP_TO_EDGE are not supported for non-power of two 3D textures.</p>
 * 
 * <p>The OES_texture_npot extension, if supported, will enable mip-mapping and other wrap modes for non-power of two 3D textures.</p>
 * 
 * <p>Requires {@link GLES20 GLES 2.0}.</p>
 */
public class OESTexture3D {

    static { GLES.initialize(); }

    /**
     * Accepted by the {@code target} parameter of TexImage3DOES, TexSubImage3DOES, CopyTexSubImage3DOES, CompressedTexImage3DOES and
     * CompressedTexSubImage3DOES, GetTexParameteriv, and GetTexParameterfv.
     */
    public static final int GL_TEXTURE_3D_OES = 0x806F;

    /** Accepted by the {@code pname} parameter of TexParameteriv, TexParameterfv, GetTexParameteriv, and GetTexParameterfv. */
    public static final int GL_TEXTURE_WRAP_R_OES = 0x8072;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv. */
    public static final int
        GL_MAX_3D_TEXTURE_SIZE_OES = 0x8073,
        GL_TEXTURE_BINDING_3D_OES  = 0x806A;

    protected OESTexture3D() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexImage3DOES ] ---

    public static native void nglTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int format, int type, long pixels);

    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ByteBuffer pixels) {
        nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, pixels);
    }

    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") ShortBuffer pixels) {
        nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") IntBuffer pixels) {
        nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") FloatBuffer pixels) {
        nglTexImage3DOES(target, level, internalformat, width, height, depth, border, format, type, memAddressSafe(pixels));
    }

    // --- [ glTexSubImage3DOES ] ---

    public static native void nglTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels);

    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer pixels) {
        nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") long pixels) {
        nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") ShortBuffer pixels) {
        nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer pixels) {
        nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") FloatBuffer pixels) {
        nglTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, memAddress(pixels));
    }

    // --- [ glCopyTexSubImage3DOES ] ---

    public static native void glCopyTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height);

    // --- [ glCompressedTexImage3DOES ] ---

    public static native void nglCompressedTexImage3DOES(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize, long data);

    public static void glCompressedTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, imageSize, data);
    }

    public static void glCompressedTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @Nullable @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexImage3DOES(target, level, internalformat, width, height, depth, border, remainingSafe(data), memAddressSafe(data));
    }

    // --- [ glCompressedTexSubImage3DOES ] ---

    public static native void nglCompressedTexSubImage3DOES(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int imageSize, long data);

    public static void glCompressedTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLsizei") int imageSize, @NativeType("void const *") long data) {
        nglCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, imageSize, data);
    }

    public static void glCompressedTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("void const *") ByteBuffer data) {
        nglCompressedTexSubImage3DOES(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data.remaining(), memAddress(data));
    }

    // --- [ glFramebufferTexture3DOES ] ---

    public static native void glFramebufferTexture3DOES(@NativeType("GLenum") int target, @NativeType("GLenum") int attachment, @NativeType("GLenum") int textarget, @NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLint") int zoffset);

    /** Array version of: {@link #glTexImage3DOES TexImage3DOES} */
    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") short[] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTexImage3DOES TexImage3DOES} */
    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") int[] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTexImage3DOES TexImage3DOES} */
    public static void glTexImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLint") int border, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @Nullable @NativeType("void const *") float[] pixels) {
        long __functionAddress = GLES.getICD().glTexImage3DOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, internalformat, width, height, depth, border, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") short[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") int[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

    /** Array version of: {@link #glTexSubImage3DOES TexSubImage3DOES} */
    public static void glTexSubImage3DOES(@NativeType("GLenum") int target, @NativeType("GLint") int level, @NativeType("GLint") int xoffset, @NativeType("GLint") int yoffset, @NativeType("GLint") int zoffset, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLenum") int format, @NativeType("GLenum") int type, @NativeType("void const *") float[] pixels) {
        long __functionAddress = GLES.getICD().glTexSubImage3DOES;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels, __functionAddress);
    }

}