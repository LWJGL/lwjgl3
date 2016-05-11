/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.hwloc

import org.lwjgl.generator.*

val HWLOC_PACKAGE = "org.lwjgl.hwloc"

fun GeneratorTargetNative.includeHWLocAPI() {
	nativeDirective(
		"""#ifdef LWJGL_WINDOWS
	__pragma(warning(disable : 4710))
#endif""", beforeIncludes = true)

	nativeDirective(
		"""DISABLE_WARNINGS()
#include "hwloc.h"
ENABLE_WARNINGS()""")
}

val HWLOC_BINDING = simpleBinding("hwloc", """Configuration.HWLOC_LIBRARY_NAME.get(Pointer.BITS64 ? "hwloc" : "hwloc32")""")
val HWLOC_BINDING_DELEGATE = HWLOC_BINDING.delegate("HWLoc.getLibrary()")

val unsigned_long = typedef(unsigned_int, "unsigned long")

val hwloc_uint64_t = typedef(uint64_t, "hwloc_uint64_t")

val hwloc_obj_type_t = "hwloc_obj_type_t".enumType
val hwloc_obj_type_t_p = hwloc_obj_type_t.p

val hwloc_obj_cache_type_t = "hwloc_obj_cache_type_t".enumType
val hwloc_obj_bridge_type_t = "hwloc_obj_bridge_type_t".enumType
val hwloc_obj_osdev_type_t = "hwloc_obj_osdev_type_t".enumType

val hwloc_topology_t = "hwloc_topology_t".opaque_p
val hwloc_topology_t_p = hwloc_topology_t.p

val hwloc_pid_t = "hwloc_pid_t".p // TODO: pointer on Windows, int on Unix

val hwloc_topology_discovery_support_p = struct_p(
	HWLOC_PACKAGE,
	"HWLocTopologyDiscoverySupport",
	nativeName = "struct hwloc_topology_discovery_support",
	mutable = false
) {
	documentation = "Flags describing actual discovery support for this topology."

	unsigned_char.member("pu", "detecting the number of PU objects is supported")
}

val hwloc_topology_cpubind_support_p = struct_p(
	HWLOC_PACKAGE,
	"HWLocTopologyCPUBindSupport",
	nativeName = "struct hwloc_topology_cpubind_support",
	mutable = false
) {
	documentation = "Flags describing actual PU binding support for this topology."

	unsigned_char.member("set_thisproc_cpubind", "binding the whole current process is supported")
	unsigned_char.member("get_thisproc_cpubind", "getting the binding of the whole current process is supported")
	unsigned_char.member("set_proc_cpubind", "binding a whole given process is supported")
	unsigned_char.member("get_proc_cpubind", "getting the binding of a whole given process is supported")
	unsigned_char.member("set_thisthread_cpubind", "binding the current thread only is supported")
	unsigned_char.member("get_thisthread_cpubind", "getting the binding of the current thread only is supported")
	unsigned_char.member("set_thread_cpubind", "binding a given thread only is supported")
	unsigned_char.member("get_thread_cpubind", "getting the binding of a given thread only is supported")
	unsigned_char.member("get_thisproc_last_cpu_location", "getting the last processors where the whole current process ran is supported")
	unsigned_char.member("get_proc_last_cpu_location", "getting the last processors where a whole process ran is supported")
	unsigned_char.member("get_thisthread_last_cpu_location", "getting the last processors where the current thread ran is supported")
}

val hwloc_topology_membind_support_p = struct_p(
	HWLOC_PACKAGE,
	"HWLocTopologyMemBindSupport",
	nativeName = "struct hwloc_topology_membind_support",
	mutable = false
) {
	documentation = "Flags describing actual memory binding support for this topology."

	unsigned_char.member("set_thisproc_membind", "binding the whole current process is supported")
	unsigned_char.member("get_thisproc_membind", "getting the binding of the whole current process is supported")
	unsigned_char.member("set_proc_membind", "binding a whole given process is supported")
	unsigned_char.member("get_proc_membind", "getting the binding of a whole given process is supported")
	unsigned_char.member("set_thisthread_membind", "binding the current thread only is supported")
	unsigned_char.member("get_thisthread_membind", "getting the binding of the current thread only is supported")
	unsigned_char.member("set_area_membind", "binding a given memory area is supported")
	unsigned_char.member("get_area_membind", "getting the binding of a given memory area is supported")
	unsigned_char.member("alloc_membind", "allocating a bound memory area is supported")
	unsigned_char.member("firsttouch_membind", "first-touch policy is supported")
	unsigned_char.member("bind_membind", "bind policy is supported")
	unsigned_char.member("interleave_membind", "interleave policy is supported")
	unsigned_char.member("nexttouch_membind", "next-touch migration policy is supported")

	unsigned_char.member("migrate_membind", "migration flags is supported")
}

val hwloc_topology_support_p = struct_p(
	HWLOC_PACKAGE,
	"HWLocTopologySupport",
	nativeName = "struct hwloc_topology_support",
	mutable = false
) {
	documentation =
		"""
		Set of flags describing actual support for this topology.

		This is retrieved with HWLoc#hwloc_topology_get_support() and will be valid until the topology object is destroyed. Note: the values are correct only
		after discovery.
		"""

	hwloc_topology_discovery_support_p.member("discovery", "")
	hwloc_topology_cpubind_support_p.member("cpubind", "")
	hwloc_topology_membind_support_p.member("membind", "")
}

val hwloc_obj_t = "hwloc_obj_t".opaque_p

/*
/** \brief Object type-specific Attributes */
union hwloc_obj_attr_u {
  /** \brief OS Device specific Object Attributes */
  struct hwloc_osdev_attr_s {
    hwloc_obj_osdev_type_t type;
  } osdev;
};
 */
val hwloc_pcidev_attr_s = struct(HWLOC_PACKAGE, "PCIDeviceAttributes", nativeName = "struct hwloc_pcidev_attr_s", mutable = false) {
	documentation = "PCI Device specific Object Attributes"

	unsigned_short.member("domain", "")
	unsigned_char.member("bus", "")
	unsigned_char.member("dev", "")
	unsigned_char.member("func", "")
	unsigned_short.member("class_id", "")
	unsigned_short.member("vendor_id", "")
	unsigned_short.member("device_id", "")
	unsigned_short.member("subvendor_id", "")
	unsigned_short.member("subdevice_id", "")
	unsigned_char.member("revision", "")
	float.member("linkspeed", "in GB/s")
}.nativeType

val hwloc_obj_attr_u = union_p(HWLOC_PACKAGE, "HWLocObjAttrU", nativeName = "union hwloc_obj_attr_u", mutable = false) {
	struct("cache", "Cache-specific Object Attributes") {
		hwloc_uint64_t.member("size", "size of cache in bytes")
		unsigned.member("depth", "depth of cache (e.g., L1, L2, ...etc.)")
		unsigned.member("linesize", "cache-line size in bytes. 0 if unknown")
		int.member("associativity", "ways of associativity, -1 if fully associative, 0 if unknown")
		hwloc_obj_cache_type_t.member("type", "cache type")
	}
	struct("group", "Group-specific Object Attributes") {
		unsigned.member("depth", "depth of group object")
	}
	hwloc_pcidev_attr_s.member("pcidev", "PCI Device specific Object Attributes")
	struct("bridge", "Bridge specific Object Attributes") {
		union("upstream", "") {
			hwloc_pcidev_attr_s.member("pci", "")
		}
		hwloc_obj_bridge_type_t.member("upstream_type", "")
		union("downstream", "") {
			struct("pci", "") {
				unsigned_short.member("domain", "")
				unsigned_char.member("secondary_bus", "")
				unsigned_char.member("subordinate_bus", "")
			}
		}
		hwloc_obj_bridge_type_t.member("downstream_type", "")
		unsigned.member("depth", "")
	}
	struct("osdev", "OS Device specific Object Attributes") {
		hwloc_obj_osdev_type_t.member("type", "")
	}
}

val hwloc_thread_t = "hwloc_thread_t".opaque_p // TODO: pointer on Windows, long int on Unix

val hwloc_bitmap_t = "hwloc_bitmap_t".opaque_p
val hwloc_const_bitmap_t = "hwloc_const_bitmap_t".opaque_p

val hwloc_cpuset_t = typedef(hwloc_bitmap_t, "hwloc_cpuset_t")
val hwloc_const_cpuset_t = typedef(hwloc_const_bitmap_t, "hwloc_const_cpuset_t")

val hwloc_nodeset_t = typedef(hwloc_bitmap_t, "hwloc_nodeset_t")
val hwloc_const_nodeset_t = typedef(hwloc_const_bitmap_t, "hwloc_const_nodeset_t")

// membind

val hwloc_membind_policy_t = "hwloc_membind_policy_t".enumType
val hwloc_membind_policy_t_p = hwloc_membind_policy_t.p