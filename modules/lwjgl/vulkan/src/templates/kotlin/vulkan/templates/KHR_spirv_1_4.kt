/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_spirv_1_4 = "KHRSpirv14".nativeClassVK("KHR_spirv_1_4", type = "device", postfix = "KHR") {
    documentation =
        """
        This extension allows the use of SPIR-V 1.4 shader modules. SPIR-V 1.4’s new features primarily make it an easier target for compilers from high-level languages, rather than exposing new hardware functionality.

        SPIR-V 1.4 incorporates features that are also available separately as extensions. SPIR-V 1.4 shader modules do not need to enable those extensions with the {@code OpExtension} opcode, since they are integral parts of SPIR-V 1.4.

        SPIR-V 1.4 introduces new floating point execution mode capabilities, also available via {@code SPV_KHR_float_controls}. Implementations are not required to support all of these new capabilities; support can be queried using ##VkPhysicalDeviceFloatControlsPropertiesKHR from the {@link KHRShaderFloatControls VK_KHR_shader_float_controls} extension.

        <h5>Promotion to Vulkan 1.2</h5>
        All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>VK_KHR_spirv_1_4</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_spirv_1_4}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>237</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
                <li>Requires {@link KHRShaderFloatControls VK_KHR_shader_float_controls}</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.2-promotions">Vulkan 1.2</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_spirv_1_4]%20@critsec%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_spirv_1_4%20extension%3E%3E">critsec</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-04-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Requires SPIR-V 1.4.</li>
                <li>Promoted to Vulkan 1.2 Core</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Alexander Galazin, Arm</li>
                <li>David Neto, Google</li>
                <li>Jesse Hall, Google</li>
                <li>John Kessenich, Google</li>
                <li>Neil Henning, AMD</li>
                <li>Tom Olson, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SPIRV_1_4_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SPIRV_1_4_EXTENSION_NAME".."VK_KHR_spirv_1_4"
    )
}