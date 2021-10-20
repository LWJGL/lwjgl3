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
 * Structure specifying physical device memory properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceMemoryProperties}, {@link VK11#vkGetPhysicalDeviceMemoryProperties2 GetPhysicalDeviceMemoryProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceMemoryProperties2KHR GetPhysicalDeviceMemoryProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMemoryProperties2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkPhysicalDeviceMemoryProperties VkPhysicalDeviceMemoryProperties} {@link #memoryProperties};
 * }</code></pre>
 */
public class VkPhysicalDeviceMemoryProperties2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MEMORYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkPhysicalDeviceMemoryProperties.SIZEOF, VkPhysicalDeviceMemoryProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryProperties2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryProperties2(ByteBuffer container) {
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
    /** a {@link VkPhysicalDeviceMemoryProperties} structure which is populated with the same values as in {@link VK10#vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties}. */
    public VkPhysicalDeviceMemoryProperties memoryProperties() { return nmemoryProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryProperties2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2} value to the {@link #sType} field. */
    public VkPhysicalDeviceMemoryProperties2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceMemoryProperties2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT} value to the {@code pNext} chain. */
    public VkPhysicalDeviceMemoryProperties2 pNext(VkPhysicalDeviceMemoryBudgetPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMemoryProperties2 set(
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
    public VkPhysicalDeviceMemoryProperties2 set(VkPhysicalDeviceMemoryProperties2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryProperties2 malloc() {
        return wrap(VkPhysicalDeviceMemoryProperties2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryProperties2 calloc() {
        return wrap(VkPhysicalDeviceMemoryProperties2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties2} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMemoryProperties2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties2} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryProperties2 create(long address) {
        return wrap(VkPhysicalDeviceMemoryProperties2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryProperties2 createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMemoryProperties2.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryProperties2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryProperties2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceMemoryProperties2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryProperties2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryProperties2 malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMemoryProperties2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryProperties2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryProperties2 calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMemoryProperties2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMemoryProperties2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMemoryProperties2.PNEXT); }
    /** Unsafe version of {@link #memoryProperties}. */
    public static VkPhysicalDeviceMemoryProperties nmemoryProperties(long struct) { return VkPhysicalDeviceMemoryProperties.create(struct + VkPhysicalDeviceMemoryProperties2.MEMORYPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceMemoryProperties2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMemoryProperties2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryProperties2} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryProperties2, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryProperties2 ELEMENT_FACTORY = VkPhysicalDeviceMemoryProperties2.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryProperties2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryProperties2#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMemoryProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceMemoryProperties2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMemoryProperties2.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceMemoryProperties2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMemoryProperties2.npNext(address()); }
        /** @return a {@link VkPhysicalDeviceMemoryProperties} view of the {@link VkPhysicalDeviceMemoryProperties2#memoryProperties} field. */
        public VkPhysicalDeviceMemoryProperties memoryProperties() { return VkPhysicalDeviceMemoryProperties2.nmemoryProperties(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryProperties2#sType} field. */
        public VkPhysicalDeviceMemoryProperties2.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMemoryProperties2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2 STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2} value to the {@link VkPhysicalDeviceMemoryProperties2#sType} field. */
        public VkPhysicalDeviceMemoryProperties2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PROPERTIES_2); }
        /** Sets the specified value to the {@link VkPhysicalDeviceMemoryProperties2#pNext} field. */
        public VkPhysicalDeviceMemoryProperties2.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMemoryProperties2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPhysicalDeviceMemoryBudgetPropertiesEXT} value to the {@code pNext} chain. */
        public VkPhysicalDeviceMemoryProperties2.Buffer pNext(VkPhysicalDeviceMemoryBudgetPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}