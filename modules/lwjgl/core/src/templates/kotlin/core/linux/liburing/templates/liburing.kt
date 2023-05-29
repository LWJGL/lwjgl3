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

    documentation =
        """
        Native bindings to ${url("https://github.com/axboe/liburing", "liburing")}.
        """

    LongConstant("", "LIBURING_UDATA_TIMEOUT".."-1L")

    io_uring_probe.p(
        "get_probe_ring",
        """
        Return an allocated {@code io_uring_probe} structure, or #NULL if probe fails (for example, if it is not available).

        The caller is responsible for freeing it.
        """,

        io_uring.p("ring", "")
    )

    io_uring_probe.p(
        "get_probe",
        """
        Returns an allocated {@code io_uring_probe} structure to the caller.

        The caller is responsible for freeing the structure with the function #free_probe().

        Note: Earlier versions of the Linux kernel (&le; 5.5) do not support probe. If the kernel doesn't support probe, this function will return #NULL.
        """,

        void()
    )

    void(
        "free_probe",
        "Frees the {@code probe} instance allocated with the #get_probe() function.",

        io_uring_probe.p("probe", "")
    )

    int(
        "opcode_supported",
        """
        Allows the caller to determine if the passed in {@code opcode} belonging to the {@code probe} param is supported.

        An instance of the {@code io_uring_probe} instance can be obtained by calling the function #get_probe().
        """,

        io_uring_probe.const.p("p", ""),
        int("op", "")
    )

    int(
        "queue_init_params",
        "",

        unsigned("entries", ""),
        io_uring.p("ring", ""),
        io_uring_params.p("p", "")
    )

    int(
        "queue_init",
        """
        Executes the #setup() syscall to  initialize the submission and completion queues in the kernel with at least {@code entries} entries and then maps the
        resulting file descriptor to memory shared between the application and the kernel.

        On success, the resources held by {@code ring} should be released via a corresponding call to #queue_exit().
        """,

        unsigned("entries", ""),
        io_uring.p("ring", ""),
        unsigned("flags", "will be passed through to the #setup() syscall"),

        returnDoc =
        "0 on success and {@code ring} will point to the shared memory containing the {@code io_uring} queues. On failure {@code -errno} is returned."
    )

    int(
        "queue_mmap",
        "For users that want to specify {@code sq_thread_cpu} or {@code sq_thread_idle}, this interface is a convenient helper for {@code mmap()}ing the rings.",

        int("fd", "a file descriptor returned by #setup()"),
        io_uring_params.p("p", ""),
        io_uring.p("ring", "on success, contains the necessary information to read/write to the rings"),

        returnDoc = "{@code -errno} on error, or zero on success"
    )

    int(
        "ring_dontfork",
        """
        Ensure that the {@code mmap}'ed rings aren't available to a child after a {@code fork(2)}.

        This uses {@code madvise(..., MADV_DONTFORK)} on the {@code mmap}'ed ranges.
        """,

        io_uring.p("ring", "")
    )

    void(
        "queue_exit",
        """
        Will release all resources acquired and initialized by #queue_init().

        It first unmaps the memory shared between the application and the kernel and then closes the {@code io_uring} file descriptor.
        """,

        io_uring.p("ring", "")
    )

    unsigned(
        "peek_batch_cqe",
        "Fill in an array of IO completions up to count, if any are available.",

        io_uring.p("ring", ""),
        io_uring_cqe.p.p("cqes", ""),
        AutoSize("cqes")..unsigned("count", ""),

        returnDoc = "the amount of IO completions filled"
    )

    int(
        "wait_cqes",
        """
        Returns {@code wait_nr} IO completions from the queue belonging to the {@code ring} param, waiting for it if necessary or until the timeout {@code ts}
        expires.

        If {@code ts} is specified, the application does not need to call #submit() before calling {@code io_uring_wait_cqes()}.
        """,

        io_uring.p("ring", ""),
        io_uring_cqe.p.p("cqe_ptr", "filled in on success"),
        AutoSize("cqe_ptr")..unsigned("wait_nr", ""),
        nullable..__kernel_timespec.p("ts", ""),
        nullable..sigset_t.p("sigmask", "the set of signals to block. The prevailing signal mask is restored before returning."),

        returnDoc = "0 on success and the {@code cqe_ptr} param is filled in. On failure it returns {@code -errno}."
    )

    int(
        "wait_cqe_timeout",
        """
        Returns one IO completion from the queue belonging to the {@code ring} param, waiting for it if necessary or until the timeout {@code ts} expires.

        If {@code ts} is specified, the application does not need to call #submit() before calling {@code io_uring_wait_cqe_timeout()}.
        """,

        io_uring.p("ring", ""),
        Check(1)..io_uring_cqe.p.p("cqe_ptr", "filled in on success"),
        nullable..__kernel_timespec.p("ts", ""),

        returnDoc = "0 on success and the {@code cqe_ptr} param is filled in. On failure it returns {@code -errno}."
    )

    int(
        "submit",
        """
        Submits the next events to the submission queue belonging to the {@code ring}.

        After the caller retrieves a submission queue entry (SQE) with #get_sqe(), prepares the SQE, it can be submitted with {@code io_uring_submit()}.
        """,

        io_uring.p("ring", ""),

        returnDoc = "the number of submitted submission queue entries on success. On failure it returns {@code -errno}."
    )

    int(
        "submit_and_wait",
        """
        Submits the next events to the submission queue belonging to the {@code ring} and waits for {@code wait_nr} completion events.

        After the caller retrieves a submission queue entry (SQE) with #get_sqe(), prepares the SQE, it can be submitted with
        {@code io_uring_submit_and_wait()}.
        """,

        io_uring.p("ring", ""),
        unsigned("wait_nr", ""),

        returnDoc = "the number of submitted submission queue entries on success. On failure it returns {@code -errno}."
    )

    int(
        "submit_and_wait_timeout",
        """
        Submits the next events to the submission queue belonging to the {@code ring} and waits for {@code wait_nr} completion events or until the timeout
        {@code ts} expires.The completion events are stored in the {@code cqe_ptr} array.

        After the caller retrieves a submission queue entry (SQE) with #get_sqe(), prepares the SQE, it can be submitted with
        {@code io_uring_submit_and_wait_timeout()}.
        """,

        io_uring.p("ring", ""),
        io_uring_cqe.p.p("cqe_ptr", ""),
        AutoSize("cqe_ptr")..unsigned("wait_nr", ""),
        nullable..__kernel_timespec.p("ts", ""),
        nullable..sigset_t.p("sigmask", "the set of signals to block. The prevailing signal mask is restored before returning."),

        returnDoc = "the number of submitted submission queue entries on success. On failure it returns {@code -errno}."
    )

    int(
        "register_buffers",
        """
        Registers {@code nr_iovecs} number of buffers defined by the array {@code iovecs} belonging to the {@code ring}.

        After the caller has registered the buffers, they can be used with one of the fixed buffers functions.

        Registered buffers is an optimization that is useful in conjunction with {@code O_DIRECT} reads and writes, where maps the specified range into the
        kernel once when the buffer is registered, rather than doing a map and unmap for each IO every time IO is performed to that region. Additionally, it
        also avoids manipulating the page reference counts for each IO.
        """,

        io_uring.p("ring", ""),
        iovec.const.p("iovecs", ""),
        AutoSize("iovecs")..unsigned("nr_iovecs", ""),

        returnDoc = "0 on success. On failure it returns {@code -errno}."
    )

    int(
        "register_buffers_tags",
        "",

        io_uring.p("ring", ""),
        iovec.const.p("iovecs", ""),
        __u64.const.p("tags", ""),
        AutoSize("iovecs", "tags")..unsigned("nr", "")
    )

    int(
        "register_buffers_sparse",
        """
        Registers {@code nr_iovecs} empty buffers belonging to the {@code ring}.

        These buffers must be updated before use, using eg #register_buffers_update_tag().

        After the caller has registered the buffers, they can be used with one of the fixed buffers functions.

        Registered buffers is an optimization that is useful in conjunction with {@code O_DIRECT} reads and writes, where it maps the specified range into the
        kernel once when the buffer is registered rather than doing a map and unmap for each IO every time IO is performed to that region. Additionally, it
        also avoids manipulating the page reference counts for each IO.
        """,

        io_uring.p("ring", ""),
        unsigned("nr_iovecs", "")
    )

    int(
        "register_buffers_update_tag",
        "",

        io_uring.p("ring", ""),
        unsigned("off", ""),
        iovec.const.p("iovecs", ""),
        __u64.const.p("tags", ""),
        AutoSize("iovecs", "tags")..unsigned("nr", "")
    )

    int(
        "unregister_buffers",
        "Unregisters the fixed buffers previously registered to the {@code ring}.",

        io_uring.p("ring", ""),

        returnDoc = "0 on success. On failure it returns {@code -errno}."
    )

    int(
        "register_files",
        """
        Registers {@code nr_files} number of file descriptors defined by the array {@code files} belonging to the {@code ring} for subsequent operations.

        After the caller has registered the buffers, they can be used with the submission queue polling operations.
        """,

        io_uring.p("ring", ""),
        int.const.p("files", ""),
        AutoSize("files")..unsigned("nr_files", ""),

        returnDoc = "0 on success. On failure it returns {@code -errno}."
    )

    int(
        "register_files_tags",
        "",

        io_uring.p("ring", ""),
        int.const.p("files", ""),
        __u64.const.p("tags", ""),
        AutoSize("files", "tags")..unsigned("nr", "")
    )

    int(
        "register_files_sparse",
        """
        Registers an empty file table of {@code nr_files} number of file descriptors.

        Registering a file table is a prerequisite for using any request that uses direct descriptors.
        
        The sparse variant is available in kernels 5.19 and later.
        """,

        io_uring.p("ring", ""),
        unsigned("nr_files", "")
    )

    int(
        "register_files_update_tag",
        "",

        io_uring.p("ring", ""),
        unsigned("off", ""),
        int.const.p("files", ""),
        __u64.const.p("tags", ""),
        AutoSize("files", "tags")..unsigned("nr_files", "")
    )

    int(
        "unregister_files",
        "",

        io_uring.p("ring", "")
    )

    int(
        "register_files_update",
        "",

        io_uring.p("ring", ""),
        unsigned("off", ""),
        int.const.p("files", ""),
        AutoSize("files")..unsigned("nr_files", "")
    )

    int(
        "register_eventfd",
        "",

        io_uring.p("ring", ""),
        int("fd", "")
    )

    int(
        "register_eventfd_async",
        "",

        io_uring.p("ring", ""),
        int("fd", "")
    )

    int(
        "unregister_eventfd",
        "",

        io_uring.p("ring", "")
    )

    int(
        "register_probe",
        "",

        io_uring.p("ring", ""),
        io_uring_probe.p("p", ""),
        unsigned("nr", "")
    )

    int(
        "register_personality",
        "",

        io_uring.p("ring", "")
    )

    int(
        "unregister_personality",
        "",

        io_uring.p("ring", ""),
        int("id", "")
    )

    int(
        "register_restrictions",
        "",

        io_uring.p("ring", ""),
        io_uring_restriction.p("res", ""),
        AutoSize("res")..unsigned("nr_res", "")
    )

    int(
        "enable_rings",
        "",

        io_uring.p("ring", "")
    )

    int(
        "__io_uring_sqring_wait",
        "",

        io_uring.p("ring", ""),

        noPrefix = true
    )

    int(
        "register_iowq_aff",
        "",

        io_uring.p("ring", ""),
        size_t("cpusz", ""),
        cpu_set_t.const.p("mask", "")
    )

    int(
        "unregister_iowq_aff",
        "",

        io_uring.p("ring", "")
    )

    int(
        "register_iowq_max_workers",
        "",

        io_uring.p("ring", ""),
        Check(2)..unsigned_int.p("values", "")
    )

    int(
        "register_ring_fd",
        """
        Registers the file descriptor of the ring.

        Whenever #enter() is called to submit request or wait for completions, the kernel must grab a reference to the file descriptor. If the application
        using io_uring is threaded, the file table is marked as shared, and the reference grab and put of the file descriptor count is more expensive than it
        is for a non-threaded application.

        Similarly to how io_uring allows registration of files, this allow registration of the ring file descriptor itself. This reduces the overhead of the
        {@code io_uring_enter (2)} system call.

        If an application using liburing is threaded, then an application should call this function to register the ring descriptor when a ring is set up. See
        NOTES for restrictions when a ring is shared.

        ${note("""
        When the ring descriptor is registered, it is stored internally in the {@code struct io_uring} structure. For applications that share a ring between
        threads, for example having one thread do submits and another reap events, then this optimization cannot be used as each thread may have a different
        index for the registered ring fd.
        """)}
        """,

        io_uring.p("ring", ""),

        returnDoc = "1 on success, indicating that one file descriptor was registered, or {@code -errno} on error"
    )

    int(
        "unregister_ring_fd",
        """
        Unregisters the file descriptor of the ring.

        Unregisters a ring descriptor previously registered with the task. This is done automatically when #queue_exit() is called, but can also be done to
        free up space for new ring registrations. For more information on ring descriptor registration, see #register_ring_fd().
        """,

        io_uring.p("ring", ""),

        returnDoc = "1 on success, indicating that one file descriptor was unregistered, or {@code -errno} on error"
    )

    int(
        "close_ring_fd",
        "",

        io_uring.p("ring", "")
    )

    int(
        "register_buf_ring",
        """
        Registers a shared buffer ring to be used with provided buffers.

        For the request types that support it, provided buffers are given to the ring and one is selected by a request if it has #IOSQE_BUFFER_SELECT set in
        the SQE {@code flags}, when the request is ready to receive data. This allows both clear ownership of the buffer lifetime, and a way to have more
        read/receive type of operations in flight than buffers available.

        The {@code reg} argument must be filled in with the appropriate information. It looks as follows:
        ${codeBlock("""
struct io_uring_buf_reg {
    __u64 ring_addr;
    __u32 ring_entries;
    __u16 bgid;
    __u16 pad;
    __u64 resv[3];
};""")}

        The {@code ring_addr} field must contain the address to the memory allocated to fit this ring. The memory must be page aligned and hence allocated
        appropriately using eg {@code posix_memalign (3)} or similar. The size of the ring is the product of {@code ring_entries} and the size of
        {@code "struct io_uring_buf"}. {@code ring_entries} is the desired size of the ring, and must be a power-of-2 in size. {@code bgid} is the buffer group
        ID associated with this ring. SQEs that select a buffer has a buffer group associated with them in their {@code buf_group} field, and the associated
        CQE will have LibIOURing#IORING_CQE_F_BUFFER set in their {@code flags} member, which will also contain the specific ID of the buffer selected. The
        rest of the fields are reserved and must be cleared to zero.

        The {@code flags} argument is currently unused and must be set to zero.

        A shared buffer ring looks as follows:
        ${codeBlock("""
struct io_uring_buf_ring {
    union {
	struct {
            __u64 resv1;
            __u32 resv2;
            __u16 resv3;
            __u16 tail;
	};
	struct io_uring_buf bufs[0];
    };
};""")}

        where {@code tail} is the index at which the application can insert new buffers for consumption by requests, and {@code struct io_uring_buf} is buffer
        definition:
        ${codeBlock("""
struct io_uring_buf {
    __u64 addr;
    __u32 len;
    __u16 bid;
    __u16 resv;
};""")}

        where {@code addr} is the address for the buffer, {@code len} is the length of the buffer in bytes, and {@code bid} is the buffer ID that will be
        returned in the CQE once consumed.

        Reserved fields must not be touched. Applications must use LibURing#io_uring_buf_ring_init() to initialise the buffer ring. Applications may use
        LibURing#io_uring_buf_ring_add() and #buf_ring_advance() or #buf_ring_advance() to provide buffers, which will set these fields and update the tail.

        Available since 5.19.
        """,

        io_uring.p("ring", ""),
        io_uring_buf_reg.p("reg", ""),
        unsigned_int("flags", ""),

        returnDoc = "0 on success, {@code -errno} on failure"
    )

    int(
        "unregister_buf_ring",
        "Function unregisters a previously registered shared buffer ring indicated by {@code bgid}.",

        io_uring.p("ring", ""),
        int("bgid", ""),

        returnDoc = "0 on success, {@code -errno} on failure"
    )

    int(
        "register_sync_cancel",
        "",

        io_uring.p("ring", ""),
        io_uring_sync_cancel_reg.p("reg", "")
    )

    int(
        "register_file_alloc_range",
        "",

        io_uring.p("ring", ""),
        unsigned("off", ""),
        unsigned("len", "")
    )

    int(
        "get_events",
        """
        Runs outstanding work and flushes completion events to the CQE ring.

        There can be events needing to be flushed if the ring was full and had overflowed. Alternatively if the ring was setup with the #SETUP_DEFER_TASKRUN
        flag then this will process outstanding tasks, possibly resulting in more CQEs.
        """,

        io_uring.p("ring", ""),

        returnDoc = "0 on success, {@code -errno} on failure"
    )

    int(
        "submit_and_get_events",
        """
        Submits the next events to the submission queue as with #submit().

        After submission it will flush CQEs as with #get_events().

        The benefit of this function is that it does both with only one system call.
        """,

        io_uring.p("ring", ""),

        returnDoc = "the number of submitted submission queue entries on success, {@code -errno} on failure"
    )

    int(
        "enter",
        "See LibIOURing#io_uring_enter().",

        unsigned_int("fd", ""),
        unsigned_int("to_submit", ""),
        unsigned_int("min_complete", ""),
        unsigned_int("flags", ""),
        sigset_t.p("sig", "")
    )

    int(
        "enter2",
        "See LibIOURing#io_uring_enter2().",

        unsigned_int("fd", ""),
        unsigned_int("to_submit", ""),
        unsigned_int("min_complete", ""),
        unsigned_int("flags", ""),
        sigset_t.p("sig", ""),
        size_t("sz", "")
    )

    int(
        "setup",
        "See LibIOURing#io_uring_setup().",

        unsigned_int("entries", ""),
        io_uring_params.p("p", "")
    )

    int(
        "register",
        "See LibIOURing#io_uring_register().",

        unsigned_int("fd", ""),
        unsigned_int("opcode", ""),
        nullable..opaque_p("arg", ""),
        unsigned_int("nr_args", "")
    )

    io_uring_buf_ring.p(
        "setup_buf_ring",
        "",

        io_uring.p("ring", ""),
        unsigned_int("nentries", ""),
        int("bgid", ""),
        unsigned_int("flags", ""),
        Check(1)..int.p("ret", "")
    )

    int(
        "free_buf_ring",
        "",

        io_uring.p("ring", ""),
        io_uring_buf_ring.p("br", ""),
        unsigned_int("nentries", ""),
        int("bgid", "")
    )

    void(
        "cqe_seen",
        """
        Marks the IO completion {@code cqe} belonging to the {@code ring} param as processed.

        After the caller has submitted a request with #submit(), they can retrieve the completion with #wait_cqe() and mark it then as processed with
        {@code io_uring_cqe_seen()}.

        Completions must be marked as completed, so their slot can get reused.
        """,

        io_uring.p("ring", ""),
        io_uring_cqe.p("cqe", "")
    )

    void(
        "sqe_set_data",
        """
        Stores a {@code user_data} pointer with the submission queue entry {@code sqe}.

        After the caller has requested an submission queue entry (SQE) with #get_sqe(), they can associate a data pointer with the SQE. Once the completion
        arrives, the function #cqe_get_data() can be called to identify the user request.
        """,

        io_uring_sqe.p("sqe", ""),
        opaque_p("data", "")
    )

    opaque_p(
        "cqe_get_data",
        """
        Returns the {@code user_data} with the completion queue entry {@code cqe}.

        After the caller has received a completion queue entry (CQE) with #wait_cqe(), they can call the {@code io_uring_cqe_get_data()} function to retrieve
        the {@code user_data} value. This requires that {@code user_data} has been set earlier with the function #sqe_set_data().
        """,

        io_uring_cqe.const.p("cqe", "")
    )

    void(
        "sqe_set_data64",
        """
        Assign a 64-bit value to this {@code sqe}, which can get retrieved at completion time with #cqe_get_data64().

        Just like the non-64 variants, except these store a 64-bit type rather than a data pointer.
        """,

        io_uring_sqe.p("sqe", ""),
        __u64("data", "")
    )

    __u64(
        "cqe_get_data64",
        "See #sqe_set_data64().",

        io_uring_cqe.const.p("cqe", "")
    )

    void(
        "sqe_set_flags",
        """
        Allows the caller to change the behavior of the submission queue entry by specifying flags.

        It enables the {@code flags} belonging to the {@code sqe} submission queue entry param.
        """,

        io_uring_sqe.p("sqe", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_splice",
        """
        Precondition: Either {@code fd_in} or {@code fd_out} must be a pipe.

        This splice operation can be used to implement {@code sendfile} by splicing to an intermediate pipe first, then splice to the final destination. In
        fact, the implementation of {@code sendfile} in kernel uses {@code splice} internally.

        NOTE that even if {@code fd_in} or {@code fd_out} refers to a pipe, the splice operation can still fail with {@code EINVAL} if one of the fd doesn't
        explicitly support splice operation, e.g. reading from terminal is unsupported from kernel 5.7 to 5.11. Check issue \#291 for more information.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd_in", ""),
        int64_t(
            "off_in",
            """
            if {@code fd_in} refers to a pipe, {@code off_in} must be {@code (int64_t) -1}; If {@code fd_in} does not refer to a pipe and {@code off_in} is
            {@code (int64_t) -1}, then bytes are read from {@code fd_in} starting from the file offset and it is adjust appropriately; If {@code fd_in} does
            not refer to a pipe and {@code off_in} is not {@code (int64_t) -1}, then the starting {@code offset} of {@code fd_in} will be {@code off_in}.
            """
        ),
        int("fd_out", ""),
        int64_t("off_out", "the description of {@code off_in} also applied to {@code off_out}"),
        unsigned_int("nbytes", ""),
        unsigned_int("splice_flags", "see man {@code splice(2)} for description of flags")
    )

    void(
        "prep_tee",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd_in", ""),
        int("fd_out", ""),
        unsigned_int("nbytes", ""),
        unsigned_int("splice_flags", "")
    )

    void(
        "prep_readv",
        """
        Prepares a vectored IO read request.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start reading {@code nr_vecs} into the {@code iovecs} array at
        the specified {@code offset}.

        On files that support seeking, if the {@code offset} is set to -1, the read operation commences at the file offset, and the file offset is incremented
        by the number of bytes read. See {@code read(2)} for more details.

        On files that are not capable of seeking, the offset is ignored.

        After the write has been prepared it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        iovec.const.p("iovecs", ""),
        AutoSize("iovecs")..unsigned_int("nr_vecs", ""),
        int("offset", "")
    )

    void(
        "prep_readv2",
        """
        Prepares a vectored IO read request.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start reading {@code nr_vecs} into the {@code iovecs} array at
        the specified {@code offset}.

        The behavior of the function can be controlled with the {@code flags} parameter. Supported values for flags are:
        ${ul(
            "{@code RWF_HIPRI} - High priority request, poll if possible",
            "{@code RWF_DSYNC} - per-IO {@code O_DSYNC}",
            "{@code RWF_SYNC} - per-IO {@code O_SYNC}",
            "{@code RWF_NOWAIT} - per-IO, return {@code -EAGAIN} if operation would block",
            "{@code RWF_APPEND} - per-IO {@code O_APPEND}"
        )}

        On files that support seeking, if the {@code offset} is set to -1, the read operation commences at the file offset, and the file offset is incremented
        by the number of bytes read. See {@code read(2)} for more details.

        On files that are not capable of seeking, the offset is ignored.

        After the write has been prepared, it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        iovec.const.p("iovecs", ""),
        AutoSize("iovecs")..unsigned_int("nr_vecs", ""),
        int("offset", ""),
        int("flags", "")
    )

    void(
        "prep_read_fixed",
        """
        Prepares an IO read request with a previously registered IO buffer.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start reading {@code nbytes} into the buffer {@code buf} at
        the specified {@code offset}, and with the buffer matching the registered index of {@code buf_index}.

        This work just like  #prep_read() except it requires the user of buffers that have been registered with #register_buffers(). The {@code buf} and
        {@code nbytes} arguments must fall within a region specificed by {@code buf_index} in the previously registered buffer. The buffer need not be aligned
        with the start of the registered buffer.

        After the read has been prepared it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        void.p("buf", ""),
        AutoSize("buf")..unsigned_int("nbytes", ""),
        int("offset", ""),
        int("buf_index", "")
    )

    void(
        "prep_writev",
        """
        Prepares a vectored IO write request.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start writing {@code nr_vecs} from the {@code iovecs} array at
        the specified {@code offset}.

        On files that support seeking, if the {@code offset} is set to -1, the write operation commences at the file offset, and the file offset is incremented
        by the number of bytes written. See {@code write(2)} for more details.

        On files that are not capable of seeking, the offset is ignored.

        After the write has been prepared it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        iovec.const.p("iovecs", ""),
        AutoSize("iovecs")..unsigned_int("nr_vecs", ""),
        int("offset", "")
    )

    void(
        "prep_writev2",
        """
        Prepares a vectored IO write request.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start writing {@code nr_vecs} from the {@code iovecs} array at
        the specified {@code offset}.

        The behavior of the function can be controlled with the {@code flags} parameter. Supported values for flags are:
        ${ul(
            "{@code RWF_HIPRI} - High priority request, poll if possible",
            "{@code RWF_DSYNC} - per-IO {@code O_DSYNC}",
            "{@code RWF_SYNC} - per-IO {@code O_SYNC}",
            "{@code RWF_NOWAIT} - per-IO, return {@code -EAGAIN} if operation would block",
            "{@code RWF_APPEND} - per-IO {@code O_APPEND}"    
        )}

        On files that support seeking, if the {@code offset} is set to -1, the write operation commences at the file offset, and the file offset is incremented
        by the number of bytes written. See {@code write(2)} for more details.

        On files that are not capable of seeking, the offset is ignored.

        After the write has been prepared, it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        iovec.const.p("iovecs", ""),
        AutoSize("iovecs")..unsigned_int("nr_vecs", ""),
        int("offset", ""),
        int("flags", "")
    )

    void(
        "prep_write_fixed",
        """
        Prepares an IO write request with a previously registered IO buffer.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start writing {@code nbytes} from the buffer {@code buf} at
        the specified {@code offset}, and with the buffer matching the registered index of {@code buf_index}.

        This work just like #prep_write() except it requires the user of buffers that have been registered with #register_buffers(). The {@code buf} and
        {@code nbytes} arguments must fall within a region specificed by {@code buf_index} in the previously registered buffer. The buffer need not be aligned
        with the start of the registered buffer.

        After the read has been prepared it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        void.const.p("buf", ""),
        AutoSize("buf")..unsigned_int("nbytes", ""),
        int("offset", ""),
        int("buf_index", "")
    )

    void(
        "prep_recvmsg",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        msghdr.p("msg", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_recvmsg_multishot",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        msghdr.p("msg", ""),
        unsigned("flags", "")
    )

    void(
        "prep_sendmsg",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        msghdr.const.p("msg", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_poll_add",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        unsigned_int("poll_mask", "")
    )

    void(
        "prep_poll_multishot",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        unsigned_int("poll_mask", "")
    )

    void(
        "prep_poll_remove",
        "",

        io_uring_sqe.p("sqe", ""),
        __u64("user_data", "")
    )

    void(
        "prep_poll_update",
        "",

        io_uring_sqe.p("sqe", ""),
        __u64("old_user_data", ""),
        __u64("new_user_data", ""),
        unsigned_int("poll_mask", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_fsync",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        unsigned_int("fsync_flags", "") // TODO:
    )

    void(
        "prep_nop",
        "",

        io_uring_sqe.p("sqe", "")
    )

    void(
        "prep_timeout",
        "",

        io_uring_sqe.p("sqe", ""),
        __kernel_timespec.p("ts", ""),
        unsigned_int("count", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_timeout_remove",
        "",

        io_uring_sqe.p("sqe", ""),
        __u64("user_data", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_timeout_update",
        "",

        io_uring_sqe.p("sqe", ""),
        __kernel_timespec.p("ts", ""),
        __u64("user_data", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_accept",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        sockaddr.p("addr", ""),
        Check(1)..socklen_t.p("addrlen", ""),
        int("flags", "")
    )

    void(
        "prep_accept_direct",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        sockaddr.p("addr", ""),
        Check(1)..socklen_t.p("addrlen", ""),
        int("flags", ""),
        unsigned_int("file_index", "")
    )

    void(
        "prep_multishot_accept",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        sockaddr.p("addr", ""),
        Check(1)..socklen_t.p("addrlen", ""),
        int("flags", "")
    )

    void(
        "prep_multishot_accept_direct",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        sockaddr.p("addr", ""),
        Check(1)..socklen_t.p("addrlen", ""),
        int("flags", ""),
    )

    void(
        "prep_cancel64",
        "",

        io_uring_sqe.p("sqe", ""),
        __u64("user_data", ""),
        int("flags", "")
    )

    void(
        "prep_cancel",
        "",

        io_uring_sqe.p("sqe", ""),
        opaque_p("user_data", ""),
        int("flags", "") // TODO:
    )

    void(
        "prep_cancel_fd",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_link_timeout",
        "",

        io_uring_sqe.p("sqe", ""),
        __kernel_timespec.p("ts", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_connect",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        sockaddr.const.p("addr", ""),
        socklen_t("addrlen", "")
    )

    void(
        "prep_files_update",
        "",

        io_uring_sqe.p("sqe", ""),
        int.p("fds", ""),
        AutoSize("fds")..unsigned_int("nr_fds", ""),
        int("offset", "")
    )

    void(
        "prep_fallocate",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        int("mode", ""), // TODO:
        off_t("offset", ""),
        off_t("len", "")
    )

    void(
        "prep_openat",
        "",

        io_uring_sqe.p("sqe", ""),
        int("dfd", ""),
        charUTF8.const.p("path", ""),
        int("flags", ""), // TODO:
        int("mode", "") // TODO:
    )

    void(
        "prep_openat_direct",
        "",

        io_uring_sqe.p("sqe", ""),
        int("dfd", ""),
        charUTF8.const.p("path", ""),
        int("flags", ""), // TODO:
        int("mode", ""), // TODO:
        unsigned_int("file_index", "")
    )

    void(
        "prep_close",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", "")
    )

    void(
        "prep_close_direct",
        "",

        io_uring_sqe.p("sqe", ""),
        unsigned_int("file_index", "")
    )

    void(
        "prep_read",
        """
        Prepares an IO read request.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start reading {@code nbytes} into the buffer {@code buf} at
        the specified {@code offset}.

        On files that support seeking, if the {@code offset} is set to -1, the read operation commences at the file offset, and the file offset is incremented
        by the number of bytes read. See {@code read(2)} for more details.

        On files that are not capable of seeking, the {@code offset} is ignored.

        After the read has been prepared it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        void.p("buf", ""),
        AutoSize("buf")..unsigned_int("nbytes", ""),
        int("offset", "")
    )

    void(
        "prep_write",
        """
        Prepares an IO write request.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start writing {@code nbytes} from the buffer {@code buf} at
        the specified {@code offset}.

        On files that support seeking, if the {@code offset} is set to -1, the write operation commences at the file offset, and the file offset is incremented
        by the number of bytes written. See {@code write(2)} for more details.

        On files that are not capable of seeking, the offset is ignored.

        After the write has been prepared, it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        void.const.p("buf", ""),
        AutoSize("buf")..unsigned_int("nbytes", ""),
        int("offset", "")
    )

    void(
        "prep_statx",
        "",

        io_uring_sqe.p("sqe", ""),
        int("dfd", ""),
        charUTF8.const.p("path", ""),
        int("flags", ""),
        unsigned_int("mask", ""),
        statx.p("statxbuf", "")
    )

    void(
        "prep_fadvise",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        int("offset", ""),
        off_t("len", ""),
        int("advice", "") // TODO:
    )

    void(
        "prep_madvise",
        "",

        io_uring_sqe.p("sqe", ""),
        void.p("addr", ""),
        AutoSize("addr")..off_t("length", ""),
        int("advice", "") // TODO:
    )

    void(
        "prep_send",
        "",

        io_uring_sqe.p("sqe", ""),
        int("sockfd", ""),
        void.const.p("buf", ""),
        AutoSize("buf")..size_t("len", ""),
        int("flags", "")
    )

    void(
        "prep_send_set_addr",
        "",

        io_uring_sqe.p("sqe", ""),
        sockaddr.const.p("dest_addr", ""),
        __u16("addr_len", "")
    )

    void(
        "prep_sendto",
        "",

        io_uring_sqe.p("sqe", ""),
        int("sockfd", ""),
        void.const.p("buf", ""),
        AutoSize("buf")..size_t("len", ""),
        int("flags", ""),
        sockaddr.const.p("addr", ""),
        socklen_t("addrlen", "")
    )

    void(
        "prep_send_zc",
        "",

        io_uring_sqe.p("sqe", ""),
        int("sockfd", ""),
        void.const.p("buf", ""),
        AutoSize("buf")..size_t("len", ""),
        int("flags", ""),
        unsigned("zc_flags", "")
    )

    void(
        "prep_send_zc_fixed",
        "",

        io_uring_sqe.p("sqe", ""),
        int("sockfd", ""),
        void.const.p("buf", ""),
        AutoSize("buf")..size_t("len", ""),
        int("flags", ""),
        unsigned("zc_flags", ""),
        unsigned("buf_index", "")
    )

    void(
        "prep_sendmsg_zc",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        msghdr.const.p("msg", ""),
        unsigned("flags", "")
    )

    void(
        "prep_recv",
        "",

        io_uring_sqe.p("sqe", ""),
        int("sockfd", ""),
        void.p("buf", ""),
        AutoSize("buf")..size_t("len", ""),
        int("flags", "")
    )

    void(
        "prep_recv_multishot",
        "",

        io_uring_sqe.p("sqe", ""),
        int("sockfd", ""),
        void.p("buf", ""),
        AutoSize("buf")..size_t("len", ""),
        int("flags", "")
    )

    io_uring_recvmsg_out.p(
        "recvmsg_validate",
        "",

        void.p("buf", ""),
        AutoSize("buf")..int("buf_len", ""),
        msghdr.p("msgh", "")
    )

    opaque_p(
        "recvmsg_name",
        "",

        io_uring_recvmsg_out.p("o", "")
    )

    cmsghdr.p(
        "recvmsg_cmsg_firsthdr",
        "",

        io_uring_recvmsg_out.p("o", ""),
        msghdr.p("msgh", "")
    )

    cmsghdr.p(
        "recvmsg_cmsg_nexthdr",
        "",

        io_uring_recvmsg_out.p("o", ""),
        msghdr.p("msgh", ""),
        cmsghdr.p("cmsg", "")
    )

    opaque_p(
        "recvmsg_payload",
        "",

        io_uring_recvmsg_out.p("o", ""),
        msghdr.p("msgh", "")
    )

    unsigned_int(
        "recvmsg_payload_length",
        "",

        io_uring_recvmsg_out.p("o", ""),
        int("buf_len", ""),
        msghdr.p("msgh", "")
    )

    void(
        "prep_openat2",
        "",

        io_uring_sqe.p("sqe", ""),
        int("dfd", ""),
        charUTF8.const.p("path", ""),
        open_how.p("how", "")
    )

    void(
        "prep_openat2_direct",
        "open directly into the fixed file table",

        io_uring_sqe.p("sqe", ""),
        int("dfd", ""),
        charUTF8.const.p("path", ""),
        open_how.p("how", ""),
        unsigned_int("file_index", "")
    )

    void(
        "prep_epoll_ctl",
        "",

        io_uring_sqe.p("sqe", ""),
        int("epfd", ""),
        int("fd", ""),
        int("op", ""),
        epoll_event.p("ev", "")
    )

    void(
        "prep_provide_buffers",
        "",

        io_uring_sqe.p("sqe", ""),
        void.p("addr", ""),
        AutoSize("addr")..int("len", ""),
        int("nr", ""),
        int("bgid", ""),
        int("bid", "")
    )

    void(
        "prep_remove_buffers",
        "",

        io_uring_sqe.p("sqe", ""),
        int("nr", ""),
        int("bgid", "")
    )

    void(
        "prep_shutdown",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        int("how", "") // TODO:
    )

    void(
        "prep_unlinkat",
        "",

        io_uring_sqe.p("sqe", ""),
        int("dfd", ""),
        charUTF8.const.p("path", ""),
        int("flags", "") // TODO:
    )

    void(
        "prep_unlink",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("path", ""),
        int("flags", "")
    )

    void(
        "prep_renameat",
        "",

        io_uring_sqe.p("sqe", ""),
        int("olddfd", ""),
        charUTF8.const.p("oldpath", ""),
        int("newdfd", ""),
        charUTF8.const.p("newpath", ""),
        unsigned_int("flags", "") // TODO:
    )

    void(
        "prep_rename",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("oldpath", ""),
        charUTF8.const.p("newpath", "")
    )

    void(
        "prep_sync_file_range",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        unsigned_int("len", ""),
        int("offset", ""),
        int("flags", "") // TODO:
    )

    void(
        "prep_mkdirat",
        "",

        io_uring_sqe.p("sqe", ""),
        int("dfd", ""),
        charUTF8.const.p("path", ""),
        int("mode", "") // TODO:
    )

    void(
        "prep_mkdir",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("path", ""),
        int("mode", "") // TODO:
    )

    void(
        "prep_symlinkat",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("target", ""),
        int("newdirfd", ""),
        charUTF8.const.p("linkpath", "")
    )

    void(
        "prep_symlink",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("target", ""),
        charUTF8.const.p("linkpath", "")
    )

    void(
        "prep_linkat",
        "",

        io_uring_sqe.p("sqe", ""),
        int("olddfd", ""),
        charUTF8.const.p("oldpath", ""),
        int("newdfd", ""),
        charUTF8.const.p("newpath", ""),
        int("flags", "") // TODO:
    )

    void(
        "prep_link",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("oldpath", ""),
        charUTF8.const.p("newpath", ""),
        int("flags", "") // TODO:
    )

    void(
        "prep_msg_ring_cqe_flags",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        unsigned_int("len", ""),
        __u64("data", ""),
        unsigned_int("flags", ""),
        unsigned_int("cqe_flags", "")
    )

    void(
        "prep_msg_ring",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        unsigned_int("len", ""),
        __u64("data", ""),
        unsigned_int("flags", "") // TODO:
    )

    void(
        "prep_msg_ring_fd",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        int("source_fd", ""),
        int("target_fd", ""),
        __u64("data", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_msg_ring_fd_alloc",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        int("source_fd", ""),
        __u64("data", ""),
        unsigned_int("flags", "")
    )

    void(
        "prep_getxattr",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("name", ""),
        char.p("value", ""),
        charUTF8.const.p("path", ""),
        AutoSize("value")..unsigned_int("len", "")
    )

    void(
        "prep_setxattr",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("name", ""),
        char.const.p("value", ""),
        charUTF8.const.p("path", ""),
        int("flags", ""),
        AutoSize("value")..unsigned_int("len", "")
    )

    void(
        "prep_fgetxattr",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        charUTF8.const.p("name", ""),
        char.p("value", ""),
        AutoSize("value")..unsigned_int("len", "")
    )

    void(
        "prep_fsetxattr",
        "",

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        charUTF8.const.p("name", ""),
        char.const.p("value", ""),
        int("flags", ""),
        AutoSize("value")..unsigned_int("len", "")
    )

    void(
        "prep_socket",
        "",

        io_uring_sqe.p("sqe", ""),
        int("domain", ""),
        int("type", ""),
        int("protocol", ""),
        unsigned_int("flags", "") // TODO:
    )

    void(
        "prep_socket_direct",
        "",

        io_uring_sqe.p("sqe", ""),
        int("domain", ""),
        int("type", ""),
        int("protocol", ""),
        unsigned_int("file_index", ""),
        unsigned_int("flags", "") // TODO:
    )

    void(
        "prep_socket_direct_alloc",
        "",

        io_uring_sqe.p("sqe", ""),
        int("domain", ""),
        int("type", ""),
        int("protocol", ""),
        unsigned_int("flags", "") // TODO:
    )

    unsigned_int(
        "sq_ready",
        "Returns the number of unconsumed (if {@code SQPOLL}) or unsubmitted entries that exist in the SQ ring belonging to the {@code ring} param.",

        io_uring.const.p("ring", "")
    )

    unsigned_int(
        "sq_space_left",
        "Returns how much space is left in the SQ ring belonging to the {@code ring} param.",

        io_uring.const.p("ring", "")
    )

    int(
        "sqring_wait",
        """
        Allows the caller to wait for space to free up in the SQ ring belonging to the {@code ring} param, which happens when the kernel side thread has
        consumed one or more entries.

        If the SQ ring is currently non-full, no action is taken.

        This feature can only be used when {@code SQPOLL} is enabled.
        """,

        io_uring.p("ring", "")
    )

    unsigned_int(
        "cq_ready",
        "Retuns the number of unconsumed entries that are ready belonging to the {@code ring} param.",

        io_uring.const.p("ring", "")
    )

    bool(
        "cq_has_overflow",
        "Returns true if there are overflow entries waiting to be flushed onto the CQ ring",

        io_uring.const.p("ring", "")
    )

    bool(
        "cq_eventfd_enabled",
        "Returns true if the {@code eventfd} notification is currently enabled.",

        io_uring.const.p("ring", "")
    )

    int(
        "cq_eventfd_toggle",
        "Toggle {@code eventfd} notification on or off, if an {@code eventfd} is registered with the ring.",

        io_uring.p("ring", ""),
        bool("enabled", "")
    )

    int(
        "wait_cqe_nr",
        """
        Returns {@code wait_nr} IO completion events from the queue belonging to the {@code ring} param, waiting for it if necessary. The {@code cqe_ptr} param
        is filled in on success.

        After the caller has submitted a request with #submit(), they can retrieve the completion with {@code io_uring_wait_cqe_nr()}.
        """,

        io_uring.p("ring", ""),
        io_uring_cqe.p.p("cqe_ptr", ""),
        AutoSize("cqe_ptr")..unsigned_int("wait_nr", ""),

        returnDoc = "0 on success and the {@code cqe_ptr} param is filled in. On failure it returns {@code -errno}."
    )

    int(
        "peek_cqe",
        "Returns an IO completion, if one is readily available.",

        io_uring.p("ring", ""),
        Check(1)..io_uring_cqe.p.p("cqe_ptr", ""),

        returnDoc = "0 with {@code cqe_ptr} filled in on success, {@code -errno} on failure"
    )

    int(
        "wait_cqe",
        """
        Returns an IO completion from the queue belonging to the {@code ring} param, waiting for it if necessary. The {@code cqe_ptr} param is filled in on
        success.

        After the caller has submitted a request with #submit(), they can retrieve the completion with {@code io_uring_wait_cqe()}.
        """,

        io_uring.p("ring", ""),
        Check(1)..io_uring_cqe.p.p("cqe_ptr", ""),

        returnDoc = "0 on success and the {@code cqe_ptr} param is filled in. On failure it returns {@code -errno}."
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
        "",

        io_uring_buf_ring.p("br", ""),
        int("count", "")
    )

    void(
        "buf_ring_cq_advance",
        "",

        io_uring.p("ring", ""),
        io_uring_buf_ring.p("br", ""),
        int("count", "")
    )

    io_uring_sqe.p(
        "get_sqe",
        """
        Gets the next available submission queue entry from the submission queue belonging to the {@code ring} param.

        If a submission queue event is returned, it should be filled out via one of the prep functions such as #prep_read() and submitted via #submit().
        """,

        io_uring.p("ring", ""),

        returnDoc = "a pointer to the next submission queue event on success and #NULL on failure"
    )

    int(
        "mlock_size",
        "Return required {@code ulimit -l} memory space for a given ring setup. See #mlock_size_params().",

        unsigned("entries", ""),
        unsigned("flags", "{@code io_uring_params} flags")
    )

    int(
        "mlock_size_params",
        """
        Returns the required {@code ulimit -l memlock} memory required for a given ring setup, in bytes.

        May return {@code -errno} on error. On newer (5.12+) kernels, {@code io_uring} no longer requires any {@code memlock} memory, and hence this function
        will return 0 for that case. On older (5.11 and prior) kernels, this will return the required memory so that the caller can ensure that enough space is
        available before setting up a ring with the specified parameters.
        """,

        unsigned("entries", ""),
        io_uring_params.p("p", "")
    )

    int(
        "major_version",
        "",

        void()
    )

    int(
        "minor_version",
        "",

        void()
    )

    bool(
        "check_version",
        "",

        int("major", ""),
        int("minor", "")
    )
}