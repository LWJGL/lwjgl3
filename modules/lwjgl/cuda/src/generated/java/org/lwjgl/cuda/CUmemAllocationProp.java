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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUmemAllocationProp {
 *     CUmemAllocationType type;
 *     CUmemAllocationHandleType requestedHandleTypes;
 *     {@link CUmemLocation CUmemLocation} location;
 *     void * win32HandleMetaData;
 *     struct {
 *         unsigned char compressionType;
 *         unsigned char gpuDirectRDMACapable;
 *         unsigned short usage;
 *         unsigned char reserved[4];
 *     } allocFlags;
 * }</code></pre>
 */
public class CUmemAllocationProp extends Struct<CUmemAllocationProp> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        REQUESTEDHANDLETYPES,
        LOCATION,
        WIN32HANDLEMETADATA,
        ALLOCFLAGS,
            ALLOCFLAGS_COMPRESSIONTYPE,
            ALLOCFLAGS_GPUDIRECTRDMACAPABLE,
            ALLOCFLAGS_USAGE,
            ALLOCFLAGS_RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(CUmemLocation.SIZEOF, CUmemLocation.ALIGNOF),
            __member(POINTER_SIZE),
            __struct(
                __member(1),
                __member(1),
                __member(2),
                __array(1, 4)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        REQUESTEDHANDLETYPES = layout.offsetof(1);
        LOCATION = layout.offsetof(2);
        WIN32HANDLEMETADATA = layout.offsetof(3);
        ALLOCFLAGS = layout.offsetof(4);
            ALLOCFLAGS_COMPRESSIONTYPE = layout.offsetof(5);
            ALLOCFLAGS_GPUDIRECTRDMACAPABLE = layout.offsetof(6);
            ALLOCFLAGS_USAGE = layout.offsetof(7);
            ALLOCFLAGS_RESERVED = layout.offsetof(8);
    }

    protected CUmemAllocationProp(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUmemAllocationProp create(long address, @Nullable ByteBuffer container) {
        return new CUmemAllocationProp(address, container);
    }

    /**
     * Creates a {@code CUmemAllocationProp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUmemAllocationProp(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("CUmemAllocationType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code requestedHandleTypes} field. */
    @NativeType("CUmemAllocationHandleType")
    public int requestedHandleTypes() { return nrequestedHandleTypes(address()); }
    /** @return a {@link CUmemLocation} view of the {@code location} field. */
    public CUmemLocation location() { return nlocation(address()); }
    /** @return the value of the {@code win32HandleMetaData} field. */
    @NativeType("void *")
    public long win32HandleMetaData() { return nwin32HandleMetaData(address()); }
    /** @return the value of the {@code allocFlags.compressionType} field. */
    @NativeType("unsigned char")
    public byte allocFlags_compressionType() { return nallocFlags_compressionType(address()); }
    /** @return the value of the {@code allocFlags.gpuDirectRDMACapable} field. */
    @NativeType("unsigned char")
    public byte allocFlags_gpuDirectRDMACapable() { return nallocFlags_gpuDirectRDMACapable(address()); }
    /** @return the value of the {@code allocFlags.usage} field. */
    @NativeType("unsigned short")
    public short allocFlags_usage() { return nallocFlags_usage(address()); }
    /** @return a {@link ByteBuffer} view of the {@code allocFlags.reserved} field. */
    @NativeType("unsigned char[4]")
    public ByteBuffer allocFlags_reserved() { return nallocFlags_reserved(address()); }
    /** @return the value at the specified index of the {@code allocFlags.reserved} field. */
    @NativeType("unsigned char")
    public byte allocFlags_reserved(int index) { return nallocFlags_reserved(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public CUmemAllocationProp type(@NativeType("CUmemAllocationType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code requestedHandleTypes} field. */
    public CUmemAllocationProp requestedHandleTypes(@NativeType("CUmemAllocationHandleType") int value) { nrequestedHandleTypes(address(), value); return this; }
    /** Copies the specified {@link CUmemLocation} to the {@code location} field. */
    public CUmemAllocationProp location(CUmemLocation value) { nlocation(address(), value); return this; }
    /** Passes the {@code location} field to the specified {@link java.util.function.Consumer Consumer}. */
    public CUmemAllocationProp location(java.util.function.Consumer<CUmemLocation> consumer) { consumer.accept(location()); return this; }
    /** Sets the specified value to the {@code win32HandleMetaData} field. */
    public CUmemAllocationProp win32HandleMetaData(@NativeType("void *") long value) { nwin32HandleMetaData(address(), value); return this; }
    /** Sets the specified value to the {@code compressionType} field. */
    public CUmemAllocationProp allocFlags_compressionType(@NativeType("unsigned char") byte value) { nallocFlags_compressionType(address(), value); return this; }
    /** Sets the specified value to the {@code gpuDirectRDMACapable} field. */
    public CUmemAllocationProp allocFlags_gpuDirectRDMACapable(@NativeType("unsigned char") byte value) { nallocFlags_gpuDirectRDMACapable(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public CUmemAllocationProp allocFlags_usage(@NativeType("unsigned short") short value) { nallocFlags_usage(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code reserved} field. */
    public CUmemAllocationProp allocFlags_reserved(@NativeType("unsigned char[4]") ByteBuffer value) { nallocFlags_reserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public CUmemAllocationProp allocFlags_reserved(int index, @NativeType("unsigned char") byte value) { nallocFlags_reserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public CUmemAllocationProp set(
        int type,
        int requestedHandleTypes,
        CUmemLocation location,
        long win32HandleMetaData,
        byte allocFlags_compressionType,
        byte allocFlags_gpuDirectRDMACapable,
        short allocFlags_usage,
        ByteBuffer allocFlags_reserved
    ) {
        type(type);
        requestedHandleTypes(requestedHandleTypes);
        location(location);
        win32HandleMetaData(win32HandleMetaData);
        allocFlags_compressionType(allocFlags_compressionType);
        allocFlags_gpuDirectRDMACapable(allocFlags_gpuDirectRDMACapable);
        allocFlags_usage(allocFlags_usage);
        allocFlags_reserved(allocFlags_reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUmemAllocationProp set(CUmemAllocationProp src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUmemAllocationProp} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUmemAllocationProp malloc() {
        return new CUmemAllocationProp(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUmemAllocationProp} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUmemAllocationProp calloc() {
        return new CUmemAllocationProp(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUmemAllocationProp} instance allocated with {@link BufferUtils}. */
    public static CUmemAllocationProp create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUmemAllocationProp(memAddress(container), container);
    }

    /** Returns a new {@code CUmemAllocationProp} instance for the specified memory address. */
    public static CUmemAllocationProp create(long address) {
        return new CUmemAllocationProp(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemAllocationProp createSafe(long address) {
        return address == NULL ? null : new CUmemAllocationProp(address, null);
    }

    /**
     * Returns a new {@link CUmemAllocationProp.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemAllocationProp.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUmemAllocationProp.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemAllocationProp.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemAllocationProp.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUmemAllocationProp.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUmemAllocationProp.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUmemAllocationProp.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUmemAllocationProp.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUmemAllocationProp} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemAllocationProp malloc(MemoryStack stack) {
        return new CUmemAllocationProp(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUmemAllocationProp} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUmemAllocationProp calloc(MemoryStack stack) {
        return new CUmemAllocationProp(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUmemAllocationProp.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemAllocationProp.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUmemAllocationProp.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUmemAllocationProp.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + CUmemAllocationProp.TYPE); }
    /** Unsafe version of {@link #requestedHandleTypes}. */
    public static int nrequestedHandleTypes(long struct) { return UNSAFE.getInt(null, struct + CUmemAllocationProp.REQUESTEDHANDLETYPES); }
    /** Unsafe version of {@link #location}. */
    public static CUmemLocation nlocation(long struct) { return CUmemLocation.create(struct + CUmemAllocationProp.LOCATION); }
    /** Unsafe version of {@link #win32HandleMetaData}. */
    public static long nwin32HandleMetaData(long struct) { return memGetAddress(struct + CUmemAllocationProp.WIN32HANDLEMETADATA); }
    /** Unsafe version of {@link #allocFlags_compressionType}. */
    public static byte nallocFlags_compressionType(long struct) { return UNSAFE.getByte(null, struct + CUmemAllocationProp.ALLOCFLAGS_COMPRESSIONTYPE); }
    /** Unsafe version of {@link #allocFlags_gpuDirectRDMACapable}. */
    public static byte nallocFlags_gpuDirectRDMACapable(long struct) { return UNSAFE.getByte(null, struct + CUmemAllocationProp.ALLOCFLAGS_GPUDIRECTRDMACAPABLE); }
    /** Unsafe version of {@link #allocFlags_usage}. */
    public static short nallocFlags_usage(long struct) { return UNSAFE.getShort(null, struct + CUmemAllocationProp.ALLOCFLAGS_USAGE); }
    /** Unsafe version of {@link #allocFlags_reserved}. */
    public static ByteBuffer nallocFlags_reserved(long struct) { return memByteBuffer(struct + CUmemAllocationProp.ALLOCFLAGS_RESERVED, 4); }
    /** Unsafe version of {@link #allocFlags_reserved(int) allocFlags_reserved}. */
    public static byte nallocFlags_reserved(long struct, int index) {
        return UNSAFE.getByte(null, struct + CUmemAllocationProp.ALLOCFLAGS_RESERVED + check(index, 4) * 1);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + CUmemAllocationProp.TYPE, value); }
    /** Unsafe version of {@link #requestedHandleTypes(int) requestedHandleTypes}. */
    public static void nrequestedHandleTypes(long struct, int value) { UNSAFE.putInt(null, struct + CUmemAllocationProp.REQUESTEDHANDLETYPES, value); }
    /** Unsafe version of {@link #location(CUmemLocation) location}. */
    public static void nlocation(long struct, CUmemLocation value) { memCopy(value.address(), struct + CUmemAllocationProp.LOCATION, CUmemLocation.SIZEOF); }
    /** Unsafe version of {@link #win32HandleMetaData(long) win32HandleMetaData}. */
    public static void nwin32HandleMetaData(long struct, long value) { memPutAddress(struct + CUmemAllocationProp.WIN32HANDLEMETADATA, value); }
    /** Unsafe version of {@link #allocFlags_compressionType(byte) allocFlags_compressionType}. */
    public static void nallocFlags_compressionType(long struct, byte value) { UNSAFE.putByte(null, struct + CUmemAllocationProp.ALLOCFLAGS_COMPRESSIONTYPE, value); }
    /** Unsafe version of {@link #allocFlags_gpuDirectRDMACapable(byte) allocFlags_gpuDirectRDMACapable}. */
    public static void nallocFlags_gpuDirectRDMACapable(long struct, byte value) { UNSAFE.putByte(null, struct + CUmemAllocationProp.ALLOCFLAGS_GPUDIRECTRDMACAPABLE, value); }
    /** Unsafe version of {@link #allocFlags_usage(short) allocFlags_usage}. */
    public static void nallocFlags_usage(long struct, short value) { UNSAFE.putShort(null, struct + CUmemAllocationProp.ALLOCFLAGS_USAGE, value); }
    /** Unsafe version of {@link #allocFlags_reserved(ByteBuffer) allocFlags_reserved}. */
    public static void nallocFlags_reserved(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + CUmemAllocationProp.ALLOCFLAGS_RESERVED, value.remaining() * 1);
    }
    /** Unsafe version of {@link #allocFlags_reserved(int, byte) allocFlags_reserved}. */
    public static void nallocFlags_reserved(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + CUmemAllocationProp.ALLOCFLAGS_RESERVED + check(index, 4) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link CUmemAllocationProp} structs. */
    public static class Buffer extends StructBuffer<CUmemAllocationProp, Buffer> implements NativeResource {

        private static final CUmemAllocationProp ELEMENT_FACTORY = CUmemAllocationProp.create(-1L);

        /**
         * Creates a new {@code CUmemAllocationProp.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUmemAllocationProp#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUmemAllocationProp getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("CUmemAllocationType")
        public int type() { return CUmemAllocationProp.ntype(address()); }
        /** @return the value of the {@code requestedHandleTypes} field. */
        @NativeType("CUmemAllocationHandleType")
        public int requestedHandleTypes() { return CUmemAllocationProp.nrequestedHandleTypes(address()); }
        /** @return a {@link CUmemLocation} view of the {@code location} field. */
        public CUmemLocation location() { return CUmemAllocationProp.nlocation(address()); }
        /** @return the value of the {@code win32HandleMetaData} field. */
        @NativeType("void *")
        public long win32HandleMetaData() { return CUmemAllocationProp.nwin32HandleMetaData(address()); }
        /** @return the value of the {@code allocFlags.compressionType} field. */
        @NativeType("unsigned char")
        public byte allocFlags_compressionType() { return CUmemAllocationProp.nallocFlags_compressionType(address()); }
        /** @return the value of the {@code allocFlags.gpuDirectRDMACapable} field. */
        @NativeType("unsigned char")
        public byte allocFlags_gpuDirectRDMACapable() { return CUmemAllocationProp.nallocFlags_gpuDirectRDMACapable(address()); }
        /** @return the value of the {@code allocFlags.usage} field. */
        @NativeType("unsigned short")
        public short allocFlags_usage() { return CUmemAllocationProp.nallocFlags_usage(address()); }
        /** @return a {@link ByteBuffer} view of the {@code allocFlags.reserved} field. */
        @NativeType("unsigned char[4]")
        public ByteBuffer allocFlags_reserved() { return CUmemAllocationProp.nallocFlags_reserved(address()); }
        /** @return the value at the specified index of the {@code allocFlags.reserved} field. */
        @NativeType("unsigned char")
        public byte allocFlags_reserved(int index) { return CUmemAllocationProp.nallocFlags_reserved(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public CUmemAllocationProp.Buffer type(@NativeType("CUmemAllocationType") int value) { CUmemAllocationProp.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code requestedHandleTypes} field. */
        public CUmemAllocationProp.Buffer requestedHandleTypes(@NativeType("CUmemAllocationHandleType") int value) { CUmemAllocationProp.nrequestedHandleTypes(address(), value); return this; }
        /** Copies the specified {@link CUmemLocation} to the {@code location} field. */
        public CUmemAllocationProp.Buffer location(CUmemLocation value) { CUmemAllocationProp.nlocation(address(), value); return this; }
        /** Passes the {@code location} field to the specified {@link java.util.function.Consumer Consumer}. */
        public CUmemAllocationProp.Buffer location(java.util.function.Consumer<CUmemLocation> consumer) { consumer.accept(location()); return this; }
        /** Sets the specified value to the {@code win32HandleMetaData} field. */
        public CUmemAllocationProp.Buffer win32HandleMetaData(@NativeType("void *") long value) { CUmemAllocationProp.nwin32HandleMetaData(address(), value); return this; }
        /** Sets the specified value to the {@code compressionType} field. */
        public CUmemAllocationProp.Buffer allocFlags_compressionType(@NativeType("unsigned char") byte value) { CUmemAllocationProp.nallocFlags_compressionType(address(), value); return this; }
        /** Sets the specified value to the {@code gpuDirectRDMACapable} field. */
        public CUmemAllocationProp.Buffer allocFlags_gpuDirectRDMACapable(@NativeType("unsigned char") byte value) { CUmemAllocationProp.nallocFlags_gpuDirectRDMACapable(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public CUmemAllocationProp.Buffer allocFlags_usage(@NativeType("unsigned short") short value) { CUmemAllocationProp.nallocFlags_usage(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code reserved} field. */
        public CUmemAllocationProp.Buffer allocFlags_reserved(@NativeType("unsigned char[4]") ByteBuffer value) { CUmemAllocationProp.nallocFlags_reserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public CUmemAllocationProp.Buffer allocFlags_reserved(int index, @NativeType("unsigned char") byte value) { CUmemAllocationProp.nallocFlags_reserved(address(), index, value); return this; }

    }

}