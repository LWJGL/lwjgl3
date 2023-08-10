/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_subroutine.txt">ARB_shader_subroutine</a> extension.
 * 
 * <p>This extension adds support to shaders for "indirect subroutine calls", where a single shader can include many subroutines and dynamically select
 * through the API which subroutine is called from each call site. Switching subroutines dynamically in this fashion can avoid the cost of recompiling and
 * managing multiple shaders, while still retaining most of the performance of specialized shaders.</p>
 * 
 * <p>Requires {@link ARBGPUShader5 ARB_gpu_shader5}. Promoted to core in {@link GL40 OpenGL 4.0}.</p>
 */
public class ARBShaderSubroutine {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetProgramStageiv. */
    public static final int
        GL_ACTIVE_SUBROUTINES                   = 0x8DE5,
        GL_ACTIVE_SUBROUTINE_UNIFORMS           = 0x8DE6,
        GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS  = 0x8E47,
        GL_ACTIVE_SUBROUTINE_MAX_LENGTH         = 0x8E48,
        GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH = 0x8E49;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
    public static final int
        GL_MAX_SUBROUTINES                  = 0x8DE7,
        GL_MAX_SUBROUTINE_UNIFORM_LOCATIONS = 0x8DE8;

    /** Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv. */
    public static final int
        GL_NUM_COMPATIBLE_SUBROUTINES = 0x8E4A,
        GL_COMPATIBLE_SUBROUTINES     = 0x8E4B;

    protected ARBShaderSubroutine() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetSubroutineUniformLocation ] ---

    /** Unsafe version of: {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation} */
    public static int nglGetSubroutineUniformLocation(int program, int shadertype, long name) {
        return GL40C.nglGetSubroutineUniformLocation(program, shadertype, name);
    }

    /**
     * Retrieves the location of a subroutine uniform of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine uniform whose index to query.
     */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return GL40C.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    /**
     * Retrieves the location of a subroutine uniform of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine uniform whose index to query.
     */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return GL40C.glGetSubroutineUniformLocation(program, shadertype, name);
    }

    // --- [ glGetSubroutineIndex ] ---

    /** Unsafe version of: {@link #glGetSubroutineIndex GetSubroutineIndex} */
    public static int nglGetSubroutineIndex(int program, int shadertype, long name) {
        return GL40C.nglGetSubroutineIndex(program, shadertype, name);
    }

    /**
     * Retrieves the index of a subroutine function of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine function whose index to query
     */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        return GL40C.glGetSubroutineIndex(program, shadertype, name);
    }

    /**
     * Retrieves the index of a subroutine function of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine function whose index to query
     */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        return GL40C.glGetSubroutineIndex(program, shadertype, name);
    }

    // --- [ glGetActiveSubroutineUniformiv ] ---

    /** Unsafe version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
    public static void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values) {
        GL40C.nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /**
     * Queries a property of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param pname      the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link GL40C#GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link GL40C#GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>
     * @param values     the address of a buffer into which the queried value or values will be placed
     */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        GL40C.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /**
     * Queries a property of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param pname      the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link GL40C#GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link GL40C#GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetActiveSubroutineUniformi(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        return GL40C.glGetActiveSubroutineUniformi(program, shadertype, index, pname);
    }

    // --- [ glGetActiveSubroutineUniformName ] ---

    /**
     * Unsafe version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName}
     *
     * @param bufsize the size of the buffer whose address is given in {@code name}
     */
    public static void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name) {
        GL40C.nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, length, name);
    }

    /**
     * Queries the name of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param length     the address of a variable into which is written the number of characters copied into {@code name}
     * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
     */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    /**
     * Queries the name of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param bufsize    the size of the buffer whose address is given in {@code name}
     */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, bufsize);
    }

    /**
     * Queries the name of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineUniformName(program, shadertype, index, glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH));
    }

    // --- [ glGetActiveSubroutineName ] ---

    /**
     * Unsafe version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName}
     *
     * @param bufsize the size of the buffer whose address is given in {@code name}
     */
    public static void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name) {
        GL40C.nglGetActiveSubroutineName(program, shadertype, index, bufsize, length, name);
    }

    /**
     * Queries the name of an active shader subroutine.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param length     a variable which is to receive the length of the shader subroutine uniform name
     * @param name       an array into which the name of the shader subroutine uniform will be written
     */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    /**
     * Queries the name of an active shader subroutine.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param bufsize    the size of the buffer whose address is given in {@code name}
     */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        return GL40C.glGetActiveSubroutineName(program, shadertype, index, bufsize);
    }

    /**
     * Queries the name of an active shader subroutine.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index) {
        return glGetActiveSubroutineName(program, shadertype, index, glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH));
    }

    // --- [ glUniformSubroutinesuiv ] ---

    /**
     * Unsafe version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv}
     *
     * @param count the number of uniform indices stored in {@code indices}
     */
    public static void nglUniformSubroutinesuiv(int shadertype, int count, long indices) {
        GL40C.nglUniformSubroutinesuiv(shadertype, count, indices);
    }

    /**
     * Loads active subroutine uniforms.
     *
     * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param indices    an array holding the indices to load into the shader subroutine variables
     */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") IntBuffer indices) {
        GL40C.glUniformSubroutinesuiv(shadertype, indices);
    }

    /**
     * Loads active subroutine uniforms.
     *
     * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     */
    public static void glUniformSubroutinesui(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int index) {
        GL40C.glUniformSubroutinesui(shadertype, index);
    }

    // --- [ glGetUniformSubroutineuiv ] ---

    /** Unsafe version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
    public static void nglGetUniformSubroutineuiv(int shadertype, int location, long params) {
        GL40C.nglGetUniformSubroutineuiv(shadertype, location, params);
    }

    /**
     * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
     *
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param location   the location of the subroutine uniform
     * @param params     a variable to receive the value or values of the subroutine uniform
     */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        GL40C.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    /**
     * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
     *
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param location   the location of the subroutine uniform
     */
    @NativeType("void")
    public static int glGetUniformSubroutineui(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location) {
        return GL40C.glGetUniformSubroutineui(shadertype, location);
    }

    // --- [ glGetProgramStageiv ] ---

    /** Unsafe version of: {@link #glGetProgramStageiv GetProgramStageiv} */
    public static void nglGetProgramStageiv(int program, int shadertype, int pname, long values) {
        GL40C.nglGetProgramStageiv(program, shadertype, pname, values);
    }

    /**
     * Retrieves properties of a program object corresponding to a specified shader stage.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param pname      the parameter of the shader to query. One of:<br><table><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>
     * @param values     a variable into which the queried value or values will be placed
     */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        GL40C.glGetProgramStageiv(program, shadertype, pname, values);
    }

    /**
     * Retrieves properties of a program object corresponding to a specified shader stage.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link GL40C#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link GL40C#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param pname      the parameter of the shader to query. One of:<br><table><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link GL40C#GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetProgramStagei(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname) {
        return GL40C.glGetProgramStagei(program, shadertype, pname);
    }

    /** Array version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        GL40C.glGetActiveSubroutineUniformiv(program, shadertype, index, pname, values);
    }

    /** Array version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName} */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineUniformName(program, shadertype, index, length, name);
    }

    /** Array version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName} */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        GL40C.glGetActiveSubroutineName(program, shadertype, index, length, name);
    }

    /** Array version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv} */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int[] indices) {
        GL40C.glUniformSubroutinesuiv(shadertype, indices);
    }

    /** Array version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        GL40C.glGetUniformSubroutineuiv(shadertype, location, params);
    }

    /** Array version of: {@link #glGetProgramStageiv GetProgramStageiv} */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        GL40C.glGetProgramStageiv(program, shadertype, pname, values);
    }

}