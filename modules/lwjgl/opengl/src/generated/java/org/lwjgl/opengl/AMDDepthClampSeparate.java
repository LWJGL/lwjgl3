/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/AMD/AMD_depth_clamp_separate.txt">AMD_depth_clamp_separate</a> extension.
 * 
 * <p>The extension {@link ARBDepthClamp ARB_depth_clamp} introduced the ability to control the clamping of the depth value for both the near and far plane. One limitation
 * is that the control was for both planes at the same time; some applications can benefit from having clamping enabled for only one of the two planes, in
 * order to save fillrate for the other plane by clipping the geometry.</p>
 * 
 * <p>This extension provides exactly such functionality.</p>
 */
public final class AMDDepthClampSeparate {

    /**
     * Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
     * GetDoublev.
     */
    public static final int
        GL_DEPTH_CLAMP_NEAR_AMD = 0x901E,
        GL_DEPTH_CLAMP_FAR_AMD  = 0x901F;

    private AMDDepthClampSeparate() {}

}