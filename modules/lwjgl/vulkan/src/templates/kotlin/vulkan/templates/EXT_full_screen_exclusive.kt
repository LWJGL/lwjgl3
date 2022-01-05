/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_full_screen_exclusive = "EXTFullScreenExclusive".nativeClassVK("EXT_full_screen_exclusive", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension allows applications to set the policy for swapchain creation and presentation mechanisms relating to full-screen access. Implementations may be able to acquire exclusive access to a particular display for an application window that covers the whole screen. This can increase performance on some systems by bypassing composition, however it can also result in disruptive or expensive transitions in the underlying windowing system when a change occurs.

        Applications can choose between explicitly disallowing or allowing this behavior, letting the implementation decide, or managing this mode of operation directly using the new #AcquireFullScreenExclusiveModeEXT() and #ReleaseFullScreenExclusiveModeEXT() commands.

        <h5>VK_EXT_full_screen_exclusive</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_full_screen_exclusive}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>256</dd>

            <dt><b>Revision</b></dt>
            <dd>4</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
                <li>Requires {@link KHRGetSurfaceCapabilities2 VK_KHR_get_surface_capabilities2}</li>
                <li>Requires {@link KHRSwapchain VK_KHR_swapchain}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_full_screen_exclusive]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_full_screen_exclusive%20extension%3E%3E">cubanismo</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2019-03-12</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with Vulkan 1.1</li>
                <li>Interacts with {@link KHRDeviceGroup VK_KHR_device_group}</li>
                <li>Interacts with {@link KHRWin32Surface VK_KHR_win32_surface}</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Hans-Kristian Arntzen, ARM</li>
                <li>Slawomir Grajewski, Intel</li>
                <li>Tobias Hector, AMD</li>
                <li>James Jones, NVIDIA</li>
                <li>Daniel Rakos, AMD</li>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Joshua Schnarr, NVIDIA</li>
                <li>Aaron Hagan, AMD</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_FULL_SCREEN_EXCLUSIVE_SPEC_VERSION".."4"
    )

    StringConstant(
        "The extension name.",

        "EXT_FULL_SCREEN_EXCLUSIVE_EXTENSION_NAME".."VK_EXT_full_screen_exclusive"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_INFO_EXT".."1000255000",
        "STRUCTURE_TYPE_SURFACE_CAPABILITIES_FULL_SCREEN_EXCLUSIVE_EXT".."1000255002"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT".."-1000255000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT".."1000255001"
    )

    EnumConstant(
        """
        VkFullScreenExclusiveEXT - Hint values an application can specify affecting full-screen transition behavior

        <h5>Description</h5>
        <ul>
            <li>#FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT indicates the implementation <b>should</b> determine the appropriate full-screen method by whatever means it deems appropriate.</li>
            <li>#FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT indicates the implementation <b>may</b> use full-screen exclusive mechanisms when available. Such mechanisms <b>may</b> result in better performance and/or the availability of different presentation capabilities, but <b>may</b> require a more disruptive transition during swapchain initialization, first presentation and/or destruction.</li>
            <li>#FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT indicates the implementation <b>should</b> avoid using full-screen mechanisms which rely on disruptive transitions.</li>
            <li>#FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT indicates the application will manage full-screen exclusive mode by using the #AcquireFullScreenExclusiveModeEXT() and #ReleaseFullScreenExclusiveModeEXT() commands.</li>
        </ul>

        <h5>See Also</h5>
        ##VkSurfaceFullScreenExclusiveInfoEXT
        """,

        "FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT".."0",
        "FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT".."1",
        "FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT".."2",
        "FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT".."3"
    )

    VkResult(
        "GetPhysicalDeviceSurfacePresentModes2EXT",
        """
        Query supported presentation modes.

        <h5>C Specification</h5>
        Alternatively, to query the supported presentation modes for a surface combined with select other fixed swapchain creation parameters, call:

        <pre><code>
￿VkResult vkGetPhysicalDeviceSurfacePresentModes2EXT(
￿    VkPhysicalDevice                            physicalDevice,
￿    const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
￿    uint32_t*                                   pPresentModeCount,
￿    VkPresentModeKHR*                           pPresentModes);</code></pre>

        <h5>Description</h5>
        {@code vkGetPhysicalDeviceSurfacePresentModes2EXT} behaves similarly to #GetPhysicalDeviceSurfacePresentModesKHR(), with the ability to specify extended inputs via chained input structures.

        <h5>Valid Usage</h5>
        <ul>
            <li>If the {@link GOOGLESurfacelessQuery VK_GOOGLE_surfaceless_query} extension is not enabled, {@code pSurfaceInfo→surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>If {@code pSurfaceInfo→surface} is not #NULL_HANDLE, it <b>must</b> be supported by {@code physicalDevice}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code pSurfaceInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceSurfaceInfo2KHR structure</li>
            <li>{@code pPresentModeCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pPresentModeCount} is not 0, and {@code pPresentModes} is not {@code NULL}, {@code pPresentModes} <b>must</b> be a valid pointer to an array of {@code pPresentModeCount} {@code VkPresentModeKHR} values</li>
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
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceSurfaceInfo2KHR
        """,

        VkPhysicalDevice("physicalDevice", "the physical device that will be associated with the swapchain to be created, as described for #CreateSwapchainKHR()."),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo", "a pointer to a ##VkPhysicalDeviceSurfaceInfo2KHR structure describing the surface and other fixed parameters that would be consumed by #CreateSwapchainKHR()."),
        AutoSize("pPresentModes")..Check(1)..uint32_t.p("pPresentModeCount", "a pointer to an integer related to the number of presentation modes available or queried, as described below."),
        nullable..VkPresentModeKHR.p("pPresentModes", "either {@code NULL} or a pointer to an array of {@code VkPresentModeKHR} values, indicating the supported presentation modes.")
    )

    VkResult(
        "AcquireFullScreenExclusiveModeEXT",
        """
        Acquire full-screen exclusive mode for a swapchain.

        <h5>C Specification</h5>
        To acquire exclusive full-screen access for a swapchain, call:

        <pre><code>
￿VkResult vkAcquireFullScreenExclusiveModeEXT(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> not be in the retired state</li>
            <li>{@code swapchain} <b>must</b> be a swapchain created with a ##VkSurfaceFullScreenExclusiveInfoEXT structure, with {@code fullScreenExclusive} set to #FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT</li>
            <li>{@code swapchain} <b>must</b> not currently have exclusive full-screen access</li>
        </ul>

        A return value of #SUCCESS indicates that the {@code swapchain} successfully acquired exclusive full-screen access. The swapchain will retain this exclusivity until either the application releases exclusive full-screen access with #ReleaseFullScreenExclusiveModeEXT(), destroys the swapchain, or if any of the swapchain commands return #ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT indicating that the mode was lost because of platform-specific changes.

        If the swapchain was unable to acquire exclusive full-screen access to the display then #ERROR_INITIALIZATION_FAILED is returned. An application <b>can</b> attempt to acquire exclusive full-screen access again for the same swapchain even if this command fails, or if #ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT has been returned by a swapchain command.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
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
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to acquire exclusive full-screen access for.")
    )

    VkResult(
        "ReleaseFullScreenExclusiveModeEXT",
        """
        Release full-screen exclusive mode from a swapchain.

        <h5>C Specification</h5>
        To release exclusive full-screen access from a swapchain, call:

        <pre><code>
￿VkResult vkReleaseFullScreenExclusiveModeEXT(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Applications will not be able to present to {@code swapchain} after this call until exclusive full-screen access is reacquired. This is usually useful to handle when an application is minimised or otherwise intends to stop presenting for a time.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> not be in the retired state</li>
            <li>{@code swapchain} <b>must</b> be a swapchain created with a ##VkSurfaceFullScreenExclusiveInfoEXT structure, with {@code fullScreenExclusive} set to #FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT</li>
        </ul>
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to release exclusive full-screen access from.")
    )

    DependsOn("""ext.contains("VK_KHR_device_group") || ext.contains("Vulkan11")""")..VkResult(
        "GetDeviceGroupSurfacePresentModes2EXT",
        """
        Query device group present capabilities for a surface.

        <h5>C Specification</h5>
        Alternatively, to query the supported device group presentation modes for a surface combined with select other fixed swapchain creation parameters, call:

        <pre><code>
￿VkResult vkGetDeviceGroupSurfacePresentModes2EXT(
￿    VkDevice                                    device,
￿    const VkPhysicalDeviceSurfaceInfo2KHR*      pSurfaceInfo,
￿    VkDeviceGroupPresentModeFlagsKHR*           pModes);</code></pre>

        <h5>Description</h5>
        {@code vkGetDeviceGroupSurfacePresentModes2EXT} behaves similarly to #GetDeviceGroupSurfacePresentModesKHR(), with the ability to specify extended inputs via chained input structures.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code pSurfaceInfo→surface} <b>must</b> be supported by all physical devices associated with {@code device}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pSurfaceInfo} <b>must</b> be a valid pointer to a valid ##VkPhysicalDeviceSurfaceInfo2KHR structure</li>
            <li>{@code pModes} <b>must</b> be a valid pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} value</li>
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
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPhysicalDeviceSurfaceInfo2KHR
        """,

        VkDevice("device", "the logical device."),
        VkPhysicalDeviceSurfaceInfo2KHR.const.p("pSurfaceInfo", "a pointer to a ##VkPhysicalDeviceSurfaceInfo2KHR structure describing the surface and other fixed parameters that would be consumed by #CreateSwapchainKHR()."),
        Check(1)..VkDeviceGroupPresentModeFlagsKHR.p("pModes", "a pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} in which the supported device group present modes for the surface are returned.")
    )
}