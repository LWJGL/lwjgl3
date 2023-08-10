/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_gpu_shader_int64.txt">ARB_gpu_shader_int64</a> extension.
 * 
 * <p>The extension introduces the following features for all shader types:</p>
 * 
 * <ul>
 * <li>support for 64-bit scalar and vector integer data types, including uniform API, uniform buffer object, transform feedback, and shader input and
 * output support;</li>
 * <li>new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;</li>
 * <li>new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;</li>
 * <li>vector relational functions supporting comparisons of vectors of 64-bit integer types; and</li>
 * <li>common functions abs, sign, min, max, clamp, and mix supporting arguments of 64-bit integer types.</li>
 * </ul>
 * 
 * <p>Requires {@link GL40 GL40} and GLSL 4.00.</p>
 */
public class ARBGPUShaderInt64 {

    static { GL.initialize(); }

    /** Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying. */
    public static final int
        GL_INT64_ARB               = 0x140E,
        GL_UNSIGNED_INT64_ARB      = 0x140F,
        GL_INT64_VEC2_ARB          = 0x8FE9,
        GL_INT64_VEC3_ARB          = 0x8FEA,
        GL_INT64_VEC4_ARB          = 0x8FEB,
        GL_UNSIGNED_INT64_VEC2_ARB = 0x8FF5,
        GL_UNSIGNED_INT64_VEC3_ARB = 0x8FF6,
        GL_UNSIGNED_INT64_VEC4_ARB = 0x8FF7;

    protected ARBGPUShaderInt64() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUniform1i64ARB ] ---

    /**
     * Specifies the value of an int64_t uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static native void glUniform1i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x);

    // --- [ glUniform1i64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform1i64vARB Uniform1i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform1i64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
     */
    public static void glUniform1i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform1i64vARB(location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform1i64ARB ] ---

    /**
     * Specifies the value of an int64_t uniform variable for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static native void glProgramUniform1i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x);

    // --- [ glProgramUniform1i64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform1i64vARB ProgramUniform1i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform1i64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single int64_t uniform variable or a int64_t uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified int64_t variable
     */
    public static void glProgramUniform1i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform1i64vARB(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2i64ARB ] ---

    /**
     * Specifies the value of an i64vec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static native void glUniform2i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y);

    // --- [ glUniform2i64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform2i64vARB Uniform2i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform2i64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
     */
    public static void glUniform2i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform2i64vARB(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform2i64ARB ] ---

    /**
     * Specifies the value of an i64vec2 uniform variable for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static native void glProgramUniform2i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y);

    // --- [ glProgramUniform2i64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform2i64vARB ProgramUniform2i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform2i64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single i64vec2 uniform variable or a i64vec2 uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec2 variable
     */
    public static void glProgramUniform2i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform2i64vARB(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3i64ARB ] ---

    /**
     * Specifies the value of an i64vec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static native void glUniform3i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z);

    // --- [ glUniform3i64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform3i64vARB Uniform3i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform3i64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
     */
    public static void glUniform3i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform3i64vARB(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform3i64ARB ] ---

    /**
     * Specifies the value of an i64vec3 uniform variable for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static native void glProgramUniform3i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z);

    // --- [ glProgramUniform3i64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform3i64vARB ProgramUniform3i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform3i64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single i64vec3 uniform variable or a i64vec3 uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec3 variable
     */
    public static void glProgramUniform3i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform3i64vARB(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4i64ARB ] ---

    /**
     * Specifies the value of an i64vec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static native void glUniform4i64ARB(@NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z, @NativeType("GLint64") long w);

    // --- [ glUniform4i64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform4i64vARB Uniform4i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform4i64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
     */
    public static void glUniform4i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglUniform4i64vARB(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform4i64ARB ] ---

    /**
     * Specifies the value of an i64vec4 uniform variable for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static native void glProgramUniform4i64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64") long x, @NativeType("GLint64") long y, @NativeType("GLint64") long z, @NativeType("GLint64") long w);

    // --- [ glProgramUniform4i64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform4i64vARB ProgramUniform4i64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform4i64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single i64vec4 uniform variable or a i64vec4 uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified i64vec4 variable
     */
    public static void glProgramUniform4i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer value) {
        nglProgramUniform4i64vARB(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniform1ui64ARB ] ---

    /**
     * Specifies the value of an uint64_t uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static native void glUniform1ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x);

    // --- [ glUniform1ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform1ui64vARB Uniform1ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform1ui64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
     */
    public static void glUniform1ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform1ui64vARB(location, value.remaining(), memAddress(value));
    }

    // --- [ glProgramUniform1ui64ARB ] ---

    /**
     * Specifies the value of an uint64_t uniform variable for the current program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static native void glProgramUniform1ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x);

    // --- [ glProgramUniform1ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform1ui64vARB ProgramUniform1ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform1ui64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single uint64_t uniform variable or a uint64_t uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uint64_t variable
     */
    public static void glProgramUniform1ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform1ui64vARB(program, location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2ui64ARB ] ---

    /**
     * Specifies the value of an u64vec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static native void glUniform2ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y);

    // --- [ glUniform2ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform2ui64vARB Uniform2ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform2ui64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
     */
    public static void glUniform2ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform2ui64vARB(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glProgramUniform2ui64ARB ] ---

    /**
     * Specifies the value of an u64vec2 uniform variable for the current program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static native void glProgramUniform2ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y);

    // --- [ glProgramUniform2ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform2ui64vARB ProgramUniform2ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform2ui64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single u64vec2 uniform variable or a u64vec2 uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec2 variable
     */
    public static void glProgramUniform2ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform2ui64vARB(program, location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3ui64ARB ] ---

    /**
     * Specifies the value of an u64vec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static native void glUniform3ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z);

    // --- [ glUniform3ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform3ui64vARB Uniform3ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform3ui64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
     */
    public static void glUniform3ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform3ui64vARB(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glProgramUniform3ui64ARB ] ---

    /**
     * Specifies the value of an u64vec3 uniform variable for the current program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static native void glProgramUniform3ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z);

    // --- [ glProgramUniform3ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform3ui64vARB ProgramUniform3ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform3ui64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single u64vec3 uniform variable or a u64vec3 uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec3 variable
     */
    public static void glProgramUniform3ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform3ui64vARB(program, location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4ui64ARB ] ---

    /**
     * Specifies the value of an u64vec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static native void glUniform4ui64ARB(@NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z, @NativeType("GLuint64") long w);

    // --- [ glUniform4ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glUniform4ui64vARB Uniform4ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform4ui64vARB(int location, int count, long value);

    /**
     * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
     */
    public static void glUniform4ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglUniform4ui64vARB(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glProgramUniform4ui64ARB ] ---

    /**
     * Specifies the value of an u64vec4 uniform variable for the current program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static native void glProgramUniform4ui64ARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64") long x, @NativeType("GLuint64") long y, @NativeType("GLuint64") long z, @NativeType("GLuint64") long w);

    // --- [ glProgramUniform4ui64vARB ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform4ui64vARB ProgramUniform4ui64vARB}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglProgramUniform4ui64vARB(int program, int location, int count, long value);

    /**
     * Specifies the value of a single u64vec4 uniform variable or a u64vec4 uniform variable array for the specified program object.
     *
     * @param program  the program object
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified u64vec4 variable
     */
    public static void glProgramUniform4ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") LongBuffer value) {
        nglProgramUniform4ui64vARB(program, location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glGetUniformi64vARB ] ---

    /** Unsafe version of: {@link #glGetUniformi64vARB GetUniformi64vARB} */
    public static native void nglGetUniformi64vARB(int program, int location, long params);

    /**
     * Returns the int64_t value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     */
    public static void glGetUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformi64vARB(program, location, memAddress(params));
    }

    /**
     * Returns the int64_t value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static long glGetUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetUniformi64vARB(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformui64vARB ] ---

    /** Unsafe version of: {@link #glGetUniformui64vARB GetUniformui64vARB} */
    public static native void nglGetUniformui64vARB(int program, int location, long params);

    /**
     * Returns the uint64_t value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     */
    public static void glGetUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformui64vARB(program, location, memAddress(params));
    }

    /**
     * Returns the uint64_t value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static long glGetUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetUniformui64vARB(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformi64vARB ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformi64vARB GetnUniformi64vARB}
     *
     * @param bufSize the maximum number of values to write in {@code params}
     */
    public static native void nglGetnUniformi64vARB(int program, int location, int bufSize, long params);

    /**
     * Robust version of {@link #glGetUniformi64vARB GetUniformi64vARB}.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     */
    public static void glGetnUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") LongBuffer params) {
        nglGetnUniformi64vARB(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Robust version of {@link #glGetUniformi64vARB GetUniformi64vARB}.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static long glGetnUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetnUniformi64vARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetnUniformui64vARB ] ---

    /**
     * Unsafe version of: {@link #glGetnUniformui64vARB GetnUniformui64vARB}
     *
     * @param bufSize the maximum number of values to write in {@code params}
     */
    public static native void nglGetnUniformui64vARB(int program, int location, int bufSize, long params);

    /**
     * Robust version of {@link #glGetUniformui64vARB GetUniformui64vARB}.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     */
    public static void glGetnUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") LongBuffer params) {
        nglGetnUniformui64vARB(program, location, params.remaining(), memAddress(params));
    }

    /**
     * Robust version of {@link #glGetUniformui64vARB GetUniformui64vARB}.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     */
    @NativeType("void")
    public static long glGetnUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetnUniformui64vARB(program, location, 1, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #glUniform1i64vARB Uniform1i64vARB} */
    public static void glUniform1i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform1i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1i64vARB ProgramUniform1i64vARB} */
    public static void glProgramUniform1i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform2i64vARB Uniform2i64vARB} */
    public static void glUniform2i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform2i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2i64vARB ProgramUniform2i64vARB} */
    public static void glProgramUniform2i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform3i64vARB Uniform3i64vARB} */
    public static void glUniform3i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform3i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3i64vARB ProgramUniform3i64vARB} */
    public static void glProgramUniform3i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform4i64vARB Uniform4i64vARB} */
    public static void glUniform4i64vARB(@NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glUniform4i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4i64vARB ProgramUniform4i64vARB} */
    public static void glProgramUniform4i64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4i64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform1ui64vARB Uniform1ui64vARB} */
    public static void glUniform1ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform1ui64vARB ProgramUniform1ui64vARB} */
    public static void glProgramUniform1ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform1ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform2ui64vARB Uniform2ui64vARB} */
    public static void glUniform2ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform2ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform2ui64vARB ProgramUniform2ui64vARB} */
    public static void glProgramUniform2ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform2ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 1, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform3ui64vARB Uniform3ui64vARB} */
    public static void glUniform3ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform3ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform3ui64vARB ProgramUniform3ui64vARB} */
    public static void glProgramUniform3ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform3ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length / 3, value, __functionAddress);
    }

    /** Array version of: {@link #glUniform4ui64vARB Uniform4ui64vARB} */
    public static void glUniform4ui64vARB(@NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glUniform4ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glProgramUniform4ui64vARB ProgramUniform4ui64vARB} */
    public static void glProgramUniform4ui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 const *") long[] value) {
        long __functionAddress = GL.getICD().glProgramUniform4ui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, value.length >> 2, value, __functionAddress);
    }

    /** Array version of: {@link #glGetUniformi64vARB GetUniformi64vARB} */
    public static void glGetUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetUniformi64vARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** Array version of: {@link #glGetUniformui64vARB GetUniformui64vARB} */
    public static void glGetUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetUniformui64vARB;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformi64vARB GetnUniformi64vARB} */
    public static void glGetnUniformi64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetnUniformi64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

    /** Array version of: {@link #glGetnUniformui64vARB GetnUniformui64vARB} */
    public static void glGetnUniformui64vARB(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetnUniformui64vARB;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(program, location, params.length, params, __functionAddress);
    }

}