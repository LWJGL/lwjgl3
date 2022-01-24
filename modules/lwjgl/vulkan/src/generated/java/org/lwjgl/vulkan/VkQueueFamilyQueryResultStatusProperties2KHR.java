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
 * Structure specifying support for result status query.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueueFamilyQueryResultStatusProperties2KHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #supported};
 * }</code></pre>
 */
public class VkQueueFamilyQueryResultStatusProperties2KHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTED;

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
        SUPPORTED = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkQueueFamilyQueryResultStatusProperties2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyQueryResultStatusProperties2KHR(ByteBuffer container) {
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
    /** reports {@link VK10#VK_TRUE TRUE} if query type {@link KHRVideoQueue#VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR QUERY_TYPE_RESULT_STATUS_ONLY_KHR} and use of {@link KHRVideoQueue#VK_QUERY_RESULT_WITH_STATUS_BIT_KHR QUERY_RESULT_WITH_STATUS_BIT_KHR} are supported. */
    @NativeType("VkBool32")
    public boolean supported() { return nsupported(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueueFamilyQueryResultStatusProperties2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR} value to the {@link #sType} field. */
    public VkQueueFamilyQueryResultStatusProperties2KHR sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueueFamilyQueryResultStatusProperties2KHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #supported} field. */
    public VkQueueFamilyQueryResultStatusProperties2KHR supported(@NativeType("VkBool32") boolean value) { nsupported(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyQueryResultStatusProperties2KHR set(
        int sType,
        long pNext,
        boolean supported
    ) {
        sType(sType);
        pNext(pNext);
        supported(supported);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueueFamilyQueryResultStatusProperties2KHR set(VkQueueFamilyQueryResultStatusProperties2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyQueryResultStatusProperties2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyQueryResultStatusProperties2KHR malloc() {
        return wrap(VkQueueFamilyQueryResultStatusProperties2KHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyQueryResultStatusProperties2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyQueryResultStatusProperties2KHR calloc() {
        return wrap(VkQueueFamilyQueryResultStatusProperties2KHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkQueueFamilyQueryResultStatusProperties2KHR} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyQueryResultStatusProperties2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkQueueFamilyQueryResultStatusProperties2KHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyQueryResultStatusProperties2KHR} instance for the specified memory address. */
    public static VkQueueFamilyQueryResultStatusProperties2KHR create(long address) {
        return wrap(VkQueueFamilyQueryResultStatusProperties2KHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyQueryResultStatusProperties2KHR createSafe(long address) {
        return address == NULL ? null : wrap(VkQueueFamilyQueryResultStatusProperties2KHR.class, address);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusProperties2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusProperties2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkQueueFamilyQueryResultStatusProperties2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueueFamilyQueryResultStatusProperties2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyQueryResultStatusProperties2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR malloc(MemoryStack stack) {
        return wrap(VkQueueFamilyQueryResultStatusProperties2KHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkQueueFamilyQueryResultStatusProperties2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR calloc(MemoryStack stack) {
        return wrap(VkQueueFamilyQueryResultStatusProperties2KHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyQueryResultStatusProperties2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyQueryResultStatusProperties2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyQueryResultStatusProperties2KHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyQueryResultStatusProperties2KHR.PNEXT); }
    /** Unsafe version of {@link #supported}. */
    public static int nsupported(long struct) { return UNSAFE.getInt(null, struct + VkQueueFamilyQueryResultStatusProperties2KHR.SUPPORTED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyQueryResultStatusProperties2KHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyQueryResultStatusProperties2KHR.PNEXT, value); }
    /** Unsafe version of {@link #supported(boolean) supported}. */
    public static void nsupported(long struct, int value) { UNSAFE.putInt(null, struct + VkQueueFamilyQueryResultStatusProperties2KHR.SUPPORTED, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyQueryResultStatusProperties2KHR} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyQueryResultStatusProperties2KHR, Buffer> implements NativeResource {

        private static final VkQueueFamilyQueryResultStatusProperties2KHR ELEMENT_FACTORY = VkQueueFamilyQueryResultStatusProperties2KHR.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyQueryResultStatusProperties2KHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyQueryResultStatusProperties2KHR#SIZEOF}, and its mark will be undefined.
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
        protected VkQueueFamilyQueryResultStatusProperties2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueueFamilyQueryResultStatusProperties2KHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyQueryResultStatusProperties2KHR.nsType(address()); }
        /** @return the value of the {@link VkQueueFamilyQueryResultStatusProperties2KHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyQueryResultStatusProperties2KHR.npNext(address()); }
        /** @return the value of the {@link VkQueueFamilyQueryResultStatusProperties2KHR#supported} field. */
        @NativeType("VkBool32")
        public boolean supported() { return VkQueueFamilyQueryResultStatusProperties2KHR.nsupported(address()) != 0; }

        /** Sets the specified value to the {@link VkQueueFamilyQueryResultStatusProperties2KHR#sType} field. */
        public VkQueueFamilyQueryResultStatusProperties2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyQueryResultStatusProperties2KHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoQueue#VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR} value to the {@link VkQueueFamilyQueryResultStatusProperties2KHR#sType} field. */
        public VkQueueFamilyQueryResultStatusProperties2KHR.Buffer sType$Default() { return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_2_KHR); }
        /** Sets the specified value to the {@link VkQueueFamilyQueryResultStatusProperties2KHR#pNext} field. */
        public VkQueueFamilyQueryResultStatusProperties2KHR.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyQueryResultStatusProperties2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueueFamilyQueryResultStatusProperties2KHR#supported} field. */
        public VkQueueFamilyQueryResultStatusProperties2KHR.Buffer supported(@NativeType("VkBool32") boolean value) { VkQueueFamilyQueryResultStatusProperties2KHR.nsupported(address(), value ? 1 : 0); return this; }

    }

}