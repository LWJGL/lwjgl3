/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct statx {
 *     __u32 {@link #stx_mask};
 *     __u32 {@link #stx_blksize};
 *     __u64 {@link #stx_attributes};
 *     __u32 {@link #stx_nlink};
 *     __u32 {@link #stx_uid};
 *     __u32 {@link #stx_gid};
 *     __u16 {@link #stx_mode};
 *     __u16 __spare0[1];
 *     __u64 {@link #stx_ino};
 *     __u64 {@link #stx_size};
 *     __u64 {@link #stx_blocks};
 *     __u64 {@link #stx_attributes_mask};
 *     {@link StatxTimestamp struct statx_timestamp} {@link #stx_atime};
 *     {@link StatxTimestamp struct statx_timestamp} {@link #stx_btime};
 *     {@link StatxTimestamp struct statx_timestamp} {@link #stx_ctime};
 *     {@link StatxTimestamp struct statx_timestamp} {@link #stx_mtime};
 *     __u32 {@link #stx_rdev_major};
 *     __u32 stx_rdev_minor;
 *     __u32 {@link #stx_dev_major};
 *     __u32 stx_dev_minor;
 *     __u64 stx_mnt_id;
 *     __u64 __spare2;
 *     __u64 __spare3[12];
 * }</code></pre>
 */
@NativeType("struct statx")
public class Statx extends Struct<Statx> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STX_MASK,
        STX_BLKSIZE,
        STX_ATTRIBUTES,
        STX_NLINK,
        STX_UID,
        STX_GID,
        STX_MODE,
        __SPARE0,
        STX_INO,
        STX_SIZE,
        STX_BLOCKS,
        STX_ATTRIBUTES_MASK,
        STX_ATIME,
        STX_BTIME,
        STX_CTIME,
        STX_MTIME,
        STX_RDEV_MAJOR,
        STX_RDEV_MINOR,
        STX_DEV_MAJOR,
        STX_DEV_MINOR,
        STX_MNT_ID,
        __SPARE2,
        __SPARE3;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __array(2, 1),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(StatxTimestamp.SIZEOF, StatxTimestamp.ALIGNOF),
            __member(StatxTimestamp.SIZEOF, StatxTimestamp.ALIGNOF),
            __member(StatxTimestamp.SIZEOF, StatxTimestamp.ALIGNOF),
            __member(StatxTimestamp.SIZEOF, StatxTimestamp.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(8),
            __array(8, 12)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STX_MASK = layout.offsetof(0);
        STX_BLKSIZE = layout.offsetof(1);
        STX_ATTRIBUTES = layout.offsetof(2);
        STX_NLINK = layout.offsetof(3);
        STX_UID = layout.offsetof(4);
        STX_GID = layout.offsetof(5);
        STX_MODE = layout.offsetof(6);
        __SPARE0 = layout.offsetof(7);
        STX_INO = layout.offsetof(8);
        STX_SIZE = layout.offsetof(9);
        STX_BLOCKS = layout.offsetof(10);
        STX_ATTRIBUTES_MASK = layout.offsetof(11);
        STX_ATIME = layout.offsetof(12);
        STX_BTIME = layout.offsetof(13);
        STX_CTIME = layout.offsetof(14);
        STX_MTIME = layout.offsetof(15);
        STX_RDEV_MAJOR = layout.offsetof(16);
        STX_RDEV_MINOR = layout.offsetof(17);
        STX_DEV_MAJOR = layout.offsetof(18);
        STX_DEV_MINOR = layout.offsetof(19);
        STX_MNT_ID = layout.offsetof(20);
        __SPARE2 = layout.offsetof(21);
        __SPARE3 = layout.offsetof(22);
    }

    protected Statx(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected Statx create(long address, @Nullable ByteBuffer container) {
        return new Statx(address, container);
    }

    /**
     * Creates a {@code Statx} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Statx(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** what results were written [uncond] */
    @NativeType("__u32")
    public int stx_mask() { return nstx_mask(address()); }
    /** preferred general I/O size [uncond] */
    @NativeType("__u32")
    public int stx_blksize() { return nstx_blksize(address()); }
    /** flags conveying information about the file [uncond] */
    @NativeType("__u64")
    public long stx_attributes() { return nstx_attributes(address()); }
    /** number of hard links */
    @NativeType("__u32")
    public int stx_nlink() { return nstx_nlink(address()); }
    /** user ID of owner */
    @NativeType("__u32")
    public int stx_uid() { return nstx_uid(address()); }
    /** group ID of owner */
    @NativeType("__u32")
    public int stx_gid() { return nstx_gid(address()); }
    /** file mode */
    @NativeType("__u16")
    public short stx_mode() { return nstx_mode(address()); }
    /** {@code inode} number */
    @NativeType("__u64")
    public long stx_ino() { return nstx_ino(address()); }
    /** file size */
    @NativeType("__u64")
    public long stx_size() { return nstx_size(address()); }
    /** number of 512-byte blocks allocated */
    @NativeType("__u64")
    public long stx_blocks() { return nstx_blocks(address()); }
    /** mask to show what's supported in {@code stx_attributes} */
    @NativeType("__u64")
    public long stx_attributes_mask() { return nstx_attributes_mask(address()); }
    /** last access time */
    @NativeType("struct statx_timestamp")
    public StatxTimestamp stx_atime() { return nstx_atime(address()); }
    /** file creation time */
    @NativeType("struct statx_timestamp")
    public StatxTimestamp stx_btime() { return nstx_btime(address()); }
    /** last attribute change time */
    @NativeType("struct statx_timestamp")
    public StatxTimestamp stx_ctime() { return nstx_ctime(address()); }
    /** last data modification time */
    @NativeType("struct statx_timestamp")
    public StatxTimestamp stx_mtime() { return nstx_mtime(address()); }
    /** device ID of special file [if bdev/cdev] */
    @NativeType("__u32")
    public int stx_rdev_major() { return nstx_rdev_major(address()); }
    /** @return the value of the {@code stx_rdev_minor} field. */
    @NativeType("__u32")
    public int stx_rdev_minor() { return nstx_rdev_minor(address()); }
    /** ID of device containing file [uncond] */
    @NativeType("__u32")
    public int stx_dev_major() { return nstx_dev_major(address()); }
    /** @return the value of the {@code stx_dev_minor} field. */
    @NativeType("__u32")
    public int stx_dev_minor() { return nstx_dev_minor(address()); }
    /** @return the value of the {@code stx_mnt_id} field. */
    @NativeType("__u64")
    public long stx_mnt_id() { return nstx_mnt_id(address()); }

    /** Sets the specified value to the {@link #stx_mask} field. */
    public Statx stx_mask(@NativeType("__u32") int value) { nstx_mask(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_blksize} field. */
    public Statx stx_blksize(@NativeType("__u32") int value) { nstx_blksize(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_attributes} field. */
    public Statx stx_attributes(@NativeType("__u64") long value) { nstx_attributes(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_nlink} field. */
    public Statx stx_nlink(@NativeType("__u32") int value) { nstx_nlink(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_uid} field. */
    public Statx stx_uid(@NativeType("__u32") int value) { nstx_uid(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_gid} field. */
    public Statx stx_gid(@NativeType("__u32") int value) { nstx_gid(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_mode} field. */
    public Statx stx_mode(@NativeType("__u16") short value) { nstx_mode(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_ino} field. */
    public Statx stx_ino(@NativeType("__u64") long value) { nstx_ino(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_size} field. */
    public Statx stx_size(@NativeType("__u64") long value) { nstx_size(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_blocks} field. */
    public Statx stx_blocks(@NativeType("__u64") long value) { nstx_blocks(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_attributes_mask} field. */
    public Statx stx_attributes_mask(@NativeType("__u64") long value) { nstx_attributes_mask(address(), value); return this; }
    /** Copies the specified {@link StatxTimestamp} to the {@link #stx_atime} field. */
    public Statx stx_atime(@NativeType("struct statx_timestamp") StatxTimestamp value) { nstx_atime(address(), value); return this; }
    /** Passes the {@link #stx_atime} field to the specified {@link java.util.function.Consumer Consumer}. */
    public Statx stx_atime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_atime()); return this; }
    /** Copies the specified {@link StatxTimestamp} to the {@link #stx_btime} field. */
    public Statx stx_btime(@NativeType("struct statx_timestamp") StatxTimestamp value) { nstx_btime(address(), value); return this; }
    /** Passes the {@link #stx_btime} field to the specified {@link java.util.function.Consumer Consumer}. */
    public Statx stx_btime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_btime()); return this; }
    /** Copies the specified {@link StatxTimestamp} to the {@link #stx_ctime} field. */
    public Statx stx_ctime(@NativeType("struct statx_timestamp") StatxTimestamp value) { nstx_ctime(address(), value); return this; }
    /** Passes the {@link #stx_ctime} field to the specified {@link java.util.function.Consumer Consumer}. */
    public Statx stx_ctime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_ctime()); return this; }
    /** Copies the specified {@link StatxTimestamp} to the {@link #stx_mtime} field. */
    public Statx stx_mtime(@NativeType("struct statx_timestamp") StatxTimestamp value) { nstx_mtime(address(), value); return this; }
    /** Passes the {@link #stx_mtime} field to the specified {@link java.util.function.Consumer Consumer}. */
    public Statx stx_mtime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_mtime()); return this; }
    /** Sets the specified value to the {@link #stx_rdev_major} field. */
    public Statx stx_rdev_major(@NativeType("__u32") int value) { nstx_rdev_major(address(), value); return this; }
    /** Sets the specified value to the {@code stx_rdev_minor} field. */
    public Statx stx_rdev_minor(@NativeType("__u32") int value) { nstx_rdev_minor(address(), value); return this; }
    /** Sets the specified value to the {@link #stx_dev_major} field. */
    public Statx stx_dev_major(@NativeType("__u32") int value) { nstx_dev_major(address(), value); return this; }
    /** Sets the specified value to the {@code stx_dev_minor} field. */
    public Statx stx_dev_minor(@NativeType("__u32") int value) { nstx_dev_minor(address(), value); return this; }
    /** Sets the specified value to the {@code stx_mnt_id} field. */
    public Statx stx_mnt_id(@NativeType("__u64") long value) { nstx_mnt_id(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Statx set(
        int stx_mask,
        int stx_blksize,
        long stx_attributes,
        int stx_nlink,
        int stx_uid,
        int stx_gid,
        short stx_mode,
        long stx_ino,
        long stx_size,
        long stx_blocks,
        long stx_attributes_mask,
        StatxTimestamp stx_atime,
        StatxTimestamp stx_btime,
        StatxTimestamp stx_ctime,
        StatxTimestamp stx_mtime,
        int stx_rdev_major,
        int stx_rdev_minor,
        int stx_dev_major,
        int stx_dev_minor,
        long stx_mnt_id
    ) {
        stx_mask(stx_mask);
        stx_blksize(stx_blksize);
        stx_attributes(stx_attributes);
        stx_nlink(stx_nlink);
        stx_uid(stx_uid);
        stx_gid(stx_gid);
        stx_mode(stx_mode);
        stx_ino(stx_ino);
        stx_size(stx_size);
        stx_blocks(stx_blocks);
        stx_attributes_mask(stx_attributes_mask);
        stx_atime(stx_atime);
        stx_btime(stx_btime);
        stx_ctime(stx_ctime);
        stx_mtime(stx_mtime);
        stx_rdev_major(stx_rdev_major);
        stx_rdev_minor(stx_rdev_minor);
        stx_dev_major(stx_dev_major);
        stx_dev_minor(stx_dev_minor);
        stx_mnt_id(stx_mnt_id);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public Statx set(Statx src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Statx} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Statx malloc() {
        return new Statx(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code Statx} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Statx calloc() {
        return new Statx(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code Statx} instance allocated with {@link BufferUtils}. */
    public static Statx create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Statx(memAddress(container), container);
    }

    /** Returns a new {@code Statx} instance for the specified memory address. */
    public static Statx create(long address) {
        return new Statx(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Statx createSafe(long address) {
        return address == NULL ? null : new Statx(address, null);
    }

    /**
     * Returns a new {@link Statx.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Statx.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Statx.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Statx.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Statx.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Statx.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link Statx.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Statx.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Statx.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code Statx} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Statx malloc(MemoryStack stack) {
        return new Statx(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code Statx} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Statx calloc(MemoryStack stack) {
        return new Statx(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link Statx.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Statx.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Statx.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Statx.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stx_mask}. */
    public static int nstx_mask(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_MASK); }
    /** Unsafe version of {@link #stx_blksize}. */
    public static int nstx_blksize(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_BLKSIZE); }
    /** Unsafe version of {@link #stx_attributes}. */
    public static long nstx_attributes(long struct) { return UNSAFE.getLong(null, struct + Statx.STX_ATTRIBUTES); }
    /** Unsafe version of {@link #stx_nlink}. */
    public static int nstx_nlink(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_NLINK); }
    /** Unsafe version of {@link #stx_uid}. */
    public static int nstx_uid(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_UID); }
    /** Unsafe version of {@link #stx_gid}. */
    public static int nstx_gid(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_GID); }
    /** Unsafe version of {@link #stx_mode}. */
    public static short nstx_mode(long struct) { return UNSAFE.getShort(null, struct + Statx.STX_MODE); }
    public static ShortBuffer n__spare0(long struct) { return memShortBuffer(struct + Statx.__SPARE0, 1); }
    public static short n__spare0(long struct, int index) {
        return UNSAFE.getShort(null, struct + Statx.__SPARE0 + check(index, 1) * 2);
    }
    /** Unsafe version of {@link #stx_ino}. */
    public static long nstx_ino(long struct) { return UNSAFE.getLong(null, struct + Statx.STX_INO); }
    /** Unsafe version of {@link #stx_size}. */
    public static long nstx_size(long struct) { return UNSAFE.getLong(null, struct + Statx.STX_SIZE); }
    /** Unsafe version of {@link #stx_blocks}. */
    public static long nstx_blocks(long struct) { return UNSAFE.getLong(null, struct + Statx.STX_BLOCKS); }
    /** Unsafe version of {@link #stx_attributes_mask}. */
    public static long nstx_attributes_mask(long struct) { return UNSAFE.getLong(null, struct + Statx.STX_ATTRIBUTES_MASK); }
    /** Unsafe version of {@link #stx_atime}. */
    public static StatxTimestamp nstx_atime(long struct) { return StatxTimestamp.create(struct + Statx.STX_ATIME); }
    /** Unsafe version of {@link #stx_btime}. */
    public static StatxTimestamp nstx_btime(long struct) { return StatxTimestamp.create(struct + Statx.STX_BTIME); }
    /** Unsafe version of {@link #stx_ctime}. */
    public static StatxTimestamp nstx_ctime(long struct) { return StatxTimestamp.create(struct + Statx.STX_CTIME); }
    /** Unsafe version of {@link #stx_mtime}. */
    public static StatxTimestamp nstx_mtime(long struct) { return StatxTimestamp.create(struct + Statx.STX_MTIME); }
    /** Unsafe version of {@link #stx_rdev_major}. */
    public static int nstx_rdev_major(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_RDEV_MAJOR); }
    /** Unsafe version of {@link #stx_rdev_minor}. */
    public static int nstx_rdev_minor(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_RDEV_MINOR); }
    /** Unsafe version of {@link #stx_dev_major}. */
    public static int nstx_dev_major(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_DEV_MAJOR); }
    /** Unsafe version of {@link #stx_dev_minor}. */
    public static int nstx_dev_minor(long struct) { return UNSAFE.getInt(null, struct + Statx.STX_DEV_MINOR); }
    /** Unsafe version of {@link #stx_mnt_id}. */
    public static long nstx_mnt_id(long struct) { return UNSAFE.getLong(null, struct + Statx.STX_MNT_ID); }
    public static long n__spare2(long struct) { return UNSAFE.getLong(null, struct + Statx.__SPARE2); }
    public static LongBuffer n__spare3(long struct) { return memLongBuffer(struct + Statx.__SPARE3, 12); }
    public static long n__spare3(long struct, int index) {
        return UNSAFE.getLong(null, struct + Statx.__SPARE3 + check(index, 12) * 8);
    }

    /** Unsafe version of {@link #stx_mask(int) stx_mask}. */
    public static void nstx_mask(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_MASK, value); }
    /** Unsafe version of {@link #stx_blksize(int) stx_blksize}. */
    public static void nstx_blksize(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_BLKSIZE, value); }
    /** Unsafe version of {@link #stx_attributes(long) stx_attributes}. */
    public static void nstx_attributes(long struct, long value) { UNSAFE.putLong(null, struct + Statx.STX_ATTRIBUTES, value); }
    /** Unsafe version of {@link #stx_nlink(int) stx_nlink}. */
    public static void nstx_nlink(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_NLINK, value); }
    /** Unsafe version of {@link #stx_uid(int) stx_uid}. */
    public static void nstx_uid(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_UID, value); }
    /** Unsafe version of {@link #stx_gid(int) stx_gid}. */
    public static void nstx_gid(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_GID, value); }
    /** Unsafe version of {@link #stx_mode(short) stx_mode}. */
    public static void nstx_mode(long struct, short value) { UNSAFE.putShort(null, struct + Statx.STX_MODE, value); }
    public static void n__spare0(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 1); }
        memCopy(memAddress(value), struct + Statx.__SPARE0, value.remaining() * 2);
    }
    public static void n__spare0(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + Statx.__SPARE0 + check(index, 1) * 2, value);
    }
    /** Unsafe version of {@link #stx_ino(long) stx_ino}. */
    public static void nstx_ino(long struct, long value) { UNSAFE.putLong(null, struct + Statx.STX_INO, value); }
    /** Unsafe version of {@link #stx_size(long) stx_size}. */
    public static void nstx_size(long struct, long value) { UNSAFE.putLong(null, struct + Statx.STX_SIZE, value); }
    /** Unsafe version of {@link #stx_blocks(long) stx_blocks}. */
    public static void nstx_blocks(long struct, long value) { UNSAFE.putLong(null, struct + Statx.STX_BLOCKS, value); }
    /** Unsafe version of {@link #stx_attributes_mask(long) stx_attributes_mask}. */
    public static void nstx_attributes_mask(long struct, long value) { UNSAFE.putLong(null, struct + Statx.STX_ATTRIBUTES_MASK, value); }
    /** Unsafe version of {@link #stx_atime(StatxTimestamp) stx_atime}. */
    public static void nstx_atime(long struct, StatxTimestamp value) { memCopy(value.address(), struct + Statx.STX_ATIME, StatxTimestamp.SIZEOF); }
    /** Unsafe version of {@link #stx_btime(StatxTimestamp) stx_btime}. */
    public static void nstx_btime(long struct, StatxTimestamp value) { memCopy(value.address(), struct + Statx.STX_BTIME, StatxTimestamp.SIZEOF); }
    /** Unsafe version of {@link #stx_ctime(StatxTimestamp) stx_ctime}. */
    public static void nstx_ctime(long struct, StatxTimestamp value) { memCopy(value.address(), struct + Statx.STX_CTIME, StatxTimestamp.SIZEOF); }
    /** Unsafe version of {@link #stx_mtime(StatxTimestamp) stx_mtime}. */
    public static void nstx_mtime(long struct, StatxTimestamp value) { memCopy(value.address(), struct + Statx.STX_MTIME, StatxTimestamp.SIZEOF); }
    /** Unsafe version of {@link #stx_rdev_major(int) stx_rdev_major}. */
    public static void nstx_rdev_major(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_RDEV_MAJOR, value); }
    /** Unsafe version of {@link #stx_rdev_minor(int) stx_rdev_minor}. */
    public static void nstx_rdev_minor(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_RDEV_MINOR, value); }
    /** Unsafe version of {@link #stx_dev_major(int) stx_dev_major}. */
    public static void nstx_dev_major(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_DEV_MAJOR, value); }
    /** Unsafe version of {@link #stx_dev_minor(int) stx_dev_minor}. */
    public static void nstx_dev_minor(long struct, int value) { UNSAFE.putInt(null, struct + Statx.STX_DEV_MINOR, value); }
    /** Unsafe version of {@link #stx_mnt_id(long) stx_mnt_id}. */
    public static void nstx_mnt_id(long struct, long value) { UNSAFE.putLong(null, struct + Statx.STX_MNT_ID, value); }
    public static void n__spare2(long struct, long value) { UNSAFE.putLong(null, struct + Statx.__SPARE2, value); }
    public static void n__spare3(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 12); }
        memCopy(memAddress(value), struct + Statx.__SPARE3, value.remaining() * 8);
    }
    public static void n__spare3(long struct, int index, long value) {
        UNSAFE.putLong(null, struct + Statx.__SPARE3 + check(index, 12) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link Statx} structs. */
    public static class Buffer extends StructBuffer<Statx, Buffer> implements NativeResource {

        private static final Statx ELEMENT_FACTORY = Statx.create(-1L);

        /**
         * Creates a new {@code Statx.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Statx#SIZEOF}, and its mark will be undefined.</p>
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
        protected Statx getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link Statx#stx_mask} field. */
        @NativeType("__u32")
        public int stx_mask() { return Statx.nstx_mask(address()); }
        /** @return the value of the {@link Statx#stx_blksize} field. */
        @NativeType("__u32")
        public int stx_blksize() { return Statx.nstx_blksize(address()); }
        /** @return the value of the {@link Statx#stx_attributes} field. */
        @NativeType("__u64")
        public long stx_attributes() { return Statx.nstx_attributes(address()); }
        /** @return the value of the {@link Statx#stx_nlink} field. */
        @NativeType("__u32")
        public int stx_nlink() { return Statx.nstx_nlink(address()); }
        /** @return the value of the {@link Statx#stx_uid} field. */
        @NativeType("__u32")
        public int stx_uid() { return Statx.nstx_uid(address()); }
        /** @return the value of the {@link Statx#stx_gid} field. */
        @NativeType("__u32")
        public int stx_gid() { return Statx.nstx_gid(address()); }
        /** @return the value of the {@link Statx#stx_mode} field. */
        @NativeType("__u16")
        public short stx_mode() { return Statx.nstx_mode(address()); }
        /** @return the value of the {@link Statx#stx_ino} field. */
        @NativeType("__u64")
        public long stx_ino() { return Statx.nstx_ino(address()); }
        /** @return the value of the {@link Statx#stx_size} field. */
        @NativeType("__u64")
        public long stx_size() { return Statx.nstx_size(address()); }
        /** @return the value of the {@link Statx#stx_blocks} field. */
        @NativeType("__u64")
        public long stx_blocks() { return Statx.nstx_blocks(address()); }
        /** @return the value of the {@link Statx#stx_attributes_mask} field. */
        @NativeType("__u64")
        public long stx_attributes_mask() { return Statx.nstx_attributes_mask(address()); }
        /** @return a {@link StatxTimestamp} view of the {@link Statx#stx_atime} field. */
        @NativeType("struct statx_timestamp")
        public StatxTimestamp stx_atime() { return Statx.nstx_atime(address()); }
        /** @return a {@link StatxTimestamp} view of the {@link Statx#stx_btime} field. */
        @NativeType("struct statx_timestamp")
        public StatxTimestamp stx_btime() { return Statx.nstx_btime(address()); }
        /** @return a {@link StatxTimestamp} view of the {@link Statx#stx_ctime} field. */
        @NativeType("struct statx_timestamp")
        public StatxTimestamp stx_ctime() { return Statx.nstx_ctime(address()); }
        /** @return a {@link StatxTimestamp} view of the {@link Statx#stx_mtime} field. */
        @NativeType("struct statx_timestamp")
        public StatxTimestamp stx_mtime() { return Statx.nstx_mtime(address()); }
        /** @return the value of the {@link Statx#stx_rdev_major} field. */
        @NativeType("__u32")
        public int stx_rdev_major() { return Statx.nstx_rdev_major(address()); }
        /** @return the value of the {@code stx_rdev_minor} field. */
        @NativeType("__u32")
        public int stx_rdev_minor() { return Statx.nstx_rdev_minor(address()); }
        /** @return the value of the {@link Statx#stx_dev_major} field. */
        @NativeType("__u32")
        public int stx_dev_major() { return Statx.nstx_dev_major(address()); }
        /** @return the value of the {@code stx_dev_minor} field. */
        @NativeType("__u32")
        public int stx_dev_minor() { return Statx.nstx_dev_minor(address()); }
        /** @return the value of the {@code stx_mnt_id} field. */
        @NativeType("__u64")
        public long stx_mnt_id() { return Statx.nstx_mnt_id(address()); }

        /** Sets the specified value to the {@link Statx#stx_mask} field. */
        public Statx.Buffer stx_mask(@NativeType("__u32") int value) { Statx.nstx_mask(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_blksize} field. */
        public Statx.Buffer stx_blksize(@NativeType("__u32") int value) { Statx.nstx_blksize(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_attributes} field. */
        public Statx.Buffer stx_attributes(@NativeType("__u64") long value) { Statx.nstx_attributes(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_nlink} field. */
        public Statx.Buffer stx_nlink(@NativeType("__u32") int value) { Statx.nstx_nlink(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_uid} field. */
        public Statx.Buffer stx_uid(@NativeType("__u32") int value) { Statx.nstx_uid(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_gid} field. */
        public Statx.Buffer stx_gid(@NativeType("__u32") int value) { Statx.nstx_gid(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_mode} field. */
        public Statx.Buffer stx_mode(@NativeType("__u16") short value) { Statx.nstx_mode(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_ino} field. */
        public Statx.Buffer stx_ino(@NativeType("__u64") long value) { Statx.nstx_ino(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_size} field. */
        public Statx.Buffer stx_size(@NativeType("__u64") long value) { Statx.nstx_size(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_blocks} field. */
        public Statx.Buffer stx_blocks(@NativeType("__u64") long value) { Statx.nstx_blocks(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_attributes_mask} field. */
        public Statx.Buffer stx_attributes_mask(@NativeType("__u64") long value) { Statx.nstx_attributes_mask(address(), value); return this; }
        /** Copies the specified {@link StatxTimestamp} to the {@link Statx#stx_atime} field. */
        public Statx.Buffer stx_atime(@NativeType("struct statx_timestamp") StatxTimestamp value) { Statx.nstx_atime(address(), value); return this; }
        /** Passes the {@link Statx#stx_atime} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Statx.Buffer stx_atime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_atime()); return this; }
        /** Copies the specified {@link StatxTimestamp} to the {@link Statx#stx_btime} field. */
        public Statx.Buffer stx_btime(@NativeType("struct statx_timestamp") StatxTimestamp value) { Statx.nstx_btime(address(), value); return this; }
        /** Passes the {@link Statx#stx_btime} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Statx.Buffer stx_btime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_btime()); return this; }
        /** Copies the specified {@link StatxTimestamp} to the {@link Statx#stx_ctime} field. */
        public Statx.Buffer stx_ctime(@NativeType("struct statx_timestamp") StatxTimestamp value) { Statx.nstx_ctime(address(), value); return this; }
        /** Passes the {@link Statx#stx_ctime} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Statx.Buffer stx_ctime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_ctime()); return this; }
        /** Copies the specified {@link StatxTimestamp} to the {@link Statx#stx_mtime} field. */
        public Statx.Buffer stx_mtime(@NativeType("struct statx_timestamp") StatxTimestamp value) { Statx.nstx_mtime(address(), value); return this; }
        /** Passes the {@link Statx#stx_mtime} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Statx.Buffer stx_mtime(java.util.function.Consumer<StatxTimestamp> consumer) { consumer.accept(stx_mtime()); return this; }
        /** Sets the specified value to the {@link Statx#stx_rdev_major} field. */
        public Statx.Buffer stx_rdev_major(@NativeType("__u32") int value) { Statx.nstx_rdev_major(address(), value); return this; }
        /** Sets the specified value to the {@code stx_rdev_minor} field. */
        public Statx.Buffer stx_rdev_minor(@NativeType("__u32") int value) { Statx.nstx_rdev_minor(address(), value); return this; }
        /** Sets the specified value to the {@link Statx#stx_dev_major} field. */
        public Statx.Buffer stx_dev_major(@NativeType("__u32") int value) { Statx.nstx_dev_major(address(), value); return this; }
        /** Sets the specified value to the {@code stx_dev_minor} field. */
        public Statx.Buffer stx_dev_minor(@NativeType("__u32") int value) { Statx.nstx_dev_minor(address(), value); return this; }
        /** Sets the specified value to the {@code stx_mnt_id} field. */
        public Statx.Buffer stx_mnt_id(@NativeType("__u64") long value) { Statx.nstx_mnt_id(address(), value); return this; }

    }

}