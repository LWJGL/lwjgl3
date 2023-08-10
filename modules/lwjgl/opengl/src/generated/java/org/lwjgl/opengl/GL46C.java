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
 * The OpenGL functionality up to version 4.6. Includes only Core Profile symbols.
 * 
 * <p>OpenGL 4.6 implementations support revision 4.60 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_indirect_parameters.txt">ARB_indirect_parameters</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_pipeline_statistics_query.txt">ARB_pipeline_statistics_query</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_polygon_offset_clamp.txt">ARB_polygon_offset_clamp</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_no_error.txt">KHR_no_error</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_atomic_counter_ops.txt">ARB_shader_atomic_counter_ops</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_draw_parameters.txt">ARB_shader_draw_parameters</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_group_vote.txt">ARB_shader_group_vote</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_gl_spirv.txt">ARB_gl_spirv</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_spirv_extensions.txt">ARB_spirv_extensions</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_filter_anisotropic.txt">ARB_texture_filter_anisotropic</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_transform_feedback_overflow_query.txt">ARB_transform_feedback_overflow_query</a></li>
 * </ul>
 */
public class GL46C extends GL45C {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
     * MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
     */
    public static final int GL_PARAMETER_BUFFER = 0x80EE;

    /** Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev. */
    public static final int GL_PARAMETER_BUFFER_BINDING = 0x80EF;

    /**
     * Accepted by the {@code target} parameter of {@link GL15C#glBeginQuery BeginQuery}, {@link GL15C#glEndQuery EndQuery}, {@link GL15C#glGetQueryiv GetQueryiv},
     * {@link GL40C#glBeginQueryIndexed BeginQueryIndexed}, {@link GL40C#glEndQueryIndexed EndQueryIndexed} and {@link GL40C#glGetQueryIndexediv GetQueryIndexediv}.
     */
    public static final int
        GL_VERTICES_SUBMITTED                 = 0x82EE,
        GL_PRIMITIVES_SUBMITTED               = 0x82EF,
        GL_VERTEX_SHADER_INVOCATIONS          = 0x82F0,
        GL_TESS_CONTROL_SHADER_PATCHES        = 0x82F1,
        GL_TESS_EVALUATION_SHADER_INVOCATIONS = 0x82F2,
        GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED = 0x82F3,
        GL_FRAGMENT_SHADER_INVOCATIONS        = 0x82F4,
        GL_COMPUTE_SHADER_INVOCATIONS         = 0x82F5,
        GL_CLIPPING_INPUT_PRIMITIVES          = 0x82F6,
        GL_CLIPPING_OUTPUT_PRIMITIVES         = 0x82F7;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev. */
    public static final int GL_POLYGON_OFFSET_CLAMP = 0x8E1B;

    /** If set in {@link GL30#GL_CONTEXT_FLAGS CONTEXT_FLAGS}, then no error behavior is enabled for this context. */
    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT = 0x8;

    /** Accepted by the {@code binaryformat} parameter of {@link GL41C#glShaderBinary ShaderBinary}. */
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V = 0x9551;

    /** Accepted by the {@code pname} parameter of {@link GL20C#glGetShaderiv GetShaderiv}. */
    public static final int GL_SPIR_V_BINARY = 0x9552;

    /** Accepted by the {@code name} parameter of {@link GL30C#glGetStringi GetStringi}. */
    public static final int GL_SPIR_V_EXTENSIONS = 0x9553;

    /** Accepted by the {@code pname} parameter of {@link GL11C#glGetIntegerv GetIntegerv}. */
    public static final int GL_NUM_SPIR_V_EXTENSIONS = 0x9554;

    /** Accepted by the {@code pname} parameters of GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameterfv, TexParameteri, and TexParameteriv. */
    public static final int GL_TEXTURE_MAX_ANISOTROPY = 0x84FE;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv. */
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 0x84FF;

    /**
     * Accepted by the {@code target} parameter of {@link GL15C#glBeginQuery BeginQuery}, {@link GL15C#glEndQuery EndQuery}, {@link GL15C#glGetQueryiv GetQueryiv},
     * {@link GL40C#glBeginQueryIndexed BeginQueryIndexed}, {@link GL40C#glEndQueryIndexed EndQueryIndexed} and {@link GL40C#glGetQueryIndexediv GetQueryIndexediv}.
     */
    public static final int
        GL_TRANSFORM_FEEDBACK_OVERFLOW        = 0x82EC,
        GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 0x82ED;

    protected GL46C() {
        throw new UnsupportedOperationException();
    }

    // --- [ glMultiDrawArraysIndirectCount ] ---

    /** Unsafe version of: {@link #glMultiDrawArraysIndirectCount MultiDrawArraysIndirectCount} */
    public static native void nglMultiDrawArraysIndirectCount(int mode, long indirect, long drawcount, int maxdrawcount, int stride);

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
     * four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect     an array of structures containing the draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (4 * 4) : stride));
        }
        nglMultiDrawArraysIndirectCount(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
     * four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect     an array of structures containing the draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawArraysIndirectCount(mode, indirect, drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawArraysIndirect MultiDrawArraysIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
     * four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param indirect     an array of structures containing the draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        nglMultiDrawArraysIndirectCount(mode, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    // --- [ glMultiDrawElementsIndirectCount ] ---

    /** Unsafe version of: {@link #glMultiDrawElementsIndirectCount MultiDrawElementsIndirectCount} */
    public static native void nglMultiDrawElementsIndirectCount(int mode, int type, long indirect, long drawcount, int maxdrawcount, int stride);

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
     * four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect     a structure containing an array of draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, maxdrawcount * (stride == 0 ? (5 * 4) : stride));
        }
        nglMultiDrawElementsIndirectCount(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
     * four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect     a structure containing an array of draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") long indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        nglMultiDrawElementsIndirectCount(mode, type, indirect, drawcount, maxdrawcount, stride);
    }

    /**
     * Behaves similarly to {@link GL43C#glMultiDrawElementsIndirect MultiDrawElementsIndirect}, except that {@code drawcount} defines an offset (in bytes) into the buffer object bound to the
     * {@link #GL_PARAMETER_BUFFER PARAMETER_BUFFER} binding point at which a single {@code sizei} typed value is stored, which contains the draw count. {@code maxdrawcount} specifies
     * the maximum number of draws that are expected to be stored in the buffer. If the value stored at {@code drawcount} into the buffer is greater than
     * {@code maxdrawcount}, the implementation stops processing draws after {@code maxdrawcount} parameter sets. {@code drawcount} must be a multiple of
     * four.
     *
     * @param mode         what kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td></tr><tr><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td><td>{@link GL11#GL_POLYGON POLYGON}</td><td>{@link GL11#GL_QUADS QUADS}</td></tr><tr><td>{@link GL11#GL_QUAD_STRIP QUAD_STRIP}</td></tr></table>
     * @param type         the type of data in the buffer bound to the GL_ELEMENT_ARRAY_BUFFER binding. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indirect     a structure containing an array of draw parameters
     * @param drawcount    the offset into the parameter buffer object
     * @param maxdrawcount the maximum number of draws
     * @param stride       the distance in basic machine units between elements of the draw parameter array
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") IntBuffer indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        if (CHECKS) {
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        nglMultiDrawElementsIndirectCount(mode, type, memAddress(indirect), drawcount, maxdrawcount, stride);
    }

    // --- [ glPolygonOffsetClamp ] ---

    /**
     * The depth values of all fragments generated by the rasterization of a polygon may be offset by a single value that is computed for that polygon. This
     * function determines this value.
     * 
     * <p>{@code factor} scales the maximum depth slope of the polygon, and {@code units} scales an implementation-dependent constant that relates to the usable
     * resolution of the depth buffer. The resulting values are summed to produce the polygon offset value, which may then be clamped to a minimum or maximum
     * value specified by {@code clamp}.</p>
     * 
     * <p>The values {@code factor}, {@code units}, and {@code clamp} may each be positive, negative, or zero. Calling the command {@link GL11C#glPolygonOffset PolygonOffset} is equivalent
     * to calling the command {@code PolygonOffsetClamp} with clamp equal to zero.</p>
     *
     * @param factor scales the maximum depth slope of the polygon
     * @param units  scales an implementation-dependent constant that relates to the usable resolution of the depth buffer
     * @param clamp  the minimum or maximum polygon offset value
     * 
     * @see <a href="https://docs.gl/gl4/glPolygonOffsetClamp">Reference Page</a>
     */
    public static native void glPolygonOffsetClamp(@NativeType("GLfloat") float factor, @NativeType("GLfloat") float units, @NativeType("GLfloat") float clamp);

    // --- [ glSpecializeShader ] ---

    /**
     * Unsafe version of: {@link #glSpecializeShader SpecializeShader}
     *
     * @param numSpecializationConstants the number of specialization constants whose values to set in this call
     */
    public static native void nglSpecializeShader(int shader, long pEntryPoint, int numSpecializationConstants, long pConstantIndex, long pConstantValue);

    /**
     * Specializes a shader created from a SPIR-V module.
     * 
     * <p>Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
     * shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
     * SPIR-V module with it, through {@link GL41C#glShaderBinary ShaderBinary}.</p>
     * 
     * <p>Specialization does two things:</p>
     * 
     * <ul>
     * <li>Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.</li>
     * <li>Sets the values of all, or a subset of, the specialization constants in the SPIRV module.</li>
     * </ul>
     * 
     * <p>On successful shader specialization, the compile status for shader is set to {@link GL11#GL_TRUE TRUE}. On failure, the compile status for shader is set to {@link GL11#GL_FALSE FALSE} and
     * additional information about the cause of the failure may be available in the shader compilation log.</p>
     *
     * @param shader         the name of a shader object containing unspecialized SPIR-V as created from a successful call to {@link GL41C#glShaderBinary ShaderBinary} to which a SPIR-V module was
     *                       passed
     * @param pEntryPoint    a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader
     * @param pConstantIndex is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
     *                       module whose value to set.
     *                       
     *                       <p>Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.</p>
     * @param pConstantValue an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
     *                       {@code pConstantIndex}.
     *                       
     *                       <p>Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
     *                       may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
     */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @Nullable @NativeType("GLuint const *") IntBuffer pConstantIndex, @Nullable @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (CHECKS) {
            checkNT1(pEntryPoint);
            checkSafe(pConstantValue, remainingSafe(pConstantIndex));
        }
        nglSpecializeShader(shader, memAddress(pEntryPoint), remainingSafe(pConstantIndex), memAddressSafe(pConstantIndex), memAddressSafe(pConstantValue));
    }

    /**
     * Specializes a shader created from a SPIR-V module.
     * 
     * <p>Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
     * shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
     * SPIR-V module with it, through {@link GL41C#glShaderBinary ShaderBinary}.</p>
     * 
     * <p>Specialization does two things:</p>
     * 
     * <ul>
     * <li>Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.</li>
     * <li>Sets the values of all, or a subset of, the specialization constants in the SPIRV module.</li>
     * </ul>
     * 
     * <p>On successful shader specialization, the compile status for shader is set to {@link GL11#GL_TRUE TRUE}. On failure, the compile status for shader is set to {@link GL11#GL_FALSE FALSE} and
     * additional information about the cause of the failure may be available in the shader compilation log.</p>
     *
     * @param shader         the name of a shader object containing unspecialized SPIR-V as created from a successful call to {@link GL41C#glShaderBinary ShaderBinary} to which a SPIR-V module was
     *                       passed
     * @param pEntryPoint    a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader
     * @param pConstantIndex is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
     *                       module whose value to set.
     *                       
     *                       <p>Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.</p>
     * @param pConstantValue an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
     *                       {@code pConstantIndex}.
     *                       
     *                       <p>Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
     *                       may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.</p>
     * 
     * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
     */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @Nullable @NativeType("GLuint const *") IntBuffer pConstantIndex, @Nullable @NativeType("GLuint const *") IntBuffer pConstantValue) {
        if (CHECKS) {
            checkSafe(pConstantValue, remainingSafe(pConstantIndex));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            nglSpecializeShader(shader, pEntryPointEncoded, remainingSafe(pConstantIndex), memAddressSafe(pConstantIndex), memAddressSafe(pConstantValue));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Array version of: {@link #glMultiDrawArraysIndirectCount MultiDrawArraysIndirectCount}
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawArraysIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawArraysIndirectCount(@NativeType("GLenum") int mode, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawArraysIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (4 * 4) : stride)) >> 2);
        }
        callPPV(mode, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

    /**
     * Array version of: {@link #glMultiDrawElementsIndirectCount MultiDrawElementsIndirectCount}
     * 
     * @see <a href="https://docs.gl/gl4/glMultiDrawElementsIndirectCount">Reference Page</a>
     */
    public static void glMultiDrawElementsIndirectCount(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") int[] indirect, @NativeType("GLintptr") long drawcount, @NativeType("GLsizei") int maxdrawcount, @NativeType("GLsizei") int stride) {
        long __functionAddress = GL.getICD().glMultiDrawElementsIndirectCount;
        if (CHECKS) {
            check(__functionAddress);
            check(indirect, (maxdrawcount * (stride == 0 ? (5 * 4) : stride)) >> 2);
        }
        callPPV(mode, type, indirect, drawcount, maxdrawcount, stride, __functionAddress);
    }

    /**
     * Array version of: {@link #glSpecializeShader SpecializeShader}
     * 
     * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
     */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") ByteBuffer pEntryPoint, @Nullable @NativeType("GLuint const *") int[] pConstantIndex, @Nullable @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShader;
        if (CHECKS) {
            check(__functionAddress);
            checkNT1(pEntryPoint);
            checkSafe(pConstantValue, lengthSafe(pConstantIndex));
        }
        callPPPV(shader, memAddress(pEntryPoint), lengthSafe(pConstantIndex), pConstantIndex, pConstantValue, __functionAddress);
    }

    /**
     * Array version of: {@link #glSpecializeShader SpecializeShader}
     * 
     * @see <a href="https://docs.gl/gl4/glSpecializeShader">Reference Page</a>
     */
    public static void glSpecializeShader(@NativeType("GLuint") int shader, @NativeType("GLchar const *") CharSequence pEntryPoint, @Nullable @NativeType("GLuint const *") int[] pConstantIndex, @Nullable @NativeType("GLuint const *") int[] pConstantValue) {
        long __functionAddress = GL.getICD().glSpecializeShader;
        if (CHECKS) {
            check(__functionAddress);
            checkSafe(pConstantValue, lengthSafe(pConstantIndex));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pEntryPoint, true);
            long pEntryPointEncoded = stack.getPointerAddress();
            callPPPV(shader, pEntryPointEncoded, lengthSafe(pConstantIndex), pConstantIndex, pConstantValue, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}