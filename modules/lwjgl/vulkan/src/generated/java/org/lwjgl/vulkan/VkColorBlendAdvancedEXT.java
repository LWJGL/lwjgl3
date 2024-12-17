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
 * struct VkColorBlendAdvancedEXT {
 *     VkBlendOp advancedBlendOp;
 *     VkBool32 srcPremultiplied;
 *     VkBool32 dstPremultiplied;
 *     VkBlendOverlapEXT blendOverlap;
 *     VkBool32 clampResults;
 * }}</pre>
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

    /** @return the value of the {@code advancedBlendOp} field. */
    @NativeType("VkBlendOp")
    public int advancedBlendOp() { return nadvancedBlendOp(address()); }
    /** @return the value of the {@code srcPremultiplied} field. */
    @NativeType("VkBool32")
    public boolean srcPremultiplied() { return nsrcPremultiplied(address()) != 0; }
    /** @return the value of the {@code dstPremultiplied} field. */
    @NativeType("VkBool32")
    public boolean dstPremultiplied() { return ndstPremultiplied(address()) != 0; }
    /** @return the value of the {@code blendOverlap} field. */
    @NativeType("VkBlendOverlapEXT")
    public int blendOverlap() { return nblendOverlap(address()); }
    /** @return the value of the {@code clampResults} field. */
    @NativeType("VkBool32")
    public boolean clampResults() { return nclampResults(address()) != 0; }

    /** Sets the specified value to the {@code advancedBlendOp} field. */
    public VkColorBlendAdvancedEXT advancedBlendOp(@NativeType("VkBlendOp") int value) { nadvancedBlendOp(address(), value); return this; }
    /** Sets the specified value to the {@code srcPremultiplied} field. */
    public VkColorBlendAdvancedEXT srcPremultiplied(@NativeType("VkBool32") boolean value) { nsrcPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code dstPremultiplied} field. */
    public VkColorBlendAdvancedEXT dstPremultiplied(@NativeType("VkBool32") boolean value) { ndstPremultiplied(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code blendOverlap} field. */
    public VkColorBlendAdvancedEXT blendOverlap(@NativeType("VkBlendOverlapEXT") int value) { nblendOverlap(address(), value); return this; }
    /** Sets the specified value to the {@code clampResults} field. */
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
    public static @Nullable VkColorBlendAdvancedEXT createSafe(long address) {
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
    public static VkColorBlendAdvancedEXT.@Nullable Buffer createSafe(long address, int capacity) {
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
    public static int nadvancedBlendOp(long struct) { return memGetInt(struct + VkColorBlendAdvancedEXT.ADVANCEDBLENDOP); }
    /** Unsafe version of {@link #srcPremultiplied}. */
    public static int nsrcPremultiplied(long struct) { return memGetInt(struct + VkColorBlendAdvancedEXT.SRCPREMULTIPLIED); }
    /** Unsafe version of {@link #dstPremultiplied}. */
    public static int ndstPremultiplied(long struct) { return memGetInt(struct + VkColorBlendAdvancedEXT.DSTPREMULTIPLIED); }
    /** Unsafe version of {@link #blendOverlap}. */
    public static int nblendOverlap(long struct) { return memGetInt(struct + VkColorBlendAdvancedEXT.BLENDOVERLAP); }
    /** Unsafe version of {@link #clampResults}. */
    public static int nclampResults(long struct) { return memGetInt(struct + VkColorBlendAdvancedEXT.CLAMPRESULTS); }

    /** Unsafe version of {@link #advancedBlendOp(int) advancedBlendOp}. */
    public static void nadvancedBlendOp(long struct, int value) { memPutInt(struct + VkColorBlendAdvancedEXT.ADVANCEDBLENDOP, value); }
    /** Unsafe version of {@link #srcPremultiplied(boolean) srcPremultiplied}. */
    public static void nsrcPremultiplied(long struct, int value) { memPutInt(struct + VkColorBlendAdvancedEXT.SRCPREMULTIPLIED, value); }
    /** Unsafe version of {@link #dstPremultiplied(boolean) dstPremultiplied}. */
    public static void ndstPremultiplied(long struct, int value) { memPutInt(struct + VkColorBlendAdvancedEXT.DSTPREMULTIPLIED, value); }
    /** Unsafe version of {@link #blendOverlap(int) blendOverlap}. */
    public static void nblendOverlap(long struct, int value) { memPutInt(struct + VkColorBlendAdvancedEXT.BLENDOVERLAP, value); }
    /** Unsafe version of {@link #clampResults(boolean) clampResults}. */
    public static void nclampResults(long struct, int value) { memPutInt(struct + VkColorBlendAdvancedEXT.CLAMPRESULTS, value); }

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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkColorBlendAdvancedEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code advancedBlendOp} field. */
        @NativeType("VkBlendOp")
        public int advancedBlendOp() { return VkColorBlendAdvancedEXT.nadvancedBlendOp(address()); }
        /** @return the value of the {@code srcPremultiplied} field. */
        @NativeType("VkBool32")
        public boolean srcPremultiplied() { return VkColorBlendAdvancedEXT.nsrcPremultiplied(address()) != 0; }
        /** @return the value of the {@code dstPremultiplied} field. */
        @NativeType("VkBool32")
        public boolean dstPremultiplied() { return VkColorBlendAdvancedEXT.ndstPremultiplied(address()) != 0; }
        /** @return the value of the {@code blendOverlap} field. */
        @NativeType("VkBlendOverlapEXT")
        public int blendOverlap() { return VkColorBlendAdvancedEXT.nblendOverlap(address()); }
        /** @return the value of the {@code clampResults} field. */
        @NativeType("VkBool32")
        public boolean clampResults() { return VkColorBlendAdvancedEXT.nclampResults(address()) != 0; }

        /** Sets the specified value to the {@code advancedBlendOp} field. */
        public VkColorBlendAdvancedEXT.Buffer advancedBlendOp(@NativeType("VkBlendOp") int value) { VkColorBlendAdvancedEXT.nadvancedBlendOp(address(), value); return this; }
        /** Sets the specified value to the {@code srcPremultiplied} field. */
        public VkColorBlendAdvancedEXT.Buffer srcPremultiplied(@NativeType("VkBool32") boolean value) { VkColorBlendAdvancedEXT.nsrcPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code dstPremultiplied} field. */
        public VkColorBlendAdvancedEXT.Buffer dstPremultiplied(@NativeType("VkBool32") boolean value) { VkColorBlendAdvancedEXT.ndstPremultiplied(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code blendOverlap} field. */
        public VkColorBlendAdvancedEXT.Buffer blendOverlap(@NativeType("VkBlendOverlapEXT") int value) { VkColorBlendAdvancedEXT.nblendOverlap(address(), value); return this; }
        /** Sets the specified value to the {@code clampResults} field. */
        public VkColorBlendAdvancedEXT.Buffer clampResults(@NativeType("VkBool32") boolean value) { VkColorBlendAdvancedEXT.nclampResults(address(), value ? 1 : 0); return this; }

    }

}