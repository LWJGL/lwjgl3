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
 * 2D memory copy parameters.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_MEMCPY2D {
 *     size_t {@link #srcXInBytes};
 *     size_t {@link #srcY};
 *     CUmemorytype {@link #srcMemoryType};
 *     void const * {@link #srcHost};
 *     CUdeviceptr {@link #srcDevice};
 *     CUarray {@link #srcArray};
 *     size_t {@link #srcPitch};
 *     size_t {@link #dstXInBytes};
 *     size_t {@link #dstY};
 *     CUmemorytype {@link #dstMemoryType};
 *     void * {@link #dstHost};
 *     CUdeviceptr {@link #dstDevice};
 *     CUarray {@link #dstArray};
 *     size_t {@link #dstPitch};
 *     size_t {@link #WidthInBytes};
 *     size_t {@link #Height};
 * }</code></pre>
 */
public class CUDA_MEMCPY2D extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCXINBYTES,
        SRCY,
        SRCMEMORYTYPE,
        SRCHOST,
        SRCDEVICE,
        SRCARRAY,
        SRCPITCH,
        DSTXINBYTES,
        DSTY,
        DSTMEMORYTYPE,
        DSTHOST,
        DSTDEVICE,
        DSTARRAY,
        DSTPITCH,
        WIDTHINBYTES,
        HEIGHT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
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
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCXINBYTES = layout.offsetof(0);
        SRCY = layout.offsetof(1);
        SRCMEMORYTYPE = layout.offsetof(2);
        SRCHOST = layout.offsetof(3);
        SRCDEVICE = layout.offsetof(4);
        SRCARRAY = layout.offsetof(5);
        SRCPITCH = layout.offsetof(6);
        DSTXINBYTES = layout.offsetof(7);
        DSTY = layout.offsetof(8);
        DSTMEMORYTYPE = layout.offsetof(9);
        DSTHOST = layout.offsetof(10);
        DSTDEVICE = layout.offsetof(11);
        DSTARRAY = layout.offsetof(12);
        DSTPITCH = layout.offsetof(13);
        WIDTHINBYTES = layout.offsetof(14);
        HEIGHT = layout.offsetof(15);
    }

    /**
     * Creates a {@code CUDA_MEMCPY2D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_MEMCPY2D(ByteBuffer container) {
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
    /** Source pitch (ignored when src is array) */
    @NativeType("size_t")
    public long srcPitch() { return nsrcPitch(address()); }
    /** Destination X in bytes */
    @NativeType("size_t")
    public long dstXInBytes() { return ndstXInBytes(address()); }
    /** Destination Y */
    @NativeType("size_t")
    public long dstY() { return ndstY(address()); }
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
    /** Destination pitch (ignored when dst is array) */
    @NativeType("size_t")
    public long dstPitch() { return ndstPitch(address()); }
    /** Width of 2D memory copy in bytes */
    @NativeType("size_t")
    public long WidthInBytes() { return nWidthInBytes(address()); }
    /** Height of 2D memory copy */
    @NativeType("size_t")
    public long Height() { return nHeight(address()); }

    /** Sets the specified value to the {@link #srcXInBytes} field. */
    public CUDA_MEMCPY2D srcXInBytes(@NativeType("size_t") long value) { nsrcXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@link #srcY} field. */
    public CUDA_MEMCPY2D srcY(@NativeType("size_t") long value) { nsrcY(address(), value); return this; }
    /** Sets the specified value to the {@link #srcMemoryType} field. */
    public CUDA_MEMCPY2D srcMemoryType(@NativeType("CUmemorytype") int value) { nsrcMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #srcHost} field. */
    public CUDA_MEMCPY2D srcHost(@Nullable @NativeType("void const *") ByteBuffer value) { nsrcHost(address(), value); return this; }
    /** Sets the specified value to the {@link #srcDevice} field. */
    public CUDA_MEMCPY2D srcDevice(@NativeType("CUdeviceptr") long value) { nsrcDevice(address(), value); return this; }
    /** Sets the specified value to the {@link #srcArray} field. */
    public CUDA_MEMCPY2D srcArray(@NativeType("CUarray") long value) { nsrcArray(address(), value); return this; }
    /** Sets the specified value to the {@link #srcPitch} field. */
    public CUDA_MEMCPY2D srcPitch(@NativeType("size_t") long value) { nsrcPitch(address(), value); return this; }
    /** Sets the specified value to the {@link #dstXInBytes} field. */
    public CUDA_MEMCPY2D dstXInBytes(@NativeType("size_t") long value) { ndstXInBytes(address(), value); return this; }
    /** Sets the specified value to the {@link #dstY} field. */
    public CUDA_MEMCPY2D dstY(@NativeType("size_t") long value) { ndstY(address(), value); return this; }
    /** Sets the specified value to the {@link #dstMemoryType} field. */
    public CUDA_MEMCPY2D dstMemoryType(@NativeType("CUmemorytype") int value) { ndstMemoryType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #dstHost} field. */
    public CUDA_MEMCPY2D dstHost(@Nullable @NativeType("void *") ByteBuffer value) { ndstHost(address(), value); return this; }
    /** Sets the specified value to the {@link #dstDevice} field. */
    public CUDA_MEMCPY2D dstDevice(@NativeType("CUdeviceptr") long value) { ndstDevice(address(), value); return this; }
    /** Sets the specified value to the {@link #dstArray} field. */
    public CUDA_MEMCPY2D dstArray(@NativeType("CUarray") long value) { ndstArray(address(), value); return this; }
    /** Sets the specified value to the {@link #dstPitch} field. */
    public CUDA_MEMCPY2D dstPitch(@NativeType("size_t") long value) { ndstPitch(address(), value); return this; }
    /** Sets the specified value to the {@link #WidthInBytes} field. */
    public CUDA_MEMCPY2D WidthInBytes(@NativeType("size_t") long value) { nWidthInBytes(address(), value); return this; }
    /** Sets the specified value to the {@link #Height} field. */
    public CUDA_MEMCPY2D Height(@NativeType("size_t") long value) { nHeight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_MEMCPY2D set(
        long srcXInBytes,
        long srcY,
        int srcMemoryType,
        @Nullable ByteBuffer srcHost,
        long srcDevice,
        long srcArray,
        long srcPitch,
        long dstXInBytes,
        long dstY,
        int dstMemoryType,
        @Nullable ByteBuffer dstHost,
        long dstDevice,
        long dstArray,
        long dstPitch,
        long WidthInBytes,
        long Height
    ) {
        srcXInBytes(srcXInBytes);
        srcY(srcY);
        srcMemoryType(srcMemoryType);
        srcHost(srcHost);
        srcDevice(srcDevice);
        srcArray(srcArray);
        srcPitch(srcPitch);
        dstXInBytes(dstXInBytes);
        dstY(dstY);
        dstMemoryType(dstMemoryType);
        dstHost(dstHost);
        dstDevice(dstDevice);
        dstArray(dstArray);
        dstPitch(dstPitch);
        WidthInBytes(WidthInBytes);
        Height(Height);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_MEMCPY2D set(CUDA_MEMCPY2D src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_MEMCPY2D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY2D malloc() {
        return wrap(CUDA_MEMCPY2D.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUDA_MEMCPY2D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_MEMCPY2D calloc() {
        return wrap(CUDA_MEMCPY2D.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUDA_MEMCPY2D} instance allocated with {@link BufferUtils}. */
    public static CUDA_MEMCPY2D create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUDA_MEMCPY2D.class, memAddress(container), container);
    }

    /** Returns a new {@code CUDA_MEMCPY2D} instance for the specified memory address. */
    public static CUDA_MEMCPY2D create(long address) {
        return wrap(CUDA_MEMCPY2D.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMCPY2D createSafe(long address) {
        return address == NULL ? null : wrap(CUDA_MEMCPY2D.class, address);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY2D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY2D.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY2D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY2D.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY2D.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY2D.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUDA_MEMCPY2D.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY2D.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUDA_MEMCPY2D.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CUDA_MEMCPY2D.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CUDA_MEMCPY2D} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY2D malloc(MemoryStack stack) {
        return wrap(CUDA_MEMCPY2D.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUDA_MEMCPY2D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_MEMCPY2D calloc(MemoryStack stack) {
        return wrap(CUDA_MEMCPY2D.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUDA_MEMCPY2D.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY2D.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_MEMCPY2D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_MEMCPY2D.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcXInBytes}. */
    public static long nsrcXInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.SRCXINBYTES); }
    /** Unsafe version of {@link #srcY}. */
    public static long nsrcY(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.SRCY); }
    /** Unsafe version of {@link #srcMemoryType}. */
    public static int nsrcMemoryType(long struct) { return UNSAFE.getInt(null, struct + CUDA_MEMCPY2D.SRCMEMORYTYPE); }
    /** Unsafe version of {@link #srcHost(int) srcHost}. */
    @Nullable public static ByteBuffer nsrcHost(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + CUDA_MEMCPY2D.SRCHOST), capacity); }
    /** Unsafe version of {@link #srcDevice}. */
    public static long nsrcDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.SRCDEVICE); }
    /** Unsafe version of {@link #srcArray}. */
    public static long nsrcArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.SRCARRAY); }
    /** Unsafe version of {@link #srcPitch}. */
    public static long nsrcPitch(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.SRCPITCH); }
    /** Unsafe version of {@link #dstXInBytes}. */
    public static long ndstXInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.DSTXINBYTES); }
    /** Unsafe version of {@link #dstY}. */
    public static long ndstY(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.DSTY); }
    /** Unsafe version of {@link #dstMemoryType}. */
    public static int ndstMemoryType(long struct) { return UNSAFE.getInt(null, struct + CUDA_MEMCPY2D.DSTMEMORYTYPE); }
    /** Unsafe version of {@link #dstHost(int) dstHost}. */
    @Nullable public static ByteBuffer ndstHost(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + CUDA_MEMCPY2D.DSTHOST), capacity); }
    /** Unsafe version of {@link #dstDevice}. */
    public static long ndstDevice(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.DSTDEVICE); }
    /** Unsafe version of {@link #dstArray}. */
    public static long ndstArray(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.DSTARRAY); }
    /** Unsafe version of {@link #dstPitch}. */
    public static long ndstPitch(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.DSTPITCH); }
    /** Unsafe version of {@link #WidthInBytes}. */
    public static long nWidthInBytes(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.WIDTHINBYTES); }
    /** Unsafe version of {@link #Height}. */
    public static long nHeight(long struct) { return memGetAddress(struct + CUDA_MEMCPY2D.HEIGHT); }

    /** Unsafe version of {@link #srcXInBytes(long) srcXInBytes}. */
    public static void nsrcXInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.SRCXINBYTES, value); }
    /** Unsafe version of {@link #srcY(long) srcY}. */
    public static void nsrcY(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.SRCY, value); }
    /** Unsafe version of {@link #srcMemoryType(int) srcMemoryType}. */
    public static void nsrcMemoryType(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_MEMCPY2D.SRCMEMORYTYPE, value); }
    /** Unsafe version of {@link #srcHost(ByteBuffer) srcHost}. */
    public static void nsrcHost(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY2D.SRCHOST, memAddressSafe(value)); }
    /** Unsafe version of {@link #srcDevice(long) srcDevice}. */
    public static void nsrcDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.SRCDEVICE, value); }
    /** Unsafe version of {@link #srcArray(long) srcArray}. */
    public static void nsrcArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.SRCARRAY, value); }
    /** Unsafe version of {@link #srcPitch(long) srcPitch}. */
    public static void nsrcPitch(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.SRCPITCH, value); }
    /** Unsafe version of {@link #dstXInBytes(long) dstXInBytes}. */
    public static void ndstXInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.DSTXINBYTES, value); }
    /** Unsafe version of {@link #dstY(long) dstY}. */
    public static void ndstY(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.DSTY, value); }
    /** Unsafe version of {@link #dstMemoryType(int) dstMemoryType}. */
    public static void ndstMemoryType(long struct, int value) { UNSAFE.putInt(null, struct + CUDA_MEMCPY2D.DSTMEMORYTYPE, value); }
    /** Unsafe version of {@link #dstHost(ByteBuffer) dstHost}. */
    public static void ndstHost(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + CUDA_MEMCPY2D.DSTHOST, memAddressSafe(value)); }
    /** Unsafe version of {@link #dstDevice(long) dstDevice}. */
    public static void ndstDevice(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.DSTDEVICE, value); }
    /** Unsafe version of {@link #dstArray(long) dstArray}. */
    public static void ndstArray(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.DSTARRAY, value); }
    /** Unsafe version of {@link #dstPitch(long) dstPitch}. */
    public static void ndstPitch(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.DSTPITCH, value); }
    /** Unsafe version of {@link #WidthInBytes(long) WidthInBytes}. */
    public static void nWidthInBytes(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.WIDTHINBYTES, value); }
    /** Unsafe version of {@link #Height(long) Height}. */
    public static void nHeight(long struct, long value) { memPutAddress(struct + CUDA_MEMCPY2D.HEIGHT, value); }

    // -----------------------------------

    /** An array of {@link CUDA_MEMCPY2D} structs. */
    public static class Buffer extends StructBuffer<CUDA_MEMCPY2D, Buffer> implements NativeResource {

        private static final CUDA_MEMCPY2D ELEMENT_FACTORY = CUDA_MEMCPY2D.create(-1L);

        /**
         * Creates a new {@code CUDA_MEMCPY2D.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_MEMCPY2D#SIZEOF}, and its mark will be undefined.
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
        protected CUDA_MEMCPY2D getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CUDA_MEMCPY2D#srcXInBytes} field. */
        @NativeType("size_t")
        public long srcXInBytes() { return CUDA_MEMCPY2D.nsrcXInBytes(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#srcY} field. */
        @NativeType("size_t")
        public long srcY() { return CUDA_MEMCPY2D.nsrcY(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#srcMemoryType} field. */
        @NativeType("CUmemorytype")
        public int srcMemoryType() { return CUDA_MEMCPY2D.nsrcMemoryType(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link CUDA_MEMCPY2D#srcHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void const *")
        public ByteBuffer srcHost(int capacity) { return CUDA_MEMCPY2D.nsrcHost(address(), capacity); }
        /** @return the value of the {@link CUDA_MEMCPY2D#srcDevice} field. */
        @NativeType("CUdeviceptr")
        public long srcDevice() { return CUDA_MEMCPY2D.nsrcDevice(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#srcArray} field. */
        @NativeType("CUarray")
        public long srcArray() { return CUDA_MEMCPY2D.nsrcArray(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#srcPitch} field. */
        @NativeType("size_t")
        public long srcPitch() { return CUDA_MEMCPY2D.nsrcPitch(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#dstXInBytes} field. */
        @NativeType("size_t")
        public long dstXInBytes() { return CUDA_MEMCPY2D.ndstXInBytes(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#dstY} field. */
        @NativeType("size_t")
        public long dstY() { return CUDA_MEMCPY2D.ndstY(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#dstMemoryType} field. */
        @NativeType("CUmemorytype")
        public int dstMemoryType() { return CUDA_MEMCPY2D.ndstMemoryType(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link CUDA_MEMCPY2D#dstHost} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("void *")
        public ByteBuffer dstHost(int capacity) { return CUDA_MEMCPY2D.ndstHost(address(), capacity); }
        /** @return the value of the {@link CUDA_MEMCPY2D#dstDevice} field. */
        @NativeType("CUdeviceptr")
        public long dstDevice() { return CUDA_MEMCPY2D.ndstDevice(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#dstArray} field. */
        @NativeType("CUarray")
        public long dstArray() { return CUDA_MEMCPY2D.ndstArray(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#dstPitch} field. */
        @NativeType("size_t")
        public long dstPitch() { return CUDA_MEMCPY2D.ndstPitch(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#WidthInBytes} field. */
        @NativeType("size_t")
        public long WidthInBytes() { return CUDA_MEMCPY2D.nWidthInBytes(address()); }
        /** @return the value of the {@link CUDA_MEMCPY2D#Height} field. */
        @NativeType("size_t")
        public long Height() { return CUDA_MEMCPY2D.nHeight(address()); }

        /** Sets the specified value to the {@link CUDA_MEMCPY2D#srcXInBytes} field. */
        public CUDA_MEMCPY2D.Buffer srcXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY2D.nsrcXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#srcY} field. */
        public CUDA_MEMCPY2D.Buffer srcY(@NativeType("size_t") long value) { CUDA_MEMCPY2D.nsrcY(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#srcMemoryType} field. */
        public CUDA_MEMCPY2D.Buffer srcMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY2D.nsrcMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link CUDA_MEMCPY2D#srcHost} field. */
        public CUDA_MEMCPY2D.Buffer srcHost(@Nullable @NativeType("void const *") ByteBuffer value) { CUDA_MEMCPY2D.nsrcHost(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#srcDevice} field. */
        public CUDA_MEMCPY2D.Buffer srcDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY2D.nsrcDevice(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#srcArray} field. */
        public CUDA_MEMCPY2D.Buffer srcArray(@NativeType("CUarray") long value) { CUDA_MEMCPY2D.nsrcArray(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#srcPitch} field. */
        public CUDA_MEMCPY2D.Buffer srcPitch(@NativeType("size_t") long value) { CUDA_MEMCPY2D.nsrcPitch(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#dstXInBytes} field. */
        public CUDA_MEMCPY2D.Buffer dstXInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY2D.ndstXInBytes(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#dstY} field. */
        public CUDA_MEMCPY2D.Buffer dstY(@NativeType("size_t") long value) { CUDA_MEMCPY2D.ndstY(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#dstMemoryType} field. */
        public CUDA_MEMCPY2D.Buffer dstMemoryType(@NativeType("CUmemorytype") int value) { CUDA_MEMCPY2D.ndstMemoryType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link CUDA_MEMCPY2D#dstHost} field. */
        public CUDA_MEMCPY2D.Buffer dstHost(@Nullable @NativeType("void *") ByteBuffer value) { CUDA_MEMCPY2D.ndstHost(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#dstDevice} field. */
        public CUDA_MEMCPY2D.Buffer dstDevice(@NativeType("CUdeviceptr") long value) { CUDA_MEMCPY2D.ndstDevice(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#dstArray} field. */
        public CUDA_MEMCPY2D.Buffer dstArray(@NativeType("CUarray") long value) { CUDA_MEMCPY2D.ndstArray(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#dstPitch} field. */
        public CUDA_MEMCPY2D.Buffer dstPitch(@NativeType("size_t") long value) { CUDA_MEMCPY2D.ndstPitch(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#WidthInBytes} field. */
        public CUDA_MEMCPY2D.Buffer WidthInBytes(@NativeType("size_t") long value) { CUDA_MEMCPY2D.nWidthInBytes(address(), value); return this; }
        /** Sets the specified value to the {@link CUDA_MEMCPY2D#Height} field. */
        public CUDA_MEMCPY2D.Buffer Height(@NativeType("size_t") long value) { CUDA_MEMCPY2D.nHeight(address(), value); return this; }

    }

}