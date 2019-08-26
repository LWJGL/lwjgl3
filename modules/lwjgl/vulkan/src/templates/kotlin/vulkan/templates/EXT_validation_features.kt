/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_validation_features = "EXTValidationFeatures".nativeClassVK("EXT_validation_features", type = "instance", postfix = EXT) {
    documentation =
        """
        This extension provides the ##VkValidationFeaturesEXT struct that can be included in the {@code pNext} chain of the ##VkInstanceCreateInfo structure passed as the {@code pCreateInfo} parameter of #CreateInstance(). The structure contains an array of {@code VkValidationFeatureEnableEXT} enum values that enable specific validation features that are disabled by default. The structure also contains an array of {@code VkValidationFeatureDisableEXT} enum values that disable specific validation layer features that are enabled by default.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@link EXTValidationFeatures VK_EXT_validation_features} extension subsumes all the functionality provided in the {@link EXTValidationFlags VK_EXT_validation_flags} extension.
        </div>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_validation_features}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>248</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Extension and Version Dependencies</b></dt>
            <dd><ul>
                <li>Requires Vulkan 1.0</li>
            </ul></dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Karl Schultz <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_validation_features:%20&amp;body=@karl-lunarg%20">karl-lunarg</a></li>
            </ul></dd>

            <dt><b>Last Modified Date</b></dt>
            <dd>2018-11-14</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Karl Schultz, LunarG</li>
                <li>Dave Houlton, LunarG</li>
                <li>Mark Lobodzinski, LunarG</li>
                <li>Camden Stocker, LunarG</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_VALIDATION_FEATURES_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_VALIDATION_FEATURES_EXTENSION_NAME".."VK_EXT_validation_features"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_VALIDATION_FEATURES_EXT".."1000247000"
    )

    EnumConstant(
        """
        VkValidationFeatureEnableEXT - Specify validation features to enable

        <h5>Description</h5>
        <ul>
            <li>#VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT specifies that GPU-assisted validation is enabled. Activating this feature instruments shader programs to generate additional diagnostic data. This feature is disabled by default.</li>
            <li>#VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT specifies that the validation layers reserve a descriptor set binding slot for their own use. The layer reports a value for ##VkPhysicalDeviceLimits{@code ::maxBoundDescriptorSets} that is one less than the value reported by the device. If the device supports the binding of only one descriptor set, the validation layer does not perform GPU-assisted validation. This feature is disabled by default. The GPU-assisted validation feature must be enabled in order to use this feature.</li>
            <li>#VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT specifies that Vulkan best-practices validation is enabled. Activating this feature enables the output of warnings related to common misuse of the API, but which are not explicitly prohibited by the specification. This feature is disabled by default.</li>
        </ul>

        <h5>See Also</h5>
        ##VkValidationFeaturesEXT
        """,

        "VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT".."0",
        "VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT".."1",
        "VALIDATION_FEATURE_ENABLE_BEST_PRACTICES_EXT".."2"
    )

    EnumConstant(
        """
        VkValidationFeatureDisableEXT - Specify validation features to disable

        <h5>Description</h5>
        <ul>
            <li>#VALIDATION_FEATURE_DISABLE_ALL_EXT specifies that all validation checks are disabled.</li>
            <li>#VALIDATION_FEATURE_DISABLE_SHADERS_EXT specifies that shader validation is disabled. This feature is enabled by default.</li>
            <li>#VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT specifies that thread safety validation is disabled. This feature is enabled by default.</li>
            <li>#VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT specifies that stateless parameter validation is disabled. This feature is enabled by default.</li>
            <li>#VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT specifies that object lifetime validation is disabled. This feature is enabled by default.</li>
            <li>#VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT specifies that core validation checks are disabled. This feature is enabled by default. If this feature is disabled, the shader validation and GPU-assisted validation features are also disabled.</li>
            <li>#VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT specifies that protection against duplicate non-dispatchable object handles is disabled. This feature is enabled by default.</li>
        </ul>

        <h5>See Also</h5>
        ##VkValidationFeaturesEXT
        """,

        "VALIDATION_FEATURE_DISABLE_ALL_EXT".."0",
        "VALIDATION_FEATURE_DISABLE_SHADERS_EXT".."1",
        "VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT".."2",
        "VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT".."3",
        "VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT".."4",
        "VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT".."5",
        "VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT".."6"
    )
}