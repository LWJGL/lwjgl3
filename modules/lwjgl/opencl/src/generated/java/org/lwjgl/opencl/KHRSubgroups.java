/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/khr/cl_khr_subgroups.txt">khr_subgroups</a> extension.
 * 
 * <p>This extension adds support for implementation-controlled groups of work items, known as subgroups. Subgroups behave similarly to work groups and have
 * their own sets of built-ins and synchronization primitives. Subgroups within a work group are independent, may make forward progress with respect to
 * each other, and may map to optimized hardware structures where that makes sense.</p>
 * 
 * <p>Subgroups were promoted to a core feature in OpenCL 2.1, however note that:</p>
 * 
 * <ul>
 * <li>The subgroup OpenCL C built-in functions described by this extension must still be accessed as an OpenCL C extension in OpenCL 2.1.</li>
 * <li>Subgroup independent forward progress is an optional device property in OpenCL 2.1, see {@link CL21#CL_DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS}.</li>
 * </ul>
 */
public class KHRSubgroups {

    /** Accepted as the {@code param_name} parameter of {@link #clGetKernelSubGroupInfoKHR GetKernelSubGroupInfoKHR}. */
    public static final int
        CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR = 0x2033,
        CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR    = 0x2034;

    protected KHRSubgroups() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetKernelSubGroupInfoKHR ] ---

    /**
     * Unsafe version of: {@link #clGetKernelSubGroupInfoKHR GetKernelSubGroupInfoKHR}
     *
     * @param input_value_size specifies the size in bytes of memory pointed to by {@code input_value}. This size must be equal to the size of the input type.
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetKernelSubGroupInfoKHR(long kernel, long device, int param_name, long input_value_size, long input_value, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelSubGroupInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPPPPPI(kernel, device, param_name, input_value_size, input_value, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information about a kernel object.
     *
     * @param kernel               the kernel object being queried
     * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL
     *                             context that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a
     *                             {@code NULL} value.
     * @param param_name           specifies the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR}</td><td>{@link #CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR}</td></tr></table>
     * @param input_value          a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is {@code NULL} it is ignored.
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfoKHR(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @NativeType("void const *") ByteBuffer input_value, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfoKHR(kernel, device, param_name, input_value.remaining(), memAddress(input_value), remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about a kernel object.
     *
     * @param kernel               the kernel object being queried
     * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL
     *                             context that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a
     *                             {@code NULL} value.
     * @param param_name           specifies the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE_KHR}</td><td>{@link #CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE_KHR}</td></tr></table>
     * @param input_value          a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is {@code NULL} it is ignored.
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfoKHR(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @NativeType("void const *") ByteBuffer input_value, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfoKHR(kernel, device, param_name, input_value.remaining(), memAddress(input_value), Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

}