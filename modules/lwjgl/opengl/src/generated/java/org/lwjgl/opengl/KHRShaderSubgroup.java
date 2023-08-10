/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/KHR/KHR_shader_subgroup.txt">KHR_shader_subgroup</a> extension.
 * 
 * <p>This extension enables support for the {@code KHR_shader_subgroup} shading language extension in OpenGL.</p>
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
 * <p>In OpenGL implementations supporting SPIR-V, this extension enables the minimal subset of SPIR-V 1.3 which is required to support the subgroup features
 * that are supported by the implementation.</p>
 * 
 * <p>Requires {@link GL43 OpenGL 4.3}.</p>
 */
public final class KHRShaderSubgroup {

    /** Accepted as the {@code pname} argument for {@link GL11C#glGetIntegerv GetIntegerv} and {@link GL32C#glGetInteger64v GetInteger64v}. */
    public static final int
        GL_SUBGROUP_SIZE_KHR               = 0x9532,
        GL_SUBGROUP_SUPPORTED_STAGES_KHR   = 0x9533,
        GL_SUBGROUP_SUPPORTED_FEATURES_KHR = 0x9534;

    /** Accepted as the {@code pname} argument for {@link GL11C#glGetBooleanv GetBooleanv}. */
    public static final int GL_SUBGROUP_QUAD_ALL_STAGES_KHR = 0x9535;

    /** Returned as bitfield in the {@code data} argument when {@link GL11C#glGetIntegerv GetIntegerv} is queried with a {@code pname} of {@link #GL_SUBGROUP_SUPPORTED_FEATURES_KHR SUBGROUP_SUPPORTED_FEATURES_KHR}. */
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