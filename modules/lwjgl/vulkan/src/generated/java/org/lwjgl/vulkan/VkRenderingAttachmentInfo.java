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
 * struct VkRenderingAttachmentInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageView imageView;
 *     VkImageLayout imageLayout;
 *     VkResolveModeFlagBits resolveMode;
 *     VkImageView resolveImageView;
 *     VkImageLayout resolveImageLayout;
 *     VkAttachmentLoadOp loadOp;
 *     VkAttachmentStoreOp storeOp;
 *     {@link VkClearValue VkClearValue} clearValue;
 * }}</pre>
 */
public class VkRenderingAttachmentInfo extends Struct<VkRenderingAttachmentInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGEVIEW,
        IMAGELAYOUT,
        RESOLVEMODE,
        RESOLVEIMAGEVIEW,
        RESOLVEIMAGELAYOUT,
        LOADOP,
        STOREOP,
        CLEARVALUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(VkClearValue.SIZEOF, VkClearValue.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGEVIEW = layout.offsetof(2);
        IMAGELAYOUT = layout.offsetof(3);
        RESOLVEMODE = layout.offsetof(4);
        RESOLVEIMAGEVIEW = layout.offsetof(5);
        RESOLVEIMAGELAYOUT = layout.offsetof(6);
        LOADOP = layout.offsetof(7);
        STOREOP = layout.offsetof(8);
        CLEARVALUE = layout.offsetof(9);
    }

    protected VkRenderingAttachmentInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderingAttachmentInfo create(long address, @Nullable ByteBuffer container) {
        return new VkRenderingAttachmentInfo(address, container);
    }

    /**
     * Creates a {@code VkRenderingAttachmentInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderingAttachmentInfo(ByteBuffer container) {
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
    /** @return the value of the {@code imageView} field. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** @return the value of the {@code imageLayout} field. */
    @NativeType("VkImageLayout")
    public int imageLayout() { return nimageLayout(address()); }
    /** @return the value of the {@code resolveMode} field. */
    @NativeType("VkResolveModeFlagBits")
    public int resolveMode() { return nresolveMode(address()); }
    /** @return the value of the {@code resolveImageView} field. */
    @NativeType("VkImageView")
    public long resolveImageView() { return nresolveImageView(address()); }
    /** @return the value of the {@code resolveImageLayout} field. */
    @NativeType("VkImageLayout")
    public int resolveImageLayout() { return nresolveImageLayout(address()); }
    /** @return the value of the {@code loadOp} field. */
    @NativeType("VkAttachmentLoadOp")
    public int loadOp() { return nloadOp(address()); }
    /** @return the value of the {@code storeOp} field. */
    @NativeType("VkAttachmentStoreOp")
    public int storeOp() { return nstoreOp(address()); }
    /** @return a {@link VkClearValue} view of the {@code clearValue} field. */
    public VkClearValue clearValue() { return nclearValue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderingAttachmentInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO} value to the {@code sType} field. */
    public VkRenderingAttachmentInfo sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderingAttachmentInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code imageView} field. */
    public VkRenderingAttachmentInfo imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@code imageLayout} field. */
    public VkRenderingAttachmentInfo imageLayout(@NativeType("VkImageLayout") int value) { nimageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code resolveMode} field. */
    public VkRenderingAttachmentInfo resolveMode(@NativeType("VkResolveModeFlagBits") int value) { nresolveMode(address(), value); return this; }
    /** Sets the specified value to the {@code resolveImageView} field. */
    public VkRenderingAttachmentInfo resolveImageView(@NativeType("VkImageView") long value) { nresolveImageView(address(), value); return this; }
    /** Sets the specified value to the {@code resolveImageLayout} field. */
    public VkRenderingAttachmentInfo resolveImageLayout(@NativeType("VkImageLayout") int value) { nresolveImageLayout(address(), value); return this; }
    /** Sets the specified value to the {@code loadOp} field. */
    public VkRenderingAttachmentInfo loadOp(@NativeType("VkAttachmentLoadOp") int value) { nloadOp(address(), value); return this; }
    /** Sets the specified value to the {@code storeOp} field. */
    public VkRenderingAttachmentInfo storeOp(@NativeType("VkAttachmentStoreOp") int value) { nstoreOp(address(), value); return this; }
    /** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
    public VkRenderingAttachmentInfo clearValue(VkClearValue value) { nclearValue(address(), value); return this; }
    /** Passes the {@code clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderingAttachmentInfo clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderingAttachmentInfo set(
        int sType,
        long pNext,
        long imageView,
        int imageLayout,
        int resolveMode,
        long resolveImageView,
        int resolveImageLayout,
        int loadOp,
        int storeOp,
        VkClearValue clearValue
    ) {
        sType(sType);
        pNext(pNext);
        imageView(imageView);
        imageLayout(imageLayout);
        resolveMode(resolveMode);
        resolveImageView(resolveImageView);
        resolveImageLayout(resolveImageLayout);
        loadOp(loadOp);
        storeOp(storeOp);
        clearValue(clearValue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderingAttachmentInfo set(VkRenderingAttachmentInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderingAttachmentInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentInfo malloc() {
        return new VkRenderingAttachmentInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAttachmentInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderingAttachmentInfo calloc() {
        return new VkRenderingAttachmentInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderingAttachmentInfo} instance allocated with {@link BufferUtils}. */
    public static VkRenderingAttachmentInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderingAttachmentInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderingAttachmentInfo} instance for the specified memory address. */
    public static VkRenderingAttachmentInfo create(long address) {
        return new VkRenderingAttachmentInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderingAttachmentInfo createSafe(long address) {
        return address == NULL ? null : new VkRenderingAttachmentInfo(address, null);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderingAttachmentInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderingAttachmentInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentInfo malloc(MemoryStack stack) {
        return new VkRenderingAttachmentInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderingAttachmentInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderingAttachmentInfo calloc(MemoryStack stack) {
        return new VkRenderingAttachmentInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderingAttachmentInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderingAttachmentInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderingAttachmentInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderingAttachmentInfo.PNEXT); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return memGetLong(struct + VkRenderingAttachmentInfo.IMAGEVIEW); }
    /** Unsafe version of {@link #imageLayout}. */
    public static int nimageLayout(long struct) { return memGetInt(struct + VkRenderingAttachmentInfo.IMAGELAYOUT); }
    /** Unsafe version of {@link #resolveMode}. */
    public static int nresolveMode(long struct) { return memGetInt(struct + VkRenderingAttachmentInfo.RESOLVEMODE); }
    /** Unsafe version of {@link #resolveImageView}. */
    public static long nresolveImageView(long struct) { return memGetLong(struct + VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW); }
    /** Unsafe version of {@link #resolveImageLayout}. */
    public static int nresolveImageLayout(long struct) { return memGetInt(struct + VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT); }
    /** Unsafe version of {@link #loadOp}. */
    public static int nloadOp(long struct) { return memGetInt(struct + VkRenderingAttachmentInfo.LOADOP); }
    /** Unsafe version of {@link #storeOp}. */
    public static int nstoreOp(long struct) { return memGetInt(struct + VkRenderingAttachmentInfo.STOREOP); }
    /** Unsafe version of {@link #clearValue}. */
    public static VkClearValue nclearValue(long struct) { return VkClearValue.create(struct + VkRenderingAttachmentInfo.CLEARVALUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderingAttachmentInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderingAttachmentInfo.PNEXT, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { memPutLong(struct + VkRenderingAttachmentInfo.IMAGEVIEW, value); }
    /** Unsafe version of {@link #imageLayout(int) imageLayout}. */
    public static void nimageLayout(long struct, int value) { memPutInt(struct + VkRenderingAttachmentInfo.IMAGELAYOUT, value); }
    /** Unsafe version of {@link #resolveMode(int) resolveMode}. */
    public static void nresolveMode(long struct, int value) { memPutInt(struct + VkRenderingAttachmentInfo.RESOLVEMODE, value); }
    /** Unsafe version of {@link #resolveImageView(long) resolveImageView}. */
    public static void nresolveImageView(long struct, long value) { memPutLong(struct + VkRenderingAttachmentInfo.RESOLVEIMAGEVIEW, value); }
    /** Unsafe version of {@link #resolveImageLayout(int) resolveImageLayout}. */
    public static void nresolveImageLayout(long struct, int value) { memPutInt(struct + VkRenderingAttachmentInfo.RESOLVEIMAGELAYOUT, value); }
    /** Unsafe version of {@link #loadOp(int) loadOp}. */
    public static void nloadOp(long struct, int value) { memPutInt(struct + VkRenderingAttachmentInfo.LOADOP, value); }
    /** Unsafe version of {@link #storeOp(int) storeOp}. */
    public static void nstoreOp(long struct, int value) { memPutInt(struct + VkRenderingAttachmentInfo.STOREOP, value); }
    /** Unsafe version of {@link #clearValue(VkClearValue) clearValue}. */
    public static void nclearValue(long struct, VkClearValue value) { memCopy(value.address(), struct + VkRenderingAttachmentInfo.CLEARVALUE, VkClearValue.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkRenderingAttachmentInfo} structs. */
    public static class Buffer extends StructBuffer<VkRenderingAttachmentInfo, Buffer> implements NativeResource {

        private static final VkRenderingAttachmentInfo ELEMENT_FACTORY = VkRenderingAttachmentInfo.create(-1L);

        /**
         * Creates a new {@code VkRenderingAttachmentInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderingAttachmentInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderingAttachmentInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderingAttachmentInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderingAttachmentInfo.npNext(address()); }
        /** @return the value of the {@code imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkRenderingAttachmentInfo.nimageView(address()); }
        /** @return the value of the {@code imageLayout} field. */
        @NativeType("VkImageLayout")
        public int imageLayout() { return VkRenderingAttachmentInfo.nimageLayout(address()); }
        /** @return the value of the {@code resolveMode} field. */
        @NativeType("VkResolveModeFlagBits")
        public int resolveMode() { return VkRenderingAttachmentInfo.nresolveMode(address()); }
        /** @return the value of the {@code resolveImageView} field. */
        @NativeType("VkImageView")
        public long resolveImageView() { return VkRenderingAttachmentInfo.nresolveImageView(address()); }
        /** @return the value of the {@code resolveImageLayout} field. */
        @NativeType("VkImageLayout")
        public int resolveImageLayout() { return VkRenderingAttachmentInfo.nresolveImageLayout(address()); }
        /** @return the value of the {@code loadOp} field. */
        @NativeType("VkAttachmentLoadOp")
        public int loadOp() { return VkRenderingAttachmentInfo.nloadOp(address()); }
        /** @return the value of the {@code storeOp} field. */
        @NativeType("VkAttachmentStoreOp")
        public int storeOp() { return VkRenderingAttachmentInfo.nstoreOp(address()); }
        /** @return a {@link VkClearValue} view of the {@code clearValue} field. */
        public VkClearValue clearValue() { return VkRenderingAttachmentInfo.nclearValue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderingAttachmentInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderingAttachmentInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO} value to the {@code sType} field. */
        public VkRenderingAttachmentInfo.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_RENDERING_ATTACHMENT_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderingAttachmentInfo.Buffer pNext(@NativeType("void const *") long value) { VkRenderingAttachmentInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code imageView} field. */
        public VkRenderingAttachmentInfo.Buffer imageView(@NativeType("VkImageView") long value) { VkRenderingAttachmentInfo.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@code imageLayout} field. */
        public VkRenderingAttachmentInfo.Buffer imageLayout(@NativeType("VkImageLayout") int value) { VkRenderingAttachmentInfo.nimageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code resolveMode} field. */
        public VkRenderingAttachmentInfo.Buffer resolveMode(@NativeType("VkResolveModeFlagBits") int value) { VkRenderingAttachmentInfo.nresolveMode(address(), value); return this; }
        /** Sets the specified value to the {@code resolveImageView} field. */
        public VkRenderingAttachmentInfo.Buffer resolveImageView(@NativeType("VkImageView") long value) { VkRenderingAttachmentInfo.nresolveImageView(address(), value); return this; }
        /** Sets the specified value to the {@code resolveImageLayout} field. */
        public VkRenderingAttachmentInfo.Buffer resolveImageLayout(@NativeType("VkImageLayout") int value) { VkRenderingAttachmentInfo.nresolveImageLayout(address(), value); return this; }
        /** Sets the specified value to the {@code loadOp} field. */
        public VkRenderingAttachmentInfo.Buffer loadOp(@NativeType("VkAttachmentLoadOp") int value) { VkRenderingAttachmentInfo.nloadOp(address(), value); return this; }
        /** Sets the specified value to the {@code storeOp} field. */
        public VkRenderingAttachmentInfo.Buffer storeOp(@NativeType("VkAttachmentStoreOp") int value) { VkRenderingAttachmentInfo.nstoreOp(address(), value); return this; }
        /** Copies the specified {@link VkClearValue} to the {@code clearValue} field. */
        public VkRenderingAttachmentInfo.Buffer clearValue(VkClearValue value) { VkRenderingAttachmentInfo.nclearValue(address(), value); return this; }
        /** Passes the {@code clearValue} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderingAttachmentInfo.Buffer clearValue(java.util.function.Consumer<VkClearValue> consumer) { consumer.accept(clearValue()); return this; }

    }

}