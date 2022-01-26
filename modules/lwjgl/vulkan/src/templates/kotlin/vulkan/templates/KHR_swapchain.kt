/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_swapchain = "KHRSwapchain".nativeClassVK("KHR_swapchain", type = "device", postfix = "KHR") {
    documentation =
        """
        The {@code VK_KHR_swapchain} extension is the device-level companion to the {@link KHRSurface VK_KHR_surface} extension. It introduces {@code VkSwapchainKHR} objects, which provide the ability to present rendering results to a surface.

        <h5>Examples</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The example code for the {@link KHRSurface VK_KHR_surface} and {@code VK_KHR_swapchain} extensions was removed from the appendix after revision 1.0.29. This WSI example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c">https://github.com/KhronosGroup/Vulkan-Tools/blob/master/cube/cube.c</a>).
        </div>

        <h5>VK_KHR_swapchain</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_swapchain}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>2</dd>

            <dt><b>Revision</b></dt>
            <dd>70</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_swapchain]%20@cubanismo%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_swapchain%20extension%3E%3E">cubanismo</a></li>
                <li>Ian Elliott <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_swapchain]%20@ianelliottus%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_swapchain%20extension%3E%3E">ianelliottus</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-10-06</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Interacts with Vulkan 1.1</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Patrick Doane, Blizzard</li>
                <li>Ian Elliott, LunarG</li>
                <li>Jesse Hall, Google</li>
                <li>Mathias Heyer, NVIDIA</li>
                <li>James Jones, NVIDIA</li>
                <li>David Mao, AMD</li>
                <li>Norbert Nopper, Freescale</li>
                <li>Alon Or-bach, Samsung</li>
                <li>Daniel Rakos, AMD</li>
                <li>Graham Sellers, AMD</li>
                <li>Jeff Vigil, Qualcomm</li>
                <li>Chia-I Wu, LunarG</li>
                <li>Jason Ekstrand, Intel</li>
                <li>Matthaeus G. Chajdas, AMD</li>
                <li>Ray Smith, ARM</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_SWAPCHAIN_SPEC_VERSION".."70"
    )

    StringConstant(
        "The extension name.",

        "KHR_SWAPCHAIN_EXTENSION_NAME".."VK_KHR_swapchain"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR".."1000001000",
        "STRUCTURE_TYPE_PRESENT_INFO_KHR".."1000001001"
    )

    EnumConstant(
        "Extends {@code VkImageLayout}.",

        "IMAGE_LAYOUT_PRESENT_SRC_KHR".."1000001002"
    )

    EnumConstant(
        "Extends {@code VkResult}.",

        "SUBOPTIMAL_KHR".."1000001003",
        "ERROR_OUT_OF_DATE_KHR".."-1000001004"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_SWAPCHAIN_KHR".."1000001000"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR".."1000060007",
        "STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR".."1000060008",
        "STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR".."1000060009",
        "STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR".."1000060010",
        "STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR".."1000060011",
        "STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR".."1000060012"
    )

    EnumConstant(
        "Extends {@code VkSwapchainCreateFlagBitsKHR}.",

        "SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR".enum(0x00000001),
        "SWAPCHAIN_CREATE_PROTECTED_BIT_KHR".enum(0x00000002)
    )

    EnumConstant(
        """
        VkDeviceGroupPresentModeFlagBitsKHR - Bitmask specifying supported device group present modes

        <h5>Description</h5>
        <ul>
            <li>#DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR specifies that any physical device with a presentation engine <b>can</b> present its own swapchain images.</li>
            <li>#DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR specifies that any physical device with a presentation engine <b>can</b> present swapchain images from any physical device in its {@code presentMask}.</li>
            <li>#DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR specifies that any physical device with a presentation engine <b>can</b> present the sum of swapchain images from any physical devices in its {@code presentMask}.</li>
            <li>#DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR specifies that multiple physical devices with a presentation engine <b>can</b> each present their own swapchain images.</li>
        </ul>

        <h5>See Also</h5>
        ##VkDeviceGroupPresentInfoKHR
        """,

        "DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR".enum(0x00000001),
        "DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR".enum(0x00000002),
        "DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR".enum(0x00000004),
        "DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR".enum(0x00000008)
    )

    VkResult(
        "CreateSwapchainKHR",
        """
        Create a swapchain.

        <h5>C Specification</h5>
        To create a swapchain, call:

        <pre><code>
￿VkResult vkCreateSwapchainKHR(
￿    VkDevice                                    device,
￿    const VkSwapchainCreateInfoKHR*             pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSwapchainKHR*                             pSwapchain);</code></pre>

        <h5>Description</h5>
        If the {@code oldSwapchain} parameter of {@code pCreateInfo} is a valid swapchain, which has exclusive full-screen access, that access is released from {@code oldSwapchain}. If the command succeeds in this case, the newly created swapchain will automatically acquire exclusive full-screen access from {@code oldSwapchain}.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This implicit transfer is intended to avoid exiting and entering full-screen exclusive mode, which may otherwise cause unwanted visual updates to the display.
        </div>

        In some cases, swapchain creation <b>may</b> fail if exclusive full-screen mode is requested for application control, but for some implementation-specific reason exclusive full-screen access is unavailable for the particular combination of parameters provided. If this occurs, #ERROR_INITIALIZATION_FAILED will be returned.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        In particular, it will fail if the {@code imageExtent} member of {@code pCreateInfo} does not match the extents of the monitor. Other reasons for failure may include the app not being set as high-dpi aware, or if the physical device and monitor are not compatible in this mode.
        </div>

        When the {@code VkSurfaceKHR} in ##VkSwapchainCreateInfoKHR is a display surface, then the {@code VkDisplayModeKHR} in display surface’s ##VkDisplaySurfaceCreateInfoKHR is associated with a particular {@code VkDisplayKHR}. Swapchain creation <b>may</b> fail if that {@code VkDisplayKHR} is not acquired by the application. In this scenario #ERROR_INITIALIZATION_FAILED is returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkSwapchainCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSwapchain} <b>must</b> be a valid pointer to a {@code VkSwapchainKHR} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pCreateInfo→surface} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pCreateInfo→oldSwapchain} <b>must</b> be externally synchronized</li>
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
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
                <li>#ERROR_NATIVE_WINDOW_IN_USE_KHR</li>
                <li>#ERROR_INITIALIZATION_FAILED</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkSwapchainCreateInfoKHR
        """,

        VkDevice("device", "the device to create the swapchain for."),
        VkSwapchainCreateInfoKHR.const.p("pCreateInfo", "a pointer to a ##VkSwapchainCreateInfoKHR structure specifying the parameters of the created swapchain."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSwapchainKHR.p("pSwapchain", "a pointer to a {@code VkSwapchainKHR} handle in which the created swapchain object will be returned.")
    )

    void(
        "DestroySwapchainKHR",
        """
        Destroy a swapchain object.

        <h5>C Specification</h5>
        To destroy a swapchain object call:

        <pre><code>
￿void vkDestroySwapchainKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Description</h5>
        The application <b>must</b> not destroy a swapchain until after completion of all outstanding operations on images that were acquired from the swapchain. {@code swapchain} and all associated {@code VkImage} handles are destroyed, and <b>must</b> not be acquired or used any more by the application. The memory of each {@code VkImage} will only be freed after that image is no longer used by the presentation engine. For example, if one image of the swapchain is being displayed in a window, the memory for that image <b>may</b> not be freed until the window is destroyed, or another swapchain is created for the window. Destroying the swapchain does not invalidate the parent {@code VkSurfaceKHR}, and a new swapchain <b>can</b> be created with it.

        When a swapchain associated with a display surface is destroyed, if the image most recently presented to the display surface is from the swapchain being destroyed, then either any display resources modified by presenting images from any swapchain associated with the display surface <b>must</b> be reverted by the implementation to their state prior to the first present performed on one of these swapchains, or such resources <b>must</b> be left in their current state.

        If {@code swapchain} has exclusive full-screen access, it is released before the swapchain is destroyed.

        <h5>Valid Usage</h5>
        <ul>
            <li>All uses of presentable images acquired from {@code swapchain} <b>must</b> have completed execution</li>
            <li>If ##VkAllocationCallbacks were provided when {@code swapchain} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code swapchain} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code swapchain} is not #NULL_HANDLE, {@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>Both of {@code device}, and {@code swapchain} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the {@code VkDevice} associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>).")
    )

    VkResult(
        "GetSwapchainImagesKHR",
        """
        Obtain the array of presentable images associated with a swapchain.

        <h5>C Specification</h5>
        To obtain the array of presentable images associated with a swapchain, call:

        <pre><code>
￿VkResult vkGetSwapchainImagesKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    uint32_t*                                   pSwapchainImageCount,
￿    VkImage*                                    pSwapchainImages);</code></pre>

        <h5>Description</h5>
        If {@code pSwapchainImages} is {@code NULL}, then the number of presentable images for {@code swapchain} is returned in {@code pSwapchainImageCount}. Otherwise, {@code pSwapchainImageCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSwapchainImages} array, and on return the variable is overwritten with the number of structures actually written to {@code pSwapchainImages}. If the value of {@code pSwapchainImageCount} is less than the number of presentable images for {@code swapchain}, at most {@code pSwapchainImageCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available presentable images were returned.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>{@code pSwapchainImageCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pSwapchainImageCount} is not 0, and {@code pSwapchainImages} is not {@code NULL}, {@code pSwapchainImages} <b>must</b> be a valid pointer to an array of {@code pSwapchainImageCount} {@code VkImage} handles</li>
            <li>Both of {@code device}, and {@code swapchain} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
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

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the swapchain to query."),
        AutoSize("pSwapchainImages")..Check(1)..uint32_t.p("pSwapchainImageCount", "a pointer to an integer related to the number of presentable images available or queried, as described below."),
        nullable..VkImage.p("pSwapchainImages", "either {@code NULL} or a pointer to an array of {@code VkImage} handles.")
    )

    VkResult(
        "AcquireNextImageKHR",
        """
        Retrieve the index of the next available presentable image.

        <h5>C Specification</h5>
        To acquire an available presentable image to use, and retrieve the index of that image, call:

        <pre><code>
￿VkResult vkAcquireNextImageKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    uint64_t                                    timeout,
￿    VkSemaphore                                 semaphore,
￿    VkFence                                     fence,
￿    uint32_t*                                   pImageIndex);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> not be in the retired state</li>
            <li>If {@code semaphore} is not #NULL_HANDLE it <b>must</b> be unsignaled</li>
            <li>If {@code semaphore} is not #NULL_HANDLE it <b>must</b> not have any uncompleted signal or wait operations pending</li>
            <li>If {@code fence} is not #NULL_HANDLE it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>{@code semaphore} and {@code fence} <b>must</b> not both be equal to #NULL_HANDLE</li>
            <li>If the number of currently acquired images is greater than the difference between the number of images in {@code swapchain} and the value of ##VkSurfaceCapabilitiesKHR{@code ::minImageCount} as returned by a call to #GetPhysicalDeviceSurfaceCapabilities2KHR() with the {@code surface} used to create {@code swapchain}, {@code timeout} <b>must</b> not be {@code UINT64_MAX}</li>
            <li>{@code semaphore} <b>must</b> have a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_BINARY</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code swapchain} <b>must</b> be a valid {@code VkSwapchainKHR} handle</li>
            <li>If {@code semaphore} is not #NULL_HANDLE, {@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
            <li>If {@code fence} is not #NULL_HANDLE, {@code fence} <b>must</b> be a valid {@code VkFence} handle</li>
            <li>{@code pImageIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If {@code semaphore} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>If {@code fence} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
            <li>Both of {@code device}, and {@code swapchain} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code semaphore} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code fence} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#TIMEOUT</li>
                <li>#NOT_READY</li>
                <li>#SUBOPTIMAL_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_OUT_OF_DATE_KHR</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
                <li>#ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT</li>
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR("swapchain", "the non-retired swapchain from which an image is being acquired."),
        uint64_t("timeout", "specifies how long the function waits, in nanoseconds, if no image is available."),
        VkSemaphore("semaphore", "#NULL_HANDLE or a semaphore to signal."),
        VkFence("fence", "#NULL_HANDLE or a fence to signal."),
        Check(1)..uint32_t.p("pImageIndex", "a pointer to a {@code uint32_t} in which the index of the next image to use (i.e. an index into the array of images returned by {@code vkGetSwapchainImagesKHR}) is returned.")
    )

    VkResult(
        "QueuePresentKHR",
        """
        Queue an image for presentation.

        <h5>C Specification</h5>
        After queueing all rendering commands and transitioning the image to the correct layout, to queue an image for presentation, call:

        <pre><code>
￿VkResult vkQueuePresentKHR(
￿    VkQueue                                     queue,
￿    const VkPresentInfoKHR*                     pPresentInfo);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There is no requirement for an application to present images in the same order that they were acquired - applications can arbitrarily present any image that is currently acquired.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pSwapchains} member of {@code pPresentInfo} <b>must</b> be a swapchain that is created for a surface for which presentation is supported from {@code queue} as determined using a call to {@code vkGetPhysicalDeviceSurfaceSupportKHR}</li>
            <li>If more than one member of {@code pSwapchains} was created from a display surface, all display surfaces referenced that refer to the same display <b>must</b> use the same display mode</li>
            <li>When a semaphore wait operation referring to a binary semaphore defined by the elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} executes on {@code queue}, there <b>must</b> be no other queues waiting on the same semaphore</li>
            <li>All elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution</li>
            <li>All elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} <b>must</b> be created with a {@code VkSemaphoreType} of #SEMAPHORE_TYPE_BINARY</li>
            <li>All elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} <b>must</b> reference a semaphore signal operation that has been submitted for execution and any semaphore signal operations on which it depends (if any) <b>must</b> have also been submitted for execution</li>
        </ul>

        Any writes to memory backing the images referenced by the {@code pImageIndices} and {@code pSwapchains} members of {@code pPresentInfo}, that are available before #QueuePresentKHR() is executed, are automatically made visible to the read access performed by the presentation engine. This automatic visibility operation for an image happens-after the semaphore signal operation, and happens-before the presentation engine accesses the image.

        Queueing an image for presentation defines a set of <em>queue operations</em>, including waiting on the semaphores and submitting a presentation request to the presentation engine. However, the scope of this set of queue operations does not include the actual processing of the image by the presentation engine.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The origin of the native orientation of the surface coordinate system is not specified in the Vulkan specification; it depends on the platform. For most platforms the origin is by default upper-left, meaning the pixel of the presented {@code VkImage} at coordinates <code>(0,0)</code> would appear at the upper left pixel of the platform surface (assuming #SURFACE_TRANSFORM_IDENTITY_BIT_KHR, and the display standing the right way up).
        </div>

        If {@code vkQueuePresentKHR} fails to enqueue the corresponding set of queue operations, it <b>may</b> return #ERROR_OUT_OF_HOST_MEMORY or #ERROR_OUT_OF_DEVICE_MEMORY. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced is unaffected by the call or its failure.

        If {@code vkQueuePresentKHR} fails in such a way that the implementation is unable to make that guarantee, the implementation <b>must</b> return #ERROR_DEVICE_LOST.

        However, if the presentation request is rejected by the presentation engine with an error #ERROR_OUT_OF_DATE_KHR, #ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT, or #ERROR_SURFACE_LOST_KHR, the set of queue operations are still considered to be enqueued and thus any semaphore wait operation specified in ##VkPresentInfoKHR will execute when the corresponding queue operation is complete.

        Calls to {@code vkQueuePresentKHR} <b>may</b> block, but <b>must</b> return in finite time.

        If any {@code swapchain} member of {@code pPresentInfo} was created with #FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT, #ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT will be returned if that swapchain does not have exclusive full-screen access, possibly for implementation-specific reasons outside of the application’s control.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>{@code pPresentInfo} <b>must</b> be a valid pointer to a valid ##VkPresentInfoKHR structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pPresentInfo→pWaitSemaphores}[] <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pPresentInfo→pSwapchains}[] <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>Any</td></tr></tbody>
        </table>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#SUBOPTIMAL_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_OUT_OF_DATE_KHR</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
                <li>#ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPresentInfoKHR
        """,

        VkQueue("queue", "a queue that is capable of presentation to the target surface’s platform on the same device as the image’s swapchain."),
        VkPresentInfoKHR.const.p("pPresentInfo", "a pointer to a ##VkPresentInfoKHR structure specifying parameters of the presentation.")
    )

    DependsOn("Vulkan11")..VkResult(
        "GetDeviceGroupPresentCapabilitiesKHR",
        """
        Query present capabilities from other physical devices.

        <h5>C Specification</h5>
        A logical device that represents multiple physical devices <b>may</b> support presenting from images on more than one physical device, or combining images from multiple physical devices.

        To query these capabilities, call:

        <pre><code>
￿VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
￿    VkDevice                                    device,
￿    VkDeviceGroupPresentCapabilitiesKHR*        pDeviceGroupPresentCapabilities);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pDeviceGroupPresentCapabilities} <b>must</b> be a valid pointer to a ##VkDeviceGroupPresentCapabilitiesKHR structure</li>
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
        ##VkDeviceGroupPresentCapabilitiesKHR
        """,

        VkDevice("device", "the logical device."),
        VkDeviceGroupPresentCapabilitiesKHR.p("pDeviceGroupPresentCapabilities", "a pointer to a ##VkDeviceGroupPresentCapabilitiesKHR structure in which the device’s capabilities are returned.")
    )

    DependsOn("Vulkan11")..VkResult(
        "GetDeviceGroupSurfacePresentModesKHR",
        """
        Query present capabilities for a surface.

        <h5>C Specification</h5>
        Some surfaces <b>may</b> not be capable of using all the device group present modes.

        To query the supported device group present modes for a particular surface, call:

        <pre><code>
￿VkResult vkGetDeviceGroupSurfacePresentModesKHR(
￿    VkDevice                                    device,
￿    VkSurfaceKHR                                surface,
￿    VkDeviceGroupPresentModeFlagsKHR*           pModes);</code></pre>

        <h5>Description</h5>
        The modes returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded. These modes <b>must</b> be a subset of the modes returned by #GetDeviceGroupPresentCapabilitiesKHR().

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code surface} <b>must</b> be supported by all physical devices associated with {@code device}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pModes} <b>must</b> be a valid pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} value</li>
            <li>Both of {@code device}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
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
        """,

        VkDevice("device", "the logical device."),
        VkSurfaceKHR("surface", "the surface."),
        Check(1)..VkDeviceGroupPresentModeFlagsKHR.p("pModes", "a pointer to a {@code VkDeviceGroupPresentModeFlagsKHR} in which the supported device group present modes for the surface are returned.")
    )

    DependsOn("Vulkan11")..VkResult(
        "GetPhysicalDevicePresentRectanglesKHR",
        """
        Query present rectangles for a surface on a physical device.

        <h5>C Specification</h5>
        When using #DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR, the application <b>may</b> need to know which regions of the surface are used when presenting locally on each physical device. Presentation of swapchain images to this surface need only have valid contents in the regions returned by this command.

        To query a set of rectangles used in presentation on the physical device, call:

        <pre><code>
￿VkResult vkGetPhysicalDevicePresentRectanglesKHR(
￿    VkPhysicalDevice                            physicalDevice,
￿    VkSurfaceKHR                                surface,
￿    uint32_t*                                   pRectCount,
￿    VkRect2D*                                   pRects);</code></pre>

        <h5>Description</h5>
        If {@code pRects} is {@code NULL}, then the number of rectangles used when presenting the given {@code surface} is returned in {@code pRectCount}. Otherwise, {@code pRectCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pRects} array, and on return the variable is overwritten with the number of structures actually written to {@code pRects}. If the value of {@code pRectCount} is less than the number of rectangles, at most {@code pRectCount} structures will be written, and #INCOMPLETE will be returned instead of #SUCCESS, to indicate that not all the available rectangles were returned.

        The values returned by this command are not invariant, and <b>may</b> change in response to the surface being moved, resized, or occluded.

        The rectangles returned by this command <b>must</b> not overlap.

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code surface} <b>must</b> be supported by {@code physicalDevice}, as reported by #GetPhysicalDeviceSurfaceSupportKHR() or an equivalent platform-specific mechanism</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code physicalDevice} <b>must</b> be a valid {@code VkPhysicalDevice} handle</li>
            <li>{@code surface} <b>must</b> be a valid {@code VkSurfaceKHR} handle</li>
            <li>{@code pRectCount} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
            <li>If the value referenced by {@code pRectCount} is not 0, and {@code pRects} is not {@code NULL}, {@code pRects} <b>must</b> be a valid pointer to an array of {@code pRectCount} ##VkRect2D structures</li>
            <li>Both of {@code physicalDevice}, and {@code surface} <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code surface} <b>must</b> be externally synchronized</li>
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
        ##VkRect2D
        """,

        VkPhysicalDevice("physicalDevice", "the physical device."),
        VkSurfaceKHR("surface", "the surface."),
        AutoSize("pRects")..Check(1)..uint32_t.p("pRectCount", "a pointer to an integer related to the number of rectangles available or queried, as described below."),
        nullable..VkRect2D.p("pRects", "either {@code NULL} or a pointer to an array of ##VkRect2D structures.")
    )

    DependsOn("Vulkan11")..VkResult(
        "AcquireNextImage2KHR",
        """
        Retrieve the index of the next available presentable image.

        <h5>C Specification</h5>
        To acquire an available presentable image to use, and retrieve the index of that image, call:

        <pre><code>
￿VkResult vkAcquireNextImage2KHR(
￿    VkDevice                                    device,
￿    const VkAcquireNextImageInfoKHR*            pAcquireInfo,
￿    uint32_t*                                   pImageIndex);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If the number of currently acquired images is greater than the difference between the number of images in the {@code swapchain} member of {@code pAcquireInfo} and the value of ##VkSurfaceCapabilitiesKHR{@code ::minImageCount} as returned by a call to #GetPhysicalDeviceSurfaceCapabilities2KHR() with the {@code surface} used to create {@code swapchain}, the {@code timeout} member of {@code pAcquireInfo} <b>must</b> not be {@code UINT64_MAX}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pAcquireInfo} <b>must</b> be a valid pointer to a valid ##VkAcquireNextImageInfoKHR structure</li>
            <li>{@code pImageIndex} <b>must</b> be a valid pointer to a {@code uint32_t} value</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
                <li>#TIMEOUT</li>
                <li>#NOT_READY</li>
                <li>#SUBOPTIMAL_KHR</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_OUT_OF_HOST_MEMORY</li>
                <li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
                <li>#ERROR_DEVICE_LOST</li>
                <li>#ERROR_OUT_OF_DATE_KHR</li>
                <li>#ERROR_SURFACE_LOST_KHR</li>
                <li>#ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAcquireNextImageInfoKHR
        """,

        VkDevice("device", "the device associated with {@code swapchain}."),
        VkAcquireNextImageInfoKHR.const.p("pAcquireInfo", "a pointer to a ##VkAcquireNextImageInfoKHR structure containing parameters of the acquire."),
        Check(1)..uint32_t.p("pImageIndex", "a pointer to a {@code uint32_t} that is set to the index of the next image to use.")
    )
}