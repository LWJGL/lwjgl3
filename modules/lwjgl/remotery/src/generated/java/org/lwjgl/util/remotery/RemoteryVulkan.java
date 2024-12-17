/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class RemoteryVulkan {

    static { LibRemotery.initialize(); }

    protected RemoteryVulkan() {
        throw new UnsupportedOperationException();
    }

    // --- [ rmt_BindVulkan ] ---

    /** {@code void rmt_BindVulkan(VkInstance instance, VkPhysicalDevice physical_device, VkDevice device, VkQueue queue, rmtVulkanFunctions const * funcs, rmtVulkanBind ** out_bind)} */
    public static native void nrmt_BindVulkan(long instance, long physical_device, long device, long queue, long funcs, long out_bind);

    /** {@code void rmt_BindVulkan(VkInstance instance, VkPhysicalDevice physical_device, VkDevice device, VkQueue queue, rmtVulkanFunctions const * funcs, rmtVulkanBind ** out_bind)} */
    public static void rmt_BindVulkan(@NativeType("VkInstance") long instance, @NativeType("VkPhysicalDevice") long physical_device, @NativeType("VkDevice") long device, @NativeType("VkQueue") long queue, @NativeType("rmtVulkanFunctions const *") RMTVulkanFunctions funcs, @NativeType("rmtVulkanBind **") PointerBuffer out_bind) {
        if (CHECKS) {
            check(instance);
            check(physical_device);
            check(device);
            check(queue);
            check(out_bind, 1);
            RMTVulkanFunctions.validate(funcs.address());
        }
        nrmt_BindVulkan(instance, physical_device, device, queue, funcs.address(), memAddress(out_bind));
    }

    // --- [ rmt_UnbindVulkan ] ---

    /** {@code void rmt_UnbindVulkan(rmtVulkanBind * bind)} */
    public static native void nrmt_UnbindVulkan(long bind);

    /** {@code void rmt_UnbindVulkan(rmtVulkanBind * bind)} */
    public static void rmt_UnbindVulkan(@NativeType("rmtVulkanBind *") RMTVulkanBind bind) {
        nrmt_UnbindVulkan(bind.address());
    }

    // --- [ rmt_BeginVulkanSample ] ---

    /** {@code void rmt_BeginVulkanSample(rmtVulkanBind * bind, VkCommandBuffer command_buffer, rmtPStr name, rmtU32 * hash_cache)} */
    public static native void nrmt_BeginVulkanSample(long bind, long command_buffer, long name, long hash_cache);

    /** {@code void rmt_BeginVulkanSample(rmtVulkanBind * bind, VkCommandBuffer command_buffer, rmtPStr name, rmtU32 * hash_cache)} */
    public static void rmt_BeginVulkanSample(@NativeType("rmtVulkanBind *") RMTVulkanBind bind, @NativeType("VkCommandBuffer") long command_buffer, @NativeType("rmtPStr") ByteBuffer name, @NativeType("rmtU32 *") @Nullable IntBuffer hash_cache) {
        if (CHECKS) {
            check(command_buffer);
            checkNT1(name);
            checkSafe(hash_cache, 1);
        }
        nrmt_BeginVulkanSample(bind.address(), command_buffer, memAddress(name), memAddressSafe(hash_cache));
    }

    /** {@code void rmt_BeginVulkanSample(rmtVulkanBind * bind, VkCommandBuffer command_buffer, rmtPStr name, rmtU32 * hash_cache)} */
    public static void rmt_BeginVulkanSample(@NativeType("rmtVulkanBind *") RMTVulkanBind bind, @NativeType("VkCommandBuffer") long command_buffer, @NativeType("rmtPStr") CharSequence name, @NativeType("rmtU32 *") @Nullable IntBuffer hash_cache) {
        if (CHECKS) {
            check(command_buffer);
            checkSafe(hash_cache, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nrmt_BeginVulkanSample(bind.address(), command_buffer, nameEncoded, memAddressSafe(hash_cache));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ rmt_EndVulkanSample ] ---

    /** {@code void rmt_EndVulkanSample(void)} */
    public static native void rmt_EndVulkanSample();

}