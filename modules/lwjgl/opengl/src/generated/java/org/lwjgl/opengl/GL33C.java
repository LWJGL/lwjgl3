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
 * The OpenGL functionality up to version 3.3. Includes only Core Profile symbols.
 * 
 * <p>OpenGL 3.3 implementations support revision 3.30 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_bit_encoding.txt">ARB_shader_bit_encoding</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_blend_func_extended.txt">ARB_blend_func_extended</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_explicit_attrib_location.txt">ARB_explicit_attrib_location</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_occlusion_query2.txt">ARB_occlusion_query2</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_sampler_objects.txt">ARB_sampler_objects</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_rgb10_a2ui.txt">ARB_texture_rgb10_a2ui</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_swizzle.txt">ARB_texture_swizzle</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_timer_query.txt">ARB_timer_query</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_instanced_arrays.txt">ARB_instanced_arrays</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_vertex_type_2_10_10_10_rev.txt">ARB_vertex_type_2_10_10_10_rev</a></li>
 * </ul>
 */
public class GL33C extends GL32C {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
     * {@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
     */
    public static final int
        GL_SRC1_COLOR           = 0x88F9,
        GL_ONE_MINUS_SRC1_COLOR = 0x88FA,
        GL_ONE_MINUS_SRC1_ALPHA = 0x88FB;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
    public static final int GL_MAX_DUAL_SOURCE_DRAW_BUFFERS = 0x88FC;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int GL_ANY_SAMPLES_PASSED = 0x8C2F;

    /** Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions. */
    public static final int GL_SAMPLER_BINDING = 0x8919;

    /**
     * Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
     * RenderbufferStorageMultisample.
     */
    public static final int GL_RGB10_A2UI = 0x906F;

    /** Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_SWIZZLE_R = 0x8E42,
        GL_TEXTURE_SWIZZLE_G = 0x8E43,
        GL_TEXTURE_SWIZZLE_B = 0x8E44,
        GL_TEXTURE_SWIZZLE_A = 0x8E45;

    /** Accepted by the {@code pname} parameters of TexParameteriv,  TexParameterfv, GetTexParameterfv, and GetTexParameteriv. */
    public static final int GL_TEXTURE_SWIZZLE_RGBA = 0x8E46;

    /** Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv. */
    public static final int GL_TIME_ELAPSED = 0x88BF;

    /**
     * Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
     * GetInteger64v, GetFloatv, and GetDoublev.
     */
    public static final int GL_TIMESTAMP = 0x8E28;

    /** Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv. */
    public static final int GL_VERTEX_ATTRIB_ARRAY_DIVISOR = 0x88FE;

    /**
     * Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
     * VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP* and VertexAttribP*.
     */
    public static final int GL_INT_2_10_10_10_REV = 0x8D9F;

    protected GL33C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexed ] ---

    /** Unsafe version of: {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
    public static native void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name);

    /**
     * Binds a user-defined varying out variable to a fragment shader color number and index.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param index       the index of the color input to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     * 
     * @see <a href="https://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a>
     */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        nglBindFragDataLocationIndexed(program, colorNumber, index, memAddress(name));
    }

    /**
     * Binds a user-defined varying out variable to a fragment shader color number and index.
     *
     * @param program     the name of the program containing varying out variable whose binding to modify
     * @param colorNumber the color number to bind the user-defined varying out variable to
     * @param index       the index of the color input to bind the user-defined varying out variable to
     * @param name        the name of the user-defined varying out variable whose binding to modify
     * 
     * @see <a href="https://docs.gl/gl4/glBindFragDataLocationIndexed">Reference Page</a>
     */
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            nglBindFragDataLocationIndexed(program, colorNumber, index, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetFragDataIndex ] ---

    /** Unsafe version of: {@link #glGetFragDataIndex GetFragDataIndex} */
    public static native int nglGetFragDataIndex(int program, long name);

    /**
     * Queries the bindings of color indices to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose index to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetFragDataIndex">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetFragDataIndex(program, memAddress(name));
    }

    /**
     * Queries the bindings of color indices to user-defined varying out variables.
     *
     * @param program the name of the program containing varying out variable whose binding to query
     * @param name    the name of the user-defined varying out variable whose index to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetFragDataIndex">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetFragDataIndex(program, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenSamplers ] ---

    /**
     * Unsafe version of: {@link #glGenSamplers GenSamplers}
     *
     * @param count the number of sampler object names to generate
     */
    public static native void nglGenSamplers(int count, long samplers);

    /**
     * Generates sampler object names.
     *
     * @param samplers a buffer in which the generated sampler object names are stored
     * 
     * @see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>
     */
    public static void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        nglGenSamplers(samplers.remaining(), memAddress(samplers));
    }

    /**
     * Generates sampler object names.
     * 
     * @see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenSamplers() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.callocInt(1);
            nglGenSamplers(1, memAddress(samplers));
            return samplers.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glDeleteSamplers ] ---

    /**
     * Unsafe version of: {@link #glDeleteSamplers DeleteSamplers}
     *
     * @param count the number of sampler objects to be deleted
     */
    public static native void nglDeleteSamplers(int count, long samplers);

    /**
     * Deletes named sampler objects.
     *
     * @param samplers an array of sampler objects to be deleted
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>
     */
    public static void glDeleteSamplers(@NativeType("GLuint const *") IntBuffer samplers) {
        nglDeleteSamplers(samplers.remaining(), memAddress(samplers));
    }

    /**
     * Deletes named sampler objects.
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>
     */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int sampler) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer samplers = stack.ints(sampler);
            nglDeleteSamplers(1, memAddress(samplers));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsSampler ] ---

    /**
     * Determines if a name corresponds to a sampler object.
     *
     * @param sampler a value that may be the name of a sampler object
     * 
     * @see <a href="https://docs.gl/gl4/glIsSampler">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsSampler(@NativeType("GLuint") int sampler);

    // --- [ glBindSampler ] ---

    /**
     * Binds a named sampler to a texturing target.
     *
     * @param unit    the index of the texture unit to which the sampler is bound
     * @param sampler the name of a sampler
     * 
     * @see <a href="https://docs.gl/gl4/glBindSampler">Reference Page</a>
     */
    public static native void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler);

    // --- [ glSamplerParameteri ] ---

    /**
     * Set the integer value of a sampler parameter.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a single-valued sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
     * @param param   the value of {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameteri">Reference Page</a>
     */
    public static native void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param);

    // --- [ glSamplerParameterf ] ---

    /**
     * Float version of {@link #glSamplerParameteri SamplerParameteri}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a single-valued sampler parameter
     * @param param   the value of {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameterf">Reference Page</a>
     */
    public static native void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param);

    // --- [ glSamplerParameteriv ] ---

    /** Unsafe version of: {@link #glSamplerParameteriv SamplerParameteriv} */
    public static native void nglSamplerParameteriv(int sampler, int pname, long params);

    /**
     * Pointer version of {@link #glSamplerParameteri SamplerParameteri}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td></tr><tr><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td></tr><tr><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr></table>
     * @param params  an array where the value or values of {@code pname} are stored
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameteriv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterfv ] ---

    /** Unsafe version of: {@link #glSamplerParameterfv SamplerParameterfv} */
    public static native void nglSamplerParameterfv(int sampler, int pname, long params);

    /**
     * Float version of {@link #glSamplerParameteriv SamplerParameteriv}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter
     * @param params  an array where the value or values of {@code pname} are stored
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterfv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterIiv ] ---

    /** Unsafe version of: {@link #glSamplerParameterIiv SamplerParameterIiv} */
    public static native void nglSamplerParameterIiv(int sampler, int pname, long params);

    /**
     * Pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter
     * @param params  an array where the value or values of {@code pname} are stored
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    // --- [ glSamplerParameterIuiv ] ---

    /** Unsafe version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
    public static native void nglSamplerParameterIuiv(int sampler, int pname, long params);

    /**
     * Unsigned pure integer version of {@link #glSamplerParameteriv SamplerParameteriv}.
     *
     * @param sampler the sampler object whose parameter to modify
     * @param pname   the symbolic name of a sampler parameter
     * @param params  an array where the value or values of {@code pname} are stored
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglSamplerParameterIuiv(sampler, pname, memAddress(params));
    }

    // --- [ glGetSamplerParameteriv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
    public static native void nglGetSamplerParameteriv(int sampler, int pname, long params);

    /**
     * Return the integer value(s) of a sampler parameter.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
     * @param params  the sampler parameters
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameteriv(sampler, pname, memAddress(params));
    }

    /**
     * Return the integer value(s) of a sampler parameter.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter. One of:<br><table><tr><td>{@link GL11#GL_TEXTURE_WRAP_S TEXTURE_WRAP_S}</td><td>{@link GL11#GL_TEXTURE_WRAP_T TEXTURE_WRAP_T}</td><td>{@link GL12#GL_TEXTURE_WRAP_R TEXTURE_WRAP_R}</td><td>{@link GL11#GL_TEXTURE_MIN_FILTER TEXTURE_MIN_FILTER}</td><td>{@link GL11#GL_TEXTURE_MAG_FILTER TEXTURE_MAG_FILTER}</td></tr><tr><td>{@link GL12#GL_TEXTURE_MIN_LOD TEXTURE_MIN_LOD}</td><td>{@link GL12#GL_TEXTURE_MAX_LOD TEXTURE_MAX_LOD}</td><td>{@link GL14#GL_TEXTURE_LOD_BIAS TEXTURE_LOD_BIAS}</td><td>{@link GL14#GL_TEXTURE_COMPARE_MODE TEXTURE_COMPARE_MODE}</td><td>{@link GL14#GL_TEXTURE_COMPARE_FUNC TEXTURE_COMPARE_FUNC}</td></tr><tr><td>,</td><td>{@link GL11#GL_TEXTURE_BORDER_COLOR TEXTURE_BORDER_COLOR}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameteriv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterfv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
    public static native void nglGetSamplerParameterfv(int sampler, int pname, long params);

    /**
     * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * @param params  the sampler parameters
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") FloatBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterfv(sampler, pname, memAddress(params));
    }

    /**
     * Float version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    @NativeType("void")
    public static float glGetSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer params = stack.callocFloat(1);
            nglGetSamplerParameterfv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIiv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
    public static native void nglGetSamplerParameterIiv(int sampler, int pname, long params);

    /**
     * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * @param params  the sampler parameters
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
    }

    /**
     * Pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetSamplerParameterIi(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSamplerParameterIuiv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
    public static native void nglGetSamplerParameterIuiv(int sampler, int pname, long params);

    /**
     * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * @param params  the sampler parameters
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
    }

    /**
     * Unsigned pure integer version of {@link #glGetSamplerParameteriv GetSamplerParameteriv}.
     *
     * @param sampler the name of the sampler object from which to retrieve parameters
     * @param pname   the symbolic name of a sampler parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetSamplerParameterIui(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetSamplerParameterIuiv(sampler, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glQueryCounter ] ---

    /**
     * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
     *
     * @param id     the name of a query object into which to record the GL time
     * @param target the counter to query. Must be:<br><table><tr><td>{@link #GL_TIMESTAMP TIMESTAMP}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glQueryCounter">Reference Page</a>
     */
    public static native void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target);

    // --- [ glGetQueryObjecti64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
    public static native void nglGetQueryObjecti64v(int id, int pname, long params);

    /**
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * @param params the requested data
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjecti64v(id, pname, memAddress(params));
    }

    /**
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * @param params the requested data
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long params) {
        nglGetQueryObjecti64v(id, pname, params);
    }

    /**
     * Returns the 64bit integer value of query object parameter.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter. One of:<br><table><tr><td>{@link GL15#GL_QUERY_RESULT QUERY_RESULT}</td><td>{@link GL15#GL_QUERY_RESULT_AVAILABLE QUERY_RESULT_AVAILABLE}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    @NativeType("void")
    public static long glGetQueryObjecti64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjecti64v(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetQueryObjectui64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
    public static native void nglGetQueryObjectui64v(int id, int pname, long params);

    /**
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter
     * @param params the requested data
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryObjectui64v(id, pname, memAddress(params));
    }

    /**
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id     the name of a query object
     * @param pname  the symbolic name of a query object parameter
     * @param params the requested data
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long params) {
        nglGetQueryObjectui64v(id, pname, params);
    }

    /**
     * Unsigned version of {@link #glGetQueryObjecti64v GetQueryObjecti64v}.
     *
     * @param id    the name of a query object
     * @param pname the symbolic name of a query object parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    @NativeType("void")
    public static long glGetQueryObjectui64(@NativeType("GLuint") int id, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer params = stack.callocLong(1);
            nglGetQueryObjectui64v(id, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glVertexAttribDivisor ] ---

    /**
     * Modifies the rate at which generic vertex attributes advance during instanced rendering.
     *
     * @param index   the index of the generic vertex attribute
     * @param divisor the number of instances that will pass between updates of the generic attribute at slot {@code index}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttribDivisor">Reference Page</a>
     */
    public static native void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor);

    // --- [ glVertexAttribP1ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP2ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP3ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP4ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static native void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value);

    // --- [ glVertexAttribP1uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
    public static native void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value);

    /**
     * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP1uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP2uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
    public static native void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value);

    /**
     * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP2uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP3uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
    public static native void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value);

    /**
     * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP3uiv(index, type, normalized, memAddress(value));
    }

    // --- [ glVertexAttribP4uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
    public static native void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value);

    /**
     * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexAttribP4uiv(index, type, normalized, memAddress(value));
    }

    /**
     * Array version of: {@link #glGenSamplers GenSamplers}
     * 
     * @see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>
     */
    public static void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        long __functionAddress = GL.getICD().glGenSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /**
     * Array version of: {@link #glDeleteSamplers DeleteSamplers}
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>
     */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        long __functionAddress = GL.getICD().glDeleteSamplers;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(samplers.length, samplers, __functionAddress);
    }

    /**
     * Array version of: {@link #glSamplerParameteriv SamplerParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glSamplerParameterfv SamplerParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glSamplerParameterIiv SamplerParameterIiv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        long __functionAddress = GL.getICD().glSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameteriv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetSamplerParameterIuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(sampler, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v}
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjecti64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v}
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        long __functionAddress = GL.getICD().glGetQueryObjectui64v;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(id, pname, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexAttribP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(index, type, normalized, value, __functionAddress);
    }

}