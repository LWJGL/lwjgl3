/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux

import org.lwjgl.generator.*

val __u8 = typedef(uint8_t, "__u8")
val __u16 = typedef(uint16_t, "__u16")
val __u32 = typedef(uint32_t, "__u32")
val __u64 = typedef(uint64_t, "__u64")

val __s32 = typedef(int32_t, "__s32")
val __s64 = typedef(int64_t, "__s64")

val ssize_t = IntegerType("ssize_t", PrimitiveMapping.POINTER)

val mode_t = typedef(unsigned_int, "mode_t")
val off_t = typedef(int64_t, "off_t")
val pid_t = typedef(int, "pid_t")
val socklen_t = typedef(uint32_t, "socklen_t")

val cpu_set_t = "cpu_set_t".opaque
val sigset_t = "sigset_t".opaque

val flock = struct(Module.CORE_LINUX, "Flock", nativeName = "flock64") {
    short("l_type", "type of lock").links("#F_RDLCK #F_WRLCK #F_UNLCK")
    short("l_whence", "where {@code l_start} is relative to (like {@code lseek})")
    off_t("l_start", "offset where the lock begins")
    off_t("l_len", "size of the locked area; zero means until EOF")
    pid_t("l_pid", "process holding the lock")
}

val f_owner_ex = struct(Module.CORE_LINUX, "FOwnerEx", nativeName = "f_owner_ex") {
    int("type", "")
    pid_t("pid", "")
}

// fcntl.h

val open_how = struct(Module.CORE_LINUX, "OpenHow", nativeName = "struct open_how") {
    documentation =
        """
        Arguments for how {@code openat2(2)} should open the target path.

        If only {@code flags} and {@code @}mode are non-zero, then {@code openat2(2)} operates very similarly to {@code openat(2)}.

        However, unlike {@code openat(2)}, unknown or invalid bits in {@code flags} result in {@code -EINVAL} rather than being silently ignored. {@code mode}
        must be zero unless one of #O_CREAT, #O_TMPFILE are set.
        """

    __u64("flags", "")
    __u64("mode", "")
    __u64("resolve", "")
}

// fs.h

val __kernel_rwf_t = typedef(int, "__kernel_rwf_t")

// sys/epoll.h

val epoll_data_t = union(Module.CORE_LINUX, "EpollData", nativeName = "epoll_data_t") {
    opaque_p("ptr", "")
    int("fd", "")
    uint32_t("u32", "")
    uint64_t("u64", "")
}

val epoll_event = struct(Module.CORE_LINUX, "EpollEvent", nativeName = "struct epoll_event") {
    uint32_t("events", "epoll events")
    epoll_data_t("data", "user data variable")
}

// sys/uio.h

val iovec = struct(Module.CORE_LINUX, "IOVec", nativeName = "struct iovec") {
    Check("iov_len")..nullable..void.p("iov_base", "starting address")
    size_t("iov_len", "number of bytes to transfer")
}

// sys/socket.h

val msghdr = struct(Module.CORE_LINUX, "Msghdr", nativeName = "struct msghdr") {
    void.p("msg_name", "address to send to/receive from")
    AutoSize("msg_name")..socklen_t("msg_namelen", "length of {@code address} data")

    iovec.p("msg_iov", "vector of data to send/receive into")
    AutoSize("msg_iov")..size_t("msg_iovlen", "number of elements in the vector")

    void.p("msg_control", "ancillary data (eg BSD filedesc passing)")
    AutoSize("msg_control")..size_t("msg_controllen", "ancillary data buffer length")

    int("msg_flags", "flags on received message")
}

val sockaddr = struct(Module.CORE_LINUX, "Sockaddr", nativeName = "struct sockaddr") {
    documentation = "Structure describing a generic socket address."

    typedef(unsigned_short, "sa_family_t")("sa_family", "address family and length")
    char("sa_data", "address data")[14]
}

// sys/stat.h

val stat = "struct stat".opaque // TODO:

val statx_timestamp = struct(Module.CORE_LINUX, "StatxTimestamp", nativeName = "struct statx_timestamp") {
    documentation =  "Timestamp structure for the timestamps in {@code struct statx}."

    __s64("tv_sec", "the number of seconds before (negative) or after (positive) {@code 00:00:00 1st January 1970 UTC}")
    __u32("tv_nsec", "a number of nanoseconds (0..999,999,999) after the {@code tv_sec} time")
    __s32("__reserved", "in case we need a yet finer resolution").private()
}

val statx = struct(Module.CORE_LINUX, "Statx", nativeName = "struct statx") {
    __u32("stx_mask", "what results were written [uncond]")
    __u32("stx_blksize", "preferred general I/O size [uncond]")
    __u64("stx_attributes", "flags conveying information about the file [uncond]")
    __u32("stx_nlink", "number of hard links")
    __u32("stx_uid", "user ID of owner")
    __u32("stx_gid", "group ID of owner")
    __u16("stx_mode", "file mode")
    __u16("__spare0", "")[1].private()
    __u64("stx_ino", "{@code inode} number")
    __u64("stx_size", "file size")
    __u64("stx_blocks", "number of 512-byte blocks allocated")
    __u64("stx_attributes_mask", "mask to show what's supported in {@code stx_attributes}")
    statx_timestamp("stx_atime", "last access time")
    statx_timestamp("stx_btime", "file creation time")
    statx_timestamp("stx_ctime", "last attribute change time")
    statx_timestamp("stx_mtime", "last data modification time ")
    __u32("stx_rdev_major", "device ID of special file [if bdev/cdev]")
    __u32("stx_rdev_minor", "")
    __u32("stx_dev_major", "ID of device containing file [uncond]")
    __u32("stx_dev_minor", "")
    __u64("stx_mnt_id", "")
    __u64("__spare2", "").private()
    __u64("__spare3", "spare space for future expansion")[12].private()
}

// time_types.h

val __kernel_timespec = struct(Module.CORE_LINUX, "KernelTimespec", nativeName = "struct __kernel_timespec") {
    int64_t("tv_sec", "seconds")
    long_long("tv_nsec", "nanoseconds")
}