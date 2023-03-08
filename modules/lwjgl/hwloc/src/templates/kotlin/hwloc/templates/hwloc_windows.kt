/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc.templates

import org.lwjgl.generator.*
import hwloc.*

val hwloc_windows = "HWLocWindows".nativeClass(Module.HWLOC, prefix = "HWLOC", prefixMethod = "hwloc_", binding = HWLOC_BINDING_DELEGATE) {
    documentation =
        """
        Windows-specific helpers.
 
        These functions query Windows processor groups. These groups partition the operating system into virtual sets of up to 64 neighbor PUs. Threads and
        processes may only be bound inside a single group. Although Windows processor groups may be exposed in the hwloc hierarchy as hwloc Groups, they are
        also often merged into existing hwloc objects such as NUMA nodes or Packages. This API provides explicit information about Windows processor groups so
        that applications know whether binding to a large set of PUs may fail because it spans over multiple Windows processor groups.
        """

    int(
        "windows_get_nr_processor_groups",
        "",

        hwloc_topology_t("topology", ""),
        unsigned_long("flags", "")
    )

    int(
        "windows_get_processor_group_cpuset",
        "",

        hwloc_topology_t("topology", ""),
        unsigned("pg_index", ""),
        hwloc_cpuset_t("cpuset", ""),
        unsigned_long("flags", "")
    )
}