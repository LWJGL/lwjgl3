/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.hwloc.templates

import org.lwjgl.generator.*
import org.lwjgl.hwloc.*

val hwloc_membind = "HWLocMemBind".nativeClass(HWLOC_PACKAGE, prefix = "HWLOC_", binding = HWLOC_BINDING_DELEGATE) {
	javaImport("org.lwjgl.system.libc.Errno")

	documentation =
		"""
		Native bindings to hwloc's memory binding functionality.

		Memory binding can be done three ways:
		${ul(
			"explicit memory allocation thanks to #alloc_membind() and friends: the binding will have effect on the memory allocated by these functions.",
			"""
		    implicit memory binding through binding policy: #set_membind() and friends only define the current policy of the process, which will be applied to
		    the subsequent calls to malloc() and friends.
		    """,
			"migration of existing memory ranges, thanks to #set_area_membind() and friends, which move already-allocated data."
		)}
		Not all operating systems support all three ways. HWLoc#topology_get_support() may be used to query about the actual memory binding support in the currently
		used operating system.

		When the requested binding operation is not available and the #MEMBIND_STRICT flag was passed, the function returns -1. {@code errno} will be set to
		Errno##ENOSYS when the system does support the specified action or policy (e.g., some systems only allow binding memory on a per-thread basis, whereas
		other systems only allow binding memory for all threads in a process). {@code errno} will be set to Errno##EXDEV when the requested cpuset can not be
		enforced (e.g., some systems only allow binding memory to a single NUMA node).

		If #MEMBIND_STRICT was not passed, the function may fail as well, or the operating system may use a slightly different operation (with side-effects,
		smaller binding set, etc.) when the requested operation is not exactly supported.

		The most portable form that should be preferred over the others whenever possible is as follows. It allocates some memory hopefully bound to the
		specified set. To do so, hwloc will possibly have to change the current memory binding policy in order to actually get the memory bound, if the OS does
		not provide any other way to simply allocate bound memory without changing the policy for all allocations. That is the difference with #alloc_membind(),
		which will never change the current memory binding policy.
		${codeBlock("""
hwloc_alloc_membind_policy(topology, size, set,
                           HWLOC_MEMBIND_BIND, 0);""")}
		Each hwloc memory binding function is available in two forms: one that takes a CPU set argument and another that takes a NUMA memory node set argument
		(see {@code hwlocality_object_sets} and {@code hwlocality_bitmap} for a discussion of CPU sets and NUMA memory node sets). The names of the latter form
		end with _nodeset. It is also possible to convert between CPU set and node set using #cpuset_to_nodeset() or #cpuset_from_nodeset().

		Some example codes are available under doc/examples/ in the source tree.

		On some operating systems, memory binding affects the CPU binding; see #MEMBIND_NOCPUBIND.
		"""

	val MembindPolicy = EnumConstant(
		"""
		Memory binding policy.

		These constants can be used to choose the binding policy. Only one policy can be used at a time (i.e., the values cannot be OR'ed together).

		Not all systems support all kinds of binding. HWLoc#topology_get_support() may be used to query about the actual memory binding policy support in the
		currently used operating system. See the "Detailed Description" section of {@code hwlocality_membinding} for a description of errors that can occur.
		""",

		"MEMBIND_DEFAULT" enum
			"""
			Reset the memory allocation policy to the system default.

			Depending on the operating system, this may correspond to #MEMBIND_FIRSTTOUCH (Linux), or #MEMBIND_BIND (AIX, HP-UX, Solaris, Windows).
		""",
		"MEMBIND_FIRSTTOUCH" enum
			"""
			Allocate memory but do not immediately bind it to a specific locality. Instead, each page in the allocation is bound only when it is first touched.
			Pages are individually bound to the local NUMA node of the first thread that touches it. If there is not enough memory on the node, allocation may
			be done in the specified cpuset before allocating on other nodes.
			""",
		"MEMBIND_BIND" enum "Allocate memory on the specified nodes.",
		"MEMBIND_INTERLEAVE" enum
			"""
			Allocate memory on the given nodes in an interleaved / round-robin manner. The precise layout of the memory across multiple NUMA nodes is OS/system
			specific. Interleaving can be useful when threads distributed across the specified NUMA nodes will all be accessing the whole memory range
			concurrently, since the interleave will then balance the memory references.
			""",
		"MEMBIND_NEXTTOUCH" enum
			"""
			For each page bound with this policy, by next time it is touched (and next time only), it is moved from its current location to the local NUMA node
			of the thread where the memory reference occurred (if it needs to be moved at all).
			""",
		"MEMBIND_MIXED".enum("Returned by get_membind() functions when multiple threads or parts of a memory area have differing memory binding policies.", -1)
	).javaDocLinks

	val MembindFlags = EnumConstant(
		"""
		Memory binding flags.

		These flags can be used to refine the binding policy. All flags can be logically OR'ed together with the exception of #MEMBIND_PROCESS and
		#MEMBIND_THREAD; these two flags are mutually exclusive.

		Not all systems support all kinds of binding. HWLoc#topology_get_support() may be used to query about the actual memory binding support in the
		currently used operating system. See the "Detailed Description" section of {@code hwlocality_membinding} for a description of errors that can occur.
		""",

		"MEMBIND_PROCESS".enumExpr(
			"Set policy for all threads of the specified (possibly multithreaded) process. This flag is mutually exclusive with #MEMBIND_THREAD.",
			"(1<<0)"
		),
		"MEMBIND_THREAD".enumExpr(
			"Set policy for a specific thread of the current process. This flag is mutually exclusive with #MEMBIND_PROCESS.",
			"(1<<1)"
		),
		"MEMBIND_STRICT".enumExpr(
			"""
		    Request strict binding from the OS. The function will fail if* the binding can not be guaranteed / completely enforced.

			This flag has slightly different meanings depending on which function it is used with.
		    """,
			"(1<<2)"
		),
		"MEMBIND_MIGRATE".enumExpr(
			"Migrate existing allocated memory. If the memory cannot be migrated and the #MEMBIND_STRICT flag is passed, an error will be returned.",
			"(1<<3)"
		),
		"MEMBIND_NOCPUBIND".enumExpr(
			"""
			Avoid any effect on CPU binding.

			On some operating systems, some underlying memory binding functions also bind the application to the corresponding CPU(s). Using this flag will
			cause hwloc to avoid using OS functions that could potentially affect CPU bindings. Note, however, that using NOCPUBIND may reduce hwloc's overall
			memory binding support. Specifically: some of hwloc's memory binding functions may fail with {@code errno} set to Errno##ENOSYS when used with
			NOCPUBIND.
			""",
			"(1<<4)"
		)
	).javaDocLinks

	val set_membind_nodeset = int(
		"set_membind_nodeset",
		"""
		Sets the default memory binding policy of the current process or thread to prefer the NUMA node(s) specified by physical {@code nodeset}

		If neither #MEMBIND_PROCESS nor #MEMBIND_THREAD is specified, the current process is assumed to be single-threaded. This is the most portable form as
		it permits hwloc to use either process-based OS functions or thread-based OS functions, depending on which are available.
 		""",

		hwloc_topology_t.IN("topology", "the topogoly context"),
		hwloc_const_nodeset_t.IN("nodeset", "the physical nodeset"),
		hwloc_membind_policy_t.IN("policy", "the memory binding policy", MembindPolicy),
		int.IN("flags", "the memory binding flags", MembindFlags, LinkMode.BITFIELD),

		returnDoc =
		"""
		-1 with {@code errno} set to Errno##ENOSYS if the action is not supported

 		-1 with {@code errno} set to Errno##EXDEV if the binding cannot be enforced
		"""
	)

	val set_membind = int(
		"set_membind",
		"""
		Sets the default memory binding policy of the current process or thread to prefer the NUMA node(s) near the specified physical {@code cpuset}

		If neither #MEMBIND_PROCESS nor #MEMBIND_THREAD is specified, the current process is assumed to be single-threaded. This is the most portable form as
		it permits hwloc to use either process-based OS functions or thread-based OS functions, depending on which are available.
		""",

		set_membind_nodeset["topology"],
		hwloc_const_cpuset_t.IN("cpuset", "the physical cpuset"),
		set_membind_nodeset["policy"],
		set_membind_nodeset["flags"],
		returnDoc =
		"""
	 	-1 with {@code errno} set to Errno##ENOSYS if the action is not supported

 		-1 with {@code errno} set to Errno##EXDEV if the binding cannot be enforced
		"""
	)

	val get_membind_nodeset = int(
		"get_membind_nodeset",
		"""
		Queries the default memory binding policy and physical locality of the current process or thread.

		This function has two output parameters: {@code nodeset} and {@code policy}. The values returned in these parameters depend on both the {@code flags}
		passed in and the current memory binding policies and nodesets in the queried target.

		Passing the #MEMBIND_PROCESS flag specifies that the query target is the current policies and nodesets for all the threads in the current process.
		Passing #MEMBIND_THREAD specifies that the query target is the current policy and nodeset for only the thread invoking this function.

		If neither of these flags are passed (which is the most portable method), the process is assumed to be single threaded. This allows hwloc to use either
		process-based OS functions or thread-based OS functions, depending on which are available.

		#MEMBIND_STRICT is only meaningful when #MEMBIND_PROCESS is also specified. In this case, hwloc will check the default memory policies and nodesets for
		all threads in the process. If they are not identical, -1 is returned and {@code errno} is set to Errno##EXDEV. If they are identical, the values are
		returned in {@code nodeset} and {@code policy}.

		Otherwise, if #MEMBIND_PROCESS is specified (and #MEMBIND_STRICT is not specified), {@code nodeset} is set to the logical OR of all threads' default
		nodeset. If all threads' default policies are the same, {@code policy} is set to that policy. If they are different, {@code policy} is set to
		#MEMBIND_MIXED.

		In the #MEMBIND_THREAD case (or when neither #MEMBIND_PROCESS or #MEMBIND_THREAD is specified), there is only one nodeset and policy; they are returned
		in {@code nodeset} and {@code policy}, respectively.

		If any other flags are specified, -1 is returned and {@code errno} is set to Errno##EINVAL.
		""",

		set_membind_nodeset["topology"],
		hwloc_nodeset_t.OUT("nodeset", "returns the physical nodeset"),
		Check(1)..hwloc_membind_policy_t_p.OUT("policy", "returns the memory binding policy"),
		set_membind_nodeset["flags"]
	)

	val get_membind = int(
		"get_membind",
		"""
		Queries the default memory binding policy and physical locality of the current process or thread (the locality is returned in {@code cpuset} as CPU
		near the locality's actual NUMA node(s)).

		This function has two output parameters: {@code cpuset} and {@code policy}. The values returned in these parameters depend on both the {@code flags}
		passed in and the current memory binding policies and nodesets in the queried target.

		Passing the #MEMBIND_PROCESS flag specifies that the query target is the current policies and nodesets for all the threads in the current process.
		Passing #MEMBIND_THREAD specifies that the query target is the current policy and nodeset for only the thread invoking this function.

		If neither of these flags are passed (which is the most portable method), the process is assumed to be single threaded. This allows hwloc to use either
		process-based OS functions or thread-based OS functions, depending on which are available.

		#MEMBIND_STRICT is only meaningful when #MEMBIND_PROCESS is also specified. In this case, hwloc will check the default memory policies and nodesets for
		all threads in the process. If they are not identical, -1 is returned and {@code errno} is set to Errno##EXDEV. If they are identical, the policy is
		returned in {@code policy}. {@code cpuset} is set to the union of CPUs near the NUMA node(s) in the nodeset.

		Otherwise, if #MEMBIND_PROCESS is specified (and #MEMBIND_STRICT is \em not specified), the default nodeset from each thread is logically OR'ed
		together. {@code cpuset} is set to the union of CPUs near the NUMA node(s) in the resulting nodeset. If all threads' default policies are the same,
		{@code policy} is set to that policy. If they are different, {@code policy} is set to #MEMBIND_MIXED.

		In the #MEMBIND_THREAD case (or when neither #MEMBIND_PROCESS or #MEMBIND_THREAD is specified), there is only one nodeset and policy. The policy is
		returned in {@code policy}; {@code cpuset} is set to the union of CPUs near the NUMA node(s) in the {@code nodeset}.

		If any other flags are specified, -1 is returned and {@code errno} is set to Errno##EINVAL.
		""",

		set_membind_nodeset["topology"],
		hwloc_cpuset_t.OUT("cpuset", "returns the physical cpuset"),
		get_membind_nodeset["policy"],
		set_membind_nodeset["flags"]
	)

	val set_proc_membind_nodeset = int(
		"set_proc_membind_nodeset",
		"Sets the default memory binding policy of the specified process to prefer the NUMA node(s) specified by physical {@code nodeset}.",

		set_membind_nodeset["topology"],
		hwloc_pid_t.IN("pid", "the process ID. It should be a {@code pid_t} on Unix platforms, and a {@code HANDLE} on native Windows platforms."),
		set_membind_nodeset["nodeset"],
		set_membind_nodeset["policy"],
		set_membind_nodeset["flags"],

		returnDoc =
		"""
		-1 with {@code errno} set to Errno##ENOSYS if the action is not supported

		-1 with {@code errno} set to Errno##EXDEV if the binding cannot be enforced
		"""
	)

	int(
		"set_proc_membind",
		"Sets the default memory binding policy of the specified process to prefer the NUMA node(s) near the specified physical {@code cpuset}.",

		set_membind_nodeset["topology"],
		set_proc_membind_nodeset["pid"],
		set_membind["cpuset"],
		set_membind_nodeset["policy"],
		set_membind_nodeset["flags"],

		returnDoc =
		"""
		-1 with {@code errno} set to Errno##ENOSYS if the action is not supported

		-1 with {@code errno} set to Errno##EXDEV if the binding cannot be enforced
		"""
	)

	int(
		"get_proc_membind_nodeset",
		"""
		Queries the default memory binding policy and physical locality of the specified process.

		This function has two output parameters: {@code nodeset} and {@code policy}. The values returned in these parameters depend on both the {@code flags}
		passed in and the current memory binding policies and nodesets in the queried target.

		Passing the #MEMBIND_PROCESS flag specifies that the query target is the current policies and nodesets for all the threads in the specified process. If
		#MEMBIND_PROCESS is not specified (which is the most portable method), the process is assumed to be single threaded. This allows hwloc to use either
		process-based OS functions or thread-based OS functions, depending on which are available.

		Note that it does not make sense to pass #MEMBIND_THREAD to this function.

		If #MEMBIND_STRICT is specified, hwloc will check the default memory policies and nodesets for all threads in the specified process. If they are not
		identical, -1 is returned and {@code errno} is set to Errno##EXDEV. If they are identical, the values are returned in {@code nodeset} and {@code policy}.

		Otherwise, {@code nodeset} is set to the logical OR of all threads' default nodeset. If all threads' default policies are the same, {@code policy} is
		set to that policy. If they are different, {@code policy} is set to #MEMBIND_MIXED.

		If any other flags are specified, -1 is returned and {@code errno} is set to Errno##EINVAL.
		""",

		set_membind_nodeset["topology"],
		set_proc_membind_nodeset["pid"],
		get_membind_nodeset["nodeset"],
		get_membind_nodeset["policy"],
		set_membind_nodeset["flags"]
	)

	int(
		"get_proc_membind",
		"""
		Queries the default memory binding policy and physical locality of the specified process (the locality is returned in {@code cpuset} as CPUs near the
		locality's actual NUMA node(s)).

		This function has two output parameters: {@code cpuset} and {@code policy}. The values returned in these parameters depend on both the {@code flags}
		passed in and the current memory binding policies and nodesets in the queried target.

		Passing the #MEMBIND_PROCESS flag specifies that the query target is the current policies and nodesets for all the threads in the specified process. If
		#MEMBIND_PROCESS is not specified (which is the most portable method), the process is assumed to be single threaded. This allows hwloc to use either
		process-based OS functions or thread-based OS functions, depending on which are available.

		Note that it does not make sense to pass #MEMBIND_THREAD to this function.

		If #MEMBIND_STRICT is specified, hwloc will check the default memory policies and nodesets for all threads in the specified process. If they are not
		identical, -1 is returned and {@code errno} is set to Errno##EXDEV. If they are identical, the policy is returned in {@code policy}. {@code cpuset} is
		set to the union of CPUs near the NUMA node(s) in the nodeset.

		Otherwise, the default nodeset from each thread is logically OR'ed together. {@code cpuset} is set to the union of CPUs near the NUMA node(s) in the
		resulting nodeset. If all threads' default policies are the same, {@code policy} is set to that policy. If they are different, {@code policy} is set to
		#MEMBIND_MIXED.

		If any other flags are specified, -1 is returned and {@code errno} is set to Errno##EINVAL.
		""",

		set_membind_nodeset["topology"],
		set_proc_membind_nodeset["pid"],
		get_membind["cpuset"],
		get_membind_nodeset["policy"],
		set_membind_nodeset["flags"]
	)

	val set_area_membind_nodeset = int(
		"set_area_membind_nodeset",
		"Binds the already-allocated memory identified by {@code (addr, len)} to the NUMA node(s) in physical {@code nodeset}.",

		set_membind_nodeset["topology"],
		const..void_p.IN("addr", "the address to bind"),
		AutoSize("addr")..size_t.IN("len", "the size of the allocated memory"),
		set_membind_nodeset["nodeset"],
		set_membind_nodeset["policy"],
		set_membind_nodeset["flags"],

		returnDoc =
		"""
		-1 with {@code errno} set to Errno##ENOSYS if the action is not supported.

		-1 with {@code errno} set to Errno##EXDEV if the binding cannot be enforced.
		"""
	)

	int(
		"set_area_membind",
		"Binds the already-allocated memory identified by {@code (addr, len)} to the NUMA node(s) near physical {@code cpuset}.",

		set_membind_nodeset["topology"],
		set_area_membind_nodeset["addr"],
		set_area_membind_nodeset["len"],
		set_membind["cpuset"],
		set_membind_nodeset["policy"],
		set_membind_nodeset["flags"],

		returnDoc =
		"""
		-1 with {@code errno} set to Errno##ENOSYS if the action is not supported.

		-1 with {@code errno} set to Errno##EXDEV if the binding cannot be enforced.
		"""
	)

	int(
		"get_area_membind_nodeset",
		"""
		Queries the physical NUMA node(s) and binding policy of the memory identified by {@code (addr, len)}.

		This function has two output parameters: {@code nodeset} and {@code policy}. The values returned in these parameters depend on both the {@code flags}
		passed in and the memory binding policies and nodesets of the pages in the address range.

		If #MEMBIND_STRICT is specified, the target pages are first checked to see if they all have the same memory binding policy and nodeset. If they do not,
		-1 is returned and {@code errno} is set to Errno##EXDEV. If they are identical across all pages, the nodeset and policy are returned in {@code nodeset}
		and {@code policy}, respectively.

		If #MEMBIND_STRICT is not specified, {@code nodeset} is set to the union of all NUMA node(s) containing pages in the address range. If all pages in the
		target have the same policy, it is returned in {@code policy}. Otherwise, {@code policy} is set to #MEMBIND_MIXED.

		If any other flags are specified, -1 is returned and {@code errno} is set to Errno##EINVAL.
		""",

		set_membind_nodeset["topology"],
		set_area_membind_nodeset["addr"],
		set_area_membind_nodeset["len"],
		get_membind_nodeset["nodeset"],
		get_membind_nodeset["policy"],
		set_membind_nodeset["flags"]
	)

	int(
		"get_area_membind",
		"""
		Queries the CPUs near the physical NUMA node(s) and binding policy of the memory identified by {@code (addr, len)}.

		This function has two output parameters: {@code cpuset} and {@code policy}. The values returned in these parameters depend on both the {@code flags}
		passed in and the memory binding policies and nodesets of the pages in the address range.

		If #MEMBIND_STRICT is specified, the target pages are first checked to see if they all have the same memory binding policy and nodeset. If they do not,
		-1 is returned and {@code errno} is set to Errno##EXDEV. If they are identical across all pages, the policy is returned in {@code policy}.
		{@code cpuset} is set to the union of CPUs near the NUMA node(s) in the nodeset.

		If #MEMBIND_STRICT is not specified, the union of all NUMA node(s) containing pages in the address range is calculated. {@code cpuset} is then set to
		the CPUs near the NUMA node(s) in this union. If all pages in the target have the same policy, it is returned in {@code policy}. Otherwise,
		{@code policy} is set to #MEMBIND_MIXED.

		If any other flags are specified, -1 is returned and {@code errno} is set to Errno##EINVAL.
		""",

		set_membind_nodeset["topology"],
		set_area_membind_nodeset["addr"],
		set_area_membind_nodeset["len"],
		get_membind["cpuset"],
		get_membind_nodeset["policy"],
		set_membind_nodeset["flags"]
	)

	val alloc = void_p(
		"alloc",
		"""
		Allocates some memory.

		This is equivalent to malloc(), except that it tries to allocate page-aligned memory from the OS.

		The allocated memory should be freed with #free().
		""",
		set_membind_nodeset["topology"],
		AutoSizeResult..size_t.IN("len", "the number of bytes to allocate")
	)

	void_p(
		"alloc_membind_nodeset",
		"""
		Allocates some memory on the given physical nodeset {@code nodeset}.

		The allocated memory should be freed with #free().
		""",

		set_membind_nodeset["topology"],
		alloc["len"],
		set_membind_nodeset["nodeset"],
		set_membind_nodeset["policy"],
		set_membind_nodeset["flags"],

		returnDoc =
		"""
		$NULL with {@code errno} set to Errno##ENOSYS if the action is not supported and #MEMBIND_STRICT is given.

		$NULL with {@code errno} set to Errno##EXDEV if the binding cannot be enforced and #MEMBIND_STRICT is given.

		$NULL with {@code errno} set to ENOMEM if the memory allocation failed even before trying to bind.
		"""
	)

	void_p(
		"alloc_membind",
		"""
		Allocates some memory on memory nodes near the given physical cpuset {@code cpuset}.

		The allocated memory should be freed with #free().
		""",

		set_membind_nodeset["topology"],
		alloc["len"],
		set_membind["cpuset"],
		set_membind_nodeset["policy"],
		set_membind_nodeset["flags"],

		returnDoc =
		"""
		$NULL with {@code errno} set to Errno##ENOSYS if the action is not supported and #MEMBIND_STRICT is given.

		$NULL with {@code errno} set to Errno##EXDEV if the binding cannot be enforced and #MEMBIND_STRICT is given.

		$NULL with {@code errno} set to ENOMEM if the memory allocation failed even before trying to bind.
		"""
	)

	int(
		"free",
		"Frees memory that was previously allocated by #alloc() or #alloc_membind().",

		set_membind_nodeset["topology"],
		void_p.IN("addr", "address of the memory to free"),
		AutoSize("addr")..size_t.IN("len", "the size of the allocated memory")
	)
}