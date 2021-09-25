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
 * Structure describing descriptor set properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceMaintenance3Properties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMaintenance3Properties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #maxPerSetDescriptors};
 *     VkDeviceSize {@link #maxMemoryAllocationSize};
 * }</code></pre>
 */
public class VkPhysicalDeviceMaintenance3Properties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXPERSETDESCRIPTORS,
        MAXMEMORYALLOCATIONSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXPERSETDESCRIPTORS = layout.offsetof(2);
        MAXMEMORYALLOCATIONSIZE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance3Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance3Properties(ByteBuffer container) {
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
    /** a maximum number of descriptors (summed over all descriptor types) in a single descriptor set that is guaranteed to satisfy any implementation-dependent constraints on the size of a descriptor set itself. Applications <b>can</b> query whether a descriptor set that goes beyond this limit is supported using {@link VK11#vkGetDescriptorSetLayoutSupport GetDescriptorSetLayoutSupport}. */
    @NativeType("uint32_t")
    public int maxPerSetDescriptors() { return nmaxPerSetDescriptors(address()); }
    /** the maximum size of a memory allocation that <b>can</b> be created, even if there is more space available in the heap. */
    @NativeType("VkDeviceSize")
    public long maxMemoryAllocationSize() { return nmaxMemoryAllocationSize(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance3Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceMaintenance3Properties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMaintenance3Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance3Properties set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMaintenance3Properties set(VkPhysicalDeviceMaintenance3Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance3Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance3Properties malloc() {
        return wrap(VkPhysicalDeviceMaintenance3Properties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance3Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance3Properties calloc() {
        return wrap(VkPhysicalDeviceMaintenance3Properties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance3Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance3Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMaintenance3Properties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance3Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance3Properties create(long address) {
        return wrap(VkPhysicalDeviceMaintenance3Properties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance3Properties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMaintenance3Properties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance3Properties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance3Properties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance3Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance3Properties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMaintenance3Properties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMaintenance3Properties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance3Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance3Properties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMaintenance3Properties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance3Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance3Properties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMaintenance3Properties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance3Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance3Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance3Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance3Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance3Properties.PNEXT); }
    /** Unsafe version of {@link #maxPerSetDescriptors}. */
    public static int nmaxPerSetDescriptors(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMaintenance3Properties.MAXPERSETDESCRIPTORS); }
    /** Unsafe version of {@link #maxMemoryAllocationSize}. */
    public static long nmaxMemoryAllocationSize(long struct) { return UNSAFE.getLong(null, struct + VkPhysicalDeviceMaintenance3Properties.MAXMEMORYALLOCATIONSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMaintenance3Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance3Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance3Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance3Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance3Properties ELEMENT_FACTORY = VkPhysicalDeviceMaintenance3Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance3Properties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance3Properties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMaintenance3Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMaintenance3Properties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance3Properties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance3Properties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance3Properties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance3Properties#maxPerSetDescriptors} field. */
        @NativeType("uint32_t")
        public int maxPerSetDescriptors() { return VkPhysicalDeviceMaintenance3Properties.nmaxPerSetDescriptors(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMaintenance3Properties#maxMemoryAllocationSize} field. */
        @NativeType("VkDeviceSize")
        public long maxMemoryAllocationSize() { return VkPhysicalDeviceMaintenance3Properties.nmaxMemoryAllocationSize(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance3Properties#sType} field. */
        public VkPhysicalDeviceMaintenance3Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance3Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES} value to the {@link VkPhysicalDeviceMaintenance3Properties#sType} field. */
        public VkPhysicalDeviceMaintenance3Properties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMaintenance3Properties#pNext} field. */
        public VkPhysicalDeviceMaintenance3Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance3Properties.npNext(address(), value); return this; }

    }

}