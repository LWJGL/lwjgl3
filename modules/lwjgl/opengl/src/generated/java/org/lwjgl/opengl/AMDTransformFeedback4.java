/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_transform_feedback4.txt">AMD_transform_feedback4</a> extension.
 * 
 * <p>This extension enhances transform feedback in two significant ways. First, it allows multiple transform feedback streams to be captured, each with its
 * own, independent primitve type. Second, it allows any combination of streams to be rasterized.</p>
 * 
 * <p>Requires {@link GL40 OpenGL 4.0} or {@link ARBTransformFeedback3 ARB_transform_feedback3}.</p>
 */
public final class AMDTransformFeedback4 {

    /** Accepted by the {@code pname} argument to Enablei. Disablei and IsEnabledi. */
    public static final int GL_STREAM_RASTERIZATION_AMD = 0x91A0;

    private AMDTransformFeedback4() {}

}