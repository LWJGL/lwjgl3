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
 * This extension provides versions of {@link VK10#vkBindBufferMemory BindBufferMemory} and {@link VK10#vkBindImageMemory BindImageMemory} that allow multiple bindings to be performed at once, and are extensible.
 * 
 * <p>This extension also introduces {@link #VK_IMAGE_CREATE_ALIAS_BIT_KHR IMAGE_CREATE_ALIAS_BIT_KHR}, which allows “{@code identical}” images that alias the same memory to interpret the contents consistently, even across image layout changes.</p>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>VK_KHR_bind_memory2</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_bind_memory2}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>158</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_bind_memory2]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_bind_memory2%20extension%3E%3E">tobski</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Tobias Hector, Imagination Technologies</li>
 * </ul></dd>
 * </dl>
 */
public class KHRBindMemory2 {

    /** The extension specification version. */
    public static final int VK_KHR_BIND_MEMORY_2_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO_KHR = 1000157000,
        VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO_KHR  = 1000157001;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_ALIAS_BIT_KHR = 0x400;

    protected KHRBindMemory2() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkBindBufferMemory2KHR ] ---

    /**
     * Unsafe version of: {@link #vkBindBufferMemory2KHR BindBufferMemory2KHR}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindBufferMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindBufferMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /**
     * See {@link VK11#vkBindBufferMemory2 BindBufferMemory2}.
     *
     * @param device     the logical device that owns the buffers and memory.
     * @param pBindInfos a pointer to an array of {@code bindInfoCount} {@link VkBindBufferMemoryInfo} structures describing buffers and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindBufferMemory2KHR(VkDevice device, @NativeType("VkBindBufferMemoryInfo const *") VkBindBufferMemoryInfo.Buffer pBindInfos) {
        return nvkBindBufferMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

    // --- [ vkBindImageMemory2KHR ] ---

    /**
     * Unsafe version of: {@link #vkBindImageMemory2KHR BindImageMemory2KHR}
     *
     * @param bindInfoCount the number of elements in {@code pBindInfos}.
     */
    public static int nvkBindImageMemory2KHR(VkDevice device, int bindInfoCount, long pBindInfos) {
        long __functionAddress = device.getCapabilities().vkBindImageMemory2KHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPI(device.address(), bindInfoCount, pBindInfos, __functionAddress);
    }

    /**
     * See {@link VK11#vkBindImageMemory2 BindImageMemory2}.
     *
     * @param device     the logical device that owns the images and memory.
     * @param pBindInfos a pointer to an array of {@link VkBindImageMemoryInfo} structures, describing images and memory to bind.
     */
    @NativeType("VkResult")
    public static int vkBindImageMemory2KHR(VkDevice device, @NativeType("VkBindImageMemoryInfo const *") VkBindImageMemoryInfo.Buffer pBindInfos) {
        return nvkBindImageMemory2KHR(device, pBindInfos.remaining(), pBindInfos.address());
    }

}