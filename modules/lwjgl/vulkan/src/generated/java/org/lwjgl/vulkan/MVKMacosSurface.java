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
 * The {@code VK_MVK_macos_surface} extension is an instance extension. It provides a mechanism to create a {@code VkSurfaceKHR} object (defined by the {@link KHRSurface VK_KHR_surface} extension) based on an {@code NSView}, the native surface type of macOS, which is underpinned by a {@code CAMetalLayer}, to support rendering to the surface using Apple’s Metal framework.
 * 
 * <h5>Deprecation by {@code VK_EXT_metal_surface}</h5>
 * 
 * <p>The {@code VK_MVK_macos_surface} extension is considered deprecated and has been superseded by the {@link EXTMetalSurface VK_EXT_metal_surface} extension.</p>
 * 
 * <h5>VK_MVK_macos_surface</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_MVK_macos_surface}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Instance extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>124</dd>
 * <dt><b>Revision</b></dt>
 * <dd>3</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd><ul>
 * <li>Requires Vulkan 1.0</li>
 * <li>Requires {@link KHRSurface VK_KHR_surface}</li>
 * </ul></dd>
 * <dt><b>Deprecation state</b></dt>
 * <dd><ul>
 * <li><em>Deprecated</em> by {@link EXTMetalSurface VK_EXT_metal_surface} extension</li>
 * </ul></dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Bill Hollings <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_MVK_macos_surface]%20@billhollings%250A%3C%3CHere%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_MVK_macos_surface%20extension%3E%3E">billhollings</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2020-07-31</dd>
 * <dt><b>IP Status</b></dt>
 * <dd>No known IP claims.</dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Bill Hollings, The Brenwill Workshop Ltd.</li>
 * </ul></dd>
 * </dl>
 */
public class MVKMacosSurface {

    /** The extension specification version. */
    public static final int VK_MVK_MACOS_SURFACE_SPEC_VERSION = 3;

    /** The extension name. */
    public static final String VK_MVK_MACOS_SURFACE_EXTENSION_NAME = "VK_MVK_macos_surface";

    /** Extends {@code VkStructureType}. */
    public static final int VK_STRUCTURE_TYPE_MACOS_SURFACE_CREATE_INFO_MVK = 1000123000;

    protected MVKMacosSurface() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCreateMacOSSurfaceMVK ] ---

    /** Unsafe version of: {@link #vkCreateMacOSSurfaceMVK CreateMacOSSurfaceMVK} */
    public static int nvkCreateMacOSSurfaceMVK(VkInstance instance, long pCreateInfo, long pAllocator, long pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateMacOSSurfaceMVK;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPPI(instance.address(), pCreateInfo, pAllocator, pSurface, __functionAddress);
    }

    /**
     * Create a VkSurfaceKHR object for a macOS NSView.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To create a {@code VkSurfaceKHR} object for a macOS {@code NSView} or {@code CAMetalLayer}, call:</p>
     * 
     * <pre><code>
     * VkResult vkCreateMacOSSurfaceMVK(
     *     VkInstance                                  instance,
     *     const VkMacOSSurfaceCreateInfoMVK*          pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The {@code vkCreateMacOSSurfaceMVK} function is considered deprecated and has been superseded by {@link EXTMetalSurface#vkCreateMetalSurfaceEXT CreateMetalSurfaceEXT} from the {@link EXTMetalSurface VK_EXT_metal_surface} extension.</p>
     * </div>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code instance} <b>must</b> be a valid {@code VkInstance} handle</li>
     * <li>{@code pCreateInfo} <b>must</b> be a valid pointer to a valid {@link VkMacOSSurfaceCreateInfoMVK} structure</li>
     * <li>If {@code pAllocator} is not {@code NULL}, {@code pAllocator} <b>must</b> be a valid pointer to a valid {@link VkAllocationCallbacks} structure</li>
     * <li>{@code pSurface} <b>must</b> be a valid pointer to a {@code VkSurfaceKHR} handle</li>
     * </ul>
     * 
     * <h5>Return Codes</h5>
     * 
     * <dl>
     * <dt>On success, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_SUCCESS SUCCESS}</li>
     * </ul></dd>
     * <dt>On failure, this command returns</dt>
     * <dd><ul>
     * <li>{@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY}</li>
     * <li>{@link VK10#VK_ERROR_OUT_OF_DEVICE_MEMORY ERROR_OUT_OF_DEVICE_MEMORY}</li>
     * <li>{@link KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR ERROR_NATIVE_WINDOW_IN_USE_KHR}</li>
     * </ul></dd>
     * </dl>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkAllocationCallbacks}, {@link VkMacOSSurfaceCreateInfoMVK}</p>
     *
     * @param instance    the instance with which to associate the surface.
     * @param pCreateInfo a pointer to a {@link VkMacOSSurfaceCreateInfoMVK} structure containing parameters affecting the creation of the surface object.
     * @param pAllocator  the allocator used for host memory allocated for the surface object when there is no more specific allocator available (see <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-allocation">Memory Allocation</a>).
     * @param pSurface    a pointer to a {@code VkSurfaceKHR} handle in which the created surface object is returned.
     */
    @NativeType("VkResult")
    public static int vkCreateMacOSSurfaceMVK(VkInstance instance, @NativeType("VkMacOSSurfaceCreateInfoMVK const *") VkMacOSSurfaceCreateInfoMVK pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") LongBuffer pSurface) {
        if (CHECKS) {
            check(pSurface, 1);
        }
        return nvkCreateMacOSSurfaceMVK(instance, pCreateInfo.address(), memAddressSafe(pAllocator), memAddress(pSurface));
    }

    /** Array version of: {@link #vkCreateMacOSSurfaceMVK CreateMacOSSurfaceMVK} */
    @NativeType("VkResult")
    public static int vkCreateMacOSSurfaceMVK(VkInstance instance, @NativeType("VkMacOSSurfaceCreateInfoMVK const *") VkMacOSSurfaceCreateInfoMVK pCreateInfo, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks pAllocator, @NativeType("VkSurfaceKHR *") long[] pSurface) {
        long __functionAddress = instance.getCapabilities().vkCreateMacOSSurfaceMVK;
        if (CHECKS) {
            check(__functionAddress);
            check(pSurface, 1);
        }
        return callPPPPI(instance.address(), pCreateInfo.address(), memAddressSafe(pAllocator), pSurface, __functionAddress);
    }

}