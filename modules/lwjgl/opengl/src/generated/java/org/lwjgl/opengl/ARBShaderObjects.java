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

public class ARBShaderObjects {

    static { GL.initialize(); }

    public static final int GL_PROGRAM_OBJECT_ARB = 0x8B40;

    public static final int
        GL_OBJECT_TYPE_ARB                      = 0x8B4E,
        GL_OBJECT_SUBTYPE_ARB                   = 0x8B4F,
        GL_OBJECT_DELETE_STATUS_ARB             = 0x8B80,
        GL_OBJECT_COMPILE_STATUS_ARB            = 0x8B81,
        GL_OBJECT_LINK_STATUS_ARB               = 0x8B82,
        GL_OBJECT_VALIDATE_STATUS_ARB           = 0x8B83,
        GL_OBJECT_INFO_LOG_LENGTH_ARB           = 0x8B84,
        GL_OBJECT_ATTACHED_OBJECTS_ARB          = 0x8B85,
        GL_OBJECT_ACTIVE_UNIFORMS_ARB           = 0x8B86,
        GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB = 0x8B87,
        GL_OBJECT_SHADER_SOURCE_LENGTH_ARB      = 0x8B88;

    public static final int GL_SHADER_OBJECT_ARB = 0x8B48;

    public static final int
        GL_FLOAT_VEC2_ARB             = 0x8B50,
        GL_FLOAT_VEC3_ARB             = 0x8B51,
        GL_FLOAT_VEC4_ARB             = 0x8B52,
        GL_INT_VEC2_ARB               = 0x8B53,
        GL_INT_VEC3_ARB               = 0x8B54,
        GL_INT_VEC4_ARB               = 0x8B55,
        GL_BOOL_ARB                   = 0x8B56,
        GL_BOOL_VEC2_ARB              = 0x8B57,
        GL_BOOL_VEC3_ARB              = 0x8B58,
        GL_BOOL_VEC4_ARB              = 0x8B59,
        GL_FLOAT_MAT2_ARB             = 0x8B5A,
        GL_FLOAT_MAT3_ARB             = 0x8B5B,
        GL_FLOAT_MAT4_ARB             = 0x8B5C,
        GL_SAMPLER_1D_ARB             = 0x8B5D,
        GL_SAMPLER_2D_ARB             = 0x8B5E,
        GL_SAMPLER_3D_ARB             = 0x8B5F,
        GL_SAMPLER_CUBE_ARB           = 0x8B60,
        GL_SAMPLER_1D_SHADOW_ARB      = 0x8B61,
        GL_SAMPLER_2D_SHADOW_ARB      = 0x8B62,
        GL_SAMPLER_2D_RECT_ARB        = 0x8B63,
        GL_SAMPLER_2D_RECT_SHADOW_ARB = 0x8B64;

    protected ARBShaderObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDeleteObjectARB ] ---

    /** {@code void glDeleteObjectARB(GLhandleARB obj)} */
    public static native void glDeleteObjectARB(@NativeType("GLhandleARB") int obj);

    // --- [ glGetHandleARB ] ---

    /** {@code GLhandleARB glGetHandleARB(GLenum pname)} */
    @NativeType("GLhandleARB")
    public static native int glGetHandleARB(@NativeType("GLenum") int pname);

    // --- [ glDetachObjectARB ] ---

    /** {@code void glDetachObjectARB(GLhandleARB containerObj, GLhandleARB attachedObj)} */
    public static native void glDetachObjectARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLhandleARB") int attachedObj);

    // --- [ glCreateShaderObjectARB ] ---

    /** {@code GLhandleARB glCreateShaderObjectARB(GLenum shaderType)} */
    @NativeType("GLhandleARB")
    public static native int glCreateShaderObjectARB(@NativeType("GLenum") int shaderType);

    // --- [ glShaderSourceARB ] ---

    /** {@code void glShaderSourceARB(GLhandleARB shaderObj, GLsizei count, GLcharARB const ** string, GLint const * length)} */
    public static native void nglShaderSourceARB(int shaderObj, int count, long string, long length);

    /** {@code void glShaderSourceARB(GLhandleARB shaderObj, GLsizei count, GLcharARB const ** string, GLint const * length)} */
    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") PointerBuffer string, @NativeType("GLint const *") @Nullable IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, string.remaining());
        }
        nglShaderSourceARB(shaderObj, string.remaining(), memAddress(string), memAddressSafe(length));
    }

    /** {@code void glShaderSourceARB(GLhandleARB shaderObj, GLsizei count, GLcharARB const ** string, GLint const * length)} */
    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") CharSequence... string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSourceARB(shaderObj, string.length, stringAddress, stringAddress - (string.length << 2));
            org.lwjgl.system.APIUtil.apiArrayFree(stringAddress, string.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glShaderSourceARB(GLhandleARB shaderObj, GLsizei count, GLcharARB const ** string, GLint const * length)} */
    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSourceARB(shaderObj, 1, stringAddress, stringAddress - 4);
            org.lwjgl.system.APIUtil.apiArrayFree(stringAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCompileShaderARB ] ---

    /** {@code void glCompileShaderARB(GLhandleARB shaderObj)} */
    public static native void glCompileShaderARB(@NativeType("GLhandleARB") int shaderObj);

    // --- [ glCreateProgramObjectARB ] ---

    /** {@code GLhandleARB glCreateProgramObjectARB(void)} */
    @NativeType("GLhandleARB")
    public static native int glCreateProgramObjectARB();

    // --- [ glAttachObjectARB ] ---

    /** {@code void glAttachObjectARB(GLhandleARB containerObj, GLhandleARB obj)} */
    public static native void glAttachObjectARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLhandleARB") int obj);

    // --- [ glLinkProgramARB ] ---

    /** {@code void glLinkProgramARB(GLhandleARB programObj)} */
    public static native void glLinkProgramARB(@NativeType("GLhandleARB") int programObj);

    // --- [ glUseProgramObjectARB ] ---

    /** {@code void glUseProgramObjectARB(GLhandleARB programObj)} */
    public static native void glUseProgramObjectARB(@NativeType("GLhandleARB") int programObj);

    // --- [ glValidateProgramARB ] ---

    /** {@code void glValidateProgramARB(GLhandleARB programObj)} */
    public static native void glValidateProgramARB(@NativeType("GLhandleARB") int programObj);

    // --- [ glUniform1fARB ] ---

    /** {@code void glUniform1fARB(GLint location, GLfloat v0)} */
    public static native void glUniform1fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glUniform2fARB ] ---

    /** {@code void glUniform2fARB(GLint location, GLfloat v0, GLfloat v1)} */
    public static native void glUniform2fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glUniform3fARB ] ---

    /** {@code void glUniform3fARB(GLint location, GLfloat v0, GLfloat v1, GLfloat v2)} */
    public static native void glUniform3fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glUniform4fARB ] ---

    /** {@code void glUniform4fARB(GLint location, GLfloat v0, GLfloat v1, GLfloat v2, GLfloat v3)} */
    public static native void glUniform4fARB(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glUniform1iARB ] ---

    /** {@code void glUniform1iARB(GLint location, GLint v0)} */
    public static native void glUniform1iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glUniform2iARB ] ---

    /** {@code void glUniform2iARB(GLint location, GLint v0, GLint v1)} */
    public static native void glUniform2iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glUniform3iARB ] ---

    /** {@code void glUniform3iARB(GLint location, GLint v0, GLint v1, GLint v2)} */
    public static native void glUniform3iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glUniform4iARB ] ---

    /** {@code void glUniform4iARB(GLint location, GLint v0, GLint v1, GLint v2, GLint v3)} */
    public static native void glUniform4iARB(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glUniform1fvARB ] ---

    /** {@code void glUniform1fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform1fvARB(int location, int count, long value);

    /** {@code void glUniform1fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform1fvARB(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2fvARB ] ---

    /** {@code void glUniform2fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform2fvARB(int location, int count, long value);

    /** {@code void glUniform2fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform2fvARB(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3fvARB ] ---

    /** {@code void glUniform3fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform3fvARB(int location, int count, long value);

    /** {@code void glUniform3fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform3fvARB(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4fvARB ] ---

    /** {@code void glUniform4fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static native void nglUniform4fvARB(int location, int count, long value);

    /** {@code void glUniform4fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform4fvARB(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniform1ivARB ] ---

    /** {@code void glUniform1ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform1ivARB(int location, int count, long value);

    /** {@code void glUniform1ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform1ivARB(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2ivARB ] ---

    /** {@code void glUniform2ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform2ivARB(int location, int count, long value);

    /** {@code void glUniform2ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform2ivARB(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3ivARB ] ---

    /** {@code void glUniform3ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform3ivARB(int location, int count, long value);

    /** {@code void glUniform3ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform3ivARB(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4ivARB ] ---

    /** {@code void glUniform4ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static native void nglUniform4ivARB(int location, int count, long value);

    /** {@code void glUniform4ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform4ivARB(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniformMatrix2fvARB ] ---

    /** {@code void glUniformMatrix2fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix2fvARB(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix2fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2fvARB(location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3fvARB ] ---

    /** {@code void glUniformMatrix3fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix3fvARB(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix3fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3fvARB(location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4fvARB ] ---

    /** {@code void glUniformMatrix4fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static native void nglUniformMatrix4fvARB(int location, int count, boolean transpose, long value);

    /** {@code void glUniformMatrix4fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4fvARB(location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glGetObjectParameterfvARB ] ---

    /** {@code void glGetObjectParameterfvARB(GLhandleARB obj, GLenum pname, GLfloat * params)} */
    public static native void nglGetObjectParameterfvARB(int obj, int pname, long params);

    /** {@code void glGetObjectParameterfvARB(GLhandleARB obj, GLenum pname, GLfloat * params)} */
    public static void glGetObjectParameterfvARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetObjectParameterfvARB(obj, pname, memAddress(params));
    }

    // --- [ glGetObjectParameterivARB ] ---

    /** {@code void glGetObjectParameterivARB(GLhandleARB obj, GLenum pname, GLint * params)} */
    public static native void nglGetObjectParameterivARB(int obj, int pname, long params);

    /** {@code void glGetObjectParameterivARB(GLhandleARB obj, GLenum pname, GLint * params)} */
    public static void glGetObjectParameterivARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetObjectParameterivARB(obj, pname, memAddress(params));
    }

    /** {@code void glGetObjectParameterivARB(GLhandleARB obj, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetObjectParameteriARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetObjectParameterivARB(obj, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetInfoLogARB ] ---

    /** {@code void glGetInfoLogARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * infoLog)} */
    public static native void nglGetInfoLogARB(int obj, int maxLength, long length, long infoLog);

    /** {@code void glGetInfoLogARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * infoLog)} */
    public static void glGetInfoLogARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLcharARB *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetInfoLogARB(obj, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /** {@code void glGetInfoLogARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * infoLog)} */
    @NativeType("void")
    public static String glGetInfoLogARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetInfoLogARB(obj, maxLength, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetInfoLogARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * infoLog)} */
    @NativeType("void")
    public static String glGetInfoLogARB(@NativeType("GLhandleARB") int obj) {
        return glGetInfoLogARB(obj, glGetObjectParameteriARB(obj, GL_OBJECT_INFO_LOG_LENGTH_ARB));
    }

    // --- [ glGetAttachedObjectsARB ] ---

    /** {@code void glGetAttachedObjectsARB(GLhandleARB containerObj, GLsizei maxCount, GLsizei * count, GLhandleARB * obj)} */
    public static native void nglGetAttachedObjectsARB(int containerObj, int maxCount, long count, long obj);

    /** {@code void glGetAttachedObjectsARB(GLhandleARB containerObj, GLsizei maxCount, GLsizei * count, GLhandleARB * obj)} */
    public static void glGetAttachedObjectsARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLsizei *") @Nullable IntBuffer count, @NativeType("GLhandleARB *") IntBuffer obj) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        nglGetAttachedObjectsARB(containerObj, obj.remaining(), memAddressSafe(count), memAddress(obj));
    }

    // --- [ glGetUniformLocationARB ] ---

    /** {@code GLint glGetUniformLocationARB(GLhandleARB programObj, GLcharARB const * name)} */
    public static native int nglGetUniformLocationARB(int programObj, long name);

    /** {@code GLint glGetUniformLocationARB(GLhandleARB programObj, GLcharARB const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLcharARB const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetUniformLocationARB(programObj, memAddress(name));
    }

    /** {@code GLint glGetUniformLocationARB(GLhandleARB programObj, GLcharARB const * name)} */
    @NativeType("GLint")
    public static int glGetUniformLocationARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLcharARB const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetUniformLocationARB(programObj, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniformARB ] ---

    /** {@code void glGetActiveUniformARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLcharARB * name)} */
    public static native void nglGetActiveUniformARB(int programObj, int index, int maxLength, long length, long size, long type, long name);

    /** {@code void glGetActiveUniformARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLcharARB * name)} */
    public static void glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLcharARB *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveUniformARB(programObj, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /** {@code void glGetActiveUniformARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLcharARB * name)} */
    @NativeType("void")
    public static String glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(maxLength);
            nglGetActiveUniformARB(programObj, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memUTF8(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetActiveUniformARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLcharARB * name)} */
    @NativeType("void")
    public static String glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveUniformARB(programObj, index, glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB), size, type);
    }

    // --- [ glGetUniformfvARB ] ---

    /** {@code void glGetUniformfvARB(GLhandleARB programObj, GLint location, GLfloat * params)} */
    public static native void nglGetUniformfvARB(int programObj, int location, long params);

    /** {@code void glGetUniformfvARB(GLhandleARB programObj, GLint location, GLfloat * params)} */
    public static void glGetUniformfvARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformfvARB(programObj, location, memAddress(params));
    }

    /** {@code void glGetUniformfvARB(GLhandleARB programObj, GLint location, GLfloat * params)} */
    @NativeType("void")
    public static float glGetUniformfARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetUniformfvARB(programObj, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformivARB ] ---

    /** {@code void glGetUniformivARB(GLhandleARB programObj, GLint location, GLint * params)} */
    public static native void nglGetUniformivARB(int programObj, int location, long params);

    /** {@code void glGetUniformivARB(GLhandleARB programObj, GLint location, GLint * params)} */
    public static void glGetUniformivARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformivARB(programObj, location, memAddress(params));
    }

    /** {@code void glGetUniformivARB(GLhandleARB programObj, GLint location, GLint * params)} */
    @NativeType("void")
    public static int glGetUniformiARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformivARB(programObj, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetShaderSourceARB ] ---

    /** {@code void glGetShaderSourceARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * source)} */
    public static native void nglGetShaderSourceARB(int obj, int maxLength, long length, long source);

    /** {@code void glGetShaderSourceARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * source)} */
    public static void glGetShaderSourceARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLcharARB *") ByteBuffer source) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetShaderSourceARB(obj, source.remaining(), memAddressSafe(length), memAddress(source));
    }

    /** {@code void glGetShaderSourceARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * source)} */
    @NativeType("void")
    public static String glGetShaderSourceARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer source = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderSourceARB(obj, maxLength, memAddress(length), memAddress(source));
            return memUTF8(source, length.get(0));
        } finally {
            memFree(source);
            stack.setPointer(stackPointer);
        }
    }

    /** {@code void glGetShaderSourceARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * source)} */
    @NativeType("void")
    public static String glGetShaderSourceARB(@NativeType("GLhandleARB") int obj) {
        return glGetShaderSourceARB(obj, glGetObjectParameteriARB(obj, GL_OBJECT_SHADER_SOURCE_LENGTH_ARB));
    }

    /** {@code void glShaderSourceARB(GLhandleARB shaderObj, GLsizei count, GLcharARB const ** string, GLint const * length)} */
    public static void glShaderSourceARB(@NativeType("GLhandleARB") int shaderObj, @NativeType("GLcharARB const **") PointerBuffer string, @NativeType("GLint const *") int @Nullable [] length) {
        long __functionAddress = GL.getICD().glShaderSourceARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, string.remaining());
        }
        callPPV(shaderObj, string.remaining(), memAddress(string), length, __functionAddress);
    }

    /** {@code void glUniform1fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform1fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform1fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform2fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform2fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform3fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform3fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4fvARB(GLint location, GLsizei count, GLfloat const * value)} */
    public static void glUniform4fvARB(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniform1ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform1ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** {@code void glUniform2ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform2ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** {@code void glUniform3ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform3ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** {@code void glUniform4ivARB(GLint location, GLsizei count, GLint const * value)} */
    public static void glUniform4ivARB(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4ivARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** {@code void glUniformMatrix2fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix2fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix3fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix3fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 9, transpose, value, __functionAddress);
    }

    /** {@code void glUniformMatrix4fvARB(GLint location, GLsizei count, GLboolean transpose, GLfloat const * value)} */
    public static void glUniformMatrix4fvARB(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4fvARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 4, transpose, value, __functionAddress);
    }

    /** {@code void glGetObjectParameterfvARB(GLhandleARB obj, GLenum pname, GLfloat * params)} */
    public static void glGetObjectParameterfvARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetObjectParameterfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(obj, pname, params, __functionAddress);
    }

    /** {@code void glGetObjectParameterivARB(GLhandleARB obj, GLenum pname, GLint * params)} */
    public static void glGetObjectParameterivARB(@NativeType("GLhandleARB") int obj, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetObjectParameterivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(obj, pname, params, __functionAddress);
    }

    /** {@code void glGetInfoLogARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * infoLog)} */
    public static void glGetInfoLogARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLcharARB *") ByteBuffer infoLog) {
        long __functionAddress = GL.getICD().glGetInfoLogARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(obj, infoLog.remaining(), length, memAddress(infoLog), __functionAddress);
    }

    /** {@code void glGetAttachedObjectsARB(GLhandleARB containerObj, GLsizei maxCount, GLsizei * count, GLhandleARB * obj)} */
    public static void glGetAttachedObjectsARB(@NativeType("GLhandleARB") int containerObj, @NativeType("GLsizei *") int @Nullable [] count, @NativeType("GLhandleARB *") int[] obj) {
        long __functionAddress = GL.getICD().glGetAttachedObjectsARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(count, 1);
        }
        callPPV(containerObj, obj.length, count, obj, __functionAddress);
    }

    /** {@code void glGetActiveUniformARB(GLhandleARB programObj, GLuint index, GLsizei maxLength, GLsizei * length, GLint * size, GLenum * type, GLcharARB * name)} */
    public static void glGetActiveUniformARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLcharARB *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveUniformARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(programObj, index, name.remaining(), length, size, type, memAddress(name), __functionAddress);
    }

    /** {@code void glGetUniformfvARB(GLhandleARB programObj, GLint location, GLfloat * params)} */
    public static void glGetUniformfvARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetUniformfvARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(programObj, location, params, __functionAddress);
    }

    /** {@code void glGetUniformivARB(GLhandleARB programObj, GLint location, GLint * params)} */
    public static void glGetUniformivARB(@NativeType("GLhandleARB") int programObj, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformivARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(programObj, location, params, __functionAddress);
    }

    /** {@code void glGetShaderSourceARB(GLhandleARB obj, GLsizei maxLength, GLsizei * length, GLcharARB * source)} */
    public static void glGetShaderSourceARB(@NativeType("GLhandleARB") int obj, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLcharARB *") ByteBuffer source) {
        long __functionAddress = GL.getICD().glGetShaderSourceARB;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(obj, source.remaining(), length, memAddress(source), __functionAddress);
    }

}