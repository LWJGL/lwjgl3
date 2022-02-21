/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.liburing.templates

import org.lwjgl.generator.*
import core.linux.*
import core.linux.liburing.*

val LibURing = "LibURing".nativeClass(Module.CORE_LINUX_LIBURING, nativeSubPath = "linux", prefixConstant = "", prefixMethod = "io_uring_") {
    nativeImport("liburing.h")
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
        int.p("files", ""),
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

        NOTE that even if {@code fd_in} or {@code fd_out} refers to a pipe, the splice operation can still failed with {@code EINVAL} if one of the fd doesn't
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
        "prep_cancel",
        "",

        io_uring_sqe.p("sqe", ""),
        __u64("user_data", ""),
        int("flags", "") // TODO:
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
        "prep_recv",
        "",

        io_uring_sqe.p("sqe", ""),
        int("sockfd", ""),
        void.p("buf", ""),
        AutoSize("buf")..size_t("len", ""),
        int("flags", "")
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
        "prep_renameat",
        "",

        io_uring_sqe.p("sqe", ""),
        int("olddfd", ""),
        charUTF8.const.p("oldpath", ""),
        int("newdfd", ""),
        charUTF8.const.p("newpath", ""),
        int("flags", "") // TODO:
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
        "prep_symlinkat",
        "",

        io_uring_sqe.p("sqe", ""),
        charUTF8.const.p("target", ""),
        int("newdirfd", ""),
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

    // TODO: add readdir(3)
    /*void(
        "prep_getdents",
        """
        Prepares a {@code getdents64} request.

        The submission queue entry {@code sqe} is setup to use the file descriptor {@code fd} to start writing up to {@code count} bytes into the buffer
        {@code buf} starting at {@code offset}.

        After the {@code getdents} call has been prepared it can be submitted with one of the submit functions.
        """,

        io_uring_sqe.p("sqe", ""),
        int("fd", ""),
        void.p("buf", ""),
        AutoSize("buf")..unsigned_int("count", ""),
        uint64_t("offset", "")
    )*/

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
}