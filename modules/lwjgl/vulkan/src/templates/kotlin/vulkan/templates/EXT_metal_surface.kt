/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.macos.*
import vulkan.*

val EXT_metal_surface = "EXTMetalSurface".nativeClassVK("EXT_metal_surface", type = "instance", postfix = "EXT") {
    documentation =
        """
        The {@code VK_EXT_metal_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) from {@code CAMetalLayer}, which is the native rendering surface of Apple’s Metal framework.

        <h5>VK_EXT_metal_surface</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_metal_surface}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>218</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Dzmitry Malyshau <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_metal_surface]%20@kvark%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_metal_surface%20extension%3E%3E">kvark</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2018-10-01</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Dzmitry Malyshau, Mozilla Corp.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_METAL_SURFACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_METAL_SURFACE_EXTENSION_NAME".."VK_EXT_metal_surface"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_METAL_SURFACE_CREATE_INFO_EXT".."1000217000"
    )

    VkResult(
        "CreateMetalSurfaceEXT",
        """
        Create a VkSurfaceKHR object for CAMetalLayer.

        <h5>C Specification</h5>
        To create a {@code VkSurfaceKHR} object for a {@code CAMetalLayer}, call:

        <pre><code>
￿VkResult vkCreateMetalSurfaceEXT(
￿    VkInstance                                  instance,
￿    const VkMetalSurfaceCreateInfoEXT*          pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkMetalSurfaceCreateInfoEXT structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSurface} <b>must</b> be a valid pointer to a {@code VkSurfaceKHR} handle</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_NATIVE_WINDOW_IN_USE_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkMetalSurfaceCreateInfoEXT
        """,

        VkInstance("instance", "the instance with which to associate the surface."),
        VkMetalSurfaceCreateInfoEXT.const.p("pCreateInfo", "a pointer to a ##VkMetalSurfaceCreateInfoEXT structure specifying parameters affecting the creation of the surface object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p("pSurface", "a pointer to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
    )
}