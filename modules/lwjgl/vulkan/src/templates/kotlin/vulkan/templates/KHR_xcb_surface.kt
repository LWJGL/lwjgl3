/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_xcb_surface = "KHRXcbSurface".nativeClassVK("KHR_xcb_surface", type = "instance", postfix = "KHR") {
    documentation =
        """
        The {@code VK_KHR_xcb_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) that refers to an X11 {@code Window}, using the XCB client-side library, as well as a query to determine support for rendering via XCB.

        <h5>VK_KHR_xcb_surface</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_xcb_surface}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>6</dd>

            <dt><b>Revision</b></dt>
            <dd>6</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRSurface VK_KHR_surface}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_xcb_surface]%20@critsec%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_xcb_surface%20extension*">critsec</a></li>
                <li>Ian Elliott <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_xcb_surface]%20@ianelliottus%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_xcb_surface%20extension*">ianelliottus</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2015-11-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Patrick Doane, Blizzard</li>
                <li>Faith Ekstrand, Intel</li>
                <li>Ian Elliott, LunarG</li>
                <li>Courtney Goeltzenleuchter, LunarG</li>
                <li>Jesse Hall, Google</li>
                <li>James Jones, NVIDIA</li>
                <li>Antoine Labour, Google</li>
                <li>Jon Leech, Khronos</li>
                <li>David Mao, AMD</li>
                <li>Norbert Nopper, Freescale</li>
                <li>Alon Or-bach, Samsung</li>
                <li>Daniel Rakos, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Ray Smith, ARM</li>
                <li>Jeff Vigil, Qualcomm</li>
                <li>Chia-I Wu, LunarG</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_XCB_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "The extension name.",

        "KHR_XCB_SURFACE_EXTENSION_NAME".."VK_KHR_xcb_surface"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR".."1000005000"
    )

    VkResult(
        "CreateXcbSurfaceKHR",
        """
        Create a {@code VkSurfaceKHR} object for a X11 window, using the XCB client-side library.

        <h5>C Specification</h5>
        To create a {@code VkSurfaceKHR} object for an X11 window, using the XCB client-side library, call:

        <pre><code>
￿VkResult vkCreateXcbSurfaceKHR(
￿    VkInstance                                  instance,
￿    const VkXcbSurfaceCreateInfoKHR*            pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkXcbSurfaceCreateInfoKHR structure</li>
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
        ##VkAllocationCallbacks, ##VkXcbSurfaceCreateInfoKHR
        """,

        VkInstance("instance", "the instance to associate the surface with."),
        VkXcbSurfaceCreateInfoKHR.const.p("pCreateInfo", "a pointer to a ##VkXcbSurfaceCreateInfoKHR structure containing parameters affecting the creation of the surface object."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a href=\"https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p("pSurface", "a pointer to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
    )

    VkBool32(
        "GetPhysicalDeviceXcbPresentationSupportKHR",
        """
        Query physical device for presentation to X11 server using XCB.

        <h5>C Specification</h5>
        To determine whether a queue family of a physical device supports presentation to an X11 server, using the XCB client-side library, call:

        <pre><code>
￿VkBool32 vkGetPhysicalDeviceXcbPresentationSupportKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t                                    queueFamilyIndex,
￿    xcb_connection_t*                           connection,
￿    xcb_visualid_t                              visual_id);</code></pre>

        <h5>Description</h5>
        This platform-specific function <b>can</b> be called prior to creating a surface.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by {@code vkGetPhysicalDeviceQueueFamilyProperties} for the given {@code physicalDevice}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code connection} <b>must</b> be a valid pointer to an {@code xcb_connection_t} value</li>
        </ul>
        """,

        VkPhysicalDevice("physicalDevice", "the physical device."),
        uint32_t("queueFamilyIndex", "the queue family index."),
        xcb_connection_t.p("connection", "a pointer to an {@code xcb_connection_t} to the X server."),
        xcb_visualid_t("visual_id", "an X11 visual ({@code xcb_visualid_t}).")
    )
}