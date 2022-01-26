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
 * <p>If the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderZeroInitializeWorkgroupMemory};
 * }</code></pre>
 */
public class VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** specifies whether the implementation supports initializing a variable in Workgroup storage class. */
    @NativeType("VkBool32")
    public boolean shaderZeroInitializeWorkgroupMemory() { return nshaderZeroInitializeWorkgroupMemory(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderZeroInitializeWorkgroupMemory} field. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures set(
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
    public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures set(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures malloc() {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures calloc() {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures create(long address) {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.PNEXT); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory}. */
    public static int nshaderZeroInitializeWorkgroupMemory(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.SHADERZEROINITIALIZEWORKGROUPMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.PNEXT, value); }
    /** Unsafe version of {@link #shaderZeroInitializeWorkgroupMemory(boolean) shaderZeroInitializeWorkgroupMemory}. */
    public static void nshaderZeroInitializeWorkgroupMemory(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.SHADERZEROINITIALIZEWORKGROUPMEMORY, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures ELEMENT_FACTORY = VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#shaderZeroInitializeWorkgroupMemory} field. */
        @NativeType("VkBool32")
        public boolean shaderZeroInitializeWorkgroupMemory() { return VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nshaderZeroInitializeWorkgroupMemory(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#sType} field. */
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES} value to the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#sType} field. */
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ZERO_INITIALIZE_WORKGROUP_MEMORY_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#pNext} field. */
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures#shaderZeroInitializeWorkgroupMemory} field. */
        public VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.Buffer shaderZeroInitializeWorkgroupMemory(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures.nshaderZeroInitializeWorkgroupMemory(address(), value ? 1 : 0); return this; }

    }

}