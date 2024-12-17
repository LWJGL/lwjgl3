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
 * struct VkPipelineColorBlendAttachmentState {
 *     VkBool32 blendEnable;
 *     VkBlendFactor srcColorBlendFactor;
 *     VkBlendFactor dstColorBlendFactor;
 *     VkBlendOp colorBlendOp;
 *     VkBlendFactor srcAlphaBlendFactor;
 *     VkBlendFactor dstAlphaBlendFactor;
 *     VkBlendOp alphaBlendOp;
 *     VkColorComponentFlags colorWriteMask;
 * }}</pre>
 */
public class VkPipelineColorBlendAttachmentState extends Struct<VkPipelineColorBlendAttachmentState> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLENDENABLE,
        SRCCOLORBLENDFACTOR,
        DSTCOLORBLENDFACTOR,
        COLORBLENDOP,
        SRCALPHABLENDFACTOR,
        DSTALPHABLENDFACTOR,
        ALPHABLENDOP,
        COLORWRITEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLENDENABLE = layout.offsetof(0);
        SRCCOLORBLENDFACTOR = layout.offsetof(1);
        DSTCOLORBLENDFACTOR = layout.offsetof(2);
        COLORBLENDOP = layout.offsetof(3);
        SRCALPHABLENDFACTOR = layout.offsetof(4);
        DSTALPHABLENDFACTOR = layout.offsetof(5);
        ALPHABLENDOP = layout.offsetof(6);
        COLORWRITEMASK = layout.offsetof(7);
    }

    protected VkPipelineColorBlendAttachmentState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineColorBlendAttachmentState create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineColorBlendAttachmentState(address, container);
    }

    /**
     * Creates a {@code VkPipelineColorBlendAttachmentState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorBlendAttachmentState(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code blendEnable} field. */
    @NativeType("VkBool32")
    public boolean blendEnable() { return nblendEnable(address()) != 0; }
    /** @return the value of the {@code srcColorBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int srcColorBlendFactor() { return nsrcColorBlendFactor(address()); }
    /** @return the value of the {@code dstColorBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int dstColorBlendFactor() { return ndstColorBlendFactor(address()); }
    /** @return the value of the {@code colorBlendOp} field. */
    @NativeType("VkBlendOp")
    public int colorBlendOp() { return ncolorBlendOp(address()); }
    /** @return the value of the {@code srcAlphaBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int srcAlphaBlendFactor() { return nsrcAlphaBlendFactor(address()); }
    /** @return the value of the {@code dstAlphaBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int dstAlphaBlendFactor() { return ndstAlphaBlendFactor(address()); }
    /** @return the value of the {@code alphaBlendOp} field. */
    @NativeType("VkBlendOp")
    public int alphaBlendOp() { return nalphaBlendOp(address()); }
    /** @return the value of the {@code colorWriteMask} field. */
    @NativeType("VkColorComponentFlags")
    public int colorWriteMask() { return ncolorWriteMask(address()); }

    /** Sets the specified value to the {@code blendEnable} field. */
    public VkPipelineColorBlendAttachmentState blendEnable(@NativeType("VkBool32") boolean value) { nblendEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code srcColorBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState srcColorBlendFactor(@NativeType("VkBlendFactor") int value) { nsrcColorBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code dstColorBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState dstColorBlendFactor(@NativeType("VkBlendFactor") int value) { ndstColorBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code colorBlendOp} field. */
    public VkPipelineColorBlendAttachmentState colorBlendOp(@NativeType("VkBlendOp") int value) { ncolorBlendOp(address(), value); return this; }
    /** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { nsrcAlphaBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { ndstAlphaBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code alphaBlendOp} field. */
    public VkPipelineColorBlendAttachmentState alphaBlendOp(@NativeType("VkBlendOp") int value) { nalphaBlendOp(address(), value); return this; }
    /** Sets the specified value to the {@code colorWriteMask} field. */
    public VkPipelineColorBlendAttachmentState colorWriteMask(@NativeType("VkColorComponentFlags") int value) { ncolorWriteMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorBlendAttachmentState set(
        boolean blendEnable,
        int srcColorBlendFactor,
        int dstColorBlendFactor,
        int colorBlendOp,
        int srcAlphaBlendFactor,
        int dstAlphaBlendFactor,
        int alphaBlendOp,
        int colorWriteMask
    ) {
        blendEnable(blendEnable);
        srcColorBlendFactor(srcColorBlendFactor);
        dstColorBlendFactor(dstColorBlendFactor);
        colorBlendOp(colorBlendOp);
        srcAlphaBlendFactor(srcAlphaBlendFactor);
        dstAlphaBlendFactor(dstAlphaBlendFactor);
        alphaBlendOp(alphaBlendOp);
        colorWriteMask(colorWriteMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorBlendAttachmentState set(VkPipelineColorBlendAttachmentState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineColorBlendAttachmentState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAttachmentState malloc() {
        return new VkPipelineColorBlendAttachmentState(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineColorBlendAttachmentState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAttachmentState calloc() {
        return new VkPipelineColorBlendAttachmentState(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineColorBlendAttachmentState} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorBlendAttachmentState create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineColorBlendAttachmentState(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineColorBlendAttachmentState} instance for the specified memory address. */
    public static VkPipelineColorBlendAttachmentState create(long address) {
        return new VkPipelineColorBlendAttachmentState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineColorBlendAttachmentState createSafe(long address) {
        return address == NULL ? null : new VkPipelineColorBlendAttachmentState(address, null);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAttachmentState.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAttachmentState.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAttachmentState.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineColorBlendAttachmentState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAttachmentState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineColorBlendAttachmentState.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineColorBlendAttachmentState.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineColorBlendAttachmentState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAttachmentState malloc(MemoryStack stack) {
        return new VkPipelineColorBlendAttachmentState(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineColorBlendAttachmentState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAttachmentState calloc(MemoryStack stack) {
        return new VkPipelineColorBlendAttachmentState(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAttachmentState.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineColorBlendAttachmentState.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blendEnable}. */
    public static int nblendEnable(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.BLENDENABLE); }
    /** Unsafe version of {@link #srcColorBlendFactor}. */
    public static int nsrcColorBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR); }
    /** Unsafe version of {@link #dstColorBlendFactor}. */
    public static int ndstColorBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR); }
    /** Unsafe version of {@link #colorBlendOp}. */
    public static int ncolorBlendOp(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.COLORBLENDOP); }
    /** Unsafe version of {@link #srcAlphaBlendFactor}. */
    public static int nsrcAlphaBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR); }
    /** Unsafe version of {@link #dstAlphaBlendFactor}. */
    public static int ndstAlphaBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR); }
    /** Unsafe version of {@link #alphaBlendOp}. */
    public static int nalphaBlendOp(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.ALPHABLENDOP); }
    /** Unsafe version of {@link #colorWriteMask}. */
    public static int ncolorWriteMask(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.COLORWRITEMASK); }

    /** Unsafe version of {@link #blendEnable(boolean) blendEnable}. */
    public static void nblendEnable(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.BLENDENABLE, value); }
    /** Unsafe version of {@link #srcColorBlendFactor(int) srcColorBlendFactor}. */
    public static void nsrcColorBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR, value); }
    /** Unsafe version of {@link #dstColorBlendFactor(int) dstColorBlendFactor}. */
    public static void ndstColorBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR, value); }
    /** Unsafe version of {@link #colorBlendOp(int) colorBlendOp}. */
    public static void ncolorBlendOp(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.COLORBLENDOP, value); }
    /** Unsafe version of {@link #srcAlphaBlendFactor(int) srcAlphaBlendFactor}. */
    public static void nsrcAlphaBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR, value); }
    /** Unsafe version of {@link #dstAlphaBlendFactor(int) dstAlphaBlendFactor}. */
    public static void ndstAlphaBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR, value); }
    /** Unsafe version of {@link #alphaBlendOp(int) alphaBlendOp}. */
    public static void nalphaBlendOp(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.ALPHABLENDOP, value); }
    /** Unsafe version of {@link #colorWriteMask(int) colorWriteMask}. */
    public static void ncolorWriteMask(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.COLORWRITEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineColorBlendAttachmentState} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendAttachmentState, Buffer> implements NativeResource {

        private static final VkPipelineColorBlendAttachmentState ELEMENT_FACTORY = VkPipelineColorBlendAttachmentState.create(-1L);

        /**
         * Creates a new {@code VkPipelineColorBlendAttachmentState.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorBlendAttachmentState#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineColorBlendAttachmentState getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code blendEnable} field. */
        @NativeType("VkBool32")
        public boolean blendEnable() { return VkPipelineColorBlendAttachmentState.nblendEnable(address()) != 0; }
        /** @return the value of the {@code srcColorBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int srcColorBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address()); }
        /** @return the value of the {@code dstColorBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int dstColorBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address()); }
        /** @return the value of the {@code colorBlendOp} field. */
        @NativeType("VkBlendOp")
        public int colorBlendOp() { return VkPipelineColorBlendAttachmentState.ncolorBlendOp(address()); }
        /** @return the value of the {@code srcAlphaBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int srcAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address()); }
        /** @return the value of the {@code dstAlphaBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int dstAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address()); }
        /** @return the value of the {@code alphaBlendOp} field. */
        @NativeType("VkBlendOp")
        public int alphaBlendOp() { return VkPipelineColorBlendAttachmentState.nalphaBlendOp(address()); }
        /** @return the value of the {@code colorWriteMask} field. */
        @NativeType("VkColorComponentFlags")
        public int colorWriteMask() { return VkPipelineColorBlendAttachmentState.ncolorWriteMask(address()); }

        /** Sets the specified value to the {@code blendEnable} field. */
        public VkPipelineColorBlendAttachmentState.Buffer blendEnable(@NativeType("VkBool32") boolean value) { VkPipelineColorBlendAttachmentState.nblendEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code srcColorBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer srcColorBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code dstColorBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer dstColorBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code colorBlendOp} field. */
        public VkPipelineColorBlendAttachmentState.Buffer colorBlendOp(@NativeType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.ncolorBlendOp(address(), value); return this; }
        /** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code alphaBlendOp} field. */
        public VkPipelineColorBlendAttachmentState.Buffer alphaBlendOp(@NativeType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.nalphaBlendOp(address(), value); return this; }
        /** Sets the specified value to the {@code colorWriteMask} field. */
        public VkPipelineColorBlendAttachmentState.Buffer colorWriteMask(@NativeType("VkColorComponentFlags") int value) { VkPipelineColorBlendAttachmentState.ncolorWriteMask(address(), value); return this; }

    }

}