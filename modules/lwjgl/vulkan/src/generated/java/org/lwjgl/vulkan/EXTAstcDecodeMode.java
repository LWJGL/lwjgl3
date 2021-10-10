/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * The existing specification requires that low dynamic range (LDR) ASTC textures are decompressed to FP16 values per component. In many cases, decompressing LDR textures to a lower precision intermediate result gives acceptable image quality. Source material for LDR textures is typically authored as 8-bit UNORM values, so decoding to FP16 values adds little value. On the other hand, reducing precision of the decoded result reduces the size of the decompressed data, potentially improving texture cache performance and saving power.
 * 
 * <p>The goal of this extension is to enable this efficiency gain on existing ASTC texture data. This is achieved by giving the application the ability to select the intermediate decoding precision.</p>
 * 
 * <p>Three decoding options are provided:</p>
 * 
 * <ul>
 * <li>Decode to {@link VK10#VK_FORMAT_R16G16B16A16_SFLOAT FORMAT_R16G16B16A16_SFLOAT} precision: This is the default, and matches the required behavior in the core API.</li>
 * <li>Decode to {@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} precision: This is provided as an option in LDR mode.</li>
 * <li>Decode to {@link VK10#VK_FORMAT_E5B9G9R9_UFLOAT_PACK32 FORMAT_E5B9G9R9_UFLOAT_PACK32} precision: This is provided as an option in both LDR and HDR mode. In this mode, negative values cannot be represented and are clamped to zero. The alpha component is ignored, and the results are as if alpha was 1.0. This decode mode is optional and support can be queried via the physical device properties.</li>
 * </ul>
 * 
 * <h5>Example</h5>
 * 
 * <p>Create an image view that decodes to {@link VK10#VK_FORMAT_R8G8B8A8_UNORM FORMAT_R8G8B8A8_UNORM} precision:</p>
 * 
 * <pre><code>
 *     VkImageViewASTCDecodeModeEXT decodeMode =
 *     {
 *         VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT, // sType
 *         NULL, // pNext
 *         VK_FORMAT_R8G8B8A8_UNORM // decode mode
 *     };
 * 
 *     VkImageViewCreateInfo createInfo =
 *     {
 *         VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO, // sType
 *         &amp;decodeMode, // pNext
 *         // flags, image, viewType set to application-desired values
 *         VK_FORMAT_ASTC_8x8_UNORM_BLOCK, // format
 *         // components, subresourceRange set to application-desired values
 *     };
 * 
 *     VkImageView imageView;
 *     VkResult result = vkCreateImageView(
 *         device,
 *         &amp;createInfo,
 *         NULL,
 *         &amp;imageView);</code></pre>
 * 
 * <h5>VK_EXT_astc_decode_mode</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_astc_decode_mode}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>68</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_astc_decode_mode]%20@janharaldfredriksen-arm%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_astc_decode_mode%20extension%3E%3E">janharaldfredriksen-arm</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-08-07</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTAstcDecodeMode {

    /** The extension specification version. */
    public static final int VK_EXT_ASTC_DECODE_MODE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_ASTC_DECODE_MODE_EXTENSION_NAME = "VK_EXT_astc_decode_mode";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT          = 1000067000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT = 1000067001;

    private EXTAstcDecodeMode() {}

}