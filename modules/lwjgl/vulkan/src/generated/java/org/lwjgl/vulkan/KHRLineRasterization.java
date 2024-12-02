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
 * This extension adds some line rasterization features that are commonly used in CAD applications and supported in other APIs like OpenGL. Bresenham-style line rasterization is supported, smooth rectangular lines (coverage to alpha) are supported, and stippled lines are supported for all three line rasterization modes.
 * 
 * <h5>Promotion to Vulkan 1.4</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.4 with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <p>When <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.4">Version 1.4</a> is supported, the <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#features-bresenhamLines">{@code bresenhamLines}</a> feature must be supported.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_line_rasterization}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>535</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} or <a href="https://registry.khronos.org/vulkan/specs/latest/html/vkspec.html#versions-1.1">Version 1.1</a></dd>
 * <dt><b>Deprecation State</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to Vulkan 1.4</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_line_rasterization]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_line_rasterization%20extension*">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-06-08</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Allen Jensen, NVIDIA</li>
 * <li>Faith Ekstrand, Intel</li>
 * </ul></dd>
 * </dl>
 */
public class KHRLineRasterization {

    /** The extension specification version. */
    public static final int VK_KHR_LINE_RASTERIZATION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_LINE_RASTERIZATION_EXTENSION_NAME = "VK_KHR_line_rasterization";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_FEATURES_KHR   = 1000259000,
        VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR = 1000259001,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LINE_RASTERIZATION_PROPERTIES_KHR = 1000259002;

    /** Extends {@code VkDynamicState}. */
    public static final int VK_DYNAMIC_STATE_LINE_STIPPLE_KHR = 1000259000;

    /**
     * Extends {@code VkLineRasterizationMode}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR LINE_RASTERIZATION_MODE_DEFAULT_KHR}</li>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_KHR}</li>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR LINE_RASTERIZATION_MODE_BRESENHAM_KHR}</li>
     * <li>{@link #VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR}</li>
     * </ul>
     */
    public static final int
        VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR            = 0,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR        = 1,
        VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR          = 2,
        VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR = 3;

    protected KHRLineRasterization() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetLineStippleKHR ] ---

    /**
     * See {@link VK14#vkCmdSetLineStipple CmdSetLineStipple}.
     *
     * @param commandBuffer      the command buffer into which the command will be recorded.
     * @param lineStippleFactor  the repeat factor used in stippled line rasterization.
     * @param lineStipplePattern the bit pattern used in stippled line rasterization.
     */
    public static void vkCmdSetLineStippleKHR(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int lineStippleFactor, @NativeType("uint16_t") short lineStipplePattern) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetLineStippleKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPCV(commandBuffer.address(), lineStippleFactor, lineStipplePattern, __functionAddress);
    }

}