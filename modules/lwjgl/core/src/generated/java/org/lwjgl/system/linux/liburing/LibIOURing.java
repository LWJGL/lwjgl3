/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.lwjgl.system.*;

/**
 * Native bindings to <a href="https://github.com/axboe/liburing">io_uring</a>, a Linux-specific API for asynchronous I/O.
 * 
 * <p>It allows the user to submit one or more I/O requests, which are processed asynchronously without blocking the calling process. {@code io_uring} gets
 * its name from ring buffers which are shared between user space and kernel space. This arrangement allows for efficient I/O, while avoiding the overhead
 * of copying buffers between them, where possible. This interface makes {@code io_uring} different from other UNIX I/O APIs, wherein, rather than just
 * communicate between kernel and user space with system calls, ring buffers are used as the main mode of communication. This arrangement has various
 * performance benefits which are discussed in a separate section below. This man page uses the terms shared buffers, shared ring buffers and queues
 * interchangeably.</p>
 * 
 * <p>The general programming model you need to follow for io_uring is outlined below</p>
 * 
 * <ul>
 * <li>Set up shared buffers with {@link #io_uring_setup setup} and {@code mmap(2)}, mapping into user space shared buffers for the submission queue (SQ) and the completion
 * queue (CQ). You place I/O requests you want to make on the SQ, while the kernel places the results of those operations on the CQ.</li>
 * <li>For every I/O request you need to make (like to read a file, write a file, accept a socket connection, etc), you create a submission queue entry,
 * or SQE, describe the I/O operation you need to get done and add it to the tail of the submission queue (SQ). Each I/O operation is, in essence, the
 * equivalent of a system call you would have made otherwise, if you were not using {@code io_uring}. You can add more than one SQE to the queue
 * depending on the number of operations you want to request.</li>
 * <li>After you add one or more SQEs, you need to call {@link #io_uring_enter enter} to tell the kernel to dequeue your I/O requests off the SQ and begin processing them.</li>
 * <li>For each SQE you submit, once it is done processing the request, the kernel places a completion queue event or CQE at the tail of the completion
 * queue or CQ. The kernel places exactly one matching CQE in the CQ for every SQE you submit on the SQ. After you retrieve a CQE, minimally, you
 * might be interested in checking the res field of the CQE structure, which corresponds to the return value of the system call's equivalent, had you
 * used it directly without using {@code io_uring}. For instance, a read operation under {@code io_uring}, started with the {@link #IORING_OP_READ OP_READ} operation, which
 * issues the equivalent of the {@code read(2)} system call, would return as part of {@code res} what {@code read(2)} would have returned if called
 * directly, without using {@code io_uring}.</li>
 * <li>Optionally, {@link #io_uring_enter enter} can also wait for a specified number of requests to be processed by the kernel before it returns. If you specified a certain
 * number of completions to wait for, the kernel would have placed at least those many number of CQEs on the CQ, which you can then readily read,
 * right after the return from {@code io_uring_enter(2)}.</li>
 * <li>It is important to remember that I/O requests submitted to the kernel can complete in any order. It is not necessary for the kernel to process one
 * request after another, in the order you placed them. Given that the interface is a ring, the requests are attempted in order, however that doesn't
 * imply any sort of ordering on their completion. When more than one request is in flight, it is not possible to determine which one will complete
 * first. When you dequeue CQEs off the CQ, you should always check which submitted request it corresponds to. The most common method for doing so is
 * utilizing the {@code user_data} field in the request, which is passed back on the completion side.</li>
 * </ul>
 * 
 * <p>Adding to and reading from the queues:</p>
 * 
 * <ul>
 * <li>You add SQEs to the tail of the SQ. The kernel reads SQEs off the head of the queue.</li>
 * <li>The kernel adds CQEs to the tail of the CQ. You read CQEs off the head of the queue.</li>
 * </ul>
 * 
 * <h3>Submission queue polling</h3>
 * 
 * <p>One of the goals of {@code io_uring} is to provide a means for efficient I/O. To this end, {@code io_uring} supports a polling mode that lets you avoid
 * the call to {@link #io_uring_enter enter}, which you use to inform the kernel that you have queued SQEs on to the SQ. With SQ Polling, {@code io_uring} starts a kernel
 * thread that polls the submission queue for any I/O requests you submit by adding SQEs. With SQ Polling enabled, there is no need for you to call
 * {@code io_uring_enter(2)}, letting you avoid the overhead of system calls. A designated kernel thread dequeues SQEs off the SQ as you add them and
 * dispatches them for asynchronous processing.</p>
 * 
 * <h3>Setting up io_uring</h3>
 * 
 * <p>The main steps in setting up {@code io_uring} consist of mapping in the shared buffers with {@code mmap(2)} calls.</p>
 * 
 * <h3>Submitting I/O requests</h3>
 * 
 * <p>The process of submitting a request consists of describing the I/O operation you need to get done using an {@code io_uring_sqe} structure instance.
 * These details describe the equivalent system call and its parameters. Because the range of I/O operations Linux supports are very varied and the
 * {@code io_uring_sqe} structure needs to be able to describe them, it has several fields, some packed into unions for space efficiency.</p>
 * 
 * <p>To submit an I/O request to {@code io_uring}, you need to acquire a submission queue entry (SQE) from the submission queue (SQ), fill it up with
 * details of the operation you want to submit and call {@link #io_uring_enter enter}. If you want to avoid calling {@code io_uring_enter(2)}, you have the option of setting
 * up Submission Queue Polling.</p>
 * 
 * <p>SQEs are added to the tail of the submission queue. The kernel picks up SQEs off the head of the SQ. The general algorithm to get the next available
 * SQE and update the tail is as follows.</p>
 * 
 * <pre><code>
 * struct io_uring_sqe *sqe;
 * unsigned tail, index;
 * tail = *sqring-&gt;tail;
 * index = tail &amp; (*sqring-&gt;ring_mask);
 * sqe = &amp;sqring-&gt;sqes[index];
 * // fill up details about this I/O request
 * describe_io(sqe);
 * // fill the sqe index into the SQ ring array
 * sqring-&gt;array[index] = index;
 * tail++;
 * atomic_store_release(sqring-&gt;tail, tail);</code></pre>
 * 
 * <p>To get the index of an entry, the application must mask the current tail index with the size mask of the ring. This holds true for both SQs and CQs.
 * Once the SQE is acquired, the necessary fields are filled in, describing the request. While the CQ ring directly indexes the shared array of CQEs, the
 * submission side has an indirection array between them. The submission side ring buffer is an index into this array, which in turn contains the index
 * into the SQEs.</p>
 * 
 * <p>The following code snippet demonstrates how a read operation, an equivalent of a preadv2(2) system call is described by filling up an SQE with the
 * necessary parameters.</p>
 * 
 * <pre><code>
 * struct iovec iovecs[16];
 *  ...
 * sqe-&gt;opcode = IORING_OP_READV;
 * sqe-&gt;fd = fd;
 * sqe-&gt;addr = (unsigned long) iovecs;
 * sqe-&gt;len = 16;
 * sqe-&gt;off = offset;
 * sqe-&gt;flags = 0;</code></pre>
 * 
 * <h4>Memory ordering</h4>
 * 
 * <p>Modern compilers and CPUs freely reorder reads and writes without affecting the program's outcome to optimize performance. Some aspects of this need to
 * be kept in mind on SMP systems since {@code io_uring} involves buffers shared between kernel and user space. These buffers are both visible and
 * modifiable from kernel and user space. As heads and tails belonging to these shared buffers are updated by kernel and user space, changes need to be
 * coherently visible on either side, irrespective of whether a CPU switch took place after the kernel-user mode switch happened. We use memory barriers
 * to enforce this coherency. Being significantly large subjects on their own, memory barriers are out of scope for further discussion on this man page.</p>
 * 
 * <h4>Letting the kernel know about I/O submissions</h4>
 * 
 * <p>Once you place one or more SQEs on to the SQ, you need to let the kernel know that you've done so. You can do this by calling the {@link #io_uring_enter enter} system call.
 * This system call is also capable of waiting for a specified count of events to complete. This way, you can be sure to find completion events in the
 * completion queue without having to poll it for events later.</p>
 * 
 * <h3>Reading completion events</h3>
 * 
 * <p>Similar to the submission queue (SQ), the completion queue (CQ) is a shared buffer between the kernel and user space. Whereas you placed submission
 * queue entries on the tail of the SQ and the kernel read off the head, when it comes to the CQ, the kernel places completion queue events or CQEs on the
 * tail of the CQ and you read off its head.</p>
 * 
 * <p>Submission is flexible (and thus a bit more complicated) since it needs to be able to encode different types of system calls that take various
 * parameters. Completion, on the other hand is simpler since we're looking only for a return value back from the kernel. This is easily understood by
 * looking at the completion queue event structure, {@link IOURingCQE}.</p>
 * 
 * <p>Here, {@code user_data} is custom data that is passed unchanged from submission to completion. That is, from SQEs to CQEs. This field can be used to
 * set context, uniquely identifying submissions that got completed. Given that I/O requests can complete in any order, this field can be used to
 * correlate a submission with a completion. {@code res} is the result from the system call that was performed as part of the submission; its return
 * value. The {@code flags} field could carry request-specific metadata in the future, but is currently unused.</p>
 * 
 * <p>The general sequence to read completion events off the completion queue is as follows:</p>
 * 
 * <pre><code>
 * unsigned head;
 * head = *cqring-&gt;head;
 * if (head != atomic_load_acquire(cqring-&gt;tail)) {
 *     struct io_uring_cqe *cqe;
 * 
 *     unsigned index;
 * 
 *     index = head &amp; (cqring-&gt;mask);
 * 
 *     cqe = &amp;cqring-&gt;cqes[index];
 * 
 *     // process completed CQE
 * 
 *     process_cqe(cqe);
 * 
 *     // CQE consumption complete
 * 
 *     head++;
 * }
 * atomic_store_release(cqring-&gt;head, head);</code></pre>
 * 
 * <p>It helps to be reminded that the kernel adds CQEs to the tail of the CQ, while you need to dequeue them off the head. To get the index of an entry at
 * the head, the application must mask the current head index with the size mask of the ring. Once the CQE has been consumed or processed, the head needs
 * to be updated to reflect the consumption of the CQE. Attention should be paid to the read and write barriers to ensure successful read and update of
 * the head.</p>
 * 
 * <h3>io_uring performance</h3>
 * 
 * <p>Because of the shared ring buffers between kernel and user space, {@code io_uring} can be a zero-copy system. Copying buffers to and from becomes
 * necessary when system calls that transfer data between kernel and user space are involved. But since the bulk of the communication in {@code io_uring}
 * is via buffers shared between the kernel and user space, this huge performance overhead is completely avoided.</p>
 * 
 * <p>While system calls may not seem like a significant overhead, in high performance applications, making a lot of them will begin to matter. While
 * workarounds the operating system has in place to deal with Spectre and Meltdown are ideally best done away with, unfortunately, some of these
 * workarounds are around the system call interface, making system calls not as cheap as before on affected hardware. While newer hardware should not need
 * these workarounds, hardware with these vulnerabilities can be expected to be in the wild for a long time. While using synchronous programming
 * interfaces or even when using asynchronous programming interfaces under Linux, there is at least one system call involved in the submission of each
 * request. In {@code io_uring}, on the other hand, you can batch several requests in one go, simply by queueing up multiple SQEs, each describing an I/O
 * operation you want and make a single call to {@link #io_uring_enter enter}. This is possible due to {@code io_uring}'s shared buffers based design.</p>
 * 
 * <p>While this batching in itself can avoid the overhead associated with potentially multiple and frequent system calls, you can reduce even this overhead
 * further with Submission Queue Polling, by having the kernel poll and pick up your SQEs for processing as you add them to the submission queue. This
 * avoids the {@code io_uring_enter(2)} call you need to make to tell the kernel to pick SQEs up. For high-performance applications, this means even
 * lesser system call overheads.</p>
 */
public class LibIOURing {

    static { Library.initialize(); }

    /**
     * If {@code sqe->file_index} is set to this for opcodes that instantiate a new direct descriptor (like {@code openat/openat2/accept}), then io_uring will
     * allocate an available direct descriptor instead of having the application pass one in.
     * 
     * <p>The picked direct descriptor will be returned in {@code cqe->res}, or {@code -ENFILE} if the space is full.</p>
     */
    public static final int IORING_FILE_INDEX_ALLOC = ~0;

    public static final int IORING_MAX_ENTRIES = 4096;

    /**
     * {@code io_uring_sqe->flags} bits
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IOSQE_FIXED_FILE_BIT IOSQE_FIXED_FILE_BIT}</li>
     * <li>{@link #IOSQE_IO_DRAIN_BIT IOSQE_IO_DRAIN_BIT}</li>
     * <li>{@link #IOSQE_IO_LINK_BIT IOSQE_IO_LINK_BIT}</li>
     * <li>{@link #IOSQE_IO_HARDLINK_BIT IOSQE_IO_HARDLINK_BIT}</li>
     * <li>{@link #IOSQE_ASYNC_BIT IOSQE_ASYNC_BIT}</li>
     * <li>{@link #IOSQE_BUFFER_SELECT_BIT IOSQE_BUFFER_SELECT_BIT}</li>
     * <li>{@link #IOSQE_CQE_SKIP_SUCCESS_BIT IOSQE_CQE_SKIP_SUCCESS_BIT}</li>
     * </ul>
     */
    public static final int
        IOSQE_FIXED_FILE_BIT       = 0,
        IOSQE_IO_DRAIN_BIT         = 1,
        IOSQE_IO_LINK_BIT          = 2,
        IOSQE_IO_HARDLINK_BIT      = 3,
        IOSQE_ASYNC_BIT            = 4,
        IOSQE_BUFFER_SELECT_BIT    = 5,
        IOSQE_CQE_SKIP_SUCCESS_BIT = 6;

    /**
     * {@code io_uring_sqe->flags} bitfield values
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IOSQE_FIXED_FILE IOSQE_FIXED_FILE} - 
     * When this flag is specified, {@code fd} is an index into the files array registered with the {@code io_uring} instance (see the {@link #IORING_REGISTER_FILES REGISTER_FILES}
     * section of the {@link #io_uring_register register} man page).
     * 
     * <p>Note that this isn't always available for all commands. If used on a command that doesn't support fixed files, the SQE will error with
     * {@code -EBADF}.</p>
     * 
     * <p>Available since 5.1.</p>
     * </li>
     * <li>{@link #IOSQE_IO_DRAIN IOSQE_IO_DRAIN} - 
     * When this flag is specified, the SQE will not be started before previously submitted SQEs have completed, and new SQEs will not be started before
     * this one completes.
     * 
     * <p>Available since 5.2.</p>
     * </li>
     * <li>{@link #IOSQE_IO_LINK IOSQE_IO_LINK} - 
     * When this flag is specified, it forms a link with the next SQE in the submission ring.
     * 
     * <p>That next SQE will not be started before the previous request completes. This, in effect, forms a chain of SQEs, which can be arbitrarily long. The
     * tail of the chain is denoted by the first SQE that does not have this flag set. Chains are not supported across submission boundaries. Even if the
     * last SQE in a submission has this flag set, it will still terminate the current chain. This flag has no effect on previous SQE submissions, nor
     * does it impact SQEs that are outside of the chain tail. This means that multiple chains can be executing in parallel, or chains and individual
     * SQEs. Only members inside the chain are serialized. A chain of SQEs will be broken, if any request in that chain ends in error. {@code io_uring}
     * considers any unexpected result an error. This means that, eg, a short read will also terminate the remainder of the chain. If a chain of SQE links
     * is broken, the remaining unstarted part of the chain will be terminated and completed with {@code -ECANCELED} as the error code.</p>
     * 
     * <p>Available since 5.3.</p>
     * </li>
     * <li>{@link #IOSQE_IO_HARDLINK IOSQE_IO_HARDLINK} - 
     * Like {@link #IOSQE_IO_LINK}, but it doesn't sever regardless of the completion result.
     * 
     * <p>Note that the link will still sever if we fail submitting the parent request, hard links are only resilient in the presence of completion results
     * for requests that did submit correctly. {@code IOSQE_IO_HARDLINK} implies {@code IOSQE_IO_LINK}.</p>
     * 
     * <p>Available since 5.5.</p>
     * </li>
     * <li>{@link #IOSQE_ASYNC IOSQE_ASYNC} - 
     * Normal operation for {@code io_uring} is to try and issue an sqe as non-blocking first, and if that fails, execute it in an async manner.
     * 
     * <p>To support more efficient overlapped operation of requests that the application knows/assumes will always (or most of the time) block, the
     * application can ask for an sqe to be issued async from the start.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IOSQE_BUFFER_SELECT IOSQE_BUFFER_SELECT} - 
     * Used in conjunction with the {@link #IORING_OP_PROVIDE_BUFFERS OP_PROVIDE_BUFFERS} command, which registers a pool of buffers to be used by commands that read or receive data.
     * 
     * <p>When buffers are registered for this use case, and this flag is set in the command, {@code io_uring} will grab a buffer from this pool when the
     * request is ready to receive or read data. If successful, the resulting CQE will have {@link #IORING_CQE_F_BUFFER CQE_F_BUFFER} set in the flags part of the struct, and the
     * upper {@link #IORING_CQE_BUFFER_SHIFT CQE_BUFFER_SHIFT} bits will contain the ID of the selected buffers. This allows the application to know exactly which buffer was selected for
     * the operation. If no buffers are available and this flag is set, then the request will fail with {@code -ENOBUFS} as the error code. Once a buffer
     * has been used, it is no longer available in the kernel pool. The application must re-register the given buffer again when it is ready to recycle it
     * (eg has completed using it).</p>
     * 
     * <p>Available since 5.7.</p>
     * </li>
     * <li>{@link #IOSQE_CQE_SKIP_SUCCESS IOSQE_CQE_SKIP_SUCCESS} - 
     * Don't generate a CQE if the request completes successfully.
     * 
     * <p>If the request fails, an appropriate CQE will be posted as usual and if there is no {@link #IOSQE_IO_HARDLINK}, CQEs for all linked requests will be
     * omitted. The notion of failure/success is {@code opcode} specific and is the same as with breaking chains of {@link #IOSQE_IO_LINK}. One special case is
     * when the request has a linked timeout, then the CQE generation for the linked timeout is decided solely by whether it has
     * {@code IOSQE_CQE_SKIP_SUCCESS} set, regardless whether it timed out or was cancelled. In other words, if a linked timeout has the flag set, it's
     * guaranteed to not post a CQE.</p>
     * 
     * <p>The semantics are chosen to accommodate several use cases. First, when all but the last request of a normal link without linked timeouts are marked
     * with the flag, only one CQE per link is posted. Additionally, it enables supression of CQEs in cases where the side effects of a successfully
     * executed operation is enough for userspace to know the state of the system. One such example would be writing to a synchronisation file.</p>
     * 
     * <p>This flag is incompatible with {@link #IOSQE_IO_DRAIN}. Using both of them in a single ring is undefined behavior, even when they are not used together in
     * a single request. Currently, after the first request with {@code IOSQE_CQE_SKIP_SUCCESS}, all subsequent requests marked with drain will be failed
     * at submission time. Note that the error reporting is best effort only, and restrictions may change in the future.</p>
     * 
     * <p>Available since 5.17.</p>
     * </li>
     * </ul>
     */
    public static final int
        IOSQE_FIXED_FILE       = 1 << IOSQE_FIXED_FILE_BIT,
        IOSQE_IO_DRAIN         = 1 << IOSQE_IO_DRAIN_BIT,
        IOSQE_IO_LINK          = 1 << IOSQE_IO_LINK_BIT,
        IOSQE_IO_HARDLINK      = 1 << IOSQE_IO_HARDLINK_BIT,
        IOSQE_ASYNC            = 1 << IOSQE_ASYNC_BIT,
        IOSQE_BUFFER_SELECT    = 1 << IOSQE_BUFFER_SELECT_BIT,
        IOSQE_CQE_SKIP_SUCCESS = 1 << IOSQE_CQE_SKIP_SUCCESS_BIT;

    /**
     * {@code io_uring_setup()} flags
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_SETUP_IOPOLL SETUP_IOPOLL} - 
     * Perform busy-waiting for an I/O completion, as opposed to getting notifications via an asynchronous IRQ (Interrupt Request).
     * 
     * <p>The file system (if any) and block device must support polling in order for this to work. Busy-waiting provides lower latency, but may consume more
     * CPU resources than interrupt driven I/O. Currently, this feature is usable only on a file descriptor opened using the {@code O_DIRECT} flag. When a
     * read or write is submitted to a polled context, the application must poll for completions on the CQ ring by calling {@link #io_uring_enter enter}. It is illegal to mix
     * and match polled and non-polled I/O on an io_uring instance.</p>
     * </li>
     * <li>{@link #IORING_SETUP_SQPOLL SETUP_SQPOLL} - 
     * When this flag is specified, a kernel thread is created to perform submission queue polling.
     * 
     * <p>An {@code io_uring} instance configured in this way enables an application to issue I/O without ever context switching into the kernel. By using
     * the submission queue to fill in new submission queue entries and watching for completions on the completion queue, the application can submit and
     * reap I/Os without doing a single system call.</p>
     * 
     * <p>If the kernel thread is idle for more than {@code sq_thread_idle} milliseconds, it will set the {@link #IORING_SQ_NEED_WAKEUP SQ_NEED_WAKEUP} bit in the flags field of the
     * struct {@code io_sq_ring}. When this happens, the application must call {@link #io_uring_enter enter} to wake the kernel thread. If I/O is kept busy, the kernel thread
     * will never sleep. An application making use of this feature will need to guard the {@code io_uring_enter()} call with the following code sequence:</p>
     * 
     * <pre><code>
     * // Ensure that the wakeup flag is read after the tail pointer
     * // has been written. It's important to use memory load acquire
     * // semantics for the flags read, as otherwise the application
     * // and the kernel might not agree on the consistency of the
     * // wakeup flag.
     * unsigned flags = atomic_load_relaxed(sq_ring-&gt;flags);
     * if (flags &amp; IORING_SQ_NEED_WAKEUP)
     *     io_uring_enter(fd, 0, 0, IORING_ENTER_SQ_WAKEUP);</code></pre>
     * 
     * <p>where {@code sq_ring} is a submission queue ring setup using the struct {@code io_sqring_offsets} described below.</p>
     * 
     * <p>Before version 5.11 of the Linux kernel, to successfully use this feature, the application must register a set of files to be used for IO through
     * {@link #io_uring_register register} using the {@link #IORING_REGISTER_FILES REGISTER_FILES} opcode. Failure to do so will result in submitted IO being errored with {@code EBADF}. The presence of this
     * feature can be detected by the {@link #IORING_FEAT_SQPOLL_NONFIXED FEAT_SQPOLL_NONFIXED} feature flag. In version 5.11 and later, it is no longer necessary to register files to use
     * this feature. 5.11 also allows using this as non-root, if the user has the {@code CAP_SYS_NICE} capability.</p>
     * </li>
     * <li>{@link #IORING_SETUP_SQ_AFF SETUP_SQ_AFF} - 
     * If this flag is specified, then the poll thread will be bound to the cpu set in the {@code sq_thread_cpu} field of the struct
     * {@code io_uring_params}. This flag is only meaningful when {@link #IORING_SETUP_SQPOLL SETUP_SQPOLL} is specified. When {@code cgroup} setting {@code cpuset.cpus} changes
     * (typically in container environment), the bounded cpu set may be changed as well.
     * </li>
     * <li>{@link #IORING_SETUP_CQSIZE SETUP_CQSIZE} - 
     * Create the completion queue with struct {@code io_uring_params.cq_entries} entries.
     * 
     * <p>The value must be greater than entries, and may be rounded up to the next power-of-two.</p>
     * </li>
     * <li>{@link #IORING_SETUP_CLAMP SETUP_CLAMP} - 
     * If this flag is specified, and if entries exceeds {@link #IORING_MAX_ENTRIES MAX_ENTRIES}, then entries will be clamped at {@code IORING_MAX_ENTRIES}.
     * 
     * <p>If the flag {@link #IORING_SETUP_SQPOLL SETUP_SQPOLL} is set, and if the value of struct {@code io_uring_params.cq_entries} exceeds {@code IORING_MAX_CQ_ENTRIES}, then it will
     * be clamped at {@code IORING_MAX_CQ_ENTRIES}.</p>
     * </li>
     * <li>{@link #IORING_SETUP_ATTACH_WQ SETUP_ATTACH_WQ} - 
     * This flag should be set in conjunction with struct {@code io_uring_params.wq_fd} being set to an existing {@code io_uring} ring file descriptor.
     * 
     * <p>When set, the {@code io_uring} instance being created will share the asynchronous worker thread backend of the specified {@code io_uring} ring,
     * rather than create a new separate thread pool.</p>
     * </li>
     * <li>{@link #IORING_SETUP_R_DISABLED SETUP_R_DISABLED} - 
     * If this flag is specified, the io_uring ring starts in a disabled state.
     * 
     * <p>In this state, restrictions can be registered, but submissions are not allowed. See {@link #io_uring_register register} for details on how to enable the ring.</p>
     * 
     * <p>Available since 5.10.</p>
     * </li>
     * <li>{@link #IORING_SETUP_SUBMIT_ALL SETUP_SUBMIT_ALL} - 
     * Continue submit on error.
     * 
     * <p>Normally io_uring stops submitting a batch of request, if one of these requests results in an error. This can cause submission of less than what is
     * expected, if a request ends in error while being submitted. If the ring is created with this flag, {@link #io_uring_enter enter} will continue submitting requests even
     * if it encounters an error submitting a request. CQEs are still posted for errored request regardless of whether or not this flag is set at ring
     * creation time, the only difference is if the submit sequence is halted or continued when an error is observed.</p>
     * 
     * <p>Available since 5.18.</p>
     * </li>
     * <li>{@link #IORING_SETUP_COOP_TASKRUN SETUP_COOP_TASKRUN} - 
     * Cooperative task running.
     * 
     * <p>By default, io_uring will interrupt a task running in userspace when a completion event comes in. This is to ensure that completions run in a
     * timely manner. For a lot of use cases, this is overkill and can cause reduced performance from both the inter-processor interrupt used to do this,
     * the kernel/user transition, the needless interruption of the tasks userspace activities, and reduced batching if completions come in at a rapid
     * rate. Most applications don't need the forceful interruption, as the events are processed at any kernel/user transition. The exception are setups
     * where the application uses multiple threads operating on the same ring, where the application waiting on completions isn't the one that submitted
     * them. For most other use cases, setting this flag will improve performance.</p>
     * 
     * <p>Available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_SETUP_TASKRUN_FLAG SETUP_TASKRUN_FLAG} - 
     * Used in conjunction with {@link #IORING_SETUP_COOP_TASKRUN SETUP_COOP_TASKRUN}, this provides a flag, {@link #IORING_SQ_TASKRUN SQ_TASKRUN}, which is set in the SQ ring {@code flags} whenever completions are
     * pending that should be processed. liburing will check for this flag even when doing {@link LibURing#io_uring_peek_cqe peek_cqe} and enter the kernel to process them, and
     * applications can do the same. This makes {@code IORING_SETUP_TASKRUN_FLAG} safe to use even when applications rely on a peek style operation on the
     * CQ ring to see if anything might be pending to reap.
     * 
     * <p>Available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_SETUP_SQE128 SETUP_SQE128} - 
     * If set, io_uring will use 128-byte SQEs rather than the normal 64-byte sized variant.
     * 
     * <p>This is a requirement for using certain request types, as of 5.19 only the {@link #IORING_OP_URING_CMD OP_URING_CMD} passthrough command for NVMe passthrough needs this.</p>
     * 
     * <p>Available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_SETUP_CQE32 SETUP_CQE32} - 
     * If set, io_uring will use 32-byte CQEs rather than the normal 32-byte sized variant.
     * 
     * <p>This is a requirement for using certain request types, as of 5.19 only the {@link #IORING_OP_URING_CMD OP_URING_CMD} passthrough command for NVMe passthrough needs this.</p>
     * 
     * <p>Available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_SETUP_SINGLE_ISSUER SETUP_SINGLE_ISSUER} - 
     * A hint to the kernel that only a single task can submit requests, which is used for internal optimisations.
     * 
     * <p>The kernel enforces the rule, which only affects {@link #io_uring_enter enter} calls submitting requests and will fail them with {@code -EEXIST} if the restriction is
     * violated. The submitter task may differ from the task that created the ring. Note that when {@link #IORING_SETUP_SQPOLL SETUP_SQPOLL} is set it is considered that the polling
     * task is doing all submissions on behalf of the userspace and so it always complies with the rule disregarding how many userspace tasks do
     * {@code io_uring_enter}.</p>
     * 
     * <p>Available since 5.20.</p>
     * </li>
     * <li>{@link #IORING_SETUP_DEFER_TASKRUN SETUP_DEFER_TASKRUN} - 
     * Defer running task work to get events.
     * 
     * <p>By default, io_uring will process all outstanding work at the end of any system call or thread interrupt. This can delay the application from
     * making other progress. Setting this flag will hint to io_uring that it should defer work until an {@link #io_uring_enter enter} call with the {@link #IORING_ENTER_GETEVENTS ENTER_GETEVENTS} flag set.
     * This allows the application to request work to run just before it wants to process completions. This flag requires the {@link #IORING_SETUP_SINGLE_ISSUER SETUP_SINGLE_ISSUER} flag to
     * be set, and also enforces that the call to {@code io_uring_enter} is called from the same thread that submitted requests. Note that if this flag is
     * set then it is the application's responsibility to periodically trigger work (for example via any of the CQE waiting functions) or else completions
     * may not be delivered.</p>
     * 
     * <p>Available since 6.1.</p>
     * </li>
     * </ul>
     */
    public static final int
        IORING_SETUP_IOPOLL        = 1 << 0,
        IORING_SETUP_SQPOLL        = 1 << 1,
        IORING_SETUP_SQ_AFF        = 1 << 2,
        IORING_SETUP_CQSIZE        = 1 << 3,
        IORING_SETUP_CLAMP         = 1 << 4,
        IORING_SETUP_ATTACH_WQ     = 1 << 5,
        IORING_SETUP_R_DISABLED    = 1 << 6,
        IORING_SETUP_SUBMIT_ALL    = 1 << 7,
        IORING_SETUP_COOP_TASKRUN  = 1 << 8,
        IORING_SETUP_TASKRUN_FLAG  = 1 << 9,
        IORING_SETUP_SQE128        = 1 << 10,
        IORING_SETUP_CQE32         = 1 << 11,
        IORING_SETUP_SINGLE_ISSUER = 1 << 12,
        IORING_SETUP_DEFER_TASKRUN = 1 << 13;

    /**
     * {@code io_uring_op}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_OP_NOP OP_NOP} - Do not perform any I/O. This is useful for testing the performance of the {@code io_uring} implementation itself.</li>
     * <li>{@link #IORING_OP_READV OP_READV} - Vectored read operation, similar to {@code preadv2(2)}. If the file is not seekable, {@code off} must be set to zero.</li>
     * <li>{@link #IORING_OP_WRITEV OP_WRITEV} - Vectored write operation, similar to {@code pwritev2(2)}. If the file is not seekable, {@code off} must be set to zero.</li>
     * <li>{@link #IORING_OP_FSYNC OP_FSYNC} - 
     * File sync. See also {@code fsync(2)}.
     * 
     * <p>Note that, while I/O is initiated in the order in which it appears inthe submission queue, completions are unordered. For example, an application
     * which places a write I/O followed by an fsync in the submission queue cannot expect the fsync to apply to the write. The two operations execute in
     * parallel, so the fsync may complete before the write is issued to the storage. The same is also true for previously issued writes that have not
     * completed prior to the fsync.</p>
     * </li>
     * <li>{@link #IORING_OP_READ_FIXED OP_READ_FIXED} - Read from pre-mapped buffers. See {@link #io_uring_register register} for details on how to setup a context for fixed reads.</li>
     * <li>{@link #IORING_OP_WRITE_FIXED OP_WRITE_FIXED} - Write to pre-mapped buffers. See {@link #io_uring_register register} for details on how to setup a context for fixed writes.</li>
     * <li>{@link #IORING_OP_POLL_ADD OP_POLL_ADD} - 
     * Poll the {@code fd} specified in the submission queue entry for the events specified in the {@code poll_events} field.
     * 
     * <p>Unlike poll or epoll without {@code EPOLLONESHOT}, by default this interface always works in one shot mode. That is, once the poll operation is
     * completed, it will have to be resubmitted.</p>
     * 
     * <p>If {@link #IORING_POLL_ADD_MULTI POLL_ADD_MULTI} is set in the SQE {@code len} field, then the poll will work in multi shot mode instead. That means it'll repatedly trigger when
     * the requested event becomes true, and hence multiple CQEs can be generated from this single SQE. The CQE {@code flags} field will have {@link #IORING_CQE_F_MORE CQE_F_MORE}
     * set on completion if the application should expect further CQE entries from the original request. If this flag isn't set on completion, then the
     * poll request has been terminated and no further events will be generated. This mode is available since 5.13.</p>
     * 
     * <p>If {@link #IORING_POLL_UPDATE_EVENTS POLL_UPDATE_EVENTS} is set in the SQE {@code len} field, then the request will update an existing poll request with the mask of events passed in
     * with this request. The lookup is based on the {@code user_data} field of the original SQE submitted, and this values is passed in the {@code addr}
     * field of the SQE. This mode is available since 5.13.</p>
     * 
     * <p>If {@link #IORING_POLL_UPDATE_USER_DATA POLL_UPDATE_USER_DATA} is set in the SQE {@code len} field, then the request will update the {@code user_data} of an existing poll request based
     * on the value passed in the {@code off} field. This mode is available since 5.13.</p>
     * 
     * <p>This command works like an {@code asyncpoll(2)} and the completion event result is the returned mask of events. For the variants that update
     * {@code user_data} or {@code events}, the completion result will be similar to {@link #IORING_OP_POLL_REMOVE OP_POLL_REMOVE}.</p>
     * </li>
     * <li>{@link #IORING_OP_POLL_REMOVE OP_POLL_REMOVE} - 
     * Remove an existing poll request.
     * 
     * <p>If found, the {@code res} field of the struct {@code io_uring_cqe} will contain 0. If not found, {@code res} will contain {@code -ENOENT}, or
     * {@code -EALREADY} if the poll request was in the process of completing already.</p>
     * </li>
     * <li>{@link #IORING_OP_SYNC_FILE_RANGE OP_SYNC_FILE_RANGE} - 
     * Issue the equivalent of a {@code sync_file_range(2)} on the file descriptor.
     * 
     * <p>The {@code fd} field is the file descriptor to sync, the {@code off} field holds the offset in bytes, the {@code len} field holds the length in
     * bytes, and the {@code sync_range_flags} field holds the flags for the command. See also {@code sync_file_range(2)} for the general description of
     * the related system call.</p>
     * 
     * <p>Available since 5.2.</p>
     * </li>
     * <li>{@link #IORING_OP_SENDMSG OP_SENDMSG} - 
     * Issue the equivalent of a {@code sendmsg(2)} system call.
     * 
     * <p>{@code fd} must be set to the socket file descriptor, {@code addr} must contain a pointer to the {@code msghdr} structure, and {@code msg_flags}
     * holds the flags associated with the system call. See also {@code sendmsg(2)} for the general description of the related system call.</p>
     * 
     * <p>Available since 5.3.</p>
     * </li>
     * <li>{@link #IORING_OP_RECVMSG OP_RECVMSG} - 
     * Works just like {@link #IORING_OP_SENDMSG OP_SENDMSG}, except for {@code recvmsg(2)} instead. See the description of {@code IORING_OP_SENDMSG}.
     * 
     * <p>Available since 5.3.</p>
     * </li>
     * <li>{@link #IORING_OP_TIMEOUT OP_TIMEOUT} - 
     * This command will register a timeout operation.
     * 
     * <p>The {@code addr} field must contain a pointer to a {@code struct timespec64} structure, {@code len} must contain 1 to signify one
     * {@code timespec64} structure, {@code timeout_flags} may contain {@link #IORING_TIMEOUT_ABS TIMEOUT_ABS} for an absolute timeout value, or 0 for a relative timeout.
     * {@code off} may contain a completion event count. A timeout will trigger a wakeup event on the completion ring for anyone waiting for events. A
     * timeout condition is met when either the specified timeout expires, or the specified number of events have completed. Either condition will trigger
     * the event. If set to 0, completed events are not counted, which effectively acts like a timer. {@code io_uring} timeouts use the
     * {@code CLOCK_MONOTONIC} clock source. The request will complete with {@code -ETIME} if the timeout got completed through expiration of the timer,
     * or 0 if the timeout got completed through requests completing on their own. If the timeout was cancelled before it expired, the request will
     * complete with {@code -ECANCELED}.</p>
     * 
     * <p>Available since 5.4.</p>
     * 
     * <p>Since 5.15, this command also supports the following modifiers in {@code timeout_flags}:</p>
     * 
     * <ul>
     * <li>{@link #IORING_TIMEOUT_BOOTTIME TIMEOUT_BOOTTIME}: If set, then the clock source used is {@code CLOCK_BOOTTIME} instead of {@code CLOCK_MONOTONIC}. This clock source differs
     * in that it includes time elapsed if the system was suspend while having a timeout request in-flight.</li>
     * <li>{@link #IORING_TIMEOUT_REALTIME TIMEOUT_REALTIME}: If set, then the clock source used is {@code CLOCK_BOOTTIME} instead of {@code CLOCK_MONOTONIC}.</li>
     * </ul>
     * </li>
     * <li>{@link #IORING_OP_TIMEOUT_REMOVE OP_TIMEOUT_REMOVE} - 
     * If {@code timeout_flags} are zero, then it attempts to remove an existing timeout operation. {@code addr} must contain the {@code user_data} field
     * of the previously issued timeout operation. If the specified timeout request is found and cancelled successfully, this request will terminate with
     * a result value of 0. If the timeout request was found but expiration was already in progress, this request will terminate with a result value of
     * {@code -EBUSY}. If the timeout request wasn't found, the request will terminate with a result value of {@code -ENOENT}.
     * 
     * <p>Available since 5.5.</p>
     * 
     * <p>If {@code timeout_flags} contain {@link #IORING_TIMEOUT_UPDATE TIMEOUT_UPDATE}, instead of removing an existing operation, it updates it. {@code addr} and return values are same
     * as before. {@code addr2} field must contain a pointer to a {@code struct timespec64} structure. {@code timeout_flags} may also contain
     * {@link #IORING_TIMEOUT_ABS TIMEOUT_ABS}, in which case the value given is an absolute one, not a relative one.</p>
     * 
     * <p>Available since 5.11.</p>
     * </li>
     * <li>{@link #IORING_OP_ACCEPT OP_ACCEPT} - 
     * Issue the equivalent of an {@code accept4(2)} system call.
     * 
     * <p>{@code fd} must be set to the socket file descriptor, {@code addr} must contain the pointer to the {@code sockaddr} structure, and {@code addr2}
     * must contain a pointer to the {@code socklen_t} {@code addrlen} field. Flags can be passed using the {@code accept_flags} field. See also
     * {@code accept4(2)} for the general description of the related system call.</p>
     * 
     * <p>Available since 5.5.</p>
     * 
     * <p>If the {@code file_index} field is set to a positive number, the file won't be installed into the normal file table as usual but will be placed
     * into the fixed file table at index {@code file_index - 1}. In this case, instead of returning a file descriptor, the result will contain either 0
     * on success or an error. If the index points to a valid empty slot, the installation is guaranteed to not fail. If there is already a file in the
     * slot, it will be replaced, similar to {@link #IORING_OP_FILES_UPDATE OP_FILES_UPDATE}. Please note that only {@code io_uring} has access to such files and no other syscall can
     * use them. See {@link #IOSQE_FIXED_FILE} and {@link #IORING_REGISTER_FILES REGISTER_FILES}.</p>
     * 
     * <p>Available since 5.5.</p>
     * </li>
     * <li>{@link #IORING_OP_ASYNC_CANCEL OP_ASYNC_CANCEL} - 
     * Attempt to cancel an already issued request.
     * 
     * <p>{@code addr} must contain the {@code user_data} field of the request that should be cancelled. The cancellation request will complete with one of
     * the following results codes. If found, the {@code res} field of the cqe will contain 0. If not found, {@code res} will contain {@code -ENOENT}. If
     * found and attempted cancelled, the {@code res} field will contain {@code -EALREADY}. In this case, the request may or may not terminate. In
     * general, requests that are interruptible (like socket IO) will get cancelled, while disk IO requests cannot be cancelled if already started.</p>
     * 
     * <p>Available since 5.5.</p>
     * </li>
     * <li>{@link #IORING_OP_LINK_TIMEOUT OP_LINK_TIMEOUT} - 
     * This request must be linked with another request through {@link #IOSQE_IO_LINK} which is described below.
     * 
     * <p>Unlike {@link #IORING_OP_TIMEOUT OP_TIMEOUT}, {@code IORING_OP_LINK_TIMEOUT} acts on the linked request, not the completion queue. The format of the command is otherwise
     * like {@code IORING_OP_TIMEOUT}, except there's no completion event count as it's tied to a specific request. If used, the timeout specified in the
     * command will cancel the linked command, unless the linked command completes before the timeout. The timeout will complete with {@code -ETIME} if
     * the timer expired and the linked request was attempted cancelled, or {@code -ECANCELED} if the timer got cancelled because of completion of the
     * linked request. Like {@code IORING_OP_TIMEOUT} the clock source used is {@code CLOCK_MONOTONIC}.</p>
     * 
     * <p>Available since 5.5.</p>
     * </li>
     * <li>{@link #IORING_OP_CONNECT OP_CONNECT} - 
     * Issue the equivalent of a {@code connect(2)} system call.
     * 
     * <p>{@code fd} must be set to the socket file descriptor, {@code addr} must contain the const pointer to the {@code sockaddr} structure, and
     * {@code off} must contain the {@code socklen_t} {@code addrlen} field. See also {@code connect(2)} for the general description of the related system
     * call.</p>
     * 
     * <p>Available since 5.5.</p>
     * </li>
     * <li>{@link #IORING_OP_FALLOCATE OP_FALLOCATE} - 
     * Issue the equivalent of a {@code fallocate(2)} system call.
     * 
     * <p>{@code fd} must be set to the file descriptor, {@code len} must contain the mode associated with the operation, {@code off} must contain the offset
     * on which to operate, and {@code addr} must contain the length. See also {@code fallocate(2)} for the general description of the related system
     * call.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_OPENAT OP_OPENAT} - 
     * Issue the equivalent of a {@code openat(2)} system call.
     * 
     * <p>{@code fd} is the {@code dirfd} argument, {@code addr} must contain a pointer to the {@code *pathname} argument, {@code open_flags} should contain
     * any flags passed in, and {@code len} is access mode of the file. See also {@code openat(2)} for the general description of the related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * 
     * <p>If the {@code file_index} field is set to a positive number, the file won't be installed into the normal file table as usual but will be placed
     * into the fixed file table at index {@code file_index - 1}. In this case, instead of returning a file descriptor, the result will contain either 0
     * on success or an error. If there is already a file registered at this index, the request will fail with {@code -EBADF}. Only {@code io_uring} has
     * access to such files and no other syscall can use them. See {@link #IOSQE_FIXED_FILE} and {@link #IORING_REGISTER_FILES REGISTER_FILES}.</p>
     * 
     * <p>Available since 5.15.</p>
     * </li>
     * <li>{@link #IORING_OP_CLOSE OP_CLOSE} - 
     * Issue the equivalent of a {@code close(2)} system call.
     * 
     * <p>{@code fd} is the file descriptor to be closed. See also {@code close(2)} for the general description of the related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * 
     * <p>If the {@code file_index} field is set to a positive number, this command can be used to close files that were direct opened through {@link #IORING_OP_OPENAT OP_OPENAT},
     * {@link #IORING_OP_OPENAT2 OP_OPENAT2}, or {@link #IORING_OP_ACCEPT OP_ACCEPT} using the {@code io_uring} specific direct descriptors. Note that only one of the descriptor fields may be set. The
     * direct close feature is available since the 5.15 kernel, where direct descriptors were introduced.</p>
     * </li>
     * <li>{@link #IORING_OP_FILES_UPDATE OP_FILES_UPDATE} - 
     * This command is an alternative to using {@link #IORING_REGISTER_FILES_UPDATE REGISTER_FILES_UPDATE} which then works in an async fashion, like the rest of the {@code io_uring}
     * commands.
     * 
     * <p>The arguments passed in are the same. {@code addr} must contain a pointer to the array of file descriptors, {@code len} must contain the length of
     * the array, and {@code off} must contain the offset at which to operate. Note that the array of file descriptors pointed to in {@code addr} must
     * remain valid until this operation has completed.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_STATX OP_STATX} - 
     * Issue the equivalent of a {@code statx(2)} system call.
     * 
     * <p>{@code fd} is the {@code dirfd} argument, {@code addr} must contain a pointer to the {@code *pathname} string, {@code statx_flags} is the
     * {@code flags} argument, {@code len} should be the {@code mask} argument, and {@code off} must contain a pointer to the {@code statxbuf} to be
     * filled in. See also {@code statx(2)} for the general description of the related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_READ OP_READ} - 
     * Issue the equivalent of a {@code pread(2)} or {@code pwrite(2)} system call.
     * 
     * <p>{@code fd} is the file descriptor to be operated on, {@code addr} contains the buffer in question, {@code len} contains the length of the IO
     * operation, and {@code offs} contains the read or write offset. If {@code fd} does not refer to a seekable file, {@code off} must be set to zero.
     * If {@code offs} is set to -1, the offset will use (and advance) the file position, like the {@code read(2)} and {@code write(2)} system calls.
     * These are non-vectored versions of the {@link #IORING_OP_READV OP_READV} and {@link #IORING_OP_WRITEV OP_WRITEV} opcodes. See also {@code read(2)} and {@code write(2)} for the general description
     * of the related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_WRITE OP_WRITE} - See {@link #IORING_OP_READ OP_READ}.</li>
     * <li>{@link #IORING_OP_FADVISE OP_FADVISE} - 
     * Issue the equivalent of a {@code posix_fadvise(2)} system call.
     * 
     * <p>{@code fd} must be set to the file descriptor, {@code off} must contain the offset on which to operate, {@code len} must contain the length, and
     * {@code fadvise_advice} must contain the advice associated with the operation. See also {@code posix_fadvise(2)} for the general description of the
     * related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_MADVISE OP_MADVISE} - 
     * Issue the equivalent of a {@code madvise(2)} system call.
     * 
     * <p>{@code addr} must contain the address to operate on, {@code len} must contain the length on which to operate, and {@code fadvise_advice} must
     * contain the advice associated with the operation. See also {@code madvise(2)} for the general description of the related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_SEND OP_SEND} - 
     * Issue the equivalent of a {@code send(2)} system call.
     * 
     * <p>{@code fd} must be set to the socket file descriptor, {@code addr} must contain a pointer to the buffer, {@code len} denotes the length of the
     * buffer to send, and {@code msg_flags} holds the flags associated with the system call. See also {@code send(2)} for the general description of the
     * related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_RECV OP_RECV} - 
     * Works just like {@link #IORING_OP_SEND OP_SEND}, except for {@code recv(2)} instead. See the description of {@code IORING_OP_SEND}.
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_OPENAT2 OP_OPENAT2} - 
     * Issue the equivalent of a {@code openat2(2)} system call.
     * 
     * <p>{@code fd} is the {@code dirfd} argument, {@code addr} must contain a pointer to the {@code *pathname} argument, {@code len} should contain the
     * size of the {@code open_how} structure, and {@code off} should be set to the address of the {@code open_how} structure. See also {@code openat2(2)}
     * for the general description of the related system call.</p>
     * 
     * <p>Available since 5.6.</p>
     * 
     * <p>If the {@code file_index} field is set to a positive number, the file won't be installed into the normal file table as usual but will be placed
     * into the fixed file table at index {@code file_index - 1}. In this case, instead of returning a file descriptor, the result will contain either 0
     * on success or an error. If there is already a file registered at this index, the request will fail with {@code -EBADF}. Only {@code io_uring} has
     * access to such files and no other syscall can use them. See {@link #IOSQE_FIXED_FILE} and {@link #IORING_REGISTER_FILES REGISTER_FILES}.</p>
     * 
     * <p>Available since 5.15.</p>
     * </li>
     * <li>{@link #IORING_OP_EPOLL_CTL OP_EPOLL_CTL} - 
     * Add, remove or modify entries in the interest list of {@code epoll(7)}. See {@code epoll_ctl(2)} for details of the system call.
     * 
     * <p>{@code fd} holds the file descriptor that represents the epoll instance, {@code addr} holds the file descriptor to add, remove or modify,
     * {@code len} holds the operation ({@code EPOLL_CTL_ADD}, {@code EPOLL_CTL_DEL}, {@code EPOLL_CTL_MOD}) to perform and, {@code off} holds a pointer
     * to the {@code epoll_events} structure.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_OP_SPLICE OP_SPLICE} - 
     * Issue the equivalent of a {@code splice(2)} system call.
     * 
     * <p>{@code splice_fd_in} is the file descriptor to read from, {@code splice_off_in} is an offset to read from, {@code fd} is the file descriptor to
     * write to, {@code off} is an offset from which to start writing to. A sentinel value of -1 is used to pass the equivalent of a {@code NULL} for the offsets
     * to {@code splice(2)}. {@code len} contains the number of bytes to copy. {@code splice_flags} contains a bit mask for the flag field associated with
     * the system call. Please note that one of the file descriptors must refer to a pipe. See also {@code splice(2)} for the general description of the
     * related system call.</p>
     * 
     * <p>Available since 5.7.</p>
     * </li>
     * <li>{@link #IORING_OP_PROVIDE_BUFFERS OP_PROVIDE_BUFFERS} - 
     * This command allows an application to register a group of buffers to be used by commands that read/receive data.
     * 
     * <p>Using buffers in this manner can eliminate the need to separate the poll + read, which provides a convenient point in time to allocate a buffer for
     * a given request. It's often infeasible to have as many buffers available as pending reads or receive. With this feature, the application can have
     * its pool of buffers ready in the kernel, and when the file or socket is ready to read/receive data, a buffer can be selected for the operation.</p>
     * 
     * <p>{@code fd} must contain the number of buffers to provide, {@code addr} must contain the starting address to add buffers from, {@code len} must
     * contain the length of each buffer to add from the range, {@code buf_group} must contain the group ID of this range of buffers, and {@code off} must
     * contain the starting buffer ID of this range of buffers. With that set, the kernel adds buffers starting with the memory address in {@code addr},
     * each with a length of {@code len}. Hence the application should provide {@code len * fd} worth of memory in {@code addr}. Buffers are grouped by
     * the group ID, and each buffer within this group will be identical in size according to the above arguments. This allows the application to provide
     * different groups of buffers, and this is often used to have differently sized buffers available depending on what the expectations are of the
     * individual request. When submitting a request that should use a provided buffer, the {@link #IOSQE_BUFFER_SELECT} flag must be set, and {@code buf_group}
     * must be set to the desired buffer group ID where the buffer should be selected from.</p>
     * 
     * <p>Available since 5.7.</p>
     * </li>
     * <li>{@link #IORING_OP_REMOVE_BUFFERS OP_REMOVE_BUFFERS} - 
     * Remove buffers previously registered with {@link #IORING_OP_PROVIDE_BUFFERS OP_PROVIDE_BUFFERS}.
     * 
     * <p>{@code fd} must contain the number of buffers to remove, and {@code buf_group} must contain the buffer group ID from which to remove the buffers.</p>
     * 
     * <p>Available since 5.7.</p>
     * </li>
     * <li>{@link #IORING_OP_TEE OP_TEE} - 
     * Issue the equivalent of a {@code tee(2)} system call.
     * 
     * <p>{@code splice_fd_in} is the file descriptor to read from, {@code fd} is the file descriptor to write to, {@code len} contains the number of bytes
     * to copy, and {@code splice_flags} contains a bit mask for the flag field associated with the system call. Please note that both of the file
     * descriptors must refer to a pipe. See also {@code tee(2)} for the general description of the related system call.</p>
     * 
     * <p>Available since 5.8.</p>
     * </li>
     * <li>{@link #IORING_OP_SHUTDOWN OP_SHUTDOWN} - 
     * Issue the equivalent of a {@code shutdown(2)} system call.
     * 
     * <p>{@code fd} is the file descriptor to the socket being shutdown and {@code len} must be set to the {@code how} argument. No other fields should be
     * set.</p>
     * 
     * <p>Available since 5.11.</p>
     * </li>
     * <li>{@link #IORING_OP_RENAMEAT OP_RENAMEAT} - 
     * Issue the equivalent of a {@code renameat2(2)} system call.
     * 
     * <p>{@code fd} should be set to the {@code olddirfd}, {@code addr} should be set to the {@code oldpath}, {@code len} should be set to the
     * {@code newdirfd}, {@code addr} should be set to the {@code oldpath}, {@code addr2} should be set to the {@code newpath}, and finally
     * {@code rename_flags} should be set to the {@code flags} passed in to {@code renameat2(2)}.</p>
     * 
     * <p>Available since 5.11.</p>
     * </li>
     * <li>{@link #IORING_OP_UNLINKAT OP_UNLINKAT} - 
     * Issue the equivalent of a {@code unlinkat2(2)} system call.
     * 
     * <p>{@code fd} should be set to the {@code dirfd}, {@code addr} should be set to the {@code pathname}, and {@code unlink_flags} should be set to the
     * {@code flags} being passed in to {@code unlinkat(2)}.</p>
     * 
     * <p>Available since 5.11.</p>
     * </li>
     * <li>{@link #IORING_OP_MKDIRAT OP_MKDIRAT} - 
     * Issue the equivalent of a {@code mkdirat2(2)} system call.
     * 
     * <p>{@code fd} should be set to the {@code dirfd}, {@code addr} should be set to the {@code pathname}, and {@code len} should be set to the
     * {@code mode} being passed in to {@code mkdirat(2)}.</p>
     * 
     * <p>Available since 5.15.</p>
     * </li>
     * <li>{@link #IORING_OP_SYMLINKAT OP_SYMLINKAT} - 
     * Issue the equivalent of a {@code symlinkat2(2)} system call.
     * 
     * <p>{@code fd} should be set to the {@code newdirfd}, {@code addr} should be set to the {@code target} and {@code addr2} should be set to the
     * {@code linkpath} being passed in to {@code symlinkat(2)}.</p>
     * 
     * <p>Available since 5.15.</p>
     * </li>
     * <li>{@link #IORING_OP_LINKAT OP_LINKAT} - 
     * Issue the equivalent of a {@code linkat2(2)} system call.
     * 
     * <p>{@code fd} should be set to the {@code olddirfd}, {@code addr} should be set to the {@code oldpath}, {@code len} should be set to the
     * {@code newdirfd}, {@code addr2} should be set to the {@code newpath}, and {@code hardlink_flags} should be set to the {@code flags} being passed in
     * {@code tolinkat(2)}.</p>
     * 
     * <p>Available since 5.15.</p>
     * </li>
     * <li>{@link #IORING_OP_MSG_RING OP_MSG_RING} - 
     * Send a message to an io_uring.
     * 
     * <p>{@code fd} must be set to a file descriptor of a ring that the application has access to, {@code len} can be set to any 32-bit value that the
     * application wishes to pass on, and {@code off} should be set any 64-bit value that the application wishes to send. On the target ring, a CQE will
     * be posted with the {@code res} field matching the {@code len} set, and a {@code user_data} field matching the {@code off} value being passed in.
     * This request type can be used to either just wake or interrupt anyone waiting for completions on the target ring, or it can be used to pass
     * messages via the two fields.</p>
     * 
     * <p>Available since 5.18.</p>
     * </li>
     * <li>{@link #IORING_OP_FSETXATTR OP_FSETXATTR}</li>
     * <li>{@link #IORING_OP_SETXATTR OP_SETXATTR}</li>
     * <li>{@link #IORING_OP_FGETXATTR OP_FGETXATTR}</li>
     * <li>{@link #IORING_OP_GETXATTR OP_GETXATTR}</li>
     * <li>{@link #IORING_OP_SOCKET OP_SOCKET}</li>
     * <li>{@link #IORING_OP_URING_CMD OP_URING_CMD}</li>
     * <li>{@link #IORING_OP_SEND_ZC OP_SEND_ZC} - 
     * Issue the zerocopy equivalent of a {@code send(2)} system call.
     * 
     * <p>Similar to {@link #IORING_OP_SEND OP_SEND}, but tries to avoid making intermediate copies of data. Zerocopy execution is not guaranteed and it may fall back to copying.</p>
     * 
     * <p>The {@code flags} field of the first {@code "struct io_uring_cqe"} may likely contain {@link #IORING_CQE_F_MORE CQE_F_MORE}, which means that there will be a second
     * completion event / notification for the request, with the {@code user_data} field set to the same value. The user must not modify the data buffer
     * until the notification is posted. The first cqe follows the usual rules and so its {@code res} field will contain the number of bytes sent or a
     * negative error code. The notification's {@code res} field will be set to zero and the {@code flags} field will contain {@link #IORING_CQE_F_NOTIF CQE_F_NOTIF}. The two step
     * model is needed because the kernel may hold on to buffers for a long time, e.g. waiting for a TCP ACK, and having a separate cqe for request
     * completions allows userspace to push more data without extra delays. Note, notifications are only responsible for controlling the lifetime of the
     * buffers, and as such don't mean anything about whether the data has atually been sent out or received by the other end.</p>
     * 
     * <p>{@code fd} must be set to the socket file descriptor, {@code addr} must contain a pointer to the buffer, {@code len} denotes the length of the
     * buffer to send, and {@code msg_flags} holds the flags associated with the system call. When {@code addr2} is non-zero it points to the address of
     * the target with {@code addr_len} specifying its size, turning the request into a {@code sendto(2)} system call equivalent.</p>
     * 
     * <p>Available since 6.0.</p>
     * </li>
     * <li>{@link #IORING_OP_SENDMSG_ZC OP_SENDMSG_ZC}</li>
     * <li>{@link #IORING_OP_LAST OP_LAST}</li>
     * </ul>
     */
    public static final byte
        IORING_OP_NOP             = 0,
        IORING_OP_READV           = 1,
        IORING_OP_WRITEV          = 2,
        IORING_OP_FSYNC           = 3,
        IORING_OP_READ_FIXED      = 4,
        IORING_OP_WRITE_FIXED     = 5,
        IORING_OP_POLL_ADD        = 6,
        IORING_OP_POLL_REMOVE     = 7,
        IORING_OP_SYNC_FILE_RANGE = 8,
        IORING_OP_SENDMSG         = 9,
        IORING_OP_RECVMSG         = 10,
        IORING_OP_TIMEOUT         = 11,
        IORING_OP_TIMEOUT_REMOVE  = 12,
        IORING_OP_ACCEPT          = 13,
        IORING_OP_ASYNC_CANCEL    = 14,
        IORING_OP_LINK_TIMEOUT    = 15,
        IORING_OP_CONNECT         = 16,
        IORING_OP_FALLOCATE       = 17,
        IORING_OP_OPENAT          = 18,
        IORING_OP_CLOSE           = 19,
        IORING_OP_FILES_UPDATE    = 20,
        IORING_OP_STATX           = 21,
        IORING_OP_READ            = 22,
        IORING_OP_WRITE           = 23,
        IORING_OP_FADVISE         = 24,
        IORING_OP_MADVISE         = 25,
        IORING_OP_SEND            = 26,
        IORING_OP_RECV            = 27,
        IORING_OP_OPENAT2         = 28,
        IORING_OP_EPOLL_CTL       = 29,
        IORING_OP_SPLICE          = 30,
        IORING_OP_PROVIDE_BUFFERS = 31,
        IORING_OP_REMOVE_BUFFERS  = 32,
        IORING_OP_TEE             = 33,
        IORING_OP_SHUTDOWN        = 34,
        IORING_OP_RENAMEAT        = 35,
        IORING_OP_UNLINKAT        = 36,
        IORING_OP_MKDIRAT         = 37,
        IORING_OP_SYMLINKAT       = 38,
        IORING_OP_LINKAT          = 39,
        IORING_OP_MSG_RING        = 40,
        IORING_OP_FSETXATTR       = 41,
        IORING_OP_SETXATTR        = 42,
        IORING_OP_FGETXATTR       = 43,
        IORING_OP_GETXATTR        = 44,
        IORING_OP_SOCKET          = 45,
        IORING_OP_URING_CMD       = 46,
        IORING_OP_SEND_ZC         = 47,
        IORING_OP_SENDMSG_ZC      = 48,
        IORING_OP_LAST            = 49;

    public static final int IORING_URING_CMD_FIXED = 1 << 0;

    /** {@code sqe->fsync_flags} */
    public static final int IORING_FSYNC_DATASYNC = 1 << 0;

    /**
     * {@code sqe->timeout_flags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_TIMEOUT_ABS TIMEOUT_ABS}</li>
     * <li>{@link #IORING_TIMEOUT_UPDATE TIMEOUT_UPDATE}</li>
     * <li>{@link #IORING_TIMEOUT_BOOTTIME TIMEOUT_BOOTTIME}</li>
     * <li>{@link #IORING_TIMEOUT_REALTIME TIMEOUT_REALTIME}</li>
     * <li>{@link #IORING_LINK_TIMEOUT_UPDATE LINK_TIMEOUT_UPDATE}</li>
     * <li>{@link #IORING_TIMEOUT_ETIME_SUCCESS TIMEOUT_ETIME_SUCCESS}</li>
     * <li>{@link #IORING_TIMEOUT_MULTISHOT TIMEOUT_MULTISHOT}</li>
     * <li>{@link #IORING_TIMEOUT_CLOCK_MASK TIMEOUT_CLOCK_MASK}</li>
     * <li>{@link #IORING_TIMEOUT_UPDATE_MASK TIMEOUT_UPDATE_MASK}</li>
     * </ul>
     */
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

    /** {@code sqe->splice_flags}, extends {@code splice(2)} flags */
    public static final int IORING_SPLICE_F_FD_IN_FIXED = 1 << 31;

    /**
     * {@code POLL_ADD} flags. Note that since {@code sqe->poll_events} is the flag space, the command flags for {@code POLL_ADD} are stored in
     * {@code sqe->len}.
     * 
     * <p>{@code IORING_POLL_UPDATE}: Update existing poll request, matching {@code sqe->addr} as the old {@code user_data} field.</p>
     * 
     * <p>{@code IORING_POLL_LEVEL}: Level triggered poll.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_POLL_ADD_MULTI POLL_ADD_MULTI} - Multishot poll. Sets {@code IORING_CQE_F_MORE} if the poll handler will continue to report CQEs on behalf of the same SQE.</li>
     * <li>{@link #IORING_POLL_UPDATE_EVENTS POLL_UPDATE_EVENTS}</li>
     * <li>{@link #IORING_POLL_UPDATE_USER_DATA POLL_UPDATE_USER_DATA}</li>
     * <li>{@link #IORING_POLL_ADD_LEVEL POLL_ADD_LEVEL}</li>
     * </ul>
     */
    public static final int
        IORING_POLL_ADD_MULTI        = 1 << 0,
        IORING_POLL_UPDATE_EVENTS    = 1 << 1,
        IORING_POLL_UPDATE_USER_DATA = 1 << 2,
        IORING_POLL_ADD_LEVEL        = 1 << 3;

    /**
     * {@code ASYNC_CANCEL} flags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_ASYNC_CANCEL_ALL ASYNC_CANCEL_ALL} - 
     * Cancel all requests that match the given criteria, rather than just canceling the first one found.
     * 
     * <p>Available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_ASYNC_CANCEL_FD ASYNC_CANCEL_FD} - 
     * Match based on the file descriptor used in the original request rather than the {@code user_data}.
     * 
     * <p>This is what {@link LibURing#io_uring_prep_cancel_fd prep_cancel_fd} sets up.</p>
     * 
     * <p>Available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_ASYNC_CANCEL_ANY ASYNC_CANCEL_ANY} - 
     * Match any request in the ring, regardless of {@code user_data} or file descriptor.
     * 
     * <p>Can be used to cancel any pending request in the ring.</p>
     * 
     * <p>Available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_ASYNC_CANCEL_FD_FIXED ASYNC_CANCEL_FD_FIXED} - {@code fd} passed in is a fixed descriptor</li>
     * </ul>
     */
    public static final int
        IORING_ASYNC_CANCEL_ALL      = 1 << 0,
        IORING_ASYNC_CANCEL_FD       = 1 << 1,
        IORING_ASYNC_CANCEL_ANY      = 1 << 2,
        IORING_ASYNC_CANCEL_FD_FIXED = 1 << 3;

    /**
     * {@code send/sendmsg} and {@code recv/recvmsg} flags ({@code sqe->ioprio})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_RECVSEND_POLL_FIRST RECVSEND_POLL_FIRST} - 
     * If set, io_uring will assume the socket is currently empty and attempting to receive data will be unsuccessful.
     * 
     * <p>For this case, io_uring will arm internal poll and trigger a receive of the data when the socket has data to be read. This initial receive attempt
     * can be wasteful for the case where the socket is expected to be empty, setting this flag will bypass the initial receive attempt and go straight to
     * arming poll. If poll does indicate that data is ready to be received, the operation will proceed.</p>
     * 
     * <p>Can be used with the CQE {@link #IORING_CQE_F_SOCK_NONEMPTY CQE_F_SOCK_NONEMPTY} flag, which io_uring will set on CQEs after a {@code recv(2)} or {@code recvmsg(2)} operation. If
     * set, the socket still had data to be read after the operation completed.</p>
     * 
     * <p>Both these flags are available since 5.19.</p>
     * </li>
     * <li>{@link #IORING_RECV_MULTISHOT RECV_MULTISHOT} - 
     * Multishot {@code recv}.
     * 
     * <p>Sets {@link #IORING_CQE_F_MORE CQE_F_MORE} if the handler will continue to report CQEs on behalf of the same SQE.</p>
     * </li>
     * <li>{@link #IORING_RECVSEND_FIXED_BUF RECVSEND_FIXED_BUF} - Use registered buffers, the index is stored in the {@code buf_index} field.</li>
     * <li>{@link #IORING_SEND_ZC_REPORT_USAGE SEND_ZC_REPORT_USAGE}</li>
     * </ul>
     */
    public static final int
        IORING_RECVSEND_POLL_FIRST  = 1 << 0,
        IORING_RECV_MULTISHOT       = 1 << 1,
        IORING_RECVSEND_FIXED_BUF   = 1 << 2,
        IORING_SEND_ZC_REPORT_USAGE = 1 << 3;

    public static final int IORING_NOTIF_USAGE_ZC_COPIED = 1 << 31;

    /** Accept flags stored in {@code sqe->ioprio} */
    public static final int IORING_ACCEPT_MULTISHOT = 1 << 0;

    /**
     * {@link #IORING_OP_MSG_RING OP_MSG_RING} command types, stored in {@code sqe->addr}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_MSG_DATA MSG_DATA} - pass {@code sqe->len} as {@code res} and {@code off} as {@code user_data}</li>
     * <li>{@link #IORING_MSG_SEND_FD MSG_SEND_FD} - send a registered fd to another ring</li>
     * </ul>
     */
    public static final int
        IORING_MSG_DATA    = 0,
        IORING_MSG_SEND_FD = 1;

    /**
     * {@link #IORING_OP_MSG_RING OP_MSG_RING} flags ({@code sqe->msg_ring_flags})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_MSG_RING_CQE_SKIP MSG_RING_CQE_SKIP} - Don't post a CQE to the target ring. Not applicable for {@link #IORING_MSG_DATA MSG_DATA}, obviously.</li>
     * <li>{@link #IORING_MSG_RING_FLAGS_PASS MSG_RING_FLAGS_PASS}</li>
     * </ul>
     */
    public static final int
        IORING_MSG_RING_CQE_SKIP   = 1 << 0,
        IORING_MSG_RING_FLAGS_PASS = 1 << 1;

    /**
     * {@code cqe->flags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_CQE_F_BUFFER CQE_F_BUFFER} - If set, the upper 16 bits are the buffer ID</li>
     * <li>{@link #IORING_CQE_F_MORE CQE_F_MORE} - If set, parent SQE will generate more CQE entries</li>
     * <li>{@link #IORING_CQE_F_SOCK_NONEMPTY CQE_F_SOCK_NONEMPTY} - If set, more data to read after socket {@code recv}.</li>
     * <li>{@link #IORING_CQE_F_NOTIF CQE_F_NOTIF} - Set for notification CQEs. Can be used to distinct them from sends.</li>
     * </ul>
     */
    public static final int
        IORING_CQE_F_BUFFER        = 1 << 0,
        IORING_CQE_F_MORE          = 1 << 1,
        IORING_CQE_F_SOCK_NONEMPTY = 1 << 2,
        IORING_CQE_F_NOTIF         = 1 << 3;

    public static final int IORING_CQE_BUFFER_SHIFT = 16;

    /** Magic offsets for the application to {@code mmap} the data it needs */
    public static final long
        IORING_OFF_SQ_RING    = 0L,
        IORING_OFF_CQ_RING    = 0x8000000L,
        IORING_OFF_SQES       = 0x10000000L,
        IORING_OFF_PBUF_RING  = 0x80000000L,
        IORING_OFF_PBUF_SHIFT = 16,
        IORING_OFF_MMAP_MASK  = 0xf8000000L;

    /**
     * {@code sq_ring->flags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_SQ_NEED_WAKEUP SQ_NEED_WAKEUP} - needs {@code io_uring_enter} wakeup</li>
     * <li>{@link #IORING_SQ_CQ_OVERFLOW SQ_CQ_OVERFLOW} - CQ ring is overflown</li>
     * <li>{@link #IORING_SQ_TASKRUN SQ_TASKRUN} - task should enter the kernel</li>
     * </ul>
     */
    public static final int
        IORING_SQ_NEED_WAKEUP = 1 << 0,
        IORING_SQ_CQ_OVERFLOW = 1 << 1,
        IORING_SQ_TASKRUN     = 1 << 2;

    /**
     * {@code cq_ring->flags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_CQ_EVENTFD_DISABLED CQ_EVENTFD_DISABLED} - disable {@code eventfd} notifications</li>
     * </ul>
     */
    public static final int IORING_CQ_EVENTFD_DISABLED = 1 << 0;

    /**
     * {@code io_uring_enter(2)} flags
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_ENTER_GETEVENTS ENTER_GETEVENTS} - 
     * If this flag is set, then the system call will wait for the specificied number of events in {@code min_complete} before returning.
     * 
     * <p>This flag can be set along with {@code to_submit} to both submit and complete events in a single system call.</p>
     * </li>
     * <li>{@link #IORING_ENTER_SQ_WAKEUP ENTER_SQ_WAKEUP} - If the ring has been created with {@link #IORING_SETUP_SQPOLL SETUP_SQPOLL}, then this flag asks the kernel to wakeup the SQ kernel thread to submit IO.</li>
     * <li>{@link #IORING_ENTER_SQ_WAIT ENTER_SQ_WAIT} - 
     * If the ring has been created with {@link #IORING_SETUP_SQPOLL SETUP_SQPOLL}, then the application has no real insight into when the SQ kernel thread has consumed entries from
     * the SQ ring. This can lead to a situation where the application can no longer get a free SQE entry to submit, without knowing when it one becomes
     * available as the SQ kernel thread consumes them. If the system call is used with this flag set, then it will wait until at least one entry is free
     * in the SQ ring.
     * </li>
     * <li>{@link #IORING_ENTER_EXT_ARG ENTER_EXT_ARG} - 
     * Since kernel 5.11, the system calls arguments have been modified to look like the following:
     * 
     * <pre><code>
     * int io_uring_enter(unsigned int fd, unsigned int to_submit,
     *                    unsigned int min_complete, unsigned int flags,
     *                    const void *arg, size_t argsz);</code></pre>
     * 
     * <p>which is behaves just like the original definition by default. However, if {@code IORING_ENTER_EXT_ARG} is set, then instead of a {@code sigset_t}
     * being passed in, a pointer to a struct {@code io_uring_getevents_arg} is used instead and {@code argsz} must be set to the size of this structure.</p>
     * 
     * <p>The definition is {@link IOURingGeteventsArg} which allows passing in both a signal mask as well as pointer to a struct {@code __kernel_timespec} timeout
     * value. If {@code ts} is set to a valid pointer, then this time value indicates the timeout for waiting on events. If an application is waiting on
     * events and wishes to stop waiting after a specified amount of time, then this can be accomplished directly in version 5.11 and newer by using this
     * feature.</p>
     * </li>
     * <li>{@link #IORING_ENTER_REGISTERED_RING ENTER_REGISTERED_RING} - 
     * If the ring file descriptor has been registered through use of {@link #IORING_REGISTER_RING_FDS REGISTER_RING_FDS}, then setting this flag will tell the kernel that the
     * {@code ring_fd} passed in is the registered ring offset rather than a normal file descriptor.
     * </li>
     * </ul>
     */
    public static final int
        IORING_ENTER_GETEVENTS       = 1 << 0,
        IORING_ENTER_SQ_WAKEUP       = 1 << 1,
        IORING_ENTER_SQ_WAIT         = 1 << 2,
        IORING_ENTER_EXT_ARG         = 1 << 3,
        IORING_ENTER_REGISTERED_RING = 1 << 4;

    /**
     * {@code io_uring_params->features} flags
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_FEAT_SINGLE_MMAP FEAT_SINGLE_MMAP} - 
     * If this flag is set, the two SQ and CQ rings can be mapped with a single {@code mmap(2)} call.
     * 
     * <p>The SQEs must still be allocated separately. This brings the necessary {@code mmap(2)} calls down from three to two.</p>
     * 
     * <p>Available since kernel 5.4.</p>
     * </li>
     * <li>{@link #IORING_FEAT_NODROP FEAT_NODROP} - 
     * If this flag is set, {@code io_uring} supports never dropping completion events.
     * 
     * <p>If a completion event occurs and the CQ ring is full, the kernel stores the event internally until such a time that the CQ ring has room for more
     * entries. If this overflow condition is entered, attempting to submit more IO will fail with the {@code -EBUSY} error value, if it can't flush the
     * overflown events to the CQ ring. If this happens, the application must reap events from the CQ ring and attempt the submit again.</p>
     * 
     * <p>Available since kernel 5.5.</p>
     * </li>
     * <li>{@link #IORING_FEAT_SUBMIT_STABLE FEAT_SUBMIT_STABLE} - 
     * If this flag is set, applications can be certain that any data for async offload has been consumed when the kernel has consumed the SQE.
     * 
     * <p>Available since kernel 5.5.</p>
     * </li>
     * <li>{@link #IORING_FEAT_RW_CUR_POS FEAT_RW_CUR_POS} - 
     * If this flag is set, applications can specify {@code offset == -1} with {@code IORING_OP_{READV,WRITEV}}, {@code IORING_OP_{READ,WRITE}_FIXED}, and
     * {@code IORING_OP_{READ,WRITE}} to mean current file position, which behaves like {@code preadv2(2)} and {@code pwritev2(2)} with
     * {@code offset == -1}.
     * 
     * <p>It'll use (and update) the current file position. This obviously comes with the caveat that if the application has multiple reads or writes in
     * flight, then the end result will not be as expected. This is similar to threads sharing a file descriptor and doing IO using the current file
     * position.</p>
     * 
     * <p>Available since kernel 5.6.</p>
     * </li>
     * <li>{@link #IORING_FEAT_CUR_PERSONALITY FEAT_CUR_PERSONALITY} - 
     * If this flag is set, then {@code io_uring} guarantees that both sync and async execution of a request assumes the credentials of the task that
     * called {@link #io_uring_enter enter} to queue the requests.
     * 
     * <p>If this flag isn't set, then requests are issued with the credentials of the task that originally registered the {@code io_uring}. If only one task
     * is using a ring, then this flag doesn't matter as the credentials will always be the same. Note that this is the default behavior, tasks can still
     * register different personalities through {@link #io_uring_register register} with {@link #IORING_REGISTER_PERSONALITY REGISTER_PERSONALITY} and specify the personality to use in the sqe.</p>
     * 
     * <p>Available since kernel 5.6.</p>
     * </li>
     * <li>{@link #IORING_FEAT_FAST_POLL FEAT_FAST_POLL} - 
     * If this flag is set, then {@code io_uring} supports using an internal poll mechanism to drive data/space readiness.
     * 
     * <p>This means that requests that cannot read or write data to a file no longer need to be punted to an async thread for handling, instead they will
     * begin operation when the file is ready. This is similar to doing poll + read/write in userspace, but eliminates the need to do so. If this flag is
     * set, requests waiting on space/data consume a lot less resources doing so as they are not blocking a thread.</p>
     * 
     * <p>Available since kernel 5.7.</p>
     * </li>
     * <li>{@link #IORING_FEAT_POLL_32BITS FEAT_POLL_32BITS} - 
     * If this flag is set, the {@link #IORING_OP_POLL_ADD OP_POLL_ADD} command accepts the full 32-bit range of epoll based flags.
     * 
     * <p>Most notably {@code EPOLLEXCLUSIVE} which allows exclusive (waking single waiters) behavior.</p>
     * 
     * <p>Available since kernel 5.9.</p>
     * </li>
     * <li>{@link #IORING_FEAT_SQPOLL_NONFIXED FEAT_SQPOLL_NONFIXED} - 
     * If this flag is set, the {@link #IORING_SETUP_SQPOLL SETUP_SQPOLL} feature no longer requires the use of fixed files.
     * 
     * <p>Any normal file descriptor can be used for IO commands without needing registration.</p>
     * 
     * <p>Available since kernel 5.11.</p>
     * </li>
     * <li>{@link #IORING_FEAT_EXT_ARG FEAT_EXT_ARG} - 
     * If this flag is set, then the {@link #io_uring_enter enter} system call supports passing in an extended argument instead of just the {@code sigset_t} of earlier
     * kernels.
     * 
     * <p>This extended argument is of type {@code struct io_uring_getevents_arg} and allows the caller to pass in both a {@code sigset_t} and a timeout
     * argument for waiting on events. A pointer to this struct must be passed in if {@link #IORING_ENTER_EXT_ARG ENTER_EXT_ARG} is set in the flags for the enter system call.</p>
     * 
     * <p>Available since kernel 5.11.</p>
     * </li>
     * <li>{@link #IORING_FEAT_NATIVE_WORKERS FEAT_NATIVE_WORKERS} - 
     * If this flag is set, {@code io_uring} is using native workers for its async helpers.
     * 
     * <p>Previous kernels used kernel threads that assumed the identity of the original {@code io_uring} owning task, but later kernels will actively create
     * what looks more like regular process threads instead.</p>
     * 
     * <p>Available since kernel 5.12.</p>
     * </li>
     * <li>{@link #IORING_FEAT_RSRC_TAGS FEAT_RSRC_TAGS} - 
     * If this flag is set, then {@code io_uring} supports a variety of features related to fixed files and buffers.
     * 
     * <p>In particular, it indicates that registered buffers can be updated in-place, whereas before the full set would have to be unregistered first.</p>
     * 
     * <p>Available since kernel 5.13.</p>
     * </li>
     * <li>{@link #IORING_FEAT_CQE_SKIP FEAT_CQE_SKIP} - 
     * If this flag is set, then io_uring supports setting {@link #IOSQE_CQE_SKIP_SUCCESS} in the submitted SQE, indicating that no CQE should be generated for
     * this SQE if it executes normally. If an error happens processing the SQE, a CQE with the appropriate error value will still be generated.
     * 
     * <p>Available since kernel 5.17.</p>
     * </li>
     * <li>{@link #IORING_FEAT_LINKED_FILE FEAT_LINKED_FILE} - 
     * If this flag is set, then io_uring supports sane assignment of files for SQEs that have dependencies. For example, if a chain of SQEs are submitted
     * with {@link #IOSQE_IO_LINK}, then kernels without this flag will prepare the file for each link upfront. If a previous link opens a file with a known
     * index, eg if direct descriptors are used with open or accept, then file assignment needs to happen post execution of that SQE. If this flag is set,
     * then the kernel will defer file assignment until execution of a given request is started.
     * 
     * <p>Available since kernel 5.17.</p>
     * </li>
     * <li>{@link #IORING_FEAT_REG_REG_RING FEAT_REG_REG_RING}</li>
     * </ul>
     */
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
        IORING_FEAT_REG_REG_RING    = 1 << 13;

    /**
     * {@link #io_uring_register register} {@code opcodes} and arguments
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_REGISTER_BUFFERS REGISTER_BUFFERS} - 
     * {@code arg} points to a struct {@code iovec} array of {@code nr_args} entries.
     * 
     * <p>The buffers associated with the {@code iovecs} will be locked in memory and charged against the user's {@code RLIMIT_MEMLOCK} resource limit.
     * See {@code getrlimit(2)} for more information. Additionally, there is a size limit of 1GiB per buffer. Currently, the buffers must be anonymous,
     * non-file-backed memory, such as that returned by {@code malloc(3)} or {@code mmap(2)} with the {@code MAP_ANONYMOUS} flag set. It is expected that
     * this limitation will be lifted in the future. Huge pages are supported as well. Note that the entire huge page will be pinned in the kernel, even
     * if only a portion of it is used.</p>
     * 
     * <p>After a successful call, the supplied buffers are mapped into the kernel and eligible for I/O. To make use of them, the application must specify
     * the {@link #IORING_OP_READ_FIXED OP_READ_FIXED} or {@link #IORING_OP_WRITE_FIXED OP_WRITE_FIXED} {@code opcodes} in the submission queue entry (see the struct {@code io_uring_sqe} definition in {@link #io_uring_enter enter}),
     * and set the {@code buf_index} field to the desired buffer index. The memory range described by the submission queue entry's {@code addr} and
     * {@code len} fields must fall within the indexed buffer.</p>
     * 
     * <p>It is perfectly valid to setup a large buffer and then only use part of it for an I/O, as long as the range is within the originally mapped region.</p>
     * 
     * <p>An application can increase or decrease the size or number of registered buffers by first unregistering the existing buffers, and then issuing a
     * new call to {@code io_uring_register()} with the new buffers.</p>
     * 
     * <p>Note that before 5.13 registering buffers would wait for the ring to idle. If the application currently has requests in-flight, the registration
     * will wait for those to finish before proceeding.</p>
     * 
     * <p>An application need not unregister buffers explicitly before shutting down the io_uring instance.</p>
     * 
     * <p>Available since 5.1.</p>
     * </li>
     * <li>{@link #IORING_UNREGISTER_BUFFERS UNREGISTER_BUFFERS} - 
     * This operation takes no argument, and {@code arg} must be passed as {@code NULL}.
     * 
     * <p>All previously registered buffers associated with the {@code io_uring} instance will be released.</p>
     * 
     * <p>Available since 5.1.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_FILES REGISTER_FILES} - 
     * Register files for I/O.
     * 
     * <p>{@code arg} contains a pointer to an array of {@code nr_args} file descriptors (signed 32 bit integers). To make use of the registered files, the
     * {@link #IOSQE_FIXED_FILE} flag must be set in the {@code flags} member of the struct {@code io_uring_sqe}, and the {@code fd} member is set to the index of
     * the file in the file descriptor array.</p>
     * 
     * <p>The file set may be sparse, meaning that the {@code fd} field in the array may be set to -1. See {@link #IORING_REGISTER_FILES_UPDATE REGISTER_FILES_UPDATE} for how to update files in
     * place.</p>
     * 
     * <p>Note that before 5.13 registering files would wait for the ring to idle. If the application currently has requests in-flight, the registration will
     * wait for those to finish before proceeding. See {@link #IORING_REGISTER_FILES_UPDATE REGISTER_FILES_UPDATE} for how to update an existing set without that limitation.</p>
     * 
     * <p>Files are automatically unregistered when the io_uring instance is torn down. An application needs only unregister if it wishes to register a new
     * set of fds.</p>
     * 
     * <p>Available since 5.1.</p>
     * </li>
     * <li>{@link #IORING_UNREGISTER_FILES UNREGISTER_FILES} - 
     * This operation requires no argument, and {@code arg} must be passed as {@code NULL}.
     * 
     * <p>All previously registered files associated with the {@code io_uring} instance will be unregistered.</p>
     * 
     * <p>Available since 5.1.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_EVENTFD REGISTER_EVENTFD} - 
     * It's possible to use {@code eventfd(2)} to get notified of completion events on an {@code io_uring} instance. If this is desired, an eventfd file
     * descriptor can be registered through this operation.
     * 
     * <p>{@code arg} must contain a pointer to the eventfd file descriptor, and {@code nr_args} must be 1.</p>
     * 
     * <p>Available since 5.2.</p>
     * 
     * <p>An application can temporarily disable notifications, coming through the registered eventfd, by setting the {@link #IORING_CQ_EVENTFD_DISABLED CQ_EVENTFD_DISABLED} bit in the
     * {@code flags} field of the CQ ring.</p>
     * 
     * <p>Available since 5.8.</p>
     * </li>
     * <li>{@link #IORING_UNREGISTER_EVENTFD UNREGISTER_EVENTFD} - 
     * Unregister an eventfd file descriptor to stop notifications.
     * 
     * <p>Since only one eventfd descriptor is currently supported, this operation takes no argument, and {@code arg} must be passed as {@code NULL} and
     * {@code nr_args} must be zero.</p>
     * 
     * <p>Available since 5.2.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_FILES_UPDATE REGISTER_FILES_UPDATE} - 
     * This operation replaces existing files in the registered file set with new ones, either turning a sparse entry (one where {@code fd} is equal to
     * -1) into a real one, removing an existing entry (new one is set to -1), or replacing an existing entry with a new existing entry.
     * 
     * <p>{@code arg} must contain a pointer to a struct {@code io_uring_files_update}, which contains an offset on which to start the update, and an array
     * of file descriptors to use for the update. {@code nr_args} must contain the number of descriptors in the passed in array.</p>
     * 
     * <p>Available since 5.5.</p>
     * 
     * <p>File descriptors can be skipped if they are set to {@link #IORING_REGISTER_FILES_SKIP REGISTER_FILES_SKIP}. Skipping an fd will not touch the file associated with the previous fd at
     * that index.</p>
     * 
     * <p>Available since 5.12.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_EVENTFD_ASYNC REGISTER_EVENTFD_ASYNC} - 
     * This works just like {@link #IORING_REGISTER_EVENTFD REGISTER_EVENTFD}, except notifications are only posted for events that complete in an async manner.
     * 
     * <p>This means that events that complete inline while being submitted do not trigger a notification event. The arguments supplied are the same as for
     * {@code IORING_REGISTER_EVENTFD}.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_PROBE REGISTER_PROBE} - 
     * This operation returns a structure, {@code io_uring_probe}, which contains information about the {@code opcodes} supported by {@code io_uring} on
     * the running kernel.
     * 
     * <p>{@code arg} must contain a pointer to a struct {@code io_uring_probe}, and {@code nr_args} must contain the size of the ops array in that probe
     * struct. The {@code ops} array is of the type {@code io_uring_probe_op}, which holds the value of the {@code opcode} and a {@code flags} field. If
     * the flags field has {@link #IO_URING_OP_SUPPORTED} set, then this opcode is supported on the running kernel.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_PERSONALITY REGISTER_PERSONALITY} - 
     * This operation registers credentials of the running application with {@code io_uring}, and returns an id associated with these credentials.
     * 
     * <p>Applications wishing to share a ring between separate users/processes can pass in this credential id in the sqe personality field. If set, that
     * particular sqe will be issued with these credentials. Must be invoked with {@code arg} set to {@code NULL} and {@code nr_args} set to zero.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_UNREGISTER_PERSONALITY UNREGISTER_PERSONALITY} - 
     * This operation unregisters a previously registered personality with {@code io_uring}.
     * 
     * <p>{@code nr_args} must be set to the id in question, and {@code arg} must be set to {@code NULL}.</p>
     * 
     * <p>Available since 5.6.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_RESTRICTIONS REGISTER_RESTRICTIONS} - 
     * {@code arg} points to a struct {@code io_uring_restriction} array of {@code nr_args} entries.
     * 
     * <p>With an entry it is possible to allow an {@link #io_uring_register register} {@code opcode}, or specify which {@code opcode} and flags of the submission queue entry are
     * allowed, or require certain flags to be specified (these flags must be set on each submission queue entry).</p>
     * 
     * <p>All the restrictions must be submitted with a single {@code io_uring_register()} call and they are handled as an allowlist ({@code opcodes} and
     * flags not registered, are not allowed).</p>
     * 
     * <p>Restrictions can be registered only if the {@code io_uring} ring started in a disabled state ({@link #IORING_SETUP_R_DISABLED SETUP_R_DISABLED} must be specified in the call to
     * {@link #io_uring_setup setup}).</p>
     * 
     * <p>Available since 5.10.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_ENABLE_RINGS REGISTER_ENABLE_RINGS} - 
     * This operation enables an {@code io_uring} ring started in a disabled state ({@link #IORING_SETUP_R_DISABLED SETUP_R_DISABLED} was specified in the call to {@link #io_uring_setup setup}).
     * 
     * <p>While the {@code io_uring} ring is disabled, submissions are not allowed and registrations are not restricted. After the execution of this
     * operation, the {@code io_uring} ring is enabled: submissions and registration are allowed, but they will be validated following the registered
     * restrictions (if any). This operation takes no argument, must be invoked with {@code arg} set to {@code NULL} and {@code nr_args} set to zero.</p>
     * 
     * <p>Available since 5.10.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_FILES2 REGISTER_FILES2} - 
     * Register files for I/O. Similar to {@link #IORING_REGISTER_FILES REGISTER_FILES}.
     * 
     * <p>{@code arg} points to a struct {@code io_uring_rsrc_register}, and {@code nr_args} should be set to the number of bytes in the structure.</p>
     * 
     * <p>The {@code data} field contains a pointer to an array of {@code nr} file descriptors (signed 32 bit integers). {@code tags} field should either be
     * 0 or or point to an array of {@code nr} "tags" (unsigned 64 bit integers). See {@link #IORING_REGISTER_BUFFERS2 REGISTER_BUFFERS2} for more info on resource tagging.</p>
     * 
     * <p>Note that resource updates, e.g. {@link #IORING_REGISTER_FILES_UPDATE REGISTER_FILES_UPDATE}, don't necessarily deallocate resources, they might be held until all requests using that
     * resource complete.</p>
     * 
     * <p>Available since 5.13.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_FILES_UPDATE2 REGISTER_FILES_UPDATE2} - 
     * Similar to {@link #IORING_REGISTER_FILES_UPDATE REGISTER_FILES_UPDATE}, replaces existing files in the registered file set with new ones, either turning a sparse entry (one where fd is
     * equal to -1) into a real one, removing an existing entry (new one is set to -1), or replacing an existing entry with a new existing entry.
     * 
     * <p>{@code arg} must contain a pointer to a struct {@code io_uring_rsrc_update2}, which contains an offset on which to start the update, and an array
     * of file descriptors to use for the update stored in data. {@code tags} points to an array of tags. {@code nr} must contain the number of
     * descriptors in the passed in arrays. See {@link #IORING_REGISTER_BUFFERS2 REGISTER_BUFFERS2} for the resource tagging description.</p>
     * 
     * <p>Available since 5.13.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_BUFFERS2 REGISTER_BUFFERS2} - 
     * Register buffers for I/O.
     * 
     * <p>Similar to {@link #IORING_REGISTER_BUFFERS REGISTER_BUFFERS} but aims to have a more extensible ABI. {@code arg} points to a struct {@code io_uring_rsrc_register}, and
     * {@code nr_args} should be set to the number of bytes in the structure.</p>
     * 
     * <p>The data field contains a pointer to a struct {@code iovec} array of {@code nr} entries. The {@code tags} field should either be 0, then tagging is
     * disabled, or point to an array of {@code nr} "tags" (unsigned 64 bit integers). If a tag is zero, then tagging for this particular resource (a
     * buffer in this case) is disabled. Otherwise, after the resource had been unregistered and it's not used anymore, a CQE will be posted with
     * {@code user_data} set to the specified tag and all other fields zeroed.</p>
     * 
     * <p>Note that resource updates, e.g. {@link #IORING_REGISTER_BUFFERS_UPDATE REGISTER_BUFFERS_UPDATE}, don't necessarily deallocate resources by the time it returns, but they might be held
     * alive until all requests using it complete.</p>
     * 
     * <p>Available since 5.13.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_BUFFERS_UPDATE REGISTER_BUFFERS_UPDATE} - 
     * Updates registered buffers with new ones, either turning a sparse entry into a real one, or replacing an existing entry.
     * 
     * <p>{@code arg} must contain a pointer to a struct {@code io_uring_rsrc_update2}, which contains an offset on which to start the update, and an array
     * of struct {@code iovec}. {@code tags} points to an array of tags. {@code nr} must contain the number of descriptors in the passed in arrays. See
     * {@link #IORING_REGISTER_BUFFERS2 REGISTER_BUFFERS2} for the resource tagging description.</p>
     * 
     * <p>Available since 5.13.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_IOWQ_AFF REGISTER_IOWQ_AFF} - 
     * By default, async workers created by {@code io_uring} will inherit the CPU mask of its parent.
     * 
     * <p>This is usually all the CPUs in the system, unless the parent is being run with a limited set. If this isn't the desired outcome, the application
     * may explicitly tell {@code io_uring} what CPUs the async workers may run on.</p>
     * 
     * <p>{@code arg} must point to a {@code cpu_set_t} mask, and {@code nr_args} the byte size of that mask.</p>
     * 
     * <p>Available since 5.14.</p>
     * </li>
     * <li>{@link #IORING_UNREGISTER_IOWQ_AFF UNREGISTER_IOWQ_AFF} - 
     * Undoes a CPU mask previously set with {@link #IORING_REGISTER_IOWQ_AFF REGISTER_IOWQ_AFF}.
     * 
     * <p>Must not have {@code arg} or {@code nr_args} set.</p>
     * 
     * <p>Available since 5.14.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_IOWQ_MAX_WORKERS REGISTER_IOWQ_MAX_WORKERS} - 
     * By default, {@code io_uring} limits the unbounded workers created to the maximum processor count set by {@code RLIMIT_NPROC} and the bounded
     * workers is a function of the SQ ring size and the number of CPUs in the system. Sometimes this can be excessive (or too little, for bounded), and
     * this command provides a way to change the count per ring (per NUMA node) instead.
     * 
     * <p>{@code arg} must be set to an unsigned int pointer to an array of two values, with the values in the array being set to the maximum count of
     * workers per NUMA node. Index 0 holds the bounded worker count, and index 1 holds the unbounded worker count. On successful return, the passed in
     * array will contain the previous maximum valyes for each type. If the count being passed in is 0, then this command returns the current maximum
     * values and doesn't modify the current setting. {@code nr_args} must be set to 2, as the command takes two values.</p>
     * 
     * <p>Available since 5.15.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_RING_FDS REGISTER_RING_FDS} - 
     * Whenever {@link #io_uring_enter enter} is called to submit request or wait for completions, the kernel must grab a reference to the file descriptor. If the application
     * using io_uring is threaded, the file table is marked as shared, and the reference grab and put of the file descriptor count is more expensive than
     * it is for a non-threaded application.
     * 
     * <p>Similarly to how io_uring allows registration of files, this allow registration of the ring file descriptor itself. This reduces the overhead of
     * the {@code io_uring_enter (2)} system call.</p>
     * 
     * <p>{@code arg} must be set to an unsigned int pointer to an array of type {@code struct io_uring_rsrc_register} of {@code nr_args} number of entries.
     * The {@code data} field of this struct must point to an io_uring file descriptor, and the {@code offset} field can be either {@code -1} or an
     * explicit offset desired for the registered file descriptor value. If {@code -1} is used, then upon successful return of this system call, the field
     * will contain the value of the registered file descriptor to be used for future {@code io_uring_enter (2)} system calls.</p>
     * 
     * <p>On successful completion of this request, the returned descriptors may be used instead of the real file descriptor for {@code io_uring_enter (2)},
     * provided that {@code IORING_ENTER_REGISTERED_RING} is set in the {@code flags} for the system call. This flag tells the kernel that a registered
     * descriptor is used rather than a real file descriptor.</p>
     * 
     * <p>Each thread or process using a ring must register the file descriptor directly by issuing this request.</p>
     * 
     * <p>The maximum number of supported registered ring descriptors is currently limited to {@code 16}.</p>
     * 
     * <p>Available since 5.18.</p>
     * </li>
     * <li>{@link #IORING_UNREGISTER_RING_FDS UNREGISTER_RING_FDS} - 
     * Unregister descriptors previously registered with {@link #IORING_REGISTER_RING_FDS REGISTER_RING_FDS}.
     * 
     * <p>{@code arg} must be set to an unsigned int pointer to an array of type {@code struct io_uring_rsrc_register} of {@code nr_args} number of entries.
     * Only the {@code offset} field should be set in the structure, containing the registered file descriptor offset previously returned from
     * {@code IORING_REGISTER_RING_FDS} that the application wishes to unregister.</p>
     * 
     * <p>Note that this isn't done automatically on ring exit, if the thread or task that previously registered a ring file descriptor isn't exiting. It is
     * recommended to manually unregister any previously registered ring descriptors if the ring is closed and the task persists. This will free up a
     * registration slot, making it available for future use.</p>
     * 
     * <p>Available since 5.18.</p>
     * </li>
     * <li>{@link #IORING_REGISTER_PBUF_RING REGISTER_PBUF_RING} - register ring based provide buffer group</li>
     * <li>{@link #IORING_UNREGISTER_PBUF_RING UNREGISTER_PBUF_RING} - unregister ring based provide buffer group</li>
     * <li>{@link #IORING_REGISTER_SYNC_CANCEL REGISTER_SYNC_CANCEL} - sync cancelation API</li>
     * <li>{@link #IORING_REGISTER_FILE_ALLOC_RANGE REGISTER_FILE_ALLOC_RANGE} - register a range of fixed file slots for automatic slot allocation</li>
     * <li>{@link #IORING_REGISTER_LAST REGISTER_LAST}</li>
     * <li>{@link #IORING_REGISTER_USE_REGISTERED_RING REGISTER_USE_REGISTERED_RING}</li>
     * </ul>
     */
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
        IORING_REGISTER_LAST                = 26,
        IORING_REGISTER_USE_REGISTERED_RING = 1 << 31;

    /** Register a fully sparse file space, rather than pass in an array of all -1 file descriptors. */
    public static final int IORING_RSRC_REGISTER_SPARSE = 1 << 0;

    /**
     * {@code io-wq} worker categories
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IO_WQ_BOUND IO_WQ_BOUND}</li>
     * <li>{@link #IO_WQ_UNBOUND IO_WQ_UNBOUND}</li>
     * </ul>
     */
    public static final int
        IO_WQ_BOUND   = 0,
        IO_WQ_UNBOUND = 1;

    /** Skip updating fd indexes set to this value in the fd table. */
    public static final int IORING_REGISTER_FILES_SKIP = -2;

    public static final int IO_URING_OP_SUPPORTED = 1 << 0;

    public static final int IOU_PBUF_RING_MMAP = 1;

    /**
     * {@code io_uring_restriction->opcode} values
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #IORING_RESTRICTION_REGISTER_OP RESTRICTION_REGISTER_OP} - Allow an {@code io_uring_register(2)} opcode</li>
     * <li>{@link #IORING_RESTRICTION_SQE_OP RESTRICTION_SQE_OP} - Allow an sqe opcode</li>
     * <li>{@link #IORING_RESTRICTION_SQE_FLAGS_ALLOWED RESTRICTION_SQE_FLAGS_ALLOWED} - Allow sqe flags</li>
     * <li>{@link #IORING_RESTRICTION_SQE_FLAGS_REQUIRED RESTRICTION_SQE_FLAGS_REQUIRED} - Require sqe flags (these flags must be set on each submission)</li>
     * <li>{@link #IORING_RESTRICTION_LAST RESTRICTION_LAST} - Require sqe flags (these flags must be set on each submission)</li>
     * </ul>
     */
    public static final int
        IORING_RESTRICTION_REGISTER_OP        = 0,
        IORING_RESTRICTION_SQE_OP             = 1,
        IORING_RESTRICTION_SQE_FLAGS_ALLOWED  = 2,
        IORING_RESTRICTION_SQE_FLAGS_REQUIRED = 3,
        IORING_RESTRICTION_LAST               = 4;

    protected LibIOURing() {
        throw new UnsupportedOperationException();
    }

    // --- [ io_uring_setup ] ---

    /** Unsafe version of: {@link #io_uring_setup setup} */
    public static native int nio_uring_setup(int entries, long p);

    /**
     * The {@code io_uring_setup()} system call sets up a submission queue (SQ) and completion queue (CQ) with at least {@code entries} entries, and returns a
     * file descriptor which can be used to perform subsequent operations on the {@code io_uring} instance.
     * 
     * <p>The submission and completion queues are shared between userspace and the kernel, which eliminates the need to copy data when initiating and completing
     * I/O.</p>
     * 
     * <p>Closing the file descriptor returned by {@code io_uring_setup(2)} will free all resources associated with the {@code io_uring} context.</p>
     *
     * @param p used by the application to pass options to the kernel, and by the kernel to convey information about the ring buffers
     *
     * @return a new file descriptor on success.
     *         
     *         <p>The application may then provide the file descriptor in a subsequent {@code mmap(2)} call to map the submission and completion queues, or to the
     *         {@link #io_uring_register register} or {@link #io_uring_enter enter} system calls.</p>
     *         
     *         <p>On error, {@code -1} is returned and {@code errno} is set appropriately.</p>
     */
    public static int io_uring_setup(@NativeType("unsigned") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_setup(entries, p.address());
    }

    // --- [ io_uring_register ] ---

    /** Unsafe version of: {@link #io_uring_register register} */
    public static native int nio_uring_register(int fd, int opcode, long arg, int nr_args);

    /**
     * The {@code io_uring_register()} system call registers resources (e.g. user buffers, files, eventfd, personality, restrictions) for use in an
     * {@code io_uring} instance referenced by {@code fd}.
     * 
     * <p>Registering files or user buffers allows the kernel to take long term references to internal data structures or create long term mappings of
     * application memory, greatly reducing per-I/O overhead.</p>
     *
     * @param fd     the file descriptor returned by a call to {@link #io_uring_setup setup}
     * @param opcode one of:<br><table><tr><td>{@link #IORING_REGISTER_BUFFERS REGISTER_BUFFERS}</td><td>{@link #IORING_REGISTER_FILES REGISTER_FILES}</td><td>{@link #IORING_REGISTER_EVENTFD REGISTER_EVENTFD}</td><td>{@link #IORING_REGISTER_FILES_UPDATE REGISTER_FILES_UPDATE}</td></tr><tr><td>{@link #IORING_REGISTER_EVENTFD_ASYNC REGISTER_EVENTFD_ASYNC}</td><td>{@link #IORING_REGISTER_PROBE REGISTER_PROBE}</td><td>{@link #IORING_REGISTER_PERSONALITY REGISTER_PERSONALITY}</td><td>{@link #IORING_REGISTER_RESTRICTIONS REGISTER_RESTRICTIONS}</td></tr><tr><td>{@link #IORING_REGISTER_ENABLE_RINGS REGISTER_ENABLE_RINGS}</td><td>{@link #IORING_REGISTER_FILES2 REGISTER_FILES2}</td><td>{@link #IORING_REGISTER_FILES_UPDATE2 REGISTER_FILES_UPDATE2}</td><td>{@link #IORING_REGISTER_BUFFERS2 REGISTER_BUFFERS2}</td></tr><tr><td>{@link #IORING_REGISTER_BUFFERS_UPDATE REGISTER_BUFFERS_UPDATE}</td><td>{@link #IORING_REGISTER_IOWQ_AFF REGISTER_IOWQ_AFF}</td><td>{@link #IORING_REGISTER_IOWQ_MAX_WORKERS REGISTER_IOWQ_MAX_WORKERS}</td><td>{@link #IORING_REGISTER_RING_FDS REGISTER_RING_FDS}</td></tr><tr><td>{@link #IORING_REGISTER_PBUF_RING REGISTER_PBUF_RING}</td><td>{@link #IORING_REGISTER_SYNC_CANCEL REGISTER_SYNC_CANCEL}</td><td>{@link #IORING_REGISTER_FILE_ALLOC_RANGE REGISTER_FILE_ALLOC_RANGE}</td><td>{@link #IORING_REGISTER_LAST REGISTER_LAST}</td></tr><tr><td>{@link #IORING_REGISTER_USE_REGISTERED_RING REGISTER_USE_REGISTERED_RING}</td><td>{@link #IORING_REGISTER_FILES_SKIP REGISTER_FILES_SKIP}</td></tr></table>
     *
     * @return on success, returns 0. On error, -1 is returned, and {@code errno} is set accordingly.
     */
    public static int io_uring_register(int fd, @NativeType("unsigned") int opcode, @NativeType("void *") long arg, @NativeType("unsigned") int nr_args) {
        return nio_uring_register(fd, opcode, arg, nr_args);
    }

    // --- [ io_uring_enter2 ] ---

    public static native int nio_uring_enter2(int fd, int to_submit, int min_complete, int flags, long sig, int sz);

    public static int io_uring_enter2(int fd, @NativeType("unsigned") int to_submit, @NativeType("unsigned") int min_complete, @NativeType("unsigned") int flags, @NativeType("sigset_t *") long sig, int sz) {
        return nio_uring_enter2(fd, to_submit, min_complete, flags, sig, sz);
    }

    // --- [ io_uring_enter ] ---

    /** Unsafe version of: {@link #io_uring_enter enter} */
    public static native int nio_uring_enter(int fd, int to_submit, int min_complete, int flags, long sig);

    /**
     * {@code io_uring_enter()} is used to initiate and complete I/O using the shared submission and completion queues setup by a call to {@link #io_uring_setup setup}.
     * 
     * <p>A single call can both submit new I/O and wait for completions of I/O initiated by this call or previous calls to {@code io_uring_enter()}.</p>
     * 
     * <p>If the {@code io_uring} instance was configured for polling, by specifying {@link #IORING_SETUP_IOPOLL SETUP_IOPOLL} in the call to {@code io_uring_setup()}, then
     * {@code min_complete} has a slightly different meaning. Passing a value of 0 instructs the kernel to return any events which are already complete,
     * without blocking. If {@code min_complete} is a non-zero value, the kernel will still return immediately if any completion events are available. If no
     * event completions are available, then the call will poll either until one or more completions become available, or until the process has exceeded its
     * scheduler time slice.</p>
     * 
     * <p>Note that, for interrupt driven I/O (where {@code IORING_SETUP_IOPOLL} was not specified in the call to {@code io_uring_setup()}), an application may
     * check the completion queue for event completions without entering the kernel at all.</p>
     * 
     * <p>When the system call returns that a certain amount of SQEs have been consumed and submitted, it's safe to reuse SQE entries in the ring. This is true
     * even if the actual IO submission had to be punted to async context, which means that the SQE may in fact not have been submitted yet. If the kernel
     * requires later use of a particular SQE entry, it will have made a private copy of it.</p>
     *
     * @param fd        the file descriptor returned by {@link #io_uring_setup setup}
     * @param to_submit the number of I/Os to submit from the submission queue
     * @param flags     one or more of:<br><table><tr><td>{@link #IORING_ENTER_GETEVENTS ENTER_GETEVENTS}</td><td>{@link #IORING_ENTER_SQ_WAKEUP ENTER_SQ_WAKEUP}</td><td>{@link #IORING_ENTER_SQ_WAIT ENTER_SQ_WAIT}</td><td>{@link #IORING_ENTER_EXT_ARG ENTER_EXT_ARG}</td><td>{@link #IORING_ENTER_REGISTERED_RING ENTER_REGISTERED_RING}</td></tr></table>
     * @param sig       a pointer to a signal mask (see {@code sigprocmask(2)}); if {@code sig} is not {@code NULL}, {@code io_uring_enter()} first replaces the current signal
     *                  mask by the one pointed to by sig, then waits for events to become available in the completion queue, and then restores the original signal mask.
     *                  The following {@code io_uring_enter()} call:
     *                  
     *                  <pre><code>
     *                  ret = io_uring_enter(fd, 0, 1, IORING_ENTER_GETEVENTS, &amp;sig);</code></pre>
     *                  
     *                  <p>is equivalent to atomically executing the following calls:</p>
     *                  
     *                  <pre><code>
     *                  pthread_sigmask(SIG_SETMASK, &amp;sig, &amp;orig);
     *                  ret = io_uring_enter(fd, 0, 1, IORING_ENTER_GETEVENTS, NULL);
     *                  pthread_sigmask(SIG_SETMASK, &amp;orig, NULL);</code></pre>
     *                  
     *                  <p>See the description of {@code pselect(2)} for an explanation of why the {@code sig} parameter is necessary.</p>
     *
     * @return the number of I/Os successfully consumed.
     *         
     *         <p>This can be zero if {@code to_submit} was zero or if the submission queue was empty. Note that if the ring was created with {@link #IORING_SETUP_SQPOLL SETUP_SQPOLL} specified,
     *         then the return value will generally be the same as {@code to_submit} as submission happens outside the context of the system call.</p>
     *         
     *         <p>The errors related to a submission queue entry will be returned through a completion queue entry, rather than through the system call itself.</p>
     *         
     *         <p>Errors that occur not on behalf of a submission queue entry are returned via the system call directly. On such an error, -1 is returned and
     *         {@code errno} is set appropriately.</p>
     */
    public static int io_uring_enter(int fd, @NativeType("unsigned") int to_submit, @NativeType("unsigned") int min_complete, @NativeType("unsigned") int flags, @NativeType("sigset_t *") long sig) {
        return nio_uring_enter(fd, to_submit, min_complete, flags, sig);
    }

}