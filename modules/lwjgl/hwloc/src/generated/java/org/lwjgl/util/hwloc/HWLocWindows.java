/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * Windows-specific helpers.
 * 
 * <p>These functions query Windows processor groups. These groups partition the operating system into virtual sets of up to 64 neighbor PUs. Threads and
 * processes may only be bound inside a single group. Although Windows processor groups may be exposed in the hwloc hierarchy as hwloc Groups, they are
 * also often merged into existing hwloc objects such as NUMA nodes or Packages. This API provides explicit information about Windows processor groups so
 * that applications know whether binding to a large set of PUs may fail because it spans over multiple Windows processor groups.</p>
 */
public class HWLocWindows {

    /** Contains the function pointers loaded from {@code HWLoc.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            windows_get_nr_processor_groups    = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_windows_get_nr_processor_groups"),
            windows_get_processor_group_cpuset = apiGetFunctionAddress(HWLoc.getLibrary(), "hwloc_windows_get_processor_group_cpuset");

    }

    protected HWLocWindows() {
        throw new UnsupportedOperationException();
    }

    // --- [ hwloc_windows_get_nr_processor_groups ] ---

    public static int hwloc_windows_get_nr_processor_groups(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.windows_get_nr_processor_groups;
        if (CHECKS) {
            check(topology);
        }
        return invokePNI(topology, flags, __functionAddress);
    }

    // --- [ hwloc_windows_get_processor_group_cpuset ] ---

    public static int hwloc_windows_get_processor_group_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned") int pg_index, @NativeType("hwloc_cpuset_t") long cpuset, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.windows_get_processor_group_cpuset;
        if (CHECKS) {
            check(topology);
            check(cpuset);
        }
        return invokePPNI(topology, pg_index, cpuset, flags, __functionAddress);
    }

}