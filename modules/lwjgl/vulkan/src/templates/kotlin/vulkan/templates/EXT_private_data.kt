/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_private_data = "EXTPrivateData".nativeClassVK("EXT_private_data", type = "device", postfix = EXT) {
    documentation =
        """
        The 'VK_EXT_private_data' extension is a device extension which enables attaching arbitrary payloads to Vulkan objects. It introduces the idea of private data slots as a means of storing a 64-bit unsigned integer of application defined data. Private data slots can be created or destroyed any time an associated device is available. Private data slots can be reserved at device creation time, and limiting use to the amount reserved will allow the extension to exhibit better performance characteristics.

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

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Matthew Rusch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_private_data]%20@mattruschnv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_private_data%20extension%3E%3E">mattruschnv</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2020-03-25</dd>

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
        """
        Create a slot for private data storage.

        <h5>C Specification</h5>
        To create a private data slot, call:

        <pre><code>
￿VkResult vkCreatePrivateDataSlotEXT(
￿    VkDevice                                    device,
￿    const VkPrivateDataSlotCreateInfoEXT*       pCreateInfo,
￿    const VkAllocationCallbacks*                pAllocator,
￿    VkPrivateDataSlotEXT*                       pPrivateDataSlot);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\#features-privateData">{@code privateData}</a> feature <b>must</b> be enabled</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid ##VkPrivateDataSlotCreateInfoEXT structure</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>{@code pPrivateDataSlot} <b>must</b> be a valid pointer to a {@code VkPrivateDataSlotEXT} handle</li>
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
            </ul></dd>
        </dl>

        <h5>See Also</h5>
        ##VkAllocationCallbacks, ##VkPrivateDataSlotCreateInfoEXT
        """,

        VkDevice("device", "the logical device associated with the creation of the object(s) holding the private data slot."),
        VkPrivateDataSlotCreateInfoEXT.const.p("pCreateInfo", "a pointer to a ##VkPrivateDataSlotCreateInfoEXT"),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter."),
        Check(1)..VkPrivateDataSlotEXT.p("pPrivateDataSlot", "a pointer to a {@code VkPrivateDataSlotEXT} handle in which the resulting private data slot is returned")
    )

    void(
        "DestroyPrivateDataSlotEXT",
        """
        Destroy a private data slot.

        <h5>C Specification</h5>
        To destroy a private data slot, call:

        <pre><code>
￿void vkDestroyPrivateDataSlotEXT(
￿    VkDevice                                    device,
￿    VkPrivateDataSlotEXT                        privateDataSlot,
￿    const VkAllocationCallbacks*                pAllocator);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>If ##VkAllocationCallbacks were provided when {@code privateDataSlot} was created, a compatible set of callbacks <b>must</b> be provided here</li>
            <li>If no ##VkAllocationCallbacks were provided when {@code privateDataSlot} was created, {@code pAllocator} <b>must</b> be {@code NULL}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>If {@code privateDataSlot} is not #NULL_HANDLE, {@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlotEXT} handle</li>
            <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid ##VkAllocationCallbacks structure</li>
            <li>If {@code privateDataSlot} is a valid handle, it <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>

        <h5>Host Synchronization</h5>
        <ul>
            <li>Host access to {@code privateDataSlot} <b>must</b> be externally synchronized</li>
        </ul>

        <h5>See Also</h5>
        ##VkAllocationCallbacks
        """,

        VkDevice("device", "the logical device associated with the creation of the object(s) holding the private data slot."),
        VkPrivateDataSlotEXT("privateDataSlot", "the private data slot to destroy."),
        nullable..VkAllocationCallbacks.const.p("pAllocator", "controls host memory allocation as described in the <a target=\"_blank\" href=\"https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html\\#memory-allocation\">Memory Allocation</a> chapter.")
    )

    VkResult(
        "SetPrivateDataEXT",
        """
        Associate data with a Vulkan object.

        <h5>C Specification</h5>
        To store user defined data in a slot associated with a Vulkan object, call:

        <pre><code>
￿VkResult vkSetPrivateDataEXT(
￿    VkDevice                                    device,
￿    VkObjectType                                objectType,
￿    uint64_t                                    objectHandle,
￿    VkPrivateDataSlotEXT                        privateDataSlot,
￿    uint64_t                                    data);</code></pre>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectHandle} <b>must</b> be {@code device} or a child of {@code device}</li>
            <li>{@code objectHandle} <b>must</b> be a valid handle to an object of type {@code objectType}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
            <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlotEXT} handle</li>
            <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
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
            </ul></dd>
        </dl>
        """,

        VkDevice("device", "the device that created the object."),
        VkObjectType("objectType", "a {@code VkObjectType} specifying the type of object to associate data with."),
        uint64_t("objectHandle", "a handle to the object to associate data with."),
        VkPrivateDataSlotEXT("privateDataSlot", "a handle to a {@code VkPrivateDataSlotEXT} specifying location of private data storage."),
        uint64_t("data", "user defined data to associate the object with. This data will be stored at {@code privateDataSlot}.")
    )

    void(
        "GetPrivateDataEXT",
        """
        Retrieve data associated with a Vulkan object.

        <h5>C Specification</h5>
        To retrieve user defined data from a slot associated with a Vulkan object, call:

        <pre><code>
￿void vkGetPrivateDataEXT(
￿    VkDevice                                    device,
￿    VkObjectType                                objectType,
￿    uint64_t                                    objectHandle,
￿    VkPrivateDataSlotEXT                        privateDataSlot,
￿    uint64_t*                                   pData);</code></pre>

        <h5>Description</h5>
        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        Due to platform details on Android, implementations might not be able to reliably return 0 from calls to {@code vkGetPrivateDataEXT} for {@code VkSwapchainKHR} objects on which {@code vkSetPrivateDataEXT} has not previously been called. This erratum is exclusive to the Android platform and objects of type {@code VkSwapchainKHR}.
        </div>

        <h5>Valid Usage</h5>
        <ul>
            <li>{@code objectType} <b>must</b> be #OBJECT_TYPE_DEVICE, or an object type whose parent is {@code VkDevice}</li>
        </ul>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code objectType} <b>must</b> be a valid {@code VkObjectType} value</li>
            <li>{@code privateDataSlot} <b>must</b> be a valid {@code VkPrivateDataSlotEXT} handle</li>
            <li>{@code pData} <b>must</b> be a valid pointer to a {@code uint64_t} value</li>
            <li>{@code privateDataSlot} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
        </ul>
        """,

        VkDevice("device", "the device that created the object"),
        VkObjectType("objectType", "a {@code VkObjectType} specifying the type of object data is associated with."),
        uint64_t("objectHandle", "a handle to the object data is associated with."),
        VkPrivateDataSlotEXT("privateDataSlot", "a handle to a {@code VkPrivateDataSlotEXT} specifying location of private data pointer storage."),
        Check(1)..uint64_t.p("pData", "a pointer to specify where user data is returned. 0 will be written in the absence of a previous call to {@code vkSetPrivateDataEXT} using the object specified by {@code objectHandle}.")
    )
}