/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

public class ARBProgramInterfaceQuery {

    static { GL.initialize(); }

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

    public static final int
        GL_ACTIVE_RESOURCES               = 0x92F5,
        GL_MAX_NAME_LENGTH                = 0x92F6,
        GL_MAX_NUM_ACTIVE_VARIABLES       = 0x92F7,
        GL_MAX_NUM_COMPATIBLE_SUBROUTINES = 0x92F8;

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

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void nglGetProgramInterfaceiv(int program, int programInterface, int pname, long params) {
        GL43C.nglGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    @NativeType("void")
    public static int glGetProgramInterfacei(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname) {
        return GL43C.glGetProgramInterfacei(program, programInterface, pname);
    }

    // --- [ glGetProgramResourceIndex ] ---

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static int nglGetProgramResourceIndex(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceIndex(program, programInterface, name);
    }

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceIndex(program, programInterface, name);
    }

    /** {@code GLuint glGetProgramResourceIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLuint")
    public static int glGetProgramResourceIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceIndex(program, programInterface, name);
    }

    // --- [ glGetProgramResourceName ] ---

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void nglGetProgramResourceName(int program, int programInterface, int index, int bufSize, long length, long name) {
        GL43C.nglGetProgramResourceName(program, programInterface, index, bufSize, length, name);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        GL43C.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufSize) {
        return GL43C.glGetProgramResourceName(program, programInterface, index, bufSize);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    @NativeType("void")
    public static String glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index) {
        return glGetProgramResourceName(program, programInterface, index, glGetProgramInterfacei(program, programInterface, GL_MAX_NAME_LENGTH));
    }

    // --- [ glGetProgramResourceiv ] ---

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void nglGetProgramResourceiv(int program, int programInterface, int index, int propCount, long props, int bufSize, long length, long params) {
        GL43C.nglGetProgramResourceiv(program, programInterface, index, propCount, props, bufSize, length, params);
    }

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") IntBuffer props, @NativeType("GLsizei *") @Nullable IntBuffer length, @NativeType("GLint *") IntBuffer params) {
        GL43C.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

    // --- [ glGetProgramResourceLocation ] ---

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static int nglGetProgramResourceLocation(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceLocation(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceLocation(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocation(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceLocation(program, programInterface, name);
    }

    // --- [ glGetProgramResourceLocationIndex ] ---

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    public static int nglGetProgramResourceLocationIndex(int program, int programInterface, long name) {
        return GL43C.nglGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") ByteBuffer name) {
        return GL43C.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /** {@code GLint glGetProgramResourceLocationIndex(GLuint program, GLenum programInterface, GLchar const * name)} */
    @NativeType("GLint")
    public static int glGetProgramResourceLocationIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLchar const *") CharSequence name) {
        return GL43C.glGetProgramResourceLocationIndex(program, programInterface, name);
    }

    /** {@code void glGetProgramInterfaceiv(GLuint program, GLenum programInterface, GLenum pname, GLint * params)} */
    public static void glGetProgramInterfaceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL43C.glGetProgramInterfaceiv(program, programInterface, pname, params);
    }

    /** {@code void glGetProgramResourceName(GLuint program, GLenum programInterface, GLuint index, GLsizei bufSize, GLsizei * length, GLchar * name)} */
    public static void glGetProgramResourceName(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLchar *") ByteBuffer name) {
        GL43C.glGetProgramResourceName(program, programInterface, index, length, name);
    }

    /** {@code void glGetProgramResourceiv(GLuint program, GLenum programInterface, GLuint index, GLsizei propCount, GLenum const * props, GLsizei bufSize, GLsizei * length, GLint * params)} */
    public static void glGetProgramResourceiv(@NativeType("GLuint") int program, @NativeType("GLenum") int programInterface, @NativeType("GLuint") int index, @NativeType("GLenum const *") int[] props, @NativeType("GLsizei *") int @Nullable [] length, @NativeType("GLint *") int[] params) {
        GL43C.glGetProgramResourceiv(program, programInterface, index, props, length, params);
    }

}