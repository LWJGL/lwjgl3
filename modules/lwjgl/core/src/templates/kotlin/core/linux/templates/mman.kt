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
    LongConstant(
        "MAP_FAILED".."-1L"
    )

    EnumConstant(
        "PROT_EXEC".enum("0x4"),
        "PROT_READ".enum("0x1"),
        "PROT_WRITE".enum("0x2"),
        "PROT_NONE".enum("0x0"),
        "PROT_GROWSDOWN".enum("0x01000000"),
        "PROT_GROWSUP".enum("0x02000000")
    )

    EnumConstant(
        "MAP_SHARED".enum("0x01"),
        "MAP_SHARED_VALIDATE".enum("0x03"),
        "MAP_PRIVATE".enum("0x02")
    )

    IntConstant("MAP_HUGE_SHIFT".."26")
    IntConstant("MAP_HUGE_MASK".."0x3f")

    EnumConstant(
        "MAP_32BIT".enum("0x40"),
        "MAP_ANONYMOUS".enum("0x20"),
        "MAP_ANON".enum("MAP_ANONYMOUS"),
        "MAP_DENYWRITE".enum("0x00800"),
        "MAP_EXECUTABLE".enum("0x01000"),
        "MAP_FILE".enum("0"),
        "MAP_FIXED".enum("0x10"),
        "MAP_FIXED_NOREPLACE".enum("0x100000"),
        "MAP_GROWSDOWN".enum("0x00100"),
        "MAP_HUGETLB".enum("0x40000"),
        "MAP_HUGE_2MB".enum("21 << MAP_HUGE_SHIFT"),
        "MAP_HUGE_1GB".enum("30 << MAP_HUGE_SHIFT"),
        "MAP_LOCKED".enum("0x02000"),
        "MAP_NONBLOCK".enum("0x10000"),
        "MAP_NORESERVE".enum("0x04000"),
        "MAP_POPULATE".enum("0x08000"),
        "MAP_STACK".enum("0x20000"),
        "MAP_SYNC".enum("0x80000"),
        "MAP_UNINITIALIZED".enum("0x4000000")
    )

    opaque_p(
        "mmap",

        CaptureCallState.errno.param,
        nullable..opaque_p("addr"),
        size_t("length"),
        int("prot"),
        int("flags"),
        int("fd"),
        off_t("offset")
    )

    int(
        "munmap",

        CaptureCallState.errno.param,
        void.p("addr"),
        AutoSize("addr")..size_t("length")
    )
}