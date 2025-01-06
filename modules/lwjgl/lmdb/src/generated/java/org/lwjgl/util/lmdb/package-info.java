/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Bindings to <a href="https://symas.com/lmdb/">LMDB</a>, the Symas Lightning Memory-Mapped Database.
 * 
 * <p>LMDB is a Btree-based database management library modeled loosely on the BerkeleyDB API, but much simplified. The entire database is exposed in a
 * memory map, and all data fetches return data directly from the mapped memory, so no malloc's or memcpy's occur during data fetches. As such, the
 * library is extremely simple because it requires no page caching layer of its own, and it is extremely high performance and memory-efficient. It is also
 * fully transactional with full ACID semantics, and when the memory map is read-only, the database integrity cannot be corrupted by stray pointer writes
 * from application code.</p>
 * 
 * <h3>Resources</h3>
 * 
 * <ul>
 * <li><a href="http://www.lmdb.tech/doc/">Documentation</a></li>
 * <li><a href="https://github.com/LMDB/lmdb">Source Repository</a></li>
 * </ul>
 */
@org.jspecify.annotations.NullMarked
package org.lwjgl.util.lmdb;

