/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.jemalloc

import org.lwjgl.generator.*

val jemalloc_macros = Generator.register(object : GeneratorTarget(JEMALLOC_PACKAGE, "JEmacros") {
    init {
        documentation = "Macros for jemalloc."
    }

    override fun java.io.PrintWriter.generateJava() {
        generateJavaPreamble()
        print("""public final class JEmacros {

    private JEmacros() {}

    /** The major version. */
    public static final int JEMALLOC_VERSION_MAJOR = 4;

    /** The minor version. */
    public static final int JEMALLOC_VERSION_MINOR = 3;

    /** The bugfix version. */
    public static final int JEMALLOC_VERSION_BUGFIX = 1;

    /** Tthe revision number. */
    public static final int JEMALLOC_VERSION_NREV = 0;

    /** The globally unique identifier (git commit hash). */
    public static final String JEMALLOC_VERSION_GID = "0110fa8451af905affd77c3bea0d545fee2251b2";

    /** Returns the version string. */
    public static final String JEMALLOC_VERSION =
        JEMALLOC_VERSION_MAJOR + "." + JEMALLOC_VERSION_MINOR + "." + JEMALLOC_VERSION_BUGFIX + "-" + JEMALLOC_VERSION_NREV + "-g" + JEMALLOC_VERSION_GID;

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
     * Initialize newly allocated memory to contain zero bytes. In the growing reallocation case, the real size prior to reallocation defines the boundary
     * between untouched bytes and those that are initialized to contain zero bytes. If this macro is absent, newly allocated memory is uninitialized.
     */
    public static final int MALLOCX_ZERO = 0x40;

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
     * Do not use a thread-specific cache (tcache).  Unless {@link #MALLOCX_TCACHE} or {@code MALLOCX_TCACHE_NONE} is specified, an automatically managed
     * tcache
     * will be used under many circumstances. This macro cannot be used in the same {@code flags} argument as {@code MALLOCX_TCACHE(tc)}.
     */
    public static final int MALLOCX_TCACHE_NONE = MALLOCX_TCACHE(-1);

    /**
     * Use the arena specified by the index {@code a} (and by necessity bypass the thread cache). This macro has no effect for huge regions, nor for regions
     * that were allocated via an arena other than the one specified. This macro does not validate that {@code a} specifies an arena index in the valid range.
     *
     * @param a the arena index
     */
    public static int MALLOCX_ARENA(int a) {
        return (a + 1) << 20;
    }

}""")
    }
})