/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Feedback about the creation of subpass.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRenderPassSubpassFeedbackCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkRenderPassSubpassFeedbackInfoEXT {
 *     VkSubpassMergeStatusEXT {@link #subpassMergeStatus};
 *     char {@link #description}[VK_MAX_DESCRIPTION_SIZE];
 *     uint32_t {@link #postMergeIndex};
 * }</code></pre>
 */
public class VkRenderPassSubpassFeedbackInfoEXT extends Struct<VkRenderPassSubpassFeedbackInfoEXT> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SUBPASSMERGESTATUS,
        DESCRIPTION,
        POSTMERGEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, VK_MAX_DESCRIPTION_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SUBPASSMERGESTATUS = layout.offsetof(0);
        DESCRIPTION = layout.offsetof(1);
        POSTMERGEINDEX = layout.offsetof(2);
    }

    protected VkRenderPassSubpassFeedbackInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkRenderPassSubpassFeedbackInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkRenderPassSubpassFeedbackInfoEXT(address, container);
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

    // -----------------------------------

    /** Returns a new {@code VkRenderPassSubpassFeedbackInfoEXT} instance for the specified memory address. */
    public static VkRenderPassSubpassFeedbackInfoEXT create(long address) {
        return new VkRenderPassSubpassFeedbackInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassSubpassFeedbackInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkRenderPassSubpassFeedbackInfoEXT(address, null);
    }

    /**
     * Create a {@link VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkRenderPassSubpassFeedbackInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #subpassMergeStatus}. */
    public static int nsubpassMergeStatus(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.SUBPASSMERGESTATUS); }
    /** Unsafe version of {@link #description}. */
    public static ByteBuffer ndescription(long struct) { return memByteBuffer(struct + VkRenderPassSubpassFeedbackInfoEXT.DESCRIPTION, VK_MAX_DESCRIPTION_SIZE); }
    /** Unsafe version of {@link #descriptionString}. */
    public static String ndescriptionString(long struct) { return memUTF8(struct + VkRenderPassSubpassFeedbackInfoEXT.DESCRIPTION); }
    /** Unsafe version of {@link #postMergeIndex}. */
    public static int npostMergeIndex(long struct) { return UNSAFE.getInt(null, struct + VkRenderPassSubpassFeedbackInfoEXT.POSTMERGEINDEX); }

    // -----------------------------------

    /** An array of {@link VkRenderPassSubpassFeedbackInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassSubpassFeedbackInfoEXT, Buffer> {

        private static final VkRenderPassSubpassFeedbackInfoEXT ELEMENT_FACTORY = VkRenderPassSubpassFeedbackInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkRenderPassSubpassFeedbackInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassSubpassFeedbackInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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

    }

}