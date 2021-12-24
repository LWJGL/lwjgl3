/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.linux.templates

import core.linux.*
import org.lwjgl.generator.*

val fcntl = "FCNTL".nativeClass(Module.CORE_LINUX, nativeSubPath = "linux") {
    nativeImport(
        "<fcntl.h>",
        "<errno.h>"
    )
    documentation = "Native bindings to &lt;fcntl.h&gt;."

    EnumConstant(
        "",

        "O_ACCMODE".enum("", "00000003"),
        "O_RDONLY".enum("", "00000000"),
        "O_WRONLY".enum("", "00000001"),
        "O_RDWR".enum("", "00000002"),

        "O_APPEND".enum(
            """
            The file is opened in append mode.

            Before each {@code write(2)}, the file offset is positioned at the end of the file, as if with {@code lseek(2)}. {@code O_APPEND} may lead to
            corrupted files on NFS file systems if more than one process appends data to a file at once. This is because NFS does not support appending to a
            file, so the client kernel has to simulate it, which can't be done without a race condition.
            """,
            "00002000"
        ),
        "O_ASYNC".enum(
            """
            Enable signal-driven I/O: generate a signal ({@code SIGIO} by default, but this can be changed via {@code fcntl(2)}) when input or output becomes
            possible on this file descriptor.

            This feature is only available for terminals, pseudoterminals, sockets, and (since Linux 2.6) pipes and FIFOs. See {@code fcntl(2)} for further
            details.
            """,
            "020000"
        ),
        "O_CLOEXEC".enum(
            """
            Enable the close-on-exec flag for the new file descriptor.

            Specifying this flag permits a program to avoid additional {@code fcntl(2) F_SETFD} operations to set the {@code FD_CLOEXEC} flag. Additionally,
            use of this flag is essential in some multithreaded programs since using a separate {@code fcntl(2) F_SETFD} operation to set the
            {@code FD_CLOEXEC} flag does not suffice to avoid race conditions where one thread opens a file descriptor at the same time as another thread does
            a {@code fork(2)} plus {@code execve(2)}.
            """,
            "02000000"
        ),
        "O_CREAT".enum(
            """
            If the file does not exist it will be created.

            The owner (user ID) of the file is set to the effective user ID of the process. The group ownership (group ID) is set either to the effective group
            ID of the process or to the group ID of the parent directory (depending on file system type and mount options, and the mode of the parent
            directory, see the mount options {@code bsdgroups} and {@code sysvgroups} described in {@code mount(8)}).
            """,
            "00000100"
        ),
        "O_DIRECT".enum(
            """
            Try to minimize cache effects of the I/O to and from this file.

            In general this will degrade performance, but it is useful in special situations, such as when applications do their own caching. File I/O is done
            directly to/from user-space buffers. The {@code O_DIRECT} flag on its own makes an effort to transfer data synchronously, but does not give the
            guarantees of the {@code O_SYNC} flag that data and necessary metadata are transferred. To guarantee synchronous I/O, {@code O_SYNC} must be used
            in addition to {@code O_DIRECT}.

            A semantically similar (but deprecated) interface for block devices is described in {@code raw(8)}.
            """,
            "040000"
        ),
        "O_DIRECTORY".enum(
            """
            If pathname is not a directory, cause the open to fail.

            This flag is Linux-specific, and was added in kernel version 2.1.126, to avoid denial-of-service problems if {@code opendir(3)} is called on a FIFO
            or tape device, but should not be used outside of the implementation of {@code opendir(3)}.
            """,
            "0200000"
        ),
        "O_DSYNC".enum("""""", "00010000"),
        "O_EXCL".enum(
            """
            Ensure that this call creates the file: if this flag is specified in conjunction with {@code O_CREAT}, and pathname already exists, then
            {@code open()} will fail.

            When these two flags are specified, symbolic links are not followed: if {@code pathname} is a symbolic link, then {@code open()} fails regardless
            of where the symbolic link points to.

            In general, the behavior of {@code O_EXCL} is undefined if it is used without {@code O_CREAT}. There is one exception: on Linux 2.6 and later,
            {@code O_EXCL} can be used without {@code O_CREAT} if {@code pathname} refers to a block device. If the block device is in use by the system (e.g.,
            mounted), {@code open()} fails with the error {@code EBUSY}.

            On NFS, {@code O_EXCL} is only supported when using NFSv3 or later on kernel 2.6 or later. In NFS environments where {@code O_EXCL} support is not
            provided, programs that rely on it for performing locking tasks will contain a race condition. Portable programs that want to perform atomic file
            locking using a lockfile, and need to avoid reliance on NFS support for {@code O_EXCL}, can create a unique file on the same file system (e.g.,
            incorporating hostname and PID), and use {@code link(2)} to make a link to the lockfile. If {@code link(2)} returns 0, the lock is successful.
            Otherwise, use {@code stat(2)} on the unique file to check if its link count has increased to 2, in which case the lock is also successful.
            """,
            "00000200"
        ),
        "O_LARGEFILE".enum(
            """
            (LFS) Allow files whose sizes cannot be represented in an {@code off_t} (but can be represented in an {@code off64_t}) to be opened.

            The {@code _LARGEFILE64_SOURCE} macro must be defined (before including any header files) in order to obtain this definition. Setting the
            {@code _FILE_OFFSET_BITS} feature test macro to 64 (rather than using {@code O_LARGEFILE}) is the preferred method of accessing large files on
            32-bit systems (see {@code feature_test_macros(7)}).
            """,
            "00100000"
        ),
        "O_NOATIME".enum(
            """
            Do not update the file last access time ({@code st_atime} in the {@code inode}) when the file is {@code read(2)}.

            This flag is intended for use by indexing or backup programs, where its use can significantly reduce the amount of disk activity. This flag may not
            be effective on all file systems. One example is NFS, where the server maintains the access time.
            """,
            "01000000"
        ),
        "O_NOCTTY".enum(
            """
            If {@code pathname} refers to a terminal device --see {@code tty(4)}-- it will not become the process's controlling terminal even if the process
            does not have one.
            """,
            "00000400"
        ),
        "O_NOFOLLOW".enum(
            """
            If {@code pathname} is a symbolic link, then the open fails.

            This is a FreeBSD extension, which was added to Linux in version 2.1.126. Symbolic links in earlier components of the {@code pathname} will still
            be followed.
            """,
            "00400000"
        ),
        "O_NONBLOCK".enum(
            """
            When possible, the file is opened in nonblocking mode.

            Neither the {@code open()} nor any subsequent operations on the file descriptor which is returned will cause the calling process to wait. For the
            handling of FIFOs (named pipes), see also {@code fifo(7)}. For a discussion of the effect of {@code O_NONBLOCK} in conjunction with mandatory file
            locks and with file leases, see {@code fcntl(2)}.
            """,
            "00004000"
        ),
        "O_NDELAY".enum("""""", "O_NONBLOCK"),
        "O_PATH".enum("""""", "010000000"),
        "O_SYNC".enum(
            """
            The file is opened for synchronous I/O.

            Any {@code write(2)}s on the resulting file descriptor will block the calling process until the data has been physically written to the underlying
            hardware.
            """,
            "04010000"
        ),
        "O_TMPFILE".enum("""""", "020000000 | O_DIRECTORY"),
        "O_TRUNC".enum(
            """
            If the file already exists and is a regular file and the open mode allows writing (i.e., is {@code O_RDWR} or {@code O_WRONLY}) it will be
            truncated to length 0.

            If the file is a FIFO or terminal device file, the {@code O_TRUNC} flag is ignored. Otherwise the effect of {@code O_TRUNC} is unspecified.
            """,
            "00001000"
        ),
    )

    EnumConstant(
        "File types encoded in type {@code mode_t}.",

        "S_IFMT".enum("Type of file.", "00170000"),
        "S_IFBLK".enum("Block special.", "0060000"),
        "S_IFCHR".enum("Character special.", "0020000"),
        "S_IFIFO".enum("FIFO special.", "0010000"),
        "S_IFREG".enum("Regular.", "0100000"),
        "S_IFDIR".enum("Directory.", "0040000"),
        "S_IFLNK".enum("Symbolic link.", "0120000"),
        "S_IFSOCK".enum("Socket.", "0140000")
    )

   val ModeBits = EnumConstant(
        "File mode bits encoded in type {@code mode_t}.",

        "S_IRWXU".enum("Read, write, execute/search by owner.", "0700"),
        "S_IRUSR".enum("Read permission, owner.", "0400"),
        "S_IWUSR".enum("Write permission, owner.", "0200"),
        "S_IXUSR".enum("Execute/search permission, owner.", "0100"),
        "S_IRWXG".enum("Read, write, execute/search by group.", "070"),
        "S_IRGRP".enum("Read permission, group.", "040"),
        "S_IWGRP".enum("Write permission, group.", "020"),
        "S_IXGRP".enum("Execute/search permission, group.", "010"),
        "S_IRWXO".enum("Read, write, execute/search by others.", "07"),
        "S_IROTH".enum("Read permission, others.", "04"),
        "S_IWOTH".enum("Write permission, others.", "02"),
        "S_IXOTH".enum("Execute/search permission, others.", "01"),
        "S_ISUID".enum("Set-user-ID on execution.", "04000"),
        "S_ISGID".enum("Set-group-ID on execution.", "02000"),
        "S_ISVTX".enum("On directories, restricted deletion flag.", "01000")
    ).javaDocLinks

    val commands = EnumConstant(
        "#fcntl() commands.",

        "F_DUPFD".enum(
            """
            Duplicate the file descriptor {@code fd} using the lowest-numbered available file descriptor greater than or equal to {@code arg}.

            This is different from {@code dup2(2)}, which uses exactly the file descriptor specified.

            On success, the new file descriptor is returned.

            See {@code dup(2)} for further details.
            """,
            "0"
        ),
        "F_GETFD".enum("Return (as the function result) the file descriptor flags; {@code arg} is ignored.", "1"),
        "F_SETFD".enum("Set the file descriptor flags to the value specified by {@code arg}.", "2"),
        "F_GETFL".enum("Return (as the function result) the file access mode and the file status flags; {@code arg} is ignored.", "3"),
        "F_SETFL".enum(
            """
            Set the file status flags to the value specified by {@code arg}.

            File access mode (#O_RDONLY, #O_WRONLY, #O_RDWR) and file creation flags (i.e., #O_CREAT, #O_EXCL, #O_NOCTTY, #O_TRUNC) in {@code arg} are ignored.
            On Linux, this command can change only the #O_APPEND, #O_ASYNC, #O_DIRECT, #O_NOATIME, and #O_NONBLOCK flags. It is not possible to change the
            #O_DSYNC and #O_SYNC flags; see BUGS, below.
            """,
            "4"
        ),
        "F_GETLK".enum(
            """
            On input to this call, lock describes a lock we would like to place on the file.

            If the lock could be placed, {@code fcntl()} does not actually place it, but returns #F_UNLCK in the {@code l_type} field of lock and leaves the
            other fields of the structure unchanged.

            If one or more incompatible locks would prevent this lock being placed, then {@code fcntl()} returns details about one of those locks in the
            {@code l_type}, {@code l_whence}, {@code l_start}, and {@code l_len} fields of lock. If the conflicting lock is a traditional (process-associated)
            record lock, then the {@code l_pid} field is set to the {@code PID} of the process holding that lock. If the conflicting lock is an open file
            description lock, then {@code l_pid} is set to -1. Note that the returned information may already be out of date by the time the caller inspects
            it.
            """,
            "5"
        ),
        "F_SETLK".enum(
            """
            Acquire a lock (when {@code l_type} is #F_RDLCK or #F_WRLCK) or release a lock (when {@code l_type} is #F_UNLCK) on the bytes specified by the
            {@code l_whence}, {@code l_start}, and {@code l_len} fields of lock.

            If a conflicting lock is held by another process, this call returns -1 and sets {@code errno} to {@code EACCES} or {@code EAGAIN}. (The error
            returned in this case differs across implementations, so POSIX requires a portable application to check for both errors.)
            """,
            "8"
        ),
        "F_SETLKW".enum(
            """
            As for #F_SETLK, but if a conflicting lock is held on the file, then wait for that lock to be released.

            If a signal is caught while waiting, then the call is interrupted and (after the signal handler has returned) returns immediately (with return
            value -1 and errno set to {@code EINTR}; see {@code signal(7)}).
            """,
            "7"
        ),
        "F_SETOWN".enum(
            """
            Set the process ID or process group ID that will receive {@code SIGIO} and {@code SIGURG} signals for events on the file descriptor {@code fd}.

            The target process or process group ID is specified in {@code arg}. A process ID is specified as a positive value; a process group ID is specified
            as a negative value. Most commonly, the calling process specifies itself as the owner (that is, {@code arg} is specified as {@code getpid(2)}).

            As well as setting the file descriptor owner, one must also enable generation of signals on the file descriptor. This is done by using the
            {@code fcntl()} #F_SETFL command to set the #O_ASYNC file status flag on the file descriptor. Subsequently, a {@code SIGIO} signal is sent whenever
            input or output becomes possible on the file descriptor. The {@code fcntl()} #F_SETSIG command can be used to obtain delivery of a signal other
            than {@code SIGIO}.

            Sending a signal to the owner process (group) specified by {@code F_SETOWN} is subject to the same permissions checks as are described for
            {@code kill(2)}, where the sending process is the one that employs {@code F_SETOWN} (but see BUGS below). If this permission check fails, then the
            signal is silently discarded. Note: The {@code F_SETOWN} operation records the caller's credentials at the time of the {@code fcntl()} call, and it
            is these saved credentials that are used for the permission checks.

            If the file descriptor {@code fd} refers to a socket, {@code F_SETOWN} also selects the recipient of {@code SIGURG} signals that are delivered when
            out-of-band data arrives on that socket. ({@code SIGURG} is sent in any situation where {@code select(2)} would report the socket as having an
            "exceptional condition".)

            The following was true in 2.6.x kernels up to and including kernel 2.6.11:

            If a nonzero value is given to #F_SETSIG in a multithreaded process running with a threading library that supports thread groups (e.g., NPTL), then
            a positive value given to {@code F_SETOWN} has a different meaning: instead of being a process ID identifying a whole process, it is a thread ID
            identifying a specific thread within a process. Consequently, it may be necessary to pass {@code F_SETOWN} the result of {@code gettid(2)} instead
            of {@code getpid(2)} to get sensible results when {@code F_SETSIG} is used. (In current Linux threading implementations, a main thread's thread ID
            is the same as its process ID. This means that a single-threaded program can equally use {@code gettid(2)} or {@code getpid(2)} in this scenario.)
            Note, however, that the statements in this paragraph do not apply to the {@code SIGURG} signal generated for out-of-band data on a socket: this
            signal is always sent to either a process or a process group, depending on the value given to {@code F_SETOWN}.

            The above behavior was accidentally dropped in Linux 2.6.12, and won't be restored. From Linux 2.6.32 onward, use #F_SETOWN_EX to target
            {@code SIGIO} and {@code SIGURG} signals at a particular thread.
            """,
            "8"
        ),
        "F_GETOWN".enum(
            """
            Return (as the function result) the process ID or process group ID currently receiving {@code SIGIO} and {@code SIGURG} signals for events on file
            descriptor {@code fd}.

            Process IDs are returned as positive values; process group IDs are returned as negative values (but see BUGS below). {@code arg} is ignored.
            """,
            "9"
        ),
        "F_SETSIG".enum(
            """
            Set the signal sent when input or output becomes possible to the value given in {@code arg}.

            A value of zero means to send the default {@code SIGIO} signal. Any other value (including {@code SIGIO}) is the signal to send instead, and in
            this case additional info is available to the signal handler if installed with {@code SA_SIGINFO}.

            By using {@code F_SETSIG} with a nonzero value, and setting {@code SA_SIGINFO} for the signal handler (see {@code sigaction(2)}), extra information
            about I/O events is passed to the handler in a {@code siginfo_t} structure. If the {@code si_code} field indicates the source is {@code SI_SIGIO},
            the {@code si_fd} field gives the file descriptor associated with the event. Otherwise, there is no indication which file descriptors are pending,
            and you should use the usual mechanisms ({@code select(2)}, {@code poll(2)}, {@code read(2)} with {@code O_NONBLOCK} set etc.) to determine which
            file descriptors are available for I/O.

            Note that the file descriptor provided in {@code si_fd} is the one that was specified during the {@code F_SETSIG} operation. This can lead to an
            unusual corner case. If the file descriptor is duplicated ({@code dup(2)} or similar), and the original file descriptor is closed, then I/O events
            will continue to be generated, but the {@code si_fd} field will contain the number of the now closed file descriptor.

            By selecting a real time signal (value &ge; {@code SIGRTMIN}), multiple I/O events may be queued using the same signal numbers. (Queuing is
            dependent on available memory.) Extra information is available if {@code SA_SIGINFO} is set for the signal handler, as above.

            Note that Linux imposes a limit on the number of real-time signals that may be queued to a process (see {@code getrlimit(2)} and {@code signal(7)})
            and if this limit is reached, then the kernel reverts to delivering {@code SIGIO}, and this signal is delivered to the entire process rather than
            to a specific thread.
            """,
            "10"
        ),
        "F_GETSIG".enum(
            """
            Return (as the function result) the signal sent when input or output becomes possible.

            A value of zero means {@code SIGIO} is sent. Any other value (including {@code SIGIO}) is the signal sent instead, and in this case additional info
            is available to the signal handler if installed with {@code SA_SIGINFO}. {@code arg} is ignored.
            """,
            "11"
        ),
        "F_SETOWN_EX".enum(
            """
            This operation performs a similar task to #F_SETOWN. It allows the caller to direct I/O availability signals to a specific thread, process, or
            process group.

            The caller specifies the target of signals via {@code arg}, which is a pointer to a ##FOwnerEx structure. The type field has one of the following
            values, which define how pid is interpreted: #F_OWNER_TID, #F_OWNER_PID, #F_OWNER_PGRP.
            """,
            "15"
        ),
        "F_GETOWN_EX".enum(
            """
            Return the current file descriptor owner settings as defined by a previous #F_SETOWN_EX operation.

            The information is returned in the ##FOwnerEx structure pointed to by {@code arg}.

            The type field will have one of the values #F_OWNER_TID, #F_OWNER_PID, or #F_OWNER_PGRP. The {@code pid} field is a positive integer representing a
            thread ID, process ID, or process group ID. See #F_SETOWN_EX for more details.
            """,
            "16"
        ),
        "F_OFD_GETLK".enum(
            """
            On input to this call, {@code lock} describes an open file description lock we would like to place on the file.

            If the lock could be placed, {@code fcntl()} does not actually place it, but returns #F_UNLCK in the {@code l_type} field of {@code lock} and
            leaves the other fields of the structure unchanged. If one or more incompatible locks would prevent this lock being placed, then details about one
            of these locks are returned via {@code lock}, as described above for #F_GETLK. 
            """,
            "36"
        ),
        "F_OFD_SETLK".enum(
            """
            Acquire an open file description lock (when {@code l_type} is #F_RDLCK or #F_WRLCK) or release an open file description lock (when {@code l_type}
            is #F_UNLCK) on the bytes specified by the {@code l_whence}, {@code l_start}, and {@code l_len} fields of {@code lock}.

            If a conflicting lock is held by another process, this call returns -1 and sets {@code errno} to {@code EAGAIN}.
            """,
            "37"
        ),
        "F_OFD_SETLKW".enum(
            """
            As for #F_OFD_SETLK, but if a conflicting lock is held on the file, then wait for that lock to be released.

            If a signal is caught while waiting, then the call is interrupted and (after the signal handler has returned) returns immediately (with return
            value -1 and {@code errno} set to {@code EINTR}; see {@code signal(7)}).  
            """,
            "38"
        ),
        "F_SETLEASE".enum(
            "Set or remove a file lease according to which of the following values is specified in the integer {@code arg}: #F_RDLCK, #F_WRLCK, #F_UNLCK",
            "1024"
        ),
        "F_GETLEASE".enum(
            """
             Indicates what type of lease is associated with the file descriptor {@code fd} by returning either #F_RDLCK, #F_WRLCK, or #F_UNLCK, indicating,
             respectively, a read lease, a write lease, or no lease. {@code arg} is ignored.
            """,
            "1025"
        ),
        "F_NOTIFY".enum(
            """
            (Linux 2.4 onward) Provide notification when the directory referred to by {@code fd} or any of the files that it contains is changed.

            The events to be notified are specified in {@code arg}, which is a bit mask specified by ORing together zero or more of the following bits:
            #DN_ACCESS, #DN_MODIFY, #DN_CREATE, #DN_DELETE, #DN_RENAME, #DN_ATTRIB

            (In order to obtain these definitions, the {@code _GNU_SOURCE} feature test macro must be defined before including any header files.)

            Directory notifications are normally "one-shot", and the application must reregister to receive further notifications. Alternatively, if
            #DN_MULTISHOT is included in {@code arg}, then notification will remain in effect until explicitly removed.

            A series of {@code F_NOTIFY} requests is cumulative, with the events in {@code arg} being added to the set already monitored. To disable
            notification of all events, make an {@code F_NOTIFY} call specifying {@code arg} as 0.

            Notification occurs via delivery of a signal. The default signal is {@code SIGIO}, but this can be changed using the #F_SETSIG command to
            {@code fcntl()}. (Note that {@code SIGIO} is one of the nonqueuing standard signals; switching to the use of a real-time signal means that multiple
            notifications can be queued to the process.) In the latter case, the signal handler receives a {@code siginfo_t} structure as its second argument
            (if the handler was established using {@code SA_SIGINFO}) and the {@code si_fd} field of this structure contains the file descriptor which
            generated the notification (useful when establishing notification on multiple directories).

            Especially when using {@code DN_MULTISHOT}, a real time signal should be used for notification, so that multiple notifications can be queued.

            NOTE: New applications should use the {@code inotify} interface (available since kernel 2.6.13), which provides a much superior interface for
            obtaining notifications of filesystem events. See {@code inotify(7)}.
            """,
            "1026"
        ),
        "F_SETPIPE_SZ".enum(
            """
            Change the capacity of the pipe referred to by {@code fd} to be at least {@code arg} bytes.

            An unprivileged process can adjust the pipe capacity to any value between the system page size and the limit defined in
            {@code /proc/sys/fs/pipe-max-size} (see {@code proc(5)}). Attempts to set the pipe capacity below the page size are silently rounded up to the page
            size. Attempts by an unprivileged process to set the pipe capacity above the limit in {@code /proc/sys/fs/pipe-max-size} yield the error
            {@code EPERM}; a privileged process ({@code CAP_SYS_RESOURCE}) can override the limit.

            When allocating the buffer for the pipe, the kernel may use a capacity larger than {@code arg}, if that is convenient for the implementation. (In
            the current implementation, the allocation is the next higher power-of-two page-size multiple of the requested size.) The actual capacity (in
            bytes) that is set is returned as the function result.

            Attempting to set the pipe capacity smaller than the amount of buffer space currently used to store data produces the error {@code EBUSY}.

            Note that because of the way the pages of the pipe buffer are employed when data is written to the pipe, the number of bytes that can be written
            may be less than the nominal size, depending on the size of the writes.
            """,
            "1031"
        ),
        "F_GETPIPE_SZ".enum("Return (as the function result) the capacity of the pipe referred to by {@code fd}.", "1032"
        ),
        "F_ADD_SEALS".enum(
            """
            Add the seals given in the bit-mask argument {@code arg} to the set of seals of the {@code inode} referred to by the file descriptor {@code fd}.

            Seals cannot be removed again. Once this call succeeds, the seals are enforced by the kernel immediately. If the current set of seals includes
            #F_SEAL_SEAL (see below), then this call will be rejected with {@code EPERM}. Adding a seal that is already set is a no-op, in case
            {@code F_SEAL_SEAL} is not set already. In order to place a seal, the file descriptor {@code fd} must be writable.
            """,
            "1033"
        ),
        "F_GET_SEALS".enum(
            """
            Return (as the function result) the current set of seals of the {@code inode} referred to by {@code fd}.

            If no seals are set, 0 is returned. If the file does not support sealing, -1 is returned and {@code errno} is set to {@code EINVAL}.
            """,
            "1034"
        ),
        "F_GET_RW_HINT".enum("Returns the value of the read/write hint associated with the underlying {@code inode} referred to by {@code fd}.", "1035"),
        "F_SET_RW_HINT".enum(
            """
            Sets the read/write hint value associated with the underlying {@code inode} referred to by {@code fd}.

            This hint persists until either it is explicitly modified or the underlying filesystem is unmounted.
            """,
            "1036"
        ),
        "F_GET_FILE_RW_HINT".enum("Returns the value of the read/write hint associated with the open file description referred to by {@code fd}.", "1037"),
        "F_SET_FILE_RW_HINT".enum("Sets the read/write hint value associated with the open file description referred to by {@code fd}.", "1038"),
        "F_DUPFD_CLOEXEC".enum(
            """
            As for #F_DUPFD, but additionally set the close-on-exec flag for the duplicate file descriptor.

            Specifying this flag permits a program to avoid an additional {@code fcntl()} #F_SETFD operation to set the #FD_CLOEXEC flag. For an explanation of
            why this flag is useful, see the description of #O_CLOEXEC in {@code open(2)}.
            """,
            "1030"
        )
    ).javaDocLinks

    IntConstant("", "FD_CLOEXEC".."1")

    EnumConstant(
        "For posix #fcntl() and {@code l_type} field of an ##Flock for {@code lockf()}.",

        "F_RDLCK".enum(
            """
            Take out a read lease.

            This will cause the calling process to be notified when the file is opened for writing or is truncated. A read lease can be placed only on a file
            descriptor that is opened read-only.
            """,
            "0"
        ),
        "F_WRLCK".enum(
            """
            Take out a write lease.

            This will cause the caller to be notified when the file is opened for reading or writing or is truncated. A write lease may be placed on a file
            only if there are no other open file descriptors for the file.
            """,
            "1"
        ),
        "F_UNLCK".enum("Remove our lease from the file.", "2"),
        "F_EXLCK".enum("", "4"),
        "F_SHLCK".enum("", "8")
    )

    EnumConstant(
        "##FOwnerEx{@code ::type} values.",

        "F_OWNER_TID".enum(
            """
            Send the signal to the thread whose thread ID (the value returned by a call to {@code clone(2)} or {@code gettid(2)}) is specified in {@code pid}.
            """,
            "0"
        ),
        "F_OWNER_PID".enum(" Send the signal to the process whose ID is specified in {@code pid}.", "1"),
        "F_OWNER_PGRP".enum(
            """
            Send the signal to the process group whose ID is specified in {@code pid}.

            (Note that, unlike with #F_SETOWN, a process group ID is specified as a positive value here.)
            """,
            "2"
        )
    )

    EnumConstant(
        "",

        "LOCK_SH".enum("shared lock", "1"),
        "LOCK_EX".enum("exclusive lock", "2"),
        "LOCK_NB".enum("or'd with one of the above to prevent blocking", "4"),
        "LOCK_UN".enum("remove lock", "8"),
        "LOCK_MAND".enum("This is a mandatory flock...", "32"),
        "LOCK_READ".enum("which allows concurrent read operations", "64"),
        "LOCK_WRITE".enum("which allows concurrent write operations", "128"),
        "LOCK_RW".enum("which allows concurrent read &amp; writes ops", "192")
    )

    EnumConstant(
        "",

        "DN_ACCESS".enum("A file was accessed ({@code read(2)}, {@code pread(2)}, {@code readv(2)}, and similar).", 0x00000001),
        "DN_MODIFY".enum(
            "A file was modified ({@code write(2)}, {@code pwrite(2)}, {@code writev(2)}, {@code truncate(2)}, {@code ftruncate(2)}, and similar).",
            0x00000002
        ),
        "DN_CREATE".enum(
            """
            A file was created ({@code open(2)}, {@code creat(2)}, {@code mknod(2)}, {@code mkdir(2)}, {@code link(2)}, {@code symlink(2)}, {@code rename(2)}
            into this directory).
            """,
            0x00000004
        ),
        "DN_DELETE".enum("A file was unlinked ({@code unlink(2)}, {@code rename(2)} to another directory, {@code rmdir(2)}).", 0x00000008),
        "DN_RENAME".enum("A file was renamed within this directory ({@code rename(2)}).", 0x00000010),
        "DN_ATTRIB".enum(
            "The attributes of a file were changed ({@code chown(2)}, {@code chmod(2)}, {@code utime(2)}, {@code utimensat(2)}, and similar).",
            0x00000020
        ),
        "DN_MULTISHOT".enum("Don't remove notifier", "0x80000000")
    )

    EnumConstant(
        "",

        "F_SEAL_SEAL".enum(
            """
            If this seal is set, any further call to {@code fcntl()} with #F_ADD_SEALS fails with the error {@code EPERM}.

            Therefore, this seal prevents any modifications to the set of seals itself. If the initial set of seals of a file includes {@code F_SEAL_SEAL},
            then this effectively causes the set of seals to be constant and locked.  
            """,
            "0x0001"
        ),
        "F_SEAL_SHRINK".enum(
            """
            If this seal is set, the file in question cannot be reduced in size.

            This affects {@code open(2)} with the #O_TRUNC flag as well as {@code truncate(2)} and {@code ftruncate(2)}. Those calls fail with {@code EPERM} if
            you try to shrink the file in question. Increasing the file size is still possible.  
            """,
            "0x0002"
        ),
        "F_SEAL_GROW".enum(
            """
            If this seal is set, the size of the file in question cannot be increased.

            This affects {@code write(2)} beyond the end of the file, {@code truncate(2)}, {@code ftruncate(2)}, and {@code fallocate(2)}. These calls fail
            with {@code EPERM} if you use them to increase the file size. If you keep the size or shrink it, those calls still work as expected.  
            """,
            "0x0004"
        ),
        "F_SEAL_WRITE".enum(
            """
            If this seal is set, you cannot modify the contents of the file.

            Note that shrinking or growing the size of the file is still possible and allowed. Thus, this seal is normally used in combination with one of the
            other seals. This seal affects {@code write(2)} and {@code fallocate(2)} (only in combination with the {@code FALLOC_FL_PUNCH_HOLE} flag). Those
            calls fail with {@code EPERM} if this seal is set. Furthermore, trying to create new shared, writable memory-mappings via {@code mmap(2)} will also
            fail with {@code EPERM}.

            Using the #F_ADD_SEALS operation to set the {@code F_SEAL_WRITE} seal fails with {@code EBUSY} if any writable, shared mapping exists.  Such
            mappings must be unmapped before you can add this seal. Furthermore, if there are any asynchronous I/O operations ({@code io_submit(2)}) pending on
            the file, all outstanding writes will be discarded.
            """,
            "0x0008"
        ),
        "F_SEAL_FUTURE_WRITE".enum(
            """
            The effect of this seal is similar to #F_SEAL_WRITE, but the contents of the file can still be modified via shared writable mappings that were
            created prior to the seal being set.

            Any attempt to create a new writable mapping on the file via {@code mmap(2)} will fail with {@code EPERM}. Likewise, an attempt to write to the
            file via {@code write(2)} will fail with {@code EPERM}.

            Using this seal, one process can create a memory buffer that it can continue to modify while sharing that buffer on a "read-only" basis with other
            processes.

            (since Linux 5.1)
            """,
            "0x0010"
        )
    )

    EnumConstant(
        "",

        "RWH_WRITE_LIFE_NOT_SET".enum("No specific hint has been set. This is the default value.", "0"),
        "RWH_WRITE_LIFE_NONE".enum("No specific write lifetime is associated with this file or {@code inode}."),
        "RWH_WRITE_LIFE_SHORT".enum("Data written to this {@code inode} or via this open file description is expected to have a short lifetime."),
        "RWH_WRITE_LIFE_MEDIUM".enum(
            """
            Data written to this {@code inode} or via this open file description is expected to have a lifetime longer than data written with
            #RWH_WRITE_LIFE_SHORT.
            """
        ),
        "RWH_WRITE_LIFE_LONG".enum(
            """
            Data written to this {@code inode} or via this open file description is expected to have a lifetime longer than data written with
            #RWH_WRITE_LIFE_MEDIUM.
            """
        ),
        "RWH_WRITE_LIFE_EXTREME".enum(
            """
            Data written to this {@code inode} or via this open file description is expected to have a lifetime longer than data written with
            #RWH_WRITE_LIFE_LONG.
            """
        )
    )

    SaveErrno..int(
        "open",
        """
        Given a {@code pathname} for a file, {@code open()} returns a file descriptor, a small, nonnegative integer for use in subsequent system calls
        ({@code read(2)}, {@code write(2)}, {@code lseek(2)}, {@code fcntl(2)}, etc.).

        The file descriptor returned by a successful call will be the lowest-numbered file descriptor not currently open for the process.
        """,

        charUTF8.const.p("pathname", ""),
        int("flags", ""),
        mode_t("mode", "", ModeBits, LinkMode.BITFIELD),

        returnDoc = "the new file descriptor, or -1 if an error occurred (in which case, {@code errno} is set appropriately)."
    )

    SaveErrno..int(
        "openat",
        """
        The {@code openat()} system call operates in exactly the same way as {@code open(2)}, except for the differences described in this manual page.

        If the pathname given in {@code pathname} is relative, then it is interpreted relative to the directory referred to by the file descriptor
        {@code dirfd} (rather than relative to the current working directory of the calling process, as is done by {@code open(2)} for a relative pathname).

        If {@code pathname} is relative and {@code dirfd} is the special value {@code AT_FDCWD}, then pathname is interpreted relative to the current working
        directory of the calling process (like {@code open(2)}).

        If {@code pathname} is absolute, then {@code dirfd} is ignored.
        """,

        int("dirfd", ""),
        charUTF8.const.p("pathname", ""),
        int("flags", ""),
        mode_t("mode", "", ModeBits, LinkMode.BITFIELD),

        returnDoc = "a new file descriptor on success. On error, -1 is returned and {@code errno} is set to indicate the error."
    )

    SaveErrno..int(
        "creat",
        """
        Equivalent to {@code open()} with {@code flags} equal to {@code O_CREAT|O_WRONLY|O_TRUNC}.
        """,

        charUTF8.const.p("pathname", ""),
        mode_t("mode", "", ModeBits, LinkMode.BITFIELD)
    )

    SaveErrno..int(
        "fcntl",
        """
        Performs one of the operations determined by {@code cmd} on the open file descriptor {@code fd}.

        {@code fcntl()} can take an optional third argument.  Whether or not this argument is required is determined by {@code cmd}. The required argument type
        is indicated in parentheses after each {@code cmd} name (in most cases, the required type is {@code int}, and we identify the argument using the name
        {@code arg}), or {@code void} is specified if the argument is not required.

        <b>LWJGL note</b>: Use #fcntli() or #fcntlp() to pass a third argument of the appropriate type.

        Certain of the operations below are supported only since a particular Linux kernel version. The preferred method of checking whether the host kernel
        supports a particular operation is to invoke {@code fcntl()} with the desired {@code cmd} value and then test whether the call failed with
        {@code EINVAL}, indicating that the kernel does not recognize this value.
        """,

        int("fd", ""),
        int("cmd", "", commands)
    )

    SaveErrno..NativeName("fcntl")..int(
        "fcntli",
        "#fcntl() overload that takes a third argument of type {@code int}.",

        int("fd", ""),
        int("cmd", "", commands),
        int("arg", "")
    )

    SaveErrno..NativeName("fcntl")..int(
        "fcntlp",
        "#fcntl() overload that takes a third argument of type {@code void *}.",

        int("fd", ""),
        int("cmd", "", commands),
        opaque_p("arg", "")
    )
}