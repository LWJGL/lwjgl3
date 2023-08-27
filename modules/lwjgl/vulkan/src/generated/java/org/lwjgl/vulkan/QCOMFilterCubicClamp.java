/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension extends cubic filtering by adding the ability to enable an anti-ringing clamp. Cubic filtering samples from a 4x4 region of texels and computes a cubic weighted average of the region. In some cases, the resulting value is outside the range of any of the texels in the 4x4 region. This is sometimes referred to as “{@code filter overshoot}” or “{@code filter ringing}” and can occur when there is a sharp discontinuity in the 4x4 region being filtered. For some use cases this “{@code ringing}” can produces unacceptable artifacts.
 * 
 * <p>The solution to the ringing problem is to clamp the post-cubic-filtered value to be within the max and min of texel values in the 4x4 region. While such “{@code range clamping}” can be performed in shader code, the additional texture fetches and clamping ALU operations can be costly.</p>
 * 
 * <p>Certain Adreno GPUs are able to perform the range clamp in the texture unit during cubic filtering at significant performance/power savings versus a shader-based clamping approach. This extension exposes such hardware functionality.</p>
 * 
 * <p>This extension extends {@code VkSamplerReductionMode}, adding {@link #VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM} which enables the range clamp operation.</p>
 * 
 * <h5>VK_QCOM_filter_cubic_clamp</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_QCOM_filter_cubic_clamp}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>522</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link EXTFilterCubic VK_EXT_filter_cubic} and      <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.2">Version 1.2</a>      or      {@link EXTSamplerFilterMinmax VK_EXT_sampler_filter_minmax}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Leger <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_filter_cubic_clamp]%20@jackohound%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_filter_cubic_clamp%20extension*">jackohound</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-08-02</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
 * </ul></dd>
 * </dl>
 */
public final class QCOMFilterCubicClamp {

    /** The extension specification version. */
    public static final int VK_QCOM_FILTER_CUBIC_CLAMP_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_QCOM_FILTER_CUBIC_CLAMP_EXTENSION_NAME = "VK_QCOM_filter_cubic_clamp";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM = 1000521000;

    /** Extends {@code VkSamplerReductionMode}. */
    public static final int VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_RANGECLAMP_QCOM = 1000521000;

    private QCOMFilterCubicClamp() {}

}