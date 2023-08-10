/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_clip_control.txt">ARB_clip_control</a> extension.
 * 
 * <p>This extension provides additional clip control modes to configure how clip space is mapped to window space.  This extension's goal is to 1) allow
 * OpenGL to effectively match Direct3D's coordinate system conventions, and 2) potentially improve the numerical precision of the Z coordinate mapping.</p>
 * 
 * <p>Promoted to core in {@link GL45 OpenGL 4.5}.</p>
 */
public class ARBClipControl {

    static { GL.initialize(); }

    /** Accepted by the {@code origin} parameter of {@link #glClipControl ClipControl}. */
    public static final int
        GL_LOWER_LEFT = 0x8CA1,
        GL_UPPER_LEFT = 0x8CA2;

    /** Accepted by the {@code depth} parameter of {@link #glClipControl ClipControl}. */
    public static final int
        GL_NEGATIVE_ONE_TO_ONE = 0x935E,
        GL_ZERO_TO_ONE         = 0x935F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_CLIP_ORIGIN     = 0x935C,
        GL_CLIP_DEPTH_MODE = 0x935D;

    protected ARBClipControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClipControl ] ---

    /**
     * Controls the clipping volume behavior.
     * 
     * <p>These parameters update the clip control origin and depth mode respectively. The initial value of the clip control origin is {@link GL20#GL_LOWER_LEFT LOWER_LEFT} and the
     * initial value of the depth mode is {@link GL45C#GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}.</p>
     * 
     * <p>The error {@link GL11#GL_INVALID_OPERATION INVALID_OPERATION} is generated if ClipControl is executed between the execution of {@link GL11#glBegin Begin} and the corresponding
     * execution of {@link GL11#glEnd End}.</p>
     *
     * @param origin the clip origin. One of:<br><table><tr><td>{@link GL20#GL_LOWER_LEFT LOWER_LEFT}</td><td>{@link GL20#GL_UPPER_LEFT UPPER_LEFT}</td></tr></table>
     * @param depth  the clip depth mode. One of:<br><table><tr><td>{@link GL45C#GL_NEGATIVE_ONE_TO_ONE NEGATIVE_ONE_TO_ONE}</td><td>{@link GL45C#GL_ZERO_TO_ONE ZERO_TO_ONE}</td></tr></table>
     */
    public static void glClipControl(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth) {
        GL45C.glClipControl(origin, depth);
    }

}