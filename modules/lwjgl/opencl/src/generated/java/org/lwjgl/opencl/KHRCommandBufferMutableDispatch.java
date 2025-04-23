/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

public class KHRCommandBufferMutableDispatch {

    public static final int CL_COMMAND_BUFFER_MUTABLE_KHR = 1 << 1;

    public static final int CL_INVALID_MUTABLE_COMMAND_KHR = -1141;

    public static final int CL_DEVICE_MUTABLE_DISPATCH_CAPABILITIES_KHR = 0x12B0;

    public static final int CL_MUTABLE_DISPATCH_UPDATABLE_FIELDS_KHR = 0x12B1;

    public static final int
        CL_MUTABLE_DISPATCH_GLOBAL_OFFSET_KHR = 1 << 0,
        CL_MUTABLE_DISPATCH_GLOBAL_SIZE_KHR   = 1 << 1,
        CL_MUTABLE_DISPATCH_LOCAL_SIZE_KHR    = 1 << 2,
        CL_MUTABLE_DISPATCH_ARGUMENTS_KHR     = 1 << 3,
        CL_MUTABLE_DISPATCH_EXEC_INFO_KHR     = 1 << 4;

    public static final int
        CL_MUTABLE_COMMAND_COMMAND_QUEUE_KHR       = 0x12A0,
        CL_MUTABLE_COMMAND_COMMAND_BUFFER_KHR      = 0x12A1,
        CL_MUTABLE_COMMAND_COMMAND_TYPE_KHR        = 0x12AD,
        CL_MUTABLE_COMMAND_PROPERTIES_ARRAY_KHR    = 0x12A2,
        CL_MUTABLE_DISPATCH_KERNEL_KHR             = 0x12A3,
        CL_MUTABLE_DISPATCH_DIMENSIONS_KHR         = 0x12A4,
        CL_MUTABLE_DISPATCH_GLOBAL_WORK_OFFSET_KHR = 0x12A5,
        CL_MUTABLE_DISPATCH_GLOBAL_WORK_SIZE_KHR   = 0x12A6,
        CL_MUTABLE_DISPATCH_LOCAL_WORK_SIZE_KHR    = 0x12A7;

    public static final int CL_STRUCTURE_TYPE_MUTABLE_DISPATCH_CONFIG_KHR = 0x0;

    public static final int CL_COMMAND_BUFFER_MUTABLE_DISPATCH_ASSERTS_KHR = 0x12B7;

    public static final int CL_MUTABLE_DISPATCH_ASSERTS_KHR = 0x12B8;

    public static final int CL_MUTABLE_DISPATCH_ASSERT_NO_ADDITIONAL_WORK_GROUPS_KHR = 1 << 0;

    protected KHRCommandBufferMutableDispatch() {
        throw new UnsupportedOperationException();
    }

    // --- [ clUpdateMutableCommandsKHR ] ---

    /** {@code cl_int clUpdateMutableCommandsKHR(cl_command_buffer_khr command_buffer, cl_uint num_configs, cl_command_buffer_update_type_khr const * config_types, void const ** configs)} */
    public static int nclUpdateMutableCommandsKHR(long command_buffer, int num_configs, long config_types, long configs) {
        long __functionAddress = CL.getICD().clUpdateMutableCommandsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPI(command_buffer, num_configs, config_types, configs, __functionAddress);
    }

    /** {@code cl_int clUpdateMutableCommandsKHR(cl_command_buffer_khr command_buffer, cl_uint num_configs, cl_command_buffer_update_type_khr const * config_types, void const ** configs)} */
    @NativeType("cl_int")
    public static int clUpdateMutableCommandsKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_update_type_khr const *") @Nullable IntBuffer config_types, @NativeType("void const **") @Nullable PointerBuffer configs) {
        if (CHECKS) {
            checkSafe(configs, remainingSafe(config_types));
        }
        return nclUpdateMutableCommandsKHR(command_buffer, remainingSafe(config_types), memAddressSafe(config_types), memAddressSafe(configs));
    }

    // --- [ clGetMutableCommandInfoKHR ] ---

    /** {@code cl_int clGetMutableCommandInfoKHR(cl_mutable_command_khr command, cl_mutable_command_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetMutableCommandInfoKHR(long command, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMutableCommandInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command);
        }
        return callPPPPI(command, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetMutableCommandInfoKHR(cl_mutable_command_khr command, cl_mutable_command_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMutableCommandInfoKHR(@NativeType("cl_mutable_command_khr") long command, @NativeType("cl_mutable_command_info_khr") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMutableCommandInfoKHR(command, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetMutableCommandInfoKHR(cl_mutable_command_khr command, cl_mutable_command_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMutableCommandInfoKHR(@NativeType("cl_mutable_command_khr") long command, @NativeType("cl_mutable_command_info_khr") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMutableCommandInfoKHR(command, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetMutableCommandInfoKHR(cl_mutable_command_khr command, cl_mutable_command_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMutableCommandInfoKHR(@NativeType("cl_mutable_command_khr") long command, @NativeType("cl_mutable_command_info_khr") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMutableCommandInfoKHR(command, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clUpdateMutableCommandsKHR(cl_command_buffer_khr command_buffer, cl_uint num_configs, cl_command_buffer_update_type_khr const * config_types, void const ** configs)} */
    @NativeType("cl_int")
    public static int clUpdateMutableCommandsKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_update_type_khr const *") int @Nullable [] config_types, @NativeType("void const **") @Nullable PointerBuffer configs) {
        long __functionAddress = CL.getICD().clUpdateMutableCommandsKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkSafe(configs, lengthSafe(config_types));
        }
        return callPPPI(command_buffer, lengthSafe(config_types), config_types, memAddressSafe(configs), __functionAddress);
    }

    /** {@code cl_int clGetMutableCommandInfoKHR(cl_mutable_command_khr command, cl_mutable_command_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMutableCommandInfoKHR(@NativeType("cl_mutable_command_khr") long command, @NativeType("cl_mutable_command_info_khr") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMutableCommandInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(command, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}