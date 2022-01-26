/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides a new per-viewport swizzle that can modify the position of primitives sent to each viewport. New viewport swizzle state is added for each viewport, and a new position vector is computed for each vertex by selecting from and optionally negating any of the four components of the original position vector.
 * 
 * <p>This new viewport swizzle is useful for a number of algorithms, including single-pass cube map rendering (broadcasting a primitive to multiple faces and reorienting the vertex position for each face) and voxel rasterization. The per-viewport component remapping and negation provided by the swizzle allows application code to re-orient three-dimensional geometry with a view along any of the <b>X</b>, <b>Y</b>, or <b>Z</b> axes. If a perspective projection and depth buffering is required, <code>1/W</code> buffering should be used, as described in the single-pass cube map rendering example in the “{@code Issues}” section below.</p>
 * 
 * <h5>VK_NV_viewport_swizzle</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_viewport_swizzle}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>99</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_viewport_swizzle]%20@pdaniell-nv%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_viewport_swizzle%20extension%3E%3E">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2016-12-22</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires {@code multiViewport} and {@code geometryShader} features to be useful.</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVViewportSwizzle {

    /** The extension specification version. */
    public static final int VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME = "VK_NV_viewport_swizzle";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV = 1000098000;

    /**
     * VkViewportCoordinateSwizzleNV - Specify how a viewport coordinate is swizzled
     * 
     * <h5>Description</h5>
     * 
     * <p>These values are described in detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#vertexpostproc-viewport-swizzle">Viewport Swizzle</a>.</p>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkViewportSwizzleNV}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV}</li>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV}</li>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV}</li>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV}</li>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV}</li>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV}</li>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV}</li>
     * <li>{@link #VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV}</li>
     * </ul>
     */
    public static final int
        VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV = 0,
        VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV = 1,
        VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV = 2,
        VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV = 3,
        VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV = 4,
        VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV = 5,
        VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV = 6,
        VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV = 7;

    private NVViewportSwizzle() {}

}