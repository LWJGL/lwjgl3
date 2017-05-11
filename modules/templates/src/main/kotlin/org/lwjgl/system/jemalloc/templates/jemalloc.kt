/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.jemalloc.templates

import org.lwjgl.generator.*
import org.lwjgl.system.jemalloc.*

val jemalloc = "JEmalloc".nativeClass(JEMALLOC_PACKAGE, prefixMethod = "je_", binding = simpleBinding(
    "jemalloc",
    """Configuration.JEMALLOC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("jemalloc"))""",
    bundledWithLWJGL = true
)) {
    documentation =
        """
        Native bindings to jemalloc.

        jemalloc is a general purpose malloc implementation that emphasizes fragmentation avoidance and scalable concurrency support. jemalloc first came into
        use as the FreeBSD libc allocator in 2005, and since then it has found its way into numerous applications that rely on its predictable behavior. In
        2010 jemalloc development efforts broadened to include developer support features such as heap profiling, Valgrind integration, and extensive
        monitoring/tuning hooks. Modern jemalloc releases continue to be integrated back into FreeBSD, and therefore versatility remains critical. Ongoing
        development efforts trend toward making jemalloc among the best allocators for a broad range of demanding applications, and eliminating/mitigating
        weaknesses that have practical repercussions for real world applications.
        """

    // Error & stats output

    Address..opaque_p.p(
        "malloc_message",
        "Returns the {@code je_malloc_message} variable."
    )

    // Standard API

    void_p(
        "malloc",
        """
        Allocates {@code size} bytes of uninitialized memory. The allocated space is suitably aligned (after possible pointer coercion) for storage of any type
        of object.
        """,

        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate")
    )

    void_p(
        "calloc",
        """
        Allocates space for {@code num} objects, each {@code size} bytes in length. The result is identical to calling #malloc() with an argument of
        {@code num * size}, with the exception that the allocated memory is explicitly initialized to zero bytes.
        """,

        AutoSizeResult..size_t.IN("num", "the number of objects to allocate"),
        AutoSizeResult..size_t.IN("size", "the size of each object, in bytes")
    )

    int(
        "posix_memalign",
        """
        Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}, and returns the allocation in
        the value pointed to by {@code memptr}. The requested alignment must be a power of 2 at least as large as {@code sizeof(void *)}.
        """,

        Check(1)..void_pp.OUT("memptr", "returns the allocated memory"),
        size_t.IN("alignment", "the allocation alignment, in bytes"),
        size_t.IN("size", "the number of bytes to allocate")
    )

    void_p(
        "aligned_alloc",
        """
        Allocates {@code size} bytes of memory such that the allocation's base address is an even multiple of {@code alignment}. The requested alignment must
        be a power of 2. Behavior is undefined if {@code size} is not an integral multiple of {@code alignment}.
        """,

        size_t.IN("alignment", "the allocation alignment, in bytes"),
        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate")
    )

    void_p(
        "realloc",
        """
        Changes the size of the previously allocated memory referenced by {@code ptr} to {@code size} bytes. The contents of the memory are unchanged up to the
        lesser of the new and old sizes. If the new size is larger, the contents of the newly allocated portion of the memory are undefined. Upon success, the
        memory referenced by {@code ptr} is freed and a pointer to the newly allocated memory is returned. Note that realloc() may move the memory allocation,
        resulting in a different return value than {@code ptr}. If {@code ptr} is #NULL, the realloc() function behaves identically to malloc() for the
        specified size.
        """,

        Unsafe..nullable..void_p.IN("ptr", "the previously allocated memory or #NULL"),
        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate")
    )

    OffHeapOnly..void(
        "free",
        "Causes the allocated memory referenced by {@code ptr} to be made available for future allocations. If {@code ptr} is #NULL, no action occurs.",

        MultiTypeAll..Unsafe..nullable..void_p.IN("ptr", "the allocated memory to free")
    )

    // Non-standard API

    val flags = int.IN("flags", "a bitfield of zero or more of the {@code MALLOCX} macros in ##JEmacros")

    void_p(
        "mallocx",
        """
        Allocates at least {@code size} bytes of memory, and returns a pointer to the base address of the allocation. Behavior is undefined if {@code size} is
        0, or if request size overflows due to size class and/or alignment constraints.
        """,

        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate"),
        flags
    )

    void_p(
        "rallocx",
        """
        Resizes the allocation at {@code ptr} to be at least {@code size} bytes, and returns a pointer to the base address of the resulting allocation, which
        may or may not have moved from its original location. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class and/or
        alignment constraints.
        """,

        Unsafe..nullable..void_p.IN("ptr", "the previously allocated memory or #NULL"),
        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate"),
        flags
    )

    size_t(
        "xallocx",
        """
        Resizes the allocation at {@code ptr} in place to be at least size bytes, and returns the real size of the allocation. If {@code extra} is non-zero, an
        attempt is made to resize the allocation to be at least {@code (size + extra)} bytes, though inability to allocate the extra byte(s) will not by itself
        result in failure to resize. Behavior is undefined if {@code size} is 0, or if {@code (size + extra > SIZE_T_MAX)}.
        """,

        Unsafe..nullable..void_p.IN("ptr", "the previously allocated memory or #NULL"),
        size_t.IN("size", "the number of bytes to allocate"),
        size_t.IN("extra", "the number of extra bytes to allocate"),
        flags
    )

    size_t(
        "sallocx",
        "Returns the real size of the allocation at {@code ptr}.",

        Unsafe..const..void_p.IN("ptr", "the allocated memory to query"),
        flags
    )

    OffHeapOnly..void(
        "dallocx",
        "Causes the memory referenced by {@code ptr} to be made available for future allocations.",

        Unsafe..MultiTypeAll..void_p.IN("ptr", "the allocated memory to deallocate"),
        flags
    )

    OffHeapOnly..void(
        "sdallocx",
        "Sized version of #dallocx(). The primary optimization over {@code dallocx()} is the removal of a metadata read, which often suffers an L1 cache miss.",

        MultiTypeAll..void_p.IN("ptr", "the allocated memory to deallocate"),
        AutoSize("ptr")..size_t.IN("size", "the number of bytes in {@code ptr}"),
        flags
    )

    void_p(
        "nallocx",
        """
        Allocates no memory, but it performs the same size computation as the #mallocx() function, and returns the real size of the allocation that would
        result from the equivalent {@code mallocx()} function call. Behavior is undefined if {@code size} is 0, or if request size overflows due to size class
        and/or alignment constraints.
        """,

        AutoSizeResult..size_t.IN("size", "the number of bytes to allocate"),
        flags
    )

    int(
        "mallctl",
        """
        Provides a general interface for introspecting the memory allocator, as well as setting modifiable parameters and triggering actions. The
        period-separated {@code name} argument specifies a location in a tree-structured namespace; see the
        ${url("http://www.canonware.com/download/jemalloc/jemalloc-latest/doc/jemalloc.html\\#mallctl_namespace", "MALLCTL NAMESPACE")} section for
        documentation on the tree contents. To read a value, pass a pointer via {@code oldp} to adequate space to contain the value, and a pointer to its
        length via {@code oldlenp}; otherwise pass #NULL and #NULL. Similarly, to write a value, pass a pointer to the value via {@code newp}, and its length
        via {@code newlen}; otherwise pass #NULL and {@code 0}.
        """,

        const..charASCII_p.IN("name", "the namespace location"),
        Unsafe..nullable..void_p.OUT("oldp", "returns a value"),
        Check(1)..nullable..size_t_p.OUT("oldlenp", "returns the value length"),
        nullable..void_p.IN("newp", "the new value"),
        AutoSize("newp")..size_t.IN("newlen", "the new value length")
    )

    int(
        "mallctlnametomib",
        """
        Provides a way to avoid repeated name lookups for applications that repeatedly query the same portion of the namespace, by translating a name to a
        “Management Information Base” (MIB) that can be passed repeatedly to #mallctlbymib(). Upon successful return from {@code mallctlnametomib()},
        {@code mibp} contains an array of {@code *miblenp} integers, where {@code *miblenp} is the lesser of the number of components in name and the input
        value of {@code *miblenp}. Thus it is possible to pass a {@code *miblenp} that is smaller than the number of period-separated name components, which
        results in a partial MIB that can be used as the basis for constructing a complete MIB. For name components that are integers (e.g. the 2 in
        "arenas.bin.2.size"), the corresponding MIB component will always be that integer. Therefore, it is legitimate to construct code like the following:
        ${codeBlock("""
unsigned nbins, i;
size_t mib[4];
size_t len, miblen;

len = sizeof(nbins);
mallctl("arenas.nbins", &nbins, &len, NULL, 0);

miblen = 4;
mallctlnametomib("arenas.bin.0.size", mib, &miblen);
for (i = 0; i < nbins; i++) {
    size_t bin_size;

    mib[2] = i;
    len = sizeof(bin_size);
    mallctlbymib(mib, miblen, &bin_size, &len, NULL, 0);
    // Do something with bin_size...
}""")}
        """,

        const..charASCII_p.IN("name", "the namespace location"),
        size_t_p.IN("mibp", "an array of integers"),
        AutoSize("mibp")..Check(1)..size_t_p.INOUT("miblenp", "the number of components in {@code mibp}")
    )

    int(
        "mallctlbymib",
        "Similar to #mallctl(), but uses MIBs instead of names. See #mallctlnametomib() for details.",

        const..size_t_p.IN("mib", "a MIB"),
        AutoSize("mib")..size_t.IN("miblen", "the number of elements in {@code mib}"),
        Unsafe..nullable..void_p.OUT("oldp", "returns a value"),
        Check(1)..nullable..size_t_p.OUT("oldlenp", "returns the value length"),
        nullable..void_p.IN("newp", "the new value"),
        AutoSize("newp")..size_t.IN("newlen", "the new value length")
    )

    void(
        "malloc_stats_print",
        """
        Writes human-readable summary statistics via the {@code write_cb} callback function pointer and {@code cbopaque} data passed to {@code write_cb}, or
        {@code malloc_message()} if {@code write_cb} is #NULL. This function can be called repeatedly. General information that never changes during execution
        can be omitted by specifying "g" as a character within the {@code opts} string. Note that {@code malloc_message()} uses the {@code mallctl*()}
        functions internally, so inconsistent statistics can be reported if multiple threads use these functions simultaneously. If {@code --enable-stats} is
        specified during configuration, “m” and “a” can be specified to omit merged arena and per arena statistics, respectively; “b” and “l” can be specified to
        omit per size class statistics for bins and large objects, respectively. Unrecognized characters are silently ignored. Note that thread caching may
        prevent some statistics from being completely up to date, since extra locking would be required to merge counters that track thread cache operations.
        """,

        nullable..je_malloc_message_cb.IN("write_cb", "the print callback, or #NULL to use {@code malloc_message()}"),
        nullable..opaque_p.IN("je_cbopaque", "an opaque pointer that will be passed to {@code write_cb}"),
        nullable..const..charASCII_p.IN("opts", "an options string")
    )

    size_t(
        "malloc_usable_size",
        """
        Returns the usable size of the allocation pointed to by {@code ptr}. The return value may be larger than the size that was requested during allocation.
        The {@code malloc_usable_size()} function is not a mechanism for in-place #realloc(); rather it is provided solely as a tool for introspection
        purposes. Any discrepancy between the requested allocation size and the size reported by {@code malloc_usable_size()} should not be depended on, since
        such behavior is entirely implementation-dependent.
        """,

        Unsafe..const..void_p.IN("ptr", "the allocated memory to query")
    )
}