/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows the application to choose which type of 3D stereo hardware it wants to use so the driver can configure it properly. This configuration is useful for swapchains created from display surfaces because some environments do not have an intermediate windowing system available for easy configuration. This extension will override any stereo type configuration in the windowing system.
 * 
 * <p>For HDMI 3D, only some display modes support stereo rendering, and a new structure is needed to expose that information to the application.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_NV_display_stereo}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>552</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRDisplay VK_KHR_display} and {@link KHRGetDisplayProperties2 VK_KHR_get_display_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Russell Chou <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_display_stereo]%20@russellcnv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_display_stereo%20extension*">russellcnv</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_NV_display_stereo.adoc">VK_NV_display_stereo</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-11-20</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Russell Chou, NVIDIA</li>
 * <li>Jeff Juliano, NVIDIA</li>
 * <li>James Jones, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public final class NVDisplayStereo {

    /** The extension specification version. */
    public static final int VK_NV_DISPLAY_STEREO_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_NV_DISPLAY_STEREO_EXTENSION_NAME = "VK_NV_display_stereo";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_DISPLAY_SURFACE_STEREO_CREATE_INFO_NV = 1000551000,
        VK_STRUCTURE_TYPE_DISPLAY_MODE_STEREO_PROPERTIES_NV     = 1000551001;

    /**
     * VkDisplaySurfaceStereoTypeNV - 3D Stereo type
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISPLAY_SURFACE_STEREO_TYPE_NONE_NV DISPLAY_SURFACE_STEREO_TYPE_NONE_NV} specifies no configuration for stereo presentation. This is the default behavior if {@link VkDisplaySurfaceStereoCreateInfoNV} is not provided.</li>
     * <li>{@link #VK_DISPLAY_SURFACE_STEREO_TYPE_ONBOARD_DIN_NV DISPLAY_SURFACE_STEREO_TYPE_ONBOARD_DIN_NV} specifies configuration for glasses that connect via a DIN connector on the back of the graphics card.</li>
     * <li>{@link #VK_DISPLAY_SURFACE_STEREO_TYPE_HDMI_3D_NV DISPLAY_SURFACE_STEREO_TYPE_HDMI_3D_NV} specifies configuration for HDMI 3D compatible display devices with their own stereo emitters. This is also known as HDMI Frame Packed Stereo, where the left and right eye images are stacked into a single frame with a doubled pixel clock and refresh rate.</li>
     * <li>{@link #VK_DISPLAY_SURFACE_STEREO_TYPE_INBAND_DISPLAYPORT_NV DISPLAY_SURFACE_STEREO_TYPE_INBAND_DISPLAYPORT_NV} specifies configuration for DisplayPort display devices with in-band stereo signaling and emitters.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDisplaySurfaceStereoCreateInfoNV}</p>
     */
    public static final int
        VK_DISPLAY_SURFACE_STEREO_TYPE_NONE_NV               = 0,
        VK_DISPLAY_SURFACE_STEREO_TYPE_ONBOARD_DIN_NV        = 1,
        VK_DISPLAY_SURFACE_STEREO_TYPE_HDMI_3D_NV            = 2,
        VK_DISPLAY_SURFACE_STEREO_TYPE_INBAND_DISPLAYPORT_NV = 3;

    private NVDisplayStereo() {}

}