/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * The OpenGL functionality up to version 4.0. Includes only Core Profile symbols.
 * 
 * <p>OpenGL 4.0 implementations support revision 4.00 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_query_lod.txt">ARB_texture_query_lod</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_draw_buffers_blend.txt">ARB_draw_buffers_blend</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_draw_indirect.txt">ARB_draw_indirect</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_gpu_shader5.txt">ARB_gpu_shader5</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_gpu_shader_fp64.txt">ARB_gpu_shader_fp64</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_sample_shading.txt">ARB_sample_shading</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_subroutine.txt">ARB_shader_subroutine</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_tessellation_shader.txt">ARB_tessellation_shader</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_buffer_object_rgb32.txt">ARB_texture_buffer_object_rgb32</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_cube_map_array.txt">ARB_texture_cube_map_array</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_gather.txt">ARB_texture_gather</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback2.txt">ARB_transform_feedback2</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback3.txt">ARB_transform_feedback3</a></li>
 * </ul>
 */
public class GL40C extends GL33C {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
     */
    public static final int GL_DRAW_INDIRECT_BUFFER = 0x8F3F;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
    public static final int GL_DRAW_INDIRECT_BUFFER_BINDING = 0x8F43;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int GL_GEOMETRY_SHADER_INVOCATIONS = 0x887F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v. */
    public static final int
        GL_MAX_GEOMETRY_SHADER_INVOCATIONS    = 0x8E5A,
        GL_MIN_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5B,
        GL_MAX_FRAGMENT_INTERPOLATION_OFFSET  = 0x8E5C,
        GL_FRAGMENT_INTERPOLATION_OFFSET_BITS = 0x8E5D;

    /** Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying. */
    public static final int
        GL_DOUBLE_VEC2   = 0x8FFC,
        GL_DOUBLE_VEC3   = 0x8FFD,
        GL_DOUBLE_VEC4   = 0x8FFE,
        GL_DOUBLE_MAT2   = 0x8F46,
        GL_DOUBLE_MAT3   = 0x8F47,
        GL_DOUBLE_MAT4   = 0x8F48,
        GL_DOUBLE_MAT2x3 = 0x8F49,
        GL_DOUBLE_MAT2x4 = 0x8F4A,
        GL_DOUBLE_MAT3x2 = 0x8F4B,
        GL_DOUBLE_MAT3x4 = 0x8F4C,
        GL_DOUBLE_MAT4x2 = 0x8F4D,
        GL_DOUBLE_MAT4x3 = 0x8F4E;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int GL_SAMPLE_SHADING = 0x8C36;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int GL_MIN_SAMPLE_SHADING_VALUE = 0x8C37;

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

    /** Accepted by the {@code mode} parameter of Begin and all vertex array functions that implicitly call Begin. */
    public static final int GL_PATCHES = 0xE;

    /** Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
    public static final int GL_PATCH_VERTICES = 0x8E72;

    /** Accepted by the {@code pname} parameter of PatchParameterfv, GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv, and GetInteger64v. */
    public static final int
        GL_PATCH_DEFAULT_INNER_LEVEL = 0x8E73,
        GL_PATCH_DEFAULT_OUTER_LEVEL = 0x8E74;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int
        GL_TESS_CONTROL_OUTPUT_VERTICES = 0x8E75,
        GL_TESS_GEN_MODE                = 0x8E76,
        GL_TESS_GEN_SPACING             = 0x8E77,
        GL_TESS_GEN_VERTEX_ORDER        = 0x8E78,
        GL_TESS_GEN_POINT_MODE          = 0x8E79;

    /** Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE. */
    public static final int GL_ISOLINES = 0x8E7A;

    /** Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING. */
    public static final int
        GL_FRACTIONAL_ODD  = 0x8E7B,
        GL_FRACTIONAL_EVEN = 0x8E7C;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v. */
    public static final int
        GL_MAX_PATCH_VERTICES                              = 0x8E7D,
        GL_MAX_TESS_GEN_LEVEL                              = 0x8E7E,
        GL_MAX_TESS_CONTROL_UNIFORM_COMPONENTS             = 0x8E7F,
        GL_MAX_TESS_EVALUATION_UNIFORM_COMPONENTS          = 0x8E80,
        GL_MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS            = 0x8E81,
        GL_MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS         = 0x8E82,
        GL_MAX_TESS_CONTROL_OUTPUT_COMPONENTS              = 0x8E83,
        GL_MAX_TESS_PATCH_COMPONENTS                       = 0x8E84,
        GL_MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS        = 0x8E85,
        GL_MAX_TESS_EVALUATION_OUTPUT_COMPONENTS           = 0x8E86,
        GL_MAX_TESS_CONTROL_UNIFORM_BLOCKS                 = 0x8E89,
        GL_MAX_TESS_EVALUATION_UNIFORM_BLOCKS              = 0x8E8A,
        GL_MAX_TESS_CONTROL_INPUT_COMPONENTS               = 0x886C,
        GL_MAX_TESS_EVALUATION_INPUT_COMPONENTS            = 0x886D,
        GL_MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS    = 0x8E1E,
        GL_MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS = 0x8E1F;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
    public static final int
        GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER    = 0x84F0,
        GL_UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER = 0x84F1;

    /** Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv. */
    public static final int
        GL_TESS_EVALUATION_SHADER = 0x8E87,
        GL_TESS_CONTROL_SHADER    = 0x8E88;

    /** Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, BindTexture, and GenerateMipmap. */
    public static final int GL_TEXTURE_CUBE_MAP_ARRAY = 0x9009;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int GL_TEXTURE_BINDING_CUBE_MAP_ARRAY = 0x900A;

    /** Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D. */
    public static final int GL_PROXY_TEXTURE_CUBE_MAP_ARRAY = 0x900B;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_CUBE_MAP_ARRAY              = 0x900C,
        GL_SAMPLER_CUBE_MAP_ARRAY_SHADOW       = 0x900D,
        GL_INT_SAMPLER_CUBE_MAP_ARRAY          = 0x900E,
        GL_UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY = 0x900F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MIN_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5E,
        GL_MAX_PROGRAM_TEXTURE_GATHER_OFFSET = 0x8E5F;

    /** Accepted by the {@code target} parameter of BindTransformFeedback. */
    public static final int GL_TRANSFORM_FEEDBACK = 0x8E22;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 0x8E23,
        GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 0x8E24,
        GL_TRANSFORM_FEEDBACK_BINDING       = 0x8E25;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv. */
    public static final int
        GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 0x8E70,
        GL_MAX_VERTEX_STREAMS             = 0x8E71;

    protected GL40C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glBlendEquationi ] ---

    /**
     * Specifies the equation used for both the RGB blend equation and the Alpha blend equation for the specified draw buffer.
     *
     * @param buf  the index of the draw buffer for which to set the blend equation
     * @param mode how source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBlendEquationi">Reference Page</a>
     */
    public static native void glBlendEquationi(@NativeType("GLuint") int buf, @NativeType("GLenum") int mode);

    // --- [ glBlendEquationSeparatei ] ---

    /**
     * Sets the RGB blend equation and the alpha blend equation separately for the specified draw buffer.
     *
     * @param buf       the index of the draw buffer for which to set the blend equations
     * @param modeRGB   the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
     * @param modeAlpha the alpha blend equation, how the alpha component of the source and destination colors are combined. One of:<br><table><tr><td>{@link GL14#GL_FUNC_ADD FUNC_ADD}</td><td>{@link GL14#GL_FUNC_SUBTRACT FUNC_SUBTRACT}</td><td>{@link GL14#GL_FUNC_REVERSE_SUBTRACT FUNC_REVERSE_SUBTRACT}</td><td>{@link GL14#GL_MIN MIN}</td><td>{@link GL14#GL_MAX MAX}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glBlendEquationSeparatei">Reference Page</a>
     */
    public static native void glBlendEquationSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int modeRGB, @NativeType("GLenum") int modeAlpha);

    // --- [ glBlendFunci ] ---

    /**
     * Specifies pixel arithmetic for the specified draw buffer.
     *
     * @param buf     the index of the draw buffer for which to set the blend function
     * @param sfactor how the red, green, blue, and alpha source blending factors are computed
     * @param dfactor how the red, green, blue, and alpha destination blending factors are computed
     * 
     * @see <a href="https://docs.gl/gl4/glBlendFunci">Reference Page</a>
     */
    public static native void glBlendFunci(@NativeType("GLuint") int buf, @NativeType("GLenum") int sfactor, @NativeType("GLenum") int dfactor);

    // --- [ glBlendFuncSeparatei ] ---

    /**
     * Specifies pixel arithmetic for RGB and alpha components separately for the specified draw buffer.
     *
     * @param buf      the index of the draw buffer for which to set the blend functions
     * @param srcRGB   how the red, green, and blue blending factors are computed
     * @param dstRGB   how the red, green, and blue destination blending factors are computed
     * @param srcAlpha how the alpha source blending factor is computed
     * @param dstAlpha how the alpha destination blending factor is computed
     * 
     * @see <a href="https://docs.gl/gl4/glBlendFuncSeparatei">Reference Page</a>
     */
    public static native void glBlendFuncSeparatei(@NativeType("GLuint") int buf, @NativeType("GLenum") int srcRGB, @NativeType("GLenum") int dstRGB, @NativeType("GLenum") int srcAlpha, @NativeType("GLenum") int dstAlpha);

    // --- [ glDrawArraysIndirect ] ---

    /** Unsafe version of: {@link #glDrawArraysIndirect DrawArraysIndirect} */
    public static native void nglDrawArraysIndirect(int mode, long indirect);

    /**
     * Renders primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42C#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
     * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <pre><code>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint first;
     *     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
     * } DrawArraysIndirectCommand;
     * 
     * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
     * glDrawArraysInstancedBaseInstance(mode, cmd-&gt;first, cmd-&gt;count, cmd-&gt;primCount, cmd-&gt;baseInstance);</code></pre>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect a structure containing the draw parameters
     * 
     * @see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 4 * 4);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    /**
     * Renders primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42C#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
     * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <pre><code>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint first;
     *     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
     * } DrawArraysIndirectCommand;
     * 
     * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
     * glDrawArraysInstancedBaseInstance(mode, cmd-&gt;first, cmd-&gt;count, cmd-&gt;primCount, cmd-&gt;baseInstance);</code></pre>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect a structure containing the draw parameters
     * 
     * @see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect) {
        nglDrawArraysIndirect(mode, indirect);
    }

    /**
     * Renders primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawArraysIndirect} behaves similarly to {@link GL42C#glDrawArraysInstancedBaseInstance DrawArraysInstancedBaseInstance}, except that the parameters to
     * glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <pre><code>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint first;
     *     uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
     * } DrawArraysIndirectCommand;
     * 
     * const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
     * glDrawArraysInstancedBaseInstance(mode, cmd-&gt;first, cmd-&gt;count, cmd-&gt;primCount, cmd-&gt;baseInstance);</code></pre>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect a structure containing the draw parameters
     * 
     * @see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (4 * 4) >> 2);
        }
        nglDrawArraysIndirect(mode, memAddress(indirect));
    }

    // --- [ glDrawElementsIndirect ] ---

    /** Unsafe version of: {@link #glDrawElementsIndirect DrawElementsIndirect} */
    public static native void nglDrawElementsIndirect(int mode, int type, long indirect);

    /**
     * Renders indexed primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42C#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
     * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <pre><code>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint firstIndex;
     *     uint baseVertex;
     *     uint baseInstance;
     * } DrawElementsIndirectCommand;</code></pre>
     * 
     * <p>{@code glDrawElementsIndirect} is equivalent to:</p>
     * 
     * <pre><code>
     * void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
     *     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
     *     glDrawElementsInstancedBaseVertexBaseInstance(
     *         mode,
     *         cmd-&gt;count,
     *         type,
     *         cmd-&gt;firstIndex + size-of-type,
     *         cmd-&gt;primCount,
     *         cmd-&gt;baseVertex,
     *         cmd-&gt;baseInstance
     *     );
     * }</code></pre>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect the address of a structure containing the draw parameters
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect) {
        if (CHECKS) {
            check(indirect, 5 * 4);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    /**
     * Renders indexed primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42C#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
     * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <pre><code>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint firstIndex;
     *     uint baseVertex;
     *     uint baseInstance;
     * } DrawElementsIndirectCommand;</code></pre>
     * 
     * <p>{@code glDrawElementsIndirect} is equivalent to:</p>
     * 
     * <pre><code>
     * void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
     *     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
     *     glDrawElementsInstancedBaseVertexBaseInstance(
     *         mode,
     *         cmd-&gt;count,
     *         type,
     *         cmd-&gt;firstIndex + size-of-type,
     *         cmd-&gt;primCount,
     *         cmd-&gt;baseVertex,
     *         cmd-&gt;baseInstance
     *     );
     * }</code></pre>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect the address of a structure containing the draw parameters
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect) {
        nglDrawElementsIndirect(mode, type, indirect);
    }

    /**
     * Renders indexed primitives from array data, taking parameters from memory.
     * 
     * <p>{@code glDrawElementsIndirect} behaves similarly to {@link GL42C#glDrawElementsInstancedBaseVertexBaseInstance DrawElementsInstancedBaseVertexBaseInstance}, execpt that the parameters to
     * glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.</p>
     * 
     * <p>The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):</p>
     * 
     * <pre><code>
     * typedef struct {
     *     uint count;
     *     uint primCount;
     *     uint firstIndex;
     *     uint baseVertex;
     *     uint baseInstance;
     * } DrawElementsIndirectCommand;</code></pre>
     * 
     * <p>{@code glDrawElementsIndirect} is equivalent to:</p>
     * 
     * <pre><code>
     * void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
     *     const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
     *     glDrawElementsInstancedBaseVertexBaseInstance(
     *         mode,
     *         cmd-&gt;count,
     *         type,
     *         cmd-&gt;firstIndex + size-of-type,
     *         cmd-&gt;primCount,
     *         cmd-&gt;baseVertex,
     *         cmd-&gt;baseInstance
     *     );
     * }</code></pre>
     *
     * @param mode     what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type     the type of data in the buffer bound to the {@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER} binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect the address of a structure containing the draw parameters
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect) {
        if (CHECKS) {
            check(indirect, (5 * 4) >> 2);
        }
        nglDrawElementsIndirect(mode, type, memAddress(indirect));
    }

    // --- [ glUniform1d ] ---

    /**
     * Specifies the value of a double uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform1d(@NativeType("GLint") int location, @NativeType("GLdouble") double x);

    // --- [ glUniform2d ] ---

    /**
     * Specifies the value of a dvec2 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform2d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y);

    // --- [ glUniform3d ] ---

    /**
     * Specifies the value of a dvec3 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform3d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z);

    // --- [ glUniform4d ] ---

    /**
     * Specifies the value of a dvec4 uniform variable for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param x        the uniform x value
     * @param y        the uniform y value
     * @param z        the uniform z value
     * @param w        the uniform w value
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static native void glUniform4d(@NativeType("GLint") int location, @NativeType("GLdouble") double x, @NativeType("GLdouble") double y, @NativeType("GLdouble") double z, @NativeType("GLdouble") double w);

    // --- [ glUniform1dv ] ---

    /**
     * Unsafe version of: {@link #glUniform1dv Uniform1dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform1dv(int location, int count, long value);

    /**
     * Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform1dv(location, value.remaining(), memAddress(value));
    }

    // --- [ glUniform2dv ] ---

    /**
     * Unsafe version of: {@link #glUniform2dv Uniform2dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform2dv(int location, int count, long value);

    /**
     * Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform2dv(location, value.remaining() >> 1, memAddress(value));
    }

    // --- [ glUniform3dv ] ---

    /**
     * Unsafe version of: {@link #glUniform3dv Uniform3dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform3dv(int location, int count, long value);

    /**
     * Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform3dv(location, value.remaining() / 3, memAddress(value));
    }

    // --- [ glUniform4dv ] ---

    /**
     * Unsafe version of: {@link #glUniform4dv Uniform4dv}
     *
     * @param count the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array.
     */
    public static native void nglUniform4dv(int location, int count, long value);

    /**
     * Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for the current program object.
     *
     * @param location the location of the uniform variable to be modified
     * @param value    a pointer to an array of {@code count} values that will be used to update the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniform4dv(location, value.remaining() >> 2, memAddress(value));
    }

    // --- [ glUniformMatrix2dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2dv UniformMatrix2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix2dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix2dv(location, value.remaining() >> 2, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3dv UniformMatrix3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix3dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix3dv(location, value.remaining() / 9, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4dv UniformMatrix4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix4dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix4dv(location, value.remaining() >> 4, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x3dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2x3dv UniformMatrix2x3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix2x3dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix2x3dv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix2x4dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix2x4dv UniformMatrix2x4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix2x4dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix2x4dv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x2dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3x2dv UniformMatrix3x2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix3x2dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix3x2dv(location, value.remaining() / 6, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix3x4dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix3x4dv UniformMatrix3x4dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix3x4dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix3x4dv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x2dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4x2dv UniformMatrix4x2dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix4x2dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix4x2dv(location, value.remaining() >> 3, transpose, memAddress(value));
    }

    // --- [ glUniformMatrix4x3dv ] ---

    /**
     * Unsafe version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}
     *
     * @param count the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices.
     */
    public static native void nglUniformMatrix4x3dv(int location, int count, boolean transpose, long value);

    /**
     * Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.
     *
     * @param location  the location of the uniform variable to be modified
     * @param transpose whether to transpose the matrix as the values are loaded into the uniform variable
     * @param value     a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") DoubleBuffer value) {
        nglUniformMatrix4x3dv(location, value.remaining() / 12, transpose, memAddress(value));
    }

    // --- [ glGetUniformdv ] ---

    /** Unsafe version of: {@link #glGetUniformdv GetUniformdv} */
    public static native void nglGetUniformdv(int program, int location, long params);

    /**
     * Returns the double value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * @param params   the value of the specified uniform variable
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") DoubleBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformdv(program, location, memAddress(params));
    }

    /**
     * Returns the double value(s) of a uniform variable.
     *
     * @param program  the program object to be queried
     * @param location the location of the uniform variable to be queried
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    @NativeType("void")
    public static double glGetUniformd(@NativeType("GLuint") int program, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer params = stack.callocDouble(1);
            nglGetUniformdv(program, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glMinSampleShading ] ---

    /**
     * Specifies the minimum rate at which sample shading takes place.
     *
     * @param value the rate at which samples are shaded within each covered pixel
     * 
     * @see <a href="https://docs.gl/gl4/glMinSampleShading">Reference Page</a>
     */
    public static native void glMinSampleShading(@NativeType("GLfloat") float value);

    // --- [ glGetSubroutineUniformLocation ] ---

    /** Unsafe version of: {@link #glGetSubroutineUniformLocation GetSubroutineUniformLocation} */
    public static native int nglGetSubroutineUniformLocation(int program, int shadertype, long name);

    /**
     * Retrieves the location of a subroutine uniform of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine uniform whose index to query.
     * 
     * @see <a href="https://docs.gl/gl4/glGetSubroutineUniformLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetSubroutineUniformLocation(program, shadertype, memAddress(name));
    }

    /**
     * Retrieves the location of a subroutine uniform of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine uniform whose index to query.
     * 
     * @see <a href="https://docs.gl/gl4/glGetSubroutineUniformLocation">Reference Page</a>
     */
    @NativeType("GLint")
    public static int glGetSubroutineUniformLocation(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetSubroutineUniformLocation(program, shadertype, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetSubroutineIndex ] ---

    /** Unsafe version of: {@link #glGetSubroutineIndex GetSubroutineIndex} */
    public static native int nglGetSubroutineIndex(int program, int shadertype, long name);

    /**
     * Retrieves the index of a subroutine function of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine function whose index to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetSubroutineIndex">Reference Page</a>
     */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nglGetSubroutineIndex(program, shadertype, memAddress(name));
    }

    /**
     * Retrieves the index of a subroutine function of a given shader stage within a program.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for subroutine function index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param name       the name of the subroutine function whose index to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetSubroutineIndex">Reference Page</a>
     */
    @NativeType("GLuint")
    public static int glGetSubroutineIndex(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLchar const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nglGetSubroutineIndex(program, shadertype, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveSubroutineUniformiv ] ---

    /** Unsafe version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv} */
    public static native void nglGetActiveSubroutineUniformiv(int program, int shadertype, int index, int pname, long values);

    /**
     * Queries a property of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param pname      the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>
     * @param values     the address of a buffer into which the queried value or values will be placed
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniform">Reference Page</a>
     */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
    }

    /**
     * Queries a property of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param pname      the parameter of the shader subroutine uniform to query. One of:<br><table><tr><td>{@link #GL_NUM_COMPATIBLE_SUBROUTINES NUM_COMPATIBLE_SUBROUTINES}</td><td>{@link #GL_COMPATIBLE_SUBROUTINES COMPATIBLE_SUBROUTINES}</td><td>{@link GL31#GL_UNIFORM_SIZE UNIFORM_SIZE}</td><td>{@link GL31#GL_UNIFORM_NAME_LENGTH UNIFORM_NAME_LENGTH}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniform">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetActiveSubroutineUniformi(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetActiveSubroutineUniformiv(program, shadertype, index, pname, memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetActiveSubroutineUniformName ] ---

    /**
     * Unsafe version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName}
     *
     * @param bufsize the size of the buffer whose address is given in {@code name}
     */
    public static native void nglGetActiveSubroutineUniformName(int program, int shadertype, int index, int bufsize, long length, long name);

    /**
     * Queries the name of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param length     the address of a variable into which is written the number of characters copied into {@code name}
     * @param name       the address of a buffer that will receive the name of the specified shader subroutine uniform
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
     */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetActiveSubroutineUniformName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
    }

    /**
     * Queries the name of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param bufsize    the size of the buffer whose address is given in {@code name}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufsize);
            nglGetActiveSubroutineUniformName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Queries the name of an active shader subroutine uniform.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
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
    public static native void nglGetActiveSubroutineName(int program, int shadertype, int index, int bufsize, long length, long name);

    /**
     * Queries the name of an active shader subroutine.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param length     a variable which is to receive the length of the shader subroutine uniform name
     * @param name       an array into which the name of the shader subroutine uniform will be written
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>
     */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer name) {
        if (CHECKS) {
            checkSafe(length, 1);
        }
        nglGetActiveSubroutineName(program, shadertype, index, name.remaining(), memAddressSafe(length), memAddress(name));
    }

    /**
     * Queries the name of an active shader subroutine.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * @param bufsize    the size of the buffer whose address is given in {@code name}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLsizei") int bufsize) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer length = stack.ints(0);
            ByteBuffer name = stack.malloc(bufsize);
            nglGetActiveSubroutineName(program, shadertype, index, bufsize, memAddress(length), memAddress(name));
            return memASCII(name, length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Queries the name of an active shader subroutine.
     *
     * @param program    the name of the program containing the subroutine
     * @param shadertype the shader stage from which to query the subroutine name. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param index      the index of the shader subroutine uniform
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>
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
    public static native void nglUniformSubroutinesuiv(int shadertype, int count, long indices);

    /**
     * Loads active subroutine uniforms.
     *
     * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param indices    an array holding the indices to load into the shader subroutine variables
     * 
     * @see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>
     */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") IntBuffer indices) {
        nglUniformSubroutinesuiv(shadertype, indices.remaining(), memAddress(indices));
    }

    /**
     * Loads active subroutine uniforms.
     *
     * @param shadertype the shader stage to update. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>
     */
    public static void glUniformSubroutinesui(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer indices = stack.ints(index);
            nglUniformSubroutinesuiv(shadertype, 1, memAddress(indices));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetUniformSubroutineuiv ] ---

    /** Unsafe version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv} */
    public static native void nglGetUniformSubroutineuiv(int shadertype, int location, long params);

    /**
     * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
     *
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param location   the location of the subroutine uniform
     * @param params     a variable to receive the value or values of the subroutine uniform
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>
     */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
    }

    /**
     * Retrieves the value of a subroutine uniform of a given shader stage of the current program.
     *
     * @param shadertype the shader stage from which to query for subroutine uniform index. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param location   the location of the subroutine uniform
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetUniformSubroutineui(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetUniformSubroutineuiv(shadertype, location, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGetProgramStageiv ] ---

    /** Unsafe version of: {@link #glGetProgramStageiv GetProgramStageiv} */
    public static native void nglGetProgramStageiv(int program, int shadertype, int pname, long values);

    /**
     * Retrieves properties of a program object corresponding to a specified shader stage.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param pname      the parameter of the shader to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>
     * @param values     a variable into which the queried value or values will be placed
     * 
     * @see <a href="https://docs.gl/gl4/glGetProgramStage">Reference Page</a>
     */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer values) {
        if (CHECKS) {
            check(values, 1);
        }
        nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
    }

    /**
     * Retrieves properties of a program object corresponding to a specified shader stage.
     *
     * @param program    the name of the program containing shader stage
     * @param shadertype the shader stage from which to query for the subroutine parameter. One of:<br><table><tr><td>{@link GL20#GL_VERTEX_SHADER VERTEX_SHADER}</td><td>{@link GL20#GL_FRAGMENT_SHADER FRAGMENT_SHADER}</td><td>{@link GL32#GL_GEOMETRY_SHADER GEOMETRY_SHADER}</td><td>{@link #GL_TESS_CONTROL_SHADER TESS_CONTROL_SHADER}</td></tr><tr><td>{@link #GL_TESS_EVALUATION_SHADER TESS_EVALUATION_SHADER}</td></tr></table>
     * @param pname      the parameter of the shader to query. One of:<br><table><tr><td>{@link #GL_ACTIVE_SUBROUTINES ACTIVE_SUBROUTINES}</td><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORMS ACTIVE_SUBROUTINE_UNIFORMS}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS}</td><td>{@link #GL_ACTIVE_SUBROUTINE_MAX_LENGTH ACTIVE_SUBROUTINE_MAX_LENGTH}</td></tr><tr><td>{@link #GL_ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetProgramStage">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetProgramStagei(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer values = stack.callocInt(1);
            nglGetProgramStageiv(program, shadertype, pname, memAddress(values));
            return values.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glPatchParameteri ] ---

    /**
     * Specifies the integer value of the specified parameter for patch primitives.
     *
     * @param pname the name of the parameter to set. Must be:<br><table><tr><td>{@link #GL_PATCH_VERTICES PATCH_VERTICES}</td></tr></table>
     * @param value the new value for the parameter given by {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glPatchParameteri">Reference Page</a>
     */
    public static native void glPatchParameteri(@NativeType("GLenum") int pname, @NativeType("GLint") int value);

    // --- [ glPatchParameterfv ] ---

    /** Unsafe version of: {@link #glPatchParameterfv PatchParameterfv} */
    public static native void nglPatchParameterfv(int pname, long values);

    /**
     * Specifies an array of float values for the specified parameter for patch primitives.
     *
     * @param pname  the name of the parameter to set. One of:<br><table><tr><td>{@link #GL_PATCH_DEFAULT_OUTER_LEVEL PATCH_DEFAULT_OUTER_LEVEL}</td><td>{@link #GL_PATCH_DEFAULT_INNER_LEVEL PATCH_DEFAULT_INNER_LEVEL}</td></tr></table>
     * @param values an array containing the new values for the parameter given by {@code pname}
     * 
     * @see <a href="https://docs.gl/gl4/glPatchParameter">Reference Page</a>
     */
    public static void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") FloatBuffer values) {
        if (CHECKS) {
            if (DEBUG) {
                check(values, GL11.glGetInteger(GL_PATCH_VERTICES));
            }
        }
        nglPatchParameterfv(pname, memAddress(values));
    }

    // --- [ glBindTransformFeedback ] ---

    /**
     * Binds a transform feedback object.
     *
     * @param target the target to which to bind the transform feedback object {@code id}. Must be:<br><table><tr><td>{@link #GL_TRANSFORM_FEEDBACK TRANSFORM_FEEDBACK}</td></tr></table>
     * @param id     the name of a transform feedback object
     * 
     * @see <a href="https://docs.gl/gl4/glBindTransformFeedback">Reference Page</a>
     */
    public static native void glBindTransformFeedback(@NativeType("GLenum") int target, @NativeType("GLuint") int id);

    // --- [ glDeleteTransformFeedbacks ] ---

    /**
     * Unsafe version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks}
     *
     * @param n the number of transform feedback objects to delete
     */
    public static native void nglDeleteTransformFeedbacks(int n, long ids);

    /**
     * Deletes transform feedback objects.
     *
     * @param ids an array of names of transform feedback objects to delete
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteTransformFeedbacks">Reference Page</a>
     */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") IntBuffer ids) {
        nglDeleteTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /**
     * Deletes transform feedback objects.
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteTransformFeedbacks">Reference Page</a>
     */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int id) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.ints(id);
            nglDeleteTransformFeedbacks(1, memAddress(ids));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glGenTransformFeedbacks ] ---

    /**
     * Unsafe version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks}
     *
     * @param n the number of transform feedback object names to reserve
     */
    public static native void nglGenTransformFeedbacks(int n, long ids);

    /**
     * Reserves transform feedback object names.
     *
     * @param ids an array of into which the reserved names will be written
     * 
     * @see <a href="https://docs.gl/gl4/glGenTransformFeedbacks">Reference Page</a>
     */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") IntBuffer ids) {
        nglGenTransformFeedbacks(ids.remaining(), memAddress(ids));
    }

    /**
     * Reserves transform feedback object names.
     * 
     * @see <a href="https://docs.gl/gl4/glGenTransformFeedbacks">Reference Page</a>
     */
    @NativeType("void")
    public static int glGenTransformFeedbacks() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer ids = stack.callocInt(1);
            nglGenTransformFeedbacks(1, memAddress(ids));
            return ids.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glIsTransformFeedback ] ---

    /**
     * Determines if a name corresponds to a transform feedback object.
     *
     * @param id a value that may be the name of a transform feedback object
     * 
     * @see <a href="https://docs.gl/gl4/glIsTransformFeedback">Reference Page</a>
     */
    @NativeType("GLboolean")
    public static native boolean glIsTransformFeedback(@NativeType("GLuint") int id);

    // --- [ glPauseTransformFeedback ] ---

    /**
     * Pauses transform feedback operations for the currently bound transform feedback object.
     * 
     * <p>When transform feedback operations are paused, transform feedback is still considered active and changing most transform feedback state related to the
     * object results in an error. However, a new transform feedback object may be bound while transform feedback is paused. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION}
     * is generated by PauseTransformFeedback if the currently bound transform feedback is not active or is paused.</p>
     * 
     * <p>When transform feedback is active and not paused, all geometric primitives generated must be compatible with the value of {@code primitiveMode} passed
     * to {@link GL30C#glBeginTransformFeedback BeginTransformFeedback}. The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link GL11#glBegin Begin} or any operation that implicitly calls {@link GL11#glBegin Begin}
     * (such as {@link GL11C#glDrawElements DrawElements}) if {@code mode} is not one of the allowed modes. If a geometry shader is active, its output primitive type is used instead
     * of the {@code mode} parameter passed to {@link GL11#glBegin Begin} for the purposes of this error check. Any primitive type may be used while transform feedback is
     * paused.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glPauseTransformFeedback">Reference Page</a>
     */
    public static native void glPauseTransformFeedback();

    // --- [ glResumeTransformFeedback ] ---

    /**
     * Resumes transform feedback operations for the currently bound transform feedback object.
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated by {@link #glResumeTransformFeedback ResumeTransformFeedback} if the currently bound transform feedback is not active or is not paused.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glResumeTransformFeedback">Reference Page</a>
     */
    public static native void glResumeTransformFeedback();

    // --- [ glDrawTransformFeedback ] ---

    /**
     * Render primitives using a count derived from a transform feedback object.
     *
     * @param mode what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param id   the name of a transform feedback object from which to retrieve a primitive count
     * 
     * @see <a href="https://docs.gl/gl4/glDrawTransformFeedback">Reference Page</a>
     */
    public static native void glDrawTransformFeedback(@NativeType("GLenum") int mode, @NativeType("GLuint") int id);

    // --- [ glDrawTransformFeedbackStream ] ---

    /**
     * Renders primitives using a count derived from a specifed stream of a transform feedback object.
     *
     * @param mode   what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link #GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param id     the name of a transform feedback object from which to retrieve a primitive count
     * @param stream the index of the transform feedback stream from which to retrieve a primitive count
     * 
     * @see <a href="https://docs.gl/gl4/glDrawTransformFeedbackStream">Reference Page</a>
     */
    public static native void glDrawTransformFeedbackStream(@NativeType("GLenum") int mode, @NativeType("GLuint") int id, @NativeType("GLuint") int stream);

    // --- [ glBeginQueryIndexed ] ---

    /**
     * Begins a query object on an indexed target
     *
     * @param target the target type of query object established between {@code glBeginQueryIndexed} and the subsequent {@link #glEndQueryIndexed EndQueryIndexed}. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param index  the index of the query target upon which to begin the query
     * @param id     the name of a query object
     * 
     * @see <a href="https://docs.gl/gl4/glBeginQueryIndexed">Reference Page</a>
     */
    public static native void glBeginQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLuint") int id);

    // --- [ glEndQueryIndexed ] ---

    /**
     * Ends a query object on an indexed target
     *
     * @param target the target type of query object to be concluded. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param index  the index of the query target upon which to end the query
     * 
     * @see <a href="https://docs.gl/gl4/glEndQueryIndexed">Reference Page</a>
     */
    public static native void glEndQueryIndexed(@NativeType("GLenum") int target, @NativeType("GLuint") int index);

    // --- [ glGetQueryIndexediv ] ---

    /** Unsafe version of: {@link #glGetQueryIndexediv GetQueryIndexediv} */
    public static native void nglGetQueryIndexediv(int target, int index, int pname, long params);

    /**
     * Returns parameters of an indexed query object target.
     *
     * @param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param index  the index of the query object target
     * @param pname  the symbolic name of a query object target parameter
     * @param params the requested data
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>
     */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        if (CHECKS) {
            check(params, 1);
        }
        nglGetQueryIndexediv(target, index, pname, memAddress(params));
    }

    /**
     * Returns parameters of an indexed query object target.
     *
     * @param target a query object target. One of:<br><table><tr><td>{@link GL15#GL_SAMPLES_PASSED SAMPLES_PASSED}</td><td>{@link GL30#GL_PRIMITIVES_GENERATED PRIMITIVES_GENERATED}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN}</td><td>{@link GL33#GL_TIME_ELAPSED TIME_ELAPSED}</td></tr><tr><td>{@link GL33#GL_TIMESTAMP TIMESTAMP}</td><td>{@link GL33#GL_ANY_SAMPLES_PASSED ANY_SAMPLES_PASSED}</td><td>{@link GL43#GL_ANY_SAMPLES_PASSED_CONSERVATIVE ANY_SAMPLES_PASSED_CONSERVATIVE}</td></tr></table>
     * @param index  the index of the query object target
     * @param pname  the symbolic name of a query object target parameter
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetQueryIndexedi(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer params = stack.callocInt(1);
            nglGetQueryIndexediv(target, index, pname, memAddress(params));
            return params.get(0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Array version of: {@link #glDrawArraysIndirect DrawArraysIndirect}
     * 
     * @see <a href="https://docs.gl/gl4/glDrawArraysIndirect">Reference Page</a>
     */
    public static void glDrawArraysIndirect(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GL.getICD().glDrawArraysIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (4 * 4) >> 2);
        }
        callPV(mode, indirect, __functionAddress);
    }

    /**
     * Array version of: {@link #glDrawElementsIndirect DrawElementsIndirect}
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsIndirect">Reference Page</a>
     */
    public static void glDrawElementsIndirect(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect) {
        long __functionAddress = GL.getICD().glDrawElementsIndirect;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (5 * 4) >> 2);
        }
        callPV(mode, type, indirect, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform1dv Uniform1dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform1dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform1dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform2dv Uniform2dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform2dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 1, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform3dv Uniform3dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform3dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 3, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniform4dv Uniform4dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniform4dv(@NativeType("GLint") int location, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniform4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix2dv UniformMatrix2dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 2, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix3dv UniformMatrix3dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 9, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix4dv UniformMatrix4dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 4, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix2x3dv UniformMatrix2x3dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix2x4dv UniformMatrix2x4dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix2x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix2x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix3x2dv UniformMatrix3x2dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 6, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix3x4dv UniformMatrix3x4dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix3x4dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix3x4dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix4x2dv UniformMatrix4x2dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x2dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x2dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length >> 3, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformMatrix4x3dv UniformMatrix4x3dv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniform">Reference Page</a>
     */
    public static void glUniformMatrix4x3dv(@NativeType("GLint") int location, @NativeType("GLboolean") boolean transpose, @NativeType("GLdouble const *") double[] value) {
        long __functionAddress = GL.getICD().glUniformMatrix4x3dv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(location, value.length / 12, transpose, value, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetUniformdv GetUniformdv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniform">Reference Page</a>
     */
    public static void glGetUniformdv(@NativeType("GLuint") int program, @NativeType("GLint") int location, @NativeType("GLdouble *") double[] params) {
        long __functionAddress = GL.getICD().glGetUniformdv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(program, location, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetActiveSubroutineUniformiv GetActiveSubroutineUniformiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniform">Reference Page</a>
     */
    public static void glGetActiveSubroutineUniformiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineUniformiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        callPV(program, shadertype, index, pname, values, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetActiveSubroutineUniformName GetActiveSubroutineUniformName}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineUniformName">Reference Page</a>
     */
    public static void glGetActiveSubroutineUniformName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineUniformName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, shadertype, index, name.remaining(), length, memAddress(name), __functionAddress);
    }

    /**
     * Array version of: {@link #glGetActiveSubroutineName GetActiveSubroutineName}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveSubroutineName">Reference Page</a>
     */
    public static void glGetActiveSubroutineName(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLuint") int index, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer name) {
        long __functionAddress = GL.getICD().glGetActiveSubroutineName;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(length, 1);
        }
        callPPV(program, shadertype, index, name.remaining(), length, memAddress(name), __functionAddress);
    }

    /**
     * Array version of: {@link #glUniformSubroutinesuiv UniformSubroutinesuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glUniformSubroutines">Reference Page</a>
     */
    public static void glUniformSubroutinesuiv(@NativeType("GLenum") int shadertype, @NativeType("GLuint const *") int[] indices) {
        long __functionAddress = GL.getICD().glUniformSubroutinesuiv;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(shadertype, indices.length, indices, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetUniformSubroutineuiv GetUniformSubroutineuiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformSubroutine">Reference Page</a>
     */
    public static void glGetUniformSubroutineuiv(@NativeType("GLenum") int shadertype, @NativeType("GLint") int location, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetUniformSubroutineuiv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(shadertype, location, params, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetProgramStageiv GetProgramStageiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetProgramStage">Reference Page</a>
     */
    public static void glGetProgramStageiv(@NativeType("GLuint") int program, @NativeType("GLenum") int shadertype, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] values) {
        long __functionAddress = GL.getICD().glGetProgramStageiv;
        if (CHECKS) {
            check(__functionAddress);
            check(values, 1);
        }
        callPV(program, shadertype, pname, values, __functionAddress);
    }

    /**
     * Array version of: {@link #glPatchParameterfv PatchParameterfv}
     * 
     * @see <a href="https://docs.gl/gl4/glPatchParameter">Reference Page</a>
     */
    public static void glPatchParameterfv(@NativeType("GLenum") int pname, @NativeType("GLfloat const *") float[] values) {
        long __functionAddress = GL.getICD().glPatchParameterfv;
        if (CHECKS) {
            check(__functionAddress);
            if (DEBUG) {
                check(values, GL11.glGetInteger(GL_PATCH_VERTICES));
            }
        }
        callPV(pname, values, __functionAddress);
    }

    /**
     * Array version of: {@link #glDeleteTransformFeedbacks DeleteTransformFeedbacks}
     * 
     * @see <a href="https://docs.gl/gl4/glDeleteTransformFeedbacks">Reference Page</a>
     */
    public static void glDeleteTransformFeedbacks(@NativeType("GLuint const *") int[] ids) {
        long __functionAddress = GL.getICD().glDeleteTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /**
     * Array version of: {@link #glGenTransformFeedbacks GenTransformFeedbacks}
     * 
     * @see <a href="https://docs.gl/gl4/glGenTransformFeedbacks">Reference Page</a>
     */
    public static void glGenTransformFeedbacks(@NativeType("GLuint *") int[] ids) {
        long __functionAddress = GL.getICD().glGenTransformFeedbacks;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(ids.length, ids, __functionAddress);
    }

    /**
     * Array version of: {@link #glGetQueryIndexediv GetQueryIndexediv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetQueryIndexed">Reference Page</a>
     */
    public static void glGetQueryIndexediv(@NativeType("GLenum") int target, @NativeType("GLuint") int index, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        long __functionAddress = GL.getICD().glGetQueryIndexediv;
        if (CHECKS) {
            check(__functionAddress);
            check(params, 1);
        }
        callPV(target, index, pname, params, __functionAddress);
    }

}