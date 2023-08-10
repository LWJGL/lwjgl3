/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_pipeline_robustness = "EXTPipelineRobustness".nativeClassVK("EXT_pipeline_robustness", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows users to request robustness on a per-pipeline stage basis.

        As <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> and other robustness features may have an adverse effect on performance, this extension is designed to allow users to request robust behavior only where it may be needed.

        <h5>VK_EXT_pipeline_robustness</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_pipeline_robustness}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>69</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jarred Davies</li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-07-12</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with {@link EXTRobustness2 VK_EXT_robustness2}</li>
                <li>Interacts with {@link EXTImageRobustness VK_EXT_image_robustness}</li>
                <li>Interacts with {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jarred Davies, Imagination Technologies</li>
                <li>Alex Walters, Imagination Technologies</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Graeme Leese, Broadcom Corporation</li>
                <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
                <li>Faith Ekstrand, Intel</li>
                <li>Lionel Landwerlin, Intel</li>
                <li>Shahbaz Youssefi, Google, Inc.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_PIPELINE_ROBUSTNESS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_PIPELINE_ROBUSTNESS_EXTENSION_NAME".."VK_EXT_pipeline_robustness"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT".."1000068000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES_EXT".."1000068001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES_EXT".."1000068002"
    )

    EnumConstant(
        """
        VkPipelineRobustnessBufferBehaviorEXT - Enum controlling the robustness of buffer accesses in a pipeline stage

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT specifies that this pipeline stage follows the behavior of robustness features that are enabled on the device that created this pipeline</li>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED_EXT specifies that buffer accesses by this pipeline stage to the relevant resource types <b>must</b> not be out of bounds</li>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT specifies that out of bounds accesses by this pipeline stage to the relevant resource types behave as if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess">{@code robustBufferAccess}</a> feature is enabled</li>
            <li>#PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT specifies that out of bounds accesses by this pipeline stage to the relevant resource types behave as if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustBufferAccess2">{@code robustBufferAccess2}</a> feature is enabled</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDevicePipelineRobustnessPropertiesEXT, ##VkPipelineRobustnessCreateInfoEXT
        """,

        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DEVICE_DEFAULT_EXT".."0",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_DISABLED_EXT".."1",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_EXT".."2",
        "PIPELINE_ROBUSTNESS_BUFFER_BEHAVIOR_ROBUST_BUFFER_ACCESS_2_EXT".."3"
    )

    EnumConstant(
        """
        VkPipelineRobustnessImageBehaviorEXT - Enum controlling the robustness of image accesses in a pipeline stage

        <h5>Description</h5>
        <ul>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT specifies that this pipeline stage follows the behavior of robustness features that are enabled on the device that created this pipeline</li>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED_EXT specifies that image accesses by this pipeline stage to the relevant resource types <b>must</b> not be out of bounds</li>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT specifies that out of bounds accesses by this pipeline stage to images behave as if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustImageAccess">{@code robustImageAccess}</a> feature is enabled</li>
            <li>#PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT specifies that out of bounds accesses by this pipeline stage to images behave as if the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\#features-robustImageAccess2">{@code robustImageAccess2}</a> feature is enabled</li>
        </ul>

        <h5>See Also</h5>
        ##VkPhysicalDevicePipelineRobustnessPropertiesEXT, ##VkPipelineRobustnessCreateInfoEXT
        """,

        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DEVICE_DEFAULT_EXT".."0",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_DISABLED_EXT".."1",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_EXT".."2",
        "PIPELINE_ROBUSTNESS_IMAGE_BEHAVIOR_ROBUST_IMAGE_ACCESS_2_EXT".."3"
    )
}