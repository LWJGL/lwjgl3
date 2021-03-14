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
 * Structure describing support for zero initialization of workgroup memory by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceFeatures2}, it is filled with a value indicating whether the feature is supported. {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} <b>can</b> also be included in the {@code pNext} chain of {@link VkDeviceCreateInfo} to enable the features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRZeroInitializeWorkgroupMemory#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES_KHR}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code shaderZeroInitializeWorkgroupMemory} &ndash; specifies whether the implementation supports initializing a variable in Workgroup storage class.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderZeroInitializeWorkgroupMemory;
 * }</code></pre>
 */
public class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERZEROINITIALIZEWORKGROUPMEMORY;

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
        SHADERZEROINITIALIZEWORKGROUPMEMORY = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR(ByteBuffer container) {
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
    /** Returns the value of the {@code shaderZeroInitializeWorkgroupMemory} field. */
    @NativeType("VkBool32")
    public boolean shaderZeroInitializeWorkgroupMemory() { return nshaderZeroInitializeWorkgroupMemory(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderZeroInitializeWorkgroupMemory} field. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR set(
        int sType,
        long pNext,
        boolean shaderZeroInitializeWorkgroupMemory
    ) {
        sType(sType);
        pNext(pNext);
        shaderZeroInitializeWorkgroupMemory(shaderZeroInitializeWorkgroupMemory);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR set(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR malloc() {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR calloc() {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR create(long address) {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory}. */
    public static int nshaderZeroInitializeWorkgroupMemory(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.SHADERZEROINITIALIZEWORKGROUPMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory(boolean) shaderZeroInitializeWorkgroupMemory}. */
    public static void nshaderZeroInitializeWorkgroupMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.SHADERZEROINITIALIZEWORKGROUPMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.npNext(address()); }
        /** Returns the value of the {@code shaderZeroInitializeWorkgroupMemory} field. */
        @NativeType("VkBool32")
        public boolean shaderZeroInitializeWorkgroupMemory() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nshaderZeroInitializeWorkgroupMemory(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderZeroInitializeWorkgroupMemory} field. */
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }

    }

}