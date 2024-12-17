/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkLatencySleepInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSemaphore signalSemaphore;
 *     uint64_t value;
 * }}</pre>
 */
public class VkLatencySleepInfoNV extends Struct<VkLatencySleepInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SIGNALSEMAPHORE,
        VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SIGNALSEMAPHORE = layout.offsetof(2);
        VALUE = layout.offsetof(3);
    }

    protected VkLatencySleepInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkLatencySleepInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkLatencySleepInfoNV(address, container);
    }

    /**
     * Creates a {@code VkLatencySleepInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkLatencySleepInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code signalSemaphore} field. */
    @NativeType("VkSemaphore")
    public long signalSemaphore() { return nsignalSemaphore(address()); }
    /** @return the value of the {@code value} field. */
    @NativeType("uint64_t")
    public long value() { return nvalue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkLatencySleepInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV} value to the {@code sType} field. */
    public VkLatencySleepInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkLatencySleepInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code signalSemaphore} field. */
    public VkLatencySleepInfoNV signalSemaphore(@NativeType("VkSemaphore") long value) { nsignalSemaphore(address(), value); return this; }
    /** Sets the specified value to the {@code value} field. */
    public VkLatencySleepInfoNV value(@NativeType("uint64_t") long value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkLatencySleepInfoNV set(
        int sType,
        long pNext,
        long signalSemaphore,
        long value
    ) {
        sType(sType);
        pNext(pNext);
        signalSemaphore(signalSemaphore);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkLatencySleepInfoNV set(VkLatencySleepInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkLatencySleepInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkLatencySleepInfoNV malloc() {
        return new VkLatencySleepInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySleepInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkLatencySleepInfoNV calloc() {
        return new VkLatencySleepInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkLatencySleepInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkLatencySleepInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLatencySleepInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkLatencySleepInfoNV} instance for the specified memory address. */
    public static VkLatencySleepInfoNV create(long address) {
        return new VkLatencySleepInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkLatencySleepInfoNV createSafe(long address) {
        return address == NULL ? null : new VkLatencySleepInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkLatencySleepInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkLatencySleepInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySleepInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkLatencySleepInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkLatencySleepInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkLatencySleepInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySleepInfoNV malloc(MemoryStack stack) {
        return new VkLatencySleepInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkLatencySleepInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkLatencySleepInfoNV calloc(MemoryStack stack) {
        return new VkLatencySleepInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkLatencySleepInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkLatencySleepInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkLatencySleepInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkLatencySleepInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkLatencySleepInfoNV.PNEXT); }
    /** Unsafe version of {@link #signalSemaphore}. */
    public static long nsignalSemaphore(long struct) { return memGetLong(struct + VkLatencySleepInfoNV.SIGNALSEMAPHORE); }
    /** Unsafe version of {@link #value}. */
    public static long nvalue(long struct) { return memGetLong(struct + VkLatencySleepInfoNV.VALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkLatencySleepInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkLatencySleepInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #signalSemaphore(long) signalSemaphore}. */
    public static void nsignalSemaphore(long struct, long value) { memPutLong(struct + VkLatencySleepInfoNV.SIGNALSEMAPHORE, value); }
    /** Unsafe version of {@link #value(long) value}. */
    public static void nvalue(long struct, long value) { memPutLong(struct + VkLatencySleepInfoNV.VALUE, value); }

    // -----------------------------------

    /** An array of {@link VkLatencySleepInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkLatencySleepInfoNV, Buffer> implements NativeResource {

        private static final VkLatencySleepInfoNV ELEMENT_FACTORY = VkLatencySleepInfoNV.create(-1L);

        /**
         * Creates a new {@code VkLatencySleepInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkLatencySleepInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkLatencySleepInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkLatencySleepInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkLatencySleepInfoNV.npNext(address()); }
        /** @return the value of the {@code signalSemaphore} field. */
        @NativeType("VkSemaphore")
        public long signalSemaphore() { return VkLatencySleepInfoNV.nsignalSemaphore(address()); }
        /** @return the value of the {@code value} field. */
        @NativeType("uint64_t")
        public long value() { return VkLatencySleepInfoNV.nvalue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkLatencySleepInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkLatencySleepInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV} value to the {@code sType} field. */
        public VkLatencySleepInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_LATENCY_SLEEP_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkLatencySleepInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkLatencySleepInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code signalSemaphore} field. */
        public VkLatencySleepInfoNV.Buffer signalSemaphore(@NativeType("VkSemaphore") long value) { VkLatencySleepInfoNV.nsignalSemaphore(address(), value); return this; }
        /** Sets the specified value to the {@code value} field. */
        public VkLatencySleepInfoNV.Buffer value(@NativeType("uint64_t") long value) { VkLatencySleepInfoNV.nvalue(address(), value); return this; }

    }

}