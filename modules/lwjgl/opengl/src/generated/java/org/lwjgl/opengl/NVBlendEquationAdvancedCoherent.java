/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_blend_equation_advanced.txt">NV_blend_equation_advanced_coherent</a> extension.
 * 
 * <p>Similar to NV_blend_equation_advanced, but guarantees that blending is done coherently and in API primitive ordering. An enable is provided to allow
 * implementations to opt out of fully coherent blending and instead behave as though only NV_blend_equation_advanced were supported.</p>
 * 
 * <p>Requires {@link GL20 OpenGL 2.0} and {@link NVBlendEquationAdvanced NV_blend_equation_advanced}.</p>
 */
public final class NVBlendEquationAdvancedCoherent {

    /**
     * Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetIntegerv, GetBooleanv, GetFloatv, GetDoublev
     * and GetInteger64v.
     */
    public static final int GL_BLEND_ADVANCED_COHERENT_NV = 0x9285;

    private NVBlendEquationAdvancedCoherent() {}

}