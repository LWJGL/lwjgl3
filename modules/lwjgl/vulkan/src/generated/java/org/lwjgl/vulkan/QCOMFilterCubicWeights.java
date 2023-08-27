/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension extends cubic filtering by adding the ability to select a set of weights. Without this extension, the weights used in cubic filtering are limited to those corresponding to a Catmull-Rom spline. This extension adds support for 3 additional spline weights.
 * 
 * <p>This extension adds a new structure that <b>can</b> be added to the {@code pNext} chain of {@link VkSamplerCreateInfo} that <b>can</b> be used to specify which set of cubic weights are used in cubic filtering. A similar structure can be added to the {@code pNext} chain of {@link VkBlitImageInfo2} to specify cubic weights used in a blit operation.</p>
 * 
 * <p>With this extension weights corresponding to the following additional splines can be selected for cubic filtered sampling and blits:</p>
 * 
 * <ul>
 * <li>Zero Tangent Cardinal</li>
 * <li>B-Spline</li>
 * <li>Mitchell-Netravali</li>
 * </ul>
 * 
 * <h5>VK_QCOM_filter_cubic_weights</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_QCOM_filter_cubic_weights}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>520</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link EXTFilterCubic VK_EXT_filter_cubic}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jeff Leger <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_QCOM_filter_cubic_weights]%20@jackohound%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_QCOM_filter_cubic_weights%20extension*">jackohound</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-06-23</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jeff Leger, Qualcomm Technologies, Inc.</li>
 * <li>Jonathan Wicks, Qualcomm Technologies, Inc.</li>
 * </ul></dd>
 * </dl>
 */
public final class QCOMFilterCubicWeights {

    /** The extension specification version. */
    public static final int VK_QCOM_FILTER_CUBIC_WEIGHTS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_QCOM_FILTER_CUBIC_WEIGHTS_EXTENSION_NAME = "VK_QCOM_filter_cubic_weights";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_SAMPLER_CUBIC_WEIGHTS_CREATE_INFO_QCOM STRUCTURE_TYPE_SAMPLER_CUBIC_WEIGHTS_CREATE_INFO_QCOM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_SAMPLER_CUBIC_WEIGHTS_CREATE_INFO_QCOM      = 1000519000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM = 1000519001,
        VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM          = 1000519002;

    /**
     * VkCubicFilterWeightsQCOM - Specify cubic weights for texture filtering
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM} specifies Catmull-Rom weights.</li>
     * <li>{@link #VK_CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM} specifies Zero Tangent Cardinal weights.</li>
     * <li>{@link #VK_CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM} specifies B-Spline weights.</li>
     * <li>{@link #VK_CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM} specifies Mitchell-Netravali weights.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkBlitImageCubicWeightsInfoQCOM}, {@link VkSamplerCubicWeightsCreateInfoQCOM}</p>
     */
    public static final int
        VK_CUBIC_FILTER_WEIGHTS_CATMULL_ROM_QCOM           = 0,
        VK_CUBIC_FILTER_WEIGHTS_ZERO_TANGENT_CARDINAL_QCOM = 1,
        VK_CUBIC_FILTER_WEIGHTS_B_SPLINE_QCOM              = 2,
        VK_CUBIC_FILTER_WEIGHTS_MITCHELL_NETRAVALI_QCOM    = 3;

    private QCOMFilterCubicWeights() {}

}