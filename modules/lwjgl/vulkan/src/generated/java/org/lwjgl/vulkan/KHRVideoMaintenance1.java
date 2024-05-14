/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * {@code VK_KHR_video_maintenance1} adds a collection of minor video coding features, none of which would warrant an entire extension of their own.
 * 
 * <p>The new features are as follows:</p>
 * 
 * <ul>
 * <li>Allow creating buffers that can be used in video coding operations, independent of the used video profile, using the new buffer creation flag {@link #VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR}.</li>
 * <li>Allow creating images that can be used as decode output or encode input pictures, independent of the used video profile, using the new image creation flag {@link #VK_IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR}.</li>
 * <li>Allow specifying queries used by video coding operations as part of the video coding command parameters, instead of using begin/end query when the video session is created using the new video session creation flag {@link #VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR}.</li>
 * </ul>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_video_maintenance1}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>516</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRVideoQueue VK_KHR_video_queue}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Rakos <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_video_maintenance1]%20@aqnuep%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_video_maintenance1%20extension*">aqnuep</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_video_maintenance1.adoc">VK_KHR_video_maintenance1</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-07-27</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ahmed Abdelkhalek, AMD</li>
 * <li>Aidan Fabius, Core Avionics &amp; Industrial Inc.</li>
 * <li>Ping Liu, Intel</li>
 * <li>Lynne Iribarren, Independent</li>
 * <li>Srinath Kumarapuram, NVIDIA</li>
 * <li>Tony Zlatinski, NVIDIA</li>
 * <li>Daniel Rakos, RasterGrid</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRVideoMaintenance1 {

    /** The extension specification version. */
    public static final int VK_KHR_VIDEO_MAINTENANCE_1_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_VIDEO_MAINTENANCE_1_EXTENSION_NAME = "VK_KHR_video_maintenance1";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_1_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_1_FEATURES_KHR}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_1_FEATURES_KHR = 1000515000,
        VK_STRUCTURE_TYPE_VIDEO_INLINE_QUERY_INFO_KHR                      = 1000515001;

    /** Extends {@code VkImageCreateFlagBits}. */
    public static final int VK_IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR = 0x100000;

    /** Extends {@code VkBufferCreateFlagBits}. */
    public static final int VK_BUFFER_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR = 0x40;

    /** Extends {@code VkVideoSessionCreateFlagBitsKHR}. */
    public static final int VK_VIDEO_SESSION_CREATE_INLINE_QUERIES_BIT_KHR = 0x4;

    private KHRVideoMaintenance1() {}

}