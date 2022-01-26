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
 * Structure specifying parameters that affect advanced blend operations.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not present, {@code srcPremultiplied} and {@code dstPremultiplied} are both considered to be {@link VK10#VK_TRUE TRUE}, and {@code blendOverlap} is considered to be {@link EXTBlendOperationAdvanced#VK_BLEND_OVERLAP_UNCORRELATED_EXT BLEND_OVERLAP_UNCORRELATED_EXT}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendNonPremultipliedSrcColor">non-premultiplied source color</a> property is not supported, {@code srcPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendNonPremultipliedDstColor">non-premultiplied destination color</a> property is not supported, {@code dstPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendCorrelatedOverlap">correlated overlap</a> property is not supported, {@code blendOverlap} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_BLEND_OVERLAP_UNCORRELATED_EXT BLEND_OVERLAP_UNCORRELATED_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT}</li>
 * <li>{@code blendOverlap} <b>must</b> be a valid {@code VkBlendOverlapEXT} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineColorBlendAdvancedStateCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #srcPremultiplied};
 *     VkBool32 {@link #dstPremultiplied};
 *     VkBlendOverlapEXT {@link #blendOverlap};
 * }</code></pre>
 */
public class VkPipelineColorBlendAdvancedStateCreateInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCPREMULTIPLIED,
        DSTPREMULTIPLIED,
        BLENDOVERLAP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCPREMULTIPLIED = layout.offsetof(2);
        DSTPREMULTIPLIED = layout.offsetof(3);
        BLENDOVERLAP = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(ByteBuffer container) {
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
    /** specifies whether the source color of the blend operation is treated as premultiplied. */
    @NativeType("VkBool32")
    public boolean srcPremultiplied() { return nsrcPremultiplied(address()) != 0; }
    /** specifies whether the destination color of the blend operation is treated as premultiplied. */
    @NativeType("VkBool32")
    public boolean dstPremultiplied() { return ndstPremultiplied(address()) != 0; }
    /** a {@code VkBlendOverlapEXT} value specifying how the source and destination sample’s coverage is correlated. */
    @NativeType("VkBlendOverlapEXT")
    public int blendOverlap() { return nblendOverlap(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #srcPremultiplied} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT srcPremultiplied(@NativeType("VkBool32") boolean value) { nsrcPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #dstPremultiplied} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT dstPremultiplied(@NativeType("VkBool32") boolean value) { ndstPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #blendOverlap} field. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT blendOverlap(@NativeType("VkBlendOverlapEXT") int value) { nblendOverlap(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(
        int sType,
        long pNext,
        boolean srcPremultiplied,
        boolean dstPremultiplied,
        int blendOverlap
    ) {
        sType(sType);
        pNext(pNext);
        srcPremultiplied(srcPremultiplied);
        dstPremultiplied(dstPremultiplied);
        blendOverlap(blendOverlap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT set(VkPipelineColorBlendAdvancedStateCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT malloc() {
        return wrap(VkPipelineColorBlendAdvancedStateCreateInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT calloc() {
        return wrap(VkPipelineColorBlendAdvancedStateCreateInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineColorBlendAdvancedStateCreateInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance for the specified memory address. */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT create(long address) {
        return wrap(VkPipelineColorBlendAdvancedStateCreateInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineColorBlendAdvancedStateCreateInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT malloc(MemoryStack stack) {
        return wrap(VkPipelineColorBlendAdvancedStateCreateInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT calloc(MemoryStack stack) {
        return wrap(VkPipelineColorBlendAdvancedStateCreateInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #srcPremultiplied}. */
    public static int nsrcPremultiplied(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.SRCPREMULTIPLIED); }
    /** Unsafe version of {@link #dstPremultiplied}. */
    public static int ndstPremultiplied(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.DSTPREMULTIPLIED); }
    /** Unsafe version of {@link #blendOverlap}. */
    public static int nblendOverlap(long struct) { return UNSAFE.getInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.BLENDOVERLAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #srcPremultiplied(boolean) srcPremultiplied}. */
    public static void nsrcPremultiplied(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.SRCPREMULTIPLIED, value); }
    /** Unsafe version of {@link #dstPremultiplied(boolean) dstPremultiplied}. */
    public static void ndstPremultiplied(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.DSTPREMULTIPLIED, value); }
    /** Unsafe version of {@link #blendOverlap(int) blendOverlap}. */
    public static void nblendOverlap(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineColorBlendAdvancedStateCreateInfoEXT.BLENDOVERLAP, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendAdvancedStateCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkPipelineColorBlendAdvancedStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineColorBlendAdvancedStateCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineColorBlendAdvancedStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#srcPremultiplied} field. */
        @NativeType("VkBool32")
        public boolean srcPremultiplied() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsrcPremultiplied(address()) != 0; }
        /** @return the value of the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#dstPremultiplied} field. */
        @NativeType("VkBool32")
        public boolean dstPremultiplied() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.ndstPremultiplied(address()) != 0; }
        /** @return the value of the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#blendOverlap} field. */
        @NativeType("VkBlendOverlapEXT")
        public int blendOverlap() { return VkPipelineColorBlendAdvancedStateCreateInfoEXT.nblendOverlap(address()); }

        /** Sets the specified value to the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#sType} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTBlendOperationAdvanced#VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT} value to the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#sType} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer sType$Default() { return sType(EXTBlendOperationAdvanced.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#pNext} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#srcPremultiplied} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer srcPremultiplied(@NativeType("VkBool32") boolean value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.nsrcPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#dstPremultiplied} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer dstPremultiplied(@NativeType("VkBool32") boolean value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.ndstPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPipelineColorBlendAdvancedStateCreateInfoEXT#blendOverlap} field. */
        public VkPipelineColorBlendAdvancedStateCreateInfoEXT.Buffer blendOverlap(@NativeType("VkBlendOverlapEXT") int value) { VkPipelineColorBlendAdvancedStateCreateInfoEXT.nblendOverlap(address(), value); return this; }

    }

}