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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code name[VK_MAX_DESCRIPTION_SIZE]} &ndash; an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a short human readable name for this statistic.</li>
 * <li>{@code description[VK_MAX_DESCRIPTION_SIZE]} &ndash; an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which is a human readable description for this statistic.</li>
 * <li>{@code format} &ndash; a {@code VkPipelineExecutableStatisticFormatKHR} value specifying the format of the data found in {@code value}.</li>
 * <li>{@code value} &ndash; the value of this statistic.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineExecutableStatisticKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     char name[VK_MAX_DESCRIPTION_SIZE];
 *     char description[VK_MAX_DESCRIPTION_SIZE];
 *     VkPipelineExecutableStatisticFormatKHR format;
 *     {@link VkPipelineExecutableStatisticValueKHR VkPipelineExecutableStatisticValueKHR} value;
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

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string stored in the {@code name} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() { return nnameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** Decodes the null-terminated string stored in the {@code description} field. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** Returns the value of the {@code format} field. */
    @NativeType("VkPipelineExecutableStatisticFormatKHR")
    public int format() { return nformat(address()); }
    /** Returns a {@link VkPipelineExecutableStatisticValueKHR} view of the {@code value} field. */
    public VkPipelineExecutableStatisticValueKHR value() { return nvalue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineExecutableStatisticKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
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

    /** Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineExecutableStatisticKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineExecutableStatisticKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableStatisticKHR mallocStack(MemoryStack stack) {
        return wrap(VkPipelineExecutableStatisticKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineExecutableStatisticKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineExecutableStatisticKHR callocStack(MemoryStack stack) {
        return wrap(VkPipelineExecutableStatisticKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineExecutableStatisticKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineExecutableStatisticKHR.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineExecutableStatisticKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPipelineExecutableStatisticKHR.npNext(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() { return VkPipelineExecutableStatisticKHR.nname(address()); }
        /** Decodes the null-terminated string stored in the {@code name} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() { return VkPipelineExecutableStatisticKHR.nnameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkPipelineExecutableStatisticKHR.ndescription(address()); }
        /** Decodes the null-terminated string stored in the {@code description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkPipelineExecutableStatisticKHR.ndescriptionString(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkPipelineExecutableStatisticFormatKHR")
        public int format() { return VkPipelineExecutableStatisticKHR.nformat(address()); }
        /** Returns a {@link VkPipelineExecutableStatisticValueKHR} view of the {@code value} field. */
        public VkPipelineExecutableStatisticValueKHR value() { return VkPipelineExecutableStatisticKHR.nvalue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineExecutableStatisticKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineExecutableStatisticKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineExecutableStatisticKHR.Buffer pNext(@NativeType("void *") long value) { VkPipelineExecutableStatisticKHR.npNext(address(), value); return this; }

    }

}