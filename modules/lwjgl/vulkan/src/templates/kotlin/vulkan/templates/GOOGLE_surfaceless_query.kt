/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val GOOGLE_surfaceless_query = "GOOGLESurfacelessQuery".nativeClassVK("GOOGLE_surfaceless_query", type = "instance", postfix = "GOOGLE") {
    documentation =
        """
        This extension allows the #GetPhysicalDeviceSurfaceFormatsKHR() and #GetPhysicalDeviceSurfacePresentModesKHR() functions to accept #NULL_HANDLE as their {@code surface} parameter, allowing potential surface formats, colorspaces and present modes to be queried without providing a surface. Identically, #GetPhysicalDeviceSurfaceFormats2KHR() and #GetPhysicalDeviceSurfacePresentModes2EXT() would accept #NULL_HANDLE in ##VkPhysicalDeviceSurfaceInfo2KHR{@code ::surface}. <b>This can only be supported on platforms where the results of these queries are surface-agnostic and a single presentation engine is the implicit target of all present operations</b>.

        <h5>VK_GOOGLE_surfaceless_query</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_GOOGLE_surfaceless_query}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>434</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
            </ul></dd>

            <dt><b>Special Use</b></dt>
            <dd><ul>
                <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_GOOGLE_surfaceless_query]%20@syoussefi%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_GOOGLE_surfaceless_query%20extension%3E%3E">syoussefi</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_GOOGLE_surfaceless_query.asciidoc">VK_GOOGLE_surfaceless_query</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-12-14</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ian Elliott, Google</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>James Jones, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "GOOGLE_SURFACELESS_QUERY_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "GOOGLE_SURFACELESS_QUERY_EXTENSION_NAME".."VK_GOOGLE_surfaceless_query"
    )
}