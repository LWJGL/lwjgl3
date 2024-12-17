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

    /** {@code int hwloc_windows_get_nr_processor_groups(hwloc_topology_t topology, unsigned long flags)} */
    public static int hwloc_windows_get_nr_processor_groups(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.windows_get_nr_processor_groups;
        if (CHECKS) {
            check(topology);
        }
        return invokePNI(topology, flags, __functionAddress);
    }

    // --- [ hwloc_windows_get_processor_group_cpuset ] ---

    /** {@code int hwloc_windows_get_processor_group_cpuset(hwloc_topology_t topology, unsigned pg_index, hwloc_cpuset_t cpuset, unsigned long flags)} */
    public static int hwloc_windows_get_processor_group_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned") int pg_index, @NativeType("hwloc_cpuset_t") long cpuset, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.windows_get_processor_group_cpuset;
        if (CHECKS) {
            check(topology);
            check(cpuset);
        }
        return invokePPNI(topology, pg_index, cpuset, flags, __functionAddress);
    }

}