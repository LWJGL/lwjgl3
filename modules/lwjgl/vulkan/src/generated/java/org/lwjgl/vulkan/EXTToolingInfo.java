/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * When an error occurs during application development, a common question is "What tools are actually running right now?" This extension adds the ability to query that information directly from the Vulkan implementation.
 * 
 * <p>Outdated versions of one tool might not play nicely with another, or perhaps a tool is not actually running when it should have been. Trying to figure that out can cause headaches as it is necessary to consult each known tool to figure out what is going on — in some cases the tool might not even be known.</p>
 * 
 * <p>Typically, the expectation is that developers will simply print out this information for visual inspection when an issue occurs, however a small amount of semantic information about what the tool is doing is provided to help identify it programmatically. For example, if the advertised limits or features of an implementation are unexpected, is there a tool active which modifies these limits? Or if an application is providing debug markers, but the implementation is not actually doing anything with that information, this can quickly point that out.</p>
 * 
 * <h5>Promotion to Vulkan 1.3</h5>
 * 
 * <p>Functionality in this extension is included in core Vulkan 1.3, with the EXT suffix omitted. The original type, enum and command names are still available as aliases of the core functionality.</p>
 * 
 * <h5>Examples</h5>
 * 
 * <pre><code>
 * uint32_t num_tools;
 * VkPhysicalDeviceToolPropertiesEXT *pToolProperties;
 * vkGetPhysicalDeviceToolPropertiesEXT(physicalDevice, &amp;num_tools, NULL);
 * 
 * pToolProperties = (VkPhysicalDeviceToolPropertiesEXT*)malloc(sizeof(VkPhysicalDeviceToolPropertiesEXT) * num_tools);
 * 
 * vkGetPhysicalDeviceToolPropertiesEXT(physicalDevice, &amp;num_tools, pToolProperties);
 * 
 * for (int i = 0; i &lt; num_tools; ++i) {
 *     printf("%s:\n", pToolProperties[i].name);
 *     printf("Version:\n");
 *     printf("%s:\n", pToolProperties[i].version);
 *     printf("Description:\n");
 *     printf("\t%s\n", pToolProperties[i].description);
 *     printf("Purposes:\n");
 *     printf("\t%s\n", VkToolPurposeFlagBitsEXT_to_string(pToolProperties[i].purposes));
 *     if (strnlen_s(pToolProperties[i].layer,VK_MAX_EXTENSION_NAME_SIZE) &gt; 0) {
 *         printf("Corresponding Layer:\n");
 *         printf("\t%s\n", pToolProperties[i].layer);
 *     }
 * }</code></pre>
 * 
 * <h5>VK_EXT_tooling_info</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_tooling_info}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>246</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#versions-1.3-promotions">Vulkan 1.3</a></li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Tobias Hector <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_tooling_info]%20@tobski%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_tooling_info%20extension%3E%3E">tobski</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2018-11-05</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Promoted to Vulkan 1.3 Core</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Rolando Caloca</li>
 * <li>Matthaeus Chajdas</li>
 * <li>Baldur Karlsson</li>
 * <li>Daniel Rakos</li>
 * </ul></dd>
 * </dl>
 */
public class EXTToolingInfo {

    /** The extension specification version. */
    public static final int VK_EXT_TOOLING_INFO_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES_EXT = 1000245000;

    /**
     * Extends {@code VkToolPurposeFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_TOOL_PURPOSE_VALIDATION_BIT_EXT TOOL_PURPOSE_VALIDATION_BIT_EXT}</li>
     * <li>{@link #VK_TOOL_PURPOSE_PROFILING_BIT_EXT TOOL_PURPOSE_PROFILING_BIT_EXT}</li>
     * <li>{@link #VK_TOOL_PURPOSE_TRACING_BIT_EXT TOOL_PURPOSE_TRACING_BIT_EXT}</li>
     * <li>{@link #VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT}</li>
     * <li>{@link #VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_TOOL_PURPOSE_VALIDATION_BIT_EXT          = 0x1,
        VK_TOOL_PURPOSE_PROFILING_BIT_EXT           = 0x2,
        VK_TOOL_PURPOSE_TRACING_BIT_EXT             = 0x4,
        VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT = 0x8,
        VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT  = 0x10;

    /**
     * Extends {@code VkToolPurposeFlagBits}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT}</li>
     * <li>{@link #VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT}</li>
     * </ul>
     */
    public static final int
        VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT = 0x20,
        VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT   = 0x40;

    protected EXTToolingInfo() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkGetPhysicalDeviceToolPropertiesEXT ] ---

    /**
     * Unsafe version of: {@link #vkGetPhysicalDeviceToolPropertiesEXT GetPhysicalDeviceToolPropertiesEXT}
     *
     * @param pToolCount a pointer to an integer describing the number of tools active on {@code physicalDevice}.
     */
    public static int nvkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, long pToolCount, long pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPI(physicalDevice.address(), pToolCount, pToolProperties, __functionAddress);
    }

    /**
     * See {@link VK13#vkGetPhysicalDeviceToolProperties GetPhysicalDeviceToolProperties}.
     *
     * @param physicalDevice  the handle to the physical device to query for active tools.
     * @param pToolCount      a pointer to an integer describing the number of tools active on {@code physicalDevice}.
     * @param pToolProperties either {@code NULL} or a pointer to an array of {@link VkPhysicalDeviceToolProperties} structures.
     */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") IntBuffer pToolCount, @Nullable @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        if (CHECKS) {
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount.get(pToolCount.position()));
        }
        return nvkGetPhysicalDeviceToolPropertiesEXT(physicalDevice, memAddress(pToolCount), memAddressSafe(pToolProperties));
    }

    /** Array version of: {@link #vkGetPhysicalDeviceToolPropertiesEXT GetPhysicalDeviceToolPropertiesEXT} */
    @NativeType("VkResult")
    public static int vkGetPhysicalDeviceToolPropertiesEXT(VkPhysicalDevice physicalDevice, @NativeType("uint32_t *") int[] pToolCount, @Nullable @NativeType("VkPhysicalDeviceToolProperties *") VkPhysicalDeviceToolProperties.Buffer pToolProperties) {
        long __functionAddress = physicalDevice.getCapabilities().vkGetPhysicalDeviceToolPropertiesEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(pToolCount, 1);
            checkSafe(pToolProperties, pToolCount[0]);
        }
        return callPPPI(physicalDevice.address(), pToolCount, memAddressSafe(pToolProperties), __functionAddress);
    }

}