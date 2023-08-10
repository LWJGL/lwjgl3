/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

import org.lwjgl.system.*;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_clip_control.txt">EXT_clip_control</a> extension.
 * 
 * <p>This extension provides additional clip control modes to configure how clip space is mapped to window space. This extension's goal is to</p>
 * 
 * <ol>
 * <li>allow OpenGL to effectively match Direct3D's coordinate system conventions, and</li>
 * <li>potentially improve the numerical precision of the Z coordinate mapping.</li>
 * </ol>
 * 
 * <p>This extension is a port of GL_ARB_clip_control to OpenGL ES. For the complete overview of this extension, refer to the "Overview" section of
 * {@code GL_ARB_clip_control}.</p>
 */
public class EXTClipControl {

    static { GLES.initialize(); }

    /** Accepted by the {@code origin} parameter of {@link #glClipControlEXT ClipControlEXT}. */
    public static final int
        GL_LOWER_LEFT_EXT = 0x8CA1,
        GL_UPPER_LEFT_EXT = 0x8CA2;

    /** Accepted by the {@code depth} parameter of {@link #glClipControlEXT ClipControlEXT}. */
    public static final int
        GL_NEGATIVE_ONE_TO_ONE_EXT = 0x935E,
        GL_ZERO_TO_ONE_EXT         = 0x935F;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int
        GL_CLIP_ORIGIN_EXT     = 0x935C,
        GL_CLIP_DEPTH_MODE_EXT = 0x935D;

    protected EXTClipControl() {
        throw new UnsupportedOperationException();
    }

    // --- [ glClipControlEXT ] ---

    /**
     * @param origin one of:<br><table><tr><td>{@link #GL_LOWER_LEFT_EXT LOWER_LEFT_EXT}</td><td>{@link #GL_UPPER_LEFT_EXT UPPER_LEFT_EXT}</td></tr></table>
     * @param depth  one of:<br><table><tr><td>{@link #GL_NEGATIVE_ONE_TO_ONE_EXT NEGATIVE_ONE_TO_ONE_EXT}</td><td>{@link #GL_ZERO_TO_ONE_EXT ZERO_TO_ONE_EXT}</td></tr></table>
     */
    public static native void glClipControlEXT(@NativeType("GLenum") int origin, @NativeType("GLenum") int depth);

}