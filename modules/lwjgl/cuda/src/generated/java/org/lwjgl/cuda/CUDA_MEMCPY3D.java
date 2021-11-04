/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * 3D memory copy parameters.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_MEMCPY3D {
 *     size_t {@link #srcXInBytes};
 *     size_t {@link #srcY};
 *     size_t {@link #srcZ};
 *     size_t {@link #srcLOD};
 *     CUmemorytype {@link #srcMemoryType};
 *     void const * {@link #srcHost};
 *     CUdeviceptr {@link #srcDevice};
 *     CUarray {@link #srcArray};
 *     void * {@link #reserved0};
 *     size_t {@link #srcPitch};
 *     size_t {@link #srcHeight};
 *     size_t {@link #dstXInBytes};
 *     size_t {@link #dstY};
 *     size_t {@link #dstZ};
 *     size_t {@link #dstLOD};
 *     CUmemorytype {@link #dstMemoryType};
 *     void * {@link #dstHost};
 *     CUdeviceptr {@link #dstDevice};
 *     CUarray {@link #dstArray};
 *     void * {@link #reserved1};
 *     size_t {@link #dstPitch};
 *     size_t {@link #dstHeight};
 *     size_t {@link #WidthInBytes};
 *     size_t {@link #Height};
 *     size_t {@link #Depth};
 * }</code></pre>
 */
public class CUDA_MEMCPY3D extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCXINBYTES,
        SRCY,
        SRCZ,
        SRCLOD,
        SRCMEMORYTYPE,
        SRCHOST,
        SRCDEVICE,
        SRCARRAY,
        RESERVED0,
        SRCPITCH,
        SRCHEIGHT,
        DSTXINBYTES,
        DSTY,
        DSTZ,
        DSTLOD,
        DSTMEMORYTYPE,
        DSTHOST,
        DSTDEVICE,
        DSTARRAY,
        RESERVED1,
        DSTPITCH,
        DSTHEIGHT,
        WIDTHINBYTES,
        HEIGHT,
        DEPTH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCXINBYTES = layout.offsetof(0);
        SRCY = layout.offsetof(1);
        SRCZ = layout.offsetof(2);
        SRCLOD = layout.offsetof(3);
        SRCMEMORYTYPE = layout.offsetof(4);
        SRCHOST = layout.offsetof(5);
        SRCDEVICE = layout.offsetof(6);
        SRCARRAY = layout.offsetof(7);
        RESERVED0 = layout.offsetof(8);
        SRCPITCH = layout.offsetof(9);
        SRCHEIGHT = layout.offsetof(10);
        DSTXINBYTES = layout.offsetof(11);
        DSTY = layout.offsetof(12);
        DSTZ = layout.offsetof(13);
        DSTLOD = layout.offsetof(14);
        DSTMEMORYTYPE = layout.offsetof(15);
        DSTHOST = layout.offsetof(16);
        DSTDEVICE = layout.offsetof(17);
        DSTARRAY = layout.offsetof(18);
        RESERVED1 = layout.offsetof(19);
        DSTPITCH = layout.offsetof(20);
        DSTHEIGHT = layout.offsetof(21);
        WIDTHINBYTES = layout.offsetof(22);
        HEIGHT = layout.offsetof(23);
        DEPTH = layout.offsetof(24);
    }

    /**
     * Creates a {@code CUDA_MEMCPY3D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_MEMCPY3D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Source X in bytes */
    @NativeType("size_t")
    public long srcXInBytes() { return nsrcXInBytes(address()); }
    /** Source Y */
    @NativeType("size_t")
    public long srcY() { return nsrcY(address()); }
    /** Source Z */
    @NativeType("size_t")
    public long srcZ() { return nsrcZ(address()); }
    /** Source LOD */
    @NativeType("size_t")
    public long srcLOD() { return nsrcLOD(address()); }
    /** Source memory type (host, device, array) */
    @NativeType("CUmemorytype")
    public int srcMemoryType() { return nsrcMemoryType(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return Source host pointer
     */
    @Nullable
    @NativeType("void const *")
    public ByteBuffer srcHost(int capacity) { return nsrcHost(address(), capacity); }
    /** Source device pointer */
    @NativeType("CUdeviceptr")
    public long srcDevice() { return nsrcDevice(address()); }
    /** Source array reference */
    @NativeType("CUarray")
    public long srcArray() { return nsrcArray(address()); }
    /** Must be {@code NULL} */
    @NativeType("void *")
    public long reserved0() { return nreserved0(address()); }
    /** Source pitch (ignored when src is array) */
    @NativeType("size_t")
    public long srcPitch() { return nsrcPitch(address()); }
    /** Source height (ignored when src is array; may be 0 if Depth==1) */
    @NativeType("size_t")
    public long srcHeight() { return nsrcHeight(address()); }
    /** Destination X in bytes */
    @NativeType("size_t")
    public long dstXInBytes() { return ndstXInBytes(address()); }
    /** Destination Y */
    @NativeType("size_t")
    public long dstY() { return ndstY(address()); }
    /** Destination Z */
    @NativeType("size_t")
    public long dstZ() { return ndstZ(address()); }
    /** Destination LOD */
    @NativeType("size_t")
    public long dstLOD() { return ndstLOD(address()); }
    /** Destination memory type (host, device, array) */
    @NativeType("CUmemorytype")
    public int dstMemoryType() { return ndstMemoryType(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return Destination host pointer
     */
    @Nullable
    @NativeType("void *")
    public ByteBuffer dstHost(int capacity) { return ndstHost(address(), capacity); }
    /** Destination device pointer */
    @NativeType("CUdeviceptr")
    public long dstDevice() { return ndstDevice(address()); }
    /** Destination array reference */
    @NativeType("CUarray")
    public long dstArray() { return ndstArray(address()); }
    /** Must be {@code NULL} */
    @NativeType("void *")
    public long reserved1() { return nreserved1(address()); }
    /** Destination pitch (ignored when dst is array) */
    @NativeType("size_t")
    public long dstPitch() { return ndstPitch(address()); }
    /** Destination height (ignored when dst is array; may be 0 if Depth==1) */
    @NativeType("size_t")
    public long dstHeight() { return ndstHeight(address()); }
    /** Width of 3D memory copy in bytes */
    @NativeType("size_t")
    public long WidthInBytes() { return nWidthInBytes(address()); }
    /** Height of 3D memory copy */
    @NativeType("size_t")
    public long Height() { return nHeight(address()); }
    /** Depth of 3D memory copy */
    @NativeType("size_t")
    public long Depth() { return nDepth(address()); }

    /** Sets the specified value to the {@link #srcXInBytes} field. */
    public CUDA_MEMCPY3D srcXInBytes(@NativeType("size_t") long value) { nsrcXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@link #srcY} field. */
    public CUDA_MEMCPY3D srcY(@NativeType("size_t") long value) { nsrcY(address(), value); return this; }
    /** Sets the specified value to the {@link #srcZ} field. */
    public CUDA_MEMCPY3D srcZ(@NativeType("size_t") long value) { nsrcZ(address(), value); return this; }
    /** Sets the specified value to the {@link #srcLOD} field. */
    public CUDA_MEMCPY3D srcLOD(@NativeType("size_t") long value) { nsrcLOD(address(), value); return this; }
    /** Sets the specified value to the {@link #srcMemoryType} field. */
    public CUDA_MEMCPY3D srcMemoryType(@NativeType("CUmemorytype") int value) { nsrcMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #srcHost} field. */
    public CUDA_MEMCPY3D srcHost(@Nullable @NativeType("void const *") ByteBuffer value) { nsrcHost(address(), value); return this; }
    /** Sets the specified value to the {@link #srcDevice} field. */
    public CUDA_MEMCPY3D srcDevice(@NativeType("CUdeviceptr") long value) { nsrcDevice(address(), value); return this; }
    /** Sets the specified value to the {@link #srcArray} field. */
    public CUDA_MEMCPY3D srcArray(@NativeType("CUarray") long value) { nsrcArray(address(), value); return this; }
    /** Sets the specified value to the {@link #reserved0} field. */
    public CUDA_MEMCPY3D reserved0(@NativeType("void *") long value) { nreserved0(address(), value); return this; }
    /** Sets the specified value to the {@link #srcPitch} field. */
    public CUDA_MEMCPY3D srcPitch(@NativeType("size_t") long value) { nsrcPitch(address(), value); return this; }
    /** Sets the specified value to the {@link #srcHeight} field. */
    public CUDA_MEMCPY3D srcHeight(@NativeType("size_t") long value) { nsrcHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #dstXInBytes} field. */
    public CUDA_MEMCPY3D dstXInBytes(@NativeType("size_t") long value) { ndstXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@link #dstY} field. */
    public CUDA_MEMCPY3D dstY(@NativeType("size_t") long value) { ndstY(address(), value); return this; }
    /** Sets the specified value to the {@link #dstZ} field. */
    public CUDA_MEMCPY3D dstZ(@NativeType("size_t") long value) { ndstZ(address(), value); return this; }
    /** Sets the specified value to the {@link #dstLOD} field. */
    public CUDA_MEMCPY3D dstLOD(@NativeType("size_t") long value) { ndstLOD(address(), value); return this; }
    /** Sets the specified value to the {@link #dstMemoryType} field. */
    public CUDA_MEMCPY3D dstMemoryType(@NativeType("CUmemorytype") int value) { ndstMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #dstHost} field. */
    public CUDA_MEMCPY3D dstHost(@Nullable @NativeType("void *") ByteBuffer value) { ndstHost(address(), value); return this; }
    /** Sets the specified value to the {@link #dstDevice} field. */
    public CUDA_MEMCPY3D dstDevice(@NativeType("CUdeviceptr") long value) { ndstDevice(address(), value); return this; }
    /** Sets the specified value to the {@link #dstArray} field. */
    public CUDA_MEMCPY3D dstArray(@NativeType("CUarray") long value) { ndstArray(address(), value); return this; }
    /** Sets the specified value to the {@link #reserved1} field. */
    public CUDA_MEMCPY3D reserved1(@NativeType("void *") long value) { nreserved1(address(), value); return this; }
    /** Sets the specified value to the {@link #dstPitch} field. */
    public CUDA_MEMCPY3D dstPitch(@NativeType("size_t") long value) { ndstPitch(address(), value); return this; }
    /** Sets the specified value to the {@link #dstHeight} field. */
    public CUDA_MEMCPY3D dstHeight(@NativeType("size_t") long value) { ndstHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #WidthInBytes} field. */
    public CUDA_MEMCPY3D WidthInBytes(@NativeType("size_t") long value) { nWidthInBytes(address(), value); return this; }
    /** Sets the specified value to the {@link #Height} field. */
    public CUDA_MEMCPY3D Height(@NativeType("size_t") long value) { nHeight(address(), value); return this; }
    /** Sets the specified value to the {@link #Depth} field. */
    public CUDA_MEMCPY3D Depth(@NativeType("size_t") long value) { nDepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_MEMCPY3D set(
        long srcXInBytes,
        long srcY,
        long srcZ,
        long srcLOD,
        int srcMemoryType,
        @Nullable ByteBuffer srcHost,
        long srcDevice,
        long srcArray,
        long reserved0,
        long srcPitch,
        long srcHeight,
        long dstXInBytes,
        long dstY,
        long dstZ,
        long dstLOD,
        int dstMemoryType,
        @Nullable ByteBuffer dstHost,
        long dstDevice,
        long dstArray,
        long reserved1,
        long dstPitch,
        long dstHeight,
        long WidthInBytes,
        long Height,
        long Depth
    ) {
        srcXInBytes(srcXInBytes);
        srcY(srcY);
        srcZ(srcZ);
        srcLOD(srcLOD);
        srcMemoryType(srcMemoryType);
        srcHost(srcHost);
        srcDevice(srcDevice);
        srcArray(srcArray);
        reserved0(reserved0);
        srcPitch(srcPitch);
        srcHeight(srcHeight);
        dstXInBytes(dstXInBytes);
        dstY(dstY);
        dstZ(dstZ);
        dstLOD(dstLOD);
        dstMemoryType(dstMemoryType);
        dstHost(dstHost);
        dstDevice(dstDevice);
        dstArray(dstArray);
        reserved1(reserved1);
        dstPitch(dstPitch);
        dstHeight(dstHeight);
        WidthInBytes(WidthInBytes);
        Height(Height);
        Depth(Depth);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_MEMCPY3D set(CUDA_MEMCPY3D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_MEMCPY3D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY3D malloc() {
        return wrap(CUDA_MEMCPY3D.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_MEMCPY3D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY3D calloc() {
        return wrap(CUDA_MEMCPY3D.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_MEMCPY3D} instance allocated with {@link BufferUtils}. */
    public static CUDA_MEMCPY3D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_MEMCPY3D.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_MEMCPY3D} instance for the specified memory address. */
    public static CUDA_MEMCPY3D create(long address) {
        return wrap(CUDA_MEMCPY3D.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMCPY3D createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_MEMCPY3D.class, address);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_MEMCPY3D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMCPY3D.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY3D.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_MEMCPY3D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY3D malloc(MemoryStack stack) {
        return wrap(CUDA_MEMCPY3D.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_MEMCPY3D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY3D calloc(MemoryStack stack) {
        return wrap(CUDA_MEMCPY3D.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcXInBytes}. */
    public static long nsrcXInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCXINBYTES); }
    /** Unsafe version of {@link #srcY}. */
    public static long nsrcY(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCY); }
    /** Unsafe version of {@link #srcZ}. */
    public static long nsrcZ(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCZ); }
    /** Unsafe version of {@link #srcLOD}. */
    public static long nsrcLOD(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCLOD); }
    /** Unsafe version of {@link #srcMemoryType}. */
    public static int nsrcMemoryType(long struct) { return UNSAFE.getInt(null, struct + CUDA_MEMCPY3D.SRCMEMORYTYPE); }
    /** Unsafe version of {@link #srcHost(int) srcHost}. */
    @Nullable public static ByteBuffer nsrcHost(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + CUDA_MEMCPY3D.SRCHOST), capacity); }
    /** Unsafe version of {@link #srcDevice}. */
    public static long nsrcDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCDEVICE); }
    /** Unsafe version of {@link #srcArray}. */
    public static long nsrcArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCARRAY); }
    /** Unsafe version of {@link #reserved0}. */
    public static long nreserved0(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.RESERVED0); }
    /** Unsafe version of {@link #srcPitch}. */
    public static long nsrcPitch(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCPITCH); }
    /** Unsafe version of {@link #srcHeight}. */
    public static long nsrcHeight(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCHEIGHT); }
    /** Unsafe version of {@link #dstXInBytes}. */
    public static long ndstXInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTXINBYTES); }
    /** Unsafe version of {@link #dstY}. */
    public static long ndstY(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTY); }
    /** Unsafe version of {@link #dstZ}. */
    public static long ndstZ(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTZ); }
    /** Unsafe version of {@link #dstLOD}. */
    public static long ndstLOD(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTLOD); }
    /** Unsafe version of {@link #dstMemoryType}. */
    public static int ndstMemoryType(long struct) { return UNSAFE.getInt(null, struct + CUDA_MEMCPY3D.DSTMEMORYTYPE); }
    /** Unsafe version of {@link #dstHost(int) dstHost}. */
    @Nullable public static ByteBuffer ndstHost(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + CUDA_MEMCPY3D.DSTHOST), capacity); }
    /** Unsafe version of {@link #dstDevice}. */
    public static long ndstDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTDEVICE); }
    /** Unsafe version of {@link #dstArray}. */
    public static long ndstArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTARRAY); }
    /** Unsafe version of {@link #reserved1}. */
    public static long nreserved1(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.RESERVED1); }
    /** Unsafe version of {@link #dstPitch}. */
    public static long ndstPitch(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTPITCH); }
    /** Unsafe version of {@link #dstHeight}. */
    public static long ndstHeight(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTHEIGHT); }
    /** Unsafe version of {@link #WidthInBytes}. */
    public static long nWidthInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.WIDTHINBYTES); }
    /** Unsafe version of {@link #Height}. */
    public static long nHeight(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.HEIGHT); }
    /** Unsafe version of {@link #Depth}. */
    public static long nDepth(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DEPTH); }

    /** Unsafe version of {@link #srcXInBytes(long) srcXInBytes}. */
    public static void nsrcXInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCXINBYTES, value); }
    /** Unsafe version of {@link #srcY(long) srcY}. */
    public static void nsrcY(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCY, value); }
    /** Unsafe version of {@link #srcZ(long) srcZ}. */
    public static void nsrcZ(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCZ, value); }
    /** Unsafe version of {@link #srcLOD(long) srcLOD}. */
    public static void nsrcLOD(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCLOD, value); }
    /** Unsafe version of {@link #srcMemoryType(int) srcMemoryType}. */
    public static void nsrcMemoryType(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_MEMCPY3D.SRCMEMORYTYPE, value); }
    /** Unsafe version of {@link #srcHost(ByteBuffer) srcHost}. */
    public static void nsrcHost(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCHOST, memAddressSafe(value)); }
    /** Unsafe version of {@link #srcDevice(long) srcDevice}. */
    public static void nsrcDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCDEVICE, value); }
    /** Unsafe version of {@link #srcArray(long) srcArray}. */
    public static void nsrcArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCARRAY, value); }
    /** Unsafe version of {@link #reserved0(long) reserved0}. */
    public static void nreserved0(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.RESERVED0, value); }
    /** Unsafe version of {@link #srcPitch(long) srcPitch}. */
    public static void nsrcPitch(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCPITCH, value); }
    /** Unsafe version of {@link #srcHeight(long) srcHeight}. */
    public static void nsrcHeight(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCHEIGHT, value); }
    /** Unsafe version of {@link #dstXInBytes(long) dstXInBytes}. */
    public static void ndstXInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTXINBYTES, value); }
    /** Unsafe version of {@link #dstY(long) dstY}. */
    public static void ndstY(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTY, value); }
    /** Unsafe version of {@link #dstZ(long) dstZ}. */
    public static void ndstZ(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTZ, value); }
    /** Unsafe version of {@link #dstLOD(long) dstLOD}. */
    public static void ndstLOD(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTLOD, value); }
    /** Unsafe version of {@link #dstMemoryType(int) dstMemoryType}. */
    public static void ndstMemoryType(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_MEMCPY3D.DSTMEMORYTYPE, value); }
    /** Unsafe version of {@link #dstHost(ByteBuffer) dstHost}. */
    public static void ndstHost(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTHOST, memAddressSafe(value)); }
    /** Unsafe version of {@link #dstDevice(long) dstDevice}. */
    public static void ndstDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTDEVICE, value); }
    /** Unsafe version of {@link #dstArray(long) dstArray}. */
    public static void ndstArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTARRAY, value); }
    /** Unsafe version of {@link #reserved1(long) reserved1}. */
    public static void nreserved1(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.RESERVED1, value); }
    /** Unsafe version of {@link #dstPitch(long) dstPitch}. */
    public static void ndstPitch(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTPITCH, value); }
    /** Unsafe version of {@link #dstHeight(long) dstHeight}. */
    public static void ndstHeight(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTHEIGHT, value); }
    /** Unsafe version of {@link #WidthInBytes(long) WidthInBytes}. */
    public static void nWidthInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.WIDTHINBYTES, value); }
    /** Unsafe version of {@link #Height(long) Height}. */
    public static void nHeight(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.HEIGHT, value); }
    /** Unsafe version of {@link #Depth(long) Depth}. */
    public static void nDepth(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DEPTH, value); }

    // -----------------------------------

    /** An array of {@link CUDA_MEMCPY3D} structs. */
    public static class Buffer extends StructBuffer<CUDA_MEMCPY3D, Buffer> implements NativeResource {

        private static final CUDA_MEMCPY3D ELEMENT_FACTORY = CUDA_MEMCPY3D.create(-1L);

        /**
         * Creates a new {@code CUDA_MEMCPY3D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_MEMCPY3D#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_MEMCPY3D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUDA_MEMCPY3D#srcXInBytes} field. */
        @NativeType("size_t")
        public long srcXInBytes() { return CUDA_MEMCPY3D.nsrcXInBytes(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcY} field. */
        @NativeType("size_t")
        public long srcY() { return CUDA_MEMCPY3D.nsrcY(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcZ} field. */
        @NativeType("size_t")
        public long srcZ() { return CUDA_MEMCPY3D.nsrcZ(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcLOD} field. */
        @NativeType("size_t")
        public long srcLOD() { return CUDA_MEMCPY3D.nsrcLOD(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcMemoryType} field. */
        @NativeType("CUmemorytype")
        public int srcMemoryType() { return CUDA_MEMCPY3D.nsrcMemoryType(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link CUDA_MEMCPY3D#srcHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer srcHost(int capacity) { return CUDA_MEMCPY3D.nsrcHost(address(), capacity); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcDevice} field. */
        @NativeType("CUdeviceptr")
        public long srcDevice() { return CUDA_MEMCPY3D.nsrcDevice(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcArray} field. */
        @NativeType("CUarray")
        public long srcArray() { return CUDA_MEMCPY3D.nsrcArray(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#reserved0} field. */
        @NativeType("void *")
        public long reserved0() { return CUDA_MEMCPY3D.nreserved0(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcPitch} field. */
        @NativeType("size_t")
        public long srcPitch() { return CUDA_MEMCPY3D.nsrcPitch(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#srcHeight} field. */
        @NativeType("size_t")
        public long srcHeight() { return CUDA_MEMCPY3D.nsrcHeight(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstXInBytes} field. */
        @NativeType("size_t")
        public long dstXInBytes() { return CUDA_MEMCPY3D.ndstXInBytes(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstY} field. */
        @NativeType("size_t")
        public long dstY() { return CUDA_MEMCPY3D.ndstY(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstZ} field. */
        @NativeType("size_t")
        public long dstZ() { return CUDA_MEMCPY3D.ndstZ(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstLOD} field. */
        @NativeType("size_t")
        public long dstLOD() { return CUDA_MEMCPY3D.ndstLOD(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstMemoryType} field. */
        @NativeType("CUmemorytype")
        public int dstMemoryType() { return CUDA_MEMCPY3D.ndstMemoryType(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link CUDA_MEMCPY3D#dstHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void *")
        public ByteBuffer dstHost(int capacity) { return CUDA_MEMCPY3D.ndstHost(address(), capacity); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstDevice} field. */
        @NativeType("CUdeviceptr")
        public long dstDevice() { return CUDA_MEMCPY3D.ndstDevice(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstArray} field. */
        @NativeType("CUarray")
        public long dstArray() { return CUDA_MEMCPY3D.ndstArray(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#reserved1} field. */
        @NativeType("void *")
        public long reserved1() { return CUDA_MEMCPY3D.nreserved1(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstPitch} field. */
        @NativeType("size_t")
        public long dstPitch() { return CUDA_MEMCPY3D.ndstPitch(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#dstHeight} field. */
        @NativeType("size_t")
        public long dstHeight() { return CUDA_MEMCPY3D.ndstHeight(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#WidthInBytes} field. */
        @NativeType("size_t")
        public long WidthInBytes() { return CUDA_MEMCPY3D.nWidthInBytes(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#Height} field. */
        @NativeType("size_t")
        public long Height() { return CUDA_MEMCPY3D.nHeight(address()); }
        /** @return the value of the {@link CUDA_MEMCPY3D#Depth} field. */
        @NativeType("size_t")
        public long Depth() { return CUDA_MEMCPY3D.nDepth(address()); }

        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcXInBytes} field. */
        public CUDA_MEMCPY3D.Buffer srcXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcY} field. */
        public CUDA_MEMCPY3D.Buffer srcY(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcY(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcZ} field. */
        public CUDA_MEMCPY3D.Buffer srcZ(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcZ(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcLOD} field. */
        public CUDA_MEMCPY3D.Buffer srcLOD(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcLOD(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcMemoryType} field. */
        public CUDA_MEMCPY3D.Buffer srcMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY3D.nsrcMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link CUDA_MEMCPY3D#srcHost} field. */
        public CUDA_MEMCPY3D.Buffer srcHost(@Nullable @NativeType("void const *") ByteBuffer value) { CUDA_MEMCPY3D.nsrcHost(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcDevice} field. */
        public CUDA_MEMCPY3D.Buffer srcDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY3D.nsrcDevice(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcArray} field. */
        public CUDA_MEMCPY3D.Buffer srcArray(@NativeType("CUarray") long value) { CUDA_MEMCPY3D.nsrcArray(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#reserved0} field. */
        public CUDA_MEMCPY3D.Buffer reserved0(@NativeType("void *") long value) { CUDA_MEMCPY3D.nreserved0(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcPitch} field. */
        public CUDA_MEMCPY3D.Buffer srcPitch(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcPitch(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#srcHeight} field. */
        public CUDA_MEMCPY3D.Buffer srcHeight(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcHeight(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstXInBytes} field. */
        public CUDA_MEMCPY3D.Buffer dstXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstY} field. */
        public CUDA_MEMCPY3D.Buffer dstY(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstY(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstZ} field. */
        public CUDA_MEMCPY3D.Buffer dstZ(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstZ(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstLOD} field. */
        public CUDA_MEMCPY3D.Buffer dstLOD(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstLOD(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstMemoryType} field. */
        public CUDA_MEMCPY3D.Buffer dstMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY3D.ndstMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link CUDA_MEMCPY3D#dstHost} field. */
        public CUDA_MEMCPY3D.Buffer dstHost(@Nullable @NativeType("void *") ByteBuffer value) { CUDA_MEMCPY3D.ndstHost(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstDevice} field. */
        public CUDA_MEMCPY3D.Buffer dstDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY3D.ndstDevice(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstArray} field. */
        public CUDA_MEMCPY3D.Buffer dstArray(@NativeType("CUarray") long value) { CUDA_MEMCPY3D.ndstArray(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#reserved1} field. */
        public CUDA_MEMCPY3D.Buffer reserved1(@NativeType("void *") long value) { CUDA_MEMCPY3D.nreserved1(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstPitch} field. */
        public CUDA_MEMCPY3D.Buffer dstPitch(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstPitch(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#dstHeight} field. */
        public CUDA_MEMCPY3D.Buffer dstHeight(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstHeight(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#WidthInBytes} field. */
        public CUDA_MEMCPY3D.Buffer WidthInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nWidthInBytes(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#Height} field. */
        public CUDA_MEMCPY3D.Buffer Height(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nHeight(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY3D#Depth} field. */
        public CUDA_MEMCPY3D.Buffer Depth(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nDepth(address(), value); return this; }

    }

}