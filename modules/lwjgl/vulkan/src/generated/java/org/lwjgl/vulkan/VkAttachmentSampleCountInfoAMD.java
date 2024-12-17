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
 * struct VkAttachmentSampleCountInfoAMD {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t colorAttachmentCount;
 *     VkSampleCountFlagBits const * pColorAttachmentSamples;
 *     VkSampleCountFlagBits depthStencilAttachmentSamples;
 * }}</pre>
 */
public class VkAttachmentSampleCountInfoAMD extends Struct<VkAttachmentSampleCountInfoAMD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTSAMPLES,
        DEPTHSTENCILATTACHMENTSAMPLES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COLORATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORATTACHMENTSAMPLES = layout.offsetof(3);
        DEPTHSTENCILATTACHMENTSAMPLES = layout.offsetof(4);
    }

    protected VkAttachmentSampleCountInfoAMD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAttachmentSampleCountInfoAMD create(long address, @Nullable ByteBuffer container) {
        return new VkAttachmentSampleCountInfoAMD(address, container);
    }

    /**
     * Creates a {@code VkAttachmentSampleCountInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAttachmentSampleCountInfoAMD(ByteBuffer container) {
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
    /** @return the value of the {@code colorAttachmentCount} field. */
    @NativeType("uint32_t")
    public int colorAttachmentCount() { return ncolorAttachmentCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentSamples} field. */
    @NativeType("VkSampleCountFlagBits const *")
    public @Nullable IntBuffer pColorAttachmentSamples() { return npColorAttachmentSamples(address()); }
    /** @return the value of the {@code depthStencilAttachmentSamples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int depthStencilAttachmentSamples() { return ndepthStencilAttachmentSamples(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAttachmentSampleCountInfoAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDMixedAttachmentSamples#VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD} value to the {@code sType} field. */
    public VkAttachmentSampleCountInfoAMD sType$Default() { return sType(AMDMixedAttachmentSamples.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAttachmentSampleCountInfoAMD pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkAttachmentSampleCountInfoAMD colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentSamples} field. */
    public VkAttachmentSampleCountInfoAMD pColorAttachmentSamples(@Nullable @NativeType("VkSampleCountFlagBits const *") IntBuffer value) { npColorAttachmentSamples(address(), value); return this; }
    /** Sets the specified value to the {@code depthStencilAttachmentSamples} field. */
    public VkAttachmentSampleCountInfoAMD depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) { ndepthStencilAttachmentSamples(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAttachmentSampleCountInfoAMD set(
        int sType,
        long pNext,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentSamples,
        int depthStencilAttachmentSamples
    ) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentSamples(pColorAttachmentSamples);
        depthStencilAttachmentSamples(depthStencilAttachmentSamples);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAttachmentSampleCountInfoAMD set(VkAttachmentSampleCountInfoAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAttachmentSampleCountInfoAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAttachmentSampleCountInfoAMD malloc() {
        return new VkAttachmentSampleCountInfoAMD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentSampleCountInfoAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAttachmentSampleCountInfoAMD calloc() {
        return new VkAttachmentSampleCountInfoAMD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAttachmentSampleCountInfoAMD} instance allocated with {@link BufferUtils}. */
    public static VkAttachmentSampleCountInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAttachmentSampleCountInfoAMD(memAddress(container), container);
    }

    /** Returns a new {@code VkAttachmentSampleCountInfoAMD} instance for the specified memory address. */
    public static VkAttachmentSampleCountInfoAMD create(long address) {
        return new VkAttachmentSampleCountInfoAMD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAttachmentSampleCountInfoAMD createSafe(long address) {
        return address == NULL ? null : new VkAttachmentSampleCountInfoAMD(address, null);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoAMD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoAMD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAttachmentSampleCountInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoAMD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAttachmentSampleCountInfoAMD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAttachmentSampleCountInfoAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentSampleCountInfoAMD malloc(MemoryStack stack) {
        return new VkAttachmentSampleCountInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAttachmentSampleCountInfoAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAttachmentSampleCountInfoAMD calloc(MemoryStack stack) {
        return new VkAttachmentSampleCountInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAttachmentSampleCountInfoAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAttachmentSampleCountInfoAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAttachmentSampleCountInfoAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAttachmentSampleCountInfoAMD.PNEXT); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkAttachmentSampleCountInfoAMD.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentSamples() pColorAttachmentSamples}. */
    public static @Nullable IntBuffer npColorAttachmentSamples(long struct) { return memIntBufferSafe(memGetAddress(struct + VkAttachmentSampleCountInfoAMD.PCOLORATTACHMENTSAMPLES), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #depthStencilAttachmentSamples}. */
    public static int ndepthStencilAttachmentSamples(long struct) { return memGetInt(struct + VkAttachmentSampleCountInfoAMD.DEPTHSTENCILATTACHMENTSAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAttachmentSampleCountInfoAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAttachmentSampleCountInfoAMD.PNEXT, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkAttachmentSampleCountInfoAMD.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentSamples(IntBuffer) pColorAttachmentSamples}. */
    public static void npColorAttachmentSamples(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkAttachmentSampleCountInfoAMD.PCOLORATTACHMENTSAMPLES, memAddressSafe(value)); if (value != null) { ncolorAttachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #depthStencilAttachmentSamples(int) depthStencilAttachmentSamples}. */
    public static void ndepthStencilAttachmentSamples(long struct, int value) { memPutInt(struct + VkAttachmentSampleCountInfoAMD.DEPTHSTENCILATTACHMENTSAMPLES, value); }

    // -----------------------------------

    /** An array of {@link VkAttachmentSampleCountInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkAttachmentSampleCountInfoAMD, Buffer> implements NativeResource {

        private static final VkAttachmentSampleCountInfoAMD ELEMENT_FACTORY = VkAttachmentSampleCountInfoAMD.create(-1L);

        /**
         * Creates a new {@code VkAttachmentSampleCountInfoAMD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAttachmentSampleCountInfoAMD#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAttachmentSampleCountInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAttachmentSampleCountInfoAMD.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAttachmentSampleCountInfoAMD.npNext(address()); }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkAttachmentSampleCountInfoAMD.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentSamples} field. */
        @NativeType("VkSampleCountFlagBits const *")
        public @Nullable IntBuffer pColorAttachmentSamples() { return VkAttachmentSampleCountInfoAMD.npColorAttachmentSamples(address()); }
        /** @return the value of the {@code depthStencilAttachmentSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int depthStencilAttachmentSamples() { return VkAttachmentSampleCountInfoAMD.ndepthStencilAttachmentSamples(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAttachmentSampleCountInfoAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkAttachmentSampleCountInfoAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDMixedAttachmentSamples#VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD} value to the {@code sType} field. */
        public VkAttachmentSampleCountInfoAMD.Buffer sType$Default() { return sType(AMDMixedAttachmentSamples.VK_STRUCTURE_TYPE_ATTACHMENT_SAMPLE_COUNT_INFO_AMD); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAttachmentSampleCountInfoAMD.Buffer pNext(@NativeType("void const *") long value) { VkAttachmentSampleCountInfoAMD.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkAttachmentSampleCountInfoAMD.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkAttachmentSampleCountInfoAMD.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentSamples} field. */
        public VkAttachmentSampleCountInfoAMD.Buffer pColorAttachmentSamples(@Nullable @NativeType("VkSampleCountFlagBits const *") IntBuffer value) { VkAttachmentSampleCountInfoAMD.npColorAttachmentSamples(address(), value); return this; }
        /** Sets the specified value to the {@code depthStencilAttachmentSamples} field. */
        public VkAttachmentSampleCountInfoAMD.Buffer depthStencilAttachmentSamples(@NativeType("VkSampleCountFlagBits") int value) { VkAttachmentSampleCountInfoAMD.ndepthStencilAttachmentSamples(address(), value); return this; }

    }

}