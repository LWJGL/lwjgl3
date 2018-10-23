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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * 3D memory copy parameters.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code srcXInBytes} &ndash; Source X in bytes</li>
 * <li>{@code srcY} &ndash; Source Y</li>
 * <li>{@code srcZ} &ndash; Source Z</li>
 * <li>{@code srcLOD} &ndash; Source LOD</li>
 * <li>{@code srcMemoryType} &ndash; Source memory type (host, device, array)</li>
 * <li>{@code srcHost} &ndash; Source host pointer</li>
 * <li>{@code srcDevice} &ndash; Source device pointer</li>
 * <li>{@code srcArray} &ndash; Source array reference</li>
 * <li>{@code reserved0} &ndash; Must be {@code NULL}</li>
 * <li>{@code srcPitch} &ndash; Source pitch (ignored when src is array)</li>
 * <li>{@code srcHeight} &ndash; Source height (ignored when src is array; may be 0 if Depth==1)</li>
 * <li>{@code dstXInBytes} &ndash; Destination X in bytes</li>
 * <li>{@code dstY} &ndash; Destination Y</li>
 * <li>{@code dstZ} &ndash; Destination Z</li>
 * <li>{@code dstLOD} &ndash; Destination LOD</li>
 * <li>{@code dstMemoryType} &ndash; Destination memory type (host, device, array)</li>
 * <li>{@code dstHost} &ndash; Destination host pointer</li>
 * <li>{@code dstDevice} &ndash; Destination device pointer</li>
 * <li>{@code dstArray} &ndash; Destination array reference</li>
 * <li>{@code reserved1} &ndash; Must be NULL</li>
 * <li>{@code dstPitch} &ndash; Destination pitch (ignored when dst is array)</li>
 * <li>{@code dstHeight} &ndash; Destination height (ignored when dst is array; may be 0 if Depth==1)</li>
 * <li>{@code WidthInBytes} &ndash; Width of 3D memory copy in bytes</li>
 * <li>{@code Height} &ndash; Height of 3D memory copy</li>
 * <li>{@code Depth} &ndash; Depth of 3D memory copy</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_MEMCPY3D {
 *     size_t srcXInBytes;
 *     size_t srcY;
 *     size_t srcZ;
 *     size_t srcLOD;
 *     CUmemorytype srcMemoryType;
 *     void const * srcHost;
 *     CUdeviceptr srcDevice;
 *     CUarray srcArray;
 *     void * reserved0;
 *     size_t srcPitch;
 *     size_t srcHeight;
 *     size_t dstXInBytes;
 *     size_t dstY;
 *     size_t dstZ;
 *     size_t dstLOD;
 *     CUmemorytype dstMemoryType;
 *     void * dstHost;
 *     CUdeviceptr dstDevice;
 *     CUarray dstArray;
 *     void * reserved1;
 *     size_t dstPitch;
 *     size_t dstHeight;
 *     size_t WidthInBytes;
 *     size_t Height;
 *     size_t Depth;
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
     * Creates a {@link CUDA_MEMCPY3D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_MEMCPY3D(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code srcXInBytes} field. */
    @NativeType("size_t")
    public long srcXInBytes() { return nsrcXInBytes(address()); }
    /** Returns the value of the {@code srcY} field. */
    @NativeType("size_t")
    public long srcY() { return nsrcY(address()); }
    /** Returns the value of the {@code srcZ} field. */
    @NativeType("size_t")
    public long srcZ() { return nsrcZ(address()); }
    /** Returns the value of the {@code srcLOD} field. */
    @NativeType("size_t")
    public long srcLOD() { return nsrcLOD(address()); }
    /** Returns the value of the {@code srcMemoryType} field. */
    @NativeType("CUmemorytype")
    public int srcMemoryType() { return nsrcMemoryType(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code srcHost} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void const *")
    public ByteBuffer srcHost(int capacity) { return nsrcHost(address(), capacity); }
    /** Returns the value of the {@code srcDevice} field. */
    @NativeType("CUdeviceptr")
    public long srcDevice() { return nsrcDevice(address()); }
    /** Returns the value of the {@code srcArray} field. */
    @NativeType("CUarray")
    public long srcArray() { return nsrcArray(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code reserved0} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer reserved0(int capacity) { return nreserved0(address(), capacity); }
    /** Returns the value of the {@code srcPitch} field. */
    @NativeType("size_t")
    public long srcPitch() { return nsrcPitch(address()); }
    /** Returns the value of the {@code srcHeight} field. */
    @NativeType("size_t")
    public long srcHeight() { return nsrcHeight(address()); }
    /** Returns the value of the {@code dstXInBytes} field. */
    @NativeType("size_t")
    public long dstXInBytes() { return ndstXInBytes(address()); }
    /** Returns the value of the {@code dstY} field. */
    @NativeType("size_t")
    public long dstY() { return ndstY(address()); }
    /** Returns the value of the {@code dstZ} field. */
    @NativeType("size_t")
    public long dstZ() { return ndstZ(address()); }
    /** Returns the value of the {@code dstLOD} field. */
    @NativeType("size_t")
    public long dstLOD() { return ndstLOD(address()); }
    /** Returns the value of the {@code dstMemoryType} field. */
    @NativeType("CUmemorytype")
    public int dstMemoryType() { return ndstMemoryType(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code dstHost} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer dstHost(int capacity) { return ndstHost(address(), capacity); }
    /** Returns the value of the {@code dstDevice} field. */
    @NativeType("CUdeviceptr")
    public long dstDevice() { return ndstDevice(address()); }
    /** Returns the value of the {@code dstArray} field. */
    @NativeType("CUarray")
    public long dstArray() { return ndstArray(address()); }
    /**
     * Returns a {@link ByteBuffer} view of the data pointed to by the {@code reserved1} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @NativeType("void *")
    public ByteBuffer reserved1(int capacity) { return nreserved1(address(), capacity); }
    /** Returns the value of the {@code dstPitch} field. */
    @NativeType("size_t")
    public long dstPitch() { return ndstPitch(address()); }
    /** Returns the value of the {@code dstHeight} field. */
    @NativeType("size_t")
    public long dstHeight() { return ndstHeight(address()); }
    /** Returns the value of the {@code WidthInBytes} field. */
    @NativeType("size_t")
    public long WidthInBytes() { return nWidthInBytes(address()); }
    /** Returns the value of the {@code Height} field. */
    @NativeType("size_t")
    public long Height() { return nHeight(address()); }
    /** Returns the value of the {@code Depth} field. */
    @NativeType("size_t")
    public long Depth() { return nDepth(address()); }

    /** Sets the specified value to the {@code srcXInBytes} field. */
    public CUDA_MEMCPY3D srcXInBytes(@NativeType("size_t") long value) { nsrcXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code srcY} field. */
    public CUDA_MEMCPY3D srcY(@NativeType("size_t") long value) { nsrcY(address(), value); return this; }
    /** Sets the specified value to the {@code srcZ} field. */
    public CUDA_MEMCPY3D srcZ(@NativeType("size_t") long value) { nsrcZ(address(), value); return this; }
    /** Sets the specified value to the {@code srcLOD} field. */
    public CUDA_MEMCPY3D srcLOD(@NativeType("size_t") long value) { nsrcLOD(address(), value); return this; }
    /** Sets the specified value to the {@code srcMemoryType} field. */
    public CUDA_MEMCPY3D srcMemoryType(@NativeType("CUmemorytype") int value) { nsrcMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code srcHost} field. */
    public CUDA_MEMCPY3D srcHost(@NativeType("void const *") ByteBuffer value) { nsrcHost(address(), value); return this; }
    /** Sets the specified value to the {@code srcDevice} field. */
    public CUDA_MEMCPY3D srcDevice(@NativeType("CUdeviceptr") long value) { nsrcDevice(address(), value); return this; }
    /** Sets the specified value to the {@code srcArray} field. */
    public CUDA_MEMCPY3D srcArray(@NativeType("CUarray") long value) { nsrcArray(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code reserved0} field. */
    public CUDA_MEMCPY3D reserved0(@NativeType("void *") ByteBuffer value) { nreserved0(address(), value); return this; }
    /** Sets the specified value to the {@code srcPitch} field. */
    public CUDA_MEMCPY3D srcPitch(@NativeType("size_t") long value) { nsrcPitch(address(), value); return this; }
    /** Sets the specified value to the {@code srcHeight} field. */
    public CUDA_MEMCPY3D srcHeight(@NativeType("size_t") long value) { nsrcHeight(address(), value); return this; }
    /** Sets the specified value to the {@code dstXInBytes} field. */
    public CUDA_MEMCPY3D dstXInBytes(@NativeType("size_t") long value) { ndstXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code dstY} field. */
    public CUDA_MEMCPY3D dstY(@NativeType("size_t") long value) { ndstY(address(), value); return this; }
    /** Sets the specified value to the {@code dstZ} field. */
    public CUDA_MEMCPY3D dstZ(@NativeType("size_t") long value) { ndstZ(address(), value); return this; }
    /** Sets the specified value to the {@code dstLOD} field. */
    public CUDA_MEMCPY3D dstLOD(@NativeType("size_t") long value) { ndstLOD(address(), value); return this; }
    /** Sets the specified value to the {@code dstMemoryType} field. */
    public CUDA_MEMCPY3D dstMemoryType(@NativeType("CUmemorytype") int value) { ndstMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code dstHost} field. */
    public CUDA_MEMCPY3D dstHost(@NativeType("void *") ByteBuffer value) { ndstHost(address(), value); return this; }
    /** Sets the specified value to the {@code dstDevice} field. */
    public CUDA_MEMCPY3D dstDevice(@NativeType("CUdeviceptr") long value) { ndstDevice(address(), value); return this; }
    /** Sets the specified value to the {@code dstArray} field. */
    public CUDA_MEMCPY3D dstArray(@NativeType("CUarray") long value) { ndstArray(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code reserved1} field. */
    public CUDA_MEMCPY3D reserved1(@NativeType("void *") ByteBuffer value) { nreserved1(address(), value); return this; }
    /** Sets the specified value to the {@code dstPitch} field. */
    public CUDA_MEMCPY3D dstPitch(@NativeType("size_t") long value) { ndstPitch(address(), value); return this; }
    /** Sets the specified value to the {@code dstHeight} field. */
    public CUDA_MEMCPY3D dstHeight(@NativeType("size_t") long value) { ndstHeight(address(), value); return this; }
    /** Sets the specified value to the {@code WidthInBytes} field. */
    public CUDA_MEMCPY3D WidthInBytes(@NativeType("size_t") long value) { nWidthInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code Height} field. */
    public CUDA_MEMCPY3D Height(@NativeType("size_t") long value) { nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code Depth} field. */
    public CUDA_MEMCPY3D Depth(@NativeType("size_t") long value) { nDepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_MEMCPY3D set(
        long srcXInBytes,
        long srcY,
        long srcZ,
        long srcLOD,
        int srcMemoryType,
        ByteBuffer srcHost,
        long srcDevice,
        long srcArray,
        ByteBuffer reserved0,
        long srcPitch,
        long srcHeight,
        long dstXInBytes,
        long dstY,
        long dstZ,
        long dstLOD,
        int dstMemoryType,
        ByteBuffer dstHost,
        long dstDevice,
        long dstArray,
        ByteBuffer reserved1,
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

    /** Returns a new {@link CUDA_MEMCPY3D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY3D malloc() {
        return wrap(CUDA_MEMCPY3D.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link CUDA_MEMCPY3D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY3D calloc() {
        return wrap(CUDA_MEMCPY3D.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link CUDA_MEMCPY3D} instance allocated with {@link BufferUtils}. */
    public static CUDA_MEMCPY3D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_MEMCPY3D.class, memAddress(container), container);
    }

    /** Returns a new {@link CUDA_MEMCPY3D} instance for the specified memory address. */
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

    /** Returns a new {@link CUDA_MEMCPY3D} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUDA_MEMCPY3D mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link CUDA_MEMCPY3D} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUDA_MEMCPY3D callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY3D mallocStack(MemoryStack stack) {
        return wrap(CUDA_MEMCPY3D.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY3D callocStack(MemoryStack stack) {
        return wrap(CUDA_MEMCPY3D.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D.Buffer callocStack(int capacity, MemoryStack stack) {
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
    public static ByteBuffer nsrcHost(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + CUDA_MEMCPY3D.SRCHOST), capacity); }
    /** Unsafe version of {@link #srcDevice}. */
    public static long nsrcDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCDEVICE); }
    /** Unsafe version of {@link #srcArray}. */
    public static long nsrcArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.SRCARRAY); }
    /** Unsafe version of {@link #reserved0(int) reserved0}. */
    public static ByteBuffer nreserved0(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + CUDA_MEMCPY3D.RESERVED0), capacity); }
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
    public static ByteBuffer ndstHost(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + CUDA_MEMCPY3D.DSTHOST), capacity); }
    /** Unsafe version of {@link #dstDevice}. */
    public static long ndstDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTDEVICE); }
    /** Unsafe version of {@link #dstArray}. */
    public static long ndstArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D.DSTARRAY); }
    /** Unsafe version of {@link #reserved1(int) reserved1}. */
    public static ByteBuffer nreserved1(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + CUDA_MEMCPY3D.RESERVED1), capacity); }
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
    public static void nsrcHost(long struct, ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCHOST, memAddress(value)); }
    /** Unsafe version of {@link #srcDevice(long) srcDevice}. */
    public static void nsrcDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCDEVICE, check(value)); }
    /** Unsafe version of {@link #srcArray(long) srcArray}. */
    public static void nsrcArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.SRCARRAY, check(value)); }
    /** Unsafe version of {@link #reserved0(ByteBuffer) reserved0}. */
    public static void nreserved0(long struct, ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D.RESERVED0, memAddress(value)); }
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
    public static void ndstHost(long struct, ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTHOST, memAddress(value)); }
    /** Unsafe version of {@link #dstDevice(long) dstDevice}. */
    public static void ndstDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTDEVICE, check(value)); }
    /** Unsafe version of {@link #dstArray(long) dstArray}. */
    public static void ndstArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D.DSTARRAY, check(value)); }
    /** Unsafe version of {@link #reserved1(ByteBuffer) reserved1}. */
    public static void nreserved1(long struct, ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D.RESERVED1, memAddress(value)); }
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

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_MEMCPY3D.SRCHOST));
        check(memGetAddress(struct + CUDA_MEMCPY3D.SRCDEVICE));
        check(memGetAddress(struct + CUDA_MEMCPY3D.SRCARRAY));
        check(memGetAddress(struct + CUDA_MEMCPY3D.RESERVED0));
        check(memGetAddress(struct + CUDA_MEMCPY3D.DSTHOST));
        check(memGetAddress(struct + CUDA_MEMCPY3D.DSTDEVICE));
        check(memGetAddress(struct + CUDA_MEMCPY3D.DSTARRAY));
        check(memGetAddress(struct + CUDA_MEMCPY3D.RESERVED1));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link CUDA_MEMCPY3D} structs. */
    public static class Buffer extends StructBuffer<CUDA_MEMCPY3D, Buffer> implements NativeResource {

        private static final CUDA_MEMCPY3D ELEMENT_FACTORY = CUDA_MEMCPY3D.create(-1L);

        /**
         * Creates a new {@link CUDA_MEMCPY3D.Buffer} instance backed by the specified container.
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

        /** Returns the value of the {@code srcXInBytes} field. */
        @NativeType("size_t")
        public long srcXInBytes() { return CUDA_MEMCPY3D.nsrcXInBytes(address()); }
        /** Returns the value of the {@code srcY} field. */
        @NativeType("size_t")
        public long srcY() { return CUDA_MEMCPY3D.nsrcY(address()); }
        /** Returns the value of the {@code srcZ} field. */
        @NativeType("size_t")
        public long srcZ() { return CUDA_MEMCPY3D.nsrcZ(address()); }
        /** Returns the value of the {@code srcLOD} field. */
        @NativeType("size_t")
        public long srcLOD() { return CUDA_MEMCPY3D.nsrcLOD(address()); }
        /** Returns the value of the {@code srcMemoryType} field. */
        @NativeType("CUmemorytype")
        public int srcMemoryType() { return CUDA_MEMCPY3D.nsrcMemoryType(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code srcHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void const *")
        public ByteBuffer srcHost(int capacity) { return CUDA_MEMCPY3D.nsrcHost(address(), capacity); }
        /** Returns the value of the {@code srcDevice} field. */
        @NativeType("CUdeviceptr")
        public long srcDevice() { return CUDA_MEMCPY3D.nsrcDevice(address()); }
        /** Returns the value of the {@code srcArray} field. */
        @NativeType("CUarray")
        public long srcArray() { return CUDA_MEMCPY3D.nsrcArray(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code reserved0} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer reserved0(int capacity) { return CUDA_MEMCPY3D.nreserved0(address(), capacity); }
        /** Returns the value of the {@code srcPitch} field. */
        @NativeType("size_t")
        public long srcPitch() { return CUDA_MEMCPY3D.nsrcPitch(address()); }
        /** Returns the value of the {@code srcHeight} field. */
        @NativeType("size_t")
        public long srcHeight() { return CUDA_MEMCPY3D.nsrcHeight(address()); }
        /** Returns the value of the {@code dstXInBytes} field. */
        @NativeType("size_t")
        public long dstXInBytes() { return CUDA_MEMCPY3D.ndstXInBytes(address()); }
        /** Returns the value of the {@code dstY} field. */
        @NativeType("size_t")
        public long dstY() { return CUDA_MEMCPY3D.ndstY(address()); }
        /** Returns the value of the {@code dstZ} field. */
        @NativeType("size_t")
        public long dstZ() { return CUDA_MEMCPY3D.ndstZ(address()); }
        /** Returns the value of the {@code dstLOD} field. */
        @NativeType("size_t")
        public long dstLOD() { return CUDA_MEMCPY3D.ndstLOD(address()); }
        /** Returns the value of the {@code dstMemoryType} field. */
        @NativeType("CUmemorytype")
        public int dstMemoryType() { return CUDA_MEMCPY3D.ndstMemoryType(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code dstHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer dstHost(int capacity) { return CUDA_MEMCPY3D.ndstHost(address(), capacity); }
        /** Returns the value of the {@code dstDevice} field. */
        @NativeType("CUdeviceptr")
        public long dstDevice() { return CUDA_MEMCPY3D.ndstDevice(address()); }
        /** Returns the value of the {@code dstArray} field. */
        @NativeType("CUarray")
        public long dstArray() { return CUDA_MEMCPY3D.ndstArray(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code reserved1} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer reserved1(int capacity) { return CUDA_MEMCPY3D.nreserved1(address(), capacity); }
        /** Returns the value of the {@code dstPitch} field. */
        @NativeType("size_t")
        public long dstPitch() { return CUDA_MEMCPY3D.ndstPitch(address()); }
        /** Returns the value of the {@code dstHeight} field. */
        @NativeType("size_t")
        public long dstHeight() { return CUDA_MEMCPY3D.ndstHeight(address()); }
        /** Returns the value of the {@code WidthInBytes} field. */
        @NativeType("size_t")
        public long WidthInBytes() { return CUDA_MEMCPY3D.nWidthInBytes(address()); }
        /** Returns the value of the {@code Height} field. */
        @NativeType("size_t")
        public long Height() { return CUDA_MEMCPY3D.nHeight(address()); }
        /** Returns the value of the {@code Depth} field. */
        @NativeType("size_t")
        public long Depth() { return CUDA_MEMCPY3D.nDepth(address()); }

        /** Sets the specified value to the {@code srcXInBytes} field. */
        public CUDA_MEMCPY3D.Buffer srcXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code srcY} field. */
        public CUDA_MEMCPY3D.Buffer srcY(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcY(address(), value); return this; }
        /** Sets the specified value to the {@code srcZ} field. */
        public CUDA_MEMCPY3D.Buffer srcZ(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcZ(address(), value); return this; }
        /** Sets the specified value to the {@code srcLOD} field. */
        public CUDA_MEMCPY3D.Buffer srcLOD(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcLOD(address(), value); return this; }
        /** Sets the specified value to the {@code srcMemoryType} field. */
        public CUDA_MEMCPY3D.Buffer srcMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY3D.nsrcMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code srcHost} field. */
        public CUDA_MEMCPY3D.Buffer srcHost(@NativeType("void const *") ByteBuffer value) { CUDA_MEMCPY3D.nsrcHost(address(), value); return this; }
        /** Sets the specified value to the {@code srcDevice} field. */
        public CUDA_MEMCPY3D.Buffer srcDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY3D.nsrcDevice(address(), value); return this; }
        /** Sets the specified value to the {@code srcArray} field. */
        public CUDA_MEMCPY3D.Buffer srcArray(@NativeType("CUarray") long value) { CUDA_MEMCPY3D.nsrcArray(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code reserved0} field. */
        public CUDA_MEMCPY3D.Buffer reserved0(@NativeType("void *") ByteBuffer value) { CUDA_MEMCPY3D.nreserved0(address(), value); return this; }
        /** Sets the specified value to the {@code srcPitch} field. */
        public CUDA_MEMCPY3D.Buffer srcPitch(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcPitch(address(), value); return this; }
        /** Sets the specified value to the {@code srcHeight} field. */
        public CUDA_MEMCPY3D.Buffer srcHeight(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nsrcHeight(address(), value); return this; }
        /** Sets the specified value to the {@code dstXInBytes} field. */
        public CUDA_MEMCPY3D.Buffer dstXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code dstY} field. */
        public CUDA_MEMCPY3D.Buffer dstY(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstY(address(), value); return this; }
        /** Sets the specified value to the {@code dstZ} field. */
        public CUDA_MEMCPY3D.Buffer dstZ(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstZ(address(), value); return this; }
        /** Sets the specified value to the {@code dstLOD} field. */
        public CUDA_MEMCPY3D.Buffer dstLOD(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstLOD(address(), value); return this; }
        /** Sets the specified value to the {@code dstMemoryType} field. */
        public CUDA_MEMCPY3D.Buffer dstMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY3D.ndstMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code dstHost} field. */
        public CUDA_MEMCPY3D.Buffer dstHost(@NativeType("void *") ByteBuffer value) { CUDA_MEMCPY3D.ndstHost(address(), value); return this; }
        /** Sets the specified value to the {@code dstDevice} field. */
        public CUDA_MEMCPY3D.Buffer dstDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY3D.ndstDevice(address(), value); return this; }
        /** Sets the specified value to the {@code dstArray} field. */
        public CUDA_MEMCPY3D.Buffer dstArray(@NativeType("CUarray") long value) { CUDA_MEMCPY3D.ndstArray(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code reserved1} field. */
        public CUDA_MEMCPY3D.Buffer reserved1(@NativeType("void *") ByteBuffer value) { CUDA_MEMCPY3D.nreserved1(address(), value); return this; }
        /** Sets the specified value to the {@code dstPitch} field. */
        public CUDA_MEMCPY3D.Buffer dstPitch(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstPitch(address(), value); return this; }
        /** Sets the specified value to the {@code dstHeight} field. */
        public CUDA_MEMCPY3D.Buffer dstHeight(@NativeType("size_t") long value) { CUDA_MEMCPY3D.ndstHeight(address(), value); return this; }
        /** Sets the specified value to the {@code WidthInBytes} field. */
        public CUDA_MEMCPY3D.Buffer WidthInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nWidthInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code Height} field. */
        public CUDA_MEMCPY3D.Buffer Height(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code Depth} field. */
        public CUDA_MEMCPY3D.Buffer Depth(@NativeType("size_t") long value) { CUDA_MEMCPY3D.nDepth(address(), value); return this; }

    }

}