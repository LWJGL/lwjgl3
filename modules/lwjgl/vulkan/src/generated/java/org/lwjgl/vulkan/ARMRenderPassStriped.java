/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds the ability to split a render pass instance into stripes, and to get a notification when rendering has completed for each stripe.
 * 
 * <h5>Examples</h5>
 * 
 * <p>None.</p>
 * 
 * <h5>VK_ARM_render_pass_striped</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_ARM_render_pass_striped}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>425</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or {@link KHRSynchronization2 VK_KHR_synchronization2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_ARM_render_pass_striped]%20@janharaldfredriksen-arm%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_ARM_render_pass_striped%20extension*">janharaldfredriksen-arm</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_ARM_render_pass_striped.adoc">VK_ARM_render_pass_striped</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-11-21</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Lisa Wu, Arm</li>
 * <li>Torbjorn Nilsson, Arm</li>
 * <li>Ying-Chieh Chen, Mediatek</li>
 * <li>Jim Chiu, Mediatek</li>
 * </ul></dd>
 * </dl>
 */
public final class ARMRenderPassStriped {

    /** The extension specification version. */
    public static final int VK_ARM_RENDER_PASS_STRIPED_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_ARM_RENDER_PASS_STRIPED_EXTENSION_NAME = "VK_ARM_render_pass_striped";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM   = 1000424000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM = 1000424001,
        VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM                  = 1000424002,
        VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM                        = 1000424003,
        VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM                 = 1000424004;

    private ARMRenderPassStriped() {}

}