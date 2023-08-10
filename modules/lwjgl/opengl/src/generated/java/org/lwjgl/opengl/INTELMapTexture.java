/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/INTEL/INTEL_map_texture.txt">INTEL_map_texture</a> extension.
 * 
 * <p>Systems with integrated GPUs can share the same physical memory between CPU and GPU. This feature, if exposed by API, can bring significant performance
 * benefits for graphics applications by reducing the complexity of uploading/accessing texture contents. This extension enables CPU direct access to the
 * GPU memory holding textures.</p>
 * 
 * <p>The problem with texture memory directly exposed to clients is that textures are often 'tiled'. Texels are kept in specific layout to improve locality
 * of reference and thus performance of texturing. This 'tiling' is specific to particular hardware and would be thus difficult to use.</p>
 * 
 * <p>This extension allows to create textures with 'linear' layout which allows for simplified access on user side (potentially sacrificing some performance
 * during texture sampling).</p>
 * 
 * <p>Requires {@link GL30 OpenGL 3.0}.</p>
 */
public class INTELMapTexture {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameter of TexParameteri, for target TEXTURE_2D. */
    public static final int GL_TEXTURE_MEMORY_LAYOUT_INTEL = 0x83FF;

    /** Accepted by the {@code params} when {@code pname} is set to {@code TEXTURE_MEMORY_LAYOUT_INTEL}. */
    public static final int
        GL_LAYOUT_DEFAULT_INTEL           = 0,
        GL_LAYOUT_LINEAR_INTEL            = 1,
        GL_LAYOUT_LINEAR_CPU_CACHED_INTEL = 2;

    protected INTELMapTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glSyncTextureINTEL ] ---

    /**
     * Makes sure that changes made by CPU are visible to GPU by flushing texture cache in GPU. The GL implementation tracks the cache usage and ignores the
     * command if such flush is not needed.
     * 
     * <p>It is worth noting that this extension does not address automatic synchronization between CPU and GPU when both entities operate on the same texture at
     * the same time. This is up to the application to assure such synchronization. Otherwise, the results may not be deterministic (writes from different
     * entities may interleave in a non-deterministic way).</p>
     *
     * @param texture the texture to synchronize
     */
    public static native void glSyncTextureINTEL(@NativeType("GLuint") int texture);

    // --- [ glUnmapTexture2DINTEL ] ---

    /**
     * Releases the pointer obtained previously via {@link #glMapTexture2DINTEL MapTexture2DINTEL}. This means that virtual memory space dedicated to make the texture available via a
     * pointer is released and an application can no longer assume this memory is accessible from CPU. Successful execution of this command has an additional
     * effect as if {@link #glSyncTextureINTEL SyncTextureINTEL} was called with {@code texture} parameter.
     *
     * @param texture the texture to unmap
     * @param level   the mipmap level-of-detail of the texture
     */
    public static native void glUnmapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level);

    // --- [ glMapTexture2DINTEL ] ---

    /** Unsafe version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
    public static native long nglMapTexture2DINTEL(int texture, int level, int access, long stride, long layout);

    /**
     * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
     * 
     * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
     * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
     *
     * @param texture the texture to map
     * @param level   the mipmap level-of-detail of the texture
     * @param access  the type of access that will be performed by the application. One of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td></tr></table>
     * @param stride  returns the distance in bytes between subsequent rows in the texture
     * @param layout  returns the internal layout of the texture in the graphics memory
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout) {
        if (CHECKS) {
            check(stride, 1);
            check(layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
        return memByteBufferSafe(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT));
    }

    /**
     * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
     * 
     * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
     * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
     *
     * @param texture the texture to map
     * @param level   the mipmap level-of-detail of the texture
     * @param access  the type of access that will be performed by the application. One of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td></tr></table>
     * @param stride  returns the distance in bytes between subsequent rows in the texture
     * @param layout  returns the internal layout of the texture in the graphics memory
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            check(stride, 1);
            check(layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
        int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /**
     * Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.
     * 
     * <p><b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
     * current context, the texture object must currently be bound to the GL_TEXTURE_2D target.</p>
     *
     * @param texture the texture to map
     * @param level   the mipmap level-of-detail of the texture
     * @param access  the type of access that will be performed by the application. One of:<br><table><tr><td>{@link GL30#GL_MAP_READ_BIT MAP_READ_BIT}</td><td>{@link GL30#GL_MAP_WRITE_BIT MAP_WRITE_BIT}</td></tr></table>
     * @param stride  returns the distance in bytes between subsequent rows in the texture
     * @param layout  returns the internal layout of the texture in the graphics memory
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") IntBuffer stride, @NativeType("GLenum *") IntBuffer layout, long length, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            check(stride, 1);
            check(layout, 1);
        }
        long __result = nglMapTexture2DINTEL(texture, level, access, memAddress(stride), memAddress(layout));
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    /** Array version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(stride, 1);
            check(layout, 1);
        }
        long __result = callPPP(texture, level, access, stride, layout, __functionAddress);
        return memByteBufferSafe(__result, getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT));
    }

    /** Array version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout, @Nullable ByteBuffer old_buffer) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(stride, 1);
            check(layout, 1);
        }
        long __result = callPPP(texture, level, access, stride, layout, __functionAddress);
        int length = getStride(stride) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /** Array version of: {@link #glMapTexture2DINTEL MapTexture2DINTEL} */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer glMapTexture2DINTEL(@NativeType("GLuint") int texture, @NativeType("GLint") int level, @NativeType("GLbitfield") int access, @NativeType("GLint *") int[] stride, @NativeType("GLenum *") int[] layout, long length, @Nullable ByteBuffer old_buffer) {
        long __functionAddress = GL.getICD().glMapTexture2DINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(stride, 1);
            check(layout, 1);
        }
        long __result = callPPP(texture, level, access, stride, layout, __functionAddress);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    private static int getStride(IntBuffer stride) {
        return stride.get(stride.position());
    }

    private static int getStride(int[] stride) {
        return stride[0];
    }

}