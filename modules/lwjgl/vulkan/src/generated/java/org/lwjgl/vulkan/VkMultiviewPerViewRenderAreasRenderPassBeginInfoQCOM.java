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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t perViewRenderAreaCount;
 *     {@link VkRect2D VkRect2D} const * pPerViewRenderAreas;
 * }}</pre>
 */
public class VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM extends Struct<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERVIEWRENDERAREACOUNT,
        PPERVIEWRENDERAREAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERVIEWRENDERAREACOUNT = layout.offsetof(2);
        PPERVIEWRENDERAREAS = layout.offsetof(3);
    }

    protected VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code perViewRenderAreaCount} field. */
    @NativeType("uint32_t")
    public int perViewRenderAreaCount() { return nperViewRenderAreaCount(address()); }
    /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pPerViewRenderAreas} field. */
    @NativeType("VkRect2D const *")
    public VkRect2D.@Nullable Buffer pPerViewRenderAreas() { return npPerViewRenderAreas(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM} value to the {@code sType} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType$Default() { return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pPerViewRenderAreas} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreas(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { npPerViewRenderAreas(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(
        int sType,
        long pNext,
        VkRect2D.@Nullable Buffer pPerViewRenderAreas
    ) {
        sType(sType);
        pNext(pNext);
        pPerViewRenderAreas(pPerViewRenderAreas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM malloc() {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM calloc() {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance for the specified memory address. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create(long address) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM malloc(MemoryStack stack) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM calloc(MemoryStack stack) {
        return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #perViewRenderAreaCount}. */
    public static int nperViewRenderAreaCount(long struct) { return memGetInt(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PERVIEWRENDERAREACOUNT); }
    /** Unsafe version of {@link #pPerViewRenderAreas}. */
    public static VkRect2D.@Nullable Buffer npPerViewRenderAreas(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PPERVIEWRENDERAREAS), nperViewRenderAreaCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PNEXT, value); }
    /** Sets the specified value to the {@code perViewRenderAreaCount} field of the specified {@code struct}. */
    public static void nperViewRenderAreaCount(long struct, int value) { memPutInt(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PERVIEWRENDERAREACOUNT, value); }
    /** Unsafe version of {@link #pPerViewRenderAreas(VkRect2D.Buffer) pPerViewRenderAreas}. */
    public static void npPerViewRenderAreas(long struct, VkRect2D.@Nullable Buffer value) { memPutAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PPERVIEWRENDERAREAS, memAddressSafe(value)); nperViewRenderAreaCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nperViewRenderAreaCount(struct) != 0) {
            check(memGetAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PPERVIEWRENDERAREAS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM, Buffer> implements NativeResource {

        private static final VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ELEMENT_FACTORY = VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npNext(address()); }
        /** @return the value of the {@code perViewRenderAreaCount} field. */
        @NativeType("uint32_t")
        public int perViewRenderAreaCount() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nperViewRenderAreaCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@code pPerViewRenderAreas} field. */
        @NativeType("VkRect2D const *")
        public VkRect2D.@Nullable Buffer pPerViewRenderAreas() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npPerViewRenderAreas(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM} value to the {@code sType} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer sType$Default() { return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@code pPerViewRenderAreas} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer pPerViewRenderAreas(@NativeType("VkRect2D const *") VkRect2D.@Nullable Buffer value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npPerViewRenderAreas(address(), value); return this; }

    }

}