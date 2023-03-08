/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Linux-specific helpers.
 * 
 * <p>This includes helpers for manipulating Linux kernel cpumap files, and hwloc equivalents of the Linux sched_setaffinity and sched_getaffinity system
 * calls.</p>
 */
public class HWLocLinux {

    /** Contains the function pointers loaded from {@code HWLoc.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            linux_set_tid_cpubind           = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_linux_set_tid_cpubind"),
            linux_get_tid_cpubind           = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_linux_get_tid_cpubind"),
            linux_get_tid_last_cpu_location = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_linux_get_tid_last_cpu_location"),
            linux_read_path_as_cpumask      = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_linux_read_path_as_cpumask");

    }

    protected HWLocLinux() {
        throw new UnsupportedOperationException();
    }

    // --- [ hwloc_linux_set_tid_cpubind ] ---

    public static int hwloc_linux_set_tid_cpubind(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int tid, @NativeType("hwloc_const_cpuset_t") long set) {
        long __functionAddress = Functions.linux_set_tid_cpubind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, tid, set, __functionAddress);
    }

    // --- [ hwloc_linux_get_tid_cpubind ] ---

    public static int hwloc_linux_get_tid_cpubind(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int tid, @NativeType("hwloc_cpuset_t") long set) {
        long __functionAddress = Functions.linux_get_tid_cpubind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, tid, set, __functionAddress);
    }

    // --- [ hwloc_linux_get_tid_last_cpu_location ] ---

    public static int hwloc_linux_get_tid_last_cpu_location(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int tid, @NativeType("hwloc_bitmap_t") long set) {
        long __functionAddress = Functions.linux_get_tid_last_cpu_location;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, tid, set, __functionAddress);
    }

    // --- [ hwloc_linux_read_path_as_cpumask ] ---

    public static int nhwloc_linux_read_path_as_cpumask(long path, long set) {
        long __functionAddress = Functions.linux_read_path_as_cpumask;
        if (CHECKS) {
            check(set);
        }
        return invokePPI(path, set, __functionAddress);
    }

    public static int hwloc_linux_read_path_as_cpumask(@NativeType("char const *") ByteBuffer path, @NativeType("hwloc_bitmap_t") long set) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nhwloc_linux_read_path_as_cpumask(memAddress(path), set);
    }

    public static int hwloc_linux_read_path_as_cpumask(@NativeType("char const *") CharSequence path, @NativeType("hwloc_bitmap_t") long set) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nhwloc_linux_read_path_as_cpumask(pathEncoded, set);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

}