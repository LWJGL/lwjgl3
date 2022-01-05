/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_ray_tracing_motion_blur = "NVRayTracingMotionBlur".nativeClassVK("NV_ray_tracing_motion_blur", type = "device", postfix = "NV") {
    documentation =
        """
        Ray tracing support in the API provides an efficient mechanism to intersect rays against static geometry, but rendering algorithms often want to support motion, which is more efficiently supported with motion-specific algorithms. This extension adds a set of mechanisms to support fast tracing of moving geometry:

        <ul>
            <li>A ray pipeline trace call which takes a time parameter</li>
            <li>Flags to enable motion support in an acceleration structure</li>
            <li>Support for time-varying vertex positions in a geometry</li>
            <li>Motion instances to move existing instances over time</li>
        </ul>

        The motion represented here is parameterized across a normalized timestep between 0.0 and 1.0. A motion trace using {@code OpTraceRayMotionNV} provides a time within that normalized range to be used when intersecting that ray with geometry. The geometry can be provided with motion by a combination of adding a second vertex position for time of 1.0 using ##VkAccelerationStructureGeometryMotionTrianglesDataNV and providing multiple transforms in the instance using ##VkAccelerationStructureMotionInstanceNV.

        <h5>VK_NV_ray_tracing_motion_blur</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_ray_tracing_motion_blur}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>328</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Eric Werness</li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-06-16</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_ray_tracing_motion_blur.html">{@code SPV_NV_ray_tracing_motion_blur}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/nv/GLSL_NV_ray_tracing_motion_blur.txt">{@code GL_NV_ray_tracing_motion_blur}</a></li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Eric Werness, NVIDIA</li>
                <li>Ashwin Lele, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_RAY_TRACING_MOTION_BLUR_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_RAY_TRACING_MOTION_BLUR_EXTENSION_NAME".."VK_NV_ray_tracing_motion_blur"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV".."1000327000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV".."1000327001",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV".."1000327002"
    )

    EnumConstant(
        "Extends {@code VkBuildAccelerationStructureFlagBitsKHR}.",

        "BUILD_ACCELERATION_STRUCTURE_MOTION_BIT_NV".enum(0x00000020)
    )

    EnumConstant(
        "Extends {@code VkAccelerationStructureCreateFlagBitsKHR}.",

        "ACCELERATION_STRUCTURE_CREATE_MOTION_BIT_NV".enum(0x00000004)
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_RAY_TRACING_ALLOW_MOTION_BIT_NV".enum(0x00100000)
    )

    EnumConstant(
        """
        VkAccelerationStructureMotionInstanceTypeNV - Enum specifying a type of acceleration structure motion instance data for building into an acceleration structure geometry

        <h5>Description</h5>
        <ul>
            <li>#ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_STATIC_NV specifies that the instance is a static instance with no instance motion.</li>
            <li>#ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_MATRIX_MOTION_NV specifies that the instance is a motion instance with motion specified by interpolation between two matrices.</li>
            <li>#ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_SRT_MOTION_NV specifies that the instance is a motion instance with motion specified by interpolation in the SRT decomposition.</li>
        </ul>

        <h5>See Also</h5>
        ##VkAccelerationStructureMotionInstanceNV
        """,

        "ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_STATIC_NV".."0",
        "ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_MATRIX_MOTION_NV".."1",
        "ACCELERATION_STRUCTURE_MOTION_INSTANCE_TYPE_SRT_MOTION_NV".."2"
    )
}