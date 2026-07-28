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
 * struct VkResolveImageModeInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkResolveImageFlagsKHR flags;
 *     VkResolveModeFlagBits resolveMode;
 *     VkResolveModeFlagBits stencilResolveMode;
 * }}</pre>
 */
public class VkResolveImageModeInfoKHR extends Struct<VkResolveImageModeInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RESOLVEMODE,
        STENCILRESOLVEMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        RESOLVEMODE = layout.offsetof(3);
        STENCILRESOLVEMODE = layout.offsetof(4);
    }

    protected VkResolveImageModeInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkResolveImageModeInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkResolveImageModeInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkResolveImageModeInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkResolveImageModeInfoKHR(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkResolveImageFlagsKHR")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code resolveMode} field. */
    @NativeType("VkResolveModeFlagBits")
    public int resolveMode() { return nresolveMode(address()); }
    /** @return the value of the {@code stencilResolveMode} field. */
    @NativeType("VkResolveModeFlagBits")
    public int stencilResolveMode() { return nstencilResolveMode(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkResolveImageModeInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance10#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR} value to the {@code sType} field. */
    public VkResolveImageModeInfoKHR sType$Default() { return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkResolveImageModeInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkResolveImageModeInfoKHR flags(@NativeType("VkResolveImageFlagsKHR") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code resolveMode} field. */
    public VkResolveImageModeInfoKHR resolveMode(@NativeType("VkResolveModeFlagBits") int value) { nresolveMode(address(), value); return this; }
    /** Sets the specified value to the {@code stencilResolveMode} field. */
    public VkResolveImageModeInfoKHR stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { nstencilResolveMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkResolveImageModeInfoKHR set(
        int sType,
        long pNext,
        int flags,
        int resolveMode,
        int stencilResolveMode
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        resolveMode(resolveMode);
        stencilResolveMode(stencilResolveMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkResolveImageModeInfoKHR set(VkResolveImageModeInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkResolveImageModeInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkResolveImageModeInfoKHR malloc() {
        return new VkResolveImageModeInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkResolveImageModeInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkResolveImageModeInfoKHR calloc() {
        return new VkResolveImageModeInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkResolveImageModeInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkResolveImageModeInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkResolveImageModeInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkResolveImageModeInfoKHR} instance for the specified memory address. */
    public static VkResolveImageModeInfoKHR create(long address) {
        return new VkResolveImageModeInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkResolveImageModeInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkResolveImageModeInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkResolveImageModeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageModeInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageModeInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageModeInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageModeInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkResolveImageModeInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkResolveImageModeInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkResolveImageModeInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkResolveImageModeInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkResolveImageModeInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageModeInfoKHR malloc(MemoryStack stack) {
        return new VkResolveImageModeInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkResolveImageModeInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkResolveImageModeInfoKHR calloc(MemoryStack stack) {
        return new VkResolveImageModeInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkResolveImageModeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageModeInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkResolveImageModeInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkResolveImageModeInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkResolveImageModeInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkResolveImageModeInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkResolveImageModeInfoKHR.FLAGS); }
    /** Unsafe version of {@link #resolveMode}. */
    public static int nresolveMode(long struct) { return memGetInt(struct + VkResolveImageModeInfoKHR.RESOLVEMODE); }
    /** Unsafe version of {@link #stencilResolveMode}. */
    public static int nstencilResolveMode(long struct) { return memGetInt(struct + VkResolveImageModeInfoKHR.STENCILRESOLVEMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkResolveImageModeInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkResolveImageModeInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkResolveImageModeInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #resolveMode(int) resolveMode}. */
    public static void nresolveMode(long struct, int value) { memPutInt(struct + VkResolveImageModeInfoKHR.RESOLVEMODE, value); }
    /** Unsafe version of {@link #stencilResolveMode(int) stencilResolveMode}. */
    public static void nstencilResolveMode(long struct, int value) { memPutInt(struct + VkResolveImageModeInfoKHR.STENCILRESOLVEMODE, value); }

    // -----------------------------------

    /** An array of {@link VkResolveImageModeInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkResolveImageModeInfoKHR, Buffer> implements NativeResource {

        private static final VkResolveImageModeInfoKHR ELEMENT_FACTORY = VkResolveImageModeInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkResolveImageModeInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkResolveImageModeInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkResolveImageModeInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkResolveImageModeInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkResolveImageModeInfoKHR.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkResolveImageFlagsKHR")
        public int flags() { return VkResolveImageModeInfoKHR.nflags(address()); }
        /** @return the value of the {@code resolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int resolveMode() { return VkResolveImageModeInfoKHR.nresolveMode(address()); }
        /** @return the value of the {@code stencilResolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int stencilResolveMode() { return VkResolveImageModeInfoKHR.nstencilResolveMode(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkResolveImageModeInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkResolveImageModeInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance10#VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR} value to the {@code sType} field. */
        public VkResolveImageModeInfoKHR.Buffer sType$Default() { return sType(KHRMaintenance10.VK_STRUCTURE_TYPE_RESOLVE_IMAGE_MODE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkResolveImageModeInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkResolveImageModeInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkResolveImageModeInfoKHR.Buffer flags(@NativeType("VkResolveImageFlagsKHR") int value) { VkResolveImageModeInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code resolveMode} field. */
        public VkResolveImageModeInfoKHR.Buffer resolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkResolveImageModeInfoKHR.nresolveMode(address(), value); return this; }
        /** Sets the specified value to the {@code stencilResolveMode} field. */
        public VkResolveImageModeInfoKHR.Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkResolveImageModeInfoKHR.nstencilResolveMode(address(), value); return this; }

    }

}