/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux.liburing;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct io_uring_sqe {
 *     __u8 opcode;
 *     __u8 flags;
 *     __u16 ioprio;
 *     __s32 fd;
 *     union {
 *         __u64 off;
 *         __u64 addr2;
 *         struct {
 *             __u32 cmd_op;
 *             __u32 __pad1;
 *         };
 *     };
 *     union {
 *         __u64 addr;
 *         __u64 splice_off_in;
 *         struct {
 *             __u32 level;
 *             __u32 optname;
 *         };
 *     };
 *     __u32 len;
 *     union {
 *         __kernel_rwf_t rw_flags;
 *         __u32 fsync_flags;
 *         __u16 poll_events;
 *         __u32 poll32_events;
 *         __u32 sync_range_flags;
 *         __u32 msg_flags;
 *         __u32 timeout_flags;
 *         __u32 accept_flags;
 *         __u32 cancel_flags;
 *         __u32 open_flags;
 *         __u32 statx_flags;
 *         __u32 fadvise_advice;
 *         __u32 splice_flags;
 *         __u32 rename_flags;
 *         __u32 unlink_flags;
 *         __u32 hardlink_flags;
 *         __u32 xattr_flags;
 *         __u32 msg_ring_flags;
 *         __u32 uring_cmd_flags;
 *         __u32 waitid_flags;
 *         __u32 futex_flags;
 *         __u32 install_fd_flags;
 *         __u32 nop_flags;
 *     };
 *     __u64 user_data;
 *     union {
 *         __u16 buf_index;
 *         __u16 buf_group;
 *     };
 *     __u16 personality;
 *     union {
 *         __s32 splice_fd_in;
 *         __u32 file_index;
 *         __u32 zcrx_ifq_idx;
 *         __u32 optlen;
 *         struct {
 *             __u16 addr_len;
 *             __u16 __pad3[1];
 *         };
 *     };
 *     union {
 *         struct {
 *             __u64 addr3;
 *             __u64 __pad2[1];
 *         };
 *         __u64 optval;
 *         __u8 cmd[0];
 *     };
 * }}</pre>
 */
@NativeType("struct io_uring_sqe")
public class IOURingSQE extends Struct<IOURingSQE> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPCODE,
        FLAGS,
        IOPRIO,
        FD,
        OFF,
        ADDR2,
        CMD_OP,
        __PAD1,
        ADDR,
        SPLICE_OFF_IN,
        LEVEL,
        OPTNAME,
        LEN,
        RW_FLAGS,
        FSYNC_FLAGS,
        POLL_EVENTS,
        POLL32_EVENTS,
        SYNC_RANGE_FLAGS,
        MSG_FLAGS,
        TIMEOUT_FLAGS,
        ACCEPT_FLAGS,
        CANCEL_FLAGS,
        OPEN_FLAGS,
        STATX_FLAGS,
        FADVISE_ADVICE,
        SPLICE_FLAGS,
        RENAME_FLAGS,
        UNLINK_FLAGS,
        HARDLINK_FLAGS,
        XATTR_FLAGS,
        MSG_RING_FLAGS,
        URING_CMD_FLAGS,
        WAITID_FLAGS,
        FUTEX_FLAGS,
        INSTALL_FD_FLAGS,
        NOP_FLAGS,
        USER_DATA,
        BUF_INDEX,
        BUF_GROUP,
        PERSONALITY,
        SPLICE_FD_IN,
        FILE_INDEX,
        ZCRX_IFQ_IDX,
        OPTLEN,
        ADDR_LEN,
        __PAD3,
        ADDR3,
        __PAD2,
        OPTVAL,
        CMD;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1),
            __member(2),
            __member(4),
            __union(
                __member(8),
                __member(8),
                __struct(
                    __member(4),
                    __member(4)
                )
            ),
            __union(
                __member(8),
                __member(8),
                __struct(
                    __member(4),
                    __member(4)
                )
            ),
            __member(4),
            __union(
                __member(4),
                __member(4),
                __member(2),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __member(4)
            ),
            __member(8),
            __union(
                __member(2),
                __member(2)
            ),
            __member(2),
            __union(
                __member(4),
                __member(4),
                __member(4),
                __member(4),
                __struct(
                    __member(2),
                    __array(2, 1)
                )
            ),
            __union(
                __struct(
                    __member(8),
                    __array(8, 1)
                ),
                __member(8),
                __array(1, 0)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPCODE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        IOPRIO = layout.offsetof(2);
        FD = layout.offsetof(3);
        OFF = layout.offsetof(5);
        ADDR2 = layout.offsetof(6);
        CMD_OP = layout.offsetof(8);
        __PAD1 = layout.offsetof(9);
        ADDR = layout.offsetof(11);
        SPLICE_OFF_IN = layout.offsetof(12);
        LEVEL = layout.offsetof(14);
        OPTNAME = layout.offsetof(15);
        LEN = layout.offsetof(16);
        RW_FLAGS = layout.offsetof(18);
        FSYNC_FLAGS = layout.offsetof(19);
        POLL_EVENTS = layout.offsetof(20);
        POLL32_EVENTS = layout.offsetof(21);
        SYNC_RANGE_FLAGS = layout.offsetof(22);
        MSG_FLAGS = layout.offsetof(23);
        TIMEOUT_FLAGS = layout.offsetof(24);
        ACCEPT_FLAGS = layout.offsetof(25);
        CANCEL_FLAGS = layout.offsetof(26);
        OPEN_FLAGS = layout.offsetof(27);
        STATX_FLAGS = layout.offsetof(28);
        FADVISE_ADVICE = layout.offsetof(29);
        SPLICE_FLAGS = layout.offsetof(30);
        RENAME_FLAGS = layout.offsetof(31);
        UNLINK_FLAGS = layout.offsetof(32);
        HARDLINK_FLAGS = layout.offsetof(33);
        XATTR_FLAGS = layout.offsetof(34);
        MSG_RING_FLAGS = layout.offsetof(35);
        URING_CMD_FLAGS = layout.offsetof(36);
        WAITID_FLAGS = layout.offsetof(37);
        FUTEX_FLAGS = layout.offsetof(38);
        INSTALL_FD_FLAGS = layout.offsetof(39);
        NOP_FLAGS = layout.offsetof(40);
        USER_DATA = layout.offsetof(41);
        BUF_INDEX = layout.offsetof(43);
        BUF_GROUP = layout.offsetof(44);
        PERSONALITY = layout.offsetof(45);
        SPLICE_FD_IN = layout.offsetof(47);
        FILE_INDEX = layout.offsetof(48);
        ZCRX_IFQ_IDX = layout.offsetof(49);
        OPTLEN = layout.offsetof(50);
        ADDR_LEN = layout.offsetof(52);
        __PAD3 = layout.offsetof(53);
        ADDR3 = layout.offsetof(56);
        __PAD2 = layout.offsetof(57);
        OPTVAL = layout.offsetof(58);
        CMD = layout.offsetof(59);
    }

    protected IOURingSQE(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IOURingSQE create(long address, @Nullable ByteBuffer container) {
        return new IOURingSQE(address, container);
    }

    /**
     * Creates a {@code IOURingSQE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IOURingSQE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code opcode} field. */
    @NativeType("__u8")
    public byte opcode() { return nopcode(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("__u8")
    public byte flags() { return nflags(address()); }
    /** @return the value of the {@code ioprio} field. */
    @NativeType("__u16")
    public short ioprio() { return nioprio(address()); }
    /** @return the value of the {@code fd} field. */
    @NativeType("__s32")
    public int fd() { return nfd(address()); }
    /** @return the value of the {@code off} field. */
    @NativeType("__u64")
    public long off() { return noff(address()); }
    /** @return the value of the {@code addr2} field. */
    @NativeType("__u64")
    public long addr2() { return naddr2(address()); }
    /** @return the value of the {@code cmd_op} field. */
    @NativeType("__u32")
    public int cmd_op() { return ncmd_op(address()); }
    /** @return the value of the {@code __pad1} field. */
    @NativeType("__u32")
    public int __pad1() { return n__pad1(address()); }
    /** @return the value of the {@code addr} field. */
    @NativeType("__u64")
    public long addr() { return naddr(address()); }
    /** @return the value of the {@code splice_off_in} field. */
    @NativeType("__u64")
    public long splice_off_in() { return nsplice_off_in(address()); }
    /** @return the value of the {@code level} field. */
    @NativeType("__u32")
    public int level() { return nlevel(address()); }
    /** @return the value of the {@code optname} field. */
    @NativeType("__u32")
    public int optname() { return noptname(address()); }
    /** @return the value of the {@code len} field. */
    @NativeType("__u32")
    public int len() { return nlen(address()); }
    /** @return the value of the {@code rw_flags} field. */
    @NativeType("__kernel_rwf_t")
    public int rw_flags() { return nrw_flags(address()); }
    /** @return the value of the {@code fsync_flags} field. */
    @NativeType("__u32")
    public int fsync_flags() { return nfsync_flags(address()); }
    /** @return the value of the {@code poll_events} field. */
    @NativeType("__u16")
    public short poll_events() { return npoll_events(address()); }
    /** @return the value of the {@code poll32_events} field. */
    @NativeType("__u32")
    public int poll32_events() { return npoll32_events(address()); }
    /** @return the value of the {@code sync_range_flags} field. */
    @NativeType("__u32")
    public int sync_range_flags() { return nsync_range_flags(address()); }
    /** @return the value of the {@code msg_flags} field. */
    @NativeType("__u32")
    public int msg_flags() { return nmsg_flags(address()); }
    /** @return the value of the {@code timeout_flags} field. */
    @NativeType("__u32")
    public int timeout_flags() { return ntimeout_flags(address()); }
    /** @return the value of the {@code accept_flags} field. */
    @NativeType("__u32")
    public int accept_flags() { return naccept_flags(address()); }
    /** @return the value of the {@code cancel_flags} field. */
    @NativeType("__u32")
    public int cancel_flags() { return ncancel_flags(address()); }
    /** @return the value of the {@code open_flags} field. */
    @NativeType("__u32")
    public int open_flags() { return nopen_flags(address()); }
    /** @return the value of the {@code statx_flags} field. */
    @NativeType("__u32")
    public int statx_flags() { return nstatx_flags(address()); }
    /** @return the value of the {@code fadvise_advice} field. */
    @NativeType("__u32")
    public int fadvise_advice() { return nfadvise_advice(address()); }
    /** @return the value of the {@code splice_flags} field. */
    @NativeType("__u32")
    public int splice_flags() { return nsplice_flags(address()); }
    /** @return the value of the {@code rename_flags} field. */
    @NativeType("__u32")
    public int rename_flags() { return nrename_flags(address()); }
    /** @return the value of the {@code unlink_flags} field. */
    @NativeType("__u32")
    public int unlink_flags() { return nunlink_flags(address()); }
    /** @return the value of the {@code hardlink_flags} field. */
    @NativeType("__u32")
    public int hardlink_flags() { return nhardlink_flags(address()); }
    /** @return the value of the {@code xattr_flags} field. */
    @NativeType("__u32")
    public int xattr_flags() { return nxattr_flags(address()); }
    /** @return the value of the {@code msg_ring_flags} field. */
    @NativeType("__u32")
    public int msg_ring_flags() { return nmsg_ring_flags(address()); }
    /** @return the value of the {@code uring_cmd_flags} field. */
    @NativeType("__u32")
    public int uring_cmd_flags() { return nuring_cmd_flags(address()); }
    /** @return the value of the {@code waitid_flags} field. */
    @NativeType("__u32")
    public int waitid_flags() { return nwaitid_flags(address()); }
    /** @return the value of the {@code futex_flags} field. */
    @NativeType("__u32")
    public int futex_flags() { return nfutex_flags(address()); }
    /** @return the value of the {@code install_fd_flags} field. */
    @NativeType("__u32")
    public int install_fd_flags() { return ninstall_fd_flags(address()); }
    /** @return the value of the {@code nop_flags} field. */
    @NativeType("__u32")
    public int nop_flags() { return nnop_flags(address()); }
    /** @return the value of the {@code user_data} field. */
    @NativeType("__u64")
    public long user_data() { return nuser_data(address()); }
    /** @return the value of the {@code buf_index} field. */
    @NativeType("__u16")
    public short buf_index() { return nbuf_index(address()); }
    /** @return the value of the {@code buf_group} field. */
    @NativeType("__u16")
    public short buf_group() { return nbuf_group(address()); }
    /** @return the value of the {@code personality} field. */
    @NativeType("__u16")
    public short personality() { return npersonality(address()); }
    /** @return the value of the {@code splice_fd_in} field. */
    @NativeType("__s32")
    public int splice_fd_in() { return nsplice_fd_in(address()); }
    /** @return the value of the {@code file_index} field. */
    @NativeType("__u32")
    public int file_index() { return nfile_index(address()); }
    /** @return the value of the {@code zcrx_ifq_idx} field. */
    @NativeType("__u32")
    public int zcrx_ifq_idx() { return nzcrx_ifq_idx(address()); }
    /** @return the value of the {@code optlen} field. */
    @NativeType("__u32")
    public int optlen() { return noptlen(address()); }
    /** @return the value of the {@code addr_len} field. */
    @NativeType("__u16")
    public short addr_len() { return naddr_len(address()); }
    /** @return a {@link ShortBuffer} view of the {@code __pad3} field. */
    @NativeType("__u16[1]")
    public ShortBuffer __pad3() { return n__pad3(address()); }
    /** @return the value at the specified index of the {@code __pad3} field. */
    @NativeType("__u16")
    public short __pad3(int index) { return n__pad3(address(), index); }
    /** @return the value of the {@code addr3} field. */
    @NativeType("__u64")
    public long addr3() { return naddr3(address()); }
    /** @return a {@link LongBuffer} view of the {@code __pad2} field. */
    @NativeType("__u64[1]")
    public LongBuffer __pad2() { return n__pad2(address()); }
    /** @return the value at the specified index of the {@code __pad2} field. */
    @NativeType("__u64")
    public long __pad2(int index) { return n__pad2(address(), index); }
    /** @return the value of the {@code optval} field. */
    @NativeType("__u64")
    public long optval() { return noptval(address()); }
    /** @return a {@link ByteBuffer} view of the {@code cmd} field. */
    @NativeType("__u8[0]")
    public ByteBuffer cmd() { return ncmd(address()); }
    /** @return the value at the specified index of the {@code cmd} field. */
    @NativeType("__u8")
    public byte cmd(int index) { return ncmd(address(), index); }

    /** Sets the specified value to the {@code opcode} field. */
    public IOURingSQE opcode(@NativeType("__u8") byte value) { nopcode(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public IOURingSQE flags(@NativeType("__u8") byte value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code ioprio} field. */
    public IOURingSQE ioprio(@NativeType("__u16") short value) { nioprio(address(), value); return this; }
    /** Sets the specified value to the {@code fd} field. */
    public IOURingSQE fd(@NativeType("__s32") int value) { nfd(address(), value); return this; }
    /** Sets the specified value to the {@code off} field. */
    public IOURingSQE off(@NativeType("__u64") long value) { noff(address(), value); return this; }
    /** Sets the specified value to the {@code addr2} field. */
    public IOURingSQE addr2(@NativeType("__u64") long value) { naddr2(address(), value); return this; }
    /** Sets the specified value to the {@code cmd_op} field. */
    public IOURingSQE cmd_op(@NativeType("__u32") int value) { ncmd_op(address(), value); return this; }
    /** Sets the specified value to the {@code __pad1} field. */
    public IOURingSQE __pad1(@NativeType("__u32") int value) { n__pad1(address(), value); return this; }
    /** Sets the specified value to the {@code addr} field. */
    public IOURingSQE addr(@NativeType("__u64") long value) { naddr(address(), value); return this; }
    /** Sets the specified value to the {@code splice_off_in} field. */
    public IOURingSQE splice_off_in(@NativeType("__u64") long value) { nsplice_off_in(address(), value); return this; }
    /** Sets the specified value to the {@code level} field. */
    public IOURingSQE level(@NativeType("__u32") int value) { nlevel(address(), value); return this; }
    /** Sets the specified value to the {@code optname} field. */
    public IOURingSQE optname(@NativeType("__u32") int value) { noptname(address(), value); return this; }
    /** Sets the specified value to the {@code len} field. */
    public IOURingSQE len(@NativeType("__u32") int value) { nlen(address(), value); return this; }
    /** Sets the specified value to the {@code rw_flags} field. */
    public IOURingSQE rw_flags(@NativeType("__kernel_rwf_t") int value) { nrw_flags(address(), value); return this; }
    /** Sets the specified value to the {@code fsync_flags} field. */
    public IOURingSQE fsync_flags(@NativeType("__u32") int value) { nfsync_flags(address(), value); return this; }
    /** Sets the specified value to the {@code poll_events} field. */
    public IOURingSQE poll_events(@NativeType("__u16") short value) { npoll_events(address(), value); return this; }
    /** Sets the specified value to the {@code poll32_events} field. */
    public IOURingSQE poll32_events(@NativeType("__u32") int value) { npoll32_events(address(), value); return this; }
    /** Sets the specified value to the {@code sync_range_flags} field. */
    public IOURingSQE sync_range_flags(@NativeType("__u32") int value) { nsync_range_flags(address(), value); return this; }
    /** Sets the specified value to the {@code msg_flags} field. */
    public IOURingSQE msg_flags(@NativeType("__u32") int value) { nmsg_flags(address(), value); return this; }
    /** Sets the specified value to the {@code timeout_flags} field. */
    public IOURingSQE timeout_flags(@NativeType("__u32") int value) { ntimeout_flags(address(), value); return this; }
    /** Sets the specified value to the {@code accept_flags} field. */
    public IOURingSQE accept_flags(@NativeType("__u32") int value) { naccept_flags(address(), value); return this; }
    /** Sets the specified value to the {@code cancel_flags} field. */
    public IOURingSQE cancel_flags(@NativeType("__u32") int value) { ncancel_flags(address(), value); return this; }
    /** Sets the specified value to the {@code open_flags} field. */
    public IOURingSQE open_flags(@NativeType("__u32") int value) { nopen_flags(address(), value); return this; }
    /** Sets the specified value to the {@code statx_flags} field. */
    public IOURingSQE statx_flags(@NativeType("__u32") int value) { nstatx_flags(address(), value); return this; }
    /** Sets the specified value to the {@code fadvise_advice} field. */
    public IOURingSQE fadvise_advice(@NativeType("__u32") int value) { nfadvise_advice(address(), value); return this; }
    /** Sets the specified value to the {@code splice_flags} field. */
    public IOURingSQE splice_flags(@NativeType("__u32") int value) { nsplice_flags(address(), value); return this; }
    /** Sets the specified value to the {@code rename_flags} field. */
    public IOURingSQE rename_flags(@NativeType("__u32") int value) { nrename_flags(address(), value); return this; }
    /** Sets the specified value to the {@code unlink_flags} field. */
    public IOURingSQE unlink_flags(@NativeType("__u32") int value) { nunlink_flags(address(), value); return this; }
    /** Sets the specified value to the {@code hardlink_flags} field. */
    public IOURingSQE hardlink_flags(@NativeType("__u32") int value) { nhardlink_flags(address(), value); return this; }
    /** Sets the specified value to the {@code xattr_flags} field. */
    public IOURingSQE xattr_flags(@NativeType("__u32") int value) { nxattr_flags(address(), value); return this; }
    /** Sets the specified value to the {@code msg_ring_flags} field. */
    public IOURingSQE msg_ring_flags(@NativeType("__u32") int value) { nmsg_ring_flags(address(), value); return this; }
    /** Sets the specified value to the {@code uring_cmd_flags} field. */
    public IOURingSQE uring_cmd_flags(@NativeType("__u32") int value) { nuring_cmd_flags(address(), value); return this; }
    /** Sets the specified value to the {@code waitid_flags} field. */
    public IOURingSQE waitid_flags(@NativeType("__u32") int value) { nwaitid_flags(address(), value); return this; }
    /** Sets the specified value to the {@code futex_flags} field. */
    public IOURingSQE futex_flags(@NativeType("__u32") int value) { nfutex_flags(address(), value); return this; }
    /** Sets the specified value to the {@code install_fd_flags} field. */
    public IOURingSQE install_fd_flags(@NativeType("__u32") int value) { ninstall_fd_flags(address(), value); return this; }
    /** Sets the specified value to the {@code nop_flags} field. */
    public IOURingSQE nop_flags(@NativeType("__u32") int value) { nnop_flags(address(), value); return this; }
    /** Sets the specified value to the {@code user_data} field. */
    public IOURingSQE user_data(@NativeType("__u64") long value) { nuser_data(address(), value); return this; }
    /** Sets the specified value to the {@code buf_index} field. */
    public IOURingSQE buf_index(@NativeType("__u16") short value) { nbuf_index(address(), value); return this; }
    /** Sets the specified value to the {@code buf_group} field. */
    public IOURingSQE buf_group(@NativeType("__u16") short value) { nbuf_group(address(), value); return this; }
    /** Sets the specified value to the {@code personality} field. */
    public IOURingSQE personality(@NativeType("__u16") short value) { npersonality(address(), value); return this; }
    /** Sets the specified value to the {@code splice_fd_in} field. */
    public IOURingSQE splice_fd_in(@NativeType("__s32") int value) { nsplice_fd_in(address(), value); return this; }
    /** Sets the specified value to the {@code file_index} field. */
    public IOURingSQE file_index(@NativeType("__u32") int value) { nfile_index(address(), value); return this; }
    /** Sets the specified value to the {@code zcrx_ifq_idx} field. */
    public IOURingSQE zcrx_ifq_idx(@NativeType("__u32") int value) { nzcrx_ifq_idx(address(), value); return this; }
    /** Sets the specified value to the {@code optlen} field. */
    public IOURingSQE optlen(@NativeType("__u32") int value) { noptlen(address(), value); return this; }
    /** Sets the specified value to the {@code addr_len} field. */
    public IOURingSQE addr_len(@NativeType("__u16") short value) { naddr_len(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code __pad3} field. */
    public IOURingSQE __pad3(@NativeType("__u16[1]") ShortBuffer value) { n__pad3(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code __pad3} field. */
    public IOURingSQE __pad3(int index, @NativeType("__u16") short value) { n__pad3(address(), index, value); return this; }
    /** Sets the specified value to the {@code addr3} field. */
    public IOURingSQE addr3(@NativeType("__u64") long value) { naddr3(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code __pad2} field. */
    public IOURingSQE __pad2(@NativeType("__u64[1]") LongBuffer value) { n__pad2(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code __pad2} field. */
    public IOURingSQE __pad2(int index, @NativeType("__u64") long value) { n__pad2(address(), index, value); return this; }
    /** Sets the specified value to the {@code optval} field. */
    public IOURingSQE optval(@NativeType("__u64") long value) { noptval(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code cmd} field. */
    public IOURingSQE cmd(@NativeType("__u8[0]") ByteBuffer value) { ncmd(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code cmd} field. */
    public IOURingSQE cmd(int index, @NativeType("__u8") byte value) { ncmd(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IOURingSQE set(IOURingSQE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IOURingSQE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IOURingSQE malloc() {
        return new IOURingSQE(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IOURingSQE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IOURingSQE calloc() {
        return new IOURingSQE(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IOURingSQE} instance allocated with {@link BufferUtils}. */
    public static IOURingSQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingSQE(memAddress(container), container);
    }

    /** Returns a new {@code IOURingSQE} instance for the specified memory address. */
    public static IOURingSQE create(long address) {
        return new IOURingSQE(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IOURingSQE createSafe(long address) {
        return address == NULL ? null : new IOURingSQE(address, null);
    }

    /**
     * Returns a new {@link IOURingSQE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSQE.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IOURingSQE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSQE.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingSQE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IOURingSQE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IOURingSQE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IOURingSQE.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IOURingSQE.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code IOURingSQE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingSQE malloc(MemoryStack stack) {
        return new IOURingSQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IOURingSQE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IOURingSQE calloc(MemoryStack stack) {
        return new IOURingSQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IOURingSQE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingSQE.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IOURingSQE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IOURingSQE.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #opcode}. */
    public static byte nopcode(long struct) { return memGetByte(struct + IOURingSQE.OPCODE); }
    /** Unsafe version of {@link #flags}. */
    public static byte nflags(long struct) { return memGetByte(struct + IOURingSQE.FLAGS); }
    /** Unsafe version of {@link #ioprio}. */
    public static short nioprio(long struct) { return memGetShort(struct + IOURingSQE.IOPRIO); }
    /** Unsafe version of {@link #fd}. */
    public static int nfd(long struct) { return memGetInt(struct + IOURingSQE.FD); }
    /** Unsafe version of {@link #off}. */
    public static long noff(long struct) { return memGetLong(struct + IOURingSQE.OFF); }
    /** Unsafe version of {@link #addr2}. */
    public static long naddr2(long struct) { return memGetLong(struct + IOURingSQE.ADDR2); }
    /** Unsafe version of {@link #cmd_op}. */
    public static int ncmd_op(long struct) { return memGetInt(struct + IOURingSQE.CMD_OP); }
    public static int n__pad1(long struct) { return memGetInt(struct + IOURingSQE.__PAD1); }
    /** Unsafe version of {@link #addr}. */
    public static long naddr(long struct) { return memGetLong(struct + IOURingSQE.ADDR); }
    /** Unsafe version of {@link #splice_off_in}. */
    public static long nsplice_off_in(long struct) { return memGetLong(struct + IOURingSQE.SPLICE_OFF_IN); }
    /** Unsafe version of {@link #level}. */
    public static int nlevel(long struct) { return memGetInt(struct + IOURingSQE.LEVEL); }
    /** Unsafe version of {@link #optname}. */
    public static int noptname(long struct) { return memGetInt(struct + IOURingSQE.OPTNAME); }
    /** Unsafe version of {@link #len}. */
    public static int nlen(long struct) { return memGetInt(struct + IOURingSQE.LEN); }
    /** Unsafe version of {@link #rw_flags}. */
    public static int nrw_flags(long struct) { return memGetInt(struct + IOURingSQE.RW_FLAGS); }
    /** Unsafe version of {@link #fsync_flags}. */
    public static int nfsync_flags(long struct) { return memGetInt(struct + IOURingSQE.FSYNC_FLAGS); }
    /** Unsafe version of {@link #poll_events}. */
    public static short npoll_events(long struct) { return memGetShort(struct + IOURingSQE.POLL_EVENTS); }
    /** Unsafe version of {@link #poll32_events}. */
    public static int npoll32_events(long struct) { return memGetInt(struct + IOURingSQE.POLL32_EVENTS); }
    /** Unsafe version of {@link #sync_range_flags}. */
    public static int nsync_range_flags(long struct) { return memGetInt(struct + IOURingSQE.SYNC_RANGE_FLAGS); }
    /** Unsafe version of {@link #msg_flags}. */
    public static int nmsg_flags(long struct) { return memGetInt(struct + IOURingSQE.MSG_FLAGS); }
    /** Unsafe version of {@link #timeout_flags}. */
    public static int ntimeout_flags(long struct) { return memGetInt(struct + IOURingSQE.TIMEOUT_FLAGS); }
    /** Unsafe version of {@link #accept_flags}. */
    public static int naccept_flags(long struct) { return memGetInt(struct + IOURingSQE.ACCEPT_FLAGS); }
    /** Unsafe version of {@link #cancel_flags}. */
    public static int ncancel_flags(long struct) { return memGetInt(struct + IOURingSQE.CANCEL_FLAGS); }
    /** Unsafe version of {@link #open_flags}. */
    public static int nopen_flags(long struct) { return memGetInt(struct + IOURingSQE.OPEN_FLAGS); }
    /** Unsafe version of {@link #statx_flags}. */
    public static int nstatx_flags(long struct) { return memGetInt(struct + IOURingSQE.STATX_FLAGS); }
    /** Unsafe version of {@link #fadvise_advice}. */
    public static int nfadvise_advice(long struct) { return memGetInt(struct + IOURingSQE.FADVISE_ADVICE); }
    /** Unsafe version of {@link #splice_flags}. */
    public static int nsplice_flags(long struct) { return memGetInt(struct + IOURingSQE.SPLICE_FLAGS); }
    /** Unsafe version of {@link #rename_flags}. */
    public static int nrename_flags(long struct) { return memGetInt(struct + IOURingSQE.RENAME_FLAGS); }
    /** Unsafe version of {@link #unlink_flags}. */
    public static int nunlink_flags(long struct) { return memGetInt(struct + IOURingSQE.UNLINK_FLAGS); }
    /** Unsafe version of {@link #hardlink_flags}. */
    public static int nhardlink_flags(long struct) { return memGetInt(struct + IOURingSQE.HARDLINK_FLAGS); }
    /** Unsafe version of {@link #xattr_flags}. */
    public static int nxattr_flags(long struct) { return memGetInt(struct + IOURingSQE.XATTR_FLAGS); }
    /** Unsafe version of {@link #msg_ring_flags}. */
    public static int nmsg_ring_flags(long struct) { return memGetInt(struct + IOURingSQE.MSG_RING_FLAGS); }
    /** Unsafe version of {@link #uring_cmd_flags}. */
    public static int nuring_cmd_flags(long struct) { return memGetInt(struct + IOURingSQE.URING_CMD_FLAGS); }
    /** Unsafe version of {@link #waitid_flags}. */
    public static int nwaitid_flags(long struct) { return memGetInt(struct + IOURingSQE.WAITID_FLAGS); }
    /** Unsafe version of {@link #futex_flags}. */
    public static int nfutex_flags(long struct) { return memGetInt(struct + IOURingSQE.FUTEX_FLAGS); }
    /** Unsafe version of {@link #install_fd_flags}. */
    public static int ninstall_fd_flags(long struct) { return memGetInt(struct + IOURingSQE.INSTALL_FD_FLAGS); }
    /** Unsafe version of {@link #nop_flags}. */
    public static int nnop_flags(long struct) { return memGetInt(struct + IOURingSQE.NOP_FLAGS); }
    /** Unsafe version of {@link #user_data}. */
    public static long nuser_data(long struct) { return memGetLong(struct + IOURingSQE.USER_DATA); }
    /** Unsafe version of {@link #buf_index}. */
    public static short nbuf_index(long struct) { return memGetShort(struct + IOURingSQE.BUF_INDEX); }
    /** Unsafe version of {@link #buf_group}. */
    public static short nbuf_group(long struct) { return memGetShort(struct + IOURingSQE.BUF_GROUP); }
    /** Unsafe version of {@link #personality}. */
    public static short npersonality(long struct) { return memGetShort(struct + IOURingSQE.PERSONALITY); }
    /** Unsafe version of {@link #splice_fd_in}. */
    public static int nsplice_fd_in(long struct) { return memGetInt(struct + IOURingSQE.SPLICE_FD_IN); }
    /** Unsafe version of {@link #file_index}. */
    public static int nfile_index(long struct) { return memGetInt(struct + IOURingSQE.FILE_INDEX); }
    /** Unsafe version of {@link #zcrx_ifq_idx}. */
    public static int nzcrx_ifq_idx(long struct) { return memGetInt(struct + IOURingSQE.ZCRX_IFQ_IDX); }
    /** Unsafe version of {@link #optlen}. */
    public static int noptlen(long struct) { return memGetInt(struct + IOURingSQE.OPTLEN); }
    /** Unsafe version of {@link #addr_len}. */
    public static short naddr_len(long struct) { return memGetShort(struct + IOURingSQE.ADDR_LEN); }
    public static ShortBuffer n__pad3(long struct) { return memShortBuffer(struct + IOURingSQE.__PAD3, 1); }
    public static short n__pad3(long struct, int index) {
        return memGetShort(struct + IOURingSQE.__PAD3 + check(index, 1) * 2);
    }
    /** Unsafe version of {@link #addr3}. */
    public static long naddr3(long struct) { return memGetLong(struct + IOURingSQE.ADDR3); }
    public static LongBuffer n__pad2(long struct) { return memLongBuffer(struct + IOURingSQE.__PAD2, 1); }
    public static long n__pad2(long struct, int index) {
        return memGetLong(struct + IOURingSQE.__PAD2 + check(index, 1) * 8);
    }
    /** Unsafe version of {@link #optval}. */
    public static long noptval(long struct) { return memGetLong(struct + IOURingSQE.OPTVAL); }
    /** Unsafe version of {@link #cmd}. */
    public static ByteBuffer ncmd(long struct) { return memByteBuffer(struct + IOURingSQE.CMD, 0); }
    /** Unsafe version of {@link #cmd(int) cmd}. */
    public static byte ncmd(long struct, int index) {
        return memGetByte(struct + IOURingSQE.CMD + check(index, 0) * 1);
    }

    /** Unsafe version of {@link #opcode(byte) opcode}. */
    public static void nopcode(long struct, byte value) { memPutByte(struct + IOURingSQE.OPCODE, value); }
    /** Unsafe version of {@link #flags(byte) flags}. */
    public static void nflags(long struct, byte value) { memPutByte(struct + IOURingSQE.FLAGS, value); }
    /** Unsafe version of {@link #ioprio(short) ioprio}. */
    public static void nioprio(long struct, short value) { memPutShort(struct + IOURingSQE.IOPRIO, value); }
    /** Unsafe version of {@link #fd(int) fd}. */
    public static void nfd(long struct, int value) { memPutInt(struct + IOURingSQE.FD, value); }
    /** Unsafe version of {@link #off(long) off}. */
    public static void noff(long struct, long value) { memPutLong(struct + IOURingSQE.OFF, value); }
    /** Unsafe version of {@link #addr2(long) addr2}. */
    public static void naddr2(long struct, long value) { memPutLong(struct + IOURingSQE.ADDR2, value); }
    /** Unsafe version of {@link #cmd_op(int) cmd_op}. */
    public static void ncmd_op(long struct, int value) { memPutInt(struct + IOURingSQE.CMD_OP, value); }
    public static void n__pad1(long struct, int value) { memPutInt(struct + IOURingSQE.__PAD1, value); }
    /** Unsafe version of {@link #addr(long) addr}. */
    public static void naddr(long struct, long value) { memPutLong(struct + IOURingSQE.ADDR, value); }
    /** Unsafe version of {@link #splice_off_in(long) splice_off_in}. */
    public static void nsplice_off_in(long struct, long value) { memPutLong(struct + IOURingSQE.SPLICE_OFF_IN, value); }
    /** Unsafe version of {@link #level(int) level}. */
    public static void nlevel(long struct, int value) { memPutInt(struct + IOURingSQE.LEVEL, value); }
    /** Unsafe version of {@link #optname(int) optname}. */
    public static void noptname(long struct, int value) { memPutInt(struct + IOURingSQE.OPTNAME, value); }
    /** Unsafe version of {@link #len(int) len}. */
    public static void nlen(long struct, int value) { memPutInt(struct + IOURingSQE.LEN, value); }
    /** Unsafe version of {@link #rw_flags(int) rw_flags}. */
    public static void nrw_flags(long struct, int value) { memPutInt(struct + IOURingSQE.RW_FLAGS, value); }
    /** Unsafe version of {@link #fsync_flags(int) fsync_flags}. */
    public static void nfsync_flags(long struct, int value) { memPutInt(struct + IOURingSQE.FSYNC_FLAGS, value); }
    /** Unsafe version of {@link #poll_events(short) poll_events}. */
    public static void npoll_events(long struct, short value) { memPutShort(struct + IOURingSQE.POLL_EVENTS, value); }
    /** Unsafe version of {@link #poll32_events(int) poll32_events}. */
    public static void npoll32_events(long struct, int value) { memPutInt(struct + IOURingSQE.POLL32_EVENTS, value); }
    /** Unsafe version of {@link #sync_range_flags(int) sync_range_flags}. */
    public static void nsync_range_flags(long struct, int value) { memPutInt(struct + IOURingSQE.SYNC_RANGE_FLAGS, value); }
    /** Unsafe version of {@link #msg_flags(int) msg_flags}. */
    public static void nmsg_flags(long struct, int value) { memPutInt(struct + IOURingSQE.MSG_FLAGS, value); }
    /** Unsafe version of {@link #timeout_flags(int) timeout_flags}. */
    public static void ntimeout_flags(long struct, int value) { memPutInt(struct + IOURingSQE.TIMEOUT_FLAGS, value); }
    /** Unsafe version of {@link #accept_flags(int) accept_flags}. */
    public static void naccept_flags(long struct, int value) { memPutInt(struct + IOURingSQE.ACCEPT_FLAGS, value); }
    /** Unsafe version of {@link #cancel_flags(int) cancel_flags}. */
    public static void ncancel_flags(long struct, int value) { memPutInt(struct + IOURingSQE.CANCEL_FLAGS, value); }
    /** Unsafe version of {@link #open_flags(int) open_flags}. */
    public static void nopen_flags(long struct, int value) { memPutInt(struct + IOURingSQE.OPEN_FLAGS, value); }
    /** Unsafe version of {@link #statx_flags(int) statx_flags}. */
    public static void nstatx_flags(long struct, int value) { memPutInt(struct + IOURingSQE.STATX_FLAGS, value); }
    /** Unsafe version of {@link #fadvise_advice(int) fadvise_advice}. */
    public static void nfadvise_advice(long struct, int value) { memPutInt(struct + IOURingSQE.FADVISE_ADVICE, value); }
    /** Unsafe version of {@link #splice_flags(int) splice_flags}. */
    public static void nsplice_flags(long struct, int value) { memPutInt(struct + IOURingSQE.SPLICE_FLAGS, value); }
    /** Unsafe version of {@link #rename_flags(int) rename_flags}. */
    public static void nrename_flags(long struct, int value) { memPutInt(struct + IOURingSQE.RENAME_FLAGS, value); }
    /** Unsafe version of {@link #unlink_flags(int) unlink_flags}. */
    public static void nunlink_flags(long struct, int value) { memPutInt(struct + IOURingSQE.UNLINK_FLAGS, value); }
    /** Unsafe version of {@link #hardlink_flags(int) hardlink_flags}. */
    public static void nhardlink_flags(long struct, int value) { memPutInt(struct + IOURingSQE.HARDLINK_FLAGS, value); }
    /** Unsafe version of {@link #xattr_flags(int) xattr_flags}. */
    public static void nxattr_flags(long struct, int value) { memPutInt(struct + IOURingSQE.XATTR_FLAGS, value); }
    /** Unsafe version of {@link #msg_ring_flags(int) msg_ring_flags}. */
    public static void nmsg_ring_flags(long struct, int value) { memPutInt(struct + IOURingSQE.MSG_RING_FLAGS, value); }
    /** Unsafe version of {@link #uring_cmd_flags(int) uring_cmd_flags}. */
    public static void nuring_cmd_flags(long struct, int value) { memPutInt(struct + IOURingSQE.URING_CMD_FLAGS, value); }
    /** Unsafe version of {@link #waitid_flags(int) waitid_flags}. */
    public static void nwaitid_flags(long struct, int value) { memPutInt(struct + IOURingSQE.WAITID_FLAGS, value); }
    /** Unsafe version of {@link #futex_flags(int) futex_flags}. */
    public static void nfutex_flags(long struct, int value) { memPutInt(struct + IOURingSQE.FUTEX_FLAGS, value); }
    /** Unsafe version of {@link #install_fd_flags(int) install_fd_flags}. */
    public static void ninstall_fd_flags(long struct, int value) { memPutInt(struct + IOURingSQE.INSTALL_FD_FLAGS, value); }
    /** Unsafe version of {@link #nop_flags(int) nop_flags}. */
    public static void nnop_flags(long struct, int value) { memPutInt(struct + IOURingSQE.NOP_FLAGS, value); }
    /** Unsafe version of {@link #user_data(long) user_data}. */
    public static void nuser_data(long struct, long value) { memPutLong(struct + IOURingSQE.USER_DATA, value); }
    /** Unsafe version of {@link #buf_index(short) buf_index}. */
    public static void nbuf_index(long struct, short value) { memPutShort(struct + IOURingSQE.BUF_INDEX, value); }
    /** Unsafe version of {@link #buf_group(short) buf_group}. */
    public static void nbuf_group(long struct, short value) { memPutShort(struct + IOURingSQE.BUF_GROUP, value); }
    /** Unsafe version of {@link #personality(short) personality}. */
    public static void npersonality(long struct, short value) { memPutShort(struct + IOURingSQE.PERSONALITY, value); }
    /** Unsafe version of {@link #splice_fd_in(int) splice_fd_in}. */
    public static void nsplice_fd_in(long struct, int value) { memPutInt(struct + IOURingSQE.SPLICE_FD_IN, value); }
    /** Unsafe version of {@link #file_index(int) file_index}. */
    public static void nfile_index(long struct, int value) { memPutInt(struct + IOURingSQE.FILE_INDEX, value); }
    /** Unsafe version of {@link #zcrx_ifq_idx(int) zcrx_ifq_idx}. */
    public static void nzcrx_ifq_idx(long struct, int value) { memPutInt(struct + IOURingSQE.ZCRX_IFQ_IDX, value); }
    /** Unsafe version of {@link #optlen(int) optlen}. */
    public static void noptlen(long struct, int value) { memPutInt(struct + IOURingSQE.OPTLEN, value); }
    /** Unsafe version of {@link #addr_len(short) addr_len}. */
    public static void naddr_len(long struct, short value) { memPutShort(struct + IOURingSQE.ADDR_LEN, value); }
    public static void n__pad3(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 1); }
        memCopy(memAddress(value), struct + IOURingSQE.__PAD3, value.remaining() * 2);
    }
    public static void n__pad3(long struct, int index, short value) {
        memPutShort(struct + IOURingSQE.__PAD3 + check(index, 1) * 2, value);
    }
    /** Unsafe version of {@link #addr3(long) addr3}. */
    public static void naddr3(long struct, long value) { memPutLong(struct + IOURingSQE.ADDR3, value); }
    public static void n__pad2(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 1); }
        memCopy(memAddress(value), struct + IOURingSQE.__PAD2, value.remaining() * 8);
    }
    public static void n__pad2(long struct, int index, long value) {
        memPutLong(struct + IOURingSQE.__PAD2 + check(index, 1) * 8, value);
    }
    /** Unsafe version of {@link #optval(long) optval}. */
    public static void noptval(long struct, long value) { memPutLong(struct + IOURingSQE.OPTVAL, value); }
    /** Unsafe version of {@link #cmd(ByteBuffer) cmd}. */
    public static void ncmd(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 0); }
        memCopy(memAddress(value), struct + IOURingSQE.CMD, value.remaining() * 1);
    }
    /** Unsafe version of {@link #cmd(int, byte) cmd}. */
    public static void ncmd(long struct, int index, byte value) {
        memPutByte(struct + IOURingSQE.CMD + check(index, 0) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link IOURingSQE} structs. */
    public static class Buffer extends StructBuffer<IOURingSQE, Buffer> implements NativeResource {

        private static final IOURingSQE ELEMENT_FACTORY = IOURingSQE.create(-1L);

        /**
         * Creates a new {@code IOURingSQE.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IOURingSQE#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected IOURingSQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code opcode} field. */
        @NativeType("__u8")
        public byte opcode() { return IOURingSQE.nopcode(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("__u8")
        public byte flags() { return IOURingSQE.nflags(address()); }
        /** @return the value of the {@code ioprio} field. */
        @NativeType("__u16")
        public short ioprio() { return IOURingSQE.nioprio(address()); }
        /** @return the value of the {@code fd} field. */
        @NativeType("__s32")
        public int fd() { return IOURingSQE.nfd(address()); }
        /** @return the value of the {@code off} field. */
        @NativeType("__u64")
        public long off() { return IOURingSQE.noff(address()); }
        /** @return the value of the {@code addr2} field. */
        @NativeType("__u64")
        public long addr2() { return IOURingSQE.naddr2(address()); }
        /** @return the value of the {@code cmd_op} field. */
        @NativeType("__u32")
        public int cmd_op() { return IOURingSQE.ncmd_op(address()); }
        /** @return the value of the {@code __pad1} field. */
        @NativeType("__u32")
        public int __pad1() { return IOURingSQE.n__pad1(address()); }
        /** @return the value of the {@code addr} field. */
        @NativeType("__u64")
        public long addr() { return IOURingSQE.naddr(address()); }
        /** @return the value of the {@code splice_off_in} field. */
        @NativeType("__u64")
        public long splice_off_in() { return IOURingSQE.nsplice_off_in(address()); }
        /** @return the value of the {@code level} field. */
        @NativeType("__u32")
        public int level() { return IOURingSQE.nlevel(address()); }
        /** @return the value of the {@code optname} field. */
        @NativeType("__u32")
        public int optname() { return IOURingSQE.noptname(address()); }
        /** @return the value of the {@code len} field. */
        @NativeType("__u32")
        public int len() { return IOURingSQE.nlen(address()); }
        /** @return the value of the {@code rw_flags} field. */
        @NativeType("__kernel_rwf_t")
        public int rw_flags() { return IOURingSQE.nrw_flags(address()); }
        /** @return the value of the {@code fsync_flags} field. */
        @NativeType("__u32")
        public int fsync_flags() { return IOURingSQE.nfsync_flags(address()); }
        /** @return the value of the {@code poll_events} field. */
        @NativeType("__u16")
        public short poll_events() { return IOURingSQE.npoll_events(address()); }
        /** @return the value of the {@code poll32_events} field. */
        @NativeType("__u32")
        public int poll32_events() { return IOURingSQE.npoll32_events(address()); }
        /** @return the value of the {@code sync_range_flags} field. */
        @NativeType("__u32")
        public int sync_range_flags() { return IOURingSQE.nsync_range_flags(address()); }
        /** @return the value of the {@code msg_flags} field. */
        @NativeType("__u32")
        public int msg_flags() { return IOURingSQE.nmsg_flags(address()); }
        /** @return the value of the {@code timeout_flags} field. */
        @NativeType("__u32")
        public int timeout_flags() { return IOURingSQE.ntimeout_flags(address()); }
        /** @return the value of the {@code accept_flags} field. */
        @NativeType("__u32")
        public int accept_flags() { return IOURingSQE.naccept_flags(address()); }
        /** @return the value of the {@code cancel_flags} field. */
        @NativeType("__u32")
        public int cancel_flags() { return IOURingSQE.ncancel_flags(address()); }
        /** @return the value of the {@code open_flags} field. */
        @NativeType("__u32")
        public int open_flags() { return IOURingSQE.nopen_flags(address()); }
        /** @return the value of the {@code statx_flags} field. */
        @NativeType("__u32")
        public int statx_flags() { return IOURingSQE.nstatx_flags(address()); }
        /** @return the value of the {@code fadvise_advice} field. */
        @NativeType("__u32")
        public int fadvise_advice() { return IOURingSQE.nfadvise_advice(address()); }
        /** @return the value of the {@code splice_flags} field. */
        @NativeType("__u32")
        public int splice_flags() { return IOURingSQE.nsplice_flags(address()); }
        /** @return the value of the {@code rename_flags} field. */
        @NativeType("__u32")
        public int rename_flags() { return IOURingSQE.nrename_flags(address()); }
        /** @return the value of the {@code unlink_flags} field. */
        @NativeType("__u32")
        public int unlink_flags() { return IOURingSQE.nunlink_flags(address()); }
        /** @return the value of the {@code hardlink_flags} field. */
        @NativeType("__u32")
        public int hardlink_flags() { return IOURingSQE.nhardlink_flags(address()); }
        /** @return the value of the {@code xattr_flags} field. */
        @NativeType("__u32")
        public int xattr_flags() { return IOURingSQE.nxattr_flags(address()); }
        /** @return the value of the {@code msg_ring_flags} field. */
        @NativeType("__u32")
        public int msg_ring_flags() { return IOURingSQE.nmsg_ring_flags(address()); }
        /** @return the value of the {@code uring_cmd_flags} field. */
        @NativeType("__u32")
        public int uring_cmd_flags() { return IOURingSQE.nuring_cmd_flags(address()); }
        /** @return the value of the {@code waitid_flags} field. */
        @NativeType("__u32")
        public int waitid_flags() { return IOURingSQE.nwaitid_flags(address()); }
        /** @return the value of the {@code futex_flags} field. */
        @NativeType("__u32")
        public int futex_flags() { return IOURingSQE.nfutex_flags(address()); }
        /** @return the value of the {@code install_fd_flags} field. */
        @NativeType("__u32")
        public int install_fd_flags() { return IOURingSQE.ninstall_fd_flags(address()); }
        /** @return the value of the {@code nop_flags} field. */
        @NativeType("__u32")
        public int nop_flags() { return IOURingSQE.nnop_flags(address()); }
        /** @return the value of the {@code user_data} field. */
        @NativeType("__u64")
        public long user_data() { return IOURingSQE.nuser_data(address()); }
        /** @return the value of the {@code buf_index} field. */
        @NativeType("__u16")
        public short buf_index() { return IOURingSQE.nbuf_index(address()); }
        /** @return the value of the {@code buf_group} field. */
        @NativeType("__u16")
        public short buf_group() { return IOURingSQE.nbuf_group(address()); }
        /** @return the value of the {@code personality} field. */
        @NativeType("__u16")
        public short personality() { return IOURingSQE.npersonality(address()); }
        /** @return the value of the {@code splice_fd_in} field. */
        @NativeType("__s32")
        public int splice_fd_in() { return IOURingSQE.nsplice_fd_in(address()); }
        /** @return the value of the {@code file_index} field. */
        @NativeType("__u32")
        public int file_index() { return IOURingSQE.nfile_index(address()); }
        /** @return the value of the {@code zcrx_ifq_idx} field. */
        @NativeType("__u32")
        public int zcrx_ifq_idx() { return IOURingSQE.nzcrx_ifq_idx(address()); }
        /** @return the value of the {@code optlen} field. */
        @NativeType("__u32")
        public int optlen() { return IOURingSQE.noptlen(address()); }
        /** @return the value of the {@code addr_len} field. */
        @NativeType("__u16")
        public short addr_len() { return IOURingSQE.naddr_len(address()); }
        /** @return a {@link ShortBuffer} view of the {@code __pad3} field. */
        @NativeType("__u16[1]")
        public ShortBuffer __pad3() { return IOURingSQE.n__pad3(address()); }
        /** @return the value at the specified index of the {@code __pad3} field. */
        @NativeType("__u16")
        public short __pad3(int index) { return IOURingSQE.n__pad3(address(), index); }
        /** @return the value of the {@code addr3} field. */
        @NativeType("__u64")
        public long addr3() { return IOURingSQE.naddr3(address()); }
        /** @return a {@link LongBuffer} view of the {@code __pad2} field. */
        @NativeType("__u64[1]")
        public LongBuffer __pad2() { return IOURingSQE.n__pad2(address()); }
        /** @return the value at the specified index of the {@code __pad2} field. */
        @NativeType("__u64")
        public long __pad2(int index) { return IOURingSQE.n__pad2(address(), index); }
        /** @return the value of the {@code optval} field. */
        @NativeType("__u64")
        public long optval() { return IOURingSQE.noptval(address()); }
        /** @return a {@link ByteBuffer} view of the {@code cmd} field. */
        @NativeType("__u8[0]")
        public ByteBuffer cmd() { return IOURingSQE.ncmd(address()); }
        /** @return the value at the specified index of the {@code cmd} field. */
        @NativeType("__u8")
        public byte cmd(int index) { return IOURingSQE.ncmd(address(), index); }

        /** Sets the specified value to the {@code opcode} field. */
        public IOURingSQE.Buffer opcode(@NativeType("__u8") byte value) { IOURingSQE.nopcode(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public IOURingSQE.Buffer flags(@NativeType("__u8") byte value) { IOURingSQE.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code ioprio} field. */
        public IOURingSQE.Buffer ioprio(@NativeType("__u16") short value) { IOURingSQE.nioprio(address(), value); return this; }
        /** Sets the specified value to the {@code fd} field. */
        public IOURingSQE.Buffer fd(@NativeType("__s32") int value) { IOURingSQE.nfd(address(), value); return this; }
        /** Sets the specified value to the {@code off} field. */
        public IOURingSQE.Buffer off(@NativeType("__u64") long value) { IOURingSQE.noff(address(), value); return this; }
        /** Sets the specified value to the {@code addr2} field. */
        public IOURingSQE.Buffer addr2(@NativeType("__u64") long value) { IOURingSQE.naddr2(address(), value); return this; }
        /** Sets the specified value to the {@code cmd_op} field. */
        public IOURingSQE.Buffer cmd_op(@NativeType("__u32") int value) { IOURingSQE.ncmd_op(address(), value); return this; }
        /** Sets the specified value to the {@code __pad1} field. */
        public IOURingSQE.Buffer __pad1(@NativeType("__u32") int value) { IOURingSQE.n__pad1(address(), value); return this; }
        /** Sets the specified value to the {@code addr} field. */
        public IOURingSQE.Buffer addr(@NativeType("__u64") long value) { IOURingSQE.naddr(address(), value); return this; }
        /** Sets the specified value to the {@code splice_off_in} field. */
        public IOURingSQE.Buffer splice_off_in(@NativeType("__u64") long value) { IOURingSQE.nsplice_off_in(address(), value); return this; }
        /** Sets the specified value to the {@code level} field. */
        public IOURingSQE.Buffer level(@NativeType("__u32") int value) { IOURingSQE.nlevel(address(), value); return this; }
        /** Sets the specified value to the {@code optname} field. */
        public IOURingSQE.Buffer optname(@NativeType("__u32") int value) { IOURingSQE.noptname(address(), value); return this; }
        /** Sets the specified value to the {@code len} field. */
        public IOURingSQE.Buffer len(@NativeType("__u32") int value) { IOURingSQE.nlen(address(), value); return this; }
        /** Sets the specified value to the {@code rw_flags} field. */
        public IOURingSQE.Buffer rw_flags(@NativeType("__kernel_rwf_t") int value) { IOURingSQE.nrw_flags(address(), value); return this; }
        /** Sets the specified value to the {@code fsync_flags} field. */
        public IOURingSQE.Buffer fsync_flags(@NativeType("__u32") int value) { IOURingSQE.nfsync_flags(address(), value); return this; }
        /** Sets the specified value to the {@code poll_events} field. */
        public IOURingSQE.Buffer poll_events(@NativeType("__u16") short value) { IOURingSQE.npoll_events(address(), value); return this; }
        /** Sets the specified value to the {@code poll32_events} field. */
        public IOURingSQE.Buffer poll32_events(@NativeType("__u32") int value) { IOURingSQE.npoll32_events(address(), value); return this; }
        /** Sets the specified value to the {@code sync_range_flags} field. */
        public IOURingSQE.Buffer sync_range_flags(@NativeType("__u32") int value) { IOURingSQE.nsync_range_flags(address(), value); return this; }
        /** Sets the specified value to the {@code msg_flags} field. */
        public IOURingSQE.Buffer msg_flags(@NativeType("__u32") int value) { IOURingSQE.nmsg_flags(address(), value); return this; }
        /** Sets the specified value to the {@code timeout_flags} field. */
        public IOURingSQE.Buffer timeout_flags(@NativeType("__u32") int value) { IOURingSQE.ntimeout_flags(address(), value); return this; }
        /** Sets the specified value to the {@code accept_flags} field. */
        public IOURingSQE.Buffer accept_flags(@NativeType("__u32") int value) { IOURingSQE.naccept_flags(address(), value); return this; }
        /** Sets the specified value to the {@code cancel_flags} field. */
        public IOURingSQE.Buffer cancel_flags(@NativeType("__u32") int value) { IOURingSQE.ncancel_flags(address(), value); return this; }
        /** Sets the specified value to the {@code open_flags} field. */
        public IOURingSQE.Buffer open_flags(@NativeType("__u32") int value) { IOURingSQE.nopen_flags(address(), value); return this; }
        /** Sets the specified value to the {@code statx_flags} field. */
        public IOURingSQE.Buffer statx_flags(@NativeType("__u32") int value) { IOURingSQE.nstatx_flags(address(), value); return this; }
        /** Sets the specified value to the {@code fadvise_advice} field. */
        public IOURingSQE.Buffer fadvise_advice(@NativeType("__u32") int value) { IOURingSQE.nfadvise_advice(address(), value); return this; }
        /** Sets the specified value to the {@code splice_flags} field. */
        public IOURingSQE.Buffer splice_flags(@NativeType("__u32") int value) { IOURingSQE.nsplice_flags(address(), value); return this; }
        /** Sets the specified value to the {@code rename_flags} field. */
        public IOURingSQE.Buffer rename_flags(@NativeType("__u32") int value) { IOURingSQE.nrename_flags(address(), value); return this; }
        /** Sets the specified value to the {@code unlink_flags} field. */
        public IOURingSQE.Buffer unlink_flags(@NativeType("__u32") int value) { IOURingSQE.nunlink_flags(address(), value); return this; }
        /** Sets the specified value to the {@code hardlink_flags} field. */
        public IOURingSQE.Buffer hardlink_flags(@NativeType("__u32") int value) { IOURingSQE.nhardlink_flags(address(), value); return this; }
        /** Sets the specified value to the {@code xattr_flags} field. */
        public IOURingSQE.Buffer xattr_flags(@NativeType("__u32") int value) { IOURingSQE.nxattr_flags(address(), value); return this; }
        /** Sets the specified value to the {@code msg_ring_flags} field. */
        public IOURingSQE.Buffer msg_ring_flags(@NativeType("__u32") int value) { IOURingSQE.nmsg_ring_flags(address(), value); return this; }
        /** Sets the specified value to the {@code uring_cmd_flags} field. */
        public IOURingSQE.Buffer uring_cmd_flags(@NativeType("__u32") int value) { IOURingSQE.nuring_cmd_flags(address(), value); return this; }
        /** Sets the specified value to the {@code waitid_flags} field. */
        public IOURingSQE.Buffer waitid_flags(@NativeType("__u32") int value) { IOURingSQE.nwaitid_flags(address(), value); return this; }
        /** Sets the specified value to the {@code futex_flags} field. */
        public IOURingSQE.Buffer futex_flags(@NativeType("__u32") int value) { IOURingSQE.nfutex_flags(address(), value); return this; }
        /** Sets the specified value to the {@code install_fd_flags} field. */
        public IOURingSQE.Buffer install_fd_flags(@NativeType("__u32") int value) { IOURingSQE.ninstall_fd_flags(address(), value); return this; }
        /** Sets the specified value to the {@code nop_flags} field. */
        public IOURingSQE.Buffer nop_flags(@NativeType("__u32") int value) { IOURingSQE.nnop_flags(address(), value); return this; }
        /** Sets the specified value to the {@code user_data} field. */
        public IOURingSQE.Buffer user_data(@NativeType("__u64") long value) { IOURingSQE.nuser_data(address(), value); return this; }
        /** Sets the specified value to the {@code buf_index} field. */
        public IOURingSQE.Buffer buf_index(@NativeType("__u16") short value) { IOURingSQE.nbuf_index(address(), value); return this; }
        /** Sets the specified value to the {@code buf_group} field. */
        public IOURingSQE.Buffer buf_group(@NativeType("__u16") short value) { IOURingSQE.nbuf_group(address(), value); return this; }
        /** Sets the specified value to the {@code personality} field. */
        public IOURingSQE.Buffer personality(@NativeType("__u16") short value) { IOURingSQE.npersonality(address(), value); return this; }
        /** Sets the specified value to the {@code splice_fd_in} field. */
        public IOURingSQE.Buffer splice_fd_in(@NativeType("__s32") int value) { IOURingSQE.nsplice_fd_in(address(), value); return this; }
        /** Sets the specified value to the {@code file_index} field. */
        public IOURingSQE.Buffer file_index(@NativeType("__u32") int value) { IOURingSQE.nfile_index(address(), value); return this; }
        /** Sets the specified value to the {@code zcrx_ifq_idx} field. */
        public IOURingSQE.Buffer zcrx_ifq_idx(@NativeType("__u32") int value) { IOURingSQE.nzcrx_ifq_idx(address(), value); return this; }
        /** Sets the specified value to the {@code optlen} field. */
        public IOURingSQE.Buffer optlen(@NativeType("__u32") int value) { IOURingSQE.noptlen(address(), value); return this; }
        /** Sets the specified value to the {@code addr_len} field. */
        public IOURingSQE.Buffer addr_len(@NativeType("__u16") short value) { IOURingSQE.naddr_len(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code __pad3} field. */
        public IOURingSQE.Buffer __pad3(@NativeType("__u16[1]") ShortBuffer value) { IOURingSQE.n__pad3(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code __pad3} field. */
        public IOURingSQE.Buffer __pad3(int index, @NativeType("__u16") short value) { IOURingSQE.n__pad3(address(), index, value); return this; }
        /** Sets the specified value to the {@code addr3} field. */
        public IOURingSQE.Buffer addr3(@NativeType("__u64") long value) { IOURingSQE.naddr3(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code __pad2} field. */
        public IOURingSQE.Buffer __pad2(@NativeType("__u64[1]") LongBuffer value) { IOURingSQE.n__pad2(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code __pad2} field. */
        public IOURingSQE.Buffer __pad2(int index, @NativeType("__u64") long value) { IOURingSQE.n__pad2(address(), index, value); return this; }
        /** Sets the specified value to the {@code optval} field. */
        public IOURingSQE.Buffer optval(@NativeType("__u64") long value) { IOURingSQE.noptval(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code cmd} field. */
        public IOURingSQE.Buffer cmd(@NativeType("__u8[0]") ByteBuffer value) { IOURingSQE.ncmd(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code cmd} field. */
        public IOURingSQE.Buffer cmd(int index, @NativeType("__u8") byte value) { IOURingSQE.ncmd(address(), index, value); return this; }

    }

}