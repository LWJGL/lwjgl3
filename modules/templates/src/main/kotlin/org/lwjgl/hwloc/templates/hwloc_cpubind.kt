/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.hwloc.templates

import org.lwjgl.generator.*
import org.lwjgl.hwloc.*

val hwloc_cpubind = "HWLocCPUBind".nativeClass(HWLOC_PACKAGE, prefix = "HWLOC_", binding = HWLOC_BINDING_DELEGATE) {
	javaImport("org.lwjgl.system.libc.Errno")

	documentation =
		"""
		Native bindings to hwloc's CPU binding functionality.

		It is often useful to call hwloc_bitmap_singlify() first so that a single CPU remains in the set. This way, the process will not even migrate between
		different CPUs inside the given set. Some operating systems also only support that kind of binding.

		Some operating systems do not provide all hwloc-supported mechanisms to bind processes, threads, etc. HWLoc#topology_get_support() may be used to query
		about the actual CPU binding support in the currently used operating system.

		When the requested binding operation is not available and the #CPUBIND_STRICT flag was passed, the function returns -1. {@code errno} is set to
		Errno##ENOSYS when it is not possible to bind the requested kind of object processes/threads. {@code errno} is set to Errno##EXDEV when the requested
		cpuset can not be enforced (e.g. some systems only allow one CPU, and some other systems only allow one NUMA node).

		If #CPUBIND_STRICT was not passed, the function may fail as well, or the operating system may use a slightly different operation (with side-effects,
		smaller binding set, etc.) when the requested operation is not exactly supported.

		The most portable version that should be preferred over the others, whenever possible, is the following one which just binds the current program,
		assuming it is single-threaded:
		${codeBlock("""
hwloc_set_cpubind(topology, set, 0)""")}

		If the program may be multithreaded, the following one should be preferred to only bind the current thread:
		${codeBlock("""
hwloc_set_cpubind(topology, set, HWLOC_CPUBIND_THREAD)""")}

		Some example codes are available under doc/examples/ in the source tree.

		To unbind, just call the binding function with either a full cpuset or a cpuset equal to the system cpuset.

		On some operating systems, CPU binding may have effects on memory binding, see #CPUBIND_NOMEMBIND.

		Running lstopo --top or hwloc-ps can be a very convenient tool to check how binding actually happened.
		"""

	val hwloc_cpubind_flags_t = EnumConstant(
		"""
		Process/Thread binding flags.

		These bit flags can be used to refine the binding policy.

		The default (0) is to bind the current process, assumed to be single-threaded, in a non-strict way. This is the most portable way to bind as all
		operating systems usually provide it.

		Not all systems support all kinds of binding. See the "Detailed Description" section of {@code hwlocality_cpubinding} for a description of errors that
		can occur.
		""",

		"CPUBIND_PROCESS".enumExpr("Bind all threads of the current (possibly) multithreaded process.", "(1<<0)"),
		"CPUBIND_THREAD".enumExpr("Bind current thread of current process.", "(1<<1)"),
		"CPUBIND_STRICT".enumExpr(
			"""
		    Request for strict binding from the OS.

			By default, when the designated CPUs are all busy while other CPUs are idle, operating systems may execute the thread/process on those other CPUs
			instead of the designated CPUs, to let them progress anyway. Strict binding means that the thread/process will <b>never</b> execute on other cpus
			than the designated CPUs, even when those are busy with other tasks and other CPUs are idle.

			Depending on the operating system, strict binding may not be possible (e.g., the OS does not implement it) or not allowed (e.g., for administrative
			reasons), and the function will fail in that case.

			When retrieving the binding of a process, this flag checks whether all its threads actually have the same binding. If the flag is not given, the
			binding of each thread will be accumulated.

			This flag is meaningless when retrieving the binding of a thread.
		    """,
			"(1<<2)"
		),
		"CPUBIND_NOMEMBIND".enumExpr(
			"""
		    Avoid any effect on memory binding.

			On some operating systems, some CPU binding function would also bind the memory on the corresponding NUMA node. It is often not a problem for the
			application, but if it is, setting this flag will make hwloc avoid using OS functions that would also bind memory. This will however reduce the
			support of CPU bindings, i.e. potentially return -1 with {@code errno} set to Errno##ENOSYS in some cases.

			This flag is only meaningful when used with functions that set the CPU binding. It is ignored when used with functions that get CPU binding
			information.
		    """,
			"(1<<3)"
		)
	).javaDocLinks

	val set_cpubind = int(
		"set_cpubind",
		"Bind current process or thread on cpus given in physical bitmap {@code set}.",

		hwloc_topology_t.IN("topology", "the topogoly context"),
		hwloc_const_cpuset_t.IN("set", "the physical cpuset"),
		int.IN("flags", "the binding policy flags", hwloc_cpubind_flags_t, LinkMode.BITFIELD),

		returnDoc =
		"""
	    -1 with {@code errno} set to Errno##ENOSYS if the action is not supported.

	    -1 with {@code errno} set to Errno##EXDEV if the binding cannot be enforced.
	    """
	)

	val get_cpubind = int(
		"get_cpubind",
		"""
		Gets current process or thread binding.

		Writes into {@code set} the physical cpuset which the process or thread (according to {@code flags}) was last bound to.
		""",

		set_cpubind["topology"],
		hwloc_cpuset_t.OUT("set", "the physical cpuset"),
		set_cpubind["flags"]
	)

	val set_proc_cpubind = int(
		"set_proc_cpubind",
		"""
		Bind a process {@code pid} on cpus given in physical bitmap {@code set}.

		As a special case on Linux, if a tid (thread ID) is supplied instead of a pid (process ID) and #CPUBIND_THREAD is passed in flags, the binding is
		applied to that specific thread.

		On non-Linux systems, #CPUBIND_THREAD can not be used in {@code flags}.
		""",

		set_cpubind["topology"],
		hwloc_pid_t.IN("pid", "the process ID. It shoudl be a {@code pid_t} on Unix platforms, and a {@code HANDLE} on native Windows platforms."),
		set_cpubind["set"],
		set_cpubind["flags"]
	)

	int(
		"get_proc_cpubind",
		"""
		Gets the current physical binding of process {@code pid}.

        As a special case on Linux, if a tid (thread ID) is supplied instead of a pid (process ID) and #CPUBIND_THREAD is passed in flags, the binding for that
        specific thread is returned.

        On non-Linux systems, #CPUBIND_THREAD can not be used in {@code flags}.
		""",

		set_cpubind["topology"],
		set_proc_cpubind["pid"],
		get_cpubind["set"],
		set_cpubind["flags"]
	)

	val set_thread_cpubind = int(
		"set_thread_cpubind",
		"""
		Binds a thread {@code thread} on cpus given in physical bitmap {@code set}.

		#CPUBIND_PROCESS can not be used in {@code flags}.
		""",

		set_cpubind["topology"],
		hwloc_thread_t.IN("thread", "the thread ID. It should be a {@code pthread_t} on Unix platforms, and {@code HANDLE} on native Windows platforms."),
		set_cpubind["set"],
		set_cpubind["flags"]
	)

	int(
		"get_thread_cpubind",
		"""
		Gets the current physical binding of thread {@code tid}.

		#CPUBIND_PROCESS can not be used in {@code flags}.
		""",

		set_cpubind["topology"],
		set_thread_cpubind["thread"],
		get_cpubind["set"],
		set_cpubind["flags"]
	)

	int(
		"get_last_cpu_location",
		"""
		Gets the last physical CPU where the current process or thread ran.

		The operating system may move some tasks from one processor to another at any time according to their binding, so this function may return something
		that is already outdated.

		{@code flags} can include either #CPUBIND_PROCESS or #CPUBIND_THREAD to specify whether the query should be for the whole process (union of all CPUs on
		which all threads are running), or only the current thread. If the process is single-threaded, flags can be set to zero to let hwloc use whichever
		method is available on the underlying OS.
		""",

		set_cpubind["topology"],
		get_cpubind["set"],
		set_cpubind["flags"]
	)

	int(
		"get_proc_last_cpu_location",
		"""
		Gets the last physical CPU where a process ran.

		The operating system may move some tasks from one processor to another at any time according to their binding, so this function may return something
		that is already outdated.

		As a special case on Linux, if a tid (thread ID) is supplied instead of a pid (process ID) and #CPUBIND_THREAD is passed in flags, the last CPU
		location of that specific thread is returned.

		On non-Linux systems, #CPUBIND_THREAD can not be used in {@code flags}.
		""",

		set_cpubind["topology"],
		set_proc_cpubind["pid"],
		get_cpubind["set"],
		set_cpubind["flags"]
	)
}