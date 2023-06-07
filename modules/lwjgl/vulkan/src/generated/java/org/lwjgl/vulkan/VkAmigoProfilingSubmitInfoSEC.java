/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Stub description of VkAmigoProfilingSubmitInfoSEC.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link SECAmigoProfiling#VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAmigoProfilingSubmitInfoSEC {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint64_t firstDrawTimestamp;
 *     uint64_t swapBufferTimestamp;
 * }</code></pre>
 */
public class VkAmigoProfilingSubmitInfoSEC extends Struct<VkAmigoProfilingSubmitInfoSEC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FIRSTDRAWTIMESTAMP,
        SWAPBUFFERTIMESTAMP;

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
        FIRSTDRAWTIMESTAMP = layout.offsetof(2);
        SWAPBUFFERTIMESTAMP = layout.offsetof(3);
    }

    protected VkAmigoProfilingSubmitInfoSEC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAmigoProfilingSubmitInfoSEC create(long address, @Nullable ByteBuffer container) {
        return new VkAmigoProfilingSubmitInfoSEC(address, container);
    }

    /**
     * Creates a {@code VkAmigoProfilingSubmitInfoSEC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAmigoProfilingSubmitInfoSEC(ByteBuffer container) {
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
    /** @return the value of the {@code firstDrawTimestamp} field. */
    @NativeType("uint64_t")
    public long firstDrawTimestamp() { return nfirstDrawTimestamp(address()); }
    /** @return the value of the {@code swapBufferTimestamp} field. */
    @NativeType("uint64_t")
    public long swapBufferTimestamp() { return nswapBufferTimestamp(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAmigoProfilingSubmitInfoSEC sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link SECAmigoProfiling#VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC} value to the {@code sType} field. */
    public VkAmigoProfilingSubmitInfoSEC sType$Default() { return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAmigoProfilingSubmitInfoSEC pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code firstDrawTimestamp} field. */
    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestamp(@NativeType("uint64_t") long value) { nfirstDrawTimestamp(address(), value); return this; }
    /** Sets the specified value to the {@code swapBufferTimestamp} field. */
    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestamp(@NativeType("uint64_t") long value) { nswapBufferTimestamp(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAmigoProfilingSubmitInfoSEC set(
        int sType,
        long pNext,
        long firstDrawTimestamp,
        long swapBufferTimestamp
    ) {
        sType(sType);
        pNext(pNext);
        firstDrawTimestamp(firstDrawTimestamp);
        swapBufferTimestamp(swapBufferTimestamp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAmigoProfilingSubmitInfoSEC set(VkAmigoProfilingSubmitInfoSEC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAmigoProfilingSubmitInfoSEC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAmigoProfilingSubmitInfoSEC malloc() {
        return new VkAmigoProfilingSubmitInfoSEC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAmigoProfilingSubmitInfoSEC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAmigoProfilingSubmitInfoSEC calloc() {
        return new VkAmigoProfilingSubmitInfoSEC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAmigoProfilingSubmitInfoSEC} instance allocated with {@link BufferUtils}. */
    public static VkAmigoProfilingSubmitInfoSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAmigoProfilingSubmitInfoSEC(memAddress(container), container);
    }

    /** Returns a new {@code VkAmigoProfilingSubmitInfoSEC} instance for the specified memory address. */
    public static VkAmigoProfilingSubmitInfoSEC create(long address) {
        return new VkAmigoProfilingSubmitInfoSEC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAmigoProfilingSubmitInfoSEC createSafe(long address) {
        return address == NULL ? null : new VkAmigoProfilingSubmitInfoSEC(address, null);
    }

    /**
     * Returns a new {@link VkAmigoProfilingSubmitInfoSEC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAmigoProfilingSubmitInfoSEC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAmigoProfilingSubmitInfoSEC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAmigoProfilingSubmitInfoSEC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAmigoProfilingSubmitInfoSEC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAmigoProfilingSubmitInfoSEC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAmigoProfilingSubmitInfoSEC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAmigoProfilingSubmitInfoSEC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAmigoProfilingSubmitInfoSEC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAmigoProfilingSubmitInfoSEC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAmigoProfilingSubmitInfoSEC malloc(MemoryStack stack) {
        return new VkAmigoProfilingSubmitInfoSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAmigoProfilingSubmitInfoSEC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAmigoProfilingSubmitInfoSEC calloc(MemoryStack stack) {
        return new VkAmigoProfilingSubmitInfoSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAmigoProfilingSubmitInfoSEC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAmigoProfilingSubmitInfoSEC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAmigoProfilingSubmitInfoSEC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAmigoProfilingSubmitInfoSEC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkAmigoProfilingSubmitInfoSEC.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAmigoProfilingSubmitInfoSEC.PNEXT); }
    /** Unsafe version of {@link #firstDrawTimestamp}. */
    public static long nfirstDrawTimestamp(long struct) { return UNSAFE.getLong(null, struct + VkAmigoProfilingSubmitInfoSEC.FIRSTDRAWTIMESTAMP); }
    /** Unsafe version of {@link #swapBufferTimestamp}. */
    public static long nswapBufferTimestamp(long struct) { return UNSAFE.getLong(null, struct + VkAmigoProfilingSubmitInfoSEC.SWAPBUFFERTIMESTAMP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkAmigoProfilingSubmitInfoSEC.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAmigoProfilingSubmitInfoSEC.PNEXT, value); }
    /** Unsafe version of {@link #firstDrawTimestamp(long) firstDrawTimestamp}. */
    public static void nfirstDrawTimestamp(long struct, long value) { UNSAFE.putLong(null, struct + VkAmigoProfilingSubmitInfoSEC.FIRSTDRAWTIMESTAMP, value); }
    /** Unsafe version of {@link #swapBufferTimestamp(long) swapBufferTimestamp}. */
    public static void nswapBufferTimestamp(long struct, long value) { UNSAFE.putLong(null, struct + VkAmigoProfilingSubmitInfoSEC.SWAPBUFFERTIMESTAMP, value); }

    // -----------------------------------

    /** An array of {@link VkAmigoProfilingSubmitInfoSEC} structs. */
    public static class Buffer extends StructBuffer<VkAmigoProfilingSubmitInfoSEC, Buffer> implements NativeResource {

        private static final VkAmigoProfilingSubmitInfoSEC ELEMENT_FACTORY = VkAmigoProfilingSubmitInfoSEC.create(-1L);

        /**
         * Creates a new {@code VkAmigoProfilingSubmitInfoSEC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAmigoProfilingSubmitInfoSEC#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAmigoProfilingSubmitInfoSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAmigoProfilingSubmitInfoSEC.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAmigoProfilingSubmitInfoSEC.npNext(address()); }
        /** @return the value of the {@code firstDrawTimestamp} field. */
        @NativeType("uint64_t")
        public long firstDrawTimestamp() { return VkAmigoProfilingSubmitInfoSEC.nfirstDrawTimestamp(address()); }
        /** @return the value of the {@code swapBufferTimestamp} field. */
        @NativeType("uint64_t")
        public long swapBufferTimestamp() { return VkAmigoProfilingSubmitInfoSEC.nswapBufferTimestamp(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAmigoProfilingSubmitInfoSEC.Buffer sType(@NativeType("VkStructureType") int value) { VkAmigoProfilingSubmitInfoSEC.nsType(address(), value); return this; }
        /** Sets the {@link SECAmigoProfiling#VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC} value to the {@code sType} field. */
        public VkAmigoProfilingSubmitInfoSEC.Buffer sType$Default() { return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAmigoProfilingSubmitInfoSEC.Buffer pNext(@NativeType("void const *") long value) { VkAmigoProfilingSubmitInfoSEC.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code firstDrawTimestamp} field. */
        public VkAmigoProfilingSubmitInfoSEC.Buffer firstDrawTimestamp(@NativeType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.nfirstDrawTimestamp(address(), value); return this; }
        /** Sets the specified value to the {@code swapBufferTimestamp} field. */
        public VkAmigoProfilingSubmitInfoSEC.Buffer swapBufferTimestamp(@NativeType("uint64_t") long value) { VkAmigoProfilingSubmitInfoSEC.nswapBufferTimestamp(address(), value); return this; }

    }

}