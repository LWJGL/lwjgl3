/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to the <a target="_blank" href="http://jemalloc.net/">jemalloc</a> library. jemalloc is a general purpose malloc implementation that emphasizes
 * fragmentation avoidance and scalable concurrency support.
 * 
 * <p>The jemalloc documentation can be found <a target="_blank" href="http://jemalloc.net/jemalloc.3.html">here</a>. The jemalloc
 * <a target="_blank" href="https://github.com/jemalloc/jemalloc/wiki">wiki</a> also contains useful information.</p>
 * 
 * <p>The jemalloc shared library that comes with LWJGL is configured with:</p>
 * 
 * <ul>
 * <li>--with-jemalloc-prefix=je_</li>
 * <li>--enable-lazy-lock (Linux)</li>
 * <li>--disable-stats</li>
 * <li>--disable-fill</li>
 * <li>--disable-cxx</li>
 * <li>--disable-initial-exec-tls (Linux &amp; macOS)</li>
 * <li>--disable-zone-allocator (macOS)</li>
 * </ul>
 * 
 * <p>The shared library may be replaced with a custom build that has more features enabled.</p>
 * 
 * <p>Dynamic configuration (for enabled features) is also possible, using either the {@code MALLOC_CONF} environment variable or the
 * <a target="_blank" href="http://jemalloc.net/jemalloc.3.html#mallctl_namespace">MALLCTL NAMESPACE</a> and the {@code mallctl*} functions.</p>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.system.jemalloc;

