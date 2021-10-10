/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * Rasterization has been the dominant method to produce interactive graphics, but increasing performance of graphics hardware has made ray tracing a viable option for interactive rendering. Being able to integrate ray tracing with traditional rasterization makes it easier for applications to incrementally add ray traced effects to existing applications or to do hybrid approaches with rasterization for primary visibility and ray tracing for secondary queries.
 * 
 * <p>Ray queries are available to all shader types, including graphics, compute and ray tracing pipelines. Ray queries are not able to launch additional shaders, instead returning traversal results to the calling shader.</p>
 * 
 * <p>This extension adds support for the following SPIR-V extension in Vulkan:</p>
 * 
 * <ul>
 * <li>{@code SPV_KHR_ray_query}</li>
 * </ul>
 * 
 * <h5>Sample Code</h5>
 * 
 * <p>Example of ray query in a GLSL shader</p>
 * 
 * <pre><code>
 * rayQueryEXT rq;
 * 
 * rayQueryInitializeEXT(rq, accStruct, gl_RayFlagsNoneEXT, 0, origin, tMin, direction, tMax);
 * 
 * while(rayQueryProceedEXT(rq)) {
 *     if (rayQueryGetIntersectionTypeEXT(rq, false) == gl_RayQueryCandidateIntersectionTriangleEXT) {
 *         //...
 *         rayQueryConfirmIntersectionEXT(rq);
 *     }
 * }
 * 
 * if (rayQueryGetIntersectionTypeEXT(rq, true) == gl_RayQueryCommittedIntersectionNoneEXT) {
 *     //...
 * }</code></pre>
 * 
 * <h5>VK_KHR_ray_query</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_ray_query}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>349</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * <li>Requires {@link KHRSpirv14 VK_KHR_spirv_1_4}</li>
 * <li>Requires {@link KHRAccelerationStructure VK_KHR_acceleration_structure}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_ray_query]%20@dgkoch%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_ray_query%20extension%3E%3E">dgkoch</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-11-12</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_ray_query.html">{@code SPV_KHR_ray_query}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://github.com/KhronosGroup/GLSL/blob/master/extensions/ext/GLSL_EXT_ray_query.txt">{@code GLSL_EXT_ray_query}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Matthäus Chajdas, AMD</li>
 * <li>Greg Grebe, AMD</li>
 * <li>Nicolai Hähnle, AMD</li>
 * <li>Tobias Hector, AMD</li>
 * <li>Dave Oldcorn, AMD</li>
 * <li>Skyler Saleh, AMD</li>
 * <li>Mathieu Robart, Arm</li>
 * <li>Marius Bjorge, Arm</li>
 * <li>Tom Olson, Arm</li>
 * <li>Sebastian Tafuri, EA</li>
 * <li>Henrik Rydgard, Embark</li>
 * <li>Juan Cañada, Epic Games</li>
 * <li>Patrick Kelly, Epic Games</li>
 * <li>Yuriy O’Donnell, Epic Games</li>
 * <li>Michael Doggett, Facebook/Oculus</li>
 * <li>Andrew Garrard, Imagination</li>
 * <li>Don Scorgie, Imagination</li>
 * <li>Dae Kim, Imagination</li>
 * <li>Joshua Barczak, Intel</li>
 * <li>Slawek Grajewski, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Pascal Gautron, NVIDIA</li>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Christoph Kubisch, NVIDIA</li>
 * <li>Ashwin Lele, NVIDIA</li>
 * <li>Robert Stepinski, NVIDIA</li>
 * <li>Martin Stich, NVIDIA</li>
 * <li>Nuno Subtil, NVIDIA</li>
 * <li>Eric Werness, NVIDIA</li>
 * <li>Jon Leech, Khronos</li>
 * <li>Jeroen van Schijndel, OTOY</li>
 * <li>Juul Joosten, OTOY</li>
 * <li>Alex Bourd, Qualcomm</li>
 * <li>Roman Larionov, Qualcomm</li>
 * <li>David McAllister, Qualcomm</li>
 * <li>Spencer Fricke, Samsung</li>
 * <li>Lewis Gordon, Samsung</li>
 * <li>Ralph Potter, Samsung</li>
 * <li>Jasper Bekkers, Traverse Research</li>
 * <li>Jesse Barker, Unity</li>
 * <li>Baldur Karlsson, Valve</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRRayQuery {

    /** The extension specification version. */
    public static final int VK_KHR_RAY_QUERY_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_RAY_QUERY_EXTENSION_NAME = "VK_KHR_ray_query";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_QUERY_FEATURES_KHR = 1000348013;

    private KHRRayQuery() {}

}