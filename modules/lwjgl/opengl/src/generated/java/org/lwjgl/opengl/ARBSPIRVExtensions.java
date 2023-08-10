/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_spirv_extensions.txt">ARB_spirv_extensions</a> extension.
 * 
 * <p>{@code ARB_gl_spirv} added support for using SPIR-V modules in OpenGL. However it only added support for SPIR-V 1.0 concepts that were part of the
 * OpenGL 4.5 Core Profile.</p>
 * 
 * <p>There are a great number of additional OpenGL ARB and vendor extensions which add shading language concepts and since they were defined prior to the
 * existence of SPIR-V support in OpenGL they don't add SPIR-V support for their additional features. Ideally {@code GL_ARB_gl_spirv} would have added
 * support for them, but as noted in Issue 27 of that extension, support for them was left as a future exercise.</p>
 * 
 * <p>Now that at least some of that functionality has been defined via SPIR-V extensions, there is currently no way for an OpenGL implementation to
 * advertise that is supports additional SPIR-V extensions.</p>
 * 
 * <p>This extension provides a mechanism for an implementation to advertise which SPIR-V extensions it supports, and further provides a place where the
 * SPIR-V environment for those extensions can be documented for OpenGL.</p>
 * 
 * <p>It is expected that this document can be extended over time as SPIR-V support for additional extensions is added. The mapping between GLSL and SPIR-V
 * concepts and any other pertinent information can be provided here as interactions with the corresponding OpenGL and SPIR-V extensions.</p>
 * 
 * <p>Requires {@link ARBGLSPIRV OpenGL B.G}.</p>
 */
public final class ARBSPIRVExtensions {

    /** Accepted by the {@code name} parameter of {@link GL30C#glGetStringi GetStringi}. */
    public static final int GL_SPIR_V_EXTENSIONS = 0x9553;

    /** Accepted by the {@code pname} parameter of {@link GL11C#glGetIntegerv GetIntegerv}. */
    public static final int GL_NUM_SPIR_V_EXTENSIONS = 0x9554;

    private ARBSPIRVExtensions() {}

}