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
 * struct VkPipelineViewportDepthClampControlCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkDepthClampModeEXT depthClampMode;
 *     {@link VkDepthClampRangeEXT VkDepthClampRangeEXT} const * pDepthClampRange;
 * }}</pre>
 */
public class VkPipelineViewportDepthClampControlCreateInfoEXT extends Struct<VkPipelineViewportDepthClampControlCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHCLAMPMODE,
        PDEPTHCLAMPRANGE;

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
        DEPTHCLAMPMODE = layout.offsetof(2);
        PDEPTHCLAMPRANGE = layout.offsetof(3);
    }

    protected VkPipelineViewportDepthClampControlCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineViewportDepthClampControlCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineViewportDepthClampControlCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code depthClampMode} field. */
    @NativeType("VkDepthClampModeEXT")
    public int depthClampMode() { return ndepthClampMode(address()); }
    /** @return a {@link VkDepthClampRangeEXT} view of the struct pointed to by the {@code pDepthClampRange} field. */
    @NativeType("VkDepthClampRangeEXT const *")
    public @Nullable VkDepthClampRangeEXT pDepthClampRange() { return npDepthClampRange(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDepthClampControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT sType$Default() { return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code depthClampMode} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT depthClampMode(@NativeType("VkDepthClampModeEXT") int value) { ndepthClampMode(address(), value); return this; }
    /** Sets the address of the specified {@link VkDepthClampRangeEXT} to the {@code pDepthClampRange} field. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT pDepthClampRange(@Nullable @NativeType("VkDepthClampRangeEXT const *") VkDepthClampRangeEXT value) { npDepthClampRange(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineViewportDepthClampControlCreateInfoEXT set(
        int sType,
        long pNext,
        int depthClampMode,
        @Nullable VkDepthClampRangeEXT pDepthClampRange
    ) {
        sType(sType);
        pNext(pNext);
        depthClampMode(depthClampMode);
        pDepthClampRange(pDepthClampRange);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineViewportDepthClampControlCreateInfoEXT set(VkPipelineViewportDepthClampControlCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT malloc() {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT calloc() {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT create(long address) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineViewportDepthClampControlCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkPipelineViewportDepthClampControlCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #depthClampMode}. */
    public static int ndepthClampMode(long struct) { return memGetInt(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.DEPTHCLAMPMODE); }
    /** Unsafe version of {@link #pDepthClampRange}. */
    public static @Nullable VkDepthClampRangeEXT npDepthClampRange(long struct) { return VkDepthClampRangeEXT.createSafe(memGetAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PDEPTHCLAMPRANGE)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #depthClampMode(int) depthClampMode}. */
    public static void ndepthClampMode(long struct, int value) { memPutInt(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.DEPTHCLAMPMODE, value); }
    /** Unsafe version of {@link #pDepthClampRange(VkDepthClampRangeEXT) pDepthClampRange}. */
    public static void npDepthClampRange(long struct, @Nullable VkDepthClampRangeEXT value) { memPutAddress(struct + VkPipelineViewportDepthClampControlCreateInfoEXT.PDEPTHCLAMPRANGE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkPipelineViewportDepthClampControlCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineViewportDepthClampControlCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineViewportDepthClampControlCreateInfoEXT ELEMENT_FACTORY = VkPipelineViewportDepthClampControlCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineViewportDepthClampControlCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineViewportDepthClampControlCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineViewportDepthClampControlCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineViewportDepthClampControlCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code depthClampMode} field. */
        @NativeType("VkDepthClampModeEXT")
        public int depthClampMode() { return VkPipelineViewportDepthClampControlCreateInfoEXT.ndepthClampMode(address()); }
        /** @return a {@link VkDepthClampRangeEXT} view of the struct pointed to by the {@code pDepthClampRange} field. */
        @NativeType("VkDepthClampRangeEXT const *")
        public @Nullable VkDepthClampRangeEXT pDepthClampRange() { return VkPipelineViewportDepthClampControlCreateInfoEXT.npDepthClampRange(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDepthClampControl#VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer sType$Default() { return sType(EXTDepthClampControl.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineViewportDepthClampControlCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code depthClampMode} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer depthClampMode(@NativeType("VkDepthClampModeEXT") int value) { VkPipelineViewportDepthClampControlCreateInfoEXT.ndepthClampMode(address(), value); return this; }
        /** Sets the address of the specified {@link VkDepthClampRangeEXT} to the {@code pDepthClampRange} field. */
        public VkPipelineViewportDepthClampControlCreateInfoEXT.Buffer pDepthClampRange(@Nullable @NativeType("VkDepthClampRangeEXT const *") VkDepthClampRangeEXT value) { VkPipelineViewportDepthClampControlCreateInfoEXT.npDepthClampRange(address(), value); return this; }

    }

}