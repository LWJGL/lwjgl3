/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.liburing.templates

import org.lwjgl.generator.*
import core.linux.*
import core.linux.liburing.*

val LibIOURing = "LibIOURing".nativeClass(Module.CORE_LINUX_LIBURING, nativeSubPath = "linux", prefixConstant = "IORING_", prefixMethod = "io_uring_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#ifdef LWJGL_LINUX
    _Pragma("GCC diagnostic ignored \"-Wsign-compare\"")
#endif
#include "liburing/compat.h"
#include "liburing/io_uring.h"
#include "syscall.h"
ENABLE_WARNINGS()""")

    IntConstant(
        "RW_ATTR_FLAG_PI".."1 << 0"
    )

    IntConstant(
        "FILE_INDEX_ALLOC".."~0"
    )

    IntConstant("MAX_ENTRIES".."4096")

    EnumConstant(
        "IOSQE_FIXED_FILE_BIT".enum("0"),
        "IOSQE_IO_DRAIN_BIT".enum,
        "IOSQE_IO_LINK_BIT".enum,
        "IOSQE_IO_HARDLINK_BIT".enum,
        "IOSQE_ASYNC_BIT".enum,
        "IOSQE_BUFFER_SELECT_BIT".enum,
        "IOSQE_CQE_SKIP_SUCCESS_BIT".enum
    ).noPrefix()

    EnumConstant(
        "IOSQE_FIXED_FILE".enum("1 << IOSQE_FIXED_FILE_BIT"),
        "IOSQE_IO_DRAIN".enum("1 << IOSQE_IO_DRAIN_BIT"),
        "IOSQE_IO_LINK".enum("1 << IOSQE_IO_LINK_BIT"),
        "IOSQE_IO_HARDLINK".enum("1 << IOSQE_IO_HARDLINK_BIT"),
        "IOSQE_ASYNC".enum("1 << IOSQE_ASYNC_BIT"),
        "IOSQE_BUFFER_SELECT".enum("1 << IOSQE_BUFFER_SELECT_BIT"),
        "IOSQE_CQE_SKIP_SUCCESS".enum("1 << IOSQE_CQE_SKIP_SUCCESS_BIT")
    ).noPrefix()

    EnumConstant(
        "SETUP_IOPOLL".enum("1 << 0"),
        "SETUP_SQPOLL".enum("1 << 1"),
        "SETUP_SQ_AFF".enum("1 << 2"),
        "SETUP_CQSIZE".enum("1 << 3"),
        "SETUP_CLAMP".enum("1 << 4"),
        "SETUP_ATTACH_WQ".enum("1 << 5"),
        "SETUP_R_DISABLED".enum("1 << 6"),
        "SETUP_SUBMIT_ALL".enum("1 << 7"),
        "SETUP_COOP_TASKRUN".enum("1 << 8"),
        "SETUP_TASKRUN_FLAG".enum("1 << 9"),
        "SETUP_SQE128".enum("1 << 10"),
        "SETUP_CQE32".enum("1 << 11"),
        "SETUP_SINGLE_ISSUER".enum("1 << 12"),
        "SETUP_DEFER_TASKRUN".enum("1 << 13"),
        "SETUP_NO_MMAP".enum("1 << 14"),
        "SETUP_REGISTERED_FD_ONLY".enum("1 << 15"),
        "SETUP_NO_SQARRAY".enum("1 << 16"),
        "SETUP_HYBRID_IOPOLL".enum("1 << 17"),
        "SETUP_CQE_MIXED".enum("1 << 18"),
        "SETUP_SQE_MIXED".enum("1 << 19"),
        "SETUP_SQ_REWIND".enum("1 << 20")
    )

    EnumConstantByte(
        "OP_NOP".enumByte("0"),
        "OP_READV".enumByte,
        "OP_WRITEV".enumByte,
        "OP_FSYNC".enumByte,
        "OP_READ_FIXED".enumByte,
        "OP_WRITE_FIXED".enumByte,
        "OP_POLL_ADD".enumByte,
        "OP_POLL_REMOVE".enumByte,
        "OP_SYNC_FILE_RANGE".enumByte,
        "OP_SENDMSG".enumByte,
        "OP_RECVMSG".enumByte,
        "OP_TIMEOUT".enumByte,
        "OP_TIMEOUT_REMOVE".enumByte,
        "OP_ACCEPT".enumByte,
        "OP_ASYNC_CANCEL".enumByte,
        "OP_LINK_TIMEOUT".enumByte,
        "OP_CONNECT".enumByte,
        "OP_FALLOCATE".enumByte,
        "OP_OPENAT".enumByte,
        "OP_CLOSE".enumByte,
        "OP_FILES_UPDATE".enumByte,
        "OP_STATX".enumByte,
        "OP_READ".enumByte,
        "OP_WRITE".enumByte,
        "OP_FADVISE".enumByte,
        "OP_MADVISE".enumByte,
        "OP_SEND".enumByte,
        "OP_RECV".enumByte,
        "OP_OPENAT2".enumByte,
        "OP_EPOLL_CTL".enumByte,
        "OP_SPLICE".enumByte,
        "OP_PROVIDE_BUFFERS".enumByte,
        "OP_REMOVE_BUFFERS".enumByte,
        "OP_TEE".enumByte,
        "OP_SHUTDOWN".enumByte,
        "OP_RENAMEAT".enumByte,
        "OP_UNLINKAT".enumByte,
        "OP_MKDIRAT".enumByte,
        "OP_SYMLINKAT".enumByte,
        "OP_LINKAT".enumByte,
        "OP_MSG_RING".enumByte,
	    "OP_FSETXATTR".enumByte,
	    "OP_SETXATTR".enumByte,
	    "OP_FGETXATTR".enumByte,
	    "OP_GETXATTR".enumByte,
	    "OP_SOCKET".enumByte,
	    "OP_URING_CMD".enumByte,
        "OP_SEND_ZC".enumByte,
        "OP_SENDMSG_ZC".enumByte,
        "OP_READ_MULTISHOT".enumByte,
        "OP_WAITID".enumByte,
        "OP_FUTEX_WAIT".enumByte,
        "OP_FUTEX_WAKE".enumByte,
        "OP_FUTEX_WAITV".enumByte,
        "OP_FIXED_FD_INSTALL".enumByte,
        "OP_FTRUNCATE".enumByte,
        "OP_BIND".enumByte,
        "OP_LISTEN".enumByte,
        "OP_RECV_ZC".enumByte,
        "OP_EPOLL_WAIT".enumByte,
        "OP_READV_FIXED".enumByte,
        "OP_WRITEV_FIXED".enumByte,
        "OP_PIPE".enumByte,
        "OP_NOP128".enumByte,
        "OP_URING_CMD128".enumByte,
        "OP_LAST".enumByte
    )

    IntConstant(
        "URING_CMD_FIXED".."1 << 0",
        "URING_CMD_MASK".."IORING_URING_CMD_FIXED"
    )

    EnumConstant(
        "FSYNC_DATASYNC".enum("1 << 0")
    )

    EnumConstant(
        "TIMEOUT_ABS".enum("1 << 0"),
        "TIMEOUT_UPDATE".enum("1 << 1"),
        "TIMEOUT_BOOTTIME".enum("1 << 2"),
        "TIMEOUT_REALTIME".enum("1 << 3"),
        "LINK_TIMEOUT_UPDATE".enum("1 << 4"),
        "TIMEOUT_ETIME_SUCCESS".enum("1 << 5"),
        "TIMEOUT_MULTISHOT".enum("1 << 6"),
        "TIMEOUT_CLOCK_MASK".enum("IORING_TIMEOUT_BOOTTIME | IORING_TIMEOUT_REALTIME"),
        "TIMEOUT_UPDATE_MASK".enum("IORING_TIMEOUT_UPDATE | IORING_LINK_TIMEOUT_UPDATE")
    )

    EnumConstant(
        "SPLICE_F_FD_IN_FIXED".enum("1 << 31")
    )

    EnumConstant(
        "POLL_ADD_MULTI".enum("1 << 0"),
        "POLL_UPDATE_EVENTS".enum("1 << 1"),
        "POLL_UPDATE_USER_DATA".enum("1 << 2"),
        "POLL_ADD_LEVEL".enum("1 << 3")
    )

    EnumConstant(
        "ASYNC_CANCEL_ALL".enum("1 << 0"),
        "ASYNC_CANCEL_FD".enum("1 << 1"),
        "ASYNC_CANCEL_ANY".enum("1 << 2"),
        "ASYNC_CANCEL_FD_FIXED".enum("1 << 3"),
        "ASYNC_CANCEL_USERDATA".enum("1 << 4"),
        "ASYNC_CANCEL_OP".enum("1 << 5")
    )

    EnumConstant(
        "RECVSEND_POLL_FIRST".enum("1 << 0"),
        "RECV_MULTISHOT".enum("1 << 1"),
        "RECVSEND_FIXED_BUF".enum("1 << 2"),
        "SEND_ZC_REPORT_USAGE".enum("1 << 3"),
        "RECVSEND_BUNDLE".enum("1 << 4"),
        "SEND_VECTORIZED".enum("1 << 5")
    )

    IntConstant("NOTIF_USAGE_ZC_COPIED".."1 << 31")

    EnumConstant(
        "ACCEPT_MULTISHOT".enum("1 << 0"),
        "ACCEPT_DONTWAIT".enum("1 << 1"),
        "ACCEPT_POLL_FIRST".enum("1 << 2")
    )

    EnumConstant(
        "MSG_DATA".enum("0"),
        "MSG_SEND_FD".enum
    )

    EnumConstant(
        "MSG_RING_CQE_SKIP".enum("1 << 0"),
        "MSG_RING_FLAGS_PASS".enum("1 << 1")
    )

    EnumConstant(
        "FIXED_FD_NO_CLOEXEC".enum("1 << 0")
    )

    EnumConstant(
        "NOP_INJECT_RESULT".enum("1 << 0"),
        "NOP_CQE32".enum("1 << 5")
    )

    EnumConstant(
        "CQE_F_BUFFER".enum("1 << 0"),
        "CQE_F_MORE".enum("1 << 1"),
        "CQE_F_SOCK_NONEMPTY".enum("1 << 2"),
        "CQE_F_NOTIF".enum("1 << 3"),
        "CQE_F_BUF_MORE".enum("1 << 4"),
        "CQE_F_SKIP".enum("1 << 5"),
        "CQE_F_32".enum("1 << 15")
    )

    IntConstant(
        "CQE_BUFFER_SHIFT".."16"
    )

    LongConstant(
        "OFF_SQ_RING".."0L",
        "OFF_CQ_RING".."0x8000000L",
        "OFF_SQES".."0x10000000L",
        "OFF_PBUF_RING".."0x80000000L",
        "OFF_PBUF_SHIFT".."16",
        "OFF_MMAP_MASK".."0xf8000000L",
    )

    EnumConstant(
        "SQ_NEED_WAKEUP".enum("1 << 0"),
        "SQ_CQ_OVERFLOW".enum("1 << 1"),
        "SQ_TASKRUN".enum("1 << 2")
    )

    EnumConstant(
        "CQ_EVENTFD_DISABLED".enum("1 << 0")
    )

    EnumConstant(
        "ENTER_GETEVENTS".enum("1 << 0"),
        "ENTER_SQ_WAKEUP".enum("1 << 1"),
        "ENTER_SQ_WAIT".enum("1 << 2"),
        "ENTER_EXT_ARG".enum("1 << 3"),
        "ENTER_REGISTERED_RING".enum("1 << 4"),
        "ENTER_ABS_TIMER".enum("1 << 5"),
        "ENTER_EXT_ARG_REG".enum("1 << 6"),
        "ENTER_NO_IOWAIT".enum("1 << 7")
    )

    EnumConstant(
        "FEAT_SINGLE_MMAP".enum("1 << 0"),
        "FEAT_NODROP".enum("1 << 1"),
        "FEAT_SUBMIT_STABLE".enum("1 << 2"),
        "FEAT_RW_CUR_POS".enum("1 << 3"),
        "FEAT_CUR_PERSONALITY".enum("1 << 4"),
        "FEAT_FAST_POLL".enum("1 << 5"),
        "FEAT_POLL_32BITS".enum("1 << 6"),
        "FEAT_SQPOLL_NONFIXED".enum("1 << 7"),
        "FEAT_EXT_ARG".enum("1 << 8"),
        "FEAT_NATIVE_WORKERS".enum("1 << 9"),
        "FEAT_RSRC_TAGS".enum("1 << 10"),
        "FEAT_CQE_SKIP".enum("1 << 11"),
        "FEAT_LINKED_FILE".enum("1 << 12"),
        "FEAT_REG_REG_RING".enum("1 << 13"),
        "FEAT_RECVSEND_BUNDLE".enum("1 << 14"),
        "FEAT_MIN_TIMEOUT".enum("1 << 15"),
        "FEAT_RW_ATTR".enum("1 << 16"),
        "FEAT_NO_IOWAIT".enum("1 << 17")
    )

    EnumConstant(
        "REGISTER_BUFFERS".enum("0"),
        "UNREGISTER_BUFFERS".enum,
        "REGISTER_FILES".enum,
        "UNREGISTER_FILES".enum,
        "REGISTER_EVENTFD".enum,
        "UNREGISTER_EVENTFD".enum,
        "REGISTER_FILES_UPDATE".enum,
        "REGISTER_EVENTFD_ASYNC".enum,
        "REGISTER_PROBE".enum,
        "REGISTER_PERSONALITY".enum,
        "UNREGISTER_PERSONALITY".enum,
        "REGISTER_RESTRICTIONS".enum,
        "REGISTER_ENABLE_RINGS".enum,
        "REGISTER_FILES2".enum,
        "REGISTER_FILES_UPDATE2".enum,
        "REGISTER_BUFFERS2".enum,
        "REGISTER_BUFFERS_UPDATE".enum,
        "REGISTER_IOWQ_AFF".enum,
        "UNREGISTER_IOWQ_AFF".enum,
        "REGISTER_IOWQ_MAX_WORKERS".enum,
        "REGISTER_RING_FDS".enum,
        "UNREGISTER_RING_FDS".enum,
        "REGISTER_PBUF_RING".enum,
        "UNREGISTER_PBUF_RING".enum,
        "REGISTER_SYNC_CANCEL".enum,
        "REGISTER_FILE_ALLOC_RANGE".enum,
        "REGISTER_PBUF_STATUS".enum,
        "REGISTER_NAPI".enum,
        "UNREGISTER_NAPI".enum,
        "REGISTER_CLOCK".enum,
        "REGISTER_CLONE_BUFFERS".enum,
        "REGISTER_SEND_MSG_RING".enum,
        "REGISTER_ZCRX_IFQ".enum,
        "REGISTER_RESIZE_RINGS".enum,
        "REGISTER_MEM_REGION".enum,
        "REGISTER_QUERY".enum,

        "REGISTER_LAST".enum,

        "REGISTER_USE_REGISTERED_RING".enum("1 << 31")
    )

    EnumConstant(
        "IO_WQ_BOUND".enum("0"),
        "IO_WQ_UNBOUND".enum
    ).noPrefix()

    EnumConstant(
        "MEM_REGION_TYPE_USER".enum("1")
    )

    EnumConstant(
        "MEM_REGION_REG_WAIT_ARG".enum("1")
    )

    EnumConstant(
        "RSRC_REGISTER_SPARSE".enum("1 << 0")
    )

    IntConstant(
        "REGISTER_FILES_SKIP".."-2"
    )

    IntConstant(
        "IO_URING_OP_SUPPORTED".."1 << 0"
    ).noPrefix()

    EnumConstant(
        "REGISTER_SRC_REGISTERED".enum("1 << 0"),
        "REGISTER_DST_REPLACE".enum("1 << 1")
    )

    EnumConstant(
        "IOU_PBUF_RING_MMAP".enum("1"),
        "IOU_PBUF_RING_INC".enum("2")
    ).noPrefix()

    EnumConstant(
        "RESTRICTION_REGISTER_OP".enum("0"),
        "RESTRICTION_SQE_OP".enum,
        "RESTRICTION_SQE_FLAGS_ALLOWED".enum,
        "RESTRICTION_SQE_FLAGS_REQUIRED".enum,
        "RESTRICTION_LAST".enum
    )

    EnumConstant(
        "REG_WAIT_TS".enum("1 << 0")
    )

    EnumConstant(
        "SOCKET_URING_OP_SIOCINQ".enum("0"),
        "SOCKET_URING_OP_SIOCOUTQ".enum,
        "SOCKET_URING_OP_GETSOCKOPT".enum,
        "SOCKET_URING_OP_SETSOCKOPT".enum,
        "SOCKET_URING_OP_TX_TIMESTAMP".enum,
        "SOCKET_URING_OP_GETSOCKNAME".enum
    ).noPrefix()

    IntConstant(
        "TIMESTAMP_HW_SHIFT".."16",
        "TIMESTAMP_TYPE_SHIFT".."IORING_TIMESTAMP_HW_SHIFT + 1",
        "CQE_F_TSTAMP_HW".."1 << IORING_TIMESTAMP_HW_SHIFT"
    )

    IntConstant("ZCRX_AREA_SHIFT".."48")
    LongConstant("ZCRX_AREA_MASK".."~((1L << IORING_ZCRX_AREA_SHIFT) - 1)")

    EnumConstant(
        "ZCRX_AREA_DMABUF".enum("1")
    )

    // query.h

    EnumConstant(
        "QUERY_OPCODES".enum("0")
    )

    NativeName("__sys_io_uring_setup")..int(
        "setup",

        CaptureCallState.errno.param,
        unsigned("entries"),
        io_uring_params.p("p")
    )

    NativeName("__sys_io_uring_register")..int(
        "register",

        CaptureCallState.errno.param,
        int("fd"),
        unsigned("opcode"),
        nullable..opaque_p("arg"),
        unsigned("nr_args")
    )

    NativeName("__sys_io_uring_enter2")..int(
        "enter2",

        CaptureCallState.errno.param,
        int("fd"),
        unsigned("to_submit"),
        unsigned("min_complete"),
        unsigned("flags"),
        nullable..sigset_t.p("sig"),
        int("sz")
    )

    NativeName("__sys_io_uring_enter")..int(
        "enter",

        CaptureCallState.errno.param,
        int("fd"),
        unsigned("to_submit"),
        unsigned("min_complete"),
        unsigned("flags"),
        nullable..sigset_t.p("sig")
    )
}