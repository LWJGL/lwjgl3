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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class INTELProgramScopeHostPipe {

    public static final int
        CL_COMMAND_READ_HOST_PIPE_INTEL  = 0x4214,
        CL_COMMAND_WRITE_HOST_PIPE_INTEL = 0x4215;

    public static final int
        CL_PROGRAM_NUM_HOST_PIPES_INTEL  = 0x4216,
        CL_PROGRAM_HOST_PIPE_NAMES_INTEL = 0x4217;

    protected INTELProgramScopeHostPipe() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueReadHostPipeINTEL ] ---

    /** {@code cl_int clEnqueueReadHostPipeINTEL(cl_command_queue command_queue, cl_program program, char const * pipe_symbol, cl_bool blocking_read, void * ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReadHostPipeINTEL(long command_queue, long program, long pipe_symbol, int blocking_read, long ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReadHostPipeINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(program);
        }
        return callPPPPPPPI(command_queue, program, pipe_symbol, blocking_read, ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReadHostPipeINTEL(cl_command_queue command_queue, cl_program program, char const * pipe_symbol, cl_bool blocking_read, void * ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadHostPipeINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_program") long program, @NativeType("char const *") ByteBuffer pipe_symbol, @NativeType("cl_bool") boolean blocking_read, @NativeType("void *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkNT1(pipe_symbol);
            checkSafe(event, 1);
        }
        return nclEnqueueReadHostPipeINTEL(command_queue, program, memAddress(pipe_symbol), blocking_read ? 1 : 0, memAddress(ptr), ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadHostPipeINTEL(cl_command_queue command_queue, cl_program program, char const * pipe_symbol, cl_bool blocking_read, void * ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadHostPipeINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_program") long program, @NativeType("char const *") CharSequence pipe_symbol, @NativeType("cl_bool") boolean blocking_read, @NativeType("void *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pipe_symbol, true);
            long pipe_symbolEncoded = stack.getPointerAddress();
            return nclEnqueueReadHostPipeINTEL(command_queue, program, pipe_symbolEncoded, blocking_read ? 1 : 0, memAddress(ptr), ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clEnqueueWriteHostPipeINTEL ] ---

    /** {@code cl_int clEnqueueWriteHostPipeINTEL(cl_command_queue command_queue, cl_program program, char const * pipe_symbol, cl_bool blocking_write, void const * ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueWriteHostPipeINTEL(long command_queue, long program, long pipe_symbol, int blocking_write, long ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteHostPipeINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(program);
        }
        return callPPPPPPPI(command_queue, program, pipe_symbol, blocking_write, ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteHostPipeINTEL(cl_command_queue command_queue, cl_program program, char const * pipe_symbol, cl_bool blocking_write, void const * ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteHostPipeINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_program") long program, @NativeType("char const *") ByteBuffer pipe_symbol, @NativeType("cl_bool") boolean blocking_write, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkNT1(pipe_symbol);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteHostPipeINTEL(command_queue, program, memAddress(pipe_symbol), blocking_write ? 1 : 0, memAddress(ptr), ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteHostPipeINTEL(cl_command_queue command_queue, cl_program program, char const * pipe_symbol, cl_bool blocking_write, void const * ptr, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteHostPipeINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_program") long program, @NativeType("char const *") CharSequence pipe_symbol, @NativeType("cl_bool") boolean blocking_write, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pipe_symbol, true);
            long pipe_symbolEncoded = stack.getPointerAddress();
            return nclEnqueueWriteHostPipeINTEL(command_queue, program, pipe_symbolEncoded, blocking_write ? 1 : 0, memAddress(ptr), ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}