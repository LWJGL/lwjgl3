/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

/**
 * This extension is intended to communicate information from layered API implementations such as ANGLE to internal proprietary system schedulers. It has no behavioural implications beyond enabling more intelligent behaviour from the system scheduler.
 * 
 * <p>Application developers should avoid using this extension. It is documented solely for the benefit of tools and layer developers, who may need to manipulate {@code pNext} chains that include these structures.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There is currently no specification language written for this extension. The links to APIs defined by the extension are to stubs that only include generated content such as API declarations and implicit valid usage statements.</p>
 * </div>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This extension is only intended for use in specific embedded environments with known implementation details, and is therefore undocumented.</p>
 * </div>
 * 
 * <h5>Stub API References</h5>
 * 
 * <p>There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * typedef struct VkPhysicalDeviceAmigoProfilingFeaturesSEC {
 *     VkStructureType    sType;
 *     void*              pNext;
 *     VkBool32           amigoProfiling;
 * } VkPhysicalDeviceAmigoProfilingFeaturesSEC;</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC}</li>
 * </ul>
 * 
 * <p>There is currently no specification language written for this type. This section acts only as placeholder and to avoid dead links in the specification and reference pages.</p>
 * 
 * <pre><code>
 * typedef struct VkAmigoProfilingSubmitInfoSEC {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     uint64_t           firstDrawTimestamp;
 *     uint64_t           swapBufferTimestamp;
 * } VkAmigoProfilingSubmitInfoSEC;</code></pre>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link #VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC}</li>
 * </ul>
 * 
 * <h5>VK_SEC_amigo_profiling</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_SEC_amigo_profiling}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>486</dd>
 * <dt><b>Revision</b></dt>
 * <dd>1</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Ralph Potter r_potter</li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2022-07-29</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Ralph Potter, Samsung</li>
 * <li>Sangrak Oh, Samsung</li>
 * <li>Jinku Kang, Samsung</li>
 * </ul></dd>
 * </dl>
 */
public final class SECAmigoProfiling {

    /** The extension specification version. */
    public static final int VK_SEC_AMIGO_PROFILING_SPEC_VERSION = 1;

    /** The extension name. */
    public static final String VK_SEC_AMIGO_PROFILING_EXTENSION_NAME = "VK_SEC_amigo_profiling";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC = 1000485000,
        VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC              = 1000485001;

    private SECAmigoProfiling() {}

}