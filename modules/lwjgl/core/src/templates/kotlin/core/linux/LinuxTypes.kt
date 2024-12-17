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
val loff_t = typedef(long_long, "loff_t")
val pid_t = typedef(int, "pid_t")
val id_t = typedef(int, "id_t")
val pthread_t = typedef(unsigned_long_int, "pthread_t")
val socklen_t = typedef(uint32_t, "socklen_t")

val cpu_set_t = "cpu_set_t".opaque
val sigset_t = "sigset_t".opaque

val idtype_t = "idtype_t".enumType

val flock = struct(Module.CORE_LINUX, "Flock", nativeName = "flock64") {
    short("l_type")
    short("l_whence")
    off_t("l_start")
    off_t("l_len")
    pid_t("l_pid")
}

val f_owner_ex = struct(Module.CORE_LINUX, "FOwnerEx", nativeName = "f_owner_ex") {
    int("type")
    pid_t("pid")
}

// fcntl.h

val open_how = struct(Module.CORE_LINUX, "OpenHow", nativeName = "struct open_how") {
    __u64("flags")
    __u64("mode")
    __u64("resolve")
}

// fs.h

val __kernel_rwf_t = typedef(int, "__kernel_rwf_t")

// sys/epoll.h

val epoll_data_t = union(Module.CORE_LINUX, "EpollData", nativeName = "epoll_data_t") {
    opaque_p("ptr")
    int("fd")
    uint32_t("u32")
    uint64_t("u64")
}

val epoll_event = struct(Module.CORE_LINUX, "EpollEvent", nativeName = "struct epoll_event") {
    uint32_t("events")
    epoll_data_t("data")
}

// sys/uio.h

val iovec = struct(Module.CORE_LINUX, "IOVec", nativeName = "struct iovec") {
    Check("iov_len")..nullable..void.p("iov_base")
    size_t("iov_len")
}

// sys/socket.h

val msghdr = struct(Module.CORE_LINUX, "Msghdr", nativeName = "struct msghdr") {
    void.p("msg_name")
    AutoSize("msg_name")..socklen_t("msg_namelen")

    iovec.p("msg_iov")
    AutoSize("msg_iov")..size_t("msg_iovlen")

    void.p("msg_control")
    AutoSize("msg_control")..size_t("msg_controllen")

    int("msg_flags")
}

val sockaddr = struct(Module.CORE_LINUX, "Sockaddr", nativeName = "struct sockaddr") {
    typedef(unsigned_short, "sa_family_t")("sa_family")
    char("sa_data")[14]
}

val cmsghdr = struct(Module.CORE_LINUX, "CMsghdr", nativeName = "struct cmsghdr") {
    socklen_t("cmsg_len")
    int("cmsg_level")
    int("cmsg_type")
    char("cmsg_data")[0]
}

// sys/stat.h

val stat = "struct stat".opaque // TODO:

val statx_timestamp = struct(Module.CORE_LINUX, "StatxTimestamp", nativeName = "struct statx_timestamp") {
    __s64("tv_sec")
    __u32("tv_nsec")
    __s32("__reserved").private()
}

val statx = struct(Module.CORE_LINUX, "Statx", nativeName = "struct statx") {
    __u32("stx_mask")
    __u32("stx_blksize")
    __u64("stx_attributes")
    __u32("stx_nlink")
    __u32("stx_uid")
    __u32("stx_gid")
    __u16("stx_mode")
    __u16("__spare0")[1].private()
    __u64("stx_ino")
    __u64("stx_size")
    __u64("stx_blocks")
    __u64("stx_attributes_mask")
    statx_timestamp("stx_atime")
    statx_timestamp("stx_btime")
    statx_timestamp("stx_ctime")
    statx_timestamp("stx_mtime")
    __u32("stx_rdev_major")
    __u32("stx_rdev_minor")
    __u32("stx_dev_major")
    __u32("stx_dev_minor")
    __u64("stx_mnt_id")
    __u64("__spare2").private()
    __u64("__spare3")[12].private()
}

// time_types.h

val __kernel_timespec = struct(Module.CORE_LINUX, "KernelTimespec", nativeName = "struct __kernel_timespec") {
    int64_t("tv_sec")
    long_long("tv_nsec")
}