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
 * struct VkVideoEncodeSessionIntraRefreshCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkVideoEncodeIntraRefreshModeFlagBitsKHR intraRefreshMode;
 * }}</pre>
 */
public class VkVideoEncodeSessionIntraRefreshCreateInfoKHR extends Struct<VkVideoEncodeSessionIntraRefreshCreateInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INTRAREFRESHMODE;

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
        INTRAREFRESHMODE = layout.offsetof(2);
    }

    protected VkVideoEncodeSessionIntraRefreshCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeSessionIntraRefreshCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code intraRefreshMode} field. */
    @NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR")
    public int intraRefreshMode() { return nintraRefreshMode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code intraRefreshMode} field. */
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR intraRefreshMode(@NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR") int value) { nintraRefreshMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR set(
        int sType,
        long pNext,
        int intraRefreshMode
    ) {
        sType(sType);
        pNext(pNext);
        intraRefreshMode(intraRefreshMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeSessionIntraRefreshCreateInfoKHR set(VkVideoEncodeSessionIntraRefreshCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR malloc() {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR calloc() {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR create(long address) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkVideoEncodeSessionIntraRefreshCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeSessionIntraRefreshCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkVideoEncodeSessionIntraRefreshCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeSessionIntraRefreshCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #intraRefreshMode}. */
    public static int nintraRefreshMode(long struct) { return memGetInt(struct + VkVideoEncodeSessionIntraRefreshCreateInfoKHR.INTRAREFRESHMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkVideoEncodeSessionIntraRefreshCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeSessionIntraRefreshCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #intraRefreshMode(int) intraRefreshMode}. */
    public static void nintraRefreshMode(long struct, int value) { memPutInt(struct + VkVideoEncodeSessionIntraRefreshCreateInfoKHR.INTRAREFRESHMODE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeSessionIntraRefreshCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeSessionIntraRefreshCreateInfoKHR ELEMENT_FACTORY = VkVideoEncodeSessionIntraRefreshCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeSessionIntraRefreshCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeSessionIntraRefreshCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeSessionIntraRefreshCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code intraRefreshMode} field. */
        @NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR")
        public int intraRefreshMode() { return VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nintraRefreshMode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeIntraRefresh#VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeIntraRefresh.VK_STRUCTURE_TYPE_VIDEO_ENCODE_SESSION_INTRA_REFRESH_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeSessionIntraRefreshCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code intraRefreshMode} field. */
        public VkVideoEncodeSessionIntraRefreshCreateInfoKHR.Buffer intraRefreshMode(@NativeType("VkVideoEncodeIntraRefreshModeFlagBitsKHR") int value) { VkVideoEncodeSessionIntraRefreshCreateInfoKHR.nintraRefreshMode(address(), value); return this; }

    }

}