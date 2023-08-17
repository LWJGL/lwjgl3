/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.liburing

import org.lwjgl.generator.*
import core.linux.*

// io_uring.h

val io_uring_sqe = struct(Module.CORE_LINUX_LIBURING, "IOURingSQE", nativeName = "struct io_uring_sqe") {
    documentation =
        """
        IO submission data structure (Submission Queue Entry).

        Once the submission queue entry is initialized, I/O is submitted by placing the index of the submission queue entry into the tail of the submission
        queue. After one or more indexes are added to the queue, and the queue tail is advanced, the #enter() system call can be invoked to initiate the I/O.
        """

    __u8("opcode", "type of operation for this sqe")
    __u8("flags", "{@code IOSQE_} flags").links("IOSQE_\\w+", LinkMode.BITFIELD)
    __u16("ioprio", "specifies the I/O priority. See {@code ioprio_get(2)} for a description of Linux I/O priorities.")
    __s32("fd", "specifies the file descriptor against which the operation will be performed")
    union {
        __u64("off", "offset into file")
        __u64("addr2", "")
        struct {
            __u32("cmd_op", "")
            __u32("__pad1", "").private()
        }
    }
    union {
        __u64("addr", "pointer to buffer or {@code iovecs}")
        __u64("splice_off_in", "")
    }
    __u32("len", "buffer size or number of {@code iovecs}")
    union {
        __kernel_rwf_t(
            "rw_flags",
            "specified for read and write operations, contains a bitwise OR of per-I/O flags, as described in the {@code preadv2(2)} man page"
        )
        __u32(
            "fsync_flags",
            """
            may contain either 0, for a normal file integrity sync, or #FSYNC_DATASYNC to provide data sync only semantics.

            See the descriptions of {@code O_SYNC} and {@code O_DSYNC} in the {@code open(2)} manual page for more information.
            """
        )
        __u16("poll_events", "the bits that may be set in {@code poll_events} are defined in {@code <poll.h>}, and documented in {@code poll(2)}")
        __u32("poll32_events", "word-reversed for BE")
        __u32("sync_range_flags", "")
        __u32("msg_flags", "")
        __u32("timeout_flags", "")
        __u32("accept_flags", "")
        __u32("cancel_flags", "")
        __u32("open_flags", "")
        __u32("statx_flags", "")
        __u32("fadvise_advice", "")
        __u32("splice_flags", "")
        __u32("rename_flags", "")
        __u32("unlink_flags", "")
        __u32("hardlink_flags", "")
        __u32("xattr_flags", "")
        __u32("msg_ring_flags", "")
        __u32("uring_cmd_flags", "")
    }
    __u64("user_data", "an application-supplied value that will be copied into the completion queue entry")
    union {
        __u16("buf_index", "an index into an array of fixed buffers, and is only valid if fixed buffers were registered")
        __u16("buf_group", "for grouped buffer selection")
    }
    __u16(
        "personality",
        """
        the credentials id to use for this operation.

        See #register() for how to register personalities with {@code io_uring}. If set to 0, the current personality of the submitting task is used.
        """
    )
    union {
        __s32("splice_fd_in", "")
        __u32("file_index", "")
        struct {
            __u16("addr_len", "")
            __u16("__pad3", "")[1].private()
        }
    }
    union {
		struct {
			__u64("addr3", "")
			__u64("__pad2", "")[1].private()
		}
		__u8("cmd", "If the ring is initialized with #SETUP_SQE128, then this field is used for 80 bytes of arbitrary command data")[0]
	}
}

val io_uring_cqe = struct(Module.CORE_LINUX_LIBURING, "IOURingCQE", nativeName = "struct io_uring_cqe") {
    documentation = "IO completion data structure (Completion Queue Entry)."

    __u64(
        "user_data",
        """
        is copied from the field of the same name in the submission queue entry.

        The primary use case is to store data that the application will need to access upon completion of this particular I/O.
        """
    )
    __s32(
        "res",
        """
        is the operation-specific result, but {@code io_uring}-specific errors (e.g. {@code flags} or {@code opcode} invalid) are returned through this field.

        For read and write {@code opcodes}, the return values match {@code errno} values documented in the {@code preadv2(2)} and {@code pwritev2(2)} man
        pages, with {@code res} holding the equivalent of {@code -errno} for error cases, or the transferred number of bytes in case the operation is
        successful. Hence both error and success return can be found in that field in the CQE. For other request types, the return values are documented in the
        matching man page for that type, or in the {@code opcodes} section for {@code io_uring}-specific {@code opcodes}.
        """
    )
    __u32("flags", "is used for certain commands, like #OP_POLL_ADD or in conjunction with #IOSQE_BUFFER_SELECT, see those entries")
	__u64(
        "big_cqe",
        "If the ring is initialized with #SETUP_CQE32, then this field contains 16-bytes of padding, doubling the size of the CQE."
    )[0]
}

val io_sqring_offsets = struct(Module.CORE_LINUX_LIBURING, "IOSQRingOffsets", nativeName = "struct io_sqring_offsets") {
    documentation = "Filled with the offset for {@code mmap(2)}."

    __u32("head", "")
    __u32("tail", "")
    __u32("ring_mask", "")
    __u32("ring_entries", "")
    __u32("flags", "")
    __u32("dropped", "")
    __u32("array", "")
    __u32("resv1", "").private()
    __u64("resv2", "").private()
}

val io_cqring_offsets = struct(Module.CORE_LINUX_LIBURING, "IOCQRingOffsets", nativeName = "struct io_cqring_offsets") {
    __u32("head", "")
    __u32("tail", "")
    __u32("ring_mask", "")
    __u32("ring_entries", "")
    __u32("overflow", "")
    __u32("cqes", "")
    __u32("flags", "")
    __u32("resv1", "").private()
    __u64("resv2", "").private()
}

val io_uring_params = struct(Module.CORE_LINUX_LIBURING, "IOURingParams", nativeName = "struct io_uring_params") {
    documentation =
        """
        Passed in for #setup(). Copied back with updated info on success.

        The {@code flags}, {@code sq_thread_cpu}, and {@code sq_thread_idle} fields are used to configure the {@code io_uring} instance. If no {@code flags}
        are specified, the {@code io_uring} instance is setup for interrupt driven I/O. I/O may be submitted using #enter() and can be reaped by polling the
        completion queue.

        The rest of the fields are filled in by the kernel, and provide the information necessary to memory map the submission queue, completion queue, and the
        array of submission queue entries.

        {@code sq_off} describes the offsets of various ring buffer fields. Taken together, {@code sq_entries} and {@code sq_off} provide all of the
        information necessary for accessing the submission queue ring buffer and the submission queue entry array. The submission queue can be mapped with a
        call like:
        ${codeBlock("""
ptr = mmap(0, sq_off.array + sq_entries * sizeof(__u32),
           PROT_READ|PROT_WRITE, MAP_SHARED|MAP_POPULATE,
           ring_fd, IORING_OFF_SQ_RING);""")}

        where {@code sq_off} is the {@code io_sqring_offsets} structure, and {@code ring_fd} is the file descriptor returned from #setup(). The addition of
        {@code sq_off.array} to the length of the region accounts for the fact that the ring located at the end of the data structure. As an example, the ring
        buffer head pointer can be accessed by adding {@code sq_off.head} to the address returned from {@code mmap(2)}:
        ${codeBlock("""
head = ptr + sq_off.head;""")}

        The array of submission queue entries is mapped with:
        ${codeBlock("""
sqentries = mmap(0, sq_entries * sizeof(struct io_uring_sqe),
                 PROT_READ|PROT_WRITE, MAP_SHARED|MAP_POPULATE,
                 ring_fd, IORING_OFF_SQES);""")}

        The completion queue is described by {@code cq_entries} and {@code cq_off}. The completion queue is simpler, since the entries are not separated from
        the queue itself, and can be mapped with:
        ${codeBlock("""
ptr = mmap(0, cq_off.cqes + cq_entries * sizeof(struct io_uring_cqe),        
           PROT_READ|PROT_WRITE, MAP_SHARED|MAP_POPULATE, ring_fd,
           IORING_OFF_CQ_RING);""")}
        """

    __u32("sq_entries", "the number of submission queue entries allocated")
    __u32("cq_entries", "")
    __u32("flags", "").links("SETUP_\\w+", LinkMode.BITFIELD)
    __u32("sq_thread_cpu", "")
    __u32("sq_thread_idle", "")
    __u32("features", "filled in by the kernel, which specifies various features supported by current kernel version").links("FEAT_\\w+", LinkMode.BITFIELD)
    __u32("wq_fd", "")
    __u32("resv", "")[3]
    io_sqring_offsets(
        "sq_off",
        """
        The {@code flags} field is used by the kernel to communicate state information to the application. Currently, it is used to inform the application when
        a call to #enter() is necessary.

        The {@code dropped} member is incremented for each invalid submission queue entry encountered in the ring buffer.

        The {@code head} and {@code tail} track the ring buffer state. The {@code tail} is incremented by the application when submitting new I/O, and the
        {@code head} is incremented by the kernel when the I/O has been successfully submitted. Determining the index of the {@code head} or {@code tail} into
        the ring is accomplished by applying a mask:
        ${codeBlock("""
index = tail & ring_mask;""")}
        """
    )
    io_cqring_offsets("cq_off", "")
}

val io_uring_rsrc_register = struct(Module.CORE_LINUX_LIBURING, "IOURingRSRCRegister", nativeName = "struct io_uring_rsrc_register") {
    __u32("nr", "")
    __u32("flags", "")
    __u64("resv2", "")
    __u64("data", "")
    __u64("tags", "")
}

val io_uring_rsrc_update = struct(Module.CORE_LINUX_LIBURING, "IOURingRSRCUpdate", nativeName = "struct io_uring_rsrc_update") {
    __u32("offset", "")
    __u32("resv", "")
    __u64("data", "")
}

val io_uring_rsrc_update2 = struct(Module.CORE_LINUX_LIBURING, "IOURingRSRCUpdate2", nativeName = "struct io_uring_rsrc_update2") {
    __u32("offset", "")
    __u32("resv", "")
    __u64("data", "")
    __u64("tags", "")
    __u32("nr", "")
    __u32("resv2", "")
}

val io_uring_probe_op = struct(Module.CORE_LINUX_LIBURING, "IOURingProbeOp", nativeName = "struct io_uring_probe_op") {
    __u8("op", "")
    __u8("resv", "")
    __u16("flags", "").links("IO_URING_OP_\\w+", LinkMode.BITFIELD)
    __u32("resv2", "")
}

val io_uring_probe = struct(Module.CORE_LINUX_LIBURING, "IOURingProbe", nativeName = "struct io_uring_probe") {
    __u8("last_op", "")	/* last opcode supported */
    __u8("ops_len", "")	/* length of ops[] array below */
    __u16("resv", "")
    __u32("resv2", "")[3].private()
    io_uring_probe_op("ops", "")[0]
}

val io_uring_restriction = struct(Module.CORE_LINUX_LIBURING, "IOURingRestriction", nativeName = "struct io_uring_restriction")  {
    __u16("opcode", "")
    union {
        __u8("register_op", "")
        __u8("sqe_op", "")
        __u8("sqe_flags", "")
    }
    __u8("resv", "").private()
    __u32("resv2", "")[3].private()
}

val io_uring_buf = struct(Module.CORE_LINUX_LIBURING, "IOURingBuf", nativeName = "struct io_uring_buf") {
	__u64("addr", "")
	__u32("len", "")
	__u16("bid", "")
	__u16("resv", "")
}

val io_uring_buf_ring = struct(Module.CORE_LINUX_LIBURING, "IOURingBufRing", nativeName = "struct io_uring_buf_ring") {
	union {
		struct {
			__u64("resv1", "")
			__u32("resv2", "")
			__u16("resv3", "")
			__u16("tail", "")
		}
		io_uring_buf("bufs", "")[0]
	}
}

val io_uring_buf_reg = struct(Module.CORE_LINUX_LIBURING, "IOURingBufReg", nativeName = "struct io_uring_buf_reg") {
    documentation = "Argument for {@code IORING_(UN)REGISTER_PBUF_RING}."

    __u64("ring_addr", "")
	__u32("ring_entries", "")
	__u16("bgid", "")
	__u16("flags", "")
	__u64("resv", "")[3]
}

val io_uring_getevents_arg = struct(Module.CORE_LINUX_LIBURING, "IOURingGeteventsArg", nativeName = "struct io_uring_getevents_arg") {
    __u64("sigmask", "")
    __u32("sigmask_sz", "")
    __u32("pad", "")
    __u64("ts", "")
}

val io_uring_sync_cancel_reg = struct(Module.CORE_LINUX_LIBURING, "IOURingSyncCancelReg", nativeName = "struct io_uring_sync_cancel_reg") {
    javaImport("org.lwjgl.system.linux.*")
    documentation = "Argument for #REGISTER_SYNC_CANCEL."

    __u64("addr", "")
    __s32("fd", "")
    __u32("flags", "")
    __kernel_timespec("timeout", "")
    __u64("pad", "")[4].private()
}

val io_uring_file_index_range = struct(Module.CORE_LINUX_LIBURING, "IOURingFileIndexRange", nativeName = "struct io_uring_file_index_range") {
    documentation =
        """
        Argument for #REGISTER_FILE_ALLOC_RANGE.

        The range is specified as {@code [off, off + len)}.
        """

    __u32("off", "")
    __u32("len", "")
    __u64("resv", "")
}

val io_uring_recvmsg_out = struct(Module.CORE_LINUX_LIBURING, "IOURingRecvmsgOut", nativeName = "struct io_uring_recvmsg_out") {
    __u32("namelen", "")
    __u32("controllen", "")
    __u32("payloadlen", "")
    __u32("flags", "")
}

// liburing.h

val io_uring_sq = struct(Module.CORE_LINUX_LIBURING, "IOURingSQ", nativeName = "struct io_uring_sq") {
    documentation = ""

    unsigned.p("khead", "")
    unsigned.p("ktail", "")
    unsigned.p("kring_mask", "Deprecated: use {@code ring_mask} instead of {@code *kring_mask}")
    unsigned.p("kring_entries", "Deprecated: use {@code ring_entries} instead of {@code *kring_entries}")
    unsigned.p("kflags", "")
    unsigned.p("kdropped", "")
    unsigned.p("array", "")
    io_uring_sqe.p("sqes", "")

    unsigned("sqe_head", "")
    unsigned("sqe_tail", "")

    AutoSize("ring_ptr")..size_t("ring_sz", "")
    void.p("ring_ptr", "")

    unsigned("ring_mask", "")
	unsigned("ring_entries", "")

    unsigned("pad", "")[2].private()
}

val io_uring_cq = struct(Module.CORE_LINUX_LIBURING, "IOURingCQ", nativeName = "struct io_uring_cq") {
    documentation = ""

    unsigned.p("khead", "")
    unsigned.p("ktail", "")
    unsigned.p("kring_mask", "Deprecated: use {@code ring_mask} instead of {@code *kring_mask}")
    unsigned.p("kring_entries", "Deprecated: use {@code ring_entries} instead of {@code *kring_entries}")
    unsigned.p("kflags", "")
    unsigned.p("koverflow", "")
    io_uring_cqe.p("cqes", "")

    AutoSize("ring_ptr")..size_t("ring_sz", "")
    void.p("ring_ptr", "")

    unsigned("ring_mask", "")
    unsigned("ring_entries", "")

    unsigned_int("pad", "")[2].private()
}

val io_uring = struct(Module.CORE_LINUX_LIBURING, "IOURing", nativeName = "struct io_uring") {
    io_uring_sq("sq", "")
    io_uring_cq("cq", "")
    unsigned_int("flags", "")
    int("ring_fd", "")

    unsigned_int("features", "")
    int("enter_ring_fd", "")
	__u8("int_flags", "")
	__u8("pad", "")[3].private()
    unsigned("pad2", "").private()
}
