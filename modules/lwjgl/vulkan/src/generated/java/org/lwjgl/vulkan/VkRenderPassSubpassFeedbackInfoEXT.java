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

import static org.lwjgl.vulkan.VK10.*;

/**
 * Feedback about the creation of subpass.
 * 
 * <h5>Description</h5>
 * 
 * <p>An implementation writes the proper value to {@code subpassMergeStatus}. Subpasses merged will have the same {@code postMergeIndex}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT}</li>
 * <li>{@code subpassMergeStatus} <b>must</b> be a valid {@code VkSubpassMergeStatusEXT} value</li>
 * <li>{@code description} <b>must</b> be a null-terminated UTF-8 string whose length is less than or equal to VK_MAX_DESCRIPTION_SIZE</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassCreateInfo2}, {@link VkRenderPassCreationControlEXT}, {@link VkSubpassDescription2}, {@link VK12#vkCreateRenderPass2 CreateRenderPass2}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassSubpassFeedbackInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSubpassMergeStatusEXT {@link #subpassMergeStatus};
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 *     uint32_t {@link #postMergeIndex};
 * }</code></pre>
 */
public class VkRenderPassSubpassFeedbackInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBPASSMERGESTATUS,
        DESCRIPTION,
        POSTMERGEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBPASSMERGESTATUS = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
        POSTMERGEINDEX = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkRenderPassSubpassFeedbackInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassSubpassFeedbackInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to an extension-specific structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkSubpassMergeStatusEXT} value specifying information about whether the subpass is merged with previous subpass and the reason why it is not merged. */
    @NativeType("VkSubpassMergeStatusEXT")
    public int subpassMergeStatus() { return nsubpassMergeStatus(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which provides additional details. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() { return ndescription(address()); }
    /** an array of {@link VK10#VK_MAX_DESCRIPTION_SIZE MAX_DESCRIPTION_SIZE} {@code char} containing a null-terminated UTF-8 string which provides additional details. */
    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() { return ndescriptionString(address()); }
    /** the subpass index after the subpass merging. */
    @NativeType("uint32_t")
    public int postMergeIndex() { return npostMergeIndex(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkRenderPassSubpassFeedbackInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT} value to the {@link #sType} field. */
    public VkRenderPassSubpassFeedbackInfoEXT sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkRenderPassSubpassFeedbackInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #subpassMergeStatus} field. */
    public VkRenderPassSubpassFeedbackInfoEXT subpassMergeStatus(@NativeType("VkSubpassMergeStatusEXT") int value) { nsubpassMergeStatus(address(), value); return this; }
    /** Copies the specified encoded string to the {@link #description} field. */
    public VkRenderPassSubpassFeedbackInfoEXT description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { ndescription(address(), value); return this; }
    /** Sets the specified value to the {@link #postMergeIndex} field. */
    public VkRenderPassSubpassFeedbackInfoEXT postMergeIndex(@NativeType("uint32_t") int value) { npostMergeIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassSubpassFeedbackInfoEXT set(
        int sType,
        long pNext,
        int subpassMergeStatus,
        ByteBuffer description,
        int postMergeIndex
    ) {
        sType(sType);
        pNext(pNext);
        subpassMergeStatus(subpassMergeStatus);
        description(description);
        postMergeIndex(postMergeIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassSubpassFeedbackInfoEXT set(VkRenderPassSubpassFeedbackInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkRenderPassSubpassFeedbackInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassSubpassFeedbackInfoEXT malloc() {
        return wrap(VkRenderPassSubpassFeedbackInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkRenderPassSubpassFeedbackInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassSubpassFeedbackInfoEXT calloc() {
        return wrap(VkRenderPassSubpassFeedbackInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkRenderPassSubpassFeedbackInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassSubpassFeedbackInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkRenderPassSubpassFeedbackInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkRenderPassSubpassFeedbackInfoEXT} instance for the specified memory address. */
    public static VkRenderPassSubpassFeedbackInfoEXT create(long address) {
        return wrap(VkRenderPassSubpassFeedbackInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassSubpassFeedbackInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkRenderPassSubpassFeedbackInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkRenderPassSubpassFeedbackInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSubpassFeedbackInfoEXT malloc(MemoryStack stack) {
        return wrap(VkRenderPassSubpassFeedbackInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkRenderPassSubpassFeedbackInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassSubpassFeedbackInfoEXT calloc(MemoryStack stack) {
        return wrap(VkRenderPassSubpassFeedbackInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassSubpassFeedbackInfoEXT.PNEXT); }
    /** Unsafe version of {@link #subpassMergeStatus}. */
    public static int nsubpassMergeStatus(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.SUBPASSMERGESTATUS); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkRenderPassSubpassFeedbackInfoEXT.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkRenderPassSubpassFeedbackInfoEXT.DESCRIPTION); }
    /** Unsafe version of {@link #postMergeIndex}. */
    public static int npostMergeIndex(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.POSTMERGEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassSubpassFeedbackInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #subpassMergeStatus(int) subpassMergeStatus}. */
    public static void nsubpassMergeStatus(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.SUBPASSMERGESTATUS, value); }
    /** Unsafe version of {@link #description(ByteBuffer) description}. */
    public static void ndescription(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VK_MAX_DESCRIPTION_SIZE);
        }
        memCopy(memAddress(value), struct + VkRenderPassSubpassFeedbackInfoEXT.DESCRIPTION, value.remaining());
    }
    /** Unsafe version of {@link #postMergeIndex(int) postMergeIndex}. */
    public static void npostMergeIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.POSTMERGEINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkRenderPassSubpassFeedbackInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassSubpassFeedbackInfoEXT, Buffer> implements NativeResource {

        private static final VkRenderPassSubpassFeedbackInfoEXT ELEMENT_FACTORY = VkRenderPassSubpassFeedbackInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassSubpassFeedbackInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassSubpassFeedbackInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkRenderPassSubpassFeedbackInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassSubpassFeedbackInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkRenderPassSubpassFeedbackInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkRenderPassSubpassFeedbackInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkRenderPassSubpassFeedbackInfoEXT#subpassMergeStatus} field. */
        @NativeType("VkSubpassMergeStatusEXT")
        public int subpassMergeStatus() { return VkRenderPassSubpassFeedbackInfoEXT.nsubpassMergeStatus(address()); }
        /** @return a {@link ByteBuffer} view of the {@link VkRenderPassSubpassFeedbackInfoEXT#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() { return VkRenderPassSubpassFeedbackInfoEXT.ndescription(address()); }
        /** @return the null-terminated string stored in the {@link VkRenderPassSubpassFeedbackInfoEXT#description} field. */
        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() { return VkRenderPassSubpassFeedbackInfoEXT.ndescriptionString(address()); }
        /** @return the value of the {@link VkRenderPassSubpassFeedbackInfoEXT#postMergeIndex} field. */
        @NativeType("uint32_t")
        public int postMergeIndex() { return VkRenderPassSubpassFeedbackInfoEXT.npostMergeIndex(address()); }

        /** Sets the specified value to the {@link VkRenderPassSubpassFeedbackInfoEXT#sType} field. */
        public VkRenderPassSubpassFeedbackInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassSubpassFeedbackInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTSubpassMergeFeedback#VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT} value to the {@link VkRenderPassSubpassFeedbackInfoEXT#sType} field. */
        public VkRenderPassSubpassFeedbackInfoEXT.Buffer sType$Default() { return sType(EXTSubpassMergeFeedback.VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_INFO_EXT); }
        /** Sets the specified value to the {@link VkRenderPassSubpassFeedbackInfoEXT#pNext} field. */
        public VkRenderPassSubpassFeedbackInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkRenderPassSubpassFeedbackInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderPassSubpassFeedbackInfoEXT#subpassMergeStatus} field. */
        public VkRenderPassSubpassFeedbackInfoEXT.Buffer subpassMergeStatus(@NativeType("VkSubpassMergeStatusEXT") int value) { VkRenderPassSubpassFeedbackInfoEXT.nsubpassMergeStatus(address(), value); return this; }
        /** Copies the specified encoded string to the {@link VkRenderPassSubpassFeedbackInfoEXT#description} field. */
        public VkRenderPassSubpassFeedbackInfoEXT.Buffer description(@NativeType("char[VK_MAX_DESCRIPTION_SIZE]") ByteBuffer value) { VkRenderPassSubpassFeedbackInfoEXT.ndescription(address(), value); return this; }
        /** Sets the specified value to the {@link VkRenderPassSubpassFeedbackInfoEXT#postMergeIndex} field. */
        public VkRenderPassSubpassFeedbackInfoEXT.Buffer postMergeIndex(@NativeType("uint32_t") int value) { VkRenderPassSubpassFeedbackInfoEXT.npostMergeIndex(address(), value); return this; }

    }

}