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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure used for NVIDIA Reflex Support.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVLowLatency#VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV}</li>
 * <li>{@code pQueriedLowLatencyData} <b>must</b> be a pointer value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueryLowLatencySupportNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     void * {@link #pQueriedLowLatencyData};
 * }</code></pre>
 */
public class VkQueryLowLatencySupportNV extends Struct<VkQueryLowLatencySupportNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PQUERIEDLOWLATENCYDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PQUERIEDLOWLATENCYDATA = layout.offsetof(2);
    }

    protected VkQueryLowLatencySupportNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueryLowLatencySupportNV create(long address, @Nullable ByteBuffer container) {
        return new VkQueryLowLatencySupportNV(address, container);
    }

    /**
     * Creates a {@code VkQueryLowLatencySupportNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueryLowLatencySupportNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** used for NVIDIA Reflex Support. */
    @NativeType("void *")
    public long pQueriedLowLatencyData() { return npQueriedLowLatencyData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueryLowLatencySupportNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency#VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV} value to the {@link #sType} field. */
    public VkQueryLowLatencySupportNV sType$Default() { return sType(NVLowLatency.VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueryLowLatencySupportNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #pQueriedLowLatencyData} field. */
    public VkQueryLowLatencySupportNV pQueriedLowLatencyData(@NativeType("void *") long value) { npQueriedLowLatencyData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueryLowLatencySupportNV set(
        int sType,
        long pNext,
        long pQueriedLowLatencyData
    ) {
        sType(sType);
        pNext(pNext);
        pQueriedLowLatencyData(pQueriedLowLatencyData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueryLowLatencySupportNV set(VkQueryLowLatencySupportNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryLowLatencySupportNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueryLowLatencySupportNV malloc() {
        return new VkQueryLowLatencySupportNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueryLowLatencySupportNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueryLowLatencySupportNV calloc() {
        return new VkQueryLowLatencySupportNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueryLowLatencySupportNV} instance allocated with {@link BufferUtils}. */
    public static VkQueryLowLatencySupportNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryLowLatencySupportNV(memAddress(container), container);
    }

    /** Returns a new {@code VkQueryLowLatencySupportNV} instance for the specified memory address. */
    public static VkQueryLowLatencySupportNV create(long address) {
        return new VkQueryLowLatencySupportNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryLowLatencySupportNV createSafe(long address) {
        return address == NULL ? null : new VkQueryLowLatencySupportNV(address, null);
    }

    /**
     * Returns a new {@link VkQueryLowLatencySupportNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryLowLatencySupportNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueryLowLatencySupportNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryLowLatencySupportNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryLowLatencySupportNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryLowLatencySupportNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueryLowLatencySupportNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueryLowLatencySupportNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryLowLatencySupportNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueryLowLatencySupportNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryLowLatencySupportNV malloc(MemoryStack stack) {
        return new VkQueryLowLatencySupportNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueryLowLatencySupportNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryLowLatencySupportNV calloc(MemoryStack stack) {
        return new VkQueryLowLatencySupportNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueryLowLatencySupportNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryLowLatencySupportNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryLowLatencySupportNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryLowLatencySupportNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueryLowLatencySupportNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueryLowLatencySupportNV.PNEXT); }
    /** Unsafe version of {@link #pQueriedLowLatencyData}. */
    public static long npQueriedLowLatencyData(long struct) { return memGetAddress(struct + VkQueryLowLatencySupportNV.PQUERIEDLOWLATENCYDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryLowLatencySupportNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueryLowLatencySupportNV.PNEXT, value); }
    /** Unsafe version of {@link #pQueriedLowLatencyData(long) pQueriedLowLatencyData}. */
    public static void npQueriedLowLatencyData(long struct, long value) { memPutAddress(struct + VkQueryLowLatencySupportNV.PQUERIEDLOWLATENCYDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkQueryLowLatencySupportNV.PQUERIEDLOWLATENCYDATA));
    }

    // -----------------------------------

    /** An array of {@link VkQueryLowLatencySupportNV} structs. */
    public static class Buffer extends StructBuffer<VkQueryLowLatencySupportNV, Buffer> implements NativeResource {

        private static final VkQueryLowLatencySupportNV ELEMENT_FACTORY = VkQueryLowLatencySupportNV.create(-1L);

        /**
         * Creates a new {@code VkQueryLowLatencySupportNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueryLowLatencySupportNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueryLowLatencySupportNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueryLowLatencySupportNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueryLowLatencySupportNV.nsType(address()); }
        /** @return the value of the {@link VkQueryLowLatencySupportNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkQueryLowLatencySupportNV.npNext(address()); }
        /** @return the value of the {@link VkQueryLowLatencySupportNV#pQueriedLowLatencyData} field. */
        @NativeType("void *")
        public long pQueriedLowLatencyData() { return VkQueryLowLatencySupportNV.npQueriedLowLatencyData(address()); }

        /** Sets the specified value to the {@link VkQueryLowLatencySupportNV#sType} field. */
        public VkQueryLowLatencySupportNV.Buffer sType(@NativeType("VkStructureType") int value) { VkQueryLowLatencySupportNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency#VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV} value to the {@link VkQueryLowLatencySupportNV#sType} field. */
        public VkQueryLowLatencySupportNV.Buffer sType$Default() { return sType(NVLowLatency.VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV); }
        /** Sets the specified value to the {@link VkQueryLowLatencySupportNV#pNext} field. */
        public VkQueryLowLatencySupportNV.Buffer pNext(@NativeType("void const *") long value) { VkQueryLowLatencySupportNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueryLowLatencySupportNV#pQueriedLowLatencyData} field. */
        public VkQueryLowLatencySupportNV.Buffer pQueriedLowLatencyData(@NativeType("void *") long value) { VkQueryLowLatencySupportNV.npQueriedLowLatencyData(address(), value); return this; }

    }

}