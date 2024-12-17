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
 * struct VkRenderingInputAttachmentIndexInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t colorAttachmentCount;
 *     uint32_t const * pColorAttachmentInputIndices;
 *     uint32_t const * pDepthInputAttachmentIndex;
 *     uint32_t const * pStencilInputAttachmentIndex;
 * }}</pre>
 */
public class VkRenderingInputAttachmentIndexInfo extends Struct<VkRenderingInputAttachmentIndexInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COLORATTACHMENTCOUNT,
        PCOLORATTACHMENTINPUTINDICES,
        PDEPTHINPUTATTACHMENTINDEX,
        PSTENCILINPUTATTACHMENTINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COLORATTACHMENTCOUNT = layout.offsetof(2);
        PCOLORATTACHMENTINPUTINDICES = layout.offsetof(3);
        PDEPTHINPUTATTACHMENTINDEX = layout.offsetof(4);
        PSTENCILINPUTATTACHMENTINDEX = layout.offsetof(5);
    }

    protected VkRenderingInputAttachmentIndexInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingInputAttachmentIndexInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingInputAttachmentIndexInfo(address, container);
    }

    /**
     * Creates a {@code VkRenderingInputAttachmentIndexInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingInputAttachmentIndexInfo(ByteBuffer container) {
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
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentInputIndices} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pColorAttachmentInputIndices() { return npColorAttachmentInputIndices(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDepthInputAttachmentIndex} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pDepthInputAttachmentIndex(int capacity) { return npDepthInputAttachmentIndex(address(), capacity); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pStencilInputAttachmentIndex} field. */
    @NativeType("uint32_t const *")
    public @Nullable IntBuffer pStencilInputAttachmentIndex(int capacity) { return npStencilInputAttachmentIndex(address(), capacity); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderingInputAttachmentIndexInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO} value to the {@code sType} field. */
    public VkRenderingInputAttachmentIndexInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderingInputAttachmentIndexInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code colorAttachmentCount} field. */
    public VkRenderingInputAttachmentIndexInfo colorAttachmentCount(@NativeType("uint32_t") int value) { ncolorAttachmentCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentInputIndices} field. */
    public VkRenderingInputAttachmentIndexInfo pColorAttachmentInputIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npColorAttachmentInputIndices(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDepthInputAttachmentIndex} field. */
    public VkRenderingInputAttachmentIndexInfo pDepthInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDepthInputAttachmentIndex(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pStencilInputAttachmentIndex} field. */
    public VkRenderingInputAttachmentIndexInfo pStencilInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npStencilInputAttachmentIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingInputAttachmentIndexInfo set(
        int sType,
        long pNext,
        int colorAttachmentCount,
        @Nullable IntBuffer pColorAttachmentInputIndices,
        @Nullable IntBuffer pDepthInputAttachmentIndex,
        @Nullable IntBuffer pStencilInputAttachmentIndex
    ) {
        sType(sType);
        pNext(pNext);
        colorAttachmentCount(colorAttachmentCount);
        pColorAttachmentInputIndices(pColorAttachmentInputIndices);
        pDepthInputAttachmentIndex(pDepthInputAttachmentIndex);
        pStencilInputAttachmentIndex(pStencilInputAttachmentIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingInputAttachmentIndexInfo set(VkRenderingInputAttachmentIndexInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingInputAttachmentIndexInfo malloc() {
        return new VkRenderingInputAttachmentIndexInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingInputAttachmentIndexInfo calloc() {
        return new VkRenderingInputAttachmentIndexInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderingInputAttachmentIndexInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingInputAttachmentIndexInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingInputAttachmentIndexInfo} instance for the specified memory address. */
    public static VkRenderingInputAttachmentIndexInfo create(long address) {
        return new VkRenderingInputAttachmentIndexInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingInputAttachmentIndexInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderingInputAttachmentIndexInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingInputAttachmentIndexInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingInputAttachmentIndexInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingInputAttachmentIndexInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInputAttachmentIndexInfo malloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingInputAttachmentIndexInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingInputAttachmentIndexInfo calloc(MemoryStack stack) {
        return new VkRenderingInputAttachmentIndexInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingInputAttachmentIndexInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingInputAttachmentIndexInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderingInputAttachmentIndexInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingInputAttachmentIndexInfo.PNEXT); }
    /** Unsafe version of {@link #colorAttachmentCount}. */
    public static int ncolorAttachmentCount(long struct) { return memGetInt(struct + VkRenderingInputAttachmentIndexInfo.COLORATTACHMENTCOUNT); }
    /** Unsafe version of {@link #pColorAttachmentInputIndices() pColorAttachmentInputIndices}. */
    public static @Nullable IntBuffer npColorAttachmentInputIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkRenderingInputAttachmentIndexInfo.PCOLORATTACHMENTINPUTINDICES), ncolorAttachmentCount(struct)); }
    /** Unsafe version of {@link #pDepthInputAttachmentIndex(int) pDepthInputAttachmentIndex}. */
    public static @Nullable IntBuffer npDepthInputAttachmentIndex(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + VkRenderingInputAttachmentIndexInfo.PDEPTHINPUTATTACHMENTINDEX), capacity); }
    /** Unsafe version of {@link #pStencilInputAttachmentIndex(int) pStencilInputAttachmentIndex}. */
    public static @Nullable IntBuffer npStencilInputAttachmentIndex(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + VkRenderingInputAttachmentIndexInfo.PSTENCILINPUTATTACHMENTINDEX), capacity); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderingInputAttachmentIndexInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfo.PNEXT, value); }
    /** Sets the specified value to the {@code colorAttachmentCount} field of the specified {@code struct}. */
    public static void ncolorAttachmentCount(long struct, int value) { memPutInt(struct + VkRenderingInputAttachmentIndexInfo.COLORATTACHMENTCOUNT, value); }
    /** Unsafe version of {@link #pColorAttachmentInputIndices(IntBuffer) pColorAttachmentInputIndices}. */
    public static void npColorAttachmentInputIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfo.PCOLORATTACHMENTINPUTINDICES, memAddressSafe(value)); if (value != null) { ncolorAttachmentCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #pDepthInputAttachmentIndex(IntBuffer) pDepthInputAttachmentIndex}. */
    public static void npDepthInputAttachmentIndex(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfo.PDEPTHINPUTATTACHMENTINDEX, memAddressSafe(value)); }
    /** Unsafe version of {@link #pStencilInputAttachmentIndex(IntBuffer) pStencilInputAttachmentIndex}. */
    public static void npStencilInputAttachmentIndex(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkRenderingInputAttachmentIndexInfo.PSTENCILINPUTATTACHMENTINDEX, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkRenderingInputAttachmentIndexInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderingInputAttachmentIndexInfo, Buffer> implements NativeResource {

        private static final VkRenderingInputAttachmentIndexInfo ELEMENT_FACTORY = VkRenderingInputAttachmentIndexInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderingInputAttachmentIndexInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingInputAttachmentIndexInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingInputAttachmentIndexInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingInputAttachmentIndexInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingInputAttachmentIndexInfo.npNext(address()); }
        /** @return the value of the {@code colorAttachmentCount} field. */
        @NativeType("uint32_t")
        public int colorAttachmentCount() { return VkRenderingInputAttachmentIndexInfo.ncolorAttachmentCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pColorAttachmentInputIndices} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pColorAttachmentInputIndices() { return VkRenderingInputAttachmentIndexInfo.npColorAttachmentInputIndices(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pDepthInputAttachmentIndex} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pDepthInputAttachmentIndex(int capacity) { return VkRenderingInputAttachmentIndexInfo.npDepthInputAttachmentIndex(address(), capacity); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pStencilInputAttachmentIndex} field. */
        @NativeType("uint32_t const *")
        public @Nullable IntBuffer pStencilInputAttachmentIndex(int capacity) { return VkRenderingInputAttachmentIndexInfo.npStencilInputAttachmentIndex(address(), capacity); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderingInputAttachmentIndexInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingInputAttachmentIndexInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO} value to the {@code sType} field. */
        public VkRenderingInputAttachmentIndexInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_RENDERING_INPUT_ATTACHMENT_INDEX_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderingInputAttachmentIndexInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderingInputAttachmentIndexInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code colorAttachmentCount} field. */
        public VkRenderingInputAttachmentIndexInfo.Buffer colorAttachmentCount(@NativeType("uint32_t") int value) { VkRenderingInputAttachmentIndexInfo.ncolorAttachmentCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pColorAttachmentInputIndices} field. */
        public VkRenderingInputAttachmentIndexInfo.Buffer pColorAttachmentInputIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfo.npColorAttachmentInputIndices(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDepthInputAttachmentIndex} field. */
        public VkRenderingInputAttachmentIndexInfo.Buffer pDepthInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfo.npDepthInputAttachmentIndex(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pStencilInputAttachmentIndex} field. */
        public VkRenderingInputAttachmentIndexInfo.Buffer pStencilInputAttachmentIndex(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkRenderingInputAttachmentIndexInfo.npStencilInputAttachmentIndex(address(), value); return this; }

    }

}