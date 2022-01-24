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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure providing more detailed information about a counter.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRPerformanceQuery#vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR EnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceCounterDescriptionKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkPerformanceCounterDescriptionFlagsKHR {@link #flags};
 *     char {@link #name}[VK_MAX_DESCRIPTION_SIZE];
 *     char {@link #category}[VK_MAX_DESCRIPTION_SIZE];
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 * }</code></pre>
 */
public class VkPerformanceCounterDescriptionKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        NAME,
        CATEGORY,
        DESCRIPTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        NAME = layout.offsetof(3);
        CATEGORY = layout.offsetof(4);
        DESCRIPTION = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPerformanceCounterDescriptionKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceCounterDescriptionKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkPerformanceCounterDescriptionFlagBitsKHR} indicating the usage behavior for the counter. */
    @NativeType("VkPerformanceCounterDescriptionFlagsKHR")
    public int flags() { return nflags(address()); }
    /** an array of size {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE}, containing a null-terminated UTF-8 string specifying the name of the counter. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** an array of size {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE}, containing a null-terminated UTF-8 string specifying the name of the counter. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** an array of size {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE}, containing a null-terminated UTF-8 string specifying the category of the counter. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer category() { return ncategory(address()); }
    /** an array of size {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE}, containing a null-terminated UTF-8 string specifying the category of the counter. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String categoryString() { return ncategoryString(address()); }
    /** an array of size {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE}, containing a null-terminated UTF-8 string specifying the description of the counter. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** an array of size {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE}, containing a null-terminated UTF-8 string specifying the description of the counter. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPerformanceCounterDescriptionKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR} value to the {@link #sType} field. */
    public VkPerformanceCounterDescriptionKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPerformanceCounterDescriptionKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerformanceCounterDescriptionKHR set(
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
    public VkPerformanceCounterDescriptionKHR set(VkPerformanceCounterDescriptionKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceCounterDescriptionKHR malloc() {
        return wrap(VkPerformanceCounterDescriptionKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceCounterDescriptionKHR calloc() {
        return wrap(VkPerformanceCounterDescriptionKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceCounterDescriptionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPerformanceCounterDescriptionKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceCounterDescriptionKHR} instance for the specified memory address. */
    public static VkPerformanceCounterDescriptionKHR create(long address) {
        return wrap(VkPerformanceCounterDescriptionKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceCounterDescriptionKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPerformanceCounterDescriptionKHR.class, address);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPerformanceCounterDescriptionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPerformanceCounterDescriptionKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterDescriptionKHR malloc(MemoryStack stack) {
        return wrap(VkPerformanceCounterDescriptionKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterDescriptionKHR calloc(MemoryStack stack) {
        return wrap(VkPerformanceCounterDescriptionKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceCounterDescriptionKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceCounterDescriptionKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPerformanceCounterDescriptionKHR.FLAGS); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPerformanceCounterDescriptionKHR.NAME, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPerformanceCounterDescriptionKHR.NAME); }
    /** Unsafe version of {@link #category}. */
    public static ByteBuffer ncategory(long struct) { return memByteBuffer(struct + VkPerformanceCounterDescriptionKHR.CATEGORY, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #categoryString}. */
    public static String ncategoryString(long struct) { return memUTF8(struct + VkPerformanceCounterDescriptionKHR.CATEGORY); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkPerformanceCounterDescriptionKHR.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkPerformanceCounterDescriptionKHR.DESCRIPTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPerformanceCounterDescriptionKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceCounterDescriptionKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceCounterDescriptionKHR} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceCounterDescriptionKHR, Buffer> implements NativeResource {

        private static final VkPerformanceCounterDescriptionKHR ELEMENT_FACTORY = VkPerformanceCounterDescriptionKHR.create(-1L);

        /**
         * Creates a new {@code VkPerformanceCounterDescriptionKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceCounterDescriptionKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPerformanceCounterDescriptionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceCounterDescriptionKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceCounterDescriptionKHR.nsType(address()); }
        /** @return the value of the {@link VkPerformanceCounterDescriptionKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPerformanceCounterDescriptionKHR.npNext(address()); }
        /** @return the value of the {@link VkPerformanceCounterDescriptionKHR#flags} field. */
        @NativeType("VkPerformanceCounterDescriptionFlagsKHR")
        public int flags() { return VkPerformanceCounterDescriptionKHR.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPerformanceCounterDescriptionKHR#name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkPerformanceCounterDescriptionKHR.nname(address()); }
        /** @return the null-terminated string stored in the {@link VkPerformanceCounterDescriptionKHR#name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkPerformanceCounterDescriptionKHR.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPerformanceCounterDescriptionKHR#category} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer category() { return VkPerformanceCounterDescriptionKHR.ncategory(address()); }
        /** @return the null-terminated string stored in the {@link VkPerformanceCounterDescriptionKHR#category} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String categoryString() { return VkPerformanceCounterDescriptionKHR.ncategoryString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPerformanceCounterDescriptionKHR#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPerformanceCounterDescriptionKHR.ndescription(address()); }
        /** @return the null-terminated string stored in the {@link VkPerformanceCounterDescriptionKHR#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPerformanceCounterDescriptionKHR.ndescriptionString(address()); }

        /** Sets the specified value to the {@link VkPerformanceCounterDescriptionKHR#sType} field. */
        public VkPerformanceCounterDescriptionKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceCounterDescriptionKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR} value to the {@link VkPerformanceCounterDescriptionKHR#sType} field. */
        public VkPerformanceCounterDescriptionKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR); }
        /** Sets the specified value to the {@link VkPerformanceCounterDescriptionKHR#pNext} field. */
        public VkPerformanceCounterDescriptionKHR.Buffer pNext(@NativeType("void *") long value) { VkPerformanceCounterDescriptionKHR.npNext(address(), value); return this; }

    }

}