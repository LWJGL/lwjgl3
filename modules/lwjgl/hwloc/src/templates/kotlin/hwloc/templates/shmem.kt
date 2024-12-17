/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc.templates

import org.lwjgl.generator.*
import hwloc.*

val hwloc_shmem = "HWLocShMem".nativeClass(Module.HWLOC, prefix = "HWLOC", prefixMethod = "hwloc_", binding = HWLOC_BINDING_DELEGATE) {
    int(
        "shmem_topology_get_length",

        hwloc_topology_t("topology"),
        Check(1)..size_t.p("lengthp"),
        unsigned_long("flags")
    )

    int(
        "shmem_topology_write",

        hwloc_topology_t("topology"),
        int("fd"),
        hwloc_uint64_t("fileoffset"),
        void.p("mmap_address"),
        AutoSize("mmap_address")..size_t("length"),
        unsigned_long("flags")
    )

    int(
        "shmem_topology_adopt",

        Check(1)..hwloc_topology_t.p("topologyp"),
        int("fd"),
        hwloc_uint64_t("fileoffset"),
        void.p("mmap_address"),
        AutoSize("mmap_address")..size_t("length"),
        unsigned_long("flags")
    )
}