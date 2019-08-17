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
 * Per-operation parameters for ::cuStreamBatchMemOp.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code waitValue}
 * 
 * <ul>
 * <li>{@code waitValue.alias} &ndash; For driver internal use. Initial value is unimportant.</li>
 * </ul></li>
 * <li>{@code writeValue}
 * 
 * <ul>
 * <li>{@code writeValue.alias} &ndash; For driver internal use. Initial value is unimportant.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * union CUstreamBatchMemOpParams {
 *     CUstreamBatchMemOpType operation;
 *     struct {
 *         CUstreamBatchMemOpType operation;
 *         CUdeviceptr address;
 *         union {
 *             cuuint32_t value;
 *             cuuint64_t value64;
 *         };
 *         unsigned int flags;
 *         CUdeviceptr alias;
 *     } waitValue;
 *     struct {
 *         CUstreamBatchMemOpType operation;
 *         CUdeviceptr address;
 *         union {
 *             cuuint32_t value;
 *             cuuint64_t value64;
 *         };
 *         unsigned int flags;
 *         CUdeviceptr alias;
 *     } writeValue;
 *     struct {
 *         CUstreamBatchMemOpType operation;
 *         unsigned int flags;
 *     } flushRemoteWrites;
 *     cuuint64_t pad[6];
 * }</code></pre>
 */
public class CUstreamBatchMemOpParams extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OPERATION,
        WAITVALUE,
            WAITVALUE_OPERATION,
            WAITVALUE_ADDRESS,
            WAITVALUE_VALUE,
            WAITVALUE_VALUE64,
            WAITVALUE_FLAGS,
            WAITVALUE_ALIAS,
        WRITEVALUE,
            WRITEVALUE_OPERATION,
            WRITEVALUE_ADDRESS,
            WRITEVALUE_VALUE,
            WRITEVALUE_VALUE64,
            WRITEVALUE_FLAGS,
            WRITEVALUE_ALIAS,
        FLUSHREMOTEWRITES,
            FLUSHREMOTEWRITES_OPERATION,
            FLUSHREMOTEWRITES_FLAGS,
        PAD;

    static {
        Layout layout = __union(
            __member(4),
            __struct(
                __member(4),
                __member(POINTER_SIZE),
                __union(
                    __member(4),
                    __member(8)
                ),
                __member(4),
                __member(POINTER_SIZE)
            ),
            __struct(
                __member(4),
                __member(POINTER_SIZE),
                __union(
                    __member(4),
                    __member(8)
                ),
                __member(4),
                __member(POINTER_SIZE)
            ),
            __struct(
                __member(4),
                __member(4)
            ),
            __array(8, 6)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OPERATION = layout.offsetof(0);
        WAITVALUE = layout.offsetof(1);
            WAITVALUE_OPERATION = layout.offsetof(2);
            WAITVALUE_ADDRESS = layout.offsetof(3);
            WAITVALUE_VALUE = layout.offsetof(5);
            WAITVALUE_VALUE64 = layout.offsetof(6);
            WAITVALUE_FLAGS = layout.offsetof(7);
            WAITVALUE_ALIAS = layout.offsetof(8);
        WRITEVALUE = layout.offsetof(9);
            WRITEVALUE_OPERATION = layout.offsetof(10);
            WRITEVALUE_ADDRESS = layout.offsetof(11);
            WRITEVALUE_VALUE = layout.offsetof(13);
            WRITEVALUE_VALUE64 = layout.offsetof(14);
            WRITEVALUE_FLAGS = layout.offsetof(15);
            WRITEVALUE_ALIAS = layout.offsetof(16);
        FLUSHREMOTEWRITES = layout.offsetof(17);
            FLUSHREMOTEWRITES_OPERATION = layout.offsetof(18);
            FLUSHREMOTEWRITES_FLAGS = layout.offsetof(19);
        PAD = layout.offsetof(20);
    }

    /**
     * Creates a {@code CUstreamBatchMemOpParams} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUstreamBatchMemOpParams(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code operation} field. */
    @NativeType("CUstreamBatchMemOpType")
    public int operation() { return noperation(address()); }
    /** Returns the value of the {@code waitValue.operation} field. */
    @NativeType("CUstreamBatchMemOpType")
    public int waitValue_operation() { return nwaitValue_operation(address()); }
    /** Returns the value of the {@code waitValue.address} field. */
    @NativeType("CUdeviceptr")
    public long waitValue_address() { return nwaitValue_address(address()); }
    /** Returns the value of the {@code waitValue.value} field. */
    @NativeType("cuuint32_t")
    public int waitValue_value() { return nwaitValue_value(address()); }
    /** Returns the value of the {@code waitValue.value64} field. */
    @NativeType("cuuint64_t")
    public long waitValue_value64() { return nwaitValue_value64(address()); }
    /** Returns the value of the {@code waitValue.flags} field. */
    @NativeType("unsigned int")
    public int waitValue_flags() { return nwaitValue_flags(address()); }
    /** Returns the value of the {@code waitValue.alias} field. */
    @NativeType("CUdeviceptr")
    public long waitValue_alias() { return nwaitValue_alias(address()); }
    /** Returns the value of the {@code writeValue.operation} field. */
    @NativeType("CUstreamBatchMemOpType")
    public int writeValue_operation() { return nwriteValue_operation(address()); }
    /** Returns the value of the {@code writeValue.address} field. */
    @NativeType("CUdeviceptr")
    public long writeValue_address() { return nwriteValue_address(address()); }
    /** Returns the value of the {@code writeValue.value} field. */
    @NativeType("cuuint32_t")
    public int writeValue_value() { return nwriteValue_value(address()); }
    /** Returns the value of the {@code writeValue.value64} field. */
    @NativeType("cuuint64_t")
    public long writeValue_value64() { return nwriteValue_value64(address()); }
    /** Returns the value of the {@code writeValue.flags} field. */
    @NativeType("unsigned int")
    public int writeValue_flags() { return nwriteValue_flags(address()); }
    /** Returns the value of the {@code writeValue.alias} field. */
    @NativeType("CUdeviceptr")
    public long writeValue_alias() { return nwriteValue_alias(address()); }
    /** Returns the value of the {@code flushRemoteWrites.operation} field. */
    @NativeType("CUstreamBatchMemOpType")
    public int flushRemoteWrites_operation() { return nflushRemoteWrites_operation(address()); }
    /** Returns the value of the {@code flushRemoteWrites.flags} field. */
    @NativeType("unsigned int")
    public int flushRemoteWrites_flags() { return nflushRemoteWrites_flags(address()); }
    /** Returns a {@link LongBuffer} view of the {@code pad} field. */
    @NativeType("cuuint64_t[6]")
    public LongBuffer pad() { return npad(address()); }
    /** Returns the value at the specified index of the {@code pad} field. */
    @NativeType("cuuint64_t")
    public long pad(int index) { return npad(address(), index); }

    /** Sets the specified value to the {@code operation} field. */
    public CUstreamBatchMemOpParams operation(@NativeType("CUstreamBatchMemOpType") int value) { noperation(address(), value); return this; }
    /** Sets the specified value to the {@code waitValue.operation} field. */
    public CUstreamBatchMemOpParams waitValue_operation(@NativeType("CUstreamBatchMemOpType") int value) { nwaitValue_operation(address(), value); return this; }
    /** Sets the specified value to the {@code waitValue.address} field. */
    public CUstreamBatchMemOpParams waitValue_address(@NativeType("CUdeviceptr") long value) { nwaitValue_address(address(), value); return this; }
    /** Sets the specified value to the {@code waitValue.value} field. */
    public CUstreamBatchMemOpParams waitValue_value(@NativeType("cuuint32_t") int value) { nwaitValue_value(address(), value); return this; }
    /** Sets the specified value to the {@code waitValue.value64} field. */
    public CUstreamBatchMemOpParams waitValue_value64(@NativeType("cuuint64_t") long value) { nwaitValue_value64(address(), value); return this; }
    /** Sets the specified value to the {@code waitValue.flags} field. */
    public CUstreamBatchMemOpParams waitValue_flags(@NativeType("unsigned int") int value) { nwaitValue_flags(address(), value); return this; }
    /** Sets the specified value to the {@code waitValue.alias} field. */
    public CUstreamBatchMemOpParams waitValue_alias(@NativeType("CUdeviceptr") long value) { nwaitValue_alias(address(), value); return this; }
    /** Sets the specified value to the {@code writeValue.operation} field. */
    public CUstreamBatchMemOpParams writeValue_operation(@NativeType("CUstreamBatchMemOpType") int value) { nwriteValue_operation(address(), value); return this; }
    /** Sets the specified value to the {@code writeValue.address} field. */
    public CUstreamBatchMemOpParams writeValue_address(@NativeType("CUdeviceptr") long value) { nwriteValue_address(address(), value); return this; }
    /** Sets the specified value to the {@code writeValue.value} field. */
    public CUstreamBatchMemOpParams writeValue_value(@NativeType("cuuint32_t") int value) { nwriteValue_value(address(), value); return this; }
    /** Sets the specified value to the {@code writeValue.value64} field. */
    public CUstreamBatchMemOpParams writeValue_value64(@NativeType("cuuint64_t") long value) { nwriteValue_value64(address(), value); return this; }
    /** Sets the specified value to the {@code writeValue.flags} field. */
    public CUstreamBatchMemOpParams writeValue_flags(@NativeType("unsigned int") int value) { nwriteValue_flags(address(), value); return this; }
    /** Sets the specified value to the {@code writeValue.alias} field. */
    public CUstreamBatchMemOpParams writeValue_alias(@NativeType("CUdeviceptr") long value) { nwriteValue_alias(address(), value); return this; }
    /** Sets the specified value to the {@code flushRemoteWrites.operation} field. */
    public CUstreamBatchMemOpParams flushRemoteWrites_operation(@NativeType("CUstreamBatchMemOpType") int value) { nflushRemoteWrites_operation(address(), value); return this; }
    /** Sets the specified value to the {@code flushRemoteWrites.flags} field. */
    public CUstreamBatchMemOpParams flushRemoteWrites_flags(@NativeType("unsigned int") int value) { nflushRemoteWrites_flags(address(), value); return this; }
    /** Copies the specified {@link LongBuffer} to the {@code pad} field. */
    public CUstreamBatchMemOpParams pad(@NativeType("cuuint64_t[6]") LongBuffer value) { npad(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code pad} field. */
    public CUstreamBatchMemOpParams pad(int index, @NativeType("cuuint64_t") long value) { npad(address(), index, value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUstreamBatchMemOpParams set(CUstreamBatchMemOpParams src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUstreamBatchMemOpParams} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUstreamBatchMemOpParams malloc() {
        return wrap(CUstreamBatchMemOpParams.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUstreamBatchMemOpParams} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUstreamBatchMemOpParams calloc() {
        return wrap(CUstreamBatchMemOpParams.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUstreamBatchMemOpParams} instance allocated with {@link BufferUtils}. */
    public static CUstreamBatchMemOpParams create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUstreamBatchMemOpParams.class, memAddress(container), container);
    }

    /** Returns a new {@code CUstreamBatchMemOpParams} instance for the specified memory address. */
    public static CUstreamBatchMemOpParams create(long address) {
        return wrap(CUstreamBatchMemOpParams.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUstreamBatchMemOpParams createSafe(long address) {
        return address == NULL ? null : wrap(CUstreamBatchMemOpParams.class, address);
    }

    /**
     * Returns a new {@link CUstreamBatchMemOpParams.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUstreamBatchMemOpParams.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUstreamBatchMemOpParams.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUstreamBatchMemOpParams.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUstreamBatchMemOpParams.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CUstreamBatchMemOpParams} instance allocated on the thread-local {@link MemoryStack}. */
    public static CUstreamBatchMemOpParams mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CUstreamBatchMemOpParams} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CUstreamBatchMemOpParams callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CUstreamBatchMemOpParams} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUstreamBatchMemOpParams mallocStack(MemoryStack stack) {
        return wrap(CUstreamBatchMemOpParams.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUstreamBatchMemOpParams} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUstreamBatchMemOpParams callocStack(MemoryStack stack) {
        return wrap(CUstreamBatchMemOpParams.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUstreamBatchMemOpParams.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUstreamBatchMemOpParams.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CUstreamBatchMemOpParams.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUstreamBatchMemOpParams.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUstreamBatchMemOpParams.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #operation}. */
    public static int noperation(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.OPERATION); }
    /** Unsafe version of {@link #waitValue_operation}. */
    public static int nwaitValue_operation(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.WAITVALUE_OPERATION); }
    /** Unsafe version of {@link #waitValue_address}. */
    public static long nwaitValue_address(long struct) { return memGetAddress(struct + CUstreamBatchMemOpParams.WAITVALUE_ADDRESS); }
    /** Unsafe version of {@link #waitValue_value}. */
    public static int nwaitValue_value(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.WAITVALUE_VALUE); }
    /** Unsafe version of {@link #waitValue_value64}. */
    public static long nwaitValue_value64(long struct) { return UNSAFE.getLong(null, struct + CUstreamBatchMemOpParams.WAITVALUE_VALUE64); }
    /** Unsafe version of {@link #waitValue_flags}. */
    public static int nwaitValue_flags(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.WAITVALUE_FLAGS); }
    /** Unsafe version of {@link #waitValue_alias}. */
    public static long nwaitValue_alias(long struct) { return memGetAddress(struct + CUstreamBatchMemOpParams.WAITVALUE_ALIAS); }
    /** Unsafe version of {@link #writeValue_operation}. */
    public static int nwriteValue_operation(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_OPERATION); }
    /** Unsafe version of {@link #writeValue_address}. */
    public static long nwriteValue_address(long struct) { return memGetAddress(struct + CUstreamBatchMemOpParams.WRITEVALUE_ADDRESS); }
    /** Unsafe version of {@link #writeValue_value}. */
    public static int nwriteValue_value(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_VALUE); }
    /** Unsafe version of {@link #writeValue_value64}. */
    public static long nwriteValue_value64(long struct) { return UNSAFE.getLong(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_VALUE64); }
    /** Unsafe version of {@link #writeValue_flags}. */
    public static int nwriteValue_flags(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_FLAGS); }
    /** Unsafe version of {@link #writeValue_alias}. */
    public static long nwriteValue_alias(long struct) { return memGetAddress(struct + CUstreamBatchMemOpParams.WRITEVALUE_ALIAS); }
    /** Unsafe version of {@link #flushRemoteWrites_operation}. */
    public static int nflushRemoteWrites_operation(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.FLUSHREMOTEWRITES_OPERATION); }
    /** Unsafe version of {@link #flushRemoteWrites_flags}. */
    public static int nflushRemoteWrites_flags(long struct) { return UNSAFE.getInt(null, struct + CUstreamBatchMemOpParams.FLUSHREMOTEWRITES_FLAGS); }
    /** Unsafe version of {@link #pad}. */
    public static LongBuffer npad(long struct) { return memLongBuffer(struct + CUstreamBatchMemOpParams.PAD, 6); }
    /** Unsafe version of {@link #pad(int) pad}. */
    public static long npad(long struct, int index) {
        return UNSAFE.getLong(null, struct + CUstreamBatchMemOpParams.PAD + check(index, 6) * 8);
    }

    /** Unsafe version of {@link #operation(int) operation}. */
    public static void noperation(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.OPERATION, value); }
    /** Unsafe version of {@link #waitValue_operation(int) waitValue_operation}. */
    public static void nwaitValue_operation(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.WAITVALUE_OPERATION, value); }
    /** Unsafe version of {@link #waitValue_address(long) waitValue_address}. */
    public static void nwaitValue_address(long struct, long value) { memPutAddress(struct + CUstreamBatchMemOpParams.WAITVALUE_ADDRESS, check(value)); }
    /** Unsafe version of {@link #waitValue_value(int) waitValue_value}. */
    public static void nwaitValue_value(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.WAITVALUE_VALUE, value); }
    /** Unsafe version of {@link #waitValue_value64(long) waitValue_value64}. */
    public static void nwaitValue_value64(long struct, long value) { UNSAFE.putLong(null, struct + CUstreamBatchMemOpParams.WAITVALUE_VALUE64, value); }
    /** Unsafe version of {@link #waitValue_flags(int) waitValue_flags}. */
    public static void nwaitValue_flags(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.WAITVALUE_FLAGS, value); }
    /** Unsafe version of {@link #waitValue_alias(long) waitValue_alias}. */
    public static void nwaitValue_alias(long struct, long value) { memPutAddress(struct + CUstreamBatchMemOpParams.WAITVALUE_ALIAS, check(value)); }
    /** Unsafe version of {@link #writeValue_operation(int) writeValue_operation}. */
    public static void nwriteValue_operation(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_OPERATION, value); }
    /** Unsafe version of {@link #writeValue_address(long) writeValue_address}. */
    public static void nwriteValue_address(long struct, long value) { memPutAddress(struct + CUstreamBatchMemOpParams.WRITEVALUE_ADDRESS, check(value)); }
    /** Unsafe version of {@link #writeValue_value(int) writeValue_value}. */
    public static void nwriteValue_value(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_VALUE, value); }
    /** Unsafe version of {@link #writeValue_value64(long) writeValue_value64}. */
    public static void nwriteValue_value64(long struct, long value) { UNSAFE.putLong(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_VALUE64, value); }
    /** Unsafe version of {@link #writeValue_flags(int) writeValue_flags}. */
    public static void nwriteValue_flags(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.WRITEVALUE_FLAGS, value); }
    /** Unsafe version of {@link #writeValue_alias(long) writeValue_alias}. */
    public static void nwriteValue_alias(long struct, long value) { memPutAddress(struct + CUstreamBatchMemOpParams.WRITEVALUE_ALIAS, check(value)); }
    /** Unsafe version of {@link #flushRemoteWrites_operation(int) flushRemoteWrites_operation}. */
    public static void nflushRemoteWrites_operation(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.FLUSHREMOTEWRITES_OPERATION, value); }
    /** Unsafe version of {@link #flushRemoteWrites_flags(int) flushRemoteWrites_flags}. */
    public static void nflushRemoteWrites_flags(long struct, int value) { UNSAFE.putInt(null, struct + CUstreamBatchMemOpParams.FLUSHREMOTEWRITES_FLAGS, value); }
    /** Unsafe version of {@link #pad(LongBuffer) pad}. */
    public static void npad(long struct, LongBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + CUstreamBatchMemOpParams.PAD, value.remaining() * 8);
    }
    /** Unsafe version of {@link #pad(int, long) pad}. */
    public static void npad(long struct, int index, long value) {
        UNSAFE.putLong(null, struct + CUstreamBatchMemOpParams.PAD + check(index, 6) * 8, value);
    }

    // -----------------------------------

    /** An array of {@link CUstreamBatchMemOpParams} structs. */
    public static class Buffer extends StructBuffer<CUstreamBatchMemOpParams, Buffer> implements NativeResource {

        private static final CUstreamBatchMemOpParams ELEMENT_FACTORY = CUstreamBatchMemOpParams.create(-1L);

        /**
         * Creates a new {@code CUstreamBatchMemOpParams.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUstreamBatchMemOpParams#SIZEOF}, and its mark will be undefined.
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
        protected CUstreamBatchMemOpParams getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code operation} field. */
        @NativeType("CUstreamBatchMemOpType")
        public int operation() { return CUstreamBatchMemOpParams.noperation(address()); }
        /** Returns the value of the {@code waitValue.operation} field. */
        @NativeType("CUstreamBatchMemOpType")
        public int waitValue_operation() { return CUstreamBatchMemOpParams.nwaitValue_operation(address()); }
        /** Returns the value of the {@code waitValue.address} field. */
        @NativeType("CUdeviceptr")
        public long waitValue_address() { return CUstreamBatchMemOpParams.nwaitValue_address(address()); }
        /** Returns the value of the {@code waitValue.value} field. */
        @NativeType("cuuint32_t")
        public int waitValue_value() { return CUstreamBatchMemOpParams.nwaitValue_value(address()); }
        /** Returns the value of the {@code waitValue.value64} field. */
        @NativeType("cuuint64_t")
        public long waitValue_value64() { return CUstreamBatchMemOpParams.nwaitValue_value64(address()); }
        /** Returns the value of the {@code waitValue.flags} field. */
        @NativeType("unsigned int")
        public int waitValue_flags() { return CUstreamBatchMemOpParams.nwaitValue_flags(address()); }
        /** Returns the value of the {@code waitValue.alias} field. */
        @NativeType("CUdeviceptr")
        public long waitValue_alias() { return CUstreamBatchMemOpParams.nwaitValue_alias(address()); }
        /** Returns the value of the {@code writeValue.operation} field. */
        @NativeType("CUstreamBatchMemOpType")
        public int writeValue_operation() { return CUstreamBatchMemOpParams.nwriteValue_operation(address()); }
        /** Returns the value of the {@code writeValue.address} field. */
        @NativeType("CUdeviceptr")
        public long writeValue_address() { return CUstreamBatchMemOpParams.nwriteValue_address(address()); }
        /** Returns the value of the {@code writeValue.value} field. */
        @NativeType("cuuint32_t")
        public int writeValue_value() { return CUstreamBatchMemOpParams.nwriteValue_value(address()); }
        /** Returns the value of the {@code writeValue.value64} field. */
        @NativeType("cuuint64_t")
        public long writeValue_value64() { return CUstreamBatchMemOpParams.nwriteValue_value64(address()); }
        /** Returns the value of the {@code writeValue.flags} field. */
        @NativeType("unsigned int")
        public int writeValue_flags() { return CUstreamBatchMemOpParams.nwriteValue_flags(address()); }
        /** Returns the value of the {@code writeValue.alias} field. */
        @NativeType("CUdeviceptr")
        public long writeValue_alias() { return CUstreamBatchMemOpParams.nwriteValue_alias(address()); }
        /** Returns the value of the {@code flushRemoteWrites.operation} field. */
        @NativeType("CUstreamBatchMemOpType")
        public int flushRemoteWrites_operation() { return CUstreamBatchMemOpParams.nflushRemoteWrites_operation(address()); }
        /** Returns the value of the {@code flushRemoteWrites.flags} field. */
        @NativeType("unsigned int")
        public int flushRemoteWrites_flags() { return CUstreamBatchMemOpParams.nflushRemoteWrites_flags(address()); }
        /** Returns a {@link LongBuffer} view of the {@code pad} field. */
        @NativeType("cuuint64_t[6]")
        public LongBuffer pad() { return CUstreamBatchMemOpParams.npad(address()); }
        /** Returns the value at the specified index of the {@code pad} field. */
        @NativeType("cuuint64_t")
        public long pad(int index) { return CUstreamBatchMemOpParams.npad(address(), index); }

        /** Sets the specified value to the {@code operation} field. */
        public CUstreamBatchMemOpParams.Buffer operation(@NativeType("CUstreamBatchMemOpType") int value) { CUstreamBatchMemOpParams.noperation(address(), value); return this; }
        /** Sets the specified value to the {@code waitValue.operation} field. */
        public CUstreamBatchMemOpParams.Buffer waitValue_operation(@NativeType("CUstreamBatchMemOpType") int value) { CUstreamBatchMemOpParams.nwaitValue_operation(address(), value); return this; }
        /** Sets the specified value to the {@code waitValue.address} field. */
        public CUstreamBatchMemOpParams.Buffer waitValue_address(@NativeType("CUdeviceptr") long value) { CUstreamBatchMemOpParams.nwaitValue_address(address(), value); return this; }
        /** Sets the specified value to the {@code waitValue.value} field. */
        public CUstreamBatchMemOpParams.Buffer waitValue_value(@NativeType("cuuint32_t") int value) { CUstreamBatchMemOpParams.nwaitValue_value(address(), value); return this; }
        /** Sets the specified value to the {@code waitValue.value64} field. */
        public CUstreamBatchMemOpParams.Buffer waitValue_value64(@NativeType("cuuint64_t") long value) { CUstreamBatchMemOpParams.nwaitValue_value64(address(), value); return this; }
        /** Sets the specified value to the {@code waitValue.flags} field. */
        public CUstreamBatchMemOpParams.Buffer waitValue_flags(@NativeType("unsigned int") int value) { CUstreamBatchMemOpParams.nwaitValue_flags(address(), value); return this; }
        /** Sets the specified value to the {@code waitValue.alias} field. */
        public CUstreamBatchMemOpParams.Buffer waitValue_alias(@NativeType("CUdeviceptr") long value) { CUstreamBatchMemOpParams.nwaitValue_alias(address(), value); return this; }
        /** Sets the specified value to the {@code writeValue.operation} field. */
        public CUstreamBatchMemOpParams.Buffer writeValue_operation(@NativeType("CUstreamBatchMemOpType") int value) { CUstreamBatchMemOpParams.nwriteValue_operation(address(), value); return this; }
        /** Sets the specified value to the {@code writeValue.address} field. */
        public CUstreamBatchMemOpParams.Buffer writeValue_address(@NativeType("CUdeviceptr") long value) { CUstreamBatchMemOpParams.nwriteValue_address(address(), value); return this; }
        /** Sets the specified value to the {@code writeValue.value} field. */
        public CUstreamBatchMemOpParams.Buffer writeValue_value(@NativeType("cuuint32_t") int value) { CUstreamBatchMemOpParams.nwriteValue_value(address(), value); return this; }
        /** Sets the specified value to the {@code writeValue.value64} field. */
        public CUstreamBatchMemOpParams.Buffer writeValue_value64(@NativeType("cuuint64_t") long value) { CUstreamBatchMemOpParams.nwriteValue_value64(address(), value); return this; }
        /** Sets the specified value to the {@code writeValue.flags} field. */
        public CUstreamBatchMemOpParams.Buffer writeValue_flags(@NativeType("unsigned int") int value) { CUstreamBatchMemOpParams.nwriteValue_flags(address(), value); return this; }
        /** Sets the specified value to the {@code writeValue.alias} field. */
        public CUstreamBatchMemOpParams.Buffer writeValue_alias(@NativeType("CUdeviceptr") long value) { CUstreamBatchMemOpParams.nwriteValue_alias(address(), value); return this; }
        /** Sets the specified value to the {@code flushRemoteWrites.operation} field. */
        public CUstreamBatchMemOpParams.Buffer flushRemoteWrites_operation(@NativeType("CUstreamBatchMemOpType") int value) { CUstreamBatchMemOpParams.nflushRemoteWrites_operation(address(), value); return this; }
        /** Sets the specified value to the {@code flushRemoteWrites.flags} field. */
        public CUstreamBatchMemOpParams.Buffer flushRemoteWrites_flags(@NativeType("unsigned int") int value) { CUstreamBatchMemOpParams.nflushRemoteWrites_flags(address(), value); return this; }
        /** Copies the specified {@link LongBuffer} to the {@code pad} field. */
        public CUstreamBatchMemOpParams.Buffer pad(@NativeType("cuuint64_t[6]") LongBuffer value) { CUstreamBatchMemOpParams.npad(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code pad} field. */
        public CUstreamBatchMemOpParams.Buffer pad(int index, @NativeType("cuuint64_t") long value) { CUstreamBatchMemOpParams.npad(address(), index, value); return this; }

    }

}