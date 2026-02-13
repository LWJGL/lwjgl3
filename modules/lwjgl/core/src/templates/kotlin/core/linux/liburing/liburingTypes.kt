/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.liburing

import org.lwjgl.generator.*
import core.linux.*

// io_uring.h

val io_uring_sqe = struct(Module.CORE_LINUX_LIBURING, "IOURingSQE", nativeName = "struct io_uring_sqe") {
    __u8("opcode")
    __u8("flags")
    __u16("ioprio")
    __s32("fd")
    union {
        __u64("off")
        __u64("addr2")
        struct {
            __u32("cmd_op")
            __u32("__pad1").private()
        }
    }
    union {
        __u64("addr")
        __u64("splice_off_in")
        struct {
            __u32("level")
            __u32("optname")
        }
    }
    __u32("len")
    union {
        __kernel_rwf_t("rw_flags")
        __u32("fsync_flags")
        __u16("poll_events")
        __u32("poll32_events")
        __u32("sync_range_flags")
        __u32("msg_flags")
        __u32("timeout_flags")
        __u32("accept_flags")
        __u32("cancel_flags")
        __u32("open_flags")
        __u32("statx_flags")
        __u32("fadvise_advice")
        __u32("splice_flags")
        __u32("rename_flags")
        __u32("unlink_flags")
        __u32("hardlink_flags")
        __u32("xattr_flags")
        __u32("msg_ring_flags")
        __u32("uring_cmd_flags")
        __u32("waitid_flags")
		__u32("futex_flags")
		__u32("install_fd_flags")
        __u32("nop_flags")
        __u32("pipe_flags")
    }
    __u64("user_data")
    union {
        __u16("buf_index")
        __u16("buf_group")
    }
    __u16("personality")
    union {
        __s32("splice_fd_in")
        __u32("file_index")
        __u32("zcrx_ifq_idx")
        __u32("optlen")
        struct {
            __u16("addr_len")
            __u16("__pad3")[1].private()
        }
    }
    union {
		struct {
			__u64("addr3")
			__u64("__pad2")[1].private()
		}
        struct {
            __u64("attr_ptr")
            __u64("attr_type_mask")
        };
        __u64("optval")
		__u8("cmd")[0]
	}
}

val io_uring_attr_pi = struct(Module.CORE_LINUX_LIBURING, "IOURingAttrPI", nativeName = "struct io_uring_attr_pi") {
    __u16("flags")
    __u16("app_tag")
    __u32("len")
    __u64("addr")
    __u64("seed")
    __u64("rsvd")
};

val io_uring_cqe = struct(Module.CORE_LINUX_LIBURING, "IOURingCQE", nativeName = "struct io_uring_cqe") {
    __u64("user_data")
    __s32("res")
    __u32("flags")
	__u64("big_cqe")[0]
}

val io_sqring_offsets = struct(Module.CORE_LINUX_LIBURING, "IOSQRingOffsets", nativeName = "struct io_sqring_offsets") {
    __u32("head")
    __u32("tail")
    __u32("ring_mask")
    __u32("ring_entries")
    __u32("flags")
    __u32("dropped")
    __u32("array")
    __u32("resv1").private()
    __u64("user_addr")
}

val io_cqring_offsets = struct(Module.CORE_LINUX_LIBURING, "IOCQRingOffsets", nativeName = "struct io_cqring_offsets") {
    __u32("head")
    __u32("tail")
    __u32("ring_mask")
    __u32("ring_entries")
    __u32("overflow")
    __u32("cqes")
    __u32("flags")
    __u32("resv1").private()
    __u64("user_addr")
}

val io_uring_params = struct(Module.CORE_LINUX_LIBURING, "IOURingParams", nativeName = "struct io_uring_params") {
    __u32("sq_entries")
    __u32("cq_entries")
    __u32("flags")
    __u32("sq_thread_cpu")
    __u32("sq_thread_idle")
    __u32("features")
    __u32("wq_fd")
    __u32("resv")[3].private()
    io_sqring_offsets("sq_off")
    io_cqring_offsets("cq_off")
}

val io_uring_region_desc = struct(Module.CORE_LINUX_LIBURING, "IOUringRegionDesc", nativeName = "struct io_uring_region_desc") {
    __u64("user_addr")
    __u64("size")
    __u32("flags")
    __u32("id")
    __u64("mmap_offset")
    __u64("__resv")[4].private()
}

val io_uring_mem_region_reg = struct(Module.CORE_LINUX_LIBURING, "IOURingMemRegionReg", nativeName = "struct io_uring_mem_region_reg") {
    __u64("region_uptr")
    __u64("flags")
    __u64("__resv")[2].private()
}

val io_uring_rsrc_register = struct(Module.CORE_LINUX_LIBURING, "IOURingRSRCRegister", nativeName = "struct io_uring_rsrc_register") {
    __u32("nr")
    __u32("flags")
    __u64("resv2").private()
    __u64("data")
    __u64("tags")
}

val io_uring_rsrc_update = struct(Module.CORE_LINUX_LIBURING, "IOURingRSRCUpdate", nativeName = "struct io_uring_rsrc_update") {
    __u32("offset")
    __u32("resv").private()
    __u64("data")
}

val io_uring_rsrc_update2 = struct(Module.CORE_LINUX_LIBURING, "IOURingRSRCUpdate2", nativeName = "struct io_uring_rsrc_update2") {
    __u32("offset")
    __u32("resv").private()
    __u64("data")
    __u64("tags")
    __u32("nr")
    __u32("resv2").private()
}

val io_uring_probe_op = struct(Module.CORE_LINUX_LIBURING, "IOURingProbeOp", nativeName = "struct io_uring_probe_op") {
    __u8("op")
    __u8("resv").private()
    __u16("flags")
    __u32("resv2").private()
}

val io_uring_probe = struct(Module.CORE_LINUX_LIBURING, "IOURingProbe", nativeName = "struct io_uring_probe") {
    __u8("last_op")	/* last opcode supported */
    __u8("ops_len")	/* length of ops[] array below */
    __u16("resv").private()
    __u32("resv2")[3].private()
    io_uring_probe_op("ops")[0]
}

val io_uring_restriction = struct(Module.CORE_LINUX_LIBURING, "IOURingRestriction", nativeName = "struct io_uring_restriction")  {
    __u16("opcode")
    union {
        __u8("register_op")
        __u8("sqe_op")
        __u8("sqe_flags")
    }
    __u8("resv").private()
    __u32("resv2")[3].private()
}

val io_uring_clock_register = struct(Module.CORE_LINUX_LIBURING, "IOURingClockRegister", nativeName = "struct io_uring_clock_register") {
    __u32("clockid")
    __u32("__resv")[3].private()
}

val io_uring_clone_buffers = struct(Module.CORE_LINUX_LIBURING, "IOURingCloneBuffers", nativeName = "struct io_uring_clone_buffers") {
    __u32("src_fd")
    __u32("flags")
    __u32("src_off")
    __u32("dst_off")
    __u32("nr")
    __u32("pad")[3].private()
};

val io_uring_buf = struct(Module.CORE_LINUX_LIBURING, "IOURingBuf", nativeName = "struct io_uring_buf") {
	__u64("addr")
	__u32("len")
	__u16("bid")
	__u16("resv").private()
}

val io_uring_buf_ring = struct(Module.CORE_LINUX_LIBURING, "IOURingBufRing", nativeName = "struct io_uring_buf_ring") {
	union {
		struct {
			__u64("resv1")
			__u32("resv2")
			__u16("resv3")
			__u16("tail")
		}
		io_uring_buf("bufs")[0]
	}
}

val io_uring_buf_reg = struct(Module.CORE_LINUX_LIBURING, "IOURingBufReg", nativeName = "struct io_uring_buf_reg") {
    __u64("ring_addr")
	__u32("ring_entries")
	__u16("bgid")
	__u16("flags")
	__u64("resv")[3].private()
}

val io_uring_buf_status = struct(Module.CORE_LINUX_LIBURING, "IOURingBufStatus", nativeName = "struct io_uring_buf_status") {
    __u32("buf_group")
    __u32("head")
    __u32("resv")[8].private()
}

val io_uring_napi = struct(Module.CORE_LINUX_LIBURING, "IOURingNAPI", nativeName = "struct io_uring_napi") {
    __u32("busy_poll_to")
    __u8("prefer_busy_poll")
    __u8("pad")[3].private()
    __u64("resv").private()
}

val io_uring_reg_wait = struct(Module.CORE_LINUX_LIBURING, "IOURingRegWait", nativeName = "struct" +
" io_uring_reg_wait") {
    javaImport("org.lwjgl.system.linux.*")

    __kernel_timespec("ts")
    __u32("min_wait_usec")
    __u32("flags")
    __u64("sigmask")
    __u32("sigmask_sz")
    __u32("pad")[3].private()
    __u64("pad2")[2].private()
}

val io_uring_getevents_arg = struct(Module.CORE_LINUX_LIBURING, "IOURingGeteventsArg", nativeName = "struct io_uring_getevents_arg") {
    __u64("sigmask")
    __u32("sigmask_sz")
    __u32("min_wait_usec")
    __u64("ts")
}

val io_uring_sync_cancel_reg = struct(Module.CORE_LINUX_LIBURING, "IOURingSyncCancelReg", nativeName = "struct io_uring_sync_cancel_reg") {
    javaImport("org.lwjgl.system.linux.*")

    __u64("addr")
    __s32("fd")
    __u32("flags")
    __kernel_timespec("timeout")
    __u8("opcode")
    __u8("pad")[7].private()
    __u64("pad2")[3].private()
}

val io_uring_file_index_range = struct(Module.CORE_LINUX_LIBURING, "IOURingFileIndexRange", nativeName = "struct io_uring_file_index_range") {
    __u32("off")
    __u32("len")
    __u64("resv").private()
}

val io_uring_recvmsg_out = struct(Module.CORE_LINUX_LIBURING, "IOURingRecvmsgOut", nativeName = "struct io_uring_recvmsg_out") {
    __u32("namelen")
    __u32("controllen")
    __u32("payloadlen")
    __u32("flags")
}

val io_timespec = struct(Module.CORE_LINUX_LIBURING, "IOTimespec", nativeName = "struct io_timespec") {
    __u64("tv_sec")
    __u64("tv_nsec")
}

val io_uring_zcrx_rqe = struct(Module.CORE_LINUX_LIBURING, "IOURingZCRXRQE", nativeName = "struct io_uring_zcrx_rqe") {
    __u64("off")
    __u32("len")
    __u32("__pad").private()
}

val io_uring_zcrx_cqe = struct(Module.CORE_LINUX_LIBURING, "IOURingZCRXCQE", nativeName = "struct io_uring_zcrx_cqe") {
    __u64("off")
    __u64("__pad").private()
}

val io_uring_zcrx_offsets = struct(Module.CORE_LINUX_LIBURING, "IOURingZCRXOffsets", nativeName = "struct io_uring_zcrx_offsets") {
    __u32("head")
    __u32("tail")
    __u32("rqes")
    __u32("__resv2").private()
    __u64("__resv")[2].private()
}

val io_uring_zcrx_area_reg = struct(Module.CORE_LINUX_LIBURING, "IOURingZCRXAreaReg", nativeName = "struct io_uring_zcrx_area_reg") {
    __u64("addr")
    __u64("len")
    __u64("rq_area_token")
    __u32("flags")
    __u32("dmabuf_fd")
    __u64("__resv2")[2].private()
}

val io_uring_zcrx_ifq_reg = struct(Module.CORE_LINUX_LIBURING, "IOURingZCRXIfqReg", nativeName = "struct io_uring_zcrx_ifq_reg") {
    __u32("if_idx")
    __u32("if_rxq")
    __u32("rq_entries")
    __u32("flags")

    __u64("area_ptr")
    __u64("region_ptr")

    io_uring_zcrx_offsets("offsets")
    __u32("zcrx_id")
    __u32("__resv2").private()
    __u64("__resv")[3].private()
}

// liburing.h

val io_uring_sq = struct(Module.CORE_LINUX_LIBURING, "IOURingSQ", nativeName = "struct io_uring_sq") {
    unsigned.p("khead")
    unsigned.p("ktail")
    unsigned.p("kring_mask")
    unsigned.p("kring_entries")
    unsigned.p("kflags")
    unsigned.p("kdropped")
    unsigned.p("array")
    io_uring_sqe.p("sqes")

    unsigned("sqe_head")
    unsigned("sqe_tail")

    AutoSize("ring_ptr")..size_t("ring_sz")
    void.p("ring_ptr")

    unsigned("ring_mask")
	unsigned("ring_entries")

    unsigned("sqes_sz")
    unsigned("pad").private()
}

val io_uring_cq = struct(Module.CORE_LINUX_LIBURING, "IOURingCQ", nativeName = "struct io_uring_cq") {
    unsigned.p("khead")
    unsigned.p("ktail")
    unsigned.p("kring_mask")
    unsigned.p("kring_entries")
    unsigned.p("kflags")
    unsigned.p("koverflow")
    io_uring_cqe.p("cqes")

    AutoSize("ring_ptr")..size_t("ring_sz")
    void.p("ring_ptr")

    unsigned("ring_mask")
    unsigned("ring_entries")

    unsigned_int("pad")[2].private()
}

val io_uring = struct(Module.CORE_LINUX_LIBURING, "IOURing", nativeName = "struct io_uring") {
    io_uring_sq("sq")
    io_uring_cq("cq")
    unsigned_int("flags")
    int("ring_fd")

    unsigned_int("features")
    int("enter_ring_fd")
	__u8("int_flags")
	__u8("pad")[3].private()
    unsigned("pad2").private()
}

val io_uring_zcrx_rq = struct(Module.CORE_LINUX_LIBURING, "IOURingZCRXRQ", nativeName = "struct io_uring_zcrx_rq") {
    __u32.p("khead")
    __u32.p("ktail")
    __u32("rq_tail")
    unsigned("ring_entries")

    io_uring_zcrx_rqe.p("rqes")
    opaque_p("ring_ptr")
}

// query.h

val io_uring_query_hdr = struct(Module.CORE_LINUX_LIBURING, "IOURingQueryHdr", nativeName = "struct io_uring_query_hdr") {
    __u64("next_entry")
    __u64("query_data")
    __u32("query_op")
    __u32("size")
    __s32("result")
    __u32("__resv")[3].private()
}

val io_uring_query_opcode = struct(Module.CORE_LINUX_LIBURING, "IOURingQueryOpcode", nativeName = "struct io_uring_query_opcode") {
    __u32("nr_request_opcodes")
    __u32("nr_register_opcodes")
    __u64("feature_flags")
    __u64("ring_setup_flags")
    __u64("enter_flags")
    __u64("sqe_flags")
}