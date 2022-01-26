/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_private_data = "EXTPrivateData".nativeClassVK("EXT_private_data", type = "device", postfix = "EXT") {
    documentation =
        """
        This extension is a device extension which enables attaching arbitrary payloads to Vulkan objects. It introduces the idea of private data slots as a means of storing a 64-bit unsigned integer of application defined data. Private data slots can be created or destroyed any time an associated device is available. Private data slots can be reserved at device creation time, and limiting use to the amount reserved will allow the extension to exhibit better performance characteristics.

        <h5>Promotion to Vulkan 1.3</h5>
        Functionality in this extension is included in core Vulkan 1.3, with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.

        <h5>Examples</h5>
        <ul>
            <li>In progress</li>
        </ul>

        <h5>VK_EXT_private_data</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_private_data}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>296</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Deprecation state</b></dt>
            <dd><ul>
                <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\#versions-1.3-promotions">Vulkan 1.3</a></li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthew Rusch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_private_data]%20@mattruschnv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_private_data%20extension%3E%3E">mattruschnv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-03-25</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>Promoted to Vulkan 1.3 Core</li>
            </ul></dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Matthew Rusch, NVIDIA</li>
                <li>Nuno Subtil, NVIDIA</li>
                <li>Piers Daniell, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_PRIVATE_DATA_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_PRIVATE_DATA_EXTENSION_NAME".."VK_EXT_private_data"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIVATE_DATA_FEATURES_EXT".."1000295000",
        "STRUCTURE_TYPE_DEVICE_PRIVATE_DATA_CREATE_INFO_EXT".."1000295001",
        "STRUCTURE_TYPE_PRIVATE_DATA_SLOT_CREATE_INFO_EXT".."1000295002"
    )

    EnumConstant(
        "Extends {@code VkObjectType}.",

        "OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT".."1000295000"
    )

    VkResult(
        "CreatePrivateDataSlotEXT",
        "See #CreatePrivateDataSlot().",

        VkDevice("device", "the logical device associated with the creation of the object(s) holding the private data slot."),
        VkPrivateDataSlotCreateInfo.const.p("pCreateInfo", "a pointer to a ##VkPrivateDataSlotCreateInfo"),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkPrivateDataSlot.p("pPrivateDataSlot", "a pointer to a {@code VkPrivateDataSlot} handle in which the resulting private data slot is returned")
    )

    void(
        "DestroyPrivateDataSlotEXT",
        "See #DestroyPrivateDataSlot().",

        VkDevice("device", "the logical device associated with the creation of the object(s) holding the private data slot."),
        VkPrivateDataSlot("privateDataSlot", "the private data slot to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "SetPrivateDataEXT",
        "See #SetPrivateData().",

        VkDevice("device", "the device that created the object."),
        VkObjectType("objectType", "a {@code VkObjectType} specifying the type of object to associate data with."),
        uint64_t("objectHandle", "a handle to the object to associate data with."),
        VkPrivateDataSlot("privateDataSlot", "a handle to a {@code VkPrivateDataSlot} specifying location of private data storage."),
        uint64_t("data", "user defined data to associate the object with. This data will be stored at {@code privateDataSlot}.")
    )

    void(
        "GetPrivateDataEXT",
        "See #GetPrivateData().",

        VkDevice("device", "the device that created the object"),
        VkObjectType("objectType", "a {@code VkObjectType} specifying the type of object data is associated with."),
        uint64_t("objectHandle", "a handle to the object data is associated with."),
        VkPrivateDataSlot("privateDataSlot", "a handle to a {@code VkPrivateDataSlot} specifying location of private data pointer storage."),
        Check(1)..uint64_t.p("pData", "a pointer to specify where user data is returned. 0 will be written in the absence of a previous call to {@code vkSetPrivateData} using the object specified by {@code objectHandle}.")
    )
}