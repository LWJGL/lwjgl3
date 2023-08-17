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
 * Request for feedback about the creation of subpass.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT}</li>
 * <li>{@code pSubpassFeedback} <b>must</b> be a valid pointer to a {@link VkRenderPassSubpassFeedbackInfoEXT} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo2}, {@link VkRenderPassCreationControlEXT}, {@link VkRenderPassSubpassFeedbackInfoEXT}, {@link VkSubpassDescription2}, {@link VK12#vkCreateRenderPass2 CreateRenderPass2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassSubpassFeedbackCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkRenderPassSubpassFeedbackInfoEXT VkRenderPassSubpassFeedbackInfoEXT} * {@link #pSubpassFeedback};
 * }</code></pre>
 */
public class VkRenderPassSubpassFeedbackCreateInfoEXT extends Struct<VkRenderPassSubpassFeedbackCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PSUBPASSFEEDBACK;

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
        PSUBPASSFEEDBACK = layout.offsetof(2);
    }

    protected VkRenderPassSubpassFeedbackCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassSubpassFeedbackCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkRenderPassSubpassFeedbackCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassSubpassFeedbackCreateInfoEXT(ByteBuffer container) {
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
    /** a pointer to a {@link VkRenderPassSubpassFeedbackInfoEXT} structure in which feedback is returned. */
    @NativeType("VkRenderPassSubpassFeedbackInfoEXT *")
    public VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback() { return npSubpassFeedback(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassSubpassFeedbackCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkRenderPassSubpassFeedbackCreateInfoEXT sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassSubpassFeedbackCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkRenderPassSubpassFeedbackInfoEXT} to the {@link #pSubpassFeedback} field. */
    public VkRenderPassSubpassFeedbackCreateInfoEXT pSubpassFeedback(@NativeType("VkRenderPassSubpassFeedbackInfoEXT *") VkRenderPassSubpassFeedbackInfoEXT value) { npSubpassFeedback(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassSubpassFeedbackCreateInfoEXT set(
        int sType,
        long pNext,
        VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback
    ) {
        sType(sType);
        pNext(pNext);
        pSubpassFeedback(pSubpassFeedback);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassSubpassFeedbackCreateInfoEXT set(VkRenderPassSubpassFeedbackCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassSubpassFeedbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT malloc() {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassSubpassFeedbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT calloc() {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkRenderPassSubpassFeedbackCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassSubpassFeedbackCreateInfoEXT} instance for the specified memory address. */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT create(long address) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassSubpassFeedbackCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderPassSubpassFeedbackCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassSubpassFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT malloc(MemoryStack stack) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkRenderPassSubpassFeedbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT calloc(MemoryStack stack) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassSubpassFeedbackCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassSubpassFeedbackCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #pSubpassFeedback}. */
    public static VkRenderPassSubpassFeedbackInfoEXT npSubpassFeedback(long struct) { return VkRenderPassSubpassFeedbackInfoEXT.create(memGetAddress(struct + VkRenderPassSubpassFeedbackCreateInfoEXT.PSUBPASSFEEDBACK)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassSubpassFeedbackCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassSubpassFeedbackCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #pSubpassFeedback(VkRenderPassSubpassFeedbackInfoEXT) pSubpassFeedback}. */
    public static void npSubpassFeedback(long struct, VkRenderPassSubpassFeedbackInfoEXT value) { memPutAddress(struct + VkRenderPassSubpassFeedbackCreateInfoEXT.PSUBPASSFEEDBACK, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkRenderPassSubpassFeedbackCreateInfoEXT.PSUBPASSFEEDBACK));
    }

    // -----------------------------------

    /** An array of {@link VkRenderPassSubpassFeedbackCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassSubpassFeedbackCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderPassSubpassFeedbackCreateInfoEXT ELEMENT_FACTORY = VkRenderPassSubpassFeedbackCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassSubpassFeedbackCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkRenderPassSubpassFeedbackCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassSubpassFeedbackCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassSubpassFeedbackCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkRenderPassSubpassFeedbackCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassSubpassFeedbackCreateInfoEXT.npNext(address()); }
        /** @return a {@link VkRenderPassSubpassFeedbackInfoEXT} view of the struct pointed to by the {@link VkRenderPassSubpassFeedbackCreateInfoEXT#pSubpassFeedback} field. */
        @NativeType("VkRenderPassSubpassFeedbackInfoEXT *")
        public VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback() { return VkRenderPassSubpassFeedbackCreateInfoEXT.npSubpassFeedback(address()); }

        /** Sets the specified value to the {@link VkRenderPassSubpassFeedbackCreateInfoEXT#sType} field. */
        public VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassSubpassFeedbackCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT} value to the {@link VkRenderPassSubpassFeedbackCreateInfoEXT#sType} field. */
        public VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkRenderPassSubpassFeedbackCreateInfoEXT#pNext} field. */
        public VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassSubpassFeedbackCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkRenderPassSubpassFeedbackInfoEXT} to the {@link VkRenderPassSubpassFeedbackCreateInfoEXT#pSubpassFeedback} field. */
        public VkRenderPassSubpassFeedbackCreateInfoEXT.Buffer pSubpassFeedback(@NativeType("VkRenderPassSubpassFeedbackInfoEXT *") VkRenderPassSubpassFeedbackInfoEXT value) { VkRenderPassSubpassFeedbackCreateInfoEXT.npSubpassFeedback(address(), value); return this; }

    }

}