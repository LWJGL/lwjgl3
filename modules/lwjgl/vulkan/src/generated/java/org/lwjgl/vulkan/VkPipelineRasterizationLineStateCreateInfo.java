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
 * struct VkPipelineRasterizationLineStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkLineRasterizationMode lineRasterizationMode;
 *     VkBool32 stippledLineEnable;
 *     uint32_t lineStippleFactor;
 *     uint16_t lineStipplePattern;
 * }}</pre>
 */
public class VkPipelineRasterizationLineStateCreateInfo extends Struct<VkPipelineRasterizationLineStateCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        LINERASTERIZATIONMODE,
        STIPPLEDLINEENABLE,
        LINESTIPPLEFACTOR,
        LINESTIPPLEPATTERN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        LINERASTERIZATIONMODE = layout.offsetof(2);
        STIPPLEDLINEENABLE = layout.offsetof(3);
        LINESTIPPLEFACTOR = layout.offsetof(4);
        LINESTIPPLEPATTERN = layout.offsetof(5);
    }

    protected VkPipelineRasterizationLineStateCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRasterizationLineStateCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRasterizationLineStateCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineRasterizationLineStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationLineStateCreateInfo(ByteBuffer container) {
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
    /** @return the value of the {@code lineRasterizationMode} field. */
    @NativeType("VkLineRasterizationMode")
    public int lineRasterizationMode() { return nlineRasterizationMode(address()); }
    /** @return the value of the {@code stippledLineEnable} field. */
    @NativeType("VkBool32")
    public boolean stippledLineEnable() { return nstippledLineEnable(address()) != 0; }
    /** @return the value of the {@code lineStippleFactor} field. */
    @NativeType("uint32_t")
    public int lineStippleFactor() { return nlineStippleFactor(address()); }
    /** @return the value of the {@code lineStipplePattern} field. */
    @NativeType("uint16_t")
    public short lineStipplePattern() { return nlineStipplePattern(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineRasterizationLineStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineRasterizationLineStateCreateInfo sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineRasterizationLineStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code lineRasterizationMode} field. */
    public VkPipelineRasterizationLineStateCreateInfo lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) { nlineRasterizationMode(address(), value); return this; }
    /** Sets the specified value to the {@code stippledLineEnable} field. */
    public VkPipelineRasterizationLineStateCreateInfo stippledLineEnable(@NativeType("VkBool32") boolean value) { nstippledLineEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code lineStippleFactor} field. */
    public VkPipelineRasterizationLineStateCreateInfo lineStippleFactor(@NativeType("uint32_t") int value) { nlineStippleFactor(address(), value); return this; }
    /** Sets the specified value to the {@code lineStipplePattern} field. */
    public VkPipelineRasterizationLineStateCreateInfo lineStipplePattern(@NativeType("uint16_t") short value) { nlineStipplePattern(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationLineStateCreateInfo set(
        int sType,
        long pNext,
        int lineRasterizationMode,
        boolean stippledLineEnable,
        int lineStippleFactor,
        short lineStipplePattern
    ) {
        sType(sType);
        pNext(pNext);
        lineRasterizationMode(lineRasterizationMode);
        stippledLineEnable(stippledLineEnable);
        lineStippleFactor(lineStippleFactor);
        lineStipplePattern(lineStipplePattern);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineRasterizationLineStateCreateInfo set(VkPipelineRasterizationLineStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfo malloc() {
        return new VkPipelineRasterizationLineStateCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfo calloc() {
        return new VkPipelineRasterizationLineStateCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationLineStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationLineStateCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineRasterizationLineStateCreateInfo create(long address) {
        return new VkPipelineRasterizationLineStateCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineRasterizationLineStateCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineRasterizationLineStateCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRasterizationLineStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineRasterizationLineStateCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineRasterizationLineStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationLineStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #lineRasterizationMode}. */
    public static int nlineRasterizationMode(long struct) { return memGetInt(struct + VkPipelineRasterizationLineStateCreateInfo.LINERASTERIZATIONMODE); }
    /** Unsafe version of {@link #stippledLineEnable}. */
    public static int nstippledLineEnable(long struct) { return memGetInt(struct + VkPipelineRasterizationLineStateCreateInfo.STIPPLEDLINEENABLE); }
    /** Unsafe version of {@link #lineStippleFactor}. */
    public static int nlineStippleFactor(long struct) { return memGetInt(struct + VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEFACTOR); }
    /** Unsafe version of {@link #lineStipplePattern}. */
    public static short nlineStipplePattern(long struct) { return memGetShort(struct + VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEPATTERN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineRasterizationLineStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationLineStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #lineRasterizationMode(int) lineRasterizationMode}. */
    public static void nlineRasterizationMode(long struct, int value) { memPutInt(struct + VkPipelineRasterizationLineStateCreateInfo.LINERASTERIZATIONMODE, value); }
    /** Unsafe version of {@link #stippledLineEnable(boolean) stippledLineEnable}. */
    public static void nstippledLineEnable(long struct, int value) { memPutInt(struct + VkPipelineRasterizationLineStateCreateInfo.STIPPLEDLINEENABLE, value); }
    /** Unsafe version of {@link #lineStippleFactor(int) lineStippleFactor}. */
    public static void nlineStippleFactor(long struct, int value) { memPutInt(struct + VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEFACTOR, value); }
    /** Unsafe version of {@link #lineStipplePattern(short) lineStipplePattern}. */
    public static void nlineStipplePattern(long struct, short value) { memPutShort(struct + VkPipelineRasterizationLineStateCreateInfo.LINESTIPPLEPATTERN, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationLineStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationLineStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationLineStateCreateInfo ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationLineStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationLineStateCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRasterizationLineStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationLineStateCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationLineStateCreateInfo.npNext(address()); }
        /** @return the value of the {@code lineRasterizationMode} field. */
        @NativeType("VkLineRasterizationMode")
        public int lineRasterizationMode() { return VkPipelineRasterizationLineStateCreateInfo.nlineRasterizationMode(address()); }
        /** @return the value of the {@code stippledLineEnable} field. */
        @NativeType("VkBool32")
        public boolean stippledLineEnable() { return VkPipelineRasterizationLineStateCreateInfo.nstippledLineEnable(address()) != 0; }
        /** @return the value of the {@code lineStippleFactor} field. */
        @NativeType("uint32_t")
        public int lineStippleFactor() { return VkPipelineRasterizationLineStateCreateInfo.nlineStippleFactor(address()); }
        /** @return the value of the {@code lineStipplePattern} field. */
        @NativeType("uint16_t")
        public short lineStipplePattern() { return VkPipelineRasterizationLineStateCreateInfo.nlineStipplePattern(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineRasterizationLineStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineRasterizationLineStateCreateInfo.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineRasterizationLineStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationLineStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code lineRasterizationMode} field. */
        public VkPipelineRasterizationLineStateCreateInfo.Buffer lineRasterizationMode(@NativeType("VkLineRasterizationMode") int value) { VkPipelineRasterizationLineStateCreateInfo.nlineRasterizationMode(address(), value); return this; }
        /** Sets the specified value to the {@code stippledLineEnable} field. */
        public VkPipelineRasterizationLineStateCreateInfo.Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationLineStateCreateInfo.nstippledLineEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code lineStippleFactor} field. */
        public VkPipelineRasterizationLineStateCreateInfo.Buffer lineStippleFactor(@NativeType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfo.nlineStippleFactor(address(), value); return this; }
        /** Sets the specified value to the {@code lineStipplePattern} field. */
        public VkPipelineRasterizationLineStateCreateInfo.Buffer lineStipplePattern(@NativeType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfo.nlineStipplePattern(address(), value); return this; }

    }

}