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
 * The OpenGL functionality up to version 3.1. Includes the deprecated symbols of the Compatibility Profile.
 * 
 * <p>OpenGL 3.1 implementations support revision 1.40 of the OpenGL Shading Language.</p>
 * 
 * <p>Extensions promoted to core in this release:</p>
 * 
 * <ul>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_draw_instanced.txt">ARB_draw_instanced</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_copy_buffer.txt">ARB_copy_buffer</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_primitive_restart.txt">NV_primitive_restart</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_buffer_object.txt">ARB_texture_buffer_object</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_rectangle.txt">ARB_texture_rectangle</a></li>
 * <li><a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_uniform_buffer_object.txt">ARB_uniform_buffer_object</a></li>
 * </ul>
 */
public class GL31 extends GL30 {

    static { GL.initialize(); }

    /** Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D. */
    public static final int
        GL_R8_SNORM     = 0x8F94,
        GL_RG8_SNORM    = 0x8F95,
        GL_RGB8_SNORM   = 0x8F96,
        GL_RGBA8_SNORM  = 0x8F97,
        GL_R16_SNORM    = 0x8F98,
        GL_RG16_SNORM   = 0x8F99,
        GL_RGB16_SNORM  = 0x8F9A,
        GL_RGBA16_SNORM = 0x8F9B;

    /** Returned by GetTexLevelParameter and GetFramebufferAttachmentParameter. */
    public static final int GL_SIGNED_NORMALIZED = 0x8F9C;

    /** Returned by the {@code type} parameter of GetActiveUniform. */
    public static final int
        GL_SAMPLER_BUFFER               = 0x8DC2,
        GL_INT_SAMPLER_2D_RECT          = 0x8DCD,
        GL_INT_SAMPLER_BUFFER           = 0x8DD0,
        GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5,
        GL_UNSIGNED_INT_SAMPLER_BUFFER  = 0x8DD8;

    /**
     * Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
     * FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
     */
    public static final int
        GL_COPY_READ_BUFFER  = 0x8F36,
        GL_COPY_WRITE_BUFFER = 0x8F37;

    /** Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled. */
    public static final int GL_PRIMITIVE_RESTART = 0x8F9D;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_PRIMITIVE_RESTART_INDEX = 0x8F9E;

    /**
     * Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRange, BindTexture, UnmapBuffer,
     * GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBuffer, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and
     * GetIntegerv.
     */
    public static final int GL_TEXTURE_BUFFER = 0x8C2A;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv. */
    public static final int
        GL_MAX_TEXTURE_BUFFER_SIZE           = 0x8C2B,
        GL_TEXTURE_BINDING_BUFFER            = 0x8C2C,
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 0x8C2D;

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
     * GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and
     * TexParameteriv.
     */
    public static final int GL_TEXTURE_RECTANGLE = 0x84F5;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev. */
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 0x84F6;

    /** Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D. */
    public static final int GL_PROXY_TEXTURE_RECTANGLE = 0x84F7;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv. */
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 0x84F8;

    /** Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRect. */
    public static final int GL_SAMPLER_2D_RECT = 0x8B63;

    /**
     * Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
     * sampler2DRectShadow.
     */
    public static final int GL_SAMPLER_2D_RECT_SHADOW = 0x8B64;

    /** Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv. */
    public static final int GL_UNIFORM_BUFFER = 0x8A11;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_UNIFORM_BUFFER_BINDING = 0x8A28;

    /** Accepted by the {@code pname} parameter of GetIntegeri_v. */
    public static final int
        GL_UNIFORM_BUFFER_START = 0x8A29,
        GL_UNIFORM_BUFFER_SIZE  = 0x8A2A;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_MAX_VERTEX_UNIFORM_BLOCKS                = 0x8A2B,
        GL_MAX_GEOMETRY_UNIFORM_BLOCKS              = 0x8A2C,
        GL_MAX_FRAGMENT_UNIFORM_BLOCKS              = 0x8A2D,
        GL_MAX_COMBINED_UNIFORM_BLOCKS              = 0x8A2E,
        GL_MAX_UNIFORM_BUFFER_BINDINGS              = 0x8A2F,
        GL_MAX_UNIFORM_BLOCK_SIZE                   = 0x8A30,
        GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS   = 0x8A31,
        GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 0x8A32,
        GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 0x8A33,
        GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT          = 0x8A34;

    /** Accepted by the {@code pname} parameter of GetProgramiv. */
    public static final int
        GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 0x8A35,
        GL_ACTIVE_UNIFORM_BLOCKS                = 0x8A36;

    /** Accepted by the {@code pname} parameter of GetActiveUniformsiv. */
    public static final int
        GL_UNIFORM_TYPE          = 0x8A37,
        GL_UNIFORM_SIZE          = 0x8A38,
        GL_UNIFORM_NAME_LENGTH   = 0x8A39,
        GL_UNIFORM_BLOCK_INDEX   = 0x8A3A,
        GL_UNIFORM_OFFSET        = 0x8A3B,
        GL_UNIFORM_ARRAY_STRIDE  = 0x8A3C,
        GL_UNIFORM_MATRIX_STRIDE = 0x8A3D,
        GL_UNIFORM_IS_ROW_MAJOR  = 0x8A3E;

    /** Accepted by the {@code pname} parameter of GetActiveUniformBlockiv. */
    public static final int
        GL_UNIFORM_BLOCK_BINDING                       = 0x8A3F,
        GL_UNIFORM_BLOCK_DATA_SIZE                     = 0x8A40,
        GL_UNIFORM_BLOCK_NAME_LENGTH                   = 0x8A41,
        GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS               = 0x8A42,
        GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES        = 0x8A43,
        GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER   = 0x8A44,
        GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 0x8A45,
        GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 0x8A46;

    /** Returned by GetActiveUniformsiv and GetUniformBlockIndex. */
    public static final int GL_INVALID_INDEX = 0xFFFFFFFF;

    protected GL31() {
        throw new UnsupportedOperationException();
    }

    // --- [ glDrawArraysInstanced ] ---

    /**
     * Draw multiple instances of a range of elements.
     *
     * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param first     the index of the first vertex to be rendered
     * @param count     the number of vertices to be rendered
     * @param primcount the number of instances of the specified range of vertices to be rendered
     * 
     * @see <a href="https://docs.gl/gl4/glDrawArraysInstanced">Reference Page</a>
     */
    public static void glDrawArraysInstanced(@NativeType("GLenum") int mode, @NativeType("GLint") int first, @NativeType("GLsizei") int count, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawArraysInstanced(mode, first, count, primcount);
    }

    // --- [ glDrawElementsInstanced ] ---

    /**
     * Unsafe version of: {@link #glDrawElementsInstanced DrawElementsInstanced}
     *
     * @param count the number of elements to be rendered
     * @param type  the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     */
    public static void nglDrawElementsInstanced(int mode, int count, int type, long indices, int primcount) {
        GL31C.nglDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    /**
     * Draws multiple instances of a set of elements.
     *
     * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param count     the number of elements to be rendered
     * @param type      the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices   the ByteBuffer containing the indices to be rendered
     * @param primcount the number of instances of the specified range of indices to be rendered
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>
     */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLsizei") int count, @NativeType("GLenum") int type, @NativeType("void const *") long indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, count, type, indices, primcount);
    }

    /**
     * Draws multiple instances of a set of elements.
     *
     * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param type      the type of the values in {@code indices}. One of:<br><table><tr><td>{@link GL11#GL_UNSIGNED_BYTE UNSIGNED_BYTE}</td><td>{@link GL11#GL_UNSIGNED_SHORT UNSIGNED_SHORT}</td><td>{@link GL11#GL_UNSIGNED_INT UNSIGNED_INT}</td></tr></table>
     * @param indices   the ByteBuffer containing the indices to be rendered
     * @param primcount the number of instances of the specified range of indices to be rendered
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>
     */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("GLenum") int type, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, type, indices, primcount);
    }

    /**
     * Draws multiple instances of a set of elements.
     *
     * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param indices   the ByteBuffer containing the indices to be rendered
     * @param primcount the number of instances of the specified range of indices to be rendered
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>
     */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ByteBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, indices, primcount);
    }

    /**
     * Draws multiple instances of a set of elements.
     *
     * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param indices   the ByteBuffer containing the indices to be rendered
     * @param primcount the number of instances of the specified range of indices to be rendered
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>
     */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") ShortBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, indices, primcount);
    }

    /**
     * Draws multiple instances of a set of elements.
     *
     * @param mode      the kind of primitives to render. One of:<br><table><tr><td>{@link GL11#GL_POINTS POINTS}</td><td>{@link GL11#GL_LINE_STRIP LINE_STRIP}</td><td>{@link GL11#GL_LINE_LOOP LINE_LOOP}</td><td>{@link GL11#GL_LINES LINES}</td><td>{@link GL11#GL_TRIANGLE_STRIP TRIANGLE_STRIP}</td><td>{@link GL11#GL_TRIANGLE_FAN TRIANGLE_FAN}</td></tr><tr><td>{@link GL11#GL_TRIANGLES TRIANGLES}</td><td>{@link GL32#GL_LINES_ADJACENCY LINES_ADJACENCY}</td><td>{@link GL32#GL_LINE_STRIP_ADJACENCY LINE_STRIP_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLES_ADJACENCY TRIANGLES_ADJACENCY}</td><td>{@link GL32#GL_TRIANGLE_STRIP_ADJACENCY TRIANGLE_STRIP_ADJACENCY}</td><td>{@link GL40#GL_PATCHES PATCHES}</td></tr></table>
     * @param indices   the ByteBuffer containing the indices to be rendered
     * @param primcount the number of instances of the specified range of indices to be rendered
     * 
     * @see <a href="https://docs.gl/gl4/glDrawElementsInstanced">Reference Page</a>
     */
    public static void glDrawElementsInstanced(@NativeType("GLenum") int mode, @NativeType("void const *") IntBuffer indices, @NativeType("GLsizei") int primcount) {
        GL31C.glDrawElementsInstanced(mode, indices, primcount);
    }

    // --- [ glCopyBufferSubData ] ---

    /**
     * Copies all or part of one buffer object's data store to the data store of another buffer object.
     * 
     * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object
     * bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.</p>
     * 
     * <p>An {@link GL11#GL_INVALID_VALUE INVALID_VALUE} error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size)
     * and [writeoffset, writeoffset+size) overlap.</p>
     * 
     * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if zero is bound to readtarget or writetarget.</p>
     * 
     * <p>An {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} error is generated if the buffer objects bound to either readtarget or writetarget are mapped.</p>
     *
     * @param readTarget  the source buffer object target. One of:<br><table><tr><td>{@link GL15#GL_ARRAY_BUFFER ARRAY_BUFFER}</td><td>{@link GL31C#GL_COPY_READ_BUFFER COPY_READ_BUFFER}</td><td>{@link GL31C#GL_COPY_WRITE_BUFFER COPY_WRITE_BUFFER}</td><td>{@link GL15#GL_ELEMENT_ARRAY_BUFFER ELEMENT_ARRAY_BUFFER}</td></tr><tr><td>{@link GL21#GL_PIXEL_PACK_BUFFER PIXEL_PACK_BUFFER}</td><td>{@link GL21#GL_PIXEL_UNPACK_BUFFER PIXEL_UNPACK_BUFFER}</td><td>{@link GL30#GL_TRANSFORM_FEEDBACK_BUFFER TRANSFORM_FEEDBACK_BUFFER}</td><td>{@link GL31C#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BUFFER UNIFORM_BUFFER}</td></tr></table>
     * @param writeTarget the destination buffer object target
     * @param readOffset  the source buffer object offset, in bytes
     * @param writeOffset the destination buffer object offset, in bytes
     * @param size        the number of bytes to copy
     * 
     * @see <a href="https://docs.gl/gl4/glCopyBufferSubData">Reference Page</a>
     */
    public static void glCopyBufferSubData(@NativeType("GLenum") int readTarget, @NativeType("GLenum") int writeTarget, @NativeType("GLintptr") long readOffset, @NativeType("GLintptr") long writeOffset, @NativeType("GLsizeiptr") long size) {
        GL31C.glCopyBufferSubData(readTarget, writeTarget, readOffset, writeOffset, size);
    }

    // --- [ glPrimitiveRestartIndex ] ---

    /**
     * Specifies the primitive restart index.
     *
     * @param index the value to be interpreted as the primitive restart index
     * 
     * @see <a href="https://docs.gl/gl4/glPrimitiveRestartIndex">Reference Page</a>
     */
    public static void glPrimitiveRestartIndex(@NativeType("GLuint") int index) {
        GL31C.glPrimitiveRestartIndex(index);
    }

    // --- [ glTexBuffer ] ---

    /**
     * Attaches the storage for the buffer object named {@code buffer} to the active buffer texture, and specifies an internal format for the texel array found
     * in the attached buffer object. If {@code buffer} is zero, any buffer object attached to the buffer texture is detached, and no new buffer object is
     * attached. If {@code buffer} is non-zero, but is not the name of an existing buffer object, the error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated.
     * 
     * <p>When a buffer object is attached to a buffer texture, the buffer object's data store is taken as the texture's texel array. The number of texels in the
     * buffer texture's texel array is given by</p>
     * 
     * <p>{@code floor(buffer_size / (components * sizeof(base_type))},</p>
     * 
     * <p>where {@code buffer_size} is the size of the buffer object, in basic machine units and {@code components} and {@code base_type} are the element count
     * and base data type for elements. The number of texels in the texel array is then clamped to the implementation-dependent limit {@link GL31C#GL_MAX_TEXTURE_BUFFER_SIZE MAX_TEXTURE_BUFFER_SIZE}.
     * When a buffer texture is accessed in a shader, the results of a texel fetch are undefined if the specified texel number is greater than or equal to the
     * clamped number of texels in the texel array.</p>
     * 
     * <p>When a buffer texture is accessed in a shader, an integer is provided to indicate the texel number being accessed. If no buffer object is bound to the
     * buffer texture, the results of the texel access are undefined. Otherwise, the attached buffer object's data store is interpreted as an array of elements
     * of the GL data type corresponding to {@code internalformat}. Each texel consists of one to four elements that are mapped to texture components
     * (R, G, B, A, L, and I). Element {@code m} of the texel numbered {@code n} is taken from element {@code n} * {@code components} + {@code m} of the
     * attached buffer object's data store. Elements and texels are both numbered starting with zero. For texture formats with normalized components, the
     * extracted values are converted to floating-point values. The components of the texture are then converted to an (R,G,B,A) vector, and returned to the
     * shader as a four-component result vector with components of the appropriate data type for the texture's internal format.</p>
     *
     * @param target         the target of the operation. Must be:<br><table><tr><td>{@link GL31C#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr></table>
     * @param internalformat the sized internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     * 
     * @see <a href="https://docs.gl/gl4/glTexBuffer">Reference Page</a>
     */
    public static void glTexBuffer(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer) {
        GL31C.glTexBuffer(target, internalformat, buffer);
    }

    // --- [ glGetUniformIndices ] ---

    /**
     * Unsafe version of: {@link #glGetUniformIndices GetUniformIndices}
     *
     * @param uniformCount the number of uniforms whose indices to query
     */
    public static void nglGetUniformIndices(int program, int uniformCount, long uniformNames, long uniformIndices) {
        GL31C.nglGetUniformIndices(program, uniformCount, uniformNames, uniformIndices);
    }

    /**
     * Retrieves the indices of a number of uniforms within a program object
     *
     * @param program        the name of a program containing uniforms whose indices to query
     * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
     * @param uniformIndices an array that will receive the indices of the uniforms
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>
     */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        GL31C.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    /**
     * Retrieves the indices of a number of uniforms within a program object
     *
     * @param program        the name of a program containing uniforms whose indices to query
     * @param uniformNames   an array of pointers to buffers containing the names of the queried uniforms
     * @param uniformIndices an array that will receive the indices of the uniforms
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>
     */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence[] uniformNames, @NativeType("GLuint *") IntBuffer uniformIndices) {
        GL31C.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    /**
     * Retrieves the indices of a number of uniforms within a program object
     *
     * @param program the name of a program containing uniforms whose indices to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") CharSequence uniformName) {
        return GL31C.glGetUniformIndices(program, uniformName);
    }

    // --- [ glGetActiveUniformsiv ] ---

    /**
     * Unsafe version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv}
     *
     * @param uniformCount the number of elements in the array of indices {@code uniformIndices} and the number of parameters written to {@code params} upon successful return
     */
    public static void nglGetActiveUniformsiv(int program, int uniformCount, long uniformIndices, int pname, long params) {
        GL31C.nglGetActiveUniformsiv(program, uniformCount, uniformIndices, pname, params);
    }

    /**
     * Returns information about several active uniform variables for the specified program object.
     *
     * @param program        the program object to be queried
     * @param uniformIndices an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}
     * @param pname          the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
     * @param params         an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniforms">Reference Page</a>
     */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") IntBuffer uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL31C.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    /**
     * Returns information about several active uniform variables for the specified program object.
     *
     * @param program the program object to be queried
     * @param pname   the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniforms">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetActiveUniformsi(@NativeType("GLuint") int program, @NativeType("GLuint const *") int uniformIndex, @NativeType("GLenum") int pname) {
        return GL31C.glGetActiveUniformsi(program, uniformIndex, pname);
    }

    // --- [ glGetActiveUniformName ] ---

    /**
     * Unsafe version of: {@link #glGetActiveUniformName GetActiveUniformName}
     *
     * @param bufSize the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
     */
    public static void nglGetActiveUniformName(int program, int uniformIndex, int bufSize, long length, long uniformName) {
        GL31C.nglGetActiveUniformName(program, uniformIndex, bufSize, length, uniformName);
    }

    /**
     * Queries the name of an active uniform.
     *
     * @param program      the program containing the active uniform index {@code uniformIndex}
     * @param uniformIndex the index of the active uniform whose name to query
     * @param length       the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}
     * @param uniformName  the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
     */
    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformName) {
        GL31C.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    /**
     * Queries the name of an active uniform.
     *
     * @param program      the program containing the active uniform index {@code uniformIndex}
     * @param uniformIndex the index of the active uniform whose name to query
     * @param bufSize      the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @NativeType("GLsizei") int bufSize) {
        return GL31C.glGetActiveUniformName(program, uniformIndex, bufSize);
    }

    /**
     * Queries the name of an active uniform.
     *
     * @param program      the program containing the active uniform index {@code uniformIndex}
     * @param uniformIndex the index of the active uniform whose name to query
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex) {
        return glGetActiveUniformName(program, uniformIndex, glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH));
    }

    // --- [ glGetUniformBlockIndex ] ---

    /** Unsafe version of: {@link #glGetUniformBlockIndex GetUniformBlockIndex} */
    public static int nglGetUniformBlockIndex(int program, long uniformBlockName) {
        return GL31C.nglGetUniformBlockIndex(program, uniformBlockName);
    }

    /**
     * Retrieves the index of a named uniform block.
     *
     * @param program          the name of a program containing the uniform block
     * @param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformBlockIndex">Reference Page</a>
     */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") ByteBuffer uniformBlockName) {
        return GL31C.glGetUniformBlockIndex(program, uniformBlockName);
    }

    /**
     * Retrieves the index of a named uniform block.
     *
     * @param program          the name of a program containing the uniform block
     * @param uniformBlockName an array of characters to containing the name of the uniform block whose index to retrieve
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformBlockIndex">Reference Page</a>
     */
    @NativeType("GLuint")
    public static int glGetUniformBlockIndex(@NativeType("GLuint") int program, @NativeType("GLchar const *") CharSequence uniformBlockName) {
        return GL31C.glGetUniformBlockIndex(program, uniformBlockName);
    }

    // --- [ glGetActiveUniformBlockiv ] ---

    /** Unsafe version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv} */
    public static void nglGetActiveUniformBlockiv(int program, int uniformBlockIndex, int pname, long params) {
        GL31C.nglGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    /**
     * Queries information about an active uniform block.
     *
     * @param program           the name of a program containing the uniform block
     * @param uniformBlockIndex the index of the uniform block within {@code program}
     * @param pname             the name of the parameter to query. One of:<br><table><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
     * @param params            the address of a variable to receive the result of the query
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformBlock">Reference Page</a>
     */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") IntBuffer params) {
        GL31C.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    /**
     * Queries information about an active uniform block.
     *
     * @param program           the name of a program containing the uniform block
     * @param uniformBlockIndex the index of the uniform block within {@code program}
     * @param pname             the name of the parameter to query. One of:<br><table><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_BINDING UNIFORM_BLOCK_BINDING}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_DATA_SIZE UNIFORM_BLOCK_DATA_SIZE}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_NAME_LENGTH UNIFORM_BLOCK_NAME_LENGTH}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS UNIFORM_BLOCK_ACTIVE_UNIFORMS}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER}</td></tr><tr><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER}</td><td>{@link GL31C#GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER}</td></tr></table>
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformBlock">Reference Page</a>
     */
    @NativeType("void")
    public static int glGetActiveUniformBlocki(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname) {
        return GL31C.glGetActiveUniformBlocki(program, uniformBlockIndex, pname);
    }

    // --- [ glGetActiveUniformBlockName ] ---

    /**
     * Unsafe version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName}
     *
     * @param bufSize the size of the buffer addressed by {@code uniformBlockName}
     */
    public static void nglGetActiveUniformBlockName(int program, int uniformBlockIndex, int bufSize, long length, long uniformBlockName) {
        GL31C.nglGetActiveUniformBlockName(program, uniformBlockIndex, bufSize, length, uniformBlockName);
    }

    /**
     * Retrieves the name of an active uniform block.
     *
     * @param program           the name of a program containing the uniform block
     * @param uniformBlockIndex the index of the uniform block within {@code program}
     * @param length            the address of a variable to receive the number of characters that were written to {@code uniformBlockName}
     * @param uniformBlockName  an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>
     */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @Nullable @NativeType("GLsizei *") IntBuffer length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        GL31C.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

    /**
     * Retrieves the name of an active uniform block.
     *
     * @param program           the name of a program containing the uniform block
     * @param uniformBlockIndex the index of the uniform block within {@code program}
     * @param bufSize           the size of the buffer addressed by {@code uniformBlockName}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLsizei") int bufSize) {
        return GL31C.glGetActiveUniformBlockName(program, uniformBlockIndex, bufSize);
    }

    /**
     * Retrieves the name of an active uniform block.
     *
     * @param program           the name of a program containing the uniform block
     * @param uniformBlockIndex the index of the uniform block within {@code program}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>
     */
    @NativeType("void")
    public static String glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex) {
        return glGetActiveUniformBlockName(program, uniformBlockIndex, glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH));
    }

    // --- [ glUniformBlockBinding ] ---

    /**
     * Assigns a binding point to an active uniform block.
     *
     * @param program             the name of a program object containing the active uniform block whose binding to assign
     * @param uniformBlockIndex   the index of the active uniform block within {@code program} whose binding to assign
     * @param uniformBlockBinding the binding point to which to bind the uniform block with index {@code uniformBlockIndex} within {@code program}
     * 
     * @see <a href="https://docs.gl/gl4/glUniformBlockBinding">Reference Page</a>
     */
    public static void glUniformBlockBinding(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLuint") int uniformBlockBinding) {
        GL31C.glUniformBlockBinding(program, uniformBlockIndex, uniformBlockBinding);
    }

    /**
     * Array version of: {@link #glGetUniformIndices GetUniformIndices}
     * 
     * @see <a href="https://docs.gl/gl4/glGetUniformIndices">Reference Page</a>
     */
    public static void glGetUniformIndices(@NativeType("GLuint") int program, @NativeType("GLchar const * const *") PointerBuffer uniformNames, @NativeType("GLuint *") int[] uniformIndices) {
        GL31C.glGetUniformIndices(program, uniformNames, uniformIndices);
    }

    /**
     * Array version of: {@link #glGetActiveUniformsiv GetActiveUniformsiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniforms">Reference Page</a>
     */
    public static void glGetActiveUniformsiv(@NativeType("GLuint") int program, @NativeType("GLuint const *") int[] uniformIndices, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL31C.glGetActiveUniformsiv(program, uniformIndices, pname, params);
    }

    /**
     * Array version of: {@link #glGetActiveUniformName GetActiveUniformName}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformName">Reference Page</a>
     */
    public static void glGetActiveUniformName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformIndex, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer uniformName) {
        GL31C.glGetActiveUniformName(program, uniformIndex, length, uniformName);
    }

    /**
     * Array version of: {@link #glGetActiveUniformBlockiv GetActiveUniformBlockiv}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformBlock">Reference Page</a>
     */
    public static void glGetActiveUniformBlockiv(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @NativeType("GLenum") int pname, @NativeType("GLint *") int[] params) {
        GL31C.glGetActiveUniformBlockiv(program, uniformBlockIndex, pname, params);
    }

    /**
     * Array version of: {@link #glGetActiveUniformBlockName GetActiveUniformBlockName}
     * 
     * @see <a href="https://docs.gl/gl4/glGetActiveUniformBlockName">Reference Page</a>
     */
    public static void glGetActiveUniformBlockName(@NativeType("GLuint") int program, @NativeType("GLuint") int uniformBlockIndex, @Nullable @NativeType("GLsizei *") int[] length, @NativeType("GLchar *") ByteBuffer uniformBlockName) {
        GL31C.glGetActiveUniformBlockName(program, uniformBlockIndex, length, uniformBlockName);
    }

}