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
 * struct VkRenderPassTileShadingCreateInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkTileShadingRenderPassFlagsQCOM flags;
 *     {@link VkExtent2D VkExtent2D} tileApronSize;
 * }}</pre>
 */
public class VkRenderPassTileShadingCreateInfoQCOM extends Struct<VkRenderPassTileShadingCreateInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        TILEAPRONSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TILEAPRONSIZE = layout.offsetof(3);
    }

    protected VkRenderPassTileShadingCreateInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassTileShadingCreateInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassTileShadingCreateInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkRenderPassTileShadingCreateInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassTileShadingCreateInfoQCOM(ByteBuffer container) {
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
    @NativeType("VkTileShadingRenderPassFlagsQCOM")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkExtent2D} view of the {@code tileApronSize} field. */
    public VkExtent2D tileApronSize() { return ntileApronSize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassTileShadingCreateInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM} value to the {@code sType} field. */
    public VkRenderPassTileShadingCreateInfoQCOM sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassTileShadingCreateInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkRenderPassTileShadingCreateInfoQCOM flags(@NativeType("VkTileShadingRenderPassFlagsQCOM") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code tileApronSize} field. */
    public VkRenderPassTileShadingCreateInfoQCOM tileApronSize(VkExtent2D value) { ntileApronSize(address(), value); return this; }
    /** Passes the {@code tileApronSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkRenderPassTileShadingCreateInfoQCOM tileApronSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(tileApronSize()); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassTileShadingCreateInfoQCOM set(
        int sType,
        long pNext,
        int flags,
        VkExtent2D tileApronSize
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        tileApronSize(tileApronSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassTileShadingCreateInfoQCOM set(VkRenderPassTileShadingCreateInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassTileShadingCreateInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassTileShadingCreateInfoQCOM malloc() {
        return new VkRenderPassTileShadingCreateInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassTileShadingCreateInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassTileShadingCreateInfoQCOM calloc() {
        return new VkRenderPassTileShadingCreateInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassTileShadingCreateInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassTileShadingCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassTileShadingCreateInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassTileShadingCreateInfoQCOM} instance for the specified memory address. */
    public static VkRenderPassTileShadingCreateInfoQCOM create(long address) {
        return new VkRenderPassTileShadingCreateInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkRenderPassTileShadingCreateInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkRenderPassTileShadingCreateInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassTileShadingCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassTileShadingCreateInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassTileShadingCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassTileShadingCreateInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassTileShadingCreateInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassTileShadingCreateInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassTileShadingCreateInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassTileShadingCreateInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkRenderPassTileShadingCreateInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassTileShadingCreateInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassTileShadingCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkRenderPassTileShadingCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassTileShadingCreateInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassTileShadingCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkRenderPassTileShadingCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassTileShadingCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassTileShadingCreateInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassTileShadingCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassTileShadingCreateInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassTileShadingCreateInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassTileShadingCreateInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkRenderPassTileShadingCreateInfoQCOM.FLAGS); }
    /** Unsafe version of {@link #tileApronSize}. */
    public static VkExtent2D ntileApronSize(long struct) { return VkExtent2D.create(struct + VkRenderPassTileShadingCreateInfoQCOM.TILEAPRONSIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassTileShadingCreateInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassTileShadingCreateInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkRenderPassTileShadingCreateInfoQCOM.FLAGS, value); }
    /** Unsafe version of {@link #tileApronSize(VkExtent2D) tileApronSize}. */
    public static void ntileApronSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkRenderPassTileShadingCreateInfoQCOM.TILEAPRONSIZE, VkExtent2D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkRenderPassTileShadingCreateInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassTileShadingCreateInfoQCOM, Buffer> implements NativeResource {

        private static final VkRenderPassTileShadingCreateInfoQCOM ELEMENT_FACTORY = VkRenderPassTileShadingCreateInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkRenderPassTileShadingCreateInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassTileShadingCreateInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassTileShadingCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassTileShadingCreateInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassTileShadingCreateInfoQCOM.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkTileShadingRenderPassFlagsQCOM")
        public int flags() { return VkRenderPassTileShadingCreateInfoQCOM.nflags(address()); }
        /** @return a {@link VkExtent2D} view of the {@code tileApronSize} field. */
        public VkExtent2D tileApronSize() { return VkRenderPassTileShadingCreateInfoQCOM.ntileApronSize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassTileShadingCreateInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassTileShadingCreateInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM} value to the {@code sType} field. */
        public VkRenderPassTileShadingCreateInfoQCOM.Buffer sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_RENDER_PASS_TILE_SHADING_CREATE_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassTileShadingCreateInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassTileShadingCreateInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkRenderPassTileShadingCreateInfoQCOM.Buffer flags(@NativeType("VkTileShadingRenderPassFlagsQCOM") int value) { VkRenderPassTileShadingCreateInfoQCOM.nflags(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code tileApronSize} field. */
        public VkRenderPassTileShadingCreateInfoQCOM.Buffer tileApronSize(VkExtent2D value) { VkRenderPassTileShadingCreateInfoQCOM.ntileApronSize(address(), value); return this; }
        /** Passes the {@code tileApronSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkRenderPassTileShadingCreateInfoQCOM.Buffer tileApronSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(tileApronSize()); return this; }

    }

}