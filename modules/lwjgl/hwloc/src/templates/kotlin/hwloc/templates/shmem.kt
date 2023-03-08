/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc.templates

import org.lwjgl.generator.*
import hwloc.*

val hwloc_shmem = "HWLocShMem".nativeClass(Module.HWLOC, prefix = "HWLOC", prefixMethod = "hwloc_", binding = HWLOC_BINDING_DELEGATE) {
    documentation =
        """
        Sharing topologies between processes.

        These functions are used to share a topology between processes by duplicating it into a file-backed shared-memory buffer.
 
        The master process must first get the required shared-memory size for storing this topology with #shmem_topology_get_length().

        Then it must find a virtual memory area of that size that is available in all processes (identical virtual addresses in all processes).  On Linux, this
        can be done by comparing holes found in {@code /proc/\<pid\>/maps} for each process.

        Once found, it must open a destination file for storing the buffer, and pass it to #shmem_topology_write() together with virtual memory address and
        length obtained above.

        Other processes may then adopt this shared topology by opening the same file and passing it to #shmem_topology_adopt() with the exact same virtual
        memory address and length.
        """

    int(
        "shmem_topology_get_length",
        "",

        hwloc_topology_t("topology", ""),
        Check(1)..size_t.p("lengthp", ""),
        unsigned_long("flags", "")
    )

    int(
        "shmem_topology_write",
        "",

        hwloc_topology_t("topology", ""),
        int("fd", ""),
        hwloc_uint64_t("fileoffset", ""),
        void.p("mmap_address", ""),
        AutoSize("mmap_address")..size_t("length", ""),
        unsigned_long("flags", "")
    )

    int(
        "shmem_topology_adopt",
        "",

        Check(1)..hwloc_topology_t.p("topologyp", ""),
        int("fd", ""),
        hwloc_uint64_t("fileoffset", ""),
        void.p("mmap_address", ""),
        AutoSize("mmap_address")..size_t("length", ""),
        unsigned_long("flags", "")
    )
}