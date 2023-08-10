/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opengl;

/**
 * Native bindings to the <a href="https://www.khronos.org/registry/OpenGL/extensions/NV/NV_shader_subgroup_partitioned.txt">NV_shader_subgroup_partitioned</a> extension.
 * 
 * <p>This extension enables support for the {@code NV_shader_subgroup_partitioned} shading language extension in OpenGL.</p>
 * 
 * <p>This extension adds a new {@link #GL_SUBGROUP_FEATURE_PARTITIONED_BIT_NV SUBGROUP_FEATURE_PARTITIONED_BIT_NV} feature bit that is returned by queryies for {@link KHRShaderSubgroup#GL_SUBGROUP_SUPPORTED_FEATURES_KHR SUBGROUP_SUPPORTED_FEATURES_KHR}.</p>
 * 
 * <p>In OpenGL implementations supporting SPIR-V, this extension enables support for the {@code SPV_NV_shader_subgroup_partitioned} extension.</p>
 * 
 * <p>Requires {@link GL43 OpenGL 4.3} and {@link KHRShaderSubgroup KHR_shader_subgroup}.</p>
 */
public final class NVShaderSubgroupPartitioned {

    /** Returned as bitfield in the {@code data} argument when {@link GL11C#glGetIntegerv GetIntegerv} is queried with a {@code pname} of {@link KHRShaderSubgroup#GL_SUBGROUP_SUPPORTED_FEATURES_KHR SUBGROUP_SUPPORTED_FEATURES_KHR}. */
    public static final int GL_SUBGROUP_FEATURE_PARTITIONED_BIT_NV = 0x100;

    private NVShaderSubgroupPartitioned() {}

}