/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_multiview = "KHRMultiview".nativeClassVK("KHR_multiview", type = "device", postfix = KHR) {
    documentation =
        """
        This extension has the same goal as the OpenGL ES {@code GL_OVR_multiview} extension - it enables rendering to multiple "{@code views}" by recording a single set of commands to be executed with slightly different behavior for each view. It includes a concise way to declare a render pass with multiple views, and gives implementations freedom to render the views in the most efficient way possible.

        <h5>Promotion to Vulkan 1.1</h5>
        All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>Examples</h5>
        None.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_multiview}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>54</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.1-promotions">Vulkan 1.1</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_multiview:%20&amp;body=@jeffbolznv%20">jeffbolznv</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.1 Core</li>
                <li>Requires the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_multiview.html">{@code SPV_KHR_multiview}</a> SPIR-V extension.</li>
                <li>Requires <a target="_blank" href="https://raw.githubusercontent.com/KhronosGroup/GLSL/master/extensions/ext/GL_EXT_multiview.txt">{@code GL_EXT_multiview}</a> for GLSL source languages.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_MULTIVIEW_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_MULTIVIEW_EXTENSION_NAME".."VK_KHR_multiview"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHR".."1000053000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHR".."1000053001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHR".."1000053002"
    )

    EnumConstant(
        "Extends {@code VkDependencyFlagBits}.",

        "DEPENDENCY_VIEW_LOCAL_BIT_KHR".enum(0x00000002)
    )
}