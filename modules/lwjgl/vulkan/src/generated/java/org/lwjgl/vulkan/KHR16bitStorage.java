/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * The {@code VK_KHR_16bit_storage} extension allows use of 16-bit types in shader input and output interfaces, and push constant blocks. This extension introduces several new optional features which map to SPIR-V capabilities and allow access to 16-bit data in {@code Block}-decorated objects in the {@code Uniform} and the {@code StorageBuffer} storage classes, and objects in the {@code PushConstant} storage class. This extension allows 16-bit variables to be declared and used as user-defined shader inputs and outputs but does not change location assignment and component assignment rules.
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_16bit_storage}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>84</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * <li>Requires {@link KHRStorageBufferStorageClass VK_KHR_storage_buffer_storage_class}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_16bit_storage:%20&amp;body=@janharaldfredriksen-arm%20">janharaldfredriksen-arm</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_16bit_storage.html">{@code SPV_KHR_16bit_storage}</a></li>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alexander Galazin, ARM</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Joerg Wagner, ARM</li>
 * <li>Neil Henning, Codeplay</li>
 * <li>Jeff Bolz, Nvidia</li>
 * <li>Daniel Koch, Nvidia</li>
 * <li>David Neto, Google</li>
 * <li>John Kessenich, Google</li>
 * </ul></dd>
 * </dl>
 */
public final class KHR16bitStorage {

    /** The extension specification version. */
    public static final int VK_KHR_16BIT_STORAGE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_16BIT_STORAGE_EXTENSION_NAME = "VK_KHR_16bit_storage";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_16BIT_STORAGE_FEATURES_KHR = 1000083000;

    private KHR16bitStorage() {}

}