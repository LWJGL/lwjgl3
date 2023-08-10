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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_memory_attachment.txt">NV_memory_attachment</a> extension.
 * 
 * <p>This extension extends the memory objects introduced with {@link EXTMemoryObject EXT_memory_object} to allow existing textures and buffers to be migrated to an
 * imported memory allocation. The primary use-case of this extension is plug-in development where resource management (creation, deletion, sizing etc.)
 * is handled by inaccessible host application code.</p>
 * 
 * <p>Requires {@link EXTMemoryObject EXT_memory_object} and {@link ARBTextureStorage ARB_texture_storage} or a version of OpenGL that incorporates it.</p>
 */
public class NVMemoryAttachment {

    static { GL.initialize(); }

    /**
     * Accepted by the {@code pname} parameter of TexParameter{ifx}{v}, TexParameterI{i ui}v, TextureParameter{if}{v}, TextureParameterI{i ui}v,
     * GetTexParameter{if}v, GetTexParameterI{i ui}v, GetTextureParameter{if}v, GetTextureParameterI{i ui}v, GetBufferParameter{i|i64}v and
     * GetNamedBufferParameter{i|i64}v.
     */
    public static final int
        GL_ATTACHED_MEMORY_OBJECT_NV      = 0x95A4,
        GL_ATTACHED_MEMORY_OFFSET_NV      = 0x95A5,
        GL_MEMORY_ATTACHABLE_ALIGNMENT_NV = 0x95A6,
        GL_MEMORY_ATTACHABLE_SIZE_NV      = 0x95A7,
        GL_MEMORY_ATTACHABLE_NV           = 0x95A8;

    /**
     * Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, GetInteger64v, GetUnsignedBytevEXT,
     * GetMemoryObjectParameterivEXT, and the {@code target} parameter of GetBooleani_v, GetIntegeri_v,GetFloati_v, GetDoublei_v, GetInteger64i_v and
     * GetUnsignedBytei_vEXT.
     */
    public static final int GL_DETACHED_MEMORY_INCARNATION_NV = 0x95A9;

    /** Accepted by the {@code pname} parameter of GetMemoryObjectParameterivEXT, GetMemoryObjectDetachedResourcesuivNV and ResetMemoryObjectParameterNV. */
    public static final int
        GL_DETACHED_TEXTURES_NV = 0x95AA,
        GL_DETACHED_BUFFERS_NV  = 0x95AB;

    /** Accepted by the {@code pname} parameter of MemoryObjectParameterivEXT, GetMemoryObjectParameterivEXT. */
    public static final int
        GL_MAX_DETACHED_TEXTURES_NV = 0x95AC,
        GL_MAX_DETACHED_BUFFERS_NV  = 0x95AD;

    protected NVMemoryAttachment() {
        throw new UnsupportedOperationException();
    }

    // --- [ glGetMemoryObjectDetachedResourcesuivNV ] ---

    public static native void nglGetMemoryObjectDetachedResourcesuivNV(int memory, int pname, int first, int count, long params);

    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname, @NativeType("GLint") int first, @NativeType("GLuint *") IntBuffer params) {
        nglGetMemoryObjectDetachedResourcesuivNV(memory, pname, first, params.remaining(), memAddress(params));
    }

    // --- [ glResetMemoryObjectParameterNV ] ---

    public static native void glResetMemoryObjectParameterNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname);

    // --- [ glTexAttachMemoryNV ] ---

    public static native void glTexAttachMemoryNV(@NativeType("GLenum") int target, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glBufferAttachMemoryNV ] ---

    public static native void glBufferAttachMemoryNV(@NativeType("GLenum") int target, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glTextureAttachMemoryNV ] ---

    public static native void glTextureAttachMemoryNV(@NativeType("GLuint") int texture, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    // --- [ glNamedBufferAttachMemoryNV ] ---

    public static native void glNamedBufferAttachMemoryNV(@NativeType("GLuint") int buffer, @NativeType("GLuint") int memory, @NativeType("GLuint64") long offset);

    /** Array version of: {@link #glGetMemoryObjectDetachedResourcesuivNV GetMemoryObjectDetachedResourcesuivNV} */
    public static void glGetMemoryObjectDetachedResourcesuivNV(@NativeType("GLuint") int memory, @NativeType("GLenum") int pname, @NativeType("GLint") int first, @NativeType("GLuint *") int[] params) {
        long __functionAddress = GL.getICD().glGetMemoryObjectDetachedResourcesuivNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(memory, pname, first, params.length, params, __functionAddress);
    }

}