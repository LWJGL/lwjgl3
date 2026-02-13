/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc

import org.lwjgl.generator.*

val HWLOC_BINDING = simpleBinding(
    Module.HWLOC,
    libraryName = "HWLOC",
    libraryExpression = """Configuration.HWLOC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("hwloc"))""",
    bundledWithLWJGL = true
)
val HWLOC_BINDING_DELEGATE = HWLOC_BINDING.delegate("HWLoc.getLibrary()")

val hwloc_bitmap_t = "hwloc_bitmap_t".handle
val hwloc_const_bitmap_t = "hwloc_const_bitmap_t".handle
val hwloc_topology_t = "hwloc_topology_t".handle

// TODO: Create these at runtime in LWJGL 4
val hwloc_thread_t = typedef(unsigned_long_int, "hwloc_thread_t")
val hwloc_pid_t = typedef(uint32_t, "hwloc_pid_t")

val pid_t = typedef(uint32_t, "pid_t")
val pthread_t = typedef(unsigned_long_int, "pthread_t")

val HANDLE = "HANDLE".handle

val hwloc_cpuset_t = typedef(hwloc_bitmap_t, "hwloc_cpuset_t")
val hwloc_const_cpuset_t = typedef(hwloc_const_bitmap_t, "hwloc_const_cpuset_t")
val hwloc_nodeset_t = typedef(hwloc_bitmap_t, "hwloc_nodeset_t")
val hwloc_const_nodeset_t = typedef(hwloc_const_bitmap_t, "hwloc_const_nodeset_t")

val hwloc_membind_policy_t = "hwloc_membind_policy_t".enumType
val hwloc_obj_bridge_type_t = "hwloc_obj_bridge_type_t".enumType
val hwloc_obj_cache_type_t = "hwloc_obj_cache_type_t".enumType
val hwloc_obj_type_t = "hwloc_obj_type_t".enumType
val hwloc_type_filter_e = "enum hwloc_type_filter_e".enumType

val hwloc_uint64_t = typedef(uint64_t, "hwloc_uint64_t")

val hwloc_obj_osdev_types_t = typedef(unsigned_long, "hwloc_obj_osdev_types_t")

val hwloc_info_s = struct(Module.HWLOC, "hwloc_info_s", nativeName = "struct hwloc_info_s", mutable = false) {
    charASCII.p("name")
    charASCII.p("value")
}

val hwloc_infos_s = struct(Module.HWLOC, "hwloc_infos_s", nativeName = "struct hwloc_infos_s", mutable = false) {
    nullable..hwloc_info_s.p("array")
    AutoSize("array")..unsigned("count")
    unsigned("allocated").private()
}

val hwloc_pcidev_attr_s = struct(Module.HWLOC, "hwloc_pcidev_attr_s", mutable = false) {
    unsigned_int("domain")
    unsigned_char("bus")
    unsigned_char("dev")
    unsigned_char("func")
    unsigned_char("prog_if")
    unsigned_short("class_id")
    unsigned_short("vendor_id")
    unsigned_short("device_id")
    unsigned_short("subvendor_id")
    unsigned_short("subdevice_id")
    unsigned_char("revision")
    float("linkspeed")
}

val hwloc_obj_attr_u = union(Module.HWLOC, "hwloc_obj_attr_u", nativeName = "struct hwloc_obj_attr_u", mutable = false) {
    struct(Module.HWLOC, "hwloc_numanode_attr_s", mutable = false) {
        hwloc_uint64_t("local_memory")
    }("numanode")
    struct(Module.HWLOC, "hwloc_cache_attr_s", mutable = false) {
        hwloc_uint64_t("size")
        unsigned("depth")
        unsigned("linesize")
        int("associativity")
        hwloc_obj_cache_type_t("type")
    }("cache")
    struct(Module.HWLOC, "hwloc_group_attr_s", mutable = false) {
        unsigned("depth")
        unsigned("kind")
        unsigned("subkind")
        unsigned_charb("dont_merge")
    }("group")
    hwloc_pcidev_attr_s("pcidev")
    struct(Module.HWLOC, "hwloc_bridge_attr_s", mutable = false) {
        union {
            hwloc_pcidev_attr_s("pci")
        }("upstream")
        hwloc_obj_bridge_type_t("upstream_type")
        union {
            struct {
                unsigned_int("domain")
                unsigned_char("secondary_bus")
                unsigned_char("subordinate_bus")
            }("pci")
        }("downstream")
        hwloc_obj_bridge_type_t("downstream_type")
        unsigned("depth")
    }("bridge")
    struct(Module.HWLOC, "hwloc_osdev_attr_s", mutable = false) {
        hwloc_obj_osdev_types_t("types")
    }("osdev")
}

val hwloc_obj_ = struct(Module.HWLOC, "hwloc_obj", nativeName = "struct hwloc_obj")
val hwloc_obj = struct(Module.HWLOC, "hwloc_obj", nativeName = "struct hwloc_obj", mutable = false) {
    hwloc_obj_type_t("type")
    charASCII.p("subtype")
    unsigned("os_index")
    nullable..charASCII.p("name")
    hwloc_uint64_t("total_memory")
    hwloc_obj_attr_u.p("attr")
    int("depth")
    unsigned("logical_index")
    nullable..hwloc_obj_.p("next_cousin")
    nullable..hwloc_obj_.p("prev_cousin")
    nullable..hwloc_obj_.p("parent")
    unsigned("sibling_rank")
    nullable..hwloc_obj_.p("next_sibling")
    nullable..hwloc_obj_.p("prev_sibling")
    AutoSize("children")..unsigned("arity")
    nullable..hwloc_obj_.p.p("children")
    nullable..hwloc_obj_.p("first_child")
    nullable..hwloc_obj_.p("last_child")
    intb("symmetric_subtree")
    unsigned("memory_arity")
    nullable..hwloc_obj_.p("memory_first_child")
    unsigned("io_arity")
    nullable..hwloc_obj_.p("io_first_child")
    unsigned("misc_arity")
    nullable..hwloc_obj_.p("misc_first_child")
    nullable..hwloc_cpuset_t("cpuset")
    nullable..hwloc_cpuset_t("complete_cpuset")
    nullable..hwloc_nodeset_t("nodeset")
    nullable..hwloc_nodeset_t("complete_nodeset")
    hwloc_infos_s("infos")
    nullable..opaque_p("userdata").mutable()
    hwloc_uint64_t("gp_index")
}
val hwloc_obj_t = typedef(hwloc_obj.p, "hwloc_obj_t")

val hwloc_topology_discovery_support = struct(Module.HWLOC, "hwloc_topology_discovery_support", nativeName = "struct hwloc_topology_discovery_support", mutable = false) {
    unsigned_charb("pu")
    unsigned_charb("numa")
    unsigned_charb("numa_memory")
    unsigned_charb("disallowed_pu")
    unsigned_charb("disallowed_numa")
    unsigned_charb("cpukind_efficiency")
}

val hwloc_topology_cpubind_support = struct(Module.HWLOC, "hwloc_topology_cpubind_support", nativeName = "struct hwloc_topology_cpubind_support", mutable = false) {
    unsigned_charb("set_thisproc_cpubind")
    unsigned_charb("get_thisproc_cpubind")
    unsigned_charb("set_proc_cpubind")
    unsigned_charb("get_proc_cpubind")
    unsigned_charb("set_thisthread_cpubind")
    unsigned_charb("get_thisthread_cpubind")
    unsigned_charb("set_thread_cpubind")
    unsigned_charb("get_thread_cpubind")
    unsigned_charb("get_thisproc_last_cpu_location")
    unsigned_charb("get_proc_last_cpu_location")
    unsigned_charb("get_thisthread_last_cpu_location")
}

val hwloc_topology_membind_support = struct(Module.HWLOC, "hwloc_topology_membind_support", nativeName = "struct hwloc_topology_membind_support", mutable = false) {
    unsigned_charb("set_thisproc_membind")
    unsigned_charb("get_thisproc_membind")
    unsigned_charb("set_proc_membind")
    unsigned_charb("get_proc_membind")
    unsigned_charb("set_thisthread_membind")
    unsigned_charb("get_thisthread_membind")
    unsigned_charb("alloc_membind")
    unsigned_charb("set_area_membind")
    unsigned_charb("get_area_membind")
    unsigned_charb("get_area_memlocation")
    unsigned_charb("firsttouch_membind")
    unsigned_charb("bind_membind")
    unsigned_charb("interleave_membind")
    unsigned_charb("weighted_interleave_membind")
    unsigned_charb("nexttouch_membind")
    unsigned_charb("migrate_membind")
}

val hwloc_topology_misc_support = struct(Module.HWLOC, "hwloc_topology_misc_support", nativeName = "struct hwloc_topology_misc_support", mutable = false) {
    unsigned_charb("imported_support")
}

val hwloc_topology_support = struct(Module.HWLOC, "hwloc_topology_support", nativeName = "struct hwloc_topology_support", mutable = false) {
    hwloc_topology_discovery_support.p("discovery")
    hwloc_topology_cpubind_support.p("cpubind")
    hwloc_topology_membind_support.p("membind")
    hwloc_topology_misc_support.p("misc")
}

// memattrs.h

val hwloc_memattr_id_t = typedef(unsigned_int, "hwloc_memattr_id_t")

val hwloc_local_numanode_flag_e = "enum hwloc_local_numanode_flag_e".enumType
val hwloc_location_type_e = "enum hwloc_location_type_e".enumType
val hwloc_memattr_flag_e = "enum hwloc_memattr_flag_e".enumType
val hwloc_memattr_id_e = "enum hwloc_memattr_id_e".enumType

val hwloc_location = struct(Module.HWLOC, "hwloc_location", nativeName = "struct hwloc_location", mutable = false) {
    hwloc_location_type_e("type")
    union(Module.HWLOC, "hwloc_location_u", mutable = false) {
        hwloc_cpuset_t("cpuset")
        hwloc_obj_t("object")
    }("location")
}

// export.h

val hwloc_topology_export_synthetic_flags_e = "enum hwloc_topology_export_synthetic_flags_e".enumType
val hwloc_topology_export_xml_flags_e = "enum hwloc_topology_export_xml_flags_e".enumType

val topology_set_userdata_export_callback = Module.HWLOC.callback {
    void(
        "topology_set_userdata_export_callback",

        nullable..opaque_p("reserved"),
        hwloc_topology_t("topology"),
        hwloc_obj_t("obj")
    ) {
    }
}

val topology_set_userdata_import_callback = Module.HWLOC.callback {
    void(
        "topology_set_userdata_import_callback",

        hwloc_topology_t("topology"),
        hwloc_obj_t("obj"),
        charASCII.const.p("name"),
        void.const.p("buffer"),
        AutoSize("buffer")..size_t("length")
    ) {
    }
}

// distances.h

val hwloc_distances_add_handle_t = "hwloc_distances_add_handle_t".handle

val hwloc_distances_add_flag_e = "enum hwloc_distances_add_flag_e".enumType
val hwloc_distances_kind_e = "enum hwloc_distances_kind_e".enumType
val hwloc_distances_transform_e = "enum hwloc_distances_transform_e".enumType

val hwloc_distances_s = struct(Module.HWLOC, "hwloc_distances_s", nativeName = "struct hwloc_distances_s", mutable = false) {
    unsigned_int("nbobjs")
    Check("nbobjs")..hwloc_obj_t.p("objs")
    unsigned_long("kind")
    Check("nbobjs * nbobjs")..hwloc_uint64_t.p("values")
}

// diff.h

val hwloc_topology_diff_t = "hwloc_topology_diff_t".handle

val hwloc_topology_diff_apply_flags_e = "enum hwloc_topology_diff_apply_flags_e".enumType
val hwloc_topology_diff_obj_attr_type_t = "hwloc_topology_diff_obj_attr_type_t".enumType
val hwloc_topology_diff_type_t = "hwloc_topology_diff_type_t".enumType

val hwloc_topology_diff_obj_attr_u = union(Module.HWLOC, "hwloc_topology_diff_obj_attr_u", nativeName = "struct hwloc_topology_diff_obj_attr_u", mutable = false) {
    struct(Module.HWLOC, "hwloc_topology_diff_obj_attr_generic_s", mutable = false) {
        hwloc_topology_diff_obj_attr_type_t("type")
    }("generic")
    struct(Module.HWLOC, "hwloc_topology_diff_obj_attr_uint64_s", mutable = false) {
        hwloc_topology_diff_obj_attr_type_t("type")
        hwloc_uint64_t("index")
        hwloc_uint64_t("oldvalue")
        hwloc_uint64_t("newvalue")
    }("uint64")
    struct(Module.HWLOC, "hwloc_topology_diff_obj_attr_string_s", mutable = false) {
        hwloc_topology_diff_obj_attr_type_t("type")
        charASCII.p("name")
        charASCII.p("oldvalue")
        charASCII.p("newvalue")
    }("string")
}

private val hwloc_topology_diff_u_ = union(Module.HWLOC, "hwloc_topology_diff_u", nativeName = "struct hwloc_topology_diff_u", mutable = false)
val hwloc_topology_diff_u = union(Module.HWLOC, "hwloc_topology_diff_u", nativeName = "struct hwloc_topology_diff_u", mutable = false) {
    struct(Module.HWLOC, "hwloc_topology_diff_generic_s", mutable = false) {
        hwloc_topology_diff_type_t("type")
        union(Module.HWLOC, "hwloc_topology_diff_u").p("next")
    }("generic")
    struct(Module.HWLOC, "hwloc_topology_diff_obj_attr_s", mutable = false) {
        hwloc_topology_diff_type_t("type")
        nullable..hwloc_topology_diff_u_.p("next")
        int("obj_depth")
        unsigned_int("obj_index")
        hwloc_topology_diff_obj_attr_u("diff")
    }("obj_attr")
    struct(Module.HWLOC, "hwloc_topology_diff_too_complex_s", mutable = false) {
        hwloc_topology_diff_type_t("type")
        nullable..hwloc_topology_diff_u_.p("next")
        int("obj_depth")
        unsigned_int("obj_index")
    }("too_complex")
}
