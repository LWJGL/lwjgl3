/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_depth_clip_control = "EXTDepthClipControl".nativeClassVK("EXT_depth_clip_control", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows the application to use the OpenGL depth range in NDC, i.e. with depth in range <code>[-1, 1]</code>, as opposed to Vulkan’s default of <code>[0, 1]</code>. The purpose of this extension is to allow efficient layering of OpenGL over Vulkan, by avoiding emulation in the pre-rasterization shader stages. This emulation, which effectively duplicates gl_Position but with a different depth value, costs ALU and consumes shader output components that the implementation may not have to spare to meet OpenGL minimum requirements.

        <h5>VK_EXT_depth_clip_control</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_depth_clip_control}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>356</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_depth_clip_control]%20@syoussefi%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_depth_clip_control%20extension%3E%3E">syoussefi</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-11-09</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Spencer Fricke, Samsung Electronics</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Ralph Potter, Samsung Electronics</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DEPTH_CLIP_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DEPTH_CLIP_CONTROL_EXTENSION_NAME".."VK_EXT_depth_clip_control"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_CONTROL_FEATURES_EXT".."1000355000",
        "STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLIP_CONTROL_CREATE_INFO_EXT".."1000355001"
    )
}