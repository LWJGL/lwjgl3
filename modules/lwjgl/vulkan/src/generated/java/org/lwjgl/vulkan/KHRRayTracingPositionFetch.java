/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@code VK_KHR_ray_tracing_position_fetch} adds the ability to fetch the vertex positions in the shader from a hit triangle as stored in the acceleration structure.
 * 
 * <p>An application adds {@link #VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_KHR BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_KHR} to the acceleration structure at build time. Then, if the hit is a triangle geometry, the shader (any-hit or closest hit for ray pipelines or using ray query) <b>can</b> fetch the three, three-component vertex positions in object space, of the triangle which was hit.</p>
 * 
 * <h5>VK_KHR_ray_tracing_position_fetch</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_ray_tracing_position_fetch}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>482</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRAccelerationStructure VK_KHR_acceleration_structure}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Eric Werness</li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_ray_tracing_position_fetch.adoc">VK_KHR_ray_tracing_position_fetch</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-02-17</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_ray_tracing_position_fetch.html">{@code SPV_KHR_ray_tracing_position_fetch}</a></li>
 * <li>This extension provides API support for <a href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_ray_tracing_position_fetch.txt">{@code GLSL_EXT_ray_tracing_position_fetch}</a></li>
 * <li>Interacts with {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</li>
 * <li>Interacts with {@link KHRRayQuery VK_KHR_ray_query}</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Stu Smith, AMD</li>
 * <li>Yuriy O’Donnell, Epic Games</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Joshua Barczak, Intel</li>
 * <li>Lionel Landwerlin, Intel</li>
 * <li>Andrew Garrard, Imagination Technologies</li>
 * <li>Alex Bourd, Qualcomm</li>
 * <li>Yunpeng Zhu, Huawei Technologies</li>
 * <li>Marius Bjorge, Arm</li>
 * <li>Daniel Koch, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRRayTracingPositionFetch {

    /** The extension specification version. */
    public static final int VK_KHR_RAY_TRACING_POSITION_FETCH_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_RAY_TRACING_POSITION_FETCH_EXTENSION_NAME = "VK_KHR_ray_tracing_position_fetch";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_POSITION_FETCH_FEATURES_KHR = 1000481000;

    /** Extends {@code VkBuildAccelerationStructureFlagBitsKHR}. */
    public static final int VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_DATA_ACCESS_KHR = 0x800;

    private KHRRayTracingPositionFetch() {}

}