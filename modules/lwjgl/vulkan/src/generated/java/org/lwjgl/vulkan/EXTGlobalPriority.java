/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * In Vulkan, users can specify device-scope queue priorities. In some cases it may be useful to extend this concept to a system-wide scope. This extension provides a mechanism for callers to set their system-wide priority. The default queue priority is {@link #VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT}.
 * 
 * <p>The driver implementation will attempt to skew hardware resource allocation in favour of the higher-priority task. Therefore, higher-priority work may retain similar latency and throughput characteristics even if the system is congested with lower priority work.</p>
 * 
 * <p>The global priority level of a queue shall take precedence over the per-process queue priority ({@link VkDeviceQueueCreateInfo}{@code ::pQueuePriorities}).</p>
 * 
 * <p>Abuse of this feature may result in starving the rest of the system from hardware resources. Therefore, the driver implementation may deny requests to acquire a priority above the default priority ({@link #VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT}) if the caller does not have sufficient privileges. In this scenario {@link #VK_ERROR_NOT_PERMITTED_EXT ERROR_NOT_PERMITTED_EXT} is returned.</p>
 * 
 * <p>The driver implementation may fail the queue allocation request if resources required to complete the operation have been exhausted (either by the same process or a different process). In this scenario {@link VK10#VK_ERROR_INITIALIZATION_FAILED ERROR_INITIALIZATION_FAILED} is returned.</p>
 * 
 * <h5>VK_EXT_global_priority</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_global_priority}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>175</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Promoted</em> to {@link KHRGlobalPriority VK_KHR_global_priority} extension</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Andres Rodriguez <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_global_priority]%20@lostgoat%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_global_priority%20extension%3E%3E">lostgoat</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2017-10-06</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Andres Rodriguez, Valve</li>
 * <li>Pierre-Loup Griffais, Valve</li>
 * <li>Dan Ginsburg, Valve</li>
 * <li>Mitch Singer, AMD</li>
 * </ul></dd>
 * </dl>
 */
public final class EXTGlobalPriority {

    /** The extension specification version. */
    public static final int VK_EXT_GLOBAL_PRIORITY_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_GLOBAL_PRIORITY_EXTENSION_NAME = "VK_EXT_global_priority";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_EXT = 1000174000;

    /** Extends {@code VkResult}. */
    public static final int VK_ERROR_NOT_PERMITTED_EXT = -1000174001;

    /**
     * VkQueueGlobalPriorityKHR - Values specifying a system-wide queue priority
     * 
     * <h5>Description</h5>
     * 
     * <p>Priority values are sorted in ascending order. A comparison operation on the enum values can be used to determine the priority order.</p>
     * 
     * <ul>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_LOW_KHR QUEUE_GLOBAL_PRIORITY_LOW_KHR} is below the system default. Useful for non-interactive tasks.</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR} is the system default priority.</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_HIGH_KHR QUEUE_GLOBAL_PRIORITY_HIGH_KHR} is above the system default.</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_REALTIME_KHR QUEUE_GLOBAL_PRIORITY_REALTIME_KHR} is the highest priority. Useful for critical tasks.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkDeviceQueueGlobalPriorityCreateInfoKHR}, {@link VkQueueFamilyGlobalPriorityPropertiesKHR}</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT QUEUE_GLOBAL_PRIORITY_LOW_EXT}</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT}</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT QUEUE_GLOBAL_PRIORITY_HIGH_EXT}</li>
     * <li>{@link #VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT QUEUE_GLOBAL_PRIORITY_REALTIME_EXT}</li>
     * </ul>
     */
    public static final int
        VK_QUEUE_GLOBAL_PRIORITY_LOW_KHR      = 128,
        VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_KHR   = 256,
        VK_QUEUE_GLOBAL_PRIORITY_HIGH_KHR     = 512,
        VK_QUEUE_GLOBAL_PRIORITY_REALTIME_KHR = 1024,
        VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT      = 128,
        VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT   = 256,
        VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT     = 512,
        VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT = 1024;

    private EXTGlobalPriority() {}

}