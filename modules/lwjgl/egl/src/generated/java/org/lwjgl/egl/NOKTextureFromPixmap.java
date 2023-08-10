/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/NOK/EGL_NOK_texture_from_pixmap.txt">NOK_texture_from_pixmap</a> extension.
 * 
 * <p>This extension allows a color buffer to be used for both rendering and texturing.</p>
 * 
 * <p>EGL allows the use of color buffers of pbuffer drawables for texturing, this extension extends this to allow the use of color buffers of pixmaps too.
 * Other types of drawables could be supported by future extensions layered on top of this extension, though only windows are really left which are
 * problematic.</p>
 * 
 * <p>The functionality of this extension is similar to WGL_ARB_render_texture which was incorporated into EGL 1.1. However, the purpose of this extension is
 * not to provide "render to texture" like functionality but rather the ability to bind existing native drawables (for instance X pixmaps) to a texture.
 * Though, there is nothing that prohibits it from being used for "render to texture".</p>
 * 
 * <ul>
 * <li>Windows are problematic as they can change size and therefore are not supported by this extension.</li>
 * <li>Only a color buffer of a EGL pixmap created using an EGLConfig with attribute EGL_BIND_TO_TEXTURE_RGB or EGL_BIND_TO_TEXTURE_RGBA set to TRUE can
 * be bound as a texture.</li>
 * <li>The texture internal format is determined when the color buffer is associated with the texture, guaranteeing that the color buffer format is
 * equivalent to the texture internal format.</li>
 * <li>A client can create a complete set of mipmap images.</li>
 * </ul>
 * 
 * <p>Requires {@link EGL11 EGL 1.1}.</p>
 */
public final class NOKTextureFromPixmap {

    public static final int EGL_Y_INVERTED_NOK = 0x307F;

    private NOKTextureFromPixmap() {}

}