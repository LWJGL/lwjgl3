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
 * This extension adds a new function to reset queries from the host.
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_host_query_reset}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>262</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Bas Nieuwenhuizen <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?title=VK_EXT_host_query_reset:%20&amp;body=@BNieuwenhuizen%20">BNieuwenhuizen</a></li>
 * </ul></dd>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2019-03-06</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Bas Nieuwenhuizen, Google</li>
 * <li>Jason Ekstrand, Intel</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * <li>Piers Daniell, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTHostQueryReset {

    /** The extension specification version. */
    public static final int VK_EXT_HOST_QUERY_RESET_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_EXT_HOST_QUERY_RESET_EXTENSION_NAME = "VK_EXT_host_query_reset";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES_EXT = 1000261000;

    protected EXTHostQueryReset() {
        throw new UnsupportedOperationException();
    }

    static boolean checkCapsDevice(FunctionProvider provider, java.util.Map<String, Long> caps, java.util.Set<String> ext) {
        return ext.contains("VK_EXT_host_query_reset") && VK.checkExtension("VK_EXT_host_query_reset",
               VK.isSupported(provider, "vkResetQueryPoolEXT", caps)
        );
    }

    // --- [ vkResetQueryPoolEXT ] ---

    /**
     * Reset queries in a query pool.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To reset a range of queries in a query pool on the host, call:</p>
     * 
     * <pre><code>
     * void vkResetQueryPoolEXT(
     *     VkDevice                                    device,
     *     VkQueryPool                                 queryPool,
     *     uint32_t                                    firstQuery,
     *     uint32_t                                    queryCount);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the status of query indices <code>[firstQuery, firstQuery + queryCount - 1]</code> to unavailable.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#features-hostQueryReset">hostQueryReset</a> feature <b>must</b> be enabled</li>
     * <li>{@code firstQuery} <b>must</b> be less than the number of queries in {@code queryPool}</li>
     * <li>The sum of {@code firstQuery} and {@code queryCount} <b>must</b> be less than or equal to the number of queries in {@code queryPool}</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
     * <li>{@code queryPool} <b>must</b> be a valid {@code VkQueryPool} handle</li>
     * <li>{@code queryPool} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
     * </ul>
     *
     * @param queryPool  the handle of the query pool managing the queries being reset.
     * @param firstQuery the initial query index to reset.
     * @param queryCount the number of queries to reset.
     */
    public static void vkResetQueryPoolEXT(VkDevice device, @NativeType("VkQueryPool") long queryPool, @NativeType("uint32_t") int firstQuery, @NativeType("uint32_t") int queryCount) {
        long __functionAddress = device.getCapabilities().vkResetQueryPoolEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPJV(device.address(), queryPool, firstQuery, queryCount, __functionAddress);
    }

}