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
 * Structure describing dedicated allocation image aliasing features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with values indicating whether each feature is supported. {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVDedicatedAllocationImageAliasing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code dedicatedAllocationImageAliasing} &ndash; indicates that the implementation supports aliasing of compatible image objects on a dedicated allocation.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 dedicatedAllocationImageAliasing;
 * }</code></pre>
 */
public class VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEDICATEDALLOCATIONIMAGEALIASING;

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
        DEDICATEDALLOCATIONIMAGEALIASING = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code dedicatedAllocationImageAliasing} field. */
    @NativeType("VkBool32")
    public boolean dedicatedAllocationImageAliasing() { return ndedicatedAllocationImageAliasing(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dedicatedAllocationImageAliasing} field. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV dedicatedAllocationImageAliasing(@NativeType("VkBool32") boolean value) { ndedicatedAllocationImageAliasing(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV set(
        int sType,
        long pNext,
        boolean dedicatedAllocationImageAliasing
    ) {
        sType(sType);
        pNext(pNext);
        dedicatedAllocationImageAliasing(dedicatedAllocationImageAliasing);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV set(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV malloc() {
        return wrap(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV calloc() {
        return wrap(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create(long address) {
        return wrap(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #dedicatedAllocationImageAliasing}. */
    public static int ndedicatedAllocationImageAliasing(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.DEDICATEDALLOCATIONIMAGEALIASING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #dedicatedAllocationImageAliasing(boolean) dedicatedAllocationImageAliasing}. */
    public static void ndedicatedAllocationImageAliasing(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.DEDICATEDALLOCATIONIMAGEALIASING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.npNext(address()); }
        /** Returns the value of the {@code dedicatedAllocationImageAliasing} field. */
        @NativeType("VkBool32")
        public boolean dedicatedAllocationImageAliasing() { return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.ndedicatedAllocationImageAliasing(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dedicatedAllocationImageAliasing} field. */
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.Buffer dedicatedAllocationImageAliasing(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.ndedicatedAllocationImageAliasing(address(), value ? 1 : 0); return this; }

    }

}