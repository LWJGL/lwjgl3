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
 * 3D memory cross-context copy parameters.
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
 * <li>{@code srcContext} &ndash; Source context (ignored with srcMemoryType is ::CU_MEMORYTYPE_ARRAY)</li>
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
 * <li>{@code dstContext} &ndash; Destination context (ignored with dstMemoryType is ::CU_MEMORYTYPE_ARRAY)</li>
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
 * struct CUDA_MEMCPY3D_PEER {
 *     size_t srcXInBytes;
 *     size_t srcY;
 *     size_t srcZ;
 *     size_t srcLOD;
 *     CUmemorytype srcMemoryType;
 *     void const * srcHost;
 *     CUdeviceptr srcDevice;
 *     CUarray srcArray;
 *     CUcontext srcContext;
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
 *     CUcontext dstContext;
 *     size_t dstPitch;
 *     size_t dstHeight;
 *     size_t WidthInBytes;
 *     size_t Height;
 *     size_t Depth;
 * }</code></pre>
 */
public class CUDA_MEMCPY3D_PEER extends Struct implements NativeResource {

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
        SRCCONTEXT,
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
        DSTCONTEXT,
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
        SRCCONTEXT = layout.offsetof(8);
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
        DSTCONTEXT = layout.offsetof(19);
        DSTPITCH = layout.offsetof(20);
        DSTHEIGHT = layout.offsetof(21);
        WIDTHINBYTES = layout.offsetof(22);
        HEIGHT = layout.offsetof(23);
        DEPTH = layout.offsetof(24);
    }

    /**
     * Creates a {@link CUDA_MEMCPY3D_PEER} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_MEMCPY3D_PEER(ByteBuffer container) {
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
    /** Returns the value of the {@code srcContext} field. */
    @NativeType("CUcontext")
    public long srcContext() { return nsrcContext(address()); }
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
    /** Returns the value of the {@code dstContext} field. */
    @NativeType("CUcontext")
    public long dstContext() { return ndstContext(address()); }
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
    public CUDA_MEMCPY3D_PEER srcXInBytes(@NativeType("size_t") long value) { nsrcXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code srcY} field. */
    public CUDA_MEMCPY3D_PEER srcY(@NativeType("size_t") long value) { nsrcY(address(), value); return this; }
    /** Sets the specified value to the {@code srcZ} field. */
    public CUDA_MEMCPY3D_PEER srcZ(@NativeType("size_t") long value) { nsrcZ(address(), value); return this; }
    /** Sets the specified value to the {@code srcLOD} field. */
    public CUDA_MEMCPY3D_PEER srcLOD(@NativeType("size_t") long value) { nsrcLOD(address(), value); return this; }
    /** Sets the specified value to the {@code srcMemoryType} field. */
    public CUDA_MEMCPY3D_PEER srcMemoryType(@NativeType("CUmemorytype") int value) { nsrcMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code srcHost} field. */
    public CUDA_MEMCPY3D_PEER srcHost(@NativeType("void const *") ByteBuffer value) { nsrcHost(address(), value); return this; }
    /** Sets the specified value to the {@code srcDevice} field. */
    public CUDA_MEMCPY3D_PEER srcDevice(@NativeType("CUdeviceptr") long value) { nsrcDevice(address(), value); return this; }
    /** Sets the specified value to the {@code srcArray} field. */
    public CUDA_MEMCPY3D_PEER srcArray(@NativeType("CUarray") long value) { nsrcArray(address(), value); return this; }
    /** Sets the specified value to the {@code srcContext} field. */
    public CUDA_MEMCPY3D_PEER srcContext(@NativeType("CUcontext") long value) { nsrcContext(address(), value); return this; }
    /** Sets the specified value to the {@code srcPitch} field. */
    public CUDA_MEMCPY3D_PEER srcPitch(@NativeType("size_t") long value) { nsrcPitch(address(), value); return this; }
    /** Sets the specified value to the {@code srcHeight} field. */
    public CUDA_MEMCPY3D_PEER srcHeight(@NativeType("size_t") long value) { nsrcHeight(address(), value); return this; }
    /** Sets the specified value to the {@code dstXInBytes} field. */
    public CUDA_MEMCPY3D_PEER dstXInBytes(@NativeType("size_t") long value) { ndstXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code dstY} field. */
    public CUDA_MEMCPY3D_PEER dstY(@NativeType("size_t") long value) { ndstY(address(), value); return this; }
    /** Sets the specified value to the {@code dstZ} field. */
    public CUDA_MEMCPY3D_PEER dstZ(@NativeType("size_t") long value) { ndstZ(address(), value); return this; }
    /** Sets the specified value to the {@code dstLOD} field. */
    public CUDA_MEMCPY3D_PEER dstLOD(@NativeType("size_t") long value) { ndstLOD(address(), value); return this; }
    /** Sets the specified value to the {@code dstMemoryType} field. */
    public CUDA_MEMCPY3D_PEER dstMemoryType(@NativeType("CUmemorytype") int value) { ndstMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code dstHost} field. */
    public CUDA_MEMCPY3D_PEER dstHost(@NativeType("void *") ByteBuffer value) { ndstHost(address(), value); return this; }
    /** Sets the specified value to the {@code dstDevice} field. */
    public CUDA_MEMCPY3D_PEER dstDevice(@NativeType("CUdeviceptr") long value) { ndstDevice(address(), value); return this; }
    /** Sets the specified value to the {@code dstArray} field. */
    public CUDA_MEMCPY3D_PEER dstArray(@NativeType("CUarray") long value) { ndstArray(address(), value); return this; }
    /** Sets the specified value to the {@code dstContext} field. */
    public CUDA_MEMCPY3D_PEER dstContext(@NativeType("CUcontext") long value) { ndstContext(address(), value); return this; }
    /** Sets the specified value to the {@code dstPitch} field. */
    public CUDA_MEMCPY3D_PEER dstPitch(@NativeType("size_t") long value) { ndstPitch(address(), value); return this; }
    /** Sets the specified value to the {@code dstHeight} field. */
    public CUDA_MEMCPY3D_PEER dstHeight(@NativeType("size_t") long value) { ndstHeight(address(), value); return this; }
    /** Sets the specified value to the {@code WidthInBytes} field. */
    public CUDA_MEMCPY3D_PEER WidthInBytes(@NativeType("size_t") long value) { nWidthInBytes(address(), value); return this; }
    /** Sets the specified value to the {@code Height} field. */
    public CUDA_MEMCPY3D_PEER Height(@NativeType("size_t") long value) { nHeight(address(), value); return this; }
    /** Sets the specified value to the {@code Depth} field. */
    public CUDA_MEMCPY3D_PEER Depth(@NativeType("size_t") long value) { nDepth(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_MEMCPY3D_PEER set(
        long srcXInBytes,
        long srcY,
        long srcZ,
        long srcLOD,
        int srcMemoryType,
        ByteBuffer srcHost,
        long srcDevice,
        long srcArray,
        long srcContext,
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
        long dstContext,
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
        srcContext(srcContext);
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
        dstContext(dstContext);
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
    public CUDA_MEMCPY3D_PEER set(CUDA_MEMCPY3D_PEER src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link CUDA_MEMCPY3D_PEER} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY3D_PEER malloc() {
        return wrap(CUDA_MEMCPY3D_PEER.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link CUDA_MEMCPY3D_PEER} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY3D_PEER calloc() {
        return wrap(CUDA_MEMCPY3D_PEER.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link CUDA_MEMCPY3D_PEER} instance allocated with {@link BufferUtils}. */
    public static CUDA_MEMCPY3D_PEER create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_MEMCPY3D_PEER.class, memAddress(container), container);
    }

    /** Returns a new {@link CUDA_MEMCPY3D_PEER} instance for the specified memory address. */
    public static CUDA_MEMCPY3D_PEER create(long address) {
        return wrap(CUDA_MEMCPY3D_PEER.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMCPY3D_PEER createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_MEMCPY3D_PEER.class, address);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_MEMCPY3D_PEER.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMCPY3D_PEER.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link CUDA_MEMCPY3D_PEER} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUDA_MEMCPY3D_PEER mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link CUDA_MEMCPY3D_PEER} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUDA_MEMCPY3D_PEER callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY3D_PEER mallocStack(MemoryStack stack) {
        return wrap(CUDA_MEMCPY3D_PEER.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY3D_PEER callocStack(MemoryStack stack) {
        return wrap(CUDA_MEMCPY3D_PEER.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY3D_PEER.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcXInBytes}. */
    public static long nsrcXInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCXINBYTES); }
    /** Unsafe version of {@link #srcY}. */
    public static long nsrcY(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCY); }
    /** Unsafe version of {@link #srcZ}. */
    public static long nsrcZ(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCZ); }
    /** Unsafe version of {@link #srcLOD}. */
    public static long nsrcLOD(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCLOD); }
    /** Unsafe version of {@link #srcMemoryType}. */
    public static int nsrcMemoryType(long struct) { return UNSAFE.getInt(null, struct + CUDA_MEMCPY3D_PEER.SRCMEMORYTYPE); }
    /** Unsafe version of {@link #srcHost(int) srcHost}. */
    public static ByteBuffer nsrcHost(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCHOST), capacity); }
    /** Unsafe version of {@link #srcDevice}. */
    public static long nsrcDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCDEVICE); }
    /** Unsafe version of {@link #srcArray}. */
    public static long nsrcArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCARRAY); }
    /** Unsafe version of {@link #srcContext}. */
    public static long nsrcContext(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCCONTEXT); }
    /** Unsafe version of {@link #srcPitch}. */
    public static long nsrcPitch(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCPITCH); }
    /** Unsafe version of {@link #srcHeight}. */
    public static long nsrcHeight(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCHEIGHT); }
    /** Unsafe version of {@link #dstXInBytes}. */
    public static long ndstXInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTXINBYTES); }
    /** Unsafe version of {@link #dstY}. */
    public static long ndstY(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTY); }
    /** Unsafe version of {@link #dstZ}. */
    public static long ndstZ(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTZ); }
    /** Unsafe version of {@link #dstLOD}. */
    public static long ndstLOD(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTLOD); }
    /** Unsafe version of {@link #dstMemoryType}. */
    public static int ndstMemoryType(long struct) { return UNSAFE.getInt(null, struct + CUDA_MEMCPY3D_PEER.DSTMEMORYTYPE); }
    /** Unsafe version of {@link #dstHost(int) dstHost}. */
    public static ByteBuffer ndstHost(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTHOST), capacity); }
    /** Unsafe version of {@link #dstDevice}. */
    public static long ndstDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTDEVICE); }
    /** Unsafe version of {@link #dstArray}. */
    public static long ndstArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTARRAY); }
    /** Unsafe version of {@link #dstContext}. */
    public static long ndstContext(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTCONTEXT); }
    /** Unsafe version of {@link #dstPitch}. */
    public static long ndstPitch(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTPITCH); }
    /** Unsafe version of {@link #dstHeight}. */
    public static long ndstHeight(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTHEIGHT); }
    /** Unsafe version of {@link #WidthInBytes}. */
    public static long nWidthInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.WIDTHINBYTES); }
    /** Unsafe version of {@link #Height}. */
    public static long nHeight(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.HEIGHT); }
    /** Unsafe version of {@link #Depth}. */
    public static long nDepth(long struct) { return memGetAddress(struct + CUDA_MEMCPY3D_PEER.DEPTH); }

    /** Unsafe version of {@link #srcXInBytes(long) srcXInBytes}. */
    public static void nsrcXInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCXINBYTES, value); }
    /** Unsafe version of {@link #srcY(long) srcY}. */
    public static void nsrcY(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCY, value); }
    /** Unsafe version of {@link #srcZ(long) srcZ}. */
    public static void nsrcZ(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCZ, value); }
    /** Unsafe version of {@link #srcLOD(long) srcLOD}. */
    public static void nsrcLOD(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCLOD, value); }
    /** Unsafe version of {@link #srcMemoryType(int) srcMemoryType}. */
    public static void nsrcMemoryType(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_MEMCPY3D_PEER.SRCMEMORYTYPE, value); }
    /** Unsafe version of {@link #srcHost(ByteBuffer) srcHost}. */
    public static void nsrcHost(long struct, ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCHOST, memAddress(value)); }
    /** Unsafe version of {@link #srcDevice(long) srcDevice}. */
    public static void nsrcDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCDEVICE, check(value)); }
    /** Unsafe version of {@link #srcArray(long) srcArray}. */
    public static void nsrcArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCARRAY, check(value)); }
    /** Unsafe version of {@link #srcContext(long) srcContext}. */
    public static void nsrcContext(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCCONTEXT, check(value)); }
    /** Unsafe version of {@link #srcPitch(long) srcPitch}. */
    public static void nsrcPitch(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCPITCH, value); }
    /** Unsafe version of {@link #srcHeight(long) srcHeight}. */
    public static void nsrcHeight(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.SRCHEIGHT, value); }
    /** Unsafe version of {@link #dstXInBytes(long) dstXInBytes}. */
    public static void ndstXInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTXINBYTES, value); }
    /** Unsafe version of {@link #dstY(long) dstY}. */
    public static void ndstY(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTY, value); }
    /** Unsafe version of {@link #dstZ(long) dstZ}. */
    public static void ndstZ(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTZ, value); }
    /** Unsafe version of {@link #dstLOD(long) dstLOD}. */
    public static void ndstLOD(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTLOD, value); }
    /** Unsafe version of {@link #dstMemoryType(int) dstMemoryType}. */
    public static void ndstMemoryType(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_MEMCPY3D_PEER.DSTMEMORYTYPE, value); }
    /** Unsafe version of {@link #dstHost(ByteBuffer) dstHost}. */
    public static void ndstHost(long struct, ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTHOST, memAddress(value)); }
    /** Unsafe version of {@link #dstDevice(long) dstDevice}. */
    public static void ndstDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTDEVICE, check(value)); }
    /** Unsafe version of {@link #dstArray(long) dstArray}. */
    public static void ndstArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTARRAY, check(value)); }
    /** Unsafe version of {@link #dstContext(long) dstContext}. */
    public static void ndstContext(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTCONTEXT, check(value)); }
    /** Unsafe version of {@link #dstPitch(long) dstPitch}. */
    public static void ndstPitch(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTPITCH, value); }
    /** Unsafe version of {@link #dstHeight(long) dstHeight}. */
    public static void ndstHeight(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DSTHEIGHT, value); }
    /** Unsafe version of {@link #WidthInBytes(long) WidthInBytes}. */
    public static void nWidthInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.WIDTHINBYTES, value); }
    /** Unsafe version of {@link #Height(long) Height}. */
    public static void nHeight(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.HEIGHT, value); }
    /** Unsafe version of {@link #Depth(long) Depth}. */
    public static void nDepth(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY3D_PEER.DEPTH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCHOST));
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCDEVICE));
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCARRAY));
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.SRCCONTEXT));
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTHOST));
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTDEVICE));
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTARRAY));
        check(memGetAddress(struct + CUDA_MEMCPY3D_PEER.DSTCONTEXT));
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

    /** An array of {@link CUDA_MEMCPY3D_PEER} structs. */
    public static class Buffer extends StructBuffer<CUDA_MEMCPY3D_PEER, Buffer> implements NativeResource {

        private static final CUDA_MEMCPY3D_PEER ELEMENT_FACTORY = CUDA_MEMCPY3D_PEER.create(-1L);

        /**
         * Creates a new {@link CUDA_MEMCPY3D_PEER.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_MEMCPY3D_PEER#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_MEMCPY3D_PEER getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code srcXInBytes} field. */
        @NativeType("size_t")
        public long srcXInBytes() { return CUDA_MEMCPY3D_PEER.nsrcXInBytes(address()); }
        /** Returns the value of the {@code srcY} field. */
        @NativeType("size_t")
        public long srcY() { return CUDA_MEMCPY3D_PEER.nsrcY(address()); }
        /** Returns the value of the {@code srcZ} field. */
        @NativeType("size_t")
        public long srcZ() { return CUDA_MEMCPY3D_PEER.nsrcZ(address()); }
        /** Returns the value of the {@code srcLOD} field. */
        @NativeType("size_t")
        public long srcLOD() { return CUDA_MEMCPY3D_PEER.nsrcLOD(address()); }
        /** Returns the value of the {@code srcMemoryType} field. */
        @NativeType("CUmemorytype")
        public int srcMemoryType() { return CUDA_MEMCPY3D_PEER.nsrcMemoryType(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code srcHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void const *")
        public ByteBuffer srcHost(int capacity) { return CUDA_MEMCPY3D_PEER.nsrcHost(address(), capacity); }
        /** Returns the value of the {@code srcDevice} field. */
        @NativeType("CUdeviceptr")
        public long srcDevice() { return CUDA_MEMCPY3D_PEER.nsrcDevice(address()); }
        /** Returns the value of the {@code srcArray} field. */
        @NativeType("CUarray")
        public long srcArray() { return CUDA_MEMCPY3D_PEER.nsrcArray(address()); }
        /** Returns the value of the {@code srcContext} field. */
        @NativeType("CUcontext")
        public long srcContext() { return CUDA_MEMCPY3D_PEER.nsrcContext(address()); }
        /** Returns the value of the {@code srcPitch} field. */
        @NativeType("size_t")
        public long srcPitch() { return CUDA_MEMCPY3D_PEER.nsrcPitch(address()); }
        /** Returns the value of the {@code srcHeight} field. */
        @NativeType("size_t")
        public long srcHeight() { return CUDA_MEMCPY3D_PEER.nsrcHeight(address()); }
        /** Returns the value of the {@code dstXInBytes} field. */
        @NativeType("size_t")
        public long dstXInBytes() { return CUDA_MEMCPY3D_PEER.ndstXInBytes(address()); }
        /** Returns the value of the {@code dstY} field. */
        @NativeType("size_t")
        public long dstY() { return CUDA_MEMCPY3D_PEER.ndstY(address()); }
        /** Returns the value of the {@code dstZ} field. */
        @NativeType("size_t")
        public long dstZ() { return CUDA_MEMCPY3D_PEER.ndstZ(address()); }
        /** Returns the value of the {@code dstLOD} field. */
        @NativeType("size_t")
        public long dstLOD() { return CUDA_MEMCPY3D_PEER.ndstLOD(address()); }
        /** Returns the value of the {@code dstMemoryType} field. */
        @NativeType("CUmemorytype")
        public int dstMemoryType() { return CUDA_MEMCPY3D_PEER.ndstMemoryType(address()); }
        /**
         * Returns a {@link ByteBuffer} view of the data pointed to by the {@code dstHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("void *")
        public ByteBuffer dstHost(int capacity) { return CUDA_MEMCPY3D_PEER.ndstHost(address(), capacity); }
        /** Returns the value of the {@code dstDevice} field. */
        @NativeType("CUdeviceptr")
        public long dstDevice() { return CUDA_MEMCPY3D_PEER.ndstDevice(address()); }
        /** Returns the value of the {@code dstArray} field. */
        @NativeType("CUarray")
        public long dstArray() { return CUDA_MEMCPY3D_PEER.ndstArray(address()); }
        /** Returns the value of the {@code dstContext} field. */
        @NativeType("CUcontext")
        public long dstContext() { return CUDA_MEMCPY3D_PEER.ndstContext(address()); }
        /** Returns the value of the {@code dstPitch} field. */
        @NativeType("size_t")
        public long dstPitch() { return CUDA_MEMCPY3D_PEER.ndstPitch(address()); }
        /** Returns the value of the {@code dstHeight} field. */
        @NativeType("size_t")
        public long dstHeight() { return CUDA_MEMCPY3D_PEER.ndstHeight(address()); }
        /** Returns the value of the {@code WidthInBytes} field. */
        @NativeType("size_t")
        public long WidthInBytes() { return CUDA_MEMCPY3D_PEER.nWidthInBytes(address()); }
        /** Returns the value of the {@code Height} field. */
        @NativeType("size_t")
        public long Height() { return CUDA_MEMCPY3D_PEER.nHeight(address()); }
        /** Returns the value of the {@code Depth} field. */
        @NativeType("size_t")
        public long Depth() { return CUDA_MEMCPY3D_PEER.nDepth(address()); }

        /** Sets the specified value to the {@code srcXInBytes} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nsrcXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code srcY} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcY(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nsrcY(address(), value); return this; }
        /** Sets the specified value to the {@code srcZ} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcZ(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nsrcZ(address(), value); return this; }
        /** Sets the specified value to the {@code srcLOD} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcLOD(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nsrcLOD(address(), value); return this; }
        /** Sets the specified value to the {@code srcMemoryType} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY3D_PEER.nsrcMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code srcHost} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcHost(@NativeType("void const *") ByteBuffer value) { CUDA_MEMCPY3D_PEER.nsrcHost(address(), value); return this; }
        /** Sets the specified value to the {@code srcDevice} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY3D_PEER.nsrcDevice(address(), value); return this; }
        /** Sets the specified value to the {@code srcArray} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcArray(@NativeType("CUarray") long value) { CUDA_MEMCPY3D_PEER.nsrcArray(address(), value); return this; }
        /** Sets the specified value to the {@code srcContext} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcContext(@NativeType("CUcontext") long value) { CUDA_MEMCPY3D_PEER.nsrcContext(address(), value); return this; }
        /** Sets the specified value to the {@code srcPitch} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcPitch(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nsrcPitch(address(), value); return this; }
        /** Sets the specified value to the {@code srcHeight} field. */
        public CUDA_MEMCPY3D_PEER.Buffer srcHeight(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nsrcHeight(address(), value); return this; }
        /** Sets the specified value to the {@code dstXInBytes} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.ndstXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code dstY} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstY(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.ndstY(address(), value); return this; }
        /** Sets the specified value to the {@code dstZ} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstZ(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.ndstZ(address(), value); return this; }
        /** Sets the specified value to the {@code dstLOD} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstLOD(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.ndstLOD(address(), value); return this; }
        /** Sets the specified value to the {@code dstMemoryType} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY3D_PEER.ndstMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code dstHost} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstHost(@NativeType("void *") ByteBuffer value) { CUDA_MEMCPY3D_PEER.ndstHost(address(), value); return this; }
        /** Sets the specified value to the {@code dstDevice} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY3D_PEER.ndstDevice(address(), value); return this; }
        /** Sets the specified value to the {@code dstArray} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstArray(@NativeType("CUarray") long value) { CUDA_MEMCPY3D_PEER.ndstArray(address(), value); return this; }
        /** Sets the specified value to the {@code dstContext} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstContext(@NativeType("CUcontext") long value) { CUDA_MEMCPY3D_PEER.ndstContext(address(), value); return this; }
        /** Sets the specified value to the {@code dstPitch} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstPitch(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.ndstPitch(address(), value); return this; }
        /** Sets the specified value to the {@code dstHeight} field. */
        public CUDA_MEMCPY3D_PEER.Buffer dstHeight(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.ndstHeight(address(), value); return this; }
        /** Sets the specified value to the {@code WidthInBytes} field. */
        public CUDA_MEMCPY3D_PEER.Buffer WidthInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nWidthInBytes(address(), value); return this; }
        /** Sets the specified value to the {@code Height} field. */
        public CUDA_MEMCPY3D_PEER.Buffer Height(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nHeight(address(), value); return this; }
        /** Sets the specified value to the {@code Depth} field. */
        public CUDA_MEMCPY3D_PEER.Buffer Depth(@NativeType("size_t") long value) { CUDA_MEMCPY3D_PEER.nDepth(address(), value); return this; }

    }

}