/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_display = "KHRDisplay".nativeClassVK("KHR_display", type = "instance", postfix = KHR) {
    documentation =
        """
        This extension provides the API to enumerate displays and available modes on a given device.

        <h5>Examples</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The example code for the {@code VK_KHR_display} and {@code VK_KHR_display_swapchain} extensions was removed from the appendix after revision 1.0.43. The display enumeration example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: https://github.com/KhronosGroup/Vulkan-LoaderAndValidationLayers/blob/master/demos/cube.c).
        </div>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>VK_KHR_display</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>3</dd>

            <dt><b>Status</b></dt>
            <dd>Draft.</dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2017-03-13</dd>

            <dt><b>Revision</b></dt>
            <dd>23</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Dependencies</b></dt>
            <dd><ul>
                <li>This extension is written against version 1.0 of the Vulkan API.</li>
                <li>Requires VK_KHR_surface.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>James Jones, NVIDIA</li>
                <li>Norbert Nopper, Freescale</li>
                <li>Jeff Vigil, Qualcomm</li>
                <li>Daniel Rakos, AMD</li>
            </ul></dd>

            <dt><b>Contacts</b></dt>
            <dd><ul>
                <li>James Jones (jajones 'at' nvidia.com)</li>
                <li>Norbert Nopper (Norbert.Nopper 'at' freescale.com)</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_DISPLAY_SPEC_VERSION".."21"
    )

    StringConstant(
        "The extension name.",

        "KHR_DISPLAY_EXTENSION_NAME".."VK_KHR_display"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR".."1000002000",
        "STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR".."1000002001"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_DISPLAY_KHR".."1000002000",
        "OBJECT_TYPE_DISPLAY_MODE_KHR".."1000002001"
    )

    EnumConstant(
        """
        VkDisplayPlaneAlphaFlagBitsKHR - Alpha blending type

        <h5>Description</h5>
        <ul>
            <li>#DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR specifies that the source image will be treated as opaque.</li>
            <li>#DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR specifies that a global alpha value <b>must</b> be specified that will be applied to all pixels in the source image.</li>
            <li>#DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR specifies that the alpha value will be determined by the alpha channel of the source image&#8217;s pixels. If the source format contains no alpha values, no blending will be applied. The source alpha values are not premultiplied into the source image&#8217;s other color channels.</li>
            <li>#DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR is equivalent to #DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR, except the source alpha values are assumed to be premultiplied into the source image&#8217;s other color channels.</li>
        </ul>

        <h5>See Also</h5>
        {@code VkDisplayPlaneAlphaFlagsKHR}, ##VkDisplaySurfaceCreateInfoKHR
        """,

        "DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR".enum(0x00000001),
        "DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR".enum(0x00000002),
        "DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR".enum(0x00000004),
        "DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR".enum(0x00000008)
    )

    VkResult(
        "GetPhysicalDeviceDisplayPropertiesKHR",
        """
        Query information about the available displays.

        <h5>C Specification</h5>
        Various functions are provided for enumerating the available display devices present on a Vulkan physical device. To query information about the available displays, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkDisplayPropertiesKHR*                     pProperties);</pre></code>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of display devices available for {@code physicalDevice} is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of display devices for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of display devices available for {@code physicalDevice}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkDisplayPropertiesKHR structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayPropertiesKHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "a physical device."),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of display devices available or queried, as described below."),
        nullable..VkDisplayPropertiesKHR.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkDisplayPropertiesKHR structures.")
    )

    VkResult(
        "GetPhysicalDeviceDisplayPlanePropertiesKHR",
        """
        Query the plane properties.

        <h5>C Specification</h5>
        Images are presented to individual planes on a display. Devices <b>must</b> support at least one plane on each display. Planes <b>can</b> be stacked and blended to composite multiple images on one display. Devices <b>may</b> support only a fixed stacking order and fixed mapping between planes and displays, or they <b>may</b> allow arbitrary application specified stacking orders and mappings between planes and displays. To query the properties of device display planes, call:

        <code><pre>
￿VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t*                                   pPropertyCount,
￿    VkDisplayPlanePropertiesKHR*                pProperties);</pre></code>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of display planes available for {@code physicalDevice} is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of display planes for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkDisplayPlanePropertiesKHR structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayPlanePropertiesKHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "a physical device."),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of display planes available or queried, as described below."),
        nullable..VkDisplayPlanePropertiesKHR.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkDisplayPlanePropertiesKHR structures.")
    )

    VkResult(
        "GetDisplayPlaneSupportedDisplaysKHR",
        """
        Query the list of displays a plane supports.

        <h5>C Specification</h5>
        To determine which displays a plane is usable with, call

        <code><pre>
￿VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    uint32_t                                    planeIndex,
￿    uint32_t*                                   pDisplayCount,
￿    VkDisplayKHR*                               pDisplays);</pre></code>

        <h5>Description</h5>
        If {@code pDisplays} is {@code NULL}, then the number of displays usable with the specified {@code planeIndex} for {@code physicalDevice} is returned in {@code pDisplayCount}. Otherwise, {@code pDisplayCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pDisplays} array, and on return the variable is overwritten with the number of handles actually written to {@code pDisplays}. If the value of {@code pDisplayCount} is less than the number of display planes for {@code physicalDevice}, at most {@code pDisplayCount} handles will be written. If {@code pDisplayCount} is smaller than the number of displays usable with the specified {@code planeIndex} for {@code physicalDevice}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code planeIndex} <b>must</b> be less than the number of display planes supported by the device as determined by calling #GetPhysicalDeviceDisplayPlanePropertiesKHR()</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pDisplayCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pDisplayCount} is not 0, and {@code pDisplays} is not {@code NULL}, {@code pDisplays} <b>must</b> be a pointer to an array of {@code pDisplayCount} {@code VkDisplayKHR} handles</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>
        """,

        VkPhysicalDevice.IN("physicalDevice", "a physical device."),
        uint32_t.IN("planeIndex", "the plane which the application wishes to use, and <b>must</b> be in the range <code>[0, physical device plane count - 1]</code>."),
        AutoSize("pDisplays")..Check(1)..uint32_t_p.INOUT("pDisplayCount", "a pointer to an integer related to the number of displays available or queried, as described below."),
        nullable..VkDisplayKHR.p.OUT("pDisplays", "either {@code NULL} or a pointer to an array of {@code VkDisplayKHR} handles.")
    )

    VkResult(
        "GetDisplayModePropertiesKHR",
        """
        Query the set of mode properties supported by the display.

        <h5>C Specification</h5>
        Each display has one or more supported modes associated with it by default. These built-in modes are queried by calling:

        <code><pre>
￿VkResult vkGetDisplayModePropertiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkDisplayKHR                                display,
￿    uint32_t*                                   pPropertyCount,
￿    VkDisplayModePropertiesKHR*                 pProperties);</pre></code>

        <h5>Description</h5>
        If {@code pProperties} is {@code NULL}, then the number of display modes available on the specified {@code display} for {@code physicalDevice} is returned in {@code pPropertyCount}. Otherwise, {@code pPropertyCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pProperties} array, and on return the variable is overwritten with the number of structures actually written to {@code pProperties}. If the value of {@code pPropertyCount} is less than the number of display modes for {@code physicalDevice}, at most {@code pPropertyCount} structures will be written. If {@code pPropertyCount} is smaller than the number of display modes available on the specified {@code display} for {@code physicalDevice}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
            <li>{@code pPropertyCount} <b>must</b> be a pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPropertyCount} is not 0, and {@code pProperties} is not {@code NULL}, {@code pProperties} <b>must</b> be a pointer to an array of {@code pPropertyCount} ##VkDisplayModePropertiesKHR structures</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#INCOMPLETE</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkDisplayModePropertiesKHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device associated with {@code display}."),
        VkDisplayKHR.IN("display", "the display to query."),
        AutoSize("pProperties")..Check(1)..uint32_t_p.INOUT("pPropertyCount", "a pointer to an integer related to the number of display modes available or queried, as described below."),
        nullable..VkDisplayModePropertiesKHR.p.OUT("pProperties", "either {@code NULL} or a pointer to an array of ##VkDisplayModePropertiesKHR structures.")
    )

    VkResult(
        "CreateDisplayModeKHR",
        """
        Create a display mode.

        <h5>C Specification</h5>
        Additional modes <b>may</b> also be created by calling:

        <code><pre>
￿VkResult vkCreateDisplayModeKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkDisplayKHR                                display,
￿    const VkDisplayModeCreateInfoKHR*           pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkDisplayModeKHR*                           pMode);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code display} <b>must</b> be a valid {@code VkDisplayKHR} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkDisplayModeCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pMode} <b>must</b> be a pointer to a {@code VkDisplayModeKHR} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code display} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkDisplayModeCreateInfoKHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device associated with {@code display}."),
        VkDisplayKHR.IN("display", "the display to create an additional mode for."),
        const..VkDisplayModeCreateInfoKHR.p.IN("pCreateInfo", "a ##VkDisplayModeCreateInfoKHR structure describing the new mode to create."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "the allocator used for host memory allocated for the display mode object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkDisplayModeKHR.p.OUT("pMode", "returns the handle of the mode created.")
    )

    VkResult(
        "GetDisplayPlaneCapabilitiesKHR",
        """
        Query capabilities of a mode and plane combination.

        <h5>C Specification</h5>
        Applications that wish to present directly to a display <b>must</b> select which layer, or "plane" of the display they wish to target, and a mode to use with the display. Each display supports at least one plane. The capabilities of a given mode and plane combination are determined by calling:

        <code><pre>
￿VkResult vkGetDisplayPlaneCapabilitiesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkDisplayModeKHR                            mode,
￿    uint32_t                                    planeIndex,
￿    VkDisplayPlaneCapabilitiesKHR*              pCapabilities);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code mode} <b>must</b> be a valid {@code VkDisplayModeKHR} handle</li>
            <li>{@code pCapabilities} <b>must</b> be a pointer to a ##VkDisplayPlaneCapabilitiesKHR structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code mode} <b>must</b> be externally synchronized</li>
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
        ##VkDisplayPlaneCapabilitiesKHR
        """,

        VkPhysicalDevice.IN("physicalDevice", "the physical device associated with {@code display}"),
        VkDisplayModeKHR.IN("mode", "the display mode the application intends to program when using the specified plane. Note this parameter also implicitly specifies a display."),
        uint32_t.IN("planeIndex", "the plane which the application intends to use with the display, and is less than the number of display planes supported by the device."),
        VkDisplayPlaneCapabilitiesKHR.p.OUT("pCapabilities", "a pointer to a ##VkDisplayPlaneCapabilitiesKHR structure in which the capabilities are returned.")
    )

    VkResult(
        "CreateDisplayPlaneSurfaceKHR",
        """
        Create a {@code VkSurfaceKHR} structure representing a display plane and mode.

        <h5>C Specification</h5>
        A complete display configuration includes a mode, one or more display planes and any parameters describing their behavior, and parameters describing some aspects of the images associated with those planes. Display surfaces describe the configuration of a single plane within a complete display configuration. To create a {@code VkSurfaceKHR} structure for a display surface, call:

        <code><pre>
￿VkResult vkCreateDisplayPlaneSurfaceKHR(
￿    VkInstance                                  instance,
￿    const VkDisplaySurfaceCreateInfoKHR*        pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSurfaceKHR*                               pSurface);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a pointer to a valid ##VkDisplaySurfaceCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSurface} <b>must</b> be a pointer to a {@code VkSurfaceKHR} handle</li>
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
        ##VkAllocationCallbacks, ##VkDisplaySurfaceCreateInfoKHR
        """,

        VkInstance.IN("instance", "the instance corresponding to the physical device the targeted display is on."),
        const..VkDisplaySurfaceCreateInfoKHR.p.IN("pCreateInfo", "a pointer to an instance of the ##VkDisplaySurfaceCreateInfoKHR structure specifying which mode, plane, and other parameters to use, as described below."),
        nullable..const..VkAllocationCallbacks.p.IN("pAllocator", "the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSurfaceKHR.p.OUT("pSurface", "points to a {@code VkSurfaceKHR} handle in which the created surface is returned.")
    )
}