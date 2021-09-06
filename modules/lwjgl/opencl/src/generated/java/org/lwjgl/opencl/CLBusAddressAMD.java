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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_bus_address_amd {
 *     cl_long {@link #surfbusaddress};
 *     cl_long {@link #signalbusaddress};
 * }</code></pre>
 */
@NativeType("struct cl_bus_address_amd")
public class CLBusAddressAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
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

    /**
     * Creates a {@code CLBusAddressAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLBusAddressAMD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** contains the page aligned physical starting address of the backing store preallocated by the application on a remote device */
    @NativeType("cl_long")
    public long surfbusaddress() { return nsurfbusaddress(address()); }
    /** contains the page aligned physical starting address of preallocated signaling surface */
    @NativeType("cl_long")
    public long signalbusaddress() { return nsignalbusaddress(address()); }

    /** Sets the specified value to the {@link #surfbusaddress} field. */
    public CLBusAddressAMD surfbusaddress(@NativeType("cl_long") long value) { nsurfbusaddress(address(), value); return this; }
    /** Sets the specified value to the {@link #signalbusaddress} field. */
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

    /** Returns a new {@code CLBusAddressAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLBusAddressAMD malloc() {
        return wrap(CLBusAddressAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLBusAddressAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLBusAddressAMD calloc() {
        return wrap(CLBusAddressAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLBusAddressAMD} instance allocated with {@link BufferUtils}. */
    public static CLBusAddressAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLBusAddressAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code CLBusAddressAMD} instance for the specified memory address. */
    public static CLBusAddressAMD create(long address) {
        return wrap(CLBusAddressAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBusAddressAMD createSafe(long address) {
        return address == NULL ? null : wrap(CLBusAddressAMD.class, address);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLBusAddressAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLBusAddressAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CLBusAddressAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CLBusAddressAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBusAddressAMD malloc(MemoryStack stack) {
        return wrap(CLBusAddressAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLBusAddressAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLBusAddressAMD calloc(MemoryStack stack) {
        return wrap(CLBusAddressAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLBusAddressAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLBusAddressAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #surfbusaddress}. */
    public static long nsurfbusaddress(long struct) { return UNSAFE.getLong(null, struct + CLBusAddressAMD.SURFBUSADDRESS); }
    /** Unsafe version of {@link #signalbusaddress}. */
    public static long nsignalbusaddress(long struct) { return UNSAFE.getLong(null, struct + CLBusAddressAMD.SIGNALBUSADDRESS); }

    /** Unsafe version of {@link #surfbusaddress(long) surfbusaddress}. */
    public static void nsurfbusaddress(long struct, long value) { UNSAFE.putLong(null, struct + CLBusAddressAMD.SURFBUSADDRESS, value); }
    /** Unsafe version of {@link #signalbusaddress(long) signalbusaddress}. */
    public static void nsignalbusaddress(long struct, long value) { UNSAFE.putLong(null, struct + CLBusAddressAMD.SIGNALBUSADDRESS, value); }

    // -----------------------------------

    /** An array of {@link CLBusAddressAMD} structs. */
    public static class Buffer extends StructBuffer<CLBusAddressAMD, Buffer> implements NativeResource {

        private static final CLBusAddressAMD ELEMENT_FACTORY = CLBusAddressAMD.create(-1L);

        /**
         * Creates a new {@code CLBusAddressAMD.Buffer} instance backed by the specified container.
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
        protected CLBusAddressAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link CLBusAddressAMD#surfbusaddress} field. */
        @NativeType("cl_long")
        public long surfbusaddress() { return CLBusAddressAMD.nsurfbusaddress(address()); }
        /** @return the value of the {@link CLBusAddressAMD#signalbusaddress} field. */
        @NativeType("cl_long")
        public long signalbusaddress() { return CLBusAddressAMD.nsignalbusaddress(address()); }

        /** Sets the specified value to the {@link CLBusAddressAMD#surfbusaddress} field. */
        public CLBusAddressAMD.Buffer surfbusaddress(@NativeType("cl_long") long value) { CLBusAddressAMD.nsurfbusaddress(address(), value); return this; }
        /** Sets the specified value to the {@link CLBusAddressAMD#signalbusaddress} field. */
        public CLBusAddressAMD.Buffer signalbusaddress(@NativeType("cl_long") long value) { CLBusAddressAMD.nsignalbusaddress(address(), value); return this; }

    }

}