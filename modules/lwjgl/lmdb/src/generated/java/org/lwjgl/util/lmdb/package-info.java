/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */

/**
 * Bindings to <a target="_blank" href="https://symas.com/lmdb/">LMDB</a>, the Symas Lightning Memory-Mapped Database.
 * 
 * <p>LMDB is a Btree-based database management library modeled loosely on the BerkeleyDB API, but much simplified. The entire database is exposed in a
 * memory map, and all data fetches return data directly from the mapped memory, so no malloc's or memcpy's occur during data fetches. As such, the
 * library is extremely simple because it requires no page caching layer of its own, and it is extremely high performance and memory-efficient. It is also
 * fully transactional with full ACID semantics, and when the memory map is read-only, the database integrity cannot be corrupted by stray pointer writes
 * from application code.</p>
 * 
 * <p>The library is fully thread-aware and supports concurrent read/write access from multiple processes and threads. Data pages use a copy-on-write
 * strategy so no active data pages are ever overwritten, which also provides resistance to corruption and eliminates the need of any special recovery
 * procedures after a system crash. Writes are fully serialized; only one write transaction may be active at a time, which guarantees that writers can
 * never deadlock. The database structure is multi-versioned so readers run with no locks; writers cannot block readers, and readers don't block writers.</p>
 * 
 * <p>Unlike other well-known database mechanisms which use either write-ahead transaction logs or append-only data writes, LMDB requires no maintenance
 * during operation. Both write-ahead loggers and append-only databases require periodic checkpointing and/or compaction of their log or database files
 * otherwise they grow without bound. LMDB tracks free pages within the database and re-uses them for new write operations, so the database size does not
 * grow without bound in normal use.</p>
 * 
 * <p>The memory map can be used as a read-only or read-write map. It is read-only by default as this provides total immunity to corruption. Using read-write
 * mode offers much higher write performance, but adds the possibility for stray application writes thru pointers to silently corrupt the database. Of
 * course if your application code is known to be bug-free (...) then this is not an issue.</p>
 * 
 * <h3>Restrictions/caveats (in addition to those listed for some functions)</h3>
 * 
 * <ul>
 * <li>Only the database owner should normally use the database on BSD systems or when otherwise configured with {@code MDB_USE_POSIX_SEM}. Multiple users
 * can cause startup to fail later, as noted above.</li>
 * <li>There is normally no pure read-only mode, since readers need write access to locks and lock file. Exceptions: On read-only filesystems or with the
 * {@link org.lwjgl.util.lmdb.LMDB#MDB_NOLOCK NOLOCK} flag described under {@link org.lwjgl.util.lmdb.LMDB#mdb_env_open env_open}.</li>
 * <li>An LMDB configuration will often reserve considerable unused memory address space and maybe file size for future growth. This does not use actual
 * memory or disk space, but users may need to understand the difference so they won't be scared off.</li>
 * <li>By default, in versions before 0.9.10, unused portions of the data file might receive garbage data from memory freed by other code. (This does not
 * happen when using the {@link org.lwjgl.util.lmdb.LMDB#MDB_WRITEMAP WRITEMAP} flag.) As of 0.9.10 the default behavior is to initialize such memory before writing to the data file. Since there
 * may be a slight performance cost due to this initialization, applications may disable it using the {@link org.lwjgl.util.lmdb.LMDB#MDB_NOMEMINIT NOMEMINIT} flag. Applications handling sensitive
 * data which must not be written should not use this flag. This flag is irrelevant when using {@link org.lwjgl.util.lmdb.LMDB#MDB_WRITEMAP WRITEMAP}.</li>
 * <li>A thread can only use one transaction at a time, plus any child transactions. Each transaction belongs to one thread. The {@link org.lwjgl.util.lmdb.LMDB#MDB_NOTLS NOTLS} flag changes this
 * for read-only transactions.</li>
 * <li>Use an {@code MDB_env*} in the process which opened it, without {@code fork()}ing.</li>
 * <li>Do not have open an LMDB database twice in the same process at the same time. Not even from a plain {@code open()} call - {@code close()}ing it
 * breaks {@code flock()} advisory locking.</li>
 * <li>Avoid long-lived transactions. Read transactions prevent reuse of pages freed by newer write transactions, thus the database can grow quickly.
 * Write transactions prevent other write transactions, since writes are serialized.</li>
 * <li>Avoid suspending a process with active transactions. These would then be "long-lived" as above. Also read transactions suspended when writers
 * commit could sometimes see wrong data.</li>
 * </ul>
 * 
 * <p>...when several processes can use a database concurrently:</p>
 * 
 * <ul>
 * <li>Avoid aborting a process with an active transaction. The transaction becomes "long-lived" as above until a check for stale readers is performed or
 * the lockfile is reset, since the process may not remove it from the lockfile.
 * 
 * <p>This does not apply to write transactions if the system clears stale writers, see above.</p></li>
 * <li>If you do that anyway, do a periodic check for stale readers. Or close the environment once in a while, so the lockfile can get reset.</li>
 * <li>Do not use LMDB databases on remote filesystems, even between processes on the same host. This breaks {@code flock()} on some OSes, possibly memory
 * map sync, and certainly sync between programs on different hosts.</li>
 * <li>Opening a database can fail if another process is opening or closing it at exactly the same time.</li>
 * </ul>
 * 
 * <h3>Reader Lock Table</h3>
 * 
 * <p>Readers don't acquire any locks for their data access. Instead, they simply record their transaction ID in the reader table. The reader mutex is needed
 * just to find an empty slot in the reader table. The slot's address is saved in thread-specific data so that subsequent read transactions started by the
 * same thread need no further locking to proceed.</p>
 * 
 * <p>If {@link org.lwjgl.util.lmdb.LMDB#MDB_NOTLS NOTLS} is set, the slot address is not saved in thread-specific data.</p>
 * 
 * <p>No reader table is used if the database is on a read-only filesystem, or if {@link org.lwjgl.util.lmdb.LMDB#MDB_NOLOCK NOLOCK} is set.</p>
 * 
 * <p>Since the database uses multi-version concurrency control, readers don't actually need any locking. This table is used to keep track of which readers
 * are using data from which old transactions, so that we'll know when a particular old transaction is no longer in use. Old transactions that have
 * discarded any data pages can then have those pages reclaimed for use by a later write transaction.</p>
 * 
 * <p>The lock table is constructed such that reader slots are aligned with the processor's cache line size. Any slot is only ever used by one thread. This
 * alignment guarantees that there will be no contention or cache thrashing as threads update their own slot info, and also eliminates any need for
 * locking when accessing a slot.</p>
 * 
 * <p>A writer thread will scan every slot in the table to determine the oldest outstanding reader transaction. Any freed pages older than this will be
 * reclaimed by the writer. The writer doesn't use any locks when scanning this table. This means that there's no guarantee that the writer will see the
 * most up-to-date reader info, but that's not required for correct operation - all we need is to know the upper bound on the oldest reader, we don't care
 * at all about the newest reader. So the only consequence of reading stale information here is that old pages might hang around a while longer before
 * being reclaimed. That's actually good anyway, because the longer we delay reclaiming old pages, the more likely it is that a string of contiguous pages
 * can be found after coalescing old pages from many old transactions together.</p>
 */
@org.lwjgl.system.NonnullDefault
package org.lwjgl.util.lmdb;

