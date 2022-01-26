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
 * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-rectangularLines">rectangularLines</a> feature <b>must</b> be enabled</li>
 * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-bresenhamLines">bresenhamLines</a> feature <b>must</b> be enabled</li>
 * <li>If {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-bresenhamLines">smoothLines</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">stippledRectangularLines</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_BRESENHAM_EXT LINE_RASTERIZATION_MODE_BRESENHAM_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledBresenhamLines">stippledBresenhamLines</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT LINE_RASTERIZATION_MODE_RECTANGULAR_SMOOTH_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledSmoothLines">stippledSmoothLines</a> feature <b>must</b> be enabled</li>
 * <li>If {@code stippledLineEnable} is {@link VK10#VK_TRUE TRUE} and {@code lineRasterizationMode} is {@link EXTLineRasterization#VK_LINE_RASTERIZATION_MODE_DEFAULT_EXT LINE_RASTERIZATION_MODE_DEFAULT_EXT}, then the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-stippledRectangularLines">stippledRectangularLines</a> feature <b>must</b> be enabled and {@link VkPhysicalDeviceLimits}{@code ::strictLines} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTLineRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code lineRasterizationMode} <b>must</b> be a valid {@code VkLineRasterizationModeEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineRasterizationLineStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkLineRasterizationModeEXT {@link #lineRasterizationMode};
 *     VkBool32 {@link #stippledLineEnable};
 *     uint32_t {@link #lineStippleFactor};
 *     uint16_t {@link #lineStipplePattern};
 * }</code></pre>
 */
public class VkPipelineRasterizationLineStateCreateInfoEXT extends Struct implements NativeResource {

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

    /**
     * Creates a {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineRasterizationLineStateCreateInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkLineRasterizationModeEXT} value selecting the style of line rasterization. */
    @NativeType("VkLineRasterizationModeEXT")
    public int lineRasterizationMode() { return nlineRasterizationMode(address()); }
    /** enables <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#primsrast-lines-stipple">stippled line rasterization</a>. */
    @NativeType("VkBool32")
    public boolean stippledLineEnable() { return nstippledLineEnable(address()) != 0; }
    /** the repeat factor used in stippled line rasterization. */
    @NativeType("uint32_t")
    public int lineStippleFactor() { return nlineStippleFactor(address()); }
    /** the bit pattern used in stippled line rasterization. */
    @NativeType("uint16_t")
    public short lineStipplePattern() { return nlineStipplePattern(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineRasterizationLineStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTLineRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineRasterizationLineStateCreateInfoEXT sType$Default() { return sType(EXTLineRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineRasterizationLineStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #lineRasterizationMode} field. */
    public VkPipelineRasterizationLineStateCreateInfoEXT lineRasterizationMode(@NativeType("VkLineRasterizationModeEXT") int value) { nlineRasterizationMode(address(), value); return this; }
    /** Sets the specified value to the {@link #stippledLineEnable} field. */
    public VkPipelineRasterizationLineStateCreateInfoEXT stippledLineEnable(@NativeType("VkBool32") boolean value) { nstippledLineEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #lineStippleFactor} field. */
    public VkPipelineRasterizationLineStateCreateInfoEXT lineStippleFactor(@NativeType("uint32_t") int value) { nlineStippleFactor(address(), value); return this; }
    /** Sets the specified value to the {@link #lineStipplePattern} field. */
    public VkPipelineRasterizationLineStateCreateInfoEXT lineStipplePattern(@NativeType("uint16_t") short value) { nlineStipplePattern(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineRasterizationLineStateCreateInfoEXT set(
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
    public VkPipelineRasterizationLineStateCreateInfoEXT set(VkPipelineRasterizationLineStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT malloc() {
        return wrap(VkPipelineRasterizationLineStateCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT calloc() {
        return wrap(VkPipelineRasterizationLineStateCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineRasterizationLineStateCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineRasterizationLineStateCreateInfoEXT create(long address) {
        return wrap(VkPipelineRasterizationLineStateCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationLineStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineRasterizationLineStateCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationLineStateCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineRasterizationLineStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineRasterizationLineStateCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineRasterizationLineStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineRasterizationLineStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #lineRasterizationMode}. */
    public static int nlineRasterizationMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.LINERASTERIZATIONMODE); }
    /** Unsafe version of {@link #stippledLineEnable}. */
    public static int nstippledLineEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.STIPPLEDLINEENABLE); }
    /** Unsafe version of {@link #lineStippleFactor}. */
    public static int nlineStippleFactor(long struct) { return UNSAFE.getInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.LINESTIPPLEFACTOR); }
    /** Unsafe version of {@link #lineStipplePattern}. */
    public static short nlineStipplePattern(long struct) { return UNSAFE.getShort(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.LINESTIPPLEPATTERN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineRasterizationLineStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #lineRasterizationMode(int) lineRasterizationMode}. */
    public static void nlineRasterizationMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.LINERASTERIZATIONMODE, value); }
    /** Unsafe version of {@link #stippledLineEnable(boolean) stippledLineEnable}. */
    public static void nstippledLineEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.STIPPLEDLINEENABLE, value); }
    /** Unsafe version of {@link #lineStippleFactor(int) lineStippleFactor}. */
    public static void nlineStippleFactor(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.LINESTIPPLEFACTOR, value); }
    /** Unsafe version of {@link #lineStipplePattern(short) lineStipplePattern}. */
    public static void nlineStipplePattern(long struct, short value) { UNSAFE.putShort(null, struct + VkPipelineRasterizationLineStateCreateInfoEXT.LINESTIPPLEPATTERN, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineRasterizationLineStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineRasterizationLineStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineRasterizationLineStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineRasterizationLineStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineRasterizationLineStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineRasterizationLineStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineRasterizationLineStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineRasterizationLineStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineRasterizationLineStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoEXT#lineRasterizationMode} field. */
        @NativeType("VkLineRasterizationModeEXT")
        public int lineRasterizationMode() { return VkPipelineRasterizationLineStateCreateInfoEXT.nlineRasterizationMode(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoEXT#stippledLineEnable} field. */
        @NativeType("VkBool32")
        public boolean stippledLineEnable() { return VkPipelineRasterizationLineStateCreateInfoEXT.nstippledLineEnable(address()) != 0; }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoEXT#lineStippleFactor} field. */
        @NativeType("uint32_t")
        public int lineStippleFactor() { return VkPipelineRasterizationLineStateCreateInfoEXT.nlineStippleFactor(address()); }
        /** @return the value of the {@link VkPipelineRasterizationLineStateCreateInfoEXT#lineStipplePattern} field. */
        @NativeType("uint16_t")
        public short lineStipplePattern() { return VkPipelineRasterizationLineStateCreateInfoEXT.nlineStipplePattern(address()); }

        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineRasterizationLineStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTLineRasterization#VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineRasterizationLineStateCreateInfoEXT#sType} field. */
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTLineRasterization.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoEXT#pNext} field. */
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineRasterizationLineStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoEXT#lineRasterizationMode} field. */
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer lineRasterizationMode(@NativeType("VkLineRasterizationModeEXT") int value) { VkPipelineRasterizationLineStateCreateInfoEXT.nlineRasterizationMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoEXT#stippledLineEnable} field. */
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer stippledLineEnable(@NativeType("VkBool32") boolean value) { VkPipelineRasterizationLineStateCreateInfoEXT.nstippledLineEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoEXT#lineStippleFactor} field. */
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer lineStippleFactor(@NativeType("uint32_t") int value) { VkPipelineRasterizationLineStateCreateInfoEXT.nlineStippleFactor(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineRasterizationLineStateCreateInfoEXT#lineStipplePattern} field. */
        public VkPipelineRasterizationLineStateCreateInfoEXT.Buffer lineStipplePattern(@NativeType("uint16_t") short value) { VkPipelineRasterizationLineStateCreateInfoEXT.nlineStipplePattern(address(), value); return this; }

    }

}