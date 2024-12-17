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
 * struct VkSwapchainLatencyCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 latencyModeEnable;
 * }}</pre>
 */
public class VkSwapchainLatencyCreateInfoNV extends Struct<VkSwapchainLatencyCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LATENCYMODEENABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LATENCYMODEENABLE = layout.offsetof(2);
    }

    protected VkSwapchainLatencyCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainLatencyCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainLatencyCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkSwapchainLatencyCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainLatencyCreateInfoNV(ByteBuffer container) {
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
    /** @return the value of the {@code latencyModeEnable} field. */
    @NativeType("VkBool32")
    public boolean latencyModeEnable() { return nlatencyModeEnable(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainLatencyCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkSwapchainLatencyCreateInfoNV sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainLatencyCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code latencyModeEnable} field. */
    public VkSwapchainLatencyCreateInfoNV latencyModeEnable(@NativeType("VkBool32") boolean value) { nlatencyModeEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainLatencyCreateInfoNV set(
        int sType,
        long pNext,
        boolean latencyModeEnable
    ) {
        sType(sType);
        pNext(pNext);
        latencyModeEnable(latencyModeEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainLatencyCreateInfoNV set(VkSwapchainLatencyCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainLatencyCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainLatencyCreateInfoNV malloc() {
        return new VkSwapchainLatencyCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainLatencyCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainLatencyCreateInfoNV calloc() {
        return new VkSwapchainLatencyCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainLatencyCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainLatencyCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainLatencyCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainLatencyCreateInfoNV} instance for the specified memory address. */
    public static VkSwapchainLatencyCreateInfoNV create(long address) {
        return new VkSwapchainLatencyCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainLatencyCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkSwapchainLatencyCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainLatencyCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainLatencyCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainLatencyCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainLatencyCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainLatencyCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainLatencyCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainLatencyCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainLatencyCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainLatencyCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainLatencyCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainLatencyCreateInfoNV malloc(MemoryStack stack) {
        return new VkSwapchainLatencyCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainLatencyCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainLatencyCreateInfoNV calloc(MemoryStack stack) {
        return new VkSwapchainLatencyCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainLatencyCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainLatencyCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainLatencyCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainLatencyCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainLatencyCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainLatencyCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #latencyModeEnable}. */
    public static int nlatencyModeEnable(long struct) { return memGetInt(struct + VkSwapchainLatencyCreateInfoNV.LATENCYMODEENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainLatencyCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainLatencyCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #latencyModeEnable(boolean) latencyModeEnable}. */
    public static void nlatencyModeEnable(long struct, int value) { memPutInt(struct + VkSwapchainLatencyCreateInfoNV.LATENCYMODEENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainLatencyCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainLatencyCreateInfoNV, Buffer> implements NativeResource {

        private static final VkSwapchainLatencyCreateInfoNV ELEMENT_FACTORY = VkSwapchainLatencyCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkSwapchainLatencyCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainLatencyCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainLatencyCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainLatencyCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainLatencyCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code latencyModeEnable} field. */
        @NativeType("VkBool32")
        public boolean latencyModeEnable() { return VkSwapchainLatencyCreateInfoNV.nlatencyModeEnable(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainLatencyCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainLatencyCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVLowLatency2#VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkSwapchainLatencyCreateInfoNV.Buffer sType$Default() { return sType(NVLowLatency2.VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainLatencyCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainLatencyCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code latencyModeEnable} field. */
        public VkSwapchainLatencyCreateInfoNV.Buffer latencyModeEnable(@NativeType("VkBool32") boolean value) { VkSwapchainLatencyCreateInfoNV.nlatencyModeEnable(address(), value ? 1 : 0); return this; }

    }

}