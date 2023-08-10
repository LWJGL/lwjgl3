/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for a new query type to match OpenGL’s {@code GL_PRIMITIVES_GENERATED} to support layering.
 * 
 * <h5>VK_EXT_primitives_generated_query</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_primitives_generated_query}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>383</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link EXTTransformFeedback VK_EXT_transform_feedback}</dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">OpenGL / ES support</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_primitives_generated_query]%20@syoussefi%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_primitives_generated_query%20extension*">syoussefi</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_primitives_generated_query.adoc">VK_EXT_primitives_generated_query</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-01-24</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Shahbaz Youssefi, Google</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Faith Ekstrand, Collabora</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTPrimitivesGeneratedQuery {

    /** The extension specification version. */
    public static final int VK_EXT_PRIMITIVES_GENERATED_QUERY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_PRIMITIVES_GENERATED_QUERY_EXTENSION_NAME = "VK_EXT_primitives_generated_query";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT = 1000382000;

    /** Extends {@code VkQueryType}. */
    public static final int VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT = 1000382000;

    private EXTPrimitivesGeneratedQuery() {}

}