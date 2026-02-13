/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package hwloc.templates

import org.lwjgl.generator.*
import hwloc.*

val hwloc = "HWLoc".nativeClass(Module.HWLOC, prefix = "HWLOC", prefixMethod = "hwloc_", binding = HWLOC_BINDING) {
    javaImport(
        "java.util.Objects",
        "java.util.regex.*"
    )

    // bitmap.h

    hwloc_bitmap_t(
        "bitmap_alloc",

        void()
    )

    hwloc_bitmap_t(
        "bitmap_alloc_full",

        void()
    )

    void(
        "bitmap_free",

        nullable..hwloc_bitmap_t("bitmap")
    )

    hwloc_bitmap_t(
        "bitmap_dup",

        nullable..hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_copy",

        hwloc_bitmap_t("dst"),
        hwloc_const_bitmap_t("src")
    )

    int(
        "bitmap_snprintf",

        nullable..charASCII.p("buf"),
        AutoSize("buf")..size_t("buflen"),
        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_asprintf",

        Check(1)..char.p.p("strp"),
        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_sscanf",

        hwloc_bitmap_t("bitmap"),
        charASCII.const.p("string")
    )

    int(
        "bitmap_list_snprintf",

        nullable..char.p("buf"),
        AutoSize("buf")..size_t("buflen"),
        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_list_asprintf",

        Check(1)..char.p.p("strp"),
        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_list_sscanf",

        hwloc_bitmap_t("bitmap"),
        charASCII.const.p("string")
    )

    int(
        "bitmap_taskset_snprintf",

        nullable..char.p("buf"),
        AutoSize("buf")..size_t("buflen"),
        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_taskset_asprintf",

        Check(1)..char.p.p("strp"),
        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_taskset_sscanf",

        hwloc_bitmap_t("bitmap"),
        charASCII.const.p("string")
    )

    void(
        "bitmap_zero",

        hwloc_bitmap_t("bitmap")
    )

    void(
        "bitmap_fill",

        hwloc_bitmap_t("bitmap")
    )

    int(
        "bitmap_only",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("id")
    )

    int(
        "bitmap_allbut",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("id")
    )

    int(
        "bitmap_from_ulong",

        hwloc_bitmap_t("bitmap"),
        unsigned_long("mask")
    )

    int(
        "bitmap_from_ith_ulong",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("i"),
        unsigned_long("mask")
    )

    int(
        "bitmap_from_ulongs",

        hwloc_bitmap_t("bitmap"),
        AutoSize("masks")..unsigned_int("nr"),
        unsigned_long.const.p("masks")
    )

    int(
        "bitmap_set",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("id")
    )

    int(
        "bitmap_set_range",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("begin"),
        int("end")
    )

    int(
        "bitmap_set_ith_ulong",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("i"),
        unsigned_long("mask")
    )

    int(
        "bitmap_clr",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("id")
    )

    int(
        "bitmap_clr_range",

        hwloc_bitmap_t("bitmap"),
        unsigned_int("begin"),
        int("end")
    )

    int(
        "bitmap_singlify",

        hwloc_bitmap_t("bitmap")
    )

    unsigned_long(
        "bitmap_to_ulong",

        hwloc_const_bitmap_t("bitmap")
    )

    unsigned_long(
        "bitmap_to_ith_ulong",

        hwloc_const_bitmap_t("bitmap"),
        unsigned_int("i")
    )

    int(
        "bitmap_to_ulongs",

        hwloc_const_bitmap_t("bitmap"),
        AutoSize("masks")..unsigned_int("nr"),
        unsigned_long.p("masks")
    )

    int(
        "bitmap_nr_ulongs",

        hwloc_const_bitmap_t("bitmap")
    )

    intb(
        "bitmap_isset",

        hwloc_const_bitmap_t("bitmap"),
        unsigned_int("id")
    )

    intb(
        "bitmap_iszero",

        hwloc_const_bitmap_t("bitmap")
    )

    intb(
        "bitmap_isfull",

        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_first",

        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_next",

        hwloc_const_bitmap_t("bitmap"),
        int("prev")
    )

    int(
        "bitmap_last",

        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_weight",

        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_first_unset",

        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_next_unset",

        hwloc_const_bitmap_t("bitmap"),
        int("prev")
    )

    int(
        "bitmap_last_unset",

        hwloc_const_bitmap_t("bitmap")
    )

    int(
        "bitmap_or",

        hwloc_bitmap_t("res"),
        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    int(
        "bitmap_and",

        hwloc_bitmap_t("res"),
        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    int(
        "bitmap_andnot",

        hwloc_bitmap_t("res"),
        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    int(
        "bitmap_xor",

        hwloc_bitmap_t("res"),
        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    int(
        "bitmap_not",

        hwloc_bitmap_t("res"),
        hwloc_const_bitmap_t("bitmap")
    )

    intb(
        "bitmap_intersects",

        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    intb(
        "bitmap_isincluded",

        hwloc_const_bitmap_t("sub_bitmap"),
        hwloc_const_bitmap_t("super_bitmap")
    )

    intb(
        "bitmap_isequal",

        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    int(
        "bitmap_compare_first",

        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    int(
        "bitmap_compare",

        hwloc_const_bitmap_t("bitmap1"),
        hwloc_const_bitmap_t("bitmap2")
    )

    // hwloc.h

    IntConstant("API_VERSION"..0x00030000)
    IntConstant("COMPONENT_ABI".."8")
    IntConstant("TYPE_UNORDERED".."Integer.MAX_VALUE")
    IntConstant("UNKNOWN_INDEX".."-1")

    EnumConstant(
        "OBJ_TYPE_MIN".enum("0"),
        "OBJ_MACHINE".enum("0"),
        "OBJ_PACKAGE".enum,
        "OBJ_DIE".enum,
        "OBJ_CORE".enum,
        "OBJ_PU".enum,
        "OBJ_L1CACHE".enum,
        "OBJ_L2CACHE".enum,
        "OBJ_L3CACHE".enum,
        "OBJ_L4CACHE".enum,
        "OBJ_L5CACHE".enum,
        "OBJ_L1ICACHE".enum,
        "OBJ_L2ICACHE".enum,
        "OBJ_L3ICACHE".enum,
        "OBJ_GROUP".enum,
        "OBJ_NUMANODE".enum,
        "OBJ_MEMCACHE".enum,
        "OBJ_BRIDGE".enum,
        "OBJ_PCI_DEVICE".enum,
        "OBJ_OS_DEVICE".enum,
        "OBJ_MISC".enum,
        "OBJ_TYPE_MAX".enum
    )

    EnumConstant(
        "OBJ_CACHE_UNIFIED".enum("0"),
        "OBJ_CACHE_DATA".enum,
        "OBJ_CACHE_INSTRUCTION".enum
    )

    EnumConstant(
        "OBJ_BRIDGE_HOST".enum("0"),
        "OBJ_BRIDGE_PCI".enum
    )

    EnumConstantLong(
        "OBJ_OSDEV_STORAGE".enumLong("1L << 0"),
        "OBJ_OSDEV_MEMORY".enumLong("1L << 1"),
        "OBJ_OSDEV_GPU".enumLong("1L << 2"),
        "OBJ_OSDEV_COPROC".enumLong("1L << 3"),
        "OBJ_OSDEV_NETWORK".enumLong("1L << 4"),
        "OBJ_OSDEV_OPENFABRICS".enumLong("1L << 5"),
        "OBJ_OSDEV_DMA".enumLong("1L << 6")
    )

    EnumConstant(
        "TYPE_DEPTH_UNKNOWN".enum("-1"),
        "TYPE_DEPTH_MULTIPLE".enum("-2"),
        "TYPE_DEPTH_NUMANODE".enum("-3"),
        "TYPE_DEPTH_BRIDGE".enum("-4"),
        "TYPE_DEPTH_PCI_DEVICE".enum("-5"),
        "TYPE_DEPTH_OS_DEVICE".enum("-6"),
        "TYPE_DEPTH_MISC".enum("-7"),
        "TYPE_DEPTH_MEMCACHE".enum("-8")
    )

    EnumConstantLong(
        "OBJ_SNPRINTF_FLAG_LONG_NAMES".enumLong("1L<<1"),
        "OBJ_SNPRINTF_FLAG_SHORT_NAMES".enumLong("1L<<2"),
        "OBJ_SNPRINTF_FLAG_MORE_ATTRS".enumLong("1L<<3"),
        "OBJ_SNPRINTF_FLAG_NO_UNITS".enumLong("1L<<4"),
        "OBJ_SNPRINTF_FLAG_UNITS_1000".enumLong("1L<<5"),
        "OBJ_SNPRINTF_FLAG_OLD_VERBOSE".enumLong("1L<<0")
    )

    EnumConstant(
        "CPUBIND_PROCESS".enum("1<<0"),
        "CPUBIND_THREAD".enum("1<<1"),
        "CPUBIND_STRICT".enum("1<<2"),
        "CPUBIND_NOMEMBIND".enum("1<<3")
    )

    EnumConstant(
        "MEMBIND_DEFAULT".enum("0"),
        "MEMBIND_FIRSTTOUCH".enum,
        "MEMBIND_BIND".enum,
        "MEMBIND_INTERLEAVE".enum,
        "MEMBIND_WEIGHTED_INTERLEAVE".enum("5"),
        "MEMBIND_NEXTTOUCH".enum("4"),
        "MEMBIND_MIXED".enum("-1")
    )

    EnumConstant(
        "MEMBIND_PROCESS".enum("1<<0"),
        "MEMBIND_THREAD".enum("1<<1"),
        "MEMBIND_STRICT".enum("1<<2"),
        "MEMBIND_MIGRATE".enum("1<<3"),
        "MEMBIND_NOCPUBIND".enum("1<<4"),
        "MEMBIND_BYNODESET".enum("1<<5")
    )

    EnumConstantLong(
        "TOPOLOGY_COMPONENTS_FLAG_BLACKLIST".enumLong("1L<<0")
    )

    EnumConstantLong(
        "TOPOLOGY_FLAG_INCLUDE_DISALLOWED".enumLong("1L<<0"),
        "TOPOLOGY_FLAG_IS_THISSYSTEM".enumLong("1L<<1"),
        "TOPOLOGY_FLAG_THISSYSTEM_ALLOWED_RESOURCES".enumLong("1L<<2"),
        "TOPOLOGY_FLAG_IMPORT_SUPPORT".enumLong("1L<<3"),
        "TOPOLOGY_FLAG_RESTRICT_TO_CPUBINDING".enumLong("1L<<4"),
        "TOPOLOGY_FLAG_RESTRICT_TO_MEMBINDING".enumLong("1L<<5"),
        "TOPOLOGY_FLAG_DONT_CHANGE_BINDING".enumLong("1L<<6"),
        "TOPOLOGY_FLAG_NO_DISTANCES".enumLong("1L<<7"),
        "TOPOLOGY_FLAG_NO_MEMATTRS".enumLong("1L<<8"),
        "TOPOLOGY_FLAG_NO_CPUKINDS".enumLong("1L<<9")
    )

    EnumConstant(
        "TYPE_FILTER_KEEP_ALL".enum("0"),
        "TYPE_FILTER_KEEP_NONE".enum,
        "TYPE_FILTER_KEEP_STRUCTURE".enum,
        "TYPE_FILTER_KEEP_IMPORTANT".enum
    )

    EnumConstantLong(
        "RESTRICT_FLAG_REMOVE_CPULESS".enumLong("1L<<0"),
        "RESTRICT_FLAG_BYNODESET".enumLong("1L<<3"),
        "RESTRICT_FLAG_REMOVE_MEMLESS".enumLong("1L<<4"),
        "RESTRICT_FLAG_ADAPT_MISC".enumLong("1L<<1"),
        "RESTRICT_FLAG_ADAPT_IO".enumLong("1L<<2")
    )

    EnumConstantLong(
        "ALLOW_FLAG_ALL".enumLong("1L<<0"),
        "ALLOW_FLAG_LOCAL_RESTRICTIONS".enumLong("1L<<1"),
        "ALLOW_FLAG_CUSTOM".enumLong("1L<<2")
    )

    val CHECK_UNIX = Code(javaInit = statement("\t\tif (Platform.get() == Platform.WINDOWS) throw new UnsupportedOperationException();"))
    val CHECK_WINDOWS = Code(javaInit = statement("\t\tif (Platform.get() != Platform.WINDOWS) throw new UnsupportedOperationException();"))
    fun DataType.platform(
        name: String,
        vararg parameters: Parameter,
        noPrefix: Boolean = false,
    ): Pair<Func, Func> {
        val nativeName = NativeName("hwloc_$name")

        // UNIX variant
        val params = ArrayList<Parameter>(parameters.size)
        var suffix: String? = null
        for (parameter in parameters) {
            if (parameter.nativeType == hwloc_thread_t) {
                params += Parameter(pthread_t, parameter.name)
                suffix = "pthread"
            } else if (parameter.nativeType == hwloc_pid_t) {
                params += Parameter(pid_t, "pid")
                suffix = "pid"
            } else {
                params += parameter
            }
        }
        checkNotNull(suffix) { "No platform variant found for $name" }
        val unix = CHECK_UNIX..nativeName..this("${name}_${suffix}", *params.toTypedArray(), noPrefix = noPrefix)

        // WINDOWS variant
        params.clear()
        suffix = null
        for (parameter in parameters) {
            if (parameter.nativeType == hwloc_thread_t) {
                params += Parameter(HANDLE, parameter.name)
                suffix = "handle"
            } else if (parameter.nativeType == hwloc_pid_t) {
                params += Parameter(HANDLE, parameter.name)
                suffix = "handle"
            } else {
                params += parameter
            }
        }
        checkNotNull(suffix) { "No platform variant found for $name" }
        val windows = CHECK_WINDOWS..nativeName..this("${name}_${suffix}", *params.toTypedArray(), noPrefix = noPrefix)

        return Pair(unix, windows)
    }

    unsigned(
        "get_api_version",

        void()
    )

    int(
        "compare_types",

        hwloc_obj_type_t("type1"),
        hwloc_obj_type_t("type2")
    )

    int(
        "topology_init",

        Check(1)..hwloc_topology_t.p("topologyp")
    )

    int(
        "topology_load",

        hwloc_topology_t("topology")
    )

    void(
        "topology_destroy",

        hwloc_topology_t("topology")
    )

    int(
        "topology_dup",

        Check(1)..hwloc_topology_t.p("newtopology"),
        hwloc_topology_t("oldtopology")
    )

    int(
        "topology_abi_check",

        hwloc_topology_t("topology")
    )

    void(
        "topology_check",

        hwloc_topology_t("topology")
    )

    int(
        "topology_get_depth",

        hwloc_topology_t("topology")
    )

    int(
        "get_type_depth",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type")
    )

    int(
        "get_type_depth_with_attr",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type"),
        nullable..hwloc_obj_attr_u.p("attrp"),
        AutoSize("attrp")..size_t("attrsize")
    )

    int(
        "get_memory_parents_depth",

        hwloc_topology_t("topology")
    )

    /*int(
        "get_type_or_below_depth",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type")
    )*/
    customMethod("""
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
    }""")

    /*int(
        "get_type_or_above_depth",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type")
    )*/
    customMethod("""
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
    }""")

    hwloc_obj_type_t(
        "get_depth_type",

        hwloc_topology_t("topology"),
        int("depth")
    )

    unsigned(
        "get_nbobjs_by_depth",

        hwloc_topology_t("topology"),
        int("depth")
    )

    /*int(
        "get_nbobjs_by_type",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type")
    )*/
    customMethod("""
    public static int hwloc_get_nbobjs_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN) {
            return 0;
        }
        if (depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return -1; /* FIXME: agregate nbobjs from different levels? */
        }
        return hwloc_get_nbobjs_by_depth(topology, depth);
    }""")

    /*hwloc_obj_t(
        "get_root_obj",

        hwloc_topology_t("topology")
    )*/
    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_root_obj(@NativeType("hwloc_topology_t") long topology) {
        return hwloc_get_obj_by_depth (topology, 0, 0);
    }""")

    hwloc_obj_t(
        "get_obj_by_depth",

        hwloc_topology_t("topology"),
        int("depth"),
        unsigned("idx")
    )

    /*hwloc_obj_t(
        "get_obj_by_type",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type"),
        unsigned("idx")
    )*/
    customMethod("""
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
    }""")

    /*hwloc_obj_t(
        "get_next_obj_by_depth",

        hwloc_topology_t("topology"),
        int("depth"),
        hwloc_obj_t("prev")
    )*/
    customMethod("""
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
    }""")

    /*hwloc_obj_t(
        "get_next_obj_by_type",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type"),
        hwloc_obj_t("prev")
    )*/
    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_next_obj_by_depth(topology, depth, prev);
    }""")

    charASCII.const.p(
        "obj_type_string",

        hwloc_obj_type_t("type")
    )

    int(
        "obj_type_snprintf",

        nullable..charASCII.p("string"),
        AutoSize("string")..size_t("size"),
        hwloc_obj_t("obj"),
        unsigned_long("flags")
    )

    int(
        "obj_attr_snprintf",

        charASCII.p("string"),
        AutoSize("string")..size_t("size"),
        hwloc_obj_t("obj"),
        charASCII.const.p("separator"),
        unsigned_long("flags")
    )

    int(
        "type_sscanf",

        charASCII.const.p("string"),
        Check(1)..hwloc_obj_type_t.p("typep"),
        nullable..hwloc_obj_attr_u.p("attrp"),
        AutoSize("attrp")..size_t("attrsize")
    )

    /*char.const.p(
        "obj_get_info_by_name",

        hwloc_obj_t("obj"),
        char.const.p("name")
    )*/
    customMethod("""
    @Nullable
    @NativeType("char const *")
    public static String hwloc_obj_get_info_by_name(@NativeType("hwloc_obj_t") hwloc_obj obj, String name) {
        return hwloc_get_info_by_name(obj.infos(), name);
    }""")

    /*char.const.p(
        "get_info_by_name",

        hwloc_infos_s.p("infos"),
        char.const.p("name")
    )*/
    customMethod("""
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
    }""")

    int(
        "modify_infos",

        hwloc_infos_s.p("infos"),
        unsigned_long("operation"),
        charASCII.const.p("name"),
        charASCII.const.p("value")
    )

    EnumConstantLong(
        "MODIFY_INFOS_OP_ADD".enumLong("1L<<0"),
        "MODIFY_INFOS_OP_ADD_UNIQUE".enumLong("1L<<1"),
        "MODIFY_INFOS_OP_REPLACE".enumLong("1L<<2"),
        "MODIFY_INFOS_OP_REMOVE".enumLong("1L<<3")
    )

    /*int(
        "obj_add_info",

        hwloc_obj_t("obj"),
        charASCII.const.p("name"),
        charASCII.const.p("value")
    )*/
    customMethod("""
    public static int hwloc_obj_add_info(@NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value) {
        return hwloc_modify_infos(obj.infos(), HWLOC_MODIFY_INFOS_OP_ADD, name, value) >= 0 ? 0 : -1;
    }

    public static int hwloc_obj_add_info(@NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value) {
        return hwloc_modify_infos(obj.infos(), HWLOC_MODIFY_INFOS_OP_ADD, name, value) >= 0 ? 0 : -1;
    }""")

    Nonnull..hwloc_infos_s.p(
        "topology_get_infos",

        hwloc_topology_t("topology")
    )

    int(
        "obj_set_subtype",

        hwloc_topology_t("topology"),
        hwloc_obj_t("obj"),
        nullable..charASCII.const.p("subtype")
    )

    int(
        "set_cpubind",

        hwloc_topology_t("topology"),
        hwloc_const_cpuset_t("set"),
        int("flags")
    )

    int(
        "get_cpubind",

        hwloc_topology_t("topology"),
        hwloc_cpuset_t("set"),
        int("flags")
    )

    int.platform(
        "set_proc_cpubind",

        hwloc_topology_t("topology"),
        hwloc_pid_t("pid"),
        hwloc_const_cpuset_t("set"),
        int("flags")
    )

    int.platform(
        "get_proc_cpubind",

        hwloc_topology_t("topology"),
        hwloc_pid_t("pid"),
        hwloc_cpuset_t("set"),
        int("flags")
    )

    int.platform(
        "set_thread_cpubind",

        hwloc_topology_t("topology"),
        hwloc_thread_t("thread"),
        hwloc_const_cpuset_t("set"),
        int("flags")
    )

    int.platform(
        "get_thread_cpubind",

        hwloc_topology_t("topology"),
        hwloc_thread_t("thread"),
        hwloc_cpuset_t("set"),
        int("flags")
    )

    int(
        "get_last_cpu_location",

        hwloc_topology_t("topology"),
        hwloc_cpuset_t("set"),
        int("flags")
    )

    int.platform(
        "get_proc_last_cpu_location",

        hwloc_topology_t("topology"),
        hwloc_pid_t("pid"),
        hwloc_cpuset_t("set"),
        int("flags")
    )

    int(
        "set_membind",

        hwloc_topology_t("topology"),
        hwloc_const_bitmap_t("set"),
        hwloc_membind_policy_t("policy"),
        int("flags")
    )

    int(
        "get_membind",

        hwloc_topology_t("topology"),
        hwloc_bitmap_t("set"),
        Check(1)..hwloc_membind_policy_t.p("policy"),
        int("flags")
    )

    int.platform(
        "set_proc_membind",

        hwloc_topology_t("topology"),
        hwloc_pid_t("pid"),
        hwloc_const_bitmap_t("set"),
        hwloc_membind_policy_t("policy"),
        int("flags")
    )

    int.platform(
        "get_proc_membind",

        hwloc_topology_t("topology"),
        hwloc_pid_t("pid"),
        hwloc_bitmap_t("set"),
        Check(1)..hwloc_membind_policy_t.p("policy"),
        int("flags")
    )

    int(
        "set_area_membind",

        hwloc_topology_t("topology"),
        void.const.p("addr"),
        AutoSize("addr")..size_t("len"),
        hwloc_const_bitmap_t("set"),
        hwloc_membind_policy_t("policy"),
        int("flags")
    )

    int(
        "get_area_membind",

        hwloc_topology_t("topology"),
        void.const.p("addr"),
        AutoSize("addr")..size_t("len"),
        hwloc_bitmap_t("set"),
        Check(1)..hwloc_membind_policy_t.p("policy"),
        int("flags")
    )

    int(
        "get_area_memlocation",

        hwloc_topology_t("topology"),
        void.const.p("addr"),
        AutoSize("addr")..size_t("len"),
        hwloc_bitmap_t("set"),
        int("flags")
    )

    void.p(
        "alloc",

        hwloc_topology_t("topology"),
        AutoSizeResult..size_t("len")
    )

    void.p(
        "alloc_membind",

        hwloc_topology_t("topology"),
        AutoSizeResult..size_t("len"),
        hwloc_const_bitmap_t("set"),
        hwloc_membind_policy_t("policy"),
        int("flags")
    )

    /*void.p(
        "alloc_membind_policy",

        hwloc_topology_t("topology"),
        size_t("len"),
        hwloc_const_bitmap_t("set"),
        hwloc_membind_policy_t("policy"),
        int("flags")
    )*/
    customMethod("""
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
    }""")

    int(
        "free",

        hwloc_topology_t("topology"),
        void.p("addr"),
        AutoSize("addr")..size_t("len")
    )

    int.platform(
        "topology_set_pid",

        hwloc_topology_t("topology"),
        hwloc_pid_t("pid")
    )

    int(
        "topology_set_synthetic",

        hwloc_topology_t("topology"),
        charASCII.const.p("description")
    )

    int(
        "topology_set_xml",

        hwloc_topology_t("topology"),
        charUTF8.const.p("xmlpath")
    )

    int(
        "topology_set_xmlbuffer",

        hwloc_topology_t("topology"),
        charASCII.const.p("buffer"),
        AutoSize("buffer")..int("size")
    )

    int(
        "topology_set_components",

        hwloc_topology_t("topology"),
        unsigned_long("flags"),
        charASCII.const.p("name")
    )

    int(
        "topology_set_flags",

        hwloc_topology_t("topology"),
        unsigned_long("flags")
    )

    unsigned_long(
        "topology_get_flags",

        hwloc_topology_t("topology")
    )

    intb(
        "topology_is_thissystem",

        hwloc_topology_t("topology")
    )

    hwloc_topology_support.const.p(
        "topology_get_support",

        hwloc_topology_t("topology")
    )

    int(
        "topology_set_type_filter",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type"),
        hwloc_type_filter_e("filter")
    )

    int(
        "topology_get_type_filter",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type"),
        Check(1)..hwloc_type_filter_e.p("filter")
    )

    int(
        "topology_set_all_types_filter",

        hwloc_topology_t("topology"),
        hwloc_type_filter_e("filter")
    )

    int(
        "topology_set_cache_types_filter",

        hwloc_topology_t("topology"),
        hwloc_type_filter_e("filter")
    )

    int(
        "topology_set_icache_types_filter",

        hwloc_topology_t("topology"),
        hwloc_type_filter_e("filter")
    )

    int(
        "topology_set_io_types_filter",

        hwloc_topology_t("topology"),
        hwloc_type_filter_e("filter")
    )

    void(
        "topology_set_userdata",

        hwloc_topology_t("topology"),
        nullable..opaque_const_p("userdata")
    )

    opaque_p(
        "topology_get_userdata",

        hwloc_topology_t("topology")
    )

    int(
        "topology_restrict",

        hwloc_topology_t("topology"),
        hwloc_const_bitmap_t("set"),
        unsigned_long("flags")
    )

    int(
        "topology_allow",

        hwloc_topology_t("topology"),
        hwloc_const_cpuset_t("cpuset"),
        hwloc_const_nodeset_t("nodeset"),
        unsigned_long("flags")
    )

    hwloc_obj_t(
        "topology_insert_misc_object",

        hwloc_topology_t("topology"),
        hwloc_obj_t("parent"),
        charASCII.const.p("name")
    )

    hwloc_obj_t(
        "topology_alloc_group_object",

        hwloc_topology_t("topology")
    )

    int(
        "topology_free_group_object",

        hwloc_topology_t("topology"),
        hwloc_obj_t("group")
    )

    hwloc_obj_t(
        "topology_insert_group_object",

        hwloc_topology_t("topology"),
        hwloc_obj_t("group")
    )

    int(
        "obj_add_other_obj_sets",

        hwloc_obj_t("dst"),
        hwloc_obj_t("src")
    )

    int(
        "topology_refresh",

        hwloc_topology_t("topology")
    )

    // helper.h

    intb("obj_type_is_normal", hwloc_obj_type_t("type"))
    intb("obj_type_is_io", hwloc_obj_type_t("type"))
    intb("obj_type_is_memory", hwloc_obj_type_t("type"))
    intb("obj_type_is_cache", hwloc_obj_type_t("type"))
    intb("obj_type_is_dcache", hwloc_obj_type_t("type"))
    intb("obj_type_is_icache", hwloc_obj_type_t("type"))

    customMethod("""
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
    }""")

    int(
        "get_largest_objs_inside_cpuset",

        hwloc_topology_t("topology"),
        hwloc_const_cpuset_t("set"),
        hwloc_obj_t.p("objs"),
        AutoSize("objs")..int("max")
    )

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_inside_cpuset_by_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, int depth, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        hwloc_obj next = hwloc_get_next_obj_by_depth(topology, depth, prev);
        while (next != null && (hwloc_bitmap_iszero(next.cpuset()) || !hwloc_bitmap_isincluded(next.cpuset(), set))) {
            next = next.next_cousin();
        }
        return next;
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_inside_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_next_obj_inside_cpuset_by_depth(topology, set, depth, prev);
    }""")

    customMethod("""
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
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_inside_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type, @NativeType("unsigned") int idx) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_obj_inside_cpuset_by_depth(topology, set, depth, idx);
    }""")

    customMethod("""
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
    }""")

    customMethod("""
    public static int hwloc_get_nbobjs_inside_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN) {
            return 0;
        }
        if (depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return -1; /* FIXME: agregate nbobjs from different levels? */
        }
        return hwloc_get_nbobjs_inside_cpuset_by_depth(topology, set, depth);
    }""")

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_covering_cpuset_by_depth(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, int depth, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        hwloc_obj next = hwloc_get_next_obj_by_depth(topology, depth, prev);
        while (next != null && !hwloc_bitmap_intersects(set, next.cpuset())) {
            next = next.next_cousin();
        }
        return next;
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_obj_covering_cpuset_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_const_cpuset_t") long set, @NativeType("hwloc_obj_type_t") int type, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return null;
        }
        return hwloc_get_next_obj_covering_cpuset_by_depth(topology, set, depth, prev);
    }""")

    customMethod("""
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
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_ancestor_obj_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type, @NativeType("hwloc_obj_t") hwloc_obj obj) {
        hwloc_obj ancestor = obj.parent();
        while (ancestor != null && ancestor.type() != type) {
            ancestor = ancestor.parent();
        }
        return ancestor;
    }""")

    customMethod("""
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
    }""")

    customMethod("""
    @NativeType("int")
    public static boolean hwloc_obj_is_in_subtree(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj obj, @NativeType("hwloc_obj_t") hwloc_obj subtree_root) {
        long sub_bitmap   = obj.cpuset();
        long super_bitmap = subtree_root.cpuset();
        return sub_bitmap != NULL && super_bitmap != NULL && hwloc_bitmap_isincluded(sub_bitmap, super_bitmap);
    }""")

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    int(
        "bitmap_singlify_per_core",

        hwloc_topology_t("topology"),
        hwloc_bitmap_t("cpuset"),
        unsigned("which")
    )

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    unsigned(
        "get_closest_objs",

        hwloc_topology_t("topology"),
        hwloc_obj_t("src"),
        hwloc_obj_t.p("objs"),
        AutoSize("objs")..unsigned("max")
    )

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_obj_below_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type1, @NativeType("unsigned") int idx1, @NativeType("hwloc_obj_type_t") int type2, @NativeType("unsigned") int idx2) {
        hwloc_obj obj = hwloc_get_obj_by_type(topology, type1, idx1);
        if (obj == null) {
            return null;
        }
        return hwloc_get_obj_inside_cpuset_by_type(topology, obj.cpuset(), type2, idx2);
    }""")

    customMethod("""
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
    }""")

    hwloc_obj_t(
        "get_obj_with_same_locality",

        hwloc_topology_t("topology"),
        hwloc_obj_t("src"),
        hwloc_obj_type_t("type"),
        nullable..charASCII.const.p("subtype"),
        nullable..charASCII.const.p("nameprefix"),
        unsigned_long("flags")
    )

    EnumConstantLong(
        "DISTRIB_FLAG_REVERSE".enumLong("1L<<0")
    )

    customMethod("""
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
    }""")

    hwloc_const_cpuset_t(
        "topology_get_complete_cpuset",

        hwloc_topology_t("topology")
    )

    hwloc_const_cpuset_t(
        "topology_get_topology_cpuset",

        hwloc_topology_t("topology")
    )

    hwloc_const_cpuset_t(
        "topology_get_allowed_cpuset",

        hwloc_topology_t("topology")
    )

    hwloc_const_nodeset_t(
        "topology_get_complete_nodeset",

        hwloc_topology_t("topology")
    )

    hwloc_const_nodeset_t(
        "topology_get_topology_nodeset",

        hwloc_topology_t("topology")
    )

    hwloc_const_nodeset_t(
        "topology_get_allowed_nodeset",

        hwloc_topology_t("topology")
    )

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_non_io_ancestor_obj(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_t") hwloc_obj ioobj) {
        hwloc_obj obj = ioobj;
        while (obj != null && obj.cpuset() == NULL) {
            obj = obj.parent();
        }
        return obj;
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_pcidev(@NativeType("hwloc_topology_t") long topology, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        return hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_PCI_DEVICE, prev);
    }""")

    customMethod("""
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
    }""")

    customMethod("""
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
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_osdev(@NativeType("hwloc_topology_t") long topology, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        return hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_OS_DEVICE, prev);
    }""")

    customMethod("""
    @Nullable
    @NativeType("hwloc_obj_t")
    public static hwloc_obj hwloc_get_next_bridge(@NativeType("hwloc_topology_t") long topology, @Nullable @NativeType("hwloc_obj_t") hwloc_obj prev) {
        return hwloc_get_next_obj_by_type(topology, HWLOC_OBJ_BRIDGE, prev);
    }""")

    customMethod("""
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
    }""")

    // memattrs.h

    EnumConstant(
        "MEMATTR_ID_CAPACITY".enum("0"),
        "MEMATTR_ID_LOCALITY".enum,
        "MEMATTR_ID_BANDWIDTH".enum,
        "MEMATTR_ID_READ_BANDWIDTH".enum("4"),
        "MEMATTR_ID_WRITE_BANDWIDTH".enum,
        "MEMATTR_ID_LATENCY".enum("3"),
        "MEMATTR_ID_READ_LATENCY".enum("6"),
        "MEMATTR_ID_WRITE_LATENCY".enum
    )

    EnumConstant(
        "LOCATION_TYPE_CPUSET".enum("1"),
        "LOCATION_TYPE_OBJECT".enum("0")
    )

    EnumConstantLong(
        "LOCAL_NUMANODE_FLAG_LARGER_LOCALITY".enumLong("1L<<0"),
        "LOCAL_NUMANODE_FLAG_SMALLER_LOCALITY".enumLong("1L<<1"),
        "LOCAL_NUMANODE_FLAG_INTERSECT_LOCALITY".enumLong("1L<<3"),
        "LOCAL_NUMANODE_FLAG_ALL".enumLong("1L<<2")
    )

    EnumConstantLong(
        "MEMATTR_FLAG_HIGHER_FIRST".enumLong("1L<<0"),
        "MEMATTR_FLAG_LOWER_FIRST".enumLong("1L<<1"),
        "MEMATTR_FLAG_NEED_INITIATOR".enumLong("1L<<2")
    )

    int(
        "memattr_get_by_name",

        hwloc_topology_t("topology"),
        charASCII.const.p("name"),
        Check(1)..hwloc_memattr_id_t.p("id")
    )

    int(
        "get_local_numanode_objs",

        hwloc_topology_t("topology"),
        hwloc_location.p("location"),
        AutoSize("nodes")..Check(1)..unsigned_int.p("nr"),
        hwloc_obj_t.p("nodes"),
        unsigned_long("flags")
    )

    int(
        "topology_get_default_nodeset",

        hwloc_topology_t("topology"),
        hwloc_nodeset_t("nodeset"),
        unsigned_long("flags")
    )

    int(
        "memattr_get_value",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        hwloc_obj_t("target_node"),
        nullable..hwloc_location.p("initiator"),
        unsigned_long("flags"),
        Check(1)..hwloc_uint64_t.p("value")
    )

    int(
        "memattr_get_best_target",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        nullable..hwloc_location.p("initiator"),
        unsigned_long("flags"),
        Check(1)..hwloc_obj_t.p("best_target"),
        Check(1)..nullable..hwloc_uint64_t.p("value")
    )

    int(
        "memattr_get_best_initiator",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        hwloc_obj_t("target_node"),
        unsigned_long("flags"),
        Check(1)..hwloc_location.p("best_initiator"),
        Check(1)..nullable..hwloc_uint64_t.p("value")
    )

    int(
        "memattr_get_targets",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        nullable..hwloc_location.p("initiator"),
        unsigned_long("flags"),
        AutoSize("targets", "values")..Check(1)..unsigned_int.p("nr"),
        hwloc_obj_t.p("targets"),
        nullable..hwloc_uint64_t.p("values")
    )

    int(
        "memattr_get_initiators",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        hwloc_obj_t("target_node"),
        unsigned_long("flags"),
        AutoSize("initiators", "values")..Check(1)..unsigned_int.p("nr"),
        hwloc_location.p("initiators"),
        nullable..hwloc_uint64_t.p("values")
    )

    int(
        "memattr_get_name",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        Check(1)..char.const.p.p("name")
    )

    int(
        "memattr_get_flags",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        Check(1)..unsigned_long.p("flags")
    )

    int(
        "memattr_register",

        hwloc_topology_t("topology"),
        charASCII.const.p("name"),
        unsigned_long("flags"),
        Check(1)..hwloc_memattr_id_t.p("id")
    )

    int(
        "memattr_set_value",

        hwloc_topology_t("topology"),
        hwloc_memattr_id_t("attribute"),
        hwloc_obj_t("target_node"),
        nullable..hwloc_location.p("initiator"),
        unsigned_long("flags"),
        hwloc_uint64_t("value")
    )

    // cpukinds.h

    int(
        "cpukinds_get_nr",

        hwloc_topology_t("topology"),
        unsigned_long("flags")
    )

    int(
        "cpukinds_get_by_cpuset",

        hwloc_topology_t("topology"),
        hwloc_const_bitmap_t("cpuset"),
        unsigned_long("flags")
    )

    int(
        "cpukinds_get_info",

        hwloc_topology_t("topology"),
        unsigned_int("kind_index"),
        nullable..hwloc_bitmap_t("cpuset"),
        Check(1)..nullable..int.p("efficiency"),
        Check(1)..hwloc_infos_s.p.p("infosp"),
        unsigned_long("flags")
    )

    int(
        "cpukinds_register",

        hwloc_topology_t("topology"),
        hwloc_bitmap_t("cpuset"),
        int("forced_efficiency"),
        nullable..hwloc_infos_s.p("infos"),
        unsigned_long("flags")
    )

    // export.h

    EnumConstantLong(
        "TOPOLOGY_EXPORT_XML_FLAG_V2".enumLong("1L<<1")
    )

    EnumConstantLong(
        "TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_EXTENDED_TYPES".enumLong("1L<<0"),
        "TOPOLOGY_EXPORT_SYNTHETIC_FLAG_NO_ATTRS".enumLong("1L<<1"),
        "TOPOLOGY_EXPORT_SYNTHETIC_FLAG_IGNORE_MEMORY".enumLong("1L<<2")
    )

    int(
        "topology_export_xml",

        hwloc_topology_t("topology"),
        charUTF8.const.p("xmlpath"),
        unsigned_long("flags")
    )

    int(
        "topology_export_xmlbuffer",

        hwloc_topology_t("topology"),
        Check(1)..char.p.p("xmlbuffer"),
        Check(1)..int.p("buflen"),
        unsigned_long("flags")
    )

    void(
        "free_xmlbuffer",

        hwloc_topology_t("topology"),
        Unsafe..char.p("xmlbuffer")
    )

    void(
        "topology_set_userdata_export_callback",

        hwloc_topology_t("topology"),
        topology_set_userdata_export_callback("export_cb")
    )

    int(
        "export_obj_userdata",

        nullable..opaque_p("reserved"),
        hwloc_topology_t("topology"),
        hwloc_obj_t("obj"),
        charASCII.const.p("name"),
        void.const.p("buffer"),
        AutoSize("buffer")..size_t("length")
    )

    int(
        "export_obj_userdata_base64",

        nullable..opaque_p("reserved"),
        hwloc_topology_t("topology"),
        hwloc_obj_t("obj"),
        charASCII.const.p("name"),
        void.const.p("buffer"),
        AutoSize("buffer")..size_t("length")
    )

    void(
        "topology_set_userdata_import_callback",

        hwloc_topology_t("topology"),
        topology_set_userdata_import_callback("import_cb")
    )

    int(
        "topology_export_synthetic",

        hwloc_topology_t("topology"),
        char.p("buffer"),
        AutoSize("buffer")..size_t("buflen"),
        unsigned_long("flags")
    )

    // distances.h

    EnumConstantLong(
        "DISTANCES_KIND_FROM_OS".enumLong("1L<<0"),
        "DISTANCES_KIND_FROM_USER".enumLong("1L<<1"),
        "DISTANCES_KIND_VALUE_LATENCY".enumLong("1L<<2"),
        "DISTANCES_KIND_VALUE_BANDWIDTH".enumLong("1L<<3"),
        "DISTANCES_KIND_VALUE_HOPS".enumLong("1L<<5"),
        "DISTANCES_KIND_HETEROGENEOUS_TYPES".enumLong("1L<<4")
    )

    EnumConstant(
        "DISTANCES_TRANSFORM_REMOVE_NULL".enum("0"),
        "DISTANCES_TRANSFORM_LINKS".enum,
        "DISTANCES_TRANSFORM_MERGE_SWITCH_PORTS".enum,
        "DISTANCES_TRANSFORM_TRANSITIVE_CLOSURE".enum
    )

    EnumConstantLong(
        "DISTANCES_ADD_FLAG_GROUP".enumLong("1L<<0"),
        "DISTANCES_ADD_FLAG_GROUP_INACCURATE".enumLong("1L<<1")
    )

    int(
        "distances_get",

        hwloc_topology_t("topology"),
        AutoSize("distances")..Check(1)..unsigned_int.p("nr"),
        hwloc_distances_s.p.p("distances"),
        unsigned_long("kind"),
        unsigned_long("flags")
    )

    int(
        "distances_get_by_depth",

        hwloc_topology_t("topology"),
        int("depth"),
        AutoSize("distances")..Check(1)..unsigned_int.p("nr"),
        hwloc_distances_s.p.p("distances"),
        unsigned_long("kind"),
        unsigned_long("flags")
    )

    int(
        "distances_get_by_type",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type"),
        AutoSize("distances")..Check(1)..unsigned_int.p("nr"),
        hwloc_distances_s.p.p("distances"),
        unsigned_long("kind"),
        unsigned_long("flags")
    )

    int(
        "distances_get_by_name",

        hwloc_topology_t("topology"),
        charASCII.const.p("name"),
        AutoSize("distances")..Check(1)..unsigned_int.p("nr"),
        hwloc_distances_s.p.p("distances"),
        unsigned_long("flags")
    )

    charASCII.const.p(
        "distances_get_name",

        hwloc_topology_t("topology"),
        hwloc_distances_s.p("distances")
    )

    void(
        "distances_release",

        hwloc_topology_t("topology"),
        hwloc_distances_s.p("distances")
    )

    int(
        "distances_transform",

        hwloc_topology_t("topology"),
        hwloc_distances_s.p("distances"),
        hwloc_distances_transform_e("transform"),
        nullable..opaque_p("transform_attr"),
        unsigned_long("flags")
    )

    /*int(
        "distances_obj_index",

        hwloc_distances_s.p("distances"),
        hwloc_obj_t("obj")
    )*/
    customMethod("""
    public static int hwloc_distances_obj_index(@NativeType("struct hwloc_distances_s *") hwloc_distances_s distances, @NativeType("hwloc_obj_t") hwloc_obj obj) {
        PointerBuffer objs = distances.objs();
        for (int i = 0; i < objs.remaining(); i++) {
            if (objs.get(i) == obj.address()) {
                return i;
            }
        }
        return -1;
    }""")

    /*int(
        "distances_obj_pair_values",

        hwloc_distances_s.p("distances"),
        hwloc_obj_t("obj1"),
        hwloc_obj_t("obj2"),
        hwloc_uint64_t.p("value1to2"),
        hwloc_uint64_t.p("value2to1")
    )*/
    customMethod("""
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
    }""")

    hwloc_distances_add_handle_t(
        "distances_add_create",

        hwloc_topology_t("topology"),
        nullable..charASCII.const.p("name"),
        unsigned_long("kind"),
        unsigned_long("flags")
    )

    int(
        "distances_add_values",

        hwloc_topology_t("topology"),
        hwloc_distances_add_handle_t("handle"),
        unsigned_int("nbobjs"),
        Check("nbobjs")..hwloc_obj_t.p("objs"),
        Check("nbobjs * nbobjs")..hwloc_uint64_t.p("values"),
        unsigned_long("flags")
    )

    int(
        "distances_add_commit",

        hwloc_topology_t("topology"),
        hwloc_distances_add_handle_t("handle"),
        unsigned_long("flags")
    )

    int(
        "distances_remove",

        hwloc_topology_t("topology")
    )

    int(
        "distances_remove_by_depth",

        hwloc_topology_t("topology"),
        int("depth")
    )

    /*int(
        "distances_remove_by_type",

        hwloc_topology_t("topology"),
        hwloc_obj_type_t("type")
    )*/
    customMethod("""
    public static int hwloc_distances_remove_by_type(@NativeType("hwloc_topology_t") long topology, @NativeType("hwloc_obj_type_t") int type) {
        int depth = hwloc_get_type_depth(topology, type);
        if (depth == HWLOC_TYPE_DEPTH_UNKNOWN || depth == HWLOC_TYPE_DEPTH_MULTIPLE) {
            return 0;
        }
        return hwloc_distances_remove_by_depth(topology, depth);
    }""")

    int(
        "distances_release_remove",

        hwloc_topology_t("topology"),
        hwloc_distances_s.p("distances")
    )

    // diff.h

    EnumConstant(
        "TOPOLOGY_DIFF_OBJ_ATTR_SIZE".enum("0"),
        "TOPOLOGY_DIFF_OBJ_ATTR_NAME".enum,
        "TOPOLOGY_DIFF_OBJ_ATTR_INFO".enum
    )

    EnumConstant(
        "TOPOLOGY_DIFF_OBJ_ATTR".enum("0"),
        "TOPOLOGY_DIFF_TOO_COMPLEX".enum
    )

    EnumConstantLong(
        "TOPOLOGY_DIFF_APPLY_REVERSE".enumLong("1L<<0")
    )

    int(
        "topology_diff_build",

        hwloc_topology_t("topology"),
        hwloc_topology_t("newtopology"),
        unsigned_long("flags"),
        Check(1)..hwloc_topology_diff_t.p("diff")
    )

    int(
        "topology_diff_apply",

        hwloc_topology_t("topology"),
        hwloc_topology_diff_t("diff"),
        unsigned_long("flags")
    )

    int(
        "topology_diff_destroy",

        hwloc_topology_diff_t("diff")
    )

    int(
        "topology_diff_load_xml",

        charUTF8.const.p("xmlpath"),
        Check(1)..hwloc_topology_diff_t.p("diff"),
        Check(1)..char.p.p("refname")
    )

    int(
        "topology_diff_export_xml",

        hwloc_topology_diff_t("diff"),
        charASCII.const.p("refname"),
        charUTF8.const.p("xmlpath")
    )

    int(
        "topology_diff_load_xmlbuffer",

        char.const.p("xmlbuffer"),
        AutoSize("xmlbuffer")..int("buflen"),
        Check(1)..hwloc_topology_diff_t.p("diff"),
        Check(1)..char.p.p("refname")
    )

    int(
        "topology_diff_export_xmlbuffer",

        hwloc_topology_diff_t("diff"),
        charASCII.const.p("refname"),
        Check(1)..char.p.p("xmlbuffer"),
        Check(1)..int.p("buflen")
    )
}