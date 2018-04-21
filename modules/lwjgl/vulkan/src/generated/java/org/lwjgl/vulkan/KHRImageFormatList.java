/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * On some implementations, setting the {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} on image creation can cause access to that image to perform worse than an equivalent image created without {@link VK10#VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT IMAGE_CREATE_MUTABLE_FORMAT_BIT} because the implementation does not know what view formats will be paired with the image.
 * 
 * <p>This extension allows an application to provide the list of all formats that <b>can</b> be used with an image when it is created. The implementation may then be able to create a more efficient image that supports the subset of formats required by the application without having to support all formats in the format compatibility class of the image format.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_image_format_list}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>148</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand @jekstrand</li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-03-20</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Jeff Leger, Qualcomm</li>
 * <li>Neil Henning, Codeplay</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRImageFormatList {

    /** The extension specification version. */
    public static final int VK_KHR_IMAGE_FORMAT_LIST_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME = "VK_KHR_image_format_list";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_IMAGE_FORMAT_LIST_CREATE_INFO_KHR = 1000147000;

    private KHRImageFormatList() {}

}