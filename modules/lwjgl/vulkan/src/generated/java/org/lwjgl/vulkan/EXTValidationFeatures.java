/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension provides the {@link VkValidationFeaturesEXT} struct that can be included in the {@code pNext} chain of the {@link VkInstanceCreateInfo} structure passed as the {@code pCreateInfo} parameter of {@link VK10#vkCreateInstance CreateInstance}. The structure contains an array of {@code VkValidationFeatureEnableEXT} enum values that enable specific validation features that are disabled by default. The structure also contains an array of {@code VkValidationFeatureDisableEXT} enum values that disable specific validation layer features that are enabled by default.
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The {@link EXTValidationFeatures VK_EXT_validation_features} extension subsumes all the functionality provided in the {@link EXTValidationFlags VK_EXT_validation_flags} extension.</p>
 * </div>
 * 
 * <h5>VK_EXT_validation_features</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_validation_features}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>248</dd>
 * <dt><b>Revision</b></dt>
 * <dd>5</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Special Use</b></dt>
 * <dd><ul>
 * <li><a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#extendingvulkan-compatibility-specialuse">Debugging tools</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Karl Schultz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_validation_features]%20@karl-lunarg%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_validation_features%20extension%3E%3E">karl-lunarg</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-11-14</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Karl Schultz, LunarG</li>
 * <li>Dave Houlton, LunarG</li>
 * <li>Mark Lobodzinski, LunarG</li>
 * <li>Camden Stocker, LunarG</li>
 * <li>Tony Barbour, LunarG</li>
 * <li>John Zulauf, LunarG</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTValidationFeatures {

    /** The extension specification version. */
    public static final int VK_EXT_VALIDATION_FEATURES_SPEC_VERSION = 5;

    /** The extension name. */
    public static final String VK_EXT_VALIDATION_FEATURES_EXTENSION_NAME = "VK_EXT_validation_features";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT = 1000247000;

    /**
     * VkValidationFeatureEnableEXT - Specify validation features to enable
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT} specifies that GPU-assisted validation is enabled. Activating this feature instruments shader programs to generate additional diagnostic data. This feature is disabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT} specifies that the validation layers reserve a descriptor set binding slot for their own use. The layer reports a value for {@link VkPhysicalDeviceLimits}{@code ::maxBoundDescriptorSets} that is one less than the value reported by the device. If the device supports the binding of only one descriptor set, the validation layer does not perform GPU-assisted validation. This feature is disabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT} specifies that Vulkan best-practices validation is enabled. Activating this feature enables the output of warnings related to common misuse of the API, but which are not explicitly prohibited by the specification. This feature is disabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_ENABLE_DEBUG_PRINTF_EXT VALIDATION_FEATURE_ENABLE_DEBUG_PRINTF_EXT} specifies that the layers will process {@code debugPrintfEXT} operations in shaders and send the resulting output to the debug callback. This feature is disabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_ENABLE_SYNCHRONIZATION_VALIDATION_EXT VALIDATION_FEATURE_ENABLE_SYNCHRONIZATION_VALIDATION_EXT} specifies that Vulkan synchronization validation is enabled. This feature reports resource access conflicts due to missing or incorrect synchronization operations between actions (Draw, Copy, Dispatch, Blit) reading or writing the same regions of memory. This feature is disabled by default.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkValidationFeaturesEXT}</p>
     */
    public static final int
        VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT                      = 0,
        VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT = 1,
        VK_VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT                    = 2,
        VK_VALIDATION_FEATURE_ENABLE_DEBUG_PRINTF_EXT                      = 3,
        VK_VALIDATION_FEATURE_ENABLE_SYNCHRONIZATION_VALIDATION_EXT        = 4;

    /**
     * VkValidationFeatureDisableEXT - Specify validation features to disable
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_ALL_EXT VALIDATION_FEATURE_DISABLE_ALL_EXT} specifies that all validation checks are disabled.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_SHADERS_EXT VALIDATION_FEATURE_DISABLE_SHADERS_EXT} specifies that shader validation is disabled. This feature is enabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT} specifies that thread safety validation is disabled. This feature is enabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT} specifies that stateless parameter validation is disabled. This feature is enabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT} specifies that object lifetime validation is disabled. This feature is enabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT} specifies that core validation checks are disabled. This feature is enabled by default. If this feature is disabled, the shader validation and GPU-assisted validation features are also disabled.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT} specifies that protection against duplicate non-dispatchable object handles is disabled. This feature is enabled by default.</li>
     * <li>{@link #VK_VALIDATION_FEATURE_DISABLE_SHADER_VALIDATION_CACHE_EXT VALIDATION_FEATURE_DISABLE_SHADER_VALIDATION_CACHE_EXT} specifies that there will be no caching of shader validation results and every shader will be validated on every application execution. Shader validation caching is enabled by default.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkValidationFeaturesEXT}</p>
     */
    public static final int
        VK_VALIDATION_FEATURE_DISABLE_ALL_EXT                     = 0,
        VK_VALIDATION_FEATURE_DISABLE_SHADERS_EXT                 = 1,
        VK_VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT           = 2,
        VK_VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT          = 3,
        VK_VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT        = 4,
        VK_VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT             = 5,
        VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT          = 6,
        VK_VALIDATION_FEATURE_DISABLE_SHADER_VALIDATION_CACHE_EXT = 7;

    private EXTValidationFeatures() {}

}