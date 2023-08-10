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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_program_interface_query.txt">ARB_program_interface_query</a> extension.
 * 
 * <p>This extension provides a single unified set of query commands that can be used by applications to determine properties of various interfaces and
 * resources used by program objects to communicate with application code, fixed-function OpenGL pipeline stages, and other programs. In unextended OpenGL
 * 4.2, there is a separate set of query commands for each different type of interface or resource used by the program. These different sets of queries are
 * structured nearly identically, but the queries for some interfaces have limited capability (e.g., there is no ability to enumerate fragment shader
 * outputs).</p>
 * 
 * <p>With the single set of query commands provided by this extension, a consistent set of queries is available for all interfaces, and a new interface can
 * be added without having to introduce a completely new set of query commands. These queries are intended to provide a superset of the capabilities
 * provided by similar queries in OpenGL 4.2, and should allow for the deprecation of the existing queries.</p>
 * 
 * <p>This extension defines two terms: interfaces and active resources. Each interface of a program object provides a way for the program to communicate with
 * application code, fixed-function OpenGL pipeline stages, and other programs. Examples of interfaces for a program object include inputs (receiving
 * values from vertex attributes or outputs of other programs), outputs (sending values to other programs or per-fragment operations), uniforms (receiving
 * values from API calls), uniform blocks (receiving values from bound buffer objects), subroutines and subroutine uniforms (receiving API calls to
 * indicate functions to call during program execution), and atomic counter buffers (holding values to be manipulated by atomic counter shader functions).
 * Each interface of a program has a set of active resources used by the program. For example, the resources of a program's input interface includes all
 * active input variables used by the first stage of the program. The resources of a program's uniform block interface consists of the set of uniform
 * blocks with at least one member used by any shader in the program.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBProgramInterfaceQuery {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code programInterface} parameter of GetProgramInterfaceiv, GetProgramResourceIndex, GetProgramResourceName, GetProgramResourceiv,
     * GetProgramResourceLocation, and GetProgramResourceLocationIndex.
     */
    public static final int
        GL_UNIFORM                            = 0x92E1,
        GL_UNIFORM_BLOCK                      = 0x92E2,
        GL_PROGRAM_INPUT                      = 0x92E3,
        GL_PROGRAM_OUTPUT                     = 0x92E4,
        GL_BUFFER_VARIABLE                    = 0x92E5,
        GL_SHADER_STORAGE_BLOCK               = 0x92E6,
        GL_VERTEX_SUBROUTINE                  = 0x92E8,
        GL_TESS_CONTROL_SUBROUTINE            = 0x92E9,
        GL_TESS_EVALUATION_SUBROUTINE         = 0x92EA,
        GL_GEOMETRY_SUBROUTINE                = 0x92EB,
        GL_FRAGMENT_SUBROUTINE                = 0x92EC,
        GL_COMPUTE_SUBROUTINE                 = 0x92ED,
        GL_VERTEX_SUBROUTINE_UNIFORM          = 0x92EE,
        GL_TESS_CONTROL_SUBROUTINE_UNIFORM    = 0x92EF,
        GL_TESS_EVALUATION_SUBROUTINE_UNIFORM = 0x92F0,
        GL_GEOMETRY_SUBROUTINE_UNIFORM        = 0x92F1,
        GL_FRAGMENT_SUBROUTINE_UNIFORM        = 0x92F2,
        GL_COMPUTE_SUBROUTINE_UNIFORM         = 0x92F3,
        GL_TRANSFORM_FEEDBACK_VARYING         = 0x92F4;

    /** Accepted by the {@code pname} parameter of GetProgramInterfaceiv. */
    public static final int
        GL_ACTIVE_RESOURCES               = 0x92F5,
        GL_MAX_NAME_LENGTH                = 0x92F6,
        GL_MAX_NUM_ACTIVE_VARIABLES       = 0x92F7,
        GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;

    /** Accepted in the {@code props} array of GetProgramResourceiv. */
    public static final int
        GL_NAME_LENGTH                          = 0x92F9,
        GL_TYPE                                 = 0x92FA,
        GL_ARRAY_SIZE                           = 0x92FB,
        GL_OFFSET                               = 0x92FC,
        GL_BLOCK_INDEX                          = 0x92FD,
        GL_ARRAY_STRIDE                         = 0x92FE,
        GL_MATRIX_STRIDE                        = 0x92FF,
        GL_IS_ROW_MAJOR                         = 0x9300,
        GL_ATOMIC_COUNTER_BUFFER_INDEX          = 0x9301,
        GL_BUFFER_BINDING                       = 0x9302,
        GL_BUFFER_DATA_SIZE                     = 0x9303,
        GL_NUM_ACTIVE_VARIABLES                 = 0x9304,
        GL_ACTIVE_VARIABLES                     = 0x9305,
        GL_REFERENCED_BY_VERTEX_SHADER          = 0x9306,
        GL_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x9307,
        GL_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x9308,
        GL_REFERENCED_BY_GEOMETRY_SHADER        = 0x9309,
        GL_REFERENCED_BY_FRAGMENT_SHADER        = 0x930A,
        GL_REFERENCED_BY_COMPUTE_SHADER         = 0x930B,
        GL_TOP_LEVEL_ARRAY_SIZE                 = 0x930C,
        GL_TOP_LEVEL_ARRAY_STRIDE               = 0x930D,
        GL_LOCATION                             = 0x930E,
        GL_LOCATION_INDEX                       = 0x930F,
        GL_IS_PER_PATCH                         = 0x92E7;

    protected ARBProgramInterfaceQuery() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetProgramInterfaceiv ] ---

    /** Unsafe version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
    public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        GL43C.nglGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /**
     * Queries a property of an interface in a program.
     *
     * @param program          the name of a program object whose interface to query
     * @param programInterface a token identifying the interface within {@code program} to query. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param pname            the name of the parameter within {@code programInterface} to query. One of:<br><table><tr><td>{@link GL43C#GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}</td><td>{@link GL43C#GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}</td><td>{@link GL43C#GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}</td></tr><tr><td>{@link GL43C#GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}</td></tr></table>
     * @param params           a variable to retrieve the value of {@code pname} for the program interface
     */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /**
     * Queries a property of an interface in a program.
     *
     * @param program          the name of a program object whose interface to query
     * @param programInterface a token identifying the interface within {@code program} to query. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param pname            the name of the parameter within {@code programInterface} to query. One of:<br><table><tr><td>{@link GL43C#GL_ACTIVE_RESOURCES ACTIVE_RESOURCES}</td><td>{@link GL43C#GL_MAX_NAME_LENGTH MAX_NAME_LENGTH}</td><td>{@link GL43C#GL_MAX_NUM_ACTIVE_VARIABLES MAX_NUM_ACTIVE_VARIABLES}</td></tr><tr><td>{@link GL43C#GL_MAX_NUM_COMPATIBLE_SUBROUTINES MAX_NUM_COMPATIBLE_SUBROUTINES}</td></tr></table>
     */
    @NativeType("void")
    public static int glGetProgramInterfacei(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname) {
        return GL43C.glGetProgramInterfacei(program, programInterface, pname);
    }

    // --- [ glGetProgramResourceIndex ] ---

    /** Unsafe version of: {@link #glGetProgramResourceIndex GetProgramResourceIndex} */
    public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceIndex(program, programInterface, name);
    }

    /**
     * Queries the index of a named resource within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param name             the name of the resource to query the index of
     */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceIndex(program, programInterface, name);
    }

    /**
     * Queries the index of a named resource within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the resource named {Wcode name}. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param name             the name of the resource to query the index of
     */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceIndex(program, programInterface, name);
    }

    // --- [ glGetProgramResourceName ] ---

    /**
     * Unsafe version of: {@link #glGetProgramResourceName GetProgramResourceName}
     *
     * @param bufSize the size of the character array whose address is given by {@code name}
     */
    public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        GL43C.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name);
    }

    /**
     * Queries the name of an indexed resource within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param index            the index of the resource within {@code programInterface} of {@code program}
     * @param length           a variable which will receive the length of the resource name
     * @param name             a character array into which will be written the name of the resource
     */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL43C.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    /**
     * Queries the name of an indexed resource within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param index            the index of the resource within {@code programInterface} of {@code program}
     * @param bufSize          the size of the character array whose address is given by {@code name}
     */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize) {
        return GL43C.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

    /**
     * Queries the name of an indexed resource within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the indexed resource. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param index            the index of the resource within {@code programInterface} of {@code program}
     */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return glGetProgramResourceName(program, programInterface, index, glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH));
    }

    // --- [ glGetProgramResourceiv ] ---

    /**
     * Unsafe version of: {@link #glGetProgramResourceiv GetProgramResourceiv}
     *
     * @param propCount the number of properties in {@code props}
     * @param bufSize   the size of the integer array whose address is given by {@code params}
     */
    public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        GL43C.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    /**
     * Retrieves values for multiple properties of a single active resource within a program object.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. One of:<br><table><tr><td>{@link GL43C#GL_UNIFORM UNIFORM}</td><td>{@link GL43C#GL_UNIFORM_BLOCK UNIFORM_BLOCK}</td><td>{@link GL43C#GL_PROGRAM_INPUT PROGRAM_INPUT}</td></tr><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td><td>{@link GL43C#GL_BUFFER_VARIABLE BUFFER_VARIABLE}</td><td>{@link GL43C#GL_SHADER_STORAGE_BLOCK SHADER_STORAGE_BLOCK}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE VERTEX_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE TESS_CONTROL_SUBROUTINE}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE TESS_EVALUATION_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE GEOMETRY_SUBROUTINE}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE FRAGMENT_SUBROUTINE}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE COMPUTE_SUBROUTINE}</td></tr><tr><td>{@link GL43C#GL_VERTEX_SUBROUTINE_UNIFORM VERTEX_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_CONTROL_SUBROUTINE_UNIFORM TESS_CONTROL_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_TESS_EVALUATION_SUBROUTINE_UNIFORM TESS_EVALUATION_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_GEOMETRY_SUBROUTINE_UNIFORM GEOMETRY_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_FRAGMENT_SUBROUTINE_UNIFORM FRAGMENT_SUBROUTINE_UNIFORM}</td><td>{@link GL43C#GL_COMPUTE_SUBROUTINE_UNIFORM COMPUTE_SUBROUTINE_UNIFORM}</td></tr><tr><td>{@link GL43C#GL_TRANSFORM_FEEDBACK_VARYING TRANSFORM_FEEDBACK_VARYING}</td><td>{@link GL42#GL_ATOMIC_COUNTER_BUFFER ATOMIC_COUNTER_BUFFER}</td></tr></table>
     * @param index            the active resource index
     * @param props            an array that will receive the active resource properties
     * @param length           a variable which will receive the number of values returned
     * @param params           an array that will receive the property values
     */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    // --- [ glGetProgramResourceLocation ] ---

    /** Unsafe version of: {@link #glGetProgramResourceLocation GetProgramResourceLocation} */
    public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceLocation(program, programInterface, name);
    }

    /**
     * Queries the location of a named resource within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}
     * @param name             the name of the resource to query the location of
     */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceLocation(program, programInterface, name);
    }

    /**
     * Queries the location of a named resource within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}
     * @param name             the name of the resource to query the location of
     */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceLocation(program, programInterface, name);
    }

    // --- [ glGetProgramResourceLocationIndex ] ---

    /** Unsafe version of: {@link #glGetProgramResourceLocationIndex GetProgramResourceLocationIndex} */
    public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /**
     * Queries the fragment color index of a named variable within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>
     * @param name             the name of the resource to query the location of
     */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /**
     * Queries the fragment color index of a named variable within a program.
     *
     * @param program          the name of a program object whose resources to query
     * @param programInterface a token identifying the interface within {@code program} containing the resource named {@code name}. Must be:<br><table><tr><td>{@link GL43C#GL_PROGRAM_OUTPUT PROGRAM_OUTPUT}</td></tr></table>
     * @param name             the name of the resource to query the location of
     */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /** Array version of: {@link #glGetProgramInterfaceiv GetProgramInterfaceiv} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL43C.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /** Array version of: {@link #glGetProgramResourceName GetProgramResourceName} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        GL43C.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    /** Array version of: {@link #glGetProgramResourceiv GetProgramResourceiv} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLint *") int[] params) {
        GL43C.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

}