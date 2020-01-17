/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for the following SPIR-V extension in Vulkan:
 * 
 * <ul>
 * <li>{@code SPV_KHR_shader_draw_parameters}</li>
 * </ul>
 * 
 * <p>The extension provides access to three additional built-in shader variables in Vulkan:</p>
 * 
 * <ul>
 * <li>{@code BaseInstance}, which contains the {@code firstInstance} parameter passed to draw commands,</li>
 * <li>{@code BaseVertex}, which contains the {@code firstVertex} or {@code vertexOffset} parameter passed to draw commands, and</li>
 * <li>{@code DrawIndex}, which contains the index of the draw call currently being processed from an indirect draw call.</li>
 * </ul>
 * 
 * <p>When using GLSL source-based shader languages, the following variables from {@code GL_ARB_shader_draw_parameters} can map to these SPIR-V built-in decorations:</p>
 * 
 * <ul>
 * <li>{@code in int gl_BaseInstanceARB;} &#8594; {@code BaseInstance},</li>
 * <li>{@code in int gl_BaseVertexARB;} &#8594; {@code BaseVertex}, and</li>
 * <li>{@code in int gl_DrawIDARB;} &#8594; {@code DrawIndex}.</li>
 * </ul>
 * 
 * <h5>Promotion to Vulkan 1.1</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.1, however a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-shaderDrawParameters">feature bit was added</a> to distinguish whether it is actually available or not.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_draw_parameters}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>64</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#versions-1.1-promotions">Vulkan 1.1</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_shader_draw_parameters:%20&amp;body=@dgkoch%20">dgkoch</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-09-05</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires the <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_shader_draw_parameters.html">{@code SPV_KHR_shader_draw_parameters}</a> SPIR-V extension.</li>
 * <li>Requires <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_draw_parameters.txt">{@code GL_ARB_shader_draw_parameters}</a> for GLSL source languages.</li>
 * <li>Promoted to Vulkan 1.1 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA Corporation</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Jan-Harald Fredriksen, ARM</li>
 * <li>John Kessenich, Google</li>
 * <li>Stuart Smith, IMG</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRShaderDrawParameters {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME = "VK_KHR_shader_draw_parameters";

    private KHRShaderDrawParameters() {}

}