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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Request feedback about the creation of render pass.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT}</li>
 * <li>{@code pRenderPassFeedback} <b>must</b> be a valid pointer to a {@link VkRenderPassCreationFeedbackInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo2}, {@link VkRenderPassCreationControlEXT}, {@link VkRenderPassCreationFeedbackInfoEXT}, {@link VK12#vkCreateRenderPass2 CreateRenderPass2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassCreationFeedbackCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkRenderPassCreationFeedbackInfoEXT VkRenderPassCreationFeedbackInfoEXT} * {@link #pRenderPassFeedback};
 * }</code></pre>
 */
public class VkRenderPassCreationFeedbackCreateInfoEXT extends Struct<VkRenderPassCreationFeedbackCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRENDERPASSFEEDBACK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRENDERPASSFEEDBACK = layout.offsetof(2);
    }

    protected VkRenderPassCreationFeedbackCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassCreationFeedbackCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassCreationFeedbackCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkRenderPassCreationFeedbackCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassCreationFeedbackCreateInfoEXT(ByteBuffer container) {
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
    /** a pointer to a {@link VkRenderPassCreationFeedbackInfoEXT} structure in which feedback is returned. */
    @NativeType("VkRenderPassCreationFeedbackInfoEXT *")
    public VkRenderPassCreationFeedbackInfoEXT pRenderPassFeedback() { return npRenderPassFeedback(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassCreationFeedbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkRenderPassCreationFeedbackCreateInfoEXT sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassCreationFeedbackCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderPassCreationFeedbackInfoEXT} to the {@link #pRenderPassFeedback} field. */
    public VkRenderPassCreationFeedbackCreateInfoEXT pRenderPassFeedback(@NativeType("VkRenderPassCreationFeedbackInfoEXT *") VkRenderPassCreationFeedbackInfoEXT value) { npRenderPassFeedback(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassCreationFeedbackCreateInfoEXT set(
        int sType,
        long pNext,
        VkRenderPassCreationFeedbackInfoEXT pRenderPassFeedback
    ) {
        sType(sType);
        pNext(pNext);
        pRenderPassFeedback(pRenderPassFeedback);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassCreationFeedbackCreateInfoEXT set(VkRenderPassCreationFeedbackCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassCreationFeedbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreationFeedbackCreateInfoEXT malloc() {
        return new VkRenderPassCreationFeedbackCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreationFeedbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassCreationFeedbackCreateInfoEXT calloc() {
        return new VkRenderPassCreationFeedbackCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassCreationFeedbackCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassCreationFeedbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassCreationFeedbackCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassCreationFeedbackCreateInfoEXT} instance for the specified memory address. */
    public static VkRenderPassCreationFeedbackCreateInfoEXT create(long address) {
        return new VkRenderPassCreationFeedbackCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreationFeedbackCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderPassCreationFeedbackCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreationFeedbackCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassCreationFeedbackCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassCreationFeedbackCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassCreationFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT malloc(MemoryStack stack) {
        return new VkRenderPassCreationFeedbackCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassCreationFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT calloc(MemoryStack stack) {
        return new VkRenderPassCreationFeedbackCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassCreationFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassCreationFeedbackCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassCreationFeedbackCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassCreationFeedbackCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pRenderPassFeedback}. */
    public static VkRenderPassCreationFeedbackInfoEXT npRenderPassFeedback(long struct) { return VkRenderPassCreationFeedbackInfoEXT.create(memGetAddress(struct + VkRenderPassCreationFeedbackCreateInfoEXT.PRENDERPASSFEEDBACK)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassCreationFeedbackCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassCreationFeedbackCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pRenderPassFeedback(VkRenderPassCreationFeedbackInfoEXT) pRenderPassFeedback}. */
    public static void npRenderPassFeedback(long struct, VkRenderPassCreationFeedbackInfoEXT value) { memPutAddress(struct + VkRenderPassCreationFeedbackCreateInfoEXT.PRENDERPASSFEEDBACK, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkRenderPassCreationFeedbackCreateInfoEXT.PRENDERPASSFEEDBACK));
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassCreationFeedbackCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassCreationFeedbackCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderPassCreationFeedbackCreateInfoEXT ELEMENT_FACTORY = VkRenderPassCreationFeedbackCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassCreationFeedbackCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassCreationFeedbackCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassCreationFeedbackCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassCreationFeedbackCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassCreationFeedbackCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkRenderPassCreationFeedbackCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassCreationFeedbackCreateInfoEXT.npNext(address()); }
        /** @return a {@link VkRenderPassCreationFeedbackInfoEXT} view of the struct pointed to by the {@link VkRenderPassCreationFeedbackCreateInfoEXT#pRenderPassFeedback} field. */
        @NativeType("VkRenderPassCreationFeedbackInfoEXT *")
        public VkRenderPassCreationFeedbackInfoEXT pRenderPassFeedback() { return VkRenderPassCreationFeedbackCreateInfoEXT.npRenderPassFeedback(address()); }

        /** Sets the specified value to the {@link VkRenderPassCreationFeedbackCreateInfoEXT#sType} field. */
        public VkRenderPassCreationFeedbackCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassCreationFeedbackCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT} value to the {@link VkRenderPassCreationFeedbackCreateInfoEXT#sType} field. */
        public VkRenderPassCreationFeedbackCreateInfoEXT.Buffer sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_CREATION_FEEDBACK_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkRenderPassCreationFeedbackCreateInfoEXT#pNext} field. */
        public VkRenderPassCreationFeedbackCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassCreationFeedbackCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderPassCreationFeedbackInfoEXT} to the {@link VkRenderPassCreationFeedbackCreateInfoEXT#pRenderPassFeedback} field. */
        public VkRenderPassCreationFeedbackCreateInfoEXT.Buffer pRenderPassFeedback(@NativeType("VkRenderPassCreationFeedbackInfoEXT *") VkRenderPassCreationFeedbackInfoEXT value) { VkRenderPassCreationFeedbackCreateInfoEXT.npRenderPassFeedback(address(), value); return this; }

    }

}