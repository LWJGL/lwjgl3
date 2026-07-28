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
 * struct VkSwapchainPresentScalingCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPresentScalingFlagsKHR scalingBehavior;
 *     VkPresentGravityFlagsKHR presentGravityX;
 *     VkPresentGravityFlagsKHR presentGravityY;
 * }}</pre>
 */
public class VkSwapchainPresentScalingCreateInfoKHR extends Struct<VkSwapchainPresentScalingCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SCALINGBEHAVIOR,
        PRESENTGRAVITYX,
        PRESENTGRAVITYY;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SCALINGBEHAVIOR = layout.offsetof(2);
        PRESENTGRAVITYX = layout.offsetof(3);
        PRESENTGRAVITYY = layout.offsetof(4);
    }

    protected VkSwapchainPresentScalingCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSwapchainPresentScalingCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkSwapchainPresentScalingCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkSwapchainPresentScalingCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainPresentScalingCreateInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code scalingBehavior} field. */
    @NativeType("VkPresentScalingFlagsKHR")
    public int scalingBehavior() { return nscalingBehavior(address()); }
    /** @return the value of the {@code presentGravityX} field. */
    @NativeType("VkPresentGravityFlagsKHR")
    public int presentGravityX() { return npresentGravityX(address()); }
    /** @return the value of the {@code presentGravityY} field. */
    @NativeType("VkPresentGravityFlagsKHR")
    public int presentGravityY() { return npresentGravityY(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainPresentScalingCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkSwapchainPresentScalingCreateInfoKHR sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainPresentScalingCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code scalingBehavior} field. */
    public VkSwapchainPresentScalingCreateInfoKHR scalingBehavior(@NativeType("VkPresentScalingFlagsKHR") int value) { nscalingBehavior(address(), value); return this; }
    /** Sets the specified value to the {@code presentGravityX} field. */
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) { npresentGravityX(address(), value); return this; }
    /** Sets the specified value to the {@code presentGravityY} field. */
    public VkSwapchainPresentScalingCreateInfoKHR presentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) { npresentGravityY(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainPresentScalingCreateInfoKHR set(
        int sType,
        long pNext,
        int scalingBehavior,
        int presentGravityX,
        int presentGravityY
    ) {
        sType(sType);
        pNext(pNext);
        scalingBehavior(scalingBehavior);
        presentGravityX(presentGravityX);
        presentGravityY(presentGravityY);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainPresentScalingCreateInfoKHR set(VkSwapchainPresentScalingCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentScalingCreateInfoKHR malloc() {
        return new VkSwapchainPresentScalingCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainPresentScalingCreateInfoKHR calloc() {
        return new VkSwapchainPresentScalingCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainPresentScalingCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainPresentScalingCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainPresentScalingCreateInfoKHR} instance for the specified memory address. */
    public static VkSwapchainPresentScalingCreateInfoKHR create(long address) {
        return new VkSwapchainPresentScalingCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSwapchainPresentScalingCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkSwapchainPresentScalingCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSwapchainPresentScalingCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSwapchainPresentScalingCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSwapchainPresentScalingCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentScalingCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSwapchainPresentScalingCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainPresentScalingCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSwapchainPresentScalingCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainPresentScalingCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainPresentScalingCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainPresentScalingCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainPresentScalingCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #scalingBehavior}. */
    public static int nscalingBehavior(long struct) { return memGetInt(struct + VkSwapchainPresentScalingCreateInfoKHR.SCALINGBEHAVIOR); }
    /** Unsafe version of {@link #presentGravityX}. */
    public static int npresentGravityX(long struct) { return memGetInt(struct + VkSwapchainPresentScalingCreateInfoKHR.PRESENTGRAVITYX); }
    /** Unsafe version of {@link #presentGravityY}. */
    public static int npresentGravityY(long struct) { return memGetInt(struct + VkSwapchainPresentScalingCreateInfoKHR.PRESENTGRAVITYY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainPresentScalingCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainPresentScalingCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #scalingBehavior(int) scalingBehavior}. */
    public static void nscalingBehavior(long struct, int value) { memPutInt(struct + VkSwapchainPresentScalingCreateInfoKHR.SCALINGBEHAVIOR, value); }
    /** Unsafe version of {@link #presentGravityX(int) presentGravityX}. */
    public static void npresentGravityX(long struct, int value) { memPutInt(struct + VkSwapchainPresentScalingCreateInfoKHR.PRESENTGRAVITYX, value); }
    /** Unsafe version of {@link #presentGravityY(int) presentGravityY}. */
    public static void npresentGravityY(long struct, int value) { memPutInt(struct + VkSwapchainPresentScalingCreateInfoKHR.PRESENTGRAVITYY, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainPresentScalingCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainPresentScalingCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkSwapchainPresentScalingCreateInfoKHR ELEMENT_FACTORY = VkSwapchainPresentScalingCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkSwapchainPresentScalingCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainPresentScalingCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSwapchainPresentScalingCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainPresentScalingCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainPresentScalingCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code scalingBehavior} field. */
        @NativeType("VkPresentScalingFlagsKHR")
        public int scalingBehavior() { return VkSwapchainPresentScalingCreateInfoKHR.nscalingBehavior(address()); }
        /** @return the value of the {@code presentGravityX} field. */
        @NativeType("VkPresentGravityFlagsKHR")
        public int presentGravityX() { return VkSwapchainPresentScalingCreateInfoKHR.npresentGravityX(address()); }
        /** @return the value of the {@code presentGravityY} field. */
        @NativeType("VkPresentGravityFlagsKHR")
        public int presentGravityY() { return VkSwapchainPresentScalingCreateInfoKHR.npresentGravityY(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainPresentScalingCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainPresentScalingCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRSwapchainMaintenance1#VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkSwapchainPresentScalingCreateInfoKHR.Buffer sType$Default() { return sType(KHRSwapchainMaintenance1.VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainPresentScalingCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainPresentScalingCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code scalingBehavior} field. */
        public VkSwapchainPresentScalingCreateInfoKHR.Buffer scalingBehavior(@NativeType("VkPresentScalingFlagsKHR") int value) { VkSwapchainPresentScalingCreateInfoKHR.nscalingBehavior(address(), value); return this; }
        /** Sets the specified value to the {@code presentGravityX} field. */
        public VkSwapchainPresentScalingCreateInfoKHR.Buffer presentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) { VkSwapchainPresentScalingCreateInfoKHR.npresentGravityX(address(), value); return this; }
        /** Sets the specified value to the {@code presentGravityY} field. */
        public VkSwapchainPresentScalingCreateInfoKHR.Buffer presentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) { VkSwapchainPresentScalingCreateInfoKHR.npresentGravityY(address(), value); return this; }

    }

}