/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val mman = "MMAN".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport(
        "<sys/mman.h>",
        "<errno.h>"
    )
    documentation = "Native bindings to &lt;sys/mman.h&gt;."

    LongConstant(
        "Return value of #mmap() in case of an error.",

        "MAP_FAILED".."-1L"
    )

    EnumConstant(
        """
        The {@code prot} argument describes the desired memory protection of the mapping (and must not conflict with the open mode of the file).

        It is either {@code PROT_NONE} or the bitwise OR of one or more of the following flags.
        """,

        "PROT_EXEC".enum("Pages may be executed.", "0x4"),
        "PROT_READ".enum("Pages may be read.", "0x1"),
        "PROT_WRITE".enum("Pages may be written.", "0x2"),
        "PROT_NONE".enum("Pages may not be accessed.", "0x0"),
        "PROT_GROWSDOWN".enum("Extend change to start of {@code growsdown} vma ({@code mprotect} only).", "0x01000000"),
        "PROT_GROWSUP".enum("Extend change to start of {@code growsup} vma ({@code mprotect} only).", "0x02000000")
    )

    EnumConstant(
        """
        The flags argument determines whether updates to the mapping are visible to other processes mapping the same region, and whether updates are carried
        through to the underlying file.

        This behavior is determined by including exactly one of the following values in {@code flags}.
        """,

        "MAP_SHARED".enum(
            """
            Share this mapping.

            Updates to the mapping are visible to other processes mapping the same region, and (in the case of file-backed mappings) are carried through to the
            underlying file. (To precisely control when updates are carried through to the underlying file requires the use of {@code msync(2)}.)
            """,
            "0x01"
        ),
        "MAP_SHARED_VALIDATE".enum(
            """
            This flag provides the same behavior as #MAP_SHARED except that {@code MAP_SHARED} mappings ignore unknown flags in {@code flags}.

            By contrast, when creating a mapping using {@code MAP_SHARED_VALIDATE}, the kernel verifies all passed flags are known and fails the mapping with
            the error {@code EOPNOTSUPP} for unknown flags. This mapping type is also required to be able to use some mapping flags (e.g., {@code MAP_SYNC}).
            """,
            "0x03"
        ),
        "MAP_PRIVATE".enum(
            """
            Create a private copy-on-write mapping.

            Updates to the mapping are not visible to other processes mapping the same file, and are not carried through to the underlying file.  It is
            unspecified whether changes made to the file after the #mmap() call are visible in the mapped region.
            """,
            "0x02"
        )
    )

    IntConstant("", "MAP_HUGE_SHIFT".."26")
    IntConstant("", "MAP_HUGE_MASK".."0x3f")

    EnumConstant(
        "",

        "MAP_32BIT".enum(
            """
             Put the mapping into the first 2 Gigabytes of the process address space.

             This flag is supported only on x86-64, for 64-bit programs. It was added to allow thread stacks to be allocated somewhere in the first 2 GB of
             memory, so as to improve context-switch performance on some early 64-bit processors. Modern x86-64 processors no longer have this performance
             problem, so use of this flag is not required on those systems. The {@code MAP_32BIT} flag is ignored when #MAP_FIXED is set.
            """,
            "0x40"
        ),
        "MAP_ANONYMOUS".enum(
            """
            The mapping is not backed by any file; its contents are initialized to zero.

            The {@code fd} argument is ignored; however, some implementations require {@code fd} to be -1 if {@code MAP_ANONYMOUS} (or #MAP_ANON) is specified,
            and portable applications should ensure this. The {@code offset} argument should be zero. The use of {@code MAP_ANONYMOUS} in conjunction with
            {@code MAP_SHARED} is supported on Linux only since kernel 2.4.
            """,
            "0x20"
        ),
        "MAP_ANON".enum("Synonym for MAP_ANONYMOUS; provided for compatibility with other implementations.", "MAP_ANONYMOUS"),
        "MAP_DENYWRITE".enum(
            """
            This flag is ignored.

            (Long ago —Linux 2.0 and earlier— it signaled that attempts to write to the underlying file should fail with {@code ETXTBSY}. But this was a source
            of denial-of-service attacks.)
            """,
            "0x00800"
        ),
        "MAP_EXECUTABLE".enum("This flag is ignored.", "0x01000"),
        "MAP_FILE".enum("Compatibility flag. Ignored.", "0"),
        "MAP_FIXED".enum(
            """
            Don't interpret {@code addr} as a hint: place the mapping at exactly that address.

            {@code addr} must be suitably aligned: for most architectures a multiple of the page size is sufficient; however, some architectures may impose
            additional restrictions. If the memory region specified by {@code addr} and {@code length} overlaps pages of any existing mapping(s), then the
            overlapped part of the existing mapping(s) will be discarded. If the specified address cannot be used, #mmap() will fail.

            Software that aspires to be portable should use the {@code MAP_FIXED} flag with care, keeping in mind that the exact layout of a process's memory
            mappings is allowed to change significantly between kernel versions, C library versions, and operating system releases. Carefully read the
            discussion of this flag in NOTES!
            """,
            "0x10"
        ),
        "MAP_FIXED_NOREPLACE".enum(
            """
            This flag provides behavior that is similar to #MAP_FIXED with respect to the {@code addr} enforcement, but differs in that
            {@code MAP_FIXED_NOREPLACE} never clobbers a preexisting mapped range.

            If the requested range would collide with an existing mapping, then this call fails with the error {@code EEXIST}. This flag can therefore be used
            as a way to atomically (with respect to other threads) attempt to map an address range: one thread will succeed; all others will report failure.

            Note that older kernels which do not recognize the {@code MAP_FIXED_NOREPLACE} flag will typically (upon detecting a collision with a preexisting
            mapping) fall back to a "non-{@code MAP_FIXED}" type of behavior: they will return an address that is different from the requested address.
            Therefore, backward-compatible software should check the returned address against the requested address.

            (since Linux 4.17)
            """,
            "0x100000"
        ),
        "MAP_GROWSDOWN".enum(
            """
            This flag is used for stacks. It indicates to the kernel virtual memory system that the mapping should extend downward in memory.

            The return address is one page lower than the memory area that is actually created in the process's virtual address space. Touching an address in
            the "guard" page below the mapping will cause the mapping to grow by a page. This growth can be repeated until the mapping grows to within a page
            of the high end of the next lower mapping, at which point touching the "guard" page will result in a {@code SIGSEGV} signal.
            """,
            "0x00100"
        ),
        "MAP_HUGETLB".enum(
            """
            Allocate the mapping using "huge" pages.

            See the Linux kernel source file {@code Documentation/admin-guide/mm/hugetlbpage.rst} for further information, as well as NOTES, below.

            (since Linux 2.6.32)
            """,
            "0x40000"
        ),
        "MAP_HUGE_2MB".enum(
            """
            Used in conjunction with #MAP_HUGETLB to select alternative {@code hugetlb} page sizes (respectively, 2 MB and 1 GB) on systems that support
            multiple {@code hugetlb} page sizes.

            More generally, the desired huge page size can be configured by encoding the base-2 logarithm of the desired page size in the six bits at the
            offset #MAP_HUGE_SHIFT. (A value of zero in this bit field provides the default huge page size; the default huge page size can be discovered via
            the {@code Hugepagesize} field exposed by {@code /proc/meminfo}.) Thus, the above two constants are defined as:
            ${codeBlock("""
\#define MAP_HUGE_2MB    (21 << MAP_HUGE_SHIFT)
\#define MAP_HUGE_1GB    (30 << MAP_HUGE_SHIFT)""")}

            The range of huge page sizes that are supported by the system can be discovered by listing the subdirectories in {@code /sys/kernel/mm/hugepages}.

            (since Linux 3.8)
            """,
            "21 << MAP_HUGE_SHIFT"
        ),
        "MAP_HUGE_1GB".enum("See #MAP_HUGE_2MB.", "30 << MAP_HUGE_SHIFT"),
        "MAP_LOCKED".enum(
            """

            """,
            "0x02000"
        ),
        "MAP_NONBLOCK".enum(
            """

            """,
            "0x10000"
        ),
        "MAP_NORESERVE".enum(
            """

            """,
            "0x04000"
        ),
        "MAP_POPULATE".enum(
            """

            """,
            "0x08000"
        ),
        "MAP_STACK".enum(
            """

            """,
            "0x20000"
        ),
        "MAP_SYNC".enum(
            """

            """,
            "0x80000"
        ),
        "MAP_UNINITIALIZED".enum(
            """

            """,
            "0x4000000"
        )
    )

    SaveErrno..opaque_p(
        "mmap",
        """
        Creates a new mapping in the virtual address space of the calling process.

        The starting address for the new mapping is specified in {@code addr}. The {@code length} argument specifies the length of the mapping (which must be
        greater than 0).

        If {@code addr} is #NULL, then the kernel chooses the (page-aligned) address at which to create the mapping; this is the most portable method of
        creating a new mapping. If {@code addr} is not #NULL, then the kernel takes it as a hint about where to place the mapping; on Linux, the kernel will
        pick a nearby page boundary (but always above or equal to the value specified by {@code /proc/sys/vm/mmap_min_addr}) and attempt to create the mapping
        there. If another mapping already exists there, the kernel picks a new address that may or may not depend on the hint. The address of the new mapping
        is returned as the result of the call.

        The contents of a file mapping (as opposed to an anonymous mapping; see {@code MAP_ANONYMOUS} below), are initialized using {@code length} bytes
        starting at offset {@code offset} in the file (or other object) referred to by the file descriptor {@code fd}. {@code offset} must be a multiple of the
        page size as returned by {@code sysconf(_SC_PAGE_SIZE)}.

        After the {@code mmap()} call has returned, the file descriptor, {@code fd}, can be closed immediately without invalidating the mapping.
        """,

        nullable..opaque_p("addr", ""),
        size_t("length", ""),
        int(
            "prot",
            "describes the desired memory protection of the mapping (and must not conflict with the open mode of the file)",
            "PROT_\\w+", LinkMode.BITFIELD
        ),
        int("flags", "", "MAP_\\w+", LinkMode.BITFIELD),
        int("fd", ""),
        off_t("offset", ""),

        returnDoc =
        "on success, returns a pointer to the mapped area. On error, the value #MAP_FAILED is returned, and {@code errno} is set to indicate the error."
    )

    SaveErrno..int(
        "munmap",
        """
        Deletes the mappings for the specified address range, and causes further references to addresses within the range to generate invalid memory
        references.

        The region is also automatically unmapped when the process is terminated. On the other hand, closing the file descriptor does not unmap the region.

        The address {@code addr} must be a multiple of the page size (but {@code length} need not be). All pages containing a part of the indicated range are
        unmapped, and subsequent references to these pages will generate {@code SIGSEGV}. It is not an error if the indicated range does not contain any mapped
        pages.
        """,

        void.p("addr", ""),
        AutoSize("addr")..size_t("length", ""),

        returnDoc = "on success, returns 0. On failure, it returns -1, and {@code errno} is set to indicate the error (probably to {@code EINVAL})."
    )
}