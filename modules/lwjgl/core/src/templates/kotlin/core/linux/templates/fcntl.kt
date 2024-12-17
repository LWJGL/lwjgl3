/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val fcntl = "FCNTL".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport(
        "<fcntl.h>",
        "<errno.h>"
    )
    EnumConstant(
        "O_ACCMODE".enum("00000003"),
        "O_RDONLY".enum("00000000"),
        "O_WRONLY".enum("00000001"),
        "O_RDWR".enum("00000002"),

        "O_APPEND".enum("00002000"),
        "O_ASYNC".enum("020000"),
        "O_CLOEXEC".enum("02000000"),
        "O_CREAT".enum("00000100"),
        "O_DIRECT".enum("040000"),
        "O_DIRECTORY".enum("0200000"),
        "O_DSYNC".enum("00010000"),
        "O_EXCL".enum("00000200"),
        "O_LARGEFILE".enum("00100000"),
        "O_NOATIME".enum("01000000"),
        "O_NOCTTY".enum("00000400"),
        "O_NOFOLLOW".enum("00400000"),
        "O_NONBLOCK".enum("00004000"),
        "O_NDELAY".enum("O_NONBLOCK"),
        "O_PATH".enum("010000000"),
        "O_SYNC".enum("04010000"),
        "O_TMPFILE".enum("020000000 | O_DIRECTORY"),
        "O_TRUNC".enum("00001000"),
    )

    EnumConstant(
        "S_IFMT".enum("00170000"),
        "S_IFBLK".enum("0060000"),
        "S_IFCHR".enum("0020000"),
        "S_IFIFO".enum("0010000"),
        "S_IFREG".enum("0100000"),
        "S_IFDIR".enum("0040000"),
        "S_IFLNK".enum("0120000"),
        "S_IFSOCK".enum("0140000")
    )

   EnumConstant(
        "S_IRWXU".enum("0700"),
        "S_IRUSR".enum("0400"),
        "S_IWUSR".enum("0200"),
        "S_IXUSR".enum("0100"),
        "S_IRWXG".enum("070"),
        "S_IRGRP".enum("040"),
        "S_IWGRP".enum("020"),
        "S_IXGRP".enum("010"),
        "S_IRWXO".enum("07"),
        "S_IROTH".enum("04"),
        "S_IWOTH".enum("02"),
        "S_IXOTH".enum("01"),
        "S_ISUID".enum("04000"),
        "S_ISGID".enum("02000"),
        "S_ISVTX".enum("01000")
    )

    EnumConstant(
        "F_DUPFD".enum("0"),
        "F_GETFD".enum("1"),
        "F_SETFD".enum("2"),
        "F_GETFL".enum("3"),
        "F_SETFL".enum("4"),
        "F_GETLK".enum("5"),
        "F_SETLK".enum("8"),
        "F_SETLKW".enum("7"),
        "F_SETOWN".enum("8"),
        "F_GETOWN".enum("9"),
        "F_SETSIG".enum("10"),
        "F_GETSIG".enum("11"),
        "F_SETOWN_EX".enum("15"),
        "F_GETOWN_EX".enum("16"),
        "F_OFD_GETLK".enum("36"),
        "F_OFD_SETLK".enum("37"),
        "F_OFD_SETLKW".enum("38"),
        "F_SETLEASE".enum("1024"),
        "F_GETLEASE".enum("1025"),
        "F_NOTIFY".enum("1026"),
        "F_SETPIPE_SZ".enum("1031"),
        "F_GETPIPE_SZ".enum("1032"),
        "F_ADD_SEALS".enum("1033"),
        "F_GET_SEALS".enum("1034"),
        "F_GET_RW_HINT".enum("1035"),
        "F_SET_RW_HINT".enum("1036"),
        "F_GET_FILE_RW_HINT".enum("1037"),
        "F_SET_FILE_RW_HINT".enum("1038"),
        "F_DUPFD_CLOEXEC".enum("1030")
    )

    IntConstant("FD_CLOEXEC".."1")

    EnumConstant(
        "F_RDLCK".enum("0"),
        "F_WRLCK".enum("1"),
        "F_UNLCK".enum("2"),
        "F_EXLCK".enum("4"),
        "F_SHLCK".enum("8")
    )

    EnumConstant(
        "F_OWNER_TID".enum("0"),
        "F_OWNER_PID".enum("1"),
        "F_OWNER_PGRP".enum("2")
    )

    EnumConstant(
        "LOCK_SH".enum("1"),
        "LOCK_EX".enum("2"),
        "LOCK_NB".enum("4"),
        "LOCK_UN".enum("8"),
        "LOCK_MAND".enum("32"),
        "LOCK_READ".enum("64"),
        "LOCK_WRITE".enum("128"),
        "LOCK_RW".enum("192")
    )

    EnumConstant(
        "DN_ACCESS".enum(0x00000001),
        "DN_MODIFY".enum(0x00000002),
        "DN_CREATE".enum(0x00000004),
        "DN_DELETE".enum(0x00000008),
        "DN_RENAME".enum(0x00000010),
        "DN_ATTRIB".enum(0x00000020),
        "DN_MULTISHOT".enum("0x80000000")
    )

    EnumConstant(
        "F_SEAL_SEAL".enum("0x0001"),
        "F_SEAL_SHRINK".enum("0x0002"),
        "F_SEAL_GROW".enum("0x0004"),
        "F_SEAL_WRITE".enum("0x0008"),
        "F_SEAL_FUTURE_WRITE".enum("0x0010")
    )

    EnumConstant(
        "RWH_WRITE_LIFE_NOT_SET".enum("0"),
        "RWH_WRITE_LIFE_NONE".enum,
        "RWH_WRITE_LIFE_SHORT".enum,
        "RWH_WRITE_LIFE_MEDIUM".enum,
        "RWH_WRITE_LIFE_LONG".enum,
        "RWH_WRITE_LIFE_EXTREME".enum
    )

    int(
        "open",

        CaptureCallState.errno.param,
        charUTF8.const.p("pathname"),
        int("flags"),
        mode_t("mode")
    )

    int(
        "openat",

        CaptureCallState.errno.param,
        int("dirfd"),
        charUTF8.const.p("pathname"),
        int("flags"),
        mode_t("mode")
    )

    int(
        "creat",

        CaptureCallState.errno.param,
        charUTF8.const.p("pathname"),
        mode_t("mode")
    )

    int(
        "fcntl",

        CaptureCallState.errno.param,
        int("fd"),
        int("cmd")
    )

    NativeName("fcntl")..int(
        "fcntli",

        CaptureCallState.errno.param,
        int("fd"),
        int("cmd"),
        int("arg")
    )

    NativeName("fcntl")..int(
        "fcntlp",

        CaptureCallState.errno.param,
        int("fd"),
        int("cmd"),
        opaque_p("arg")
    )
}