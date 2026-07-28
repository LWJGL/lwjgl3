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

/**
 * <pre>{@code
 * struct VkThrottleHintSubmitInfoSEC {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkThrottleHintTypeSEC throttleHint;
 * }}</pre>
 */
public class VkThrottleHintSubmitInfoSEC extends Struct<VkThrottleHintSubmitInfoSEC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        THROTTLEHINT;

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
        THROTTLEHINT = layout.offsetof(2);
    }

    protected VkThrottleHintSubmitInfoSEC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkThrottleHintSubmitInfoSEC create(long address, @Nullable ByteBuffer container) {
        return new VkThrottleHintSubmitInfoSEC(address, container);
    }

    /**
     * Creates a {@code VkThrottleHintSubmitInfoSEC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkThrottleHintSubmitInfoSEC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code throttleHint} field. */
    @NativeType("VkThrottleHintTypeSEC")
    public int throttleHint() { return nthrottleHint(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkThrottleHintSubmitInfoSEC sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link SECThrottleHint#VK_STRUCTURE_TYPE_THROTTLE_HINT_SUBMIT_INFO_SEC STRUCTURE_TYPE_THROTTLE_HINT_SUBMIT_INFO_SEC} value to the {@code sType} field. */
    public VkThrottleHintSubmitInfoSEC sType$Default() { return sType(SECThrottleHint.VK_STRUCTURE_TYPE_THROTTLE_HINT_SUBMIT_INFO_SEC); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkThrottleHintSubmitInfoSEC pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code throttleHint} field. */
    public VkThrottleHintSubmitInfoSEC throttleHint(@NativeType("VkThrottleHintTypeSEC") int value) { nthrottleHint(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkThrottleHintSubmitInfoSEC set(
        int sType,
        long pNext,
        int throttleHint
    ) {
        sType(sType);
        pNext(pNext);
        throttleHint(throttleHint);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkThrottleHintSubmitInfoSEC set(VkThrottleHintSubmitInfoSEC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkThrottleHintSubmitInfoSEC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkThrottleHintSubmitInfoSEC malloc() {
        return new VkThrottleHintSubmitInfoSEC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkThrottleHintSubmitInfoSEC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkThrottleHintSubmitInfoSEC calloc() {
        return new VkThrottleHintSubmitInfoSEC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkThrottleHintSubmitInfoSEC} instance allocated with {@link BufferUtils}. */
    public static VkThrottleHintSubmitInfoSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkThrottleHintSubmitInfoSEC(memAddress(container), container);
    }

    /** Returns a new {@code VkThrottleHintSubmitInfoSEC} instance for the specified memory address. */
    public static VkThrottleHintSubmitInfoSEC create(long address) {
        return new VkThrottleHintSubmitInfoSEC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkThrottleHintSubmitInfoSEC createSafe(long address) {
        return address == NULL ? null : new VkThrottleHintSubmitInfoSEC(address, null);
    }

    /**
     * Returns a new {@link VkThrottleHintSubmitInfoSEC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkThrottleHintSubmitInfoSEC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkThrottleHintSubmitInfoSEC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkThrottleHintSubmitInfoSEC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkThrottleHintSubmitInfoSEC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkThrottleHintSubmitInfoSEC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkThrottleHintSubmitInfoSEC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkThrottleHintSubmitInfoSEC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkThrottleHintSubmitInfoSEC.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkThrottleHintSubmitInfoSEC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkThrottleHintSubmitInfoSEC malloc(MemoryStack stack) {
        return new VkThrottleHintSubmitInfoSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkThrottleHintSubmitInfoSEC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkThrottleHintSubmitInfoSEC calloc(MemoryStack stack) {
        return new VkThrottleHintSubmitInfoSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkThrottleHintSubmitInfoSEC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkThrottleHintSubmitInfoSEC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkThrottleHintSubmitInfoSEC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkThrottleHintSubmitInfoSEC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkThrottleHintSubmitInfoSEC.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkThrottleHintSubmitInfoSEC.PNEXT); }
    /** Unsafe version of {@link #throttleHint}. */
    public static int nthrottleHint(long struct) { return memGetInt(struct + VkThrottleHintSubmitInfoSEC.THROTTLEHINT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkThrottleHintSubmitInfoSEC.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkThrottleHintSubmitInfoSEC.PNEXT, value); }
    /** Unsafe version of {@link #throttleHint(int) throttleHint}. */
    public static void nthrottleHint(long struct, int value) { memPutInt(struct + VkThrottleHintSubmitInfoSEC.THROTTLEHINT, value); }

    // -----------------------------------

    /** An array of {@link VkThrottleHintSubmitInfoSEC} structs. */
    public static class Buffer extends StructBuffer<VkThrottleHintSubmitInfoSEC, Buffer> implements NativeResource {

        private static final VkThrottleHintSubmitInfoSEC ELEMENT_FACTORY = VkThrottleHintSubmitInfoSEC.create(-1L);

        /**
         * Creates a new {@code VkThrottleHintSubmitInfoSEC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkThrottleHintSubmitInfoSEC#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkThrottleHintSubmitInfoSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkThrottleHintSubmitInfoSEC.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkThrottleHintSubmitInfoSEC.npNext(address()); }
        /** @return the value of the {@code throttleHint} field. */
        @NativeType("VkThrottleHintTypeSEC")
        public int throttleHint() { return VkThrottleHintSubmitInfoSEC.nthrottleHint(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkThrottleHintSubmitInfoSEC.Buffer sType(@NativeType("VkStructureType") int value) { VkThrottleHintSubmitInfoSEC.nsType(address(), value); return this; }
        /** Sets the {@link SECThrottleHint#VK_STRUCTURE_TYPE_THROTTLE_HINT_SUBMIT_INFO_SEC STRUCTURE_TYPE_THROTTLE_HINT_SUBMIT_INFO_SEC} value to the {@code sType} field. */
        public VkThrottleHintSubmitInfoSEC.Buffer sType$Default() { return sType(SECThrottleHint.VK_STRUCTURE_TYPE_THROTTLE_HINT_SUBMIT_INFO_SEC); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkThrottleHintSubmitInfoSEC.Buffer pNext(@NativeType("void const *") long value) { VkThrottleHintSubmitInfoSEC.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code throttleHint} field. */
        public VkThrottleHintSubmitInfoSEC.Buffer throttleHint(@NativeType("VkThrottleHintTypeSEC") int value) { VkThrottleHintSubmitInfoSEC.nthrottleHint(address(), value); return this; }

    }

}