/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_buffer_range.txt">ARB_texture_buffer_range</a> extension.
 * 
 * <p>{@link ARBTextureBufferObject ARB_texture_buffer_object} (which was promoted to core in OpenGL 3.1) introduced the ability to attach the data store of a buffer object to a buffer
 * texture and access it from shaders. The extension only allows the entire store of the buffer object to the texture. This extension expands on this and
 * allows a sub-range of the buffer's data store to be attached to a texture. This can be used, for example, to allow multiple buffer textures to be backed
 * by independent sub-ranges of the same buffer object, or for different sub-ranges of a single buffer object to be used for different purposes.</p>
 * 
 * <p>Requires {@link GL15 OpenGL 1.5}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBTextureBufferRange {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of GetTexLevelParameter. */
    public static final int
        GL_TEXTURE_BUFFER_OFFSET = 0x919D,
        GL_TEXTURE_BUFFER_SIZE   = 0x919E;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_TEXTURE_BUFFER_OFFSET_ALIGNMENT = 0x919F;

    protected ARBTextureBufferRange() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexBufferRange ] ---

    /**
     * Binds a range of a buffer's data store to a buffer texture.
     *
     * @param target         the target of the operation. Must be:<br><table><tr><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr></table>
     * @param internalformat the internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     * @param offset         the offset of the start of the range of the buffer's data store to attach
     * @param size           the size of the range of the buffer's data store to attach
     */
    public static void glTexBufferRange(@NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size) {
        GL43C.glTexBufferRange(target, internalformat, buffer, offset, size);
    }

    // --- [ glTextureBufferRangeEXT ] ---

    /**
     * DSA version of {@link #glTexBufferRange TexBufferRange}.
     *
     * @param texture        the texture object
     * @param target         the target of the operation. Must be:<br><table><tr><td>{@link GL31#GL_TEXTURE_BUFFER TEXTURE_BUFFER}</td></tr></table>
     * @param internalformat the internal format of the data in the store belonging to {@code buffer}
     * @param buffer         the name of the buffer object whose storage to attach to the active buffer texture
     * @param offset         the offset of the start of the range of the buffer's data store to attach
     * @param size           the size of the range of the buffer's data store to attach
     */
    public static native void glTextureBufferRangeEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int buffer, @NativeType("GLintptr") long offset, @NativeType("GLsizeiptr") long size);

}