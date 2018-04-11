/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHX_multiview = "KHXMultiview".nativeClassVK("KHX_multiview", type = "device", postfix = KHX) {
    documentation =
        """
        This extension has the same goal as the OpenGL ES {@code GL_OVR_multiview} extension - it enables rendering to multiple "{@code views}" by recording a single set of commands to be executed with slightly different behavior for each view. It includes a concise way to declare a render pass with multiple views, and gives implementations freedom to render the views in the most efficient way possible.

        <h5>Examples</h5>
        None.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHX_multiview}</dd>

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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jeff Bolz @jbolz</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-10-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHX_MULTIVIEW_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHX_MULTIVIEW_EXTENSION_NAME".."VK_KHX_multiview"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX".."1000053000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_FEATURES_KHX".."1000053001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES_KHX".."1000053002"
    )

    EnumConstant(
        "Extends {@code VkDependencyFlagBits}.",

        "DEPENDENCY_VIEW_LOCAL_BIT_KHX".enum(0x00000002)
    )
}