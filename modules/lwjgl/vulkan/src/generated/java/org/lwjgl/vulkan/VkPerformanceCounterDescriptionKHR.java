/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkPerformanceCounterDescriptionKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPerformanceCounterDescriptionFlagsKHR flags;
 *     char name[VK_MAX_DESCRIPTION_SIZE];
 *     char category[VK_MAX_DESCRIPTION_SIZE];
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 * }}</pre>
 */
public class VkPerformanceCounterDescriptionKHR extends Struct<VkPerformanceCounterDescriptionKHR> implements NativeResource {

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

    protected VkPerformanceCounterDescriptionKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerformanceCounterDescriptionKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPerformanceCounterDescriptionKHR(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPerformanceCounterDescriptionFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** @return the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code category} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer category() { return ncategory(address()); }
    /** @return the null-terminated string stored in the {@code category} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String categoryString() { return ncategoryString(address()); }
    /** @return a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** @return the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPerformanceCounterDescriptionKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR} value to the {@code sType} field. */
    public VkPerformanceCounterDescriptionKHR sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
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
        return new VkPerformanceCounterDescriptionKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceCounterDescriptionKHR calloc() {
        return new VkPerformanceCounterDescriptionKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceCounterDescriptionKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceCounterDescriptionKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceCounterDescriptionKHR} instance for the specified memory address. */
    public static VkPerformanceCounterDescriptionKHR create(long address) {
        return new VkPerformanceCounterDescriptionKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPerformanceCounterDescriptionKHR createSafe(long address) {
        return address == NULL ? null : new VkPerformanceCounterDescriptionKHR(address, null);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerformanceCounterDescriptionKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPerformanceCounterDescriptionKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterDescriptionKHR malloc(MemoryStack stack) {
        return new VkPerformanceCounterDescriptionKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerformanceCounterDescriptionKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceCounterDescriptionKHR calloc(MemoryStack stack) {
        return new VkPerformanceCounterDescriptionKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceCounterDescriptionKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceCounterDescriptionKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPerformanceCounterDescriptionKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerformanceCounterDescriptionKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPerformanceCounterDescriptionKHR.FLAGS); }
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
    public static void nsType(long struct, int value) { memPutInt(struct + VkPerformanceCounterDescriptionKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerformanceCounterDescriptionKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPerformanceCounterDescriptionKHR} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceCounterDescriptionKHR, Buffer> implements NativeResource {

        private static final VkPerformanceCounterDescriptionKHR ELEMENT_FACTORY = VkPerformanceCounterDescriptionKHR.create(-1L);

        /**
         * Creates a new {@code VkPerformanceCounterDescriptionKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceCounterDescriptionKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPerformanceCounterDescriptionKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerformanceCounterDescriptionKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPerformanceCounterDescriptionKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPerformanceCounterDescriptionFlagsKHR")
        public int flags() { return VkPerformanceCounterDescriptionKHR.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkPerformanceCounterDescriptionKHR.nname(address()); }
        /** @return the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkPerformanceCounterDescriptionKHR.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code category} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer category() { return VkPerformanceCounterDescriptionKHR.ncategory(address()); }
        /** @return the null-terminated string stored in the {@code category} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String categoryString() { return VkPerformanceCounterDescriptionKHR.ncategoryString(address()); }
        /** @return a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPerformanceCounterDescriptionKHR.ndescription(address()); }
        /** @return the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPerformanceCounterDescriptionKHR.ndescriptionString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPerformanceCounterDescriptionKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPerformanceCounterDescriptionKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPerformanceQuery#VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR} value to the {@code sType} field. */
        public VkPerformanceCounterDescriptionKHR.Buffer sType$Default() { return sType(KHRPerformanceQuery.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPerformanceCounterDescriptionKHR.Buffer pNext(@NativeType("void *") long value) { VkPerformanceCounterDescriptionKHR.npNext(address(), value); return this; }

    }

}