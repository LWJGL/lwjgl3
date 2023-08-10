/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_storage_compression.txt">EXT_texture_storage_compression</a> extension.
 * 
 * <p>Applications may wish to take advantage of framebuffer compression. Some platforms may support framebuffer compression at fixed bitrates. Such
 * compression algorithms generally produce results that are visually lossless, but the results are typically not bit-exact when compared to a
 * non-compressed result.</p>
 * 
 * <p>This extension enables applications to opt-in to compression for immutable textures.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class EXTTextureStorageCompression {

    static { GLES.initialize(); }

    /**
     * New attributes accepted by the {@code attrib_list} argument of {@link #glTexStorageAttribs2DEXT TexStorageAttribs2DEXT} and {@link #glTexStorageAttribs3DEXT TexStorageAttribs3DEXT}, and as the {@code pname}
     * argument to {@code GetTexParameter*}.
     */
    public static final int GL_SURFACE_COMPRESSION_EXT = 0x96C0;

    /** New attributes accepted by the {@code pname} argument of {@link GLES30#glGetInternalformativ GetInternalformativ}. */
    public static final int GL_NUM_SURFACE_COMPRESSION_FIXED_RATES_EXT = 0x8F6E;

    /** Accepted as attribute values for {@link #GL_SURFACE_COMPRESSION_EXT SURFACE_COMPRESSION_EXT} by {@link #glTexStorageAttribs2DEXT TexStorageAttribs2DEXT} and {@link #glTexStorageAttribs3DEXT TexStorageAttribs3DEXT}. */
    public static final int
        GL_SURFACE_COMPRESSION_FIXED_RATE_NONE_EXT    = 0x96C1,
        GL_SURFACE_COMPRESSION_FIXED_RATE_DEFAULT_EXT = 0x96C2,
        GL_SURFACE_COMPRESSION_FIXED_RATE_1BPC_EXT    = 0x96C4,
        GL_SURFACE_COMPRESSION_FIXED_RATE_2BPC_EXT    = 0x96C5,
        GL_SURFACE_COMPRESSION_FIXED_RATE_3BPC_EXT    = 0x96C6,
        GL_SURFACE_COMPRESSION_FIXED_RATE_4BPC_EXT    = 0x96C7,
        GL_SURFACE_COMPRESSION_FIXED_RATE_5BPC_EXT    = 0x96C8,
        GL_SURFACE_COMPRESSION_FIXED_RATE_6BPC_EXT    = 0x96C9,
        GL_SURFACE_COMPRESSION_FIXED_RATE_7BPC_EXT    = 0x96CA,
        GL_SURFACE_COMPRESSION_FIXED_RATE_8BPC_EXT    = 0x96CB,
        GL_SURFACE_COMPRESSION_FIXED_RATE_9BPC_EXT    = 0x96CC,
        GL_SURFACE_COMPRESSION_FIXED_RATE_10BPC_EXT   = 0x96CD,
        GL_SURFACE_COMPRESSION_FIXED_RATE_11BPC_EXT   = 0x96CE,
        GL_SURFACE_COMPRESSION_FIXED_RATE_12BPC_EXT   = 0x96CF;

    protected EXTTextureStorageCompression() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexStorageAttribs2DEXT ] ---

    /** Unsafe version of: {@link #glTexStorageAttribs2DEXT TexStorageAttribs2DEXT} */
    public static native void nglTexStorageAttribs2DEXT(int target, int levels, int internalformat, int width, int height, long attrib_list);

    /** Behaves identically to {@link GLES30#glTexStorage2D TexStorage2D}, except that additional flags can specified in {@code attrib_list}. */
    public static void glTexStorageAttribs2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @Nullable @NativeType("GLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        nglTexStorageAttribs2DEXT(target, levels, internalformat, width, height, memAddressSafe(attrib_list));
    }

    // --- [ glTexStorageAttribs3DEXT ] ---

    /** Unsafe version of: {@link #glTexStorageAttribs3DEXT TexStorageAttribs3DEXT} */
    public static native void nglTexStorageAttribs3DEXT(int target, int levels, int internalformat, int width, int height, int depth, long attrib_list);

    /** Behaves identically to {@link GLES30#glTexStorage3D TexStorage3D}, except that additional flags can specified in {@code attrib_list}. */
    public static void glTexStorageAttribs3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @Nullable @NativeType("GLint const *") IntBuffer attrib_list) {
        if (CHECKS) {
            checkNTSafe(attrib_list);
        }
        nglTexStorageAttribs3DEXT(target, levels, internalformat, width, height, depth, memAddressSafe(attrib_list));
    }

    /** Array version of: {@link #glTexStorageAttribs2DEXT TexStorageAttribs2DEXT} */
    public static void glTexStorageAttribs2DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @Nullable @NativeType("GLint const *") int[] attrib_list) {
        long __functionAddress = GLES.getICD().glTexStorageAttribs2DEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(attrib_list);
        }
        callPV(target, levels, internalformat, width, height, attrib_list, __functionAddress);
    }

    /** Array version of: {@link #glTexStorageAttribs3DEXT TexStorageAttribs3DEXT} */
    public static void glTexStorageAttribs3DEXT(@NativeType("GLenum") int target, @NativeType("GLsizei") int levels, @NativeType("GLenum") int internalformat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @Nullable @NativeType("GLint const *") int[] attrib_list) {
        long __functionAddress = GLES.getICD().glTexStorageAttribs3DEXT;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(attrib_list);
        }
        callPV(target, levels, internalformat, width, height, depth, attrib_list, __functionAddress);
    }

}