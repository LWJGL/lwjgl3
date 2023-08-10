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

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_separate_shader_objects.txt">ARB_separate_shader_objects</a> extension.
 * 
 * <p>Conventional GLSL requires multiple shader stages (vertex, fragment, geometry, tessellation control, and tessellation evaluation) to be linked into a
 * single monolithic program object to specify a GLSL shader for each stage.</p>
 * 
 * <p>While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple stages, all existing GPU hardware supports the
 * more flexible mix-and-match approach.</p>
 * 
 * <p>Shaders written for HLSL9, Cg, the prior OpenGL assembly program extensions, and game console favor a more flexible "mix-and-match" approach to
 * specifying shaders independently for these different shader stages. Many developers build their shader content around the mix-and-match approach where
 * they can use a single vertex shader with multiple fragment shaders (or vice versa).</p>
 * 
 * <p>This extension adopts a "mix-and-match" shader stage model for GLSL allowing multiple different GLSL program objects to be bound at once each to an
 * individual rendering pipeline stage independently of other stage bindings. This allows program objects to contain only the shader stages that best suit
 * the applications needs.</p>
 * 
 * <p>This extension introduces the program pipeline object that serves as a container for the program bound to any particular rendering stage. It can be
 * bound, unbound, and rebound to simply save and restore the complete shader stage to program object bindings. Like framebuffer and vertex array objects,
 * program pipeline objects are "container" objects that are not shared between contexts.</p>
 * 
 * <p>To bind a program object to a specific shader stage or set of stages, {@link #glUseProgramStages UseProgramStages} is used. The {@link #GL_VERTEX_SHADER_BIT VERTEX_SHADER_BIT}, {@link #GL_GEOMETRY_SHADER_BIT GEOMETRY_SHADER_BIT},
 * {@link #GL_FRAGMENT_SHADER_BIT FRAGMENT_SHADER_BIT}, {@link #GL_TESS_CONTROL_SHADER_BIT TESS_CONTROL_SHADER_BIT}, and {@link #GL_TESS_EVALUATION_SHADER_BIT TESS_EVALUATION_SHADER_BIT} tokens refer to the conventional vertex, geometry, fragment,
 * tessellation control and tessellation evaluation stages respectively. {@link #glActiveShaderProgram ActiveShaderProgram} specifies the program that Uniform* commands will update.</p>
 * 
 * <p>While {@link #glActiveShaderProgram ActiveShaderProgram} allows the use of conventional Uniform* commands to update uniform variable values for separable program objects, this
 * extension provides a preferrable interface in a set of ProgramUniform* commands that update the same uniform variables but take a parameter indicating
 * the program object to be updated, rather than updating the currently active program object. These commands mirror those introduced in
 * {@link EXTDirectStateAccess EXT_direct_state_access}.</p>
 * 
 * <p>While {@link #glActiveShaderProgram ActiveShaderProgram} provides a selector for setting and querying uniform values of a program object, the glProgramUniform* commands provide a
 * selector-free way to modify uniforms of a GLSL program object without an explicit bind. This selector-free model reduces API overhead and provides a
 * cleaner interface for applications.</p>
 * 
 * <p>Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader inputting varyings. In this
 * case, the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding
 * shader. In this case, the unwritten input varying values are undefined.</p>
 * 
 * <p>This extension builds on the proof-of-concept provided by {@link EXTSeparateShaderObjects EXT_separate_shader_objects} which demonstrated that separate shader objects can work
 * for GLSL. {@code EXT_separate_shader_objects} was a response to repeated requests for this functionality from 3D developers.</p>
 * 
 * <p>This ARB version addresses several "loose ends" in the prior EXT extension. In particular, it allows user-defined varyings with explicitly defined
 * locations or implicitly assigned locations.</p>
 * 
 * <p>This ARB extension extends the GLSL language's use of layout qualifiers to provide cross-stage interfacing.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBShaderObjects ARB_shader_objects}. Promoted to core in {@link GL41 OpenGL 4.1}.</p>
 */
public class ARBSeparateShaderObjects {

    static { GL.initialize(); }

    /** Accepted by {@code stages} parameter to UseProgramStages. */
    public static final int
        GL_VERTEX_SHADER_BIT          = 0x1,
        GL_FRAGMENT_SHADER_BIT        = 0x2,
        GL_GEOMETRY_SHADER_BIT        = 0x4,
        GL_TESS_CONTROL_SHADER_BIT    = 0x8,
        GL_TESS_EVALUATION_SHADER_BIT = 0x10,
        GL_ALL_SHADER_BITS            = 0xFFFFFFFF;

    /** Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv. */
    public static final int GL_PROGRAM_SEPARABLE = 0x8258;

    /** Accepted by {@code type} parameter to GetProgramPipelineiv. */
    public static final int GL_ACTIVE_PROGRAM = 0x8259;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_PROGRAM_PIPELINE_BINDING = 0x825A;

    protected ARBSeparateShaderObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ glUseProgramStages ] ---

    /**
     * Binds stages of a program object to a program pipeline.
     *
     * @param pipeline the program pipeline object to which to bind stages from {@code program}
     * @param stages   a set of program stages to bind to the program pipeline object
     * @param program  the program object containing the shader executables to use in {@code pipeline}
     */
    public static void glUseProgramStages(@NativeType("GLuint") int pipeline, @NativeType("GLbitfield") int stages, @NativeType("GLuint") int program) {
        GL41C.glUseProgramStages(pipeline, stages, program);
    }

    // --- [ glActiveShaderProgram ] ---

    /**
     * Sets the active program object for a program pipeline object.
     *
     * @param pipeline the program pipeline object to set the active program object for
     * @param program  the program object to set as the active program pipeline object {@code pipeline}
     */
    public static void glActiveShaderProgram(@NativeType("GLuint") int pipeline, @NativeType("GLuint") int program) {
        GL41C.glActiveShaderProgram(pipeline, program);
    }

    // --- [ glCreateShaderProgramv ] ---

    /**
     * Unsafe version of: {@link #glCreateShaderProgramv CreateShaderProgramv}
     *
     * @param count the number of source code strings in the array {@code strings}
     */
    public static int nglCreateShaderProgramv(int type, int count, long strings) {
        return GL41C.nglCreateShaderProgramv(type, count, strings);
    }

    /**
     * Creates a stand-alone program from an array of null-terminated source code strings.
     * 
     * <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p>
     * 
     * <pre><code>
     * const GLuint shader = glCreateShader(type);
     * if (shader) {
     *     glShaderSource(shader, count, strings, NULL);
     *     glCompileShader(shader);
     *     const GLuint program = glCreateProgram();
     *     if (program) {
     *         GLint compiled = GL_FALSE;
     *         glGetShaderiv(shader, GL_COMPILE_STATUS, &amp;compiled);
     *         glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
     *         if (compiled) {
     *             glAttachShader(program, shader);
     *             glLinkProgram(program);
     *             glDetachShader(program, shader);
     *         }
     *         // append-shader-info-log-to-program-info-log
     *     }
     *     glDeleteShader(shader);
     *     return program;
     * } else {
     *     return 0;
     * }</code></pre>
     * 
     * <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>
     *
     * @param type    the type of shader to create
     * @param strings an array of pointers to source code strings from which to create the program object
     */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") PointerBuffer strings) {
        return GL41C.glCreateShaderProgramv(type, strings);
    }

    /**
     * Creates a stand-alone program from an array of null-terminated source code strings.
     * 
     * <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p>
     * 
     * <pre><code>
     * const GLuint shader = glCreateShader(type);
     * if (shader) {
     *     glShaderSource(shader, count, strings, NULL);
     *     glCompileShader(shader);
     *     const GLuint program = glCreateProgram();
     *     if (program) {
     *         GLint compiled = GL_FALSE;
     *         glGetShaderiv(shader, GL_COMPILE_STATUS, &amp;compiled);
     *         glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
     *         if (compiled) {
     *             glAttachShader(program, shader);
     *             glLinkProgram(program);
     *             glDetachShader(program, shader);
     *         }
     *         // append-shader-info-log-to-program-info-log
     *     }
     *     glDeleteShader(shader);
     *     return program;
     * } else {
     *     return 0;
     * }</code></pre>
     * 
     * <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>
     *
     * @param type    the type of shader to create
     * @param strings an array of pointers to source code strings from which to create the program object
     */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence... strings) {
        return GL41C.glCreateShaderProgramv(type, strings);
    }

    /**
     * Creates a stand-alone program from an array of null-terminated source code strings.
     * 
     * <p>{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:</p>
     * 
     * <pre><code>
     * const GLuint shader = glCreateShader(type);
     * if (shader) {
     *     glShaderSource(shader, count, strings, NULL);
     *     glCompileShader(shader);
     *     const GLuint program = glCreateProgram();
     *     if (program) {
     *         GLint compiled = GL_FALSE;
     *         glGetShaderiv(shader, GL_COMPILE_STATUS, &amp;compiled);
     *         glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
     *         if (compiled) {
     *             glAttachShader(program, shader);
     *             glLinkProgram(program);
     *             glDetachShader(program, shader);
     *         }
     *         // append-shader-info-log-to-program-info-log
     *     }
     *     glDeleteShader(shader);
     *     return program;
     * } else {
     *     return 0;
     * }</code></pre>
     * 
     * <p>The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.</p>
     *
     * @param type the type of shader to create
     */
    @NativeType("GLuint")
    public static int glCreateShaderProgramv(@NativeType("GLenum") int type, @NativeType("GLchar const * const *") CharSequence string) {
        return GL41C.glCreateShaderProgramv(type, string);
    }

    // --- [ glBindProgramPipeline ] ---

    /**
     * Binds a program pipeline to the current context.
     *
     * @param pipeline the name of the pipeline object to bind to the context
     */
    public static void glBindProgramPipeline(@NativeType("GLuint") int pipeline) {
        GL41C.glBindProgramPipeline(pipeline);
    }

    // --- [ glDeleteProgramPipelines ] ---

    /**
     * Unsafe version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines}
     *
     * @param n the number of program pipeline objects to delete
     */
    public static void nglDeleteProgramPipelines(int n, long pipelines) {
        GL41C.nglDeleteProgramPipelines(n, pipelines);
    }

    /**
     * Deletes program pipeline objects.
     *
     * @param pipelines an array of names of program pipeline objects to delete
     */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") IntBuffer pipelines) {
        GL41C.glDeleteProgramPipelines(pipelines);
    }

    /** Deletes program pipeline objects. */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int pipeline) {
        GL41C.glDeleteProgramPipelines(pipeline);
    }

    // --- [ glGenProgramPipelines ] ---

    /**
     * Unsafe version of: {@link #glGenProgramPipelines GenProgramPipelines}
     *
     * @param n the number of program pipeline object names to reserve
     */
    public static void nglGenProgramPipelines(int n, long pipelines) {
        GL41C.nglGenProgramPipelines(n, pipelines);
    }

    /**
     * Reserves program pipeline object names.
     *
     * @param pipelines an array of into which the reserved names will be written
     */
    public static void glGenProgramPipelines(@NativeType("GLuint *") IntBuffer pipelines) {
        GL41C.glGenProgramPipelines(pipelines);
    }

    /** Reserves program pipeline object names. */
    @NativeType("void")
    public static int glGenProgramPipelines() {
        return GL41C.glGenProgramPipelines();
    }

    // --- [ glIsProgramPipeline ] ---

    /**
     * Determines if a name corresponds to a program pipeline object.
     *
     * @param pipeline a value that may be the name of a program pipeline object
     */
    @NativeType("GLboolean")
    public static boolean glIsProgramPipeline(@NativeType("GLuint") int pipeline) {
        return GL41C.glIsProgramPipeline(pipeline);
    }

    // --- [ glProgramParameteri ] ---

    /**
     * Specifies the integer value of a program object parameter.
     *
     * @param program the name of a program object whose parameter to modify
     * @param pname   the name of the parameter to modify. One of:<br><table><tr><td>{@link GL41C#GL_PROGRAM_BINARY_RETRIEVABLE_HINT PROGRAM_BINARY_RETRIEVABLE_HINT}</td><td>{@link GL41C#GL_PROGRAM_SEPARABLE PROGRAM_SEPARABLE}</td></tr></table>
     * @param value   the new value of the parameter specified by {@code pname} for {@code program}
     */
    public static void glProgramParameteri(@NativeType("GLuint") int program, @NativeType("GLenum") int pname, @NativeType("GLint") int value) {
        GL41C.glProgramParameteri(program, pname, value);
    }

    // --- [ glGetProgramPipelineiv ] ---

    /** Unsafe version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
    public static void nglGetProgramPipelineiv(int pipeline, int pname, long params) {
        GL41C.nglGetProgramPipelineiv(pipeline, pname, params);
    }

    /**
     * Retrieves properties of a program pipeline object.
     *
     * @param pipeline the name of a program pipeline object whose parameter retrieve
     * @param pname    the name of the parameter to retrieve. One of:<br><table><tr><td>{@link GL41C#GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}</td><td>{@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param params   a variable into which will be written the value or values of {@code pname} for {@code pipeline}
     */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL41C.glGetProgramPipelineiv(pipeline, pname, params);
    }

    /**
     * Retrieves properties of a program pipeline object.
     *
     * @param pipeline the name of a program pipeline object whose parameter retrieve
     * @param pname    the name of the parameter to retrieve. One of:<br><table><tr><td>{@link GL41C#GL_ACTIVE_PROGRAM ACTIVE_PROGRAM}</td><td>{@link GL20#GL_INFO_LOG_LENGTH INFO_LOG_LENGTH}</td><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td></tr><tr><td>{@link GL40#GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td><td>{@link GL40#GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetProgramPipelinei(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname) {
        return GL41C.glGetProgramPipelinei(pipeline, pname);
    }

    // --- [ glProgramUniform1i ] ---

    /**
     * Specifies the value of an int uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static void glProgramUniform1i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x) {
        GL41C.glProgramUniform1i(program, location, x);
    }

    // --- [ glProgramUniform2i ] ---

    /**
     * Specifies the value of an ivec2 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static void glProgramUniform2i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y) {
        GL41C.glProgramUniform2i(program, location, x, y);
    }

    // --- [ glProgramUniform3i ] ---

    /**
     * Specifies the value of an ivec3 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static void glProgramUniform3i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z) {
        GL41C.glProgramUniform3i(program, location, x, y, z);
    }

    // --- [ glProgramUniform4i ] ---

    /**
     * Specifies the value of an ivec4 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static void glProgramUniform4i(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint") int x, @NativeType("GLint") int y, @NativeType("GLint") int z, @NativeType("GLint") int w) {
        GL41C.glProgramUniform4i(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1ui ] ---

    /**
     * Specifies the value of a uint uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static void glProgramUniform1ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x) {
        GL41C.glProgramUniform1ui(program, location, x);
    }

    // --- [ glProgramUniform2ui ] ---

    /**
     * Specifies the value of a uvec2 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static void glProgramUniform2ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y) {
        GL41C.glProgramUniform2ui(program, location, x, y);
    }

    // --- [ glProgramUniform3ui ] ---

    /**
     * Specifies the value of a uvec3 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static void glProgramUniform3ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z) {
        GL41C.glProgramUniform3ui(program, location, x, y, z);
    }

    // --- [ glProgramUniform4ui ] ---

    /**
     * Specifies the value of a uvec4 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static void glProgramUniform4ui(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint") int x, @NativeType("GLuint") int y, @NativeType("GLuint") int z, @NativeType("GLuint") int w) {
        GL41C.glProgramUniform4ui(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1f ] ---

    /**
     * Specifies the value of a float uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static void glProgramUniform1f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x) {
        GL41C.glProgramUniform1f(program, location, x);
    }

    // --- [ glProgramUniform2f ] ---

    /**
     * Specifies the value of a vec2 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static void glProgramUniform2f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y) {
        GL41C.glProgramUniform2f(program, location, x, y);
    }

    // --- [ glProgramUniform3f ] ---

    /**
     * Specifies the value of a vec3 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static void glProgramUniform3f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z) {
        GL41C.glProgramUniform3f(program, location, x, y, z);
    }

    // --- [ glProgramUniform4f ] ---

    /**
     * Specifies the value of a vec4 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static void glProgramUniform4f(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat") float x, @NativeType("GLfloat") float y, @NativeType("GLfloat") float z, @NativeType("GLfloat") float w) {
        GL41C.glProgramUniform4f(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1d ] ---

    /**
     * Specifies the value of a double uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     */
    public static void glProgramUniform1d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x) {
        GL41C.glProgramUniform1d(program, location, x);
    }

    // --- [ glProgramUniform2d ] ---

    /**
     * Specifies the value of a dvec2 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     */
    public static void glProgramUniform2d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y) {
        GL41C.glProgramUniform2d(program, location, x, y);
    }

    // --- [ glProgramUniform3d ] ---

    /**
     * Specifies the value of a dvec3 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     */
    public static void glProgramUniform3d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z) {
        GL41C.glProgramUniform3d(program, location, x, y, z);
    }

    // --- [ glProgramUniform4d ] ---

    /**
     * Specifies the value of a dvec4 uniform variable for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     */
    public static void glProgramUniform4d(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w) {
        GL41C.glProgramUniform4d(program, location, x, y, z, w);
    }

    // --- [ glProgramUniform1iv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform1iv ProgramUniform1iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform1iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1iv(program, location, count, value);
    }

    /**
     * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform1iv(program, location, value);
    }

    // --- [ glProgramUniform2iv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform2iv ProgramUniform2iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform2iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2iv(program, location, count, value);
    }

    /**
     * Specifies the value of a single ivec2 uniform variable or an ivec2 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform2iv(program, location, value);
    }

    // --- [ glProgramUniform3iv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform3iv ProgramUniform3iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform3iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3iv(program, location, count, value);
    }

    /**
     * Specifies the value of a single ivec3 uniform variable or an ivec3 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform3iv(program, location, value);
    }

    // --- [ glProgramUniform4iv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform4iv ProgramUniform4iv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform4iv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4iv(program, location, count, value);
    }

    /**
     * Specifies the value of a single ivec4 uniform variable or an ivec4 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") IntBuffer value) {
        GL41C.glProgramUniform4iv(program, location, value);
    }

    // --- [ glProgramUniform1uiv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform1uiv ProgramUniform1uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform1uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1uiv(program, location, count, value);
    }

    /**
     * Specifies the value of a single uint uniform variable or a uint uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform1uiv(program, location, value);
    }

    // --- [ glProgramUniform2uiv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform2uiv ProgramUniform2uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform2uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2uiv(program, location, count, value);
    }

    /**
     * Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform2uiv(program, location, value);
    }

    // --- [ glProgramUniform3uiv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform3uiv ProgramUniform3uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform3uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3uiv(program, location, count, value);
    }

    /**
     * Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform3uiv(program, location, value);
    }

    // --- [ glProgramUniform4uiv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform4uiv ProgramUniform4uiv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform4uiv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4uiv(program, location, count, value);
    }

    /**
     * Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") IntBuffer value) {
        GL41C.glProgramUniform4uiv(program, location, value);
    }

    // --- [ glProgramUniform1fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform1fv ProgramUniform1fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform1fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1fv(program, location, count, value);
    }

    /**
     * Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform1fv(program, location, value);
    }

    // --- [ glProgramUniform2fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform2fv ProgramUniform2fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform2fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2fv(program, location, count, value);
    }

    /**
     * Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform2fv(program, location, value);
    }

    // --- [ glProgramUniform3fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform3fv ProgramUniform3fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform3fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3fv(program, location, count, value);
    }

    /**
     * Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform3fv(program, location, value);
    }

    // --- [ glProgramUniform4fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform4fv ProgramUniform4fv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform4fv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4fv(program, location, count, value);
    }

    /**
     * Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniform4fv(program, location, value);
    }

    // --- [ glProgramUniform1dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform1dv ProgramUniform1dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform1dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform1dv(program, location, count, value);
    }

    /**
     * Specifies the value of a single double uniform variable or a double uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform1dv(program, location, value);
    }

    // --- [ glProgramUniform2dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform2dv ProgramUniform2dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform2dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform2dv(program, location, count, value);
    }

    /**
     * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform2dv(program, location, value);
    }

    // --- [ glProgramUniform3dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform3dv ProgramUniform3dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform3dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform3dv(program, location, count, value);
    }

    /**
     * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform3dv(program, location, value);
    }

    // --- [ glProgramUniform4dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniform4dv ProgramUniform4dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static void nglProgramUniform4dv(int program, int location, int count, long value) {
        GL41C.nglProgramUniform4dv(program, location, count, value);
    }

    /**
     * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for a specified program object.
     *
     * @param program  the handle of the program containing the uniform variable to be modified
     * @param location the location of the uniform variable to be modified
     * @param value    an array of {@code count} values that will be used to update the specified uniform variable
     */
    public static void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniform4dv(program, location, value);
    }

    // --- [ glProgramUniformMatrix2fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix2fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix3fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix4fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2dv ProgramUniformMatrix2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix2dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3dv ProgramUniformMatrix3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix3dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4dv ProgramUniformMatrix4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix4dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x3fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix2x3fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x3fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x2fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix3x2fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x2fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x4fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix2x4fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x4fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x2fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix4x2fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x2fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x4fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix3x4fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x4fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x3fv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix4x3fv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x3fv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") FloatBuffer value) {
        GL41C.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x3dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2x3dv ProgramUniformMatrix2x3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix2x3dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x3dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x2dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3x2dv ProgramUniformMatrix3x2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix3x2dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x2dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix2x4dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix2x4dv ProgramUniformMatrix2x4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix2x4dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix2x4dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x2dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix4x2dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x2dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix3x4dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix3x4dv ProgramUniformMatrix3x4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix3x4dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix3x4dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    // --- [ glProgramUniformMatrix4x3dv ] ---

    /**
     * Unsafe version of: {@link #glProgramUniformMatrix4x3dv ProgramUniformMatrix4x3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static void nglProgramUniformMatrix4x3dv(int program, int location, int count, boolean transpose, long value) {
        GL41C.nglProgramUniformMatrix4x3dv(program, location, count, transpose, value);
    }

    /**
     * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
     *
     * @param program   the handle of the program containing the uniform variable to be modified
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     an array of {@code count} values that will be used to update the specified uniform matrix variable
     */
    public static void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        GL41C.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    // --- [ glValidateProgramPipeline ] ---

    /**
     * Validates a program pipeline object against current GL state.
     *
     * @param pipeline the name of a program pipeline object to validate
     */
    public static void glValidateProgramPipeline(@NativeType("GLuint") int pipeline) {
        GL41C.glValidateProgramPipeline(pipeline);
    }

    // --- [ glGetProgramPipelineInfoLog ] ---

    /**
     * Unsafe version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog}
     *
     * @param bufSize the maximum number of characters, including the null terminator, that may be written into {@code infoLog}
     */
    public static void nglGetProgramPipelineInfoLog(int pipeline, int bufSize, long length, long infoLog) {
        GL41C.nglGetProgramPipelineInfoLog(pipeline, bufSize, length, infoLog);
    }

    /**
     * Retrieves the info log string from a program pipeline object.
     *
     * @param pipeline the name of a program pipeline object from which to retrieve the info log
     * @param length   a variable into which will be written the number of characters written into {@code infoLog}
     * @param infoLog  an array of characters into which will be written the info log for {@code pipeline}
     */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL41C.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

    /**
     * Retrieves the info log string from a program pipeline object.
     *
     * @param pipeline the name of a program pipeline object from which to retrieve the info log
     * @param bufSize  the maximum number of characters, including the null terminator, that may be written into {@code infoLog}
     */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @NativeType("GLsizei") int bufSize) {
        return GL41C.glGetProgramPipelineInfoLog(pipeline, bufSize);
    }

    /**
     * Retrieves the info log string from a program pipeline object.
     *
     * @param pipeline the name of a program pipeline object from which to retrieve the info log
     */
    @NativeType("void")
    public static String glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline) {
        return glGetProgramPipelineInfoLog(pipeline, glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH));
    }

    /** Array version of: {@link #glDeleteProgramPipelines DeleteProgramPipelines} */
    public static void glDeleteProgramPipelines(@NativeType("GLuint const *") int[] pipelines) {
        GL41C.glDeleteProgramPipelines(pipelines);
    }

    /** Array version of: {@link #glGenProgramPipelines GenProgramPipelines} */
    public static void glGenProgramPipelines(@NativeType("GLuint *") int[] pipelines) {
        GL41C.glGenProgramPipelines(pipelines);
    }

    /** Array version of: {@link #glGetProgramPipelineiv GetProgramPipelineiv} */
    public static void glGetProgramPipelineiv(@NativeType("GLuint") int pipeline, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL41C.glGetProgramPipelineiv(pipeline, pname, params);
    }

    /** Array version of: {@link #glProgramUniform1iv ProgramUniform1iv} */
    public static void glProgramUniform1iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform1iv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform2iv ProgramUniform2iv} */
    public static void glProgramUniform2iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform2iv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform3iv ProgramUniform3iv} */
    public static void glProgramUniform3iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform3iv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform4iv ProgramUniform4iv} */
    public static void glProgramUniform4iv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLint const *") int[] value) {
        GL41C.glProgramUniform4iv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform1uiv ProgramUniform1uiv} */
    public static void glProgramUniform1uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform1uiv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform2uiv ProgramUniform2uiv} */
    public static void glProgramUniform2uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform2uiv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform3uiv ProgramUniform3uiv} */
    public static void glProgramUniform3uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform3uiv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform4uiv ProgramUniform4uiv} */
    public static void glProgramUniform4uiv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLuint const *") int[] value) {
        GL41C.glProgramUniform4uiv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform1fv ProgramUniform1fv} */
    public static void glProgramUniform1fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform1fv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform2fv ProgramUniform2fv} */
    public static void glProgramUniform2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform2fv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform3fv ProgramUniform3fv} */
    public static void glProgramUniform3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform3fv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform4fv ProgramUniform4fv} */
    public static void glProgramUniform4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniform4fv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform1dv ProgramUniform1dv} */
    public static void glProgramUniform1dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform1dv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform2dv ProgramUniform2dv} */
    public static void glProgramUniform2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform2dv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform3dv ProgramUniform3dv} */
    public static void glProgramUniform3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform3dv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniform4dv ProgramUniform4dv} */
    public static void glProgramUniform4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniform4dv(program, location, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2fv ProgramUniformMatrix2fv} */
    public static void glProgramUniformMatrix2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix2fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3fv ProgramUniformMatrix3fv} */
    public static void glProgramUniformMatrix3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix3fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4fv ProgramUniformMatrix4fv} */
    public static void glProgramUniformMatrix4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix4fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2dv ProgramUniformMatrix2dv} */
    public static void glProgramUniformMatrix2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix2dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3dv ProgramUniformMatrix3dv} */
    public static void glProgramUniformMatrix3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix3dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4dv ProgramUniformMatrix4dv} */
    public static void glProgramUniformMatrix4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix4dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x3fv ProgramUniformMatrix2x3fv} */
    public static void glProgramUniformMatrix2x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix2x3fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x2fv ProgramUniformMatrix3x2fv} */
    public static void glProgramUniformMatrix3x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix3x2fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x4fv ProgramUniformMatrix2x4fv} */
    public static void glProgramUniformMatrix2x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix2x4fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x2fv ProgramUniformMatrix4x2fv} */
    public static void glProgramUniformMatrix4x2fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix4x2fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x4fv ProgramUniformMatrix3x4fv} */
    public static void glProgramUniformMatrix3x4fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix3x4fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x3fv ProgramUniformMatrix4x3fv} */
    public static void glProgramUniformMatrix4x3fv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLfloat const *") float[] value) {
        GL41C.glProgramUniformMatrix4x3fv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x3dv ProgramUniformMatrix2x3dv} */
    public static void glProgramUniformMatrix2x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix2x3dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x2dv ProgramUniformMatrix3x2dv} */
    public static void glProgramUniformMatrix3x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix3x2dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix2x4dv ProgramUniformMatrix2x4dv} */
    public static void glProgramUniformMatrix2x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix2x4dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x2dv ProgramUniformMatrix4x2dv} */
    public static void glProgramUniformMatrix4x2dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix4x2dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix3x4dv ProgramUniformMatrix3x4dv} */
    public static void glProgramUniformMatrix3x4dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix3x4dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glProgramUniformMatrix4x3dv ProgramUniformMatrix4x3dv} */
    public static void glProgramUniformMatrix4x3dv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        GL41C.glProgramUniformMatrix4x3dv(program, location, transpose, value);
    }

    /** Array version of: {@link #glGetProgramPipelineInfoLog GetProgramPipelineInfoLog} */
    public static void glGetProgramPipelineInfoLog(@NativeType("GLuint") int pipeline, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer infoLog) {
        GL41C.glGetProgramPipelineInfoLog(pipeline, length, infoLog);
    }

}