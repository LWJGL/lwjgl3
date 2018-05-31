/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The OpenGL functionality of a forward compatible context, up to version 2.0.
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_objects.txt">ARB_shader_objects</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_shader.txt">ARB_vertex_shader</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_shader.txt">ARB_fragment_shader</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shading_language_100.txt">ARB_shading_language_100</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_draw_buffers.txt">ARB_draw_buffers</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_non_power_of_two.txt">ARB_texture_non_power_of_two</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_point_sprite.txt">ARB_point_sprite</a></li>
 * <li><a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ATI/ATI_separate_stencil.txt">ATI_separate_stencil</a> and <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_stencil_two_side.txt">EXT_stencil_two_side</a></li>
 * </ul>
 */
public class GL20C extends GL15C {

    /** Accepted by the {@code name} parameter of GetString. */
    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;

    /** Accepted by the {@code pname} parameter of GetInteger. */
    public static final int GL_CURRENT_PROGRAM = 0x8B8D;

    /** Accepted by the {@code pname} parameter of GetShaderiv. */
    public static final int
        GL_SHADER_TYPE                 = 0x8B4F,
        GL_DELETE_STATUS               = 0x8B80,
        GL_COMPILE_STATUS              = 0x8B81,
        GL_LINK_STATUS                 = 0x8B82,
        GL_VALIDATE_STATUS             = 0x8B83,
        GL_INFO_LOG_LENGTH             = 0x8B84,
        GL_ATTACHED_SHADERS            = 0x8B85,
        GL_ACTIVE_UNIFORMS             = 0x8B86,
        GL_ACTIVE_UNIFORM_MAX_LENGTH   = 0x8B87,
        GL_ACTIVE_ATTRIBUTES           = 0x8B89,
        GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A,
        GL_SHADER_SOURCE_LENGTH        = 0x8B88;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_FLOAT_VEC2        = 0x8B50,
        GL_FLOAT_VEC3        = 0x8B51,
        GL_FLOAT_VEC4        = 0x8B52,
        GL_INT_VEC2          = 0x8B53,
        GL_INT_VEC3          = 0x8B54,
        GL_INT_VEC4          = 0x8B55,
        GL_BOOL              = 0x8B56,
        GL_BOOL_VEC2         = 0x8B57,
        GL_BOOL_VEC3         = 0x8B58,
        GL_BOOL_VEC4         = 0x8B59,
        GL_FLOAT_MAT2        = 0x8B5A,
        GL_FLOAT_MAT3        = 0x8B5B,
        GL_FLOAT_MAT4        = 0x8B5C,
        GL_SAMPLER_1D        = 0x8B5D,
        GL_SAMPLER_2D        = 0x8B5E,
        GL_SAMPLER_3D        = 0x8B5F,
        GL_SAMPLER_CUBE      = 0x8B60,
        GL_SAMPLER_1D_SHADOW = 0x8B61,
        GL_SAMPLER_2D_SHADOW = 0x8B62;

    /** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
    public static final int GL_VERTEX_SHADER = 0x8B31;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_VERTEX_UNIFORM_COMPONENTS    = 0x8B4A,
        GL_MAX_VARYING_FLOATS               = 0x8B4B,
        GL_MAX_VERTEX_ATTRIBS               = 0x8869,
        GL_MAX_TEXTURE_IMAGE_UNITS          = 0x8872,
        GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS   = 0x8B4C,
        GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;

    /**
     * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;

    /** Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}v. */
    public static final int
        GL_VERTEX_ATTRIB_ARRAY_ENABLED    = 0x8622,
        GL_VERTEX_ATTRIB_ARRAY_SIZE       = 0x8623,
        GL_VERTEX_ATTRIB_ARRAY_STRIDE     = 0x8624,
        GL_VERTEX_ATTRIB_ARRAY_TYPE       = 0x8625,
        GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A,
        GL_CURRENT_VERTEX_ATTRIB          = 0x8626;

    /** Accepted by the {@code pname} parameter of GetVertexAttribPointerv. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;

    /** Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
    public static final int GL_FRAGMENT_SHADER = 0x8B30;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;

    /** Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;

    /** Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_DRAW_BUFFERS = 0x8824,
        GL_DRAW_BUFFER0     = 0x8825,
        GL_DRAW_BUFFER1     = 0x8826,
        GL_DRAW_BUFFER2     = 0x8827,
        GL_DRAW_BUFFER3     = 0x8828,
        GL_DRAW_BUFFER4     = 0x8829,
        GL_DRAW_BUFFER5     = 0x882A,
        GL_DRAW_BUFFER6     = 0x882B,
        GL_DRAW_BUFFER7     = 0x882C,
        GL_DRAW_BUFFER8     = 0x882D,
        GL_DRAW_BUFFER9     = 0x882E,
        GL_DRAW_BUFFER10    = 0x882F,
        GL_DRAW_BUFFER11    = 0x8830,
        GL_DRAW_BUFFER12    = 0x8831,
        GL_DRAW_BUFFER13    = 0x8832,
        GL_DRAW_BUFFER14    = 0x8833,
        GL_DRAW_BUFFER15    = 0x8834;

    /** Accepted by the {@code pname} parameter of PointParameter{if}v. */
    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;

    /** Accepted by the {@code param} parameter of PointParameter{if}v. */
    public static final int
        GL_LOWER_LEFT = 0x8CA1,
        GL_UPPER_LEFT = 0x8CA2;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_BLEND_EQUATION_RGB   = 0x8009,
        GL_BLEND_EQUATION_ALPHA = 0x883D;

    /** Accepted by the {@code pname} parameter of GetIntegerv. */
    public static final int
        GL_STENCIL_BACK_FUNC            = 0x8800,
        GL_STENCIL_BACK_FAIL            = 0x8801,
        GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802,
        GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803,
        GL_STENCIL_BACK_REF             = 0x8CA3,
        GL_STENCIL_BACK_VALUE_MASK      = 0x8CA4,
        GL_STENCIL_BACK_WRITEMASK       = 0x8CA5;

    static { GL.initialize(); }

    protected GL20C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glCreateProgram ] ---

    /**
     * Creates a program object.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glCreateProgram">Reference Page</a>
     */
    @NativeType("GLuint")
    public static native int glCreateProgram();

    // --- [ glDeleteProgram ] ---

    /**
     * Deletes a program object.
     *
     * @param program the program object to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteProgram">Reference Page</a>
     */
    public static native void glDeleteProgram(@NativeType("GLuint") int program);

    // --- [ glIsProgram ] ---

    /**
     * Returns {@link GL11#GL_TRUE TRUE} if {@code program} is the name of a program object. If {@code program} is zero, or a non-zero value that is not the name of a program
     * object, IsProgram returns {@link GL11#GL_FALSE FALSE}. No error is generated if program is not a valid program object name.
     *
     * @param program the program object name to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsProgram">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsProgram(@NativeType("GLuint") int program);

    // --- [ glCreateShader ] ---

    /**
     * Creates a shader object.
     *
     * @param type the type of shader to be created. One of:<br><table><tr><td>{@link #GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link #GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glCreateShader">Reference Page</a>
     */
    @NativeType("GLuint")
    public static native int glCreateShader(@NativeType("GLenum") int type);

    // --- [ glDeleteShader ] ---

    /**
     * Deletes a shader object.
     *
     * @param shader the shader object to be deleted
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDeleteShader">Reference Page</a>
     */
    public static native void glDeleteShader(@NativeType("GLuint") int shader);

    // --- [ glIsShader ] ---

    /**
     * Returns {@link GL11#GL_TRUE TRUE} if {@code shader} is the name of a shader object. If {@code shader} is zero, or a nonzero value that is not the name of a shader
     * object, IsShader returns {@link GL11#GL_FALSE FALSE}. No error is generated if shader is not a valid shader object name.
     *
     * @param shader the shader object name to query
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glIsShader">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsShader(@NativeType("GLuint") int shader);

    // --- [ glAttachShader ] ---

    /**
     * Attaches a shader object to a program object.
     * 
     * <p>In order to create a complete shader program, there must be a way to specify the list of things that will be linked together. Program objects provide
     * this mechanism. Shaders that are to be linked together in a program object must first be attached to that program object. glAttachShader attaches the
     * shader object specified by shader to the program object specified by program. This indicates that shader will be included in link operations that will
     * be performed on program.</p>
     * 
     * <p>All operations that can be performed on a shader object are valid whether or not the shader object is attached to a program object. It is permissible to
     * attach a shader object to a program object before source code has been loaded into the shader object or before the shader object has been compiled. It
     * is permissible to attach multiple shader objects of the same type because each may contain a portion of the complete shader. It is also permissible to
     * attach a shader object to more than one program object. If a shader object is deleted while it is attached to a program object, it will be flagged for
     * deletion, and deletion will not occur until glDetachShader is called to detach it from all program objects to which it is attached.</p>
     *
     * @param program the program object to which a shader object will be attached
     * @param shader  the shader object that is to be attached
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glAttachShader">Reference Page</a>
     */
    public static native void glAttachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader);

    // --- [ glDetachShader ] ---

    /**
     * Detaches a shader object from a program object to which it is attached.
     *
     * @param program the program object from which to detach the shader object
     * @param shader  the shader object to be detached
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDetachShader">Reference Page</a>
     */
    public static native void glDetachShader(@NativeType("GLuint") int program, @NativeType("GLuint") int shader);

    // --- [ glShaderSource ] ---

    /**
     * Unsafe version of: {@link #glShaderSource ShaderSource}
     *
     * @param count the number of elements in the string and length arrays
     */
    public static native void nglShaderSource(int shader, int count, long strings, long length);

    /**
     * Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
     * shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is
     * assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the
     * corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
     * counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
     * parsed at this time; they are simply copied into the specified shader object.
     *
     * @param shader  the shader object whose source code is to be replaced
     * @param strings an array of pointers to strings containing the source code to be loaded into the shader
     * @param length  an array of string lengths
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glShaderSource">Reference Page</a>
     */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const **") PointerBuffer strings, @Nullable @NativeType("GLint const *") IntBuffer length) {
        if (CHECKS) {
            checkSafe(length, strings.remaining());
        }
        nglShaderSource(shader, strings.remaining(), memAddress(strings), memAddressSafe(length));
    }

    /**
     * Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
     * shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is
     * assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the
     * corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
     * counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
     * parsed at this time; they are simply copied into the specified shader object.
     *
     * @param shader  the shader object whose source code is to be replaced
     * @param strings an array of pointers to strings containing the source code to be loaded into the shader
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glShaderSource">Reference Page</a>
     */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const **") CharSequence... strings) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, strings);
            nglShaderSource(shader, strings.length, stringsAddress, stringsAddress - (strings.length << 2));
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
     * shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is {@code NULL}, each string is
     * assumed to be null terminated. If {@code length} is a value other than {@code NULL}, it points to an array containing a string length for each of the
     * corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
     * counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
     * parsed at this time; they are simply copied into the specified shader object.
     *
     * @param shader the shader object whose source code is to be replaced
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glShaderSource">Reference Page</a>
     */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const **") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArrayi(stack, MemoryUtil::memUTF8, string);
            nglShaderSource(shader, 1, stringsAddress, stringsAddress - 4);
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glCompileShader ] ---

    /**
     * Compiles a shader object.
     *
     * @param shader the shader object to be compiled
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glCompileShader">Reference Page</a>
     */
    public static native void glCompileShader(@NativeType("GLuint") int shader);

    // --- [ glLinkProgram ] ---

    /**
     * Links a program object.
     *
     * @param program the program object to be linked
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glLinkProgram">Reference Page</a>
     */
    public static native void glLinkProgram(@NativeType("GLuint") int program);

    // --- [ glUseProgram ] ---

    /**
     * Installs a program object as part of current rendering state.
     *
     * @param program the program object whose executables are to be used as part of current rendering state
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUseProgram">Reference Page</a>
     */
    public static native void glUseProgram(@NativeType("GLuint") int program);

    // --- [ glValidateProgram ] ---

    /**
     * Validates a program object.
     *
     * @param program the program object to be validated
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glValidateProgram">Reference Page</a>
     */
    public static native void glValidateProgram(@NativeType("GLuint") int program);

    // --- [ glUniform1f ] ---

    /**
     * Specifies the value of a float uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform1f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0);

    // --- [ glUniform2f ] ---

    /**
     * Specifies the value of a vec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform2f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glUniform3f ] ---

    /**
     * Specifies the value of a vec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform3f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glUniform4f ] ---

    /**
     * Specifies the value of a vec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * @param v3       the uniform w value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform4f(@NativeType("GLint") int location, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glUniform1i ] ---

    /**
     * Specifies the value of an int uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform1i(@NativeType("GLint") int location, @NativeType("GLint") int v0);

    // --- [ glUniform2i ] ---

    /**
     * Specifies the value of an ivec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform2i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1);

    // --- [ glUniform3i ] ---

    /**
     * Specifies the value of an ivec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform3i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2);

    // --- [ glUniform4i ] ---

    /**
     * Specifies the value of an ivec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param v0       the uniform x value
     * @param v1       the uniform y value
     * @param v2       the uniform z value
     * @param v3       the uniform w value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform4i(@NativeType("GLint") int location, @NativeType("GLint") int v0, @NativeType("GLint") int v1, @NativeType("GLint") int v2, @NativeType("GLint") int v3);

    // --- [ glUniform1fv ] ---

    /**
     * Unsafe version of: {@link #glUniform1fv Uniform1fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform1fv(int location, int count, long value);

    /**
     * Specifies the value of a single float uniform variable or a float uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform1fv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2fv ] ---

    /**
     * Unsafe version of: {@link #glUniform2fv Uniform2fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform2fv(int location, int count, long value);

    /**
     * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform2fv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3fv ] ---

    /**
     * Unsafe version of: {@link #glUniform3fv Uniform3fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform3fv(int location, int count, long value);

    /**
     * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform3fv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4fv ] ---

    /**
     * Unsafe version of: {@link #glUniform4fv Uniform4fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform4fv(int location, int count, long value);

    /**
     * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniform4fv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniform1iv ] ---

    /**
     * Unsafe version of: {@link #glUniform1iv Uniform1iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform1iv(int location, int count, long value);

    /**
     * Specifies the value of a single int uniform variable or a int uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform1iv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2iv ] ---

    /**
     * Unsafe version of: {@link #glUniform2iv Uniform2iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform2iv(int location, int count, long value);

    /**
     * Specifies the value of a single ivec2 uniform variable or an ivec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform2iv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3iv ] ---

    /**
     * Unsafe version of: {@link #glUniform3iv Uniform3iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform3iv(int location, int count, long value);

    /**
     * Specifies the value of a single ivec3 uniform variable or an ivec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform3iv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4iv ] ---

    /**
     * Unsafe version of: {@link #glUniform4iv Uniform4iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform4iv(int location, int count, long value);

    /**
     * Specifies the value of a single ivec4 uniform variable or an ivec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        nglUniform4iv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniformMatrix2fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2fv UniformMatrix2fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix2fv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix2fv(location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3fv UniformMatrix3fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix3fv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix3fv(location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4fv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4fv UniformMatrix4fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix4fv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        nglUniformMatrix4fv(location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glGetShaderiv ] ---

    /** Unsafe version of: {@link #glGetShaderiv GetShaderiv} */
    public static native void nglGetShaderiv(int shader, int pname, long params);

    /**
     * Returns a parameter from a shader object.
     *
     * @param shader the shader object to be queried
     * @param pname  the object parameter. One of:<br><table><tr><td>{@link #GL_SHADER_TYPE SHADER_TYPE}</td><td>{@link #GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link #GL_COMPILE_STATUS COMPILE_STATUS}</td><td>{@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link #GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}</td></tr></table>
     * @param params the requested object parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShader">Reference Page</a>
     */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetShaderiv(shader, pname, memAddress(params));
    }

    /**
     * Returns a parameter from a shader object.
     *
     * @param shader the shader object to be queried
     * @param pname  the object parameter. One of:<br><table><tr><td>{@link #GL_SHADER_TYPE SHADER_TYPE}</td><td>{@link #GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link #GL_COMPILE_STATUS COMPILE_STATUS}</td><td>{@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link #GL_SHADER_SOURCE_LENGTH SHADER_SOURCE_LENGTH}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShader">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetShaderi(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetShaderiv(shader, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramiv ] ---

    /** Unsafe version of: {@link #glGetProgramiv GetProgramiv} */
    public static native void nglGetProgramiv(int program, int pname, long params);

    /**
     * Returns a parameter from a program object.
     *
     * @param program the program object to be queried
     * @param pname   the object parameter. One of:<br><table><tr><td>{@link #GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link #GL_LINK_STATUS LINK_STATUS}</td><td>{@link #GL_VALIDATE_STATUS VALIDATE_STATUS}</td></tr><tr><td>{@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link #GL_ATTACHED_SHADERS ATTACHED_SHADERS}</td><td>{@link #GL_ACTIVE_ATTRIBUTES ACTIVE_ATTRIBUTES}</td></tr><tr><td>{@link #GL_ACTIVE_ATTRIBUTE_MAX_LENGTH ACTIVE_ATTRIBUTE_MAX_LENGTH}</td><td>{@link #GL_ACTIVE_UNIFORMS ACTIVE_UNIFORMS}</td><td>{@link #GL_ACTIVE_UNIFORM_MAX_LENGTH ACTIVE_UNIFORM_MAX_LENGTH}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_MODE TRANSFORM_FEEDBACK_BUFFER_MODE}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYINGS TRANSFORM_FEEDBACK_VARYINGS}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH}</td></tr><tr><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCKS ACTIVE_UNIFORM_BLOCKS}</td><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH}</td><td>{@link GL32#GL_GEOMETRY_VERTICES_OUT GEOMETRY_VERTICES_OUT}</td></tr><tr><td>{@link GL32#GL_GEOMETRY_INPUT_TYPE GEOMETRY_INPUT_TYPE}</td><td>{@link GL32#GL_GEOMETRY_OUTPUT_TYPE GEOMETRY_OUTPUT_TYPE}</td><td>{@link GL41#GL_PROGRAM_BINARY_LENGTH PROGRAM_BINARY_LENGTH}</td></tr><tr><td>{@link GL42#GL_ACTIVE_ATOMIC_COUNTER_BUFFERS ACTIVE_ATOMIC_COUNTER_BUFFERS}</td><td>{@link GL43#GL_COMPUTE_WORK_GROUP_SIZE COMPUTE_WORK_GROUP_SIZE}</td></tr></table>
     * @param params  the requested object parameter
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgram">Reference Page</a>
     */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetProgramiv(program, pname, memAddress(params));
    }

    /**
     * Returns a parameter from a program object.
     *
     * @param program the program object to be queried
     * @param pname   the object parameter. One of:<br><table><tr><td>{@link #GL_DELETE_STATUS DELETE_STATUS}</td><td>{@link #GL_LINK_STATUS LINK_STATUS}</td><td>{@link #GL_VALIDATE_STATUS VALIDATE_STATUS}</td></tr><tr><td>{@link #GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link #GL_ATTACHED_SHADERS ATTACHED_SHADERS}</td><td>{@link #GL_ACTIVE_ATTRIBUTES ACTIVE_ATTRIBUTES}</td></tr><tr><td>{@link #GL_ACTIVE_ATTRIBUTE_MAX_LENGTH ACTIVE_ATTRIBUTE_MAX_LENGTH}</td><td>{@link #GL_ACTIVE_UNIFORMS ACTIVE_UNIFORMS}</td><td>{@link #GL_ACTIVE_UNIFORM_MAX_LENGTH ACTIVE_UNIFORM_MAX_LENGTH}</td></tr><tr><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER_MODE TRANSFORM_FEEDBACK_BUFFER_MODE}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYINGS TRANSFORM_FEEDBACK_VARYINGS}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH}</td></tr><tr><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCKS ACTIVE_UNIFORM_BLOCKS}</td><td>{@link GL31#GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH}</td><td>{@link GL32#GL_GEOMETRY_VERTICES_OUT GEOMETRY_VERTICES_OUT}</td></tr><tr><td>{@link GL32#GL_GEOMETRY_INPUT_TYPE GEOMETRY_INPUT_TYPE}</td><td>{@link GL32#GL_GEOMETRY_OUTPUT_TYPE GEOMETRY_OUTPUT_TYPE}</td><td>{@link GL41#GL_PROGRAM_BINARY_LENGTH PROGRAM_BINARY_LENGTH}</td></tr><tr><td>{@link GL42#GL_ACTIVE_ATOMIC_COUNTER_BUFFERS ACTIVE_ATOMIC_COUNTER_BUFFERS}</td><td>{@link GL43#GL_COMPUTE_WORK_GROUP_SIZE COMPUTE_WORK_GROUP_SIZE}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgram">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetProgrami(@NativeType("GLuint") int program, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetProgramiv(program, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetShaderInfoLog ] ---

    /**
     * Unsafe version of: {@link #glGetShaderInfoLog GetShaderInfoLog}
     *
     * @param maxLength the size of the character buffer for storing the returned information log
     */
    public static native void nglGetShaderInfoLog(int shader, int maxLength, long length, long infoLog);

    /**
     * Returns the information log for a shader object.
     *
     * @param shader  the shader object whose information log is to be queried
     * @param length  the length of the string returned in {@code infoLog} (excluding the null terminator)
     * @param infoLog an array of characters that is used to return the information log
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetShaderInfoLog(shader, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /**
     * Returns the information log for a shader object.
     *
     * @param shader    the shader object whose information log is to be queried
     * @param maxLength the size of the character buffer for storing the returned information log
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderInfoLog(shader, maxLength, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the information log for a shader object.
     *
     * @param shader the shader object whose information log is to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetShaderInfoLog(@NativeType("GLuint") int shader) {
        return glGetShaderInfoLog(shader, glGetShaderi(shader, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetProgramInfoLog ] ---

    /**
     * Unsafe version of: {@link #glGetProgramInfoLog GetProgramInfoLog}
     *
     * @param maxLength the size of the character buffer for storing the returned information log
     */
    public static native void nglGetProgramInfoLog(int program, int maxLength, long length, long infoLog);

    /**
     * Returns the information log for a program object.
     *
     * @param program the program object whose information log is to be queried
     * @param length  the length of the string returned in {@code infoLog} (excluding the null terminator)
     * @param infoLog an array of characters that is used to return the information log
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetProgramInfoLog(program, infoLog.remaining(), memAddressSafe(length), memAddress(infoLog));
    }

    /**
     * Returns the information log for a program object.
     *
     * @param program   the program object whose information log is to be queried
     * @param maxLength the size of the character buffer for storing the returned information log
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer infoLog = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetProgramInfoLog(program, maxLength, memAddress(length), memAddress(infoLog));
            return memUTF8(infoLog, length.get(0));
        } finally {
            memFree(infoLog);
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the information log for a program object.
     *
     * @param program the program object whose information log is to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetProgramInfoLog(@NativeType("GLuint") int program) {
        return glGetProgramInfoLog(program, glGetProgrami(program, GL_INFO_LOG_LENGTH));
    }

    // --- [ glGetAttachedShaders ] ---

    /**
     * Unsafe version of: {@link #glGetAttachedShaders GetAttachedShaders}
     *
     * @param maxCount the size of the array for storing the returned object names
     */
    public static native void nglGetAttachedShaders(int program, int maxCount, long count, long shaders);

    /**
     * Returns the shader objects attached to a program object.
     *
     * @param program the program object to be queried
     * @param count   the number of names actually returned in {@code shaders}
     * @param shaders an array that is used to return the names of attached shader objects
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttachedShaders">Reference Page</a>
     */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") IntBuffer count, @NativeType("GLuint *") IntBuffer shaders) {
        if (CHECKS) {
            checkSafe(count, 1);
        }
        nglGetAttachedShaders(program, shaders.remaining(), memAddressSafe(count), memAddress(shaders));
    }

    // --- [ glGetUniformLocation ] ---

    /** Unsafe version of: {@link #glGetUniformLocation GetUniformLocation} */
    public static native int nglGetUniformLocation(int program, long name);

    /**
     * Returns the location of a uniform variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the uniform variable whose location is to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniformLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetUniformLocation(program, memAddress(name));
    }

    /**
     * Returns the location of a uniform variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the uniform variable whose location is to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniformLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetUniformLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            return nglGetUniformLocation(program, memAddress(nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveUniform ] ---

    /**
     * Unsafe version of: {@link #glGetActiveUniform GetActiveUniform}
     *
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     */
    public static native void nglGetActiveUniform(int program, int index, int maxLength, long length, long size, long type, long name);

    /**
     * Returns information about an active uniform variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the uniform variable to be queried
     * @param length  the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed
     * @param size    the size of the uniform variable
     * @param type    the data type of the uniform variable
     * @param name    a null terminated string containing the name of the uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveUniform(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /**
     * Returns information about an active uniform variable for the specified program object.
     *
     * @param program   the program object to be queried
     * @param index     the index of the uniform variable to be queried
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     * @param size      the size of the uniform variable
     * @param type      the data type of the uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(maxLength);
            nglGetActiveUniform(program, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns information about an active uniform variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the uniform variable to be queried
     * @param size    the size of the uniform variable
     * @param type    the data type of the uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveUniform(program, index, glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH), size, type);
    }

    // --- [ glGetUniformfv ] ---

    /** Unsafe version of: {@link #glGetUniformfv GetUniformfv} */
    public static native void nglGetUniformfv(int program, int location, long params);

    /**
     * Returns the float value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformfv(program, location, memAddress(params));
    }

    /**
     * Returns the float value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static float glGetUniformf(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetUniformfv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformiv ] ---

    /** Unsafe version of: {@link #glGetUniformiv GetUniformiv} */
    public static native void nglGetUniformiv(int program, int location, long params);

    /**
     * Returns the int value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformiv(program, location, memAddress(params));
    }

    /**
     * Returns the int value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetUniformi(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformiv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetShaderSource ] ---

    /**
     * Unsafe version of: {@link #glGetShaderSource GetShaderSource}
     *
     * @param maxLength the size of the character buffer for storing the returned source code string
     */
    public static native void nglGetShaderSource(int shader, int maxLength, long length, long source);

    /**
     * Returns the source code string from a shader object.
     *
     * @param shader the shader object to be queried
     * @param length the length of the string returned in source (excluding the null terminator)
     * @param source an array of characters that is used to return the source code string
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer source) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetShaderSource(shader, source.remaining(), memAddressSafe(length), memAddress(source));
    }

    /**
     * Returns the source code string from a shader object.
     *
     * @param shader    the shader object to be queried
     * @param maxLength the size of the character buffer for storing the returned source code string
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader, @NativeType("GLsizei") int maxLength) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        ByteBuffer source = memAlloc(maxLength);
        try {
            IntBuffer length = stack.ints(0);
            nglGetShaderSource(shader, maxLength, memAddress(length), memAddress(source));
            return memUTF8(source, length.get(0));
        } finally {
            memFree(source);
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns the source code string from a shader object.
     *
     * @param shader the shader object to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetShaderSource(@NativeType("GLuint") int shader) {
        return glGetShaderSource(shader, glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH));
    }

    // --- [ glVertexAttrib1f ] ---

    /**
     * Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib1f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0);

    // --- [ glVertexAttrib1s ] ---

    /**
     * Short version of {@link #glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib1s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0);

    // --- [ glVertexAttrib1d ] ---

    /**
     * Double version of {@link #glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib1d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0);

    // --- [ glVertexAttrib2f ] ---

    /**
     * Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib2f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1);

    // --- [ glVertexAttrib2s ] ---

    /**
     * Short version of {@link #glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib2s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1);

    // --- [ glVertexAttrib2d ] ---

    /**
     * Double version of {@link #glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib2d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1);

    // --- [ glVertexAttrib3f ] ---

    /**
     * Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib3f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2);

    // --- [ glVertexAttrib3s ] ---

    /**
     * Short version of {@link #glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib3s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2);

    // --- [ glVertexAttrib3d ] ---

    /**
     * Double version of {@link #glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib3d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2);

    // --- [ glVertexAttrib4f ] ---

    /**
     * Specifies the value of a generic vertex attribute.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib4f(@NativeType("GLuint") int index, @NativeType("GLfloat") float v0, @NativeType("GLfloat") float v1, @NativeType("GLfloat") float v2, @NativeType("GLfloat") float v3);

    // --- [ glVertexAttrib4s ] ---

    /**
     * Short version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib4s(@NativeType("GLuint") int index, @NativeType("GLshort") short v0, @NativeType("GLshort") short v1, @NativeType("GLshort") short v2, @NativeType("GLshort") short v3);

    // --- [ glVertexAttrib4d ] ---

    /**
     * Double version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v0    the vertex attribute x component
     * @param v1    the vertex attribute y component
     * @param v2    the vertex attribute z component
     * @param v3    the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib4d(@NativeType("GLuint") int index, @NativeType("GLdouble") double v0, @NativeType("GLdouble") double v1, @NativeType("GLdouble") double v2, @NativeType("GLdouble") double v3);

    // --- [ glVertexAttrib4Nub ] ---

    /**
     * Normalized unsigned byte version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param x     the vertex attribute x component
     * @param y     the vertex attribute y component
     * @param z     the vertex attribute z component
     * @param w     the vertex attribute w component
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttrib4Nub(@NativeType("GLuint") int index, @NativeType("GLubyte") byte x, @NativeType("GLubyte") byte y, @NativeType("GLubyte") byte z, @NativeType("GLubyte") byte w);

    // --- [ glVertexAttrib1fv ] ---

    /** Unsafe version of: {@link #glVertexAttrib1fv VertexAttrib1fv} */
    public static native void nglVertexAttrib1fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib1sv ] ---

    /** Unsafe version of: {@link #glVertexAttrib1sv VertexAttrib1sv} */
    public static native void nglVertexAttrib1sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib1s VertexAttrib1s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib1dv ] ---

    /** Unsafe version of: {@link #glVertexAttrib1dv VertexAttrib1dv} */
    public static native void nglVertexAttrib1dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib1d VertexAttrib1d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 1);
        }
        nglVertexAttrib1dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib2fv ] ---

    /** Unsafe version of: {@link #glVertexAttrib2fv VertexAttrib2fv} */
    public static native void nglVertexAttrib2fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib2sv ] ---

    /** Unsafe version of: {@link #glVertexAttrib2sv VertexAttrib2sv} */
    public static native void nglVertexAttrib2sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib2s VertexAttrib2s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib2dv ] ---

    /** Unsafe version of: {@link #glVertexAttrib2dv VertexAttrib2dv} */
    public static native void nglVertexAttrib2dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib2d VertexAttrib2d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 2);
        }
        nglVertexAttrib2dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib3fv ] ---

    /** Unsafe version of: {@link #glVertexAttrib3fv VertexAttrib3fv} */
    public static native void nglVertexAttrib3fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib3sv ] ---

    /** Unsafe version of: {@link #glVertexAttrib3sv VertexAttrib3sv} */
    public static native void nglVertexAttrib3sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib3s VertexAttrib3s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib3dv ] ---

    /** Unsafe version of: {@link #glVertexAttrib3dv VertexAttrib3dv} */
    public static native void nglVertexAttrib3dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib3d VertexAttrib3d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 3);
        }
        nglVertexAttrib3dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4fv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4fv VertexAttrib4fv} */
    public static native void nglVertexAttrib4fv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") FloatBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4fv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4sv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4sv VertexAttrib4sv} */
    public static native void nglVertexAttrib4sv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4s VertexAttrib4s}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4sv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4dv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4dv VertexAttrib4dv} */
    public static native void nglVertexAttrib4dv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4d VertexAttrib4d}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") DoubleBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4dv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4iv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4iv VertexAttrib4iv} */
    public static native void nglVertexAttrib4iv(int index, long v);

    /**
     * Integer pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4iv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4bv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4bv VertexAttrib4bv} */
    public static native void nglVertexAttrib4bv(int index, long v);

    /**
     * Byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4bv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4bv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4ubv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4ubv VertexAttrib4ubv} */
    public static native void nglVertexAttrib4ubv(int index, long v);

    /**
     * Pointer version of {@link #glVertexAttrib4Nub VertexAttrib4Nub}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4ubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4ubv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4usv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4usv VertexAttrib4usv} */
    public static native void nglVertexAttrib4usv(int index, long v);

    /**
     * Unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4usv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4uiv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4uiv VertexAttrib4uiv} */
    public static native void nglVertexAttrib4uiv(int index, long v);

    /**
     * Unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4uiv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nbv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4Nbv VertexAttrib4Nbv} */
    public static native void nglVertexAttrib4Nbv(int index, long v);

    /**
     * Normalized byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nbv(@NativeType("GLuint") int index, @NativeType("GLbyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nbv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nsv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv} */
    public static native void nglVertexAttrib4Nsv(int index, long v);

    /**
     * Normalized short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nsv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Niv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4Niv VertexAttrib4Niv} */
    public static native void nglVertexAttrib4Niv(int index, long v);

    /**
     * Normalized int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Niv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nubv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4Nubv VertexAttrib4Nubv} */
    public static native void nglVertexAttrib4Nubv(int index, long v);

    /**
     * Normalized unsigned byte pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nubv(@NativeType("GLuint") int index, @NativeType("GLubyte const *") ByteBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nubv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nusv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv} */
    public static native void nglVertexAttrib4Nusv(int index, long v);

    /**
     * Normalized unsigned short pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") ShortBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nusv(index, memAddress(v));
    }

    // --- [ glVertexAttrib4Nuiv ] ---

    /** Unsafe version of: {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv} */
    public static native void nglVertexAttrib4Nuiv(int index, long v);

    /**
     * Normalized unsigned int pointer version of {@link #glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index the index of the generic vertex attribute to be modified
     * @param v     the vertex attribute buffer
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") IntBuffer v) {
        if (CHECKS) {
            check(v, 4);
        }
        nglVertexAttrib4Nuiv(index, memAddress(v));
    }

    // --- [ glVertexAttribPointer ] ---

    /** Unsafe version of: {@link #glVertexAttribPointer VertexAttribPointer} */
    public static native void nglVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer);

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>
     */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ByteBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>
     */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") long pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, pointer);
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>
     */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") ShortBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>
     */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") IntBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    /**
     * Specifies the location and organization of a vertex attribute array.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param size       the number of values per vertex that are stored in the array. The initial value is 4. One of:<br><table><tr><td>1</td><td>2</td><td>3</td><td>4</td><td>{@link GL12#GL_BGRA BGRA}</td></tr></table>
     * @param type       the data type of each component in the array. The initial value is GL_FLOAT. One of:<br><table><tr><td>{@link GL11#GL_BYTE BYTE}</td><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_SHORT SHORT}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_INT INT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td><td>{@link GL30#GL_HALF_FLOAT HALF_FLOAT}</td><td>{@link GL11#GL_FLOAT FLOAT}</td></tr><tr><td>{@link GL11#GL_DOUBLE DOUBLE}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td><td>{@link GL33#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL41#GL_FIXED FIXED}</td></tr></table>
     * @param normalized whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed
     * @param stride     the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
     *                   the array. The initial value is 0.
     * @param pointer    the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
     *                   currently bound to the {@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER} target. The initial value is 0.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttribPointer">Reference Page</a>
     */
    public static void glVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLint") int size, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLsizei") int stride, @NativeType("void const *") FloatBuffer pointer) {
        nglVertexAttribPointer(index, size, type, normalized, stride, memAddress(pointer));
    }

    // --- [ glEnableVertexAttribArray ] ---

    /**
     * Enables a generic vertex attribute array.
     *
     * @param index the index of the generic vertex attribute to be enabled
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glEnableVertexAttribArray">Reference Page</a>
     */
    public static native void glEnableVertexAttribArray(@NativeType("GLuint") int index);

    // --- [ glDisableVertexAttribArray ] ---

    /**
     * Disables a generic vertex attribute array.
     *
     * @param index the index of the generic vertex attribute to be disabled
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDisableVertexAttribArray">Reference Page</a>
     */
    public static native void glDisableVertexAttribArray(@NativeType("GLuint") int index);

    // --- [ glBindAttribLocation ] ---

    /** Unsafe version of: {@link #glBindAttribLocation BindAttribLocation} */
    public static native void nglBindAttribLocation(int program, int index, long name);

    /**
     * Associates a generic vertex attribute index with a named attribute variable.
     *
     * @param program the program object in which the association is to be made
     * @param index   the index of the generic vertex attribute to be bound
     * @param name    a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindAttribLocation">Reference Page</a>
     */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindAttribLocation(program, index, memAddress(name));
    }

    /**
     * Associates a generic vertex attribute index with a named attribute variable.
     *
     * @param program the program object in which the association is to be made
     * @param index   the index of the generic vertex attribute to be bound
     * @param name    a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBindAttribLocation">Reference Page</a>
     */
    public static void glBindAttribLocation(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            nglBindAttribLocation(program, index, memAddress(nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveAttrib ] ---

    /**
     * Unsafe version of: {@link #glGetActiveAttrib GetActiveAttrib}
     *
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     */
    public static native void nglGetActiveAttrib(int program, int index, int maxLength, long length, long size, long type, long name);

    /**
     * Returns information about an active attribute variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the attribute variable to be queried
     * @param length  the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than
     *                {@code NULL} is passed
     * @param size    the size of the attribute variable
     * @param type    the data type of the attribute variable
     * @param name    a null terminated string containing the name of the attribute variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        nglGetActiveAttrib(program, index, name.remaining(), memAddressSafe(length), memAddress(size), memAddress(type), memAddress(name));
    }

    /**
     * Returns information about an active attribute variable for the specified program object.
     *
     * @param program   the program object to be queried
     * @param index     the index of the attribute variable to be queried
     * @param maxLength the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}
     * @param size      the size of the attribute variable
     * @param type      the data type of the attribute variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLsizei") int maxLength, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        if (CHECKS) {
            check(size, 1);
            check(type, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(maxLength);
            nglGetActiveAttrib(program, index, maxLength, memAddress(length), memAddress(size), memAddress(type), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Returns information about an active attribute variable for the specified program object.
     *
     * @param program the program object to be queried
     * @param index   the index of the attribute variable to be queried
     * @param size    the size of the attribute variable
     * @param type    the data type of the attribute variable
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @NativeType("GLint *") IntBuffer size, @NativeType("GLenum *") IntBuffer type) {
        return glGetActiveAttrib(program, index, glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH), size, type);
    }

    // --- [ glGetAttribLocation ] ---

    /** Unsafe version of: {@link #glGetAttribLocation GetAttribLocation} */
    public static native int nglGetAttribLocation(int program, long name);

    /**
     * Returns the location of an attribute variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the attribute variable whose location is to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttribLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetAttribLocation(program, memAddress(name));
    }

    /**
     * Returns the location of an attribute variable.
     *
     * @param program the program object to be queried
     * @param name    a null terminated string containing the name of the attribute variable whose location is to be queried
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttribLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetAttribLocation(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer nameEncoded = stack.ASCII(name);
            return nglGetAttribLocation(program, memAddress(nameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribiv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribiv GetVertexAttribiv} */
    public static native void nglGetVertexAttribiv(int index, int pname, long params);

    /**
     * Returns the integer value of a generic vertex attribute parameter.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td></tr><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>
     * @param params returns the requested data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetVertexAttribiv(index, pname, memAddress(params));
    }

    /**
     * Returns the integer value of a generic vertex attribute parameter.
     *
     * @param index the generic vertex attribute parameter to be queried
     * @param pname the symbolic name of the vertex attribute parameter to be queried. One of:<br><table><tr><td>{@link GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING VERTEX_ATTRIB_ARRAY_BUFFER_BINDING}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_ENABLED VERTEX_ATTRIB_ARRAY_ENABLED}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_SIZE VERTEX_ATTRIB_ARRAY_SIZE}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_STRIDE VERTEX_ATTRIB_ARRAY_STRIDE}</td></tr><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_TYPE VERTEX_ATTRIB_ARRAY_TYPE}</td><td>{@link #GL_VERTEX_ATTRIB_ARRAY_NORMALIZED VERTEX_ATTRIB_ARRAY_NORMALIZED}</td></tr><tr><td>{@link #GL_CURRENT_VERTEX_ATTRIB CURRENT_VERTEX_ATTRIB}</td><td>{@link GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER VERTEX_ATTRIB_ARRAY_INTEGER}</td></tr><tr><td>{@link GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR VERTEX_ATTRIB_ARRAY_DIVISOR}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetVertexAttribi(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetVertexAttribiv(index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetVertexAttribfv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribfv GetVertexAttribfv} */
    public static native void nglGetVertexAttribfv(int index, int pname, long params);

    /**
     * Float version of {@link #glGetVertexAttribiv GetVertexAttribiv}.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribfv(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribdv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribdv GetVertexAttribdv} */
    public static native void nglGetVertexAttribdv(int index, int pname, long params);

    /**
     * Double version of {@link #glGetVertexAttribiv GetVertexAttribiv}.
     *
     * @param index  the generic vertex attribute parameter to be queried
     * @param pname  the symbolic name of the vertex attribute parameter to be queried
     * @param params returns the requested data
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 4);
        }
        nglGetVertexAttribdv(index, pname, memAddress(params));
    }

    // --- [ glGetVertexAttribPointerv ] ---

    /** Unsafe version of: {@link #glGetVertexAttribPointerv GetVertexAttribPointerv} */
    public static native void nglGetVertexAttribPointerv(int index, int pname, long pointer);

    /**
     * Returns the address of the specified generic vertex attribute pointer.
     *
     * @param index   the generic vertex attribute parameter to be queried
     * @param pname   the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER VERTEX_ATTRIB_ARRAY_POINTER}</td></tr></table>
     * @param pointer the pointer value
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttribPointerv">Reference Page</a>
     */
    public static void glGetVertexAttribPointerv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("void **") PointerBuffer pointer) {
        if (CHECKS) {
            check(pointer, 1);
        }
        nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
    }

    /**
     * Returns the address of the specified generic vertex attribute pointer.
     *
     * @param index the generic vertex attribute parameter to be queried
     * @param pname the symbolic name of the generic vertex attribute parameter to be returned. Must be:<br><table><tr><td>{@link #GL_VERTEX_ATTRIB_ARRAY_POINTER VERTEX_ATTRIB_ARRAY_POINTER}</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttribPointerv">Reference Page</a>
     */
    @NativeType("void")
    public static long glGetVertexAttribPointer(@NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer pointer = stack.callocPointer(1);
            nglGetVertexAttribPointerv(index, pname, memAddress(pointer));
            return pointer.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDrawBuffers ] ---

    /**
     * Unsafe version of: {@link #glDrawBuffers DrawBuffers}
     *
     * @param n the number of buffers in {@code bufs}
     */
    public static native void nglDrawBuffers(int n, long bufs);

    /**
     * Specifies a list of color buffers to be drawn into.
     *
     * @param bufs an array of symbolic constants specifying the buffers into which fragment colors or data values will be written. One of:<br><table><tr><td>{@link GL11#GL_NONE NONE}</td><td>{@link GL11#GL_FRONT_LEFT FRONT_LEFT}</td><td>{@link GL11#GL_FRONT_RIGHT FRONT_RIGHT}</td><td>{@link GL11#GL_BACK_LEFT BACK_LEFT}</td><td>{@link GL11#GL_BACK_RIGHT BACK_RIGHT}</td><td>{@link GL30#GL_COLOR_ATTACHMENT0 COLOR_ATTACHMENT0}</td></tr><tr><td>GL30.GL_COLOR_ATTACHMENT[1-15]</td></tr></table>
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDrawBuffers">Reference Page</a>
     */
    public static void glDrawBuffers(@NativeType("GLenum const *") IntBuffer bufs) {
        nglDrawBuffers(bufs.remaining(), memAddress(bufs));
    }

    /**
     * Specifies a list of color buffers to be drawn into.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDrawBuffers">Reference Page</a>
     */
    public static void glDrawBuffers(@NativeType("GLenum const *") int buf) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer bufs = stack.ints(buf);
            nglDrawBuffers(1, memAddress(bufs));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glBlendEquationSeparate ] ---

    /**
     * Sets the RGB blend equation and the alpha blend equation separately.
     *
     * @param modeRGB   the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
     * @param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glBlendEquationSeparate">Reference Page</a>
     */
    public static native void glBlendEquationSeparate(@NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glStencilOpSeparate ] ---

    /**
     * Sets front and/or back stencil test actions.
     *
     * @param face   whether front and/or back stencil state is updated. One of:<br><table><tr><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
     * @param sfail  the action to take when the stencil test fails. The initial value is GL_KEEP. One of:<br><table><tr><td>{@link GL11#GL_KEEP KEEP}</td><td>{@link GL11#GL_ZERO ZERO}</td><td>{@link GL11#GL_REPLACE REPLACE}</td><td>{@link GL11#GL_INCR INCR}</td><td>{@link GL14#GL_INCR_WRAP INCR_WRAP}</td><td>{@link GL11#GL_DECR DECR}</td><td>{@link GL14#GL_DECR_WRAP DECR_WRAP}</td><td>{@link GL11#GL_INVERT INVERT}</td></tr></table>
     * @param dpfail the stencil action when the stencil test passes, but the depth test fails. The initial value is GL_KEEP
     * @param dppass the stencil action when both the stencil test and the depth test pass, or when the stencil test passes and either there is no depth buffer or depth
     *               testing is not enabled. The initial value is GL_KEEP
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glStencilOpSeparate">Reference Page</a>
     */
    public static native void glStencilOpSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int sfail, @NativeType("GLenum") int dpfail, @NativeType("GLenum") int dppass);

    // --- [ glStencilFuncSeparate ] ---

    /**
     * Sets front and/or back function and reference value for stencil testing.
     *
     * @param face whether front and/or back stencil state is updated. One of:<br><table><tr><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
     * @param func the test function. The initial value is GL_ALWAYS. One of:<br><table><tr><td>{@link GL11#GL_NEVER NEVER}</td><td>{@link GL11#GL_LESS LESS}</td><td>{@link GL11#GL_LEQUAL LEQUAL}</td><td>{@link GL11#GL_GREATER GREATER}</td><td>{@link GL11#GL_GEQUAL GEQUAL}</td><td>{@link GL11#GL_EQUAL EQUAL}</td><td>{@link GL11#GL_NOTEQUAL NOTEQUAL}</td><td>{@link GL11#GL_ALWAYS ALWAYS}</td></tr></table>
     * @param ref  the reference value for the stencil test. {@code ref} is clamped to the range [0, 2n &ndash; 1], where {@code n} is the number of bitplanes in the stencil
     *             buffer. The initial value is 0.
     * @param mask a mask that is ANDed with both the reference value and the stored stencil value when the test is done. The initial value is all 1's.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glStencilFuncSeparate">Reference Page</a>
     */
    public static native void glStencilFuncSeparate(@NativeType("GLenum") int face, @NativeType("GLenum") int func, @NativeType("GLint") int ref, @NativeType("GLuint") int mask);

    // --- [ glStencilMaskSeparate ] ---

    /**
     * Controls the front and/or back writing of individual bits in the stencil planes.
     *
     * @param face whether front and/or back stencil writemask is updated. One of:<br><table><tr><td>{@link GL11#GL_FRONT FRONT}</td><td>{@link GL11#GL_BACK BACK}</td><td>{@link GL11#GL_FRONT_AND_BACK FRONT_AND_BACK}</td></tr></table>
     * @param mask a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glStencilMaskSeparate">Reference Page</a>
     */
    public static native void glStencilMaskSeparate(@NativeType("GLenum") int face, @NativeType("GLuint") int mask);

    /**
     * Array version of: {@link #glShaderSource ShaderSource}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glShaderSource">Reference Page</a>
     */
    public static void glShaderSource(@NativeType("GLuint") int shader, @NativeType("GLchar const **") PointerBuffer strings, @Nullable @NativeType("GLint const *") int[] length) {
        long __functionAddress = GL.getICD().glShaderSource;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, strings.remaining());
        }
        callPPV(__functionAddress, shader, strings.remaining(), memAddress(strings), length);
    }

    /**
     * Array version of: {@link #glUniform1fv Uniform1fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform1fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length, value);
    }

    /**
     * Array version of: {@link #glUniform2fv Uniform2fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 1, value);
    }

    /**
     * Array version of: {@link #glUniform3fv Uniform3fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 3, value);
    }

    /**
     * Array version of: {@link #glUniform4fv Uniform4fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4fv(@NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniform4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 2, value);
    }

    /**
     * Array version of: {@link #glUniform1iv Uniform1iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform1iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length, value);
    }

    /**
     * Array version of: {@link #glUniform2iv Uniform2iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform2iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 1, value);
    }

    /**
     * Array version of: {@link #glUniform3iv Uniform3iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform3iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 3, value);
    }

    /**
     * Array version of: {@link #glUniform4iv Uniform4iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4iv(@NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        long __functionAddress = GL.getICD().glUniform4iv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 2, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix2fv UniformMatrix2fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 2, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix3fv UniformMatrix3fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length / 9, transpose, value);
    }

    /**
     * Array version of: {@link #glUniformMatrix4fv UniformMatrix4fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4fv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4fv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, location, value.length >> 4, transpose, value);
    }

    /**
     * Array version of: {@link #glGetShaderiv GetShaderiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShader">Reference Page</a>
     */
    public static void glGetShaderiv(@NativeType("GLuint") int shader, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetShaderiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, shader, pname, params);
    }

    /**
     * Array version of: {@link #glGetProgramiv GetProgramiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgram">Reference Page</a>
     */
    public static void glGetProgramiv(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetProgramiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, program, pname, params);
    }

    /**
     * Array version of: {@link #glGetShaderInfoLog GetShaderInfoLog}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderInfoLog">Reference Page</a>
     */
    public static void glGetShaderInfoLog(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GL.getICD().glGetShaderInfoLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(__functionAddress, shader, infoLog.remaining(), length, memAddress(infoLog));
    }

    /**
     * Array version of: {@link #glGetProgramInfoLog GetProgramInfoLog}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetProgramInfoLog">Reference Page</a>
     */
    public static void glGetProgramInfoLog(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        long __functionAddress = GL.getICD().glGetProgramInfoLog;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(__functionAddress, program, infoLog.remaining(), length, memAddress(infoLog));
    }

    /**
     * Array version of: {@link #glGetAttachedShaders GetAttachedShaders}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetAttachedShaders">Reference Page</a>
     */
    public static void glGetAttachedShaders(@NativeType("GLuint") int program, @Nullable @NativeType("GLsizei *") int[] count, @NativeType("GLuint *") int[] shaders) {
        long __functionAddress = GL.getICD().glGetAttachedShaders;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(count, 1);
        }
        callPPV(__functionAddress, program, shaders.length, count, shaders);
    }

    /**
     * Array version of: {@link #glGetActiveUniform GetActiveUniform}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveUniform">Reference Page</a>
     */
    public static void glGetActiveUniform(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveUniform;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(__functionAddress, program, index, name.remaining(), length, size, type, memAddress(name));
    }

    /**
     * Array version of: {@link #glGetUniformfv GetUniformfv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformfv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetUniformfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, program, location, params);
    }

    /**
     * Array version of: {@link #glGetUniformiv GetUniformiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, program, location, params);
    }

    /**
     * Array version of: {@link #glGetShaderSource GetShaderSource}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetShaderSource">Reference Page</a>
     */
    public static void glGetShaderSource(@NativeType("GLuint") int shader, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer source) {
        long __functionAddress = GL.getICD().glGetShaderSource;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(__functionAddress, shader, source.remaining(), length, memAddress(source));
    }

    /**
     * Array version of: {@link #glVertexAttrib1fv VertexAttrib1fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib1fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib1sv VertexAttrib1sv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib1sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib1dv VertexAttrib1dv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib1dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib1dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 1);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib2fv VertexAttrib2fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib2fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib2sv VertexAttrib2sv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib2sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib2dv VertexAttrib2dv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib2dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib2dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 2);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib3fv VertexAttrib3fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib3fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib3sv VertexAttrib3sv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib3sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib3dv VertexAttrib3dv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib3dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib3dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 3);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4fv VertexAttrib4fv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4fv(@NativeType("GLuint") int index, @NativeType("GLfloat const *") float[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4fv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4sv VertexAttrib4sv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4sv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4sv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4dv VertexAttrib4dv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4dv(@NativeType("GLuint") int index, @NativeType("GLdouble const *") double[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4dv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4iv VertexAttrib4iv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4iv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4iv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4usv VertexAttrib4usv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4usv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4usv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4uiv VertexAttrib4uiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4uiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4Nsv VertexAttrib4Nsv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nsv(@NativeType("GLuint") int index, @NativeType("GLshort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nsv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4Niv VertexAttrib4Niv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Niv(@NativeType("GLuint") int index, @NativeType("GLint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Niv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4Nusv VertexAttrib4Nusv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nusv(@NativeType("GLuint") int index, @NativeType("GLushort const *") short[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nusv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glVertexAttrib4Nuiv VertexAttrib4Nuiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttrib4Nuiv(@NativeType("GLuint") int index, @NativeType("GLuint const *") int[] v) {
        long __functionAddress = GL.getICD().glVertexAttrib4Nuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(v, 4);
        }
        callPV(__functionAddress, index, v);
    }

    /**
     * Array version of: {@link #glGetActiveAttrib GetActiveAttrib}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetActiveAttrib">Reference Page</a>
     */
    public static void glGetActiveAttrib(@NativeType("GLuint") int program, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] size, @NativeType("GLenum *") int[] type, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveAttrib;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
            check(size, 1);
            check(type, 1);
        }
        callPPPPV(__functionAddress, program, index, name.remaining(), length, size, type, memAddress(name));
    }

    /**
     * Array version of: {@link #glGetVertexAttribiv GetVertexAttribiv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribiv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(__functionAddress, index, pname, params);
    }

    /**
     * Array version of: {@link #glGetVertexAttribfv GetVertexAttribfv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribfv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, index, pname, params);
    }

    /**
     * Array version of: {@link #glGetVertexAttribdv GetVertexAttribdv}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glGetVertexAttrib">Reference Page</a>
     */
    public static void glGetVertexAttribdv(@NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetVertexAttribdv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 4);
        }
        callPV(__functionAddress, index, pname, params);
    }

    /**
     * Array version of: {@link #glDrawBuffers DrawBuffers}
     * 
     * @see <a target="_blank" href="http://docs.gl/gl4/glDrawBuffers">Reference Page</a>
     */
    public static void glDrawBuffers(@NativeType("GLenum const *") int[] bufs) {
        long __functionAddress = GL.getICD().glDrawBuffers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(__functionAddress, bufs.length, bufs);
    }

}