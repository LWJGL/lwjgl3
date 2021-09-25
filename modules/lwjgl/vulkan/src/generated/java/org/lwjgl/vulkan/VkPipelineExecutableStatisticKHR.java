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
 * Structure describing a compile-time pipeline executable statistic.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineExecutableStatisticValueKHR}, {@link KHRPipelineExecutableProperties#vkGetPipelineExecutableStatisticsKHR GetPipelineExecutableStatisticsKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineExecutableStatisticKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     char {@link #name}[VK_MAX_DESCRIPTION_SIZE];
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 *     VkPipelineExecutableStatisticFormatKHR {@link #format};
 *     {@link VkPipelineExecutableStatisticValueKHR VkPipelineExecutableStatisticValueKHR} {@link #value};
 * }</code></pre>
 */
public class VkPipelineExecutableStatisticKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        NAME,
        DESCRIPTION,
        FORMAT,
        VALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(4),
            __member(VkPipelineExecutableStatisticValueKHR.SIZEOF, VkPipelineExecutableStatisticValueKHR.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        VALUE = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPipelineExecutableStatisticKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineExecutableStatisticKHR(ByteBuffer container) {
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
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this statistic. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this statistic. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description for this statistic. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description for this statistic. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** a {@code VkPipelineExecutableStatisticFormatKHR} value specifying the format of the data found in {@code value}. */
    @NativeType("VkPipelineExecutableStatisticFormatKHR")
    public int format() { return nformat(address()); }
    /** the value of this statistic. */
    public VkPipelineExecutableStatisticValueKHR value() { return nvalue(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineExecutableStatisticKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR} value to the {@link #sType} field. */
    public VkPipelineExecutableStatisticKHR sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineExecutableStatisticKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineExecutableStatisticKHR set(
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
    public VkPipelineExecutableStatisticKHR set(VkPipelineExecutableStatisticKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableStatisticKHR malloc() {
        return wrap(VkPipelineExecutableStatisticKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineExecutableStatisticKHR calloc() {
        return wrap(VkPipelineExecutableStatisticKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineExecutableStatisticKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineExecutableStatisticKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineExecutableStatisticKHR} instance for the specified memory address. */
    public static VkPipelineExecutableStatisticKHR create(long address) {
        return wrap(VkPipelineExecutableStatisticKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableStatisticKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineExecutableStatisticKHR.class, address);
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineExecutableStatisticKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineExecutableStatisticKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineExecutableStatisticKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableStatisticKHR malloc(MemoryStack stack) {
        return wrap(VkPipelineExecutableStatisticKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableStatisticKHR calloc(MemoryStack stack) {
        return wrap(VkPipelineExecutableStatisticKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineExecutableStatisticKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineExecutableStatisticKHR.PNEXT); }
    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + VkPipelineExecutableStatisticKHR.NAME, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(struct + VkPipelineExecutableStatisticKHR.NAME); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkPipelineExecutableStatisticKHR.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkPipelineExecutableStatisticKHR.DESCRIPTION); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkPipelineExecutableStatisticKHR.FORMAT); }
    /** Unsafe version of {@link #value}. */
    public static VkPipelineExecutableStatisticValueKHR nvalue(long struct) { return VkPipelineExecutableStatisticValueKHR.create(struct + VkPipelineExecutableStatisticKHR.VALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineExecutableStatisticKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineExecutableStatisticKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineExecutableStatisticKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineExecutableStatisticKHR, Buffer> implements NativeResource {

        private static final VkPipelineExecutableStatisticKHR ELEMENT_FACTORY = VkPipelineExecutableStatisticKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineExecutableStatisticKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineExecutableStatisticKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineExecutableStatisticKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineExecutableStatisticKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineExecutableStatisticKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineExecutableStatisticKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineExecutableStatisticKHR.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPipelineExecutableStatisticKHR#name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkPipelineExecutableStatisticKHR.nname(address()); }
        /** @return the null-terminated string stored in the {@link VkPipelineExecutableStatisticKHR#name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkPipelineExecutableStatisticKHR.nnameString(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkPipelineExecutableStatisticKHR#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPipelineExecutableStatisticKHR.ndescription(address()); }
        /** @return the null-terminated string stored in the {@link VkPipelineExecutableStatisticKHR#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPipelineExecutableStatisticKHR.ndescriptionString(address()); }
        /** @return the value of the {@link VkPipelineExecutableStatisticKHR#format} field. */
        @NativeType("VkPipelineExecutableStatisticFormatKHR")
        public int format() { return VkPipelineExecutableStatisticKHR.nformat(address()); }
        /** @return a {@link VkPipelineExecutableStatisticValueKHR} view of the {@link VkPipelineExecutableStatisticKHR#value} field. */
        public VkPipelineExecutableStatisticValueKHR value() { return VkPipelineExecutableStatisticKHR.nvalue(address()); }

        /** Sets the specified value to the {@link VkPipelineExecutableStatisticKHR#sType} field. */
        public VkPipelineExecutableStatisticKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineExecutableStatisticKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR} value to the {@link VkPipelineExecutableStatisticKHR#sType} field. */
        public VkPipelineExecutableStatisticKHR.Buffer sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR); }
        /** Sets the specified value to the {@link VkPipelineExecutableStatisticKHR#pNext} field. */
        public VkPipelineExecutableStatisticKHR.Buffer pNext(@NativeType("void *") long value) { VkPipelineExecutableStatisticKHR.npNext(address(), value); return this; }

    }

}