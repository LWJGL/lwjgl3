/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * In a Vulkan implementation that is layered on top of Metal on Apple device platforms, this extension provides the ability to import and export the underlying Metal objects associated with specific Vulkan objects.
 * 
 * <p>As detailed in the <a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_metal_objects.adoc">extension proposal document</a>, this extension adds one new Vulkan command, {@link #vkExportMetalObjectsEXT ExportMetalObjectsEXT}, to export underlying Metal objects from Vulkan objects, and supports importing the appropriate existing Metal objects when creating Vulkan objects of types {@code VkDeviceMemory}, {@code VkImage}, {@code VkSemaphore}, and {@code VkEvent},</p>
 * 
 * <p>The intent is that this extension will be advertised and supported only on implementations that are layered on top of Metal on Apple device platforms.</p>
 * 
 * <h5>VK_EXT_metal_objects</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_metal_objects}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>312</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Bill Hollings <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_metal_objects]%20@billhollings%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_metal_objects%20extension*">billhollings</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_metal_objects.adoc">VK_EXT_metal_objects</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-05-28</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Bill Hollings, The Brenwill Workshop Ltd.</li>
 * <li>Dzmitry Malyshau, Mozilla Corp.</li>
 * </ul></dd>
 * </dl>
 */
public class EXTMetalObjects {

    /** The extension specification version. */
    public static final int VK_EXT_METAL_OBJECTS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_METAL_OBJECTS_EXTENSION_NAME = "VK_EXT_metal_objects";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECT_CREATE_INFO_EXT = 1000311000,
        VK_STRUCTURE_TYPE_EXPORT_METAL_OBJECTS_INFO_EXT       = 1000311001,
        VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT        = 1000311002,
        VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT = 1000311003,
        VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT        = 1000311004,
        VK_STRUCTURE_TYPE_IMPORT_METAL_BUFFER_INFO_EXT        = 1000311005,
        VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT       = 1000311006,
        VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT       = 1000311007,
        VK_STRUCTURE_TYPE_EXPORT_METAL_IO_SURFACE_INFO_EXT    = 1000311008,
        VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT    = 1000311009,
        VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT  = 1000311010,
        VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT  = 1000311011;

    /**
     * VkExportMetalObjectTypeFlagBitsEXT - Bitmask specifying Metal object types that can be exported from a Vulkan object
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT} indicates a Metal {@code MTLDevice} may be exported.</li>
     * <li>{@link #VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT} indicates a Metal {@code MTLCommandQueue} may be exported.</li>
     * <li>{@link #VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT} indicates a Metal {@code MTLBuffer} may be exported.</li>
     * <li>{@link #VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT} indicates a Metal {@code MTLTexture} may be exported.</li>
     * <li>{@link #VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT} indicates a Metal {@code IOSurface} may be exported.</li>
     * <li>{@link #VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT} indicates a Metal {@code MTLSharedEvent} may be exported.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExportMetalObjectCreateInfoEXT}</p>
     */
    public static final int
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT        = 0x1,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT = 0x2,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT        = 0x4,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT       = 0x8,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT     = 0x10,
        VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT  = 0x20;

    protected EXTMetalObjects() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkExportMetalObjectsEXT ] ---

    /** Unsafe version of: {@link #vkExportMetalObjectsEXT ExportMetalObjectsEXT} */
    public static void nvkExportMetalObjectsEXT(VkDevice device, long pMetalObjectsInfo) {
        long __functionAddress = device.getCapabilities().vkExportMetalObjectsEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(device.address(), pMetalObjectsInfo, __functionAddress);
    }

    /**
     * Export Metal objects from the corresponding Vulkan objects.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To export Metal objects that underlie Vulkan objects, call:</p>
     * 
     * <pre><code>
     * void vkExportMetalObjectsEXT(
     *     VkDevice                                    device,
     *     VkExportMetalObjectsInfoEXT*                pMetalObjectsInfo);</code></pre>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pMetalObjectsInfo} <b>must</b> be a valid pointer to a {@link VkExportMetalObjectsInfoEXT} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkExportMetalObjectsInfoEXT}</p>
     *
     * @param device            the device that created the Vulkan objects.
     * @param pMetalObjectsInfo a pointer to a {@link VkExportMetalObjectsInfoEXT} structure whose {@code pNext} chain contains structures, each identifying a Vulkan object and providing a pointer through which the Metal object will be returned.
     */
    public static void vkExportMetalObjectsEXT(VkDevice device, @NativeType("VkExportMetalObjectsInfoEXT *") VkExportMetalObjectsInfoEXT pMetalObjectsInfo) {
        nvkExportMetalObjectsEXT(device, pMetalObjectsInfo.address());
    }

}