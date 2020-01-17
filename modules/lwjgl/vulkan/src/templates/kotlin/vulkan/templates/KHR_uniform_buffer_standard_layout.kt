/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_uniform_buffer_standard_layout = "KHRUniformBufferStandardLayout".nativeClassVK("KHR_uniform_buffer_standard_layout", type = "device", postfix = KHR) {
    documentation =
        """
        <h5>Short Description</h5>
        Enables tighter array and struct packing to be used with uniform buffers.

        <h5>Description</h5>
        This extension modifies the alignment rules for uniform buffers, allowing for tighter packing of arrays and structures. This allows, for example, the std430 layout, as defined in <a target="_blank" href="https://www.khronos.org/registry/OpenGL/specs/gl/GLSLangSpec.4.60.pdf">GLSL</a> to be supported in uniform buffers.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_uniform_buffer_standard_layout}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>254</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Graeme Leese <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_uniform_buffer_standard_layout:%20&amp;body=@gnl21%20">gnl21</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2019-01-25</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Graeme Leese, Broadcom</li>
                <li>Jeff Bolz, NVIDIA</li>
                <li>Tobias Hector, AMD</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Neil Henning, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_UNIFORM_BUFFER_STANDARD_LAYOUT_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_UNIFORM_BUFFER_STANDARD_LAYOUT_EXTENSION_NAME".."VK_KHR_uniform_buffer_standard_layout"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_UNIFORM_BUFFER_STANDARD_LAYOUT_FEATURES_KHR".."1000253000"
    )
}