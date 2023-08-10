/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Some applications generate SPIR-V code at runtime. When pipeline caches are primed, either explicitly through e.g. {@code VkPipelineCache} mechanisms, or implicitly through driver managed caches, having to re-generate SPIR-V modules is redundant. SPIR-V modules could be cached on disk by an application, but the extra disk size requirement might be prohibitive in some use cases.
 * 
 * <p>This extension adds the ability for an application to query a small identifier associated with a {@code VkShaderModule}. On subsequent runs of the application, the same identifier <b>can</b> be provided in lieu of a {@code VkShaderModule} object. A pipeline creation call with such a module <b>may</b> succeed if a pipeline could be created without invoking compilation, and information inside the SPIR-V module is not required by the implementation.</p>
 * 
 * <p>{@link VK13#VK_PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT PIPELINE_CREATE_FAIL_ON_PIPELINE_COMPILE_REQUIRED_BIT} <b>must</b> be used if only the identifier is provided, and this use case is intended to work like a non-blocking, speculative compile. Applications <b>can</b> fallback as necessary.</p>
 * 
 * <p>The main motivation for identifying the module itself and not the entire pipeline is that pipeline identifiers change when a driver is updated, but module identifiers are expected to be stable for any particular driver implementation. This approach is helpful for shader pre-compilation systems which can prime pipeline caches ahead of time. When on-disk pipeline caches are updated, the same shader identifiers could lead to a pipeline cache hit.</p>
 * 
 * <h5>VK_EXT_shader_module_identifier</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_shader_module_identifier}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>463</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2} and {@link EXTPipelineCreationCacheControl VK_EXT_pipeline_creation_cache_control}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Hans-Kristian Arntzen <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_shader_module_identifier]%20@HansKristian-Work%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_shader_module_identifier%20extension*">HansKristian-Work</a></li>
 * </ul></dd>
 * <dt><b>Extension Proposal</b></dt>
 * <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_shader_module_identifier.adoc">VK_EXT_shader_module_identifier</a></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-05-16</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Hans-Kristian Arntzen, Valve</li>
 * <li>Ricardo Garcia, Igalia</li>
 * <li>Piers Daniell, NVIDIA</li>
 * <li>Jan-Harald Fredriksen, Arm</li>
 * <li>Tom Olson, Arm</li>
 * <li>Faith Ekstrand, Collabora</li>
 * </ul></dd>
 * </dl>
 */
public class EXTShaderModuleIdentifier {

    /** The extension specification version. */
    public static final int VK_EXT_SHADER_MODULE_IDENTIFIER_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_SHADER_MODULE_IDENTIFIER_EXTENSION_NAME = "VK_EXT_shader_module_identifier";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_FEATURES_EXT   = 1000462000,
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MODULE_IDENTIFIER_PROPERTIES_EXT = 1000462001,
        VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_MODULE_IDENTIFIER_CREATE_INFO_EXT = 1000462002,
        VK_STRUCTURE_TYPE_SHADER_MODULE_IDENTIFIER_EXT                            = 1000462003;

    /** VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT */
    public static final int VK_MAX_SHADER_MODULE_IDENTIFIER_SIZE_EXT = 32;

    protected EXTShaderModuleIdentifier() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetShaderModuleIdentifierEXT ] ---

    /** Unsafe version of: {@link #vkGetShaderModuleIdentifierEXT GetShaderModuleIdentifierEXT} */
    public static void nvkGetShaderModuleIdentifierEXT(VkDevice device, long shaderModule, long pIdentifier) {
        long __functionAddress = device.getCapabilities().vkGetShaderModuleIdentifierEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJPV(device.address(), shaderModule, pIdentifier, __functionAddress);
    }

    /**
     * Query a unique identifier for a shader module.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>Shader modules have unique identifiers associated with them. To query an implementation provided identifier, call:</p>
     * 
     * <pre><code>
     * void vkGetShaderModuleIdentifierEXT(
     *     VkDevice                                    device,
     *     VkShaderModule                              shaderModule,
     *     VkShaderModuleIdentifierEXT*                pIdentifier);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The identifier returned by the implementation <b>must</b> only depend on {@code shaderIdentifierAlgorithmUUID} and information provided in the {@link VkShaderModuleCreateInfo} which created {@code shaderModule}. The implementation <b>may</b> return equal identifiers for two different {@link VkShaderModuleCreateInfo} structures if the difference does not affect pipeline compilation. Identifiers are only meaningful on different {@code VkDevice} objects if the device the identifier was queried from had the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-shaderModuleIdentifierAlgorithmUUID">{@code shaderModuleIdentifierAlgorithmUUID}</a> as the device consuming the identifier.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderModuleIdentifier">{@code shaderModuleIdentifier}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code shaderModule} <b>must</b> be a valid {@code VkShaderModule} handle</li>
     * <li>{@code pIdentifier} <b>must</b> be a valid pointer to a {@link VkShaderModuleIdentifierEXT} structure</li>
     * <li>{@code shaderModule} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkShaderModuleIdentifierEXT}</p>
     *
     * @param device       the logical device that created the shader module.
     * @param shaderModule the handle of the shader module.
     * @param pIdentifier  a pointer to the returned {@link VkShaderModuleIdentifierEXT}.
     */
    public static void vkGetShaderModuleIdentifierEXT(VkDevice device, @NativeType("VkShaderModule") long shaderModule, @NativeType("VkShaderModuleIdentifierEXT *") VkShaderModuleIdentifierEXT pIdentifier) {
        nvkGetShaderModuleIdentifierEXT(device, shaderModule, pIdentifier.address());
    }

    // --- [ vkGetShaderModuleCreateInfoIdentifierEXT ] ---

    /** Unsafe version of: {@link #vkGetShaderModuleCreateInfoIdentifierEXT GetShaderModuleCreateInfoIdentifierEXT} */
    public static void nvkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, long pCreateInfo, long pIdentifier) {
        long __functionAddress = device.getCapabilities().vkGetShaderModuleCreateInfoIdentifierEXT;
        if (CHECKS) {
            check(__functionAddress);
            VkShaderModuleCreateInfo.validate(pCreateInfo);
        }
        callPPPV(device.address(), pCreateInfo, pIdentifier, __functionAddress);
    }

    /**
     * Query a unique identifier for a shader module create info.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>{@link VkShaderModuleCreateInfo} structures have unique identifiers associated with them. To query an implementation provided identifier, call:</p>
     * 
     * <pre><code>
     * void vkGetShaderModuleCreateInfoIdentifierEXT(
     *     VkDevice                                    device,
     *     const VkShaderModuleCreateInfo*             pCreateInfo,
     *     VkShaderModuleIdentifierEXT*                pIdentifier);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The identifier returned by implementation <b>must</b> only depend on {@code shaderIdentifierAlgorithmUUID} and information provided in the {@link VkShaderModuleCreateInfo}. The implementation <b>may</b> return equal identifiers for two different {@link VkShaderModuleCreateInfo} structures if the difference does not affect pipeline compilation. Identifiers are only meaningful on different {@code VkDevice} objects if the device the identifier was queried from had the same <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-shaderModuleIdentifierAlgorithmUUID">{@code shaderModuleIdentifierAlgorithmUUID}</a> as the device consuming the identifier.</p>
     * 
     * <p>The identifier returned by the implementation in {@link #vkGetShaderModuleCreateInfoIdentifierEXT GetShaderModuleCreateInfoIdentifierEXT} <b>must</b> be equal to the identifier returned by {@link #vkGetShaderModuleIdentifierEXT GetShaderModuleIdentifierEXT} given equivalent definitions of {@link VkShaderModuleCreateInfo} and any chained {@code pNext} structures.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li><a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderModuleIdentifier">{@code shaderModuleIdentifier}</a> feature <b>must</b> be enabled</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkShaderModuleCreateInfo} structure</li>
     * <li>{@code pIdentifier} <b>must</b> be a valid pointer to a {@link VkShaderModuleIdentifierEXT} structure</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkShaderModuleCreateInfo}, {@link VkShaderModuleIdentifierEXT}</p>
     *
     * @param device      the logical device that <b>can</b> create a {@code VkShaderModule} from {@code pCreateInfo}.
     * @param pCreateInfo a pointer to a {@link VkShaderModuleCreateInfo} structure.
     * @param pIdentifier a pointer to the returned {@link VkShaderModuleIdentifierEXT}.
     */
    public static void vkGetShaderModuleCreateInfoIdentifierEXT(VkDevice device, @NativeType("VkShaderModuleCreateInfo const *") VkShaderModuleCreateInfo pCreateInfo, @NativeType("VkShaderModuleIdentifierEXT *") VkShaderModuleIdentifierEXT pIdentifier) {
        nvkGetShaderModuleCreateInfoIdentifierEXT(device, pCreateInfo.address(), pIdentifier.address());
    }

}