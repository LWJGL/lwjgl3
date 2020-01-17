/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension allows the use of SPIR-V 1.4 shader modules. SPIR-V 1.4's new features primarily make it an easier target for compilers from high-level languages, rather than exposing new hardware functionality.
 * 
 * <p>SPIR-V 1.4 incorporates features that are also available separately as extensions. SPIR-V 1.4 shader modules do not need to enable those extensions with the {@code OpExtension} opcode, since they are integral parts of SPIR-V 1.4.</p>
 * 
 * <p>SPIR-V 1.4 introduces new floating point execution mode capabilities, also available via {@code SPV_KHR_float_controls}. Implementations are not required to support all of these new capabilities; support can be queried using {@link VkPhysicalDeviceFloatControlsPropertiesKHR} from the {@link KHRShaderFloatControls VK_KHR_shader_float_controls} extension.</p>
 * 
 * <h5>Promotion to Vulkan 1.2</h5>
 * 
 * <p>All functionality in this extension is included in core Vulkan 1.2, with the KHR suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_KHR_spirv_1_4}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>237</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.1</li>
 * <li>Requires {@link KHRShaderFloatControls VK_KHR_shader_float_controls}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#versions-1.2-promotions">Vulkan 1.2</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Jesse Hall <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_KHR_spirv_1_4:%20&amp;body=@critsec%20">critsec</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-04-01</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires SPIR-V 1.4.</li>
 * <li>Promoted to Vulkan 1.2 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Alexander Galazin, Arm</li>
 * <li>David Neto, Google</li>
 * <li>Jesse Hall, Google</li>
 * <li>John Kessenich, Google</li>
 * <li>Neil Henning, AMD</li>
 * <li>Tom Olson, Arm</li>
 * </ul></dd>
 * </dl>
 */
public final class KHRSpirv14 {

    /** The extension specification version. */
    public static final int VK_KHR_SPIRV_1_4_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_KHR_SPIRV_1_4_EXTENSION_NAME = "VK_KHR_spirv_1_4";

    private KHRSpirv14() {}

}