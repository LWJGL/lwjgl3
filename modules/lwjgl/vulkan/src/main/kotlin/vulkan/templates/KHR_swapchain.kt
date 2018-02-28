/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_swapchain = "KHRSwapchain".nativeClassVK("KHR_swapchain", type = "device", postfix = KHR) {
    documentation =
        """
        The {@code VK_KHR_swapchain} extension is the device-level companion to the {@link KHRSurface VK_KHR_surface} extension. It introduces {@code VkSwapchainKHR} objects, which provide the ability to present rendering results to a surface.

        <h5>Examples</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The example code for the {@link KHRSurface VK_KHR_surface} and {@code VK_KHR_swapchain} extensions was removed from the appendix after revision 1.0.29. This WSI example code was ported to the cube demo that is shipped with the official Khronos SDK, and is being kept up-to-date in that location (see: https://github.com/KhronosGroup/Vulkan-LoaderAndValidationLayers/blob/master/demos/cube.c).
        </div>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_swapchain}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>2</dd>

            <dt><b>Revision</b></dt>
            <dd>68</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRSurface VK_KHR_surface}</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>James Jones @cubanismo,Ian Elliott mailto:ianelliott@google.com[ianelliott@google.com]</li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2016-05-04</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

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

        "KHR_SWAPCHAIN_SPEC_VERSION".."68"
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

    VkResult(
        "CreateSwapchainKHR",
        """
        Create a swapchain.

        <h5>C Specification</h5>
        To create a swapchain, call:

        <code><pre>
￿VkResult vkCreateSwapchainKHR(
￿    VkDevice                                    device,
￿    const VkSwapchainCreateInfoKHR*             pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkSwapchainKHR*                             pSwapchain);</pre></code>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkSwapchainCreateInfoKHR structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pSwapchain} <b>must</b> be a valid pointer to a {@code VkSwapchainKHR} handle</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code pCreateInfo.surface} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pCreateInfo.oldSwapchain} <b>must</b> be externally synchronized</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkSwapchainCreateInfoKHR
        """,

        VkDevice.IN("device", "the device to create the swapchain for."),
        VkSwapchainCreateInfoKHR.const.p.IN("pCreateInfo", "a pointer to an instance of the ##VkSwapchainCreateInfoKHR structure specifying the parameters of the created swapchain."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>)."),
        Check(1)..VkSwapchainKHR.p.OUT("pSwapchain", "a pointer to a {@code VkSwapchainKHR} handle in which the created swapchain object will be returned.")
    )

    void(
        "DestroySwapchainKHR",
        """
        Destroy a swapchain object.

        <h5>C Specification</h5>
        To destroy a swapchain object call:

        <code><pre>
￿void vkDestroySwapchainKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    const VkAllocationCallbacks*                pAllocator);</pre></code>

        <h5>Description</h5>
        The application <b>must</b> not destroy a swapchain until after completion of all outstanding operations on images that were acquired from the swapchain. {@code swapchain} and all associated {@code VkImage} handles are destroyed, and <b>must</b> not be acquired or used any more by the application. The memory of each {@code VkImage} will only be freed after that image is no longer used by the presentation engine. For example, if one image of the swapchain is being displayed in a window, the memory for that image <b>may</b> not be freed until the window is destroyed, or another swapchain is created for the window. Destroying the swapchain does not invalidate the parent {@code VkSurfaceKHR}, and a new swapchain <b>can</b> be created with it.

        When a swapchain associated with a display surface is destroyed, if the image most recently presented to the display surface is from the swapchain being destroyed, then either any display resources modified by presenting images from any swapchain associated with the display surface <b>must</b> be reverted by the implementation to their state prior to the first present performed on one of these swapchains, or such resources <b>must</b> be left in their current state.

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
            <li>Both of {@code device}, and {@code swapchain} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code swapchain} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice.IN("device", "the {@code VkDevice} associated with {@code swapchain}."),
        VkSwapchainKHR.IN("swapchain", "the swapchain to destroy."),
        nullable..VkAllocationCallbacks.const.p.IN("pAllocator", "the allocator used for host memory allocated for the swapchain object when there is no more specific allocator available (see <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a>).")
    )

    VkResult(
        "GetSwapchainImagesKHR",
        """
        Obtain the array of presentable images associated with a swapchain.

        <h5>C Specification</h5>
        To obtain the array of presentable images associated with a swapchain, call:

        <code><pre>
￿VkResult vkGetSwapchainImagesKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    uint32_t*                                   pSwapchainImageCount,
￿    VkImage*                                    pSwapchainImages);</pre></code>

        <h5>Description</h5>
        If {@code pSwapchainImages} is {@code NULL}, then the number of presentable images for {@code swapchain} is returned in {@code pSwapchainImageCount}. Otherwise, {@code pSwapchainImageCount} <b>must</b> point to a variable set by the user to the number of elements in the {@code pSwapchainImages} array, and on return the variable is overwritten with the number of structures actually written to {@code pSwapchainImages}. If the value of {@code pSwapchainImageCount} is less than the number of presentable images for {@code swapchain}, at most {@code pSwapchainImageCount} structures will be written. If {@code pSwapchainImageCount} is smaller than the number of presentable images for {@code swapchain}, #INCOMPLETE will be returned instead of #SUCCESS to indicate that not all the available values were returned.

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

        VkDevice.IN("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR.IN("swapchain", "the swapchain to query."),
        AutoSize("pSwapchainImages")..Check(1)..uint32_t.p.INOUT("pSwapchainImageCount", "a pointer to an integer related to the number of presentable images available or queried, as described below."),
        nullable..VkImage.p.OUT("pSwapchainImages", "either {@code NULL} or a pointer to an array of {@code VkImage} handles.")
    )

    VkResult(
        "AcquireNextImageKHR",
        """
        Retrieve the index of the next available presentable image.

        <h5>C Specification</h5>
        To acquire an available presentable image to use, and retrieve the index of that image, call:

        <code><pre>
￿VkResult vkAcquireNextImageKHR(
￿    VkDevice                                    device,
￿    VkSwapchainKHR                              swapchain,
￿    uint64_t                                    timeout,
￿    VkSemaphore                                 semaphore,
￿    VkFence                                     fence,
￿    uint32_t*                                   pImageIndex);</pre></code>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code swapchain} <b>must</b> not be in the retired state</li>
            <li>If {@code semaphore} is not #NULL_HANDLE it <b>must</b> be unsignaled</li>
            <li>If {@code semaphore} is not #NULL_HANDLE it <b>must</b> not have any uncompleted signal or wait operations pending</li>
            <li>If {@code fence} is not #NULL_HANDLE it <b>must</b> be unsignaled and <b>must</b> not be associated with any other queue command that has not yet completed execution on that queue</li>
            <li>{@code semaphore} and {@code fence} <b>must</b> not both be equal to #NULL_HANDLE</li>
            <li>If the number of currently acquired images is greater than the difference between the number of images in {@code swapchain} and the value of ##VkSurfaceCapabilitiesKHR{@code ::minImageCount} as returned by a call to #GetPhysicalDeviceSurfaceCapabilities2KHR() with the {@code surface} used to create {@code swapchain}, {@code timeout} <b>must</b> not be {@code UINT64_MAX}</li>
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
            <li>Both of {@code device}, and {@code swapchain} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkInstance}</li>
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
            </ul></dd>
        </dl>
        """,

        VkDevice.IN("device", "the device associated with {@code swapchain}."),
        VkSwapchainKHR.IN("swapchain", "the non-retired swapchain from which an image is being acquired."),
        uint64_t.IN("timeout", "indicates how long the function waits, in nanoseconds, if no image is available."),
        VkSemaphore.IN("semaphore", "#NULL_HANDLE or a semaphore to signal."),
        VkFence.IN("fence", "#NULL_HANDLE or a fence to signal."),
        Check(1)..uint32_t.p.OUT("pImageIndex", "a pointer to a {@code uint32_t} that is set to the index of the next image to use (i.e. an index into the array of images returned by #GetSwapchainImagesKHR()).")
    )

    VkResult(
        "QueuePresentKHR",
        """
        Queue an image for presentation.

        <h5>C Specification</h5>
        After queueing all rendering commands and transitioning the image to the correct layout, to queue an image for presentation, call:

        <code><pre>
￿VkResult vkQueuePresentKHR(
￿    VkQueue                                     queue,
￿    const VkPresentInfoKHR*                     pPresentInfo);</pre></code>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        There is no requirement for an application to present images in the same order that they were acquired - applications can arbitrarily present any image that is currently acquired.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>Each element of {@code pSwapchains} member of {@code pPresentInfo} <b>must</b> be a swapchain that is created for a surface for which presentation is supported from {@code queue} as determined using a call to #GetPhysicalDeviceSurfaceSupportKHR()</li>
            <li>If more than one member of {@code pSwapchains} was created from a display surface, all display surfaces referenced that refer to the same display <b>must</b> use the same display mode</li>
            <li>When a semaphore unsignal operation defined by the elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} executes on {@code queue}, no other queue <b>must</b> be waiting on the same semaphore.</li>
            <li>All elements of the {@code pWaitSemaphores} member of {@code pPresentInfo} <b>must</b> be semaphores that are signaled, or have <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-semaphores-signaling">semaphore signal operations</a> previously submitted for execution.</li>
        </ul>

        Any writes to memory backing the images referenced by the {@code pImageIndices} and {@code pSwapchains} members of {@code pPresentInfo}, that are available before #QueuePresentKHR() is executed, are automatically made visible to the read access performed by the presentation engine. This automatic visibility operation for an image happens-after the semaphore signal operation, and happens-before the presentation engine accesses the image.

        Queueing an image for presentation defines a set of <em>queue operations</em>, including waiting on the semaphores and submitting a presentation request to the presentation engine. However, the scope of this set of queue operations does not include the actual processing of the image by the presentation engine.

        If #QueuePresentKHR() fails to enqueue the corresponding set of queue operations, it <b>may</b> return #ERROR_OUT_OF_HOST_MEMORY or #ERROR_OUT_OF_DEVICE_MEMORY. If it does, the implementation <b>must</b> ensure that the state and contents of any resources or synchronization primitives referenced is unaffected by the call or its failure.

        If #QueuePresentKHR() fails in such a way that the implementation <b>can</b> not make that guarantee, the implementation <b>must</b> return #ERROR_DEVICE_LOST.

        However, if the presentation request is rejected by the presentation engine with an error #ERROR_OUT_OF_DATE_KHR or #ERROR_SURFACE_LOST_KHR, the set of queue operations are still considered to be enqueued and thus any semaphore to be waited on gets unsignaled when the corresponding queue operation is complete.

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code queue} <b>must</b> be a valid {@code VkQueue} handle</li>
            <li>{@code pPresentInfo} <b>must</b> be a valid pointer to a valid ##VkPresentInfoKHR structure</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code queue} <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pPresentInfo.pWaitSemaphores}[] <b>must</b> be externally synchronized</li>
            <li>Host access to {@code pPresentInfo.pSwapchains}[] <b>must</b> be externally synchronized</li>
        </ul>

        <h5>Command Properties</h5>
        <table class="lwjgl">
            <thead><tr><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html\#synchronization-pipeline-stages-types">Pipeline Type</a></th></tr></thead>
            <tbody><tr><td>-</td><td>-</td><td>Any</td><td>-</td></tr></tbody>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkPresentInfoKHR
        """,

        VkQueue.IN("queue", "a queue that is capable of presentation to the target surface&#8217;s platform on the same device as the image&#8217;s swapchain."),
        VkPresentInfoKHR.const.p.IN("pPresentInfo", "a pointer to an instance of the ##VkPresentInfoKHR structure specifying the parameters of the presentation.")
    )
}