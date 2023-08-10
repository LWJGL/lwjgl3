/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_swapchain_maintenance1 = "EXTSwapchainMaintenance1".nativeClassVK("EXT_swapchain_maintenance1", type = "device", postfix = "EXT") {
    documentation =
        """
        {@link EXTSwapchainMaintenance1 VK_EXT_swapchain_maintenance1} adds a collection of window system integration features that were intentionally left out or overlooked in the original {@link KHRSwapchain VK_KHR_swapchain} extension.

        The new features are as follows:

        <ul>
            <li>Specify a fence that will be signaled when the resources associated with a present operation <b>can</b> be safely destroyed.</li>
            <li>Allow changing the present mode a swapchain is using at per-present granularity.</li>
            <li>Allow applications to define the behavior when presenting a swapchain image to a surface with different dimensions than the image. Using this feature <b>may</b> allow implementations to avoid returning #ERROR_OUT_OF_DATE_KHR in this situation.</li>
            <li>Allow applications to defer swapchain memory allocation for improved startup time and memory footprint.</li>
            <li>Allow applications to release previously acquired images without presenting them.</li>
        </ul>

        <h5>VK_EXT_swapchain_maintenance1</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_swapchain_maintenance1}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>276</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRSwapchain VK_KHR_swapchain} and {@link EXTSurfaceMaintenance1 VK_EXT_surface_maintenance1} and {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_swapchain_maintenance1]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_swapchain_maintenance1%20extension*">syoussefi</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_swapchain_maintenance1.adoc">VK_EXT_swapchain_maintenance1</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-10-28</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Jeff Juliano, NVIDIA</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Chris Forbes, Google</li>
                <li>Ian Elliott, Google</li>
                <li>Yiwei Zhang, Google</li>
                <li>Charlie Lao, Google</li>
                <li>Lina Versace, Google</li>
                <li>Ralph Potter, Samsung</li>
                <li>Igor Nazarov, Samsung</li>
                <li>Hyunchang Kim, Samsung</li>
                <li>Suenghwan Lee, Samsung</li>
                <li>Munseong Kang, Samsung</li>
                <li>Joonyong Park, Samsung</li>
                <li>Hans-Kristian Arntzen, Valve</li>
                <li>Lisa Wu, Arm</li>
                <li>Daniel Stone, Collabora</li>
                <li>Pan Gao, Huawei</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_SWAPCHAIN_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_SWAPCHAIN_MAINTENANCE_1_EXTENSION_NAME".."VK_EXT_swapchain_maintenance1"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT".."1000275000",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT".."1000275001",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODES_CREATE_INFO_EXT".."1000275002",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_MODE_INFO_EXT".."1000275003",
        "STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT".."1000275004",
        "STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT".."1000275005"
    )

    EnumConstant(
        "Extends {@code VkSwapchainCreateFlagBitsKHR}.",

        "SWAPCHAIN_CREATE_DEFERRED_MEMORY_ALLOCATION_BIT_EXT".enum(0x00000008)
    )

    VkResult(
        "ReleaseSwapchainImagesEXT",
        """
        Release previously acquired but unused images.

        <h5>C Specification</h5>
        To release images previously acquired through #AcquireNextImage2KHR() or #AcquireNextImageKHR(), call:

        <pre><code>
￿VkResult vkReleaseSwapchainImagesEXT(
￿    VkDevice                                    device,
￿    const VkReleaseSwapchainImagesInfoEXT*      pReleaseInfo);</code></pre>

        <h5>Description</h5>
        Only images that are not in use by the device <b>can</b> be released.

        Releasing images is a read-only operation that will not affect the content of the released images. Upon reacquiring the image, the image contents and its layout will be the same as they were prior to releasing it. However, if a mechanism other than Vulkan is used to modify the platform window associated with the swapchain, the content of all presentable images in the swapchain becomes undefined.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        This functionality is useful during swapchain recreation, where acquired images from the old swapchain can be released instead of presented.
        </div>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pReleaseInfo} <b>must</b> be a valid pointer to a valid ##VkReleaseSwapchainImagesInfoEXT structure</li>
        </ul>

        <h5>Return Codes</h5>
        <dl>
            <dt>On success, this command returns</dt>
            <dd><ul>
                <li>#SUCCESS</li>
            </ul></dd>

            <dt>On failure, this command returns</dt>
            <dd><ul>
                <li>#ERROR_SURFACE_LOST_KHR</li>
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkReleaseSwapchainImagesInfoEXT
        """,

        VkDevice("device", "the device associated with ##VkReleaseSwapchainImagesInfoEXT{@code ::swapchain}."),
        VkReleaseSwapchainImagesInfoEXT.const.p("pReleaseInfo", "a pointer to a ##VkReleaseSwapchainImagesInfoEXT structure containing parameters of the release.")
    )
}