/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_fragment_shader.txt">ARB_fragment_shader</a> extension.
 * 
 * <p>This extension adds functionality to define fragment shader objects. A fragment shader object is a shader object (see the ARB_shader_objects extension)
 * that, when attached to a program object, can be compiled and linked to produce an executable that runs on the fragment processor in OpenGL. The fragment
 * processor is a programmable unit that replaces the OpenGL 1.4 fixed-function texturing, color sum and fog stages. This extension also defines how such
 * an executable interacts with the fixed functionality fragment processing of OpenGL 1.4. The language is defined in the OpenGL Shading Language
 * specification as the Fragment Shading Language.</p>
 * 
 * <p>Promoted to core in {@link GL20 OpenGL 2.0}.</p>
 */
public final class ARBFragmentShader {

    /** Accepted by the {@code shaderType} argument of CreateShaderObjectARB and returned by the {@code params} parameter of GetObjectParameter{fi}vARB. */
    public static final int GL_FRAGMENT_SHADER_ARB = 0x8B30;

    /** Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS_ARB = 0x8B49;

    /** Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev. */
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT_ARB = 0x8B8B;

    private ARBFragmentShader() {}

}