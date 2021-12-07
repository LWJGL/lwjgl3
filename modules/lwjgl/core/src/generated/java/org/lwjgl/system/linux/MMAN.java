/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;sys/mman.h&gt;. */
public class MMAN {

    static { Library.initialize(); }

    /** Return value of {@link #mmap} in case of an error. */
    public static final long MAP_FAILED = -1L;

    /**
     * The {@code prot} argument describes the desired memory protection of the mapping (and must not conflict with the open mode of the file).
     * 
     * <p>It is either {@code PROT_NONE} or the bitwise OR of one or more of the following flags.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #PROT_EXEC PROT_EXEC} - Pages may be executed.</li>
     * <li>{@link #PROT_READ PROT_READ} - Pages may be read.</li>
     * <li>{@link #PROT_WRITE PROT_WRITE} - Pages may be written.</li>
     * <li>{@link #PROT_NONE PROT_NONE} - Pages may not be accessed.</li>
     * <li>{@link #PROT_GROWSDOWN PROT_GROWSDOWN} - Extend change to start of {@code growsdown} vma ({@code mprotect} only).</li>
     * <li>{@link #PROT_GROWSUP PROT_GROWSUP} - Extend change to start of {@code growsup} vma ({@code mprotect} only).</li>
     * </ul>
     */
    public static final int
        PROT_EXEC      = 0x4,
        PROT_READ      = 0x1,
        PROT_WRITE     = 0x2,
        PROT_NONE      = 0x0,
        PROT_GROWSDOWN = 0x01000000,
        PROT_GROWSUP   = 0x02000000;

    /**
     * The flags argument determines whether updates to the mapping are visible to other processes mapping the same region, and whether updates are carried
     * through to the underlying file.
     * 
     * <p>This behavior is determined by including exactly one of the following values in {@code flags}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MAP_SHARED MAP_SHARED} - 
     * Share this mapping.
     * 
     * <p>Updates to the mapping are visible to other processes mapping the same region, and (in the case of file-backed mappings) are carried through to the
     * underlying file. (To precisely control when updates are carried through to the underlying file requires the use of {@code msync(2)}.)</p>
     * </li>
     * <li>{@link #MAP_SHARED_VALIDATE MAP_SHARED_VALIDATE} - 
     * This flag provides the same behavior as {@link #MAP_SHARED} except that {@code MAP_SHARED} mappings ignore unknown flags in {@code flags}.
     * 
     * <p>By contrast, when creating a mapping using {@code MAP_SHARED_VALIDATE}, the kernel verifies all passed flags are known and fails the mapping with
     * the error {@code EOPNOTSUPP} for unknown flags. This mapping type is also required to be able to use some mapping flags (e.g., {@code MAP_SYNC}).</p>
     * </li>
     * <li>{@link #MAP_PRIVATE MAP_PRIVATE} - 
     * Create a private copy-on-write mapping.
     * 
     * <p>Updates to the mapping are not visible to other processes mapping the same file, and are not carried through to the underlying file.  It is
     * unspecified whether changes made to the file after the {@link #mmap} call are visible in the mapped region.</p>
     * </li>
     * </ul>
     */
    public static final int
        MAP_SHARED          = 0x01,
        MAP_SHARED_VALIDATE = 0x03,
        MAP_PRIVATE         = 0x02;

    public static final int MAP_HUGE_SHIFT = 26;

    public static final int MAP_HUGE_MASK = 0x3f;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MAP_32BIT MAP_32BIT} - 
     * Put the mapping into the first 2 Gigabytes of the process address space.
     * 
     * <p>This flag is supported only on x86-64, for 64-bit programs. It was added to allow thread stacks to be allocated somewhere in the first 2 GB of
     * memory, so as to improve context-switch performance on some early 64-bit processors. Modern x86-64 processors no longer have this performance
     * problem, so use of this flag is not required on those systems. The {@code MAP_32BIT} flag is ignored when {@link #MAP_FIXED} is set.</p>
     * </li>
     * <li>{@link #MAP_ANONYMOUS MAP_ANONYMOUS} - 
     * The mapping is not backed by any file; its contents are initialized to zero.
     * 
     * <p>The {@code fd} argument is ignored; however, some implementations require {@code fd} to be -1 if {@code MAP_ANONYMOUS} (or {@link #MAP_ANON}) is specified,
     * and portable applications should ensure this. The {@code offset} argument should be zero. The use of {@code MAP_ANONYMOUS} in conjunction with
     * {@code MAP_SHARED} is supported on Linux only since kernel 2.4.</p>
     * </li>
     * <li>{@link #MAP_ANON MAP_ANON} - Synonym for MAP_ANONYMOUS; provided for compatibility with other implementations.</li>
     * <li>{@link #MAP_DENYWRITE MAP_DENYWRITE} - 
     * This flag is ignored.
     * 
     * <p>(Long ago —Linux 2.0 and earlier— it signaled that attempts to write to the underlying file should fail with {@code ETXTBSY}. But this was a source
     * of denial-of-service attacks.)</p>
     * </li>
     * <li>{@link #MAP_EXECUTABLE MAP_EXECUTABLE} - This flag is ignored.</li>
     * <li>{@link #MAP_FILE MAP_FILE} - Compatibility flag. Ignored.</li>
     * <li>{@link #MAP_FIXED MAP_FIXED} - 
     * Don't interpret {@code addr} as a hint: place the mapping at exactly that address.
     * 
     * <p>{@code addr} must be suitably aligned: for most architectures a multiple of the page size is sufficient; however, some architectures may impose
     * additional restrictions. If the memory region specified by {@code addr} and {@code length} overlaps pages of any existing mapping(s), then the
     * overlapped part of the existing mapping(s) will be discarded. If the specified address cannot be used, {@link #mmap} will fail.</p>
     * 
     * <p>Software that aspires to be portable should use the {@code MAP_FIXED} flag with care, keeping in mind that the exact layout of a process's memory
     * mappings is allowed to change significantly between kernel versions, C library versions, and operating system releases. Carefully read the
     * discussion of this flag in NOTES!</p>
     * </li>
     * <li>{@link #MAP_FIXED_NOREPLACE MAP_FIXED_NOREPLACE} - 
     * This flag provides behavior that is similar to {@link #MAP_FIXED} with respect to the {@code addr} enforcement, but differs in that
     * {@code MAP_FIXED_NOREPLACE} never clobbers a preexisting mapped range.
     * 
     * <p>If the requested range would collide with an existing mapping, then this call fails with the error {@code EEXIST}. This flag can therefore be used
     * as a way to atomically (with respect to other threads) attempt to map an address range: one thread will succeed; all others will report failure.</p>
     * 
     * <p>Note that older kernels which do not recognize the {@code MAP_FIXED_NOREPLACE} flag will typically (upon detecting a collision with a preexisting
     * mapping) fall back to a "non-{@code MAP_FIXED}" type of behavior: they will return an address that is different from the requested address.
     * Therefore, backward-compatible software should check the returned address against the requested address.</p>
     * 
     * <p>(since Linux 4.17)</p>
     * </li>
     * <li>{@link #MAP_GROWSDOWN MAP_GROWSDOWN} - 
     * This flag is used for stacks. It indicates to the kernel virtual memory system that the mapping should extend downward in memory.
     * 
     * <p>The return address is one page lower than the memory area that is actually created in the process's virtual address space. Touching an address in
     * the "guard" page below the mapping will cause the mapping to grow by a page. This growth can be repeated until the mapping grows to within a page
     * of the high end of the next lower mapping, at which point touching the "guard" page will result in a {@code SIGSEGV} signal.</p>
     * </li>
     * <li>{@link #MAP_HUGETLB MAP_HUGETLB} - 
     * Allocate the mapping using "huge" pages.
     * 
     * <p>See the Linux kernel source file {@code Documentation/admin-guide/mm/hugetlbpage.rst} for further information, as well as NOTES, below.</p>
     * 
     * <p>(since Linux 2.6.32)</p>
     * </li>
     * <li>{@link #MAP_HUGE_2MB MAP_HUGE_2MB} - 
     * Used in conjunction with {@link #MAP_HUGETLB} to select alternative {@code hugetlb} page sizes (respectively, 2 MB and 1 GB) on systems that support
     * multiple {@code hugetlb} page sizes.
     * 
     * <p>More generally, the desired huge page size can be configured by encoding the base-2 logarithm of the desired page size in the six bits at the
     * offset {@link #MAP_HUGE_SHIFT}. (A value of zero in this bit field provides the default huge page size; the default huge page size can be discovered via
     * the {@code Hugepagesize} field exposed by {@code /proc/meminfo}.) Thus, the above two constants are defined as:</p>
     * 
     * <pre><code>
     * #define MAP_HUGE_2MB    (21 &lt;&lt; MAP_HUGE_SHIFT)
     * #define MAP_HUGE_1GB    (30 &lt;&lt; MAP_HUGE_SHIFT)</code></pre>
     * 
     * <p>The range of huge page sizes that are supported by the system can be discovered by listing the subdirectories in {@code /sys/kernel/mm/hugepages}.</p>
     * 
     * <p>(since Linux 3.8)</p>
     * </li>
     * <li>{@link #MAP_HUGE_1GB MAP_HUGE_1GB} - See {@link #MAP_HUGE_2MB}.</li>
     * <li>{@link #MAP_LOCKED MAP_LOCKED} -
     * </li>
     * <li>{@link #MAP_NONBLOCK MAP_NONBLOCK} -
     * </li>
     * <li>{@link #MAP_NORESERVE MAP_NORESERVE} -
     * </li>
     * <li>{@link #MAP_POPULATE MAP_POPULATE} -
     * </li>
     * <li>{@link #MAP_STACK MAP_STACK} -
     * </li>
     * <li>{@link #MAP_SYNC MAP_SYNC} -
     * </li>
     * <li>{@link #MAP_UNINITIALIZED MAP_UNINITIALIZED} -
     * </li>
     * </ul>
     */
    public static final int
        MAP_32BIT           = 0x40,
        MAP_ANONYMOUS       = 0x20,
        MAP_ANON            = MAP_ANONYMOUS,
        MAP_DENYWRITE       = 0x00800,
        MAP_EXECUTABLE      = 0x01000,
        MAP_FILE            = 0,
        MAP_FIXED           = 0x10,
        MAP_FIXED_NOREPLACE = 0x100000,
        MAP_GROWSDOWN       = 0x00100,
        MAP_HUGETLB         = 0x40000,
        MAP_HUGE_2MB        = 21 << MAP_HUGE_SHIFT,
        MAP_HUGE_1GB        = 30 << MAP_HUGE_SHIFT,
        MAP_LOCKED          = 0x02000,
        MAP_NONBLOCK        = 0x10000,
        MAP_NORESERVE       = 0x04000,
        MAP_POPULATE        = 0x08000,
        MAP_STACK           = 0x20000,
        MAP_SYNC            = 0x80000,
        MAP_UNINITIALIZED   = 0x4000000;

    protected MMAN() {
        throw new UnsupportedOperationException();
    }

    // --- [ mmap ] ---

    /**
     * Creates a new mapping in the virtual address space of the calling process.
     * 
     * <p>The starting address for the new mapping is specified in {@code addr}. The {@code length} argument specifies the length of the mapping (which must be
     * greater than 0).</p>
     * 
     * <p>If {@code addr} is {@code NULL}, then the kernel chooses the (page-aligned) address at which to create the mapping; this is the most portable method of
     * creating a new mapping. If {@code addr} is not {@code NULL}, then the kernel takes it as a hint about where to place the mapping; on Linux, the kernel will
     * pick a nearby page boundary (but always above or equal to the value specified by {@code /proc/sys/vm/mmap_min_addr}) and attempt to create the mapping
     * there. If another mapping already exists there, the kernel picks a new address that may or may not depend on the hint. The address of the new mapping
     * is returned as the result of the call.</p>
     * 
     * <p>The contents of a file mapping (as opposed to an anonymous mapping; see {@code MAP_ANONYMOUS} below), are initialized using {@code length} bytes
     * starting at offset {@code offset} in the file (or other object) referred to by the file descriptor {@code fd}. {@code offset} must be a multiple of the
     * page size as returned by {@code sysconf(_SC_PAGE_SIZE)}.</p>
     * 
     * <p>After the {@code mmap()} call has returned, the file descriptor, {@code fd}, can be closed immediately without invalidating the mapping.</p>
     *
     * @param prot  describes the desired memory protection of the mapping (and must not conflict with the open mode of the file). One or more of:<br><table><tr><td>{@link #PROT_EXEC}</td><td>{@link #PROT_READ}</td><td>{@link #PROT_WRITE}</td><td>{@link #PROT_NONE}</td><td>{@link #PROT_GROWSDOWN}</td><td>{@link #PROT_GROWSUP}</td></tr></table>
     * @param flags one or more of:<br><table><tr><td>{@link #MAP_FAILED}</td><td>{@link #MAP_SHARED}</td><td>{@link #MAP_SHARED_VALIDATE}</td><td>{@link #MAP_PRIVATE}</td><td>{@link #MAP_HUGE_SHIFT}</td><td>{@link #MAP_HUGE_MASK}</td></tr><tr><td>{@link #MAP_32BIT}</td><td>{@link #MAP_ANONYMOUS}</td><td>{@link #MAP_ANON}</td><td>{@link #MAP_DENYWRITE}</td><td>{@link #MAP_EXECUTABLE}</td><td>{@link #MAP_FILE}</td></tr><tr><td>{@link #MAP_FIXED}</td><td>{@link #MAP_FIXED_NOREPLACE}</td><td>{@link #MAP_GROWSDOWN}</td><td>{@link #MAP_HUGETLB}</td><td>{@link #MAP_HUGE_2MB}</td><td>{@link #MAP_HUGE_1GB}</td></tr><tr><td>{@link #MAP_LOCKED}</td><td>{@link #MAP_NONBLOCK}</td><td>{@link #MAP_NORESERVE}</td><td>{@link #MAP_POPULATE}</td><td>{@link #MAP_STACK}</td><td>{@link #MAP_SYNC}</td></tr><tr><td>{@link #MAP_UNINITIALIZED}</td></tr></table>
     *
     * @return on success, returns a pointer to the mapped area. On error, the value {@link #MAP_FAILED} is returned, and {@code errno} is set to indicate the error.
     */
    @NativeType("void *")
    public static native long mmap(@NativeType("void *") long addr, @NativeType("size_t") long length, int prot, int flags, int fd, @NativeType("off_t") long offset);

    // --- [ munmap ] ---

    /** Unsafe version of: {@link #munmap} */
    public static native int nmunmap(long addr, long length);

    /**
     * Deletes the mappings for the specified address range, and causes further references to addresses within the range to generate invalid memory
     * references.
     * 
     * <p>The region is also automatically unmapped when the process is terminated. On the other hand, closing the file descriptor does not unmap the region.</p>
     * 
     * <p>The address {@code addr} must be a multiple of the page size (but {@code length} need not be). All pages containing a part of the indicated range are
     * unmapped, and subsequent references to these pages will generate {@code SIGSEGV}. It is not an error if the indicated range does not contain any mapped
     * pages.</p>
     *
     * @return on success, returns 0. On failure, it returns -1, and {@code errno} is set to indicate the error (probably to {@code EINVAL}).
     */
    public static int munmap(@NativeType("void *") ByteBuffer addr) {
        return nmunmap(memAddress(addr), addr.remaining());
    }

}