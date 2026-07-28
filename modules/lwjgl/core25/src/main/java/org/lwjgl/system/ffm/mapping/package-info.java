/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
/**
 * Contains mappings between native types and {@link java.lang.foreign.MemoryLayout} instances.
 *
 * <p>Most mappings are simple wrappers over FFM layouts, but they expose a richer DSL for defining custom struct/union layouts, which enables:</p>
 * <ul>
 *     <li>A cleaner API that doesn't pollute the static FFM API with utility methods.</li>
 *     <li>Consistently named layouts.</li>
 *     <li>Better handling of opaque types &amp; pointer types. Opaque mappings cannot be used directly (they need to be wrapped in pointer mappings) and pointer
 *     mappings cannot be created without a target mapping.</li>
 *     <li>Enrichment of integer layouts with signedness.</li>
 *     <li>Abstraction of C long types.</li>
 * </ul>
 *
 * <p>Users will rarely need to create mappings from scratch. It is recommended to {@code import static} the {@link org.lwjgl.system.ffm.FFM} class and use the
 * base types that are defined there to {@code typedef} any custom types necessary.</p>
 */
@NullMarked
package org.lwjgl.system.ffm.mapping;

import org.jspecify.annotations.*;