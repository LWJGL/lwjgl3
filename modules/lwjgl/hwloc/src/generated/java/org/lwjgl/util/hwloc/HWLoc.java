/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.hwloc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import java.util.Objects;
import java.util.regex.*;

/**
 * Native bindings to <a href="https://www.open-mpi.org/projects/hwloc/">hwloc</a>, a portable abstraction (across OS, versions, architectures, ...) of the
 * hierarchical topology of modern architectures, including NUMA memory nodes, sockets, shared caches, cores and simultaneous multithreading.
 * 
 * <p>It also gathers various system attributes such as cache and memory information as well as the locality of I/O devices such as network interfaces,
 * InfiniBand HCAs or GPUs.</p>
 * 
 * <p>hwloc primarily aims at helping applications with gathering information about increasingly complex parallel computing platforms so as to exploit them
 * accordingly and efficiently. For instance, two tasks that tightly cooperate should probably be placed onto cores sharing a cache. However, two
 * independent memory-intensive tasks should better be spread out onto different sockets so as to maximize their memory throughput.</p>
 * 
 * <p>hwloc may also help many applications just by providing a portable CPU and memory binding API and a reliable way to find out how many cores and/or
 * hardware threads are available.</p>
 */
public class HWLoc {

    private static final SharedLibrary HWLOC = Library.loadNative(HWLoc.class, "org.lwjgl.hwloc", Configuration.HWLOC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("hwloc")), true);

    /** Contains the function pointers loaded from the HWLOC {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            bitmap_alloc                          = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_alloc"),
            bitmap_alloc_full                     = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_alloc_full"),
            bitmap_free                           = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_free"),
            bitmap_dup                            = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_dup"),
            bitmap_copy                           = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_copy"),
            bitmap_snprintf                       = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_snprintf"),
            bitmap_asprintf                       = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_asprintf"),
            bitmap_sscanf                         = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_sscanf"),
            bitmap_list_snprintf                  = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_list_snprintf"),
            bitmap_list_asprintf                  = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_list_asprintf"),
            bitmap_list_sscanf                    = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_list_sscanf"),
            bitmap_taskset_snprintf               = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_taskset_snprintf"),
            bitmap_taskset_asprintf               = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_taskset_asprintf"),
            bitmap_taskset_sscanf                 = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_taskset_sscanf"),
            bitmap_zero                           = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_zero"),
            bitmap_fill                           = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_fill"),
            bitmap_only                           = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_only"),
            bitmap_allbut                         = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_allbut"),
            bitmap_from_ulong                     = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_from_ulong"),
            bitmap_from_ith_ulong                 = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_from_ith_ulong"),
            bitmap_from_ulongs                    = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_from_ulongs"),
            bitmap_set                            = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_set"),
            bitmap_set_range                      = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_set_range"),
            bitmap_set_ith_ulong                  = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_set_ith_ulong"),
            bitmap_clr                            = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_clr"),
            bitmap_clr_range                      = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_clr_range"),
            bitmap_singlify                       = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_singlify"),
            bitmap_to_ulong                       = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_to_ulong"),
            bitmap_to_ith_ulong                   = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_to_ith_ulong"),
            bitmap_to_ulongs                      = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_to_ulongs"),
            bitmap_nr_ulongs                      = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_nr_ulongs"),
            bitmap_isset                          = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_isset"),
            bitmap_iszero                         = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_iszero"),
            bitmap_isfull                         = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_isfull"),
            bitmap_first                          = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_first"),
            bitmap_next                           = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_next"),
            bitmap_last                           = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_last"),
            bitmap_weight                         = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_weight"),
            bitmap_first_unset                    = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_first_unset"),
            bitmap_next_unset                     = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_next_unset"),
            bitmap_last_unset                     = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_last_unset"),
            bitmap_or                             = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_or"),
            bitmap_and                            = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_and"),
            bitmap_andnot                         = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_andnot"),
            bitmap_xor                            = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_xor"),
            bitmap_not                            = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_not"),
            bitmap_intersects                     = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_intersects"),
            bitmap_isincluded                     = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_isincluded"),
            bitmap_isequal                        = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_isequal"),
            bitmap_compare_first                  = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_compare_first"),
            bitmap_compare                        = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_compare"),
            get_api_version                       = apiGetFunctionAddress(HWLOC, "hwloc_get_api_version"),
            compare_types                         = apiGetFunctionAddress(HWLOC, "hwloc_compare_types"),
            topology_init                         = apiGetFunctionAddress(HWLOC, "hwloc_topology_init"),
            topology_load                         = apiGetFunctionAddress(HWLOC, "hwloc_topology_load"),
            topology_destroy                      = apiGetFunctionAddress(HWLOC, "hwloc_topology_destroy"),
            topology_dup                          = apiGetFunctionAddress(HWLOC, "hwloc_topology_dup"),
            topology_abi_check                    = apiGetFunctionAddress(HWLOC, "hwloc_topology_abi_check"),
            topology_check                        = apiGetFunctionAddress(HWLOC, "hwloc_topology_check"),
            topology_get_depth                    = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_depth"),
            get_type_depth                        = apiGetFunctionAddress(HWLOC, "hwloc_get_type_depth"),
            get_type_depth_with_attr              = apiGetFunctionAddress(HWLOC, "hwloc_get_type_depth_with_attr"),
            get_memory_parents_depth              = apiGetFunctionAddress(HWLOC, "hwloc_get_memory_parents_depth"),
            get_depth_type                        = apiGetFunctionAddress(HWLOC, "hwloc_get_depth_type"),
            get_nbobjs_by_depth                   = apiGetFunctionAddress(HWLOC, "hwloc_get_nbobjs_by_depth"),
            get_obj_by_depth                      = apiGetFunctionAddress(HWLOC, "hwloc_get_obj_by_depth"),
            obj_type_string                       = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_string"),
            obj_type_snprintf                     = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_snprintf"),
            obj_attr_snprintf                     = apiGetFunctionAddress(HWLOC, "hwloc_obj_attr_snprintf"),
            type_sscanf                           = apiGetFunctionAddress(HWLOC, "hwloc_type_sscanf"),
            modify_infos                          = apiGetFunctionAddress(HWLOC, "hwloc_modify_infos"),
            topology_get_infos                    = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_infos"),
            obj_set_subtype                       = apiGetFunctionAddress(HWLOC, "hwloc_obj_set_subtype"),
            set_cpubind                           = apiGetFunctionAddress(HWLOC, "hwloc_set_cpubind"),
            get_cpubind                           = apiGetFunctionAddress(HWLOC, "hwloc_get_cpubind"),
            set_proc_cpubind_pid                  = apiGetFunctionAddress(HWLOC, "hwloc_set_proc_cpubind"),
            set_proc_cpubind_handle               = apiGetFunctionAddress(HWLOC, "hwloc_set_proc_cpubind"),
            get_proc_cpubind_pid                  = apiGetFunctionAddress(HWLOC, "hwloc_get_proc_cpubind"),
            get_proc_cpubind_handle               = apiGetFunctionAddress(HWLOC, "hwloc_get_proc_cpubind"),
            set_thread_cpubind_pthread            = apiGetFunctionAddress(HWLOC, "hwloc_set_thread_cpubind"),
            set_thread_cpubind_handle             = apiGetFunctionAddress(HWLOC, "hwloc_set_thread_cpubind"),
            get_thread_cpubind_pthread            = apiGetFunctionAddress(HWLOC, "hwloc_get_thread_cpubind"),
            get_thread_cpubind_handle             = apiGetFunctionAddress(HWLOC, "hwloc_get_thread_cpubind"),
            get_last_cpu_location                 = apiGetFunctionAddress(HWLOC, "hwloc_get_last_cpu_location"),
            get_proc_last_cpu_location_pid        = apiGetFunctionAddress(HWLOC, "hwloc_get_proc_last_cpu_location"),
            get_proc_last_cpu_location_handle     = apiGetFunctionAddress(HWLOC, "hwloc_get_proc_last_cpu_location"),
            set_membind                           = apiGetFunctionAddress(HWLOC, "hwloc_set_membind"),
            get_membind                           = apiGetFunctionAddress(HWLOC, "hwloc_get_membind"),
            set_proc_membind_pid                  = apiGetFunctionAddress(HWLOC, "hwloc_set_proc_membind"),
            set_proc_membind_handle               = apiGetFunctionAddress(HWLOC, "hwloc_set_proc_membind"),
            get_proc_membind_pid                  = apiGetFunctionAddress(HWLOC, "hwloc_get_proc_membind"),
            get_proc_membind_handle               = apiGetFunctionAddress(HWLOC, "hwloc_get_proc_membind"),
            set_area_membind                      = apiGetFunctionAddress(HWLOC, "hwloc_set_area_membind"),
            get_area_membind                      = apiGetFunctionAddress(HWLOC, "hwloc_get_area_membind"),
            get_area_memlocation                  = apiGetFunctionAddress(HWLOC, "hwloc_get_area_memlocation"),
            alloc                                 = apiGetFunctionAddress(HWLOC, "hwloc_alloc"),
            alloc_membind                         = apiGetFunctionAddress(HWLOC, "hwloc_alloc_membind"),
            free                                  = apiGetFunctionAddress(HWLOC, "hwloc_free"),
            topology_set_pid_pid                  = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_pid"),
            topology_set_pid_handle               = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_pid"),
            topology_set_synthetic                = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_synthetic"),
            topology_set_xml                      = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_xml"),
            topology_set_xmlbuffer                = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_xmlbuffer"),
            topology_set_components               = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_components"),
            topology_set_flags                    = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_flags"),
            topology_get_flags                    = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_flags"),
            topology_is_thissystem                = apiGetFunctionAddress(HWLOC, "hwloc_topology_is_thissystem"),
            topology_get_support                  = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_support"),
            topology_set_type_filter              = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_type_filter"),
            topology_get_type_filter              = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_type_filter"),
            topology_set_all_types_filter         = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_all_types_filter"),
            topology_set_cache_types_filter       = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_cache_types_filter"),
            topology_set_icache_types_filter      = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_icache_types_filter"),
            topology_set_io_types_filter          = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_io_types_filter"),
            topology_set_userdata                 = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_userdata"),
            topology_get_userdata                 = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_userdata"),
            topology_restrict                     = apiGetFunctionAddress(HWLOC, "hwloc_topology_restrict"),
            topology_allow                        = apiGetFunctionAddress(HWLOC, "hwloc_topology_allow"),
            topology_insert_misc_object           = apiGetFunctionAddress(HWLOC, "hwloc_topology_insert_misc_object"),
            topology_alloc_group_object           = apiGetFunctionAddress(HWLOC, "hwloc_topology_alloc_group_object"),
            topology_free_group_object            = apiGetFunctionAddress(HWLOC, "hwloc_topology_free_group_object"),
            topology_insert_group_object          = apiGetFunctionAddress(HWLOC, "hwloc_topology_insert_group_object"),
            obj_add_other_obj_sets                = apiGetFunctionAddress(HWLOC, "hwloc_obj_add_other_obj_sets"),
            topology_refresh                      = apiGetFunctionAddress(HWLOC, "hwloc_topology_refresh"),
            obj_type_is_normal                    = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_is_normal"),
            obj_type_is_io                        = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_is_io"),
            obj_type_is_memory                    = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_is_memory"),
            obj_type_is_cache                     = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_is_cache"),
            obj_type_is_dcache                    = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_is_dcache"),
            obj_type_is_icache                    = apiGetFunctionAddress(HWLOC, "hwloc_obj_type_is_icache"),
            get_largest_objs_inside_cpuset        = apiGetFunctionAddress(HWLOC, "hwloc_get_largest_objs_inside_cpuset"),
            bitmap_singlify_per_core              = apiGetFunctionAddress(HWLOC, "hwloc_bitmap_singlify_per_core"),
            get_closest_objs                      = apiGetFunctionAddress(HWLOC, "hwloc_get_closest_objs"),
            get_obj_with_same_locality            = apiGetFunctionAddress(HWLOC, "hwloc_get_obj_with_same_locality"),
            topology_get_complete_cpuset          = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_complete_cpuset"),
            topology_get_topology_cpuset          = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_topology_cpuset"),
            topology_get_allowed_cpuset           = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_allowed_cpuset"),
            topology_get_complete_nodeset         = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_complete_nodeset"),
            topology_get_topology_nodeset         = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_topology_nodeset"),
            topology_get_allowed_nodeset          = apiGetFunctionAddress(HWLOC, "hwloc_topology_get_allowed_nodeset"),
            memattr_get_by_name                   = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_by_name"),
            get_local_numanode_objs               = apiGetFunctionAddress(HWLOC, "hwloc_get_local_numanode_objs"),
            memattr_get_value                     = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_value"),
            memattr_get_best_target               = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_best_target"),
            memattr_get_best_initiator            = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_best_initiator"),
            memattr_get_targets                   = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_targets"),
            memattr_get_initiators                = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_initiators"),
            memattr_get_name                      = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_name"),
            memattr_get_flags                     = apiGetFunctionAddress(HWLOC, "hwloc_memattr_get_flags"),
            memattr_register                      = apiGetFunctionAddress(HWLOC, "hwloc_memattr_register"),
            memattr_set_value                     = apiGetFunctionAddress(HWLOC, "hwloc_memattr_set_value"),
            cpukinds_get_nr                       = apiGetFunctionAddress(HWLOC, "hwloc_cpukinds_get_nr"),
            cpukinds_get_by_cpuset                = apiGetFunctionAddress(HWLOC, "hwloc_cpukinds_get_by_cpuset"),
            cpukinds_get_info                     = apiGetFunctionAddress(HWLOC, "hwloc_cpukinds_get_info"),
            cpukinds_register                     = apiGetFunctionAddress(HWLOC, "hwloc_cpukinds_register"),
            topology_export_xml                   = apiGetFunctionAddress(HWLOC, "hwloc_topology_export_xml"),
            topology_export_xmlbuffer             = apiGetFunctionAddress(HWLOC, "hwloc_topology_export_xmlbuffer"),
            free_xmlbuffer                        = apiGetFunctionAddress(HWLOC, "hwloc_free_xmlbuffer"),
            topology_set_userdata_export_callback = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_userdata_export_callback"),
            export_obj_userdata                   = apiGetFunctionAddress(HWLOC, "hwloc_export_obj_userdata"),
            export_obj_userdata_base64            = apiGetFunctionAddress(HWLOC, "hwloc_export_obj_userdata_base64"),
            topology_set_userdata_import_callback = apiGetFunctionAddress(HWLOC, "hwloc_topology_set_userdata_import_callback"),
            topology_export_synthetic             = apiGetFunctionAddress(HWLOC, "hwloc_topology_export_synthetic"),
            distances_get                         = apiGetFunctionAddress(HWLOC, "hwloc_distances_get"),
            distances_get_by_depth                = apiGetFunctionAddress(HWLOC, "hwloc_distances_get_by_depth"),
            distances_get_by_type                 = apiGetFunctionAddress(HWLOC, "hwloc_distances_get_by_type"),
            distances_get_by_name                 = apiGetFunctionAddress(HWLOC, "hwloc_distances_get_by_name"),
            distances_get_name                    = apiGetFunctionAddress(HWLOC, "hwloc_distances_get_name"),
            distances_release                     = apiGetFunctionAddress(HWLOC, "hwloc_distances_release"),
            distances_transform                   = apiGetFunctionAddress(HWLOC, "hwloc_distances_transform"),
            distances_add_create                  = apiGetFunctionAddress(HWLOC, "hwloc_distances_add_create"),
            distances_add_values                  = apiGetFunctionAddress(HWLOC, "hwloc_distances_add_values"),
            distances_add_commit                  = apiGetFunctionAddress(HWLOC, "hwloc_distances_add_commit"),
            distances_remove                      = apiGetFunctionAddress(HWLOC, "hwloc_distances_remove"),
            distances_remove_by_depth             = apiGetFunctionAddress(HWLOC, "hwloc_distances_remove_by_depth"),
            distances_release_remove              = apiGetFunctionAddress(HWLOC, "hwloc_distances_release_remove"),
            topology_diff_build                   = apiGetFunctionAddress(HWLOC, "hwloc_topology_diff_build"),
            topology_diff_apply                   = apiGetFunctionAddress(HWLOC, "hwloc_topology_diff_apply"),
            topology_diff_destroy                 = apiGetFunctionAddress(HWLOC, "hwloc_topology_diff_destroy"),
            topology_diff_load_xml                = apiGetFunctionAddress(HWLOC, "hwloc_topology_diff_load_xml"),
            topology_diff_export_xml              = apiGetFunctionAddress(HWLOC, "hwloc_topology_diff_export_xml"),
            topology_diff_load_xmlbuffer          = apiGetFunctionAddress(HWLOC, "hwloc_topology_diff_load_xmlbuffer"),
            topology_diff_export_xmlbuffer        = apiGetFunctionAddress(HWLOC, "hwloc_topology_diff_export_xmlbuffer");

    }

    /** Returns the HWLOC {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return HWLOC;
    }

    public static final int HWLOC_API_VERSION = 0x30000;

    public static final int HWLOC_COMPONENT_ABI = 8;

    public static final int HWLOC_TYPE_UNORDERED = Integer.MAX_VALUE;

    public static final int HWLOC_UNKNOWN_INDEX = -1;

    /**
     * {@code hwloc_obj_type_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_OBJ_TYPE_MIN OBJ_TYPE_MIN}</li>
     * <li>{@link #HWLOC_OBJ_MACHINE OBJ_MACHINE}</li>
     * <li>{@link #HWLOC_OBJ_PACKAGE OBJ_PACKAGE}</li>
     * <li>{@link #HWLOC_OBJ_DIE OBJ_DIE}</li>
     * <li>{@link #HWLOC_OBJ_CORE OBJ_CORE}</li>
     * <li>{@link #HWLOC_OBJ_PU OBJ_PU}</li>
     * <li>{@link #HWLOC_OBJ_L1CACHE OBJ_L1CACHE}</li>
     * <li>{@link #HWLOC_OBJ_L2CACHE OBJ_L2CACHE}</li>
     * <li>{@link #HWLOC_OBJ_L3CACHE OBJ_L3CACHE}</li>
     * <li>{@link #HWLOC_OBJ_L4CACHE OBJ_L4CACHE}</li>
     * <li>{@link #HWLOC_OBJ_L5CACHE OBJ_L5CACHE}</li>
     * <li>{@link #HWLOC_OBJ_L1ICACHE OBJ_L1ICACHE}</li>
     * <li>{@link #HWLOC_OBJ_L2ICACHE OBJ_L2ICACHE}</li>
     * <li>{@link #HWLOC_OBJ_L3ICACHE OBJ_L3ICACHE}</li>
     * <li>{@link #HWLOC_OBJ_GROUP OBJ_GROUP}</li>
     * <li>{@link #HWLOC_OBJ_NUMANODE OBJ_NUMANODE}</li>
     * <li>{@link #HWLOC_OBJ_MEMCACHE OBJ_MEMCACHE}</li>
     * <li>{@link #HWLOC_OBJ_BRIDGE OBJ_BRIDGE}</li>
     * <li>{@link #HWLOC_OBJ_PCI_DEVICE OBJ_PCI_DEVICE}</li>
     * <li>{@link #HWLOC_OBJ_OS_DEVICE OBJ_OS_DEVICE}</li>
     * <li>{@link #HWLOC_OBJ_MISC OBJ_MISC}</li>
     * <li>{@link #HWLOC_OBJ_TYPE_MAX OBJ_TYPE_MAX}</li>
     * </ul>
     */
    public static final int
        HWLOC_OBJ_TYPE_MIN   = 0,
        HWLOC_OBJ_MACHINE    = 0,
        HWLOC_OBJ_PACKAGE    = 1,
        HWLOC_OBJ_DIE        = 2,
        HWLOC_OBJ_CORE       = 3,
        HWLOC_OBJ_PU         = 4,
        HWLOC_OBJ_L1CACHE    = 5,
        HWLOC_OBJ_L2CACHE    = 6,
        HWLOC_OBJ_L3CACHE    = 7,
        HWLOC_OBJ_L4CACHE    = 8,
        HWLOC_OBJ_L5CACHE    = 9,
        HWLOC_OBJ_L1ICACHE   = 10,
        HWLOC_OBJ_L2ICACHE   = 11,
        HWLOC_OBJ_L3ICACHE   = 12,
        HWLOC_OBJ_GROUP      = 13,
        HWLOC_OBJ_NUMANODE   = 14,
        HWLOC_OBJ_MEMCACHE   = 15,
        HWLOC_OBJ_BRIDGE     = 16,
        HWLOC_OBJ_PCI_DEVICE = 17,
        HWLOC_OBJ_OS_DEVICE  = 18,
        HWLOC_OBJ_MISC       = 19,
        HWLOC_OBJ_TYPE_MAX   = 20;

    /**
     * {@code hwloc_obj_cache_type_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_OBJ_CACHE_UNIFIED OBJ_CACHE_UNIFIED}</li>
     * <li>{@link #HWLOC_OBJ_CACHE_DATA OBJ_CACHE_DATA}</li>
     * <li>{@link #HWLOC_OBJ_CACHE_INSTRUCTION OBJ_CACHE_INSTRUCTION}</li>
     * </ul>
     */
    public static final int
        HWLOC_OBJ_CACHE_UNIFIED     = 0,
        HWLOC_OBJ_CACHE_DATA        = 1,
        HWLOC_OBJ_CACHE_INSTRUCTION = 2;

    /**
     * {@code hwloc_obj_bridge_type_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_OBJ_BRIDGE_HOST OBJ_BRIDGE_HOST}</li>
     * <li>{@link #HWLOC_OBJ_BRIDGE_PCI OBJ_BRIDGE_PCI}</li>
     * </ul>
     */
    public static final int
        HWLOC_OBJ_BRIDGE_HOST = 0,
        HWLOC_OBJ_BRIDGE_PCI  = 1;

    /**
     * {@code hwloc_obj_osdev_type_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_OBJ_OSDEV_STORAGE OBJ_OSDEV_STORAGE}</li>
     * <li>{@link #HWLOC_OBJ_OSDEV_MEMORY OBJ_OSDEV_MEMORY}</li>
     * <li>{@link #HWLOC_OBJ_OSDEV_GPU OBJ_OSDEV_GPU}</li>
     * <li>{@link #HWLOC_OBJ_OSDEV_COPROC OBJ_OSDEV_COPROC}</li>
     * <li>{@link #HWLOC_OBJ_OSDEV_NETWORK OBJ_OSDEV_NETWORK}</li>
     * <li>{@link #HWLOC_OBJ_OSDEV_OPENFABRICS OBJ_OSDEV_OPENFABRICS}</li>
     * <li>{@link #HWLOC_OBJ_OSDEV_DMA OBJ_OSDEV_DMA}</li>
     * </ul>
     */
    public static final long
        HWLOC_OBJ_OSDEV_STORAGE     = 1L << 0,
        HWLOC_OBJ_OSDEV_MEMORY      = 1L << 1,
        HWLOC_OBJ_OSDEV_GPU         = 1L << 2,
        HWLOC_OBJ_OSDEV_COPROC      = 1L << 3,
        HWLOC_OBJ_OSDEV_NETWORK     = 1L << 4,
        HWLOC_OBJ_OSDEV_OPENFABRICS = 1L << 5,
        HWLOC_OBJ_OSDEV_DMA         = 1L << 6;

    /**
     * {@code enum hwloc_get_type_depth_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_TYPE_DEPTH_UNKNOWN TYPE_DEPTH_UNKNOWN}</li>
     * <li>{@link #HWLOC_TYPE_DEPTH_MULTIPLE TYPE_DEPTH_MULTIPLE}</li>
     * <li>{@link #HWLOC_TYPE_DEPTH_NUMANODE TYPE_DEPTH_NUMANODE}</li>
     * <li>{@link #HWLOC_TYPE_DEPTH_BRIDGE TYPE_DEPTH_BRIDGE}</li>
     * <li>{@link #HWLOC_TYPE_DEPTH_PCI_DEVICE TYPE_DEPTH_PCI_DEVICE}</li>
     * <li>{@link #HWLOC_TYPE_DEPTH_OS_DEVICE TYPE_DEPTH_OS_DEVICE}</li>
     * <li>{@link #HWLOC_TYPE_DEPTH_MISC TYPE_DEPTH_MISC}</li>
     * <li>{@link #HWLOC_TYPE_DEPTH_MEMCACHE TYPE_DEPTH_MEMCACHE}</li>
     * </ul>
     */
    public static final int
        HWLOC_TYPE_DEPTH_UNKNOWN    = -1,
        HWLOC_TYPE_DEPTH_MULTIPLE   = -2,
        HWLOC_TYPE_DEPTH_NUMANODE   = -3,
        HWLOC_TYPE_DEPTH_BRIDGE     = -4,
        HWLOC_TYPE_DEPTH_PCI_DEVICE = -5,
        HWLOC_TYPE_DEPTH_OS_DEVICE  = -6,
        HWLOC_TYPE_DEPTH_MISC       = -7,
        HWLOC_TYPE_DEPTH_MEMCACHE   = -8;

    /**
     * {@code enum hwloc_obj_snprintf_flag_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_OBJ_SNPRINTF_FLAG_LONG_NAMES OBJ_SNPRINTF_FLAG_LONG_NAMES}</li>
     * <li>{@link #HWLOC_OBJ_SNPRINTF_FLAG_SHORT_NAMES OBJ_SNPRINTF_FLAG_SHORT_NAMES}</li>
     * <li>{@link #HWLOC_OBJ_SNPRINTF_FLAG_MORE_ATTRS OBJ_SNPRINTF_FLAG_MORE_ATTRS}</li>
     * <li>{@link #HWLOC_OBJ_SNPRINTF_FLAG_NO_UNITS OBJ_SNPRINTF_FLAG_NO_UNITS}</li>
     * <li>{@link #HWLOC_OBJ_SNPRINTF_FLAG_UNITS_1000 OBJ_SNPRINTF_FLAG_UNITS_1000}</li>
     * <li>{@link #HWLOC_OBJ_SNPRINTF_FLAG_OLD_VERBOSE OBJ_SNPRINTF_FLAG_OLD_VERBOSE}</li>
     * </ul>
     */
    public static final long
        HWLOC_OBJ_SNPRINTF_FLAG_LONG_NAMES  = 1L<<1,
        HWLOC_OBJ_SNPRINTF_FLAG_SHORT_NAMES = 1L<<2,
        HWLOC_OBJ_SNPRINTF_FLAG_MORE_ATTRS  = 1L<<3,
        HWLOC_OBJ_SNPRINTF_FLAG_NO_UNITS    = 1L<<4,
        HWLOC_OBJ_SNPRINTF_FLAG_UNITS_1000  = 1L<<5,
        HWLOC_OBJ_SNPRINTF_FLAG_OLD_VERBOSE = 1L<<0;

    /**
     * {@code hwloc_cpubind_flags_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_CPUBIND_PROCESS CPUBIND_PROCESS}</li>
     * <li>{@link #HWLOC_CPUBIND_THREAD CPUBIND_THREAD}</li>
     * <li>{@link #HWLOC_CPUBIND_STRICT CPUBIND_STRICT}</li>
     * <li>{@link #HWLOC_CPUBIND_NOMEMBIND CPUBIND_NOMEMBIND}</li>
     * </ul>
     */
    public static final int
        HWLOC_CPUBIND_PROCESS   = 1<<0,
        HWLOC_CPUBIND_THREAD    = 1<<1,
        HWLOC_CPUBIND_STRICT    = 1<<2,
        HWLOC_CPUBIND_NOMEMBIND = 1<<3;

    /**
     * {@code hwloc_membind_policy_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_MEMBIND_DEFAULT MEMBIND_DEFAULT}</li>
     * <li>{@link #HWLOC_MEMBIND_FIRSTTOUCH MEMBIND_FIRSTTOUCH}</li>
     * <li>{@link #HWLOC_MEMBIND_BIND MEMBIND_BIND}</li>
     * <li>{@link #HWLOC_MEMBIND_INTERLEAVE MEMBIND_INTERLEAVE}</li>
     * <li>{@link #HWLOC_MEMBIND_WEIGHTED_INTERLEAVE MEMBIND_WEIGHTED_INTERLEAVE}</li>
     * <li>{@link #HWLOC_MEMBIND_NEXTTOUCH MEMBIND_NEXTTOUCH}</li>
     * <li>{@link #HWLOC_MEMBIND_MIXED MEMBIND_MIXED}</li>
     * </ul>
     */
    public static final int
        HWLOC_MEMBIND_DEFAULT             = 0,
        HWLOC_MEMBIND_FIRSTTOUCH          = 1,
        HWLOC_MEMBIND_BIND                = 2,
        HWLOC_MEMBIND_INTERLEAVE          = 3,
        HWLOC_MEMBIND_WEIGHTED_INTERLEAVE = 5,
        HWLOC_MEMBIND_NEXTTOUCH           = 4,
        HWLOC_MEMBIND_MIXED               = -1;

    /**
     * {@code hwloc_membind_flags_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_MEMBIND_PROCESS MEMBIND_PROCESS}</li>
     * <li>{@link #HWLOC_MEMBIND_THREAD MEMBIND_THREAD}</li>
     * <li>{@link #HWLOC_MEMBIND_STRICT MEMBIND_STRICT}</li>
     * <li>{@link #HWLOC_MEMBIND_MIGRATE MEMBIND_MIGRATE}</li>
     * <li>{@link #HWLOC_MEMBIND_NOCPUBIND MEMBIND_NOCPUBIND}</li>
     * <li>{@link #HWLOC_MEMBIND_BYNODESET MEMBIND_BYNODESET}</li>
     * </ul>
     */
    public static final int
        HWLOC_MEMBIND_PROCESS   = 1<<0,
        HWLOC_MEMBIND_THREAD    = 1<<1,
        HWLOC_MEMBIND_STRICT    = 1<<2,
        HWLOC_MEMBIND_MIGRATE   = 1<<3,
        HWLOC_MEMBIND_NOCPUBIND = 1<<4,
        HWLOC_MEMBIND_BYNODESET = 1<<5;

    /** {@code enum hwloc_topology_components_flag_e} */
    public static final long HWLOC_TOPOLOGY_COMPONENTS_FLAG_BLACKLIST = 1L<<0;

    /**
     * {@code enum hwloc_topology_flags_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_INCLUDE_DISALLOWED TOPOLOGY_FLAG_INCLUDE_DISALLOWED}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_IS_THISSYSTEM TOPOLOGY_FLAG_IS_THISSYSTEM}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_THISSYSTEM_ALLOWED_RESOURCES TOPOLOGY_FLAG_THISSYSTEM_ALLOWED_RESOURCES}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_IMPORT_SUPPORT TOPOLOGY_FLAG_IMPORT_SUPPORT}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_RESTRICT_TO_CPUBINDING TOPOLOGY_FLAG_RESTRICT_TO_CPUBINDING}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_RESTRICT_TO_MEMBINDING TOPOLOGY_FLAG_RESTRICT_TO_MEMBINDING}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_DONT_CHANGE_BINDING TOPOLOGY_FLAG_DONT_CHANGE_BINDING}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_NO_DISTANCES TOPOLOGY_FLAG_NO_DISTANCES}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_NO_MEMATTRS TOPOLOGY_FLAG_NO_MEMATTRS}</li>
     * <li>{@link #HWLOC_TOPOLOGY_FLAG_NO_CPUKINDS TOPOLOGY_FLAG_NO_CPUKINDS}</li>
     * </ul>
     */
    public static final long
        HWLOC_TOPOLOGY_FLAG_INCLUDE_DISALLOWED           = 1L<<0,
        HWLOC_TOPOLOGY_FLAG_IS_THISSYSTEM                = 1L<<1,
        HWLOC_TOPOLOGY_FLAG_THISSYSTEM_ALLOWED_RESOURCES = 1L<<2,
        HWLOC_TOPOLOGY_FLAG_IMPORT_SUPPORT               = 1L<<3,
        HWLOC_TOPOLOGY_FLAG_RESTRICT_TO_CPUBINDING       = 1L<<4,
        HWLOC_TOPOLOGY_FLAG_RESTRICT_TO_MEMBINDING       = 1L<<5,
        HWLOC_TOPOLOGY_FLAG_DONT_CHANGE_BINDING          = 1L<<6,
        HWLOC_TOPOLOGY_FLAG_NO_DISTANCES                 = 1L<<7,
        HWLOC_TOPOLOGY_FLAG_NO_MEMATTRS                  = 1L<<8,
        HWLOC_TOPOLOGY_FLAG_NO_CPUKINDS                  = 1L<<9;

    /**
     * {@code enum hwloc_type_filter_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_TYPE_FILTER_KEEP_ALL TYPE_FILTER_KEEP_ALL}</li>
     * <li>{@link #HWLOC_TYPE_FILTER_KEEP_NONE TYPE_FILTER_KEEP_NONE}</li>
     * <li>{@link #HWLOC_TYPE_FILTER_KEEP_STRUCTURE TYPE_FILTER_KEEP_STRUCTURE}</li>
     * <li>{@link #HWLOC_TYPE_FILTER_KEEP_IMPORTANT TYPE_FILTER_KEEP_IMPORTANT}</li>
     * </ul>
     */
    public static final int
        HWLOC_TYPE_FILTER_KEEP_ALL       = 0,
        HWLOC_TYPE_FILTER_KEEP_NONE      = 1,
        HWLOC_TYPE_FILTER_KEEP_STRUCTURE = 2,
        HWLOC_TYPE_FILTER_KEEP_IMPORTANT = 3;

    /**
     * {@code enum hwloc_restrict_flags_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_RESTRICT_FLAG_REMOVE_CPULESS RESTRICT_FLAG_REMOVE_CPULESS}</li>
     * <li>{@link #HWLOC_RESTRICT_FLAG_BYNODESET RESTRICT_FLAG_BYNODESET}</li>
     * <li>{@link #HWLOC_RESTRICT_FLAG_REMOVE_MEMLESS RESTRICT_FLAG_REMOVE_MEMLESS}</li>
     * <li>{@link #HWLOC_RESTRICT_FLAG_ADAPT_MISC RESTRICT_FLAG_ADAPT_MISC}</li>
     * <li>{@link #HWLOC_RESTRICT_FLAG_ADAPT_IO RESTRICT_FLAG_ADAPT_IO}</li>
     * </ul>
     */
    public static final long
        HWLOC_RESTRICT_FLAG_REMOVE_CPULESS = 1L<<0,
        HWLOC_RESTRICT_FLAG_BYNODESET      = 1L<<3,
        HWLOC_RESTRICT_FLAG_REMOVE_MEMLESS = 1L<<4,
        HWLOC_RESTRICT_FLAG_ADAPT_MISC     = 1L<<1,
        HWLOC_RESTRICT_FLAG_ADAPT_IO       = 1L<<2;

    /**
     * {@code enum hwloc_allow_flags_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_ALLOW_FLAG_ALL ALLOW_FLAG_ALL}</li>
     * <li>{@link #HWLOC_ALLOW_FLAG_LOCAL_RESTRICTIONS ALLOW_FLAG_LOCAL_RESTRICTIONS}</li>
     * <li>{@link #HWLOC_ALLOW_FLAG_CUSTOM ALLOW_FLAG_CUSTOM}</li>
     * </ul>
     */
    public static final long
        HWLOC_ALLOW_FLAG_ALL                = 1L<<0,
        HWLOC_ALLOW_FLAG_LOCAL_RESTRICTIONS = 1L<<1,
        HWLOC_ALLOW_FLAG_CUSTOM             = 1L<<2;

    /**
     * {@code hwloc_modify_infos_op_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_MODIFY_INFOS_OP_ADD MODIFY_INFOS_OP_ADD}</li>
     * <li>{@link #HWLOC_MODIFY_INFOS_OP_ADD_UNIQUE MODIFY_INFOS_OP_ADD_UNIQUE}</li>
     * <li>{@link #HWLOC_MODIFY_INFOS_OP_REPLACE MODIFY_INFOS_OP_REPLACE}</li>
     * <li>{@link #HWLOC_MODIFY_INFOS_OP_REMOVE MODIFY_INFOS_OP_REMOVE}</li>
     * </ul>
     */
    public static final long
        HWLOC_MODIFY_INFOS_OP_ADD        = 1L<<0,
        HWLOC_MODIFY_INFOS_OP_ADD_UNIQUE = 1L<<1,
        HWLOC_MODIFY_INFOS_OP_REPLACE    = 1L<<2,
        HWLOC_MODIFY_INFOS_OP_REMOVE     = 1L<<3;

    /** {@code enum hwloc_distrib_flags_e} */
    public static final long HWLOC_DISTRIB_FLAG_REVERSE = 1L<<0;

    /**
     * {@code enum hwloc_memattr_id_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_MEMATTR_ID_CAPACITY MEMATTR_ID_CAPACITY}</li>
     * <li>{@link #HWLOC_MEMATTR_ID_LOCALITY MEMATTR_ID_LOCALITY}</li>
     * <li>{@link #HWLOC_MEMATTR_ID_BANDWIDTH MEMATTR_ID_BANDWIDTH}</li>
     * <li>{@link #HWLOC_MEMATTR_ID_READ_BANDWIDTH MEMATTR_ID_READ_BANDWIDTH}</li>
     * <li>{@link #HWLOC_MEMATTR_ID_WRITE_BANDWIDTH MEMATTR_ID_WRITE_BANDWIDTH}</li>
     * <li>{@link #HWLOC_MEMATTR_ID_LATENCY MEMATTR_ID_LATENCY}</li>
     * <li>{@link #HWLOC_MEMATTR_ID_READ_LATENCY MEMATTR_ID_READ_LATENCY}</li>
     * <li>{@link #HWLOC_MEMATTR_ID_WRITE_LATENCY MEMATTR_ID_WRITE_LATENCY}</li>
     * </ul>
     */
    public static final int
        HWLOC_MEMATTR_ID_CAPACITY        = 0,
        HWLOC_MEMATTR_ID_LOCALITY        = 1,
        HWLOC_MEMATTR_ID_BANDWIDTH       = 2,
        HWLOC_MEMATTR_ID_READ_BANDWIDTH  = 4,
        HWLOC_MEMATTR_ID_WRITE_BANDWIDTH = 5,
        HWLOC_MEMATTR_ID_LATENCY         = 3,
        HWLOC_MEMATTR_ID_READ_LATENCY    = 6,
        HWLOC_MEMATTR_ID_WRITE_LATENCY   = 7;

    /**
     * {@code enum hwloc_location_type_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_LOCATION_TYPE_CPUSET LOCATION_TYPE_CPUSET}</li>
     * <li>{@link #HWLOC_LOCATION_TYPE_OBJECT LOCATION_TYPE_OBJECT}</li>
     * </ul>
     */
    public static final int
        HWLOC_LOCATION_TYPE_CPUSET = 1,
        HWLOC_LOCATION_TYPE_OBJECT = 0;

    /**
     * {@code enum hwloc_local_numanode_flag_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_LOCAL_NUMANODE_FLAG_LARGER_LOCALITY LOCAL_NUMANODE_FLAG_LARGER_LOCALITY}</li>
     * <li>{@link #HWLOC_LOCAL_NUMANODE_FLAG_SMALLER_LOCALITY LOCAL_NUMANODE_FLAG_SMALLER_LOCALITY}</li>
     * <li>{@link #HWLOC_LOCAL_NUMANODE_FLAG_ALL LOCAL_NUMANODE_FLAG_ALL}</li>
     * </ul>
     */
    public static final long
        HWLOC_LOCAL_NUMANODE_FLAG_LARGER_LOCALITY  = 1L<<0,
        HWLOC_LOCAL_NUMANODE_FLAG_SMALLER_LOCALITY = 1L<<1,
        HWLOC_LOCAL_NUMANODE_FLAG_ALL              = 1L<<2;

    /**
     * {@code enum hwloc_memattr_flag_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_MEMATTR_FLAG_HIGHER_FIRST MEMATTR_FLAG_HIGHER_FIRST}</li>
     * <li>{@link #HWLOC_MEMATTR_FLAG_LOWER_FIRST MEMATTR_FLAG_LOWER_FIRST}</li>
     * <li>{@link #HWLOC_MEMATTR_FLAG_NEED_INITIATOR MEMATTR_FLAG_NEED_INITIATOR}</li>
     * </ul>
     */
    public static final long
        HWLOC_MEMATTR_FLAG_HIGHER_FIRST   = 1L<<0,
        HWLOC_MEMATTR_FLAG_LOWER_FIRST    = 1L<<1,
        HWLOC_MEMATTR_FLAG_NEED_INITIATOR = 1L<<2;

    /** {@code enum hwloc_topology_export_xml_flags_e} */
    public static final long HWLOC_TOPOLOGY_EXPORT_XML_FLAG_V2 = 1L<<1;

    /**
     * {@code enum hwloc_topology_export_synthetic_flags_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_EXTENDED_TYPES TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_EXTENDED_TYPES}</li>
     * <li>{@link #HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_ATTRS TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_ATTRS}</li>
     * <li>{@link #HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_V1 TOPOLOGY_EXPORT_SYNTHETIC_FLAG_V1}</li>
     * <li>{@link #HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_IGNORE_MEMORY TOPOLOGY_EXPORT_SYNTHETIC_FLAG_IGNORE_MEMORY}</li>
     * </ul>
     */
    public static final long
        HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_EXTENDED_TYPES = 1L<<0,
        HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_ATTRS          = 1L<<1,
        HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_V1                = 1L<<2,
        HWLOC_TOPOLOGY_EXPORT_SYNTHETIC_FLAG_IGNORE_MEMORY     = 1L<<3;

    /**
     * {@code enum hwloc_distances_kind_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_DISTANCES_KIND_FROM_OS DISTANCES_KIND_FROM_OS}</li>
     * <li>{@link #HWLOC_DISTANCES_KIND_FROM_USER DISTANCES_KIND_FROM_USER}</li>
     * <li>{@link #HWLOC_DISTANCES_KIND_VALUE_LATENCY DISTANCES_KIND_VALUE_LATENCY}</li>
     * <li>{@link #HWLOC_DISTANCES_KIND_VALUE_BANDWIDTH DISTANCES_KIND_VALUE_BANDWIDTH}</li>
     * <li>{@link #HWLOC_DISTANCES_KIND_VALUE_HOPS DISTANCES_KIND_VALUE_HOPS}</li>
     * <li>{@link #HWLOC_DISTANCES_KIND_HETEROGENEOUS_TYPES DISTANCES_KIND_HETEROGENEOUS_TYPES}</li>
     * </ul>
     */
    public static final long
        HWLOC_DISTANCES_KIND_FROM_OS             = 1L<<0,
        HWLOC_DISTANCES_KIND_FROM_USER           = 1L<<1,
        HWLOC_DISTANCES_KIND_VALUE_LATENCY       = 1L<<2,
        HWLOC_DISTANCES_KIND_VALUE_BANDWIDTH     = 1L<<3,
        HWLOC_DISTANCES_KIND_VALUE_HOPS          = 1L<<5,
        HWLOC_DISTANCES_KIND_HETEROGENEOUS_TYPES = 1L<<4;

    /**
     * {@code enum hwloc_distances_transform_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_DISTANCES_TRANSFORM_REMOVE_NULL DISTANCES_TRANSFORM_REMOVE_NULL}</li>
     * <li>{@link #HWLOC_DISTANCES_TRANSFORM_LINKS DISTANCES_TRANSFORM_LINKS}</li>
     * <li>{@link #HWLOC_DISTANCES_TRANSFORM_MERGE_SWITCH_PORTS DISTANCES_TRANSFORM_MERGE_SWITCH_PORTS}</li>
     * <li>{@link #HWLOC_DISTANCES_TRANSFORM_TRANSITIVE_CLOSURE DISTANCES_TRANSFORM_TRANSITIVE_CLOSURE}</li>
     * </ul>
     */
    public static final int
        HWLOC_DISTANCES_TRANSFORM_REMOVE_NULL        = 0,
        HWLOC_DISTANCES_TRANSFORM_LINKS              = 1,
        HWLOC_DISTANCES_TRANSFORM_MERGE_SWITCH_PORTS = 2,
        HWLOC_DISTANCES_TRANSFORM_TRANSITIVE_CLOSURE = 3;

    /**
     * {@code enum hwloc_distances_add_flag_e}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_DISTANCES_ADD_FLAG_GROUP DISTANCES_ADD_FLAG_GROUP}</li>
     * <li>{@link #HWLOC_DISTANCES_ADD_FLAG_GROUP_INACCURATE DISTANCES_ADD_FLAG_GROUP_INACCURATE}</li>
     * </ul>
     */
    public static final long
        HWLOC_DISTANCES_ADD_FLAG_GROUP            = 1L<<0,
        HWLOC_DISTANCES_ADD_FLAG_GROUP_INACCURATE = 1L<<1;

    /**
     * {@code hwloc_topology_diff_obj_attr_type_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_TOPOLOGY_DIFF_OBJ_ATTR_SIZE TOPOLOGY_DIFF_OBJ_ATTR_SIZE}</li>
     * <li>{@link #HWLOC_TOPOLOGY_DIFF_OBJ_ATTR_NAME TOPOLOGY_DIFF_OBJ_ATTR_NAME}</li>
     * <li>{@link #HWLOC_TOPOLOGY_DIFF_OBJ_ATTR_INFO TOPOLOGY_DIFF_OBJ_ATTR_INFO}</li>
     * </ul>
     */
    public static final int
        HWLOC_TOPOLOGY_DIFF_OBJ_ATTR_SIZE = 0,
        HWLOC_TOPOLOGY_DIFF_OBJ_ATTR_NAME = 1,
        HWLOC_TOPOLOGY_DIFF_OBJ_ATTR_INFO = 2;

    /**
     * {@code hwloc_topology_diff_type_t}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #HWLOC_TOPOLOGY_DIFF_OBJ_ATTR TOPOLOGY_DIFF_OBJ_ATTR}</li>
     * <li>{@link #HWLOC_TOPOLOGY_DIFF_TOO_COMPLEX TOPOLOGY_DIFF_TOO_COMPLEX}</li>
     * </ul>
     */
    public static final int
        HWLOC_TOPOLOGY_DIFF_OBJ_ATTR    = 0,
        HWLOC_TOPOLOGY_DIFF_TOO_COMPLEX = 1;

    /** {@code enum hwloc_topology_diff_apply_flags_e} */
    public static final long HWLOC_TOPOLOGY_DIFF_APPLY_REVERSE = 1L<<0;

    protected HWLoc() {
        throw new UnsupportedOperationException();
    }

    // --- [ hwloc_bitmap_alloc ] ---

    @NativeType("hwloc_bitmap_t")
    public static long hwloc_bitmap_alloc() {
        long __functionAddress = Functions.bitmap_alloc;
        return invokeP(__functionAddress);
    }

    // --- [ hwloc_bitmap_alloc_full ] ---

    @NativeType("hwloc_bitmap_t")
    public static long hwloc_bitmap_alloc_full() {
        long __functionAddress = Functions.bitmap_alloc_full;
        return invokeP(__functionAddress);
    }

    // --- [ hwloc_bitmap_free ] ---

    public static void hwloc_bitmap_free(@NativeType("hwloc_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_free;
        invokePV(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_dup ] ---

    @NativeType("hwloc_bitmap_t")
    public static long hwloc_bitmap_dup(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_dup;
        return invokePP(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_copy ] ---

    public static int hwloc_bitmap_copy(@NativeType("hwloc_bitmap_t") long dst, @NativeType("hwloc_const_bitmap_t") long src) {
        long __functionAddress = Functions.bitmap_copy;
        if (CHECKS) {
            check(dst);
            check(src);
        }
        return invokePPI(dst, src, __functionAddress);
    }

    // --- [ hwloc_bitmap_snprintf ] ---

    public static int nhwloc_bitmap_snprintf(long buf, long buflen, long bitmap) {
        long __functionAddress = Functions.bitmap_snprintf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPPI(buf, buflen, bitmap, __functionAddress);
    }

    public static int hwloc_bitmap_snprintf(@NativeType("char *") @Nullable ByteBuffer buf, @NativeType("hwloc_const_bitmap_t") long bitmap) {
        return nhwloc_bitmap_snprintf(memAddressSafe(buf), remainingSafe(buf), bitmap);
    }

    // --- [ hwloc_bitmap_asprintf ] ---

    public static int nhwloc_bitmap_asprintf(long strp, long bitmap) {
        long __functionAddress = Functions.bitmap_asprintf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(strp, bitmap, __functionAddress);
    }

    public static int hwloc_bitmap_asprintf(@NativeType("char **") PointerBuffer strp, @NativeType("hwloc_const_bitmap_t") long bitmap) {
        if (CHECKS) {
            check(strp, 1);
        }
        return nhwloc_bitmap_asprintf(memAddress(strp), bitmap);
    }

    // --- [ hwloc_bitmap_sscanf ] ---

    public static int nhwloc_bitmap_sscanf(long bitmap, long string) {
        long __functionAddress = Functions.bitmap_sscanf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(bitmap, string, __functionAddress);
    }

    public static int hwloc_bitmap_sscanf(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nhwloc_bitmap_sscanf(bitmap, memAddress(string));
    }

    public static int hwloc_bitmap_sscanf(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("char const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nhwloc_bitmap_sscanf(bitmap, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_bitmap_list_snprintf ] ---

    public static int nhwloc_bitmap_list_snprintf(long buf, long buflen, long bitmap) {
        long __functionAddress = Functions.bitmap_list_snprintf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPPI(buf, buflen, bitmap, __functionAddress);
    }

    public static int hwloc_bitmap_list_snprintf(@NativeType("char *") @Nullable ByteBuffer buf, @NativeType("hwloc_const_bitmap_t") long bitmap) {
        return nhwloc_bitmap_list_snprintf(memAddressSafe(buf), remainingSafe(buf), bitmap);
    }

    // --- [ hwloc_bitmap_list_asprintf ] ---

    public static int nhwloc_bitmap_list_asprintf(long strp, long bitmap) {
        long __functionAddress = Functions.bitmap_list_asprintf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(strp, bitmap, __functionAddress);
    }

    public static int hwloc_bitmap_list_asprintf(@NativeType("char **") PointerBuffer strp, @NativeType("hwloc_const_bitmap_t") long bitmap) {
        if (CHECKS) {
            check(strp, 1);
        }
        return nhwloc_bitmap_list_asprintf(memAddress(strp), bitmap);
    }

    // --- [ hwloc_bitmap_list_sscanf ] ---

    public static int nhwloc_bitmap_list_sscanf(long bitmap, long string) {
        long __functionAddress = Functions.bitmap_list_sscanf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(bitmap, string, __functionAddress);
    }

    public static int hwloc_bitmap_list_sscanf(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nhwloc_bitmap_list_sscanf(bitmap, memAddress(string));
    }

    public static int hwloc_bitmap_list_sscanf(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("char const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nhwloc_bitmap_list_sscanf(bitmap, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_bitmap_taskset_snprintf ] ---

    public static int nhwloc_bitmap_taskset_snprintf(long buf, long buflen, long bitmap) {
        long __functionAddress = Functions.bitmap_taskset_snprintf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPPI(buf, buflen, bitmap, __functionAddress);
    }

    public static int hwloc_bitmap_taskset_snprintf(@NativeType("char *") @Nullable ByteBuffer buf, @NativeType("hwloc_const_bitmap_t") long bitmap) {
        return nhwloc_bitmap_taskset_snprintf(memAddressSafe(buf), remainingSafe(buf), bitmap);
    }

    // --- [ hwloc_bitmap_taskset_asprintf ] ---

    public static int nhwloc_bitmap_taskset_asprintf(long strp, long bitmap) {
        long __functionAddress = Functions.bitmap_taskset_asprintf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(strp, bitmap, __functionAddress);
    }

    public static int hwloc_bitmap_taskset_asprintf(@NativeType("char **") PointerBuffer strp, @NativeType("hwloc_const_bitmap_t") long bitmap) {
        if (CHECKS) {
            check(strp, 1);
        }
        return nhwloc_bitmap_taskset_asprintf(memAddress(strp), bitmap);
    }

    // --- [ hwloc_bitmap_taskset_sscanf ] ---

    public static int nhwloc_bitmap_taskset_sscanf(long bitmap, long string) {
        long __functionAddress = Functions.bitmap_taskset_sscanf;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(bitmap, string, __functionAddress);
    }

    public static int hwloc_bitmap_taskset_sscanf(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        return nhwloc_bitmap_taskset_sscanf(bitmap, memAddress(string));
    }

    public static int hwloc_bitmap_taskset_sscanf(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("char const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nhwloc_bitmap_taskset_sscanf(bitmap, stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_bitmap_zero ] ---

    public static void hwloc_bitmap_zero(@NativeType("hwloc_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_zero;
        if (CHECKS) {
            check(bitmap);
        }
        invokePV(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_fill ] ---

    public static void hwloc_bitmap_fill(@NativeType("hwloc_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_fill;
        if (CHECKS) {
            check(bitmap);
        }
        invokePV(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_only ] ---

    public static int hwloc_bitmap_only(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int id) {
        long __functionAddress = Functions.bitmap_only;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, id, __functionAddress);
    }

    // --- [ hwloc_bitmap_allbut ] ---

    public static int hwloc_bitmap_allbut(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int id) {
        long __functionAddress = Functions.bitmap_allbut;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, id, __functionAddress);
    }

    // --- [ hwloc_bitmap_from_ulong ] ---

    public static int hwloc_bitmap_from_ulong(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned long") long mask) {
        long __functionAddress = Functions.bitmap_from_ulong;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePNI(bitmap, mask, __functionAddress);
    }

    // --- [ hwloc_bitmap_from_ith_ulong ] ---

    public static int hwloc_bitmap_from_ith_ulong(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int i, @NativeType("unsigned long") long mask) {
        long __functionAddress = Functions.bitmap_from_ith_ulong;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePNI(bitmap, i, mask, __functionAddress);
    }

    // --- [ hwloc_bitmap_from_ulongs ] ---

    public static int nhwloc_bitmap_from_ulongs(long bitmap, int nr, long masks) {
        long __functionAddress = Functions.bitmap_from_ulongs;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(bitmap, nr, masks, __functionAddress);
    }

    public static int hwloc_bitmap_from_ulongs(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned long const *") CLongBuffer masks) {
        return nhwloc_bitmap_from_ulongs(bitmap, masks.remaining(), memAddress(masks));
    }

    // --- [ hwloc_bitmap_set ] ---

    public static int hwloc_bitmap_set(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int id) {
        long __functionAddress = Functions.bitmap_set;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, id, __functionAddress);
    }

    // --- [ hwloc_bitmap_set_range ] ---

    public static int hwloc_bitmap_set_range(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int begin, int end) {
        long __functionAddress = Functions.bitmap_set_range;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, begin, end, __functionAddress);
    }

    // --- [ hwloc_bitmap_set_ith_ulong ] ---

    public static int hwloc_bitmap_set_ith_ulong(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int i, @NativeType("unsigned long") long mask) {
        long __functionAddress = Functions.bitmap_set_ith_ulong;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePNI(bitmap, i, mask, __functionAddress);
    }

    // --- [ hwloc_bitmap_clr ] ---

    public static int hwloc_bitmap_clr(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int id) {
        long __functionAddress = Functions.bitmap_clr;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, id, __functionAddress);
    }

    // --- [ hwloc_bitmap_clr_range ] ---

    public static int hwloc_bitmap_clr_range(@NativeType("hwloc_bitmap_t") long bitmap, @NativeType("unsigned int") int begin, int end) {
        long __functionAddress = Functions.bitmap_clr_range;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, begin, end, __functionAddress);
    }

    // --- [ hwloc_bitmap_singlify ] ---

    public static int hwloc_bitmap_singlify(@NativeType("hwloc_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_singlify;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_to_ulong ] ---

    @NativeType("unsigned long")
    public static long hwloc_bitmap_to_ulong(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_to_ulong;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePN(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_to_ith_ulong ] ---

    @NativeType("unsigned long")
    public static long hwloc_bitmap_to_ith_ulong(@NativeType("hwloc_const_bitmap_t") long bitmap, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.bitmap_to_ith_ulong;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePN(bitmap, i, __functionAddress);
    }

    // --- [ hwloc_bitmap_to_ulongs ] ---

    public static int nhwloc_bitmap_to_ulongs(long bitmap, int nr, long masks) {
        long __functionAddress = Functions.bitmap_to_ulongs;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePPI(bitmap, nr, masks, __functionAddress);
    }

    public static int hwloc_bitmap_to_ulongs(@NativeType("hwloc_const_bitmap_t") long bitmap, @NativeType("unsigned long *") CLongBuffer masks) {
        return nhwloc_bitmap_to_ulongs(bitmap, masks.remaining(), memAddress(masks));
    }

    // --- [ hwloc_bitmap_nr_ulongs ] ---

    public static int hwloc_bitmap_nr_ulongs(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_nr_ulongs;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_isset ] ---

    @NativeType("int")
    public static boolean hwloc_bitmap_isset(@NativeType("hwloc_const_bitmap_t") long bitmap, @NativeType("unsigned int") int id) {
        long __functionAddress = Functions.bitmap_isset;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, id, __functionAddress) != 0;
    }

    // --- [ hwloc_bitmap_iszero ] ---

    @NativeType("int")
    public static boolean hwloc_bitmap_iszero(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_iszero;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress) != 0;
    }

    // --- [ hwloc_bitmap_isfull ] ---

    @NativeType("int")
    public static boolean hwloc_bitmap_isfull(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_isfull;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress) != 0;
    }

    // --- [ hwloc_bitmap_first ] ---

    public static int hwloc_bitmap_first(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_first;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_next ] ---

    public static int hwloc_bitmap_next(@NativeType("hwloc_const_bitmap_t") long bitmap, int prev) {
        long __functionAddress = Functions.bitmap_next;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, prev, __functionAddress);
    }

    // --- [ hwloc_bitmap_last ] ---

    public static int hwloc_bitmap_last(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_last;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_weight ] ---

    public static int hwloc_bitmap_weight(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_weight;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_first_unset ] ---

    public static int hwloc_bitmap_first_unset(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_first_unset;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_next_unset ] ---

    public static int hwloc_bitmap_next_unset(@NativeType("hwloc_const_bitmap_t") long bitmap, int prev) {
        long __functionAddress = Functions.bitmap_next_unset;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, prev, __functionAddress);
    }

    // --- [ hwloc_bitmap_last_unset ] ---

    public static int hwloc_bitmap_last_unset(@NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_last_unset;
        if (CHECKS) {
            check(bitmap);
        }
        return invokePI(bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_or ] ---

    public static int hwloc_bitmap_or(@NativeType("hwloc_bitmap_t") long res, @NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_or;
        if (CHECKS) {
            check(res);
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPPI(res, bitmap1, bitmap2, __functionAddress);
    }

    // --- [ hwloc_bitmap_and ] ---

    public static int hwloc_bitmap_and(@NativeType("hwloc_bitmap_t") long res, @NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_and;
        if (CHECKS) {
            check(res);
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPPI(res, bitmap1, bitmap2, __functionAddress);
    }

    // --- [ hwloc_bitmap_andnot ] ---

    public static int hwloc_bitmap_andnot(@NativeType("hwloc_bitmap_t") long res, @NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_andnot;
        if (CHECKS) {
            check(res);
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPPI(res, bitmap1, bitmap2, __functionAddress);
    }

    // --- [ hwloc_bitmap_xor ] ---

    public static int hwloc_bitmap_xor(@NativeType("hwloc_bitmap_t") long res, @NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_xor;
        if (CHECKS) {
            check(res);
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPPI(res, bitmap1, bitmap2, __functionAddress);
    }

    // --- [ hwloc_bitmap_not ] ---

    public static int hwloc_bitmap_not(@NativeType("hwloc_bitmap_t") long res, @NativeType("hwloc_const_bitmap_t") long bitmap) {
        long __functionAddress = Functions.bitmap_not;
        if (CHECKS) {
            check(res);
            check(bitmap);
        }
        return invokePPI(res, bitmap, __functionAddress);
    }

    // --- [ hwloc_bitmap_intersects ] ---

    @NativeType("int")
    public static boolean hwloc_bitmap_intersects(@NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_intersects;
        if (CHECKS) {
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPI(bitmap1, bitmap2, __functionAddress) != 0;
    }

    // --- [ hwloc_bitmap_isincluded ] ---

    @NativeType("int")
    public static boolean hwloc_bitmap_isincluded(@NativeType("hwloc_const_bitmap_t") long sub_bitmap, @NativeType("hwloc_const_bitmap_t") long super_bitmap) {
        long __functionAddress = Functions.bitmap_isincluded;
        if (CHECKS) {
            check(sub_bitmap);
            check(super_bitmap);
        }
        return invokePPI(sub_bitmap, super_bitmap, __functionAddress) != 0;
    }

    // --- [ hwloc_bitmap_isequal ] ---

    @NativeType("int")
    public static boolean hwloc_bitmap_isequal(@NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_isequal;
        if (CHECKS) {
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPI(bitmap1, bitmap2, __functionAddress) != 0;
    }

    // --- [ hwloc_bitmap_compare_first ] ---

    public static int hwloc_bitmap_compare_first(@NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_compare_first;
        if (CHECKS) {
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPI(bitmap1, bitmap2, __functionAddress);
    }

    // --- [ hwloc_bitmap_compare ] ---

    public static int hwloc_bitmap_compare(@NativeType("hwloc_const_bitmap_t") long bitmap1, @NativeType("hwloc_const_bitmap_t") long bitmap2) {
        long __functionAddress = Functions.bitmap_compare;
        if (CHECKS) {
            check(bitmap1);
            check(bitmap2);
        }
        return invokePPI(bitmap1, bitmap2, __functionAddress);
    }

    // --- [ hwloc_get_api_version ] ---

    @NativeType("unsigned")
    public static int hwloc_get_api_version() {
        long __functionAddress = Functions.get_api_version;
        return invokeI(__functionAddress);
    }

    // --- [ hwloc_compare_types ] ---

    public static int hwloc_compare_types(@NativeType("hwloc_obj_type_t") int type1, @NativeType("hwloc_obj_type_t") int type2) {
        long __functionAddress = Functions.compare_types;
        return invokeI(type1, type2, __functionAddress);
    }

    // --- [ hwloc_topology_init ] ---

    public static int nhwloc_topology_init(long topologyp) {
        long __functionAddress = Functions.topology_init;
        return invokePI(topologyp, __functionAddress);
    }

    public static int hwloc_topology_init(@NativeType("hwloc_topology_t *") PointerBuffer topologyp) {
        if (CHECKS) {
            check(topologyp, 1);
        }
        return nhwloc_topology_init(memAddress(topologyp));
    }

    // --- [ hwloc_topology_load ] ---

    public static int hwloc_topology_load(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_load;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, __functionAddress);
    }

    // --- [ hwloc_topology_destroy ] ---

    public static void hwloc_topology_destroy(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_destroy;
        if (CHECKS) {
            check(topology);
        }
        invokePV(topology, __functionAddress);
    }

    // --- [ hwloc_topology_dup ] ---

    public static int nhwloc_topology_dup(long newtopology, long oldtopology) {
        long __functionAddress = Functions.topology_dup;
        if (CHECKS) {
            check(oldtopology);
        }
        return invokePPI(newtopology, oldtopology, __functionAddress);
    }

    public static int hwloc_topology_dup(@NativeType("hwloc_topology_t *") PointerBuffer newtopology, @NativeType("hwloc_topology_t") long oldtopology) {
        if (CHECKS) {
            check(newtopology, 1);
        }
        return nhwloc_topology_dup(memAddress(newtopology), oldtopology);
    }

    // --- [ hwloc_topology_abi_check ] ---

    public static int hwloc_topology_abi_check(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_abi_check;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, __functionAddress);
    }

    // --- [ hwloc_topology_check ] ---

    public static void hwloc_topology_check(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_check;
        if (CHECKS) {
            check(topology);
        }
        invokePV(topology, __functionAddress);
    }

    // --- [ hwloc_topology_get_depth ] ---

    public static int hwloc_topology_get_depth(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_depth;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, __functionAddress);
    }

    // --- [ hwloc_get_type_depth ] ---

    public static int hwloc_get_type_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type) {
        long __functionAddress = Functions.get_type_depth;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, type, __functionAddress);
    }

    // --- [ hwloc_get_type_depth_with_attr ] ---

    public static int nhwloc_get_type_depth_with_attr(long topology, int type, long attrp, long attrsize) {
        long __functionAddress = Functions.get_type_depth_with_attr;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPI(topology, type, attrp, attrsize, __functionAddress);
    }

    public static int hwloc_get_type_depth_with_attr(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @NativeType("struct hwloc_obj_attr_u *") hwloc_obj_attr_u.@Nullable Buffer attrp) {
        return nhwloc_get_type_depth_with_attr(topology, type, memAddressSafe(attrp), remainingSafe(attrp));
    }

    // --- [ hwloc_get_memory_parents_depth ] ---

    public static int hwloc_get_memory_parents_depth(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.get_memory_parents_depth;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, __functionAddress);
    }

    // --- [ hwloc_get_depth_type ] ---

    @NativeType("hwloc_obj_type_t")
    public static int hwloc_get_depth_type(@NativeType("hwloc_topology_t") long topology, int depth) {
        long __functionAddress = Functions.get_depth_type;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, depth, __functionAddress);
    }

    // --- [ hwloc_get_nbobjs_by_depth ] ---

    @NativeType("unsigned")
    public static int hwloc_get_nbobjs_by_depth(@NativeType("hwloc_topology_t") long topology, int depth) {
        long __functionAddress = Functions.get_nbobjs_by_depth;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, depth, __functionAddress);
    }

    // --- [ hwloc_get_obj_by_depth ] ---

    public static long nhwloc_get_obj_by_depth(long topology, int depth, int idx) {
        long __functionAddress = Functions.get_obj_by_depth;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, depth, idx, __functionAddress);
    }

    @NativeType("hwloc_obj_t")
    public static @Nullable hwloc_obj hwloc_get_obj_by_depth(@NativeType("hwloc_topology_t") long topology, int depth, @NativeType("unsigned") int idx) {
        long __result = nhwloc_get_obj_by_depth(topology, depth, idx);
        return hwloc_obj.createSafe(__result);
    }

    // --- [ hwloc_obj_type_string ] ---

    public static long nhwloc_obj_type_string(int type) {
        long __functionAddress = Functions.obj_type_string;
        return invokeP(type, __functionAddress);
    }

    @NativeType("char const *")
    public static @Nullable String hwloc_obj_type_string(@NativeType("hwloc_obj_type_t") int type) {
        long __result = nhwloc_obj_type_string(type);
        return memASCIISafe(__result);
    }

    // --- [ hwloc_obj_type_snprintf ] ---

    public static int nhwloc_obj_type_snprintf(long string, long size, long obj, long flags) {
        long __functionAddress = Functions.obj_type_snprintf;
        return invokePPPNI(string, size, obj, flags, __functionAddress);
    }

    public static int hwloc_obj_type_snprintf(@NativeType("char *") @Nullable ByteBuffer string, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("unsigned long") long flags) {
        return nhwloc_obj_type_snprintf(memAddressSafe(string), remainingSafe(string), obj.address(), flags);
    }

    // --- [ hwloc_obj_attr_snprintf ] ---

    public static int nhwloc_obj_attr_snprintf(long string, long size, long obj, long separator, long flags) {
        long __functionAddress = Functions.obj_attr_snprintf;
        return invokePPPPNI(string, size, obj, separator, flags, __functionAddress);
    }

    public static int hwloc_obj_attr_snprintf(@NativeType("char *") ByteBuffer string, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") ByteBuffer separator, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            checkNT1(separator);
        }
        return nhwloc_obj_attr_snprintf(memAddress(string), string.remaining(), obj.address(), memAddress(separator), flags);
    }

    public static int hwloc_obj_attr_snprintf(@NativeType("char *") ByteBuffer string, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") CharSequence separator, @NativeType("unsigned long") long flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(separator, true);
            long separatorEncoded = stack.getPointerAddress();
            return nhwloc_obj_attr_snprintf(memAddress(string), string.remaining(), obj.address(), separatorEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_type_sscanf ] ---

    public static int nhwloc_type_sscanf(long string, long typep, long attrp, long attrsize) {
        long __functionAddress = Functions.type_sscanf;
        return invokePPPPI(string, typep, attrp, attrsize, __functionAddress);
    }

    public static int hwloc_type_sscanf(@NativeType("char const *") ByteBuffer string, @NativeType("hwloc_obj_type_t *") IntBuffer typep, @NativeType("struct hwloc_obj_attr_u *") hwloc_obj_attr_u.@Nullable Buffer attrp) {
        if (CHECKS) {
            checkNT1(string);
            check(typep, 1);
        }
        return nhwloc_type_sscanf(memAddress(string), memAddress(typep), memAddressSafe(attrp), remainingSafe(attrp));
    }

    public static int hwloc_type_sscanf(@NativeType("char const *") CharSequence string, @NativeType("hwloc_obj_type_t *") IntBuffer typep, @NativeType("struct hwloc_obj_attr_u *") hwloc_obj_attr_u.@Nullable Buffer attrp) {
        if (CHECKS) {
            check(typep, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(string, true);
            long stringEncoded = stack.getPointerAddress();
            return nhwloc_type_sscanf(stringEncoded, memAddress(typep), memAddressSafe(attrp), remainingSafe(attrp));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_modify_infos ] ---

    public static int nhwloc_modify_infos(long infos, long operation, long name, long value) {
        long __functionAddress = Functions.modify_infos;
        return invokePNPPI(infos, operation, name, value, __functionAddress);
    }

    public static int hwloc_modify_infos(@NativeType("struct hwloc_infos_s *") hwloc_infos_s infos, @NativeType("unsigned long") long operation, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        if (CHECKS) {
            checkNT1(name);
            checkNT1(value);
        }
        return nhwloc_modify_infos(infos.address(), operation, memAddress(name), memAddress(value));
    }

    public static int hwloc_modify_infos(@NativeType("struct hwloc_infos_s *") hwloc_infos_s infos, @NativeType("unsigned long") long operation, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nASCII(value, true);
            long valueEncoded = stack.getPointerAddress();
            return nhwloc_modify_infos(infos.address(), operation, nameEncoded, valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_get_infos ] ---

    public static long nhwloc_topology_get_infos(long topology) {
        long __functionAddress = Functions.topology_get_infos;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    @NativeType("struct hwloc_infos_s *")
    public static hwloc_infos_s hwloc_topology_get_infos(@NativeType("hwloc_topology_t") long topology) {
        long __result = nhwloc_topology_get_infos(topology);
        return hwloc_infos_s.create(__result);
    }

    // --- [ hwloc_obj_set_subtype ] ---

    public static int nhwloc_obj_set_subtype(long topology, long obj, long subtype) {
        long __functionAddress = Functions.obj_set_subtype;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPI(topology, obj, subtype, __functionAddress);
    }

    public static int hwloc_obj_set_subtype(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") @Nullable ByteBuffer subtype) {
        if (CHECKS) {
            checkNT1Safe(subtype);
        }
        return nhwloc_obj_set_subtype(topology, obj.address(), memAddressSafe(subtype));
    }

    public static int hwloc_obj_set_subtype(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") @Nullable CharSequence subtype) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(subtype, true);
            long subtypeEncoded = subtype == null ? NULL : stack.getPointerAddress();
            return nhwloc_obj_set_subtype(topology, obj.address(), subtypeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_set_cpubind ] ---

    public static int hwloc_set_cpubind(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.set_cpubind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_cpubind ] ---

    public static int hwloc_get_cpubind(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_cpubind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, set, flags, __functionAddress);
    }

    // --- [ hwloc_set_proc_cpubind_pid ] ---

    public static int hwloc_set_proc_cpubind_pid(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int pid, @NativeType("hwloc_const_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.set_proc_cpubind_pid;
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, pid, set, flags, __functionAddress);
    }

    // --- [ hwloc_set_proc_cpubind_handle ] ---

    public static int hwloc_set_proc_cpubind_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long pid, @NativeType("hwloc_const_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.set_proc_cpubind_handle;
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(pid);
            check(set);
        }
        return invokePPPI(topology, pid, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_proc_cpubind_pid ] ---

    public static int hwloc_get_proc_cpubind_pid(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int pid, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_proc_cpubind_pid;
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, pid, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_proc_cpubind_handle ] ---

    public static int hwloc_get_proc_cpubind_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long pid, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_proc_cpubind_handle;
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(pid);
            check(set);
        }
        return invokePPPI(topology, pid, set, flags, __functionAddress);
    }

    // --- [ hwloc_set_thread_cpubind_pthread ] ---

    public static int hwloc_set_thread_cpubind_pthread(@NativeType("hwloc_topology_t") long topology, @NativeType("pthread_t") long thread, @NativeType("hwloc_const_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.set_thread_cpubind_pthread;
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePNPI(topology, thread, set, flags, __functionAddress);
    }

    // --- [ hwloc_set_thread_cpubind_handle ] ---

    public static int hwloc_set_thread_cpubind_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long thread, @NativeType("hwloc_const_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.set_thread_cpubind_handle;
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(thread);
            check(set);
        }
        return invokePPPI(topology, thread, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_thread_cpubind_pthread ] ---

    public static int hwloc_get_thread_cpubind_pthread(@NativeType("hwloc_topology_t") long topology, @NativeType("pthread_t") long thread, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_thread_cpubind_pthread;
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePNPI(topology, thread, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_thread_cpubind_handle ] ---

    public static int hwloc_get_thread_cpubind_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long thread, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_thread_cpubind_handle;
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(thread);
            check(set);
        }
        return invokePPPI(topology, thread, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_last_cpu_location ] ---

    public static int hwloc_get_last_cpu_location(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_last_cpu_location;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_proc_last_cpu_location_pid ] ---

    public static int hwloc_get_proc_last_cpu_location_pid(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int pid, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_proc_last_cpu_location_pid;
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, pid, set, flags, __functionAddress);
    }

    // --- [ hwloc_get_proc_last_cpu_location_handle ] ---

    public static int hwloc_get_proc_last_cpu_location_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long pid, @NativeType("hwloc_cpuset_t") long set, int flags) {
        long __functionAddress = Functions.get_proc_last_cpu_location_handle;
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(pid);
            check(set);
        }
        return invokePPPI(topology, pid, set, flags, __functionAddress);
    }

    // --- [ hwloc_set_membind ] ---

    public static int hwloc_set_membind(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_bitmap_t") long set, @NativeType("hwloc_membind_policy_t") int policy, int flags) {
        long __functionAddress = Functions.set_membind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, set, policy, flags, __functionAddress);
    }

    // --- [ hwloc_get_membind ] ---

    public static int nhwloc_get_membind(long topology, long set, long policy, int flags) {
        long __functionAddress = Functions.get_membind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPPI(topology, set, policy, flags, __functionAddress);
    }

    public static int hwloc_get_membind(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_bitmap_t") long set, @NativeType("hwloc_membind_policy_t *") IntBuffer policy, int flags) {
        if (CHECKS) {
            check(policy, 1);
        }
        return nhwloc_get_membind(topology, set, memAddress(policy), flags);
    }

    // --- [ hwloc_set_proc_membind_pid ] ---

    public static int hwloc_set_proc_membind_pid(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int pid, @NativeType("hwloc_const_bitmap_t") long set, @NativeType("hwloc_membind_policy_t") int policy, int flags) {
        long __functionAddress = Functions.set_proc_membind_pid;
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPI(topology, pid, set, policy, flags, __functionAddress);
    }

    // --- [ hwloc_set_proc_membind_handle ] ---

    public static int hwloc_set_proc_membind_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long pid, @NativeType("hwloc_const_bitmap_t") long set, @NativeType("hwloc_membind_policy_t") int policy, int flags) {
        long __functionAddress = Functions.set_proc_membind_handle;
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(pid);
            check(set);
        }
        return invokePPPI(topology, pid, set, policy, flags, __functionAddress);
    }

    // --- [ hwloc_get_proc_membind_pid ] ---

    public static int nhwloc_get_proc_membind_pid(long topology, int pid, long set, long policy, int flags) {
        long __functionAddress = Functions.get_proc_membind_pid;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPPI(topology, pid, set, policy, flags, __functionAddress);
    }

    public static int hwloc_get_proc_membind_pid(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int pid, @NativeType("hwloc_bitmap_t") long set, @NativeType("hwloc_membind_policy_t *") IntBuffer policy, int flags) {
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(policy, 1);
        }
        return nhwloc_get_proc_membind_pid(topology, pid, set, memAddress(policy), flags);
    }

    // --- [ hwloc_get_proc_membind_handle ] ---

    public static int nhwloc_get_proc_membind_handle(long topology, long pid, long set, long policy, int flags) {
        long __functionAddress = Functions.get_proc_membind_handle;
        if (CHECKS) {
            check(topology);
            check(pid);
            check(set);
        }
        return invokePPPPI(topology, pid, set, policy, flags, __functionAddress);
    }

    public static int hwloc_get_proc_membind_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long pid, @NativeType("hwloc_bitmap_t") long set, @NativeType("hwloc_membind_policy_t *") IntBuffer policy, int flags) {
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(policy, 1);
        }
        return nhwloc_get_proc_membind_handle(topology, pid, set, memAddress(policy), flags);
    }

    // --- [ hwloc_set_area_membind ] ---

    public static int nhwloc_set_area_membind(long topology, long addr, long len, long set, int policy, int flags) {
        long __functionAddress = Functions.set_area_membind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPPPI(topology, addr, len, set, policy, flags, __functionAddress);
    }

    public static int hwloc_set_area_membind(@NativeType("hwloc_topology_t") long topology, @NativeType("void const *") ByteBuffer addr, @NativeType("hwloc_const_bitmap_t") long set, @NativeType("hwloc_membind_policy_t") int policy, int flags) {
        return nhwloc_set_area_membind(topology, memAddress(addr), addr.remaining(), set, policy, flags);
    }

    // --- [ hwloc_get_area_membind ] ---

    public static int nhwloc_get_area_membind(long topology, long addr, long len, long set, long policy, int flags) {
        long __functionAddress = Functions.get_area_membind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPPPPI(topology, addr, len, set, policy, flags, __functionAddress);
    }

    public static int hwloc_get_area_membind(@NativeType("hwloc_topology_t") long topology, @NativeType("void const *") ByteBuffer addr, @NativeType("hwloc_bitmap_t") long set, @NativeType("hwloc_membind_policy_t *") IntBuffer policy, int flags) {
        if (CHECKS) {
            check(policy, 1);
        }
        return nhwloc_get_area_membind(topology, memAddress(addr), addr.remaining(), set, memAddress(policy), flags);
    }

    // --- [ hwloc_get_area_memlocation ] ---

    public static int nhwloc_get_area_memlocation(long topology, long addr, long len, long set, int flags) {
        long __functionAddress = Functions.get_area_memlocation;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPPPI(topology, addr, len, set, flags, __functionAddress);
    }

    public static int hwloc_get_area_memlocation(@NativeType("hwloc_topology_t") long topology, @NativeType("void const *") ByteBuffer addr, @NativeType("hwloc_bitmap_t") long set, int flags) {
        return nhwloc_get_area_memlocation(topology, memAddress(addr), addr.remaining(), set, flags);
    }

    // --- [ hwloc_alloc ] ---

    public static long nhwloc_alloc(long topology, long len) {
        long __functionAddress = Functions.alloc;
        if (CHECKS) {
            check(topology);
        }
        return invokePPP(topology, len, __functionAddress);
    }

    @NativeType("void *")
    public static @Nullable ByteBuffer hwloc_alloc(@NativeType("hwloc_topology_t") long topology, @NativeType("size_t") long len) {
        long __result = nhwloc_alloc(topology, len);
        return memByteBufferSafe(__result, (int)len);
    }

    // --- [ hwloc_alloc_membind ] ---

    public static long nhwloc_alloc_membind(long topology, long len, long set, int policy, int flags) {
        long __functionAddress = Functions.alloc_membind;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPPP(topology, len, set, policy, flags, __functionAddress);
    }

    @NativeType("void *")
    public static @Nullable ByteBuffer hwloc_alloc_membind(@NativeType("hwloc_topology_t") long topology, @NativeType("size_t") long len, @NativeType("hwloc_const_bitmap_t") long set, @NativeType("hwloc_membind_policy_t") int policy, int flags) {
        long __result = nhwloc_alloc_membind(topology, len, set, policy, flags);
        return memByteBufferSafe(__result, (int)len);
    }

    // --- [ hwloc_free ] ---

    public static int nhwloc_free(long topology, long addr, long len) {
        long __functionAddress = Functions.free;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPI(topology, addr, len, __functionAddress);
    }

    public static int hwloc_free(@NativeType("hwloc_topology_t") long topology, @NativeType("void *") ByteBuffer addr) {
        return nhwloc_free(topology, memAddress(addr), addr.remaining());
    }

    // --- [ hwloc_topology_set_pid_pid ] ---

    public static int hwloc_topology_set_pid_pid(@NativeType("hwloc_topology_t") long topology, @NativeType("pid_t") int pid) {
        long __functionAddress = Functions.topology_set_pid_pid;
		if (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, pid, __functionAddress);
    }

    // --- [ hwloc_topology_set_pid_handle ] ---

    public static int hwloc_topology_set_pid_handle(@NativeType("hwloc_topology_t") long topology, @NativeType("HANDLE") long pid) {
        long __functionAddress = Functions.topology_set_pid_handle;
		if (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();
        if (CHECKS) {
            check(topology);
            check(pid);
        }
        return invokePPI(topology, pid, __functionAddress);
    }

    // --- [ hwloc_topology_set_synthetic ] ---

    public static int nhwloc_topology_set_synthetic(long topology, long description) {
        long __functionAddress = Functions.topology_set_synthetic;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, description, __functionAddress);
    }

    public static int hwloc_topology_set_synthetic(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") ByteBuffer description) {
        if (CHECKS) {
            checkNT1(description);
        }
        return nhwloc_topology_set_synthetic(topology, memAddress(description));
    }

    public static int hwloc_topology_set_synthetic(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence description) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(description, true);
            long descriptionEncoded = stack.getPointerAddress();
            return nhwloc_topology_set_synthetic(topology, descriptionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_set_xml ] ---

    public static int nhwloc_topology_set_xml(long topology, long xmlpath) {
        long __functionAddress = Functions.topology_set_xml;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, xmlpath, __functionAddress);
    }

    public static int hwloc_topology_set_xml(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") ByteBuffer xmlpath) {
        if (CHECKS) {
            checkNT1(xmlpath);
        }
        return nhwloc_topology_set_xml(topology, memAddress(xmlpath));
    }

    public static int hwloc_topology_set_xml(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence xmlpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(xmlpath, true);
            long xmlpathEncoded = stack.getPointerAddress();
            return nhwloc_topology_set_xml(topology, xmlpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_set_xmlbuffer ] ---

    public static int nhwloc_topology_set_xmlbuffer(long topology, long buffer, int size) {
        long __functionAddress = Functions.topology_set_xmlbuffer;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, buffer, size, __functionAddress);
    }

    public static int hwloc_topology_set_xmlbuffer(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") ByteBuffer buffer) {
        return nhwloc_topology_set_xmlbuffer(topology, memAddress(buffer), buffer.remaining());
    }

    public static int hwloc_topology_set_xmlbuffer(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int bufferEncodedLength = stack.nASCII(buffer, false);
            long bufferEncoded = stack.getPointerAddress();
            return nhwloc_topology_set_xmlbuffer(topology, bufferEncoded, bufferEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_set_components ] ---

    public static int nhwloc_topology_set_components(long topology, long flags, long name) {
        long __functionAddress = Functions.topology_set_components;
        if (CHECKS) {
            check(topology);
        }
        return invokePNPI(topology, flags, name, __functionAddress);
    }

    public static int hwloc_topology_set_components(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned long") long flags, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nhwloc_topology_set_components(topology, flags, memAddress(name));
    }

    public static int hwloc_topology_set_components(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned long") long flags, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nhwloc_topology_set_components(topology, flags, nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_set_flags ] ---

    public static int hwloc_topology_set_flags(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.topology_set_flags;
        if (CHECKS) {
            check(topology);
        }
        return invokePNI(topology, flags, __functionAddress);
    }

    // --- [ hwloc_topology_get_flags ] ---

    @NativeType("unsigned long")
    public static long hwloc_topology_get_flags(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_flags;
        if (CHECKS) {
            check(topology);
        }
        return invokePN(topology, __functionAddress);
    }

    // --- [ hwloc_topology_is_thissystem ] ---

    @NativeType("int")
    public static boolean hwloc_topology_is_thissystem(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_is_thissystem;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, __functionAddress) != 0;
    }

    // --- [ hwloc_topology_get_support ] ---

    public static long nhwloc_topology_get_support(long topology) {
        long __functionAddress = Functions.topology_get_support;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    @NativeType("struct hwloc_topology_support const *")
    public static @Nullable hwloc_topology_support hwloc_topology_get_support(@NativeType("hwloc_topology_t") long topology) {
        long __result = nhwloc_topology_get_support(topology);
        return hwloc_topology_support.createSafe(__result);
    }

    // --- [ hwloc_topology_set_type_filter ] ---

    public static int hwloc_topology_set_type_filter(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @NativeType("enum hwloc_type_filter_e") int filter) {
        long __functionAddress = Functions.topology_set_type_filter;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, type, filter, __functionAddress);
    }

    // --- [ hwloc_topology_get_type_filter ] ---

    public static int nhwloc_topology_get_type_filter(long topology, int type, long filter) {
        long __functionAddress = Functions.topology_get_type_filter;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, type, filter, __functionAddress);
    }

    public static int hwloc_topology_get_type_filter(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @NativeType("enum hwloc_type_filter_e *") IntBuffer filter) {
        if (CHECKS) {
            check(filter, 1);
        }
        return nhwloc_topology_get_type_filter(topology, type, memAddress(filter));
    }

    // --- [ hwloc_topology_set_all_types_filter ] ---

    public static int hwloc_topology_set_all_types_filter(@NativeType("hwloc_topology_t") long topology, @NativeType("enum hwloc_type_filter_e") int filter) {
        long __functionAddress = Functions.topology_set_all_types_filter;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, filter, __functionAddress);
    }

    // --- [ hwloc_topology_set_cache_types_filter ] ---

    public static int hwloc_topology_set_cache_types_filter(@NativeType("hwloc_topology_t") long topology, @NativeType("enum hwloc_type_filter_e") int filter) {
        long __functionAddress = Functions.topology_set_cache_types_filter;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, filter, __functionAddress);
    }

    // --- [ hwloc_topology_set_icache_types_filter ] ---

    public static int hwloc_topology_set_icache_types_filter(@NativeType("hwloc_topology_t") long topology, @NativeType("enum hwloc_type_filter_e") int filter) {
        long __functionAddress = Functions.topology_set_icache_types_filter;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, filter, __functionAddress);
    }

    // --- [ hwloc_topology_set_io_types_filter ] ---

    public static int hwloc_topology_set_io_types_filter(@NativeType("hwloc_topology_t") long topology, @NativeType("enum hwloc_type_filter_e") int filter) {
        long __functionAddress = Functions.topology_set_io_types_filter;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, filter, __functionAddress);
    }

    // --- [ hwloc_topology_set_userdata ] ---

    public static void hwloc_topology_set_userdata(@NativeType("hwloc_topology_t") long topology, @NativeType("void const *") long userdata) {
        long __functionAddress = Functions.topology_set_userdata;
        if (CHECKS) {
            check(topology);
        }
        invokePPV(topology, userdata, __functionAddress);
    }

    // --- [ hwloc_topology_get_userdata ] ---

    @NativeType("void *")
    public static long hwloc_topology_get_userdata(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_userdata;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    // --- [ hwloc_topology_restrict ] ---

    public static int hwloc_topology_restrict(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_bitmap_t") long set, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.topology_restrict;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPNI(topology, set, flags, __functionAddress);
    }

    // --- [ hwloc_topology_allow ] ---

    public static int hwloc_topology_allow(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long cpuset, @NativeType("hwloc_const_nodeset_t") long nodeset, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.topology_allow;
        if (CHECKS) {
            check(topology);
            check(cpuset);
            check(nodeset);
        }
        return invokePPPNI(topology, cpuset, nodeset, flags, __functionAddress);
    }

    // --- [ hwloc_topology_insert_misc_object ] ---

    public static long nhwloc_topology_insert_misc_object(long topology, long parent, long name) {
        long __functionAddress = Functions.topology_insert_misc_object;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPP(topology, parent, name, __functionAddress);
    }

    @NativeType("hwloc_obj_t")
    public static @Nullable hwloc_obj hwloc_topology_insert_misc_object(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj parent, @NativeType("char const *") ByteBuffer name) {
        if (CHECKS) {
            checkNT1(name);
        }
        long __result = nhwloc_topology_insert_misc_object(topology, parent.address(), memAddress(name));
        return hwloc_obj.createSafe(__result);
    }

    @NativeType("hwloc_obj_t")
    public static @Nullable hwloc_obj hwloc_topology_insert_misc_object(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj parent, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nhwloc_topology_insert_misc_object(topology, parent.address(), nameEncoded);
            return hwloc_obj.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_alloc_group_object ] ---

    public static long nhwloc_topology_alloc_group_object(long topology) {
        long __functionAddress = Functions.topology_alloc_group_object;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    @NativeType("hwloc_obj_t")
    public static @Nullable hwloc_obj hwloc_topology_alloc_group_object(@NativeType("hwloc_topology_t") long topology) {
        long __result = nhwloc_topology_alloc_group_object(topology);
        return hwloc_obj.createSafe(__result);
    }

    // --- [ hwloc_topology_free_group_object ] ---

    public static int nhwloc_topology_free_group_object(long topology, long group) {
        long __functionAddress = Functions.topology_free_group_object;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, group, __functionAddress);
    }

    public static int hwloc_topology_free_group_object(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj group) {
        return nhwloc_topology_free_group_object(topology, group.address());
    }

    // --- [ hwloc_topology_insert_group_object ] ---

    public static long nhwloc_topology_insert_group_object(long topology, long group) {
        long __functionAddress = Functions.topology_insert_group_object;
        if (CHECKS) {
            check(topology);
        }
        return invokePPP(topology, group, __functionAddress);
    }

    @NativeType("hwloc_obj_t")
    public static @Nullable hwloc_obj hwloc_topology_insert_group_object(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj group) {
        long __result = nhwloc_topology_insert_group_object(topology, group.address());
        return hwloc_obj.createSafe(__result);
    }

    // --- [ hwloc_obj_add_other_obj_sets ] ---

    public static int nhwloc_obj_add_other_obj_sets(long dst, long src) {
        long __functionAddress = Functions.obj_add_other_obj_sets;
        return invokePPI(dst, src, __functionAddress);
    }

    public static int hwloc_obj_add_other_obj_sets(@NativeType("hwloc_obj_t") hwloc_obj dst, @NativeType("hwloc_obj_t") hwloc_obj src) {
        return nhwloc_obj_add_other_obj_sets(dst.address(), src.address());
    }

    // --- [ hwloc_topology_refresh ] ---

    public static int hwloc_topology_refresh(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_refresh;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, __functionAddress);
    }

    // --- [ hwloc_obj_type_is_normal ] ---

    @NativeType("int")
    public static boolean hwloc_obj_type_is_normal(@NativeType("hwloc_obj_type_t") int type) {
        long __functionAddress = Functions.obj_type_is_normal;
        return invokeI(type, __functionAddress) != 0;
    }

    // --- [ hwloc_obj_type_is_io ] ---

    @NativeType("int")
    public static boolean hwloc_obj_type_is_io(@NativeType("hwloc_obj_type_t") int type) {
        long __functionAddress = Functions.obj_type_is_io;
        return invokeI(type, __functionAddress) != 0;
    }

    // --- [ hwloc_obj_type_is_memory ] ---

    @NativeType("int")
    public static boolean hwloc_obj_type_is_memory(@NativeType("hwloc_obj_type_t") int type) {
        long __functionAddress = Functions.obj_type_is_memory;
        return invokeI(type, __functionAddress) != 0;
    }

    // --- [ hwloc_obj_type_is_cache ] ---

    @NativeType("int")
    public static boolean hwloc_obj_type_is_cache(@NativeType("hwloc_obj_type_t") int type) {
        long __functionAddress = Functions.obj_type_is_cache;
        return invokeI(type, __functionAddress) != 0;
    }

    // --- [ hwloc_obj_type_is_dcache ] ---

    @NativeType("int")
    public static boolean hwloc_obj_type_is_dcache(@NativeType("hwloc_obj_type_t") int type) {
        long __functionAddress = Functions.obj_type_is_dcache;
        return invokeI(type, __functionAddress) != 0;
    }

    // --- [ hwloc_obj_type_is_icache ] ---

    @NativeType("int")
    public static boolean hwloc_obj_type_is_icache(@NativeType("hwloc_obj_type_t") int type) {
        long __functionAddress = Functions.obj_type_is_icache;
        return invokeI(type, __functionAddress) != 0;
    }

    // --- [ hwloc_get_largest_objs_inside_cpuset ] ---

    public static int nhwloc_get_largest_objs_inside_cpuset(long topology, long set, long objs, int max) {
        long __functionAddress = Functions.get_largest_objs_inside_cpuset;
        if (CHECKS) {
            check(topology);
            check(set);
        }
        return invokePPPI(topology, set, objs, max, __functionAddress);
    }

    public static int hwloc_get_largest_objs_inside_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_t *") PointerBuffer objs) {
        return nhwloc_get_largest_objs_inside_cpuset(topology, set, memAddress(objs), objs.remaining());
    }

    // --- [ hwloc_bitmap_singlify_per_core ] ---

    public static int hwloc_bitmap_singlify_per_core(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_bitmap_t") long cpuset, @NativeType("unsigned") int which) {
        long __functionAddress = Functions.bitmap_singlify_per_core;
        if (CHECKS) {
            check(topology);
            check(cpuset);
        }
        return invokePPI(topology, cpuset, which, __functionAddress);
    }

    // --- [ hwloc_get_closest_objs ] ---

    public static int nhwloc_get_closest_objs(long topology, long src, long objs, int max) {
        long __functionAddress = Functions.get_closest_objs;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPI(topology, src, objs, max, __functionAddress);
    }

    @NativeType("unsigned")
    public static int hwloc_get_closest_objs(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj src, @NativeType("hwloc_obj_t *") PointerBuffer objs) {
        return nhwloc_get_closest_objs(topology, src.address(), memAddress(objs), objs.remaining());
    }

    // --- [ hwloc_get_obj_with_same_locality ] ---

    public static long nhwloc_get_obj_with_same_locality(long topology, long src, int type, long subtype, long nameprefix, long flags) {
        long __functionAddress = Functions.get_obj_with_same_locality;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPPNP(topology, src, type, subtype, nameprefix, flags, __functionAddress);
    }

    @NativeType("hwloc_obj_t")
    public static @Nullable hwloc_obj hwloc_get_obj_with_same_locality(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj src, @NativeType("hwloc_obj_type_t") int type, @NativeType("char const *") @Nullable ByteBuffer subtype, @NativeType("char const *") @Nullable ByteBuffer nameprefix, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            checkNT1Safe(subtype);
            checkNT1Safe(nameprefix);
        }
        long __result = nhwloc_get_obj_with_same_locality(topology, src.address(), type, memAddressSafe(subtype), memAddressSafe(nameprefix), flags);
        return hwloc_obj.createSafe(__result);
    }

    @NativeType("hwloc_obj_t")
    public static @Nullable hwloc_obj hwloc_get_obj_with_same_locality(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj src, @NativeType("hwloc_obj_type_t") int type, @NativeType("char const *") @Nullable CharSequence subtype, @NativeType("char const *") @Nullable CharSequence nameprefix, @NativeType("unsigned long") long flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(subtype, true);
            long subtypeEncoded = subtype == null ? NULL : stack.getPointerAddress();
            stack.nASCIISafe(nameprefix, true);
            long nameprefixEncoded = nameprefix == null ? NULL : stack.getPointerAddress();
            long __result = nhwloc_get_obj_with_same_locality(topology, src.address(), type, subtypeEncoded, nameprefixEncoded, flags);
            return hwloc_obj.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_get_complete_cpuset ] ---

    @NativeType("hwloc_const_cpuset_t")
    public static long hwloc_topology_get_complete_cpuset(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_complete_cpuset;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    // --- [ hwloc_topology_get_topology_cpuset ] ---

    @NativeType("hwloc_const_cpuset_t")
    public static long hwloc_topology_get_topology_cpuset(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_topology_cpuset;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    // --- [ hwloc_topology_get_allowed_cpuset ] ---

    @NativeType("hwloc_const_cpuset_t")
    public static long hwloc_topology_get_allowed_cpuset(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_allowed_cpuset;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    // --- [ hwloc_topology_get_complete_nodeset ] ---

    @NativeType("hwloc_const_nodeset_t")
    public static long hwloc_topology_get_complete_nodeset(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_complete_nodeset;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    // --- [ hwloc_topology_get_topology_nodeset ] ---

    @NativeType("hwloc_const_nodeset_t")
    public static long hwloc_topology_get_topology_nodeset(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_topology_nodeset;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    // --- [ hwloc_topology_get_allowed_nodeset ] ---

    @NativeType("hwloc_const_nodeset_t")
    public static long hwloc_topology_get_allowed_nodeset(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.topology_get_allowed_nodeset;
        if (CHECKS) {
            check(topology);
        }
        return invokePP(topology, __functionAddress);
    }

    // --- [ hwloc_memattr_get_by_name ] ---

    public static int nhwloc_memattr_get_by_name(long topology, long name, long id) {
        long __functionAddress = Functions.memattr_get_by_name;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPI(topology, name, id, __functionAddress);
    }

    public static int hwloc_memattr_get_by_name(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") ByteBuffer name, @NativeType("hwloc_memattr_id_t *") IntBuffer id) {
        if (CHECKS) {
            checkNT1(name);
            check(id, 1);
        }
        return nhwloc_memattr_get_by_name(topology, memAddress(name), memAddress(id));
    }

    public static int hwloc_memattr_get_by_name(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence name, @NativeType("hwloc_memattr_id_t *") IntBuffer id) {
        if (CHECKS) {
            check(id, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nhwloc_memattr_get_by_name(topology, nameEncoded, memAddress(id));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_get_local_numanode_objs ] ---

    public static int nhwloc_get_local_numanode_objs(long topology, long location, long nr, long nodes, long flags) {
        long __functionAddress = Functions.get_local_numanode_objs;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPPNI(topology, location, nr, nodes, flags, __functionAddress);
    }

    public static int hwloc_get_local_numanode_objs(@NativeType("hwloc_topology_t") long topology, @NativeType("struct hwloc_location *") hwloc_location location, @NativeType("unsigned int *") IntBuffer nr, @NativeType("hwloc_obj_t *") PointerBuffer nodes, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(nr, 1);
            check(nodes, nr.get(nr.position()));
        }
        return nhwloc_get_local_numanode_objs(topology, location.address(), memAddress(nr), memAddress(nodes), flags);
    }

    // --- [ hwloc_memattr_get_value ] ---

    public static int nhwloc_memattr_get_value(long topology, int attribute, long target_node, long initiator, long flags, long value) {
        long __functionAddress = Functions.memattr_get_value;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNPI(topology, attribute, target_node, initiator, flags, value, __functionAddress);
    }

    public static int hwloc_memattr_get_value(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("hwloc_obj_t") hwloc_obj target_node, @NativeType("struct hwloc_location *") @Nullable hwloc_location initiator, @NativeType("unsigned long") long flags, @NativeType("hwloc_uint64_t *") LongBuffer value) {
        if (CHECKS) {
            check(value, 1);
        }
        return nhwloc_memattr_get_value(topology, attribute, target_node.address(), memAddressSafe(initiator), flags, memAddress(value));
    }

    // --- [ hwloc_memattr_get_best_target ] ---

    public static int nhwloc_memattr_get_best_target(long topology, int attribute, long initiator, long flags, long best_target, long value) {
        long __functionAddress = Functions.memattr_get_best_target;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNPPI(topology, attribute, initiator, flags, best_target, value, __functionAddress);
    }

    public static int hwloc_memattr_get_best_target(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("struct hwloc_location *") @Nullable hwloc_location initiator, @NativeType("unsigned long") long flags, @NativeType("hwloc_obj_t *") PointerBuffer best_target, @NativeType("hwloc_uint64_t *") @Nullable LongBuffer value) {
        if (CHECKS) {
            check(best_target, 1);
            checkSafe(value, 1);
        }
        return nhwloc_memattr_get_best_target(topology, attribute, memAddressSafe(initiator), flags, memAddress(best_target), memAddressSafe(value));
    }

    // --- [ hwloc_memattr_get_best_initiator ] ---

    public static int nhwloc_memattr_get_best_initiator(long topology, int attribute, long target_node, long flags, long best_initiator, long value) {
        long __functionAddress = Functions.memattr_get_best_initiator;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNPPI(topology, attribute, target_node, flags, best_initiator, value, __functionAddress);
    }

    public static int hwloc_memattr_get_best_initiator(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("hwloc_obj_t") hwloc_obj target_node, @NativeType("unsigned long") long flags, @NativeType("struct hwloc_location *") hwloc_location.Buffer best_initiator, @NativeType("hwloc_uint64_t *") @Nullable LongBuffer value) {
        if (CHECKS) {
            check(best_initiator, 1);
            checkSafe(value, 1);
        }
        return nhwloc_memattr_get_best_initiator(topology, attribute, target_node.address(), flags, best_initiator.address(), memAddressSafe(value));
    }

    // --- [ hwloc_memattr_get_targets ] ---

    public static int nhwloc_memattr_get_targets(long topology, int attribute, long initiator, long flags, long nr, long targets, long values) {
        long __functionAddress = Functions.memattr_get_targets;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNPPPI(topology, attribute, initiator, flags, nr, targets, values, __functionAddress);
    }

    public static int hwloc_memattr_get_targets(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("struct hwloc_location *") @Nullable hwloc_location initiator, @NativeType("unsigned long") long flags, @NativeType("unsigned int *") IntBuffer nr, @NativeType("hwloc_obj_t *") PointerBuffer targets, @NativeType("hwloc_uint64_t *") @Nullable LongBuffer values) {
        if (CHECKS) {
            check(nr, 1);
            check(targets, nr.get(nr.position()));
            checkSafe(values, nr.get(nr.position()));
        }
        return nhwloc_memattr_get_targets(topology, attribute, memAddressSafe(initiator), flags, memAddress(nr), memAddress(targets), memAddressSafe(values));
    }

    // --- [ hwloc_memattr_get_initiators ] ---

    public static int nhwloc_memattr_get_initiators(long topology, int attribute, long target_node, long flags, long nr, long initiators, long values) {
        long __functionAddress = Functions.memattr_get_initiators;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNPPPI(topology, attribute, target_node, flags, nr, initiators, values, __functionAddress);
    }

    public static int hwloc_memattr_get_initiators(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("hwloc_obj_t") hwloc_obj target_node, @NativeType("unsigned long") long flags, @NativeType("unsigned int *") IntBuffer nr, @NativeType("struct hwloc_location *") hwloc_location.Buffer initiators, @NativeType("hwloc_uint64_t *") @Nullable LongBuffer values) {
        if (CHECKS) {
            check(nr, 1);
            check(initiators, nr.get(nr.position()));
            checkSafe(values, nr.get(nr.position()));
        }
        return nhwloc_memattr_get_initiators(topology, attribute, target_node.address(), flags, memAddress(nr), initiators.address(), memAddressSafe(values));
    }

    // --- [ hwloc_memattr_get_name ] ---

    public static int nhwloc_memattr_get_name(long topology, int attribute, long name) {
        long __functionAddress = Functions.memattr_get_name;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, attribute, name, __functionAddress);
    }

    public static int hwloc_memattr_get_name(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("char const **") PointerBuffer name) {
        if (CHECKS) {
            check(name, 1);
        }
        return nhwloc_memattr_get_name(topology, attribute, memAddress(name));
    }

    // --- [ hwloc_memattr_get_flags ] ---

    public static int nhwloc_memattr_get_flags(long topology, int attribute, long flags) {
        long __functionAddress = Functions.memattr_get_flags;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, attribute, flags, __functionAddress);
    }

    public static int hwloc_memattr_get_flags(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("unsigned long *") CLongBuffer flags) {
        if (CHECKS) {
            check(flags, 1);
        }
        return nhwloc_memattr_get_flags(topology, attribute, memAddress(flags));
    }

    // --- [ hwloc_memattr_register ] ---

    public static int nhwloc_memattr_register(long topology, long name, long flags, long id) {
        long __functionAddress = Functions.memattr_register;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNPI(topology, name, flags, id, __functionAddress);
    }

    public static int hwloc_memattr_register(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned long") long flags, @NativeType("hwloc_memattr_id_t *") IntBuffer id) {
        if (CHECKS) {
            checkNT1(name);
            check(id, 1);
        }
        return nhwloc_memattr_register(topology, memAddress(name), flags, memAddress(id));
    }

    public static int hwloc_memattr_register(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence name, @NativeType("unsigned long") long flags, @NativeType("hwloc_memattr_id_t *") IntBuffer id) {
        if (CHECKS) {
            check(id, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nhwloc_memattr_register(topology, nameEncoded, flags, memAddress(id));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_memattr_set_value ] ---

    public static int nhwloc_memattr_set_value(long topology, int attribute, long target_node, long initiator, long flags, long value) {
        long __functionAddress = Functions.memattr_set_value;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNJI(topology, attribute, target_node, initiator, flags, value, __functionAddress);
    }

    public static int hwloc_memattr_set_value(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_memattr_id_t") int attribute, @NativeType("hwloc_obj_t") hwloc_obj target_node, @NativeType("struct hwloc_location *") @Nullable hwloc_location initiator, @NativeType("unsigned long") long flags, @NativeType("hwloc_uint64_t") long value) {
        return nhwloc_memattr_set_value(topology, attribute, target_node.address(), memAddressSafe(initiator), flags, value);
    }

    // --- [ hwloc_cpukinds_get_nr ] ---

    public static int hwloc_cpukinds_get_nr(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.cpukinds_get_nr;
        if (CHECKS) {
            check(topology);
        }
        return invokePNI(topology, flags, __functionAddress);
    }

    // --- [ hwloc_cpukinds_get_by_cpuset ] ---

    public static int hwloc_cpukinds_get_by_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_bitmap_t") long cpuset, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.cpukinds_get_by_cpuset;
        if (CHECKS) {
            check(topology);
            check(cpuset);
        }
        return invokePPNI(topology, cpuset, flags, __functionAddress);
    }

    // --- [ hwloc_cpukinds_get_info ] ---

    public static int nhwloc_cpukinds_get_info(long topology, int kind_index, long cpuset, long efficiency, long infosp, long flags) {
        long __functionAddress = Functions.cpukinds_get_info;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPPNI(topology, kind_index, cpuset, efficiency, infosp, flags, __functionAddress);
    }

    public static int hwloc_cpukinds_get_info(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned int") int kind_index, @NativeType("hwloc_bitmap_t") long cpuset, @NativeType("int *") @Nullable IntBuffer efficiency, @NativeType("struct hwloc_infos_s **") PointerBuffer infosp, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            checkSafe(efficiency, 1);
            check(infosp, 1);
        }
        return nhwloc_cpukinds_get_info(topology, kind_index, cpuset, memAddressSafe(efficiency), memAddress(infosp), flags);
    }

    // --- [ hwloc_cpukinds_register ] ---

    public static int nhwloc_cpukinds_register(long topology, long cpuset, int forced_efficiency, long infos, long flags) {
        long __functionAddress = Functions.cpukinds_register;
        if (CHECKS) {
            check(topology);
            check(cpuset);
        }
        return invokePPPNI(topology, cpuset, forced_efficiency, infos, flags, __functionAddress);
    }

    public static int hwloc_cpukinds_register(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_bitmap_t") long cpuset, int forced_efficiency, @NativeType("struct hwloc_infos_s *") @Nullable hwloc_infos_s infos, @NativeType("unsigned long") long flags) {
        return nhwloc_cpukinds_register(topology, cpuset, forced_efficiency, memAddressSafe(infos), flags);
    }

    // --- [ hwloc_topology_export_xml ] ---

    public static int nhwloc_topology_export_xml(long topology, long xmlpath, long flags) {
        long __functionAddress = Functions.topology_export_xml;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNI(topology, xmlpath, flags, __functionAddress);
    }

    public static int hwloc_topology_export_xml(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") ByteBuffer xmlpath, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            checkNT1(xmlpath);
        }
        return nhwloc_topology_export_xml(topology, memAddress(xmlpath), flags);
    }

    public static int hwloc_topology_export_xml(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence xmlpath, @NativeType("unsigned long") long flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(xmlpath, true);
            long xmlpathEncoded = stack.getPointerAddress();
            return nhwloc_topology_export_xml(topology, xmlpathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_export_xmlbuffer ] ---

    public static int nhwloc_topology_export_xmlbuffer(long topology, long xmlbuffer, long buflen, long flags) {
        long __functionAddress = Functions.topology_export_xmlbuffer;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNI(topology, xmlbuffer, buflen, flags, __functionAddress);
    }

    public static int hwloc_topology_export_xmlbuffer(@NativeType("hwloc_topology_t") long topology, @NativeType("char **") PointerBuffer xmlbuffer, @NativeType("int *") IntBuffer buflen, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(xmlbuffer, 1);
            check(buflen, 1);
        }
        return nhwloc_topology_export_xmlbuffer(topology, memAddress(xmlbuffer), memAddress(buflen), flags);
    }

    // --- [ hwloc_free_xmlbuffer ] ---

    public static void nhwloc_free_xmlbuffer(long topology, long xmlbuffer) {
        long __functionAddress = Functions.free_xmlbuffer;
        if (CHECKS) {
            check(topology);
        }
        invokePPV(topology, xmlbuffer, __functionAddress);
    }

    public static void hwloc_free_xmlbuffer(@NativeType("hwloc_topology_t") long topology, @NativeType("char *") ByteBuffer xmlbuffer) {
        nhwloc_free_xmlbuffer(topology, memAddress(xmlbuffer));
    }

    // --- [ hwloc_topology_set_userdata_export_callback ] ---

    public static void nhwloc_topology_set_userdata_export_callback(long topology, long export_cb) {
        long __functionAddress = Functions.topology_set_userdata_export_callback;
        if (CHECKS) {
            check(topology);
        }
        invokePPV(topology, export_cb, __functionAddress);
    }

    public static void hwloc_topology_set_userdata_export_callback(@NativeType("hwloc_topology_t") long topology, @NativeType("void (*) (void *, hwloc_topology_t, hwloc_obj_t)") topology_set_userdata_export_callbackI export_cb) {
        nhwloc_topology_set_userdata_export_callback(topology, export_cb.address());
    }

    // --- [ hwloc_export_obj_userdata ] ---

    public static int nhwloc_export_obj_userdata(long reserved, long topology, long obj, long name, long buffer, long length) {
        long __functionAddress = Functions.export_obj_userdata;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPPPPI(reserved, topology, obj, name, buffer, length, __functionAddress);
    }

    public static int hwloc_export_obj_userdata(@NativeType("void *") long reserved, @NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") ByteBuffer name, @NativeType("void const *") ByteBuffer buffer) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nhwloc_export_obj_userdata(reserved, topology, obj.address(), memAddress(name), memAddress(buffer), buffer.remaining());
    }

    public static int hwloc_export_obj_userdata(@NativeType("void *") long reserved, @NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") CharSequence name, @NativeType("void const *") ByteBuffer buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nhwloc_export_obj_userdata(reserved, topology, obj.address(), nameEncoded, memAddress(buffer), buffer.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_export_obj_userdata_base64 ] ---

    public static int nhwloc_export_obj_userdata_base64(long reserved, long topology, long obj, long name, long buffer, long length) {
        long __functionAddress = Functions.export_obj_userdata_base64;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPPPPI(reserved, topology, obj, name, buffer, length, __functionAddress);
    }

    public static int hwloc_export_obj_userdata_base64(@NativeType("void *") long reserved, @NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") ByteBuffer name, @NativeType("void const *") ByteBuffer buffer) {
        if (CHECKS) {
            checkNT1(name);
        }
        return nhwloc_export_obj_userdata_base64(reserved, topology, obj.address(), memAddress(name), memAddress(buffer), buffer.remaining());
    }

    public static int hwloc_export_obj_userdata_base64(@NativeType("void *") long reserved, @NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") CharSequence name, @NativeType("void const *") ByteBuffer buffer) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nhwloc_export_obj_userdata_base64(reserved, topology, obj.address(), nameEncoded, memAddress(buffer), buffer.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_set_userdata_import_callback ] ---

    public static void nhwloc_topology_set_userdata_import_callback(long topology, long import_cb) {
        long __functionAddress = Functions.topology_set_userdata_import_callback;
        if (CHECKS) {
            check(topology);
        }
        invokePPV(topology, import_cb, __functionAddress);
    }

    public static void hwloc_topology_set_userdata_import_callback(@NativeType("hwloc_topology_t") long topology, @NativeType("void (*) (hwloc_topology_t, hwloc_obj_t, char const *, void const *, size_t)") topology_set_userdata_import_callbackI import_cb) {
        nhwloc_topology_set_userdata_import_callback(topology, import_cb.address());
    }

    // --- [ hwloc_topology_export_synthetic ] ---

    public static int nhwloc_topology_export_synthetic(long topology, long buffer, long buflen, long flags) {
        long __functionAddress = Functions.topology_export_synthetic;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNI(topology, buffer, buflen, flags, __functionAddress);
    }

    public static int hwloc_topology_export_synthetic(@NativeType("hwloc_topology_t") long topology, @NativeType("char *") ByteBuffer buffer, @NativeType("unsigned long") long flags) {
        return nhwloc_topology_export_synthetic(topology, memAddress(buffer), buffer.remaining(), flags);
    }

    // --- [ hwloc_distances_get ] ---

    public static int nhwloc_distances_get(long topology, long nr, long distances, long kind, long flags) {
        long __functionAddress = Functions.distances_get;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNNI(topology, nr, distances, kind, flags, __functionAddress);
    }

    public static int hwloc_distances_get(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned int *") IntBuffer nr, @NativeType("struct hwloc_distances_s **") PointerBuffer distances, @NativeType("unsigned long") long kind, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(nr, 1);
            check(distances, nr.get(nr.position()));
        }
        return nhwloc_distances_get(topology, memAddress(nr), memAddress(distances), kind, flags);
    }

    // --- [ hwloc_distances_get_by_depth ] ---

    public static int nhwloc_distances_get_by_depth(long topology, int depth, long nr, long distances, long kind, long flags) {
        long __functionAddress = Functions.distances_get_by_depth;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNNI(topology, depth, nr, distances, kind, flags, __functionAddress);
    }

    public static int hwloc_distances_get_by_depth(@NativeType("hwloc_topology_t") long topology, int depth, @NativeType("unsigned int *") IntBuffer nr, @NativeType("struct hwloc_distances_s **") PointerBuffer distances, @NativeType("unsigned long") long kind, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(nr, 1);
            check(distances, nr.get(nr.position()));
        }
        return nhwloc_distances_get_by_depth(topology, depth, memAddress(nr), memAddress(distances), kind, flags);
    }

    // --- [ hwloc_distances_get_by_type ] ---

    public static int nhwloc_distances_get_by_type(long topology, int type, long nr, long distances, long kind, long flags) {
        long __functionAddress = Functions.distances_get_by_type;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNNI(topology, type, nr, distances, kind, flags, __functionAddress);
    }

    public static int hwloc_distances_get_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @NativeType("unsigned int *") IntBuffer nr, @NativeType("struct hwloc_distances_s **") PointerBuffer distances, @NativeType("unsigned long") long kind, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(nr, 1);
            check(distances, nr.get(nr.position()));
        }
        return nhwloc_distances_get_by_type(topology, type, memAddress(nr), memAddress(distances), kind, flags);
    }

    // --- [ hwloc_distances_get_by_name ] ---

    public static int nhwloc_distances_get_by_name(long topology, long name, long nr, long distances, long flags) {
        long __functionAddress = Functions.distances_get_by_name;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPPNI(topology, name, nr, distances, flags, __functionAddress);
    }

    public static int hwloc_distances_get_by_name(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") ByteBuffer name, @NativeType("unsigned int *") IntBuffer nr, @NativeType("struct hwloc_distances_s **") PointerBuffer distances, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            checkNT1(name);
            check(nr, 1);
            check(distances, nr.get(nr.position()));
        }
        return nhwloc_distances_get_by_name(topology, memAddress(name), memAddress(nr), memAddress(distances), flags);
    }

    public static int hwloc_distances_get_by_name(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence name, @NativeType("unsigned int *") IntBuffer nr, @NativeType("struct hwloc_distances_s **") PointerBuffer distances, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(nr, 1);
            check(distances, nr.get(nr.position()));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(name, true);
            long nameEncoded = stack.getPointerAddress();
            return nhwloc_distances_get_by_name(topology, nameEncoded, memAddress(nr), memAddress(distances), flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_distances_get_name ] ---

    public static long nhwloc_distances_get_name(long topology, long distances) {
        long __functionAddress = Functions.distances_get_name;
        if (CHECKS) {
            check(topology);
        }
        return invokePPP(topology, distances, __functionAddress);
    }

    @NativeType("char const *")
    public static @Nullable String hwloc_distances_get_name(@NativeType("hwloc_topology_t") long topology, @NativeType("struct hwloc_distances_s *") hwloc_distances_s distances) {
        long __result = nhwloc_distances_get_name(topology, distances.address());
        return memASCIISafe(__result);
    }

    // --- [ hwloc_distances_release ] ---

    public static void nhwloc_distances_release(long topology, long distances) {
        long __functionAddress = Functions.distances_release;
        if (CHECKS) {
            check(topology);
        }
        invokePPV(topology, distances, __functionAddress);
    }

    public static void hwloc_distances_release(@NativeType("hwloc_topology_t") long topology, @NativeType("struct hwloc_distances_s *") hwloc_distances_s distances) {
        nhwloc_distances_release(topology, distances.address());
    }

    // --- [ hwloc_distances_transform ] ---

    public static int nhwloc_distances_transform(long topology, long distances, int transform, long transform_attr, long flags) {
        long __functionAddress = Functions.distances_transform;
        if (CHECKS) {
            check(topology);
        }
        return invokePPPNI(topology, distances, transform, transform_attr, flags, __functionAddress);
    }

    public static int hwloc_distances_transform(@NativeType("hwloc_topology_t") long topology, @NativeType("struct hwloc_distances_s *") hwloc_distances_s distances, @NativeType("enum hwloc_distances_transform_e") int transform, @NativeType("void *") long transform_attr, @NativeType("unsigned long") long flags) {
        return nhwloc_distances_transform(topology, distances.address(), transform, transform_attr, flags);
    }

    // --- [ hwloc_distances_add_create ] ---

    public static long nhwloc_distances_add_create(long topology, long name, long kind, long flags) {
        long __functionAddress = Functions.distances_add_create;
        if (CHECKS) {
            check(topology);
        }
        return invokePPNNP(topology, name, kind, flags, __functionAddress);
    }

    @NativeType("hwloc_distances_add_handle_t")
    public static long hwloc_distances_add_create(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") @Nullable ByteBuffer name, @NativeType("unsigned long") long kind, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            checkNT1Safe(name);
        }
        return nhwloc_distances_add_create(topology, memAddressSafe(name), kind, flags);
    }

    @NativeType("hwloc_distances_add_handle_t")
    public static long hwloc_distances_add_create(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") @Nullable CharSequence name, @NativeType("unsigned long") long kind, @NativeType("unsigned long") long flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCIISafe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nhwloc_distances_add_create(topology, nameEncoded, kind, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_distances_add_values ] ---

    public static int nhwloc_distances_add_values(long topology, long handle, int nbobjs, long objs, long values, long flags) {
        long __functionAddress = Functions.distances_add_values;
        if (CHECKS) {
            check(topology);
            check(handle);
        }
        return invokePPPPNI(topology, handle, nbobjs, objs, values, flags, __functionAddress);
    }

    public static int hwloc_distances_add_values(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_distances_add_handle_t") long handle, @NativeType("unsigned int") int nbobjs, @NativeType("hwloc_obj_t *") PointerBuffer objs, @NativeType("hwloc_uint64_t *") LongBuffer values, @NativeType("unsigned long") long flags) {
        if (CHECKS) {
            check(objs, nbobjs);
            check(values, nbobjs * nbobjs);
        }
        return nhwloc_distances_add_values(topology, handle, nbobjs, memAddress(objs), memAddress(values), flags);
    }

    // --- [ hwloc_distances_add_commit ] ---

    public static int hwloc_distances_add_commit(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_distances_add_handle_t") long handle, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.distances_add_commit;
        if (CHECKS) {
            check(topology);
            check(handle);
        }
        return invokePPNI(topology, handle, flags, __functionAddress);
    }

    // --- [ hwloc_distances_remove ] ---

    public static int hwloc_distances_remove(@NativeType("hwloc_topology_t") long topology) {
        long __functionAddress = Functions.distances_remove;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, __functionAddress);
    }

    // --- [ hwloc_distances_remove_by_depth ] ---

    public static int hwloc_distances_remove_by_depth(@NativeType("hwloc_topology_t") long topology, int depth) {
        long __functionAddress = Functions.distances_remove_by_depth;
        if (CHECKS) {
            check(topology);
        }
        return invokePI(topology, depth, __functionAddress);
    }

    // --- [ hwloc_distances_release_remove ] ---

    public static int nhwloc_distances_release_remove(long topology, long distances) {
        long __functionAddress = Functions.distances_release_remove;
        if (CHECKS) {
            check(topology);
        }
        return invokePPI(topology, distances, __functionAddress);
    }

    public static int hwloc_distances_release_remove(@NativeType("hwloc_topology_t") long topology, @NativeType("struct hwloc_distances_s *") hwloc_distances_s distances) {
        return nhwloc_distances_release_remove(topology, distances.address());
    }

    // --- [ hwloc_topology_diff_build ] ---

    public static int nhwloc_topology_diff_build(long topology, long newtopology, long flags, long diff) {
        long __functionAddress = Functions.topology_diff_build;
        if (CHECKS) {
            check(topology);
            check(newtopology);
        }
        return invokePPNPI(topology, newtopology, flags, diff, __functionAddress);
    }

    public static int hwloc_topology_diff_build(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_topology_t") long newtopology, @NativeType("unsigned long") long flags, @NativeType("hwloc_topology_diff_t *") PointerBuffer diff) {
        if (CHECKS) {
            check(diff, 1);
        }
        return nhwloc_topology_diff_build(topology, newtopology, flags, memAddress(diff));
    }

    // --- [ hwloc_topology_diff_apply ] ---

    public static int hwloc_topology_diff_apply(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_topology_diff_t") long diff, @NativeType("unsigned long") long flags) {
        long __functionAddress = Functions.topology_diff_apply;
        if (CHECKS) {
            check(topology);
            check(diff);
        }
        return invokePPNI(topology, diff, flags, __functionAddress);
    }

    // --- [ hwloc_topology_diff_destroy ] ---

    public static int hwloc_topology_diff_destroy(@NativeType("hwloc_topology_diff_t") long diff) {
        long __functionAddress = Functions.topology_diff_destroy;
        if (CHECKS) {
            check(diff);
        }
        return invokePI(diff, __functionAddress);
    }

    // --- [ hwloc_topology_diff_load_xml ] ---

    public static int nhwloc_topology_diff_load_xml(long xmlpath, long diff, long refname) {
        long __functionAddress = Functions.topology_diff_load_xml;
        return invokePPPI(xmlpath, diff, refname, __functionAddress);
    }

    public static int hwloc_topology_diff_load_xml(@NativeType("char const *") ByteBuffer xmlpath, @NativeType("hwloc_topology_diff_t *") PointerBuffer diff, @NativeType("char **") PointerBuffer refname) {
        if (CHECKS) {
            checkNT1(xmlpath);
            check(diff, 1);
            check(refname, 1);
        }
        return nhwloc_topology_diff_load_xml(memAddress(xmlpath), memAddress(diff), memAddress(refname));
    }

    public static int hwloc_topology_diff_load_xml(@NativeType("char const *") CharSequence xmlpath, @NativeType("hwloc_topology_diff_t *") PointerBuffer diff, @NativeType("char **") PointerBuffer refname) {
        if (CHECKS) {
            check(diff, 1);
            check(refname, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(xmlpath, true);
            long xmlpathEncoded = stack.getPointerAddress();
            return nhwloc_topology_diff_load_xml(xmlpathEncoded, memAddress(diff), memAddress(refname));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_diff_export_xml ] ---

    public static int nhwloc_topology_diff_export_xml(long diff, long refname, long xmlpath) {
        long __functionAddress = Functions.topology_diff_export_xml;
        if (CHECKS) {
            check(diff);
        }
        return invokePPPI(diff, refname, xmlpath, __functionAddress);
    }

    public static int hwloc_topology_diff_export_xml(@NativeType("hwloc_topology_diff_t") long diff, @NativeType("char const *") ByteBuffer refname, @NativeType("char const *") ByteBuffer xmlpath) {
        if (CHECKS) {
            checkNT1(refname);
            checkNT1(xmlpath);
        }
        return nhwloc_topology_diff_export_xml(diff, memAddress(refname), memAddress(xmlpath));
    }

    public static int hwloc_topology_diff_export_xml(@NativeType("hwloc_topology_diff_t") long diff, @NativeType("char const *") CharSequence refname, @NativeType("char const *") CharSequence xmlpath) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(refname, true);
            long refnameEncoded = stack.getPointerAddress();
            stack.nUTF8(xmlpath, true);
            long xmlpathEncoded = stack.getPointerAddress();
            return nhwloc_topology_diff_export_xml(diff, refnameEncoded, xmlpathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ hwloc_topology_diff_load_xmlbuffer ] ---

    public static int nhwloc_topology_diff_load_xmlbuffer(long xmlbuffer, int buflen, long diff, long refname) {
        long __functionAddress = Functions.topology_diff_load_xmlbuffer;
        return invokePPPI(xmlbuffer, buflen, diff, refname, __functionAddress);
    }

    public static int hwloc_topology_diff_load_xmlbuffer(@NativeType("char const *") ByteBuffer xmlbuffer, @NativeType("hwloc_topology_diff_t *") PointerBuffer diff, @NativeType("char **") PointerBuffer refname) {
        if (CHECKS) {
            check(diff, 1);
            check(refname, 1);
        }
        return nhwloc_topology_diff_load_xmlbuffer(memAddress(xmlbuffer), xmlbuffer.remaining(), memAddress(diff), memAddress(refname));
    }

    // --- [ hwloc_topology_diff_export_xmlbuffer ] ---

    public static int nhwloc_topology_diff_export_xmlbuffer(long diff, long refname, long xmlbuffer, long buflen) {
        long __functionAddress = Functions.topology_diff_export_xmlbuffer;
        if (CHECKS) {
            check(diff);
        }
        return invokePPPPI(diff, refname, xmlbuffer, buflen, __functionAddress);
    }

    public static int hwloc_topology_diff_export_xmlbuffer(@NativeType("hwloc_topology_diff_t") long diff, @NativeType("char const *") ByteBuffer refname, @NativeType("char **") PointerBuffer xmlbuffer, @NativeType("int *") IntBuffer buflen) {
        if (CHECKS) {
            checkNT1(refname);
            check(xmlbuffer, 1);
            check(buflen, 1);
        }
        return nhwloc_topology_diff_export_xmlbuffer(diff, memAddress(refname), memAddress(xmlbuffer), memAddress(buflen));
    }

    public static int hwloc_topology_diff_export_xmlbuffer(@NativeType("hwloc_topology_diff_t") long diff, @NativeType("char const *") CharSequence refname, @NativeType("char **") PointerBuffer xmlbuffer, @NativeType("int *") IntBuffer buflen) {
        if (CHECKS) {
            check(xmlbuffer, 1);
            check(buflen, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(refname, true);
            long refnameEncoded = stack.getPointerAddress();
            return nhwloc_topology_diff_export_xmlbuffer(diff, refnameEncoded, memAddress(xmlbuffer), memAddress(buflen));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int hwloc_get_type_or_below_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);

        if (depth != HWLOC_TYPE_DEPTH_UNKNOWN) {
            return depth;
        }

        /* find the lowest existing level with type order <= */
        for (depth = 0; ; depth++) {
            if (hwloc_compare_types(hwloc_get_depth_type(topology, depth), type) > 0) {
                return depth - 1;
            }
        }

        /* Shouldn't ever happen, as there is always a PU level with higher order and known depth.  */
        /* abort(); */
    }

    public static int hwloc_get_type_or_above_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);

        if (depth != HWLOC_TYPE_DEPTH_UNKNOWN) {
            return depth;
        }

        /* find the lowest existing level with type order <= */
        for (depth = 0; ; depth++) {
            if (hwloc_compare_types(hwloc_get_depth_type(topology, depth), type) > 0) {
                return depth - 1;
            }
        }

        /* Shouldn't ever happen, as there is always a PU level with higher order and known depth.  */
        /* abort(); */
    }

    public static int hwloc_get_nbobjs_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN) {
            return 0;
        }
        if (depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return -1; /* FIXME: agregate nbobjs from different levels? */
        }
        return hwloc_get_nbobjs_by_depth(topology, depth);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_root_obj(@NativeType("hwloc_topology_t") long topology) {
        return hwloc_get_obj_by_depth (topology, 0, 0);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @NativeType("unsigned") int idx) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN) {
            return null;
        }
        if (depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_obj_by_depth(topology, depth, idx);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_by_depth(@NativeType("hwloc_topology_t") long topology, int depth, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        if (prev == null) {
            return hwloc_get_obj_by_depth(topology, depth, 0);
        }
        if (prev.depth() != depth) {
            return null;
        }
        return prev.next_cousin();
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_next_obj_by_depth(topology, depth, prev);
    }

    @Nullable
    @NativeType("char const *")
    public static String hwloc_obj_get_info_by_name(@NativeType("hwloc_obj_t") hwloc_obj obj, String name) {
        return hwloc_get_info_by_name(obj.infos(), name);
    }

    @Nullable
    @NativeType("char const *")
    public static String hwloc_get_info_by_name(@NativeType("struct hwloc_infos_s") hwloc_infos_s infos, String name) {
        if (infos.count() == 0) {
            return null;
        }
        hwloc_info_s.Buffer array = Objects.requireNonNull(infos.array());
        for (hwloc_info_s info : array) {
            if (info.nameString().equals(name)) {
                return info.valueString();
            }
        }
        return null;
    }

    public static int hwloc_obj_add_info(@NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        return hwloc_modify_infos(obj.infos(), HWLOC_MODIFY_INFOS_OP_ADD, name, value);
    }

    public static int hwloc_obj_add_info(@NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        return hwloc_modify_infos(obj.infos(), HWLOC_MODIFY_INFOS_OP_ADD, name, value);
    }

    @Nullable
    public static ByteBuffer hwloc_alloc_membind_policy(@NativeType("hwloc_topology_t") long topology, @NativeType("size_t") long len, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_membind_policy_t") int policy, int flags) {
        ByteBuffer p = hwloc_alloc_membind(topology, len, set, policy, flags);
        if (p != null) {
            return p;
        }

        if (hwloc_set_membind(topology, set, policy, flags) < 0)
            /* hwloc_set_membind() takes care of ignoring errors if non-STRICT */ {
            return null;
        }

        p = hwloc_alloc(topology, len);
        if (p != null && policy != HWLOC_MEMBIND_FIRSTTOUCH)
            /* Enforce the binding by touching the data */ {
            memSet(p, 0);
        }
        return p;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_first_largest_obj_inside_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set) {
        hwloc_obj obj = Objects.requireNonNull(hwloc_get_root_obj(topology));
        if (!hwloc_bitmap_intersects(obj.cpuset(), set)) {
            return null;
        }
        while (!hwloc_bitmap_isincluded(obj.cpuset(), set)) {
            /* while the object intersects without being included, look at its children */
            hwloc_obj child = obj.first_child();
            while (child != null) {
                if (hwloc_bitmap_intersects(child.cpuset(), set)) {
                    break;
                }
                child = child.next_sibling();
            }
            if (child == null)
                /* no child intersects, return their father */ {
                return obj;
            }
            /* found one intersecting child, look at its children */
            obj = child;
        }
        /* obj is included, return it */
        return obj;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_inside_cpuset_by_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, int depth, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        hwloc_obj next = hwloc_get_next_obj_by_depth(topology, depth, prev);
        while (next != null && (hwloc_bitmap_iszero(next.cpuset()) || !hwloc_bitmap_isincluded(next.cpuset(), set))) {
            next = next.next_cousin();
        }
        return next;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_inside_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_next_obj_inside_cpuset_by_depth(topology, set, depth, prev);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_inside_cpuset_by_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, int depth, @NativeType("unsigned") int idx) {
        hwloc_obj obj = hwloc_get_obj_by_depth(topology, depth, 0);

        int count = 0;
        while (obj != null) {
            if (!hwloc_bitmap_iszero(obj.cpuset()) && hwloc_bitmap_isincluded(obj.cpuset(), set)) {
                if (count == idx) {
                    return obj;
                }
                count++;
            }
            obj = obj.next_cousin();
        }
        return null;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_inside_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type, @NativeType("unsigned") int idx) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_obj_inside_cpuset_by_depth(topology, set, depth, idx);
    }

    @NativeType("unsigned")
    public static int hwloc_get_nbobjs_inside_cpuset_by_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, int depth) {
        hwloc_obj obj = hwloc_get_obj_by_depth(topology, depth, 0);

        int count = 0;
        while (obj != null) {
            if (!hwloc_bitmap_iszero(obj.cpuset()) && hwloc_bitmap_isincluded(obj.cpuset(), set)) {
                count++;
            }
            obj = obj.next_cousin();
        }
        return count;
    }

    public static int hwloc_get_nbobjs_inside_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN) {
            return 0;
        }
        if (depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return -1; /* FIXME: agregate nbobjs from different levels? */
        }
        return hwloc_get_nbobjs_inside_cpuset_by_depth(topology, set, depth);
    }

    public static int hwloc_get_obj_index_inside_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_t") hwloc_obj obj) {
        if (!hwloc_bitmap_isincluded(obj.cpuset(), set)) {
            return -1;
        }
        /* count how many objects are inside the cpuset on the way from us to the beginning of the level */
        int idx = 0;
        while ((obj = obj.prev_cousin()) != null) {
            if (!hwloc_bitmap_iszero(obj.cpuset()) && hwloc_bitmap_isincluded(obj.cpuset(), set)) {
                idx++;
            }
        }
        return idx;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_child_covering_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_t") hwloc_obj parent) {
        if (hwloc_bitmap_iszero(set)) {
            return null;
        }
        hwloc_obj child = parent.first_child();
        while (child != null) {
            if (child.cpuset() != NULL && hwloc_bitmap_isincluded(set, child.cpuset())) {
                return child;
            }
            child = child.next_sibling();
        }
        return null;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_covering_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set) {
        if (hwloc_bitmap_iszero(set)) {
            return null;
        }
        hwloc_obj current = Objects.requireNonNull(hwloc_get_root_obj(topology));
        if (!hwloc_bitmap_isincluded(set, current.cpuset())) {
            return null;
        }
        while (true) {
            hwloc_obj child = hwloc_get_child_covering_cpuset(topology, set, current);
            if (child == null) {
                return current;
            }
            current = child;
        }
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_covering_cpuset_by_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, int depth, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        hwloc_obj next = hwloc_get_next_obj_by_depth(topology, depth, prev);
        while (next != null && !hwloc_bitmap_intersects(set, next.cpuset())) {
            next = next.next_cousin();
        }
        return next;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_covering_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_next_obj_covering_cpuset_by_depth(topology, set, depth, prev);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_ancestor_obj_by_depth(@NativeType("hwloc_topology_t") long topology, int depth, @NativeType("hwloc_obj_t") hwloc_obj obj) {
        hwloc_obj ancestor = obj;
        if (obj.depth() < depth) {
            return null;
        }
        while (ancestor != null && ancestor.depth() > depth) {
            ancestor = ancestor.parent();
        }
        return ancestor;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_ancestor_obj_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @NativeType("hwloc_obj_t") hwloc_obj obj) {
        hwloc_obj ancestor = obj.parent();
        while (ancestor != null && ancestor.type() != type) {
            ancestor = ancestor.parent();
        }
        return ancestor;
    }

    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_common_ancestor_obj(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj1, @NativeType("hwloc_obj_t") hwloc_obj obj2) {
        /* the loop isn't so easy since intermediate ancestors may have
         * different depth, causing us to alternate between using obj1->parent
         * and obj2->parent. Also, even if at some point we find ancestors of
         * of the same depth, their ancestors may have different depth again.
         */
        while (obj1.address() != obj2.address()) {
            while (obj1.depth() > obj2.depth()) {
                obj1 = Objects.requireNonNull(obj1.parent());
            }
            while (obj2.depth() > obj1.depth()) {
                obj2 = Objects.requireNonNull(obj2.parent());
            }
            if (obj1.address() != obj2.address() && obj1.depth() == obj2.depth()) {
                obj1 = Objects.requireNonNull(obj1.parent());
                obj2 = Objects.requireNonNull(obj2.parent());
            }
        }
        return obj1;
    }

    @NativeType("int")
    public static boolean hwloc_obj_is_in_subtree(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("hwloc_obj_t") hwloc_obj subtree_root) {
        long sub_bitmap   = obj.cpuset();
        long super_bitmap = subtree_root.cpuset();
        return sub_bitmap != NULL && super_bitmap != NULL && hwloc_bitmap_isincluded(sub_bitmap, super_bitmap);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_child(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj parent, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        hwloc_obj obj;

        int state = 0;
        if (prev != null) {
            int type = prev.type();
            if (type == HWLOC_OBJ_MISC) {
                state = 3;
            } else if (hwloc_obj_type_is_io(type)) {
                state = 2;
            } else if (hwloc_obj_type_is_memory(type)) {
                state = 1;
            }
            obj = prev.next_sibling();
        } else {
            obj = parent.first_child();
        }
        if (obj == null && state == 0) {
            obj = parent.memory_first_child();
            state = 1;
        }
        if (obj == null && state == 1) {
            obj = parent.io_first_child();
            state = 2;
        }
        if (obj == null && state == 2) {
            obj = parent.misc_first_child();
            //state = 3;
        }
        return obj;
    }

    public static int hwloc_get_cache_type_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned") int cachelevel, @NativeType("hwloc_obj_cache_type_t") int cachetype) {
        int depth;
        int found = HWLOC_TYPE_DEPTH_UNKNOWN;
        for (depth = 0; ; depth++) {
            hwloc_obj obj = hwloc_get_obj_by_depth(topology, depth, 0);
            if (obj == null) {
                break;
            }
            if (!hwloc_obj_type_is_dcache(obj.type()) || obj.attr().cache().depth() != cachelevel)
                /* doesn't match, try next depth */ {
                continue;
            }
            if (cachetype == -1) {
                if (found != HWLOC_TYPE_DEPTH_UNKNOWN) {
                    /* second match, return MULTIPLE */
                    return HWLOC_TYPE_DEPTH_MULTIPLE;
                }
                /* first match, mark it as found */
                found = depth;
                continue;
            }
            if (obj.attr().cache().type() == cachetype || obj.attr().cache().type() == HWLOC_OBJ_CACHE_UNIFIED)
                /* exact match (either unified is alone, or we match instruction or data), return immediately */ {
                return depth;
            }
        }
        /* went to the bottom, return what we found */
        return found;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_cache_covering_cpuset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set) {
        hwloc_obj current = hwloc_get_obj_covering_cpuset(topology, set);
        while (current != null) {
            if (hwloc_obj_type_is_dcache(current.type())) {
                return current;
            }
            current = current.parent();
        }
        return null;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_shared_cache_covering_obj(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj) {
        if (obj.cpuset() == NULL) {
            return null;
        }
        hwloc_obj current = obj.parent();
        while (current != null) {
            if (!hwloc_bitmap_isequal(current.cpuset(), obj.cpuset()) && hwloc_obj_type_is_dcache(current.type())) {
                return current;
            }
            current = current.parent();
        }
        return null;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_pu_obj_by_os_index(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned") int os_index) {
        hwloc_obj obj = null;
        while ((obj = hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_PU, obj)) != null) {
            if (obj.os_index() == os_index) {
                return obj;
            }
        }
        return null;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_numanode_obj_by_os_index(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned") int os_index) {
        hwloc_obj obj = null;
        while ((obj = hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_NUMANODE, obj)) != null) {
            if (obj.os_index() == os_index) {
                return obj;
            }
        }
        return null;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_below_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type1, @NativeType("unsigned") int idx1, @NativeType("hwloc_obj_type_t") int type2, @NativeType("unsigned") int idx2) {
        hwloc_obj obj = hwloc_get_obj_by_type(topology, type1, idx1);
        if (obj == null) {
            return null;
        }
        return hwloc_get_obj_inside_cpuset_by_type(topology, obj.cpuset(), type2, idx2);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_below_array_by_type(@NativeType("hwloc_topology_t") long topology, int nr, @NativeType("hwloc_obj_type_t *") IntBuffer typev, @NativeType("unsigned *") IntBuffer idxv) {
        hwloc_obj obj = hwloc_get_root_obj(topology);
        for (int i = 0; i < nr; i++) {
            if (obj == null) {
                return null;
            }
            obj = hwloc_get_obj_inside_cpuset_by_type(topology, obj.cpuset(), typev.get(typev.position() + i), idxv.get(idxv.position() + i));
        }
        return obj;
    }

    public static int hwloc_distrib(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t *") PointerBuffer roots, @NativeType("unsigned") int n_roots, @NativeType("hwloc_cpuset_t *") PointerBuffer set, @NativeType("unsigned") int n, int until, @NativeType("unsigned long") long flags) {
        if ((flags & ~HWLOC_DISTRIB_FLAG_REVERSE) != 0) {
            return -1;
        }

        int tot_weight = 0;
        for (int i = 0; i < n_roots; i++) {
            tot_weight += hwloc_bitmap_weight(hwloc_obj.create(roots.get(roots.position() + i)).cpuset());
        }

        PointerBuffer cpusetp = set.slice();
        for (int i = 0, given = 0, givenweight = 0; i < n_roots; i++) {
            hwloc_obj root   = hwloc_obj.create(roots.get(roots.position() + ((flags & HWLOC_DISTRIB_FLAG_REVERSE) != 0 ? n_roots - 1 - i : i)));
            long      cpuset = root.cpuset();
            while (!hwloc_obj_type_is_normal(root.type()))
                /* If memory/io/misc, walk up to normal parent */ {
                root = Objects.requireNonNull(root.parent());
            }
            int weight = hwloc_bitmap_weight(cpuset);
            if (weight == 0) {
                continue;
            }
            /* Give to root a chunk proportional to its weight.
             * If previous chunks got rounded-up, we may get a bit less. */
            int chunk = (((givenweight + weight) * n + tot_weight - 1) / tot_weight)
                        - ((givenweight * n + tot_weight - 1) / tot_weight);
            if (root.arity() == 0 || chunk <= 1 || root.depth() >= until) {
                /* We can't split any more, put everything there.  */
                if (chunk != 0) {
                    /* Fill cpusets with ours */
                    int j;
                    for (j = 0; j < chunk; j++) {
                        cpusetp.put(cpusetp.position() + j, hwloc_bitmap_dup(cpuset));
                    }
                } else {
                    /* We got no chunk, just merge our cpuset to a previous one
                     * (the first chunk cannot be empty)
                     * so that this root doesn't get ignored.
                     */
                    hwloc_bitmap_or(cpusetp.get(cpusetp.position() - 1), cpusetp.get(cpusetp.position() - 1), cpuset);
                }
            } else {
                /* Still more to distribute, recurse into children */
                hwloc_distrib(topology, root.children(), root.arity(), cpusetp, chunk, until, flags);
            }
            cpusetp.position(cpusetp.position() + chunk);
            given += chunk;
            givenweight += weight;
        }

        return 0;
    }

    public static int hwloc_cpuset_to_nodeset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long _cpuset, @NativeType("hwloc_nodeset_t") long nodeset) {
        int depth = hwloc_get_type_depth(topology, HWLOC_OBJ_NUMANODE);

        hwloc_bitmap_zero(nodeset);

        hwloc_obj obj = null;
        while ((obj = hwloc_get_next_obj_covering_cpuset_by_depth(topology, _cpuset, depth, obj)) != null) {
            if (hwloc_bitmap_set(nodeset, obj.os_index()) < 0) {
                return -1;
            }
        }
        return 0;
    }

    public static int hwloc_cpuset_from_nodeset(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long _cpuset, @NativeType("hwloc_nodeset_t") long nodeset) {
        int depth = hwloc_get_type_depth(topology, HWLOC_OBJ_NUMANODE);

        hwloc_bitmap_zero(_cpuset);

        hwloc_obj obj = null;
        while ((obj = hwloc_get_next_obj_by_depth(topology, depth, obj)) != null) {
            if (hwloc_bitmap_isset(nodeset, obj.os_index()))
                /* no need to check obj->cpuset because objects in levels always have a cpuset */ {
                if (hwloc_bitmap_or(_cpuset, _cpuset, obj.cpuset()) < 0) {
                    return -1;
                }
            }
        }
        return 0;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_non_io_ancestor_obj(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj ioobj) {
        hwloc_obj obj = ioobj;
        while (obj != null && obj.cpuset() == NULL) {
            obj = obj.parent();
        }
        return obj;
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_pcidev(@NativeType("hwloc_topology_t") long topology, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        return hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_PCI_DEVICE, prev);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_pcidev_by_busid(@NativeType("hwloc_topology_t") long topology, @NativeType("unsigned") int domain, @NativeType("unsigned") int bus, @NativeType("unsigned") int dev, @NativeType("unsigned") int func) {
        hwloc_obj obj = null;
        while ((obj = hwloc_get_next_pcidev(topology, obj)) != null) {
            hwloc_pcidev_attr_s pcidev = obj.attr().pcidev();
            if (pcidev.domain() == domain
                && pcidev.bus() == bus
                && pcidev.dev() == dev
                && pcidev.func() == func) {
                return obj;
            }
        }
        return null;
    }

    private static final Pattern BUSID_PATTERN = Pattern.compile("^(?:(\\p{XDigit}+):)?(\\p{XDigit}+):(\\p{XDigit}+)\\.(\\p{XDigit}+)$");

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_pcidev_by_busidstring(@NativeType("hwloc_topology_t") long topology, @NativeType("char const *") CharSequence busid) {
        Matcher m = BUSID_PATTERN.matcher(busid);
        if (!m.find()) {
            return null;
        }

        String domainGroup = m.group(1);

        int domain = domainGroup == null ? 0 /* default */ : Integer.parseInt(domainGroup, 16);
        int bus    = Integer.parseInt(m.group(2), 16);
        int dev    = Integer.parseInt(m.group(3), 16);
        int func   = Integer.parseInt(m.group(4), 16);

        return hwloc_get_pcidev_by_busid(topology, domain, bus, dev, func);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_osdev(@NativeType("hwloc_topology_t") long topology, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        return hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_OS_DEVICE, prev);
    }

    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_bridge(@NativeType("hwloc_topology_t") long topology, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        return hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_BRIDGE, prev);
    }

    @NativeType("int")
    public static boolean hwloc_bridge_covers_pcibus(@NativeType("hwloc_obj_t") hwloc_obj bridge, @NativeType("unsigned") int domain, @NativeType("unsigned") int bus) {
        if (bridge.type() != HWLOC_OBJ_BRIDGE) {
            return false;
        }

        hwloc_bridge_attr_s attr = bridge.attr().bridge();
        return attr.downstream_type() == HWLOC_OBJ_BRIDGE_PCI
               && attr.downstream_pci_domain() == domain
               && attr.downstream_pci_secondary_bus() <= bus
               && attr.downstream_pci_secondary_bus() >= bus;
    }

    public static int hwloc_distances_obj_index(@NativeType("struct hwloc_distances_s *") hwloc_distances_s distances, @NativeType("hwloc_obj_t") hwloc_obj obj) {
        PointerBuffer objs = distances.objs();
        for (int i = 0; i < objs.remaining(); i++) {
            if (objs.get(i) == obj.address()) {
                return i;
            }
        }
        return -1;
    }

    public static int hwloc_distances_obj_pair_values(@NativeType("struct hwloc_distances_s *") hwloc_distances_s distances, @NativeType("hwloc_obj_t") hwloc_obj obj1, @NativeType("hwloc_obj_t") hwloc_obj obj2, LongBuffer value1to2, LongBuffer value2to1) {
        int i1 = hwloc_distances_obj_index(distances, obj1);
        int i2 = hwloc_distances_obj_index(distances, obj2);
        if (i1 < 0 || i2 < 0) {
            return -1;
        }
        LongBuffer values = distances.values();
        value1to2.put(value1to2.position(), values.get(i1 * distances.nbobjs() + i2));
        value2to1.put(value2to1.position(), values.get(i2 * distances.nbobjs() + i1));
        return 0;
    }

    public static int hwloc_distances_remove_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return 0;
        }
        return hwloc_distances_remove_by_depth(topology, depth);
    }

}