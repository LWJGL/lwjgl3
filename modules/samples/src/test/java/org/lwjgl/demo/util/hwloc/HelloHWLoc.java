/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.hwloc;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.hwloc.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.hwloc.HWLoc.*;

public class HelloHWLoc {

    public static void main(String[] args) {
        // For now just verify that the hwloc library loads correctly
        System.out.println("Loaded hwloc 0x" + Integer.toHexString(hwloc_get_api_version()).toUpperCase());
        System.out.println("--------------------");

        long topology;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            if (hwloc_topology_init(pp) < 0) {
                throw new IllegalStateException();
            }
            topology = pp.get(0);
        }

        if (hwloc_topology_load(topology) < 0) {
            throw new IllegalStateException();
        }

        hwloc_obj root = Objects.requireNonNull(hwloc_get_obj_by_depth(topology, 0, 0));

        hwloc_infos_s infos = Objects.requireNonNull(root.infos());
        if (infos.count() != 0) {
            for (hwloc_info_s info : Objects.requireNonNull(infos.array())) {
                System.out.println(info.nameString() + ": " + info.valueString());
            }
            System.out.println("--------------------");
        }

        hwloc_topology_support support = Objects.requireNonNull(hwloc_topology_get_support(topology));

        System.out.println("support.discovery.pu: " + support.discovery().pu());
        System.out.println("support.discovery.numa: " + support.discovery().numa());
        System.out.println("support.discovery.numa_memory: " + support.discovery().numa_memory());
        System.out.println("support.discovery.disallowed_pu: " + support.discovery().disallowed_pu());
        System.out.println("support.discovery.disallowed_numa: " + support.discovery().disallowed_numa());
        System.out.println("support.discovery.cpukind_efficiency: " + support.discovery().cpukind_efficiency());
        System.out.println();
        System.out.println("support.cpubind.set_thisproc_cpubind." + support.cpubind().set_thisproc_cpubind());
        System.out.println("support.cpubind.get_thisproc_cpubind." + support.cpubind().get_thisproc_cpubind());
        System.out.println("support.cpubind.set_proc_cpubind." + support.cpubind().set_proc_cpubind());
        System.out.println("support.cpubind.get_proc_cpubind." + support.cpubind().get_proc_cpubind());
        System.out.println("support.cpubind.set_thisthread_cpubind." + support.cpubind().set_thisthread_cpubind());
        System.out.println("support.cpubind.get_thisthread_cpubind." + support.cpubind().get_thisthread_cpubind());
        System.out.println("support.cpubind.set_thread_cpubind." + support.cpubind().set_thread_cpubind());
        System.out.println("support.cpubind.get_thread_cpubind." + support.cpubind().get_thread_cpubind());
        System.out.println("support.cpubind.get_thisproc_last_cpu_location." + support.cpubind().get_thisproc_last_cpu_location());
        System.out.println("support.cpubind.get_proc_last_cpu_location." + support.cpubind().get_proc_last_cpu_location());
        System.out.println("support.cpubind.get_thisthread_last_cpu_location." + support.cpubind().get_thisthread_last_cpu_location());
        System.out.println();
        System.out.println("support.membind.set_thisproc_membind." + support.membind().set_thisproc_membind());
        System.out.println("support.membind.get_thisproc_membind." + support.membind().get_thisproc_membind());
        System.out.println("support.membind.set_proc_membind." + support.membind().set_proc_membind());
        System.out.println("support.membind.get_proc_membind." + support.membind().get_proc_membind());
        System.out.println("support.membind.set_thisthread_membind." + support.membind().set_thisthread_membind());
        System.out.println("support.membind.get_thisthread_membind." + support.membind().get_thisthread_membind());
        System.out.println("support.membind.set_area_membind." + support.membind().set_area_membind());
        System.out.println("support.membind.get_area_membind." + support.membind().get_area_membind());
        System.out.println("support.membind.alloc_membind." + support.membind().alloc_membind());
        System.out.println("support.membind.firsttouch_membind." + support.membind().firsttouch_membind());
        System.out.println("support.membind.bind_membind." + support.membind().bind_membind());
        System.out.println("support.membind.interleave_membind." + support.membind().interleave_membind());
        System.out.println("support.membind.nexttouch_membind." + support.membind().nexttouch_membind());
        System.out.println("support.membind.migrate_membind." + support.membind().migrate_membind());
        System.out.println("support.membind.get_area_memlocation." + support.membind().get_area_memlocation());
        System.out.println();
        System.out.println("support.misc.imported_support." + support.misc().imported_support());
        System.out.println("--------------------");

        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            IntBuffer     pi = stack.mallocInt(1);

            int c = hwloc_topology_export_xmlbuffer(topology, pp, pi, 0);
            if (c == -1) {
                throw new IllegalStateException();
            }

            System.out.println(memASCII(pp.get(0), pi.get(0)));
        }

        hwloc_topology_destroy(topology);
    }

}
