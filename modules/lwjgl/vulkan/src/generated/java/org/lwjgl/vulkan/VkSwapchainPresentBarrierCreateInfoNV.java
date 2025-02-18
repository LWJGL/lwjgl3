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
 * struct VkSwapchainPresentBarrierCreateInfoNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 presentBarrierEnable;
 * }}</pre>
 */
public class VkSwapchainPresentBarrierCreateInfoNV extends Struct<VkSwapchainPresentBarrierCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRESENTBARRIERENABLE;

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
        PRESENTBARRIERENABLE = layout.offsetof(2);
    }

    protected VkSwapchainPresentBarrierCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentBarrierCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentBarrierCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentBarrierCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentBarrierCreateInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code presentBarrierEnable} field. */
    @NativeType("VkBool32")
    public boolean presentBarrierEnable() { return npresentBarrierEnable(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainPresentBarrierCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVPresentBarrier#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkSwapchainPresentBarrierCreateInfoNV sType$Default() { return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainPresentBarrierCreateInfoNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code presentBarrierEnable} field. */
    public VkSwapchainPresentBarrierCreateInfoNV presentBarrierEnable(@NativeType("VkBool32") boolean value) { npresentBarrierEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentBarrierCreateInfoNV set(
        int sType,
        long pNext,
        boolean presentBarrierEnable
    ) {
        sType(sType);
        pNext(pNext);
        presentBarrierEnable(presentBarrierEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentBarrierCreateInfoNV set(VkSwapchainPresentBarrierCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentBarrierCreateInfoNV malloc() {
        return new VkSwapchainPresentBarrierCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentBarrierCreateInfoNV calloc() {
        return new VkSwapchainPresentBarrierCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentBarrierCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentBarrierCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance for the specified memory address. */
    public static VkSwapchainPresentBarrierCreateInfoNV create(long address) {
        return new VkSwapchainPresentBarrierCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainPresentBarrierCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentBarrierCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainPresentBarrierCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentBarrierCreateInfoNV malloc(MemoryStack stack) {
        return new VkSwapchainPresentBarrierCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentBarrierCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentBarrierCreateInfoNV calloc(MemoryStack stack) {
        return new VkSwapchainPresentBarrierCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentBarrierCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainPresentBarrierCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentBarrierCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #presentBarrierEnable}. */
    public static int npresentBarrierEnable(long struct) { return memGetInt(struct + VkSwapchainPresentBarrierCreateInfoNV.PRESENTBARRIERENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainPresentBarrierCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentBarrierCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #presentBarrierEnable(boolean) presentBarrierEnable}. */
    public static void npresentBarrierEnable(long struct, int value) { memPutInt(struct + VkSwapchainPresentBarrierCreateInfoNV.PRESENTBARRIERENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentBarrierCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentBarrierCreateInfoNV, Buffer> implements NativeResource {

        private static final VkSwapchainPresentBarrierCreateInfoNV ELEMENT_FACTORY = VkSwapchainPresentBarrierCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentBarrierCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentBarrierCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentBarrierCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentBarrierCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSwapchainPresentBarrierCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code presentBarrierEnable} field. */
        @NativeType("VkBool32")
        public boolean presentBarrierEnable() { return VkSwapchainPresentBarrierCreateInfoNV.npresentBarrierEnable(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentBarrierCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVPresentBarrier#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer sType$Default() { return sType(NVPresentBarrier.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_BARRIER_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer pNext(@NativeType("void *") long value) { VkSwapchainPresentBarrierCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code presentBarrierEnable} field. */
        public VkSwapchainPresentBarrierCreateInfoNV.Buffer presentBarrierEnable(@NativeType("VkBool32") boolean value) { VkSwapchainPresentBarrierCreateInfoNV.npresentBarrierEnable(address(), value ? 1 : 0); return this; }

    }

}