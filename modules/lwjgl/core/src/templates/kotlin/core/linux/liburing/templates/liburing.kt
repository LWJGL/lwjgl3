/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.liburing.templates

import org.lwjgl.generator.*
import core.linux.*
import core.linux.liburing.*

val LibURing = "LibURing".nativeClass(Module.CORE_LINUX_LIBURING, nativeSubPath = "linux", prefixConstant = "", prefixMethod = "io_uring_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#ifdef LWJGL_LINUX
    _Pragma("GCC diagnostic ignored \"-Wsign-compare\"")
#endif
#include "liburing.h"
ENABLE_WARNINGS()""")
    javaImport("org.lwjgl.system.linux.*")

    LongConstant("LIBURING_UDATA_TIMEOUT".."-1L")

    io_uring_probe.p(
        "get_probe_ring",

        io_uring.p("ring")
    )

    io_uring_probe.p(
        "get_probe",
        void()
    )

    void(
        "free_probe",

        io_uring_probe.p("probe")
    )

    int(
        "opcode_supported",

        io_uring_probe.const.p("p"),
        int("op")
    )

    int(
        "queue_init_mem",

        unsigned("entries"),
        io_uring.p("ring"),
        io_uring_params.p("p"),
        void.p("buf"),
        AutoSize("buf")..size_t("buf_size")
    )

    int(
        "queue_init_params",

        unsigned("entries"),
        io_uring.p("ring"),
        io_uring_params.p("p")
    )

    int(
        "queue_init",

        unsigned("entries"),
        io_uring.p("ring"),
        unsigned("flags")
    )

    int(
        "queue_mmap",

        int("fd"),
        io_uring_params.p("p"),
        io_uring.p("ring")
    )

    int(
        "ring_dontfork",

        io_uring.p("ring")
    )

    void(
        "queue_exit",

        io_uring.p("ring")
    )

    unsigned(
        "peek_batch_cqe",

        io_uring.p("ring"),
        io_uring_cqe.p.p("cqes"),
        AutoSize("cqes")..unsigned("count")
    )

    int(
        "wait_cqes",

        io_uring.p("ring"),
        io_uring_cqe.p.p("cqe_ptr"),
        AutoSize("cqe_ptr")..unsigned("wait_nr"),
        nullable..__kernel_timespec.p("ts"),
        nullable..sigset_t.p("sigmask")
    )

    int(
        "wait_cqes_min_timeout",

        io_uring.p("ring"),
        io_uring_cqe.p.p("cqe_ptr"),
        AutoSize("cqe_ptr")..unsigned("wait_nr"),
        nullable..__kernel_timespec.p("ts"),
        unsigned_int("min_ts_usec"),
        nullable..sigset_t.p("sigmask")
    )

    int(
        "wait_cqe_timeout",

        io_uring.p("ring"),
        Check(1)..io_uring_cqe.p.p("cqe_ptr"),
        nullable..__kernel_timespec.p("ts")
    )

    int(
        "submit",

        io_uring.p("ring")
    )

    int(
        "submit_and_wait",

        io_uring.p("ring"),
        unsigned("wait_nr")
    )

    int(
        "submit_and_wait_timeout",

        io_uring.p("ring"),
        io_uring_cqe.p.p("cqe_ptr"),
        AutoSize("cqe_ptr")..unsigned("wait_nr"),
        nullable..__kernel_timespec.p("ts"),
        nullable..sigset_t.p("sigmask")
    )

    int(
        "submit_and_wait_min_timeout",

        io_uring.p("ring"),
        io_uring_cqe.p.p("cqe_ptr"),
        AutoSize("cqe_ptr")..unsigned("wait_nr"),
        nullable..__kernel_timespec.p("ts"),
        unsigned("min_wait"),
        nullable..sigset_t.p("sigmask")
    )

    int(
        "submit_and_wait_reg",

        io_uring.p("ring"),
        io_uring_cqe.p.p("cqe_ptr"),
        AutoSize("cqe_ptr")..unsigned("wait_nr"),
        int("reg_index")
    )

    int(
        "register_wait_reg",

        io_uring.p("ring"),
        io_uring_reg_wait.p("reg"),
        int("nr")
    )

    int(
        "resize_rings",

        io_uring.p("ring"),
        io_uring_params.p("p")
    )

    int(
        "clone_buffers_offset",

        io_uring.p("dst"),
        io_uring.p("src"),
        unsigned("dst_off"),
        unsigned("src_off"),
        unsigned("nr"),
        unsigned("flags")
    )

    int(
        "clone_buffers",

        io_uring.p("dst"),
        io_uring.p("src")
    )

    int(
        "register_buffers",

        io_uring.p("ring"),
        iovec.const.p("iovecs"),
        AutoSize("iovecs")..unsigned("nr_iovecs")
    )

    int(
        "register_buffers_tags",

        io_uring.p("ring"),
        iovec.const.p("iovecs"),
        __u64.const.p("tags"),
        AutoSize("iovecs", "tags")..unsigned("nr")
    )

    int(
        "register_buffers_sparse",

        io_uring.p("ring"),
        unsigned("nr_iovecs")
    )

    int(
        "register_buffers_update_tag",

        io_uring.p("ring"),
        unsigned("off"),
        iovec.const.p("iovecs"),
        __u64.const.p("tags"),
        AutoSize("iovecs", "tags")..unsigned("nr")
    )

    int(
        "unregister_buffers",

        io_uring.p("ring")
    )

    int(
        "register_files",

        io_uring.p("ring"),
        int.const.p("files"),
        AutoSize("files")..unsigned("nr_files")
    )

    int(
        "register_files_tags",

        io_uring.p("ring"),
        int.const.p("files"),
        __u64.const.p("tags"),
        AutoSize("files", "tags")..unsigned("nr")
    )

    int(
        "register_files_sparse",

        io_uring.p("ring"),
        unsigned("nr_files")
    )

    int(
        "register_files_update_tag",

        io_uring.p("ring"),
        unsigned("off"),
        int.const.p("files"),
        __u64.const.p("tags"),
        AutoSize("files", "tags")..unsigned("nr_files")
    )

    int(
        "unregister_files",

        io_uring.p("ring")
    )

    int(
        "register_files_update",

        io_uring.p("ring"),
        unsigned("off"),
        int.const.p("files"),
        AutoSize("files")..unsigned("nr_files")
    )

    int(
        "register_eventfd",

        io_uring.p("ring"),
        int("fd")
    )

    int(
        "register_eventfd_async",

        io_uring.p("ring"),
        int("fd")
    )

    int(
        "unregister_eventfd",

        io_uring.p("ring")
    )

    int(
        "register_probe",

        io_uring.p("ring"),
        io_uring_probe.p("p"),
        unsigned("nr")
    )

    int(
        "register_personality",

        io_uring.p("ring")
    )

    int(
        "unregister_personality",

        io_uring.p("ring"),
        int("id")
    )

    int(
        "register_restrictions",

        io_uring.p("ring"),
        io_uring_restriction.p("res"),
        AutoSize("res")..unsigned("nr_res")
    )

    int(
        "enable_rings",

        io_uring.p("ring")
    )

    int(
        "__io_uring_sqring_wait",

        io_uring.p("ring"),

        noPrefix = true
    )

    int(
        "register_iowq_aff",

        io_uring.p("ring"),
        size_t("cpusz"),
        cpu_set_t.const.p("mask")
    )

    int(
        "unregister_iowq_aff",

        io_uring.p("ring")
    )

    int(
        "register_iowq_max_workers",

        io_uring.p("ring"),
        Check(2)..unsigned_int.p("values")
    )

    int(
        "register_ring_fd",

        io_uring.p("ring")
    )

    int(
        "unregister_ring_fd",

        io_uring.p("ring")
    )

    int(
        "close_ring_fd",

        io_uring.p("ring")
    )

    int(
        "register_buf_ring",

        io_uring.p("ring"),
        io_uring_buf_reg.p("reg"),
        unsigned_int("flags")
    )

    int(
        "unregister_buf_ring",

        io_uring.p("ring"),
        int("bgid")
    )

    int(
        "buf_ring_head",

        io_uring.p("ring"),
        int("buf_group"),
        Check(1)..unsigned_short.p("head")
    )

    int(
        "register_sync_cancel",

        io_uring.p("ring"),
        io_uring_sync_cancel_reg.p("reg")
    )

    int(
        "register_file_alloc_range",

        io_uring.p("ring"),
        unsigned("off"),
        unsigned("len")
    )

    int(
        "register_napi",

        io_uring.p("ring"),
        io_uring_napi.p("napi")
    )

    int(
        "unregister_napi",

        io_uring.p("ring"),
        io_uring_napi.p("napi")
    )

    int(
        "register_ifq",

        io_uring.p("ring"),
        io_uring_zcrx_ifq_reg.p("reg")
    )

    int(
        "register_clock",

        io_uring.p("ring"),
        io_uring_clock_register.p("arg")
    )

    int(
        "get_events",

        io_uring.p("ring")
    )

    int(
        "submit_and_get_events",

        io_uring.p("ring")
    )

    int(
        "enter",

        unsigned_int("fd"),
        unsigned_int("to_submit"),
        unsigned_int("min_complete"),
        unsigned_int("flags"),
        sigset_t.p("sig")
    )

    int(
        "enter2",

        unsigned_int("fd"),
        unsigned_int("to_submit"),
        unsigned_int("min_complete"),
        unsigned_int("flags"),
        void.p("arg"),
        AutoSize("arg")..size_t("sz")
    )

    int(
        "setup",

        unsigned_int("entries"),
        io_uring_params.p("p")
    )

    int(
        "register",

        unsigned_int("fd"),
        unsigned_int("opcode"),
        nullable..opaque_p("arg"),
        unsigned_int("nr_args")
    )

    int(
        "register_region",

        io_uring.p("ring"),
        io_uring_mem_region_reg.p("reg")
    )

    io_uring_buf_ring.p(
        "setup_buf_ring",

        io_uring.p("ring"),
        unsigned_int("nentries"),
        int("bgid"),
        unsigned_int("flags"),
        Check(1)..int.p("err")
    )

    int(
        "free_buf_ring",

        io_uring.p("ring"),
        io_uring_buf_ring.p("br"),
        unsigned_int("nentries"),
        int("bgid")
    )

    int(
        "set_iowait",

        io_uring.p("ring"),
        bool("enable_iowait")
    )

    unsigned(
        "cqe_shift_from_flags",

        unsigned("flags")
    )

    unsigned(
        "cqe_shift",

        io_uring.const.p("ring")
    )

    unsigned(
        "cqe_nr",

        io_uring_cqe.const.p("cqe")
    )

    void(
        "cq_advance",

        io_uring.p("ring"),
        unsigned("nr")
    )

    void(
        "cqe_seen",

        io_uring.p("ring"),
        io_uring_cqe.p("cqe")
    )

    void(
        "sqe_set_data",

        io_uring_sqe.p("sqe"),
        opaque_p("data")
    )

    opaque_p(
        "cqe_get_data",

        io_uring_cqe.const.p("cqe")
    )

    void(
        "sqe_set_data64",

        io_uring_sqe.p("sqe"),
        __u64("data")
    )

    __u64(
        "cqe_get_data64",

        io_uring_cqe.const.p("cqe")
    )

    void(
        "sqe_set_flags",

        io_uring_sqe.p("sqe"),
        unsigned_int("flags")
    )

    void(
        "sqe_set_buf_group",

        io_uring_sqe.p("sqe"),
        int("bgid")
    )

    void(
        "initialize_sqe",

        io_uring_sqe.p("sqe")
    )

    void(
        "prep_splice",

        io_uring_sqe.p("sqe"),
        int("fd_in"),
        int64_t("off_in"),
        int("fd_out"),
        int64_t("off_out"),
        unsigned_int("nbytes"),
        unsigned_int("splice_flags")
    )

    void(
        "prep_tee",

        io_uring_sqe.p("sqe"),
        int("fd_in"),
        int("fd_out"),
        unsigned_int("nbytes"),
        unsigned_int("splice_flags")
    )

    void(
        "prep_readv",

        io_uring_sqe.p("sqe"),
        int("fd"),
        iovec.const.p("iovecs"),
        AutoSize("iovecs")..unsigned_int("nr_vecs"),
        int("offset")
    )

    void(
        "prep_readv2",

        io_uring_sqe.p("sqe"),
        int("fd"),
        iovec.const.p("iovecs"),
        AutoSize("iovecs")..unsigned_int("nr_vecs"),
        int("offset"),
        int("flags")
    )

    void(
        "prep_read_fixed",

        io_uring_sqe.p("sqe"),
        int("fd"),
        void.p("buf"),
        AutoSize("buf")..unsigned_int("nbytes"),
        __u64("offset"),
        int("buf_index")
    )

    void(
        "prep_readv_fixed",

        io_uring_sqe.p("sqe"),
        int("fd"),
        iovec.const.p("iovecs"),
        AutoSize("iovecs")..unsigned_int("nr_vecs"),
        __u64("offset"),
        int("flags"),
        int("buf_index")
    )

    void(
        "prep_writev",

        io_uring_sqe.p("sqe"),
        int("fd"),
        iovec.const.p("iovecs"),
        AutoSize("iovecs")..unsigned_int("nr_vecs"),
        __u64("offset")
    )

    void(
        "prep_writev2",

        io_uring_sqe.p("sqe"),
        int("fd"),
        iovec.const.p("iovecs"),
        AutoSize("iovecs")..unsigned_int("nr_vecs"),
        __u64("offset"),
        int("flags")
    )

    void(
        "prep_write_fixed",

        io_uring_sqe.p("sqe"),
        int("fd"),
        void.const.p("buf"),
        AutoSize("buf")..unsigned_int("nbytes"),
        __u64("offset"),
        int("buf_index")
    )

    void(
        "prep_writev_fixed",

        io_uring_sqe.p("sqe"),
        int("fd"),
        iovec.const.p("iovecs"),
        AutoSize("iovecs")..unsigned_int("nr_vecs"),
        __u64("offset"),
        int("flags"),
        int("buf_index")
    )

    void(
        "prep_recvmsg",

        io_uring_sqe.p("sqe"),
        int("fd"),
        msghdr.p("msg"),
        unsigned("flags")
    )

    void(
        "prep_recvmsg_multishot",

        io_uring_sqe.p("sqe"),
        int("fd"),
        msghdr.p("msg"),
        unsigned("flags")
    )

    void(
        "prep_sendmsg",

        io_uring_sqe.p("sqe"),
        int("fd"),
        msghdr.const.p("msg"),
        unsigned("flags")
    )

    void(
        "prep_poll_add",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned("poll_mask")
    )

    void(
        "prep_poll_multishot",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned("poll_mask")
    )

    void(
        "prep_poll_remove",

        io_uring_sqe.p("sqe"),
        __u64("user_data")
    )

    void(
        "prep_poll_update",

        io_uring_sqe.p("sqe"),
        __u64("old_user_data"),
        __u64("new_user_data"),
        unsigned("poll_mask"),
        unsigned("flags")
    )

    void(
        "prep_fsync",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned("fsync_flags") // TODO:
    )

    void(
        "prep_nop",

        io_uring_sqe.p("sqe")
    )

    void(
        "prep_nop128",

        io_uring_sqe.p("sqe")
    )

    void(
        "prep_timeout",

        io_uring_sqe.p("sqe"),
        __kernel_timespec.const.p("ts"),
        unsigned("count"),
        unsigned("flags")
    )

    void(
        "prep_timeout_remove",

        io_uring_sqe.p("sqe"),
        __u64("user_data"),
        unsigned("flags")
    )

    void(
        "prep_timeout_update",

        io_uring_sqe.p("sqe"),
        __kernel_timespec.const.p("ts"),
        __u64("user_data"),
        unsigned("flags")
    )

    void(
        "prep_accept",

        io_uring_sqe.p("sqe"),
        int("fd"),
        sockaddr.p("addr"),
        Check(1)..socklen_t.p("addrlen"),
        int("flags")
    )

    void(
        "prep_accept_direct",

        io_uring_sqe.p("sqe"),
        int("fd"),
        sockaddr.p("addr"),
        Check(1)..socklen_t.p("addrlen"),
        int("flags"),
        unsigned_int("file_index")
    )

    void(
        "prep_multishot_accept",

        io_uring_sqe.p("sqe"),
        int("fd"),
        sockaddr.p("addr"),
        Check(1)..socklen_t.p("addrlen"),
        int("flags")
    )

    void(
        "prep_multishot_accept_direct",

        io_uring_sqe.p("sqe"),
        int("fd"),
        sockaddr.p("addr"),
        Check(1)..socklen_t.p("addrlen"),
        int("flags"),
    )

    void(
        "prep_cancel64",

        io_uring_sqe.p("sqe"),
        __u64("user_data"),
        int("flags")
    )

    void(
        "prep_cancel",

        io_uring_sqe.p("sqe"),
        nullable..opaque_p("user_data"),
        int("flags") // TODO:
    )

    void(
        "prep_cancel_fd",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned_int("flags")
    )

    void(
        "prep_link_timeout",

        io_uring_sqe.p("sqe"),
        __kernel_timespec.const.p("ts"),
        unsigned("flags")
    )

    void(
        "prep_connect",

        io_uring_sqe.p("sqe"),
        int("fd"),
        sockaddr.const.p("addr"),
        socklen_t("addrlen")
    )

    void(
        "prep_bind",

        io_uring_sqe.p("sqe"),
        int("fd"),
        sockaddr.const.p("addr"),
        socklen_t("addrlen")
    )

    void(
        "prep_listen",

        io_uring_sqe.p("sqe"),
        int("fd"),
        int("backlog")
    )

    void(
        "prep_epoll_wait",

        io_uring_sqe.p("sqe"),
        int("fd"),
        epoll_event.p("events"),
        AutoSize("events")..unsigned_int("maxevents"),
        unsigned("flags")
    )

    void(
        "prep_files_update",

        io_uring_sqe.p("sqe"),
        int.p("fds"),
        AutoSize("fds")..unsigned("nr_fds"),
        int("offset")
    )

    void(
        "prep_fallocate",

        io_uring_sqe.p("sqe"),
        int("fd"),
        int("mode"), // TODO:
        __u64("offset"),
        __u64("len")
    )

    void(
        "prep_openat",

        io_uring_sqe.p("sqe"),
        int("dfd"),
        charUTF8.const.p("path"),
        int("flags"), // TODO:
        int("mode") // TODO:
    )

    void(
        "prep_openat_direct",

        io_uring_sqe.p("sqe"),
        int("dfd"),
        charUTF8.const.p("path"),
        int("flags"), // TODO:
        int("mode"), // TODO:
        unsigned_int("file_index")
    )

    void(
        "prep_open",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("path"),
        int("flags"), // TODO:
        mode_t("mode") // TODO:
    )

    void(
        "prep_open_direct",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("path"),
        int("flags"), // TODO:
        mode_t("mode"), // TODO:
        unsigned("file_index")
    )

    void(
        "prep_close",

        io_uring_sqe.p("sqe"),
        int("fd")
    )

    void(
        "prep_close_direct",

        io_uring_sqe.p("sqe"),
        unsigned_int("file_index")
    )

    void(
        "prep_read",

        io_uring_sqe.p("sqe"),
        int("fd"),
        void.p("buf"),
        AutoSize("buf")..unsigned_int("nbytes"),
        __u64("offset")
    )

    void(
        "prep_read_multishot",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned_int("nbytes"),
        __u64("offset"),
        int("buf_group")
    )

    void(
        "prep_write",

        io_uring_sqe.p("sqe"),
        int("fd"),
        void.const.p("buf"),
        AutoSize("buf")..unsigned_int("nbytes"),
        __u64("offset")
    )

    void(
        "prep_statx",

        io_uring_sqe.p("sqe"),
        int("dfd"),
        charUTF8.const.p("path"),
        int("flags"),
        unsigned("mask"),
        statx.p("statxbuf")
    )

    void(
        "prep_fadvise",

        io_uring_sqe.p("sqe"),
        int("fd"),
        __u64("offset"),
        __u32("len"),
        int("advice") // TODO:
    )

    void(
        "prep_madvise",

        io_uring_sqe.p("sqe"),
        void.p("addr"),
        AutoSize("addr")..__u32("length"),
        int("advice") // TODO:
    )

    void(
        "prep_fadvise64",

        io_uring_sqe.p("sqe"),
        int("fd"),
        __u64("offset"),
        off_t("len"),
        int("advice") // TODO:
    )

    void(
        "prep_madvise64",

        io_uring_sqe.p("sqe"),
        void.p("addr"),
        AutoSize("addr")..off_t("length"),
        int("advice") // TODO:
    )

    void(
        "prep_send",

        io_uring_sqe.p("sqe"),
        int("sockfd"),
        void.const.p("buf"),
        AutoSize("buf")..size_t("len"),
        int("flags")
    )

    void(
        "prep_send_bundle",

        io_uring_sqe.p("sqe"),
        int("sockfd"),
        size_t("len"),
        int("flags")
    )

    void(
        "prep_send_set_addr",

        io_uring_sqe.p("sqe"),
        sockaddr.const.p("dest_addr"),
        __u16("addr_len")
    )

    void(
        "prep_sendto",

        io_uring_sqe.p("sqe"),
        int("sockfd"),
        void.const.p("buf"),
        AutoSize("buf")..size_t("len"),
        int("flags"),
        sockaddr.const.p("addr"),
        socklen_t("addrlen")
    )

    void(
        "prep_send_zc",

        io_uring_sqe.p("sqe"),
        int("sockfd"),
        void.const.p("buf"),
        AutoSize("buf")..size_t("len"),
        int("flags"),
        unsigned("zc_flags")
    )

    void(
        "prep_send_zc_fixed",

        io_uring_sqe.p("sqe"),
        int("sockfd"),
        void.const.p("buf"),
        AutoSize("buf")..size_t("len"),
        int("flags"),
        unsigned("zc_flags"),
        unsigned("buf_index")
    )

    void(
        "prep_sendmsg_zc",

        io_uring_sqe.p("sqe"),
        int("fd"),
        msghdr.const.p("msg"),
        unsigned("flags")
    )

    void(
        "prep_sendmsg_zc_fixed",

        io_uring_sqe.p("sqe"),
        int("fd"),
        msghdr.const.p("msg"),
        unsigned("flags"),
        unsigned("buf_index")
    )

    void(
        "prep_recv",

        io_uring_sqe.p("sqe"),
        int("sockfd"),
        void.p("buf"),
        AutoSize("buf")..size_t("len"),
        int("flags")
    )

    void(
        "prep_recv_multishot",

        io_uring_sqe.p("sqe"),
        int("sockfd"),
        void.p("buf"),
        AutoSize("buf")..size_t("len"),
        int("flags")
    )

    io_uring_recvmsg_out.p(
        "recvmsg_validate",

        void.p("buf"),
        AutoSize("buf")..int("buf_len"),
        msghdr.p("msgh")
    )

    opaque_p(
        "recvmsg_name",

        io_uring_recvmsg_out.p("o")
    )

    cmsghdr.p(
        "recvmsg_cmsg_firsthdr",

        io_uring_recvmsg_out.p("o"),
        msghdr.p("msgh")
    )

    cmsghdr.p(
        "recvmsg_cmsg_nexthdr",

        io_uring_recvmsg_out.p("o"),
        msghdr.p("msgh"),
        cmsghdr.p("cmsg")
    )

    opaque_p(
        "recvmsg_payload",

        io_uring_recvmsg_out.p("o"),
        msghdr.p("msgh")
    )

    unsigned_int(
        "recvmsg_payload_length",

        io_uring_recvmsg_out.p("o"),
        int("buf_len"),
        msghdr.p("msgh")
    )

    void(
        "prep_openat2",

        io_uring_sqe.p("sqe"),
        int("dfd"),
        charUTF8.const.p("path"),
        open_how.const.p("how")
    )

    void(
        "prep_openat2_direct",

        io_uring_sqe.p("sqe"),
        int("dfd"),
        charUTF8.const.p("path"),
        open_how.const.p("how"),
        unsigned("file_index")
    )

    void(
        "prep_epoll_ctl",

        io_uring_sqe.p("sqe"),
        int("epfd"),
        int("fd"),
        int("op"),
        epoll_event.const.p("ev")
    )

    void(
        "prep_provide_buffers",

        io_uring_sqe.p("sqe"),
        void.p("addr"),
        AutoSize("addr")..int("len"),
        int("nr"),
        int("bgid"),
        int("bid")
    )

    void(
        "prep_remove_buffers",

        io_uring_sqe.p("sqe"),
        int("nr"),
        int("bgid")
    )

    void(
        "prep_shutdown",

        io_uring_sqe.p("sqe"),
        int("fd"),
        int("how") // TODO:
    )

    void(
        "prep_unlinkat",

        io_uring_sqe.p("sqe"),
        int("dfd"),
        charUTF8.const.p("path"),
        int("flags") // TODO:
    )

    void(
        "prep_unlink",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("path"),
        int("flags")
    )

    void(
        "prep_renameat",

        io_uring_sqe.p("sqe"),
        int("olddfd"),
        charUTF8.const.p("oldpath"),
        int("newdfd"),
        charUTF8.const.p("newpath"),
        unsigned_int("flags") // TODO:
    )

    void(
        "prep_rename",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath")
    )

    void(
        "prep_sync_file_range",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned("len"),
        __u64("offset"),
        int("flags") // TODO:
    )

    void(
        "prep_mkdirat",

        io_uring_sqe.p("sqe"),
        int("dfd"),
        charUTF8.const.p("path"),
        int("mode") // TODO:
    )

    void(
        "prep_mkdir",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("path"),
        int("mode") // TODO:
    )

    void(
        "prep_symlinkat",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("target"),
        int("newdirfd"),
        charUTF8.const.p("linkpath")
    )

    void(
        "prep_symlink",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("target"),
        charUTF8.const.p("linkpath")
    )

    void(
        "prep_linkat",

        io_uring_sqe.p("sqe"),
        int("olddfd"),
        charUTF8.const.p("oldpath"),
        int("newdfd"),
        charUTF8.const.p("newpath"),
        int("flags") // TODO:
    )

    void(
        "prep_link",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("oldpath"),
        charUTF8.const.p("newpath"),
        int("flags") // TODO:
    )

    void(
        "prep_msg_ring_cqe_flags",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned_int("len"),
        __u64("data"),
        unsigned_int("flags"),
        unsigned_int("cqe_flags")
    )

    void(
        "prep_msg_ring",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned_int("len"),
        __u64("data"),
        unsigned_int("flags") // TODO:
    )

    void(
        "prep_msg_ring_fd",

        io_uring_sqe.p("sqe"),
        int("fd"),
        int("source_fd"),
        int("target_fd"),
        __u64("data"),
        unsigned_int("flags")
    )

    void(
        "prep_msg_ring_fd_alloc",

        io_uring_sqe.p("sqe"),
        int("fd"),
        int("source_fd"),
        __u64("data"),
        unsigned_int("flags")
    )

    void(
        "prep_getxattr",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("name"),
        char.p("value"),
        charUTF8.const.p("path"),
        AutoSize("value")..unsigned_int("len")
    )

    void(
        "prep_setxattr",

        io_uring_sqe.p("sqe"),
        charUTF8.const.p("name"),
        char.const.p("value"),
        charUTF8.const.p("path"),
        int("flags"),
        AutoSize("value")..unsigned_int("len")
    )

    void(
        "prep_fgetxattr",

        io_uring_sqe.p("sqe"),
        int("fd"),
        charUTF8.const.p("name"),
        char.p("value"),
        AutoSize("value")..unsigned_int("len")
    )

    void(
        "prep_fsetxattr",

        io_uring_sqe.p("sqe"),
        int("fd"),
        charUTF8.const.p("name"),
        char.const.p("value"),
        int("flags"),
        AutoSize("value")..unsigned_int("len")
    )

    void(
        "prep_socket",

        io_uring_sqe.p("sqe"),
        int("domain"),
        int("type"),
        int("protocol"),
        unsigned_int("flags") // TODO:
    )

    void(
        "prep_socket_direct",

        io_uring_sqe.p("sqe"),
        int("domain"),
        int("type"),
        int("protocol"),
        unsigned("file_index"),
        unsigned_int("flags") // TODO:
    )

    void(
        "prep_socket_direct_alloc",

        io_uring_sqe.p("sqe"),
        int("domain"),
        int("type"),
        int("protocol"),
        unsigned_int("flags") // TODO:
    )

    void(
        "prep_uring_cmd",

        io_uring_sqe.p("sqe"),
        int("cmd_op"),
        int("fd")
    )

    void(
        "prep_uring_cmd128",

        io_uring_sqe.p("sqe"),
        int("cmd_op"),
        int("fd")
    )

    void(
        "prep_cmd_sock",

        io_uring_sqe.p("sqe"),
        int("cmd_op"),
        int("fd"),
        int("level"),
        int("optname"),
        void.p("optval"),
        AutoSize("optval")..int("optlen")
    )

    void(
        "prep_cmd_getsockname",

        io_uring_sqe.p("sqe"),
        int("fd"),
        sockaddr.p("sockaddr"),
        Check(1)..socklen_t.p("sockaddr_len"),
        int("peer")
    )

    void(
        "prep_waitid",

        io_uring_sqe.p("sqe"),
        idtype_t("idtype"), // TODO:
        id_t("id"), // TODO:
        "siginfo_t".opaque.p("infop"), // TODO:
        int("options"),
        unsigned_int("flags")
    )

    void(
        "prep_futex_wake",

        io_uring_sqe.p("sqe"),
        Check(1)..uint32_t.const.p("futex"),
        uint64_t("val"),
        uint64_t("mask"),
        uint32_t("futex_flags"),
        unsigned_int("flags")
    )

    void(
        "prep_futex_wait",

        io_uring_sqe.p("sqe"),
        Check(1)..uint32_t.const.p("futex"),
        uint64_t("val"),
        uint64_t("mask"),
        uint32_t("futex_flags"),
        unsigned_int("flags")
    )

    void(
        "prep_futex_waitv",

        io_uring_sqe.p("sqe"),
        "struct futex_waitv".handle.const.p("futex"),
        AutoSize("futex")..unsigned_int("nr_futex"),
        unsigned_int("flags")
    )

    void(
        "prep_fixed_fd_install",

        io_uring_sqe.p("sqe"),
        int("fd"),
        unsigned_int("flags")
    )

    void(
        "prep_ftruncate",

        io_uring_sqe.p("sqe"),
        int("fd"),
        loff_t("len")
    )

    void(
        "prep_cmd_discard",

        io_uring_sqe.p("sqe"),
        int("fd"),
        uint64_t("offset"),
        uint64_t("nbytes")
    )

    void(
        "prep_pipe",

        io_uring_sqe.p("sqe"),
        Check(2)..int.p("fds"),
        int("pipe_flags")
    )

    void(
        "prep_pipe_direct",

        io_uring_sqe.p("sqe"),
        Check(2)..int.p("fds"),
        int("pipe_flags"),
        unsigned_int("file_index")
    )

    unsigned(
        "load_sq_head",

        io_uring.const.p("ring")
    )

    unsigned_int(
        "sq_ready",

        io_uring.const.p("ring")
    )

    unsigned_int(
        "sq_space_left",

        io_uring.const.p("ring")
    )

    unsigned(
        "sqe_shift_from_flags",

        unsigned("flags")
    )

    unsigned(
        "sqe_shift",

        io_uring.const.p("ring")
    )

    int(
        "sqring_wait",

        io_uring.p("ring")
    )

    unsigned_int(
        "cq_ready",

        io_uring.const.p("ring")
    )

    bool(
        "cq_has_overflow",

        io_uring.const.p("ring")
    )

    bool(
        "cq_eventfd_enabled",

        io_uring.const.p("ring")
    )

    int(
        "cq_eventfd_toggle",

        io_uring.p("ring"),
        bool("enabled")
    )

    int(
        "wait_cqe_nr",

        io_uring.p("ring"),
        io_uring_cqe.p.p("cqe_ptr"),
        AutoSize("cqe_ptr")..unsigned_int("wait_nr")
    )

    int(
        "peek_cqe",

        io_uring.p("ring"),
        Check(1)..io_uring_cqe.p.p("cqe_ptr")
    )

    int(
        "wait_cqe",

        io_uring.p("ring"),
        Check(1)..io_uring_cqe.p.p("cqe_ptr")
    )

    customMethod("""
    /** Return the appropriate mask for a buffer ring of size {@code ring_entries} */
    public static int io_uring_buf_ring_mask(@NativeType("__u32") int ring_entries) {
        return ring_entries - 1;
    }

    public static void io_uring_buf_ring_init(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br) {
        br.tail((short)0);
    }

    public static void io_uring_buf_ring_add(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br, @NativeType("void *") ByteBuffer addr, @NativeType("unsigned short") short bid, int mask, int buf_offset) {
        IOURingBuf buf = br.bufs((br.tail() + buf_offset) & mask);

        buf.addr(memAddress(addr));
        buf.len(addr.remaining());
        buf.bid(bid);
    }""")

    void(
        "buf_ring_advance",

        io_uring_buf_ring.p("br"),
        int("count")
    )

    void(
        "buf_ring_cq_advance",

        io_uring.p("ring"),
        io_uring_buf_ring.p("br"),
        int("count")
    )

    int(
        "buf_ring_available",

        io_uring.p("ring"),
        io_uring_buf_ring.p("br"),
        unsigned_short("bgid")
    )

    io_uring_sqe.p(
        "get_sqe",

        io_uring.p("ring")
    )

    io_uring_sqe.p(
        "get_sqe128",

        io_uring.p("ring")
    )

    int(
        "mlock_size",

        unsigned("entries"),
        unsigned("flags")
    )

    int(
        "mlock_size_params",

        unsigned("entries"),
        io_uring_params.p("p")
    )

    ssize_t(
        "memory_size",

        unsigned("entries"),
        unsigned("flags")
    )

    ssize_t(
        "memory_size_params",

        unsigned("entries"),
        io_uring_params.p("p")
    )

    int(
        "major_version",

        void()
    )

    int(
        "minor_version",

        void()
    )

    bool(
        "check_version",

        int("major"),
        int("minor")
    )
}