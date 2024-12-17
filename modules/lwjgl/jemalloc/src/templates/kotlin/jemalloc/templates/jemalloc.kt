/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package jemalloc.templates

import org.lwjgl.generator.*
import jemalloc.*

val jemalloc = "JEmalloc".nativeClass(Module.JEMALLOC, prefixMethod = "je_", binding = simpleBinding(
    Module.JEMALLOC,
    libraryExpression = """Configuration.JEMALLOC_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("jemalloc"))""",
    bundledWithLWJGL = true
)) {
    IntConstant(
        "JEMALLOC_VERSION_MAJOR".."5",
        "JEMALLOC_VERSION_MINOR".."2",
        "JEMALLOC_VERSION_BUGFIX".."1",
        "JEMALLOC_VERSION_NREV".."0"
    )

    StringConstant(
        "JEMALLOC_VERSION_GID".."ea6b3e973b477b8061e0076bb257dbd7f3faa756"
    )

    StringConstant(
        "JEMALLOC_VERSION".."JEMALLOC_VERSION_MAJOR + \".\" + JEMALLOC_VERSION_MINOR + \".\" + JEMALLOC_VERSION_BUGFIX + \"-\" + JEMALLOC_VERSION_NREV + \"-g\" + JEMALLOC_VERSION_GID"
    )

    IntConstant(
        "MALLOCX_ZERO"..0x40,
        "MALLOCX_TCACHE_NONE".."MALLOCX_TCACHE(-1)"
    )

    IntConstant(
        "MALLCTL_ARENAS_ALL"..4096,
        "MALLCTL_ARENAS_DESTROYED"..4097
    )

    customMethod("""
    static {
        // Force jemalloc to initialize before anyone else uses it.
        // This avoids a dangerous race when the first jemalloc functions are called concurrently.
        if (Platform.get() == Platform.WINDOWS) {
            invokePV(invokePP(8L, apiGetFunctionAddress(JEMALLOC, "je_malloc")), apiGetFunctionAddress(JEMALLOC, "je_free"));
        }
    }""")

    customMethod("""
    /**
     * Align the memory allocation to start at an address that is a multiple of {@code (1 << la)}. This macro does not validate that {@code la} is within the
     * valid range.
     *
     * @param la the alignment shift
     */
    public static int MALLOCX_LG_ALIGN(int la) {
        return la;
    }

    /**
     * Align the memory allocation to start at an address that is a multiple of {@code a}, where {@code a} is a power of two. This macro does not validate
     * that {@code a} is a power of 2.
     *
     * @param a the alignment
     */
    public static int MALLOCX_ALIGN(int a) {
        return Integer.numberOfTrailingZeros(a);
    }

    /**
     * Use the thread-specific cache (tcache) specified by the identifier {@code tc}, which must have been acquired via the {@code tcache.create} mallctl.
     * This macro does not validate that {@code tc} specifies a valid identifier.
     *
     * @param tc the thread-specific cache
     */
    public static int MALLOCX_TCACHE(int tc) {
        return (tc + 2) << 8;
    }

    /**
     * Use the arena specified by the index {@code a} (and by necessity bypass the thread cache). This macro has no effect for huge regions, nor for regions
     * that were allocated via an arena other than the one specified. This macro does not validate that {@code a} specifies an arena index in the valid range.
     *
     * @param a the arena index
     */
    public static int MALLOCX_ARENA(int a) {
        return (a + 1) << 20;
    }""")

    // Error & stats output

    Address..write_cb.p(
        "malloc_message",
        void()
    )

    // Standard API

    void.p(
        "malloc",

        AutoSizeResult..size_t("size")
    )

    void.p(
        "calloc",

        AutoSizeResult..size_t("num"),
        AutoSizeResult..size_t("size")
    )

    int(
        "posix_memalign",

        Check(1)..void.p.p("memptr"),
        size_t("alignment"),
        size_t("size")
    )

    void.p(
        "aligned_alloc",

        size_t("alignment"),
        AutoSizeResult..size_t("size")
    )

    void.p(
        "realloc",

        Unsafe..nullable..void.p("ptr"),
        AutoSizeResult..size_t("size")
    )

    OffHeapOnly..void(
        "free",

        MultiTypeAll..Unsafe..nullable..void.p("ptr")
    )

    OffHeapOnly..void(
        "free_sized",

        MultiTypeAll..nullable..void.p("ptr"),
        AutoSize("ptr")..size_t("size")
    )

    OffHeapOnly..void(
        "free_aligned_sized",

        MultiTypeAll..nullable..void.p("ptr"),
        size_t("alignment"),
        AutoSize("ptr")..size_t("size")
    )

    // Non-standard API

    val flags = int("flags")

    void.p(
        "mallocx",

        AutoSizeResult..size_t("size"),
        flags
    )

    void.p(
        "rallocx",

        Unsafe..nullable..void.p("ptr"),
        AutoSizeResult..size_t("size"),
        flags
    )

    size_t(
        "xallocx",

        Unsafe..nullable..void.p("ptr"),
        size_t("size"),
        size_t("extra"),
        flags
    )

    size_t(
        "sallocx",

        Unsafe..void.const.p("ptr"),
        flags
    )

    OffHeapOnly..void(
        "dallocx",

        Unsafe..MultiTypeAll..void.p("ptr"),
        flags
    )

    OffHeapOnly..void(
        "sdallocx",

        MultiTypeAll..void.p("ptr"),
        AutoSize("ptr")..size_t("size"),
        flags
    )

    void.p(
        "nallocx",

        AutoSizeResult..size_t("size"),
        flags
    )

    int(
        "mallctl",

        charASCII.const.p("name"),
        Unsafe..nullable..void.p("oldp"),
        Check(1)..nullable..size_t.p("oldlenp"),
        nullable..void.p("newp"),
        AutoSize("newp")..size_t("newlen")
    )

    int(
        "mallctlnametomib",

        charASCII.const.p("name"),
        size_t.p("mibp"),
        AutoSize("mibp")..Check(1)..size_t.p("miblenp")
    )

    int(
        "mallctlbymib",

        size_t.const.p("mib"),
        AutoSize("mib")..size_t("miblen"),
        Unsafe..nullable..void.p("oldp"),
        Check(1)..nullable..size_t.p("oldlenp"),
        nullable..void.p("newp"),
        AutoSize("newp")..size_t("newlen")
    )

    void(
        "malloc_stats_print",

        nullable..write_cb("write_cb"),
        nullable..opaque_p("cbopaque"),
        nullable..charASCII.const.p("opts")
    )

    size_t(
        "malloc_usable_size",

        Unsafe..void.const.p("ptr")
    )
}
