/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.hwloc.templates

import org.lwjgl.generator.*
import org.lwjgl.hwloc.*

val hwloc = "HWLoc".nativeClass(HWLOC_PACKAGE, prefix = "HWLOC_", binding = HWLOC_BINDING) {
	documentation =
		"""
		Native bindings to the hwloc library.
		"""

	IntConstant("Indicates at build time which hwloc API version is being used.", "API_VERSION"..0x00020000)
	IntConstant("Current component and plugin ABI version (see hwloc/plugins.h)", "COMPONENT_ABI"..5)

	EnumConstant(
		"""
		Type of topology object.

		Do not rely on the ordering or completeness of the values as new ones may be defined in the future! If you need to compare types, use #compare_types()
		instead.
		""",

		"OBJ_SYSTEM" enum
			"""
			Whole system (may be a cluster of machines).

			The whole system that is accessible to hwloc. That may comprise several machines in SSI systems.
			""",
		"OBJ_MACHINE" enum
			"""
			Machine.

			The typical root object type. A set of processors and memory with cache coherency.
			""",
		"OBJ_NUMANODE" enum
			"""
			NUMA node.

			A set of processors around memory which the processors can directly access.

			There is always at one such object in the topology even if the machine is not NUMA.
			""",
		"OBJ_PACKAGE" enum
			"""
			Physical package, what goes into a socket.

			In the physical meaning, i.e. that you can add or remove physically.
			""",
		"OBJ_CORE" enum
			"""
			Core.

			A computation unit (may be shared by several logical processors).
			""",
		"OBJ_PU" enum
			"""
			Processing Unit, or (Logical) Processor.

			An execution unit (may share a core with some other logical processors, e.g. in the case of an SMT core).

			Objects of this kind are always reported and can thus be used as fallback when others are not.
			""",
		"OBJ_L1CACHE" enum "Level 1 Data (or Unified) Cache.",
		"OBJ_L2CACHE" enum "Level 2 Data (or Unified) Cache.",
		"OBJ_L3CACHE" enum "Level 3 Data (or Unified) Cache.",
		"OBJ_L4CACHE" enum "Level 4 Data (or Unified) Cache.",
		"OBJ_L5CACHE" enum "Level 5 Data (or Unified) Cache.",
		"OBJ_L1ICACHE" enum "Level 1 instruction Cache, only when the #TOPOLOGY_FLAG_ICACHES topology flag is set.",
		"OBJ_L2ICACHE" enum "Level 2 instruction Cache, only when the #TOPOLOGY_FLAG_ICACHES topology flag is set.",
		"OBJ_L3ICACHE" enum "Level 3 instruction Cache, only when the #TOPOLOGY_FLAG_ICACHES topology flag is set.",
		"OBJ_GROUP" enum
			"""
			Group objects.

			Objects which do not fit in the above but are detected by hwloc and are useful to take into account for affinity. For instance, some operating systems
			expose their arbitrary processors aggregation this way. And hwloc may insert such objects to group NUMA nodes according to their distances.

			These objects are ignored when they do not bring any structure.
			""",
		"OBJ_MISC" enum
			"""
			Miscellaneous objects.

			Objects without particular meaning, that can e.g. be added by the application for its own use, or by hwloc for miscellaneous
			objects such as MemoryModule (DIMMs). These objects are not listed in the main children list, but rather in the dedicated misc children list.

			Misc objects may only have Misc objects as children, and those are in the dedicated misc children list as well. Misc objects have $NULL CPU and
			node sets.
			""",
		"OBJ_BRIDGE" enum
			"""
			Bridge.

			Any bridge that connects the host or an I/O bus, to another I/O bus.

			Bridge objects have neither CPU sets nor node sets. They are not added to the topology unless I/O discovery is enabled with #topology_set_flags().

			I/O objects are not listed in the main children list, but rather in the dedicated io children list. I/O objects have $NULL CPU and node sets.
			""",
		"OBJ_PCI_DEVICE" enum
			"""
			PCI device.

			These objects have neither CPU sets nor node sets. They are not added to the topology unless I/O discovery is enabled with #topology_set_flags().

			I/O objects are not listed in the main children list, but rather in the dedicated io children list. I/O objects have $NULL CPU and node sets.
			""",
		"OBJ_OS_DEVICE" enum
			"""
			Operating system device.

			These objects have neither CPU sets nor node sets. They are not added to the topology unless I/O discovery is enabled with #topology_set_flags().

			I/O objects are not listed in the main children list, but rather in the dedicated io children list. I/O objects have $NULL CPU and node sets.
			"""
	)

	EnumConstant(
		"Cache type.",

		"OBJ_CACHE_UNIFIED" enum "Unified cache.",
		"OBJ_CACHE_DATA" enum "Data cache.",
		"OBJ_CACHE_INSTRUCTION" enum " Instruction cache."
	)

	EnumConstant(
		"Type of one side (upstream or downstream) of an I/O bridge.",

		"OBJ_BRIDGE_HOST" enum "Host-side of a bridge, only possible upstream.",
		"OBJ_BRIDGE_PCI" enum "PCI-side of a bridge."
	)

	EnumConstant(
		"Type of a OS device.",

		"OBJ_OSDEV_BLOCK" enum "Operating system block device. For instance \"sda\" on Linux.",
		"OBJ_OSDEV_GPU" enum "Operating system GPU device. For instance \":0.0\" for a GL display, \"card0\" for a Linux DRM device.",
		"OBJ_OSDEV_NETWORK" enum "Operating system network device. For instance the \"eth0\" interface on Linux.",
		"OBJ_OSDEV_OPENFABRICS" enum "Operating system openfabrics device. For instance the \"mlx4_0\" InfiniBand HCA device on Linux.",
		"OBJ_OSDEV_DMA" enum "Operating system dma engine device. For instance the \"dma0chan0\" DMA channel on Linux.",
		"OBJ_OSDEV_COPROC" enum
			"""
			Operating system co-processor device. For instance \"mic0\" for a Xeon Phi (MIC) on Linux, \"opencl0d0\" for a OpenCL device, \"cuda0\" for a CUDA
			device.
			"""
	)

	IntConstant(
		"Value returned by #compare_types when types can not be compared.",
		"TYPE_UNORDERED".."Integer.MAX_VALUE"
	)

	val TopologyFlags = EnumConstant(
		"Flags to be set onto a topology context before load.",

		"TOPOLOGY_FLAG_WHOLE_SYSTEM".enumExpr(
			"""
			Detect the whole system, ignore reservations.

			Gather all resources, even if some were disabled by the administrator. For instance, ignore Linux Cgroup/Cpusets and gather all processors and
			memory nodes.

			When this flag is not set, PUs that are disallowed are not added to the topology. Parent objects (package, core, cache, etc.) are added only if
			some of their children are allowed. NUMA nodes are always added but their available memory is set to 0 when disallowed.

			When this flag is set, each object has {@code allowed_cpuset <= cpuset <= complete_cpuset}. Otherwise
			{@code allowed_cpuset = cpuset <= complete_cpuset}. The same applies to nodesets.
			""",
			"1 << 0"
		),
		"TOPOLOGY_FLAG_IS_THISSYSTEM".enumExpr(
			"""
			Assume that the selected backend provides the topology for the system on which we are running.

			This forces #topology_is_thissystem() to return 1, i.e. makes hwloc assume that the selected backend provides the topology for the system on which
			we are running, even if it is not the OS-specific backend but the XML backend for instance. This means making the binding functions actually call
			the OS-specific system calls and really do binding, while the XML backend would otherwise provide empty hooks just returning success.

			Setting the environment variable {@code HWLOC_THISSYSTEM} may also result in the same behavior.

			This can be used for efficiency reasons to first detect the topology once, save it to an XML file, and quickly reload it later through the XML
			backend, but still having binding functions actually do bind.
			""",
			"1 << 1"
		),
		"TOPOLOGY_FLAG_IO_DEVICES".enumExpr(
			"""
			Detect PCI devices.

			By default, I/O devices are ignored. This flag enables I/O device detection using the pci backend. Only the common PCI devices (GPUs, NICs, block
			devices, ...) and host bridges (objects that connect the host objects to an I/O subsystem) will be added to the topology. Uncommon devices and
			other bridges (such as PCI-to-PCI bridges) will be ignored.
			""",
			"1 << 2"
		),
		"TOPOLOGY_FLAG_IO_BRIDGES".enumExpr(
			"""
			Detect PCI bridges.

			This flag should be combined with #TOPOLOGY_FLAG_IO_DEVICES to enable the detection of both common devices and of all useful bridges (bridges that
			have at least one device behind them).
			""",
			"1 << 3"
		),
		"TOPOLOGY_FLAG_WHOLE_IO".enumExpr(
			"""
			Detect the whole PCI hierarchy.

			This flag enables detection of all I/O devices (even the uncommon ones such as DMA channels) and bridges (even those that have no device behind
			them) using the pci backend. Additionally it also enables MemoryModule misc objects. This implies #TOPOLOGY_FLAG_IO_DEVICES.
			""",
			"1 << 4"
		),
		"TOPOLOGY_FLAG_ICACHES".enumExpr(
			"""
			Detect instruction caches.

			This flag enables detection of Instruction caches, instead of only Data and Unified caches.
			""",
			"1 << 5"
		)
	).javaDocLinks

	EnumConstant(
		"Virtual depth values.",

		"TYPE_DEPTH_UNKNOWN".enum("No object of given type exists in the topology.", -1),
		"TYPE_DEPTH_MULTIPLE".enum("Objects of given type exist at different depth in the topology (only for Groups).", -2),
		"TYPE_DEPTH_BRIDGE".enum("Virtual depth for bridge object level.", -3),
		"TYPE_DEPTH_PCI_DEVICE".enum("Virtual depth for PCI device object level.", -4),
		"TYPE_DEPTH_OS_DEVICE".enum("Virtual depth for software device object level.", -5),
		"TYPE_DEPTH_MISC".enum("Virtual depth for Misc object.", -6)
	)

	val RestrictFlags = EnumConstant(
		"Flags to be given to #topology_restrict().",

		"HWLOC_RESTRICT_FLAG_ADAPT_DISTANCES".enumExpr(
			"Adapt distance matrices according to objects being removed during restriction. If this flag is not set, distance matrices are removed.",
			"(1<<0)"
		),
		"HWLOC_RESTRICT_FLAG_ADAPT_MISC".enumExpr(
			"""
			Move Misc objects to ancestors if their parents are removed during restriction. If this flag is not set, Misc objects are removed when their
			parents are removed.
			""",
			"(1<<1)"
		),
		"HWLOC_RESTRICT_FLAG_ADAPT_IO".enumExpr(
			"""
			Move I/O objects to ancestors if their parents are removed during restriction. If this flag is not set, I/O devices and bridges are removed when
			their parents are removed.
			""",
			"(1<<2)"
		)
	).javaDocLinks

	unsigned_int(
		"get_api_version",
		"""
		Indicates at runtime which hwloc API version was used at build time.

		Should be #API_VERSION if running on the same version.
		"""
	)

	int(
		"compare_types",
		"""
		Compares the depth of two object types.

		Types shouldn't be compared as they are, since newer ones may be added in the future. This function returns less than, equal to, or greater than zero
		respectively if {@code type1} objects usually include {@code type2} objects, are the same as {@code type2} objects, or are included in {@code type2}
		objects. If the types can not be compared (because neither is usually contained in the other), #TYPE_UNORDERED is returned. Object types containing
		CPUs can always be compared (usually, a system contains machines which contain nodes which contain packages which contain caches, which contain cores,
		which contain processors).

		#OBJ_PU will always be the deepest.

		This does not mean that the actual topology will respect that order: e.g. as of today cores may also contain caches, and packages may also contain
		nodes. This is thus just to be seen as a fallback comparison method.
		""",

		hwloc_obj_type_t.IN("type1", "the first object type"),
		hwloc_obj_type_t.IN("type2", "the second object type")
	)

	int(
		"topology_init",
		"Allocates a topology context.",

		hwloc_topology_t_p.OUT("topologyp", "returns a pointer to the new allocated context"),

		returnDoc = "0 on success, -1 on error"
	)

	val topology_load = int(
		"topology_load",
		"""
		Builds the actual topology once initialized with #topology_init() and tuned with {@code hwlocality_configuration} and {@code hwlocality_setsource}
		routines. No other routine may be called earlier using this topology context.

        This function may be called only once per topology.
		""",

		hwloc_topology_t.IN("topology", "the topogoly context"),

		returnDoc =
		"""
		0 on success, -1 on error. On failure, the topology is reinitialized. It should be either destroyed with #topology_destroy() or configured and loaded
		again.
		"""
	)

	void(
		"topology_destroy",
		"Terminates and frees a topology context",

		topology_load["topology"]
	)

	int(
		"topology_dup",
		"""
		Duplicates a topology.

		The entire topology structure as well as its objects are duplicated into a new one. This is useful for keeping a backup while modifying a topology.
		""",

		hwloc_topology_t_p.OUT("newtopology", "returns the topology copy"),
		hwloc_topology_t.IN("oldtopology", "the topology to duplicate"),

		returnDoc = "0 on success, -1 on error"
	)

	void(
		"topology_check",
		"""
		Runs internal checks on a topology structure.

		The program aborts if an inconsistency is detected in the given topology. This routine is only useful to developers.

        The input topology should have been previously loaded with #topology_load().
		""",

		topology_load["topology"]
	)

	unsigned_int(
		"topology_get_depth",
		"""
		Get the depth of the hierarchical tree of objects.

		This is the depth of #OBJ_PU objects plus one.
		""",

		topology_load["topology"]
	)

	// Object levels, depths and types

	val get_type_depth = int(
		"get_type_depth",
		"""
		Returns the depth of objects of type {@code type}.

		If no object of this type is present on the underlying architecture, or if the OS doesn't provide this kind of information, the function returns
		#TYPE_DEPTH_UNKNOWN.

		If type is absent but a similar type is acceptable, see also #get_type_or_below_depth() and #get_type_or_above_depth().

		If #OBJ_GROUP is given, the function may return #TYPE_DEPTH_MULTIPLE if multiple levels of Groups exist.

		If an I/O object type is given, the function returns a virtual value because I/O objects are stored in special levels that are not CPU-related. This
		virtual depth may be passed to other hwloc functions such as #get_obj_by_depth() but it should not be considered as an actual depth by the application.
		In particular, it should not be compared with any other object depth or with the entire topology depth.
		""",

		topology_load["topology"],
		hwloc_obj_type_t.IN("type", "the object type")
	)

	hwloc_obj_type_t(
		"get_depth_type",
		"Returns the type of objects at depth {@code depth}.",

		topology_load["topology"],
		unsigned_int.IN("depth", "the depth to query. Should be between 0 and #topology_get_depth() - 1."),

		returnDoc = "{@code (hwloc_obj_type_t) - 1} if depth {@code depth} does not exist"
	)

	unsigned_int(
		"get_nbobjs_by_depth",
		"Returns the width of level at depth {@code depth}.",

		topology_load["topology"],
		unsigned_int.IN("depth", "the depth to query")
	)

	hwloc_obj_t(
		"get_obj_by_depth",
		"Returns the topology object at logical index {@code idx} from depth {@code depth}.",

		topology_load["topology"],
		unsigned_int.IN("depth", "the depth to query"),
		unsigned_int.IN("idx", "the index to query")
	)

	// Converting between Object Types and Attributes, and Strings

	(const..charASCII_p)(
		"type_name",
		"""
		Returns a constant stringified object type.

		This function is the basic way to convert a generic type into a string. The output string may be parsed back by #type_sscanf().

		#obj_type_snprintf() may return a more precise output for a specific object, but it requires the caller to provide the output buffer.
		""",

		get_type_depth["type"]
	)

	int(
		"obj_type_snprintf",
		"""
		Stringifies the type of a given topology object into a human-readable form.

		Contrary to #type_name(), this function includes object-specific  attributes (such as the Group depth, the Bridge type, or OS device type) in the
		output, and it requires the caller to provide the output buffer.

		The output is guaranteed to be the same for all objects of a same topology level.

		The output string may be parsed back by #type_sscanf().
		""",

		nullable..charASCII_p.OUT("string", "a buffer in which to write the output string"),
		AutoSize("string")..size_t.IN("size", "the output buffer size. If {@code size} is 0, {@code string} may safely be $NULL."),
		hwloc_obj_t.IN("obj", "the object to query"),
		int.IN("verbose", "if 1, longer type names are used, e.g. L1Cache instead of L1."),

		returnDoc = "the number of character that were actually written if not truncating, or that would have been written (not including the ending \\0)."
	)

	int(
		"obj_attr_snprintf",
		"""
		Stringifies the attributes of a given topology object into a human-readable form.

		Attribute values are separated by {@code separator}.
		""",

		nullable..charASCII_p.OUT("string", "a buffer in which to write the output string"),
		AutoSize("string")..size_t.IN("size", "the output buffer size. If {@code size} is 0, {@code string} may safely be $NULL"),
		hwloc_obj_t.IN("obj", "the object to query"),
		const..charASCII_p.IN("separator", "the attribute separator"),
		int.IN("verbose", "if 0, only the major attributes are printed"),

		returnDoc = "the number of character that were actually written if not truncating, or that would have been written (not including the ending \\0)."
	)

	int(
		"type_sscanf",
		"""
		Returns an object type and attributes from a type string.

		Converts strings such as "Package" or "L1iCache" into the corresponding types. Matching is case-insensitive, and only the first letters are actually
		required to match.

		The matched object type is set in {@code typep} (which cannot be $NULL).

		Type-specific attributes, for instance Cache type, Cache depth, Group depth, Bridge type or OS Device type may be returned in {@code attrp}. Attributes
		that are not specified in the string (for instance "Group" * without a depth, or "L2Cache" without a cache type) are set to -1.

		{@code attrp} is only filled if not $NULL and if its size specified in {@code attrsize} is large enough. It should be at least as large as
		{@code union hwloc_obj_attr_u}.

		This function is guaranteed to match any string returned by #type_name() or #obj_type_snprintf().
		""",

		const..charASCII_p.IN("string", "the type string"),
		Check(1)..hwloc_obj_type_t_p.OUT("typep", "returns the object type"),
		nullable..hwloc_obj_attr_u.OUT("attrip", "returns the object attributes"),
		AutoSize("attrip")..size_t.IN("attrsize", "the size of {@code attrip}"),

		returnDoc = "0 if a type was correctly identified, otherwise -1"
	)

	int(
		"type_sscanf_as_depth",
		"""
		Returns an object type and its level depth from a type string.

		Converts strings such as "Package" or "L1iCache" into the corresponding types and returns in {@code depthp} the depth of the corresponding level in the
		topology {@code topology}.

		If no object of this type is present on the underlying architecture, #TYPE_DEPTH_UNKNOWN is returned.

		If multiple such levels exist (for instance if giving Group without any depth), the function may return #TYPE_DEPTH_MULTIPLE instead.

		The matched object type is set in {@code typep} if {@code typep} is non $NULL.

		This function is similar to #type_sscanf() followed by #get_type_depth() but it also automatically disambiguates multiple group levels etc.

		This function is guaranteed to match any string returned by #type_name() or #obj_type_snprintf().
		""",

		const..charASCII_p.IN("string", "the type string"),
		Check(1)..hwloc_obj_type_t_p.OUT("typep", "returns the object type"),
		hwloc_topology_t.IN("topology", "the topogoly context"),
		Check(1)..int_p.OUT("depthp", "returns the level depth"),

		returnDoc = "0 if a type was correctly identified, otherwise -1"
	)

	// Consulting and Adding Key-Value Info Attributes

	void(
		"obj_add_info",
		"""
		Adds the given info name and value pair to the given object.

		The info is appended to the existing info array even if another key with the same name already exists.

		The input strings are copied before being added in the object infos.

		This function may be used to enforce object colors in the lstopo graphical output by using "lstopoStyle" as a name and "Background=#rrggbb" as a value.
		See CUSTOM COLORS in the lstopo(1) manpage for details.

		If {@code value} contains some non-printable characters, they will be dropped when exporting to XML, see #topology_export_xml() in hwloc/export.h.
		""",

		hwloc_obj_t.IN("obj", "the object"),
		const..charASCII_p.IN("name", "the name to add"),
		const..charASCII_p.IN("value", "the value to add")
	)

	// Changing the Source of Topology Discovery

	int(
		"topology_set_pid",
		"""
		Changes which process the topology is viewed from.

		On some systems, processes may have different views of the machine, for instance the set of allowed CPUs. By default, hwloc exposes the view from the
		current process. Calling #topology_set_pid() permits to make it expose the topology of the machine from the point of view of another process.
		""",

		topology_load["topology"],
		hwloc_pid_t.IN("pid", "the process ID. It should be a {@code pid_t} on Unix platforms, and a {@code HANDLE} on native Windows platforms."),

		returnDoc = "-1 and {@code errno} is set to Errno##ENOSYS on platforms that do not support this feature."
	)

	int(
		"topology_set_synthetic",
		"""
		Enable synthetic topology.

		Gather topology information from the given {@code description}, a space-separated string of ${code("&lt;type:number&gt;")} describing the object type and
		arity at each level.

        All types may be omitted (space-separated string of numbers) so that hwloc chooses all types according to usual topologies. Setting the environment
        variable {@code HWLOC_SYNTHETIC} may also result in this behavior.

		Note that this function does not actually load topology information; it just tells hwloc where to load it from. You'll still need to invoke
		#topology_load() to actually load the topology information.

		For convenience, this backend provides empty binding hooks which just return success.

		On success, the synthetic component replaces the previously enabled component (if any), but the topology is not actually modified until
		#topology_load().
		""",

		topology_load["topology"],
		const..charASCII_p.IN("description", "the topology description"),

		returnDoc =
		"""
		if {@code description} was properly parsed and describes a valid topology configuration, this function returns 0. Otherwise -1 is returned and
		{@code errno} is set to Errno##EINVAL.
		"""
	)

	int(
		"topology_set_xml",
		"""
		Enables XML-file based topology.

		Gathers topology information from the XML file given at {@code xmlpath}. Setting the environment variable {@code HWLOC_XMLFILE} may also result in this
		behavior. This file may have been generated earlier with #topology_export_xml() in hwloc/export.h, or lstopo file.xml.

		Note that this function does not actually load topology information; it just tells hwloc where to load it from. You'll still need to invoke
		#topology_load() to actually load the topology information.

		See also #topology_set_userdata_import_callback() for importing application-specific object userdata.

		For convenience, this backend provides empty binding hooks which just return success. To have hwloc still actually call OS-specific hooks, the
		#TOPOLOGY_FLAG_IS_THISSYSTEM has to be set to assert that the loaded file is really the underlying system.

		On success, the XML component replaces the previously enabled component (if any), but the topology is not actually modified until #topology_load().
		""",

		topology_load["topology"],
		const..charASCII_p.IN("xmlpath", "the XML file path"),

		returnDoc = "-1 with {@code errno} set to Errno##EINVAL on failure to read the XML file."
	)

	int(
		"topology_set_xmlbuffer",
		"""
		Enable XML based topology using a memory buffer (instead of a file, as with #topology_set_xml()).

		Gather topology information from the XML memory buffer given at {@code buffer} and of length {@code size}. This buffer may have been filled earlier
		with #topology_export_xmlbuffer() in hwloc/export.h.

		Note that this function does not actually load topology information; it just tells hwloc where to load it from. You'll still need to invoke
		#topology_load() to actually load the topology information.

		See also #topology_set_userdata_import_callback() for importing application-specific object userdata.

		For convenience, this backend provides empty binding hooks which just return success. To have hwloc still actually call OS-specific hooks, the
		#TOPOLOGY_FLAG_IS_THISSYSTEM has to be set to assert that the loaded file is really the underlying system.

		On success, the XML component replaces the previously enabled component (if any), but the topology is not actually modified until #topology_load().
		""",

		topology_load["topology"],
		const..charASCII_p.IN("buffer", "the XML buffer"),
		AutoSize("buffer")..int.IN("size", "the size of {@code buffer}"),

		returnDoc = "-1 with {@code errno} set to Errno##EINVAL on failure to read the XML buffer."
	)

	// Topology Detection Configuration and Query

	int(
		"topology_set_flags",
		"""
		Set a OR'ed set of {@code hwloc_topology_flags_e} onto a topology that was not yet loaded.

		If this function is called multiple times, the last invokation will erase and replace the set of flags that was previously set.

		The flags set in a topology may be retrieved with #topology_get_flags().
		""",

		topology_load["topology"],
		unsigned_long.IN("flags", "the topology flags", TopologyFlags, LinkMode.BITFIELD)
	)

	unsigned_long(
		"topology_get_flags",
		"Gets the OR'ed set of {@code hwloc_topology_flags_e} of a topology.",

		topology_load["topology"],

		returnDoc = "the flags previously set with #topology_set_flags()"
	)

	int(
		"topology_is_thissystem",
		"Does the topology context come from this system?",

		topology_load["topology"],

		returnDoc =
		"""
	    1 if this topology context was built using the system running this program. 0 instead (for instance if using another file-system root, a XML topology
	    file, or a synthetic topology).
	    """
	)

	(const..hwloc_topology_support_p)(
		"topology_get_support",
		"Retrieves the topology support.",

		topology_load["topology"]
	)

	int(
		"topology_set_distance_matrix",
		"""
		Provides the matrix of distances between a set of objects of the given type.

		The set may or may not contain all the existing objects of this type. The objects are specified by their OS/physical index in the {@code os_index}
		array. The {@code distances} matrix follows the same order. The distance from object i to object j in the {@code i*nbobjs+j}.

		A single latency matrix may be defined for each type. If another distance matrix already exists for the given type, either because the user specified
		it or because the OS offers it, it will be replaced by the given one.

		If {@code nbobjs} is 0, {@code os_index} is $NULL and {@code distances} is $NULL, the existing distance matrix for the given type is removed.

        Distance matrices are ignored in multi-node topologies.
		""",

		topology_load["topology"],
		get_type_depth["type"],
		AutoSize("os_index", "distances")..unsigned_int.IN("nbobjs", "the number of objects"),
		nullable..unsigned_int_p.IN("os_index", "an array of OS/physical indices"),
		nullable..float_p.IN("distances", "an array of distances")
	)

	void(
		"topology_set_userdata",
		"""
		Sets the topology-specific userdata pointer.

		Each topology may store one application-given private data pointer. It is initialized to $NULL. hwloc will never modify it.

		Use it as you wish, after #topology_init() and until #topology_destroy().

		This pointer is not exported to XML.
		""",

		topology_load["topology"],
		const..voidptr.IN("userdata", "the user data pointer")
	)

	voidptr(
		"topology_get_userdata",
		"Retrieves the application-given private data pointer that was previously set with #topology_set_userdata().",

		topology_load["topology"]
	)

	// Modifying a loaded Topology

	int(
		"topology_restrict",
		"""
		Restricts the topology to the given CPU set.

		Topology {@code topology} is modified so as to remove all objects that are not included (or partially included) in the CPU set {@code cpuset}. All
		objects CPU and node sets are restricted accordingly.

		This call may not be reverted by restricting back to a larger cpuset. Once dropped during restriction, objects may not be brought back, except by
		loading another topology with #topology_load().
		""",

		topology_load["topology"],
		hwloc_const_cpuset_t.IN("cpuset", "the CPU set to restrict"),
		unsigned_long.IN("flags", "an OR'ed set of {@code hwloc_restrict_flags_e}", RestrictFlags, LinkMode.BITFIELD),

		returnDoc =
		"""
		0 on success.

		-1 with {@code errno} set to Errno##EINVAL if the input cpuset is invalid. The topology is not modified in this case.

		-1 with {@code errno} set to Errno##ENOMEM on failure to allocate internal data. The topology is reinitialized in this case. It should be either
		destroyed with #topology_destroy() or configured and loaded again.
	    """
	)

	hwloc_obj_t(
		"topology_insert_misc_object",
		"""
		Adds a MISC object as a leaf of the topology.

		A new MISC object will be created and inserted into the topology at the position given by parent. It is appended to the list of existing Misc children,
		without ever adding any intermediate hierarchy level. This is useful for annotating the topology without actually changing the hierarchy.

		{@code name} will be copied to the setup the new object attributes. However, the new leaf object will not have any {@code cpuset}.

		If {@code name} contains some non-printable characters, they will be dropped when exporting to XML, see #topology_export_xml() in hwloc/export.h.
		""",

		topology_load["topology"],
		hwloc_obj_t.IN("parent", "the parent object"),
		const..charASCII_p.IN("name", "the object name"),

		returnDoc = "the newly-created object"
	)

	hwloc_obj_t(
		"topology_alloc_group_object",
		"""
		Allocates a Group object to insert later with #topology_insert_group_object().

		This function returns a new Group object. The caller should (at least) initialize its sets before inserting the object. See
		#topology_insert_group_object().

		Custom name/value info pairs may be added with #obj_add_info() after insertion. For instance the Type info key allows to display something else than
		"Group" as the type name for this object in lstopo.

		It is recommended not to set any other object attribute before insertion, since the Group may get discarded during insertion.

		The object will be destroyed if passed to #topology_insert_group_object() without any set defined.
		""",

		topology_load["topology"]
	)

	hwloc_obj_t(
		"topology_insert_group_object",
		"""
		Adds more structure to the topology by adding an intermediate Group.

		The caller should first allocate a new Group object with #topology_alloc_group_object(). Then it must initialize some of its sets to specify the final
		location of the Group in the topology. Then the object can be passed to this function for actual insertion in the topology.

		Either the cpuset or nodeset field (or both, if compatible) may be used to do so. If inserting with respect to the complete topology (including
		disallowed, offline or unknown object), complete_cpuset and/or complete_nodeset may be used instead. If grouping several objects,
		#obj_add_other_obj_sets() is an easy way to build the Group sets iteratively.
		""",

		topology_load["topology"],
		hwloc_obj_t.IN("group", "the group object to insert"),

		returnDoc =
		"""
		the inserted object if it was properly inserted.

		An existing object if the Group was discarded because the topology already contained an object at the same location (the Group did not add any locality
		information). Any name/info key pair set before inserting is appended to the existing object.

		$NULL if the insertion failed because of conflicting sets in topology tree.

		$NULL if Group objects are always ignored in the topology.

		$NULL if the object was discarded because no set was initialized in the Group before insert, or all of them were empty.
		"""
	)

	int(
		"obj_add_other_obj_sets",
		"""
		Setup object cpusets/nodesets by OR'ing another object's sets.

		For each defined cpuset or nodeset in {@code src}, allocate the corresponding set in {@code dst} and add {@code src} to it by OR'ing sets.

		This function is convenient between #topology_alloc_group_object() and #topology_insert_group_object(). It builds the sets of the new Group that will
		be inserted as a new intermediate parent of several objects.
		""",

		hwloc_obj_t.IN("dst", "the destination object"),
		hwloc_obj_t.IN("src", "the source object")
	)
}