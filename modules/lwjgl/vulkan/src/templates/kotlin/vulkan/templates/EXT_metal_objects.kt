/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_metal_objects = "EXTMetalObjects".nativeClassVK("EXT_metal_objects", type = "device", postfix = "EXT") {
    documentation =
        """
        In a Vulkan implementation that is layered on top of Metal on Apple device platforms, this extension provides the ability to import and export the underlying Metal objects associated with specific Vulkan objects.

        As detailed in the <a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_metal_objects.adoc">extension proposal document</a>, this extension adds one new Vulkan command, #ExportMetalObjectsEXT(), to export underlying Metal objects from Vulkan objects, and supports importing the appropriate existing Metal objects when creating Vulkan objects of types {@code VkDeviceMemory}, {@code VkImage}, {@code VkSemaphore}, and {@code VkEvent},

        The intent is that this extension will be advertised and supported only on implementations that are layered on top of Metal on Apple device platforms.

        <h5>VK_EXT_metal_objects</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_metal_objects}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>312</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Bill Hollings <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_metal_objects]%20@billhollings%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_metal_objects%20extension*">billhollings</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_metal_objects.adoc">VK_EXT_metal_objects</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2022-05-28</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Bill Hollings, The Brenwill Workshop Ltd.</li>
                <li>Dzmitry Malyshau, Mozilla Corp.</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_METAL_OBJECTS_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "EXT_METAL_OBJECTS_EXTENSION_NAME".."VK_EXT_metal_objects"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT".."1000311000",
        "STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT".."1000311001",
        "STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT".."1000311002",
        "STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT".."1000311003",
        "STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT".."1000311004",
        "STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT".."1000311005",
        "STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT".."1000311006",
        "STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT".."1000311007",
        "STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT".."1000311008",
        "STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT".."1000311009",
        "STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT".."1000311010",
        "STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT".."1000311011"
    )

    EnumConstant(
        """
        VkExportMetalObjectTypeFlagBitsEXT - Bitmask specifying Metal object types that can be exported from a Vulkan object

        <h5>Description</h5>
        <ul>
            <li>#EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT indicates a Metal {@code MTLDevice} may be exported.</li>
            <li>#EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT indicates a Metal {@code MTLCommandQueue} may be exported.</li>
            <li>#EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT indicates a Metal {@code MTLBuffer} may be exported.</li>
            <li>#EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT indicates a Metal {@code MTLTexture} may be exported.</li>
            <li>#EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT indicates a Metal {@code IOSurface} may be exported.</li>
            <li>#EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT indicates a Metal {@code MTLSharedEvent} may be exported.</li>
        </ul>

        <h5>See Also</h5>
        ##VkExportMetalObjectCreateInfoEXT
        """,

        "EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT".enum(0x00000001),
        "EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT".enum(0x00000002),
        "EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT".enum(0x00000004),
        "EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT".enum(0x00000008),
        "EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT".enum(0x00000010),
        "EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT".enum(0x00000020)
    )

    void(
        "ExportMetalObjectsEXT",
        """
        Export Metal objects from the corresponding Vulkan objects.

        <h5>C Specification</h5>
        To export Metal objects that underlie Vulkan objects, call:

        <pre><code>
￿void vkExportMetalObjectsEXT(
￿    VkDevice                                    device,
￿    VkExportMetalObjectsInfoEXT*                pMetalObjectsInfo);</code></pre>

        <h5>Valid Usage (Implicit)</h5>
        <ul>
            <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
            <li>{@code pMetalObjectsInfo} <b>must</b> be a valid pointer to a ##VkExportMetalObjectsInfoEXT structure</li>
        </ul>

        <h5>See Also</h5>
        ##VkExportMetalObjectsInfoEXT
        """,

        VkDevice("device", "the device that created the Vulkan objects."),
        VkExportMetalObjectsInfoEXT.p("pMetalObjectsInfo", "a pointer to a ##VkExportMetalObjectsInfoEXT structure whose {@code pNext} chain contains structures, each identifying a Vulkan object and providing a pointer through which the Metal object will be returned.")
    )
}