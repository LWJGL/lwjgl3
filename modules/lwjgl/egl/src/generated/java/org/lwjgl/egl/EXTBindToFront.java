/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.egl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/EGL/extensions/EXT/EGL_EXT_bind_to_front.txt">EXT_bind_to_front</a> extension.
 * 
 * <p>This extension allows for using double buffered Pbuffers for rendering to textures, by allowing a new enumeration to be used in {@link EGL11#eglBindTexImage BindTexImage}.
 * {@link #EGL_FRONT_BUFFER_EXT FRONT_BUFFER_EXT} is used to denote reading the textures data from the front buffer of a double buffered Pbuffer.</p>
 * 
 * <p>Requires {@link EGL12 EGL 1.2}.</p>
 */
public final class EXTBindToFront {

    /** Used to denote reading the textures data from the front buffer of a double buffered Pbuffer. */
    public static final int EGL_FRONT_BUFFER_EXT = 0x3464;

    private EXTBindToFront() {}

}