/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc.templates

import org.lwjgl.generator.*
import hwloc.*

val hwloc_windows = "HWLocWindows".nativeClass(Module.HWLOC, prefix = "HWLOC", prefixMethod = "hwloc_", binding = HWLOC_BINDING_DELEGATE) {
    int(
        "windows_get_nr_processor_groups",

        hwloc_topology_t("topology"),
        unsigned_long("flags")
    )

    int(
        "windows_get_processor_group_cpuset",

        hwloc_topology_t("topology"),
        unsigned("pg_index"),
        hwloc_cpuset_t("cpuset"),
        unsigned_long("flags")
    )
}