/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;fcntl.h&gt;. */
public class FCNTL {

    static { Library.initialize(); }

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #O_ACCMODE O_ACCMODE}</li>
     * <li>{@link #O_RDONLY O_RDONLY}</li>
     * <li>{@link #O_WRONLY O_WRONLY}</li>
     * <li>{@link #O_RDWR O_RDWR}</li>
     * <li>{@link #O_APPEND O_APPEND} - 
     * The file is opened in append mode.
     * 
     * <p>Before each {@code write(2)}, the file offset is positioned at the end of the file, as if with {@code lseek(2)}. {@code O_APPEND} may lead to
     * corrupted files on NFS file systems if more than one process appends data to a file at once. This is because NFS does not support appending to a
     * file, so the client kernel has to simulate it, which can't be done without a race condition.</p>
     * </li>
     * <li>{@link #O_ASYNC O_ASYNC} - 
     * Enable signal-driven I/O: generate a signal ({@code SIGIO} by default, but this can be changed via {@code fcntl(2)}) when input or output becomes
     * possible on this file descriptor.
     * 
     * <p>This feature is only available for terminals, pseudoterminals, sockets, and (since Linux 2.6) pipes and FIFOs. See {@code fcntl(2)} for further
     * details.</p>
     * </li>
     * <li>{@link #O_CLOEXEC O_CLOEXEC} - 
     * Enable the close-on-exec flag for the new file descriptor.
     * 
     * <p>Specifying this flag permits a program to avoid additional {@code fcntl(2) F_SETFD} operations to set the {@code FD_CLOEXEC} flag. Additionally,
     * use of this flag is essential in some multithreaded programs since using a separate {@code fcntl(2) F_SETFD} operation to set the
     * {@code FD_CLOEXEC} flag does not suffice to avoid race conditions where one thread opens a file descriptor at the same time as another thread does
     * a {@code fork(2)} plus {@code execve(2)}.</p>
     * </li>
     * <li>{@link #O_CREAT O_CREAT} - 
     * If the file does not exist it will be created.
     * 
     * <p>The owner (user ID) of the file is set to the effective user ID of the process. The group ownership (group ID) is set either to the effective group
     * ID of the process or to the group ID of the parent directory (depending on file system type and mount options, and the mode of the parent
     * directory, see the mount options {@code bsdgroups} and {@code sysvgroups} described in {@code mount(8)}).</p>
     * </li>
     * <li>{@link #O_DIRECT O_DIRECT} - 
     * Try to minimize cache effects of the I/O to and from this file.
     * 
     * <p>In general this will degrade performance, but it is useful in special situations, such as when applications do their own caching. File I/O is done
     * directly to/from user-space buffers. The {@code O_DIRECT} flag on its own makes an effort to transfer data synchronously, but does not give the
     * guarantees of the {@code O_SYNC} flag that data and necessary metadata are transferred. To guarantee synchronous I/O, {@code O_SYNC} must be used
     * in addition to {@code O_DIRECT}.</p>
     * 
     * <p>A semantically similar (but deprecated) interface for block devices is described in {@code raw(8)}.</p>
     * </li>
     * <li>{@link #O_DIRECTORY O_DIRECTORY} - 
     * If pathname is not a directory, cause the open to fail.
     * 
     * <p>This flag is Linux-specific, and was added in kernel version 2.1.126, to avoid denial-of-service problems if {@code opendir(3)} is called on a FIFO
     * or tape device, but should not be used outside of the implementation of {@code opendir(3)}.</p>
     * </li>
     * <li>{@link #O_DSYNC O_DSYNC}</li>
     * <li>{@link #O_EXCL O_EXCL} - 
     * Ensure that this call creates the file: if this flag is specified in conjunction with {@code O_CREAT}, and pathname already exists, then
     * {@code open()} will fail.
     * 
     * <p>When these two flags are specified, symbolic links are not followed: if {@code pathname} is a symbolic link, then {@code open()} fails regardless
     * of where the symbolic link points to.</p>
     * 
     * <p>In general, the behavior of {@code O_EXCL} is undefined if it is used without {@code O_CREAT}. There is one exception: on Linux 2.6 and later,
     * {@code O_EXCL} can be used without {@code O_CREAT} if {@code pathname} refers to a block device. If the block device is in use by the system (e.g.,
     * mounted), {@code open()} fails with the error {@code EBUSY}.</p>
     * 
     * <p>On NFS, {@code O_EXCL} is only supported when using NFSv3 or later on kernel 2.6 or later. In NFS environments where {@code O_EXCL} support is not
     * provided, programs that rely on it for performing locking tasks will contain a race condition. Portable programs that want to perform atomic file
     * locking using a lockfile, and need to avoid reliance on NFS support for {@code O_EXCL}, can create a unique file on the same file system (e.g.,
     * incorporating hostname and PID), and use {@code link(2)} to make a link to the lockfile. If {@code link(2)} returns 0, the lock is successful.
     * Otherwise, use {@code stat(2)} on the unique file to check if its link count has increased to 2, in which case the lock is also successful.</p>
     * </li>
     * <li>{@link #O_LARGEFILE O_LARGEFILE} - 
     * (LFS) Allow files whose sizes cannot be represented in an {@code off_t} (but can be represented in an {@code off64_t}) to be opened.
     * 
     * <p>The {@code _LARGEFILE64_SOURCE} macro must be defined (before including any header files) in order to obtain this definition. Setting the
     * {@code _FILE_OFFSET_BITS} feature test macro to 64 (rather than using {@code O_LARGEFILE}) is the preferred method of accessing large files on
     * 32-bit systems (see {@code feature_test_macros(7)}).</p>
     * </li>
     * <li>{@link #O_NOATIME O_NOATIME} - 
     * Do not update the file last access time ({@code st_atime} in the {@code inode}) when the file is {@code read(2)}.
     * 
     * <p>This flag is intended for use by indexing or backup programs, where its use can significantly reduce the amount of disk activity. This flag may not
     * be effective on all file systems. One example is NFS, where the server maintains the access time.</p>
     * </li>
     * <li>{@link #O_NOCTTY O_NOCTTY} - 
     * If {@code pathname} refers to a terminal device --see {@code tty(4)}-- it will not become the process's controlling terminal even if the process
     * does not have one.
     * </li>
     * <li>{@link #O_NOFOLLOW O_NOFOLLOW} - 
     * If {@code pathname} is a symbolic link, then the open fails.
     * 
     * <p>This is a FreeBSD extension, which was added to Linux in version 2.1.126. Symbolic links in earlier components of the {@code pathname} will still
     * be followed.</p>
     * </li>
     * <li>{@link #O_NONBLOCK O_NONBLOCK} - 
     * When possible, the file is opened in nonblocking mode.
     * 
     * <p>Neither the {@code open()} nor any subsequent operations on the file descriptor which is returned will cause the calling process to wait. For the
     * handling of FIFOs (named pipes), see also {@code fifo(7)}. For a discussion of the effect of {@code O_NONBLOCK} in conjunction with mandatory file
     * locks and with file leases, see {@code fcntl(2)}.</p>
     * </li>
     * <li>{@link #O_NDELAY O_NDELAY}</li>
     * <li>{@link #O_PATH O_PATH}</li>
     * <li>{@link #O_SYNC O_SYNC} - 
     * The file is opened for synchronous I/O.
     * 
     * <p>Any {@code write(2)}s on the resulting file descriptor will block the calling process until the data has been physically written to the underlying
     * hardware.</p>
     * </li>
     * <li>{@link #O_TMPFILE O_TMPFILE}</li>
     * <li>{@link #O_TRUNC O_TRUNC} - 
     * If the file already exists and is a regular file and the open mode allows writing (i.e., is {@code O_RDWR} or {@code O_WRONLY}) it will be
     * truncated to length 0.
     * 
     * <p>If the file is a FIFO or terminal device file, the {@code O_TRUNC} flag is ignored. Otherwise the effect of {@code O_TRUNC} is unspecified.</p>
     * </li>
     * </ul>
     */
    public static final int
        O_ACCMODE   = 00000003,
        O_RDONLY    = 00000000,
        O_WRONLY    = 00000001,
        O_RDWR      = 00000002,
        O_APPEND    = 00002000,
        O_ASYNC     = 020000,
        O_CLOEXEC   = 02000000,
        O_CREAT     = 00000100,
        O_DIRECT    = 040000,
        O_DIRECTORY = 0200000,
        O_DSYNC     = 00010000,
        O_EXCL      = 00000200,
        O_LARGEFILE = 00100000,
        O_NOATIME   = 01000000,
        O_NOCTTY    = 00000400,
        O_NOFOLLOW  = 00400000,
        O_NONBLOCK  = 00004000,
        O_NDELAY    = O_NONBLOCK,
        O_PATH      = 010000000,
        O_SYNC      = 04010000,
        O_TMPFILE   = 020000000 | O_DIRECTORY,
        O_TRUNC     = 00001000;

    /**
     * File types encoded in type {@code mode_t}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #S_IFMT S_IFMT} - Type of file.</li>
     * <li>{@link #S_IFBLK S_IFBLK} - Block special.</li>
     * <li>{@link #S_IFCHR S_IFCHR} - Character special.</li>
     * <li>{@link #S_IFIFO S_IFIFO} - FIFO special.</li>
     * <li>{@link #S_IFREG S_IFREG} - Regular.</li>
     * <li>{@link #S_IFDIR S_IFDIR} - Directory.</li>
     * <li>{@link #S_IFLNK S_IFLNK} - Symbolic link.</li>
     * <li>{@link #S_IFSOCK S_IFSOCK} - Socket.</li>
     * </ul>
     */
    public static final int
        S_IFMT   = 00170000,
        S_IFBLK  = 0060000,
        S_IFCHR  = 0020000,
        S_IFIFO  = 0010000,
        S_IFREG  = 0100000,
        S_IFDIR  = 0040000,
        S_IFLNK  = 0120000,
        S_IFSOCK = 0140000;

    /**
     * File mode bits encoded in type {@code mode_t}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #S_IRWXU S_IRWXU} - Read, write, execute/search by owner.</li>
     * <li>{@link #S_IRUSR S_IRUSR} - Read permission, owner.</li>
     * <li>{@link #S_IWUSR S_IWUSR} - Write permission, owner.</li>
     * <li>{@link #S_IXUSR S_IXUSR} - Execute/search permission, owner.</li>
     * <li>{@link #S_IRWXG S_IRWXG} - Read, write, execute/search by group.</li>
     * <li>{@link #S_IRGRP S_IRGRP} - Read permission, group.</li>
     * <li>{@link #S_IWGRP S_IWGRP} - Write permission, group.</li>
     * <li>{@link #S_IXGRP S_IXGRP} - Execute/search permission, group.</li>
     * <li>{@link #S_IRWXO S_IRWXO} - Read, write, execute/search by others.</li>
     * <li>{@link #S_IROTH S_IROTH} - Read permission, others.</li>
     * <li>{@link #S_IWOTH S_IWOTH} - Write permission, others.</li>
     * <li>{@link #S_IXOTH S_IXOTH} - Execute/search permission, others.</li>
     * <li>{@link #S_ISUID S_ISUID} - Set-user-ID on execution.</li>
     * <li>{@link #S_ISGID S_ISGID} - Set-group-ID on execution.</li>
     * <li>{@link #S_ISVTX S_ISVTX} - On directories, restricted deletion flag.</li>
     * </ul>
     */
    public static final int
        S_IRWXU = 0700,
        S_IRUSR = 0400,
        S_IWUSR = 0200,
        S_IXUSR = 0100,
        S_IRWXG = 070,
        S_IRGRP = 040,
        S_IWGRP = 020,
        S_IXGRP = 010,
        S_IRWXO = 07,
        S_IROTH = 04,
        S_IWOTH = 02,
        S_IXOTH = 01,
        S_ISUID = 04000,
        S_ISGID = 02000,
        S_ISVTX = 01000;

    /**
     * {@link #fcntl} commands.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #F_DUPFD F_DUPFD} - 
     * Duplicate the file descriptor {@code fd} using the lowest-numbered available file descriptor greater than or equal to {@code arg}.
     * 
     * <p>This is different from {@code dup2(2)}, which uses exactly the file descriptor specified.</p>
     * 
     * <p>On success, the new file descriptor is returned.</p>
     * 
     * <p>See {@code dup(2)} for further details.</p>
     * </li>
     * <li>{@link #F_GETFD F_GETFD} - Return (as the function result) the file descriptor flags; {@code arg} is ignored.</li>
     * <li>{@link #F_SETFD F_SETFD} - Set the file descriptor flags to the value specified by {@code arg}.</li>
     * <li>{@link #F_GETFL F_GETFL} - Return (as the function result) the file access mode and the file status flags; {@code arg} is ignored.</li>
     * <li>{@link #F_SETFL F_SETFL} - 
     * Set the file status flags to the value specified by {@code arg}.
     * 
     * <p>File access mode ({@link #O_RDONLY}, {@link #O_WRONLY}, {@link #O_RDWR}) and file creation flags (i.e., {@link #O_CREAT}, {@link #O_EXCL}, {@link #O_NOCTTY}, {@link #O_TRUNC}) in {@code arg} are ignored.
     * On Linux, this command can change only the {@link #O_APPEND}, {@link #O_ASYNC}, {@link #O_DIRECT}, {@link #O_NOATIME}, and {@link #O_NONBLOCK} flags. It is not possible to change the
     * {@link #O_DSYNC} and {@link #O_SYNC} flags; see BUGS, below.</p>
     * </li>
     * <li>{@link #F_GETLK F_GETLK} - 
     * On input to this call, lock describes a lock we would like to place on the file.
     * 
     * <p>If the lock could be placed, {@code fcntl()} does not actually place it, but returns {@link #F_UNLCK} in the {@code l_type} field of lock and leaves the
     * other fields of the structure unchanged.</p>
     * 
     * <p>If one or more incompatible locks would prevent this lock being placed, then {@code fcntl()} returns details about one of those locks in the
     * {@code l_type}, {@code l_whence}, {@code l_start}, and {@code l_len} fields of lock. If the conflicting lock is a traditional (process-associated)
     * record lock, then the {@code l_pid} field is set to the {@code PID} of the process holding that lock. If the conflicting lock is an open file
     * description lock, then {@code l_pid} is set to -1. Note that the returned information may already be out of date by the time the caller inspects
     * it.</p>
     * </li>
     * <li>{@link #F_SETLK F_SETLK} - 
     * Acquire a lock (when {@code l_type} is {@link #F_RDLCK} or {@link #F_WRLCK}) or release a lock (when {@code l_type} is {@link #F_UNLCK}) on the bytes specified by the
     * {@code l_whence}, {@code l_start}, and {@code l_len} fields of lock.
     * 
     * <p>If a conflicting lock is held by another process, this call returns -1 and sets {@code errno} to {@code EACCES} or {@code EAGAIN}. (The error
     * returned in this case differs across implementations, so POSIX requires a portable application to check for both errors.)</p>
     * </li>
     * <li>{@link #F_SETLKW F_SETLKW} - 
     * As for {@link #F_SETLK}, but if a conflicting lock is held on the file, then wait for that lock to be released.
     * 
     * <p>If a signal is caught while waiting, then the call is interrupted and (after the signal handler has returned) returns immediately (with return
     * value -1 and errno set to {@code EINTR}; see {@code signal(7)}).</p>
     * </li>
     * <li>{@link #F_SETOWN F_SETOWN} - 
     * Set the process ID or process group ID that will receive {@code SIGIO} and {@code SIGURG} signals for events on the file descriptor {@code fd}.
     * 
     * <p>The target process or process group ID is specified in {@code arg}. A process ID is specified as a positive value; a process group ID is specified
     * as a negative value. Most commonly, the calling process specifies itself as the owner (that is, {@code arg} is specified as {@code getpid(2)}).</p>
     * 
     * <p>As well as setting the file descriptor owner, one must also enable generation of signals on the file descriptor. This is done by using the
     * {@code fcntl()} {@link #F_SETFL} command to set the {@link #O_ASYNC} file status flag on the file descriptor. Subsequently, a {@code SIGIO} signal is sent whenever
     * input or output becomes possible on the file descriptor. The {@code fcntl()} {@link #F_SETSIG} command can be used to obtain delivery of a signal other
     * than {@code SIGIO}.</p>
     * 
     * <p>Sending a signal to the owner process (group) specified by {@code F_SETOWN} is subject to the same permissions checks as are described for
     * {@code kill(2)}, where the sending process is the one that employs {@code F_SETOWN} (but see BUGS below). If this permission check fails, then the
     * signal is silently discarded. Note: The {@code F_SETOWN} operation records the caller's credentials at the time of the {@code fcntl()} call, and it
     * is these saved credentials that are used for the permission checks.</p>
     * 
     * <p>If the file descriptor {@code fd} refers to a socket, {@code F_SETOWN} also selects the recipient of {@code SIGURG} signals that are delivered when
     * out-of-band data arrives on that socket. ({@code SIGURG} is sent in any situation where {@code select(2)} would report the socket as having an
     * "exceptional condition".)</p>
     * 
     * <p>The following was true in 2.6.x kernels up to and including kernel 2.6.11:</p>
     * 
     * <p>If a nonzero value is given to {@link #F_SETSIG} in a multithreaded process running with a threading library that supports thread groups (e.g., NPTL), then
     * a positive value given to {@code F_SETOWN} has a different meaning: instead of being a process ID identifying a whole process, it is a thread ID
     * identifying a specific thread within a process. Consequently, it may be necessary to pass {@code F_SETOWN} the result of {@code gettid(2)} instead
     * of {@code getpid(2)} to get sensible results when {@code F_SETSIG} is used. (In current Linux threading implementations, a main thread's thread ID
     * is the same as its process ID. This means that a single-threaded program can equally use {@code gettid(2)} or {@code getpid(2)} in this scenario.)
     * Note, however, that the statements in this paragraph do not apply to the {@code SIGURG} signal generated for out-of-band data on a socket: this
     * signal is always sent to either a process or a process group, depending on the value given to {@code F_SETOWN}.</p>
     * 
     * <p>The above behavior was accidentally dropped in Linux 2.6.12, and won't be restored. From Linux 2.6.32 onward, use {@link #F_SETOWN_EX} to target
     * {@code SIGIO} and {@code SIGURG} signals at a particular thread.</p>
     * </li>
     * <li>{@link #F_GETOWN F_GETOWN} - 
     * Return (as the function result) the process ID or process group ID currently receiving {@code SIGIO} and {@code SIGURG} signals for events on file
     * descriptor {@code fd}.
     * 
     * <p>Process IDs are returned as positive values; process group IDs are returned as negative values (but see BUGS below). {@code arg} is ignored.</p>
     * </li>
     * <li>{@link #F_SETSIG F_SETSIG} - 
     * Set the signal sent when input or output becomes possible to the value given in {@code arg}.
     * 
     * <p>A value of zero means to send the default {@code SIGIO} signal. Any other value (including {@code SIGIO}) is the signal to send instead, and in
     * this case additional info is available to the signal handler if installed with {@code SA_SIGINFO}.</p>
     * 
     * <p>By using {@code F_SETSIG} with a nonzero value, and setting {@code SA_SIGINFO} for the signal handler (see {@code sigaction(2)}), extra information
     * about I/O events is passed to the handler in a {@code siginfo_t} structure. If the {@code si_code} field indicates the source is {@code SI_SIGIO},
     * the {@code si_fd} field gives the file descriptor associated with the event. Otherwise, there is no indication which file descriptors are pending,
     * and you should use the usual mechanisms ({@code select(2)}, {@code poll(2)}, {@code read(2)} with {@code O_NONBLOCK} set etc.) to determine which
     * file descriptors are available for I/O.</p>
     * 
     * <p>Note that the file descriptor provided in {@code si_fd} is the one that was specified during the {@code F_SETSIG} operation. This can lead to an
     * unusual corner case. If the file descriptor is duplicated ({@code dup(2)} or similar), and the original file descriptor is closed, then I/O events
     * will continue to be generated, but the {@code si_fd} field will contain the number of the now closed file descriptor.</p>
     * 
     * <p>By selecting a real time signal (value &ge; {@code SIGRTMIN}), multiple I/O events may be queued using the same signal numbers. (Queuing is
     * dependent on available memory.) Extra information is available if {@code SA_SIGINFO} is set for the signal handler, as above.</p>
     * 
     * <p>Note that Linux imposes a limit on the number of real-time signals that may be queued to a process (see {@code getrlimit(2)} and {@code signal(7)})
     * and if this limit is reached, then the kernel reverts to delivering {@code SIGIO}, and this signal is delivered to the entire process rather than
     * to a specific thread.</p>
     * </li>
     * <li>{@link #F_GETSIG F_GETSIG} - 
     * Return (as the function result) the signal sent when input or output becomes possible.
     * 
     * <p>A value of zero means {@code SIGIO} is sent. Any other value (including {@code SIGIO}) is the signal sent instead, and in this case additional info
     * is available to the signal handler if installed with {@code SA_SIGINFO}. {@code arg} is ignored.</p>
     * </li>
     * <li>{@link #F_SETOWN_EX F_SETOWN_EX} - 
     * This operation performs a similar task to {@link #F_SETOWN}. It allows the caller to direct I/O availability signals to a specific thread, process, or
     * process group.
     * 
     * <p>The caller specifies the target of signals via {@code arg}, which is a pointer to a {@link FOwnerEx} structure. The type field has one of the following
     * values, which define how pid is interpreted: {@link #F_OWNER_TID}, {@link #F_OWNER_PID}, {@link #F_OWNER_PGRP}.</p>
     * </li>
     * <li>{@link #F_GETOWN_EX F_GETOWN_EX} - 
     * Return the current file descriptor owner settings as defined by a previous {@link #F_SETOWN_EX} operation.
     * 
     * <p>The information is returned in the {@link FOwnerEx} structure pointed to by {@code arg}.</p>
     * 
     * <p>The type field will have one of the values {@link #F_OWNER_TID}, {@link #F_OWNER_PID}, or {@link #F_OWNER_PGRP}. The {@code pid} field is a positive integer representing a
     * thread ID, process ID, or process group ID. See {@link #F_SETOWN_EX} for more details.</p>
     * </li>
     * <li>{@link #F_OFD_GETLK F_OFD_GETLK} - 
     * On input to this call, {@code lock} describes an open file description lock we would like to place on the file.
     * 
     * <p>If the lock could be placed, {@code fcntl()} does not actually place it, but returns {@link #F_UNLCK} in the {@code l_type} field of {@code lock} and
     * leaves the other fields of the structure unchanged. If one or more incompatible locks would prevent this lock being placed, then details about one
     * of these locks are returned via {@code lock}, as described above for {@link #F_GETLK}.</p>
     * </li>
     * <li>{@link #F_OFD_SETLK F_OFD_SETLK} - 
     * Acquire an open file description lock (when {@code l_type} is {@link #F_RDLCK} or {@link #F_WRLCK}) or release an open file description lock (when {@code l_type}
     * is {@link #F_UNLCK}) on the bytes specified by the {@code l_whence}, {@code l_start}, and {@code l_len} fields of {@code lock}.
     * 
     * <p>If a conflicting lock is held by another process, this call returns -1 and sets {@code errno} to {@code EAGAIN}.</p>
     * </li>
     * <li>{@link #F_OFD_SETLKW F_OFD_SETLKW} - 
     * As for {@link #F_OFD_SETLK}, but if a conflicting lock is held on the file, then wait for that lock to be released.
     * 
     * <p>If a signal is caught while waiting, then the call is interrupted and (after the signal handler has returned) returns immediately (with return
     * value -1 and {@code errno} set to {@code EINTR}; see {@code signal(7)}).</p>
     * </li>
     * <li>{@link #F_SETLEASE F_SETLEASE} - Set or remove a file lease according to which of the following values is specified in the integer {@code arg}: {@link #F_RDLCK}, {@link #F_WRLCK}, {@link #F_UNLCK}</li>
     * <li>{@link #F_GETLEASE F_GETLEASE} - 
     * Indicates what type of lease is associated with the file descriptor {@code fd} by returning either {@link #F_RDLCK}, {@link #F_WRLCK}, or {@link #F_UNLCK}, indicating,
     * respectively, a read lease, a write lease, or no lease. {@code arg} is ignored.
     * </li>
     * <li>{@link #F_NOTIFY F_NOTIFY} - 
     * (Linux 2.4 onward) Provide notification when the directory referred to by {@code fd} or any of the files that it contains is changed.
     * 
     * <p>The events to be notified are specified in {@code arg}, which is a bit mask specified by ORing together zero or more of the following bits:
     * {@link #DN_ACCESS}, {@link #DN_MODIFY}, {@link #DN_CREATE}, {@link #DN_DELETE}, {@link #DN_RENAME}, {@link #DN_ATTRIB}</p>
     * 
     * <p>(In order to obtain these definitions, the {@code _GNU_SOURCE} feature test macro must be defined before including any header files.)</p>
     * 
     * <p>Directory notifications are normally "one-shot", and the application must reregister to receive further notifications. Alternatively, if
     * {@link #DN_MULTISHOT} is included in {@code arg}, then notification will remain in effect until explicitly removed.</p>
     * 
     * <p>A series of {@code F_NOTIFY} requests is cumulative, with the events in {@code arg} being added to the set already monitored. To disable
     * notification of all events, make an {@code F_NOTIFY} call specifying {@code arg} as 0.</p>
     * 
     * <p>Notification occurs via delivery of a signal. The default signal is {@code SIGIO}, but this can be changed using the {@link #F_SETSIG} command to
     * {@code fcntl()}. (Note that {@code SIGIO} is one of the nonqueuing standard signals; switching to the use of a real-time signal means that multiple
     * notifications can be queued to the process.) In the latter case, the signal handler receives a {@code siginfo_t} structure as its second argument
     * (if the handler was established using {@code SA_SIGINFO}) and the {@code si_fd} field of this structure contains the file descriptor which
     * generated the notification (useful when establishing notification on multiple directories).</p>
     * 
     * <p>Especially when using {@code DN_MULTISHOT}, a real time signal should be used for notification, so that multiple notifications can be queued.</p>
     * 
     * <p>NOTE: New applications should use the {@code inotify} interface (available since kernel 2.6.13), which provides a much superior interface for
     * obtaining notifications of filesystem events. See {@code inotify(7)}.</p>
     * </li>
     * <li>{@link #F_SETPIPE_SZ F_SETPIPE_SZ} - 
     * Change the capacity of the pipe referred to by {@code fd} to be at least {@code arg} bytes.
     * 
     * <p>An unprivileged process can adjust the pipe capacity to any value between the system page size and the limit defined in
     * {@code /proc/sys/fs/pipe-max-size} (see {@code proc(5)}). Attempts to set the pipe capacity below the page size are silently rounded up to the page
     * size. Attempts by an unprivileged process to set the pipe capacity above the limit in {@code /proc/sys/fs/pipe-max-size} yield the error
     * {@code EPERM}; a privileged process ({@code CAP_SYS_RESOURCE}) can override the limit.</p>
     * 
     * <p>When allocating the buffer for the pipe, the kernel may use a capacity larger than {@code arg}, if that is convenient for the implementation. (In
     * the current implementation, the allocation is the next higher power-of-two page-size multiple of the requested size.) The actual capacity (in
     * bytes) that is set is returned as the function result.</p>
     * 
     * <p>Attempting to set the pipe capacity smaller than the amount of buffer space currently used to store data produces the error {@code EBUSY}.</p>
     * 
     * <p>Note that because of the way the pages of the pipe buffer are employed when data is written to the pipe, the number of bytes that can be written
     * may be less than the nominal size, depending on the size of the writes.</p>
     * </li>
     * <li>{@link #F_GETPIPE_SZ F_GETPIPE_SZ} - Return (as the function result) the capacity of the pipe referred to by {@code fd}.</li>
     * <li>{@link #F_ADD_SEALS F_ADD_SEALS} - 
     * Add the seals given in the bit-mask argument {@code arg} to the set of seals of the {@code inode} referred to by the file descriptor {@code fd}.
     * 
     * <p>Seals cannot be removed again. Once this call succeeds, the seals are enforced by the kernel immediately. If the current set of seals includes
     * {@link #F_SEAL_SEAL} (see below), then this call will be rejected with {@code EPERM}. Adding a seal that is already set is a no-op, in case
     * {@code F_SEAL_SEAL} is not set already. In order to place a seal, the file descriptor {@code fd} must be writable.</p>
     * </li>
     * <li>{@link #F_GET_SEALS F_GET_SEALS} - 
     * Return (as the function result) the current set of seals of the {@code inode} referred to by {@code fd}.
     * 
     * <p>If no seals are set, 0 is returned. If the file does not support sealing, -1 is returned and {@code errno} is set to {@code EINVAL}.</p>
     * </li>
     * <li>{@link #F_GET_RW_HINT F_GET_RW_HINT} - Returns the value of the read/write hint associated with the underlying {@code inode} referred to by {@code fd}.</li>
     * <li>{@link #F_SET_RW_HINT F_SET_RW_HINT} - 
     * Sets the read/write hint value associated with the underlying {@code inode} referred to by {@code fd}.
     * 
     * <p>This hint persists until either it is explicitly modified or the underlying filesystem is unmounted.</p>
     * </li>
     * <li>{@link #F_GET_FILE_RW_HINT F_GET_FILE_RW_HINT} - Returns the value of the read/write hint associated with the open file description referred to by {@code fd}.</li>
     * <li>{@link #F_SET_FILE_RW_HINT F_SET_FILE_RW_HINT} - Sets the read/write hint value associated with the open file description referred to by {@code fd}.</li>
     * <li>{@link #F_DUPFD_CLOEXEC F_DUPFD_CLOEXEC} - 
     * As for {@link #F_DUPFD}, but additionally set the close-on-exec flag for the duplicate file descriptor.
     * 
     * <p>Specifying this flag permits a program to avoid an additional {@code fcntl()} {@link #F_SETFD} operation to set the {@link #FD_CLOEXEC} flag. For an explanation of
     * why this flag is useful, see the description of {@link #O_CLOEXEC} in {@code open(2)}.</p>
     * </li>
     * </ul>
     */
    public static final int
        F_DUPFD            = 0,
        F_GETFD            = 1,
        F_SETFD            = 2,
        F_GETFL            = 3,
        F_SETFL            = 4,
        F_GETLK            = 5,
        F_SETLK            = 8,
        F_SETLKW           = 7,
        F_SETOWN           = 8,
        F_GETOWN           = 9,
        F_SETSIG           = 10,
        F_GETSIG           = 11,
        F_SETOWN_EX        = 15,
        F_GETOWN_EX        = 16,
        F_OFD_GETLK        = 36,
        F_OFD_SETLK        = 37,
        F_OFD_SETLKW       = 38,
        F_SETLEASE         = 1024,
        F_GETLEASE         = 1025,
        F_NOTIFY           = 1026,
        F_SETPIPE_SZ       = 1031,
        F_GETPIPE_SZ       = 1032,
        F_ADD_SEALS        = 1033,
        F_GET_SEALS        = 1034,
        F_GET_RW_HINT      = 1035,
        F_SET_RW_HINT      = 1036,
        F_GET_FILE_RW_HINT = 1037,
        F_SET_FILE_RW_HINT = 1038,
        F_DUPFD_CLOEXEC    = 1030;

    public static final int FD_CLOEXEC = 1;

    /**
     * For posix {@link #fcntl} and {@code l_type} field of an {@link Flock} for {@code lockf()}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #F_RDLCK F_RDLCK} - 
     * Take out a read lease.
     * 
     * <p>This will cause the calling process to be notified when the file is opened for writing or is truncated. A read lease can be placed only on a file
     * descriptor that is opened read-only.</p>
     * </li>
     * <li>{@link #F_WRLCK F_WRLCK} - 
     * Take out a write lease.
     * 
     * <p>This will cause the caller to be notified when the file is opened for reading or writing or is truncated. A write lease may be placed on a file
     * only if there are no other open file descriptors for the file.</p>
     * </li>
     * <li>{@link #F_UNLCK F_UNLCK} - Remove our lease from the file.</li>
     * <li>{@link #F_EXLCK F_EXLCK}</li>
     * <li>{@link #F_SHLCK F_SHLCK}</li>
     * </ul>
     */
    public static final int
        F_RDLCK = 0,
        F_WRLCK = 1,
        F_UNLCK = 2,
        F_EXLCK = 4,
        F_SHLCK = 8;

    /**
     * {@link FOwnerEx}{@code ::type} values.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #F_OWNER_TID F_OWNER_TID} - 
     * Send the signal to the thread whose thread ID (the value returned by a call to {@code clone(2)} or {@code gettid(2)}) is specified in {@code pid}.
     * </li>
     * <li>{@link #F_OWNER_PID F_OWNER_PID} -  Send the signal to the process whose ID is specified in {@code pid}.</li>
     * <li>{@link #F_OWNER_PGRP F_OWNER_PGRP} - 
     * Send the signal to the process group whose ID is specified in {@code pid}.
     * 
     * <p>(Note that, unlike with {@link #F_SETOWN}, a process group ID is specified as a positive value here.)</p>
     * </li>
     * </ul>
     */
    public static final int
        F_OWNER_TID  = 0,
        F_OWNER_PID  = 1,
        F_OWNER_PGRP = 2;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LOCK_SH LOCK_SH} - shared lock</li>
     * <li>{@link #LOCK_EX LOCK_EX} - exclusive lock</li>
     * <li>{@link #LOCK_NB LOCK_NB} - or'd with one of the above to prevent blocking</li>
     * <li>{@link #LOCK_UN LOCK_UN} - remove lock</li>
     * <li>{@link #LOCK_MAND LOCK_MAND} - This is a mandatory flock...</li>
     * <li>{@link #LOCK_READ LOCK_READ} - which allows concurrent read operations</li>
     * <li>{@link #LOCK_WRITE LOCK_WRITE} - which allows concurrent write operations</li>
     * <li>{@link #LOCK_RW LOCK_RW} - which allows concurrent read &amp; writes ops</li>
     * </ul>
     */
    public static final int
        LOCK_SH    = 1,
        LOCK_EX    = 2,
        LOCK_NB    = 4,
        LOCK_UN    = 8,
        LOCK_MAND  = 32,
        LOCK_READ  = 64,
        LOCK_WRITE = 128,
        LOCK_RW    = 192;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #DN_ACCESS DN_ACCESS} - A file was accessed ({@code read(2)}, {@code pread(2)}, {@code readv(2)}, and similar).</li>
     * <li>{@link #DN_MODIFY DN_MODIFY} - A file was modified ({@code write(2)}, {@code pwrite(2)}, {@code writev(2)}, {@code truncate(2)}, {@code ftruncate(2)}, and similar).</li>
     * <li>{@link #DN_CREATE DN_CREATE} - 
     * A file was created ({@code open(2)}, {@code creat(2)}, {@code mknod(2)}, {@code mkdir(2)}, {@code link(2)}, {@code symlink(2)}, {@code rename(2)}
     * into this directory).
     * </li>
     * <li>{@link #DN_DELETE DN_DELETE} - A file was unlinked ({@code unlink(2)}, {@code rename(2)} to another directory, {@code rmdir(2)}).</li>
     * <li>{@link #DN_RENAME DN_RENAME} - A file was renamed within this directory ({@code rename(2)}).</li>
     * <li>{@link #DN_ATTRIB DN_ATTRIB} - The attributes of a file were changed ({@code chown(2)}, {@code chmod(2)}, {@code utime(2)}, {@code utimensat(2)}, and similar).</li>
     * <li>{@link #DN_MULTISHOT DN_MULTISHOT} - Don't remove notifier</li>
     * </ul>
     */
    public static final int
        DN_ACCESS    = 0x1,
        DN_MODIFY    = 0x2,
        DN_CREATE    = 0x4,
        DN_DELETE    = 0x8,
        DN_RENAME    = 0x10,
        DN_ATTRIB    = 0x20,
        DN_MULTISHOT = 0x80000000;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #F_SEAL_SEAL F_SEAL_SEAL} - 
     * If this seal is set, any further call to {@code fcntl()} with {@link #F_ADD_SEALS} fails with the error {@code EPERM}.
     * 
     * <p>Therefore, this seal prevents any modifications to the set of seals itself. If the initial set of seals of a file includes {@code F_SEAL_SEAL},
     * then this effectively causes the set of seals to be constant and locked.</p>
     * </li>
     * <li>{@link #F_SEAL_SHRINK F_SEAL_SHRINK} - 
     * If this seal is set, the file in question cannot be reduced in size.
     * 
     * <p>This affects {@code open(2)} with the {@link #O_TRUNC} flag as well as {@code truncate(2)} and {@code ftruncate(2)}. Those calls fail with {@code EPERM} if
     * you try to shrink the file in question. Increasing the file size is still possible.</p>
     * </li>
     * <li>{@link #F_SEAL_GROW F_SEAL_GROW} - 
     * If this seal is set, the size of the file in question cannot be increased.
     * 
     * <p>This affects {@code write(2)} beyond the end of the file, {@code truncate(2)}, {@code ftruncate(2)}, and {@code fallocate(2)}. These calls fail
     * with {@code EPERM} if you use them to increase the file size. If you keep the size or shrink it, those calls still work as expected.</p>
     * </li>
     * <li>{@link #F_SEAL_WRITE F_SEAL_WRITE} - 
     * If this seal is set, you cannot modify the contents of the file.
     * 
     * <p>Note that shrinking or growing the size of the file is still possible and allowed. Thus, this seal is normally used in combination with one of the
     * other seals. This seal affects {@code write(2)} and {@code fallocate(2)} (only in combination with the {@code FALLOC_FL_PUNCH_HOLE} flag). Those
     * calls fail with {@code EPERM} if this seal is set. Furthermore, trying to create new shared, writable memory-mappings via {@code mmap(2)} will also
     * fail with {@code EPERM}.</p>
     * 
     * <p>Using the {@link #F_ADD_SEALS} operation to set the {@code F_SEAL_WRITE} seal fails with {@code EBUSY} if any writable, shared mapping exists.  Such
     * mappings must be unmapped before you can add this seal. Furthermore, if there are any asynchronous I/O operations ({@code io_submit(2)}) pending on
     * the file, all outstanding writes will be discarded.</p>
     * </li>
     * <li>{@link #F_SEAL_FUTURE_WRITE F_SEAL_FUTURE_WRITE} - 
     * The effect of this seal is similar to {@link #F_SEAL_WRITE}, but the contents of the file can still be modified via shared writable mappings that were
     * created prior to the seal being set.
     * 
     * <p>Any attempt to create a new writable mapping on the file via {@code mmap(2)} will fail with {@code EPERM}. Likewise, an attempt to write to the
     * file via {@code write(2)} will fail with {@code EPERM}.</p>
     * 
     * <p>Using this seal, one process can create a memory buffer that it can continue to modify while sharing that buffer on a "read-only" basis with other
     * processes.</p>
     * 
     * <p>(since Linux 5.1)</p>
     * </li>
     * </ul>
     */
    public static final int
        F_SEAL_SEAL         = 0x0001,
        F_SEAL_SHRINK       = 0x0002,
        F_SEAL_GROW         = 0x0004,
        F_SEAL_WRITE        = 0x0008,
        F_SEAL_FUTURE_WRITE = 0x0010;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #RWH_WRITE_LIFE_NOT_SET RWH_WRITE_LIFE_NOT_SET} - No specific hint has been set. This is the default value.</li>
     * <li>{@link #RWH_WRITE_LIFE_NONE RWH_WRITE_LIFE_NONE} - No specific write lifetime is associated with this file or {@code inode}.</li>
     * <li>{@link #RWH_WRITE_LIFE_SHORT RWH_WRITE_LIFE_SHORT} - Data written to this {@code inode} or via this open file description is expected to have a short lifetime.</li>
     * <li>{@link #RWH_WRITE_LIFE_MEDIUM RWH_WRITE_LIFE_MEDIUM} - 
     * Data written to this {@code inode} or via this open file description is expected to have a lifetime longer than data written with
     * {@link #RWH_WRITE_LIFE_SHORT}.
     * </li>
     * <li>{@link #RWH_WRITE_LIFE_LONG RWH_WRITE_LIFE_LONG} - 
     * Data written to this {@code inode} or via this open file description is expected to have a lifetime longer than data written with
     * {@link #RWH_WRITE_LIFE_MEDIUM}.
     * </li>
     * <li>{@link #RWH_WRITE_LIFE_EXTREME RWH_WRITE_LIFE_EXTREME} - 
     * Data written to this {@code inode} or via this open file description is expected to have a lifetime longer than data written with
     * {@link #RWH_WRITE_LIFE_LONG}.
     * </li>
     * </ul>
     */
    public static final int
        RWH_WRITE_LIFE_NOT_SET = 0,
        RWH_WRITE_LIFE_NONE    = 1,
        RWH_WRITE_LIFE_SHORT   = 2,
        RWH_WRITE_LIFE_MEDIUM  = 3,
        RWH_WRITE_LIFE_LONG    = 4,
        RWH_WRITE_LIFE_EXTREME = 5;

    protected FCNTL() {
        throw new UnsupportedOperationException();
    }

    // --- [ open ] ---

    /** Unsafe version of: {@link #open} */
    public static native int nopen(long pathname, int flags, int mode);

    /**
     * Given a {@code pathname} for a file, {@code open()} returns a file descriptor, a small, nonnegative integer for use in subsequent system calls
     * ({@code read(2)}, {@code write(2)}, {@code lseek(2)}, {@code fcntl(2)}, etc.).
     * 
     * <p>The file descriptor returned by a successful call will be the lowest-numbered file descriptor not currently open for the process.</p>
     *
     * @param mode one or more of:<br><table><tr><td>{@link #S_IRWXU}</td><td>{@link #S_IRUSR}</td><td>{@link #S_IWUSR}</td><td>{@link #S_IXUSR}</td><td>{@link #S_IRWXG}</td><td>{@link #S_IRGRP}</td><td>{@link #S_IWGRP}</td><td>{@link #S_IXGRP}</td><td>{@link #S_IRWXO}</td><td>{@link #S_IROTH}</td><td>{@link #S_IWOTH}</td></tr><tr><td>{@link #S_IXOTH}</td><td>{@link #S_ISUID}</td><td>{@link #S_ISGID}</td><td>{@link #S_ISVTX}</td></tr></table>
     *
     * @return the new file descriptor, or -1 if an error occurred (in which case, {@code errno} is set appropriately).
     */
    public static int open(@NativeType("char const *") ByteBuffer pathname, int flags, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkNT1(pathname);
        }
        return nopen(memAddress(pathname), flags, mode);
    }

    /**
     * Given a {@code pathname} for a file, {@code open()} returns a file descriptor, a small, nonnegative integer for use in subsequent system calls
     * ({@code read(2)}, {@code write(2)}, {@code lseek(2)}, {@code fcntl(2)}, etc.).
     * 
     * <p>The file descriptor returned by a successful call will be the lowest-numbered file descriptor not currently open for the process.</p>
     *
     * @param mode one or more of:<br><table><tr><td>{@link #S_IRWXU}</td><td>{@link #S_IRUSR}</td><td>{@link #S_IWUSR}</td><td>{@link #S_IXUSR}</td><td>{@link #S_IRWXG}</td><td>{@link #S_IRGRP}</td><td>{@link #S_IWGRP}</td><td>{@link #S_IXGRP}</td><td>{@link #S_IRWXO}</td><td>{@link #S_IROTH}</td><td>{@link #S_IWOTH}</td></tr><tr><td>{@link #S_IXOTH}</td><td>{@link #S_ISUID}</td><td>{@link #S_ISGID}</td><td>{@link #S_ISVTX}</td></tr></table>
     *
     * @return the new file descriptor, or -1 if an error occurred (in which case, {@code errno} is set appropriately).
     */
    public static int open(@NativeType("char const *") CharSequence pathname, int flags, @NativeType("mode_t") int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            return nopen(pathnameEncoded, flags, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ openat ] ---

    /** Unsafe version of: {@link #openat} */
    public static native int nopenat(int dirfd, long pathname, int flags, int mode);

    /**
     * The {@code openat()} system call operates in exactly the same way as {@code open(2)}, except for the differences described in this manual page.
     * 
     * <p>If the pathname given in {@code pathname} is relative, then it is interpreted relative to the directory referred to by the file descriptor
     * {@code dirfd} (rather than relative to the current working directory of the calling process, as is done by {@code open(2)} for a relative pathname).</p>
     * 
     * <p>If {@code pathname} is relative and {@code dirfd} is the special value {@code AT_FDCWD}, then pathname is interpreted relative to the current working
     * directory of the calling process (like {@code open(2)}).</p>
     * 
     * <p>If {@code pathname} is absolute, then {@code dirfd} is ignored.</p>
     *
     * @param mode one or more of:<br><table><tr><td>{@link #S_IRWXU}</td><td>{@link #S_IRUSR}</td><td>{@link #S_IWUSR}</td><td>{@link #S_IXUSR}</td><td>{@link #S_IRWXG}</td><td>{@link #S_IRGRP}</td><td>{@link #S_IWGRP}</td><td>{@link #S_IXGRP}</td><td>{@link #S_IRWXO}</td><td>{@link #S_IROTH}</td><td>{@link #S_IWOTH}</td></tr><tr><td>{@link #S_IXOTH}</td><td>{@link #S_ISUID}</td><td>{@link #S_ISGID}</td><td>{@link #S_ISVTX}</td></tr></table>
     *
     * @return a new file descriptor on success. On error, -1 is returned and {@code errno} is set to indicate the error.
     */
    public static int openat(int dirfd, @NativeType("char const *") ByteBuffer pathname, int flags, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkNT1(pathname);
        }
        return nopenat(dirfd, memAddress(pathname), flags, mode);
    }

    /**
     * The {@code openat()} system call operates in exactly the same way as {@code open(2)}, except for the differences described in this manual page.
     * 
     * <p>If the pathname given in {@code pathname} is relative, then it is interpreted relative to the directory referred to by the file descriptor
     * {@code dirfd} (rather than relative to the current working directory of the calling process, as is done by {@code open(2)} for a relative pathname).</p>
     * 
     * <p>If {@code pathname} is relative and {@code dirfd} is the special value {@code AT_FDCWD}, then pathname is interpreted relative to the current working
     * directory of the calling process (like {@code open(2)}).</p>
     * 
     * <p>If {@code pathname} is absolute, then {@code dirfd} is ignored.</p>
     *
     * @param mode one or more of:<br><table><tr><td>{@link #S_IRWXU}</td><td>{@link #S_IRUSR}</td><td>{@link #S_IWUSR}</td><td>{@link #S_IXUSR}</td><td>{@link #S_IRWXG}</td><td>{@link #S_IRGRP}</td><td>{@link #S_IWGRP}</td><td>{@link #S_IXGRP}</td><td>{@link #S_IRWXO}</td><td>{@link #S_IROTH}</td><td>{@link #S_IWOTH}</td></tr><tr><td>{@link #S_IXOTH}</td><td>{@link #S_ISUID}</td><td>{@link #S_ISGID}</td><td>{@link #S_ISVTX}</td></tr></table>
     *
     * @return a new file descriptor on success. On error, -1 is returned and {@code errno} is set to indicate the error.
     */
    public static int openat(int dirfd, @NativeType("char const *") CharSequence pathname, int flags, @NativeType("mode_t") int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            return nopenat(dirfd, pathnameEncoded, flags, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ creat ] ---

    /** Unsafe version of: {@link #creat} */
    public static native int ncreat(long pathname, int mode);

    /**
     * Equivalent to {@code open()} with {@code flags} equal to {@code O_CREAT|O_WRONLY|O_TRUNC}.
     *
     * @param mode one or more of:<br><table><tr><td>{@link #S_IRWXU}</td><td>{@link #S_IRUSR}</td><td>{@link #S_IWUSR}</td><td>{@link #S_IXUSR}</td><td>{@link #S_IRWXG}</td><td>{@link #S_IRGRP}</td><td>{@link #S_IWGRP}</td><td>{@link #S_IXGRP}</td><td>{@link #S_IRWXO}</td><td>{@link #S_IROTH}</td><td>{@link #S_IWOTH}</td></tr><tr><td>{@link #S_IXOTH}</td><td>{@link #S_ISUID}</td><td>{@link #S_ISGID}</td><td>{@link #S_ISVTX}</td></tr></table>
     */
    public static int creat(@NativeType("char const *") ByteBuffer pathname, @NativeType("mode_t") int mode) {
        if (CHECKS) {
            checkNT1(pathname);
        }
        return ncreat(memAddress(pathname), mode);
    }

    /**
     * Equivalent to {@code open()} with {@code flags} equal to {@code O_CREAT|O_WRONLY|O_TRUNC}.
     *
     * @param mode one or more of:<br><table><tr><td>{@link #S_IRWXU}</td><td>{@link #S_IRUSR}</td><td>{@link #S_IWUSR}</td><td>{@link #S_IXUSR}</td><td>{@link #S_IRWXG}</td><td>{@link #S_IRGRP}</td><td>{@link #S_IWGRP}</td><td>{@link #S_IXGRP}</td><td>{@link #S_IRWXO}</td><td>{@link #S_IROTH}</td><td>{@link #S_IWOTH}</td></tr><tr><td>{@link #S_IXOTH}</td><td>{@link #S_ISUID}</td><td>{@link #S_ISGID}</td><td>{@link #S_ISVTX}</td></tr></table>
     */
    public static int creat(@NativeType("char const *") CharSequence pathname, @NativeType("mode_t") int mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(pathname, true);
            long pathnameEncoded = stack.getPointerAddress();
            return ncreat(pathnameEncoded, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ fcntl ] ---

    /**
     * Performs one of the operations determined by {@code cmd} on the open file descriptor {@code fd}.
     * 
     * <p>{@code fcntl()} can take an optional third argument.  Whether or not this argument is required is determined by {@code cmd}. The required argument type
     * is indicated in parentheses after each {@code cmd} name (in most cases, the required type is {@code int}, and we identify the argument using the name
     * {@code arg}), or {@code void} is specified if the argument is not required.</p>
     * 
     * <p><b>LWJGL note</b>: Use {@link #fcntli} or {@link #fcntlp} to pass a third argument of the appropriate type.</p>
     * 
     * <p>Certain of the operations below are supported only since a particular Linux kernel version. The preferred method of checking whether the host kernel
     * supports a particular operation is to invoke {@code fcntl()} with the desired {@code cmd} value and then test whether the call failed with
     * {@code EINVAL}, indicating that the kernel does not recognize this value.</p>
     *
     * @param cmd one of:<br><table><tr><td>{@link #F_DUPFD}</td><td>{@link #F_GETFD}</td><td>{@link #F_SETFD}</td><td>{@link #F_GETFL}</td><td>{@link #F_SETFL}</td><td>{@link #F_GETLK}</td><td>{@link #F_SETLK}</td><td>{@link #F_SETLKW}</td></tr><tr><td>{@link #F_SETOWN}</td><td>{@link #F_GETOWN}</td><td>{@link #F_SETSIG}</td><td>{@link #F_GETSIG}</td><td>{@link #F_SETOWN_EX}</td><td>{@link #F_GETOWN_EX}</td><td>{@link #F_OFD_GETLK}</td><td>{@link #F_OFD_SETLK}</td></tr><tr><td>{@link #F_OFD_SETLKW}</td><td>{@link #F_SETLEASE}</td><td>{@link #F_GETLEASE}</td><td>{@link #F_NOTIFY}</td><td>{@link #F_SETPIPE_SZ}</td><td>{@link #F_GETPIPE_SZ}</td><td>{@link #F_ADD_SEALS}</td><td>{@link #F_GET_SEALS}</td></tr><tr><td>{@link #F_GET_RW_HINT}</td><td>{@link #F_SET_RW_HINT}</td><td>{@link #F_GET_FILE_RW_HINT}</td><td>{@link #F_SET_FILE_RW_HINT}</td><td>{@link #F_DUPFD_CLOEXEC}</td></tr></table>
     */
    public static native int fcntl(int fd, int cmd);

    // --- [ fcntli ] ---

    /** Unsafe version of: {@link #fcntli} */
    public static native int nfcntli(int fd, int cmd, int arg);

    /**
     * {@link #fcntl} overload that takes a third argument of type {@code int}.
     *
     * @param cmd one of:<br><table><tr><td>{@link #F_DUPFD}</td><td>{@link #F_GETFD}</td><td>{@link #F_SETFD}</td><td>{@link #F_GETFL}</td><td>{@link #F_SETFL}</td><td>{@link #F_GETLK}</td><td>{@link #F_SETLK}</td><td>{@link #F_SETLKW}</td></tr><tr><td>{@link #F_SETOWN}</td><td>{@link #F_GETOWN}</td><td>{@link #F_SETSIG}</td><td>{@link #F_GETSIG}</td><td>{@link #F_SETOWN_EX}</td><td>{@link #F_GETOWN_EX}</td><td>{@link #F_OFD_GETLK}</td><td>{@link #F_OFD_SETLK}</td></tr><tr><td>{@link #F_OFD_SETLKW}</td><td>{@link #F_SETLEASE}</td><td>{@link #F_GETLEASE}</td><td>{@link #F_NOTIFY}</td><td>{@link #F_SETPIPE_SZ}</td><td>{@link #F_GETPIPE_SZ}</td><td>{@link #F_ADD_SEALS}</td><td>{@link #F_GET_SEALS}</td></tr><tr><td>{@link #F_GET_RW_HINT}</td><td>{@link #F_SET_RW_HINT}</td><td>{@link #F_GET_FILE_RW_HINT}</td><td>{@link #F_SET_FILE_RW_HINT}</td><td>{@link #F_DUPFD_CLOEXEC}</td></tr></table>
     */
    public static int fcntli(int fd, int cmd, int arg) {
        return nfcntli(fd, cmd, arg);
    }

    // --- [ fcntlp ] ---

    /** Unsafe version of: {@link #fcntlp} */
    public static native int nfcntlp(int fd, int cmd, long arg);

    /**
     * {@link #fcntl} overload that takes a third argument of type {@code void *}.
     *
     * @param cmd one of:<br><table><tr><td>{@link #F_DUPFD}</td><td>{@link #F_GETFD}</td><td>{@link #F_SETFD}</td><td>{@link #F_GETFL}</td><td>{@link #F_SETFL}</td><td>{@link #F_GETLK}</td><td>{@link #F_SETLK}</td><td>{@link #F_SETLKW}</td></tr><tr><td>{@link #F_SETOWN}</td><td>{@link #F_GETOWN}</td><td>{@link #F_SETSIG}</td><td>{@link #F_GETSIG}</td><td>{@link #F_SETOWN_EX}</td><td>{@link #F_GETOWN_EX}</td><td>{@link #F_OFD_GETLK}</td><td>{@link #F_OFD_SETLK}</td></tr><tr><td>{@link #F_OFD_SETLKW}</td><td>{@link #F_SETLEASE}</td><td>{@link #F_GETLEASE}</td><td>{@link #F_NOTIFY}</td><td>{@link #F_SETPIPE_SZ}</td><td>{@link #F_GETPIPE_SZ}</td><td>{@link #F_ADD_SEALS}</td><td>{@link #F_GET_SEALS}</td></tr><tr><td>{@link #F_GET_RW_HINT}</td><td>{@link #F_SET_RW_HINT}</td><td>{@link #F_GET_FILE_RW_HINT}</td><td>{@link #F_SET_FILE_RW_HINT}</td><td>{@link #F_DUPFD_CLOEXEC}</td></tr></table>
     */
    public static int fcntlp(int fd, int cmd, @NativeType("void *") long arg) {
        if (CHECKS) {
            check(arg);
        }
        return nfcntlp(fd, cmd, arg);
    }

}