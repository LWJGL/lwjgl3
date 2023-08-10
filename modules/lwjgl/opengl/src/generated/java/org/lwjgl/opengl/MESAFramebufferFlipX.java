/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/MESA/MESA_framebuffer_flip_x.txt">MESA_framebuffer_flip_x</a> extension.
 * 
 * <p>This extension defines a new framebuffer parameter, {@link #GL_FRAMEBUFFER_FLIP_X_MESA FRAMEBUFFER_FLIP_X_MESA}, that changes the behavior of the reads and writes to the framebuffer
 * attachment points. When {@code GL_FRAMEBUFFER_FLIP_X_MESA} is {@link GL11#GL_TRUE TRUE}, render commands and pixel transfer operations access the backing store of each
 * attachment point with an x-inverted coordinate system. This x-inversion is relative to the coordinate system set when
 * {@code GL_FRAMEBUFFER_FLIP_X_MESA} is {@link GL11#GL_FALSE FALSE}.</p>
 * 
 * <p>Access through {@link GL11C#glTexSubImage2D TexSubImage2D} and similar calls will notice the effect of the flip when they are not attached to framebuffer objects because
 * {@code GL_FRAMEBUFFER_FLIP_X_MESA} is associated with the framebuffer object and not the attachment points.</p>
 * 
 * <p>This extension is mainly for pre-rotation and recommended to use it with {@code MESA_framebuffer_flip_y} and {@code MESA_framebuffer_swap_xy} to have
 * rotated result.</p>
 * 
 * <p>Requires {@link GL43 OpenGL 4.3}.</p>
 */
public final class MESAFramebufferFlipX {

    /** Accepted by the {@code pname} argument of {@link GL43C#glFramebufferParameteri FramebufferParameteri} and {@link GL43C#glGetFramebufferParameteriv GetFramebufferParameteriv}. */
    public static final int GL_FRAMEBUFFER_FLIP_X_MESA = 0x8BBC;

    private MESAFramebufferFlipX() {}

}