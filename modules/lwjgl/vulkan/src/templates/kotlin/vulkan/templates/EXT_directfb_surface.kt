/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_directfb_surface = "EXTDirectfbSurface".nativeClassVK("EXT_directfb_surface", type = "instance", postfix = "EXT") {
    documentation =
        """
        The {@code VK_EXT_directfb_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) that refers to a DirectFB {@code IDirectFBSurface}, as well as a query to determine support for rendering via DirectFB.

        <h5>VK_EXT_directfb_surface</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_directfb_surface}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>347</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRSurface VK_KHR_surface}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Nicolas Caramelli <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_directfb_surface]%20@caramelli%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_directfb_surface%20extension*">caramelli</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-06-16</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Nicolas Caramelli</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_DIRECTFB_SURFACE_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_DIRECTFB_SURFACE_EXTENSION_NAME".."VK_EXT_directfb_surface"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DIRECTFB_SURFACE_CREATE_INFO_EXT".."1000346000"
    )

    VkResult(
        "CreateDirectFBSurfaceEXT",
        """
        Create a {@code VkSurfaceKHR} object for a DirectFB surface.

        <h5>C Specification</h5>
        To create a {@code VkSurfaceKHR} object for a DirectFB surface, call:

        <pre><code>
￿VkResult vkCreateDirectFBSurfaceEXT(
￿    VkInstance                                  instance,
￿    const VkDirectFBSurfaceCreateInfoEXT*       pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkDirectFBSurfaceCreateInfoEXT structure</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDirectFBSurfaceCreateInfoEXT
        """,

        VkInstance("instance", "the instance to associate the surface with."),
        VkDirectFBSurfaceCreateInfoEXT.const.p("pCreateInfo", "a pointer to a ##VkDirectFBSurfaceCreateInfoEXT structure containing parameters affecting the creation of the surface object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p("pSurface", "a pointer to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
    )

    VkBool32(
        "GetPhysicalDeviceDirectFBPresentationSupportEXT",
        """
        Query physical device for presentation with DirectFB.

        <h5>C Specification</h5>
        To determine whether a queue family of a physical device supports presentation with DirectFB library, call:

        <pre><code>
￿VkBool32 vkGetPhysicalDeviceDirectFBPresentationSupportEXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t                                    queueFamilyIndex,
￿    IDirectFB*                                  dfb);</code></pre>

        <h5>Description</h5>
        This platform-specific function <b>can</b> be called prior to creating a surface.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@code vkGetPhysicalDeviceQueueFamilyProperties} for the given {@code physicalDevice}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code dfb} <b>must</b> be a valid pointer to an {@code IDirectFB} value</li>
        </ul>
        """,

        VkPhysicalDevice("physicalDevice", "the physical device."),
        uint32_t("queueFamilyIndex", "the queue family index."),
        IDirectFB.p("dfb", "a pointer to the {@code IDirectFB} main interface of DirectFB.")
    )
}