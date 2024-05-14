/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created pipeline line rasterization state.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code stippledLineEnable} is {@link VK10#VK_FALSE FALSE}, the values of {@code lineStippleFactor} and {@code lineStipplePattern} are ignored.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-rectangularLines">{@code rectangularLines}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR LINE_RASTERIZATION_MODE_BRESENHAM_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-bresenhamLines">{@code bresenhamLines}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-smoothLines">{@code smoothLines}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_KHR LINE_RASTERIZATION_MODE_BRESENHAM_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledBresenhamLines">{@code stippledBresenhamLines}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledSmoothLines">{@code stippledSmoothLines}</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_DEFAULT_KHR LINE_RASTERIZATION_MODE_DEFAULT_KHR}, then the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">{@code stippledRectangularLines}</a> feature <b>must</b> be enabled and {@link VkPhysicalDeviceLimits}{@code ::strictLines} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRLineRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR}</li>
 * <li>{@code lineRasterizationMode} <b>must</b> be a valid {@code VkLineRasterizationModeKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationLineStateCreateInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkLineRasterizationModeKHR {@link #lineRasterizationMode};
 *     VkBool32 {@link #stippledLineEnable};
 *     uint32_t {@link #lineStippleFactor};
 *     uint16_t {@link #lineStipplePattern};
 * }</code></pre>
 */
public class VkPipelineRasterizationLineStateCreateInfoKHR extends Struct<VkPipelineRasterizationLineStateCreateInfoKHR> implements NativeResource {

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

    protected VkPipelineRasterizationLineStateCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineRasterizationLineStateCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationLineStateCreateInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkLineRasterizationModeKHR} value selecting the style of line rasterization. */
    @NativeType("VkLineRasterizationModeKHR")
    public int lineRasterizationMode() { return nlineRasterizationMode(address()); }
    /** enables <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean stippledLineEnable() { return nstippledLineEnable(address()) != 0; }
    /** the repeat factor used in stippled line rasterization. */
    @NativeType("uint32_t")
    public int lineStippleFactor() { return nlineStippleFactor(address()); }
    /** the bit pattern used in stippled line rasterization. */
    @NativeType("uint16_t")
    public short lineStipplePattern() { return nlineStipplePattern(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRasterizationLineStateCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRLineRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR} value to the {@link #sType} field. */
    public VkPipelineRasterizationLineStateCreateInfoKHR sType$Default() { return sType(KHRLineRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRasterizationLineStateCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #lineRasterizationMode} field. */
    public VkPipelineRasterizationLineStateCreateInfoKHR lineRasterizationMode(@NativeType("VkLineRasterizationModeKHR") int value) { nlineRasterizationMode(address(), value); return this; }
    /** Sets the specified value to the {@link #stippledLineEnable} field. */
    public VkPipelineRasterizationLineStateCreateInfoKHR stippledLineEnable(@NativeType("VkBool32") boolean value) { nstippledLineEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #lineStippleFactor} field. */
    public VkPipelineRasterizationLineStateCreateInfoKHR lineStippleFactor(@NativeType("uint32_t") int value) { nlineStippleFactor(address(), value); return this; }
    /** Sets the specified value to the {@link #lineStipplePattern} field. */
    public VkPipelineRasterizationLineStateCreateInfoKHR lineStipplePattern(@NativeType("uint16_t") short value) { nlineStipplePattern(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationLineStateCreateInfoKHR set(
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
    public VkPipelineRasterizationLineStateCreateInfoKHR set(VkPipelineRasterizationLineStateCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR malloc() {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR calloc() {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRasterizationLineStateCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance for the specified memory address. */
    public static VkPipelineRasterizationLineStateCreateInfoKHR create(long address) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationLineStateCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkPipelineRasterizationLineStateCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR malloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR calloc(MemoryStack stack) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationLineStateCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #lineRasterizationMode}. */
    public static int nlineRasterizationMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.LINERASTERIZATIONMODE); }
    /** Unsafe version of {@link #stippledLineEnable}. */
    public static int nstippledLineEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.STIPPLEDLINEENABLE); }
    /** Unsafe version of {@link #lineStippleFactor}. */
    public static int nlineStippleFactor(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.LINESTIPPLEFACTOR); }
    /** Unsafe version of {@link #lineStipplePattern}. */
    public static short nlineStipplePattern(long struct) { return UNSAFE.getShort(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.LINESTIPPLEPATTERN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationLineStateCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #lineRasterizationMode(int) lineRasterizationMode}. */
    public static void nlineRasterizationMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.LINERASTERIZATIONMODE, value); }
    /** Unsafe version of {@link #stippledLineEnable(boolean) stippledLineEnable}. */
    public static void nstippledLineEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.STIPPLEDLINEENABLE, value); }
    /** Unsafe version of {@link #lineStippleFactor(int) lineStippleFactor}. */
    public static void nlineStippleFactor(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.LINESTIPPLEFACTOR, value); }
    /** Unsafe version of {@link #lineStipplePattern(short) lineStipplePattern}. */
    public static void nlineStipplePattern(long struct, short value) { UNSAFE.putShort(null, struct + VkPipelineRasterizationLineStateCreateInfoKHR.LINESTIPPLEPATTERN, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationLineStateCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationLineStateCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationLineStateCreateInfoKHR ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationLineStateCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationLineStateCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineRasterizationLineStateCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationLineStateCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationLineStateCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoKHR#lineRasterizationMode} field. */
        @NativeType("VkLineRasterizationModeKHR")
        public int lineRasterizationMode() { return VkPipelineRasterizationLineStateCreateInfoKHR.nlineRasterizationMode(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoKHR#stippledLineEnable} field. */
        @NativeType("VkBool32")
        public boolean stippledLineEnable() { return VkPipelineRasterizationLineStateCreateInfoKHR.nstippledLineEnable(address()) != 0; }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoKHR#lineStippleFactor} field. */
        @NativeType("uint32_t")
        public int lineStippleFactor() { return VkPipelineRasterizationLineStateCreateInfoKHR.nlineStippleFactor(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoKHR#lineStipplePattern} field. */
        @NativeType("uint16_t")
        public short lineStipplePattern() { return VkPipelineRasterizationLineStateCreateInfoKHR.nlineStipplePattern(address()); }

        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoKHR#sType} field. */
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRLineRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR} value to the {@link VkPipelineRasterizationLineStateCreateInfoKHR#sType} field. */
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer sType$Default() { return sType(KHRLineRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoKHR#pNext} field. */
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationLineStateCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoKHR#lineRasterizationMode} field. */
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineRasterizationMode(@NativeType("VkLineRasterizationModeKHR") int value) { VkPipelineRasterizationLineStateCreateInfoKHR.nlineRasterizationMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoKHR#stippledLineEnable} field. */
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationLineStateCreateInfoKHR.nstippledLineEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoKHR#lineStippleFactor} field. */
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineStippleFactor(@NativeType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfoKHR.nlineStippleFactor(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoKHR#lineStipplePattern} field. */
        public VkPipelineRasterizationLineStateCreateInfoKHR.Buffer lineStipplePattern(@NativeType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfoKHR.nlineStipplePattern(address(), value); return this; }

    }

}