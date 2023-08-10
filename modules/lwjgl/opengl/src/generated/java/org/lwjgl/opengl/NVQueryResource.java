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
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_query_resource.txt">NV_query_resource</a> extension.
 * 
 * <p>OpenGL implementations manage the residence of textures, shaders, and other graphical objects in GPU accessible memory (whether in on-board video
 * memory or addressable system memory is implementation dependent). With more insight into OpenGL's memory usage 1) applications could make educated
 * decisions on better utilizing the limited GPU resources, 2) users could better optimize their workflow when working with multiple tools, and 3)
 * administrators can make better decisions regarding resource allocation and system configurations.</p>
 * 
 * <p>The purpose of this extension is to return a more detailed breakdown of memory usage in terms of the OpenGL objects residing in memory (textures,
 * render buffers, buffer objects, system reserved objects, ...). This extension differs from GL_NVX_gpu_memory_info in that this extension returns
 * detailed memory usage at the object level for video memory while the other extension only reports total vidmem usage.</p>
 * 
 * <p>For the purposes of this specification the term vidmem refers to video memory resident on the graphics card that is directly accessible to the GPU at
 * the highest performance level.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0}.</p>
 */
public class NVQueryResource {

    static { GL.initialize(); }

    /** Accepted by the {@code queryType} parameter of {@link #glQueryResourceNV QueryResourceNV}. */
    public static final int GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV = 0x9540;

    /** New enums defined. */
    public static final int
        GL_QUERY_RESOURCE_MEMTYPE_VIDMEM_NV = 0x9542,
        GL_QUERY_RESOURCE_SYS_RESERVED_NV   = 0x9544,
        GL_QUERY_RESOURCE_TEXTURE_NV        = 0x9545,
        GL_QUERY_RESOURCE_RENDERBUFFER_NV   = 0x9546,
        GL_QUERY_RESOURCE_BUFFEROBJECT_NV   = 0x9547;

    protected NVQueryResource() {
        throw new UnsupportedOperationException();
    }

    // --- [ glQueryResourceNV ] ---

    /** Unsafe version of: {@link #glQueryResourceNV QueryResourceNV} */
    public static native int nglQueryResourceNV(int queryType, int pname, int bufSize, long buffer);

    /** @param queryType must be:<br><table><tr><td>{@link #GL_QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV QUERY_RESOURCE_TYPE_VIDMEM_ALLOC_NV}</td></tr></table> */
    @NativeType("GLint")
    public static int glQueryResourceNV(@NativeType("GLenum") int queryType, @NativeType("GLint") int pname, @NativeType("GLint *") IntBuffer buffer) {
        return nglQueryResourceNV(queryType, pname, buffer.remaining(), memAddress(buffer));
    }

    /** Array version of: {@link #glQueryResourceNV QueryResourceNV} */
    @NativeType("GLint")
    public static int glQueryResourceNV(@NativeType("GLenum") int queryType, @NativeType("GLint") int pname, @NativeType("GLint *") int[] buffer) {
        long __functionAddress = GL.getICD().glQueryResourceNV;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPI(queryType, pname, buffer.length, buffer, __functionAddress);
    }

}