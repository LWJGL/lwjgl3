/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_sparse_texture.txt">AMD_sparse_texture</a> extension.
 * 
 * <p>Recent advances in application complexity and a desire for higher resolutions have pushed texture sizes up considerably. Often, the amount of physical
 * memory available to a graphics processor is a limiting factor in the performance of texture-heavy applications. Once the available physical memory is
 * exhausted, paging may occur bringing performance down considerably - or worse, the application may fail. Nevertheless, the amount of address space
 * available to the graphics processor has increased to the point where many gigabytes - or even terabytes of address space may be usable even though that
 * amount of physical memory is not present.</p>
 * 
 * <p>This extension allows the separation of the graphics processor's address space (reservation) from the requirement that all textures must be physically
 * backed (commitment). This exposes a limited form of virtualization for textures. Use cases include sparse (or partially resident) textures, texture
 * paging, on-demand and delayed loading of texture assets and application controlled level of detail.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} or {@link ARBFragmentShader ARB_fragment_shader}.</p>
 */
public class AMDSparseTexture {

    static { GL.initialize(); }

    /** Accepted by the {@code flags} parameter to TexStorageSparseAMD and TextureStorageSparseAMD. */
    public static final int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 0x1;

    /** Accepted by the {@code pname} parameter to GetInternalformativ. */
    public static final int
        GL_VIRTUAL_PAGE_SIZE_X_AMD = 0x9195,
        GL_VIRTUAL_PAGE_SIZE_Y_AMD = 0x9196,
        GL_VIRTUAL_PAGE_SIZE_Z_AMD = 0x9197;

    /** Accepted by the {@code pname} parameter to GetIntegerv, GetFloatv, GetDoublev, GetInteger64v, and GetBooleanv. */
    public static final int
        GL_MAX_SPARSE_TEXTURE_SIZE_AMD     = 0x9198,
        GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD  = 0x9199,
        GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 0x919A;

    /** Accepted by the {@code pname} parameter of GetTexParameter{if}v. */
    public static final int GL_MIN_SPARSE_LEVEL_AMD = 0x919B;

    /** Accepted by the {@code pname} parameter of TexParameter{if}{v} and GetTexParameter{if}v. */
    public static final int GL_MIN_LOD_WARNING_AMD = 0x919C;

    protected AMDSparseTexture() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTexStorageSparseAMD ] ---

    public static native void glTexStorageSparseAMD(@NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int layers, @NativeType("GLbitfield") int flags);

    // --- [ glTextureStorageSparseAMD ] ---

    public static native void glTextureStorageSparseAMD(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLenum") int internalFormat, @NativeType("GLsizei") int width, @NativeType("GLsizei") int height, @NativeType("GLsizei") int depth, @NativeType("GLsizei") int layers, @NativeType("GLbitfield") int flags);

}