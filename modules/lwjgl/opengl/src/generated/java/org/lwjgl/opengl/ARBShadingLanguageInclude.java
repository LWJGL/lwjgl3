/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ARBShadingLanguageInclude {

    static { GL.initialize(); }

    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;

    public static final int
        GL_NAMED_STRING_LENGTH_ARB = 0x8DE9,
        GL_NAMED_STRING_TYPE_ARB   = 0x8DEA;

    protected ARBShadingLanguageInclude() {
        throw new UnsupportedOperationException();
    }

    // --- [ glNamedStringARB ] ---

    /** {@code void glNamedStringARB(GLenum type, GLint namelen, GLchar const * name, GLint stringlen, GLchar const * string)} */
    public static native void nglNamedStringARB(int type, int namelen, long name, int stringlen, long string);

    /** {@code void glNamedStringARB(GLenum type, GLint namelen, GLchar const * name, GLint stringlen, GLchar const * string)} */
    public static void glNamedStringARB(@NativeType("GLenum") int type, @NativeType("GLchar const *") ByteBuffer name, @NativeType("GLchar const *") ByteBuffer string) {
        nglNamedStringARB(type, name.remaining(), memAddress(name), string.remaining(), memAddress(string));
    }

    /** {@code void glNamedStringARB(GLenum type, GLint namelen, GLchar const * name, GLint stringlen, GLchar const * string)} */
    public static void glNamedStringARB(@NativeType("GLenum") int type, @NativeType("GLchar const *") CharSequence name, @NativeType("GLchar const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            int stringEncodedLength = stack.nUTF8(string, false);
            long stringEncoded = stack.getPointerAddress();
            nglNamedStringARB(type, nameEncodedLength, nameEncoded, stringEncodedLength, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteNamedStringARB ] ---

    /** {@code void glDeleteNamedStringARB(GLint namelen, GLchar const * name)} */
    public static native void nglDeleteNamedStringARB(int namelen, long name);

    /** {@code void glDeleteNamedStringARB(GLint namelen, GLchar const * name)} */
    public static void glDeleteNamedStringARB(@NativeType("GLchar const *") ByteBuffer name) {
        nglDeleteNamedStringARB(name.remaining(), memAddress(name));
    }

    /** {@code void glDeleteNamedStringARB(GLint namelen, GLchar const * name)} */
    public static void glDeleteNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglDeleteNamedStringARB(nameEncodedLength, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCompileShaderIncludeARB ] ---

    /** {@code void glCompileShaderIncludeARB(GLuint shader, GLsizei count, GLchar const * const * path, GLint const * length)} */
    public static native void nglCompileShaderIncludeARB(int shader, int count, long path, long length);

    /** {@code void glCompileShaderIncludeARB(GLuint shader, GLsizei count, GLchar const * const * path, GLint const * length)} */
    public static void glCompileShaderIncludeARB(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer path, @NativeType("GLint const *") @Nullable IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, path.remaining());
        }
        nglCompileShaderIncludeARB(shader, path.remaining(), memAddress(path), memAddressSafe(length));
    }

    // --- [ glIsNamedStringARB ] ---

    /** {@code GLboolean glIsNamedStringARB(GLint namelen, GLchar const * name)} */
    public static native boolean nglIsNamedStringARB(int namelen, long name);

    /** {@code GLboolean glIsNamedStringARB(GLint namelen, GLchar const * name)} */
    @NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@NativeType("GLchar const *") ByteBuffer name) {
        return nglIsNamedStringARB(name.remaining(), memAddress(name));
    }

    /** {@code GLboolean glIsNamedStringARB(GLint namelen, GLchar const * name)} */
    @NativeType("GLboolean")
    public static boolean glIsNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            return nglIsNamedStringARB(nameEncodedLength, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetNamedStringARB ] ---

    /** {@code void glGetNamedStringARB(GLint namelen, GLchar const * name, GLsizei bufSize, GLint * stringlen, GLchar * string)} */
    public static native void nglGetNamedStringARB(int namelen, long name, int bufSize, long stringlen, long string);

    /** {@code void glGetNamedStringARB(GLint namelen, GLchar const * name, GLsizei bufSize, GLint * stringlen, GLchar * string)} */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLint *") @Nullable IntBuffer stringlen, @NativeType("GLchar *") ByteBuffer string) {
        if (CHECKS) {
            checkSafe(stringlen, 1);
        }
        nglGetNamedStringARB(name.remaining(), memAddress(name), string.remaining(), memAddressSafe(stringlen), memAddress(string));
    }

    /** {@code void glGetNamedStringARB(GLint namelen, GLchar const * name, GLsizei bufSize, GLint * stringlen, GLchar * string)} */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLint *") @Nullable IntBuffer stringlen, @NativeType("GLchar *") ByteBuffer string) {
        if (CHECKS) {
            checkSafe(stringlen, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglGetNamedStringARB(nameEncodedLength, nameEncoded, string.remaining(), memAddressSafe(stringlen), memAddress(string));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetNamedStringARB(GLint namelen, GLchar const * name, GLsizei bufSize, GLint * stringlen, GLchar * string)} */
    @NativeType("void")
    public static String glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLsizei") int bufSize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            IntBuffer stringlen = stack.ints(0);
            ByteBuffer string = stack.malloc(bufSize);
            nglGetNamedStringARB(nameEncodedLength, nameEncoded, bufSize, memAddress(stringlen), memAddress(string));
            return memUTF8(string, stringlen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetNamedStringARB(GLint namelen, GLchar const * name, GLsizei bufSize, GLint * stringlen, GLchar * string)} */
    @NativeType("void")
    public static String glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name) {
        return glGetNamedStringARB(name, glGetNamedStringiARB(name, GL_NAMED_STRING_LENGTH_ARB));
    }

    // --- [ glGetNamedStringivARB ] ---

    /** {@code void glGetNamedStringivARB(GLint namelen, GLchar const * name, GLenum pname, GLint * params)} */
    public static native void nglGetNamedStringivARB(int namelen, long name, int pname, long params);

    /** {@code void glGetNamedStringivARB(GLint namelen, GLchar const * name, GLenum pname, GLint * params)} */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetNamedStringivARB(name.remaining(), memAddress(name), pname, memAddress(params));
    }

    /** {@code void glGetNamedStringivARB(GLint namelen, GLchar const * name, GLenum pname, GLint * params)} */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            nglGetNamedStringivARB(nameEncodedLength, nameEncoded, pname, memAddress(params));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetNamedStringivARB(GLint namelen, GLchar const * name, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetNamedStringiARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            IntBuffer params = stack.callocInt(1);
            nglGetNamedStringivARB(nameEncodedLength, nameEncoded, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glCompileShaderIncludeARB(GLuint shader, GLsizei count, GLchar const * const * path, GLint const * length)} */
    public static void glCompileShaderIncludeARB(@NativeType("GLuint") int shader, @NativeType("GLchar const * const *") PointerBuffer path, @NativeType("GLint const *") int @Nullable [] length) {
        long __functionAddress = GL.getICD().glCompileShaderIncludeARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, path.remaining());
        }
        callPPV(shader, path.remaining(), memAddress(path), length, __functionAddress);
    }

    /** {@code void glGetNamedStringARB(GLint namelen, GLchar const * name, GLsizei bufSize, GLint * stringlen, GLchar * string)} */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLint *") int @Nullable [] stringlen, @NativeType("GLchar *") ByteBuffer string) {
        long __functionAddress = GL.getICD().glGetNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(stringlen, 1);
        }
        callPPPV(name.remaining(), memAddress(name), string.remaining(), stringlen, memAddress(string), __functionAddress);
    }

    /** {@code void glGetNamedStringARB(GLint namelen, GLchar const * name, GLsizei bufSize, GLint * stringlen, GLchar * string)} */
    public static void glGetNamedStringARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLint *") int @Nullable [] stringlen, @NativeType("GLchar *") ByteBuffer string) {
        long __functionAddress = GL.getICD().glGetNamedStringARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(stringlen, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            callPPPV(nameEncodedLength, nameEncoded, string.remaining(), stringlen, memAddress(string), __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetNamedStringivARB(GLint namelen, GLchar const * name, GLenum pname, GLint * params)} */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") ByteBuffer name, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedStringivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPPV(name.remaining(), memAddress(name), pname, params, __functionAddress);
    }

    /** {@code void glGetNamedStringivARB(GLint namelen, GLchar const * name, GLenum pname, GLint * params)} */
    public static void glGetNamedStringivARB(@NativeType("GLchar const *") CharSequence name, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetNamedStringivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int nameEncodedLength = stack.nASCII(name, false);
            long nameEncoded = stack.getPointerAddress();
            callPPV(nameEncodedLength, nameEncoded, pname, params, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}