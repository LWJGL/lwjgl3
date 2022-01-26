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
 * Structure providing information about a queue family.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkQueueFamilyCheckpointProperties2NV}, {@link VkQueueFamilyCheckpointPropertiesNV}, {@link VkQueueFamilyGlobalPriorityPropertiesKHR}, {@link VkQueueFamilyQueryResultStatusProperties2KHR}, or {@link VkVideoQueueFamilyProperties2KHR}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkQueueFamilyProperties}, {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceQueueFamilyProperties2KHR GetPhysicalDeviceQueueFamilyProperties2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyProperties2 {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     {@link VkQueueFamilyProperties VkQueueFamilyProperties} {@link #queueFamilyProperties};
 * }</code></pre>
 */
public class VkQueueFamilyProperties2 extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUEFAMILYPROPERTIES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkQueueFamilyProperties.SIZEOF, VkQueueFamilyProperties.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUEFAMILYPROPERTIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkQueueFamilyProperties2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyProperties2(ByteBuffer container) {
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
    /** a {@link VkQueueFamilyProperties} structure which is populated with the same values as in {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties}. */
    public VkQueueFamilyProperties queueFamilyProperties() { return nqueueFamilyProperties(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueueFamilyProperties2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2} value to the {@link #sType} field. */
    public VkQueueFamilyProperties2 sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueueFamilyProperties2 pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkQueueFamilyCheckpointProperties2NV} value to the {@code pNext} chain. */
    public VkQueueFamilyProperties2 pNext(VkQueueFamilyCheckpointProperties2NV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkQueueFamilyCheckpointPropertiesNV} value to the {@code pNext} chain. */
    public VkQueueFamilyProperties2 pNext(VkQueueFamilyCheckpointPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkQueueFamilyGlobalPriorityPropertiesEXT} value to the {@code pNext} chain. */
    public VkQueueFamilyProperties2 pNext(VkQueueFamilyGlobalPriorityPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkQueueFamilyGlobalPriorityPropertiesKHR} value to the {@code pNext} chain. */
    public VkQueueFamilyProperties2 pNext(VkQueueFamilyGlobalPriorityPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkQueueFamilyQueryResultStatusProperties2KHR} value to the {@code pNext} chain. */
    public VkQueueFamilyProperties2 pNext(VkQueueFamilyQueryResultStatusProperties2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoQueueFamilyProperties2KHR} value to the {@code pNext} chain. */
    public VkQueueFamilyProperties2 pNext(VkVideoQueueFamilyProperties2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyProperties2 set(
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
    public VkQueueFamilyProperties2 set(VkQueueFamilyProperties2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyProperties2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyProperties2 malloc() {
        return wrap(VkQueueFamilyProperties2.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyProperties2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyProperties2 calloc() {
        return wrap(VkQueueFamilyProperties2.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyProperties2} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyProperties2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueueFamilyProperties2.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyProperties2} instance for the specified memory address. */
    public static VkQueueFamilyProperties2 create(long address) {
        return wrap(VkQueueFamilyProperties2.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyProperties2 createSafe(long address) {
        return address == NULL ? null : wrap(VkQueueFamilyProperties2.class, address);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties2.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties2.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueueFamilyProperties2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties2.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyProperties2.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2 mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2 callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2 mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2 callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkQueueFamilyProperties2.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkQueueFamilyProperties2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyProperties2 malloc(MemoryStack stack) {
        return wrap(VkQueueFamilyProperties2.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueueFamilyProperties2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyProperties2 calloc(MemoryStack stack) {
        return wrap(VkQueueFamilyProperties2.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties2.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyProperties2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyProperties2.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyProperties2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyProperties2.PNEXT); }
    /** Unsafe version of {@link #queueFamilyProperties}. */
    public static VkQueueFamilyProperties nqueueFamilyProperties(long struct) { return VkQueueFamilyProperties.create(struct + VkQueueFamilyProperties2.QUEUEFAMILYPROPERTIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyProperties2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyProperties2.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyProperties2} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyProperties2, Buffer> implements NativeResource {

        private static final VkQueueFamilyProperties2 ELEMENT_FACTORY = VkQueueFamilyProperties2.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyProperties2.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyProperties2#SIZEOF}, and its mark will be undefined.
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
        protected VkQueueFamilyProperties2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueueFamilyProperties2#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyProperties2.nsType(address()); }
        /** @return the value of the {@link VkQueueFamilyProperties2#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyProperties2.npNext(address()); }
        /** @return a {@link VkQueueFamilyProperties} view of the {@link VkQueueFamilyProperties2#queueFamilyProperties} field. */
        public VkQueueFamilyProperties queueFamilyProperties() { return VkQueueFamilyProperties2.nqueueFamilyProperties(address()); }

        /** Sets the specified value to the {@link VkQueueFamilyProperties2#sType} field. */
        public VkQueueFamilyProperties2.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyProperties2.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2 STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2} value to the {@link VkQueueFamilyProperties2#sType} field. */
        public VkQueueFamilyProperties2.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2); }
        /** Sets the specified value to the {@link VkQueueFamilyProperties2#pNext} field. */
        public VkQueueFamilyProperties2.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyProperties2.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkQueueFamilyCheckpointProperties2NV} value to the {@code pNext} chain. */
        public VkQueueFamilyProperties2.Buffer pNext(VkQueueFamilyCheckpointProperties2NV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkQueueFamilyCheckpointPropertiesNV} value to the {@code pNext} chain. */
        public VkQueueFamilyProperties2.Buffer pNext(VkQueueFamilyCheckpointPropertiesNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkQueueFamilyGlobalPriorityPropertiesEXT} value to the {@code pNext} chain. */
        public VkQueueFamilyProperties2.Buffer pNext(VkQueueFamilyGlobalPriorityPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkQueueFamilyGlobalPriorityPropertiesKHR} value to the {@code pNext} chain. */
        public VkQueueFamilyProperties2.Buffer pNext(VkQueueFamilyGlobalPriorityPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkQueueFamilyQueryResultStatusProperties2KHR} value to the {@code pNext} chain. */
        public VkQueueFamilyProperties2.Buffer pNext(VkQueueFamilyQueryResultStatusProperties2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoQueueFamilyProperties2KHR} value to the {@code pNext} chain. */
        public VkQueueFamilyProperties2.Buffer pNext(VkVideoQueueFamilyProperties2KHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}