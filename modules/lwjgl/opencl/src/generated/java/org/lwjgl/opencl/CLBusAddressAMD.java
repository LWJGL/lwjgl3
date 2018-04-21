/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Bus address information used in {@link AMDBusAddressableMemory#clEnqueueMakeBuffersResidentAMD EnqueueMakeBuffersResidentAMD}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code surfbusaddress} &ndash; contains the page aligned physical starting address of the backing store preallocated by the application on a remote device</li>
 * <li>{@code signalbusaddress} &ndash; contains the page aligned physical starting address of preallocated signaling surface</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct cl_bus_address_amd {
 *     cl_long surfbusaddress;
 *     cl_long signalbusaddress;
 * }</pre></code>
 */
@NativeType("struct cl_bus_address_amd")
public class CLBusAddressAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SURFBUSADDRESS,
        SIGNALBUSADDRESS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SURFBUSADDRESS = layout.offsetof(0);
        SIGNALBUSADDRESS = layout.offsetof(1);
    }

    CLBusAddressAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link CLBusAddressAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLBusAddressAMD(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code surfbusaddress} field. */
    @NativeType("cl_long")
    public long surfbusaddress() { return nsurfbusaddress(address()); }
    /** Returns the value of the {@code signalbusaddress} field. */
    @NativeType("cl_long")
    public long signalbusaddress() { return nsignalbusaddress(address()); }

    /** Sets the specified value to the {@code surfbusaddress} field. */
    public CLBusAddressAMD surfbusaddress(@NativeType("cl_long") long value) { nsurfbusaddress(address(), value); return this; }
    /** Sets the specified value to the {@code signalbusaddress} field. */
    public CLBusAddressAMD signalbusaddress(@NativeType("cl_long") long value) { nsignalbusaddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLBusAddressAMD set(
        long surfbusaddress,
        long signalbusaddress
    ) {
        surfbusaddress(surfbusaddress);
        signalbusaddress(signalbusaddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLBusAddressAMD set(CLBusAddressAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link CLBusAddressAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLBusAddressAMD malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link CLBusAddressAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLBusAddressAMD calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link CLBusAddressAMD} instance allocated with {@link BufferUtils}. */
    public static CLBusAddressAMD create() {
        return new CLBusAddressAMD(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link CLBusAddressAMD} instance for the specified memory address. */
    public static CLBusAddressAMD create(long address) {
        return new CLBusAddressAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBusAddressAMD createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link CLBusAddressAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBusAddressAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link CLBusAddressAMD} instance allocated on the thread-local {@link MemoryStack}. */
    public static CLBusAddressAMD mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link CLBusAddressAMD} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CLBusAddressAMD callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link CLBusAddressAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBusAddressAMD mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link CLBusAddressAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBusAddressAMD callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #surfbusaddress}. */
    public static long nsurfbusaddress(long struct) { return memGetLong(struct + CLBusAddressAMD.SURFBUSADDRESS); }
    /** Unsafe version of {@link #signalbusaddress}. */
    public static long nsignalbusaddress(long struct) { return memGetLong(struct + CLBusAddressAMD.SIGNALBUSADDRESS); }

    /** Unsafe version of {@link #surfbusaddress(long) surfbusaddress}. */
    public static void nsurfbusaddress(long struct, long value) { memPutLong(struct + CLBusAddressAMD.SURFBUSADDRESS, value); }
    /** Unsafe version of {@link #signalbusaddress(long) signalbusaddress}. */
    public static void nsignalbusaddress(long struct, long value) { memPutLong(struct + CLBusAddressAMD.SIGNALBUSADDRESS, value); }

    // -----------------------------------

    /** An array of {@link CLBusAddressAMD} structs. */
    public static class Buffer extends StructBuffer<CLBusAddressAMD, Buffer> implements NativeResource {

        /**
         * Creates a new {@link CLBusAddressAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLBusAddressAMD#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected CLBusAddressAMD newInstance(long address) {
            return new CLBusAddressAMD(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code surfbusaddress} field. */
        @NativeType("cl_long")
        public long surfbusaddress() { return CLBusAddressAMD.nsurfbusaddress(address()); }
        /** Returns the value of the {@code signalbusaddress} field. */
        @NativeType("cl_long")
        public long signalbusaddress() { return CLBusAddressAMD.nsignalbusaddress(address()); }

        /** Sets the specified value to the {@code surfbusaddress} field. */
        public CLBusAddressAMD.Buffer surfbusaddress(@NativeType("cl_long") long value) { CLBusAddressAMD.nsurfbusaddress(address(), value); return this; }
        /** Sets the specified value to the {@code signalbusaddress} field. */
        public CLBusAddressAMD.Buffer signalbusaddress(@NativeType("cl_long") long value) { CLBusAddressAMD.nsignalbusaddress(address(), value); return this; }

    }

}