/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_enhanced_layouts.txt">ARB_enhanced_layouts</a> extension.
 * 
 * <p>This extension adds the following functionality to layout qualifiers, including broadening the API where this functionality is reflected. The following
 * are added:</p>
 * 
 * <ol>
 * <li>Use compile-time constant expressions.</li>
 * <li>Specify explicit byte offsets within a uniform or shader storage block.</li>
 * <li>Force alignment within a uniform or shader storage block.</li>
 * <li>Specify component numbers to more fully utilize the vec4-slot interfaces between shader outputs and shader inputs.</li>
 * <li>Specify transform/feedback buffers, locations, and widths.</li>
 * <li>Allow locations on input and output blocks for SSO interface matching.</li>
 * </ol>
 * 
 * <p>Requires {@link GL31 OpenGL 3.1} and GLSL 1.40. Promoted to core in {@link GL44 OpenGL 4.4}.</p>
 */
public final class ARBEnhancedLayouts {

    /** Accepted in the {@code props} array of {@link GL43C#glGetProgramResourceiv GetProgramResourceiv}. */
    public static final int
        GL_LOCATION_COMPONENT               = 0x934A,
        GL_TRANSFORM_FEEDBACK_BUFFER_INDEX  = 0x934B,
        GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE = 0x934C;

    private ARBEnhancedLayouts() {}

}