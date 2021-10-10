/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension adds support for the SPIR-V extension {@code SPV_EXT_shader_stencil_export}, providing a mechanism whereby a shader may generate the stencil reference value per invocation. When stencil testing is enabled, this allows the test to be performed against the value generated in the shader.
 * 
 * <h5>VK_EXT_shader_stencil_export</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_shader_stencil_export}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>141</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Dominik Witczak <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_stencil_export]%20@dominikwitczakamd%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_stencil_export%20extension%3E%3E">dominikwitczakamd</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-07-19</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/EXT/SPV_EXT_shader_stencil_export.html">{@code SPV_EXT_shader_stencil_export}</a></li>
 * <li>This extension provides API support for <a target="_blank" href="https://www.khronos.org/registry/OpenGL/extensions/ARB/ARB_shader_stencil_export.txt">{@code GL_ARB_shader_stencil_export}</a></li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Dominik Witczak, AMD</li>
 * <li>Daniel Rakos, AMD</li>
 * <li>Rex Xu, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTShaderStencilExport {

    /** The extension specification version. */
    public static final int VK_EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME = "VK_EXT_shader_stencil_export";

    private EXTShaderStencilExport() {}

}