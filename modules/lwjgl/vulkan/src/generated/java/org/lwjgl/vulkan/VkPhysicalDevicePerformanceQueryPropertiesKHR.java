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
 * Structure describing performance query properties for an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDevicePerformanceQueryPropertiesKHR} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDevicePerformanceQueryPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #allowCommandBufferQueryCopies};
 * }</code></pre>
 */
public class VkPhysicalDevicePerformanceQueryPropertiesKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ALLOWCOMMANDBUFFERQUERYCOPIES;

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
        ALLOWCOMMANDBUFFERQUERYCOPIES = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDevicePerformanceQueryPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePerformanceQueryPropertiesKHR(ByteBuffer container) {
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
    /** {@link VK10#VK_TRUE TRUE} if the performance query pools are allowed to be used with {@link VK10#vkCmdCopyQueryPoolResults CmdCopyQueryPoolResults}. */
    @NativeType("VkBool32")
    public boolean allowCommandBufferQueryCopies() { return nallowCommandBufferQueryCopies(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDevicePerformanceQueryPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkPhysicalDevicePerformanceQueryPropertiesKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDevicePerformanceQueryPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePerformanceQueryPropertiesKHR set(
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
    public VkPhysicalDevicePerformanceQueryPropertiesKHR set(VkPhysicalDevicePerformanceQueryPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR malloc() {
        return wrap(VkPhysicalDevicePerformanceQueryPropertiesKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR calloc() {
        return wrap(VkPhysicalDevicePerformanceQueryPropertiesKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDevicePerformanceQueryPropertiesKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePerformanceQueryPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR create(long address) {
        return wrap(VkPhysicalDevicePerformanceQueryPropertiesKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDevicePerformanceQueryPropertiesKHR.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceQueryPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR malloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePerformanceQueryPropertiesKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDevicePerformanceQueryPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR calloc(MemoryStack stack) {
        return wrap(VkPhysicalDevicePerformanceQueryPropertiesKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePerformanceQueryPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePerformanceQueryPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #allowCommandBufferQueryCopies}. */
    public static int nallowCommandBufferQueryCopies(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDevicePerformanceQueryPropertiesKHR.ALLOWCOMMANDBUFFERQUERYCOPIES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDevicePerformanceQueryPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePerformanceQueryPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePerformanceQueryPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePerformanceQueryPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePerformanceQueryPropertiesKHR ELEMENT_FACTORY = VkPhysicalDevicePerformanceQueryPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePerformanceQueryPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDevicePerformanceQueryPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDevicePerformanceQueryPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePerformanceQueryPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDevicePerformanceQueryPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePerformanceQueryPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDevicePerformanceQueryPropertiesKHR#allowCommandBufferQueryCopies} field. */
        @NativeType("VkBool32")
        public boolean allowCommandBufferQueryCopies() { return VkPhysicalDevicePerformanceQueryPropertiesKHR.nallowCommandBufferQueryCopies(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDevicePerformanceQueryPropertiesKHR#sType} field. */
        public VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePerformanceQueryPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR} value to the {@link VkPhysicalDevicePerformanceQueryPropertiesKHR#sType} field. */
        public VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkPhysicalDevicePerformanceQueryPropertiesKHR#pNext} field. */
        public VkPhysicalDevicePerformanceQueryPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePerformanceQueryPropertiesKHR.npNext(address(), value); return this; }

    }

}