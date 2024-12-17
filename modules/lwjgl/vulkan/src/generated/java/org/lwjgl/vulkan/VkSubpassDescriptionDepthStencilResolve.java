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
 * struct VkSubpassDescriptionDepthStencilResolve {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkResolveModeFlagBits depthResolveMode;
 *     VkResolveModeFlagBits stencilResolveMode;
 *     {@link VkAttachmentReference2 VkAttachmentReference2} const * pDepthStencilResolveAttachment;
 * }}</pre>
 */
public class VkSubpassDescriptionDepthStencilResolve extends Struct<VkSubpassDescriptionDepthStencilResolve> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHRESOLVEMODE,
        STENCILRESOLVEMODE,
        PDEPTHSTENCILRESOLVEATTACHMENT;

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
        DEPTHRESOLVEMODE = layout.offsetof(2);
        STENCILRESOLVEMODE = layout.offsetof(3);
        PDEPTHSTENCILRESOLVEATTACHMENT = layout.offsetof(4);
    }

    protected VkSubpassDescriptionDepthStencilResolve(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSubpassDescriptionDepthStencilResolve create(long address, @Nullable ByteBuffer container) {
        return new VkSubpassDescriptionDepthStencilResolve(address, container);
    }

    /**
     * Creates a {@code VkSubpassDescriptionDepthStencilResolve} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSubpassDescriptionDepthStencilResolve(ByteBuffer container) {
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
    /** @return the value of the {@code depthResolveMode} field. */
    @NativeType("VkResolveModeFlagBits")
    public int depthResolveMode() { return ndepthResolveMode(address()); }
    /** @return the value of the {@code stencilResolveMode} field. */
    @NativeType("VkResolveModeFlagBits")
    public int stencilResolveMode() { return nstencilResolveMode(address()); }
    /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pDepthStencilResolveAttachment} field. */
    @NativeType("VkAttachmentReference2 const *")
    public @Nullable VkAttachmentReference2 pDepthStencilResolveAttachment() { return npDepthStencilResolveAttachment(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSubpassDescriptionDepthStencilResolve sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE} value to the {@code sType} field. */
    public VkSubpassDescriptionDepthStencilResolve sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSubpassDescriptionDepthStencilResolve pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code depthResolveMode} field. */
    public VkSubpassDescriptionDepthStencilResolve depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) { ndepthResolveMode(address(), value); return this; }
    /** Sets the specified value to the {@code stencilResolveMode} field. */
    public VkSubpassDescriptionDepthStencilResolve stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { nstencilResolveMode(address(), value); return this; }
    /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilResolveAttachment} field. */
    public VkSubpassDescriptionDepthStencilResolve pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { npDepthStencilResolveAttachment(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSubpassDescriptionDepthStencilResolve set(
        int sType,
        long pNext,
        int depthResolveMode,
        int stencilResolveMode,
        @Nullable VkAttachmentReference2 pDepthStencilResolveAttachment
    ) {
        sType(sType);
        pNext(pNext);
        depthResolveMode(depthResolveMode);
        stencilResolveMode(stencilResolveMode);
        pDepthStencilResolveAttachment(pDepthStencilResolveAttachment);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSubpassDescriptionDepthStencilResolve set(VkSubpassDescriptionDepthStencilResolve src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolve malloc() {
        return new VkSubpassDescriptionDepthStencilResolve(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSubpassDescriptionDepthStencilResolve calloc() {
        return new VkSubpassDescriptionDepthStencilResolve(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated with {@link BufferUtils}. */
    public static VkSubpassDescriptionDepthStencilResolve create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassDescriptionDepthStencilResolve(memAddress(container), container);
    }

    /** Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance for the specified memory address. */
    public static VkSubpassDescriptionDepthStencilResolve create(long address) {
        return new VkSubpassDescriptionDepthStencilResolve(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkSubpassDescriptionDepthStencilResolve createSafe(long address) {
        return address == NULL ? null : new VkSubpassDescriptionDepthStencilResolve(address, null);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkSubpassDescriptionDepthStencilResolve.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolve malloc(MemoryStack stack) {
        return new VkSubpassDescriptionDepthStencilResolve(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSubpassDescriptionDepthStencilResolve} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSubpassDescriptionDepthStencilResolve calloc(MemoryStack stack) {
        return new VkSubpassDescriptionDepthStencilResolve(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSubpassDescriptionDepthStencilResolve.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSubpassDescriptionDepthStencilResolve.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSubpassDescriptionDepthStencilResolve.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSubpassDescriptionDepthStencilResolve.PNEXT); }
    /** Unsafe version of {@link #depthResolveMode}. */
    public static int ndepthResolveMode(long struct) { return memGetInt(struct + VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE); }
    /** Unsafe version of {@link #stencilResolveMode}. */
    public static int nstencilResolveMode(long struct) { return memGetInt(struct + VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE); }
    /** Unsafe version of {@link #pDepthStencilResolveAttachment}. */
    public static @Nullable VkAttachmentReference2 npDepthStencilResolveAttachment(long struct) { return VkAttachmentReference2.createSafe(memGetAddress(struct + VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSubpassDescriptionDepthStencilResolve.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSubpassDescriptionDepthStencilResolve.PNEXT, value); }
    /** Unsafe version of {@link #depthResolveMode(int) depthResolveMode}. */
    public static void ndepthResolveMode(long struct, int value) { memPutInt(struct + VkSubpassDescriptionDepthStencilResolve.DEPTHRESOLVEMODE, value); }
    /** Unsafe version of {@link #stencilResolveMode(int) stencilResolveMode}. */
    public static void nstencilResolveMode(long struct, int value) { memPutInt(struct + VkSubpassDescriptionDepthStencilResolve.STENCILRESOLVEMODE, value); }
    /** Unsafe version of {@link #pDepthStencilResolveAttachment(VkAttachmentReference2) pDepthStencilResolveAttachment}. */
    public static void npDepthStencilResolveAttachment(long struct, @Nullable VkAttachmentReference2 value) { memPutAddress(struct + VkSubpassDescriptionDepthStencilResolve.PDEPTHSTENCILRESOLVEATTACHMENT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkSubpassDescriptionDepthStencilResolve} structs. */
    public static class Buffer extends StructBuffer<VkSubpassDescriptionDepthStencilResolve, Buffer> implements NativeResource {

        private static final VkSubpassDescriptionDepthStencilResolve ELEMENT_FACTORY = VkSubpassDescriptionDepthStencilResolve.create(-1L);

        /**
         * Creates a new {@code VkSubpassDescriptionDepthStencilResolve.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSubpassDescriptionDepthStencilResolve#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSubpassDescriptionDepthStencilResolve getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSubpassDescriptionDepthStencilResolve.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSubpassDescriptionDepthStencilResolve.npNext(address()); }
        /** @return the value of the {@code depthResolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int depthResolveMode() { return VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(address()); }
        /** @return the value of the {@code stencilResolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int stencilResolveMode() { return VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(address()); }
        /** @return a {@link VkAttachmentReference2} view of the struct pointed to by the {@code pDepthStencilResolveAttachment} field. */
        @NativeType("VkAttachmentReference2 const *")
        public @Nullable VkAttachmentReference2 pDepthStencilResolveAttachment() { return VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer sType(@NativeType("VkStructureType") int value) { VkSubpassDescriptionDepthStencilResolve.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE} value to the {@code sType} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer pNext(@NativeType("void const *") long value) { VkSubpassDescriptionDepthStencilResolve.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code depthResolveMode} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer depthResolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.ndepthResolveMode(address(), value); return this; }
        /** Sets the specified value to the {@code stencilResolveMode} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer stencilResolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkSubpassDescriptionDepthStencilResolve.nstencilResolveMode(address(), value); return this; }
        /** Sets the address of the specified {@link VkAttachmentReference2} to the {@code pDepthStencilResolveAttachment} field. */
        public VkSubpassDescriptionDepthStencilResolve.Buffer pDepthStencilResolveAttachment(@Nullable @NativeType("VkAttachmentReference2 const *") VkAttachmentReference2 value) { VkSubpassDescriptionDepthStencilResolve.npDepthStencilResolveAttachment(address(), value); return this; }

    }

}