/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows the use of the {@code SPV_KHR_relaxed_extended_instruction} extension in SPIR-V shader modules.
 * 
 * <p>It adds a new SPIR-V instruction, which allows some usage of forward references in non-semantic instruction sets. This extensions interacts with the {@code SPV_KHR_non_semantic_info} extension, hence with {@code VK_KHR_shader_non_semantic_info}.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_shader_relaxed_extended_instruction}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>559</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>SPIR-V Dependencies</b></dt>
 * <dd><ul>
 * <li><a href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/KHR/SPV_KHR_relaxed_extended_instruction.html">SPV_KHR_relaxed_extended_instruction</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Nathan Gauër <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_KHR_shader_relaxed_extended_instruction]%20@Keenuts%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_KHR_shader_relaxed_extended_instruction%20extension*">Keenuts</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_KHR_shader_relaxed_extended_instruction.adoc">VK_KHR_shader_relaxed_extended_instruction</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2024-01-24</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alan Baker, Google LLC</li>
 * <li>Nathan Gauër, Google LLC</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRShaderRelaxedExtendedInstruction {

    /** The extension specification version. */
    public static final int VK_KHR_SHADER_RELAXED_EXTENDED_INSTRUCTION_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SHADER_RELAXED_EXTENDED_INSTRUCTION_EXTENSION_NAME = "VK_KHR_shader_relaxed_extended_instruction";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_RELAXED_EXTENDED_INSTRUCTION_FEATURES_KHR = 1000558000;

    private KHRShaderRelaxedExtendedInstruction() {}

}