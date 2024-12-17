/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc.templates

import org.lwjgl.generator.*
import hwloc.*

val hwloc_linux = "HWLocLinux".nativeClass(Module.HWLOC, prefix = "HWLOC", prefixMethod = "hwloc_", binding = HWLOC_BINDING_DELEGATE) {
    int(
        "linux_set_tid_cpubind",

        hwloc_topology_t("topology"),
        pid_t("tid"),
        hwloc_const_cpuset_t("set")
    )

    int(
        "linux_get_tid_cpubind",

        hwloc_topology_t("topology"),
        pid_t("tid"),
        hwloc_cpuset_t("set")
    )

    int(
        "linux_get_tid_last_cpu_location",

        hwloc_topology_t("topology"),
        pid_t("tid"),
        hwloc_bitmap_t("set")
    )

    int(
        "linux_read_path_as_cpumask",

        charASCII.const.p("path"),
        hwloc_bitmap_t("set")
    )
}