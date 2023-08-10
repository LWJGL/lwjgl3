/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to the <a href="https://www.open-mpi.org/projects/hwloc/">hwloc</a>, a portable abstraction (across OS, versions, architectures, ...)
 * of the hierarchical topology of modern architectures, including NUMA memory nodes, sockets, shared caches, cores and simultaneous multithreading.
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
@org.lwjgl.system.NonnullDefault
package org.lwjgl.util.hwloc;

