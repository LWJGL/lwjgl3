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
 * Control about the creation of render pass or subpass.
 * 
 * <h5>Description</h5>
 * 
 * <p>If a {@link VkRenderPassCreationControlEXT} structure is included in the {@code pNext} chain of {@link VkRenderPassCreateInfo2} and its value of {@code disallowMerging} is {@link VK10#VK_TRUE TRUE}, the implementation will disable subpass merging for the entire render pass. If a {@link VkRenderPassCreationControlEXT} structure is included in the {@code pNext} chain of {@link VkSubpassDescription2} and its value of {@code disallowMerging} is {@link VK10#VK_TRUE TRUE}, the implementation will disable merging the described subpass with previous subpasses in the render pass.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo2}, {@link VkSubpassDescription2}, {@link VK12#vkCreateRenderPass2 CreateRenderPass2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreationControlEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkBool32 {@link #disallowMerging};
 * }</code></pre>
 */
public class VkRenderPassCreationControlEXT extends Struct<VkRenderPassCreationControlEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DISALLOWMERGING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISALLOWMERGING = layout.offsetof(2);
    }

    protected VkRenderPassCreationControlEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassCreationControlEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassCreationControlEXT(address, container);
    }

    /**
     * Creates a {@code VkRenderPassCreationControlEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreationControlEXT(ByteBuffer container) {
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
    /** a boolean value indicating whether subpass merging will be disabled. */
    @NativeType("VkBool32")
    public boolean disallowMerging() { return ndisallowMerging(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassCreationControlEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT} value to the {@link #sType} field. */
    public VkRenderPassCreationControlEXT sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassCreationControlEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #disallowMerging} field. */
    public VkRenderPassCreationControlEXT disallowMerging(@NativeType("VkBool32") boolean value) { ndisallowMerging(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreationControlEXT set(
        int sType,
        long pNext,
        boolean disallowMerging
    ) {
        sType(sType);
        pNext(pNext);
        disallowMerging(disallowMerging);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassCreationControlEXT set(VkRenderPassCreationControlEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreationControlEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreationControlEXT malloc() {
        return new VkRenderPassCreationControlEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreationControlEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreationControlEXT calloc() {
        return new VkRenderPassCreationControlEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreationControlEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreationControlEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreationControlEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreationControlEXT} instance for the specified memory address. */
    public static VkRenderPassCreationControlEXT create(long address) {
        return new VkRenderPassCreationControlEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreationControlEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderPassCreationControlEXT(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassCreationControlEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationControlEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreationControlEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationControlEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreationControlEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationControlEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassCreationControlEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationControlEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreationControlEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassCreationControlEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreationControlEXT malloc(MemoryStack stack) {
        return new VkRenderPassCreationControlEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassCreationControlEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreationControlEXT calloc(MemoryStack stack) {
        return new VkRenderPassCreationControlEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassCreationControlEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationControlEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreationControlEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationControlEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreationControlEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreationControlEXT.PNEXT); }
    /** Unsafe version of {@link #disallowMerging}. */
    public static int ndisallowMerging(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreationControlEXT.DISALLOWMERGING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreationControlEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreationControlEXT.PNEXT, value); }
    /** Unsafe version of {@link #disallowMerging(boolean) disallowMerging}. */
    public static void ndisallowMerging(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreationControlEXT.DISALLOWMERGING, value); }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreationControlEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreationControlEXT, Buffer> implements NativeResource {

        private static final VkRenderPassCreationControlEXT ELEMENT_FACTORY = VkRenderPassCreationControlEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreationControlEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreationControlEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassCreationControlEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassCreationControlEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreationControlEXT.nsType(address()); }
        /** @return the value of the {@link VkRenderPassCreationControlEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreationControlEXT.npNext(address()); }
        /** @return the value of the {@link VkRenderPassCreationControlEXT#disallowMerging} field. */
        @NativeType("VkBool32")
        public boolean disallowMerging() { return VkRenderPassCreationControlEXT.ndisallowMerging(address()) != 0; }

        /** Sets the specified value to the {@link VkRenderPassCreationControlEXT#sType} field. */
        public VkRenderPassCreationControlEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreationControlEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT} value to the {@link VkRenderPassCreationControlEXT#sType} field. */
        public VkRenderPassCreationControlEXT.Buffer sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_CONTROL_EXT); }
        /** Sets the specified value to the {@link VkRenderPassCreationControlEXT#pNext} field. */
        public VkRenderPassCreationControlEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreationControlEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderPassCreationControlEXT#disallowMerging} field. */
        public VkRenderPassCreationControlEXT.Buffer disallowMerging(@NativeType("VkBool32") boolean value) { VkRenderPassCreationControlEXT.ndisallowMerging(address(), value ? 1 : 0); return this; }

    }

}