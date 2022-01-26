/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_video_decode_h265 = "EXTVideoDecodeH265".nativeClassVK("EXT_video_decode_h265", type = "device", postfix = "EXT") {
    documentation =
        """
        <ul>
            <li>
                Extending ##VkVideoCapabilitiesKHR:
                <ul>
                    <li>##VkVideoDecodeH265CapabilitiesEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoDecodeInfoKHR:
                <ul>
                    <li>##VkVideoDecodeH265PictureInfoEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoProfileKHR, ##VkQueryPoolCreateInfo, ##VkFormatProperties2, ##VkImageCreateInfo, ##VkImageViewCreateInfo, ##VkBufferCreateInfo:
                <ul>
                    <li>##VkVideoDecodeH265ProfileEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoReferenceSlotKHR:
                <ul>
                    <li>##VkVideoDecodeH265DpbSlotInfoEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoSessionCreateInfoKHR:
                <ul>
                    <li>##VkVideoDecodeH265SessionCreateInfoEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoSessionParametersCreateInfoKHR:
                <ul>
                    <li>##VkVideoDecodeH265SessionParametersCreateInfoEXT</li>
                </ul>
            </li>
            <li>
                Extending ##VkVideoSessionParametersUpdateInfoKHR:
                <ul>
                    <li>##VkVideoDecodeH265SessionParametersAddInfoEXT</li>
                </ul>
            </li>
        </ul>

        <h5>VK_EXT_video_decode_h265</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_video_decode_h265}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>188</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
                <li>Requires {@link KHRVideoDecodeQueue VK_KHR_video_decode_queue}</li>
                <li>This is a <em>provisional</em> extension and <b>must</b> be used with caution. See the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#boilerplate-provisional-header">description</a> of provisional header files for enablement and stability details.</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li><a target="_blank" href="mailto:peter.fang@amd.com">peter.fang@amd.com</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2021-03-29</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>HoHin Lau, AMD</li>
                <li>Jake Beju, AMD</li>
                <li>Peter Fang, AMD</li>
                <li>Ping Liu, Intel</li>
                <li>Srinath Kumarapuram, NVIDIA</li>
                <li>Tony Zlatinski, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VIDEO_DECODE_H265_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_VIDEO_DECODE_H265_EXTENSION_NAME".."VK_EXT_video_decode_h265"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VIDEO_DECODE_H265_CAPABILITIES_EXT".."1000187000",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_CREATE_INFO_EXT".."1000187001",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_CREATE_INFO_EXT".."1000187002",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_SESSION_PARAMETERS_ADD_INFO_EXT".."1000187003",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_PROFILE_EXT".."1000187004",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_EXT".."1000187005",
        "STRUCTURE_TYPE_VIDEO_DECODE_H265_DPB_SLOT_INFO_EXT".."1000187006"
    )

    EnumConstant(
        "Extends {@code VkVideoCodecOperationFlagBitsKHR}.",

        "VIDEO_CODEC_OPERATION_DECODE_H265_BIT_EXT".enum(0x00000002)
    )
}