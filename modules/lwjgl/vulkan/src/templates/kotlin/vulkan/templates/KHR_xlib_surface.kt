/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import core.linux.*
import vulkan.*

val KHR_xlib_surface = "KHRXlibSurface".nativeClassVK("KHR_xlib_surface", type = "instance", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_xlib_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) that refers to an X11 {@code Window}, using the Xlib client-side library, as well as a query to determine support for rendering via Xlib.

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_xlib_surface}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>5</dd>

            <dt><b>Revision</b></dt>
            <dd>6</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Jesse Hall @jessehall,Ian Elliott mailto:ianelliott@google.com[ianelliott@google.com]</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2015-11-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Patrick Doane, Blizzard</li>
                <li>Jason Ekstrand, Intel</li>
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

        "KHR_XLIB_SURFACE_SPEC_VERSION".."6"
    )

    StringConstant(
        "The extension name.",

        "KHR_XLIB_SURFACE_EXTENSION_NAME".."VK_KHR_xlib_surface"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR".."1000004000"
    )

    VkResult(
        "CreateXlibSurfaceKHR",
        """
        Create a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library.

        <h5>C Specification</h5>
        To create a {@code VkSurfaceKHR} object for an X11 window, using the Xlib client-side library, call:

        <code><pre>
￿VkResult vkCreateXlibSurfaceKHR(
￿    VkInstance                                  instance,
￿    const VkXlibSurfaceCreateInfoKHR*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkXlibSurfaceCreateInfoKHR structure</li>
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
        ##VkAllocationCallbacks, ##VkXlibSurfaceCreateInfoKHR
        """,

        VkInstance.IN("instance", "the instance to associate the surface with."),
        VkXlibSurfaceCreateInfoKHR.const.p.IN("pCreateInfo", "a pointer to an instance of the ##VkXlibSurfaceCreateInfoKHR structure containing the parameters affecting the creation of the surface object."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface object is returned.")
    )

    VkBool32(
        "GetPhysicalDeviceXlibPresentationSupportKHR",
        """
        Query physical device for presentation to X11 server using Xlib.

        <h5>C Specification</h5>
        To determine whether a queue family of a physical device supports presentation to an X11 server, using the Xlib client-side library, call:

        <code><pre>
￿VkBool32 vkGetPhysicalDeviceXlibPresentationSupportKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t                                    queueFamilyIndex,
￿    Display*                                    dpy,
￿    VisualID                                    visualID);</pre></code>

        <h5>Description</h5>
        This platform-specific function <b>can</b> be called prior to creating a surface.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code queueFamilyIndex} <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by #GetPhysicalDeviceQueueFamilyProperties() for the given {@code physicalDevice}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code dpy} <b>must</b> be a valid pointer to a {@code Display} value</li>
        </ul>
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device."),
        uint32_t.IN("queueFamilyIndex", "the queue family index."),
        Display.p.IN("dpy", "a pointer to an Xlib {@code Display} connection to the server."),
        VisualID.IN("visualID", "")
    )
}