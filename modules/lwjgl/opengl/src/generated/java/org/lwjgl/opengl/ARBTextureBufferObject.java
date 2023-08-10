/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_buffer_object.txt">ARB_texture_buffer_object</a> extension.
 * 
 * <p>This extension provides a new texture type, called a buffer texture. Buffer textures are one-dimensional arrays of texels whose storage comes from an
 * attached buffer object. When a buffer object is bound to a buffer texture, a format is specified, and the data in the buffer object is treated as an
 * array of texels of the specified format.</p>
 * 
 * <p>The use of a buffer object to provide storage allows the texture data to be specified in a number of different ways: via buffer object loads
 * ({@link GL15C#glBufferData BufferData}), direct CPU writes ({@link GL15C#glMapBuffer MapBuffer}), framebuffer readbacks (EXT_pixel_buffer_object extension). A buffer object can also be loaded
 * by transform feedback (NV_transform_feedback extension), which captures selected transformed attributes of vertices processed by the GL. Several of
 * these mechanisms do not require an extra data copy, which would be required when using conventional TexImage-like entry points.</p>
 * 
 * <p>Buffer textures do not support mipmapping, texture lookups with normalized floating-point texture coordinates, and texture filtering of any sort, and
 * may not be used in fixed-function fragment processing. They can be accessed via single texel fetch operations in programmable shaders. For assembly
 * shaders (NV_gpu_program4), the TXF instruction is used. For GLSL (EXT_gpu_shader4), a new sampler type and texel fetch function are used.</p>
 * 
 * <p>While buffer textures can be substantially larger than equivalent one-dimensional textures; the maximum texture size supported for buffer textures in
 * the initial implementation of this extension is 2^27 texels, versus 2^13 (8192) texels for otherwise equivalent one-dimensional textures. When a buffer
 * object is attached to a buffer texture, a size is not specified; rather, the number of texels in the texture is taken by dividing the size of the buffer
 * object by the size of each texel.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_gpu_program4.txt">NV_gpu_program4</a> or {@link EXTGPUShader4 EXT_gpu_shader4}. Promoted to core in {@link GL31 OpenGL 3.1}.</p>
 */
public class ARBTextureBufferObject {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRangeARB, BindTexture, UnmapBuffer,
     * GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBufferARB, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and
     * GetIntegerv.
     */
    public static final int GL_TEXTURE_BUFFER_ARB = 0x8C2A;

    /** Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv. */
    public static final int
        GL_MAX_TEXTURE_BUFFER_SIZE_ARB           = 0x8C2B,
        GL_TEXTURE_BINDING_BUFFER_ARB            = 0x8C2C,
        GL_TEXTURE_BUFFER_DATA_STORE_BINDING_ARB = 0x8C2D,
        GL_TEXTURE_BUFFER_FORMAT_ARB             = 0x8C2E;

    protected ARBTextureBufferObject() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferARB ] ---

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
     * and base data type for elements. The number of texels in the texel array is then clamped to the implementation-dependent limit
     * {@link #GL_MAX_TEXTURE_BUFFER_SIZE_ARB MAX_TEXTURE_BUFFER_SIZE_ARB}. When a buffer texture is accessed in a shader, the results of a texel fetch are undefined if the specified texel number is
     * greater than or equal to the clamped number of texels in the texel array.</p>
     * 
     * <p>When a buffer texture is accessed in a shader, an integer is provided to indicate the texel number being accessed. If no buffer object is bound to the
     * buffer texture, the results of the texel access are undefined. Otherwise, the attached buffer object's data store is interpreted as an array of elements
     * of the GL data type corresponding to {@code internalformat}. Each texel consists of one to four elements that are mapped to texture components
     * (R, G, B, A, L, and I). Element {@code m} of the texel numbered {@code n} is taken from element {@code n} * {@code components} + {@code m} of the
     * attached buffer object's data store. Elements and texels are both numbered starting with zero. For texture formats with normalized components, the
     * extracted values are converted to floating-point values. The components of the texture are then converted to an (R,G,B,A) vector, and returned to the
     * shader as a four-component result vector with components of the appropriate data type for the texture's internal format.</p>
     *
     * @param target         the target of the operation. Must be:<br><table><tr><td>{@link #GL_TEXTURE_BUFFER_ARB TEXTURE_BUFFER_ARB}</td></tr></table>
     * @param internalformat the sized internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     */
    public static native void glTexBufferARB(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer);

}