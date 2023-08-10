/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengles;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_shader_subgroup.txt">KHR_shader_subgroup</a> extension.
 * 
 * <p>This extension enables support for the {@code KHR_shader_subgroup} shading language extension in OpenGL ES.</p>
 * 
 * <p>The extension adds API queries to be able to query</p>
 * 
 * <ul>
 * <li>the size of subgroups in this implementation ({@link #GL_SUBGROUP_SIZE_KHR SUBGROUP_SIZE_KHR})</li>
 * <li>which shader stages support subgroup operations ({@link #GL_SUBGROUP_SUPPORTED_STAGES_KHR SUBGROUP_SUPPORTED_STAGES_KHR})</li>
 * <li>which subgroup features are supported ({@link #GL_SUBGROUP_SUPPORTED_FEATURES_KHR SUBGROUP_SUPPORTED_FEATURES_KHR})</li>
 * <li>whether quad subgroup operations are supported in all stages supporting subgroup operations ({@link #GL_SUBGROUP_QUAD_ALL_STAGES_KHR SUBGROUP_QUAD_ALL_STAGES_KHR})</li>
 * </ul>
 * 
 * <p>In OpenGL ES implementations, this extension does NOT add support for SPIR-V or for any of the built-in shading language functions (8.18) that have
 * {@code genDType} (double) prototypes.</p>
 * 
 * <p>Requires {@link GLES31 GLES 3.1}.</p>
 */
public final class KHRShaderSubgroup {

    /** Accepted as the {@code pname} argument for {@link GLES20#glGetIntegerv GetIntegerv} and {@link GLES30#glGetInteger64v GetInteger64v}. */
    public static final int
        GL_SUBGROUP_SIZE_KHR               = 0x9532,
        GL_SUBGROUP_SUPPORTED_STAGES_KHR   = 0x9533,
        GL_SUBGROUP_SUPPORTED_FEATURES_KHR = 0x9534;

    /** Accepted as the {@code pname} argument for {@link GLES20#glGetBooleanv GetBooleanv}. */
    public static final int GL_SUBGROUP_QUAD_ALL_STAGES_KHR = 0x9535;

    /** Returned as bitfield in the {@code data} argument when {@link GLES20#glGetIntegerv GetIntegerv} is queried with a {@code pname} of {@link #GL_SUBGROUP_SUPPORTED_FEATURES_KHR SUBGROUP_SUPPORTED_FEATURES_KHR}. */
    public static final int
        GL_SUBGROUP_FEATURE_BASIC_BIT_KHR            = 0x1,
        GL_SUBGROUP_FEATURE_VOTE_BIT_KHR             = 0x2,
        GL_SUBGROUP_FEATURE_ARITHMETIC_BIT_KHR       = 0x4,
        GL_SUBGROUP_FEATURE_BALLOT_BIT_KHR           = 0x8,
        GL_SUBGROUP_FEATURE_SHUFFLE_BIT_KHR          = 0x10,
        GL_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT_KHR = 0x20,
        GL_SUBGROUP_FEATURE_CLUSTERED_BIT_KHR        = 0x40,
        GL_SUBGROUP_FEATURE_QUAD_BIT_KHR             = 0x80;

    private KHRShaderSubgroup() {}

}