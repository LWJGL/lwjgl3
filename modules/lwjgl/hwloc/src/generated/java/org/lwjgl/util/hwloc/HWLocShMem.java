/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Sharing topologies between processes.
 * 
 * <p>These functions are used to share a topology between processes by duplicating it into a file-backed shared-memory buffer.</p>
 * 
 * <p>The master process must first get the required shared-memory size for storing this topology with {@link #hwloc_shmem_topology_get_length shmem_topology_get_length}.</p>
 * 
 * <p>Then it must find a virtual memory area of that size that is available in all processes (identical virtual addresses in all processes).  On Linux, this
 * can be done by comparing holes found in {@code /proc/\<pid\>/maps} for each process.</p>
 * 
 * <p>Once found, it must open a destination file for storing the buffer, and pass it to {@link #hwloc_shmem_topology_write shmem_topology_write} together with virtual memory address and
 * length obtained above.</p>
 * 
 * <p>Other processes may then adopt this shared topology by opening the same file and passing it to {@link #hwloc_shmem_topology_adopt shmem_topology_adopt} with the exact same virtual
 * memory address and length.</p>
 */
public class HWLocShMem {

    /** Contains the function pointers loaded from {@code HWLoc.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            shmem_topology_get_length = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_shmem_topology_get_length"),
            shmem_topology_write      = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_shmem_topology_write"),
            shmem_topology_adopt      = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_shmem_topology_adopt");

    }

    protected HWLocShMem() {
        throw new UnsupportedOperationException();
    }

    // --- [ hwloc_shmem_topology_get_length ] ---

    public static int nhwloc_shmem_topology_get_length(long topology, long lengthp, long flags) {
        long __functionAddress = Functions.shmem_topology_get_length;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNI(topology, lengthp, flags, __functionAddress);
    }

    public static int hwloc_shmem_topology_get_length(@NativeType("hwloc_topology_t") long topology, @NativeType("size_t *") PointerBuffer lengthp, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(lengthp, 1);
        }
        return nhwloc_shmem_topology_get_length(topology, memAddress(lengthp), flags);
    }

    // --- [ hwloc_shmem_topology_write ] ---

    public static int nhwloc_shmem_topology_write(long topology, int fd, long fileoffset, long mmap_address, long length, long flags) {
        long __functionAddress = Functions.shmem_topology_write;
        if (CHECKS) {
            check(topology);
        }
        return invokePJPPNI(topology, fd, fileoffset, mmap_address, length, flags, __functionAddress);
    }

    public static int hwloc_shmem_topology_write(@NativeType("hwloc_topology_t") long topology, int fd, @NativeType("hwloc_uint64_t") long fileoffset, @NativeType("void *") ByteBuffer mmap_address, @NativeType("unsigned long") long flags) {
        return nhwloc_shmem_topology_write(topology, fd, fileoffset, memAddress(mmap_address), mmap_address.remaining(), flags);
    }

    // --- [ hwloc_shmem_topology_adopt ] ---

    public static int nhwloc_shmem_topology_adopt(long topologyp, int fd, long fileoffset, long mmap_address, long length, long flags) {
        long __functionAddress = Functions.shmem_topology_adopt;
        return invokePJPPNI(topologyp, fd, fileoffset, mmap_address, length, flags, __functionAddress);
    }

    public static int hwloc_shmem_topology_adopt(@NativeType("hwloc_topology_t *") PointerBuffer topologyp, int fd, @NativeType("hwloc_uint64_t") long fileoffset, @NativeType("void *") ByteBuffer mmap_address, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(topologyp, 1);
        }
        return nhwloc_shmem_topology_adopt(memAddress(topologyp), fd, fileoffset, memAddress(mmap_address), mmap_address.remaining(), flags);
    }

}