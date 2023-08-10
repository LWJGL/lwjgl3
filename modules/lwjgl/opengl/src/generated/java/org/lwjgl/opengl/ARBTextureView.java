/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_texture_view.txt">ARB_texture_view</a> extension.
 * 
 * <p>This extension allows a texture's data store to be "viewed" in multiple ways, either reinterpreting the data format/type as a different format/type with
 * the same element size, or by clamping the mipmap level range or array slice range.</p>
 * 
 * <p>The goals of this extension are to avoid having these alternate views become shared mutable containers of shared mutable objects, and to add the views
 * to the API in a minimally invasive way.</p>
 * 
 * <p>No new object types are added. Conceptually, a texture object is split into the following parts:</p>
 * 
 * <ul>
 * <li>A data store holding texel data.</li>
 * <li>State describing which portions of the data store to use, and how to interpret the data elements.</li>
 * <li>An embedded sampler object.</li>
 * <li>Various other texture parameters.</li>
 * </ul>
 * 
 * <p>With this extension, multiple textures can share a data store and have different state describing which portions of the data store to use and how to
 * interpret the data elements. The data store is refcounted and not destroyed until the last texture sharing it is deleted.</p>
 * 
 * <p>This extension leverages the {@link ARBTextureStorage ARB_texture_storage} concept of an "immutable texture". Views can only be created of textures created with TexStorage.</p>
 * 
 * <p>Requires {@link GL42 OpenGL 4.2} or {@link ARBTextureStorage ARB_texture_storage}. Promoted to core in {@link GL43 OpenGL 4.3}.</p>
 */
public class ARBTextureView {

    static { GL.initialize(); }

    /** Accepted by the {@code pname} parameters of GetTexParameterfv and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_VIEW_MIN_LEVEL   = 0x82DB,
        GL_TEXTURE_VIEW_NUM_LEVELS  = 0x82DC,
        GL_TEXTURE_VIEW_MIN_LAYER   = 0x82DD,
        GL_TEXTURE_VIEW_NUM_LAYERS  = 0x82DE,
        GL_TEXTURE_IMMUTABLE_LEVELS = 0x82DF;

    protected ARBTextureView() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureView ] ---

    /**
     * Initializes a texture as a data alias of another texture's data store.
     *
     * @param texture        the texture object to be initialized as a view
     * @param target         the target to be used for the newly initialized texture
     * @param origtexture    the name of a texture object of which to make a view
     * @param internalformat the internal format for the newly created view
     * @param minlevel       the  lowest level of detail of the view
     * @param numlevels      the number of levels of detail to include in the view
     * @param minlayer       the index of the first layer to include in the view
     * @param numlayers      the number of layers to include in the view
     */
    public static void glTextureView(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers) {
        GL43C.glTextureView(texture, target, origtexture, internalformat, minlevel, numlevels, minlayer, numlayers);
    }

}