/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Contains bindings to <a target="_blank" href="http://lz4.github.io/lz4/">LZ4</a>, a lossless compression algorithm, providing compression speed at 400 MB/s per core,
 * scalable with multi-cores CPU. It features an extremely fast decoder, with speed in multiple GB/s per core, typically reaching RAM speed limits on
 * multi-core systems.
 * 
 * <p>Speed can be tuned dynamically, selecting an "acceleration" factor which trades compression ratio for more speed up. On the other end, a high
 * compression derivative, {@code LZ4_HC}, is also provided, trading CPU time for improved compression ratio. All versions feature the same decompression
 * speed.</p>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.util.lz4;

