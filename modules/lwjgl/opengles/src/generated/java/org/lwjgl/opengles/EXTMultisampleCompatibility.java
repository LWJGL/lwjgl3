/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/EXT/EXT_multisample_compatibility.txt">EXT_multisample_compatibility</a> extension.
 * 
 * <p>This extension allows disabling and enabling of multisampling.</p>
 * 
 * <p>OpenGL ES 2.x/3.x both support multisampling but provide no way to disable multisampling for drawables with multiple samples.</p>
 * 
 * <p>This introduces the MULTISAMPLE and SAMPLE_ALPHA_TO_ONE enables (though EXT suffixed) that operate identically to the OpenGL 4.5 core profile (as they
 * have existed in OpenGL since OpenGL 1.3 and earlier with the ARB_multisample, EXT_multisample, and SGIS_multisample extensions).</p>
 */
public final class EXTMultisampleCompatibility {

    /**
     * Accepted by the {@code cap} parameter to Enable, Disable, and IsEnabled and the {@code pname} parameter to GetBooleanv, GetIntegerv, GetFloatv, and
     * GetInteger64v.
     */
    public static final int
        GL_MULTISAMPLE_EXT         = 0x809D,
        GL_SAMPLE_ALPHA_TO_ONE_EXT = 0x809F;

    private EXTMultisampleCompatibility() {}

}