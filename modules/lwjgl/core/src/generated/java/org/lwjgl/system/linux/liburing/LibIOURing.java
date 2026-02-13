/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LibIOURing {

    static { Library.initialize(); }

    public static final int IORING_RW_ATTR_FLAG_PI = 1 << 0;

    public static final int IORING_FILE_INDEX_ALLOC = ~0;

    public static final int IORING_MAX_ENTRIES = 4096;

    public static final int
        IOSQE_FIXED_FILE_BIT       = 0,
        IOSQE_IO_DRAIN_BIT         = 1,
        IOSQE_IO_LINK_BIT          = 2,
        IOSQE_IO_HARDLINK_BIT      = 3,
        IOSQE_ASYNC_BIT            = 4,
        IOSQE_BUFFER_SELECT_BIT    = 5,
        IOSQE_CQE_SKIP_SUCCESS_BIT = 6;

    public static final int
        IOSQE_FIXED_FILE       = 1 << IOSQE_FIXED_FILE_BIT,
        IOSQE_IO_DRAIN         = 1 << IOSQE_IO_DRAIN_BIT,
        IOSQE_IO_LINK          = 1 << IOSQE_IO_LINK_BIT,
        IOSQE_IO_HARDLINK      = 1 << IOSQE_IO_HARDLINK_BIT,
        IOSQE_ASYNC            = 1 << IOSQE_ASYNC_BIT,
        IOSQE_BUFFER_SELECT    = 1 << IOSQE_BUFFER_SELECT_BIT,
        IOSQE_CQE_SKIP_SUCCESS = 1 << IOSQE_CQE_SKIP_SUCCESS_BIT;

    public static final int
        IORING_SETUP_IOPOLL             = 1 << 0,
        IORING_SETUP_SQPOLL             = 1 << 1,
        IORING_SETUP_SQ_AFF             = 1 << 2,
        IORING_SETUP_CQSIZE             = 1 << 3,
        IORING_SETUP_CLAMP              = 1 << 4,
        IORING_SETUP_ATTACH_WQ          = 1 << 5,
        IORING_SETUP_R_DISABLED         = 1 << 6,
        IORING_SETUP_SUBMIT_ALL         = 1 << 7,
        IORING_SETUP_COOP_TASKRUN       = 1 << 8,
        IORING_SETUP_TASKRUN_FLAG       = 1 << 9,
        IORING_SETUP_SQE128             = 1 << 10,
        IORING_SETUP_CQE32              = 1 << 11,
        IORING_SETUP_SINGLE_ISSUER      = 1 << 12,
        IORING_SETUP_DEFER_TASKRUN      = 1 << 13,
        IORING_SETUP_NO_MMAP            = 1 << 14,
        IORING_SETUP_REGISTERED_FD_ONLY = 1 << 15,
        IORING_SETUP_NO_SQARRAY         = 1 << 16,
        IORING_SETUP_HYBRID_IOPOLL      = 1 << 17,
        IORING_SETUP_CQE_MIXED          = 1 << 18,
        IORING_SETUP_SQE_MIXED          = 1 << 19,
        IORING_SETUP_SQ_REWIND          = 1 << 20;

    public static final byte
        IORING_OP_NOP              = 0,
        IORING_OP_READV            = 1,
        IORING_OP_WRITEV           = 2,
        IORING_OP_FSYNC            = 3,
        IORING_OP_READ_FIXED       = 4,
        IORING_OP_WRITE_FIXED      = 5,
        IORING_OP_POLL_ADD         = 6,
        IORING_OP_POLL_REMOVE      = 7,
        IORING_OP_SYNC_FILE_RANGE  = 8,
        IORING_OP_SENDMSG          = 9,
        IORING_OP_RECVMSG          = 10,
        IORING_OP_TIMEOUT          = 11,
        IORING_OP_TIMEOUT_REMOVE   = 12,
        IORING_OP_ACCEPT           = 13,
        IORING_OP_ASYNC_CANCEL     = 14,
        IORING_OP_LINK_TIMEOUT     = 15,
        IORING_OP_CONNECT          = 16,
        IORING_OP_FALLOCATE        = 17,
        IORING_OP_OPENAT           = 18,
        IORING_OP_CLOSE            = 19,
        IORING_OP_FILES_UPDATE     = 20,
        IORING_OP_STATX            = 21,
        IORING_OP_READ             = 22,
        IORING_OP_WRITE            = 23,
        IORING_OP_FADVISE          = 24,
        IORING_OP_MADVISE          = 25,
        IORING_OP_SEND             = 26,
        IORING_OP_RECV             = 27,
        IORING_OP_OPENAT2          = 28,
        IORING_OP_EPOLL_CTL        = 29,
        IORING_OP_SPLICE           = 30,
        IORING_OP_PROVIDE_BUFFERS  = 31,
        IORING_OP_REMOVE_BUFFERS   = 32,
        IORING_OP_TEE              = 33,
        IORING_OP_SHUTDOWN         = 34,
        IORING_OP_RENAMEAT         = 35,
        IORING_OP_UNLINKAT         = 36,
        IORING_OP_MKDIRAT          = 37,
        IORING_OP_SYMLINKAT        = 38,
        IORING_OP_LINKAT           = 39,
        IORING_OP_MSG_RING         = 40,
        IORING_OP_FSETXATTR        = 41,
        IORING_OP_SETXATTR         = 42,
        IORING_OP_FGETXATTR        = 43,
        IORING_OP_GETXATTR         = 44,
        IORING_OP_SOCKET           = 45,
        IORING_OP_URING_CMD        = 46,
        IORING_OP_SEND_ZC          = 47,
        IORING_OP_SENDMSG_ZC       = 48,
        IORING_OP_READ_MULTISHOT   = 49,
        IORING_OP_WAITID           = 50,
        IORING_OP_FUTEX_WAIT       = 51,
        IORING_OP_FUTEX_WAKE       = 52,
        IORING_OP_FUTEX_WAITV      = 53,
        IORING_OP_FIXED_FD_INSTALL = 54,
        IORING_OP_FTRUNCATE        = 55,
        IORING_OP_BIND             = 56,
        IORING_OP_LISTEN           = 57,
        IORING_OP_RECV_ZC          = 58,
        IORING_OP_EPOLL_WAIT       = 59,
        IORING_OP_READV_FIXED      = 60,
        IORING_OP_WRITEV_FIXED     = 61,
        IORING_OP_PIPE             = 62,
        IORING_OP_NOP128           = 63,
        IORING_OP_URING_CMD128     = 64,
        IORING_OP_LAST             = 65;

    public static final int
        IORING_URING_CMD_FIXED = 1 << 0,
        IORING_URING_CMD_MASK  = IORING_URING_CMD_FIXED;

    public static final int IORING_FSYNC_DATASYNC = 1 << 0;

    public static final int
        IORING_TIMEOUT_ABS           = 1 << 0,
        IORING_TIMEOUT_UPDATE        = 1 << 1,
        IORING_TIMEOUT_BOOTTIME      = 1 << 2,
        IORING_TIMEOUT_REALTIME      = 1 << 3,
        IORING_LINK_TIMEOUT_UPDATE   = 1 << 4,
        IORING_TIMEOUT_ETIME_SUCCESS = 1 << 5,
        IORING_TIMEOUT_MULTISHOT     = 1 << 6,
        IORING_TIMEOUT_CLOCK_MASK    = IORING_TIMEOUT_BOOTTIME | IORING_TIMEOUT_REALTIME,
        IORING_TIMEOUT_UPDATE_MASK   = IORING_TIMEOUT_UPDATE | IORING_LINK_TIMEOUT_UPDATE;

    public static final int IORING_SPLICE_F_FD_IN_FIXED = 1 << 31;

    public static final int
        IORING_POLL_ADD_MULTI        = 1 << 0,
        IORING_POLL_UPDATE_EVENTS    = 1 << 1,
        IORING_POLL_UPDATE_USER_DATA = 1 << 2,
        IORING_POLL_ADD_LEVEL        = 1 << 3;

    public static final int
        IORING_ASYNC_CANCEL_ALL      = 1 << 0,
        IORING_ASYNC_CANCEL_FD       = 1 << 1,
        IORING_ASYNC_CANCEL_ANY      = 1 << 2,
        IORING_ASYNC_CANCEL_FD_FIXED = 1 << 3,
        IORING_ASYNC_CANCEL_USERDATA = 1 << 4,
        IORING_ASYNC_CANCEL_OP       = 1 << 5;

    public static final int
        IORING_RECVSEND_POLL_FIRST  = 1 << 0,
        IORING_RECV_MULTISHOT       = 1 << 1,
        IORING_RECVSEND_FIXED_BUF   = 1 << 2,
        IORING_SEND_ZC_REPORT_USAGE = 1 << 3,
        IORING_RECVSEND_BUNDLE      = 1 << 4,
        IORING_SEND_VECTORIZED      = 1 << 5;

    public static final int IORING_NOTIF_USAGE_ZC_COPIED = 1 << 31;

    public static final int
        IORING_ACCEPT_MULTISHOT  = 1 << 0,
        IORING_ACCEPT_DONTWAIT   = 1 << 1,
        IORING_ACCEPT_POLL_FIRST = 1 << 2;

    public static final int
        IORING_MSG_DATA    = 0,
        IORING_MSG_SEND_FD = 1;

    public static final int
        IORING_MSG_RING_CQE_SKIP   = 1 << 0,
        IORING_MSG_RING_FLAGS_PASS = 1 << 1;

    public static final int IORING_FIXED_FD_NO_CLOEXEC = 1 << 0;

    public static final int
        IORING_NOP_INJECT_RESULT = 1 << 0,
        IORING_NOP_CQE32         = 1 << 5;

    public static final int
        IORING_CQE_F_BUFFER        = 1 << 0,
        IORING_CQE_F_MORE          = 1 << 1,
        IORING_CQE_F_SOCK_NONEMPTY = 1 << 2,
        IORING_CQE_F_NOTIF         = 1 << 3,
        IORING_CQE_F_BUF_MORE      = 1 << 4,
        IORING_CQE_F_SKIP          = 1 << 5,
        IORING_CQE_F_32            = 1 << 15;

    public static final int IORING_CQE_BUFFER_SHIFT = 16;

    public static final long
        IORING_OFF_SQ_RING    = 0L,
        IORING_OFF_CQ_RING    = 0x8000000L,
        IORING_OFF_SQES       = 0x10000000L,
        IORING_OFF_PBUF_RING  = 0x80000000L,
        IORING_OFF_PBUF_SHIFT = 16,
        IORING_OFF_MMAP_MASK  = 0xf8000000L;

    public static final int
        IORING_SQ_NEED_WAKEUP = 1 << 0,
        IORING_SQ_CQ_OVERFLOW = 1 << 1,
        IORING_SQ_TASKRUN     = 1 << 2;

    public static final int IORING_CQ_EVENTFD_DISABLED = 1 << 0;

    public static final int
        IORING_ENTER_GETEVENTS       = 1 << 0,
        IORING_ENTER_SQ_WAKEUP       = 1 << 1,
        IORING_ENTER_SQ_WAIT         = 1 << 2,
        IORING_ENTER_EXT_ARG         = 1 << 3,
        IORING_ENTER_REGISTERED_RING = 1 << 4,
        IORING_ENTER_ABS_TIMER       = 1 << 5,
        IORING_ENTER_EXT_ARG_REG     = 1 << 6,
        IORING_ENTER_NO_IOWAIT       = 1 << 7;

    public static final int
        IORING_FEAT_SINGLE_MMAP     = 1 << 0,
        IORING_FEAT_NODROP          = 1 << 1,
        IORING_FEAT_SUBMIT_STABLE   = 1 << 2,
        IORING_FEAT_RW_CUR_POS      = 1 << 3,
        IORING_FEAT_CUR_PERSONALITY = 1 << 4,
        IORING_FEAT_FAST_POLL       = 1 << 5,
        IORING_FEAT_POLL_32BITS     = 1 << 6,
        IORING_FEAT_SQPOLL_NONFIXED = 1 << 7,
        IORING_FEAT_EXT_ARG         = 1 << 8,
        IORING_FEAT_NATIVE_WORKERS  = 1 << 9,
        IORING_FEAT_RSRC_TAGS       = 1 << 10,
        IORING_FEAT_CQE_SKIP        = 1 << 11,
        IORING_FEAT_LINKED_FILE     = 1 << 12,
        IORING_FEAT_REG_REG_RING    = 1 << 13,
        IORING_FEAT_RECVSEND_BUNDLE = 1 << 14,
        IORING_FEAT_MIN_TIMEOUT     = 1 << 15,
        IORING_FEAT_RW_ATTR         = 1 << 16,
        IORING_FEAT_NO_IOWAIT       = 1 << 17;

    public static final int
        IORING_REGISTER_BUFFERS             = 0,
        IORING_UNREGISTER_BUFFERS           = 1,
        IORING_REGISTER_FILES               = 2,
        IORING_UNREGISTER_FILES             = 3,
        IORING_REGISTER_EVENTFD             = 4,
        IORING_UNREGISTER_EVENTFD           = 5,
        IORING_REGISTER_FILES_UPDATE        = 6,
        IORING_REGISTER_EVENTFD_ASYNC       = 7,
        IORING_REGISTER_PROBE               = 8,
        IORING_REGISTER_PERSONALITY         = 9,
        IORING_UNREGISTER_PERSONALITY       = 10,
        IORING_REGISTER_RESTRICTIONS        = 11,
        IORING_REGISTER_ENABLE_RINGS        = 12,
        IORING_REGISTER_FILES2              = 13,
        IORING_REGISTER_FILES_UPDATE2       = 14,
        IORING_REGISTER_BUFFERS2            = 15,
        IORING_REGISTER_BUFFERS_UPDATE      = 16,
        IORING_REGISTER_IOWQ_AFF            = 17,
        IORING_UNREGISTER_IOWQ_AFF          = 18,
        IORING_REGISTER_IOWQ_MAX_WORKERS    = 19,
        IORING_REGISTER_RING_FDS            = 20,
        IORING_UNREGISTER_RING_FDS          = 21,
        IORING_REGISTER_PBUF_RING           = 22,
        IORING_UNREGISTER_PBUF_RING         = 23,
        IORING_REGISTER_SYNC_CANCEL         = 24,
        IORING_REGISTER_FILE_ALLOC_RANGE    = 25,
        IORING_REGISTER_PBUF_STATUS         = 26,
        IORING_REGISTER_NAPI                = 27,
        IORING_UNREGISTER_NAPI              = 28,
        IORING_REGISTER_CLOCK               = 29,
        IORING_REGISTER_CLONE_BUFFERS       = 30,
        IORING_REGISTER_SEND_MSG_RING       = 31,
        IORING_REGISTER_ZCRX_IFQ            = 32,
        IORING_REGISTER_RESIZE_RINGS        = 33,
        IORING_REGISTER_MEM_REGION          = 34,
        IORING_REGISTER_QUERY               = 35,
        IORING_REGISTER_LAST                = 36,
        IORING_REGISTER_USE_REGISTERED_RING = 1 << 31;

    public static final int
        IO_WQ_BOUND   = 0,
        IO_WQ_UNBOUND = 1;

    public static final int IORING_MEM_REGION_TYPE_USER = 1;

    public static final int IORING_MEM_REGION_REG_WAIT_ARG = 1;

    public static final int IORING_RSRC_REGISTER_SPARSE = 1 << 0;

    public static final int IORING_REGISTER_FILES_SKIP = -2;

    public static final int IO_URING_OP_SUPPORTED = 1 << 0;

    public static final int
        IORING_REGISTER_SRC_REGISTERED = 1 << 0,
        IORING_REGISTER_DST_REPLACE    = 1 << 1;

    public static final int
        IOU_PBUF_RING_MMAP = 1,
        IOU_PBUF_RING_INC  = 2;

    public static final int
        IORING_RESTRICTION_REGISTER_OP        = 0,
        IORING_RESTRICTION_SQE_OP             = 1,
        IORING_RESTRICTION_SQE_FLAGS_ALLOWED  = 2,
        IORING_RESTRICTION_SQE_FLAGS_REQUIRED = 3,
        IORING_RESTRICTION_LAST               = 4;

    public static final int IORING_REG_WAIT_TS = 1 << 0;

    public static final int
        SOCKET_URING_OP_SIOCINQ      = 0,
        SOCKET_URING_OP_SIOCOUTQ     = 1,
        SOCKET_URING_OP_GETSOCKOPT   = 2,
        SOCKET_URING_OP_SETSOCKOPT   = 3,
        SOCKET_URING_OP_TX_TIMESTAMP = 4,
        SOCKET_URING_OP_GETSOCKNAME  = 5;

    public static final int
        IORING_TIMESTAMP_HW_SHIFT   = 16,
        IORING_TIMESTAMP_TYPE_SHIFT = IORING_TIMESTAMP_HW_SHIFT + 1,
        IORING_CQE_F_TSTAMP_HW      = 1 << IORING_TIMESTAMP_HW_SHIFT;

    public static final int IORING_ZCRX_AREA_SHIFT = 48;

    public static final long IORING_ZCRX_AREA_MASK = ~((1L << IORING_ZCRX_AREA_SHIFT) - 1);

    public static final int IORING_ZCRX_AREA_DMABUF = 1;

    public static final int IORING_QUERY_OPCODES = 0;

    protected LibIOURing() {
        throw new UnsupportedOperationException();
    }

    // --- [ io_uring_setup ] ---

    /** {@code int io_uring_setup(unsigned entries, struct io_uring_params * p)} */
    public static native int nio_uring_setup(long _errno, int entries, long p);

    /** {@code int io_uring_setup(unsigned entries, struct io_uring_params * p)} */
    public static int io_uring_setup(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("unsigned") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nio_uring_setup(memAddressSafe(_errno), entries, p.address());
    }

    // --- [ io_uring_register ] ---

    /** {@code int io_uring_register(int fd, unsigned opcode, void * arg, unsigned nr_args)} */
    public static native int nio_uring_register(long _errno, int fd, int opcode, long arg, int nr_args);

    /** {@code int io_uring_register(int fd, unsigned opcode, void * arg, unsigned nr_args)} */
    public static int io_uring_register(@NativeType("int *") @Nullable IntBuffer _errno, int fd, @NativeType("unsigned") int opcode, @NativeType("void *") long arg, @NativeType("unsigned") int nr_args) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nio_uring_register(memAddressSafe(_errno), fd, opcode, arg, nr_args);
    }

    // --- [ io_uring_enter2 ] ---

    /** {@code int io_uring_enter2(int fd, unsigned to_submit, unsigned min_complete, unsigned flags, sigset_t * sig, int sz)} */
    public static native int nio_uring_enter2(long _errno, int fd, int to_submit, int min_complete, int flags, long sig, int sz);

    /** {@code int io_uring_enter2(int fd, unsigned to_submit, unsigned min_complete, unsigned flags, sigset_t * sig, int sz)} */
    public static int io_uring_enter2(@NativeType("int *") @Nullable IntBuffer _errno, int fd, @NativeType("unsigned") int to_submit, @NativeType("unsigned") int min_complete, @NativeType("unsigned") int flags, @NativeType("sigset_t *") long sig, int sz) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nio_uring_enter2(memAddressSafe(_errno), fd, to_submit, min_complete, flags, sig, sz);
    }

    // --- [ io_uring_enter ] ---

    /** {@code int io_uring_enter(int fd, unsigned to_submit, unsigned min_complete, unsigned flags, sigset_t * sig)} */
    public static native int nio_uring_enter(long _errno, int fd, int to_submit, int min_complete, int flags, long sig);

    /** {@code int io_uring_enter(int fd, unsigned to_submit, unsigned min_complete, unsigned flags, sigset_t * sig)} */
    public static int io_uring_enter(@NativeType("int *") @Nullable IntBuffer _errno, int fd, @NativeType("unsigned") int to_submit, @NativeType("unsigned") int min_complete, @NativeType("unsigned") int flags, @NativeType("sigset_t *") long sig) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nio_uring_enter(memAddressSafe(_errno), fd, to_submit, min_complete, flags, sig);
    }

}