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
 * struct VkImageCompressionControlEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageCompressionFlagsEXT flags;
 *     uint32_t compressionControlPlaneCount;
 *     VkImageCompressionFixedRateFlagsEXT * pFixedRateFlags;
 * }}</pre>
 */
public class VkImageCompressionControlEXT extends Struct<VkImageCompressionControlEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        COMPRESSIONCONTROLPLANECOUNT,
        PFIXEDRATEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COMPRESSIONCONTROLPLANECOUNT = layout.offsetof(3);
        PFIXEDRATEFLAGS = layout.offsetof(4);
    }

    protected VkImageCompressionControlEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageCompressionControlEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImageCompressionControlEXT(address, container);
    }

    /**
     * Creates a {@code VkImageCompressionControlEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageCompressionControlEXT(ByteBuffer container) {
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
    @NativeType("VkImageCompressionFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code compressionControlPlaneCount} field. */
    @NativeType("uint32_t")
    public int compressionControlPlaneCount() { return ncompressionControlPlaneCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pFixedRateFlags} field. */
    @NativeType("VkImageCompressionFixedRateFlagsEXT *")
    public @Nullable IntBuffer pFixedRateFlags() { return npFixedRateFlags(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageCompressionControlEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT} value to the {@code sType} field. */
    public VkImageCompressionControlEXT sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageCompressionControlEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkImageCompressionControlEXT flags(@NativeType("VkImageCompressionFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code compressionControlPlaneCount} field. */
    public VkImageCompressionControlEXT compressionControlPlaneCount(@NativeType("uint32_t") int value) { ncompressionControlPlaneCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pFixedRateFlags} field. */
    public VkImageCompressionControlEXT pFixedRateFlags(@Nullable @NativeType("VkImageCompressionFixedRateFlagsEXT *") IntBuffer value) { npFixedRateFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageCompressionControlEXT set(
        int sType,
        long pNext,
        int flags,
        int compressionControlPlaneCount,
        @Nullable IntBuffer pFixedRateFlags
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        compressionControlPlaneCount(compressionControlPlaneCount);
        pFixedRateFlags(pFixedRateFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageCompressionControlEXT set(VkImageCompressionControlEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageCompressionControlEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageCompressionControlEXT malloc() {
        return new VkImageCompressionControlEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageCompressionControlEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageCompressionControlEXT calloc() {
        return new VkImageCompressionControlEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageCompressionControlEXT} instance allocated with {@link BufferUtils}. */
    public static VkImageCompressionControlEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageCompressionControlEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImageCompressionControlEXT} instance for the specified memory address. */
    public static VkImageCompressionControlEXT create(long address) {
        return new VkImageCompressionControlEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageCompressionControlEXT createSafe(long address) {
        return address == NULL ? null : new VkImageCompressionControlEXT(address, null);
    }

    /**
     * Returns a new {@link VkImageCompressionControlEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionControlEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageCompressionControlEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionControlEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCompressionControlEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionControlEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageCompressionControlEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionControlEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageCompressionControlEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageCompressionControlEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCompressionControlEXT malloc(MemoryStack stack) {
        return new VkImageCompressionControlEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageCompressionControlEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageCompressionControlEXT calloc(MemoryStack stack) {
        return new VkImageCompressionControlEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageCompressionControlEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionControlEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageCompressionControlEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageCompressionControlEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageCompressionControlEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageCompressionControlEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkImageCompressionControlEXT.FLAGS); }
    /** Unsafe version of {@link #compressionControlPlaneCount}. */
    public static int ncompressionControlPlaneCount(long struct) { return memGetInt(struct + VkImageCompressionControlEXT.COMPRESSIONCONTROLPLANECOUNT); }
    /** Unsafe version of {@link #pFixedRateFlags() pFixedRateFlags}. */
    public static @Nullable IntBuffer npFixedRateFlags(long struct) { return memIntBufferSafe(memGetAddress(struct + VkImageCompressionControlEXT.PFIXEDRATEFLAGS), ncompressionControlPlaneCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageCompressionControlEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageCompressionControlEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkImageCompressionControlEXT.FLAGS, value); }
    /** Sets the specified value to the {@code compressionControlPlaneCount} field of the specified {@code struct}. */
    public static void ncompressionControlPlaneCount(long struct, int value) { memPutInt(struct + VkImageCompressionControlEXT.COMPRESSIONCONTROLPLANECOUNT, value); }
    /** Unsafe version of {@link #pFixedRateFlags(IntBuffer) pFixedRateFlags}. */
    public static void npFixedRateFlags(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkImageCompressionControlEXT.PFIXEDRATEFLAGS, memAddressSafe(value)); if (value != null) { ncompressionControlPlaneCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkImageCompressionControlEXT} structs. */
    public static class Buffer extends StructBuffer<VkImageCompressionControlEXT, Buffer> implements NativeResource {

        private static final VkImageCompressionControlEXT ELEMENT_FACTORY = VkImageCompressionControlEXT.create(-1L);

        /**
         * Creates a new {@code VkImageCompressionControlEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageCompressionControlEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageCompressionControlEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageCompressionControlEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageCompressionControlEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkImageCompressionFlagsEXT")
        public int flags() { return VkImageCompressionControlEXT.nflags(address()); }
        /** @return the value of the {@code compressionControlPlaneCount} field. */
        @NativeType("uint32_t")
        public int compressionControlPlaneCount() { return VkImageCompressionControlEXT.ncompressionControlPlaneCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pFixedRateFlags} field. */
        @NativeType("VkImageCompressionFixedRateFlagsEXT *")
        public @Nullable IntBuffer pFixedRateFlags() { return VkImageCompressionControlEXT.npFixedRateFlags(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageCompressionControlEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImageCompressionControlEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTImageCompressionControl#VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT} value to the {@code sType} field. */
        public VkImageCompressionControlEXT.Buffer sType$Default() { return sType(EXTImageCompressionControl.VK_STRUCTURE_TYPE_IMAGE_COMPRESSION_CONTROL_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageCompressionControlEXT.Buffer pNext(@NativeType("void const *") long value) { VkImageCompressionControlEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkImageCompressionControlEXT.Buffer flags(@NativeType("VkImageCompressionFlagsEXT") int value) { VkImageCompressionControlEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code compressionControlPlaneCount} field. */
        public VkImageCompressionControlEXT.Buffer compressionControlPlaneCount(@NativeType("uint32_t") int value) { VkImageCompressionControlEXT.ncompressionControlPlaneCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pFixedRateFlags} field. */
        public VkImageCompressionControlEXT.Buffer pFixedRateFlags(@Nullable @NativeType("VkImageCompressionFixedRateFlagsEXT *") IntBuffer value) { VkImageCompressionControlEXT.npFixedRateFlags(address(), value); return this; }

    }

}