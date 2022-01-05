/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_pipeline_library = "KHRPipelineLibrary".nativeClassVK("KHR_pipeline_library", type = "device", postfix = "KHR") {
    documentation =
        """
        A pipeline library is a special pipeline that cannot be bound, instead it defines a set of shaders and shader groups which can be linked into other pipelines. This extension defines the infrastructure for pipeline libraries, but does not specify the creation or usage of pipeline libraries. This is left to additional dependent extensions.

        <h5>VK_KHR_pipeline_library</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_pipeline_library}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>291</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Christoph Kubisch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_pipeline_library]%20@pixeljetstream%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_pipeline_library%20extension%3E%3E">pixeljetstream</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-01-08</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>See contributors to {@link KHRRayTracingPipeline VK_KHR_ray_tracing_pipeline}</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_PIPELINE_LIBRARY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_PIPELINE_LIBRARY_EXTENSION_NAME".."VK_KHR_pipeline_library"
    )

    EnumConstant(
        "Extends {@code VkPipelineCreateFlagBits}.",

        "PIPELINE_CREATE_LIBRARY_BIT_KHR".enum(0x00000800)
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PIPELINE_LIBRARY_CREATE_INFO_KHR".."1000290000"
    )
}