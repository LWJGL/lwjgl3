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
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The OpenGL functionality up to version 3.3. Includes the deprecated symbols of the Compatibility Profile.
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
public class GL33 extends GL32 {

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

    protected GL33() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBindFragDataLocationIndexed ] ---

    /** Unsafe version of: {@link #glBindFragDataLocationIndexed BindFragDataLocationIndexed} */
    public static void nglBindFragDataLocationIndexed(int program, int colorNumber, int index, long name) {
        GL33C.nglBindFragDataLocationIndexed(program, colorNumber, index, name);
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
    public static void glBindFragDataLocationIndexed(@NativeType("GLuint") int program, @NativeType("GLuint") int colorNumber, @NativeType("GLuint") int index, @NativeType("GLchar const *") ByteBuffer name) {
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
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
        GL33C.glBindFragDataLocationIndexed(program, colorNumber, index, name);
    }

    // --- [ glGetFragDataIndex ] ---

    /** Unsafe version of: {@link #glGetFragDataIndex GetFragDataIndex} */
    public static int nglGetFragDataIndex(int program, long name) {
        return GL33C.nglGetFragDataIndex(program, name);
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
    public static int glGetFragDataIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer name) {
        return GL33C.glGetFragDataIndex(program, name);
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
        return GL33C.glGetFragDataIndex(program, name);
    }

    // --- [ glGenSamplers ] ---

    /**
     * Unsafe version of: {@link #glGenSamplers GenSamplers}
     *
     * @param count the number of sampler object names to generate
     */
    public static void nglGenSamplers(int count, long samplers) {
        GL33C.nglGenSamplers(count, samplers);
    }

    /**
     * Generates sampler object names.
     *
     * @param samplers a buffer in which the generated sampler object names are stored
     * 
     * @see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>
     */
    public static void glGenSamplers(@NativeType("GLuint *") IntBuffer samplers) {
        GL33C.glGenSamplers(samplers);
    }

    /**
     * Generates sampler object names.
     * 
     * @see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenSamplers() {
        return GL33C.glGenSamplers();
    }

    // --- [ glDeleteSamplers ] ---

    /**
     * Unsafe version of: {@link #glDeleteSamplers DeleteSamplers}
     *
     * @param count the number of sampler objects to be deleted
     */
    public static void nglDeleteSamplers(int count, long samplers) {
        GL33C.nglDeleteSamplers(count, samplers);
    }

    /**
     * Deletes named sampler objects.
     *
     * @param samplers an array of sampler objects to be deleted
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>
     */
    public static void glDeleteSamplers(@NativeType("GLuint const *") IntBuffer samplers) {
        GL33C.glDeleteSamplers(samplers);
    }

    /**
     * Deletes named sampler objects.
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>
     */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int sampler) {
        GL33C.glDeleteSamplers(sampler);
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
    public static boolean glIsSampler(@NativeType("GLuint") int sampler) {
        return GL33C.glIsSampler(sampler);
    }

    // --- [ glBindSampler ] ---

    /**
     * Binds a named sampler to a texturing target.
     *
     * @param unit    the index of the texture unit to which the sampler is bound
     * @param sampler the name of a sampler
     * 
     * @see <a href="https://docs.gl/gl4/glBindSampler">Reference Page</a>
     */
    public static void glBindSampler(@NativeType("GLuint") int unit, @NativeType("GLuint") int sampler) {
        GL33C.glBindSampler(unit, sampler);
    }

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
    public static void glSamplerParameteri(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint") int param) {
        GL33C.glSamplerParameteri(sampler, pname, param);
    }

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
    public static void glSamplerParameterf(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat") float param) {
        GL33C.glSamplerParameterf(sampler, pname, param);
    }

    // --- [ glSamplerParameteriv ] ---

    /** Unsafe version of: {@link #glSamplerParameteriv SamplerParameteriv} */
    public static void nglSamplerParameteriv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameteriv(sampler, pname, params);
    }

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
        GL33C.glSamplerParameteriv(sampler, pname, params);
    }

    // --- [ glSamplerParameterfv ] ---

    /** Unsafe version of: {@link #glSamplerParameterfv SamplerParameterfv} */
    public static void nglSamplerParameterfv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterfv(sampler, pname, params);
    }

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
        GL33C.glSamplerParameterfv(sampler, pname, params);
    }

    // --- [ glSamplerParameterIiv ] ---

    /** Unsafe version of: {@link #glSamplerParameterIiv SamplerParameterIiv} */
    public static void nglSamplerParameterIiv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterIiv(sampler, pname, params);
    }

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
        GL33C.glSamplerParameterIiv(sampler, pname, params);
    }

    // --- [ glSamplerParameterIuiv ] ---

    /** Unsafe version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv} */
    public static void nglSamplerParameterIuiv(int sampler, int pname, long params) {
        GL33C.nglSamplerParameterIuiv(sampler, pname, params);
    }

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
        GL33C.glSamplerParameterIuiv(sampler, pname, params);
    }

    // --- [ glGetSamplerParameteriv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv} */
    public static void nglGetSamplerParameteriv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameteriv(sampler, pname, params);
    }

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
        GL33C.glGetSamplerParameteriv(sampler, pname, params);
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
        return GL33C.glGetSamplerParameteri(sampler, pname);
    }

    // --- [ glGetSamplerParameterfv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv} */
    public static void nglGetSamplerParameterfv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterfv(sampler, pname, params);
    }

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
        GL33C.glGetSamplerParameterfv(sampler, pname, params);
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
        return GL33C.glGetSamplerParameterf(sampler, pname);
    }

    // --- [ glGetSamplerParameterIiv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv} */
    public static void nglGetSamplerParameterIiv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterIiv(sampler, pname, params);
    }

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
        GL33C.glGetSamplerParameterIiv(sampler, pname, params);
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
        return GL33C.glGetSamplerParameterIi(sampler, pname);
    }

    // --- [ glGetSamplerParameterIuiv ] ---

    /** Unsafe version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv} */
    public static void nglGetSamplerParameterIuiv(int sampler, int pname, long params) {
        GL33C.nglGetSamplerParameterIuiv(sampler, pname, params);
    }

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
        GL33C.glGetSamplerParameterIuiv(sampler, pname, params);
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
        return GL33C.glGetSamplerParameterIui(sampler, pname);
    }

    // --- [ glQueryCounter ] ---

    /**
     * Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.
     *
     * @param id     the name of a query object into which to record the GL time
     * @param target the counter to query. Must be:<br><table><tr><td>{@link GL33C#GL_TIMESTAMP TIMESTAMP}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glQueryCounter">Reference Page</a>
     */
    public static void glQueryCounter(@NativeType("GLuint") int id, @NativeType("GLenum") int target) {
        GL33C.glQueryCounter(id, target);
    }

    // --- [ glGetQueryObjecti64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v} */
    public static void nglGetQueryObjecti64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjecti64v(id, pname, params);
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
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") LongBuffer params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
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
        GL33C.glGetQueryObjecti64v(id, pname, params);
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
        return GL33C.glGetQueryObjecti64(id, pname);
    }

    // --- [ glGetQueryObjectui64v ] ---

    /** Unsafe version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v} */
    public static void nglGetQueryObjectui64v(int id, int pname, long params) {
        GL33C.nglGetQueryObjectui64v(id, pname, params);
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
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") LongBuffer params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
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
        GL33C.glGetQueryObjectui64v(id, pname, params);
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
        return GL33C.glGetQueryObjectui64(id, pname);
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
    public static void glVertexAttribDivisor(@NativeType("GLuint") int index, @NativeType("GLuint") int divisor) {
        GL33C.glVertexAttribDivisor(index, divisor);
    }

    // --- [ glVertexP2ui ] ---

    /**
     * Packed component version of {@link GL11#glVertex2f Vertex2f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glVertexP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP3ui ] ---

    /**
     * Packed component version of {@link GL11#glVertex3f Vertex3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glVertexP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP4ui ] ---

    /**
     * Packed component version of {@link GL11#glVertex4f Vertex4f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glVertexP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int value);

    // --- [ glVertexP2uiv ] ---

    /** Unsafe version of: {@link #glVertexP2uiv VertexP2uiv} */
    public static native void nglVertexP2uiv(int type, long value);

    /**
     * Pointer version of {@link #glVertexP2ui VertexP2ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP2uiv(type, memAddress(value));
    }

    // --- [ glVertexP3uiv ] ---

    /** Unsafe version of: {@link #glVertexP3uiv VertexP3uiv} */
    public static native void nglVertexP3uiv(int type, long value);

    /**
     * Pointer version of {@link #glVertexP3ui VertexP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP3uiv(type, memAddress(value));
    }

    // --- [ glVertexP4uiv ] ---

    /** Unsafe version of: {@link #glVertexP4uiv VertexP4uiv} */
    public static native void nglVertexP4uiv(int type, long value);

    /**
     * Pointer version of {@link #glVertexP4ui VertexP4ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param value the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        nglVertexP4uiv(type, memAddress(value));
    }

    // --- [ glTexCoordP1ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord1f TexCoord1f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glTexCoordP1ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP2ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord2f TexCoord2f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glTexCoordP2ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP3ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord3f TexCoord3f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glTexCoordP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP4ui ] ---

    /**
     * Packed component version of {@link GL11#glTexCoord4f TexCoord4f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glTexCoordP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glTexCoordP1uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP1uiv TexCoordP1uiv} */
    public static native void nglTexCoordP1uiv(int type, long coords);

    /**
     * Pointer version of {@link #glTexCoordP1ui TexCoordP1ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP1uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP2uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP2uiv TexCoordP2uiv} */
    public static native void nglTexCoordP2uiv(int type, long coords);

    /**
     * Pointer version of {@link #glTexCoordP2ui TexCoordP2ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP2uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP3uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP3uiv TexCoordP3uiv} */
    public static native void nglTexCoordP3uiv(int type, long coords);

    /**
     * Pointer version of {@link #glTexCoordP3ui TexCoordP3ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP3uiv(type, memAddress(coords));
    }

    // --- [ glTexCoordP4uiv ] ---

    /** Unsafe version of: {@link #glTexCoordP4uiv TexCoordP4uiv} */
    public static native void nglTexCoordP4uiv(int type, long coords);

    /**
     * Pointer version of {@link #glTexCoordP4ui TexCoordP4ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglTexCoordP4uiv(type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP1ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord1f MultiTexCoord1f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glMultiTexCoordP1ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP2ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord2f MultiTexCoord2f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glMultiTexCoordP2ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP3ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord3f MultiTexCoord3f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glMultiTexCoordP3ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP4ui ] ---

    /**
     * Packed component version of {@link GL13#glMultiTexCoord4f MultiTexCoord4f}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>type</td><td>of</td><td>packing</td><td>used</td><td>on</td><td>the</td><td>data</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glMultiTexCoordP4ui(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glMultiTexCoordP1uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv} */
    public static native void nglMultiTexCoordP1uiv(int texture, int type, long coords);

    /**
     * Pointer version of {@link #glMultiTexCoordP1ui MultiTexCoordP1ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP1uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP2uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv} */
    public static native void nglMultiTexCoordP2uiv(int texture, int type, long coords);

    /**
     * Pointer version of {@link #glMultiTexCoordP2ui MultiTexCoordP2ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP2uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP3uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv} */
    public static native void nglMultiTexCoordP3uiv(int texture, int type, long coords);

    /**
     * Pointer version of {@link #glMultiTexCoordP3ui MultiTexCoordP3ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP3uiv(texture, type, memAddress(coords));
    }

    // --- [ glMultiTexCoordP4uiv ] ---

    /** Unsafe version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv} */
    public static native void nglMultiTexCoordP4uiv(int texture, int type, long coords);

    /**
     * Pointer version of {@link #glMultiTexCoordP4ui MultiTexCoordP4ui}.
     *
     * @param texture the coordinate set to be modified
     * @param type    type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords  the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglMultiTexCoordP4uiv(texture, type, memAddress(coords));
    }

    // --- [ glNormalP3ui ] ---

    /**
     * Packed component version of {@link GL11#glNormal3f Normal3f}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glNormalP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int coords);

    // --- [ glNormalP3uiv ] ---

    /** Unsafe version of: {@link #glNormalP3uiv NormalP3uiv} */
    public static native void nglNormalP3uiv(int type, long coords);

    /**
     * Pointer version {@link #glNormalP3ui NormalP3ui}.
     *
     * @param type   type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param coords the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer coords) {
        if (CHECKS) {
            check(coords, 1);
        }
        nglNormalP3uiv(type, memAddress(coords));
    }

    // --- [ glColorP3ui ] ---

    /**
     * Packed component version of {@link GL11#glColor3f Color3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glColorP4ui ] ---

    /**
     * Packed component version of {@link GL11#glColor4f Color4f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glColorP4ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glColorP3uiv ] ---

    /** Unsafe version of: {@link #glColorP3uiv ColorP3uiv} */
    public static native void nglColorP3uiv(int type, long color);

    /**
     * Pointer version of {@link #glColorP3ui ColorP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglColorP3uiv(type, memAddress(color));
    }

    // --- [ glColorP4uiv ] ---

    /** Unsafe version of: {@link #glColorP4uiv ColorP4uiv} */
    public static native void nglColorP4uiv(int type, long color);

    /**
     * Pointer version of {@link #glColorP4ui ColorP4ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglColorP4uiv(type, memAddress(color));
    }

    // --- [ glSecondaryColorP3ui ] ---

    /**
     * Packed component version of {@link GL14#glSecondaryColor3f SecondaryColor3f}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static native void glSecondaryColorP3ui(@NativeType("GLenum") int type, @NativeType("GLuint") int color);

    // --- [ glSecondaryColorP3uiv ] ---

    /** Unsafe version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv} */
    public static native void nglSecondaryColorP3uiv(int type, long color);

    /**
     * Pointer version of {@link #glSecondaryColorP3ui SecondaryColorP3ui}.
     *
     * @param type  type of packing used on the data. One of:<br><table><tr><td>{@link #GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param color the packed value
     * 
     * @see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") IntBuffer color) {
        if (CHECKS) {
            check(color, 1);
        }
        nglSecondaryColorP3uiv(type, memAddress(color));
    }

    // --- [ glVertexAttribP1ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib1f VertexAttrib1f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP1ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP1ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP2ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib2f VertexAttrib2f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP2ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP2ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP3ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib3f VertexAttrib3f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP3ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP3ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP4ui ] ---

    /**
     * Packed component version of {@link GL20C#glVertexAttrib4f VertexAttrib4f}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP4ui(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint") int value) {
        GL33C.glVertexAttribP4ui(index, type, normalized, value);
    }

    // --- [ glVertexAttribP1uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv} */
    public static void nglVertexAttribP1uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP1uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP1ui VertexAttribP1ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP1uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP2uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv} */
    public static void nglVertexAttribP2uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP2uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP2ui VertexAttribP2ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP2uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP3uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv} */
    public static void nglVertexAttribP3uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP3uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP3ui VertexAttribP3ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP3uiv(index, type, normalized, value);
    }

    // --- [ glVertexAttribP4uiv ] ---

    /** Unsafe version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv} */
    public static void nglVertexAttribP4uiv(int index, int type, boolean normalized, long value) {
        GL33C.nglVertexAttribP4uiv(index, type, normalized, value);
    }

    /**
     * Pointer version of {@link #glVertexAttribP4ui VertexAttribP4ui}.
     *
     * @param index      the index of the generic vertex attribute to be modified
     * @param type       type of packing used on the data. One of:<br><table><tr><td>{@link GL33C#GL_INT_2_10_10_10_REV INT_2_10_10_10_REV}</td><td>{@link GL12#GL_UNSIGNED_INT_2_10_10_10_REV UNSIGNED_INT_2_10_10_10_REV}</td></tr></table>
     * @param normalized whether values should be normalized or cast directly to floating-point
     * @param value      the packed value
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") IntBuffer value) {
        GL33C.glVertexAttribP4uiv(index, type, normalized, value);
    }

    /**
     * Array version of: {@link #glGenSamplers GenSamplers}
     * 
     * @see <a href="https://docs.gl/gl4/glGenSamplers">Reference Page</a>
     */
    public static void glGenSamplers(@NativeType("GLuint *") int[] samplers) {
        GL33C.glGenSamplers(samplers);
    }

    /**
     * Array version of: {@link #glDeleteSamplers DeleteSamplers}
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteSamplers">Reference Page</a>
     */
    public static void glDeleteSamplers(@NativeType("GLuint const *") int[] samplers) {
        GL33C.glDeleteSamplers(samplers);
    }

    /**
     * Array version of: {@link #glSamplerParameteriv SamplerParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL33C.glSamplerParameteriv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glSamplerParameterfv SamplerParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] params) {
        GL33C.glSamplerParameterfv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glSamplerParameterIiv SamplerParameterIiv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint const *") int[] params) {
        GL33C.glSamplerParameterIiv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glSamplerParameterIuiv SamplerParameterIuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glSamplerParameter">Reference Page</a>
     */
    public static void glSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint const *") int[] params) {
        GL33C.glSamplerParameterIuiv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glGetSamplerParameteriv GetSamplerParameteriv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameteriv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL33C.glGetSamplerParameteriv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glGetSamplerParameterfv GetSamplerParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterfv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLfloat *") float[] params) {
        GL33C.glGetSamplerParameterfv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glGetSamplerParameterIiv GetSamplerParameterIiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterIiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL33C.glGetSamplerParameterIiv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glGetSamplerParameterIuiv GetSamplerParameterIuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetSamplerParameter">Reference Page</a>
     */
    public static void glGetSamplerParameterIuiv(@NativeType("GLuint") int sampler, @NativeType("GLenum") int pname, @NativeType("GLuint *") int[] params) {
        GL33C.glGetSamplerParameterIuiv(sampler, pname, params);
    }

    /**
     * Array version of: {@link #glGetQueryObjecti64v GetQueryObjecti64v}
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjecti64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLint64 *") long[] params) {
        GL33C.glGetQueryObjecti64v(id, pname, params);
    }

    /**
     * Array version of: {@link #glGetQueryObjectui64v GetQueryObjectui64v}
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryObject">Reference Page</a>
     */
    public static void glGetQueryObjectui64v(@NativeType("GLuint") int id, @NativeType("GLenum") int pname, @NativeType("GLuint64 *") long[] params) {
        GL33C.glGetQueryObjectui64v(id, pname, params);
    }

    /**
     * Array version of: {@link #glVertexP2uiv VertexP2uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glVertexP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(type, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexP3uiv VertexP3uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glVertexP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(type, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexP4uiv VertexP4uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glVertex">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glVertexP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] value) {
        long __functionAddress = GL.getICD().glVertexP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(value, 1);
        }
        callPV(type, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glTexCoordP1uiv TexCoordP1uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP1uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glTexCoordP2uiv TexCoordP2uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP2uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glTexCoordP3uiv TexCoordP3uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glTexCoordP4uiv TexCoordP4uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glTexCoordP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glMultiTexCoordP1uiv MultiTexCoordP1uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP1uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP1uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glMultiTexCoordP2uiv MultiTexCoordP2uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP2uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP2uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glMultiTexCoordP3uiv MultiTexCoordP3uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP3uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glMultiTexCoordP4uiv MultiTexCoordP4uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glMultiTexCoord">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glMultiTexCoordP4uiv(@NativeType("GLenum") int texture, @NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glMultiTexCoordP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(texture, type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glNormalP3uiv NormalP3uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glNormal">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glNormalP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] coords) {
        long __functionAddress = GL.getICD().glNormalP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(coords, 1);
        }
        callPV(type, coords, __functionAddress);
    }

    /**
     * Array version of: {@link #glColorP3uiv ColorP3uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        long __functionAddress = GL.getICD().glColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(type, color, __functionAddress);
    }

    /**
     * Array version of: {@link #glColorP4uiv ColorP4uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glColorP4uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        long __functionAddress = GL.getICD().glColorP4uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(type, color, __functionAddress);
    }

    /**
     * Array version of: {@link #glSecondaryColorP3uiv SecondaryColorP3uiv}
     * 
     * @see <a href="https://docs.gl/gl3/glSecondaryColor">Reference Page</a> - <em>This function is deprecated and unavailable in the Core profile</em>
     */
    public static void glSecondaryColorP3uiv(@NativeType("GLenum") int type, @NativeType("GLuint const *") int[] color) {
        long __functionAddress = GL.getICD().glSecondaryColorP3uiv;
        if (CHECKS) {
            check(__functionAddress);
            check(color, 1);
        }
        callPV(type, color, __functionAddress);
    }

    /**
     * Array version of: {@link #glVertexAttribP1uiv VertexAttribP1uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP1uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP1uiv(index, type, normalized, value);
    }

    /**
     * Array version of: {@link #glVertexAttribP2uiv VertexAttribP2uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP2uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP2uiv(index, type, normalized, value);
    }

    /**
     * Array version of: {@link #glVertexAttribP3uiv VertexAttribP3uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP3uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP3uiv(index, type, normalized, value);
    }

    /**
     * Array version of: {@link #glVertexAttribP4uiv VertexAttribP4uiv}
     * 
     * @see <a href="https://docs.gl/gl4/glVertexAttrib">Reference Page</a>
     */
    public static void glVertexAttribP4uiv(@NativeType("GLuint") int index, @NativeType("GLenum") int type, @NativeType("GLboolean") boolean normalized, @NativeType("GLuint const *") int[] value) {
        GL33C.glVertexAttribP4uiv(index, type, normalized, value);
    }

}