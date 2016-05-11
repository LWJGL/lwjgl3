/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.hwloc;

import org.lwjgl.PointerBuffer;
import org.lwjgl.hwloc.HWLocTopologyCPUBindSupport;
import org.lwjgl.hwloc.HWLocTopologySupport;
import org.lwjgl.system.MemoryStack;

import static org.lwjgl.hwloc.HWLoc.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public final class HWLocDemo {

	public HWLocDemo() {
	}

	private void run() {
		System.out.println(Integer.toHexString(hwloc_get_api_version()).toUpperCase());

		long topology;
		long dup;

		try ( MemoryStack stack = stackPush() ) {
			PointerBuffer tp = stack.mallocPointer(1);

			hwloc_topology_init(tp);
			topology = tp.get(0);

			System.out.println(hwloc_topology_load(topology));

			hwloc_topology_dup(tp, topology);
			dup = tp.get(0);
		}

		System.out.println(topology);
		System.out.println(dup);

		HWLocTopologySupport support = hwloc_topology_get_support(topology);

		HWLocTopologyCPUBindSupport cpuBindSuport = support.cpubind();
		for ( int i = 0; i < HWLocTopologyCPUBindSupport.SIZEOF; i++ ) {
			System.out.println(memGetByte(cpuBindSuport.address() + i));
		}

		hwloc_topology_destroy(dup);
		hwloc_topology_destroy(topology);
	}

	public static void main(String[] args) {
		new HWLocDemo().run();
	}

}