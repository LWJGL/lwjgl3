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
 * Structure specifying enabled video encode feedback values.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR}</li>
 * <li>{@code encodeFeedbackFlags} <b>must</b> be a valid combination of {@code VkVideoEncodeFeedbackFlagBitsKHR} values</li>
 * <li>{@code encodeFeedbackFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkQueryPoolVideoEncodeFeedbackCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeFeedbackFlagsKHR {@link #encodeFeedbackFlags};
 * }</code></pre>
 */
public class VkQueryPoolVideoEncodeFeedbackCreateInfoKHR extends Struct<VkQueryPoolVideoEncodeFeedbackCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ENCODEFEEDBACKFLAGS;

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
        ENCODEFEEDBACKFLAGS = layout.offsetof(2);
    }

    protected VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueryPoolVideoEncodeFeedbackCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkVideoEncodeFeedbackFlagBitsKHR} values specifying the set of enabled video encode feedback values captured by queries of the new pool. */
    @NativeType("VkVideoEncodeFeedbackFlagsKHR")
    public int encodeFeedbackFlags() { return nencodeFeedbackFlags(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #encodeFeedbackFlags} field. */
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR encodeFeedbackFlags(@NativeType("VkVideoEncodeFeedbackFlagsKHR") int value) { nencodeFeedbackFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR set(
        int sType,
        long pNext,
        int encodeFeedbackFlags
    ) {
        sType(sType);
        pNext(pNext);
        encodeFeedbackFlags(encodeFeedbackFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR set(VkQueryPoolVideoEncodeFeedbackCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR malloc() {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR calloc() {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} instance for the specified memory address. */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR create(long address) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR malloc(MemoryStack stack) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR calloc(MemoryStack stack) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #encodeFeedbackFlags}. */
    public static int nencodeFeedbackFlags(long struct) { return UNSAFE.getInt(null, struct + VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.ENCODEFEEDBACKFLAGS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #encodeFeedbackFlags(int) encodeFeedbackFlags}. */
    public static void nencodeFeedbackFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.ENCODEFEEDBACKFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkQueryPoolVideoEncodeFeedbackCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkQueryPoolVideoEncodeFeedbackCreateInfoKHR ELEMENT_FACTORY = VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueryPoolVideoEncodeFeedbackCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#encodeFeedbackFlags} field. */
        @NativeType("VkVideoEncodeFeedbackFlagsKHR")
        public int encodeFeedbackFlags() { return VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nencodeFeedbackFlags(address()); }

        /** Sets the specified value to the {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#sType} field. */
        public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR} value to the {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#sType} field. */
        public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#pNext} field. */
        public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkQueryPoolVideoEncodeFeedbackCreateInfoKHR#encodeFeedbackFlags} field. */
        public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.Buffer encodeFeedbackFlags(@NativeType("VkVideoEncodeFeedbackFlagsKHR") int value) { VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nencodeFeedbackFlags(address(), value); return this; }

    }

}