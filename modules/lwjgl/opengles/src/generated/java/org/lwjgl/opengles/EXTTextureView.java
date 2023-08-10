/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_texture_view.txt">EXT_texture_view</a> extension.
 * 
 * <p>This extension allows a texture's data store to be "viewed" in multiple ways, either reinterpreting the data format/type as a different format/ type
 * with the same element size, or by clamping the mipmap level range or array slice range.</p>
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
 * <p>This extension leverages the concept of an "immutable texture". Views can only be created of textures created with TexStorage*.</p>
 * 
 * <p>Requires {@link GLES30 GLES 3.0}.</p>
 */
public class EXTTextureView {

    static { GLES.initialize(); }

    /** Accepted by the {@code pname} parameters of GetTexParameterfv and GetTexParameteriv. */
    public static final int
        GL_TEXTURE_VIEW_MIN_LEVEL_EXT  = 0x82DB,
        GL_TEXTURE_VIEW_NUM_LEVELS_EXT = 0x82DC,
        GL_TEXTURE_VIEW_MIN_LAYER_EXT  = 0x82DD,
        GL_TEXTURE_VIEW_NUM_LAYERS_EXT = 0x82DE,
        GL_TEXTURE_IMMUTABLE_LEVELS    = 0x82DF;

    protected EXTTextureView() {
        throw new UnsupportedOperationException();
    }

    // --- [ glTextureViewEXT ] ---

    public static native void glTextureViewEXT(@NativeType("GLuint") int texture, @NativeType("GLenum") int target, @NativeType("GLuint") int origtexture, @NativeType("GLenum") int internalformat, @NativeType("GLuint") int minlevel, @NativeType("GLuint") int numlevels, @NativeType("GLuint") int minlayer, @NativeType("GLuint") int numlayers);

}