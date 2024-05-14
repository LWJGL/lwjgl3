/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_layer_settings = "EXTLayerSettings".nativeClassVK("EXT_layer_settings", type = "instance", postfix = "EXT") {
    documentation =
        """
        This extension provides a mechanism for configuring programmatically through the Vulkan API the behavior of layers.

        This extension provides the ##VkLayerSettingsCreateInfoEXT struct that can be included in the {@code pNext} chain of the ##VkInstanceCreateInfo structure passed as the {@code pCreateInfo} parameter of #CreateInstance().

        The structure contains an array of ##VkLayerSettingEXT structure values that configure specific features of layers.

        <h5>Example</h5>
        {@code VK_EXT_layer_settings} is implemented by the Vulkan Profiles layer.

        It allows the profiles layer tests used by the profiles layer C.I. to programmatically configure the layer for each test without affecting the C.I. environment, allowing to run multiple tests concurrently.

        <pre><code>
￿const char* profile_file_data = JSON_TEST_FILES_PATH "VP_KHR_roadmap_2022.json";
￿const char* profile_name_data = "VP_KHR_roadmap_2022";
￿VkBool32 emulate_portability_data = VK_TRUE;
￿const char* simulate_capabilities[] = {
￿    "SIMULATE_API_VERSION_BIT",
￿    "SIMULATE_FEATURES_BIT",
￿    "SIMULATE_PROPERTIES_BIT",
￿    "SIMULATE_EXTENSIONS_BIT",
￿    "SIMULATE_FORMATS_BIT",
￿    "SIMULATE_QUEUE_FAMILY_PROPERTIES_BIT"
￿};
￿const char* debug_reports[] = {
￿    "DEBUG_REPORT_ERROR_BIT",
￿    "DEBUG_REPORT_WARNING_BIT",
￿    "DEBUG_REPORT_NOTIFICATION_BIT",
￿    "DEBUG_REPORT_DEBUG_BIT"
￿};
￿
￿const VkLayerSettingEXT settings[] = {
￿     {kLayerName, kLayerSettingsProfileFile, VK_LAYER_SETTING_TYPE_STRING_EXT, 1, &amp;profile_file_data},
￿     {kLayerName, kLayerSettingsProfileName, VK_LAYER_SETTING_TYPE_STRING_EXT, 1, &amp;profile_name_data},
￿     {kLayerName, kLayerSettingsEmulatePortability, VK_LAYER_SETTING_TYPE_BOOL32_EXT, 1, &amp;emulate_portability_data},
￿     {kLayerName, kLayerSettingsSimulateCapabilities, VK_LAYER_SETTING_TYPE_STRING_EXT,
￿        static_cast&lt;uint32_t&gt;(std::size(simulate_capabilities)), simulate_capabilities},
￿     {kLayerName, kLayerSettingsDebugReports, VK_LAYER_SETTING_TYPE_STRING_EXT,
￿        static_cast&lt;uint32_t&gt;(std::size(debug_reports)), debug_reports}
￿};
￿
￿const VkLayerSettingsCreateInfoEXT layer_settings_create_info{
￿    VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT, nullptr,
￿    static_cast&lt;uint32_t&gt;(std::size(settings)), settings};
￿
￿VkInstanceCreateInfo inst_create_info = {};
￿...
￿inst_create_info.pNext = &amp;layer_settings_create_info;
￿vkCreateInstance(&amp;inst_create_info, nullptr, &amp;_instances);</code></pre>

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@link EXTLayerSettings VK_EXT_layer_settings} extension subsumes all the functionality provided in the {@link EXTValidationFlags VK_EXT_validation_flags} extension and the {@link EXTValidationFeatures VK_EXT_validation_features} extension.
        </div>

        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_EXT_layer_settings}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Instance extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>497</dd>

            <dt><b>Revision</b></dt>
            <dd>2</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Christophe Riccio <a href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_layer_settings]%20@christophe%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_layer_settings%20extension*">christophe</a></li>
            </ul></dd>

            <dt><b>Extension Proposal</b></dt>
            <dd><a href="https://github.com/KhronosGroup/Vulkan-Docs/tree/main/proposals/VK_EXT_layer_settings.adoc">VK_EXT_layer_settings</a></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2023-09-23</dd>

            <dt><b>IP Status</b></dt>
            <dd>No known IP claims.</dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Christophe Riccio, LunarG</li>
                <li>Mark Lobodzinski, LunarG</li>
                <li>Charles Giessen, LunarG</li>
                <li>Spencer Fricke, LunarG</li>
                <li>Juan Ramos, LunarG</li>
                <li>Daniel Rakos, RasterGrid</li>
                <li>Shahbaz Youssefi, Google</li>
                <li>Lina Versace, Google</li>
                <li>Bill Hollings, The Brenwill Workshop</li>
                <li>Jon Leech, Khronos</li>
                <li>Tom Olson, Arm</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "EXT_LAYER_SETTINGS_SPEC_VERSION".."2"
    )

    StringConstant(
        "The extension name.",

        "EXT_LAYER_SETTINGS_EXTENSION_NAME".."VK_EXT_layer_settings"
    )

    EnumConstant(
        "Extends {@code VkStructureType}.",

        "STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT".."1000496000"
    )

    EnumConstant(
        """
        VkLayerSettingTypeEXT - Type of the values that can be passed to a layer

        <h5>Description</h5>
        <ul>
            <li>#LAYER_SETTING_TYPE_BOOL32_EXT specifies that the layer setting’s type is {@code VkBool32}.</li>
            <li>#LAYER_SETTING_TYPE_INT32_EXT specifies that the layer setting’s type is signed 32-bit integer.</li>
            <li>#LAYER_SETTING_TYPE_INT64_EXT specifies that the layer setting’s type is signed 64-bit integer.</li>
            <li>#LAYER_SETTING_TYPE_UINT32_EXT specifies that the layer setting’s type is unsigned 32-bit integer.</li>
            <li>#LAYER_SETTING_TYPE_UINT64_EXT specifies that the layer setting’s type is unsigned 64-bit integer.</li>
            <li>#LAYER_SETTING_TYPE_FLOAT32_EXT specifies that the layer setting’s type is 32-bit floating-point.</li>
            <li>#LAYER_SETTING_TYPE_FLOAT64_EXT specifies that the layer setting’s type is 64-bit floating-point.</li>
            <li>#LAYER_SETTING_TYPE_STRING_EXT specifies that the layer setting’s type is a pointer to a null-terminated UTF-8 string.</li>
        </ul>

        <h5>See Also</h5>
        ##VkLayerSettingEXT
        """,

        "LAYER_SETTING_TYPE_BOOL32_EXT".."0",
        "LAYER_SETTING_TYPE_INT32_EXT".."1",
        "LAYER_SETTING_TYPE_INT64_EXT".."2",
        "LAYER_SETTING_TYPE_UINT32_EXT".."3",
        "LAYER_SETTING_TYPE_UINT64_EXT".."4",
        "LAYER_SETTING_TYPE_FLOAT32_EXT".."5",
        "LAYER_SETTING_TYPE_FLOAT64_EXT".."6",
        "LAYER_SETTING_TYPE_STRING_EXT".."7"
    )
}