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
 * Structure specifying the advanced blend operation parameters for an attachment.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendNonPremultipliedSrcColor">non-premultiplied source color</a> property is not supported, {@code srcPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendNonPremultipliedDstColor">non-premultiplied destination color</a> property is not supported, {@code dstPremultiplied} <b>must</b> be {@link VK10#VK_TRUE TRUE}</li>
 * <li>If the <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-advancedBlendCorrelatedOverlap">correlated overlap</a> property is not supported, {@code blendOverlap} <b>must</b> be {@link EXTBlendOperationAdvanced#VK_BLEND_OVERLAP_UNCORRELATED_EXT BLEND_OVERLAP_UNCORRELATED_EXT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code advancedBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
 * <li>{@code blendOverlap} <b>must</b> be a valid {@code VkBlendOverlapEXT} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTShaderObject#vkCmdSetColorBlendAdvancedEXT CmdSetColorBlendAdvancedEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkColorBlendAdvancedEXT {
 *     VkBlendOp {@link #advancedBlendOp};
 *     VkBool32 {@link #srcPremultiplied};
 *     VkBool32 {@link #dstPremultiplied};
 *     VkBlendOverlapEXT {@link #blendOverlap};
 *     VkBool32 {@link #clampResults};
 * }</code></pre>
 */
public class VkColorBlendAdvancedEXT extends Struct<VkColorBlendAdvancedEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ADVANCEDBLENDOP,
        SRCPREMULTIPLIED,
        DSTPREMULTIPLIED,
        BLENDOVERLAP,
        CLAMPRESULTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ADVANCEDBLENDOP = layout.offsetof(0);
        SRCPREMULTIPLIED = layout.offsetof(1);
        DSTPREMULTIPLIED = layout.offsetof(2);
        BLENDOVERLAP = layout.offsetof(3);
        CLAMPRESULTS = layout.offsetof(4);
    }

    protected VkColorBlendAdvancedEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkColorBlendAdvancedEXT create(long address, @Nullable ByteBuffer container) {
        return new VkColorBlendAdvancedEXT(address, container);
    }

    /**
     * Creates a {@code VkColorBlendAdvancedEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkColorBlendAdvancedEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** selects which blend operation is used to calculate the RGB values to write to the color attachment. */
    @NativeType("VkBlendOp")
    public int advancedBlendOp() { return nadvancedBlendOp(address()); }
    /** specifies whether the source color of the blend operation is treated as premultiplied. */
    @NativeType("VkBool32")
    public boolean srcPremultiplied() { return nsrcPremultiplied(address()) != 0; }
    /** specifies whether the destination color of the blend operation is treated as premultiplied. */
    @NativeType("VkBool32")
    public boolean dstPremultiplied() { return ndstPremultiplied(address()) != 0; }
    /** a {@code VkBlendOverlapEXT} value specifying how the source and destination sample’s coverage is correlated. */
    @NativeType("VkBlendOverlapEXT")
    public int blendOverlap() { return nblendOverlap(address()); }
    /** specifies the results must be clamped to the [0,1] range before writing to the attachment, which is useful when the attachment format is not normalized fixed-point. */
    @NativeType("VkBool32")
    public boolean clampResults() { return nclampResults(address()) != 0; }

    /** Sets the specified value to the {@link #advancedBlendOp} field. */
    public VkColorBlendAdvancedEXT advancedBlendOp(@NativeType("VkBlendOp") int value) { nadvancedBlendOp(address(), value); return this; }
    /** Sets the specified value to the {@link #srcPremultiplied} field. */
    public VkColorBlendAdvancedEXT srcPremultiplied(@NativeType("VkBool32") boolean value) { nsrcPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #dstPremultiplied} field. */
    public VkColorBlendAdvancedEXT dstPremultiplied(@NativeType("VkBool32") boolean value) { ndstPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #blendOverlap} field. */
    public VkColorBlendAdvancedEXT blendOverlap(@NativeType("VkBlendOverlapEXT") int value) { nblendOverlap(address(), value); return this; }
    /** Sets the specified value to the {@link #clampResults} field. */
    public VkColorBlendAdvancedEXT clampResults(@NativeType("VkBool32") boolean value) { nclampResults(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkColorBlendAdvancedEXT set(
        int advancedBlendOp,
        boolean srcPremultiplied,
        boolean dstPremultiplied,
        int blendOverlap,
        boolean clampResults
    ) {
        advancedBlendOp(advancedBlendOp);
        srcPremultiplied(srcPremultiplied);
        dstPremultiplied(dstPremultiplied);
        blendOverlap(blendOverlap);
        clampResults(clampResults);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkColorBlendAdvancedEXT set(VkColorBlendAdvancedEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkColorBlendAdvancedEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkColorBlendAdvancedEXT malloc() {
        return new VkColorBlendAdvancedEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkColorBlendAdvancedEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkColorBlendAdvancedEXT calloc() {
        return new VkColorBlendAdvancedEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkColorBlendAdvancedEXT} instance allocated with {@link BufferUtils}. */
    public static VkColorBlendAdvancedEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkColorBlendAdvancedEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkColorBlendAdvancedEXT} instance for the specified memory address. */
    public static VkColorBlendAdvancedEXT create(long address) {
        return new VkColorBlendAdvancedEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkColorBlendAdvancedEXT createSafe(long address) {
        return address == NULL ? null : new VkColorBlendAdvancedEXT(address, null);
    }

    /**
     * Returns a new {@link VkColorBlendAdvancedEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkColorBlendAdvancedEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkColorBlendAdvancedEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkColorBlendAdvancedEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkColorBlendAdvancedEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkColorBlendAdvancedEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkColorBlendAdvancedEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkColorBlendAdvancedEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkColorBlendAdvancedEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkColorBlendAdvancedEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkColorBlendAdvancedEXT malloc(MemoryStack stack) {
        return new VkColorBlendAdvancedEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkColorBlendAdvancedEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkColorBlendAdvancedEXT calloc(MemoryStack stack) {
        return new VkColorBlendAdvancedEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkColorBlendAdvancedEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkColorBlendAdvancedEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkColorBlendAdvancedEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkColorBlendAdvancedEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #advancedBlendOp}. */
    public static int nadvancedBlendOp(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendAdvancedEXT.ADVANCEDBLENDOP); }
    /** Unsafe version of {@link #srcPremultiplied}. */
    public static int nsrcPremultiplied(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendAdvancedEXT.SRCPREMULTIPLIED); }
    /** Unsafe version of {@link #dstPremultiplied}. */
    public static int ndstPremultiplied(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendAdvancedEXT.DSTPREMULTIPLIED); }
    /** Unsafe version of {@link #blendOverlap}. */
    public static int nblendOverlap(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendAdvancedEXT.BLENDOVERLAP); }
    /** Unsafe version of {@link #clampResults}. */
    public static int nclampResults(long struct) { return UNSAFE.getInt(null, struct + VkColorBlendAdvancedEXT.CLAMPRESULTS); }

    /** Unsafe version of {@link #advancedBlendOp(int) advancedBlendOp}. */
    public static void nadvancedBlendOp(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendAdvancedEXT.ADVANCEDBLENDOP, value); }
    /** Unsafe version of {@link #srcPremultiplied(boolean) srcPremultiplied}. */
    public static void nsrcPremultiplied(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendAdvancedEXT.SRCPREMULTIPLIED, value); }
    /** Unsafe version of {@link #dstPremultiplied(boolean) dstPremultiplied}. */
    public static void ndstPremultiplied(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendAdvancedEXT.DSTPREMULTIPLIED, value); }
    /** Unsafe version of {@link #blendOverlap(int) blendOverlap}. */
    public static void nblendOverlap(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendAdvancedEXT.BLENDOVERLAP, value); }
    /** Unsafe version of {@link #clampResults(boolean) clampResults}. */
    public static void nclampResults(long struct, int value) { UNSAFE.putInt(null, struct + VkColorBlendAdvancedEXT.CLAMPRESULTS, value); }

    // -----------------------------------

    /** An array of {@link VkColorBlendAdvancedEXT} structs. */
    public static class Buffer extends StructBuffer<VkColorBlendAdvancedEXT, Buffer> implements NativeResource {

        private static final VkColorBlendAdvancedEXT ELEMENT_FACTORY = VkColorBlendAdvancedEXT.create(-1L);

        /**
         * Creates a new {@code VkColorBlendAdvancedEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkColorBlendAdvancedEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkColorBlendAdvancedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkColorBlendAdvancedEXT#advancedBlendOp} field. */
        @NativeType("VkBlendOp")
        public int advancedBlendOp() { return VkColorBlendAdvancedEXT.nadvancedBlendOp(address()); }
        /** @return the value of the {@link VkColorBlendAdvancedEXT#srcPremultiplied} field. */
        @NativeType("VkBool32")
        public boolean srcPremultiplied() { return VkColorBlendAdvancedEXT.nsrcPremultiplied(address()) != 0; }
        /** @return the value of the {@link VkColorBlendAdvancedEXT#dstPremultiplied} field. */
        @NativeType("VkBool32")
        public boolean dstPremultiplied() { return VkColorBlendAdvancedEXT.ndstPremultiplied(address()) != 0; }
        /** @return the value of the {@link VkColorBlendAdvancedEXT#blendOverlap} field. */
        @NativeType("VkBlendOverlapEXT")
        public int blendOverlap() { return VkColorBlendAdvancedEXT.nblendOverlap(address()); }
        /** @return the value of the {@link VkColorBlendAdvancedEXT#clampResults} field. */
        @NativeType("VkBool32")
        public boolean clampResults() { return VkColorBlendAdvancedEXT.nclampResults(address()) != 0; }

        /** Sets the specified value to the {@link VkColorBlendAdvancedEXT#advancedBlendOp} field. */
        public VkColorBlendAdvancedEXT.Buffer advancedBlendOp(@NativeType("VkBlendOp") int value) { VkColorBlendAdvancedEXT.nadvancedBlendOp(address(), value); return this; }
        /** Sets the specified value to the {@link VkColorBlendAdvancedEXT#srcPremultiplied} field. */
        public VkColorBlendAdvancedEXT.Buffer srcPremultiplied(@NativeType("VkBool32") boolean value) { VkColorBlendAdvancedEXT.nsrcPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkColorBlendAdvancedEXT#dstPremultiplied} field. */
        public VkColorBlendAdvancedEXT.Buffer dstPremultiplied(@NativeType("VkBool32") boolean value) { VkColorBlendAdvancedEXT.ndstPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkColorBlendAdvancedEXT#blendOverlap} field. */
        public VkColorBlendAdvancedEXT.Buffer blendOverlap(@NativeType("VkBlendOverlapEXT") int value) { VkColorBlendAdvancedEXT.nblendOverlap(address(), value); return this; }
        /** Sets the specified value to the {@link VkColorBlendAdvancedEXT#clampResults} field. */
        public VkColorBlendAdvancedEXT.Buffer clampResults(@NativeType("VkBool32") boolean value) { VkColorBlendAdvancedEXT.nclampResults(address(), value ? 1 : 0); return this; }

    }

}