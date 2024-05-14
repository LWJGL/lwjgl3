/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_video_maintenance1 = "KHRVideoMaintenance1".nativeClassVK("KHR_video_maintenance1", type = "device", postfix = "KHR") {
    documentation =
        """
        {@code VK_KHR_video_maintenance1} adds a collection of minor video coding features, none of which would warrant an entire extension of their own.

        The new features are as follows:

        <ul>
            <li>Allow creating buffers that can be used in video coding operations, independent of the used video profile, using the new buffer creation flag #BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR.</li>
            <li>Allow creating images that can be used as decode output or encode input pictures, independent of the used video profile, using the new image creation flag #IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR.</li>
            <li>Allow specifying queries used by video coding operations as part of the video coding command parameters, instead of using begin/end query when the video session is created using the new video session creation flag #VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR.</li>
        </ul>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_KHR_video_maintenance1}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>516</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd>{@link KHRVideoQueue VK_KHR_video_queue}</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Rakos <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_maintenance1]%20@aqnuep%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_maintenance1%20extension*">aqnuep</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_maintenance1.adoc">VK_KHR_video_maintenance1</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-07-27</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Ahmed Abdelkhalek, AMD</li>
                <li>Aidan Fabius, Core Avionics &amp; Industrial Inc.</li>
                <li>Ping Liu, Intel</li>
                <li>Lynne Iribarren, Independent</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
                <li>Daniel Rakos, RasterGrid</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "KHR_VIDEO_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_VIDEO_MAINTENANCE_1_EXTENSION_NAME".."VK_KHR_video_maintenance1"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_1_FEATURES_KHR".."1000515000",
        "STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR".."1000515001"
    )

    EnumConstant(
        "Extends {@code VkImageCreateFlagBits}.",

        "IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR".enum(0x00100000)
    )

    EnumConstant(
        "Extends {@code VkBufferCreateFlagBits}.",

        "BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR".enum(0x00000040)
    )

    EnumConstant(
        "Extends {@code VkVideoSessionCreateFlagBitsKHR}.",

        "VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR".enum(0x00000004)
    )
}