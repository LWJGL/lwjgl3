/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_surface_protected_capabilities = "KHRSurfaceProtectedCapabilities".nativeClassVK("KHR_surface_protected_capabilities", type = "instance", postfix = "KHR") {
    documentation =
        """
        This extension extends ##VkSurfaceCapabilities2KHR, providing applications a way to query whether swapchains <b>can</b> be created with the #SWAPCHAIN_CREATE_PROTECTED_BIT_KHR flag set.

        Vulkan 1.1 added (optional) support for protect memory and protected resources including buffers (#BUFFER_CREATE_PROTECTED_BIT), images (#IMAGE_CREATE_PROTECTED_BIT), and swapchains (#SWAPCHAIN_CREATE_PROTECTED_BIT_KHR). However, on implementations which support multiple windowing systems, not all window systems <b>may</b> be able to provide a protected display path.

        This extension provides a way to query if a protected swapchain created for a surface (and thus a specific windowing system) <b>can</b> be displayed on screen. It extends the existing ##VkSurfaceCapabilities2KHR structure with a new ##VkSurfaceProtectedCapabilitiesKHR structure from which the application <b>can</b> obtain information about support for protected swapchain creation through #GetPhysicalDeviceSurfaceCapabilities2KHR().

        <h5>VK_KHR_surface_protected_capabilities</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_surface_protected_capabilities}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>240</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.1</li>
                <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Sandeep Shinde <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_surface_protected_capabilities]%20@sashinde%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_surface_protected_capabilities%20extension%3E%3E">sashinde</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-12-18</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Sandeep Shinde, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>Daniel Koch, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SURFACE_PROTECTED_CAPABILITIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_SURFACE_PROTECTED_CAPABILITIES_EXTENSION_NAME".."VK_KHR_surface_protected_capabilities"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR".."1000239000"
    )
}