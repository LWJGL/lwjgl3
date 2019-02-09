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
 * Specify the surface counters desired.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bits in {@code surfaceCounters} <b>must</b> be supported by {@link VkSwapchainCreateInfoKHR}{@code ::surface}, as reported by {@link EXTDisplaySurfaceCounter#vkGetPhysicalDeviceSurfaceCapabilities2EXT GetPhysicalDeviceSurfaceCapabilities2EXT}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDisplayControl#VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT}</li>
 * <li>{@code surfaceCounters} <b>must</b> be a valid combination of {@code VkSurfaceCounterFlagBitsEXT} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code surfaceCounters} &ndash; a bitmask of {@code VkSurfaceCounterFlagBitsEXT} specifying surface counters to enable for the swapchain.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSwapchainCounterCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkSurfaceCounterFlagsEXT surfaceCounters;
 * }</code></pre>
 */
public class VkSwapchainCounterCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SURFACECOUNTERS;

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
        SURFACECOUNTERS = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSwapchainCounterCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainCounterCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code surfaceCounters} field. */
    @NativeType("VkSurfaceCounterFlagsEXT")
    public int surfaceCounters() { return nsurfaceCounters(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainCounterCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainCounterCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code surfaceCounters} field. */
    public VkSwapchainCounterCreateInfoEXT surfaceCounters(@NativeType("VkSurfaceCounterFlagsEXT") int value) { nsurfaceCounters(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainCounterCreateInfoEXT set(
        int sType,
        long pNext,
        int surfaceCounters
    ) {
        sType(sType);
        pNext(pNext);
        surfaceCounters(surfaceCounters);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainCounterCreateInfoEXT set(VkSwapchainCounterCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainCounterCreateInfoEXT malloc() {
        return wrap(VkSwapchainCounterCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainCounterCreateInfoEXT calloc() {
        return wrap(VkSwapchainCounterCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainCounterCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSwapchainCounterCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance for the specified memory address. */
    public static VkSwapchainCounterCreateInfoEXT create(long address) {
        return wrap(VkSwapchainCounterCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainCounterCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkSwapchainCounterCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSwapchainCounterCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSwapchainCounterCreateInfoEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSwapchainCounterCreateInfoEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCounterCreateInfoEXT mallocStack(MemoryStack stack) {
        return wrap(VkSwapchainCounterCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSwapchainCounterCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCounterCreateInfoEXT callocStack(MemoryStack stack) {
        return wrap(VkSwapchainCounterCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCounterCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSwapchainCounterCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCounterCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainCounterCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #surfaceCounters}. */
    public static int nsurfaceCounters(long struct) { return UNSAFE.getInt(null, struct + VkSwapchainCounterCreateInfoEXT.SURFACECOUNTERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCounterCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainCounterCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #surfaceCounters(int) surfaceCounters}. */
    public static void nsurfaceCounters(long struct, int value) { UNSAFE.putInt(null, struct + VkSwapchainCounterCreateInfoEXT.SURFACECOUNTERS, value); }

    // -----------------------------------

    /** An array of {@link VkSwapchainCounterCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainCounterCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkSwapchainCounterCreateInfoEXT ELEMENT_FACTORY = VkSwapchainCounterCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkSwapchainCounterCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainCounterCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkSwapchainCounterCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSwapchainCounterCreateInfoEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSwapchainCounterCreateInfoEXT.npNext(address()); }
        /** Returns the value of the {@code surfaceCounters} field. */
        @NativeType("VkSurfaceCounterFlagsEXT")
        public int surfaceCounters() { return VkSwapchainCounterCreateInfoEXT.nsurfaceCounters(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainCounterCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkSwapchainCounterCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainCounterCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkSwapchainCounterCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code surfaceCounters} field. */
        public VkSwapchainCounterCreateInfoEXT.Buffer surfaceCounters(@NativeType("VkSurfaceCounterFlagsEXT") int value) { VkSwapchainCounterCreateInfoEXT.nsurfaceCounters(address(), value); return this; }

    }

}