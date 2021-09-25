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
 * The earliest time each image should be presented.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code swapchainCount} <b>must</b> be the same value as {@link VkPresentInfoKHR}{@code ::swapchainCount}, where {@link VkPresentInfoKHR} is included in the {@code pNext} chain of this {@link VkPresentTimesInfoGOOGLE} structure</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link GOOGLEDisplayTiming#VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE}</li>
 * <li>If {@code pTimes} is not {@code NULL}, {@code pTimes} <b>must</b> be a valid pointer to an array of {@code swapchainCount} {@link VkPresentTimeGOOGLE} structures</li>
 * <li>{@code swapchainCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPresentTimeGOOGLE}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPresentTimesInfoGOOGLE {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #swapchainCount};
 *     {@link VkPresentTimeGOOGLE VkPresentTimeGOOGLE} const * {@link #pTimes};
 * }</code></pre>
 */
public class VkPresentTimesInfoGOOGLE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SWAPCHAINCOUNT,
        PTIMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SWAPCHAINCOUNT = layout.offsetof(2);
        PTIMES = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPresentTimesInfoGOOGLE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPresentTimesInfoGOOGLE(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of swapchains being presented to by this command. */
    @NativeType("uint32_t")
    public int swapchainCount() { return nswapchainCount(address()); }
    /** {@code NULL} or a pointer to an array of {@link VkPresentTimeGOOGLE} elements with {@code swapchainCount} entries. If not {@code NULL}, each element of {@code pTimes} contains the earliest time to present the image corresponding to the entry in the {@link VkPresentInfoKHR}{@code ::pImageIndices} array. */
    @Nullable
    @NativeType("VkPresentTimeGOOGLE const *")
    public VkPresentTimeGOOGLE.Buffer pTimes() { return npTimes(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPresentTimesInfoGOOGLE sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link GOOGLEDisplayTiming#VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE} value to the {@link #sType} field. */
    public VkPresentTimesInfoGOOGLE sType$Default() { return sType(GOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPresentTimesInfoGOOGLE pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #swapchainCount} field. */
    public VkPresentTimesInfoGOOGLE swapchainCount(@NativeType("uint32_t") int value) { nswapchainCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPresentTimeGOOGLE.Buffer} to the {@link #pTimes} field. */
    public VkPresentTimesInfoGOOGLE pTimes(@Nullable @NativeType("VkPresentTimeGOOGLE const *") VkPresentTimeGOOGLE.Buffer value) { npTimes(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPresentTimesInfoGOOGLE set(
        int sType,
        long pNext,
        int swapchainCount,
        @Nullable VkPresentTimeGOOGLE.Buffer pTimes
    ) {
        sType(sType);
        pNext(pNext);
        swapchainCount(swapchainCount);
        pTimes(pTimes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPresentTimesInfoGOOGLE set(VkPresentTimesInfoGOOGLE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPresentTimesInfoGOOGLE malloc() {
        return wrap(VkPresentTimesInfoGOOGLE.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPresentTimesInfoGOOGLE calloc() {
        return wrap(VkPresentTimesInfoGOOGLE.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated with {@link BufferUtils}. */
    public static VkPresentTimesInfoGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPresentTimesInfoGOOGLE.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPresentTimesInfoGOOGLE} instance for the specified memory address. */
    public static VkPresentTimesInfoGOOGLE create(long address) {
        return wrap(VkPresentTimesInfoGOOGLE.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentTimesInfoGOOGLE createSafe(long address) {
        return address == NULL ? null : wrap(VkPresentTimesInfoGOOGLE.class, address);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPresentTimesInfoGOOGLE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPresentTimesInfoGOOGLE.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPresentTimesInfoGOOGLE.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimesInfoGOOGLE malloc(MemoryStack stack) {
        return wrap(VkPresentTimesInfoGOOGLE.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPresentTimesInfoGOOGLE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPresentTimesInfoGOOGLE calloc(MemoryStack stack) {
        return wrap(VkPresentTimesInfoGOOGLE.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPresentTimesInfoGOOGLE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPresentTimesInfoGOOGLE.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPresentTimesInfoGOOGLE.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPresentTimesInfoGOOGLE.PNEXT); }
    /** Unsafe version of {@link #swapchainCount}. */
    public static int nswapchainCount(long struct) { return UNSAFE.getInt(null, struct + VkPresentTimesInfoGOOGLE.SWAPCHAINCOUNT); }
    /** Unsafe version of {@link #pTimes}. */
    @Nullable public static VkPresentTimeGOOGLE.Buffer npTimes(long struct) { return VkPresentTimeGOOGLE.createSafe(memGetAddress(struct + VkPresentTimesInfoGOOGLE.PTIMES), nswapchainCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentTimesInfoGOOGLE.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPresentTimesInfoGOOGLE.PNEXT, value); }
    /** Sets the specified value to the {@code swapchainCount} field of the specified {@code struct}. */
    public static void nswapchainCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPresentTimesInfoGOOGLE.SWAPCHAINCOUNT, value); }
    /** Unsafe version of {@link #pTimes(VkPresentTimeGOOGLE.Buffer) pTimes}. */
    public static void npTimes(long struct, @Nullable VkPresentTimeGOOGLE.Buffer value) { memPutAddress(struct + VkPresentTimesInfoGOOGLE.PTIMES, memAddressSafe(value)); if (value != null) { nswapchainCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPresentTimesInfoGOOGLE} structs. */
    public static class Buffer extends StructBuffer<VkPresentTimesInfoGOOGLE, Buffer> implements NativeResource {

        private static final VkPresentTimesInfoGOOGLE ELEMENT_FACTORY = VkPresentTimesInfoGOOGLE.create(-1L);

        /**
         * Creates a new {@code VkPresentTimesInfoGOOGLE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPresentTimesInfoGOOGLE#SIZEOF}, and its mark will be undefined.
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
        protected VkPresentTimesInfoGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPresentTimesInfoGOOGLE#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPresentTimesInfoGOOGLE.nsType(address()); }
        /** @return the value of the {@link VkPresentTimesInfoGOOGLE#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPresentTimesInfoGOOGLE.npNext(address()); }
        /** @return the value of the {@link VkPresentTimesInfoGOOGLE#swapchainCount} field. */
        @NativeType("uint32_t")
        public int swapchainCount() { return VkPresentTimesInfoGOOGLE.nswapchainCount(address()); }
        /** @return a {@link VkPresentTimeGOOGLE.Buffer} view of the struct array pointed to by the {@link VkPresentTimesInfoGOOGLE#pTimes} field. */
        @Nullable
        @NativeType("VkPresentTimeGOOGLE const *")
        public VkPresentTimeGOOGLE.Buffer pTimes() { return VkPresentTimesInfoGOOGLE.npTimes(address()); }

        /** Sets the specified value to the {@link VkPresentTimesInfoGOOGLE#sType} field. */
        public VkPresentTimesInfoGOOGLE.Buffer sType(@NativeType("VkStructureType") int value) { VkPresentTimesInfoGOOGLE.nsType(address(), value); return this; }
        /** Sets the {@link GOOGLEDisplayTiming#VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE} value to the {@link VkPresentTimesInfoGOOGLE#sType} field. */
        public VkPresentTimesInfoGOOGLE.Buffer sType$Default() { return sType(GOOGLEDisplayTiming.VK_STRUCTURE_TYPE_PRESENT_TIMES_INFO_GOOGLE); }
        /** Sets the specified value to the {@link VkPresentTimesInfoGOOGLE#pNext} field. */
        public VkPresentTimesInfoGOOGLE.Buffer pNext(@NativeType("void const *") long value) { VkPresentTimesInfoGOOGLE.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPresentTimesInfoGOOGLE#swapchainCount} field. */
        public VkPresentTimesInfoGOOGLE.Buffer swapchainCount(@NativeType("uint32_t") int value) { VkPresentTimesInfoGOOGLE.nswapchainCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPresentTimeGOOGLE.Buffer} to the {@link VkPresentTimesInfoGOOGLE#pTimes} field. */
        public VkPresentTimesInfoGOOGLE.Buffer pTimes(@Nullable @NativeType("VkPresentTimeGOOGLE const *") VkPresentTimeGOOGLE.Buffer value) { VkPresentTimesInfoGOOGLE.npTimes(address(), value); return this; }

    }

}